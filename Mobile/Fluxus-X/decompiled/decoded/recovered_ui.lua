
if not game:IsLoaded() then
    game.Loaded:Wait()
end

task.wait(1)

-- workspace.saves: ensure save folder exists
local SAVE_DIR = "workspace.saves/"
if not isfolder(SAVE_DIR) then
    makefolder(SAVE_DIR)
end
if not isfolder('workspace.saves/scripts')then makefolder('workspace.saves/scripts')end
local function savepath(name)
    return SAVE_DIR .. name
end

if not isfile(savepath('.fluxusui'))then
    writefile(savepath('.fluxusui'),'1')
end
if readfile(savepath('.fluxusui'))=='2'then
    do
        local clone_match = clonefunction(string.match)
        local clone_type = clonefunction(type)

        local HttpService = game:GetService("HttpService")
        local TweenService = game:GetService("TweenService")

        local discord = game:HttpGet("https://discord.gg/NKgEmhMKYs")
        local authvf = AeVPjNWXqQ or function() return true end

        local main_selector = nil;
        local other_items = {}

        local LocalizationService = game:GetService("LocalizationService")
        local player = game.Players.LocalPlayer

        local result, code = pcall(function()
            return LocalizationService:GetCountryRegionForPlayerAsync(player)
        end)

        function auth_user(key)

            repeat wait() until game:GetService('Players').LocalPlayer
            
            local ret = authvf(key, game:GetService('Players').LocalPlayer.Name .. tostring("&lang=") .. tostring(code) )
            
            if ret then
                writefile(savepath(".fluxus-auth-store"), key)
            end

            return ret;
        end

        local read_clipboard = readclipboard_hideenv
        getgenv().readclipboard_hideenv = nil

        local function loadcode(type, src)
            local code = src
            if not code then return end
            local f, e = loadstring(code)
            if not f then return warn("Compile Error: " .. tostring(e)) end
            local success, result = pcall(f)
            if not success then
                warn("Runtime Error: " .. tostring(result))
            end
        end

        local FastAnims = false;
        local NoAnims = false;
        local SaveSettings = true;
        local SaveTabs = true;
        local CenterMinimize = false;
        local FPSUnlocker = false;

        local ConsoleOutput = true;
        local ConsoleWarning = true;
        local ConsoleError = true;

        local function tween_property(obj, data, length, style)
            local Time = (type(length) == "number") and length or 0.3;

            if NoAnims then
                Time = 0;
            elseif FastAnims then
                if(Time > 0.4) then
                    Time = Time - 0.4
                else
                    Time = Time - 0.2;
                end
            end

            TweenService:Create(obj, TweenInfo.new(Time , if style then style else Enum.EasingStyle.Back, Enum.EasingDirection.Out,0,false,0), data):Play() 
            
            return Time + 0.2;
        end

        pcall(function()
            if isfile(savepath(".flux_settings")) then
                local data = HttpService:JSONDecode(readfile(savepath(".flux_settings")))

                FastAnims = data["FastAnims"];
                NoAnims = data["NoAnims"];
                SaveSettings = data["SaveSettings"];
                SaveTabs = data["SaveTabs"];
                CenterMinimize = data["CenterMinimize"];
                FPSUnlocker = data["FPSUnlocker"];

                ConsoleOutput = data["ConsoleOutput"];
                ConsoleWarning = data["ConsoleWarning"];
                ConsoleError = data["ConsoleError"];
            end
        end)

        local function save_settings()
            if SaveSettings == false then
                return;
            end

            writefile(savepath(".flux_settings"), HttpService:JSONEncode({
                ["SaveSettings"] = SaveSettings,
                ["SaveTabs"] = SaveTabs,
                ["FastAnims"] = FastAnims,
                ["NoAnims"] = NoAnims,
                ["CenterMinimize"] = CenterMinimize,
                ["FPSUnlocker"] = FPSUnlocker,
                
                ["ConsoleOutput"] = ConsoleOutput,
                ["ConsoleWarning"] = ConsoleWarning,
                ["ConsoleError"] = ConsoleError,
            }))
        end

        local function save_tabs(tabs)
            if SaveTabs == false then
                return;
            end
            
            local tabs_filtered = {}

            for i,v in pairs(tabs) do
                if v ~= false then
                    table.insert(tabs_filtered, v);
                end
            end

            writefile(savepath(".flux_tabs"), HttpService:JSONEncode(tabs_filtered));
        end

        local ScreenGui = Instance.new("ScreenGui")
        local LeftBarFrame = Instance.new("Frame")
        local Logo = Instance.new("ImageButton")
        local ShowUI = Instance.new("Frame")
        local ShowUIUICorner = Instance.new("UICorner")
        local ShowUILogo = Instance.new("ImageButton")

        repeat wait() until game:GetService('Players').LocalPlayer;
        --local uinamel = crypt.hash(game:GetService('Players').LocalPlayer.Name .. tostring(os.time()))
            
        ScreenGui.Name = gethwid();
        ScreenGui.Parent = gethui();
        ScreenGui.DisplayOrder=1999999999
        ScreenGui.ResetOnSpawn = false;
        ScreenGui.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
        ScreenGui.ScreenInsets=Enum.ScreenInsets.None

        LeftBarFrame.Name = "LeftBarFrame"
        LeftBarFrame.Parent = ScreenGui
        LeftBarFrame.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
        LeftBarFrame.BorderColor3 = Color3.fromRGB(45, 47, 51)
        LeftBarFrame.BorderSizePixel = 0
        LeftBarFrame.Size = UDim2.new(0.1, 100, 1, 0)
        LeftBarFrame.Position = UDim2.new(-0.1, -100, 0, 0);

        tween_property(LeftBarFrame, {
            Position = UDim2.new(0, 0, 0, 0);
        }, 0.5, Enum.EasingStyle.Linear);

        function hide_ui()
            if LeftBarFrame.Visible == false then
                return;
            end

            for i,v in pairs(other_items) do
                local Frame = v.Frame;
                local Item = v.TabItem;
                local Selector = v.Selector;
            
                Frame.BackgroundColor3 = Color3.fromRGB(70, 70, 72);
                Item.Position = UDim2.new(0.1, 100, -1, 0)   
                Selector.Visible = false;
                Item.Visible = false;
            end
            
            if main_selector then
                main_selector.Selector.Visible = true;
            end
            
            local time = tween_property(LeftBarFrame, 
            {
                Position = UDim2.new(-0.1, -100, 0, 0);
            }, 0.5, Enum.EasingStyle.Linear);
            
            wait(time);
            
            LeftBarFrame.Visible = false;
            ShowUI.Visible = true;
            
            if CenterMinimize then
                ShowUI.Position = UDim2.new(0.5, -15, 0, -100);
                
                local time = tween_property(ShowUI, 
                {
                    Position = UDim2.new(0.5, -15, 0, 60);
                }, 0.5, Enum.EasingStyle.Linear);
            else
                ShowUI.Position = UDim2.new(-0.1, -100, 0, 0);
            
                local time = tween_property(ShowUI, 
                {
                    Position = UDim2.new(0, 15, 0, 60);
                }, 0.5, Enum.EasingStyle.Linear);
            end
        end

        function show_ui()
            if CenterMinimize then 
                local time = tween_property(ShowUI, 
                {
                    Position = UDim2.new(0.5, -15, 0, -100);
                }, 0.5, Enum.EasingStyle.Linear);
                
                wait(time - 0.1);
            end
            
            ShowUI.Visible = false;
            LeftBarFrame.Visible = true;

            local time = tween_property(LeftBarFrame, 
            {
                Position = UDim2.new(0, 0, 0, 0);
            }, 0.5, Enum.EasingStyle.Linear);
        end

        local function notify(title, text)
            local Notification = Instance.new("Frame")
            local Title = Instance.new("TextLabel")
            local Text = Instance.new("TextLabel")
            local Button = Instance.new("Frame")
            local UIListLayout = Instance.new("UIListLayout")
            local TextButton = Instance.new("TextButton")
            local UICorner = Instance.new("UICorner")
            local UICorner_2 = Instance.new("UICorner")

            Notification.Name = "Notification"
            Notification.Parent = ScreenGui
            Notification.BackgroundColor3 = Color3.fromRGB(25, 25, 25)
            Notification.BorderColor3 = Color3.fromRGB(25, 25, 25)
            Notification.BorderSizePixel = 0
            Notification.Position = UDim2.new(0.5, -210, 0.5, -120)
            Notification.Size = UDim2.new(0, 420, 0, 240)

            Title.Name = "Title"
            Title.Parent = Notification
            Title.BackgroundColor3 = Color3.fromRGB(25, 25, 25)
            Title.BorderColor3 = Color3.fromRGB(255, 255, 255)
            Title.BorderSizePixel = 0
            Title.Position = UDim2.new(0, 5, 0, 0)
            Title.Size = UDim2.new(1, -5, 0, 25)
            Title.Font = Enum.Font.GothamMedium
            Title.Text = title
            Title.TextColor3 = Color3.fromRGB(255, 255, 255)
            Title.TextSize = 14.000
            Title.TextWrapped = true
            Title.BackgroundTransparency = 1.000

            Text.Name = "Text"
            Text.Parent = Notification
            Text.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
            Text.BackgroundTransparency = 1.000
            Text.BorderColor3 = Color3.fromRGB(0, 0, 0)
            Text.BorderSizePixel = 0
            Text.Position = UDim2.new(0, 5, 0, 25)
            Text.Size = UDim2.new(1, -5, 0, 175)
            Text.Font = Enum.Font.Gotham
            Text.Text = text
            Text.TextColor3 = Color3.fromRGB(255, 255, 255)
            Text.TextSize = 12.000
            Text.TextWrapped = true
            Text.TextXAlignment = Enum.TextXAlignment.Left
            Text.TextYAlignment = Enum.TextYAlignment.Top

            if Text.TextFits == false then
                Text.TextScaled = true;
            end

            Button.Name = "Button"
            Button.Parent = Notification
            Button.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
            Button.BackgroundTransparency = 1.000
            Button.BorderSizePixel = 0
            Button.Position = UDim2.new(0, 0, 1, -35)
            Button.Size = UDim2.new(1, 0, 0, 25)

            UIListLayout.Parent = Button
            UIListLayout.FillDirection = Enum.FillDirection.Horizontal
            UIListLayout.HorizontalAlignment = Enum.HorizontalAlignment.Center
            UIListLayout.SortOrder = Enum.SortOrder.LayoutOrder
            UIListLayout.Padding = UDim.new(0, 2)

            TextButton.Parent = Button
            TextButton.BackgroundColor3 = Color3.fromRGB(40, 40, 40)
            TextButton.BorderSizePixel = 0
            TextButton.Size = UDim2.new(0, 150, 1, 0)
            TextButton.Font = Enum.Font.GothamBold
            TextButton.Text = "OK"
            TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
            TextButton.TextSize = 12.000
            TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)

            TextButton.MouseButton1Down:connect(function()
                Notification:Destroy()
                setclipboard(discord)
            end)

            UICorner.CornerRadius = UDim.new(0, 5)
            UICorner.Parent = TextButton

            UICorner_2.Parent = Notification
        end

        Logo.Name = "Logo"
        Logo.Parent = LeftBarFrame
        Logo.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Logo.BackgroundTransparency = 1
        Logo.BorderSizePixel = 0
        Logo.Position = UDim2.new(0.25, 0, 0, 10)
        Logo.Size = UDim2.new(0.5, 0, 0, 50)
        Logo.Image = "rbxassetid://138900967749432"
        Logo.ScaleType = Enum.ScaleType.Fit
        Logo.AutoButtonColor = false;
        Logo.MouseButton1Down:Connect(hide_ui)

        spawn(function()
            repeat wait() until game:GetService("CoreGui").TopBarApp ~= nil
            
            --game:GetService("CoreGui").TopBarApp.TopBarFrame.LeftFrame.MenuIcon.Background.MouseButton1Down:connect(hide_ui)
        end)

        ShowUI.Parent = ScreenGui
        ShowUI.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
        ShowUI.BorderColor3 = Color3.fromRGB(45, 47, 51)
        ShowUI.BorderSizePixel = 0
        ShowUI.Position = UDim2.new(-0.1, -100, 0, 0);
        ShowUI.Size = UDim2.new(0, 30, 0, 30)
        ShowUI.Visible = false;

        ShowUIUICorner.CornerRadius = UDim.new(1, 0)
        ShowUIUICorner.Parent = ShowUI

        ShowUILogo.Name = "Logo"
        ShowUILogo.Parent = ShowUI
        ShowUILogo.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        ShowUILogo.BackgroundTransparency = 1.000
        ShowUILogo.BorderSizePixel = 0
        ShowUILogo.Position = UDim2.new(0, 0, 0.166666672, 1)
        ShowUILogo.Size = UDim2.new(1, 0, 0.6, 0)
        ShowUILogo.Image = "rbxassetid://138900967749432"
        ShowUILogo.ScaleType = Enum.ScaleType.Fit
        ShowUILogo.AutoButtonColor = false;
        ShowUILogo.MouseButton1Down:Connect(show_ui)

        local returns = 
        {
            LeftBarFrame = LeftBarFrame;
            Logo = Logo;
        }

        function returns:create_selector()
            local function make_selector(Visible)
                local Selector = Instance.new("ScrollingFrame")
                local UIListLayout = Instance.new("UIListLayout")
                    
                Selector.Name = "Selector"
                Selector.Parent = LeftBarFrame
                Selector.Active = true
                Selector.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                Selector.BackgroundTransparency = 1
                Selector.BorderColor3 = Color3.fromRGB(0, 0, 0)
                Selector.BorderSizePixel = 0
                Selector.Position = UDim2.new(0, 2, 0, 80)
                Selector.Size = UDim2.new(0.98, 0, 1, -80)
                Selector.CanvasSize = UDim2.new(0, 0, 0, 0)
                Selector.ScrollBarThickness = 2
                Selector.Visible = Visible;
                Selector.ElasticBehavior = Enum.ElasticBehavior.Never
                Selector.ScrollingDirection = Enum.ScrollingDirection.Y

                UIListLayout.Parent = Selector
                UIListLayout.HorizontalAlignment = Enum.HorizontalAlignment.Center
                UIListLayout.SortOrder = Enum.SortOrder.LayoutOrder
                UIListLayout.Padding = UDim.new(0, 5)
            
                Selector.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
            
                UIListLayout:GetPropertyChangedSignal("AbsoluteContentSize"):Connect(function()
                    Selector.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
                end)

                return Selector
            end

            local Selector = make_selector(true);

            local returns = {
                Selector = Selector;
                UIListLayout = UIListLayout;
            }

            local function create_button(Selector, Name, Callback, Options)
                if type(Options) ~= "table" then
                    Options = {}
                end

                local Frame = Instance.new("Frame")
                local UICorner = Instance.new("UICorner")
                local TextButton = Instance.new("TextButton")
                        
                Frame.Name = Name
                Frame.Parent = Selector
                Frame.BackgroundColor3 = if Options.Purple then Color3.fromRGB(103, 61, 234) else Color3.fromRGB(70, 70, 72)
                Frame.BorderSizePixel = 0
                Frame.Size = UDim2.new(0.9, 0, 0, 25)
                
                UICorner.Parent = Frame
                
                TextButton.Name = "TextButton";
                TextButton.Parent = Frame
                TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton.BackgroundTransparency = 1
                TextButton.BorderSizePixel = 0
                TextButton.Size = UDim2.new(1, 0, 1, 0)
                TextButton.Font = Enum.Font.GothamBold
                TextButton.Text = Name
                TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                TextButton.TextSize = 12
                TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)

                TextButton.MouseButton1Down:connect(function()
                    if Callback then
                        Callback(Frame)
                    end
                end)

                return Frame, TextButton
            end

            function returns:create_section(Name, Callback, TabButton)
                local rets = {}
                
                if TabButton then
                    local TabItem = Instance.new("Frame")
                    local Container = Instance.new("Frame")

                    TabItem.Name = "TabItem"
                    TabItem.Parent = ScreenGui
                    TabItem.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                    TabItem.BackgroundTransparency = 0.3
                    TabItem.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    TabItem.BorderSizePixel = 0
                    TabItem.Position = UDim2.new(0.1, 100, -1, 0)
                    TabItem.Size = UDim2.new(0.9, -100, 1, 0)
                    TabItem.Visible = false;

                    Container.Name = "Container"
                    Container.Parent = TabItem
                    Container.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                    Container.BackgroundTransparency = 1
                    Container.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Container.BorderSizePixel = 0
                    Container.Position = UDim2.new(0, 10, 0, 10)
                    Container.Size = UDim2.new(1, -10, 1, -10)

                    local _Selector = make_selector(false);

                    rets.TabItem = TabItem;
                    rets.Container = Container;
                    rets.Selector = _Selector;
                    
                    function rets:create_button(Name, Callback, Options)
                        return create_button(_Selector, Name, Callback, Options);
                    end

                    function rets:create_toggle(Name, Callback, Options)
                        local Enabled = (type(Options) == "table" and Options.Enabled) and Options.Enabled or false;

                        local Toggle = Instance.new("Frame")
                        local Text = Instance.new("TextLabel")
                        local TextButton = Instance.new("TextButton")
                        local UICorner = Instance.new("UICorner")
                        local Selector = Instance.new("TextButton")
                        local UICorner_2 = Instance.new("UICorner")

                        Toggle.Name = "Toggle"
                        Toggle.Parent = _Selector
                        Toggle.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                        Toggle.BackgroundTransparency = 1.000
                        Toggle.BorderSizePixel = 0
                        Toggle.Position = UDim2.new(0.05, 0, 0.111, 0)
                        Toggle.Size = UDim2.new(0.9, 0, -0.003, 25)

                        Text.Name = "Text"
                        Text.Parent = Toggle
                        Text.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                        Text.BackgroundTransparency = 1.000
                        Text.BorderColor3 = Color3.fromRGB(0, 0, 0)
                        Text.BorderSizePixel = 0
                        Text.Position = UDim2.new(0, 25, 0, 0)
                        Text.Size = UDim2.new(1, -25, 1, 0)
                        Text.Font = Enum.Font.Gotham
                        Text.Text = Name
                        Text.TextColor3 = Color3.fromRGB(255, 255, 255)
                        Text.TextSize = 14.000
                        Text.TextXAlignment = Enum.TextXAlignment.Left

                        TextButton.Parent = Toggle
                        TextButton.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                        TextButton.BorderColor3 = Color3.fromRGB(0, 0, 0)
                        TextButton.BorderSizePixel = 0
                        TextButton.Size = UDim2.new(0, 22, 0, 22)
                        TextButton.AutoButtonColor = false
                        TextButton.Font = Enum.Font.SourceSans
                        TextButton.Text = ""
                        TextButton.TextColor3 = Color3.fromRGB(0, 0, 0)
                        TextButton.TextSize = 14.000

                        UICorner.CornerRadius = UDim.new(0, 5)
                        UICorner.Parent = TextButton

                        Selector.Name = "Selector"
                        Selector.Parent = Toggle
                        Selector.BackgroundColor3 = if Enabled then Color3.fromRGB(103, 61, 234) else Color3.fromRGB(70, 70, 72)
                        Selector.BorderColor3 = Color3.fromRGB(0, 0, 0)
                        Selector.BorderSizePixel = 0
                        Selector.Position = UDim2.new(0, 4, 0, 4)
                        Selector.Size = UDim2.new(0, 14, 0, 14)
                        Selector.AutoButtonColor = false
                        Selector.Font = Enum.Font.SourceSans
                        Selector.Text = ""
                        Selector.TextColor3 = Color3.fromRGB(0, 0, 0)
                        Selector.TextSize = 14.000

                        UICorner_2.CornerRadius = UDim.new(1, 0)
                        UICorner_2.Parent = Selector

                        if Enabled and Options.Call then
                            Callback(true)
                        end
                            
                        function change_toggle_state()
                            Enabled = not Enabled;
                            if Enabled then
                                tween_property(Selector, {
                                    BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                                });
                            else
                                tween_property(Selector, {
                                    BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                                });
                            end

                            if Callback then
                                Callback(Enabled)
                            end
                        end

                        Selector.MouseButton1Down:connect(change_toggle_state)
                        TextButton.MouseButton1Down:connect(change_toggle_state)

                        return Toggle;
                    end

                    function rets:create_label(Name)
                        local Label = Instance.new("TextLabel")

                        Label.Name = "Label"
                        Label.Parent = _Selector
                        Label.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                        Label.BackgroundTransparency = 1
                        Label.BorderColor3 = Color3.fromRGB(0, 0, 0)
                        Label.BorderSizePixel = 0
                        Label.Size = UDim2.new(0.9, 0, 0, 25)
                        Label.Font = Enum.Font.GothamBold
                        Label.Text = Name
                        Label.TextColor3 = Color3.fromRGB(255, 255, 255)
                        Label.TextSize = 14
                        Label.TextXAlignment = Enum.TextXAlignment.Left

                        return Label;
                    end

                    function rets:create_padding(Size)
                        local Padding = Instance.new("Frame")

                        Padding.Name = "Padding"
                        Padding.Parent = _Selector
                        Padding.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                        Padding.BackgroundTransparency = 1
                        Padding.BorderSizePixel = 0
                        Padding.Size = UDim2.new(0.9, 0, 0, if Size then Size else 12.5)

                        return Padding;
                    end

                    function rets:create_backbutton()
                        local Back = Instance.new("Frame")
                        local UICorner = Instance.new("UICorner")
                        local TextButton = Instance.new("TextButton")

                        Back.Name = "Back"
                        Back.Parent = _Selector
                        Back.BackgroundColor3 = Color3.fromRGB(25,25,25)
                        Back.BorderSizePixel = 0
                        Back.Size = UDim2.new(0.9, 0, 0, 25)

                        UICorner.Parent = Back

                        TextButton.Parent = Back
                        TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                        TextButton.BackgroundTransparency = 1
                        TextButton.BorderSizePixel = 0
                        TextButton.Size = UDim2.new(1, 0, 1, 0)
                        TextButton.Font = Enum.Font.GothamBold
                        TextButton.Text = "< Back"
                        TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                        TextButton.TextSize = 14
                        TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)

                        return TextButton;
                    end
                end

                local Frame, TextButton = create_button(Selector, Name, Callback);

                rets.Frame = Frame;
                rets.TextButton = TextButton;

                return rets
            end

            return returns;
        end

        local keyselector = returns:create_selector();

        local function load_ui(animate)
            if runautoexec_hideenv then
                runautoexec_hideenv()
                getgenv().runautoexec_hideenv = nil
            end
        
            keyselector.Selector.Visible = false;
            
            if animate then
                local time = tween_property(LeftBarFrame, {
                    Position = UDim2.new(-0.1, -100, 0, 0);
                }, 0.5, Enum.EasingStyle.Linear);
                
                wait(time)
            
                tween_property(LeftBarFrame, {
                    Position = UDim2.new(0, 0, 0, 0);
                }, 0.5, Enum.EasingStyle.Linear);
            end

            main_selector = returns:create_selector()
            
            function switch_tab(main_executor_frame, skip)
                if main_executor_frame.BackgroundColor3 == Color3.fromRGB(70, 70, 72) then
                    main_selector.Selector.Visible = false;
            
                    for i,v in pairs(other_items) do
            
                        local Frame = v.Frame;
                        local Item = v.TabItem;
                        local Selector = v.Selector;
            
                        if Frame ~= main_executor_frame then
                            Frame.BackgroundColor3 = Color3.fromRGB(70, 70, 72);
                            Selector.Visible = false;
                            Item.Visible = false;
                            Item.Position = UDim2.new(0.1, 100, -1, 0)
                        else
                            Frame.BackgroundColor3 = Color3.fromRGB(103, 61, 234);
                            Selector.Visible = true;
            
                            local Time = (type(length) == "number") and length or 0.3;
            
                            Item.Visible = true;
            
                            tween_property(Item, {
                                Position = UDim2.new(0.1, 100, 0, 0)
                            }, 0.8);
                        end
                    end
                end
            end
            
            function back_tab()
                for i,v in pairs(other_items) do
                    local Frame = v.Frame;
                    local Item = v.TabItem;
                    local Selector = v.Selector;
            
                    Frame.BackgroundColor3 = Color3.fromRGB(70, 70, 72);
                    Item.Position = UDim2.new(0.1, 100, -1, 0)   
                    Selector.Visible = false;
                    Item.Visible = false;
                end
            
                main_selector.Selector.Visible = true;
            end
            
            local main_executor_container = main_selector:create_section("Executor", function(Frame)
                switch_tab(Frame)
            end, true)
            
            local main_cloud_container = main_selector:create_section("Cloud", function(Frame)
                switch_tab(Frame)
            end, true)
            
            local main_console_container = main_selector:create_section("Console", function(Frame)
                switch_tab(Frame)
            end, true)
            
            local main_settings_container = main_selector:create_section("Settings", function(Frame)
                switch_tab(Frame, true)
            end, true)
            
            table.insert(other_items, main_executor_container)
            table.insert(other_items, main_cloud_container)
            table.insert(other_items, main_console_container)
            table.insert(other_items, main_settings_container)
            
            do -- Insert Execution Tab Items
                local Container = main_executor_container.Container;
                local TopBar = Instance.new("Frame")
                local UIListLayout = Instance.new("UIListLayout")
                local Script = Instance.new("Frame")
                local Frame = Instance.new("Frame")
                local UICorner = Instance.new("UICorner")
                local ScriptNameBox = Instance.new("TextBox")
                local NewTab = Instance.new("Frame")
                local Frame_2 = Instance.new("Frame")
                local UICorner_2 = Instance.new("UICorner")
                local TextButton_2 = Instance.new("TextButton")
                local BackTab = Instance.new("Frame")
                local Frame_3 = Instance.new("Frame")
                local UICorner_3 = Instance.new("UICorner")
                local TextButton_3 = Instance.new("TextButton")
                local NextTab = Instance.new("Frame")
                local Frame_4 = Instance.new("Frame")
                local UICorner_4 = Instance.new("UICorner")
                local TextButton_4 = Instance.new("TextButton")
                local TextBox = Instance.new("TextBox")
                
                local script_manager = getscripts_hideenv or function() return {} end;
                getgenv().getscripts_hideenv = nil;

                local SCRIPT_FOLDER_PATH = "workspace.saves/scripts"
                if type(isfolder) == "function" and type(makefolder) == "function" then
                    pcall(function()
                        if not isfolder(SCRIPT_FOLDER_PATH) then
                            makefolder(SCRIPT_FOLDER_PATH)
                        end
                    end)
                end

                local script_list = {}
                local managerOk, managerScripts = pcall(script_manager)
                if managerOk and type(managerScripts) == "table" then
                    for name, contents in pairs(managerScripts) do
                        script_list[name] = contents
                    end
                end

                if type(listfiles) == "function" and type(readfile) == "function" then
                    local listOk, files = pcall(listfiles, SCRIPT_FOLDER_PATH)
                    if listOk and type(files) == "table" then
                        for _, file in ipairs(files) do
                            local readOk, contents = pcall(readfile, file)
                            if readOk and type(contents) == "string" then
                                local name = tostring(file):match("[^/\\]+$") or tostring(file)
                                script_list[name] = contents
                            end
                        end
                    end
                end
                
                local ScriptFrameContainer = Instance.new("Frame")
                local ScriptFolder = Instance.new("ScrollingFrame")
                local UIListLayout__ = Instance.new("UIListLayout")
                local UserIdentity = Instance.new("TextLabel")
                local UIPadding = Instance.new("UIPadding")
                            
                ScriptFrameContainer.Name = "ScriptFrameContainer"
                ScriptFrameContainer.Parent = Container
                ScriptFrameContainer.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                ScriptFrameContainer.BackgroundTransparency = 0.900
                ScriptFrameContainer.BorderColor3 = Color3.fromRGB(0, 0, 0)
                ScriptFrameContainer.BorderSizePixel = 0
                ScriptFrameContainer.Position = UDim2.new(0.800000012, 0, 0, -10)
                ScriptFrameContainer.Size = UDim2.new(0.200000003, 0, 1, 10)
                    
                ScriptFolder.Name = "ScriptFolder"
                ScriptFolder.VerticalScrollBarInset = Enum.ScrollBarInset.Always
                ScriptFolder.ElasticBehavior = Enum.ElasticBehavior.Never
                ScriptFolder.Parent = ScriptFrameContainer
                ScriptFolder.Active = true
                ScriptFolder.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                ScriptFolder.BackgroundTransparency = 1.000
                ScriptFolder.BorderColor3 = Color3.fromRGB(0, 0, 0)
                ScriptFolder.BorderSizePixel = 0
                ScriptFolder.Size = UDim2.new(1, 0, 0.8, 0)
                ScriptFolder.ScrollBarThickness = 8
            
                UIListLayout__.Parent = ScriptFolder
                UIListLayout__.HorizontalAlignment = Enum.HorizontalAlignment.Left
                UIListLayout__.SortOrder = Enum.SortOrder.LayoutOrder
                UIListLayout__.Padding = UDim.new(0, 5)
                
                ScriptFolder.CanvasSize = UDim2.new(0, 0, 0, UIListLayout__.AbsoluteContentSize.Y)
            
                UIListLayout__:GetPropertyChangedSignal("AbsoluteContentSize"):Connect(function()
                    ScriptFolder.CanvasSize = UDim2.new(0, 0, 0, UIListLayout__.AbsoluteContentSize.Y)
                end)
                    
                UserIdentity.Name = "UserIdentity"
                UserIdentity.Parent = ScriptFolder
                UserIdentity.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                UserIdentity.BackgroundTransparency = 1.000
                UserIdentity.BorderColor3 = Color3.fromRGB(0, 0, 0)
                UserIdentity.BorderSizePixel = 0
                UserIdentity.Position = UDim2.new(0.0496892706, 0, 0.00134769862, 0)
                UserIdentity.Size = UDim2.new(0.89440614, 0, -0.00479941955, 25)
                UserIdentity.Font = Enum.Font.GothamBold
                UserIdentity.Text = "Script Folder"
                UserIdentity.TextColor3 = Color3.fromRGB(255, 255, 255)
                UserIdentity.TextSize = 10.000
                UserIdentity.TextWrapped = true
                UserIdentity.TextXAlignment = Enum.TextXAlignment.Left
                
                UIPadding.Parent = ScriptFolder
                UIPadding.PaddingTop = UDim.new(0, 1)
            
                TopBar.Name = "TopBar"
                TopBar.Parent = Container
                TopBar.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                TopBar.BackgroundTransparency = 1
                TopBar.BorderSizePixel = 0
                TopBar.ClipsDescendants = true
                TopBar.Position = UDim2.new(0, 0, 0, -10)
                TopBar.Size = UDim2.new(1, 0, 0, 50)
                
                UIListLayout.Parent = TopBar
                UIListLayout.FillDirection = Enum.FillDirection.Horizontal
                UIListLayout.SortOrder = Enum.SortOrder.LayoutOrder
                UIListLayout.Padding = UDim.new(0, 5)
                
                Script.Name = "Script"
                Script.Parent = TopBar
                Script.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Script.BackgroundTransparency = 1
                Script.BorderSizePixel = 0
                Script.Size = UDim2.new(-0.00669243885, 100, 1, 0)
                
                Frame.Parent = Script
                Frame.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                Frame.BorderSizePixel = 0
                Frame.Position = UDim2.new(0, 0, 0.25, 0)
                Frame.Size = UDim2.new(1, 0, 0.5, 0)
                
                UICorner.Parent = Frame
                
                ScriptNameBox.Parent = Frame
                ScriptNameBox.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                ScriptNameBox.BackgroundTransparency = 1
                ScriptNameBox.BorderSizePixel = 0
                ScriptNameBox.Size = UDim2.new(1, 0, 1, 0)
                ScriptNameBox.Font = Enum.Font.Gotham
                ScriptNameBox.Text = "Script 1"
                ScriptNameBox.TextColor3 = Color3.fromRGB(255, 255, 255)
                ScriptNameBox.TextSize = 12
                ScriptNameBox.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                ScriptNameBox.TextTruncate = Enum.TextTruncate.AtEnd
                ScriptNameBox.TextWrapped = true;
            
                NewTab.Name = "NewTab"
                NewTab.Parent = TopBar
                NewTab.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                NewTab.BackgroundTransparency = 1
                NewTab.BorderSizePixel = 0
                NewTab.Position = UDim2.new(0.0638823658, 0, 0, 0)
                NewTab.Size = UDim2.new(0, 25, 1, 0)
                
                Frame_2.Parent = NewTab
                Frame_2.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
                Frame_2.BorderSizePixel = 0
                Frame_2.Position = UDim2.new(0, 0, 0.25, 0)
                Frame_2.Size = UDim2.new(1, 0, 0.5, 0)
                
                UICorner_2.Parent = Frame_2
                
                TextButton_2.Parent = Frame_2
                TextButton_2.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton_2.BackgroundTransparency = 1
                TextButton_2.BorderSizePixel = 0
                TextButton_2.Size = UDim2.new(1, 0, 1, 0)
                TextButton_2.Font = Enum.Font.GothamBold
                TextButton_2.Text = "+"
                TextButton_2.TextColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_2.TextScaled = true
                TextButton_2.TextSize = 12
                TextButton_2.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_2.TextWrapped = true
                
                local Delete = Instance.new("Frame")
                local DeleteFrame = Instance.new("Frame")
                local DeleteUICorner = Instance.new("UICorner")
                local DeleteTextButton = Instance.new("TextButton")
                        
                Delete.Name = "Delete"
                Delete.Parent = TopBar
                Delete.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Delete.BackgroundTransparency = 1.000
                Delete.BorderSizePixel = 0
                Delete.Position = UDim2.new(0.0638823658, 0, 0, 0)
                Delete.Size = UDim2.new(0, 25, 1, 0)
                Delete.Visible = false;
                
                DeleteFrame.Parent = Delete
                DeleteFrame.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
                DeleteFrame.BorderSizePixel = 0
                DeleteFrame.Position = UDim2.new(0, 0, 0.25, 0)
                DeleteFrame.Size = UDim2.new(1, 0, 0.5, 0)
                
                DeleteUICorner.Parent = DeleteFrame
                
                DeleteTextButton.Parent = DeleteFrame
                DeleteTextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                DeleteTextButton.BackgroundTransparency = 1.000
                DeleteTextButton.BorderSizePixel = 0
                DeleteTextButton.Size = UDim2.new(1, 0, 1, 0)
                DeleteTextButton.Font = Enum.Font.GothamBold
                DeleteTextButton.Text = "-"
                DeleteTextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                DeleteTextButton.TextScaled = true
                DeleteTextButton.TextSize = 12.000
                DeleteTextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                DeleteTextButton.TextWrapped = true

                BackTab.Name = "BackTab"
                BackTab.Parent = TopBar
                BackTab.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                BackTab.BackgroundTransparency = 1
                BackTab.BorderSizePixel = 0
                BackTab.Position = UDim2.new(0.0638823658, 0, 0, 0)
                BackTab.Size = UDim2.new(0, 30, 1, 0)
                
                Frame_3.Parent = BackTab
                Frame_3.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
                Frame_3.BorderSizePixel = 0
                Frame_3.Position = UDim2.new(0, 0, 0.25, 0)
                Frame_3.Size = UDim2.new(1, 0, 0.5, 0)
                Frame_3.Visible = false;
            
                UICorner_3.Parent = Frame_3
                
                TextButton_3.Parent = Frame_3
                TextButton_3.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton_3.BackgroundTransparency = 1
                TextButton_3.BorderSizePixel = 0
                TextButton_3.Size = UDim2.new(1, 0, 1, 0)
                TextButton_3.Font = Enum.Font.GothamBold
                TextButton_3.Text = "<"
                TextButton_3.TextColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_3.TextScaled = true
                TextButton_3.TextSize = 12
                TextButton_3.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_3.TextWrapped = true
                
                NextTab.Name = "NextTab"
                NextTab.Parent = TopBar
                NextTab.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                NextTab.BackgroundTransparency = 1
                NextTab.BorderSizePixel = 0
                NextTab.Position = UDim2.new(0.0638823658, 0, 0, 0)
                NextTab.Size = UDim2.new(0, 30, 1, 0)
                
                Frame_4.Parent = NextTab
                Frame_4.BackgroundColor3 = Color3.fromRGB(45, 47, 51)
                Frame_4.BorderSizePixel = 0
                Frame_4.Position = UDim2.new(0, 0, 0.25, 0)
                Frame_4.Size = UDim2.new(1, 0, 0.5, 0)
                Frame_4.Visible = false;
            
                UICorner_4.Parent = Frame_4
                
                TextButton_4.Parent = Frame_4
                TextButton_4.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton_4.BackgroundTransparency = 1
                TextButton_4.BorderSizePixel = 0
                TextButton_4.Size = UDim2.new(1, 0, 1, 0)
                TextButton_4.Font = Enum.Font.GothamBold
                TextButton_4.Text = ">"
                TextButton_4.TextColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_4.TextScaled = true
                TextButton_4.TextSize = 12
                TextButton_4.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                TextButton_4.TextWrapped = true
            
                TextBox.Parent = Container
                TextBox.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                TextBox.BackgroundTransparency = 1
                TextBox.BorderColor3 = Color3.fromRGB(0, 0, 0)
                TextBox.BorderSizePixel = 0
                TextBox.Position = UDim2.new(0, 0, 0, 50)
                TextBox.Size = UDim2.new(0.75, 0, 1, -50)
                TextBox.Font = Enum.Font.Gotham
                TextBox.MultiLine = true
                TextBox.PlaceholderText = "print(\"Hello World!\")"
                TextBox.Text = ""
                TextBox.TextColor3 = Color3.fromRGB(216, 216, 216)
                TextBox.TextSize = 14
                TextBox.TextWrapped = true
                TextBox.TextXAlignment = Enum.TextXAlignment.Left
                TextBox.TextYAlignment = Enum.TextYAlignment.Top
                TextBox.TextTruncate = Enum.TextTruncate.AtEnd
                TextBox.ClearTextOnFocus = false;

                local CurrentIndex = 1;
                
                local MaxIndex = 1;
                local TabItems = {}

                TabItems[CurrentIndex] = {
                    Text = "",
                    TabName = "Script 1"   
                };
            
                local success, _ = pcall(function()
                    if SaveTabs == true then
                        if isfile(savepath(".flux_tabs")) then
                            local data = HttpService:JSONDecode(readfile(savepath(".flux_tabs")));
                            
                            MaxIndex = #data;
            
                            if MaxIndex > 0 then
                                for i,v in pairs(data) do
                                    TabItems[CurrentIndex] = {
                                        Text = v.Text,
                                        TabName = v.TabName;   
                                    };
            
                                    CurrentIndex = CurrentIndex + 1;
                                end
                            end
                        end
                    else      
                        TabItems[CurrentIndex] = {
                            Text = "",
                            TabName = "Script 1"   
                        };
                    end
                end)

                if success == false then
                    CurrentIndex = 1;
                    MaxIndex = 1;
                    TabItems = {}
                
                    TabItems[CurrentIndex] = {
                        Text = "",
                        TabName = "Script 1"   
                    };
                end

                if CurrentIndex > 1 then
                    Frame_3.Visible = true;
                    Frame_4.Visible = true;
                    Delete.Visible = true;

                    local FirstTabInfo = TabItems[1];

                    TextBox.Text = FirstTabInfo.Text;
                    ScriptNameBox.Text = FirstTabInfo.TabName;

                    CurrentIndex = 1;
                end
            
                local old_text = #TextBox.Text;

                local function add_item(parent, title, script)
                    local ClearScript = Instance.new("Frame")
                    local UICorner = Instance.new("UICorner")
                    local TextButton = Instance.new("TextButton")
                
                    ClearScript.Name = "ClearScript"
                    ClearScript.Parent = parent
                    ClearScript.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                    ClearScript.BorderSizePixel = 0
                    ClearScript.Size = UDim2.new(0.8, 0, 0, 17)
            
                    UICorner.Parent = ClearScript
                        
                    TextButton.Parent = ClearScript
                    TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                    TextButton.BackgroundTransparency = 1.000
                    TextButton.BorderSizePixel = 0
                    TextButton.Size = UDim2.new(1, 0, 1, 0)
                    TextButton.Font = Enum.Font.Gotham
                    TextButton.TextTruncate = Enum.TextTruncate.AtEnd
                    TextButton.Text = title
                    TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                    TextButton.TextSize = 12
                    TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
            
                    TextButton.MouseButton1Down:connect(function()
                        if CurrentIndex == 1 then
                            Frame_3.Visible = true;
                            Frame_4.Visible = true;
                            Delete.Visible = true;
                        end
            
                        MaxIndex = MaxIndex + 1;
            
                        CurrentIndex = MaxIndex;
            
                        TabItems[CurrentIndex] = {
                            Text = script,
                            TabName = title
                        };
            
                        TextBox.Text = script;
                        ScriptNameBox.Text = title

                        old_text = #TextBox.Text
                    end)
                end
                
                if type(script_list) == "table" then
                    for i,v in pairs(script_list) do
                        add_item(ScriptFolder, i, v)
                    end
                end
                
                if #ScriptFolder:GetChildren() == 3 then
                    ScriptFrameContainer.Visible = false;
                end
                
                ScriptNameBox:GetPropertyChangedSignal("Text"):Connect(function()
                    ScriptNameBox.TextScaled = not ScriptNameBox.TextFits;
                end)

                TextBox.FocusLost:connect(function()
                    save_tabs(TabItems);
                end)
            
                ScriptNameBox.FocusLost:Connect(function()
                    if TabItems[CurrentIndex].TabName then
                        TabItems[CurrentIndex].TabName = ScriptNameBox.Text;

                        save_tabs(TabItems);
                    end
                end)
            
                TextButton_2.MouseButton1Down:connect(function() -- Create new tab
                    if CurrentIndex == 1 then
                        Frame_3.Visible = true;
                        Frame_4.Visible = true;
                        Delete.Visible = true;
                    end
            
                    MaxIndex = MaxIndex + 1;
            
                    CurrentIndex = MaxIndex;
            
                    TabItems[CurrentIndex] = {
                        Text = "",
                        TabName = "Script "..tostring(CurrentIndex) 
                    };
            
                    TextBox.Text = "";
                    ScriptNameBox.Text = "Script "..tostring(CurrentIndex);

                    old_text = #TextBox.Text
                end)
            
                DeleteTextButton.MouseButton1Down:connect(function() -- Delete Tab
                    if CurrentIndex == 1 then
                        return;
                    end

                    TabItems[CurrentIndex] = false; -- Skip

                    local OldIndex = CurrentIndex;

                    CurrentIndex = CurrentIndex - 1;

                    while TabItems[CurrentIndex] == false do
                        if CurrentIndex == 1 then
                            
                            CurrentIndex = OldIndex;

                            return;
                        end
                        
                        CurrentIndex = CurrentIndex - 1;
                    end

                    local Info = TabItems[CurrentIndex];
            
                    TextBox.Text = Info.Text;
                    ScriptNameBox.Text = Info.TabName;

                    old_text = #TextBox.Text

                    save_tabs(TabItems);
                end)

                TextButton_3.MouseButton1Down:connect(function() -- Previous Tab
                    if CurrentIndex == 1 then
                        return;
                    end
            
                    local OldIndex = CurrentIndex;

                    CurrentIndex = CurrentIndex - 1;

                    while TabItems[CurrentIndex] == false do
                        if CurrentIndex == 1 then
                            
                            CurrentIndex = OldIndex;

                            return;
                        end
                        
                        CurrentIndex = CurrentIndex - 1;
                    end

                    local Info = TabItems[CurrentIndex];
            
                    TextBox.Text = Info.Text;
                    ScriptNameBox.Text = Info.TabName;

                    old_text = #TextBox.Text
                end)
            
                TextButton_4.MouseButton1Down:connect(function() -- Next Tab
                    if CurrentIndex == MaxIndex then
                        return;
                    end
            
                    local OldIndex = CurrentIndex;

                    CurrentIndex = CurrentIndex + 1;

                    while TabItems[CurrentIndex] == false do
                        if CurrentIndex == MaxIndex then

                            CurrentIndex = OldIndex;

                            return;
                        end

                        CurrentIndex = CurrentIndex + 1;
                    end

                    local Info = TabItems[CurrentIndex];

                    TextBox.Text = Info.Text;
                    ScriptNameBox.Text = Info.TabName;

                    old_text = #TextBox.Text
                end)
            
                -- Script Editor
            
                TextBox.FocusLost:connect(function()
                    if TabItems[CurrentIndex].Text then
                        TabItems[CurrentIndex].Text = TextBox.Text;
                    end
                end)
            
                main_executor_container:create_backbutton().MouseButton1Down:connect(back_tab)
                main_executor_container:create_padding();
            
                main_executor_container:create_label("Script Editor");
            
                main_executor_container:create_button("Execute", function()
                    --add_item(ScriptHistory__, TextBox.Text, TextBox.Text)
            
                    loadcode("editor", TabItems[CurrentIndex].Text)
                end, { Purple = true })
            
                main_executor_container:create_button("Clear Editor", function()
                    TextBox.Text = ""
                    old_text = #TextBox.Text

                    save_tabs(TabItems);
                end, { Purple = false })
            
                -- Clipboard
            
                main_executor_container:create_label("Clipboard");
            
                main_executor_container:create_button("Run", function()
                    loadcode("clipboard", read_clipboard(true))
                end, { Purple = true })
            
                main_executor_container:create_button("Load into Editor", function()
                    TextBox.Text = read_clipboard(true);
                    old_text = #TextBox.Text

                    save_tabs(TabItems);
                end, { Purple = false })
                
                main_executor_container:create_label("Extra");
                
                main_executor_container:create_button("Save Script", function()
                    if ScriptFrameContainer.Visible == false then
                        ScriptFrameContainer.Visible = true;
                    end
                    
                    local title = ScriptNameBox.Text:gsub("%.[^%.]+$", "")..".luau";
                    local scriptContent = TabItems[CurrentIndex].Text

                    pcall(script_manager, true, title, scriptContent)
                    if type(writefile) == "function" then
                        pcall(writefile, SCRIPT_FOLDER_PATH.."/"..title, scriptContent)
                    end
                    add_item(ScriptFolder, title, scriptContent)
                end, { Purple = true })
                
                main_executor_container:create_button("Add to Autoexec", function()
                    script_manager(false, ScriptNameBox.Text..".txt", TabItems[CurrentIndex].Text);
                end, { Purple = true })
            end
            
            do -- Insert Cloud Scripts Stuff
                main_cloud_container:create_backbutton().MouseButton1Down:connect(back_tab)
                main_cloud_container:create_padding();
            
                local Search = Instance.new("Frame")
                local UICorner = Instance.new("UICorner")
                local TextBox = Instance.new("TextBox")
                local Logo = Instance.new("ImageLabel")
                local ClearHistory = Instance.new("Frame")
                local UICorner_2 = Instance.new("UICorner")
                local TextButton = Instance.new("TextButton")
                local Padding = Instance.new("Frame")
            
                Search.Name = "Search"
                Search.Parent = main_cloud_container.Selector
                Search.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                Search.BorderSizePixel = 0
                Search.Size = UDim2.new(0.9, 0, 0, 25)
            
                UICorner.Parent = Search
            
                TextBox.Parent = Search
                TextBox.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                TextBox.BackgroundTransparency = 1
                TextBox.BorderColor3 = Color3.fromRGB(0, 0, 0)
                TextBox.BorderSizePixel = 0
                TextBox.Position = UDim2.new(0.131, 0, 0.16, 0)
                TextBox.Size = UDim2.new(0.869, 0, 0.72, 0)
                TextBox.Font = Enum.Font.Gotham
                TextBox.MultiLine = false
                TextBox.PlaceholderText = "Search Scripts"
                TextBox.Text = ""
                TextBox.TextColor3 = Color3.fromRGB(216, 216, 216)
                TextBox.TextSize = 14
                TextBox.TextWrapped = true
                TextBox.TextXAlignment = Enum.TextXAlignment.Left
                TextBox.TextYAlignment = Enum.TextYAlignment.Top
            
                Logo.Name = "Logo"
                Logo.Parent = Search
                Logo.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Logo.BackgroundTransparency = 1
                Logo.BorderSizePixel = 0
                Logo.Position = UDim2.new(0.036, 0, -0.173, 10)
                Logo.Size = UDim2.new(0.065, 0, 0.5, 0)
                Logo.Image = "rbxassetid://138900967749432"
                Logo.ScaleType = Enum.ScaleType.Fit
            
                ClearHistory.Name = "ClearHistory"
                ClearHistory.Parent = main_cloud_container.Selector
                ClearHistory.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                ClearHistory.BorderSizePixel = 0
                ClearHistory.Size = UDim2.new(0.9, 0, 0, 25)
            
                UICorner_2.Parent = ClearHistory
            
                TextButton.Parent = ClearHistory
                TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton.BackgroundTransparency = 1
                TextButton.BorderSizePixel = 0
                TextButton.Size = UDim2.new(1, 0, 1, 0)
                TextButton.Font = Enum.Font.GothamBold
                TextButton.Text = "Clear History"
                TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                TextButton.TextSize = 12
                TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
            
                Padding.Name = "Padding"
                Padding.Parent = main_cloud_container.Selector
                Padding.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                Padding.BorderSizePixel = 0
                Padding.Size = UDim2.new(0.9, 0, 0, 1)
            
                local Container = main_cloud_container.Container;
                local ScrollingFrame = Instance.new("ScrollingFrame")
                local Clipboard = Instance.new("TextLabel")
                local UIListLayout = Instance.new("UIListLayout")
                local Padding__ = Instance.new("Frame")
            
                ScrollingFrame.Parent = Container
                ScrollingFrame.Active = true
                ScrollingFrame.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                ScrollingFrame.BackgroundTransparency = 1.000
                ScrollingFrame.BorderColor3 = Color3.fromRGB(0, 0, 0)
                ScrollingFrame.BorderSizePixel = 0
                ScrollingFrame.Size = UDim2.new(1, 0, 1, 0)
                ScrollingFrame.CanvasSize = UDim2.new(0, 0, 5, 0)
                ScrollingFrame.ScrollBarThickness = 5
                ScrollingFrame.ElasticBehavior = Enum.ElasticBehavior.Never
                ScrollingFrame.ScrollingDirection = Enum.ScrollingDirection.Y

                Clipboard.Name = "Clipboard"
                Clipboard.Parent = ScrollingFrame
                Clipboard.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Clipboard.BackgroundTransparency = 1.000
                Clipboard.BorderColor3 = Color3.fromRGB(0, 0, 0)
                Clipboard.BorderSizePixel = 0
                Clipboard.Position = UDim2.new(3.7057486e-08, 0, 0, 0)
                Clipboard.Size = UDim2.new(0.99000001, 0, 0, 25)
                Clipboard.Font = Enum.Font.Gotham
                Clipboard.Text = ""
                Clipboard.RichText = true;
                Clipboard.TextColor3 = Color3.fromRGB(255, 255, 255)
                Clipboard.TextScaled = true
                Clipboard.TextSize = 14.000
                Clipboard.TextWrapped = true
                
                UIListLayout.Parent = ScrollingFrame
                UIListLayout.Padding = UDim.new(0, 5)
            
                ScrollingFrame.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
            
                UIListLayout:GetPropertyChangedSignal("AbsoluteContentSize"):Connect(function()
                    ScrollingFrame.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
                end)
                
                Padding__.Name = "Padding"
                Padding__.Parent = ScrollingFrame
                Padding__.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                Padding__.BackgroundTransparency = 1.000
                Padding__.BorderColor3 = Color3.fromRGB(0, 0, 0)
                Padding__.BorderSizePixel = 0
                Padding__.Position = UDim2.new(0.355789751, 0, 0.026041666, 0)
                Padding__.Size = UDim2.new(0, 0, 0, 10)
            
                local scripts = {}
            
                local function add_script(title, author, description, script, gameurl)
                    local ScriptContainer = Instance.new("Frame")
                    local ImageLabel = Instance.new("ImageLabel")
                    local UICorner = Instance.new("UICorner")
                    local UICorner_2 = Instance.new("UICorner")
                    local Frame = Instance.new("Frame")
                    local UICorner_3 = Instance.new("UICorner")
                    local Title = Instance.new("TextLabel")
                    local Author = Instance.new("TextLabel")
                    local Execute = Instance.new("Frame")
                    local UICorner_4 = Instance.new("UICorner")
                    local TextButton = Instance.new("TextButton")
                    local CopyScript = Instance.new("Frame")
                    local UICorner_5 = Instance.new("UICorner")
                    local TextButton_2 = Instance.new("TextButton")
                    local Desc = Instance.new("TextLabel")            

                    ScriptContainer.Name = "ScriptContainer"
                    ScriptContainer.Parent = ScrollingFrame
                    ScriptContainer.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                    ScriptContainer.BackgroundTransparency = 0.500
                    ScriptContainer.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    ScriptContainer.BorderSizePixel = 0
                    ScriptContainer.Size = UDim2.new(0.99, 0, 0, 200)

                    table.insert(scripts, ScriptContainer);

                    local success, _ = pcall(function()
                        if gameurl == nil or gameurl["name"] == "Universal Script Ã°Å¸â€œÅ’" then
                            universe_id = game.GameId;
                        else
                            local x = game:HttpGet("https://apis.roblox.com/universes/v1/places/"..gameurl["gameId"].."/universe")
                                
                            universe_id = HttpService:JSONDecode(x)["universeId"];
                        end
                    end)

                    if success == false then
                        universe_id = game.GameId;
                    end

                    ImageLabel.Parent = ScriptContainer
                    ImageLabel.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                    ImageLabel.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    ImageLabel.BorderSizePixel = 0
                    ImageLabel.Size = UDim2.new(1, 0, 1, 0)
                    ImageLabel.Image = "rbxthumb://type=GameIcon&id="..tostring(universe_id).."&w=512&h=512"
                    ImageLabel.ScaleType = Enum.ScaleType.Tile
                    
                    UICorner.Parent = ImageLabel
                    
                    UICorner_2.Parent = ScriptContainer
                    
                    Frame.Parent = ScriptContainer
                    Frame.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                    Frame.BackgroundTransparency = 0.300
                    Frame.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Frame.BorderSizePixel = 0
                    Frame.Size = UDim2.new(1, 0, 1, 0)
                    
                    UICorner_3.Parent = Frame
                    
                    Title.Name = "Title"
                    Title.Parent = Frame
                    Title.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                    Title.BackgroundTransparency = 1.000
                    Title.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Title.BorderSizePixel = 0
                    Title.Position = UDim2.new(0.0109999413, 0, 0.036896646, 0)
                    Title.Size = UDim2.new(0.5, 0, 0, 25)
                    Title.Font = Enum.Font.GothamMedium
                    Title.Text = title
                    Title.TextColor3 = Color3.fromRGB(255, 255, 255)
                    Title.TextScaled = true
                    Title.TextSize = 14.000
                    Title.TextWrapped = true
                    Title.TextXAlignment = Enum.TextXAlignment.Left
                    
                    Author.Name = "Author"
                    Author.Parent = Frame
                    Author.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                    Author.BackgroundTransparency = 1.000
                    Author.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Author.BorderSizePixel = 0
                    Author.Position = UDim2.new(0.011712254, 0, -0.0285714287, 40)
                    Author.Size = UDim2.new(0.978287756, 0, -0.05714285, 25)
                    Author.Font = Enum.Font.Gotham
                    Author.Text = "By "..author
                    Author.TextColor3 = Color3.fromRGB(255, 255, 255)
                    Author.TextSize = 14.000
                    Author.TextXAlignment = Enum.TextXAlignment.Left

                    Desc.Name = "Desc"
                    Desc.Parent = Frame
                    Desc.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                    Desc.BackgroundTransparency = 1.000
                    Desc.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Desc.BorderSizePixel = 0
                    Desc.Position = UDim2.new(0.011712254, 0, -0.0289999992, 65)
                    Desc.Size = UDim2.new(0.978287756, 0, 1, -120)
                    Desc.Font = Enum.Font.Roboto
                    Desc.Text = description
                    Desc.TextColor3 = Color3.fromRGB(255, 255, 255)
                    Desc.TextSize = 14.000
                    Desc.TextScaled = true;
                    Desc.TextXAlignment = Enum.TextXAlignment.Left
                    Desc.TextYAlignment = Enum.TextYAlignment.Top
                    
                    Execute.Name = "Execute"
                    Execute.Parent = Frame
                    Execute.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                    Execute.BorderSizePixel = 0
                    Execute.Position = UDim2.new(0.0109999999, 0, 1, -35)
                    Execute.Size = UDim2.new(0, 100, 0, 25)
                    
                    UICorner_4.Parent = Execute
                    
                    TextButton.Parent = Execute
                    TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                    TextButton.BackgroundTransparency = 1.000
                    TextButton.BorderSizePixel = 0
                    TextButton.Size = UDim2.new(1, 0, 1, 0)
                    TextButton.Font = Enum.Font.GothamBold
                    TextButton.Text = "Execute"
                    TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
                    TextButton.TextSize = 12.000
                    TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
                    TextButton.MouseButton1Down:connect(function()
                        loadcode("script", script);
                    end)

                    CopyScript.Name = "CopyScript"
                    CopyScript.Parent = Frame
                    CopyScript.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                    CopyScript.BorderSizePixel = 0
                    CopyScript.Position = UDim2.new(0.0109999999, 110, 1, -35)
                    CopyScript.Size = UDim2.new(0, 100, 0, 25)
                    
                    UICorner_5.Parent = CopyScript
                    
                    TextButton_2.Parent = CopyScript
                    TextButton_2.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                    TextButton_2.BackgroundTransparency = 1.000
                    TextButton_2.BorderSizePixel = 0
                    TextButton_2.Size = UDim2.new(1, 0, 1, 0)
                    TextButton_2.Font = Enum.Font.GothamBold
                    TextButton_2.Text = "Copy Script"
                    TextButton_2.TextColor3 = Color3.fromRGB(255, 255, 255)
                    TextButton_2.TextSize = 12.000
                    TextButton_2.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
        
                    TextButton_2.MouseButton1Down:connect(function()
                        setclipboard(script);
                    end)
                end
            
                local cache = {}
                local HttpService = game:GetService("HttpService")

                local function query_scriptblox(search)
                    if cache[search] then
                        for i,v in ipairs(cache[search]) do
                            add_script(v.title,v.author,v.desc,v.script)
                        end
                    else
                        cache[search] = {}
                        local url = "https://scriptblox.com/api/script/search?q="..HttpService:UrlEncode(search).."&mode=free"
                        local success, res = pcall(function()
                            return game:HttpGet(url)
                        end)
                        
                        if not success or not res or res == "" then
                            return
                        end
                        
                        local decodeSuccess, data = pcall(function()
                            return HttpService:JSONDecode(res)
                        end)
                        
                        if not decodeSuccess or not data or not data.result or not data.result.scripts then
                            return
                        end
                        
                        for i, v in pairs(data.result.scripts) do
                            if v.isPatched then continue end
                            
                            local id = v._id
                            local infoUrl = "https://scriptblox.com/api/script/"..id
                            local infoSuccess, infoRes = pcall(function()
                                return game:HttpGet(infoUrl)
                            end)
                            
                            if infoSuccess and infoRes and infoRes ~= "" then
                                local infoDecodeSuccess, infoData = pcall(function()
                                    return HttpService:JSONDecode(infoRes)
                                end)
                                
                                if infoDecodeSuccess and infoData and infoData.script then
                                    local info = infoData.script
                                    local title = info.title
                                    local desc = info.features
                                    local author = info.owner and info.owner.username or "Unknown"
                                    local script = info.script
                                    
                                    table.insert(cache[search], {
                                        title=title,
                                        desc=desc,
                                        author=author,
                                        script=script
                                    })
                                    
                                    add_script(title, author, desc, script, info.game)
                                end
                            end
                            task.wait(0.2)
                        end
                    end
                end
            
                local function history_click(frame)
                    for i,v in pairs(scripts) do
                        v:Remove();
                        scripts[i] = nil;
                    end
            
                    Clipboard.Text = "Matching<font family=\"rbxasset://fonts/families/GothamSSm.json\" style=\"Normal\" weight=\"700\" > "..frame.TextButton.Text.."</font>"
            
                    query_scriptblox(frame.TextButton.Text);
                end
            
                local History1 = main_cloud_container:create_button("", history_click, { Purple = false })
                local History2 = main_cloud_container:create_button("", history_click, { Purple = false })
                local History3 = main_cloud_container:create_button("", history_click, { Purple = false })
            
                History1.Visible = false;
                History2.Visible = false;
                History3.Visible = false;
            
                TextButton.MouseButton1Down:connect(function()
                    History1.Visible = false;
                    History2.Visible = false;
                    History3.Visible = false;
                end)
            
                TextBox.FocusLost:connect(function()
                    if TextBox.Text == "" then
                        return;
                    end 
            
                    if History1.Visible == false then
                        History1.TextButton.Text = TextBox.Text;
                        History1.Visible = true;
                    elseif History2.Visible == false then
                        History2.TextButton.Text = TextBox.Text;
                        History2.Visible = true;
                    elseif History3.Visible == false then
                        History3.TextButton.Text = TextBox.Text;
                        History3.Visible = true;
                    else
                        local FirstText = History1.TextButton.Text;
                        local SecondText = History2.TextButton.Text;
            
                        History1.TextButton.Text = TextBox.Text;
                        History2.TextButton.Text = FirstText;
                        History3.TextButton.Text = SecondText;
                    end
            
                    for i,v in pairs(scripts) do
                        v:Remove();
                        scripts[i] = nil;
                    end
            
                    Clipboard.Text = "Matching<font family=\"rbxasset://fonts/families/GothamSSm.json\" style=\"Normal\" weight=\"700\" > "..TextBox.Text.."</font>"
            
                    query_scriptblox(TextBox.Text);
                end)
            end
            
            do -- Console Tab
                local Container = main_console_container.Container;
            
                local ScrollingFrame = Instance.new("ScrollingFrame")
                local UIListLayout = Instance.new("UIListLayout")
                local Padding = Instance.new("Frame")
            
                ScrollingFrame.Parent = Container
                ScrollingFrame.Active = true
                ScrollingFrame.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                ScrollingFrame.BackgroundTransparency = 1.000
                ScrollingFrame.BorderColor3 = Color3.fromRGB(0, 0, 0)
                ScrollingFrame.BorderSizePixel = 0
                ScrollingFrame.Size = UDim2.new(1, 0, 1, 0)
                ScrollingFrame.CanvasSize = UDim2.new(0, 0, 0, 0)
                ScrollingFrame.ScrollBarThickness = 5
            
                UIListLayout.Parent = ScrollingFrame
                UIListLayout.SortOrder = Enum.SortOrder.LayoutOrder
                UIListLayout.Padding = UDim.new(0, 5)
            
                ScrollingFrame.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
            
                UIListLayout:GetPropertyChangedSignal("AbsoluteContentSize"):Connect(function()
                    ScrollingFrame.CanvasSize = UDim2.new(0, 0, 0, UIListLayout.AbsoluteContentSize.Y)
                    ScrollingFrame.CanvasPosition = Vector2.new(0,UIListLayout.AbsoluteContentSize.Y)
                end)
            
                Padding.Name = "Padding"
                Padding.Parent = ScrollingFrame
                Padding.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
                Padding.BackgroundTransparency = 1.000
                Padding.BorderColor3 = Color3.fromRGB(0, 0, 0)
                Padding.BorderSizePixel = 0
                Padding.Position = UDim2.new(0.355789751, 0, 0.026041666, 0)
                Padding.Size = UDim2.new(0, 0, 0, 10)
            
                local Output = "OUTPUT";
                local Success = "SUCCESS";
                local Error = "ERROR";
                local Warning = "WARN";
            
                function console_log(Type, Text, Visible)
                    local Label = Instance.new("TextLabel")
            
                    local Color = if Type == "SUCCESS" then "#67C554" elseif Type == "ERROR" then "#E03232" elseif Type == "WARN" then "#FEEE79" else "#BFBFBF" 
            
                    Label.Name = Type
                    Label.Parent = ScrollingFrame
                    Label.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                    Label.BackgroundTransparency = 1.000
                    Label.BorderColor3 = Color3.fromRGB(0, 0, 0)
                    Label.BorderSizePixel = 0
                    Label.Position = UDim2.new(0.002, 0, 0, 0)
                    Label.Font = Enum.Font.Gotham
                    Label.AutoLocalize = false;
                    Label.Text = "[10:43] <font family=\"rbxasset://fonts/families/GothamSSm.json\" color=\""..Color.."\" style=\"Normal\" weight=\"500\" >["..Type.."] </font> "..Text
                    Label.TextColor3 = Color3.fromRGB(255, 255, 255)
                    Label.TextSize = 14.000
                    Label.TextWrapped = true
                    Label.TextXAlignment = Enum.TextXAlignment.Left
                    Label.RichText = true;
                    Label.Visible = Visible
            
                    local count  = select(2, Text:gsub('\n', '\n'))
            
                    if count > 1 then
                        Label.Size = UDim2.new(0.99, 0, 0, (25 * (count - 1)) + 25)
                    else
                        Label.Size = UDim2.new(0.99, 0, 0, 25)
                    end
                end
                
                getgenv().flux_console_log = console_log;
            
                main_console_container:create_backbutton().MouseButton1Down:connect(back_tab)
                main_console_container:create_padding();

                local Search = Instance.new("Frame")
                local UICorner = Instance.new("UICorner")
                local TextBox = Instance.new("TextBox")
                local Logo = Instance.new("ImageLabel")

                Search.Name = "Search"
                Search.Parent = main_console_container.Selector
                Search.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
                Search.BorderSizePixel = 0
                Search.Size = UDim2.new(0.9, 0, 0, 25)
            
                UICorner.Parent = Search
            
                TextBox.Parent = Search
                TextBox.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
                TextBox.BackgroundTransparency = 1
                TextBox.BorderColor3 = Color3.fromRGB(0, 0, 0)
                TextBox.BorderSizePixel = 0
                TextBox.Position = UDim2.new(0.131, 0, 0.16, 0)
                TextBox.Size = UDim2.new(0.869, 0, 0.72, 0)
                TextBox.Font = Enum.Font.Gotham
                TextBox.MultiLine = false
                TextBox.PlaceholderText = "Search Console"
                TextBox.Text = ""
                TextBox.TextTruncate = Enum.TextTruncate.AtEnd
                TextBox.ClearTextOnFocus = false;
                TextBox.TextColor3 = Color3.fromRGB(216, 216, 216)
                TextBox.TextSize = 14
                TextBox.TextWrapped = true
                TextBox.TextXAlignment = Enum.TextXAlignment.Left
                TextBox.TextYAlignment = Enum.TextYAlignment.Top
            
                Logo.Name = "Logo"
                Logo.Parent = Search
                Logo.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Logo.BackgroundTransparency = 1
                Logo.BorderSizePixel = 0
                Logo.Position = UDim2.new(0.036, 0, -0.173, 10)
                Logo.Size = UDim2.new(0.065, 0, 0.5, 0)
                Logo.Image = "rbxassetid://138900967749432"
                Logo.ScaleType = Enum.ScaleType.Fit
            
                main_console_container:create_label("Console Settings");
            
                main_console_container:create_button("Copy", function()
                    local Text = "";
            
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            Text = Text..v.Text.."\n";
                        end
                    end
            
                    setclipboard(Text);
                end, { Purple = true })
            
                main_console_container:create_button("Clear", function()
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            v:Remove()
                        end
                    end
                end, { Purple = false })
            
                main_console_container:create_label("Filters");
            
                main_console_container:create_toggle("Output", function(state)
                    ConsoleOutput = state;
                    
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            if v.Name == "OUTPUT" then
                                v.Visible = state
                            end
                        end
                    end
            
                    pcall(save_settings);
                end, { Enabled = ConsoleOutput, Call = true })
            
                main_console_container:create_toggle("Warning", function(state)
                    ConsoleWarning = state;
            
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            if v.Name == "WARN" then
                                v.Visible = state
                            end
                        end
                    end
            
                    pcall(save_settings);
                end, { Enabled = ConsoleWarning, Call = true })
            
                main_console_container:create_toggle("Error", function(state)
                    ConsoleError = state;
            
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            if v.Name == "ERROR" then
                                v.Visible = state
                            end
                        end
                    end
            
                    pcall(save_settings);
                end, { Enabled = ConsoleError, Call = true })
            
                console_log(Success, "Welcome to Fluxus X Android!", true);
        
                TextBox.FocusLost:connect(function()
                    for i,v in pairs(ScrollingFrame:GetChildren()) do
                        if v:IsA("TextLabel") then
                            if (v.Name == "OUTPUT" and ConsoleOutput == false) or (v.Name == "WARN" and ConsoleWarning == false) or (v.Name == "ERROR" and ConsoleError == false) then 
                                continue
                            end

                            local text_filter = v.Text:lower():match("</font> (.*)");

                            if text_filter:lower():find(TextBox.Text:lower()) then
                                v.Visible = true;
                            else
                                v.Visible = false;
                            end
                        end
                    end
                end)
            
                game:GetService("LogService").MessageOut:Connect(function(message, type)
                    if type == Enum.MessageType.MessageOutput then
                        console_log(Output, message, ConsoleOutput);
                    elseif type == Enum.MessageType.MessageWarning then
                        console_log(Warning, message, ConsoleWarning);
                    elseif type == Enum.MessageType.MessageError then
                        console_log(Error, message, ConsoleError);
                    end
                end)
            end
            
            do  
                main_settings_container:create_backbutton().MouseButton1Down:connect(back_tab)
                main_settings_container:create_padding();
            
                local UserIdentity = Instance.new("TextLabel")
                local Id = Instance.new("TextLabel")
                local GetHelp = Instance.new("Frame")
                local UICorner = Instance.new("UICorner")
                local TextButton = Instance.new("TextButton")
            
                UserIdentity.Name = "UserIdentity"
                UserIdentity.Parent = main_settings_container.Selector
                UserIdentity.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                UserIdentity.BackgroundTransparency = 1.000
                UserIdentity.BorderColor3 = Color3.fromRGB(0, 0, 0)
                UserIdentity.BorderSizePixel = 0
                UserIdentity.Position = UDim2.new(0.0500000268, 0, 0.145101666, 0)
                UserIdentity.Size = UDim2.new(0.899999976, 0, -0.0110905729, 25)
                UserIdentity.Font = Enum.Font.GothamBold
                UserIdentity.Text = "USER IDENTITY"
                UserIdentity.TextColor3 = Color3.fromRGB(255, 255, 255)
                UserIdentity.TextSize = 12.000
                UserIdentity.TextWrapped = true
                UserIdentity.TextXAlignment = Enum.TextXAlignment.Left
            
                Id.Name = "Id"
                Id.Parent = main_settings_container.Selector
                Id.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                Id.BackgroundTransparency = 1.000
                Id.BorderColor3 = Color3.fromRGB(0, 0, 0)
                Id.BorderSizePixel = 0
                Id.Position = UDim2.new(0.0500000268, 0, 0.145101666, 0)
                Id.Size = UDim2.new(0.899999976, 0, -0.0110905729, 25)
                Id.Font = Enum.Font.Gotham
                Id.Text = "HWID-"..gethwid()
                Id.TextColor3 = Color3.fromRGB(255, 255, 255)
                Id.TextSize = 12.000
                Id.TextWrapped = true
                Id.TextXAlignment = Enum.TextXAlignment.Left
            
                if Id.TextFits == false then
                    Id.TextScaled = true;
                end
            
                main_settings_container:create_padding(5)
            
                GetHelp.Name = "GetHelp"
                GetHelp.Parent = main_settings_container.Selector
                GetHelp.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
                GetHelp.BorderSizePixel = 0
                GetHelp.Size = UDim2.new(0.899999976, 0, 0, 25)
            
                UICorner.Parent = GetHelp
            
                TextButton.Parent = GetHelp
                TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
                TextButton.BackgroundTransparency = 1.000
                TextButton.BorderSizePixel = 0
                TextButton.Size = UDim2.new(1, 0, 1, 0)
                TextButton.Font = Enum.Font.GothamBold
                TextButton.Text = "Get Help"
                TextButton.TextColor3 = Color3.fromRGB(0, 0, 0)
                TextButton.TextSize = 12.000
                TextButton.TextStrokeColor3 = Color3.fromRGB(0, 170, 255)

                TextButton.MouseButton1Down:connect(function()
                    notify("Connect with our support system!", "To get help, join our support discord at https://discord.gg/NKgEmhMKYs!\n\nCreate a support ticket or contact one of our support representatives and they will help you as soon as possible!")
                end)
            
                main_settings_container:create_padding(5)
            
                main_settings_container:create_label("FluxusX")
            
                main_settings_container:create_toggle("Save Settings", function(state)
                    SaveSettings = state;
            
                    pcall(function()
                        if state == false then
                            local data = HttpService:JSONDecode(readfile(savepath(".flux_settings")))
                            data["SaveSettings"] = false;
                            writefile(savepath(".flux_settings"), HttpService:JSONEncode(data))
                        else
                            save_settings();
                        end
                    end)   
                end, { Enabled = SaveSettings })

                main_settings_container:create_toggle("Save Tabs", function(state)
                    SaveTabs = state;
                    
                    pcall(save_settings);
                end, { Enabled = SaveTabs })
                
                main_settings_container:create_toggle("Center Minimize", function(state)
                    CenterMinimize = state;
            
                    pcall(save_settings);
                end, { Enabled = CenterMinimize })
            
                main_settings_container:create_toggle("Fast Animations", function(state)
                    FastAnims = state;
            
                    pcall(save_settings);
                end, { Enabled = FastAnims })
            
                main_settings_container:create_toggle("No Animations", function(state)
                    NoAnims = state;
            
                    pcall(save_settings);
                end, { Enabled = NoAnims })
            
                main_settings_container:create_label("Game")
                main_settings_container:create_toggle("FPS Unlocker", function(state)
                    FPSUnlocker = state;
            
                    if state then
                        setfpscap(999)
                    else
                        setfpscap(60)
                    end
            
                    pcall(save_settings);
                end, { Enabled = FPSUnlocker, Call = true })
                main_settings_container:create_button("Switch to Main UI", function()
                    print('this worked too')
                    writefile(savepath('.fluxusui'),'1')
                    game.Players.LocalPlayer:Kick('Re-join to launch main UI')
                end)
            end
        end

        local skip_key = if auth_user("") then true elseif isfile(savepath(".fluxus-auth-store")) and auth_user(readfile(savepath(".fluxus-auth-store"))) then true else false

        if skip_key == false then
            local KeyTab_Selector = keyselector.Selector;
            
            local Title = Instance.new("TextLabel")

            Title.Name = "Title"
            Title.Parent = KeyTab_Selector
            Title.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
            Title.BackgroundTransparency = 1.000
            Title.BorderColor3 = Color3.fromRGB(0, 0, 0)
            Title.BorderSizePixel = 0
            Title.Size = UDim2.new(0.899999976, 0, 0, 25)
            Title.Font = Enum.Font.GothamBold
            Title.Text = "Key"
            Title.TextColor3 = Color3.fromRGB(255, 255, 255)
            Title.TextSize = 14.000
            Title.TextXAlignment = Enum.TextXAlignment.Left

            local KeyBox = Instance.new("Frame")
            local UICorner = Instance.new("UICorner")
            local TextBox = Instance.new("TextBox")
            local Logo = Instance.new("ImageLabel")
            
            KeyBox.Name = "KeyBox"
            KeyBox.Parent = KeyTab_Selector
            KeyBox.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
            KeyBox.BorderSizePixel = 0
            KeyBox.Size = UDim2.new(0.899999976, 0, 0, 25)
            
            UICorner.Parent = KeyBox
            
            TextBox.Parent = KeyBox
            TextBox.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
            TextBox.BackgroundTransparency = 1.000
            TextBox.BorderColor3 = Color3.fromRGB(0, 0, 0)
            TextBox.BorderSizePixel = 0
            TextBox.Position = UDim2.new(0.130648464, 0, 0.159999996, 0)
            TextBox.Size = UDim2.new(0.869351506, 0, 0.720000029, 0)
            TextBox.Font = Enum.Font.Gotham
            TextBox.MultiLine = true
            TextBox.Text = ""
            TextBox.TextColor3 = Color3.fromRGB(216, 216, 216)
            TextBox.TextSize = 14.000
            TextBox.TextWrapped = true
            TextBox.TextXAlignment = Enum.TextXAlignment.Left
            TextBox.TextYAlignment = Enum.TextYAlignment.Top
            
            Logo.Name = "Logo"
            Logo.Parent = KeyBox
            Logo.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
            Logo.BackgroundTransparency = 1.000
            Logo.BorderSizePixel = 0
            Logo.Position = UDim2.new(0.0360067226, 0, -0.173333317, 10)
            Logo.Size = UDim2.new(0.065416269, 0, 0.5, 0)
            Logo.Image = "rbxassetid://138900967749432"
            Logo.ScaleType = Enum.ScaleType.Fit
            
            local Sep = Instance.new("Frame")
                
            Sep.Name = "Sep"
            Sep.Parent = KeyTab_Selector
            Sep.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
            Sep.BorderSizePixel = 0
            Sep.Size = UDim2.new(0.899999976, 0, 0, 1)
            
            local CheckKey = Instance.new("Frame")
            local UICorner = Instance.new("UICorner")
            local TextButton = Instance.new("TextButton")
            
            CheckKey.Name = "CheckKey"
            CheckKey.Parent = KeyTab_Selector
            CheckKey.BackgroundColor3 = Color3.fromRGB(103, 61, 234)
            CheckKey.BorderSizePixel = 0
            CheckKey.Size = UDim2.new(0.899999976, 0, 0, 25)
            
            UICorner.Parent = CheckKey
            
            TextButton.Parent = CheckKey
            TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
            TextButton.BackgroundTransparency = 1.000
            TextButton.BorderSizePixel = 0
            TextButton.Size = UDim2.new(1, 0, 1, 0)
            TextButton.Font = Enum.Font.GothamBold
            TextButton.Text = "Check Key"
            TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
            TextButton.TextSize = 12.000
            TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
            TextButton.MouseButton1Down:Connect(function()
                if auth_user(TextBox.Text) then
                    load_ui(true);
                end
            end)
            
            local GetKey = Instance.new("Frame")
            local UICorner = Instance.new("UICorner")
            local TextButton = Instance.new("TextButton")
            local Extra = Instance.new("TextLabel")

            GetKey.Name = "GetKey"
            GetKey.Parent = KeyTab_Selector
            GetKey.BackgroundColor3 = Color3.fromRGB(70, 70, 72)
            GetKey.BorderSizePixel = 0
            GetKey.Size = UDim2.new(0.899999976, 0, 0, 25)
            
            UICorner.Parent = GetKey
            
            TextButton.Parent = GetKey
            TextButton.BackgroundColor3 = Color3.fromRGB(69, 72, 79)
            TextButton.BackgroundTransparency = 1.000
            TextButton.BorderSizePixel = 0
            TextButton.Size = UDim2.new(1, 0, 1, 0)
            TextButton.Font = Enum.Font.GothamBold
            TextButton.Text = "Get Key"
            TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
            TextButton.TextSize = 12.000
            TextButton.TextStrokeColor3 = Color3.fromRGB(255, 255, 255)
            TextButton.MouseButton1Down:Connect(function()
                Extra.Visible = true;
                
                if FLUX_ID ~= nil then
                    setclipboard("https://flux.li/android/external/start.php?HWID="..FLUX_ID);
                else
                    setclipboard("https://flux.li/android/external/start.php");
                end
            end)

            Extra.Name = "Extra"
            Extra.Parent = KeyTab_Selector
            Extra.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
            Extra.BackgroundTransparency = 1.000
            Extra.BorderColor3 = Color3.fromRGB(0, 0, 0)
            Extra.BorderSizePixel = 0
            Extra.Size = UDim2.new(0.899999976, 0, 1, -135)
            Extra.Font = Enum.Font.Gotham
            Extra.Text = "The key link was copied to your clipboard! Paste it into a browser (like Chrome) to get a key! If you need help, join our discord at https://discord.gg/NKgEmhMKYs"
            Extra.TextColor3 = Color3.fromRGB(255, 255, 255)
            Extra.TextSize = 14.000
            Extra.TextWrapped = true
            Extra.TextYAlignment = Enum.TextYAlignment.Top
            Extra.Visible = false;
            Extra.TextScaled = true;
        else
            load_ui(false);
        end 
    end
else
    do
        if NewModel == true then
            getgenv().NewModel = nil;
        else
            --setfflag("UseNewCapsApi2", "false")
            
            getgenv().gethui = function()
                return game.CoreGui
            end
        end
            
        repeat wait() until game:IsLoaded()

        --print("loaded");

        local FLUX_ID = gethwid()

        local DebugFunc = getinfo or debug.getinfo
        local IsDebug = false
        local hooks = {}

        local DetectedMeth, KillMeth

        setthreadidentity(2)

        for index, value in getgc(true) do
            if typeof(value) == "table" then
                local detected = rawget(value, "Detected")
                local kill = rawget(value, "Kill")
            
                if typeof(detected) == "function" and not DetectedMeth then
                    DetectedMeth = detected
                    
                    local hook
                    hook = hookfunction(DetectedMeth, function(methodName, methodFunc, methodInfo)
                        if methodName ~= "_" then
                            if IsDebug then
                            
                                if flux_console_log then
                                    flux_console_log("WARN", "Adonis Detected\nMethod: " .. tostring(methodName) .. "\nInfo: " .. tostring(methodFunc), true);
                                end
                            

                            end
                        end
                        
                        return true
                    end)

                    table.insert(hooks, DetectedMeth)
                end

                if rawget(value, "Variables") and rawget(value, "Process") and typeof(kill) == "function" and not KillMeth then
                    KillMeth = kill
                    local hook
                    hook = hookfunction(KillMeth, function(killFunc)
                        if IsDebug then
                            if flux_console_log then
                                flux_console_log("WARN", "Adonis tried to detect: " .. tostring(killFunc), true);
                            end
                                
                            --warn("Adonis tried to detect: " .. tostring(killFunc))
                        end
                    end)

                    table.insert(hooks, KillMeth)
                end
            end
        end

        local hook
        hook = hookfunction(getrenv().debug.info, newcclosure(function(...)
            local functionName, functionDetails = ...

            if DetectedMeth and functionName == DetectedMeth then
                if IsDebug or not IsDebug then
                print("test 1")
                    if flux_console_log then
                        flux_console_log("WARN", "Adonis was bypassed by the_king.78", true);
                    end
                end
        print("test")
                return coroutine.yield(coroutine.running())
            end
            
            return hook(...)
        end))

        setthreadidentity(7)

        local res, error = pcall(function()
            getgenv().firesignal = newcclosure(function(signal, ...)
                assert(signal, "i want signal");
                for i,v in pairs(getconnections(signal)) do
                    v.Function(...)
                end
            end)
            
            local coregui = game:GetService("CoreGui");
            local corepack = game:GetService("CorePackages");

            function let_pass(v)
                if v.Parent ~= nil then
                    if v.Parent ==  coregui or v.Parent == corepack then
                        if v.Parent.Parent then
                            local ol;
                            ol = v.Parent.Parent;
            
                            while ol do
                                if ol == coregui or ol == corepack then
                                    return false			
                                end
                
                                if ol.Parent ~= nil then
                                    ol = ol.Parent
                                end
                            end
                        end
            
                        return false
                    end
                end

                return true
            end

            getgenv().getloadedmodules = newcclosure(function()
                local modules = {}
                for i,v in pairs(getscripts()) do
                    if v:IsA("ModuleScript") and let_pass(v) then
                        table.insert(modules, v)
                    end
                end

                return modules
            end)
                
            spawn(function()
                if teleport_handle_hideenv then
                    local teleport_handle = teleport_handle_hideenv
                    
                    repeat wait() until game:GetService("Players").LocalPlayer
                    
                    getgenv().teleport_handle_hideenv = nil
                end
            end)
                
                local old_require = getrenv().require
                local setidentity = set_thread_context

                local VirtualInputManager = Instance.new("VirtualInputManager")
                local GuiService = game:GetService("GuiService")

                local VirtualInput = {}
                local currentWindow = nil

                function VirtualInput.setCurrentWindow(window)
                    local old = currentWindow
                    currentWindow = window
                    return old
                end

                local function handleGuiInset(x, y)
                    local guiOffset, _ = GuiService:GetGuiInset()
                    return x + guiOffset.X, y + guiOffset.Y
                end

                function VirtualInput.sendMouseButtonEvent(x, y, button, isDown)
                    x, y = handleGuiInset(x, y)
                    VirtualInputManager:SendMouseButtonEvent(x, y, button, isDown, currentWindow, 0)
                end

                function VirtualInput.SendKeyEvent(isPressed, keyCode, isRepeated)
                    VirtualInputManager:SendKeyEvent(isPressed, keyCode, isRepeated, currentWindow)
                end

                function VirtualInput.SendMouseMoveEvent(x, y)
                    x, y = handleGuiInset(x, y)
                    VirtualInputManager:SendMouseMoveEvent(x, y, currentWindow)
                end

                function VirtualInput.sendTextInputCharacterEvent(str)
                    VirtualInputManager:sendTextInputCharacterEvent(str, currentWindow)
                end

                function VirtualInput.SendMouseWheelEvent(x, y, isForwardScroll)
                    x, y = handleGuiInset(x, y)
                    VirtualInputManager:SendMouseWheelEvent(x, y, isForwardScroll, currentWindow)
                end

                function VirtualInput.SendTouchEvent(touchId, state, x, y)
                    x, y = handleGuiInset(x, y)
                    VirtualInputManager:SendTouchEvent(touchId, state, x, y)
                end

                function VirtualInput.mouseWheel(vec2, num)
                    local forward = false
                    if num < 0 then
                        forward = true
                        num = -num
                    end
                    for _ = 1, num do
                        VirtualInput.SendMouseWheelEvent(vec2.x, vec2.y, forward)
                    end
                end

                function VirtualInput.touchStart(vec2)
                    VirtualInput.SendTouchEvent(defaultTouchId, 0, vec2.x, vec2.y)
                end

                function VirtualInput.touchMove(vec2)
                    VirtualInput.SendTouchEvent(defaultTouchId, 1, vec2.x, vec2.y)
                end

                function VirtualInput.touchStop(vec2)
                    VirtualInput.SendTouchEvent(defaultTouchId, 2, vec2.x, vec2.y)
                end

                local function smoothSwipe(posFrom, posTo, duration)
                    local passed = 0
                    local started = false
                    return function(dt)
                        if not started then
                            VirtualInput.touchStart(posFrom)
                            started = true
                        else
                            passed = passed + dt
                            if duration and passed < duration then
                                local percent = passed / duration
                                local pos = (posTo - posFrom) * percent + posFrom
                                VirtualInput.touchMove(pos)
                            else
                                VirtualInput.touchMove(posTo)
                                VirtualInput.touchStop(posTo)
                                return true
                            end
                        end
                        return false
                    end
                end

                function VirtualInput.swipe(posFrom, posTo, duration, async)
                    if async == true then
                        asyncRun(smoothSwipe(posFrom, posTo, duration))
                    else
                        syncRun(smoothSwipe(posFrom, posTo, duration))
                    end
                end

                function VirtualInput.tap(vec2)
                    VirtualInput.touchStart(vec2)
                    VirtualInput.touchStop(vec2)
                end

                function VirtualInput.click(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 0, true)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 0, false)
                end

                function VirtualInput.rightClick(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 1, true)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 1, false)
                end

                function VirtualInput.mouseLeftDown(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 0, true)
                end

                function VirtualInput.mouseLeftUp(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 0, false)
                end

                function VirtualInput.mouseRightDown(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 1, true)
                end

                function VirtualInput.mouseRightUp(vec2)
                    VirtualInput.sendMouseButtonEvent(vec2.x, vec2.y, 1, false)
                end

                function VirtualInput.pressKey(keyCode)
                    VirtualInput.SendKeyEvent(true, keyCode, false)
                end

                function VirtualInput.releaseKey(keyCode)
                    VirtualInput.SendKeyEvent(false, keyCode, false)
                end

                function VirtualInput.hitKey(keyCode)
                    VirtualInput.pressKey(keyCode)
                    VirtualInput.releaseKey(keyCode)
                end

                function VirtualInput.mouseMove(vec2)
                    VirtualInput.SendMouseMoveEvent(vec2.X, vec2.Y)
                end

                function VirtualInput.sendText(str)
                    VirtualInput.sendTextInputCharacterEvent(str)
                end

                function nametoenum(name)
                    return Enum.KeyCode[name] 
                end

                local KeyCodes = 
                {
                    [0x08] = nametoenum("Backspace");
                    [0x09] = nametoenum("Tab");
                    [0x0C] = nametoenum("Clear");
                    [0x0D] = nametoenum("Return");
                    [0x10] = nametoenum("LeftShift");
                    [0x11] = nametoenum("LeftControl");
                    [0x12] = nametoenum("LeftAlt");
                    [0xA5] = nametoenum("RightAlt");
                    [0x13] = nametoenum("Pause");
                    [0x14] = nametoenum("CapsLock");
                    [0x1B] = nametoenum("Escape");
                    [0x20] = nametoenum("Space");
                    [0x21] = nametoenum("PageUp");
                    [0x22] = nametoenum("PageDown");
                    [0x23] = nametoenum("End");
                    [0x24] = nametoenum("Home");
                    [0x25] = nametoenum("Left");
                    [0x26] = nametoenum("Up");
                    [0x27] = nametoenum("Right");
                    [0x28] = nametoenum("Down");
                    [0x2A] = nametoenum("Print");
                    [0x2D] = nametoenum("Insert");
                    [0x2E] = nametoenum("Delete");
                    [0x2F] = nametoenum("Help");
                    [0x30] = nametoenum("Zero");
                    [0x31] = nametoenum("One");
                    [0x32] = nametoenum("Two");
                    [0x33] = nametoenum("Three");
                    [0x34] = nametoenum("Four");
                    [0x35] = nametoenum("Five");
                    [0x36] = nametoenum("Six");
                    [0x37] = nametoenum("Seven");
                    [0x38] = nametoenum("Eight");
                    [0x39] = nametoenum("Nine");
                    [0x41] = nametoenum("A");
                    [0x42] = nametoenum("B");
                    [0x43] = nametoenum("C");
                    [0x44] = nametoenum("D");
                    [0x45] = nametoenum("E");
                    [0x46] = nametoenum("F");
                    [0x47] = nametoenum("G");
                    [0x48] = nametoenum("H");
                    [0x49] = nametoenum("I");
                    [0x4A] = nametoenum("J");
                    [0x4B] = nametoenum("K");
                    [0x4C] = nametoenum("L");
                    [0x4D] = nametoenum("M");
                    [0x4E] = nametoenum("N");
                    [0x4F] = nametoenum("O");
                    [0x50] = nametoenum("P");
                    [0x51] = nametoenum("Q");
                    [0x52] = nametoenum("R");
                    [0x53] = nametoenum("S");
                    [0x54] = nametoenum("T");
                    [0x55] = nametoenum("U");
                    [0x56] = nametoenum("V");
                    [0x57] = nametoenum("W");
                    [0x58] = nametoenum("X");
                    [0x59] = nametoenum("Y");
                    [0x5A] = nametoenum("Z");
                    [0x5B] = nametoenum("LeftSuper");
                    [0x5C] = nametoenum("RightSuper");
                    [0x60] = nametoenum("KeypadZero");
                    [0x61] = nametoenum("KeypadOne");
                    [0x62] = nametoenum("KeypadTwo");
                    [0x63] = nametoenum("KeypadThree");
                    [0x64] = nametoenum("KeypadFour");
                    [0x65] = nametoenum("KeypadFive");
                    [0x66] = nametoenum("KeypadSix");
                    [0x67] = nametoenum("KeypadSeven");
                    [0x68] = nametoenum("KeypadEight");
                    [0x69] = nametoenum("KeypadNine");
                    [0x6A] = nametoenum("Asterisk");
                    [0x6B] = nametoenum("Plus");
                    [0x6D] = nametoenum("Minus");
                    [0x6E] = nametoenum("Period");
                    [0x6F] = nametoenum("Slash");
                    [0x70] = nametoenum("F1");
                    [0x71] = nametoenum("F2");
                    [0x72] = nametoenum("F3");
                    [0x73] = nametoenum("F4");
                    [0x74] = nametoenum("F5");
                    [0x75] = nametoenum("F6");
                    [0x76] = nametoenum("F7");
                    [0x77] = nametoenum("F8");
                    [0x78] = nametoenum("F9");
                    [0x79] = nametoenum("F10");
                    [0x7A] = nametoenum("F11");
                    [0x7B] = nametoenum("F12");
                    [0x7C] = nametoenum("F13");
                    [0x7D] = nametoenum("F14");
                    [0x7E] = nametoenum("F15");
                    [0x90] = nametoenum("NumLock");
                    [0x91] = nametoenum("ScrollLock");
                    [0xA0] = nametoenum("LeftShift");
                    [0xA1] = nametoenum("RightShift");
                    [0xA2] = nametoenum("LeftControl");
                    [0xA3] = nametoenum("RightControl");
                    [0xFE] = nametoenum("Clear");
                    [0xBB] = nametoenum("Equals");
                    [0xDB] = nametoenum("LeftBracket");
                    [0xDD] = nametoenum("RightBracket");
                }

                function get_keycode(key)
                    local x = KeyCodes[key]

                    if x then
                        return x
                    end

                    return Enum.KeyCode.Unknown
                end

                getgenv().isrbxactive = function()
                    return true
                end

                getgenv().iswindowactive = isrbxactive
                getgenv().isgameactive = isrbxactive

                getgenv().keypress = newcclosure(function(keyCode)
                    if (typeof(keyCode) == "string") then
                        VirtualInput.pressKey(get_keycode(tonumber(keyCode)))
                    elseif (typeof(keyCode) == "number") then
                        VirtualInput.pressKey(get_keycode(keyCode))
                    else
                        VirtualInput.pressKey(keyCode)
                    end
                end)

                getgenv().keyrelease = newcclosure(function(keyCode)
                    if (typeof(keyCode) == "string") then
                        VirtualInput.releaseKey(get_keycode(tonumber(keyCode)))
                    elseif (typeof(keyCode) == "number") then
                        VirtualInput.releaseKey(get_keycode(keyCode))
                    else
                        VirtualInput.releaseKey(keyCode)
                    end
                end)

                getgenv().mouse1click = newcclosure(function()
                    VirtualInput.click(Vector2.new(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y))
                end)

                getgenv().mouse1press = newcclosure(function()
                    VirtualInput.sendMouseButtonEvent(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y, 0, true)
                end)

                getgenv().mouse1release = newcclosure(function()
                    VirtualInput.sendMouseButtonEvent(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y, 0, false)
                end)

                getgenv().mouse2press = newcclosure(function()
                    VirtualInput.sendMouseButtonEvent(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y, 1, true)
                end)

                getgenv().mouse2release = newcclosure(function()
                    VirtualInput.sendMouseButtonEvent(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y, 1, false)
                end)

                getgenv().mouse2click = newcclosure(function()
                    VirtualInput.rightClick(Vector2.new(game.Players.LocalPlayer:GetMouse().X, game.Players.LocalPlayer:GetMouse().Y))
                end)

                getgenv().mousescroll = newcclosure(function(scroll)
                    VirtualInput.mouseWheel(scroll, 1)
                end)

                getgenv().mousemoverel = newcclosure(function(x, y)
                    VirtualInput.mouseMove(Vector2.new(x, y))
                end)

                getgenv().mousemoveabs = newcclosure(function(x, y)
                    VirtualInput.mouseMove(Vector2.new(x, y))
                end)

                function left_click(x)
                    if type(x) ~= "number" then
                        error("Bad argument (#1) to Input.LeftClick, expected number");
                    end

                    if(x == 1) then
                        mouse1release()
                    elseif(x == 2) then
                        mouse1press()
                    elseif(x == 3) then
                        mouse1click()
                    end
                end

                function right_click(x)
                    if type(x) ~= "number" then
                        error("Bad argument (#1) to Input.RightClick, expected number");
                    end

                    if(x == 1) then
                        mouse2release()
                    elseif(x == 2) then
                        mouse2press()
                    elseif(x == 3) then
                        mouse2click()
                    end
                end

            function key_press(x)
                if type(x) ~= "number" then
                    error("Bad argument (#1) to Input.KeyPress, expected number");
                end

                keypress(x)
                keyrelease(x);
            end

            getgenv().Input = {
                LeftClick = left_click;
                RightClick = right_click;
                KeyPress = key_press;
                KeyDown = keypress;
                KeyUp = keyrelease;
            }

            setreadonly(Input, true)

            getgenv().require = function(script)
            local old_identity = setidentity(2)
            local success, err = pcall(old_require, script)
            setidentity(old_identity)
            assert(success, err)
        
            return err
            end
        end)

        if res == false then
            warn("err", error);
        end


        pcall(function()

        if Drawing then
            return;
        end

        Parent=Instance.new("ScreenGui")Parent.Parent=gethui();Parent.Name="flView"Parent.IgnoreGuiInset=true;local a=math.floor;local b={Visible=true,Transparency=true,Color=true,Thickness=true}local c={PointA=true,PointB=true,PointC=true,PointD=true,A=1,B=2,C=3,D=4}local function e()local f={newDrawing("Line"),newDrawing("Line"),newDrawing("Line"),newDrawing("Line")}local g;g=setmetatable({Remove=function(self)setmetatable(g,{})self.Remove=nil;for h=1,4 do f[h]:Remove()end end},{__newindex=function(self,i,j)if b[i]then for h=1,4 do f[h][i]=j end;return end;local k=c[i]if k then k=c[tostring(i):sub(-1)]f[k].From=j;f[k+1-a(k/4)*4].To=j;return end end})return g end;local function l(m,n,o)local p=2;if not n then n=UDim2.new(0,0,0,0)else n=UDim2.new(0,n.X,0,n.Y)end;if not m then m=UDim2.new(0,0,0,0)else m=UDim2.new(0,m.X,0,m.Y)end;local q,r=n.X.Offset-m.X.Offset,n.Y.Offset-m.Y.Offset;local h=(q*q+r*r)^.5;local s=math.atan2(r,q)o.Size=UDim2.new(0,h,0,p)local t,u=0.5*(m.X.Offset+n.X.Offset),0.5*(m.Y.Offset+n.Y.Offset)o.Position=UDim2.new(0,t-0.5*h,0,u-0.5*p)o.Rotation=math.deg(s)o.BorderSizePixel=0;return o end;getgenv().Drawing={}Parent=Instance.new("ScreenGui")Parent.Parent=gethui();Parent.Name="flView"Parent.IgnoreGuiInset=true;local function l(m,n,o)local p=2;if not n then n=UDim2.new(0,0,0,0)else n=UDim2.new(0,n.X,0,n.Y)end;if not m then m=UDim2.new(0,0,0,0)else m=UDim2.new(0,m.X,0,m.Y)end;local q,r=n.X.Offset-m.X.Offset,n.Y.Offset-m.Y.Offset;local h=(q*q+r*r)^.5;local s=math.atan2(r,q)o.Size=UDim2.new(0,h,0,p)local t,u=0.5*(m.X.Offset+n.X.Offset),0.5*(m.Y.Offset+n.Y.Offset)o.Position=UDim2.new(0,t-0.5*h,0,u-0.5*p)o.Rotation=math.deg(s)o.BorderSizePixel=0;return o end;Drawing.Fonts={}Drawing.Fonts.UI=0;Drawing.Fonts.System=1;Drawing.Fonts.Plex=2;Drawing.Fonts.Monospace=3;Drawing.new=newcclosure(function(v)if v=="Triangle"then local w={}return setmetatable({},{__index=function(self,x)if x=="Remove"or x=="Destroy"then return function()end end;return w[x]end,__newindex=function(self,x,y)w[x]=y end})end;if v=="Line"then local w={}local z=Instance.new("Frame",Parent)z.ZIndex=3000;return setmetatable({},{__index=function(self,x)if x=="Remove"or x=="Destroy"then z:Destroy()return function()end end;return w[x]end,__newindex=function(self,x,y)w[x]=y;if x=="Visible"then z.Visible=y end;if x=="Color"then z.BackgroundColor3=y end;if x=="Transparency"then z.BackgroundTransparency=math.clamp(1-y,0,1)end;if x=="From"then d=l(w.From,w.To,z)return nil end;if x=="To"then d=l(w.From,w.To,z)return nil end end})end;if v=="Circle"then local A={}local B=Instance.new("Frame",Parent)B.BorderSizePixel=0;B.AnchorPoint=Vector2.new(0.5,0.5)Instance.new("UICorner",B).CornerRadius=UDim.new(1,0)return setmetatable({},{__index=function(self,x)if x=="Remove"or x=="Destroy"then return function()B:Destroy()end end;return A[x]end,__newindex=function(self,x,y)A[x]=y;if x=="Visible"then B.Visible=y end;if x=="Transparency"then B.BackgroundTransparency=1-y end;if x=="Color"then B.BackgroundColor3=y end;if x=="Position"then B.Position=UDim2.new(0,y.X,0,y.Y)end;if x=="Radius"then B.Size=UDim2.new(0,y*2,0,y*2)end end})end;if v=="Text"then local C={}local D=Instance.new("TextLabel",Parent)D.BorderSizePixel=0;D.AnchorPoint=Vector2.new(0.5,0.5)return setmetatable({},{__index=function(self,x)if x=="Remove"or x=="Destroy"then return function()D:Destroy()end end;return C[x]end,__newindex=function(self,x,y)C[x]=y;if x=="Visible"then D.Visible=y end;if x=="Color"then D.TextColor3=y end;if x=="Position"then D.Position=UDim2.new(0,y.X,0,y.Y)end;if x=="Transparency"then D.TextTransparency=math.clamp(1-y,0,1)end;if x=="Size"then D.TextSize=y-10 end;if x=="Text"then D.Text=y end end})end;if v=="Quad"then return e()end;if v=="Square"then local E={}local F=Instance.new("Frame",Parent)F.BorderSizePixel=0;return setmetatable({},{__index=function(self,x)if x=="Remove"or x=="Destroy"then return function()F:Destroy()end end;return E[x]end,__newindex=function(self,x,y)E[x]=y;if x=="Visible"then E.Visible=true;F.Visible=y end;if x=="Color"then F.BackgroundColor3=y end;if x=="Transparency"then F.BackgroundTransparency=math.clamp(1-y,0,1)end;if x=="Position"then F.Position=UDim2.new(0,y.X,0,y.Y)end;if x=="Size"then F.Size=UDim2.new(0,y.X,0,y.Y)end end})end end)
        end)

        local name = identifyexecutor();


        -- Built at Sun Mar 12 2023 19:14:47 GMT-0400 (Eastern Daylight Time) in Production Mode
        return (function() -- put everything in a seperate closure
        -- Fluxus X Android Init Script
        -- Copyright (c) 2022 the_king.78. All Rights Reserved.
        -- Copyright (c) 2022 Jake Brock. All Rights Reserved.

        local null = nil -- null is better than nil, change my mind
        local modules = {} -- we will assign modules to here later
        local require = function(...) -- handle loading modules
        local requested, returned = { ... }, {}
        for _, filepath in pairs(requested) do
            if not modules[filepath] then
            error('[flux bundler] no such module \'' .. filepath .. '\'')
            end
            local module = modules[filepath]
            if module.isCached then
            table.insert(returned, module.cache)
            else
            local moduleValue = module.load()
            module.cache = moduleValue
            module.isCached = true
            table.insert(returned, module.cache)
            end
        end
        return table.unpack(returned)
        end

        local authvf = AeVPjNWXqQ or function()
        return true
        end
        getgenv().AeVPjNWXqQ = nil

        local rawGetScripts = getscripts_hideenv
        local scriptList = nil
        if type(rawGetScripts) == "function" then
            local ok, result = pcall(rawGetScripts)
            if ok and type(result) == "table" then
                scriptList = result
            end
        end
        getgenv().getscripts_hideenv = nil

        local function readSavedScripts()
            local result = {}
            local folders = {
                "workspace.saves/scripts",
            }

            if type(listfiles) ~= "function" or type(readfile) ~= "function" then
                return result
            end

            for _, folder in ipairs(folders) do
                local ok, files = pcall(listfiles, folder)
                if ok and type(files) == "table" then
                    for _, file in ipairs(files) do
                        local readOk, contents = pcall(readfile, file)
                        if readOk and type(contents) == "string" then
                            local name = tostring(file):match("[^/\\]+$") or tostring(file)
                            result[name] = contents
                        end
                    end
                    if next(result) then
                        break
                    end
                end
            end
            return result
        end

        local getscripts = function()
            local savedScripts = readSavedScripts()

            if type(scriptList) == "table" then
                for name, contents in pairs(scriptList) do
                    savedScripts[name] = contents
                end
            end

            scriptList = savedScripts
            return scriptList
        end


        --> BEGIN Initial Module Definitions <--

        modules['asset-obj.lua'] = {};
        modules['asset-obj.lua'].load = function()
        local list = {
        ['rbxassetid://11447435879'] = 'minimize_btn';
        ['rbxassetid://11447575636'] = 'desc';
        ['rbxassetid://138900967749432'] = 'icon';
        ['rbxassetid://138900967749432'] = 'icon-2';
        ['rbxassetid://11447558233'] = 'settings';
        ['rbxassetid://11706698017'] = 'hist-icon';
        ['rbxassetid://11810985691'] = 'scriptbeans';
        ['rbxassetid://11440677815'] = 'welcome-banner-easteregg';
        ['rbxassetid://11445329779'] = 'credits-banner-easteregg';
        ['rbxassetid://11706521913'] = 'history-banner-easteregg';
        ['rbxassetid://11441550965'] = 'scripts-banner-easteregg';
        ['rbxassetid://11441550965'] = 'scripts-banner-easteregg';
        ['rbxassetid://11441541927'] = 'settings-banner-easteregg';
        };

        return setmetatable({},{
        __index = function(t,k)
            return k
        end;
        });

        end;
        modules['asset-obj.lua'].cache = null;
        modules['asset-obj.lua'].isCached = false;

        ----

        modules['index.lua'] = {};
        modules['index.lua'].load = function()
        local isDebug = isfile(SAVE_DIR .. '.debugLOGGGG')
        local debug = function() end
        if isDebug then
        debug = function(...)
            print('debug:', ...)
        end
        local oldreq = require
        require = function(...)
            print('debug: require():', ...)
            return oldreq(...)
        end
        end
        -- load lua patches
        debug 'loadpatch'
        require 'patches/LoadCfgLib'
        require 'patches/PatchUnavailableDecompiler'
        require 'patches/PatchReadClipboard'
        require 'patches/PatchAuthReads'
        require 'patches/PatchAuthListfiles'
        require 'patches/PolyfillRConsole'
        require 'patches/HookSetfpscap'
        -- quick init ui
        debug 'createui'
        local ui = require 'lib/ui'
        ui.CreateUI()
        -- load shit
        debug 'loadauth'
        local auth = require 'auth'
        -- check for authentication
        debug 'tryauth'
        local IsSuccessfulAuth = auth.TryAuthenticate()
        local DoCustomInit = function()
        -- if init file, call init file instead of loading the actual ui | this happens post-auth so it should be fine from a security pov
        debug 'custinit'
        if (isfile(SAVE_DIR .. 'fVV282L8Z.dev') or isfile(SAVE_DIR .. 'fVV282L8Z.lua')) and not isDev then
            getgenv().readclipboard_hideenv = require 'patches/PatchReadClipboard'
            ui.UI.Enabled = false -- hide ui
            loadstring(readfile(isfile(SAVE_DIR .. 'fVV282L8Z.dev') and (SAVE_DIR .. 'fVV282L8Z.dev') or isfile(SAVE_DIR .. 'fVV282L8Z.lua') and (SAVE_DIR .. 'fVV282L8Z.lua')))() -- load init
            return true
        else
            return false
        end
        end
        -- define func for init main ui
        debug 'completeuidef'
        local CompleteUI
        CompleteUI = function()
        debug 'completeui'
        -- dont allow double init
        CompleteUI = function() end
        -- allow custom init shit
        if runautoexec_hideenv then
            runautoexec_hideenv()
            getgenv().runautoexec_hideenv = nil
        end

        if DoCustomInit() then
            return true
        end
        ui.SetUnminimizeTarget 'MainUI'
        -- create tabs
        require 'lib/ui/CreateBaseUI'()
        require 'lib/ui/CreateScriptsUI'()
        require 'lib/ui/CreateScriptBloxUI'()
        require 'lib/ui/CreateSettingsUI'()
        -- load debug lib
        task.spawn(function()
            getgenv().cds = require 'lib/debugginglib'
            getgenv().debugging = {
            ['connect'] = getgenv().cds,
            }
        end)
        -- transition
        ui.TransitionToUIFrame 'MainUI'
        end
        debug 'checkauth'
        -- if auth failed, register events & show prompt
        if not IsSuccessfulAuth then
        debug 'transitiontolekey'
        ui.TransitionToUIFrame 'Key'
        debug 'showleks'
        ui.KSShowBtn ''
        debug 'ruic'
        ui.RegisterGetKeyClick(function()
            if FLUX_ID ~= nil then
            setclipboard("https://keysystem.fluxteam.net/android/checkpoint/start.php?HWID="..FLUX_ID)
            else
            setclipboard 'https://keysystem.fluxteam.net/android/checkpoint/start.php'  
            end
            -- the below line is curtosey of showerheadfd's code & it features 6 indexes
            
            local discord = game:HttpGet("https://fluxteam.net/external-files/discord.php?android=true&id="..FLUX_ID)
            ui.UIFrames.Key.Container.KeyContainer.Instructions.Text = _G.fluxus_ui_values["key_copied"]..discord
        end)
        debug 'rvkc'
        ui.RegisterValidateKeyClick(function(key)
            if auth.Keyed.ValidateKey(key) then
            ui.KSHideBtn ''
            ui.PrepareTransition 'Key'
            CompleteUI()
            else
            ui.UIFrames.Key.Container.KeyContainer.Instructions.Text =
                'Your key was incorrect!<br/>Please try getting a new key. If this issue persists, contact support.'
            end
        end)
        else
        -- otherwise, call CompleteUI()
        debug 'ttui'
        ui.PrepareTransition 'Loader'
        CompleteUI()
        end

        end;
        modules['index.lua'].cache = null;
        modules['index.lua'].isCached = false;

        ----

        modules['auth/HandleKeyedAuthentication.lua'] = {};
        modules['auth/HandleKeyedAuthentication.lua'].load = function()
        -- Simple API for Key-based Authentication
        return {
        ['ValidateKey'] = function(key)
            if type(key) ~= 'string' then
            error 'Failed to auth'
            end

            local ret = authvf(key, game:GetService('Players').LocalPlayer.Name)
            if ret then
            writefile(SAVE_DIR .. '.fluxus-auth-store', key)
            end
            return ret
        end,
        }

        end;
        modules['auth/HandleKeyedAuthentication.lua'].cache = null;
        modules['auth/HandleKeyedAuthentication.lua'].isCached = false;

        ----

        modules['auth/index.lua'] = {};
        modules['auth/index.lua'].load = function()
        local auth = {
        ['Keyed'] = require 'auth/HandleKeyedAuthentication',
        }
        auth['TryAuthenticate'] = function() -- pre-ui-validation, if this function returns true, the auth ui prompt is skipped.
        if _testKeySystem then
            return false
        end
        if authvf('', game:GetService('Players').LocalPlayer.Name) then
            return true
        end

        if isfile(SAVE_DIR .. '.fluxus-auth-store') then
            return authvf(readfile(SAVE_DIR .. '.fluxus-auth-store'), game:GetService('Players').LocalPlayer.Name)
        end
        return false
        end
        return auth

        end;
        modules['auth/index.lua'].cache = null;
        modules['auth/index.lua'].isCached = false;

        ----

        modules['patches/HookSetfpscap.lua'] = {};
        modules['patches/HookSetfpscap.lua'].load = function()
        local setfpscap = getgenv().setfpscap
        getgenv().setfpscap = function(cap)
        if typeof(cap) ~= 'number' then
            error '-1iq moment: did not pass number to setfpscap'
        else
            return setfpscap(cap)
        end
        end
        return setfpscap

        end;
        modules['patches/HookSetfpscap.lua'].cache = null;
        modules['patches/HookSetfpscap.lua'].isCached = false;

        ----

        modules['patches/LoadCfgLib.lua'] = {};
        modules['patches/LoadCfgLib.lua'].load = function()
        -- loads cfg lib; it adds itself into genv
        require 'lib/cfg'

        end;
        modules['patches/LoadCfgLib.lua'].cache = null;
        modules['patches/LoadCfgLib.lua'].isCached = false;

        ----

        modules['patches/PatchAuthListfiles.lua'] = {};
        modules['patches/PatchAuthListfiles.lua'].load = function()
        -- Patches listfile to prevent accidentally causing an error when matched with readfile()
        -- Could be better optimized but idc
        local rawListFiles
        rawListFiles = hookfunction(listfiles, function(dir, ...)
        local fileList = rawListFiles(dir, ...)
        local returnedList = {}
        for _, file in pairs(fileList) do
            if not string.find(file, '.fluxus-auth-store') then
            table.insert(returnedList, file)
            end
        end
        return returnedList
        end)
        return rawListFiles

        end;
        modules['patches/PatchAuthListfiles.lua'].cache = null;
        modules['patches/PatchAuthListfiles.lua'].isCached = false;

        ----

        modules['patches/PatchAuthReads.lua'] = {};
        modules['patches/PatchAuthReads.lua'].load = function()
        -- Patches reads
        -- Please DO NOT rely on this alone in production for premium as-is.
        local rawReadFile
        rawReadFile = hookfunction(readfile, function(f, ...)
        if string.find(f, '.fluxus-auth-store') then
            return ('Security Exception: The file "' .. f .. '" is a protected file and cannot be written to!')
        end
        return rawReadFile(f, ...)
        end)
        return rawReadFile

        end;
        modules['patches/PatchAuthReads.lua'].cache = null;
        modules['patches/PatchAuthReads.lua'].isCached = false;

        ----

        modules['patches/PatchReadClipboard.lua'] = {};
        modules['patches/PatchReadClipboard.lua'].load = function()
        local clipboard_reader = readclipboard_hideenv
        return function(src)
            if src == nil then
                if type(clipboard_reader) ~= "function" then
                    return warn("Clipboard Error: clipboard reader is unavailable")
                end
                local ok, clipboard = pcall(clipboard_reader)
                if not ok then
                    return warn("Clipboard Error: " .. tostring(clipboard))
                end
                src = clipboard
            end

            if type(src) ~= "string" or src == "" then
                return warn("Execute Error: script source is empty or invalid")
            end

            if type(loadstring) ~= "function" then
                return warn("Execute Error: loadstring is unavailable in this executor")
            end

            local chunk, compileError = loadstring(src)
            if not chunk then
                return warn("Compile Error: " .. tostring(compileError))
            end

            local ok, runtimeError = pcall(chunk)
            if not ok then
                warn("Runtime Error: " .. tostring(runtimeError))
            end
        end

        end;
        modules['patches/PatchReadClipboard.lua'].cache = null;
        modules['patches/PatchReadClipboard.lua'].isCached = false;

        ----

        modules['patches/PatchUnavailableDecompiler.lua'] = {};
        modules['patches/PatchUnavailableDecompiler.lua'].load = function()
        getgenv().decompile = getgenv().decompile or function()
        return '-- no decompiler 4 u'
        end

        end;
        modules['patches/PatchUnavailableDecompiler.lua'].cache = null;
        modules['patches/PatchUnavailableDecompiler.lua'].isCached = false;

        ----

        modules['patches/PolyfillRConsole.lua'] = {};
        modules['patches/PolyfillRConsole.lua'].load = function()
        local nop = function() end
        local UI = require 'lib/ui'
        local doesrconsoleexist = false
        local rconsoletab, rconsoletext, rconsolesearch

        local rconsoletextvalue = ''

        local rconsolesearchevent = Instance.new 'BindableEvent'

        local ensureconsoleexists = function()
        if not doesrconsoleexist then
            rconsoletab = UI:CreateTab 'rbxassetid://11493344192'
            rconsoletab:Focus()
            rconsolesearch = rconsoletab:Create('Search', function(t)
            rconsolesearch:SetVisible(false)
            rconsolesearchevent:Fire(t)
            end)
            rconsolesearch:SetVisible(false)
            rconsoletext = rconsoletab:Create('Text', '')
            rconsoletext:SetRichTextEnabled(false)
            doesrconsoleexist = true
        end
        end
        local wrapexists = function(urfunc)
        return function(...)
            ensureconsoleexists()
            return urfunc(...)
        end
        end

        local rconsole = {}

        rconsole.print = wrapexists(function(t)
        rconsoletextvalue = rconsoletextvalue .. tostring(t)
        rconsoletext:UpdateText(rconsoletextvalue)
        end)
        rconsole.clear = wrapexists(function()
        rconsoletextvalue = ''
        rconsole.print ''
        end)

        rconsole.input = wrapexists(function()
        rconsolesearch:SetVisible(true)
        return rconsolesearchevent.Event:Wait()
        end)

        rconsole.create = wrapexists(nop)

        rconsole.settitle = wrapexists(nop)
        rconsole.name = wrapexists(nop)
        rconsole.destroy = nop

        for k, v in pairs(rconsole) do
        getgenv()['rconsole' .. k] = v
        getgenv()['console' .. k] = v
        getgenv()['rcons' .. k] = v
        getgenv()['cons' .. k] = v
        getgenv()['fluxconsole' .. k] = v
        end

        end;
        modules['patches/PolyfillRConsole.lua'].cache = null;
        modules['patches/PolyfillRConsole.lua'].isCached = false;

        ----

        modules['lib/auth.lua'] = {};
        modules['lib/auth.lua'].load = function()
        local authfunc = authvf
        local cache
        return function(...)
        cache = cache or authfunc(...) -- if it was unsuccessful, cache will be falsy and be overwritten
        return cache
        end

        end;
        modules['lib/auth.lua'].cache = null;
        modules['lib/auth.lua'].isCached = false;

        ----

        modules['lib/base64.lua'] = {};
        modules['lib/base64.lua'].load = function()
        --!strict
        -- Based on https://github.com/iskolbin/lbase64/blob/master/base64.lua
        --[[

        base64 -- v1.5.3 public domain Lua base64 encoder/decoder
        no warranty implied; use at your own risk

        Needs bit32.extract function. If not present it's implemented using BitOp
        or Lua 5.3 native bit operators. For Lua 5.1 fallbacks to pure Lua
        implementation inspired by Rici Lake's post:
        http://ricilake.blogspot.co.uk/2007/10/iterating-bits-in-lua.html

        author: Ilya Kolbin (iskolbin@gmail.com)
        url: github.com/iskolbin/lbase64

        COMPATIBILITY

        Lua 5.1+, LuaJIT

        LICENSE

        See end of file for license information.

        --]]

        local base64 = {}

        -- Previously: local extract = _G.bit32 and _G.bit32.extract -- Lua 5.2/Lua 5.3 in compatibility mode
        local extract = bit32 and bit32.extract -- Lua 5.2/Lua 5.3 in compatibility mode
        if not extract then
        if _G.bit then -- LuaJIT
            local shl, shr, band = _G.bit.lshift, _G.bit.rshift, _G.bit.band
            extract = function(v, from, width)
            return band(shr(v, from), shl(1, width) - 1)
            end
        elseif _G._VERSION == 'Lua 5.1' then
            extract = function(v, from, width)
            local w = 0
            local flag = 2 ^ from
            for i = 0, width - 1 do
                local flag2 = flag + flag
                if v % flag2 >= flag then
                w = w + 2 ^ i
                end
                flag = flag2
            end
            return w
            end
        else -- Lua 5.3+
            extract = load [[return function( v, from, width )
                    return ( v >> from ) & ((1 << width) - 1)
                end]]()
        end
        end

        function base64.makeencoder(s62, s63, spad)
        local encoder = {}
        for b64code, char in pairs {
            [0] = 'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
            'J',
            'K',
            'L',
            'M',
            'N',
            'O',
            'P',
            'Q',
            'R',
            'S',
            'T',
            'U',
            'V',
            'W',
            'X',
            'Y',
            'Z',
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z',
            '0',
            '1',
            '2',
            '3',
            '4',
            '5',
            '6',
            '7',
            '8',
            '9',
            s62 or '+',
            s63 or '/',
            spad or '=',
        } do
            encoder[b64code] = char:byte()
        end
        return encoder
        end

        function base64.makedecoder(s62, s63, spad)
        local decoder = {}
        for b64code, charcode in pairs(base64.makeencoder(s62, s63, spad)) do
            decoder[charcode] = b64code
        end
        return decoder
        end

        local DEFAULT_ENCODER = base64.makeencoder()
        local DEFAULT_DECODER = base64.makedecoder()

        local char, concat = string.char, table.concat

        function base64.encode(str, encoder, usecaching)
        encoder = encoder or DEFAULT_ENCODER
        local t, k, n = {}, 1, #str
        local lastn = n % 3
        local cache = {}
        for i = 1, n - lastn, 3 do
            local a, b, c = str:byte(i, i + 2)
            local v = a * 0x10000 + b * 0x100 + c
            local s
            if usecaching then
            s = cache[v]
            if not s then
                s =
                char(encoder[extract(v, 18, 6)], encoder[extract(v, 12, 6)], encoder[extract(v, 6, 6)], encoder[extract(v, 0, 6)])
                cache[v] = s
            end
            else
            s = char(encoder[extract(v, 18, 6)], encoder[extract(v, 12, 6)], encoder[extract(v, 6, 6)], encoder[extract(v, 0, 6)])
            end
            t[k] = s
            k = k + 1
        end
        if lastn == 2 then
            local a, b = str:byte(n - 1, n)
            local v = a * 0x10000 + b * 0x100
            t[k] = char(encoder[extract(v, 18, 6)], encoder[extract(v, 12, 6)], encoder[extract(v, 6, 6)], encoder[64])
        elseif lastn == 1 then
            local v = str:byte(n) * 0x10000
            t[k] = char(encoder[extract(v, 18, 6)], encoder[extract(v, 12, 6)], encoder[64], encoder[64])
        end
        return concat(t)
        end

        function base64.decode(b64, decoder, usecaching)
        decoder = decoder or DEFAULT_DECODER
        local pattern = '[^%w%+%/%=]'
        if decoder then
            local s62, s63
            for charcode, b64code in pairs(decoder) do
            if b64code == 62 then
                s62 = charcode
            elseif b64code == 63 then
                s63 = charcode
            end
            end
            pattern = ('[^%%w%%%s%%%s%%=]'):format(char(s62), char(s63))
        end
        b64 = b64:gsub(pattern, '')
        local cache = usecaching and {}
        local t, k = {}, 1
        local n = #b64
        local padding = b64:sub(-2) == '==' and 2 or b64:sub(-1) == '=' and 1 or 0
        for i = 1, padding > 0 and n - 4 or n, 4 do
            local a, b, c, d = b64:byte(i, i + 3)
            local s
            if usecaching then
            local v0 = a * 0x1000000 + b * 0x10000 + c * 0x100 + d
            s = cache[v0]
            if not s then
                local v = decoder[a] * 0x40000 + decoder[b] * 0x1000 + decoder[c] * 0x40 + decoder[d]
                s = char(extract(v, 16, 8), extract(v, 8, 8), extract(v, 0, 8))
                cache[v0] = s
            end
            else
            local v = decoder[a] * 0x40000 + decoder[b] * 0x1000 + decoder[c] * 0x40 + decoder[d]
            s = char(extract(v, 16, 8), extract(v, 8, 8), extract(v, 0, 8))
            end
            t[k] = s
            k = k + 1
        end
        if padding == 1 then
            local a, b, c = b64:byte(n - 3, n - 1)
            local v = decoder[a] * 0x40000 + decoder[b] * 0x1000 + decoder[c] * 0x40
            t[k] = char(extract(v, 16, 8), extract(v, 8, 8))
        elseif padding == 2 then
            local a, b = b64:byte(n - 3, n - 2)
            local v = decoder[a] * 0x40000 + decoder[b] * 0x1000
            t[k] = char(extract(v, 16, 8))
        end
        return concat(t)
        end

        return base64

        --[[
        ------------------------------------------------------------------------------
        This software is available under 2 licenses -- choose whichever you prefer.
        ------------------------------------------------------------------------------
        ALTERNATIVE A - MIT License
        Copyright (c) 2018 Ilya Kolbin
        Permission is hereby granted, free of charge, to any person obtaining a copy of
        this software and associated documentation files (the "Software"), to deal in
        the Software without restriction, including without limitation the rights to
        use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
        of the Software, and to permit persons to whom the Software is furnished to do
        so, subject to the following conditions:
        The above copyright notice and this permission notice shall be included in all
        copies or substantial portions of the Software.
        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
        LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
        OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
        SOFTWARE.
        ------------------------------------------------------------------------------
        ALTERNATIVE B - Public Domain (www.unlicense.org)
        This is free and unencumbered software released into the public domain.
        Anyone is free to copy, modify, publish, use, compile, sell, or distribute this
        software, either in source code form or as a compiled binary, for any purpose,
        commercial or non-commercial, and by any means.
        In jurisdictions that recognize copyright laws, the author or authors of this
        software dedicate any and all copyright interest in the software to the public
        domain. We make this dedication for the benefit of the public at large and to
        the detriment of our heirs and successors. We intend this dedication to be an
        overt act of relinquishment in perpetuity of all present and future rights to
        this software under copyright law.
        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
        ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
        WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
        ------------------------------------------------------------------------------
        --]]

        end;
        modules['lib/base64.lua'].cache = null;
        modules['lib/base64.lua'].isCached = false;

        ----

        modules['lib/json.lua'] = {};
        modules['lib/json.lua'].load = function()
        --[[ json.lua

        A compact pure-Lua JSON library.
        The main functions are: json.stringify, json.parse.

        ## json.stringify:

        This expects the following to be true of any tables being encoded:
        * They only have string or number keys. Number keys must be represented as
        strings in json; this is part of the json spec.
        * They are not recursive. Such a structure cannot be specified in json.

        A Lua table is considered to be an array if and only if its set of keys is a
        consecutive sequence of positive integers starting at 1. Arrays are encoded like
        so: `[2, 3, false, "hi"]`. Any other type of Lua table is encoded as a json
        object, encoded like so: `{"key1": 2, "key2": false}`.

        Because the Lua nil value cannot be a key, and as a table value is considerd
        equivalent to a missing key, there is no way to express the json "null" value in
        a Lua table. The only way this will output "null" is if your entire input obj is
        nil itself.

        An empty Lua table, {}, could be considered either a json object or array -
        it's an ambiguous edge case. We choose to treat this as an object as it is the
        more general type.

        To be clear, none of the above considerations is a limitation of this code.
        Rather, it is what we get when we completely observe the json specification for
        as arbitrary a Lua object as json is capable of expressing.

        ## json.parse:

        This function parses json, with the exception that it does not pay attention to
        \u-escaped unicode code points in strings.

        It is difficult for Lua to return null as a value. In order to prevent the loss
        of keys with a null value in a json string, this function uses the one-off
        table value json.null (which is just an empty table) to indicate null values.
        This way you can check if a value is null with the conditional
        `val == json.null`.

        If you have control over the data and are using Lua, I would recommend just
        avoiding null values in your data to begin with.

        --]]

        -- Minified variant of https://gist.githubusercontent.com/tylerneylon/59f4bcf316be525b30ab/raw/7f69cc2cea38bf68298ed3dbfc39d197d53c80de/json.lua
        local a={}local function b(c)if type(c)~='table'then return type(c)end;local d=1;for e in pairs(c)do if c[d]~=nil then d=d+1 else return'table'end end;if d==1 then return'table'else return'array'end end;local function f(g)local h={'\\','"','/','\b','\f','\n','\r','\t'}local i={'\\','"','/','b','f','n','r','t'}for d,j in ipairs(h)do g=g:gsub(j,'\\'..i[d])end;return g end;local function k(l,m,n,o)m=m+#l:match('^%s*',m)if l:sub(m,m)~=n then if o then error('Expected '..n..' near position '..m)end;return m,false end;return m+1,true end;local function p(l,m,q)q=q or''local r='End of input found while parsing string.'if m>#l then error(r)end;local j=l:sub(m,m)if j=='"'then return q,m+1 end;if j~='\\'then return p(l,m+1,q..j)end;local s={b='\b',f='\f',n='\n',r='\r',t='\t'}local t=l:sub(m+1,m+1)if not t then error(r)end;return p(l,m+2,q..(s[t]or t))end;local function u(l,m)local v=l:match('^-?%d+%.?%d*[eE]?[+-]?%d*',m)local q=tonumber(v)if not q then error('Error parsing number at position '..m..'.')end;return q,m+#v end;function a.stringify(c,w)local g={}local x=b(c)if x=='array'then if w then error'Can\'t encode array as key.'end;g[#g+1]='['for d,q in ipairs(c)do if d>1 then g[#g+1]=', 'end;g[#g+1]=a.stringify(q)end;g[#g+1]=']'elseif x=='table'then if w then error'Can\'t encode table as key.'end;g[#g+1]='{'for y,z in pairs(c)do if#g>1 then g[#g+1]=', 'end;g[#g+1]=a.stringify(y,true)g[#g+1]=':'g[#g+1]=a.stringify(z)end;g[#g+1]='}'elseif x=='string'then return'"'..f(c)..'"'elseif x=='number'then if w then return'"'..tostring(c)..'"'end;return tostring(c)elseif x=='boolean'then return tostring(c)elseif x=='nil'then return'null'elseif x =='function' then return 'null' else error('Unjsonifiable type: '..x..'.')end;return table.concat(g)end;a.null={}function a.parse(l,m,A)m=m or 1;if m>#l then error'Reached unexpected end of input.'end;local m=m+#l:match('^%s*',m)local B=l:sub(m,m)if B=='{'then local c,C,D={},true,true;m=m+1;while true do C,m=a.parse(l,m,'}')if C==nil then return c,m end;if not D then error'Comma missing between object items.'end;m=k(l,m,':',true)c[C],m=a.parse(l,m)m,D=k(l,m,',')end elseif B=='['then local E,q,D={},true,true;m=m+1;while true do q,m=a.parse(l,m,']')if q==nil then return E,m end;if not D then error'Comma missing between array items.'end;E[#E+1]=q;m,D=k(l,m,',')end elseif B=='"'then return p(l,m+1)elseif B=='-'or B:match'%d'then return u(l,m)elseif B==A then return nil,m+1 else local F={['true']=true,['false']=false,['null']=a.null}for G,H in pairs(F)do local I=m+#G-1;if l:sub(m,I)==G then return H,I+1 end end;local J='position '..m..': '..l:sub(m,m+10)error('Invalid json syntax starting at '..J)end end;return a

        end;
        modules['lib/json.lua'].cache = null;
        modules['lib/json.lua'].isCached = false;

        ----

        modules['lib/rgb.lua'] = {};
        modules['lib/rgb.lua'].load = function()
        return Color3.fromRGB

        end;
        modules['lib/rgb.lua'].cache = null;
        modules['lib/rgb.lua'].isCached = false;

        ----

        modules['lib/cfg/index.lua'] = {};
        modules['lib/cfg/index.lua'].load = function()
        local file, json = SAVE_DIR .. '.fsettings.json', require 'lib/json'
        local data = {}
        local success, err = pcall(function()
        data = isfile(file) and json.parse(readfile(file)) or {}
        end)
        if not success then
        pcall(function()
            writefile(SAVE_DIR .. 'fluxus_cfg.json.bak', readfile(file))
            delfile(file);
            data = {};
        end)
        end

        local API
        API = {
        ['_load'] = {
            success = success,
            err = err,
        },
        ['save'] = function(self)
            writefile(file, json.stringify(data))
            return self
        end,
        ['new'] = function(idx, defaults)
            if not idx then
            error 'Did not specify a script settings name!'
            end
            if typeof(data[idx]) ~= 'table' then
            data[idx] = {}
            end
            if defaults and typeof(defaults) ~= 'table' then
            error 'defaults must be table or nil'
            end
            for k, v in pairs(defaults or {}) do
            if typeof(data[idx][k]) == 'nil' then
                data[idx][k] = v
            end
            if typeof(v) == 'table' and typeof(data[idx][k]) == 'table' then
                for k2, v2 in pairs(v) do
                if typeof(data[idx][k][k2]) == 'nil' then
                    data[idx][k][k2] = v2
                end
                end
            end
            end
            local s
            s = {
            ['save'] = function(self)
                API:save()
                return self
            end,
            ['get'] = function(_, k)
                if typeof(_) == 'string' then
                k = _
                end
                return data[idx][k]
            end,
            ['set'] = function(_, k, v)
                if typeof(_) == 'string' then
                k = _
                v = k
                _ = nil
                end
                data[idx][k] = v
                API:save()
                return _ or s
            end,
            ['getAll'] = function()
                return data[idx]
            end,
            ['setAll'] = function(_, v)
                if not v then
                v = _
                _ = nil
                end
                if typeof(v) ~= 'table' then
                error 'cannot call setAll without value being a table'
                end
                data[idx] = v
                API:save()
                return s or _
            end,
            }
            return s
        end,
        }
        getgenv().cfgapi = API
        getgenv().Cfg = API
        getgenv().cfg_api = API
        return API

        end;
        modules['lib/cfg/index.lua'].cache = null;
        modules['lib/cfg/index.lua'].isCached = false;

        ----

        modules['lib/scriptblox/index.lua'] = {};
        modules['lib/scriptblox/index.lua'].load = function()
        local ScriptBlox = {}

        ScriptBlox.Search = require 'lib/scriptblox/search'

        getgenv().ScriptBloxAPI = ScriptBlox

        return ScriptBlox

        end;
        modules['lib/scriptblox/index.lua'].cache = null;
        modules['lib/scriptblox/index.lua'].isCached = false;

        ----

        modules['lib/scriptblox/search.lua'] = {};
        modules['lib/scriptblox/search.lua'].load = function()
        -- scriptblox api schema for https://scriptblox.com/api/script/search?q=%s&max=%s&mode=%s
        -- result: // no, this isnt for formatting, its the actual key
        --   totalPages: int16 // might be more, however its not gonna be above that, should honestly be interpereted as an int8 & anything beyond it should be dismissed - this is lua though
        --   scripts: script[]
        --     - _id: string
        --       title: string
        --       game: game
        --         gameId: int64
        --         name: string
        --         imageUrl: `/images/${string}`
        --       slug: string // no spaces, ie 2X-EXP-or-Anime-Dimensions-Simulator-Anime-Dimensions-Simulator-Script-6715
        --       verified: boolean
        --       views: int
        --       scriptType: 'free' | 'paid'
        --       isUniversal: boolean
        --       isPatched: boolean // if true, we should ignore it altogether | the ui just marks it at patched on the site
        --       visibility: 'public' // can be other things (unlisted | private), but not for search responses
        --       rawCount: int64 // ??
        --       showRawCount: boolean // ??
        --       createdAt: string // iso time
        --       updatedAt: string // iso time
        --       __v: number // ??
        --       script: string // push this to the queue on exec
        --       matched: string[] // list of matched features

        local endpoint = 'https://scriptblox.com/api/script/search?q=%s%s&mode=free'
        local queryEndpoint = 'https://scriptblox.com/api/script/%s'

        local j = require 'lib/json'

        local cache = {}

        return function(q, mx)
        if cache[tostring(q) .. '++' .. tostring(mx)] then
            return cache[tostring(q) .. '++' .. tostring(mx)]
        end
        -- transform input
        q = string.gsub(q, ' ', '+')
        mx = mx and string.format('&max=%s', tostring(mx)) or ''
        -- make api call
        local responseRaw = game:HttpGetAsync(string.format(endpoint, q, mx))
        -- parse
        local parsed = j.parse(responseRaw)
        for _, script in pairs(parsed.result.scripts) do
            -- add queryInfo call
            script.queryInfo = function()
            if cache['_info.' .. script._id] then
                return cache['_info.' .. script._id]
            end
            local slug = script.slug
            local infoAPI = string.format(queryEndpoint, slug)
            local fetched = game:HttpGetAsync(infoAPI)
            cache['_info.' .. script._id] = j.parse(fetched).script
            return cache['_info.' .. script._id]
            end
        end
        -- return
        cache[tostring(q) .. '++' .. tostring(mx)] = parsed
        return cache[tostring(q) .. '++' .. tostring(mx)]
        end

        end;
        modules['lib/scriptblox/search.lua'].cache = null;
        modules['lib/scriptblox/search.lua'].isCached = false;

        ----

        modules['lib/debugginglib/index.lua'] = {};
        modules['lib/debugginglib/index.lua'].load = function()
        local strlib = {
        ['startsWith'] = function(str, substr)
            return string.sub(str, 1, #substr) == substr
        end,
        ['endsWith'] = function(str, substr)
            return string.sub(str, -#substr) == substr
        end,
        }
        local json = require 'lib/json'
        local b64 = require 'lib/base64'
        local bb64 = {
        ['encode'] = function(d)
            return string.gsub(b64.encode(d), '/', '_')
        end,
        ['decode'] = function(d)
            return b64.decode(string.gsub(d, '_', '/'))
        end,
        }

        local existingConnections = {}
        local connect = function(address)
        if not strlib.endsWith(address, '/') then
            address = address .. '/'
        end
        if existingConnections[address] then
            return existingConnections[address]
        end
        local connection = {}
        connection.request = function(r)
            return game:HttpGetAsync(address .. r)
        end
        if connection.request 'isalive' ~= 'alive' then
            error 'Instance is not alive. Possibly pointing to something other than the communication assistant?'
        end
        -- Comms Assistant
        do
            connection.assistant = {
            ['console'] = {
                ['clear'] = function()
                return connection.request 'clear-console'
                end,
                ['log'] = function(_t, t)
                return connection.request('send-console/' .. bb64.encode(typeof(t) == 'nil' and _t or t))
                end,
            },
            }
            connection.assistant.console.clear()
            connection.assistant.console.log(
            'Connection to Android Device Established at .DATE.!\nPlease point your SDK or Application to '
                .. address
                .. '\nPress CTRL+C to end the connection.'
            )
        end
        -- Jobs (SDK -> Client)
        do
            -- Public API
            local runners = {}
            do
            connection.on = function(jobName, callback)
                if not jobName then
                error 'Provide an event name'
                end
                if typeof(jobName) ~= 'string' then
                error 'Ensure your event\'s name is a string'
                end
                runners[jobName] = callback
            end
            end
            -- Long-Poll
            do
            local Poll = function()
                local response = json.parse(connection.request 'android/long-poll')
                local jobs = response.jobs
                for _, o in pairs(jobs) do
                if runners[o.type] then
                    task.spawn(function()
                    runners[o.type](o.data)
                    end)
                end
                end
            end
            task.spawn(function()
                while true do
                local s, e = pcall(function()
                    Poll()
                end)
                if not s then
                    warn(e)
                    task.wait(30)
                end
                task.wait()
                end
            end)
            end
        end
        -- Client -> SDK
        do
            connection.bulkSend = function(jobs)
            local stringed = json.stringify(jobs)
            local b64ed = bb64.encode(stringed)
            return connection.request('android/send-jobs/' .. b64ed)
            end
            connection.send = function(jobName, data)
            if not jobName then
                error 'Provide an event name'
            end
            if typeof(jobName) ~= 'string' then
                error 'Ensure your event\'s name is a string'
            end
            return connection.bulkSend {
                ['type'] = jobName,
                ['data'] = data,
            }
            end
        end
        require(__dirname .. '/jobs')(connection)
        existingConnections[address] = connection
        return connection
        end
        return connect

        end;
        modules['lib/debugginglib/index.lua'].cache = null;
        modules['lib/debugginglib/index.lua'].isCached = false;

        ----

        modules['lib/debugginglib/jobs/index.lua'] = {};
        modules['lib/debugginglib/jobs/index.lua'].load = function()
        -- Built-In Jobs
        return function(connection)
        connection.on('loadstring', require(__dirname .. '/loadstring')(connection))
        end

        end;
        modules['lib/debugginglib/jobs/index.lua'].cache = null;
        modules['lib/debugginglib/jobs/index.lua'].isCached = false;

        ----

        modules['lib/debugginglib/jobs/loadstring.lua'] = {};
        modules['lib/debugginglib/jobs/loadstring.lua'].load = function()
        return function(connection)
        return function(data)
            if typeof(data) ~= 'string' then
            return connection.send('exception', {
                ['for'] = 'loadstring',
                ['script'] = data,
                ['exception'] = 'parser exception: is not string',
            })
            end
            getgenv().___temp_connection = connection
            getgenv().___temp_connection_print = function(...)
            return connection.send('connectionPrint', table.concat({ ... }, ' '))
            end
            data = 'local connection=getgenv().___temp_connection;getgenv().___temp_connection=nil;local connectionPrint=getgenv().___temp_connection_print;getgenv().___temp_connection_print=nil;'
            .. data
            local chunk, exc = loadstring(data, tostring(math.random(0, 100000000)))
            if not chunk then
            return connection.send('exception', {
                ['for'] = 'loadstring',
                ['script'] = data,
                ['exception'] = 'compilation exception: ' .. tostring(exc),
            })
            end
            local s, r = pcall(chunk, connection)
            if not s then
            return connection.send('exception', {
                ['for'] = 'loadstring',
                ['script'] = data,
                ['exception'] = 'runtime exception: ' .. tostring(r),
            })
            end
        end
        end

        end;
        modules['lib/debugginglib/jobs/loadstring.lua'].cache = null;
        modules['lib/debugginglib/jobs/loadstring.lua'].isCached = false;

        ----

        modules['lib/ui/CreateBaseUI.lua'] = {};
        modules['lib/ui/CreateBaseUI.lua'].load = function()
        -- Creates the main UI using primarily the public API
        local UI = require 'lib/ui'
        local UIFH = require 'lib/ui/_UIFeatureHandler'
        local CFGLib = require 'lib/cfg'
        local a = require('asset-obj')
        return function()
        -- main/exec page
        local tab = UI:CreateTab(a['rbxassetid://11445282332'])
        if not CFGLib._load.success then

        end
        UIFH.add('tabimages', tab:Create('Image', a['rbxassetid://11440677815']))
        tab:Create(
            'Text',
            _G.fluxus_ui_values["welcome_text"]
        )
        tab:Create 'ExecBox'
        UIFH.add('tabimages', tab:Create('Image', a['rbxassetid://11445329779']))
        tab:Create(
            'Text',
            _G.fluxus_ui_values["credits"]
        )
        end

        end;
        modules['lib/ui/CreateBaseUI.lua'].cache = null;
        modules['lib/ui/CreateBaseUI.lua'].isCached = false;

        ----

        modules['lib/ui/CreateHistoryUI.lua'] = {};
        modules['lib/ui/CreateHistoryUI.lua'].load = function()
        local UI = require 'lib/ui'
        local UIFH = require 'lib/ui/_UIFeatureHandler'
        local CFGLib = require 'lib/cfg'
        local executescript = require 'patches/PatchReadClipboard'
        local aobj = require('asset-obj')
        local cfg = CFGLib.new('li.flux.ui.builtins', {
        ['history'] = {},
        })
        local hasCreated = false
        local add
        local pushToScriptHistory = function(self, item)
        add(item)
        local history = cfg:get 'history'
        -- trim
        if #history > 51 then
            local newHistory = {}
            local amnt = #history - 50
            for i = amnt, #history, 1 do
            table.insert(newHistory, history[i])
            end
            history = newHistory
        end
        table.insert(history, item)
        cfg:set('history', history)
        end
        return setmetatable({}, {
        __call = function()
            if hasCreated then
            return
            else
            hasCreated = true
            end
            -- history page
            local tab = UI:CreateTab(aobj['rbxassetid://11706698017'])
            UIFH.add('tabimages', tab:Create('Image', aobj['rbxassetid://11706521913']))
            add = function(s)
            local strDisplay = string.sub(s, 0, 15)
            if #s > 15 then
                strDisplay = strDisplay .. '...'
            end
            UIFH.add(
                'scripthistory',
                tab:Create('Button', 'passive', 'Run', strDisplay, function()
                executescript(s)
                end)
            )
            end
            for _, o in pairs(cfg:get 'history') do
            add(o)
            end
            UIFH.add('!scripthistory', tab:Create('Text', 'Rejoin to hide this tab.'))
        end,
        __index = {
            ['\0\1\2\3\4\5\6\7\8\9\240\241\242\243\244\245\246\247\248\249\250\251\252\253\254\255'] = pushToScriptHistory,
        },
        })

        end;
        modules['lib/ui/CreateHistoryUI.lua'].cache = null;
        modules['lib/ui/CreateHistoryUI.lua'].isCached = false;

        ----

        modules['lib/ui/CreateScriptBloxUI.lua'] = {};
        modules['lib/ui/CreateScriptBloxUI.lua'].load = function()
        local ScriptBlox = require 'lib/scriptblox'
        local UIMain = require 'lib/ui'
        local executescript = require 'patches/PatchReadClipboard'
        local CFGLib = require 'lib/cfg'
        local UIFH = require 'lib/ui/_UIFeatureHandler'
        local cfg = CFGLib.new 'li.flux.ui.builtins'
        local assets = require('asset-obj')
        return function()
        local tab = UIMain:CreateTab(assets['rbxassetid://11810985691'])
        UIFH.add('tabimages', tab:Create('Image', assets['rbxassetid://11441550965']))
        local entries = {}
        local clear = function()
            for _, o in pairs(entries) do
            o:SetVisible(false)
            end
            entries = {}
        end
        if not isfolder(SAVE_DIR .. '.fluxus-scriptblox-autoexec') then
            makefolder(SAVE_DIR .. '.fluxus-scriptblox-autoexec')
        end
        task.spawn(function()
            local add = function(data)
            -- table.insert(entries, UIFH.add('tabimages', tab:Create 'Image'))
            table.insert(
                entries,
                tab:Create(
                'Text',
                string.format(
                    '<font size="28"><b>%s</b></font><br/><font size="24">Matched: <i>%s</i></font>',
                    data.title,
                    table.concat(data.matched, ' ')
                )
                )
            )
            if data.isUniversal and data._id then
                local btn
                local updateButton
                local fpath = SAVE_DIR .. '.fluxus-scriptblox-autoexec/' .. data._id .. '.autoexec.json'
                local cb = function()
                if isfile(fpath) then
                    delfile(fpath)
                else
                    writefile(fpath, require('lib/json').stringify(data))
                end
                updateButton()
                end
                updateButton = function()
                if isfile(fpath) then
                    btn:Update('passive', 'Remove from autoexec')
                else
                    btn:Update('passive', 'Add to autoexec')
                end
                end
                btn = UIFH.add('autoexec', tab:Create('Button', 'passive', 'Add to autoexec', cb))
                updateButton()
                table.insert(entries, btn)
            end
            local btn = tab:Create('Button', 'passive', 'Execute', function()
                if executescript then
                executescript(data.script)
                else
                local bytecode, err = loadstring(data.script)
                if not err then
                    bytecode()
                else
                    error('Compilation Error! Info: ' .. err)
                end
                end
            end)
            table.insert(entries, btn)
            end
            -- run autoexec
            task.spawn(function()
            if cfg:get 'noautoexec' then
                return
            end
            for _, o in pairs(listfiles(SAVE_DIR .. '.fluxus-scriptblox-autoexec')) do
                local fraw = readfile(o)
                local data = require('lib/json').parse(fraw)
                if executescript then
                executescript(data.script)
                else
                local bytecode, err = loadstring(data.script)
                if not err then
                    bytecode()
                else
                    error('Compilation Error! Info: ' .. err)
                end
                end
            end
            end)
            local doSearch = function(query, deep)
            -- get results
            local apiresults = nil;
            local s,e = pcall(function()
                apiresults = ScriptBlox.Search(query, 60).result.scripts
            end)
            if s == false then
                return;
            end
            -- sort by pref
            local results = {}
            -- ensure can be sorted correctly
            for i = -50, 50, 1 do
                results[i] = nil
            end
            local androidMatches = {
                'fluxus android',
                'flux android',
                'fluxusandroid',
                'mobile',
                'android',
                '-- @supports-fluxus-android',
                '-- @supports-mobile-ui',
            }
            for idx, res in pairs(apiresults) do
                local cat = 32
                -- supports fluxus android = prioritize by 3
                for _, o in pairs(androidMatches) do
                if
                    string.find(string.lower(res.title), o) or string.find(string.lower(res.script), o)
                    -- or (deep and string.find(string.lower(res.queryInfo().features), o)) -- buggy for some searches no clue why
                then
                    cat = cat - 5
                    table.insert(res.matched, 'compatability')
                    break
                end
                end
                -- game id matches = prioritize by 2
                if game.GameId == res.game.gameId then
                cat = cat - 2
                table.insert(res.matched, 'gameid')
                end
                -- universal = prioritize by 1
                if res.isUniversal then
                cat = cat - 1
                table.insert(res.matched, 'universal')
                end
                -- verified = prioritize by 1
                if res.verified then
                cat = cat - 1
                table.insert(res.matched, 'verified')
                end
                -- is patched = deprioritize by 50
                if res.isPatched then
                cat = cat + 50
                res.title = 'PATCHED | ' .. res.title
                end
                -- insert
                results[cat] = results[cat] or {}
                table.insert(results[cat], res)
            end
            -- clear ui
            clear()
            -- add
            for _, resList in pairs(results) do
                for _, res in pairs(resList or {}) do
                add(res)
                end
            end
            end
            tab:Create('Search', function(v)
            doSearch(v, true)
            end)
            task.spawn(function()
            doSearch('', false)
            end)
        end)
        end

        end;
        modules['lib/ui/CreateScriptBloxUI.lua'].cache = null;
        modules['lib/ui/CreateScriptBloxUI.lua'].isCached = false;

        ----

        modules['lib/ui/CreateScriptsUI.lua'] = {};
        modules['lib/ui/CreateScriptsUI.lua'].load = function()
        local UIMain = require 'lib/ui'
        local UIFH = require 'lib/ui/_UIFeatureHandler'
        local executescript = require 'patches/PatchReadClipboard'
        getgenv().getScriptList = function()
        error 'public getScriptList API not available yet.'
        end
        local assets = require('asset-obj')
        return function()
        local tab = UIMain:CreateTab(assets['rbxassetid://11447575636'])
        task.spawn(function()
            UIFH.add('tabimages', tab:Create('Image', assets['rbxassetid://11441550965']))
            local scripts = getscripts()
            if typeof(scripts) == 'nil' then
            tab:Create('Text', '<font size="26">Permission Missing</font>')
            tab:Create('Text', 'Please grant Roblox the \'Storage\'->\'All Files\' Permission.')
            local btn
            btn = tab:Create('Button', 'active', 'Instructions', function()
                task.spawn(function()
                setclipboard 'https://www.youtube.com/watch?v=EQxJSeif9b8'
                btn:Update('passive', 'Copied to your Clipboard.')
                task.wait(2)
                btn:Update('active', 'Instructions')
                end)
            end)
            tab:Create('Text', '<font size="13" color="#999999">Error: 0x00</font>')
            elseif type(scripts) ~= 'table' then
            tab:Create('Text', '<font size="26">Saved Scripts Unavailable</font>')
            tab:Create('Text', 'The executor did not expose its saved-scripts API. Check that the Documents/FluxusX/Scripts folder is accessible.')
            tab:Create('Text', '<font size="13" color="#999999">Error: 0x01</font>')
            else
            local noScript = {
                tab:Create('Text', '<font size="26">No Scripts</font>'),
                tab:Create(
                'Text',
                'Add Scripts to the \'FluxusX -> Workspace -> workspace.scripts -> scripts\' Directory & they\'ll show here once you rejoin.'
                ),
                tab:Create('Text', '<font size="13" color="#999999">Error: 0x02</font>'),
            }
            for name, val in pairs(scripts) do
                for _, o in pairs(noScript) do
                o:SetVisible(false)
                end
                noScript = {}
                name = tostring(name):gsub('%.[^%.]+$', '')
                tab:Create('Button', 'passive', 'Run', name, function()
                executescript(val)
                end)
            end
            end
        end)
        end

        end;
        modules['lib/ui/CreateScriptsUI.lua'].cache = null;
        modules['lib/ui/CreateScriptsUI.lua'].isCached = false;

        ----

        modules['lib/ui/CreateSettingsUI.lua'] = {};
        modules['lib/ui/CreateSettingsUI.lua'].load = function()
        -- Creates the main UI using primarily the public API
        local UI, CFGLib, UIFH = require 'lib/ui', require 'lib/cfg', require 'lib/ui/_UIFeatureHandler'
        local cfg, betas = CFGLib.new 'li.flux.ui.builtins', CFGLib.new 'li.flux.ui.betaflags'
        local assets = require('asset-obj')
        return function()
        if cfg:get 'scripthistory' then
            require 'lib/ui/CreateHistoryUI'()
        end
        local tab = UI:InternalCreateTab(assets['rbxassetid://11447558233'], 'y999999')
        UIFH.add('tabimages', tab:Create('Image', assets['rbxassetid://11441541927']))

        -- define funcs
        local SetSmallUI = function(v)
            UI:SetSmallUIEnabled(v)
            cfg:set('usesmallui', v)
        end
        local SetIsFPSUnlocked = function(v)
            setfpscap(v and 512 or 60)
            cfg:set('fpsunlocked', v)
        end
        local SetNoAutoexec = function(v)
            cfg:set('noautoexec', v)
            UIFH.changeState('autoexec', not v)
        end
        local SetFastAnim = function(v)
            cfg:set('fastanim', v)
        end
        local SetNoAnim = function(v)
            cfg:set('noanim', v)
            UIFH.changeState('noanim', v)
        end
        local SetTabImages = function(v)
            cfg:set('tabimages', v)
            UIFH.changeState('tabimages', v)
        end
        local SetScrHst = function(v)
            cfg:set('scripthistory', v)
            UIFH.changeState('scripthistory', v)
            if v then
            require 'lib/ui/CreateHistoryUI'()
            end
        end
        local t = UI.UIFrames.ToggleBtn
        local MinimizePos, MinimizeAnchor = t.Position, t.AnchorPoint
        local SetUseCenteredMinimize = function(v)
            if v then
            t.Position = UDim2.new(0.5, 0, 0, 0)
            t.AnchorPoint = Vector2.new(0.5, 0)
            else
            t.Position = MinimizePos
            t.AnchorPoint = MinimizeAnchor
            end
            cfg:set('centeredminimize', v)
        end
        SetSmallUI(cfg:get 'usesmallui')
        SetIsFPSUnlocked(cfg:get 'fpsunlocked')
        SetUseCenteredMinimize(cfg:get 'centeredminimize')
        tab:Create('Text', '<b>UI</b>')
        tab:Create('Checkbox', _G.fluxus_ui_values["small_ui"], cfg:get 'usesmallui').Changed:Connect(SetSmallUI)
        tab:Create('Checkbox', _G.fluxus_ui_values["centeredminimize"], cfg:get 'centeredminimize').Changed:Connect(SetUseCenteredMinimize)
        local showTab = tab:Create('Checkbox', _G.fluxus_ui_values["tabimages"], cfg:get 'tabimages')
        --
        tab:Create('Text', '<b>Autoexecute</b>')
        tab:Create('Checkbox', _G.fluxus_ui_values["noautoexec"], cfg:get 'noautoexec').Changed:Connect(SetNoAutoexec)
        UIFH.add(
            'autoexec',
            tab:Create('Button', 'passive', 'Clear', _G.fluxus_ui_values["clearautoexec"], function()
            for _, o in pairs(listfiles(SAVE_DIR .. '.fluxus-scriptblox-autoexec')) do
                delfile(o)
            end
            end)
        )
        showTab.Changed:Connect(SetTabImages)
        showTab:SetVisible(cfg:get 'tabimages-option')
        if not cfg:get 'tabimages-option' then
            cfg:set('tabimages-option', false)
        end
        UIFH.changeState('autoexec', not cfg:get 'noautoexec')
        UIFH.changeState('tabimages', cfg:get 'tabimages' or false)
        SetScrHst(cfg:get 'scripthistory')
        --
        tab:Create('Text', '<b>Animations</b>')
        tab:Create('Checkbox', _G.fluxus_ui_values["fastanim"], cfg:get 'fastanim').Changed:Connect(SetFastAnim)
        tab:Create('Checkbox', _G.fluxus_ui_values["noanim"], cfg:get 'noanim').Changed:Connect(SetNoAnim)
        --
        tab:Create('Text', '<b>Language</b>')
        local languageStatus = tab:Create(
            'Text',
            'Selected: ' .. (cfg:get 'language' or 'EN') .. '. Restart or rejoin to apply.'
        )
        local addLanguageButton = function(name, code)
            tab:Create('Button', 'passive', name, function()
            cfg:set('language', code)
            languageStatus:UpdateText('Selected: ' .. code .. '. Restart or rejoin to apply.')
            end)
        end
        addLanguageButton('English', 'EN')
        addLanguageButton('Português', 'PR')
        addLanguageButton('Русский', 'RU')
        addLanguageButton('Hrvatski', 'HR')
        addLanguageButton('Nederlands', 'NL')
        addLanguageButton('Tiếng Việt', 'VN')
        addLanguageButton('Türkçe', 'TR')
        addLanguageButton('Română', 'RO')
        addLanguageButton('Deutsch', 'DE')
        --
        tab:Create('Text', '<b>Beta Features</b>')
        tab:Create('Checkbox', _G.fluxus_ui_values["scripthistory"], cfg:get 'scripthistory').Changed:Connect(SetScrHst)
        --
        -- tab:Create('Text', '<b>Developer</b> Features')
        -- local rdb
        -- rdb = tab:Create('Button','passive','Enable Remote Debugging',function(v)
        --   rdb:SetVisible(false)
        --   local lipc = {}
        --   table.insert(lipc,tab:Create('Text', '<i>Insert the LAN IP to connect to:</i>'))
        -- end)
        --
        tab:Create('Text', '<b>Other</b>')
        tab:Create('Checkbox', 'Unlock FPS', cfg:get 'fpsunlocked').Changed:Connect(SetIsFPSUnlocked)
        tab:Create('Button', 'passive', 'Switch to Coral UI', function()
            writefile(SAVE_DIR .. '.fluxusui','2')
            game.Players.LocalPlayer:Kick('Rejoin to launch Coral')
            print("worked")
        end)
        end

        end;
        modules['lib/ui/CreateSettingsUI.lua'].cache = null;
        modules['lib/ui/CreateSettingsUI.lua'].isCached = false;

        ----

        modules['lib/ui/CreateUI.lua'] = {};
        modules['lib/ui/CreateUI.lua'].load = function()
        -- Gui to Lua
        -- Version: 3.2
        local rtContainer = Instance.new 'Part'
        local a = require('asset-obj')

        -- Instances:

        local Global_Image = nil;
        local Global_Button_Color = Color3.fromRGB(141, 115, 176)
        local Global_Text_Color = Color3.fromRGB(255, 255, 255)
        local Global_Tabs_Color = Color3.fromRGB(30, 32, 48)
        local Global_Editor_Color = Color3.fromRGB(24, 25, 38);
        local Global_Editor_Transparent = false;



        _G.fluxus_ui_values = 
        {
        -- Key Section

        ["key_instructions"] = 'Welcome to Fluxus X Android!<br/>Please click \'Get Key\' to get a key.<br/>Once you\'ve completed the key system, enter your key below, then click \'Check Key\'',
        ["key_paste_key_here"] = 'Paste your key here',
        ["key_get_key"] = 'Get Key',
        ["key_check_key"] = 'Check Key',
        ["key_copied"] = 'Welcome to Fluxus X Android!<br/>The key link was copied to your clipboard - Please open it in a browser.<br/>Need help? Join discord.gg/',

        -- Main UI

        ["welcome_text"] = '<font size="24">Hello and Welcome to Fluxus X Android!</font><br/>Enter your script or use the games tab on the left',
        ["execute_from_textbox"] = 'Execute from Textbox',
        ["execute_from_clipboard"] = 'Execute from Clipboard',
        ["credits"] = 'Fluxus X Android made by:<br/>- Jake Brock<br/>- the_king.78<br/>- shakhnozz<br/><br/><i>Scripts tab powered by Scriptblox.com</i><br/>Discover more products at <i>fluxus-x.surge.sh</i>';

        -- Cloud Scripts

        ["submit_query"] = 'Submit',
        ["search_query_text"] = 'Search Query | Powered by scriptblox.com',

        -- Settings

        ["small_ui"] = 'Small UI',
        ["centeredminimize"] = 'Use Centered Minimize',  
        ["tabimages"] = 'Show Tab Images',
        ["noautoexec"] = 'Ignore Autoexec',
        ["clearautoexec"] = 'Clear Autoexec',
        ["fastanim"] = 'Fast Animations',
        ["noanim"] = 'No Animations',
        ["scripthistory"] = 'Script History',
        }

        local cfg = require('lib/cfg').new 'li.flux.ui.builtins'
        local code = cfg:get 'language' or 'EN'
        local supportedLanguages = {
        EN = true,
        PR = true,
        RU = true,
        HR = true,
        NL = true,
        VN = true,
        TR = true,
        RO = true,
        DE = true,
        }
        if not supportedLanguages[code] then
        code = 'EN'
        end

        if code ~= "EN" then
            if code == "PR" or code == "BR" or code == "CV" or code == "AO" or code == "MZ" then
            _G.fluxus_ui_values["key_instructions"] = 'Bem-vindo ao Fluxus X Android!<br/>Por favor, pressione \'Obter chave\' para obter uma chave.<br/>Depois de terminar o sistema de chave, pressione \'Verify Key\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Cole sua chave aqui';
            _G.fluxus_ui_values["key_get_key"] = 'Obter chave';
            _G.fluxus_ui_values["key_check_key"] = 'Verificar chave';
            _G.fluxus_ui_values["key_copied"] = 'Bem-vindo ao Fluxus X Android!<br/>O link da chave foi copiado! Abra-o em um navegador como o Google.<br/>Preciso de ajuda? Junte-se ao nosso Discord discord.gg/';

            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Olá e bem-vindo ao Fluxus X Android!</font><br/>Digite seu script ou use a aba de jogos à esquerda';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Executar script da caixa de texto';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Executar script copiado';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android foi criado por:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Seção de script alimentada por scriptblox.com</i><br/>Encontre mais produtos em <i>fluxus-x.surge.sh</i>';
            
            _G.fluxus_ui_values["submit_query"] = "Procurar";
            _G.fluxus_ui_values["search_query_text"] = 'Pesquisar scripts | Fornecido por scriptblox.com';

            _G.fluxus_ui_values["small_ui"] = 'Gui pequeno';
            _G.fluxus_ui_values["centeredminimize"] = 'Centralizado Minimizar';
            _G.fluxus_ui_values["tabimages"] = 'Mostrar Imagens da Aba';
            _G.fluxus_ui_values["noautoexec"] = 'Ignorar execução automática';
            _G.fluxus_ui_values["clearautoexec"] = 'Limpar execução automática';
            _G.fluxus_ui_values["fastanim"] = 'Animações rápidas';
            _G.fluxus_ui_values["noanim"] = 'Sem animações';
            _G.fluxus_ui_values["scripthistory"] = 'História do script';
            elseif code == "RU" then
            _G.fluxus_ui_values["key_instructions"] = 'Добро пожаловать в Fluxus X Android!<br/>Пожалуйста, нажмите \'Получить ключ\', чтобы получить ключ.<br/>После завершения системы ключей введите свой ключ ниже, затем нажмите \'Проверить ключ\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Вставьте сюда свой ключ';
            _G.fluxus_ui_values["key_get_key"] = 'Получить ключ';
            _G.fluxus_ui_values["key_check_key"] = 'Проверить ключ';
            _G.fluxus_ui_values["key_copied"] = ' Добро пожаловать в Fluxus X Android!<br/>Ссылка на ключ была скопирована в буфер обмена. Пожалуйста, откройте ее в браузере.<br/>Нужна помощь? Присоединяйтесь к discord.gg/'; 
            
            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Здравствуйте и добро пожаловать в Флюксус!</font><br/>Введите свой скрипт или используйте вкладку игр слева';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Выполнить скрипт';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Выполнить скопированное'; 
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android, созданный:<br/>- Jake Brock<br/> - shakhnozz<br/>- the_king.78<br/><br/><i>Вкладка "Скрипты" от Scriptblox.com</i><br/>Подробнее о продуктах на <i>fluxus-x.surge.sh</i>'; 
            
            _G.fluxus_ui_values["submit_query"] = 'Поиск';
            _G.fluxus_ui_values["search_query_text"] = 'Найдётся всё | Интегрировано scriptblox.com'; 
            
            _G.fluxus_ui_values["small_ui"] = 'Уменьшить интерфейс'; 
            _G.fluxus_ui_values["centeredminimize"] = 'Сцентрить кнопку'; 
            _G.fluxus_ui_values["tabimages"] = 'Показать изображения вкладок'; 
            _G.fluxus_ui_values["noautoexec"] = 'Игнорировать Autoexec'; 
            _G.fluxus_ui_values["clearautoexec"] = 'Очистить Autoexec'; 
            _G.fluxus_ui_values["fastanim"] = 'Быстрая анимация'; 
            _G.fluxus_ui_values["noanim"] = 'Без анимации'; 
            _G.fluxus_ui_values["scripthistory"] = 'Недавние скрипты'; 
            elseif code == "HR" then
            _G.fluxus_ui_values["key_instructions"] = 'Dobrodošli u Fluxus X Android!<br/>Molim vas kliknite \'Dobij ključ\' da dobite ključ.<br/>Kada\ završite system za ključ, upišite ključ ispod, onda kliknite \'Provjeri Ključ\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Zaljepi svoj ključ ovdje';
            _G.fluxus_ui_values["key_get_key"] = 'Dobi ključ';
            _G.fluxus_ui_values["key_check_key"] = 'Provjeri ključ';
            _G.fluxus_ui_values["key_copied"] = 'Dobrodošli u Fluxus X Android!<br/>Link za ključ je bio kopiran - Molim vas ga otvorite u pregledniku.<br/>Trebate pomoć? Join discord.gg/';
                
            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Bok i dobrodošli u Fluxus X Android!</font><br/>Upišite svoju skriptu ili koristite tab za igrice na lijevoj strani';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Execute from Textbox';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Execute from Clipboard';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android je napravljen od:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Tab za skripte omogučen od Scriptblox.com</i><br/>Istražite više proizvoda kod <i>fluxus-x.surge.sh</i>';
                
            _G.fluxus_ui_values["submit_query"] = 'Pošalji';
            _G.fluxus_ui_values["search_query_text"] = 'Pretraži | Omogučeno od scriptblox.com';
                
            _G.fluxus_ui_values["small_ui"] = 'Mali UI';
            _G.fluxus_ui_values["centeredminimize"] = 'Koristi Centered Minimize';  
            _G.fluxus_ui_values["tabimages"] = 'Pokaži slike na tabovima';
            _G.fluxus_ui_values["noautoexec"] = 'Ignoriraj Autoexec';
            _G.fluxus_ui_values["clearautoexec"] = 'Izbriši Autoexec';
            _G.fluxus_ui_values["fastanim"] = 'Brze animacije';
            _G.fluxus_ui_values["noanim"] = 'Makni animacije';
            _G.fluxus_ui_values["scripthistory"] = 'Povijest skripta';
            elseif code == "NL" then
            _G.fluxus_ui_values["key_instructions"] = 'Welkom bij Fluxus X Android!<br/>Klik op \'Sleutel ophalen\' om een sleutel te krijgen.<br/>Zodra u het sleutelsysteem heeft voltooid, voert u hieronder uw sleutel in en klikt u op  \'Controle sleutel\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Plak hier uw sleutel';
            _G.fluxus_ui_values["key_get_key"] = 'Sleutel ophalen';
            _G.fluxus_ui_values["key_check_key"] = 'Sleutel controleren';
            _G.fluxus_ui_values["key_copied"] = 'Welkom bij Fluxus X Android!<br/>De sleutellink is naar uw klembord gekopieerd - open deze in een browser.<br/>Hulp nodig?  Word lid van discord.gg/';
            
            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Hallo en welkom bij Fluxus X Android!</font><br/>Voer je script in of gebruik het tabblad Games aan de linkerkant';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Uitvoeren vanuit tekstvak';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Uitvoeren vanaf klembord';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android gemaakt door:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Tabblad Scripts mogelijk gemaakt door Scriptblox.com</  i><br/>Ontdek meer producten op <i>fluxus-x.surge.sh</i>';
            
            _G.fluxus_ui_values["submit_query"] = 'Verzenden';
            _G.fluxus_ui_values["search_query_text"] = 'Zoekopdracht |  Mogelijk gemaakt door scriptblox.com';
                
            _G.fluxus_ui_values["small_ui"] = 'Kleine gebruikersinterface';
            _G.fluxus_ui_values["centeredminimize"] = 'Gebruik gecentreerd minimaliseren';
            _G.fluxus_ui_values["tabimages"] = 'Tabbladafbeeldingen tonen';
            _G.fluxus_ui_values["noautoexec"] = 'Negeer Autoexec';
            _G.fluxus_ui_values["clearautoexec"] = 'Autoexec wissen';
            _G.fluxus_ui_values["fastanim"] = 'Snelle animaties';
            _G.fluxus_ui_values["noanim"] = 'Geen animaties';
            _G.fluxus_ui_values["scripthistory"] = 'Scriptgeschiedenis';
            elseif code == "VN" then
            _G.fluxus_ui_values["key_instructions"] = 'Chào mừng đến Fluxus X trên Android!<br/>Xin hãy nhấn\'Lấy Key\' Để lấy key.<br/>Khi bạn\ đã làm xong thì nhập key của bạn ở dưới, rồi nhấn \'Kiểm tra key \'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Dán key của bạn ở đây';
            _G.fluxus_ui_values["key_get_key"] = 'Lấy Key';
            _G.fluxus_ui_values["key_check_key"] = 'Kiểm tra Key';
            _G.fluxus_ui_values["key_copied"] = 'Chào mừng đến Fluxus X trên Android!<br/>Link key đã được sao chép - Vui lòng dán trên trình duyệt của bạn.<br/>Cần giúp đỡ?? Vào server discord.gg/';
                
            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Xin chào và chào mừng đến Fluxus X trên Android</font><br/>Nhập mã của bạn hay là xử dụng game tab ở phía bên trái';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Execute từ Textbox';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Execute từ Clipboard';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android được làm bở:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Scripts tab được hỗ trợ từ Scriptblox.com</i><br/>Tìm hiểu thêm nhiều sản phẩm ở <i>fluxus-x.surge.sh</i>';
                
            _G.fluxus_ui_values["submit_query"] = 'Gửi';
            _G.fluxus_ui_values["search_query_text"] = 'Tìm kiếm| từ scriptblox.com';
                
            _G.fluxus_ui_values["small_ui"] = 'UI nhỏ';
            _G.fluxus_ui_values["centeredminimize"] = 'Sử dụng Thu nhỏ Căn giữa';  
            _G.fluxus_ui_values["tabimages"] = 'Hiển thị hình ảnh thẻ';
            _G.fluxus_ui_values["noautoexec"] = 'Bỏ qua autoexecute';
            _G.fluxus_ui_values["clearautoexec"] = 'Xoá autoexecute';
            _G.fluxus_ui_values["fastanim"] = 'Ảnh động nhanh';
            _G.fluxus_ui_values["noanim"] = 'Không ảnh động';
            _G.fluxus_ui_values["scripthistory"] = 'Lịch sử script';
            elseif code == "TR" then
            _G.fluxus_ui_values["key_instructions"] = 'Fluxus X Android\'e hoşgeldiniz!<br/>Anahtar almak için \'Anahtar Al\' butonuna tıklayın.<br/>anahtar sistemini tamamladıktan sonra, anahtarınızı aşağıya girin, daha sonra \'Anahtarı Kontrol Et\' butonuna tıklayın.';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Anahtarınızı buraya yapıştırın';
            _G.fluxus_ui_values["key_get_key"] = 'Anahtar Al';
            _G.fluxus_ui_values["key_check_key"] = 'Anahtarı Kontrol Et';
            _G.fluxus_ui_values["key_copied"] = 'Fluxus X Android\'e hoşgeldiniz!<br/>Anahtar linki panonuza kopyalandı. Lütfen bir tarayıcıda açın.<br/>Yardıma mı ihtiyacınız var? discord.gg/';

            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Merhaba, Fluxus X Android\'e hoşgeldiniz</font><br/>Komut dosyanızı girin veya soldaki oyunlar sekmesini kullanın';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Metin Kutusundan Execute et';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Panodan Execute et';
            _G.fluxus_ui_values["credits"] = 'Fluxus X android:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i> tarafından yapıldı. Scriptler sekmesi Scriptblox.com tarafından sağlandı.</i><br/>Daha fazla ürün için <i>fluxus-x.surge.sh</i>';

            _G.fluxus_ui_values["submit_query"] = 'Gönder';
            _G.fluxus_ui_values["search_query_text"] = 'Arama Butonu | scriptblox.com tarafından sağlandı';
            
            _G.fluxus_ui_values["small_ui"] = 'Küçük UI';
            _G.fluxus_ui_values["centeredminimize"] = 'Ortalanmış Küçültmeyi Kullan';  
            _G.fluxus_ui_values["tabimages"] = 'Sekme Resimlerini Göster';
            _G.fluxus_ui_values["noautoexec"] = 'Autoexeci görmezden gel';
            _G.fluxus_ui_values["clearautoexec"] = 'Autoexeci temizle';
            _G.fluxus_ui_values["fastanim"] = 'Hızlı Animasyonlar';
            _G.fluxus_ui_values["noanim"] = 'Animasyon Yok';
            _G.fluxus_ui_values["scripthistory"] = 'Script Geçmişi';
            elseif code == "RO" then
            _G.fluxus_ui_values["key_instructions"] = 'Bun venit la Fluxus X Android!<br/>Te rog apasa \'Obtine cheie\' pentru a obtine o cheie.<br/>O data ce ati finalizat sistemul de cheie, introduceti cheia mai jos, si apasati \'Verificare cheie\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Lipiti-va cheia aici!';
            _G.fluxus_ui_values["key_get_key"] = 'Obtine cheie';
            _G.fluxus_ui_values["key_check_key"] = 'Verifica cheie';
            _G.fluxus_ui_values["key_copied"] = 'Bun venit la Fluxus X Android!<br/>Linkul cheii a fost copiat in clipboard - Va rugam sa il deschideti intr-un browser.<br/>Nevoie de ajutor? Intrati in discord.gg/';

            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Salut si bun venit la Fluxus X Android!</font><br/>Introduceti scriptul sau folositi fila de jocuri din stanga';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Executati din Textbox';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Executati din Clipboard';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Android facut de:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Fila scripturi oferita de Scriptblox.com</i><br/>Descoperiti mai multe produse la <i>fluxus-x.surge.sh</i>';

            _G.fluxus_ui_values["submit_query"] = 'Trimite';
            _G.fluxus_ui_values["search_query_text"] = 'Interogare de cautare | Produs de scriptblox.com';
            
            _G.fluxus_ui_values["small_ui"] = 'UI Mic';
            _G.fluxus_ui_values["centeredminimize"] = 'Utilizati Minimizarea centrata';  
            _G.fluxus_ui_values["tabimages"] = 'Afisati imaginile filelor';
            _G.fluxus_ui_values["noautoexec"] = 'Ignora Autoexec';
            _G.fluxus_ui_values["clearautoexec"] = 'Sterge Autoexec';
            _G.fluxus_ui_values["fastanim"] = 'Animatii rapide';
            _G.fluxus_ui_values["noanim"] = 'Fara animatii';
            _G.fluxus_ui_values["scripthistory"] = 'Istoricul scripturilor';
            elseif code == "DE" then
            _G.fluxus_ui_values["key_instructions"] = 'Willkommen bei Fluxus X Andriod!<br/>Bitte klick auf \'Schlüssel bekommen\' um den Schlüssel zu bekommen.<br/>Wenn du den Schlüssel hast, kopiere dein Schlüssel in das Kästchen, dann klick auf \'Schlüssel überprüfen\'';
            _G.fluxus_ui_values["key_paste_key_here"] = 'Schlüssel hier reinkopieren';
            _G.fluxus_ui_values["key_get_key"] = 'Schlüssel bekommen';
            _G.fluxus_ui_values["key_check_key"] = 'Schlüssel überprüfen';
            _G.fluxus_ui_values["key_copied"] = 'Willkommen bei Fluxus X Andriod!<br/>Der Link wurde in deine Zwischenablage kopiert - Bitte öffne den link im Browser.<br/>Brauchst du hilfe? Werde jetzt Mitglied discord.gg/';
                
            _G.fluxus_ui_values["welcome_text"] = '<font size="24">Hallo und Willkommen bei Fluxus X Adroid!</font><br/>Gebe dein Skript ein oder verwenden die Registerkarte auf der linken Seite';
            _G.fluxus_ui_values["execute_from_textbox"] = 'Ausführen aus der Textbox';
            _G.fluxus_ui_values["execute_from_clipboard"] = 'Ausführen von der Textbox';
            _G.fluxus_ui_values["credits"] = 'Fluxus X Andriod erstellt von:<br/>- Jake Brock<br/>- shakhnozz<br/>- the_king.78<br/><br/><i>Scripts Registerkarte powered by Scriptblox.com</i><br/>Entdecke mehr Produkte bei <i>fluxus-x.surge.sh</i>';
                
            _G.fluxus_ui_values["submit_query"] = 'Einreichen';
            _G.fluxus_ui_values["search_query_text"] = 'Suchabfrage | Powered by scriptblox.com';
                
            _G.fluxus_ui_values["small_ui"] = 'Kleine UI';
            _G.fluxus_ui_values["centeredminimize"] = 'Zentriertes Minimieren verwenden';  
            _G.fluxus_ui_values["tabimages"] = 'Zeige Registerkarten Bilder';
            _G.fluxus_ui_values["noautoexec"] = 'Ignoriere Autoexec';
            _G.fluxus_ui_values["clearautoexec"] = 'Lösche Autoexec';
            _G.fluxus_ui_values["fastanim"] = 'Schnelle Animationen';
            _G.fluxus_ui_values["noanim"] = 'Keine Animationen';
            _G.fluxus_ui_values["scripthistory"] = 'Script Geschichte';
            end
        end

        function hex2rgb(hex)
            hex = hex:gsub("#","")
            local r = tonumber("0x"..hex:sub(1,2))
            local g = tonumber("0x"..hex:sub(3,4))
            local b = tonumber("0x"..hex:sub(5,6))
            return Color3.fromRGB(r,g,b)
        end

        pcall(function()
        if isfile(SAVE_DIR .. "theme.flux") then
            local data = readfile(SAVE_DIR .. "theme.flux")
            local json_data = game:GetService("HttpService"):JSONDecode(data)
            
            if(json_data["main_grid"]) then
            local img = json_data["main_grid"];

            if(img:find("https")) then
                local url_hash = SAVE_DIR .. crypt.hash(img)..".png";
                if(not isfile(url_hash)) then
                writefile(url_hash, request({Url = img}).Body)
                end

                if(getcustomasset) then
                Global_Image = getcustomasset(url_hash)
                end
            elseif(isfile(img)) then
                Global_Image = getcustomasset(img)
            elseif(img:find("#")) then
                Global_Image = hex2rgb(img)
            end
            end

            if(json_data["background_image"]) then
            local img = json_data["background_image"];

            if(img:find("https")) then
                local url_hash = SAVE_DIR .. crypt.hash(img)..".png";
                if(not isfile(url_hash)) then
                writefile(url_hash, request({Url = img}).Body)
                end

                if(getcustomasset) then
                Global_Image = getcustomasset(url_hash)
                end
            elseif(isfile(img)) then
                Global_Image = getcustomasset(img)
            elseif(img:find("#")) then
                Global_Image = hex2rgb(img)
            end
            end

            if(json_data["button_color"]) then
            local clr = json_data["button_color"];

            if(clr:find("#")) then
                Global_Button_Color = hex2rgb(clr)
            end
            end

            if(json_data["text_color"]) then
            local clr = json_data["text_color"];
            
            if(clr:find("#")) then
                Global_Text_Color = hex2rgb(clr)
            end
            end

            if(json_data["tabs_color"]) then
            local clr = json_data["tabs_color"];
            
            if(clr:find("#")) then
                Global_Tabs_Color = hex2rgb(clr)
            end
            end

            if(json_data["editor_color"]) then
            local clr = json_data["editor_color"];
            
            if(clr:find("#")) then
                if(clr == "#") then
                Global_Editor_Transparent = true;
                end
                Global_Editor_Color = hex2rgb(clr)
            end
            end

        end
        end)

        local FluxusAndroidUI = Instance.new 'ScreenGui'
        local Container = Instance.new 'Frame'
        local Loader = Instance.new 'Frame'
        local UIAspectRatioConstraint = Instance.new 'UIAspectRatioConstraint'
        local Border = Instance.new 'Frame'
        local UICorner = Instance.new 'UICorner'
        local UICorner_2 = Instance.new 'UICorner'
        local Icon = Instance.new 'ImageLabel'
        local UIAspectRatioConstraint_2 = Instance.new 'UIAspectRatioConstraint'
        local Key = Instance.new 'Frame'
        local UIAspectRatioConstraint_3 = Instance.new 'UIAspectRatioConstraint'
        local Border_2 = Instance.new 'Frame'
        local UICorner_3 = Instance.new 'UICorner'
        local UICorner_4 = Instance.new 'UICorner'
        local Icon_2 = Instance.new 'ImageLabel'
        local UIAspectRatioConstraint_4 = Instance.new 'UIAspectRatioConstraint'
        local Container_2 = Instance.new 'Frame'
        local UICorner_5 = Instance.new 'UICorner'
        local CheckKey = Instance.new 'TextButton'
        local UICorner_6 = Instance.new 'UICorner'
        local TextLabel = Instance.new 'TextLabel'
        local GetKey = Instance.new 'TextButton'
        local UICorner_7 = Instance.new 'UICorner'
        local TextLabel_2 = Instance.new 'TextLabel'
        local KeyContainer = Instance.new 'TextLabel'
        local UICorner_8 = Instance.new 'UICorner'
        local Instructions = Instance.new 'TextLabel'
        local KeyBox = Instance.new 'TextBox'
        local minimizeContainer = Instance.new 'Frame'
        local UICorner_9 = Instance.new 'UICorner'
        local _1Minimize = Instance.new 'ImageButton'
        local UIAspectRatioConstraint_5 = Instance.new 'UIAspectRatioConstraint'
        local UIAspectRatioConstraint_6 = Instance.new 'UIAspectRatioConstraint'
        local TransitionUI = Instance.new 'Frame'
        local Border_3 = Instance.new 'Frame'
        local UICorner_10 = Instance.new 'UICorner'
        local UICorner_11 = Instance.new 'UICorner'
        local MainUI = Instance.new 'ImageLabel'
        local Border_4 = Instance.new 'Frame'
        local UICorner_12 = Instance.new 'UICorner'
        local UICorner_13 = Instance.new 'UICorner'
        local Tabs = Instance.new 'Frame'
        local Scroller = Instance.new 'ScrollingFrame'
        local UIListLayout = Instance.new 'UIListLayout'
        local Btn = Instance.new 'ImageButton'
        local UIAspectRatioConstraint_7 = Instance.new 'UIAspectRatioConstraint'
        local UICorner_14 = Instance.new 'UICorner'
        local UICorner_15 = Instance.new 'UICorner'
        local _1Minimize_2 = Instance.new 'ImageButton'
        local UIAspectRatioConstraint_8 = Instance.new 'UIAspectRatioConstraint'
        local UIListLayout_2 = Instance.new 'UIListLayout'
        local Content = Instance.new 'ScrollingFrame'
        local UIListLayout_3 = Instance.new 'UIListLayout'
        local Spacer = Instance.new 'Frame'
        local Text = Instance.new 'Frame'
        local Label = Instance.new 'TextLabel'
        local Button = Instance.new 'Frame'
        local WithText = Instance.new 'Frame'
        local ActiveButton = Instance.new 'TextButton'
        local UIAspectRatioConstraint_9 = Instance.new 'UIAspectRatioConstraint'
        local UITextSizeConstraint = Instance.new 'UITextSizeConstraint'
        local UICorner_16 = Instance.new 'UICorner'
        local Label_2 = Instance.new 'TextLabel'
        local PassiveButton = Instance.new 'TextButton'
        local UIAspectRatioConstraint_10 = Instance.new 'UIAspectRatioConstraint'
        local UITextSizeConstraint_2 = Instance.new 'UITextSizeConstraint'
        local UICorner_17 = Instance.new 'UICorner'
        local NoText = Instance.new 'Frame'
        local ActiveButton_2 = Instance.new 'TextButton'
        local UITextSizeConstraint_3 = Instance.new 'UITextSizeConstraint'
        local UICorner_18 = Instance.new 'UICorner'
        local TextLabel_3 = Instance.new 'TextLabel'
        local PassiveButton_2 = Instance.new 'TextButton'
        local UITextSizeConstraint_4 = Instance.new 'UITextSizeConstraint'
        local UICorner_19 = Instance.new 'UICorner'
        local TextLabel_4 = Instance.new 'TextLabel'
        local Checkbox = Instance.new 'Frame'
        local Checked = Instance.new 'TextButton'
        local UIAspectRatioConstraint_11 = Instance.new 'UIAspectRatioConstraint'
        local UITextSizeConstraint_5 = Instance.new 'UITextSizeConstraint'
        local UICorner_20 = Instance.new 'UICorner'
        local Unchecked = Instance.new 'TextButton'
        local UIAspectRatioConstraint_12 = Instance.new 'UIAspectRatioConstraint'
        local UITextSizeConstraint_6 = Instance.new 'UITextSizeConstraint'
        local UICorner_21 = Instance.new 'UICorner'
        local Label_3 = Instance.new 'TextLabel'
        local Textbox = Instance.new 'Frame'
        local TextBox = Instance.new 'TextBox'
        local UICorner_22 = Instance.new 'UICorner'
        local TextBoxMultiLine = Instance.new 'Frame'
        local TextBox_2 = Instance.new 'TextBox'
        local UICorner_23 = Instance.new 'UICorner'
        local Image = Instance.new 'Frame'
        local ImageLabel = Instance.new 'ImageLabel'
        local UICorner_24 = Instance.new 'UICorner'
        local ExecBox = Instance.new 'Frame'
        local TextBox_3 = Instance.new 'TextBox'
        local box = Instance.new 'TextButton'
        local UITextSizeConstraint_7 = Instance.new 'UITextSizeConstraint'
        local UICorner_25 = Instance.new 'UICorner'
        local TextLabel_5 = Instance.new 'TextLabel'
        local clippy = Instance.new 'TextButton'
        local UITextSizeConstraint_8 = Instance.new 'UITextSizeConstraint'
        local UICorner_26 = Instance.new 'UICorner'
        local TextLabel_6 = Instance.new 'TextLabel'
        local UICorner_27 = Instance.new 'UICorner'
        local Search = Instance.new 'Frame'
        local TextBox_4 = Instance.new 'TextBox'
        local UICorner_28 = Instance.new 'UICorner'
        local ActiveButton_3 = Instance.new 'TextButton'
        local UITextSizeConstraint_9 = Instance.new 'UITextSizeConstraint'
        local UICorner_29 = Instance.new 'UICorner'
        local TextLabel_7 = Instance.new 'TextLabel'
        local ToggleBtn = Instance.new 'Frame'
        local UIAspectRatioConstraint_13 = Instance.new 'UIAspectRatioConstraint'
        local Border_5 = Instance.new 'Frame'
        local UICorner_30 = Instance.new 'UICorner'
        local UICorner_31 = Instance.new 'UICorner'
        local Icon_3 = Instance.new 'ImageLabel'
        local UIAspectRatioConstraint_14 = Instance.new 'UIAspectRatioConstraint'
        local ClickHandler = Instance.new 'TextButton'

        --Properties:

        FluxusAndroidUI.Name = 'FluxusAndroidUI'
        FluxusAndroidUI.Parent = rtContainer
        FluxusAndroidUI.DisplayOrder=  1999999999
        FluxusAndroidUI.ScreenInsets=Enum.ScreenInsets.None

        Container.Name = 'Container'
        Container.Parent = FluxusAndroidUI
        Container.BackgroundColor3 = Global_Editor_Color
        Container.BackgroundTransparency = 1.000
        Container.Size = UDim2.new(1, 0, 1, 0)

        Loader.Name = 'Loader'
        Loader.Parent = Container
        Loader.AnchorPoint = Vector2.new(0.5, 0.5)
        Loader.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        Loader.BorderColor3 = Color3.fromRGB(24, 25, 38)
        Loader.BorderSizePixel = 0
        Loader.Position = UDim2.new(0.5, 0, 0.5, 0)
        Loader.Size = UDim2.new(0.5, 0, 0.5, 0)

        UIAspectRatioConstraint.Parent = Loader

        Border.Name = 'Border'
        Border.Parent = Loader
        Border.AnchorPoint = Vector2.new(0.5, 0.5)
        Border.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Border.BorderSizePixel = 0
        Border.Position = UDim2.new(0.5, 0, 0.5, 0)
        Border.Size = UDim2.new(1, 8, 1, 8)
        Border.ZIndex = -1

        UICorner.CornerRadius = UDim.new(0, 20)
        UICorner.Parent = Border

        UICorner_2.CornerRadius = UDim.new(0, 16)
        UICorner_2.Parent = Loader

        Icon.Name = 'Icon'
        Icon.Parent = Loader
        Icon.AnchorPoint = Vector2.new(0.5, 0.5)
        Icon.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Icon.BackgroundTransparency = 1.000
        Icon.Position = UDim2.new(0.5, 0, 0.5, 0)
        Icon.Size = UDim2.new(0.75, 0, 0.75, 0)
        Icon.Image = a['rbxassetid://11434416211']

        UIAspectRatioConstraint_2.Parent = Icon

        Key.Name = 'Key'
        Key.Parent = Container
        Key.AnchorPoint = Vector2.new(0.5, 0.5)
        Key.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        Key.BorderColor3 = Color3.fromRGB(24, 25, 38)
        Key.BorderSizePixel = 0
        Key.Position = UDim2.new(0.5, 0, 0.5, 0)
        Key.Size = UDim2.new(0.97299999, 0, 0.660000026, 0)
        Key.Visible = false

        UIAspectRatioConstraint_3.Parent = Key
        UIAspectRatioConstraint_3.AspectRatio = 2.250

        Border_2.Name = 'Border'
        Border_2.Parent = Key
        Border_2.AnchorPoint = Vector2.new(0.5, 0.5)
        Border_2.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Border_2.BorderSizePixel = 0
        Border_2.Position = UDim2.new(0.5, 0, 0.5, 0)
        Border_2.Size = UDim2.new(1, 8, 1, 8)
        Border_2.ZIndex = -1

        UICorner_3.CornerRadius = UDim.new(0, 20)
        UICorner_3.Parent = Border_2

        UICorner_4.CornerRadius = UDim.new(0, 16)
        UICorner_4.Parent = Key

        Icon_2.Name = 'Icon'
        Icon_2.Parent = Key
        Icon_2.AnchorPoint = Vector2.new(0.5, 0.5)
        Icon_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Icon_2.BackgroundTransparency = 1.000
        Icon_2.Position = UDim2.new(0.131224886, 0, 0.5, 0)
        Icon_2.Size = UDim2.new(0.234455898, 0, 0.668276012, 0)
        Icon_2.Image = a['rbxassetid://11434416211']

        UIAspectRatioConstraint_4.Parent = Icon_2

        Container_2.Name = 'Container'
        Container_2.Parent = Key
        Container_2.AnchorPoint = Vector2.new(0, 0.5)
        Container_2.BackgroundColor3 = Global_Editor_Color
        Container_2.Position = UDim2.new(0.25999999, 0, 0.5, 0)
        Container_2.Size = UDim2.new(0.714599609, 0, 0.877767384, 0)

        UICorner_5.CornerRadius = UDim.new(0, 20)
        UICorner_5.Parent = Container_2

        CheckKey.Name = 'CheckKey'
        CheckKey.Parent = Container_2
        CheckKey.AnchorPoint = Vector2.new(1, 1)
        CheckKey.BackgroundColor3 = Global_Button_Color
        CheckKey.Position = UDim2.new(1, -8, 1.00000012, -8)
        CheckKey.Size = UDim2.new(0.421657592, 0, 0.245564342, 0)
        CheckKey.AutoButtonColor = false
        CheckKey.Font = Enum.Font.SourceSans
        CheckKey.Text = ''
        CheckKey.TextColor3 = Global_Text_Color
        CheckKey.TextSize = 14.000

        UICorner_6.CornerRadius = UDim.new(0, 16)
        UICorner_6.Parent = CheckKey

        TextLabel.Parent = CheckKey
        TextLabel.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel.BackgroundTransparency = 1.000
        TextLabel.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel.Size = UDim2.new(1, 0, 0.699999988, 0)
        TextLabel.Font = Enum.Font.SourceSans
        TextLabel.Text = _G.fluxus_ui_values["key_check_key"]
        TextLabel.TextColor3 = Global_Text_Color
        TextLabel.TextScaled = true
        TextLabel.TextSize = 14.000
        TextLabel.TextWrapped = true

        GetKey.Name = 'GetKey'
        GetKey.Parent = Container_2
        GetKey.AnchorPoint = Vector2.new(0, 1)
        GetKey.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        GetKey.Position = UDim2.new(0, 8, 1, -8)
        GetKey.Size = UDim2.new(0.421657592, 0, 0.245564342, 0)
        GetKey.AutoButtonColor = false
        GetKey.Font = Enum.Font.SourceSans
        GetKey.Text = ' '
        GetKey.TextColor3 = Global_Text_Color
        GetKey.TextSize = 14.000

        UICorner_7.CornerRadius = UDim.new(0, 16)
        UICorner_7.Parent = GetKey

        TextLabel_2.Parent = GetKey
        TextLabel_2.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_2.BackgroundTransparency = 1.000
        TextLabel_2.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_2.Size = UDim2.new(1, 0, 0.699999988, 0)
        TextLabel_2.Font = Enum.Font.SourceSans
        TextLabel_2.Text = _G.fluxus_ui_values["key_get_key"]
        TextLabel_2.TextColor3 = Global_Text_Color
        TextLabel_2.TextScaled = true
        TextLabel_2.TextSize = 14.000
        TextLabel_2.TextWrapped = true

        KeyContainer.Name = 'KeyContainer'
        KeyContainer.Parent = Container_2
        KeyContainer.AnchorPoint = Vector2.new(0.5, 0)
        KeyContainer.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        KeyContainer.Position = UDim2.new(0.5, 0, 0, 8)
        KeyContainer.Size = UDim2.new(1, -16, 0.754000008, -24)
        KeyContainer.Font = Enum.Font.SourceSans
        KeyContainer.Text = ''
        KeyContainer.TextColor3 = Global_Text_Color
        KeyContainer.TextSize = 16.000
        KeyContainer.TextWrapped = true
        KeyContainer.TextYAlignment = Enum.TextYAlignment.Top

        UICorner_8.CornerRadius = UDim.new(0, 16)
        UICorner_8.Parent = KeyContainer

        Instructions.Name = 'Instructions'
        Instructions.Parent = KeyContainer
        Instructions.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Instructions.BackgroundTransparency = 1.000
        Instructions.Position = UDim2.new(0.0214072056, 0, 0.0587453023, 0)
        Instructions.Size = UDim2.new(0.952989757, 0, 0.555652499, 0)
        Instructions.Font = Enum.Font.SourceSans
        Instructions.Text =_G.fluxus_ui_values["key_instructions"]
        Instructions.TextColor3 = Global_Text_Color
        Instructions.TextScaled = true
        Instructions.TextSize = 14.000
        Instructions.TextWrapped = true

        KeyBox.Name = 'KeyBox'
        KeyBox.Parent = KeyContainer
        KeyBox.AnchorPoint = Vector2.new(0.5, 1)
        KeyBox.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        KeyBox.BackgroundTransparency = 1.000
        KeyBox.Position = UDim2.new(0.50000006, 0, 0.94668895, 0)
        KeyBox.Size = UDim2.new(1.00000024, 0, 0.257028431, 0)
        KeyBox.Font = Enum.Font.SourceSans
        KeyBox.PlaceholderText = _G.fluxus_ui_values["key_paste_key_here"]
        KeyBox.Text = ''
        KeyBox.TextColor3 = Global_Text_Color
        KeyBox.TextScaled = true
        KeyBox.TextSize = 14.000
        KeyBox.TextWrapped = true

        minimizeContainer.Name = 'minimizeContainer'
        minimizeContainer.Parent = Key
        minimizeContainer.AnchorPoint = Vector2.new(0.5, 0)
        minimizeContainer.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        minimizeContainer.BorderSizePixel = 0
        minimizeContainer.Position = UDim2.new(1, 0, 0, 10)
        minimizeContainer.Size = UDim2.new(0.175999999, 0, 0.207000002, 0)
        minimizeContainer.ZIndex = -1

        UICorner_9.CornerRadius = UDim.new(0, 20)
        UICorner_9.Parent = minimizeContainer

        _1Minimize.Name = '1Minimize'
        _1Minimize.Parent = minimizeContainer
        _1Minimize.AnchorPoint = Vector2.new(1, 0.5)
        _1Minimize.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        _1Minimize.BackgroundTransparency = 1.000
        _1Minimize.BorderSizePixel = 0
        _1Minimize.Position = UDim2.new(1, 0, 0.5, 0)
        _1Minimize.Size = UDim2.new(0.5, 0, 1, 0)
        _1Minimize.ZIndex = 0
        _1Minimize.Image = a['rbxassetid://11447435879']

        UIAspectRatioConstraint_5.Parent = _1Minimize

        UIAspectRatioConstraint_6.Parent = minimizeContainer
        UIAspectRatioConstraint_6.AspectRatio = 2.000

        TransitionUI.Name = 'TransitionUI'
        TransitionUI.Parent = Container
        TransitionUI.AnchorPoint = Vector2.new(0.5, 0.5)
        TransitionUI.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        TransitionUI.BorderColor3 = Color3.fromRGB(24, 25, 38)
        TransitionUI.BorderSizePixel = 0
        TransitionUI.Position = UDim2.new(0.5, 0, 0.5, 0)
        TransitionUI.Size = UDim2.new(0.5, 0, 0.5, 0)
        TransitionUI.Visible = false
        TransitionUI.ZIndex = 50

        Border_3.Name = 'Border'
        Border_3.Parent = TransitionUI
        Border_3.AnchorPoint = Vector2.new(0.5, 0.5)
        Border_3.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Border_3.BorderSizePixel = 0
        Border_3.Position = UDim2.new(0.5, 0, 0.5, 0)
        Border_3.Size = UDim2.new(1, 8, 1, 8)
        Border_3.ZIndex = -1

        UICorner_10.CornerRadius = UDim.new(0, 20)
        UICorner_10.Parent = Border_3

        UICorner_11.CornerRadius = UDim.new(0, 16)
        UICorner_11.Parent = TransitionUI

        MainUI.Name = 'MainUI'
        MainUI.Parent = Container
        MainUI.AnchorPoint = Vector2.new(0.5, 0.5)
        MainUI.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        MainUI.BorderColor3 = Color3.fromRGB(24, 25, 38)
        MainUI.BorderSizePixel = 0
        MainUI.Position = UDim2.new(0.5, 0, 0.5, 0)
        MainUI.Size = UDim2.new(0.808145046, 0, 0.79543215, 0)
        if(Global_Image ~= nil) then
        if(type(Global_Image) == "userdata") then
            MainUI.BackgroundColor3 = Global_Image
        else
            MainUI.Image = Global_Image
        end
        end

        Border_4.Name = 'Border'
        Border_4.Parent = MainUI
        Border_4.AnchorPoint = Vector2.new(0.5, 0.5)
        Border_4.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Border_4.BorderSizePixel = 0
        Border_4.Position = UDim2.new(0.5, 0, 0.5, 0)
        Border_4.Size = UDim2.new(1, 8, 1, 8)
        Border_4.ZIndex = -1

        UICorner_12.CornerRadius = UDim.new(0, 20)
        UICorner_12.Parent = Border_4

        UICorner_13.CornerRadius = UDim.new(0, 16)
        UICorner_13.Parent = MainUI

        Tabs.Name = 'Tabs'
        Tabs.Parent = MainUI
        Tabs.BackgroundColor3 = Global_Tabs_Color
        Tabs.BorderSizePixel = 0
        Tabs.ClipsDescendants = true
        Tabs.Size = UDim2.new(0, 64, 1, 0)

        Scroller.Name = 'Scroller'
        Scroller.Parent = Tabs
        Scroller.Active = true
        Scroller.AnchorPoint = Vector2.new(0.5, 0.5)
        Scroller.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Scroller.BackgroundTransparency = 0.999
        Scroller.BorderColor3 = Color3.fromRGB(30, 32, 48)
        Scroller.Position = UDim2.new(0.5, 0, 0.563784838, 0)
        Scroller.Size = UDim2.new(1, 0, 0.905351698, -32)
        Scroller.BottomImage = 'rbxasset://textures/ui/Scroll/scroll-middle.png'
        Scroller.ScrollBarThickness = 2
        Scroller.TopImage = 'rbxasset://textures/ui/Scroll/scroll-middle.png'
        Scroller.VerticalScrollBarInset = Enum.ScrollBarInset.Always

        UIListLayout.Parent = Scroller
        UIListLayout.SortOrder = Enum.SortOrder.LayoutOrder
        UIListLayout.Padding = UDim.new(0, 8)

        Btn.Name = 'Btn'
        Btn.Parent = Scroller
        Btn.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Btn.BackgroundTransparency = 1.000
        Btn.Size = UDim2.new(1, 0, 1, 0)
        Btn.Image = a['rbxassetid://11434416211']

        UIAspectRatioConstraint_7.Parent = Btn

        UICorner_14.CornerRadius = UDim.new(0, 16)
        UICorner_14.Parent = Btn

        UICorner_15.CornerRadius = UDim.new(0, 16)
        UICorner_15.Parent = Tabs

        _1Minimize_2.Name = '1Minimize'
        _1Minimize_2.Parent = Tabs
        _1Minimize_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        _1Minimize_2.BackgroundTransparency = 1.000
        _1Minimize_2.BorderSizePixel = 0
        _1Minimize_2.Size = UDim2.new(1, 0, 1, 0)
        _1Minimize_2.Image = a['rbxassetid://11447435879']

        UIAspectRatioConstraint_8.Parent = _1Minimize_2

        UIListLayout_2.Parent = Tabs
        UIListLayout_2.Padding = UDim.new(0, 6)

        Content.Name = 'Content'
        Content.Parent = MainUI
        Content.Active = true
        Content.AnchorPoint = Vector2.new(1, 0.5)
        Content.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Content.BackgroundTransparency = 0.999
        Content.BorderSizePixel = 0
        Content.Position = UDim2.new(0.995839119, -8, 0.5, 0)
        Content.Size = UDim2.new(0.995839119, -80, 1, -16)
        Content.BottomImage = 'rbxasset://textures/ui/Scroll/scroll-middle.png'
        Content.ScrollBarThickness = 2
        Content.TopImage = 'rbxasset://textures/ui/Scroll/scroll-middle.png'
        Content.VerticalScrollBarInset = Enum.ScrollBarInset.Always

        UIListLayout_3.Parent = Content
        UIListLayout_3.Padding = UDim.new(0, 8)

        Spacer.Name = 'Spacer'
        Spacer.Parent = Content
        Spacer.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Spacer.BackgroundTransparency = 0.999
        Spacer.Position = UDim2.new(0, 0, 0.204823568, 0)
        Spacer.Size = UDim2.new(0.995999992, 0, 0, 5)

        Text.Name = 'Text'
        Text.Parent = Content
        Text.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Text.BackgroundTransparency = 1.000
        Text.Size = UDim2.new(0.995999992, 0, 0, 30)

        Label.Name = 'Label'
        Label.Parent = Text
        Label.AnchorPoint = Vector2.new(0, 0.5)
        Label.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Label.BackgroundTransparency = 1.000
        Label.Position = UDim2.new(0.00656450912, 0, 0.5, 0)
        Label.Size = UDim2.new(0.96189183, 0, 1, -4)
        Label.Font = Enum.Font.SourceSans
        Label.TextColor3 = Global_Text_Color
        Label.TextSize = 20.000
        Label.TextWrapped = true
        Label.TextXAlignment = Enum.TextXAlignment.Left

        Button.Name = 'Button'
        Button.Parent = Content
        Button.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Button.BackgroundTransparency = 1.000
        Button.Position = UDim2.new(-3.69178785e-08, 0, 0, 0)
        Button.Size = UDim2.new(0.994000018, 0, 0, 30)

        WithText.Name = 'WithText'
        WithText.Parent = Button
        WithText.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        WithText.BackgroundTransparency = 1.000
        WithText.Size = UDim2.new(1, 0, 1, 0)
        WithText.Visible = false

        ActiveButton.Name = 'ActiveButton'
        ActiveButton.Parent = WithText
        ActiveButton.AnchorPoint = Vector2.new(1, 0.5)
        ActiveButton.BackgroundColor3 = Global_Button_Color
        ActiveButton.Position = UDim2.new(0.999999881, -8, 0.5, 0)
        ActiveButton.Size = UDim2.new(1, -16, 1, -4)
        ActiveButton.Visible = false
        ActiveButton.AutoButtonColor = false
        ActiveButton.Font = Enum.Font.SourceSans
        ActiveButton.TextColor3 = Global_Text_Color
        ActiveButton.TextScaled = true
        ActiveButton.TextSize = 14.000
        ActiveButton.TextWrapped = true

        UIAspectRatioConstraint_9.Parent = ActiveButton
        UIAspectRatioConstraint_9.AspectRatio = 3.000
        UIAspectRatioConstraint_9.DominantAxis = Enum.DominantAxis.Height

        UITextSizeConstraint.Parent = ActiveButton
        UITextSizeConstraint.MaxTextSize = 50

        UICorner_16.CornerRadius = UDim.new(0, 16)
        UICorner_16.Parent = ActiveButton

        Label_2.Name = 'Label'
        Label_2.Parent = WithText
        Label_2.AnchorPoint = Vector2.new(0, 0.5)
        Label_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Label_2.BackgroundTransparency = 1.000
        Label_2.Position = UDim2.new(0, 0, 0.5, 0)
        Label_2.Size = UDim2.new(0.892810702, 0, 1, -4)
        Label_2.Font = Enum.Font.SourceSans
        Label_2.TextColor3 = Global_Text_Color
        Label_2.TextScaled = true
        Label_2.TextSize = 14.000
        Label_2.TextWrapped = true
        Label_2.TextXAlignment = Enum.TextXAlignment.Left

        PassiveButton.Name = 'PassiveButton'
        PassiveButton.Parent = WithText
        PassiveButton.AnchorPoint = Vector2.new(1, 0.5)
        PassiveButton.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        PassiveButton.Position = UDim2.new(0.999999881, -8, 0.5, 0)
        PassiveButton.Size = UDim2.new(1, -16, 1, -4)
        PassiveButton.AutoButtonColor = false
        PassiveButton.Font = Enum.Font.SourceSans
        PassiveButton.TextColor3 = Global_Text_Color
        PassiveButton.TextScaled = true
        PassiveButton.TextSize = 14.000
        PassiveButton.TextWrapped = true

        UIAspectRatioConstraint_10.Parent = PassiveButton
        UIAspectRatioConstraint_10.AspectRatio = 3.000
        UIAspectRatioConstraint_10.DominantAxis = Enum.DominantAxis.Height

        UITextSizeConstraint_2.Parent = PassiveButton
        UITextSizeConstraint_2.MaxTextSize = 50

        UICorner_17.CornerRadius = UDim.new(0, 16)
        UICorner_17.Parent = PassiveButton

        NoText.Name = 'NoText'
        NoText.Parent = Button
        NoText.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        NoText.BackgroundTransparency = 1.000
        NoText.Size = UDim2.new(1, 0, 1, 0)

        ActiveButton_2.Name = 'ActiveButton'
        ActiveButton_2.Parent = NoText
        ActiveButton_2.AnchorPoint = Vector2.new(1, 0.5)
        ActiveButton_2.BackgroundColor3 = Global_Button_Color
        ActiveButton_2.Position = UDim2.new(1.00895214, -8, 0.5, 0)
        ActiveButton_2.Size = UDim2.new(1.01790428, -16, 1, -4)
        ActiveButton_2.AutoButtonColor = false
        ActiveButton_2.Font = Enum.Font.SourceSans
        ActiveButton_2.Text = ' '
        ActiveButton_2.TextColor3 = Global_Text_Color
        ActiveButton_2.TextScaled = true
        ActiveButton_2.TextSize = 14.000
        ActiveButton_2.TextWrapped = true

        UITextSizeConstraint_3.Parent = ActiveButton_2
        UITextSizeConstraint_3.MaxTextSize = 50

        UICorner_18.CornerRadius = UDim.new(0, 16)
        UICorner_18.Parent = ActiveButton_2

        TextLabel_3.Parent = ActiveButton_2
        TextLabel_3.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_3.BackgroundTransparency = 1.000
        TextLabel_3.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_3.Size = UDim2.new(1, -16, 1, -6)
        TextLabel_3.Font = Enum.Font.SourceSans
        TextLabel_3.TextColor3 = Global_Text_Color
        TextLabel_3.TextScaled = true
        TextLabel_3.TextSize = 14.000
        TextLabel_3.TextWrapped = true

        PassiveButton_2.Name = 'PassiveButton'
        PassiveButton_2.Parent = NoText
        PassiveButton_2.AnchorPoint = Vector2.new(1, 0.5)
        PassiveButton_2.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        PassiveButton_2.Position = UDim2.new(0.999999881, -8, 0.5, 0)
        PassiveButton_2.Size = UDim2.new(1, -16, 1, -4)
        PassiveButton_2.Visible = false
        PassiveButton_2.AutoButtonColor = false
        PassiveButton_2.Font = Enum.Font.SourceSans
        PassiveButton_2.Text = ' '
        PassiveButton_2.TextColor3 = Global_Text_Color
        PassiveButton_2.TextScaled = true
        PassiveButton_2.TextSize = 14.000
        PassiveButton_2.TextWrapped = true

        UITextSizeConstraint_4.Parent = PassiveButton_2
        UITextSizeConstraint_4.MaxTextSize = 50

        UICorner_19.CornerRadius = UDim.new(0, 16)
        UICorner_19.Parent = PassiveButton_2

        TextLabel_4.Parent = PassiveButton_2
        TextLabel_4.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_4.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_4.BackgroundTransparency = 1.000
        TextLabel_4.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_4.Size = UDim2.new(1, -16, 1, -6)
        TextLabel_4.Font = Enum.Font.SourceSans
        TextLabel_4.TextColor3 = Global_Text_Color
        TextLabel_4.TextScaled = true
        TextLabel_4.TextSize = 14.000
        TextLabel_4.TextWrapped = true

        Checkbox.Name = 'Checkbox'
        Checkbox.Parent = Content
        Checkbox.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Checkbox.BackgroundTransparency = 1.000
        Checkbox.Size = UDim2.new(0.995999992, 0, 0, 30)

        Checked.Name = 'Checked'
        Checked.Parent = Checkbox
        Checked.AnchorPoint = Vector2.new(1, 0.5)
        Checked.BackgroundColor3 = Global_Button_Color
        Checked.Position = UDim2.new(0.999999881, -8, 0.5, 0)
        Checked.Size = UDim2.new(1, -16, 1, -4)
        Checked.AutoButtonColor = false
        Checked.Font = Enum.Font.SourceSans
        Checked.Text = ' '
        Checked.TextColor3 = Global_Text_Color
        Checked.TextScaled = true
        Checked.TextSize = 14.000
        Checked.TextWrapped = true

        UIAspectRatioConstraint_11.Parent = Checked
        UIAspectRatioConstraint_11.DominantAxis = Enum.DominantAxis.Height

        UITextSizeConstraint_5.Parent = Checked
        UITextSizeConstraint_5.MaxTextSize = 50

        UICorner_20.CornerRadius = UDim.new(0, 16)
        UICorner_20.Parent = Checked

        Unchecked.Name = 'Unchecked'
        Unchecked.Parent = Checkbox
        Unchecked.AnchorPoint = Vector2.new(1, 0.5)
        Unchecked.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Unchecked.Position = UDim2.new(0.999999881, -8, 0.5, 0)
        Unchecked.Size = UDim2.new(1, -16, 1, -4)
        Unchecked.Visible = false
        Unchecked.AutoButtonColor = false
        Unchecked.Font = Enum.Font.SourceSans
        Unchecked.Text = ' '
        Unchecked.TextColor3 = Global_Text_Color
        Unchecked.TextScaled = true
        Unchecked.TextSize = 14.000
        Unchecked.TextWrapped = true

        UIAspectRatioConstraint_12.Parent = Unchecked
        UIAspectRatioConstraint_12.DominantAxis = Enum.DominantAxis.Height

        UITextSizeConstraint_6.Parent = Unchecked
        UITextSizeConstraint_6.MaxTextSize = 50

        UICorner_21.CornerRadius = UDim.new(0, 16)
        UICorner_21.Parent = Unchecked

        Label_3.Name = 'Label'
        Label_3.Parent = Checkbox
        Label_3.AnchorPoint = Vector2.new(0, 0.5)
        Label_3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Label_3.BackgroundTransparency = 1.000
        Label_3.Position = UDim2.new(0.0121801738, 0, 0.5, 0)
        Label_3.Size = UDim2.new(0.587819874, 0, 1, -4)
        Label_3.Font = Enum.Font.SourceSans
        Label_3.TextColor3 = Global_Text_Color
        Label_3.TextScaled = true
        Label_3.TextSize = 14.000
        Label_3.TextWrapped = true
        Label_3.TextXAlignment = Enum.TextXAlignment.Left

        Textbox.Name = 'Textbox'
        Textbox.Parent = Content
        Textbox.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Textbox.BackgroundTransparency = 1.000
        Textbox.Size = UDim2.new(0.995999992, 0, 0, 30)

        TextBox.Parent = Textbox
        TextBox.AnchorPoint = Vector2.new(1, 0.5)
        TextBox.BackgroundColor3 = Global_Editor_Color
        TextBox.Position = UDim2.new(0.997991979, 0, 0.5, 0)
        TextBox.Size = UDim2.new(1.01599658, -16, 1.06666672, 0)
        TextBox.Font = Enum.Font.SourceSans
        TextBox.PlaceholderColor3 = Color3.fromRGB(120, 120, 120)
        TextBox.PlaceholderText = 'PlaceholderPlaceholder'
        TextBox.Text = ''
        TextBox.TextColor3 = Global_Text_Color
        TextBox.TextSize = 14.000

        UICorner_22.CornerRadius = UDim.new(0, 16)
        UICorner_22.Parent = TextBox

        TextBoxMultiLine.Name = 'TextBoxMultiLine'
        TextBoxMultiLine.Parent = Content
        TextBoxMultiLine.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextBoxMultiLine.BackgroundTransparency = 1.000
        TextBoxMultiLine.Position = UDim2.new(0, 0, 0.0424371213, 0)
        TextBoxMultiLine.Size = UDim2.new(0.990999997, 0, 0, 193)

        TextBox_2.Parent = TextBoxMultiLine
        TextBox_2.AnchorPoint = Vector2.new(1, 0.5)
        TextBox_2.BackgroundColor3 = Global_Editor_Color
        TextBox_2.Position = UDim2.new(1.0030272, 0, 0.499999851, 0)
        TextBox_2.Size = UDim2.new(1.02098584, -16, 1, 0)
        TextBox_2.ClearTextOnFocus = false
        TextBox_2.Font = Enum.Font.SourceSans
        TextBox_2.MultiLine = true
        TextBox_2.PlaceholderColor3 = Color3.fromRGB(120, 120, 120)
        TextBox_2.PlaceholderText = 'PlaceholderPlaceholder'
        TextBox_2.Text = ''
        TextBox_2.TextColor3 = Global_Text_Color
        TextBox_2.TextSize = 14.000

        UICorner_23.CornerRadius = UDim.new(0, 16)
        UICorner_23.Parent = TextBox_2

        Image.Name = 'Image'
        Image.Parent = Content
        Image.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Image.BackgroundTransparency = 1.000
        Image.Position = UDim2.new(-3.69178785e-08, 0, 0.218284875, 0)
        Image.Size = UDim2.new(0.994000018, 0, 0, 128)

        ImageLabel.Parent = Image
        ImageLabel.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        ImageLabel.BackgroundTransparency = 1.000
        ImageLabel.Size = UDim2.new(1, 0, 1, 0)
        ImageLabel.Image = 'rbxassetid://11440609775'
        ImageLabel.ScaleType = Enum.ScaleType.Crop

        UICorner_24.Parent = ImageLabel

        ExecBox.Name = 'ExecBox'
        ExecBox.Parent = Content
        ExecBox.BackgroundColor3 = Global_Editor_Color
        ExecBox.Position = UDim2.new(-0.0133180944, 0, 0.0632952526, 0)
        ExecBox.Size = UDim2.new(0.997780323, 0, -0.0725846514, 512)
        if(Global_Image ~= nil) then
        if(type(Global_Image) == "userdata") then
            ExecBox.BackgroundTransparency = 0.3
        else
            ExecBox.BackgroundTransparency = 0.1
        end
        end

        if(Global_Editor_Transparent) then
            ExecBox.BackgroundTransparency = 1
        end

        TextBox_3.Parent = ExecBox
        TextBox_3.AnchorPoint = Vector2.new(0.5, 0)
        TextBox_3.BackgroundColor3 = Global_Editor_Color
        TextBox_3.BackgroundTransparency = 0.999
        TextBox_3.BorderSizePixel = 0
        TextBox_3.Position = UDim2.new(0.501114726, 0, 0.0430178083, 0)
        TextBox_3.Size = UDim2.new(0.962097406, 0, 0.961592555, -48)
        TextBox_3.ClearTextOnFocus = false
        TextBox_3.Font = Enum.Font.RobotoMono
        TextBox_3.MultiLine = true
        TextBox_3.PlaceholderColor3 = Color3.fromRGB(120, 120, 120)
        TextBox_3.PlaceholderText = 'print(\'Hello World!\')'
        TextBox_3.Text = ''
        TextBox_3.TextColor3 = Global_Text_Color
        TextBox_3.TextSize = 14.000
        TextBox_3.TextXAlignment = Enum.TextXAlignment.Left
        TextBox_3.TextYAlignment = Enum.TextYAlignment.Top

        box.Name = 'box'
        box.Parent = ExecBox
        box.AnchorPoint = Vector2.new(0, 1)
        box.BackgroundColor3 = Global_Button_Color
        box.Position = UDim2.new(0, 4, 1, -4)
        box.Size = UDim2.new(0.5, -8, 0, 35)
        box.AutoButtonColor = false
        box.Font = Enum.Font.SourceSans
        box.Text = ' '
        box.TextColor3 = Global_Text_Color
        box.TextScaled = true
        box.TextSize = 14.000
        box.TextWrapped = true

        UITextSizeConstraint_7.Parent = box
        UITextSizeConstraint_7.MaxTextSize = 50

        UICorner_25.CornerRadius = UDim.new(0, 16)
        UICorner_25.Parent = box

        TextLabel_5.Parent = box
        TextLabel_5.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_5.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_5.BackgroundTransparency = 1.000
        TextLabel_5.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_5.Size = UDim2.new(1, -16, 1, -6)
        TextLabel_5.Font = Enum.Font.SourceSans
        TextLabel_5.Text = _G.fluxus_ui_values["execute_from_textbox"]
        TextLabel_5.TextColor3 = Global_Text_Color
        TextLabel_5.TextScaled = true
        TextLabel_5.TextSize = 14.000
        TextLabel_5.TextWrapped = true

        clippy.Name = 'clippy'
        clippy.Parent = ExecBox
        clippy.AnchorPoint = Vector2.new(1, 1)
        clippy.BackgroundColor3 = Global_Button_Color
        clippy.Position = UDim2.new(1, -4, 1, -4)
        clippy.Size = UDim2.new(0.5, -8, 0, 35)
        clippy.AutoButtonColor = false
        clippy.Font = Enum.Font.SourceSans
        clippy.Text = ' '
        clippy.TextColor3 = Global_Text_Color
        clippy.TextScaled = true
        clippy.TextSize = 14.000
        clippy.TextWrapped = true

        UITextSizeConstraint_8.Parent = clippy
        UITextSizeConstraint_8.MaxTextSize = 50

        UICorner_26.CornerRadius = UDim.new(0, 16)
        UICorner_26.Parent = clippy

        TextLabel_6.Parent = clippy
        TextLabel_6.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_6.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_6.BackgroundTransparency = 1.000
        TextLabel_6.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_6.Size = UDim2.new(1, -16, 1, -6)
        TextLabel_6.Font = Enum.Font.SourceSans
        TextLabel_6.Text = _G.fluxus_ui_values["execute_from_clipboard"]
        TextLabel_6.TextColor3 = Global_Text_Color
        TextLabel_6.TextScaled = true
        TextLabel_6.TextSize = 14.000
        TextLabel_6.TextWrapped = true

        UICorner_27.CornerRadius = UDim.new(0, 16)
        UICorner_27.Parent = ExecBox

        Search.Name = 'Search'
        Search.Parent = Content
        Search.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Search.BackgroundTransparency = 1.000
        Search.Position = UDim2.new(3.3869668e-08, 0, 0.364753366, 0)
        Search.Size = UDim2.new(0.991793573, 0, 0, 30)

        TextBox_4.Parent = Search
        TextBox_4.AnchorPoint = Vector2.new(1, 0.5)
        TextBox_4.BackgroundColor3 = Global_Editor_Color
        TextBox_4.Position = UDim2.new(0.768081725, 0, 0.5, 0)
        TextBox_4.Size = UDim2.new(0.786086261, -16, 1.06666672, 0)
        TextBox_4.Font = Enum.Font.SourceSans
        TextBox_4.PlaceholderColor3 = Color3.fromRGB(120, 120, 120)
        TextBox_4.PlaceholderText = _G.fluxus_ui_values["search_query_text"]
        TextBox_4.Text = ''
        TextBox_4.TextColor3 = Global_Text_Color
        TextBox_4.TextSize = 14.000

        UICorner_28.CornerRadius = UDim.new(0, 16)
        UICorner_28.Parent = TextBox_4

        ActiveButton_3.Name = 'ActiveButton'
        ActiveButton_3.Parent = Search
        ActiveButton_3.AnchorPoint = Vector2.new(1, 0.5)
        ActiveButton_3.BackgroundColor3 = Global_Button_Color
        ActiveButton_3.Position = UDim2.new(1.00895214, -8, 0.5, 0)
        ActiveButton_3.Size = UDim2.new(0.242938325, -16, 1.20000005, -4)
        ActiveButton_3.AutoButtonColor = false
        ActiveButton_3.Font = Enum.Font.SourceSans
        ActiveButton_3.Text = ' '
        ActiveButton_3.TextColor3 = Global_Text_Color
        ActiveButton_3.TextScaled = true
        ActiveButton_3.TextSize = 14.000
        ActiveButton_3.TextWrapped = true

        UITextSizeConstraint_9.Parent = ActiveButton_3
        UITextSizeConstraint_9.MaxTextSize = 50

        UICorner_29.CornerRadius = UDim.new(0, 16)
        UICorner_29.Parent = ActiveButton_3

        TextLabel_7.Parent = ActiveButton_3
        TextLabel_7.AnchorPoint = Vector2.new(0.5, 0.5)
        TextLabel_7.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        TextLabel_7.BackgroundTransparency = 1.000
        TextLabel_7.Position = UDim2.new(0.5, 0, 0.5, 0)
        TextLabel_7.Size = UDim2.new(1, -16, 1, -6)
        TextLabel_7.Font = Enum.Font.SourceSans
        TextLabel_7.Text = _G.fluxus_ui_values["submit_query"]
        TextLabel_7.TextColor3 = Global_Text_Color
        TextLabel_7.TextScaled = true
        TextLabel_7.TextSize = 14.000
        TextLabel_7.TextWrapped = true

        ToggleBtn.Name = 'ToggleBtn'
        ToggleBtn.Parent = Container
        ToggleBtn.BackgroundColor3 = Color3.fromRGB(36, 39, 58)
        ToggleBtn.BorderColor3 = Color3.fromRGB(24, 25, 38)
        ToggleBtn.BorderSizePixel = 0
        ToggleBtn.Position = UDim2.new(0, 16, 0, 16)
        ToggleBtn.Size = UDim2.new(0.0719999969, 0, 0, 32)
        ToggleBtn.Visible = false

        UIAspectRatioConstraint_13.Parent = ToggleBtn

        Border_5.Name = 'Border'
        Border_5.Parent = ToggleBtn
        Border_5.AnchorPoint = Vector2.new(0.5, 0.5)
        Border_5.BackgroundColor3 = Color3.fromRGB(30, 32, 48)
        Border_5.BorderSizePixel = 0
        Border_5.Position = UDim2.new(0.5, 0, 0.5, 0)
        Border_5.Size = UDim2.new(1, 8, 1, 8)
        Border_5.ZIndex = -1

        UICorner_30.CornerRadius = UDim.new(0, 20)
        UICorner_30.Parent = Border_5

        UICorner_31.CornerRadius = UDim.new(0, 16)
        UICorner_31.Parent = ToggleBtn

        Icon_3.Name = 'Icon'
        Icon_3.Parent = ToggleBtn
        Icon_3.AnchorPoint = Vector2.new(0.5, 0.5)
        Icon_3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        Icon_3.BackgroundTransparency = 1.000
        Icon_3.Position = UDim2.new(0.5, 0, 0.5, 0)
        Icon_3.Size = UDim2.new(0.75, 0, 0.75, 0)
        Icon_3.Image = 'rbxassetid://11434416211'

        UIAspectRatioConstraint_14.Parent = Icon_3

        ClickHandler.Name = 'ClickHandler'
        ClickHandler.Parent = ToggleBtn
        ClickHandler.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
        ClickHandler.BackgroundTransparency = 0.990
        ClickHandler.Size = UDim2.new(1, 0, 1, 0)
        ClickHandler.ZIndex = 2
        ClickHandler.Font = Enum.Font.SourceSans
        ClickHandler.Text = ' '
        ClickHandler.TextColor3 = Color3.fromRGB(0, 0, 0)
        ClickHandler.TextSize = 14.000

        local object1 = rtContainer:GetChildren()[1];
        (object1 or {}).Parent = nil
        rtContainer:Destroy()
        return object1

        end;
        modules['lib/ui/CreateUI.lua'].cache = null;
        modules['lib/ui/CreateUI.lua'].isCached = false;

        ----

        modules['lib/ui/index.lua'] = {};
        modules['lib/ui/index.lua'].load = function()
        -- Deps
        local BaseUI, Dragger = require 'lib/ui/CreateUI.lua', require 'lib/ui/RBXDragger'
        local CFGLib = require 'lib/cfg'
        local cfg = CFGLib.new 'li.flux.ui.builtins'
        local betas = CFGLib.new 'li.flux.ui.betaflags'

        -- Services
        local TweenService = game:GetService 'TweenService'

        -- Code
        local API = {} -- Public API, UI lib shit
        local InternalAPI = {} -- Internal API, only accessible in this project, not for pulic use | ONLY ACCESS THINGS LIKE PREMIUM WITHIN THIS!
        InternalAPI.Components = {}

        --- Creates the UI Instance & Registers it with the Internal API Object
        InternalAPI.CreateUI = function()
        InternalAPI.UI = BaseUI
        for _, o in pairs(InternalAPI.UI:GetDescendants()) do
            if o:IsA 'TextLabel' or o:IsA 'TextButton' then
            o.RichText = true
            elseif o:IsA 'UIListLayout' then
            o.SortOrder = Enum.SortOrder.Name
            end
        end
        InternalAPI.UI.Container.Position = UDim2.fromScale(0.5, 0.5)
        InternalAPI.UI.Container.AnchorPoint = Vector2.new(0.5, 0.5)
        local UIFrames = {}
        for _, o in pairs(InternalAPI.UI.Container:GetChildren()) do
            o.Visible = o.Name == 'Loader'
            UIFrames[o.Name] = o
        end
        InternalAPI.UIFrames = UIFrames
        for _, o in pairs(UIFrames.MainUI.Content:GetChildren()) do
            if o:IsA 'Frame' then
            InternalAPI.Components[o.Name] = o:Clone()
            InternalAPI.Components[o.Name].Size =
                UDim2.new(InternalAPI.Components[o.Name].Size.X, UDim.new(0, InternalAPI.Components[o.Name].AbsoluteSize.Y))
            o:Destroy()
            end
        end
        InternalAPI.BaseContent = UIFrames.MainUI.Content:Clone()
        UIFrames.MainUI.Content:Destroy()
        InternalAPI.SidebarScroller = UIFrames.MainUI.Tabs.Scroller
        InternalAPI.SidebarBtn = InternalAPI.SidebarScroller.Btn:Clone()
        InternalAPI.SidebarScroller.Btn:Destroy()
        game:GetService('RunService').RenderStepped:Connect(function()
            InternalAPI.SidebarScroller.CanvasSize =
            UDim2.fromOffset(0, InternalAPI.SidebarScroller.UIListLayout.AbsoluteContentSize.Y)
        end)
        -- infinite loading anim
        local ti = TweenInfo.new(cfg:get 'fastanim' and 0.3 or 1, Enum.EasingStyle.Sine, Enum.EasingDirection.InOut, -1, true, 0.2)
        local tionce =
            TweenInfo.new(cfg:get 'fastanim' and 0.3 or 1, Enum.EasingStyle.Sine, Enum.EasingDirection.InOut, 0, false, 0)
        TweenService:Create(UIFrames.Loader.Icon, ti, {
            ImageTransparency = 1,
        }):Play()
        -- prepare for initial opening icon
        local endSize = UIFrames.Loader.Size
        UIFrames.Loader.Size = UDim2.new(0, 0, 0, 0)
        -- parent it
        InternalAPI.UI.Parent = gethui();
        API:SetSmallUIEnabled(isfile and isfile(SAVE_DIR .. '.desktop-mode'))
        -- tween it
        local t = TweenService:Create(UIFrames.Loader, tionce, {
            Size = endSize,
        })
        t:Play()
        t.Completed:Wait()
        InternalAPI.UIFrames.TransitionUI.Size = UDim2.fromOffset(UIFrames.Loader.AbsoluteSize.X, UIFrames.Loader.AbsoluteSize.Y)
        InternalAPI.UIFrames.ToggleBtn.ClickHandler.MouseButton1Click:Connect(function()
            API:Unminimize()
        end)
        Dragger(InternalAPI.UIFrames.ToggleBtn, InternalAPI.UIFrames.ToggleBtn.ClickHandler)
        -- Prepare final UI in new thread
        task.spawn(function()
            InternalAPI.UIFrames.MainUI.Tabs:FindFirstChild('1Minimize').MouseButton1Click:Connect(function()
            API:Minimize()
            end)
            InternalAPI.UIFrames.Key.minimizeContainer:FindFirstChild('1Minimize').MouseButton1Click:Connect(function()
            API:Minimize()
            end)
            InternalAPI.UIFrames.Key.minimizeContainer.AnchorPoint = Vector2.new(1, 0)
        end)
        end

        --- Transitions the UI to be a certain size
        InternalAPI.TransitionToSize = function(sizeTo, midPoint, pos, ap)
        local timing = cfg:get 'fastanim' and 0.2 or 1
        if cfg:get 'noanim' then -- andor with this is a pain
            timing = 0
        end
        local ti = TweenInfo.new(timing, Enum.EasingStyle.Sine, Enum.EasingDirection.InOut, 0, false, 0)
        local tui = InternalAPI.UIFrames.TransitionUI
        tui.Visible = true
        tui.BackgroundTransparency = 1
        local t = TweenService:Create(tui, ti, {
            BackgroundTransparency = 0,
        })
        local t2 = TweenService:Create(tui, ti, {
            Size = sizeTo,
            Position = pos or tui.Position,
            AnchorPoint = ap or Vector2.new(0.5, 0.5),
        })
        local t3 = TweenService:Create(tui, ti, {
            BackgroundTransparency = 1,
        })
        t:Play()
        t.Completed:Wait();
        (midPoint or function() end)()
        t2:Play()
        t2.Completed:Wait()
        return function()
            t3:Play()
            t3.Completed:Wait()
            tui.Visible = false
        end
        end

        --- Transition to a certain UI Frame
        InternalAPI.TransitionToUIFrame = function(newName)
        local newFrame = InternalAPI.UIFrames[newName]
        local CompleteTransition = InternalAPI.TransitionToSize(
            UDim2.fromOffset(newFrame.AbsoluteSize.X, newFrame.AbsoluteSize.Y),
            function()
            for n, o in pairs(InternalAPI.UIFrames) do
                o.Visible = n == 'TransitionUI'
            end
            end,
            newFrame.Position,
            newFrame.AnchorPoint
        )
        for n, o in pairs(InternalAPI.UIFrames) do
            o.Visible = n == newName or n == 'TransitionUI'
        end
        CompleteTransition()
        end

        --- Pre-Transition, Prepare from a certain UI Frame
        InternalAPI.PrepareTransition = function(oldName)
        local oldFrame = InternalAPI.UIFrames[oldName]
        InternalAPI.UIFrames.TransitionUI.Size = UDim2.fromOffset(oldFrame.AbsoluteSize.X, oldFrame.AbsoluteSize.Y)
        InternalAPI.UIFrames.TransitionUI.Position = oldFrame.Position
        InternalAPI.UIFrames.TransitionUI.AnchorPoint = oldFrame.AnchorPoint
        end

        --- Register Get Key Click
        InternalAPI.RegisterGetKeyClick = function(cb)
        InternalAPI.UIFrames.Key.Container.GetKey.MouseButton1Click:Connect(cb)
        end

        --- Register Check Key Click
        InternalAPI.RegisterValidateKeyClick = function(cb)
        InternalAPI.UIFrames.Key.Container.CheckKey.MouseButton1Click:Connect(function()
            cb(InternalAPI.UIFrames.Key.Container.KeyContainer.KeyBox.Text)
        end)
        end

        --- (Un)Minimize Functions
        local unminimizeTransitionUIPoint = 'Key'
        local keyMinimizeTween = TweenInfo.new(cfg:get 'fastanim' and 0.2 or 1, Enum.EasingStyle.Quad, Enum.EasingDirection.InOut)
        InternalAPI.KSHideBtn = function()
        local keyMinimizeItem = InternalAPI.UIFrames.Key.minimizeContainer
        if unminimizeTransitionUIPoint == 'Key' and not cfg:get 'noanim' then
            local ts = TweenService:Create(keyMinimizeItem, keyMinimizeTween, { AnchorPoint = Vector2.new(1, 0) })
            ts:Play()
            ts.Completed:Wait()
        else
            keyMinimizeItem.AnchorPoint = Vector2.new(1, 0)
        end
        end
        InternalAPI.KSShowBtn = function()
        local keyMinimizeItem = InternalAPI.UIFrames.Key.minimizeContainer
        if unminimizeTransitionUIPoint == 'Key' and not cfg:get 'noanim' then
            local ts = TweenService:Create(keyMinimizeItem, keyMinimizeTween, { AnchorPoint = Vector2.new(0.5, 0) })
            ts:Play()
            ts.Completed:Wait()
        else
            keyMinimizeItem.AnchorPoint = Vector2.new(0.5, 0)
        end
        end
        API.Minimize = function()
        InternalAPI.KSHideBtn()
        InternalAPI.PrepareTransition(unminimizeTransitionUIPoint)
        InternalAPI.TransitionToUIFrame 'ToggleBtn'
        end
        API.Unminimize = function()
        InternalAPI.PrepareTransition 'ToggleBtn'
        InternalAPI.TransitionToUIFrame(unminimizeTransitionUIPoint)
        InternalAPI.KSShowBtn()
        end

        --- Desktop Mode
        API.SetSmallUIEnabled = function(self, val)
        if typeof(val) == 'nil' and typeof(self) == 'boolean' then
            val = self
        end
        betas:set('uiEmulatedScreenHeight', betas:get 'uiEmulatedScreenHeight' or 1)
        local TargetSize = val and UDim2.new(0.7, 0, betas:get 'uiEmulatedScreenHeight', 0)
            or UDim2.new(1, 0, betas:get 'uiEmulatedScreenHeight', 0)
        local t = TweenService:Create(
            InternalAPI.UI.Container,
            TweenInfo.new(cfg:get 'fastanim' and 0.2 or 1, Enum.EasingStyle.Sine, Enum.EasingDirection.InOut, 0, false, 0),
            {
            Size = TargetSize,
            }
        )
        t:Play()
        t.Completed:Wait()
        require('lib/ui/component/Text')._RerenderAllLabels()
        end

        --- change target unminimize
        InternalAPI.SetUnminimizeTarget = function(frame)
        unminimizeTransitionUIPoint = frame
        end

        --- List of tabs
        InternalAPI.TabFrames = {}

        --- Internal Create Tab Function
        InternalAPI.InternalCreateTab = function(_, icon, id)
        if not icon then
            icon = _
        end
        if not icon then
            error 'bruh no icon specified'
        end
        local tf = InternalAPI.BaseContent:Clone()
        if #InternalAPI.TabFrames ~= 0 then
            tf.Visible = false
        end
        InternalAPI.TabFrames[id] = tf
        tf.Parent = InternalAPI.UIFrames.MainUI

        game:GetService('RunService').RenderStepped:Connect(function()
            tf.CanvasSize = UDim2.fromOffset(0, tf.UIListLayout.AbsoluteContentSize.Y)
        end)

        local TabAPI = {}

        TabAPI.Create = function(this, type, ...)
            local ComponentFrame = InternalAPI.Components[type]
            if not ComponentFrame then
            error('no component ' .. type)
            end
            local inst = ComponentFrame:Clone()
            inst.Name = string.rep('0', 10 - #tostring(tf:GetChildren())) .. #tostring(tf:GetChildren())
            inst.Parent = tf
            local rt = require('lib/ui/component/' .. type)(inst, ...)
            if typeof(rt) == 'table' then
            return setmetatable({
                SetVisible = function(self, status)
                inst.Visible = status
                return self
                end,
            }, {
                __index = rt,
            })
            else
            return rt
            end
        end

        TabAPI.Focus = function()
            for _, o in pairs(InternalAPI.TabFrames) do
            o.Visible = o == tf
            end
        end

        local btn = InternalAPI.SidebarBtn:Clone()
        btn.Parent = InternalAPI.SidebarScroller
        btn.Image = icon
        btn.MouseButton1Click:Connect(TabAPI.Focus)

        return TabAPI
        end
        --- Create Tab Function
        API.CreateTab = function(_, icon)
        return InternalAPI:InternalCreateTab(icon, #InternalAPI.TabFrames + 1)
        end

        -- Export UI
        getgenv().fluxusandroidui = API -- branded ui variable w/ platform
        getgenv().androidui = API -- unbranded ui variable w/ platform
        getgenv().execui = API -- unbranded ui variable w/o platform

        -- Return UI
        return setmetatable(InternalAPI, {
        __index = API,
        })

        end;
        modules['lib/ui/index.lua'].cache = null;
        modules['lib/ui/index.lua'].isCached = false;

        ----

        modules['lib/ui/Pallete.lua'] = {};
        modules['lib/ui/Pallete.lua'].load = function()
        local rgb = require 'lib/rgb'
        return {
        -- https://github.com/catppuccin/catppuccin#-palettes
        Rosewater = rgb(244, 219, 214),
        Flamingo = rgb(240, 198, 198),
        Pink = rgb(245, 189, 230),
        Mauve = rgb(198, 160, 246),
        Red = rgb(237, 135, 150),
        Maroon = rgb(238, 153, 160),
        Peach = rgb(245, 169, 127),
        Yellow = rgb(238, 212, 159),
        Green = rgb(166, 218, 149),
        Teal = rgb(139, 213, 202),
        Sky = rgb(145, 215, 227),
        Sapphire = rgb(125, 196, 228),
        Blue = rgb(138, 173, 244),
        Lavender = rgb(183, 189, 248),
        Text = rgb(202, 211, 245),
        Subtext1 = rgb(184, 192, 224),
        Subtext0 = rgb(165, 173, 203),
        Overlay2 = rgb(147, 154, 183),
        Overlay1 = rgb(128, 135, 162),
        Overlay0 = rgb(110, 115, 141),
        Surface2 = rgb(91, 96, 120),
        Surface1 = rgb(73, 77, 100),
        Surface0 = rgb(54, 58, 79),
        Base = rgb(54, 58, 79),
        Mantle = rgb(30, 32, 48),
        Crust = rgb(24, 25, 38),
        -- custom
        ButtonActive = rgb(141, 115, 176),
        ButtonPassive = rgb(30, 32, 48),
        }

        end;
        modules['lib/ui/Pallete.lua'].cache = null;
        modules['lib/ui/Pallete.lua'].isCached = false;

        ----

        modules['lib/ui/RBXDragger.lua'] = {};
        modules['lib/ui/RBXDragger.lua'].load = function()
        -- Copyright YieldingCoder 2021. All Rights Reserved.
        -- Originally made for BreadHub.
        -- Do not use without permission; I will come after you.
        return function(BaseFrame, DraggableObj)
        if not BaseFrame then
            error 'No baseframe specified for draggable.lua'
        end
        DraggableObj = DraggableObj or BaseFrame

        local UserInputService = game:GetService 'UserInputService'

        local dragging
        local dragInput
        local dragStart
        local startPos

        local function update(input)
            local delta = input.Position - dragStart
            BaseFrame:TweenPosition(
            UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X, startPos.Y.Scale, startPos.Y.Offset + delta.Y),
            'Out',
            'Sine',
            0.2,
            true
            )
        end

        DraggableObj.InputBegan:Connect(function(input)
            if input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch then
            dragging = true
            dragStart = input.Position
            startPos = BaseFrame.Position

            input.Changed:Connect(function()
                if input.UserInputState == Enum.UserInputState.End then
                dragging = false
                end
            end)
            end
        end)

        BaseFrame.InputChanged:Connect(function(input)
            if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
            dragInput = input
            end
        end)

        UserInputService.InputChanged:Connect(function(input)
            if input == dragInput and dragging then
            update(input)
            end
        end)
        end

        end;
        modules['lib/ui/RBXDragger.lua'].cache = null;
        modules['lib/ui/RBXDragger.lua'].isCached = false;

        ----

        modules['lib/ui/_UIFeatureHandler.lua'] = {};
        modules['lib/ui/_UIFeatureHandler.lua'].load = function()
        local items = {}
        local states = {}
        return {
        ['add'] = function(cfg, uiItem)
            if not uiItem or not uiItem.SetVisible then
            error 'not ui element'
            end
            items[cfg] = items[cfg] or {}
            table.insert(items[cfg], uiItem)
            if typeof(states[cfg]) ~= 'nil' then
            uiItem:SetVisible(states[cfg])
            end
            return uiItem
        end,
        ['changeState'] = function(cfg, newVisibleState)
            states[cfg] = newVisibleState
            states['!' .. cfg] = not newVisibleState
            for _, o in pairs(items[cfg] or {}) do
            o:SetVisible(newVisibleState)
            end
            for _, o in pairs(items['!' .. cfg] or {}) do
            o:SetVisible(not newVisibleState)
            end
        end,
        }

        end;
        modules['lib/ui/_UIFeatureHandler.lua'].cache = null;
        modules['lib/ui/_UIFeatureHandler.lua'].isCached = false;

        ----

        modules['lib/ui/component/Button.lua'] = {};
        modules['lib/ui/component/Button.lua'].load = function()
        -- opions: - Button('active'|'passive','btntext', fun?)
        --         - Button('active'|'passive','btntext', sidetext, fun?)
        return function(btn, ...)
        -- handle clicks
        local ClickedRE = Instance.new 'BindableEvent'
        for _, o in pairs(btn:GetDescendants()) do
            if o:IsA 'TextButton' then
            o.MouseButton1Click:Connect(function(...)
                ClickedRE:Fire(...)
            end)
            end
        end

        -- prepare & return api
        local API = {}

        API.Clicked = ClickedRE.Event

        API.SetText = function(self, text)
            for _, o in pairs(btn:GetDescendants()) do
            if o:IsA 'TextButton' then
                if o:FindFirstChildOfClass 'TextLabel' then
                o = o:FindFirstChildOfClass 'TextLabel'
                end

                o.Text = text
            end
            end
            return self
        end

        API._Update = {
            NoText = function(_, active, btntext, fun)
            if not active then
                active = 'passive'
            end
            if not btntext then
                btntext = 'h- hey senpai~ y- you might want to specify the button text ðŸ˜³'
            end
            -- only show notext
            btn.WithText.Visible = false
            btn.NoText.Visible = true
            -- use active/passive
            btn.NoText.ActiveButton.Visible = string.lower(active) == 'active'
            btn.NoText.PassiveButton.Visible = not btn.NoText.ActiveButton.Visible
            -- update text
            API:SetText(btntext)
            -- connect click
            if fun then
                API.Clicked:Connect(fun)
            end
            end,
            WithText = function(_, active, btntext, sidetext, fun)
            -- only show notext
            btn.WithText.Visible = true
            btn.NoText.Visible = false
            -- use active/passive
            btn.WithText.ActiveButton.Visible = string.lower(active) == 'active'
            btn.WithText.PassiveButton.Visible = not btn.WithText.ActiveButton.Visible
            -- update label
            btn.WithText.Label.Text = sidetext
            -- update text
            API:SetText(btntext)
            -- connect click
            if fun then
                API.Clicked:Connect(fun)
            end
            end,
        }
        API.Update = function(self, ...)
            local args = { ... }
            if typeof(args[3]) == 'string' then
            self._Update:WithText(...)
            else
            self._Update:NoText(...)
            end
            return self
        end
        API:Update(...)

        local BaseY = btn.AbsoluteSize.Y
        API._SetScaleY = function(self, scale)
            btn.Size = UDim2.new(btn.Size.X, UDim.new(0, BaseY * scale))
            return self
        end

        return API
        end

        end;
        modules['lib/ui/component/Button.lua'].cache = null;
        modules['lib/ui/component/Button.lua'].isCached = false;

        ----

        modules['lib/ui/component/Checkbox.lua'] = {};
        modules['lib/ui/component/Checkbox.lua'].load = function()
        return function(check, text, default)
        local API = {}
        local ChangedEvent = Instance.new 'BindableEvent'
        API.Status = default or false
        API.RawUpdate = function(self)
            check.Checked.Visible = API.Status
            check.Unchecked.Visible = not API.Status
            return self
        end
        API.Toggle = function(self)
            return self:Set(not self.Status)
        end
        API.Set = function(self, val)
            if self.Status ~= val then
            self.Status = val
            ChangedEvent:Fire(val)
            end
            return self:RawUpdate()
        end
        API.Get = function(self)
            return self.Status
        end
        API.Changed = ChangedEvent.Event
        API.SetText = function(self, t)
            check.Label.Text = t
            return self
        end

        API:SetText(text)
        API:RawUpdate()

        local t = function()
            API:Toggle()
        end
        check.Checked.MouseButton1Click:Connect(t)
        check.Unchecked.MouseButton1Click:Connect(t)

        return API
        end

        end;
        modules['lib/ui/component/Checkbox.lua'].cache = null;
        modules['lib/ui/component/Checkbox.lua'].isCached = false;

        ----

        modules['lib/ui/component/ExecBox.lua'] = {};
        modules['lib/ui/component/ExecBox.lua'].load = function()
        local executescript = require 'patches/PatchReadClipboard'
        return function(item)
        local inp = item.TextBox
        local execTB = item.box
        local execClip = item.clippy
        execClip.MouseButton1Click:Connect(function()
            executescript()
        end)
        execTB.MouseButton1Click:Connect(function()
            executescript(inp.Text)
            pcall(function()
                require('lib/ui/CreateHistoryUI')['\0\1\2\3\4\5\6\7\8\9\240\241\242\243\244\245\246\247\248\249\250\251\252\253\254\255'](
                nil,
                inp.Text
                )
            end)
        end)
        item.Size = UDim2.new(item.Size.X, UDim.new(0, item.Parent.Parent.AbsoluteSize.Y - 72))
        local API = {} -- no api, fuck off | this is done entirely in the component
        return API
        end

        end;
        modules['lib/ui/component/ExecBox.lua'].cache = null;
        modules['lib/ui/component/ExecBox.lua'].isCached = false;

        ----

        modules['lib/ui/component/Image.lua'] = {};
        modules['lib/ui/component/Image.lua'].load = function()
        return function(img, assetid)
        assetid = assetid or 'rbxassetid://11441046007'
        local API = {}
        API.SetImage = function(self, imgid)
            img:FindFirstChildOfClass('ImageLabel').Image = imgid or 'rbxassetid://11441046007'
            return self
        end
        API.SetHeight = function(self, px)
            img.Size = UDim2.new(img.Size.X, UDim.new(0, px))
            return self
        end
        API:SetImage(assetid)
        API:SetHeight(128)

        local ratioConstraint = Instance.new 'UIAspectRatioConstraint'
        API.SetAspectRatio = function(self, ratio)
            if ratio == 0 then
            ratioConstraint.Parent = nil
            else
            ratioConstraint.Parent = img
            ratioConstraint.AspectRatio = ratio
            end
            return self
        end
        API:SetAspectRatio(8)

        return API
        end

        end;
        modules['lib/ui/component/Image.lua'].cache = null;
        modules['lib/ui/component/Image.lua'].isCached = false;

        ----

        modules['lib/ui/component/Search.lua'] = {};
        modules['lib/ui/component/Search.lua'].load = function()
        return function(item, cb)
        item.ActiveButton.MouseButton1Click:Connect(function()
            cb(item.TextBox.Text)
        end)
        local API = {} -- no api, fuck off | this is done entirely in the component
        return API
        end

        end;
        modules['lib/ui/component/Search.lua'].cache = null;
        modules['lib/ui/component/Search.lua'].isCached = false;

        ----

        modules['lib/ui/component/Spacer.lua'] = {};
        modules['lib/ui/component/Spacer.lua'].load = function()
        return function(item, h)
        local API = {}

        API.SetHeight = function(self, newHeight)
            item.Size = UDim2.new(item.Size.X, UDim.new(0, newHeight))
            return self
        end

        if h then
            API:SetHeight(h)
        end

        return API
        end

        end;
        modules['lib/ui/component/Spacer.lua'].cache = null;
        modules['lib/ui/component/Spacer.lua'].isCached = false;

        ----

        modules['lib/ui/component/Text.lua'] = {};
        modules['lib/ui/component/Text.lua'].load = function()
        local labels = {}
        local mt = setmetatable({}, {
        __call = function(_, frame, text)
            frame.Label.RichText = true
            local baselineSize = frame.Size.X
            local updateSize = function()
            local _, nl1 = string.gsub(frame.Label.Text, '\n', '')
            local _, nl2 = string.gsub(frame.Label.Text, '<br/>', '')
            local z = UDim2.new(baselineSize.Scale, baselineSize.Offset, 0, frame.Label.TextBounds.Y)
            frame.Size = UDim2.new(z.X, UDim.new(z.Y.Scale, math.max(z.Y.Offset, 12 * (nl1 + nl2 + 1))))
            end
            text = text or 'no text'
            local API = {}
            API.UpdateText = function(self, t)
            frame.Label.Text = t
            updateSize()
            return self
            end
            API.SetRichTextEnabled = function(self, val)
            frame.Label.RichText = val
            updateSize()
            return self
            end
            API:UpdateText(text)
            table.insert(labels, {
            API = API,
            UpdateSize = updateSize,
            Frame = frame,
            })
            return API
        end,
        __index = {
            ['_RerenderAllLabels'] = function()
            for _, o in pairs(labels) do
                o.UpdateSize()
            end
            end,
        },
        })
        task.spawn(function()
        while task.wait(5) do
            mt._RerenderAllLabels()
        end
        end)
        return mt

        end;
        modules['lib/ui/component/Text.lua'].cache = null;
        modules['lib/ui/component/Text.lua'].isCached = false;

        ----

        modules['lib/ui/component/Textbox.lua'] = {};
        modules['lib/ui/component/Textbox.lua'].load = function()
        return require 'lib/ui/component/TextBoxMultiLine' -- identical

        end;
        modules['lib/ui/component/Textbox.lua'].cache = null;
        modules['lib/ui/component/Textbox.lua'].isCached = false;

        ----

        modules['lib/ui/component/TextBoxMultiLine.lua'] = {};
        modules['lib/ui/component/TextBoxMultiLine.lua'].load = function()
        return function(item)
        local API = {}

        API.SetPlaceholder = function(self, placeholder)
            item.TextBox.PlaceholderText = placeholder
            return self
        end

        API.GetValue = function(_)
            return item.TextBox.Text
        end
        API.SetValue = function(self, newVal)
            if typeof(newVal) ~= 'string' then
            error('Expected type string for argument in position 1, got ' .. typeof(newVal))
            end
            item.TextBox.Text = newVal
            return self
        end

        API.Changed = item.TextBox:GetPropertyChangedSignal 'Text'

        return API
        end

        end;
        modules['lib/ui/component/TextBoxMultiLine.lua'].cache = null;
        modules['lib/ui/component/TextBoxMultiLine.lua'].isCached = false;

        --> END Initial Module Definitions <--


        --> BEGIN Alias/Equivalent Module Path Definitions <--

        modules['asset-obj'] = modules['asset-obj.lua'];
        modules['asset-obj.lua'] = modules['asset-obj.lua'];
        modules['asset-obj'] = modules['asset-obj.lua'];

        ----

        modules['index'] = modules['index.lua'];
        modules['index.lua'] = modules['index.lua'];
        modules['index'] = modules['index.lua'];

        ----

        modules['auth/HandleKeyedAuthentication'] = modules['auth/HandleKeyedAuthentication.lua'];
        modules['auth\\HandleKeyedAuthentication.lua'] = modules['auth/HandleKeyedAuthentication.lua'];
        modules['auth\\HandleKeyedAuthentication'] = modules['auth/HandleKeyedAuthentication.lua'];

        ----

        modules['auth/index'] = modules['auth/index.lua'];
        modules['auth\\index.lua'] = modules['auth/index.lua'];
        modules['auth\\index'] = modules['auth/index.lua'];
        modules['auth'] = modules['auth/index.lua'];
        modules['auth'] = modules['auth/index.lua'];
        modules['auth'] = modules['auth/index.lua'];

        ----

        modules['patches/HookSetfpscap'] = modules['patches/HookSetfpscap.lua'];
        modules['patches\\HookSetfpscap.lua'] = modules['patches/HookSetfpscap.lua'];
        modules['patches\\HookSetfpscap'] = modules['patches/HookSetfpscap.lua'];

        ----

        modules['patches/LoadCfgLib'] = modules['patches/LoadCfgLib.lua'];
        modules['patches\\LoadCfgLib.lua'] = modules['patches/LoadCfgLib.lua'];
        modules['patches\\LoadCfgLib'] = modules['patches/LoadCfgLib.lua'];

        ----

        modules['patches/PatchAuthListfiles'] = modules['patches/PatchAuthListfiles.lua'];
        modules['patches\\PatchAuthListfiles.lua'] = modules['patches/PatchAuthListfiles.lua'];
        modules['patches\\PatchAuthListfiles'] = modules['patches/PatchAuthListfiles.lua'];

        ----

        modules['patches/PatchAuthReads'] = modules['patches/PatchAuthReads.lua'];
        modules['patches\\PatchAuthReads.lua'] = modules['patches/PatchAuthReads.lua'];
        modules['patches\\PatchAuthReads'] = modules['patches/PatchAuthReads.lua'];

        ----

        modules['patches/PatchReadClipboard'] = modules['patches/PatchReadClipboard.lua'];
        modules['patches\\PatchReadClipboard.lua'] = modules['patches/PatchReadClipboard.lua'];
        modules['patches\\PatchReadClipboard'] = modules['patches/PatchReadClipboard.lua'];

        ----

        modules['patches/PatchUnavailableDecompiler'] = modules['patches/PatchUnavailableDecompiler.lua'];
        modules['patches\\PatchUnavailableDecompiler.lua'] = modules['patches/PatchUnavailableDecompiler.lua'];
        modules['patches\\PatchUnavailableDecompiler'] = modules['patches/PatchUnavailableDecompiler.lua'];

        ----

        modules['patches/PolyfillRConsole'] = modules['patches/PolyfillRConsole.lua'];
        modules['patches\\PolyfillRConsole.lua'] = modules['patches/PolyfillRConsole.lua'];
        modules['patches\\PolyfillRConsole'] = modules['patches/PolyfillRConsole.lua'];

        ----

        modules['lib/auth'] = modules['lib/auth.lua'];
        modules['lib\\auth.lua'] = modules['lib/auth.lua'];
        modules['lib\\auth'] = modules['lib/auth.lua'];

        ----

        modules['lib/base64'] = modules['lib/base64.lua'];
        modules['lib\\base64.lua'] = modules['lib/base64.lua'];
        modules['lib\\base64'] = modules['lib/base64.lua'];

        ----

        modules['lib/json'] = modules['lib/json.lua'];
        modules['lib\\json.lua'] = modules['lib/json.lua'];
        modules['lib\\json'] = modules['lib/json.lua'];

        ----

        modules['lib/rgb'] = modules['lib/rgb.lua'];
        modules['lib\\rgb.lua'] = modules['lib/rgb.lua'];
        modules['lib\\rgb'] = modules['lib/rgb.lua'];

        ----

        modules['lib/cfg/index'] = modules['lib/cfg/index.lua'];
        modules['lib\\cfg\\index.lua'] = modules['lib/cfg/index.lua'];
        modules['lib\\cfg\\index'] = modules['lib/cfg/index.lua'];
        modules['lib/cfg'] = modules['lib/cfg/index.lua'];
        modules['lib\\cfg'] = modules['lib/cfg/index.lua'];
        modules['lib\\cfg'] = modules['lib/cfg/index.lua'];

        ----

        modules['lib/scriptblox/index'] = modules['lib/scriptblox/index.lua'];
        modules['lib\\scriptblox\\index.lua'] = modules['lib/scriptblox/index.lua'];
        modules['lib\\scriptblox\\index'] = modules['lib/scriptblox/index.lua'];
        modules['lib/scriptblox'] = modules['lib/scriptblox/index.lua'];
        modules['lib\\scriptblox'] = modules['lib/scriptblox/index.lua'];
        modules['lib\\scriptblox'] = modules['lib/scriptblox/index.lua'];

        ----

        modules['lib/scriptblox/search'] = modules['lib/scriptblox/search.lua'];
        modules['lib\\scriptblox\\search.lua'] = modules['lib/scriptblox/search.lua'];
        modules['lib\\scriptblox\\search'] = modules['lib/scriptblox/search.lua'];

        ----

        modules['lib/debugginglib/index'] = modules['lib/debugginglib/index.lua'];
        modules['lib\\debugginglib\\index.lua'] = modules['lib/debugginglib/index.lua'];
        modules['lib\\debugginglib\\index'] = modules['lib/debugginglib/index.lua'];
        modules['lib/debugginglib'] = modules['lib/debugginglib/index.lua'];
        modules['lib\\debugginglib'] = modules['lib/debugginglib/index.lua'];
        modules['lib\\debugginglib'] = modules['lib/debugginglib/index.lua'];

        ----

        modules['lib/debugginglib/jobs/index'] = modules['lib/debugginglib/jobs/index.lua'];
        modules['lib\\debugginglib\\jobs\\index.lua'] = modules['lib/debugginglib/jobs/index.lua'];
        modules['lib\\debugginglib\\jobs\\index'] = modules['lib/debugginglib/jobs/index.lua'];
        modules['lib/debugginglib/jobs'] = modules['lib/debugginglib/jobs/index.lua'];
        modules['lib\\debugginglib\\jobs'] = modules['lib/debugginglib/jobs/index.lua'];
        modules['lib\\debugginglib\\jobs'] = modules['lib/debugginglib/jobs/index.lua'];

        ----

        modules['lib/debugginglib/jobs/loadstring'] = modules['lib/debugginglib/jobs/loadstring.lua'];
        modules['lib\\debugginglib\\jobs\\loadstring.lua'] = modules['lib/debugginglib/jobs/loadstring.lua'];
        modules['lib\\debugginglib\\jobs\\loadstring'] = modules['lib/debugginglib/jobs/loadstring.lua'];

        ----

        modules['lib/ui/CreateBaseUI'] = modules['lib/ui/CreateBaseUI.lua'];
        modules['lib\\ui\\CreateBaseUI.lua'] = modules['lib/ui/CreateBaseUI.lua'];
        modules['lib\\ui\\CreateBaseUI'] = modules['lib/ui/CreateBaseUI.lua'];

        ----

        modules['lib/ui/CreateHistoryUI'] = modules['lib/ui/CreateHistoryUI.lua'];
        modules['lib\\ui\\CreateHistoryUI.lua'] = modules['lib/ui/CreateHistoryUI.lua'];
        modules['lib\\ui\\CreateHistoryUI'] = modules['lib/ui/CreateHistoryUI.lua'];

        ----

        modules['lib/ui/CreateScriptBloxUI'] = modules['lib/ui/CreateScriptBloxUI.lua'];
        modules['lib\\ui\\CreateScriptBloxUI.lua'] = modules['lib/ui/CreateScriptBloxUI.lua'];
        modules['lib\\ui\\CreateScriptBloxUI'] = modules['lib/ui/CreateScriptBloxUI.lua'];

        ----

        modules['lib/ui/CreateScriptsUI'] = modules['lib/ui/CreateScriptsUI.lua'];
        modules['lib\\ui\\CreateScriptsUI.lua'] = modules['lib/ui/CreateScriptsUI.lua'];
        modules['lib\\ui\\CreateScriptsUI'] = modules['lib/ui/CreateScriptsUI.lua'];

        ----

        modules['lib/ui/CreateSettingsUI'] = modules['lib/ui/CreateSettingsUI.lua'];
        modules['lib\\ui\\CreateSettingsUI.lua'] = modules['lib/ui/CreateSettingsUI.lua'];
        modules['lib\\ui\\CreateSettingsUI'] = modules['lib/ui/CreateSettingsUI.lua'];

        ----

        modules['lib/ui/CreateUI'] = modules['lib/ui/CreateUI.lua'];
        modules['lib\\ui\\CreateUI.lua'] = modules['lib/ui/CreateUI.lua'];
        modules['lib\\ui\\CreateUI'] = modules['lib/ui/CreateUI.lua'];

        ----

        modules['lib/ui/index'] = modules['lib/ui/index.lua'];
        modules['lib\\ui\\index.lua'] = modules['lib/ui/index.lua'];
        modules['lib\\ui\\index'] = modules['lib/ui/index.lua'];
        modules['lib/ui'] = modules['lib/ui/index.lua'];
        modules['lib\\ui'] = modules['lib/ui/index.lua'];
        modules['lib\\ui'] = modules['lib/ui/index.lua'];

        ----

        modules['lib/ui/Pallete'] = modules['lib/ui/Pallete.lua'];
        modules['lib\\ui\\Pallete.lua'] = modules['lib/ui/Pallete.lua'];
        modules['lib\\ui\\Pallete'] = modules['lib/ui/Pallete.lua'];

        ----

        modules['lib/ui/RBXDragger'] = modules['lib/ui/RBXDragger.lua'];
        modules['lib\\ui\\RBXDragger.lua'] = modules['lib/ui/RBXDragger.lua'];
        modules['lib\\ui\\RBXDragger'] = modules['lib/ui/RBXDragger.lua'];

        ----

        modules['lib/ui/_UIFeatureHandler'] = modules['lib/ui/_UIFeatureHandler.lua'];
        modules['lib\\ui\\_UIFeatureHandler.lua'] = modules['lib/ui/_UIFeatureHandler.lua'];
        modules['lib\\ui\\_UIFeatureHandler'] = modules['lib/ui/_UIFeatureHandler.lua'];

        ----

        modules['lib/ui/component/Button'] = modules['lib/ui/component/Button.lua'];
        modules['lib\\ui\\component\\Button.lua'] = modules['lib/ui/component/Button.lua'];
        modules['lib\\ui\\component\\Button'] = modules['lib/ui/component/Button.lua'];

        ----

        modules['lib/ui/component/Checkbox'] = modules['lib/ui/component/Checkbox.lua'];
        modules['lib\\ui\\component\\Checkbox.lua'] = modules['lib/ui/component/Checkbox.lua'];
        modules['lib\\ui\\component\\Checkbox'] = modules['lib/ui/component/Checkbox.lua'];

        ----

        modules['lib/ui/component/ExecBox'] = modules['lib/ui/component/ExecBox.lua'];
        modules['lib\\ui\\component\\ExecBox.lua'] = modules['lib/ui/component/ExecBox.lua'];
        modules['lib\\ui\\component\\ExecBox'] = modules['lib/ui/component/ExecBox.lua'];

        ----

        modules['lib/ui/component/Image'] = modules['lib/ui/component/Image.lua'];
        modules['lib\\ui\\component\\Image.lua'] = modules['lib/ui/component/Image.lua'];
        modules['lib\\ui\\component\\Image'] = modules['lib/ui/component/Image.lua'];

        ----

        modules['lib/ui/component/Search'] = modules['lib/ui/component/Search.lua'];
        modules['lib\\ui\\component\\Search.lua'] = modules['lib/ui/component/Search.lua'];
        modules['lib\\ui\\component\\Search'] = modules['lib/ui/component/Search.lua'];

        ----

        modules['lib/ui/component/Spacer'] = modules['lib/ui/component/Spacer.lua'];
        modules['lib\\ui\\component\\Spacer.lua'] = modules['lib/ui/component/Spacer.lua'];
        modules['lib\\ui\\component\\Spacer'] = modules['lib/ui/component/Spacer.lua'];

        ----

        modules['lib/ui/component/Text'] = modules['lib/ui/component/Text.lua'];
        modules['lib\\ui\\component\\Text.lua'] = modules['lib/ui/component/Text.lua'];
        modules['lib\\ui\\component\\Text'] = modules['lib/ui/component/Text.lua'];

        ----

        modules['lib/ui/component/Textbox'] = modules['lib/ui/component/Textbox.lua'];
        modules['lib\\ui\\component\\Textbox.lua'] = modules['lib/ui/component/Textbox.lua'];
        modules['lib\\ui\\component\\Textbox'] = modules['lib/ui/component/Textbox.lua'];

        ----

        modules['lib/ui/component/TextBoxMultiLine'] = modules['lib/ui/component/TextBoxMultiLine.lua'];
        modules['lib\\ui\\component\\TextBoxMultiLine.lua'] = modules['lib/ui/component/TextBoxMultiLine.lua'];
        modules['lib\\ui\\component\\TextBoxMultiLine'] = modules['lib/ui/component/TextBoxMultiLine.lua'];

        --> END Alias/Equivalent Module Path Definitions <--


        return require 'index'

        end)();
    end
end