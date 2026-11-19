; FUN_00824d38 @ 00824d38
00824d38	ldrb w8,[x0, #0x5]
00824d3c	cmp w8,#0x1
00824d40	b.ne 0x00824d70
00824d44	ldr s0,[x0]
00824d48	adrp x8,0x29b000
00824d4c	strb wzr,[x0, #0x5]
00824d50	ldr d1,[x8, #0x768]
00824d54	ldrb w8,[x0, #0x4]
00824d58	uxtl v0.8H,v0.8B
00824d5c	eor w8,w8,#0xfffffff3
00824d60	strb w8,[x0, #0x4]
00824d64	eor v0.8B,v0.8B,v1.8B
00824d68	uzp1 v0.8B,v0.8B,v0.8B
00824d6c	str s0,[x0]
00824d70	ret
