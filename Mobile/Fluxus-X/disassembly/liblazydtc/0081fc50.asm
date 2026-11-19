; FUN_0081fc50 @ 0081fc50
0081fc50	ldrb w8,[x0, #0x14]
0081fc54	cmp w8,#0x1
0081fc58	b.ne 0x0081fc90
0081fc5c	ldr s0,[x0, #0x10]
0081fc60	adrp x8,0x29b000
0081fc64	strb wzr,[x0, #0x14]
0081fc68	ldr d1,[x8, #0x1a0]
0081fc6c	adrp x8,0x29d000
0081fc70	uxtl v0.8H,v0.8B
0081fc74	ldr q2,[x8, #0x10]
0081fc78	eor v0.8B,v0.8B,v1.8B
0081fc7c	ldr q1,[x0]
0081fc80	eor v1.16B,v1.16B,v2.16B
0081fc84	uzp1 v0.8B,v0.8B,v0.8B
0081fc88	str q1,[x0]
0081fc8c	str s0,[x0, #0x10]
0081fc90	ret
