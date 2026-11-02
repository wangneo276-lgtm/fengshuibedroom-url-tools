import FengshuibedroomUrlTools
if Canonical.homeUrl() != "https://fengshuibedroom.app/" { fatalError("home") }
if (try? Canonical.pageUrl("about")) != "https://fengshuibedroom.app/about" { fatalError("about") }
if (try? Canonical.localeUrl("zh", "about")) != "https://fengshuibedroom.app/zh/about" { fatalError("zh") }
if (try? Canonical.canonicalUrl("https://example.com/")) != nil { fatalError("host") }
print("swift ok")
