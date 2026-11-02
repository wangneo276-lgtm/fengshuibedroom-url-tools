package fengshuibedroom

import "testing"

func TestHome(t *testing.T) {
    if HomeURL() != "https://fengshuibedroom.app/" { t.Fatal(HomeURL()) }
    about, err := PageURL("about")
    if err != nil || about != "https://fengshuibedroom.app/about" { t.Fatal(about, err) }
    zh, err := LocaleURL("zh", "about")
    if err != nil || zh != "https://fengshuibedroom.app/zh/about" { t.Fatal(zh, err) }
    if _, err := CanonicalURL("https://example.com/"); err == nil { t.Fatal("host") }
}
