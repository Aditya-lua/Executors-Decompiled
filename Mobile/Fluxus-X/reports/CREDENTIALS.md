# Embedded credential findings

The native constant corpus contains a 93-byte value matching the GitHub
fine-grained PAT format. Its validity, permissions, and account ownership were
not tested. It was never used for authentication.

| Field | Value |
| --- | --- |
| Input native library | `lib/arm64-v8a/liblazydtc.so` |
| Initializer ELF address | `0x6fc578` |
| Constructor output address | `0xbcaa68` |
| SHA-256 of the recovered value | `c97463df262c8fb3d79448f64595387aed69c0d454982214f6e2f1c6c7d4b59c` |
| Published value | Withheld |
| Published reconstruction code | Initializer pseudocode and assembly withheld |

The function index marks this entry `withheld-credential`. The initialized
constant list contains a hash-tagged redaction placeholder. Hashes and source
locations are retained for identification without redistributing the value.

One Google API-key-shaped value also occurs twice in Android string resources.
Both occurrences are redacted. It was not used or tested.

[publication-redactions.json](../evidence/publication-redactions.json) records
redaction locations and value hashes. [excluded-files.json](../evidence/excluded-files.json)
records the withheld native initializer and binary/unsupported assets.
