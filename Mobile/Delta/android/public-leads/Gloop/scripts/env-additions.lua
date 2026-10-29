if not game:IsLoaded() then
	repeat
		task.wait()
	until game:IsLoaded();
end

--[[ Variables ]]--
local virtualInputManager = cloneref(Instance.new("VirtualInputManager"));
local guiService = cloneref(game:GetService("GuiService"));

local mouse = cloneref(game:GetService("Players").LocalPlayer:GetMouse());
local mouseButton1 = Enum.UserInputType.MouseButton1;
local mouseButton2 = Enum.UserInputType.MouseButton2;

local genv = getgenv();

local _assert = clonefunction(assert);
local _mathabs = clonefunction(math.abs);
local _mathfloor = clonefunction(math.floor);
local _stringformat = clonefunction(string.format);
local _taskwait = clonefunction(task.wait);
local _tonumber = clonefunction(tonumber);
local _typeof = clonefunction(typeof);

local _sendKeyEvent = clonefunction(virtualInputManager.SendKeyEvent);
local _sendMouseButtonEvent = clonefunction(virtualInputManager.SendMouseButtonEvent);
local _sendMouseMoveEvent = clonefunction(virtualInputManager.SendMouseMoveEvent);
local _sendMouseWheelEvent = clonefunction(virtualInputManager.SendMouseWheelEvent);

local _getGuiInset = clonefunction(guiService.GetGuiInset);

--[[ Functions ]]--

do
    local keyToEnum = {
        [0x08] = Enum.KeyCode.Backspace;
        [0x09] = Enum.KeyCode.Tab;
        [0x0C] = Enum.KeyCode.Clear;
        [0x0D] = Enum.KeyCode.Return;
        [0x10] = Enum.KeyCode.LeftShift;
        [0x11] = Enum.KeyCode.LeftControl;
        [0x12] = Enum.KeyCode.LeftAlt;
        [0xA5] = Enum.KeyCode.RightAlt;
        [0x13] = Enum.KeyCode.Pause;
        [0x14] = Enum.KeyCode.CapsLock;
        [0x1B] = Enum.KeyCode.Escape;
        [0x20] = Enum.KeyCode.Space;
        [0x21] = Enum.KeyCode.PageUp;
        [0x22] = Enum.KeyCode.PageDown;
        [0x23] = Enum.KeyCode.End;
        [0x24] = Enum.KeyCode.Home;
        [0x25] = Enum.KeyCode.Left;
        [0x26] = Enum.KeyCode.Up;
        [0x27] = Enum.KeyCode.Right;
        [0x28] = Enum.KeyCode.Down;
        [0x2A] = Enum.KeyCode.Print;
        [0x2D] = Enum.KeyCode.Insert;
        [0x2E] = Enum.KeyCode.Delete;
        [0x2F] = Enum.KeyCode.Help;
        [0x30] = Enum.KeyCode.Zero;
        [0x31] = Enum.KeyCode.One;
        [0x32] = Enum.KeyCode.Two;
        [0x33] = Enum.KeyCode.Three;
        [0x34] = Enum.KeyCode.Four;
        [0x35] = Enum.KeyCode.Five;
        [0x36] = Enum.KeyCode.Six;
        [0x37] = Enum.KeyCode.Seven;
        [0x38] = Enum.KeyCode.Eight;
        [0x39] = Enum.KeyCode.Nine;
        [0x41] = Enum.KeyCode.A;
        [0x42] = Enum.KeyCode.B;
        [0x43] = Enum.KeyCode.C;
        [0x44] = Enum.KeyCode.D;
        [0x45] = Enum.KeyCode.E;
        [0x46] = Enum.KeyCode.F;
        [0x47] = Enum.KeyCode.G;
        [0x48] = Enum.KeyCode.H;
        [0x49] = Enum.KeyCode.I;
        [0x4A] = Enum.KeyCode.J;
        [0x4B] = Enum.KeyCode.K;
        [0x4C] = Enum.KeyCode.L;
        [0x4D] = Enum.KeyCode.M;
        [0x4E] = Enum.KeyCode.N;
        [0x4F] = Enum.KeyCode.O;
        [0x50] = Enum.KeyCode.P;
        [0x51] = Enum.KeyCode.Q;
        [0x52] = Enum.KeyCode.R;
        [0x53] = Enum.KeyCode.S;
        [0x54] = Enum.KeyCode.T;
        [0x55] = Enum.KeyCode.U;
        [0x56] = Enum.KeyCode.V;
        [0x57] = Enum.KeyCode.W;
        [0x58] = Enum.KeyCode.X;
        [0x59] = Enum.KeyCode.Y;
        [0x5A] = Enum.KeyCode.Z;
        [0x5B] = Enum.KeyCode.LeftSuper;
        [0x5C] = Enum.KeyCode.RightSuper;
        [0x60] = Enum.KeyCode.KeypadZero;
        [0x61] = Enum.KeyCode.KeypadOne;
        [0x62] = Enum.KeyCode.KeypadTwo;
        [0x63] = Enum.KeyCode.KeypadThree;
        [0x64] = Enum.KeyCode.KeypadFour;
        [0x65] = Enum.KeyCode.KeypadFive;
        [0x66] = Enum.KeyCode.KeypadSix;
        [0x67] = Enum.KeyCode.KeypadSeven;
        [0x68] = Enum.KeyCode.KeypadEight;
        [0x69] = Enum.KeyCode.KeypadNine;
        [0x6A] = Enum.KeyCode.Asterisk;
        [0x6B] = Enum.KeyCode.Plus;
        [0x6D] = Enum.KeyCode.Minus;
        [0x6E] = Enum.KeyCode.Period;
        [0x6F] = Enum.KeyCode.Slash;
        [0x70] = Enum.KeyCode.F1;
        [0x71] = Enum.KeyCode.F2;
        [0x72] = Enum.KeyCode.F3;
        [0x73] = Enum.KeyCode.F4;
        [0x74] = Enum.KeyCode.F5;
        [0x75] = Enum.KeyCode.F6;
        [0x76] = Enum.KeyCode.F7;
        [0x77] = Enum.KeyCode.F8;
        [0x78] = Enum.KeyCode.F9;
        [0x79] = Enum.KeyCode.F10;
        [0x7A] = Enum.KeyCode.F11;
        [0x7B] = Enum.KeyCode.F12;
        [0x7C] = Enum.KeyCode.F13;
        [0x7D] = Enum.KeyCode.F14;
        [0x7E] = Enum.KeyCode.F15;
        [0x90] = Enum.KeyCode.NumLock;
        [0x91] = Enum.KeyCode.ScrollLock;
        [0xA0] = Enum.KeyCode.LeftShift;
        [0xA1] = Enum.KeyCode.RightShift;
        [0xA2] = Enum.KeyCode.LeftControl;
        [0xA3] = Enum.KeyCode.RightControl;
        [0xFE] = Enum.KeyCode.Clear;
        [0xBB] = Enum.KeyCode.Equals;
        [0xDB] = Enum.KeyCode.LeftBracket;
        [0xDD] = Enum.KeyCode.RightBracket;
    };

    local getEnumFromKey = newcclosure(function(key)
        return keyToEnum[key] or Enum.KeyCode.Unknown;
    end);

    genv.keypress = newcclosure(function(key)
		local keyType = _typeof(key);
		_assert(keyType == "string" or keyType == "number" or (keyType == "EnumItem" and key.EnumType == Enum.KeyCode), "invalid argument #1 to 'keypress' (string or number or KeyCode expected)");
        _sendKeyEvent(virtualInputManager, true, keyType == "EnumItem" and key or getEnumFromKey(keyType == "string" and _tonumber(key) or key), false, nil);
    end);

    genv.keyrelease = newcclosure(function(key)
		local keyType = _typeof(key);
		_assert(keyType == "string" or keyType == "number" or (keyType == "EnumItem" and key.EnumType == Enum.KeyCode), "invalid argument #1 to 'keyrelease' (string or number or KeyCode expected)");
        _sendKeyEvent(virtualInputManager, false, keyType == "EnumItem" and key or getEnumFromKey(keyType == "string" and _tonumber(key) or key), false, nil);
    end);

	genv.keyclick = newcclosure(function(key)
		local keyType = _typeof(key);
		_assert(keyType == "string" or keyType == "number" or (keyType == "EnumItem" and key.EnumType == Enum.KeyCode), "invalid argument #1 to 'keyclick' (string or number or KeyCode expected)");
		local input = keyType == "EnumItem" and key or getEnumFromKey(keyType == "string" and _tonumber(key) or key);
        _sendKeyEvent(virtualInputManager, true, input, false, nil);
        _sendKeyEvent(virtualInputManager, false, input, false, nil);
    end);
end

genv.mouse1press = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse1press' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse1press' (number or nil expected)");
    _sendMouseButtonEvent(virtualInputManager, x or mouse.X, y or mouse.Y, mouseButton1, true, nil, 0);
end);

genv.mouse1release = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse1release' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse1release' (number or nil expected)");
    _sendMouseButtonEvent(virtualInputManager, x or mouse.X, y or mouse.Y, mouseButton1, false, nil, 0);
end);

genv.mouse1click = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse1click' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse1click' (number or nil expected)");
    local clickX, clickY = x or mouse.X, y or mouse.Y;
    _sendMouseButtonEvent(virtualInputManager, clickX, clickY, mouseButton1, true, nil, 0);
    _sendMouseButtonEvent(virtualInputManager, clickX, clickY, mouseButton1, false, nil, 0);
end);

genv.mouse2press = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse2press' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse2press' (number or nil expected)");
    _sendMouseButtonEvent(virtualInputManager, x or mouse.X, y or mouse.Y, mouseButton2, true, nil, 0);
end);

genv.mouse2release = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse2release' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse2release' (number or nil expected)");
    _sendMouseButtonEvent(virtualInputManager, x or mouse.X, y or mouse.Y, mouseButton2, false, nil, 0);
end);

genv.mouse2click = newcclosure(function(x, y)
	_assert(x == nil or _typeof(x) == "number", "invalid argument #1 to 'mouse2click' (number or nil expected)");
	_assert(y == nil or _typeof(y) == "number", "invalid argument #2 to 'mouse2click' (number or nil expected)");
    local clickX, clickY = x or mouse.X, y or mouse.Y;
    _sendMouseButtonEvent(virtualInputManager, clickX, clickY, mouseButton2, true, nil, 0);
    _sendMouseButtonEvent(virtualInputManager, clickX, clickY, mouseButton2, false, nil, 0);
end);

genv.mousemoverel = newcclosure(function(x, y)
	_assert(_typeof(x) == "number", _stringformat("invalid argument #1 to 'mousemoverel' (number expected, got %s)", _typeof(x)));
	_assert(_typeof(y) == "number", _stringformat("invalid argument #2 to 'mousemoverel' (number expected, got %s)", _typeof(y)));
    local inset = _getGuiInset(guiService);
    _sendMouseMoveEvent(virtualInputManager, mouse.X + inset.X + x, mouse.Y + inset.Y + y, nil);
end);

genv.mousemoveabs = newcclosure(function(x, y)
	_assert(_typeof(x) == "number", _stringformat("invalid argument #1 to 'mousemoveabs' (number expected, got %s)", _typeof(x)));
	_assert(_typeof(y) == "number", _stringformat("invalid argument #2 to 'mousemoveabs' (number expected, got %s)", _typeof(y)));
    local inset = _getGuiInset(guiService);
    _sendMouseMoveEvent(virtualInputManager, inset.X + x, inset.Y + y, nil);
end);

genv.mousescroll = newcclosure(function(amount)
	_assert(_typeof(amount) == "number", _stringformat("invalid argument #1 to 'mousescroll' (number expected, got %s)", _typeof(amount)));
    for i = 1, _mathabs(_mathfloor(amount / 120)) do
        _sendMouseWheelEvent(virtualInputManager, mouse.X, mouse.Y, amount >= 0, nil);
        _taskwait();
    end
end);

genv.decompile = newcclosure(function(target)
    	local bytecode = getscriptbytecode(target)

    	if bytecode then
        	local output = request({
            		Url = "http://api.plusgiant5.com/konstant/decompile", -- found in dex. credits to plusgiant5 🙏
            		Method = "POST",
            		Body = bytecode,
			Headers = {
				["Content-Type"] = "text/plain"
			}
        	})
      
        	if output.StatusCode == 200 then
            		return output.Body
        	end

        	return "-- failed to decompile bytecode: " .. output.StatusMessage
    	end

	return "-- failed to decompile bytecode"
end)

genv.iy = newcclosure(function()
	loadstring(game:HttpGet("https://raw.githubusercontent.com/EdgeIY/infiniteyield/master/source"))()
end)
