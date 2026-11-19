
if not game:IsLoaded() then
    game.Loaded:Wait()
end

task.wait(1)

local bit = (function()
	local bit = {}

	local native = _G.bit or bit32

	if native then
		bit.band = native.band
		bit.bor = native.bor
		bit.bxor = native.bxor
		bit.bnot = native.bnot
		bit.btest = native.btest
		bit.lshift = native.lshift
		bit.rshift = native.rshift
		bit.arshift = native.arshift
		bit.extract = native.extract
		bit.replace = native.replace
		bit.countlz = native.countlz or native.clz
		bit.countrz = native.countrz or native.ctz
		bit.rol = native.lrotate or native.rol
		bit.ror = native.rrotate or native.ror
		bit.bswap = native.byteswap or native.bswap
	else
		error("no bit library found")
	end

	function bit.tobit(x)
		x = bit.band(x, 0xFFFFFFFF)
		if x >= 0x80000000 then
			x = x - 0x100000000
		end
		return x
	end

	function bit.tohex(x, n)
		x = bit.band(x, 0xFFFFFFFF)
		local digits = n or 8
		local upper = digits < 0
		digits = math.abs(digits)
		if digits < 8 then
			x = bit.band(x, bit.lshift(1, digits * 4) - 1)
		end
		return string.format(upper and "%0" .. digits .. "X" or "%0" .. digits .. "x", x)
	end

	function bit.badd(a, b, ...)
		local sum = (bit.band(a, 0xFFFFFFFF) + bit.band(b, 0xFFFFFFFF)) % 0x100000000
		for _, v in { ... } do
			sum = (sum + bit.band(v, 0xFFFFFFFF)) % 0x100000000
		end
		return bit.tobit(sum)
	end

	function bit.bsub(a, b)
		local diff = (bit.band(a, 0xFFFFFFFF) - bit.band(b, 0xFFFFFFFF)) % 0x100000000
		return bit.tobit(diff)
	end

	function bit.bmul(a, b)
		a = bit.band(a, 0xFFFFFFFF)
		b = bit.band(b, 0xFFFFFFFF)
		local aLo, aHi = bit.band(a, 0xFFFF), bit.rshift(a, 16)
		local bLo, bHi = bit.band(b, 0xFFFF), bit.rshift(b, 16)
		local low = aLo * bLo
		local mid = (aLo * bHi + aHi * bLo) % 0x10000
		local result = (low + bit.lshift(mid, 16)) % 0x100000000
		return bit.tobit(result)
	end

	function bit.bdiv(a, b)
		a = bit.tobit(a)
		b = bit.tobit(b)
		assert(b ~= 0, "bit.bdiv: division by zero")
		local q = a / b
		q = q >= 0 and math.floor(q) or math.ceil(q)
		return bit.tobit(q)
	end

	return bit
end)()