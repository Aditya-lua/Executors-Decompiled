-- Velocity executor globals. GENERATED — do not edit by hand.
--
-- Source: VelocityWebsite/scripts/build-docs.js — the same data that renders
-- the public docs, so the editor cannot drift from them. Regenerate with:
--
--     node Assets/luau-lsp/generate-definitions.js [path/to/build-docs.js]
--
-- That rewrites this file and rebuilds docs.json (Roblox's en-us.json merged
-- with the Velocity entries). Run it whenever the library surface changes.

declare extern type DrawingObject with
    Visible: boolean
    ZIndex: number
    Transparency: number
    Color: Color3
    __OBJECT_EXISTS: boolean
    function Remove(self): ()
    function Destroy(self): ()
end

declare extern type DrawingLine extends DrawingObject with
    From: Vector2
    To: Vector2
    Thickness: number
end

declare extern type DrawingCircle extends DrawingObject with
    Position: Vector2
    Radius: number
    NumSides: number
    Thickness: number
    Filled: boolean
end

declare extern type DrawingSquare extends DrawingObject with
    Position: Vector2
    Size: Vector2
    Thickness: number
    Filled: boolean
end

declare extern type DrawingTriangle extends DrawingObject with
    PointA: Vector2
    PointB: Vector2
    PointC: Vector2
    Thickness: number
    Filled: boolean
end

declare extern type DrawingQuad extends DrawingObject with
    PointA: Vector2
    PointB: Vector2
    PointC: Vector2
    PointD: Vector2
    Thickness: number
    Filled: boolean
end

declare extern type DrawingText extends DrawingObject with
    Text: string
    TextBounds: Vector2
    Font: number
    Size: number
    Position: Vector2
    Center: boolean
    Centered: boolean
    Outline: boolean
    Outlined: boolean
    OutlineColor: Color3
    OutlineOpacity: number
end

declare extern type DrawingImage extends DrawingObject with
    Data: string
    Size: Vector2
    Position: Vector2
    Rounding: number
    Loaded: boolean
end

declare Drawing: {
    -- No trailing (kind: string) overload on purpose: it matched first for an empty
    -- string, which meant typing Drawing.new("") offered no class names at all.
    -- Literal-only overloads are what make the seven types discoverable.
    new: ((kind: "Line") -> DrawingLine)
       & ((kind: "Circle") -> DrawingCircle)
       & ((kind: "Square") -> DrawingSquare)
       & ((kind: "Triangle") -> DrawingTriangle)
       & ((kind: "Quad") -> DrawingQuad)
       & ((kind: "Text") -> DrawingText)
       & ((kind: "Image") -> DrawingImage),
    -- Legacy font ids. Not listed in Velocity's own docs; taken from the Drawing
    -- reference because Text.Font is unusable without them. Delete if unsupported.
    Fonts: {
        UI: number,
        System: number,
        Plex: number,
        Monospace: number,
    },
}

declare extern type Connection with
    function Disconnect(self): ()
end

declare extern type RakNetPacket with
    function SetData(self, data: any): ()
    function Block(self): ()
    Direction: string
    PacketId: number
    ItemId: number
    Priority: number
    Reliability: number
    OrderingChannel: number
    Size: number
    CapturedSize: number
    Truncated: boolean
    Sequence: number
    Timestamp: number
    Data: string
    AsString: string
    AsBuffer: buffer
    AsArray: { number }
    Modified: boolean
    Blocked: boolean
end

declare extern type Signal with
    function Connect(self, handler: ((...any) -> ...any)): Connection
    function Once(self, handler: ((...any) -> ...any)): Connection
    function Wait(self): any
    function Fire(self, ...: any): ()
end

declare extern type WebSocket with
    function Send(self, message: string): ()
    function Close(self): ()
    OnMessage: RBXScriptSignal
    OnClose: RBXScriptSignal
end

declare Signal: {
    new: () -> Signal,
}

declare WebSocket: {
    connect: (url: string) -> WebSocket,
    Connect: (url: string) -> WebSocket,
    new: (url: string) -> WebSocket,
    New: (url: string) -> WebSocket,
}

declare base64: {
    encode: (data: string) -> string,
    decode: (data: string) -> string,
}

declare bit: {
    band: (...number) -> number,
    bor: (...number) -> number,
    bxor: (...number) -> number,
    bnot: (x: number) -> number,
    badd: (a: any, b: any) -> number,
    lshift: (x: any, n: any) -> number,
    rol: (x: any, n: any) -> number,
    tobit: (x: number) -> number,
    tohex: (x: number, digits: number?) -> string,
    bswap: (x: number) -> number,
}

declare cache: {
    invalidate: (instance: Instance) -> (),
    iscached: (instance: Instance) -> boolean,
    replace: (oldInstance: Instance, newInstance: Instance) -> (),
}

declare crypt: {
    random: (size: number) -> string,
    generatebytes: (size: number) -> string,
    generatekey: () -> string,
    hash: (data: string, algorithm: string) -> string,
    hmac: (data: string, key: string, algorithm: string) -> string,
    encrypt: (data: string, key: string, iv: string?, mode: string?) -> (string, string),
    decrypt: (data: string, key: string, iv: string, mode: string?) -> string,
    base64encode: (data: string) -> string,
    base64_encode: (data: string) -> string,
    encode: (data: string) -> string,
    base64decode: (data: string) -> string,
    base64_decode: (data: string) -> string,
    decode: (data: string) -> string,
    lz4compress: (data: string) -> string,
    lz4decompress: (data: string, decompressedSize: number) -> string,
}

declare debug: {
    -- Carried over from Roblox's definitions: this declaration replaces
    -- theirs outright, so omitting these would delete them.
    info: (<R...>(thread, number, string) -> R...) & (<R...>(number, string) -> R...) & (<A..., R1..., R2...>((A...) -> R1..., string) -> R2...),
    traceback: ((string?, number?) -> string) & ((thread, string?, number?) -> string),
    profilebegin: (label: string) -> (),
    profileend: () -> (),
    getmemorycategory: () -> string,
    setmemorycategory: (tag: string) -> (),
    resetmemorycategory: () -> (),
    getconstant: (f: any, idx: number) -> any,
    getconstants: (f: any) -> { any },
    setconstant: (f: any, idx: number, value: any) -> (),
    getproto: (f: any, idx: number, active: boolean?) -> any,
    getprotos: (f: any) -> { ((...any) -> ...any) },
    getupvalue: (f: any, idx: number) -> any,
    getupvalues: (f: any) -> { any },
    setupvalue: (f: any, idx: number, value: any) -> (),
    getstack: (level: number, idx: number?) -> any,
    setstack: (level: number, idx: number, value: any) -> (),
    getinfo: (flevel: number, what: string?) -> { [any]: any },
    getregistry: () -> { [any]: any },
    getmetatable: (value: any) -> any,
    setmetatable: (value: any, mt: { [any]: any }) -> any,
}

declare oth: {
    hook: (target: ((...any) -> ...any), hook: ((...any) -> ...any)) -> ((...any) -> ...any),
    unhook: (target: ((...any) -> ...any), hook: ((...any) -> ...any)) -> boolean,
    restore: (target: ((...any) -> ...any)) -> boolean,
    ishooked: (target: ((...any) -> ...any)) -> boolean,
    get_root_callback: (target: ((...any) -> ...any)) -> any,
}

declare raknet: {
    add_send_hook: (callback: ((packet: RakNetPacket) -> ())) -> (),
    remove_send_hook: (callback: ((packet: RakNetPacket) -> ())) -> (),
    add_receive_hook: (callback: ((packet: RakNetPacket) -> ())) -> (),
    remove_receive_hook: () -> (),
    send: (data: any, priority: number?, reliability: number?, ordering_channel: number?) -> (),
    hooked: () -> boolean,
    is_enabled: () -> boolean,
    stats: () -> { [any]: any },
    clear: () -> (),
    desync: (enabled: boolean) -> boolean,
    set: (packetId: number, value: number, start: number?, stop: number?) -> (),
    toggle: (packetId: number, enabled: boolean) -> (),
    remove: (packetId: number) -> (),
    block: (packetId: number, enabled: boolean?) -> boolean,
    unblock: (packetId: number) -> (),
}

declare function identifyexecutor(): (string, string)
declare function getexecutorname(): (string, string)
declare function gethwid(): string
declare function getidentity(): number
declare function getthreadidentity(): number
declare function getthreadcontext(): number
declare function get_thread_identity(): number
declare function get_thread_context(): number
declare function setidentity(level: number): ()
declare function setthreadidentity(level: number): ()
declare function setthreadcontext(level: number): ()
declare function set_thread_identity(level: number): ()
declare function set_thread_context(level: number): ()
declare function getfflag(name: string): any
declare function setfflag(name: string, value: any): ()
declare function checkcaller(): boolean
declare function cloneref(instance: Instance): Instance
declare function clonereference(instance: Instance): Instance
declare function getgenv(): { [any]: any }
declare function getreg(): { [any]: any }
declare function getrenv(): { [any]: any }
declare function gettenv(thread: thread): { [any]: any }
declare function loadstring(source: string, chunkname: string?): any
declare function executescript(source: string, chunkname: string?): any
declare function getscriptfromthread(thread: thread): any
declare function getobjects(assetId: any): { Instance }
declare function firetouchinterest(part: BasePart, humanoidPart: BasePart, action: number): ()
declare function queue_on_teleport(source: string): ()
declare function queueonteleport(source: string): ()
declare function clearqueueonteleport(): ()
declare function clear_teleport_queue(): ()
declare function clearteleportqueue(): ()
declare _G: { [any]: any }
declare function readfile(path: string): string
declare function writefile(path: string, contents: string): ()
declare function appendfile(path: string, contents: string): ()
declare function isfile(path: string): boolean
declare function isfolder(path: string): boolean
declare function delfile(path: string): ()
declare function delfolder(path: string): ()
declare function makefolder(path: string): ()
declare function listfiles(path: string): { string }
declare function loadfile(path: string, chunkname: string?): any
declare function getcustomasset(path: string): string
declare function setclipboard(text: string): ()
declare function setrbxclipboard(text: string): ()
declare function toclipboard(text: string): ()
declare function openfiledialog(filter: string?, title: string?): any
declare function openfilesdialog(filter: string?, title: string?): any
declare function savefiledialog(filter: string?, defaultName: string?, title: string?): any
declare function openfolderdialog(title: string?): any
declare function rconsolecreate(): ()
declare function consolecreate(): ()
declare function rconsoleshow(): ()
declare function consoleshow(): ()
declare function rconsoledestroy(): ()
declare function consoledestroy(): ()
declare function rconsolehide(): ()
declare function consolehide(): ()
declare function rconsolesettitle(title: string): ()
declare function rconsolename(title: string): ()
declare function consolesettitle(title: string): ()
declare function consolename(title: string): ()
declare function rconsoleclear(): ()
declare function consoleclear(): ()
declare function rconsoleprint(text: string): ()
declare function consoleprint(text: string): ()
declare function rconsoleinput(): string
declare function consoleinput(): string
declare function rconsoleinfo(text: string): ()
declare function consoleinfo(text: string): ()
declare function rconsolewarn(text: string): ()
declare function consolewarn(text: string): ()
declare function rconsoleerr(text: string): ()
declare function rconsoleerror(text: string): ()
declare function consoleerr(text: string): ()
declare function consoleerror(text: string): ()
declare function messagebox(text: string, title: string, buttons: number): number
declare function newcclosure(f: ((...any) -> ...any)): ((...any) -> ...any)
declare function newlclosure(f: ((...any) -> ...any)): ((...any) -> ...any)
declare function wrapclosure(f: ((...any) -> ...any)): ((...any) -> ...any)
declare function clonefunction(f: ((...any) -> ...any)): ((...any) -> ...any)
declare function hookfunction(target: ((...any) -> ...any), hook: ((...any) -> ...any)): ((...any) -> ...any)
declare function hookfunc(target: ((...any) -> ...any), hook: ((...any) -> ...any)): ((...any) -> ...any)
declare function replacefunction(target: ((...any) -> ...any), hook: ((...any) -> ...any)): ((...any) -> ...any)
declare function replaceclosure(target: ((...any) -> ...any), hook: ((...any) -> ...any)): ((...any) -> ...any)
declare function hookmetamethod(object: any, method: string, hook: ((...any) -> ...any)): ((...any) -> ...any)
declare function iscclosure(f: any): boolean
declare function islclosure(f: any): boolean
declare function isnewcclosure(f: any): boolean
declare function isexecutorclosure(f: any): boolean
declare function checkclosure(f: any): boolean
declare function isourclosure(f: any): boolean
declare function iscustomcclosure(f: any): boolean
declare function istempleclosure(f: any): boolean
declare function is_synapse_function(f: any): boolean
declare function issentinelclosure(f: any): boolean
declare function is_sirhurt_closure(f: any): boolean
declare function is_protosmasher_closure(f: any): boolean
declare function comparefunctions(a: ((...any) -> ...any), b: ((...any) -> ...any)): boolean
declare function getfunctionhash(f: ((...any) -> ...any)): string
declare function isfunctionhooked(f: ((...any) -> ...any)): boolean
declare function restorefunction(f: ((...any) -> ...any)): ()
declare function restorefunc(f: ((...any) -> ...any)): ()
declare function getcallbackvalue(object: any, memberName: string): any
declare function getcallbackmember(object: any, memberName: string): any
declare function getcallstack(): { { [any]: any } }
declare function getinstances(): { Instance }
declare function getinstancelist(): { Instance }
declare function getnilinstances(): { Instance }
declare function gethui(): Instance
declare function get_hidden_gui(): Instance
declare function compareinstances(a: Instance, b: Instance): boolean
declare function getscriptbytecode(script: Instance): string
declare function dumpstring(script: Instance): string
declare function getscripthash(script: Instance): any
declare function getscriptclosure(script: Instance): ((...any) -> ...any)
declare function getscriptfunction(script: Instance): ((...any) -> ...any)
declare function getcallingscript(): any
declare function getscripts(): { Instance }
declare function getloadedmodules(): { Instance }
declare function getrunningscripts(): { Instance }
declare function getsenv(script: Instance): { [any]: any }
declare function getmenv(module: ModuleScript): { [any]: any }
declare function decompile(script: Instance): string
declare function setscriptable(instance: Instance, property: string, scriptable: boolean): boolean
declare function isscriptable(instance: Instance, property: string): boolean
declare function gethiddenproperty(instance: Instance, property: string): (any, boolean)
declare function sethiddenproperty(instance: Instance, property: string, value: any): boolean
declare function getrawmetatable(value: any): any
declare function setrawmetatable(value: any, mt: { [any]: any }): any
declare function setreadonly(t: { [any]: any }, readonly: boolean): ()
declare function isreadonly(t: { [any]: any }): boolean
declare function makewriteable(t: { [any]: any }): ()
declare function makereadonly(t: { [any]: any }): ()
declare function getnamecallmethod(): any
declare function setnamecallmethod(name: string): ()
declare function firesignal(signal: RBXScriptSignal, ...: any): ()
declare function defersignal(signal: RBXScriptSignal, ...: any): ()
declare function replicatesignal(signal: RBXScriptSignal, ...: any): ()
declare function cansignalreplicate(signal: RBXScriptSignal): boolean
declare function getconnections(signal: RBXScriptSignal): { Connection }
declare function fireclickdetector(clickDetector: ClickDetector, distance: number?): ()
declare function fireproximityprompt(prompt: ProximityPrompt): ()
declare function getsignalarguments(signal: RBXScriptSignal): { string }
declare function getsignalargumentsinfo(signal: RBXScriptSignal): any
declare function getsignalwhitelist(): any
declare function getactors(): { Instance }
declare function get_actors(): { Instance }
declare function getactorthreads(): { thread }
declare function get_actor_threads(): { thread }
declare function isparallel(): boolean
declare function checkparallel(): boolean
declare function inparallel(): boolean
declare function run_on_actor(actor: Instance, source: string, ...: any): ()
declare function runonactor(actor: Instance, source: string, ...: any): ()
declare function run_on_thread(thread: thread, source: string, ...: any): ()
declare function runonthread(thread: thread, source: string, ...: any): ()
declare function create_comm_channel(): (number, BindableEvent)
declare function get_comm_channel(id: number): any
declare function getgc(includeTables: boolean?): { any }
declare function filtergc(kind: any, filter: { [any]: any }, findFirst: boolean?): any
declare function httpget(url: string, followRedirects: boolean?): string
declare function httppost(url: string, body: string, contentType: string?): string
declare function request(options: { [any]: any }): { [any]: any }
declare function http_request(options: { [any]: any }): { [any]: any }
declare function mouse1click(): ()
declare function mouse2click(): ()
declare function mousemoveabs(x: number, y: number): ()
declare function mousemoverel(dx: number, dy: number): ()
declare function mousescroll(delta: number): ()
declare function keypress(keyCode: number): ()
declare function keyrelease(keyCode: number): ()
declare function keyclick(keyCode: number): ()
declare function keytap(keyCode: number): ()
declare function cleardrawcache(): ()
declare function isrenderobj(value: any): boolean
declare function getrenderproperty(obj: DrawingObject, property: string): any
declare function setrenderproperty(obj: DrawingObject, property: string, value: any): ()
declare function getfpscap(): number
declare function setfpscap(fps: number): ()
declare function isrbxactive(): boolean
declare function isgameactive(): boolean
declare function iswindowactive(): boolean
declare function lz4compress(data: string): string
declare function lz4decompress(data: string, decompressedSize: number): string
