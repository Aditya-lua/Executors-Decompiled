; FUN_00836e04 @ 00836e04
00836e04	ldrb w8,[x0, #0x15]
00836e08	cmp w8,#0x1
00836e0c	b.ne 0x00836e50
00836e10	ldr s0,[x0, #0x10]
00836e14	adrp x8,0x29a000
00836e18	strb wzr,[x0, #0x15]
00836e1c	ldr d1,[x8, #0xff8]
00836e20	adrp x8,0x29d000
00836e24	uxtl v0.8H,v0.8B
00836e28	ldr q2,[x8, #0xc0]
00836e2c	ldrb w8,[x0, #0x14]
00836e30	eor w8,w8,#0x1f
00836e34	eor v0.8B,v0.8B,v1.8B
00836e38	ldr q1,[x0]
00836e3c	strb w8,[x0, #0x14]
00836e40	eor v1.16B,v1.16B,v2.16B
00836e44	uzp1 v0.8B,v0.8B,v0.8B
00836e48	str q1,[x0]
00836e4c	str s0,[x0, #0x10]
00836e50	ret
