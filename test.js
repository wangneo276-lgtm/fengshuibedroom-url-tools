import test from "node:test";
import assert from "node:assert/strict";
import { blogUrl, canonicalUrl, homeUrl, localeUrl, metadata, pageUrl } from "./index.js";

test("home, page, locale, and blog", () => {
  assert.equal(homeUrl(), "https://fengshuibedroom.app/");
  assert.equal(pageUrl("about"), "https://fengshuibedroom.app/about");
  assert.equal(blogUrl("feng-shui-bedroom-checklist"), "https://fengshuibedroom.app/blog/feng-shui-bedroom-checklist");
  assert.equal(canonicalUrl("https://fengshuibedroom.app/zh/about?x=1#y"), "https://fengshuibedroom.app/zh/about");
  assert.equal(localeUrl("en", "home"), "https://fengshuibedroom.app/");
  assert.equal(localeUrl("zh", "/"), "https://fengshuibedroom.app/zh");
  assert.equal(localeUrl("de", "privacy"), "https://fengshuibedroom.app/de/privacy");
  assert.equal(metadata().homepage, "https://fengshuibedroom.app/");
  assert.equal(metadata().support, "support@fengshuibedroom.app");
  assert.match(metadata().description, /bedroom photo/);
});

test("rejects unknown hosts, ports, and paths", () => {
  assert.throws(() => canonicalUrl("/not-a-real-page"), /unknown path/);
  assert.throws(() => canonicalUrl("https://example.com/"), /host not allowed/);
  assert.throws(() => canonicalUrl("https://user@fengshuibedroom.app/about"), /userinfo not allowed/);
  assert.throws(() => canonicalUrl("https://fengshuibedroom.app:443/about"), /port not allowed/);
  assert.throws(() => canonicalUrl("/../about"), /path traversal/);
  assert.throws(() => pageUrl("nope"), /unknown page/);
  assert.throws(() => localeUrl("xx", "about"), /unknown locale/);
});
