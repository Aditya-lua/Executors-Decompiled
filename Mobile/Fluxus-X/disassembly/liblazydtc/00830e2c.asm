; FUN_00830e2c @ 00830e2c
00830e2c	ldrb w8,[x0, #0x12]
00830e30	cmp w8,#0x1
00830e34	b.ne 0x00830e68
00830e38	adrp x8,0x29c000
00830e3c	ldr q0,[x0]
00830e40	ldrb w9,[x0, #0x10]
00830e44	ldr q1,[x8, #0x620]
00830e48	ldrb w8,[x0, #0x11]
00830e4c	strb wzr,[x0, #0x12]
00830e50	eor w9,w9,#0xffffffbf
00830e54	eor v0.16B,v0.16B,v1.16B
00830e58	eor w8,w8,#0xffffff83
00830e5c	strb w9,[x0, #0x10]
00830e60	strb w8,[x0, #0x11]
00830e64	str q0,[x0]
00830e68	ret
