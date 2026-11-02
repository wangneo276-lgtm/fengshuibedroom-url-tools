require_relative "lib/fengshuibedroom_url_tools"
include FengshuibedroomUrlTools
abort "home" unless home_url == "https://fengshuibedroom.app/"
abort "about" unless page_url("about") == "https://fengshuibedroom.app/about"
abort "zh" unless locale_url("zh", "about") == "https://fengshuibedroom.app/zh/about"
begin
  canonical_url("https://example.com/")
  abort "host"
rescue ArgumentError
end
puts "ruby ok"
