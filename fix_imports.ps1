$files = Get-ChildItem -Path "d:\LayoutsRegisterLogin\app\src\main\java\com\example\layouts_register_login" -Filter *.kt
foreach ($file in $files) {
    $content = Get-Content $file.FullName -Raw
    $content = $content -replace 'package com.example.layouts_register_login\s+', "package com.example.layouts_register_login`r`n`r`nimport com.example.layouts_register_login.R`r`n"
    Set-Content -Path $file.FullName -Value $content
}
