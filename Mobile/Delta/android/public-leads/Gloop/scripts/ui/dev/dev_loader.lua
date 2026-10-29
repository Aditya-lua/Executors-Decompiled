local deltaAssets = {
    ["011"] = "cb0457617b0bfbda86688b261a2d312b",
    ["022"] = "1b87ff08021f3e9fac662f14a022eb59",
    ["033"] = "da23712d4d8098995abfc585488fb95a",
    ["044"] = "28478d0b937d617c0c36b9242f75a71f",
    ["055"] = "b62a7595743d2cf9a84fe885fe2308b4",
    ["066"] = "fbaae0cbc9e27afddd255cc1e4283934",
    ["077"] = "160dfe9eebe85925be0cba453d6ac21a",
    ["088"] = "b93c4f60d3f7dd9aa2eaf689a742c8c5",
    ["099"] = "6fc46a06072a1d3e8c99945da150c654",
    ["01010"] = "4897023ca03071d11c3adb84c557429c",
    ["01111"] = "8b736435badb78835695b827b533ce73",
    ["01212"] = "4ad52c7bd0e16462865bdf5bb68205b5",
    ["01313"] = "fdfaf5d8fa0056b0bd1a0c23a5e5f8ff",
    ["01414"] = "6dd24f0dfdf15a84373272177d88828f",
    ["01515"] = "bd8fc053bb4bae6f6047beb73965338c",
    ["01616"] = "ed6e8bee546663c48bb07e773523ad5c",
    ["01717"] = "763397d350f8d7f7b8e2faaf8cbb7005"
}

local oopsie = {
    ["13569242972"] = "011",
    ["13365156882"] = "022",
    ["13462269327"] = "033",
    ["13365407660"] = "044",
    ["13387875723"] = "055",
    ["13387419794"] = "066",
    ["13462268450"] = "077",
    ["13363093418"] = "088",
    ["13363121645"] = "099",
    ["11702779517"] = "01010",
    ["13441628967"] = "01111",
    ["13462271348"] = "01212",
    ["6014261993"] = "01313",
    ["13441695981"] = "01414",
    ["13462270380"] = "01515",
    ["13387657138"] = "01616",
    ["13387627918"] = "01717"
}

local progressDone = 0
local progressFinished = false

local count = 0
for i, v in next, deltaAssets do
    count = count + 1
end

------------------------------------------------------------------------------------------------------------
local d = {}
local e = game:GetService("GuiService")
d["1"] = Instance.new("ScreenGui", gethui())
d["1"]["IgnoreGuiInset"] = true;
d["1"]["Enabled"] = false;
d["1"]["ScreenInsets"] = Enum.ScreenInsets.DeviceSafeInsets;
d["1"]["Name"] = [[LOADERLoadingScreen]]
d["1"]["ZIndexBehavior"] = Enum.ZIndexBehavior.Sibling;
d["1"]["ResetOnSpawn"] = false;
d["2"] = Instance.new("Frame", d["1"])
d["2"]["ZIndex"] = -100;
d["2"]["BackgroundColor3"] = Color3.fromRGB(0, 0, 0)
d["2"]["BackgroundTransparency"] = 0.6600000262260437;
d["2"]["Size"] = UDim2.new(2, 0, 2, 0)
d["2"]["Position"] = UDim2.new(-1, 0, -1, 0)
d["2"]["Name"] = [[DarkOverlay]]
d["3"] = Instance.new("ImageLabel", d["1"])
d["3"].BorderSizePixel = 0;
d["3"].ScaleType = Enum.ScaleType.Crop;
d["3"].BackgroundColor3 = Color3.fromRGB(26, 27, 36)
--d["3"].Image = getAsset "13387419794"
d["3"].LayoutOrder = 10;
d["3"].Size = UDim2.new(0.32863849401474, 0, 0.31259891390800476, 0)
d["3"].BorderColor3 = Color3.fromRGB(0, 0, 0)
d["3"].Name = "MainFrame"
local f = d["3"].Size;
local g = e:GetScreenResolution().X / 2;
local h = e:GetScreenResolution().Y / 2;
local i = g - f.X.Offset / 2;
local j = h - f.Y.Offset / 2;
d["3"].Position = UDim2.new(0, i, 0, j / 20)
d["4"] = Instance.new("UICorner", d["3"])
d["4"]["CornerRadius"] = UDim.new(0.07000000029802322, 0)
d["5"] = Instance.new("ImageLabel", d["3"])
d["5"]["BackgroundColor3"] = Color3.fromRGB(26, 27, 36)
--d["5"]["Image"] = getAsset [[13387657138]]
d["5"]["LayoutOrder"] = 10;
d["5"]["Size"] = UDim2.new(1, 0, 1, 0)
d["5"]["Name"] = [[Overlay]]
d["5"]["BackgroundTransparency"] = 0.800000011920929;
d["6"] = Instance.new("UICorner", d["5"])
d["6"]["CornerRadius"] = UDim.new(0.07000000029802322, 0)
d["7"] = Instance.new("TextLabel", d["5"])
d["7"]["TextWrapped"] = true;
d["7"]["TextScaled"] = true;
d["7"]["BackgroundColor3"] = Color3.fromRGB(118, 192, 255)
--d["7"]["FontFace"] = Font.new(getAsset [[11702779517]], Enum.FontWeight.Bold, Enum.FontStyle.Normal)
d["7"]["TextSize"] = 14;
d["7"]["TextColor3"] = Color3.fromRGB(203, 244, 255)
d["7"]["AnchorPoint"] = Vector2.new(0, 0.5)
d["7"]["Size"] = UDim2.new(0.6451469659805298, 0, 0.1418459564447403, 0)
d["7"]["Text"] = "Asset loader";
d["7"]["Name"] = [[Title]]
d["7"]["BackgroundTransparency"] = 1;
d["7"]["Position"] = UDim2.new(0.1773512363433838, 0, 0.2073548913002014, 0)
d["8"] = Instance.new("TextLabel", d["5"])
d["8"]["TextWrapped"] = true;
d["8"]["TextScaled"] = true;
d["8"]["BackgroundColor3"] = Color3.fromRGB(255, 255, 255)
--d["8"]["FontFace"] = Font.new(getAsset [[11702779517]], Enum.FontWeight.Regular, Enum.FontStyle.Normal)
d["8"]["TextSize"] = 14;
d["8"]["TextColor3"] = Color3.fromRGB(203, 244, 255)
d["8"]["AnchorPoint"] = Vector2.new(0, 0.5)
d["8"]["Size"] = UDim2.new(0.8879498243331909, 0, 0.4277613639831543, 0)
d["8"]["Text"] = "hello"
local k = d;
k["14"] = Instance.new("UICorner", k["13"])
k["14"]["CornerRadius"] = UDim.new(0.20000000298023224, 0)
k["15"] = Instance.new("UIStroke", k["13"])
k["15"]["Color"] = Color3.fromRGB(31, 37, 47)
k["15"]["Thickness"] = 2;
k["16"] = Instance.new("TextLabel", k["13"])
k["16"]["TextWrapped"] = true;
k["16"]["BorderSizePixel"] = 0;
k["16"]["TextScaled"] = true;
k["16"]["BackgroundColor3"] = Color3.fromRGB(31, 37, 47)
--k["16"]["FontFace"] = Font.new(getAsset [[11702779517]], Enum.FontWeight.Bold, Enum.FontStyle.Normal)
k["16"]["TextSize"] = 14;
k["16"]["TextColor3"] = Color3.fromRGB(162, 191, 212)
k["16"]["AnchorPoint"] = Vector2.new(0.5, 0.5)
k["16"]["Size"] = UDim2.new(0.8865329027175903, 0, 0.5, 0)
k["16"]["Text"] = "Loading...";
k["16"]["Name"] = [[Input]]
k["16"]["BackgroundTransparency"] = 1;
k["16"]["Position"] = UDim2.new(0.5, 0, 0.5, 0)
d["8"]["Name"] = [[Desc]]
d["8"]["BackgroundTransparency"] = 1;
d["8"]["Position"] = UDim2.new(0.06185942143201828, 0, 0.5393086075782776, 0)
d["9"] = Instance.new("Frame", d["3"])
d["9"]["ZIndex"] = 0;
d["9"]["BorderSizePixel"] = 0;
d["9"]["BackgroundTransparency"] = 1;
d["9"]["Size"] = UDim2.new(1, 0, 1, 0)
d["9"]["Name"] = [[DropShadowHolder]]
d["a"] = Instance.new("ImageLabel", d["9"])
d["a"]["ZIndex"] = 0;
d["a"]["BorderSizePixel"] = 0;
d["a"]["SliceCenter"] = Rect.new(49, 49, 450, 450)
d["a"]["ScaleType"] = Enum.ScaleType.Slice;
d["a"]["ImageColor3"] = Color3.fromRGB(0, 0, 0)
d["a"]["ImageTransparency"] = 0.699999988079071;
d["a"]["AnchorPoint"] = Vector2.new(0.5, 0.5)
--d["a"]["Image"] = getAsset [[6014261993]]
d["a"]["Size"] = UDim2.new(1, 47, 1, 47)
d["a"]["Name"] = [[DropShadow]]
d["a"]["BackgroundTransparency"] = 1;
d["a"]["Position"] = UDim2.new(0.5, 0, 0.5, 0)
d["b"] = Instance.new("UIAspectRatioConstraint", d["3"])
d["b"]["AspectRatio"] = 1.8712739944458008;
local l = {}
local m = d["1"]
local n = game:GetService("TweenService")
local o = m.MainFrame;
local p = m.DarkOverlay;
local r = 0.6;
function l:Start()
    m.Enabled = true;
    o.Position = UDim2.new(0.336, 0, -0.372, 0)
    p.Transparency = 1;
    local s = n:Create(o, TweenInfo.new(r, Enum.EasingStyle.Quad, Enum.EasingDirection.Out), {
        Position = UDim2.new(0.336, 0, 0.322, 0)
    })
    local t = n:Create(p, TweenInfo.new(r, Enum.EasingStyle.Quad, Enum.EasingDirection.Out), {
        Transparency = 0.66
    })
    s:Play()
    t:Play()
    t.Completed:Wait()
end
coroutine.wrap(function()
    l:Start()
end)()
------------------------------------------------------------------------------------------------------------


function loadAssets()
    if not isfolder("DeltaAssets") then
        makefolder("DeltaAssets")
    end

    for assetId, md5 in next, deltaAssets do
        k["8"]["Text"] = "Downloading (" .. tostring(progressDone) .. "/" .. tostring(count) .. ")"
        local assetPath = "./DeltaAssets/" .. assetId
        if not isfile(assetPath) or md5 ~= crypt.hash(readfile(assetPath), "md5") then
            --[[if isfile(assetPath) then
                local l = readfile(assetPath)
                local m = crypt.hash(l, "md5")
                
                print("expected md5: " .. md5 .. " got: " .. m .. " size: " .. #l)
            end--]]

            local success, err = pcall(function()
                local content = game:HttpGetAsync(
                    "https://raw.githubusercontent.com/Goober2112/Gloop/refs/heads/main/assets/delta/" .. assetId)

                if content then
                    writefile(assetPath, content)
                    progressDone = progressDone + 1
                end
            end)

            if not success then
                warn("Failed to download delta asset " .. assetId .. "because " .. err)
            end
        end
    end

    d["1"]:Destroy()

    progressFinished = true
end

function getAsset(id)
    if #id > 6 then
        id = oopsie[id]
    end
    
    local assetPath = "./DeltaAssets/" .. id
    if isfile(assetPath) then
        local asset = getcustomasset(assetPath, false)

        if asset then
            return asset
        else
            warn("defaulting to asset (ASSERR-2):", id)
            return "rbxassetid://" .. id
        end
    else
        warn("defaulting to asset (ASSERR-1):", id)
        return "rbxassetid://" .. id
    end
end

function getProgress()
    return progressFinished, tostring(progressDone) .. "/" .. tostring(count)
end

return {
    loadAssets = loadAssets,
    getAsset = getAsset,
    getProgress = getProgress
}
