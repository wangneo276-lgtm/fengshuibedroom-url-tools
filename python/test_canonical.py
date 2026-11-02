import sys
from pathlib import Path
sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "python"))
from fengshuibedroom_url_tools import blog_url, canonical_url, home_url, locale_url, page_url
assert home_url() == "https://fengshuibedroom.app/"
assert page_url("about") == "https://fengshuibedroom.app/about"
assert blog_url("feng-shui-bedroom-checklist") == "https://fengshuibedroom.app/blog/feng-shui-bedroom-checklist"
assert locale_url("zh", "about") == "https://fengshuibedroom.app/zh/about"
try:
    canonical_url("https://example.com/")
    raise SystemExit(1)
except ValueError:
    pass
print("python ok")
