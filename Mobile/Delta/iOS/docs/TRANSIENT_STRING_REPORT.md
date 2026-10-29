# Transient-string recovery

A conservative ARM64 constant-propagation pass inspected 1,004 functions in
the Delta-specific range `0x2c8000..0x510000` and recorded 149 candidate string
arguments at native call sites.  The complete address/argument/value mapping is
in `analysis/delta-custom-transient-strings.json`.

Confirmed integration strings include:

- `AppLifecycleObserver`
- `UIApplicationDidBecomeActiveNotification`
- Objective-C encodings `v@:@` and `v@:{CGSize=dd}@`
- decoy values `/hi`, `libstuff.so`, and `init`
- closure diagnostic `Normal closure`
- URL schemes `http` and `https`

The pass did not expose plaintext Luau executor API registration names.  Those
names are constructed through protected vector/128-bit paths or decoded state,
not ordinary scalar call arguments.  The separately emulated bootstrap trace
does recover `RobloxLib`, which is assembled transiently on the stack through
such a vector path.  This limitation is recorded rather than filling the API
table with guessed common executor names.
