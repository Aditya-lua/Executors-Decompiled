
if not game:IsLoaded() then
    game.Loaded:Wait()
end

task.wait(1)

getgenv().GC_CACHE = nil

getgenv().getgccache = function(refresh)
    if refresh or not getgenv().GC_CACHE then
        getgenv().GC_CACHE = getgc(true)
    end
    return getgenv().GC_CACHE
end

getrunningscripts = function()
    local scripts = {}

    for _, v in ipairs(getgenv().getgccache()) do
        if typeof(v) == "Instance" and
            (v:IsA("LocalScript") or v:IsA("Script")) and v.Enabled then
            scripts[#scripts + 1] = v
        end
    end

    return scripts
end

getloadedmodules = function()
    local modules = {}

    for _, v in ipairs(getgenv().getgccache()) do
        if typeof(v) == "Instance" and v:IsA("ModuleScript") then
            modules[#modules + 1] = v
        end
    end

    return modules
end

local NativeWebSocket = WebSocket.connect

WebSocket.connect = function(url)
    local native_ws = NativeWebSocket(url)
    
    local onMessageEvent = Instance.new("BindableEvent")
    local onCloseEvent = Instance.new("BindableEvent")
    
    local wrapper = {
        Send = function(self, msg) native_ws:Send(msg) end,
        Close = function(self) native_ws:Close() end,
        OnMessage = onMessageEvent.Event,
        OnClose = onCloseEvent.Event
    }
    
    task.spawn(function()
        local closed_fired = false
        while true do
            local msgs = native_ws:GetMessages()
            if msgs then
                for _, msg in ipairs(msgs) do
                    onMessageEvent:Fire(msg)
                end
            end
            
            if native_ws:IsClosed() and not closed_fired then
                closed_fired = true
                onCloseEvent:Fire()
                break
            end
            
            task.wait()
        end
    end)
    
    return wrapper
end