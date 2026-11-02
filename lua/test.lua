package.path = "lua/?.lua;" .. package.path
local M = require("fengshuibedroom_url_tools")
assert(M.home_url() == "https://fengshuibedroom.app/")
assert(M.page_url("about") == "https://fengshuibedroom.app/about")
assert(M.locale_url("zh", "about") == "https://fengshuibedroom.app/zh/about")
local ok = pcall(function() M.canonical_url("https://example.com/") end)
assert(not ok)
print("lua ok")
