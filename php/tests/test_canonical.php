<?php
require __DIR__ . '/../src/Fengshuibedroom/UrlTools/Canonical.php';
use Fengshuibedroom\UrlTools\Canonical;
if (Canonical::homeUrl() !== 'https://fengshuibedroom.app/') { fwrite(STDERR, "home\n"); exit(1); }
if (Canonical::pageUrl('about') !== 'https://fengshuibedroom.app/about') { fwrite(STDERR, "about\n"); exit(1); }
if (Canonical::localeUrl('zh', 'about') !== 'https://fengshuibedroom.app/zh/about') { fwrite(STDERR, "zh\n"); exit(1); }
try { Canonical::canonicalUrl('https://example.com/'); exit(1); } catch (InvalidArgumentException $e) {}
echo "php ok\n";
