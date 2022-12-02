# LangFilesPlus
`lang files plus` lets you organize your translations!\
You can use the following format:
```json5
{
    "item.minecraft.string": "String", // Vanilla Style Keys still work
    "item.minecraft": {
        "feather": "Feather", // This will be converted to "item.minecraft.feather".
        "string": "String"    // So there's no need to adjust the translation keys in your code.
    },
    "debug": {
        "inspect": {
            "server.block": [ // owo lib rich translations work with this format.
                "Copied ",
                { "index": 0, "color": "gold" },
                " data to clipboard"
            ]
        }
    }
}
```
## Adding the library to your project
`build.gradle`
```gradle
repositories {
    //...
    maven { url 'https://jitpack.io' }
}

dependencies {
    //...
    // Replace <latest_version> with the latest version
    // This will include langfiles-plus in your jar. This is encouraged as it wont be published elsewhere
    include modImplementation("com.github.jacg311:LangFilesPlus:<latest_version>")
}
```
Thats it! No additional setup required.
