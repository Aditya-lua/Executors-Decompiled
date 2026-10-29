# Shared V5/NEO recovery

V5 1.6.4 and NEO 2.3.8 have byte-identical DEX files, resources, assets, and
Roblox engine library. The only non-signature APK difference is two bytes of
metadata in `libzstd-jni-1.5.7-6.so`, so the closest-source recovery is stored
once here.

## Entry and bridge

The injected Java entry points are visible in:

- `jadx/sources/com/roblox/client/startup/ActivitySplash.java`
- `jadx/sources/com/roblox/client/startup/MainGameActivity.java`
- `jadx/sources/com/axjava/Main.java`

Both Roblox activities invoke `com.axjava.Main.Start`. That method loads
`zstd-jni-1.5.7-6`, initializes the executor, installs its crash handler, and
requests storage access. The `com.axjava` package supplies the Java side of the
native bridge, workspace and auto-exec file operations, clipboard/input
handling, HTTP requests, update installation, and the controlled key-system
WebView.

When a JADX method could not be reconstructed, the corresponding exact smali
implementation remains under `apktool/smali*`.

