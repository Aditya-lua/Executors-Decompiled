; FUN_00836f2c @ 00836f2c
00836f2c	ldrb w8,[x0, #0x15]
00836f30	cmp w8,#0x1
00836f34	b.ne 0x00836f7c
00836f38	ldr s0,[x0, #0x10]
00836f3c	adrp x8,0x29a000
00836f40	mov w9,#0x65
00836f44	ldr d1,[x8, #0x9d0]
00836f48	adrp x8,0x29d000
00836f4c	strb wzr,[x0, #0x15]
00836f50	uxtl v0.8H,v0.8B
00836f54	ldr q2,[x8, #0x1c0]
00836f58	ldrb w8,[x0, #0x14]
00836f5c	eor w8,w8,w9
00836f60	eor v0.8B,v0.8B,v1.8B
00836f64	ldr q1,[x0]
00836f68	strb w8,[x0, #0x14]
00836f6c	eor v1.16B,v1.16B,v2.16B
00836f70	uzp1 v0.8B,v0.8B,v0.8B
00836f74	str q1,[x0]
00836f78	str s0,[x0, #0x10]
00836f7c	ret
