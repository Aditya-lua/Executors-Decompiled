# Velocity.exe reverse-engineering and source-recovery report

## Result

The supplied executable was statically unpacked and reconstructed successfully. It is an unsigned x64 .NET 10 Windows single-file WPF application, not a conventional native-only executable and not UPX-packed. The custom managed components were recovered into two buildable projects:

| Project | Purpose | Verification |
|---|---|---|
| `Velocity` | WPF UI, Monaco/Luau editor, client manager, script hub, AI integrations, MCP bridge | Release build completed with 0 errors |
| `VelocityApi` | Update/download logic, injector launcher, AES-GCM URL decryption, named-pipe script transport | Release build completed with 0 errors |

The delivery contains 131 recovered files and about 38,700 lines of C#, XAML, JavaScript, HTML, and Luau definitions, excluding generated build output. The embedded editor bundle, images, theme, exact compiled WPF resources, and Luau language server were also recovered.

No part of `Velocity.exe` or its downloaded payloads was executed during this analysis.

## Sample identity

| Item | Value |
|---|---|
| Supplied archive | `Velocity.zip` |
| Archive SHA-256 | `d29751aeeb29b35b67c3fb6b6441f0c62bdce0742ccb62ce6c44cf70062811ad` |
| Executable SHA-256 | `48f1689eb31a2ab45ff2fd45d04ef231be843e4500664ac9a6cee8efbadebc5a` |
| Executable size | 36,201,921 bytes |
| Format | PE32+ GUI, x86-64, .NET single-file apphost |
| Product/version | Velocity 1.0.0 |
| Target | `net10.0-windows10.0.19041.0`, `win-x64` |
| Signature | No Authenticode signature present |
| Bundle marker | Offset `0x24f40` |
| Bundle overlay | Begins near `0x39a00`; about 35.97 MB |

The native apphost is small relative to the file. Most of the executable is a .NET bundle appended as an overlay.

## Bundle contents

The following files were extracted from the single-file bundle:

| Entry | Size | Role |
|---|---:|---|
| `Velocity.dll` | 9,367,040 | Main application and resources |
| `VelocityApi.dll` | 22,016 | Custom updater/injector API wrapper |
| `Microsoft.Windows.SDK.NET.dll` | 24,877,600 | Windows SDK projection dependency |
| `Microsoft.Web.WebView2.Core.dll` | 698,208 | WebView2 dependency |
| `Microsoft.Web.WebView2.Wpf.dll` | 84,320 | WPF WebView2 dependency |
| `Microsoft.Web.WebView2.WinForms.dll` | 39,264 | Bundled WebView2 dependency |
| `WinRT.Runtime.dll` | 528,944 | WinRT dependency |
| `WebView2Loader.dll` | 164,192 | Native WebView2 loader |
| `Velocity.deps.json` | 3,408 | Dependency manifest |
| `Velocity.runtimeconfig.json` | 519 | .NET runtime configuration |

`Velocity.dll` contains two principal manifest resources: `Velocity.g.resources` (compiled WPF UI and images) and `assets.zip` (Monaco editor, Luau definitions/docs, and `luau-lsp.exe`).

## Recovered architecture and behavior

### Application and editor

- WPF desktop shell with splash screen, tabs, script tree, output console, settings, and per-client controls.
- Monaco editor hosted inside WebView2 using the local virtual hostname `https://scripteditor.assets/`.
- Bundled Luau language server started over stdio with Roblox and Velocity-specific definitions.
- Session, settings, and extracted editor assets stored under `%LOCALAPPDATA%\Velocity`.
- Script files default to a `scripts` folder beside the installed executable.

### Roblox attachment path

The supplied program does not contain the low-level injection implementation. Its flow is:

1. Enumerate `RobloxPlayerBeta` processes.
2. On startup, `VelocityApi` requests encrypted download metadata from `realvelocity.xyz`.
3. Decrypt two URLs using PBKDF2-derived AES-256-GCM.
4. Download `Bin\erto3e4rortoergn.exe` (described in the UI as the injector) and `Bin\Decompiler.exe`.
5. Launch the injector with a selected Roblox PID as its sole argument.
6. Treat the PID as attached once that process exits; no cryptographic or protocol-level success proof is checked.
7. Send Base64-encoded Luau to `\\.\pipe\uoQcySKXSUxxJNpVQyatpHQwYoGfhcbh_<pid>`.

`Decompiler.exe` is launched hidden with redirected stdio, but the recovered wrapper does not consume those streams. Its actual implementation and purpose cannot be established from the supplied file because it is downloaded at runtime.

The client manager can auto-inject after a configurable delay, execute on one or multiple clients, and terminate a client process tree.

### AI, Copilot, and MCP features

- OpenAI-compatible inline completion supports a configurable base URL, model, and bearer API key. The default base is `https://api.openai.com/v1`; the settings UI also suggests `http://localhost:11434/v1` for a local endpoint.
- API keys are normally protected with Windows DPAPI using current-user scope. If DPAPI protection throws, the implementation falls back to storing the value as plaintext.
- Claude Code integration locates a locally installed `claude.exe`/`claude.cmd`, supports login/account queries, and launches the CLI over stdio.
- GitHub Copilot integration downloads a pinned language-server package version (`1.527.1`) from the npm registry and runs it over stdio.
- A local MCP server exposes `read_script`, `write_script`, `execute`, `read_output`, and `list_clients`. It is available over the local `velocity-mcp` named pipe and through a `--mcp-stdio` bridge.

### Script hub

The application integrates with `rscripts.net`, uses a user-provided bearer key, searches/browses scripts, downloads raw script text from URLs returned by that API, and can open or execute the result.

## Network endpoints

| Endpoint | Purpose |
|---|---|
| `https://realvelocity.xyz/assets/current_version.txt` | Runtime payload version stamp |
| `https://realvelocity.xyz/assets/download_links.json` | AES-GCM-encrypted runtime payload URLs |
| `https://getvelocity.llc/api/v1/products/roblox/info` | Product/version/status metadata |
| `https://api.rscripts.net/v1/...` | Script hub API |
| `https://rscripts.net/dashboard/api` | Script hub key dashboard |
| `https://registry.npmjs.org/@github/copilot-language-server-win32-x64/-/copilot-language-server-win32-x64-1.527.1.tgz` | Optional Copilot language server |
| Configurable OpenAI-compatible `/chat/completions` or `/responses` endpoint | Inline AI completion |

No hard-coded user API key, bearer token, password, or account credential was found in the recovered custom code.

## Security findings

### High: unverified runtime code download and execution

The application downloads the two most security-sensitive executables from URLs controlled by remote metadata, writes them into `Bin`, and runs them. It does not verify a pinned SHA-256 hash, an Authenticode signer, or a detached signature. HTTPS protects transport only while the endpoint and certificate chain remain trustworthy; compromise of the site, metadata, hosting target, or update pipeline would permit arbitrary code execution as the current user.

Because those payloads were not embedded, this report cannot make a safety determination about the injector or `Decompiler.exe`.

### Medium: attachment state is optimistic

`Attach(pid)` waits for the injector process to exit and then marks the PID attached unconditionally. It does not check the exit code or wait for the expected named pipe. This can produce false success and masks injector failures.

### Medium: plaintext secret fallback

DPAPI is used for saved keys, but a DPAPI encryption failure returns the original plaintext. The settings JSON may therefore contain a cleartext API key in failure cases.

### Medium: broad local automation surface

The MCP tools can replace editor content and execute it in attached clients. The Claude integration can optionally be given those tools. Access is local, but any local process that can reach the named pipe or invoke the stdio bridge may gain a powerful execution path in the application context.

### Medium: third-party raw script execution

Script-hub content can be downloaded and executed. The application exposes filters and risk labels but cannot guarantee that third-party Luau is safe.

### Low: synchronous startup networking

The API wrapper performs several network requests synchronously. This can block startup and makes error handling less reliable, but it is not itself a code-execution vulnerability.

### Static review result

Within the supplied executable, the recovered custom code showed no conventional persistence mechanism, browser credential theft, keylogging, ransomware behavior, or hard-coded exfiltration credential. That finding does not extend to the two runtime-downloaded executables or to scripts fetched from third parties.

## Source reconstruction and verification

The decompiler recovered the custom assemblies without obfuscation barriers. Reconstruction work included:

- converting ILSpy positional markup-extension artifacts into readable XAML;
- retaining the exact original `Velocity.g.resources` so names, event connection IDs, templates, and BAML remain faithful at runtime;
- restoring `InitializeComponent` loaders and the WPF entry point;
- replacing decompiler-only calls to implicit operators and protected base methods with valid C#;
- resolving lowered anonymous-type and enum expressions;
- linking the main project to the recovered `VelocityApi` project;
- verifying a Release build with .NET SDK 10.0.111.

The rebuilt main assembly contains byte-identical copies of the original `Velocity.g.resources` and `assets.zip` resources. Their SHA-256 values matched after the rebuild.

Build verification:

```text
VelocityApi: Build succeeded, 0 errors
Velocity:    Build succeeded, 0 errors
```

The main project currently reports decompiler-related warnings, primarily nullable annotations outside an enabled nullable context and explicit low-level WPF casts. They do not block compilation.

## Recovery limits

“Original source” cannot be recovered exactly from a compiled binary. Comments, formatting, solution metadata, some local variable names, and the author’s original high-level syntax are absent from IL. The provided project is a buildable reconstruction of the supplied code and resources, not a byte-for-byte copy of the author’s repository.

The following items remain outside the recoverable scope of this file:

- source or binaries for `erto3e4rortoergn.exe` and `Decompiler.exe`, because they are downloaded only at runtime;
- source for third-party bundled components such as WebView2, Windows SDK projections, Monaco, and `luau-lsp`;
- server-side code and current responses for Velocity, rscripts.net, AI providers, npm, or other remote services;
- runtime behavior under Roblox, which was not executed or dynamically instrumented.

## Principal hashes

| Component | SHA-256 |
|---|---|
| `Velocity.exe` | `48f1689eb31a2ab45ff2fd45d04ef231be843e4500664ac9a6cee8efbadebc5a` |
| `Velocity.dll` | `efad731038a51eed618ed2369e93bc0176106789eae62cc4001d0c2b66ff69e5` |
| `VelocityApi.dll` | `ac49579dbadee89ad33ca96c394b8e68c4cb3907a1d8f0aca57b09191f600209` |
| `assets.zip` | `284fb14d1df8082e1937d9ab4a04c40aed5753e690b49205ea0dc9471bf4820e` |
| `Velocity.g.resources` | `13fe29d5b218b74672f3adb0d549d27d6b12aafa4a5d5bf05a9628f261e4bf1c` |
| bundled `luau-lsp.exe` | `0da4f09d474e41074f4ec52bfef01eb90c014928358eda88f6a5afad5319b537` |

See `HASHES.sha256` for the compact hash list.
