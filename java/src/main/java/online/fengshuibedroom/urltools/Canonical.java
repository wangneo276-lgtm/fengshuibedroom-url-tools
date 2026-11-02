package online.fengshuibedroom.urltools;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public final class Canonical {
    public static final String ORIGIN = "https://fengshuibedroom.app";
    public static final String DESCRIPTION = "Upload a bedroom photo for an AI feng shui bedroom check: bed position, door line, mirrors, windows and walkways, with priority fixes. First full report free.";
    private static final String HOST = "fengshuibedroom.app";
    private static final Set<String> PATHS = new HashSet<>();
    private static final Set<String> BASE = new HashSet<>();
    private static final Map<String, String> PAGES = new HashMap<>();
    private static final Map<String, String> BLOGS = new HashMap<>();
    private static final Set<String> LOCALES = new HashSet<>();
    static {
        for (String s : new String[]{"/", "/zh", "/zh-tw", "/ja", "/ko", "/de", "/fr", "/es", "/it", "/pt", "/nl", "/sv", "/da", "/nb", "/pl", "/pricing", "/zh/pricing", "/zh-tw/pricing", "/ja/pricing", "/ko/pricing", "/de/pricing", "/fr/pricing", "/es/pricing", "/it/pricing", "/pt/pricing", "/nl/pricing", "/sv/pricing", "/da/pricing", "/nb/pricing", "/pl/pricing", "/methodology", "/zh/methodology", "/zh-tw/methodology", "/ja/methodology", "/ko/methodology", "/de/methodology", "/fr/methodology", "/es/methodology", "/it/methodology", "/pt/methodology", "/nl/methodology", "/sv/methodology", "/da/methodology", "/nb/methodology", "/pl/methodology", "/kua-number-calculator", "/zh/kua-number-calculator", "/zh-tw/kua-number-calculator", "/ja/kua-number-calculator", "/ko/kua-number-calculator", "/de/kua-number-calculator", "/fr/kua-number-calculator", "/es/kua-number-calculator", "/it/kua-number-calculator", "/pt/kua-number-calculator", "/nl/kua-number-calculator", "/sv/kua-number-calculator", "/da/kua-number-calculator", "/nb/kua-number-calculator", "/pl/kua-number-calculator", "/feng-shui-wealth-corner", "/zh/feng-shui-wealth-corner", "/zh-tw/feng-shui-wealth-corner", "/ja/feng-shui-wealth-corner", "/ko/feng-shui-wealth-corner", "/de/feng-shui-wealth-corner", "/fr/feng-shui-wealth-corner", "/es/feng-shui-wealth-corner", "/it/feng-shui-wealth-corner", "/pt/feng-shui-wealth-corner", "/nl/feng-shui-wealth-corner", "/sv/feng-shui-wealth-corner", "/da/feng-shui-wealth-corner", "/nb/feng-shui-wealth-corner", "/pl/feng-shui-wealth-corner", "/feng-shui-front-door", "/zh/feng-shui-front-door", "/zh-tw/feng-shui-front-door", "/ja/feng-shui-front-door", "/ko/feng-shui-front-door", "/de/feng-shui-front-door", "/fr/feng-shui-front-door", "/es/feng-shui-front-door", "/it/feng-shui-front-door", "/pt/feng-shui-front-door", "/nl/feng-shui-front-door", "/sv/feng-shui-front-door", "/da/feng-shui-front-door", "/nb/feng-shui-front-door", "/pl/feng-shui-front-door", "/flying-star-feng-shui", "/zh/flying-star-feng-shui", "/zh-tw/flying-star-feng-shui", "/ja/flying-star-feng-shui", "/ko/flying-star-feng-shui", "/de/flying-star-feng-shui", "/fr/flying-star-feng-shui", "/es/flying-star-feng-shui", "/it/flying-star-feng-shui", "/pt/flying-star-feng-shui", "/nl/flying-star-feng-shui", "/sv/flying-star-feng-shui", "/da/flying-star-feng-shui", "/nb/flying-star-feng-shui", "/pl/flying-star-feng-shui", "/feng-shui-calculator", "/zh/feng-shui-calculator", "/zh-tw/feng-shui-calculator", "/ja/feng-shui-calculator", "/ko/feng-shui-calculator", "/de/feng-shui-calculator", "/fr/feng-shui-calculator", "/es/feng-shui-calculator", "/it/feng-shui-calculator", "/pt/feng-shui-calculator", "/nl/feng-shui-calculator", "/sv/feng-shui-calculator", "/da/feng-shui-calculator", "/nb/feng-shui-calculator", "/pl/feng-shui-calculator", "/about", "/zh/about", "/zh-tw/about", "/ja/about", "/ko/about", "/de/about", "/fr/about", "/es/about", "/it/about", "/pt/about", "/nl/about", "/sv/about", "/da/about", "/nb/about", "/pl/about", "/contact", "/zh/contact", "/zh-tw/contact", "/ja/contact", "/ko/contact", "/de/contact", "/fr/contact", "/es/contact", "/it/contact", "/pt/contact", "/nl/contact", "/sv/contact", "/da/contact", "/nb/contact", "/pl/contact", "/privacy", "/zh/privacy", "/zh-tw/privacy", "/ja/privacy", "/ko/privacy", "/de/privacy", "/fr/privacy", "/es/privacy", "/it/privacy", "/pt/privacy", "/nl/privacy", "/sv/privacy", "/da/privacy", "/nb/privacy", "/pl/privacy", "/terms", "/zh/terms", "/zh-tw/terms", "/ja/terms", "/ko/terms", "/de/terms", "/fr/terms", "/es/terms", "/it/terms", "/pt/terms", "/nl/terms", "/sv/terms", "/da/terms", "/nb/terms", "/pl/terms", "/cookie", "/zh/cookie", "/zh-tw/cookie", "/ja/cookie", "/ko/cookie", "/de/cookie", "/fr/cookie", "/es/cookie", "/it/cookie", "/pt/cookie", "/nl/cookie", "/sv/cookie", "/da/cookie", "/nb/cookie", "/pl/cookie", "/blog", "/zh/blog", "/zh-tw/blog", "/ja/blog", "/ko/blog", "/de/blog", "/fr/blog", "/es/blog", "/it/blog", "/pt/blog", "/nl/blog", "/sv/blog", "/da/blog", "/nb/blog", "/pl/blog", "/blog/page/2", "/zh/blog/page/2", "/zh-tw/blog/page/2", "/ja/blog/page/2", "/ko/blog/page/2", "/de/blog/page/2", "/fr/blog/page/2", "/es/blog/page/2", "/it/blog/page/2", "/pt/blog/page/2", "/nl/blog/page/2", "/sv/blog/page/2", "/da/blog/page/2", "/nb/blog/page/2", "/pl/blog/page/2", "/blog/category/company", "/blog/category/news", "/blog/category/product", "/zh/blog/category/company", "/zh/blog/category/news", "/zh/blog/category/product", "/zh-tw/blog/category/company", "/zh-tw/blog/category/news", "/zh-tw/blog/category/product", "/ja/blog/category/company", "/ja/blog/category/news", "/ja/blog/category/product", "/ko/blog/category/company", "/ko/blog/category/news", "/ko/blog/category/product", "/de/blog/category/company", "/de/blog/category/news", "/de/blog/category/product", "/fr/blog/category/company", "/fr/blog/category/news", "/fr/blog/category/product", "/es/blog/category/company", "/es/blog/category/news", "/es/blog/category/product", "/it/blog/category/company", "/it/blog/category/news", "/it/blog/category/product", "/pt/blog/category/company", "/pt/blog/category/news", "/pt/blog/category/product", "/nl/blog/category/company", "/nl/blog/category/news", "/nl/blog/category/product", "/sv/blog/category/company", "/sv/blog/category/news", "/sv/blog/category/product", "/da/blog/category/company", "/da/blog/category/news", "/da/blog/category/product", "/nb/blog/category/company", "/nb/blog/category/news", "/nb/blog/category/product", "/pl/blog/category/company", "/pl/blog/category/news", "/pl/blog/category/product", "/blog/bed-placement-feng-shui-commanding-position", "/blog/bed-under-window-feng-shui", "/blog/bedroom-feng-shui-colors", "/blog/feng-shui-bedroom-checklist", "/blog/how-to-photograph-bedroom-feng-shui", "/blog/mirrors-and-bed-feng-shui", "/blog/rental-bedroom-feng-shui-fixed-bed", "/blog/small-bedroom-feng-shui-layout", "/zh/blog/bed-placement-feng-shui-commanding-position", "/zh/blog/bed-under-window-feng-shui", "/zh/blog/bedroom-feng-shui-colors", "/zh/blog/feng-shui-bedroom-checklist", "/zh/blog/how-to-photograph-bedroom-feng-shui", "/zh/blog/mirrors-and-bed-feng-shui", "/zh/blog/rental-bedroom-feng-shui-fixed-bed", "/zh/blog/small-bedroom-feng-shui-layout", "/zh-tw/blog/bed-placement-feng-shui-commanding-position", "/zh-tw/blog/bed-under-window-feng-shui", "/zh-tw/blog/bedroom-feng-shui-colors", "/zh-tw/blog/feng-shui-bedroom-checklist", "/zh-tw/blog/how-to-photograph-bedroom-feng-shui", "/zh-tw/blog/mirrors-and-bed-feng-shui", "/zh-tw/blog/rental-bedroom-feng-shui-fixed-bed", "/zh-tw/blog/small-bedroom-feng-shui-layout", "/ja/blog/bed-placement-feng-shui-commanding-position", "/ja/blog/bed-under-window-feng-shui", "/ja/blog/bedroom-feng-shui-colors", "/ja/blog/feng-shui-bedroom-checklist", "/ja/blog/how-to-photograph-bedroom-feng-shui", "/ja/blog/mirrors-and-bed-feng-shui", "/ja/blog/rental-bedroom-feng-shui-fixed-bed", "/ja/blog/small-bedroom-feng-shui-layout", "/ko/blog/bed-placement-feng-shui-commanding-position", "/ko/blog/bed-under-window-feng-shui", "/ko/blog/bedroom-feng-shui-colors", "/ko/blog/feng-shui-bedroom-checklist", "/ko/blog/how-to-photograph-bedroom-feng-shui", "/ko/blog/mirrors-and-bed-feng-shui", "/ko/blog/rental-bedroom-feng-shui-fixed-bed", "/ko/blog/small-bedroom-feng-shui-layout", "/de/blog/bed-placement-feng-shui-commanding-position", "/de/blog/bed-under-window-feng-shui", "/de/blog/bedroom-feng-shui-colors", "/de/blog/feng-shui-bedroom-checklist", "/de/blog/how-to-photograph-bedroom-feng-shui", "/de/blog/mirrors-and-bed-feng-shui", "/de/blog/rental-bedroom-feng-shui-fixed-bed", "/de/blog/small-bedroom-feng-shui-layout", "/fr/blog/bed-placement-feng-shui-commanding-position", "/fr/blog/bed-under-window-feng-shui", "/fr/blog/bedroom-feng-shui-colors", "/fr/blog/feng-shui-bedroom-checklist", "/fr/blog/how-to-photograph-bedroom-feng-shui", "/fr/blog/mirrors-and-bed-feng-shui", "/fr/blog/rental-bedroom-feng-shui-fixed-bed", "/fr/blog/small-bedroom-feng-shui-layout", "/es/blog/bed-placement-feng-shui-commanding-position", "/es/blog/bed-under-window-feng-shui", "/es/blog/bedroom-feng-shui-colors", "/es/blog/feng-shui-bedroom-checklist", "/es/blog/how-to-photograph-bedroom-feng-shui", "/es/blog/mirrors-and-bed-feng-shui", "/es/blog/rental-bedroom-feng-shui-fixed-bed", "/es/blog/small-bedroom-feng-shui-layout", "/it/blog/bed-placement-feng-shui-commanding-position", "/it/blog/bed-under-window-feng-shui", "/it/blog/bedroom-feng-shui-colors", "/it/blog/feng-shui-bedroom-checklist", "/it/blog/how-to-photograph-bedroom-feng-shui", "/it/blog/mirrors-and-bed-feng-shui", "/it/blog/rental-bedroom-feng-shui-fixed-bed", "/it/blog/small-bedroom-feng-shui-layout", "/pt/blog/bed-placement-feng-shui-commanding-position", "/pt/blog/bed-under-window-feng-shui", "/pt/blog/bedroom-feng-shui-colors", "/pt/blog/feng-shui-bedroom-checklist", "/pt/blog/how-to-photograph-bedroom-feng-shui", "/pt/blog/mirrors-and-bed-feng-shui", "/pt/blog/rental-bedroom-feng-shui-fixed-bed", "/pt/blog/small-bedroom-feng-shui-layout", "/nl/blog/bed-placement-feng-shui-commanding-position", "/nl/blog/bed-under-window-feng-shui", "/nl/blog/bedroom-feng-shui-colors", "/nl/blog/feng-shui-bedroom-checklist", "/nl/blog/how-to-photograph-bedroom-feng-shui", "/nl/blog/mirrors-and-bed-feng-shui", "/nl/blog/rental-bedroom-feng-shui-fixed-bed", "/nl/blog/small-bedroom-feng-shui-layout", "/sv/blog/bed-placement-feng-shui-commanding-position", "/sv/blog/bed-under-window-feng-shui", "/sv/blog/bedroom-feng-shui-colors", "/sv/blog/feng-shui-bedroom-checklist", "/sv/blog/how-to-photograph-bedroom-feng-shui", "/sv/blog/mirrors-and-bed-feng-shui", "/sv/blog/rental-bedroom-feng-shui-fixed-bed", "/sv/blog/small-bedroom-feng-shui-layout", "/da/blog/bed-placement-feng-shui-commanding-position", "/da/blog/bed-under-window-feng-shui", "/da/blog/bedroom-feng-shui-colors", "/da/blog/feng-shui-bedroom-checklist", "/da/blog/how-to-photograph-bedroom-feng-shui", "/da/blog/mirrors-and-bed-feng-shui", "/da/blog/rental-bedroom-feng-shui-fixed-bed", "/da/blog/small-bedroom-feng-shui-layout", "/nb/blog/bed-placement-feng-shui-commanding-position", "/nb/blog/bed-under-window-feng-shui", "/nb/blog/bedroom-feng-shui-colors", "/nb/blog/feng-shui-bedroom-checklist", "/nb/blog/how-to-photograph-bedroom-feng-shui", "/nb/blog/mirrors-and-bed-feng-shui", "/nb/blog/rental-bedroom-feng-shui-fixed-bed", "/nb/blog/small-bedroom-feng-shui-layout", "/pl/blog/bed-placement-feng-shui-commanding-position", "/pl/blog/bed-under-window-feng-shui", "/pl/blog/bedroom-feng-shui-colors", "/pl/blog/feng-shui-bedroom-checklist", "/pl/blog/how-to-photograph-bedroom-feng-shui", "/pl/blog/mirrors-and-bed-feng-shui", "/pl/blog/rental-bedroom-feng-shui-fixed-bed", "/pl/blog/small-bedroom-feng-shui-layout"}) PATHS.add(s);
        for (String s : new String[]{"/", "/pricing", "/methodology", "/kua-number-calculator", "/feng-shui-wealth-corner", "/feng-shui-front-door", "/flying-star-feng-shui", "/feng-shui-calculator", "/about", "/contact", "/privacy", "/terms", "/cookie", "/blog", "/blog/page/2", "/blog/category/company", "/blog/category/news", "/blog/category/product", "/blog/bed-placement-feng-shui-commanding-position", "/blog/bed-under-window-feng-shui", "/blog/bedroom-feng-shui-colors", "/blog/feng-shui-bedroom-checklist", "/blog/how-to-photograph-bedroom-feng-shui", "/blog/mirrors-and-bed-feng-shui", "/blog/rental-bedroom-feng-shui-fixed-bed", "/blog/small-bedroom-feng-shui-layout"}) BASE.add(s);
        for (String s : new String[]{"en", "zh", "zh-TW", "ja", "ko", "de", "fr", "es", "it", "pt", "nl", "sv", "da", "nb", "pl"}) LOCALES.add(s);
        PAGES.put("home", "/");
        PAGES.put("pricing", "/pricing");
        PAGES.put("methodology", "/methodology");
        PAGES.put("kua-number-calculator", "/kua-number-calculator");
        PAGES.put("feng-shui-wealth-corner", "/feng-shui-wealth-corner");
        PAGES.put("feng-shui-front-door", "/feng-shui-front-door");
        PAGES.put("flying-star-feng-shui", "/flying-star-feng-shui");
        PAGES.put("feng-shui-calculator", "/feng-shui-calculator");
        PAGES.put("about", "/about");
        PAGES.put("contact", "/contact");
        PAGES.put("privacy", "/privacy");
        PAGES.put("terms", "/terms");
        PAGES.put("cookie", "/cookie");
        PAGES.put("blog", "/blog");
        BLOGS.put("bed-placement-feng-shui-commanding-position", "/blog/bed-placement-feng-shui-commanding-position");
        BLOGS.put("bed-under-window-feng-shui", "/blog/bed-under-window-feng-shui");
        BLOGS.put("bedroom-feng-shui-colors", "/blog/bedroom-feng-shui-colors");
        BLOGS.put("feng-shui-bedroom-checklist", "/blog/feng-shui-bedroom-checklist");
        BLOGS.put("how-to-photograph-bedroom-feng-shui", "/blog/how-to-photograph-bedroom-feng-shui");
        BLOGS.put("mirrors-and-bed-feng-shui", "/blog/mirrors-and-bed-feng-shui");
        BLOGS.put("rental-bedroom-feng-shui-fixed-bed", "/blog/rental-bedroom-feng-shui-fixed-bed");
        BLOGS.put("small-bedroom-feng-shui-layout", "/blog/small-bedroom-feng-shui-layout");
    }
    private Canonical() {}
    public static String canonicalUrl(String input) {
        if (input == null) throw new IllegalArgumentException("path required");
        String raw = input.trim();
        if (raw.isEmpty()) throw new IllegalArgumentException("path required");
        if (raw.indexOf('\\') >= 0 || raw.indexOf('%') >= 0) throw new IllegalArgumentException("invalid path");
        int hash = raw.indexOf('#');
        if (hash >= 0) raw = raw.substring(0, hash);
        int query = raw.indexOf('?');
        if (query >= 0) raw = raw.substring(0, query);
        String lower = raw.toLowerCase();
        String path;
        if (lower.startsWith("https://") || lower.startsWith("http://") || raw.startsWith("//")) {
            String rest = lower.startsWith("https://") ? raw.substring(8) : lower.startsWith("http://") ? raw.substring(7) : raw.substring(2);
            int slash = rest.indexOf('/');
            String hostport = slash < 0 ? rest : rest.substring(0, slash);
            path = slash < 0 ? "/" : rest.substring(slash);
            if (hostport.indexOf('@') >= 0) throw new IllegalArgumentException("userinfo not allowed");
            if (hostport.indexOf(':') >= 0) throw new IllegalArgumentException("port not allowed");
            if (!hostport.equalsIgnoreCase(HOST)) throw new IllegalArgumentException("host not allowed");
        } else if (raw.startsWith("/")) {
            path = raw;
        } else {
            path = "/" + raw;
        }
        while (path.contains("//")) path = path.replace("//", "/");
        path = path.toLowerCase();
        for (String seg : path.split("/")) {
            if (seg.equals(".") || seg.equals("..")) throw new IllegalArgumentException("path traversal");
        }
        if (path.length() > 1) while (path.endsWith("/")) path = path.substring(0, path.length() - 1);
        if (path.isEmpty()) path = "/";
        if (!PATHS.contains(path)) throw new IllegalArgumentException("unknown path: " + path);
        return path.equals("/") ? ORIGIN + "/" : ORIGIN + path;
    }
    private static String resolve(String name) {
        if (PAGES.containsKey(name)) return PAGES.get(name);
        if (BLOGS.containsKey(name)) return BLOGS.get(name);
        if (BASE.contains(name)) return name;
        throw new IllegalArgumentException("unknown page: " + name);
    }
    public static String homeUrl() { return canonicalUrl("/"); }
    public static String pageUrl(String name) { return canonicalUrl(resolve(name)); }
    public static String blogUrl(String slug) {
        if (!BLOGS.containsKey(slug)) throw new IllegalArgumentException("unknown blog: " + slug);
        return canonicalUrl(BLOGS.get(slug));
    }
    public static String localeUrl(String locale, String name) {
        if (!LOCALES.contains(locale)) throw new IllegalArgumentException("unknown locale: " + locale);
        String path = resolve(name);
        if (locale.equals("en")) return canonicalUrl(path);
        return canonicalUrl(path.equals("/") ? "/" + locale : "/" + locale + path);
    }
    public static void main(String[] args) {
        if (!homeUrl().equals("https://fengshuibedroom.app/")) System.exit(1);
        if (!pageUrl("about").equals("https://fengshuibedroom.app/about")) System.exit(1);
        if (!localeUrl("zh", "about").equals("https://fengshuibedroom.app/zh/about")) System.exit(1);
        try { canonicalUrl("https://example.com/"); System.exit(1); } catch (IllegalArgumentException ignored) {}
        System.out.println("java ok");
    }
}
