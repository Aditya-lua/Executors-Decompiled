; FUN_008309c0 @ 008309c0
008309c0	ldrb w8,[x0, #0x16]
008309c4	cmp w8,#0x1
008309c8	b.ne 0x00830a1c
008309cc	ldr s0,[x0, #0x10]
008309d0	adrp x8,0x29a000
008309d4	ldr q2,[x0]
008309d8	ldr d1,[x8, #0xb30]
008309dc	adrp x8,0x29c000
008309e0	ldrb w9,[x0, #0x15]
008309e4	uxtl v0.8H,v0.8B
008309e8	mov w10,#0x89
008309ec	strb wzr,[x0, #0x16]
008309f0	eor w9,w9,w10
008309f4	strb w9,[x0, #0x15]
008309f8	eor v0.8B,v0.8B,v1.8B
008309fc	ldr q1,[x8, #0xae0]
00830a00	ldrb w8,[x0, #0x14]
00830a04	eor v1.16B,v2.16B,v1.16B
00830a08	eor w8,w8,#0xf
00830a0c	uzp1 v0.8B,v0.8B,v0.8B
00830a10	strb w8,[x0, #0x14]
00830a14	str q1,[x0]
00830a18	str s0,[x0, #0x10]
00830a1c	ret
