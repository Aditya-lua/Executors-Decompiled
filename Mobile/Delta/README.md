# Delta crack

Reverse-engineering workspace for the Delta Executor mobile applications.

- [`android/`](android/) contains the Android decompilation, recovered
  resources, native/JNI reconstructions, reports, and public-source leads.
- [`iOS/`](iOS/) contains the reconstructed iOS source, analysis scripts,
  reports, recovered assets, and function-by-function lifts.

This repository is an analysis artifact, not Delta's original source tree.
Optimized native binaries do not preserve every original identifier, type,
comment, or build setting, so reconstructed files distinguish evidence-based
source-like recovery from exact upstream source.

Large app binaries, APK/IPA packages, transient emulator dumps, credentials,
and local progress checkpoints are intentionally excluded from Git.

