using Fengshuibedroom.UrlTools;
if (Urls.HomeUrl() != "https://fengshuibedroom.app/") return 1;
if (Urls.PageUrl("about") != "https://fengshuibedroom.app/about") return 1;
if (Urls.LocaleUrl("zh", "about") != "https://fengshuibedroom.app/zh/about") return 1;
try { Urls.CanonicalUrl("https://example.com/"); return 1; } catch (ArgumentException) {}
Console.WriteLine("dotnet ok");
return 0;
