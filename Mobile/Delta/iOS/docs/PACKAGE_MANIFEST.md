# IPA Mach-O manifest

All listed images report `cryptid = 0` and are statically readable.

| Image | Bytes | Function starts | SHA-256 |
|---|---:|---:|---|
| `Roblox` | 10,264,384 | 32,405 | `febe6971bfae5f2bcbc00b8659a04bb60df766366a5e3661c1c0084971866121` |
| `libgloop.dylib` | 16,089,408 | 19,822 | `9da7bbf557957e29d26a178e45b3d5c482cea8c21e92242b29bb9423d2e88133` |
| `RobloxLib.framework/RobloxLib` | 111,716,224 | 425,454 | `43b8057a58ebec24a7b0a714ba15579b8e8e9fed983aa52e9307a279be6a2a73` |
| `Persona2.framework/Persona2` | 7,664,384 | 35,885 | `fabfe83436d60b75e5ef6ba2070e9e2a238d60f3dfeb9ae752738f5a5097685e` |
| `Reaper.framework/Reaper` | 107,856 | 90 | `38b27ef5dbca5c66deeb1a934929d79ca596f4e6cc0b915a2b876ba28fd71ec4` |
| `libswift_Concurrency.dylib` | 417,072 | 1,879 | `2a40b3985f61066bbfc12c73acd89a3788f2c0ae97799118babde520a4726774` |
| `RBNotificationServiceExtension` | 146,288 | 170 | `be9cb0bcaadbb84bf650237eff7361a361a35cbe4f0fdad4c9cffcc0b69741b5` |
| `RBWidgetExtension` | 249,024 | 554 | `0c2768cc3beb90dbd7469e07e26637d271fca172be96546a07d64bd71b2cee90` |

Two hidden `.RobloxLib.*` files are partial packaging/staging remnants.  They
have Mach-O headers but no `LC_FUNCTION_STARTS` inventory and are not treated
as separate functional components.

The main executable and RobloxLib are stock/modified Roblox application
layers.  Delta-specific reversing is centered on `libgloop.dylib`, while the
other images remain indexed in the complete `delta-macho-inventory.json` kept
at the analysis root.

## Delta-specific lifted-source package

| Artifact | Count / size |
|---|---:|
| Recorded `libgloop.dylib` function starts | 19,822 |
| Structured C-like functions | 19,636 |
| Instruction-faithful fallback functions | 186 |
| Fallback source bytes represented | 7,371,552 |
| Fallback decoded records | 1,842,888 |
| Recovered UI/font assets | 74 |
| Resolved protected indirect calls | 792 |
| Custom-range transient string candidates | 149 |
| Fully traced protected/calling constructors | 14 |
| Public Medal source-baseline files | 90 |

The archive intentionally does not include the 149 MB IPA or duplicate the
112 MB stock `RobloxLib` binary. Hashes and inventories bind every result to
the verified input, while keeping the deliverable focused on Delta-specific
code and reproducible analysis. The small MIT-licensed Medal baseline is
included because it is the closest public source scaffold for the embedded
Rust `luau-lifter`; `recovered-open-source/DELTA_MATCH_NOTES.md` documents its
provenance and the observed differences from Delta's updated binary fork.
