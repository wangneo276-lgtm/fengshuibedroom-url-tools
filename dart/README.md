# fengshuibedroom-url-tools

Builds canonical HTTPS URLs for public pages on [Feng Shui Bedroom](https://fengshuibedroom.app/).

Upload a bedroom photo for an AI feng shui bedroom check: bed position, door line, mirrors, windows and walkways, with priority fixes. First full report free.

Not an official SDK. The helper only accepts paths that are already on the public site, including English and the translations at `/zh`, `/zh-TW`, `/ja`, `/ko`, `/de`, `/fr`, `/es`, `/it`, `/pt`, `/nl`, `/sv`, `/da`, `/nb`, `/pl`. It does not store a photo or call the site.

## Examples

- `homeUrl()` → https://fengshuibedroom.app/
- `pageUrl("about")` → https://fengshuibedroom.app/about
- `localeUrl("zh", "about")` → https://fengshuibedroom.app/zh/about
- `blogUrl("feng-shui-bedroom-checklist")` → https://fengshuibedroom.app/blog/feng-shui-bedroom-checklist

Support: support@fengshuibedroom.app

Source: https://github.com/wangneo276-lgtm/fengshuibedroom-url-tools

License: MIT.
