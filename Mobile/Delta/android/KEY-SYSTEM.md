# Delta Android key-system map

## Confidence and provenance

The supplied APK's unpacked native heap contains this exact runtime source
reference:

```lua
PCALL(function() loadstring(game:HttpGet('https://raw.githubusercontent.com/Goober2112/Gloop/refs/heads/main/scripts/env-additions.lua'))() end)
```

That public repository was cloned at commit
`995434a098be7569426f8870dd742853dbaedddf` (commit date
2025-07-01). Its Android UI source is `scripts/ui/Delta.lua`, SHA-256
`5afd72bce87daea28beb0821a0584263f72492469649f04d5196ea752d8a5dc2`.

The APK proves the Gloop source relationship and runtime dependency. The public
repository is mutable and `Delta.lua` was not itself recovered as an APK
asset, so its key flow is strong source evidence for the runtime UI rather than
an immutable snapshot embedded in this APK.

## Request flow

The Android configuration uses PlatoBoost service ID `6`. The primary host is
`https://api.platorelay.com`; it falls back to
`https://api.platoboost.net` when the primary
`GET /public/connectivity` response is neither 200 nor 429.

The identifier is `SHA-256(gethwid())`. If `gethwid` is unavailable, the
fallback input is the Roblox local player's numeric user ID converted to a
string.

1. **Get-key link**
   - `POST /public/start`
   - JSON: `{"service":6,"identifier":"<sha256-hwid>"}`
   - A successful response supplies `data.url`, cached in memory for ten
     minutes and copied to the clipboard.
2. **Validate**
   - `GET /public/whitelist/6?identifier=<sha256-hwid>&key=<key>`
   - Access is granted only when the decoded JSON has both
     `success == true` and `data.valid == true`.
3. **Redeem a premium key**
   - If validation returns invalid and the submitted value begins with
     `KEY_`, the client sends `POST /public/redeem/6`.
   - JSON: `{"identifier":"<sha256-hwid>","key":"<key>"}`
   - A response with `success == true` and `data.valid == true` grants
     access.
4. **Keyless feature flag**
   - `GET /public/flag/6?name=keyless`
   - A true flag skips key entry and grants access.
5. **Local persistence**
   - A manually accepted key is saved with
     `writeinternal("delta_key", key)`.
   - Startup reads `delta_key`, if present, and validates it with the server
     again. The local file alone is not treated as authorization.

## Client-side trust boundary

`useNonce` is set to `false` and `secret` is `"NONE"`. The implemented
nonce/hash integrity branches are therefore inactive in this Android source.
The client trusts the HTTPS response and the JSON `success`/`data.valid`
booleans. There is no offline key algorithm in the recovered UI source.

The client prevents overlapping validation calls with an in-memory
`requestSending` flag and handles HTTP 429 as a 20-second rate-limit message.
It reports other non-200 responses as server errors. Submitted keys are
trimmed only for trailing whitespace before validation.

## APK loader checks around the key system

Offline native tracing found package probes for:

- `com.keybypass.bypass`
- `com.bypass`
- `com.bypasstools.app`

It also checks `/proc/self/status`, emulator artifacts for MuMu/LDPlayer/
VirtualBox, Xposed/Magisk-related properties, storage writability, package
version code, Android ID, and device/display properties. These checks surround
loader startup and are distinct from the PlatoBoost key decision.

## Source locations

- `scripts/ui/Delta.lua:52-115`: service/host and get-key link
- `scripts/ui/Delta.lua:144-209`: premium redemption
- `scripts/ui/Delta.lua:211-268`: whitelist validation
- `scripts/ui/Delta.lua:270-304`: server feature flag
- `scripts/ui/Delta.lua:5224-5244`: key entry and persistence
- `scripts/ui/Delta.lua:6511-6549`: startup validation

