; FUN_0082c2ac @ 0082c2ac
0082c2ac	ldrb w8,[x0, #0x14]
0082c2b0	cmp w8,#0x1
0082c2b4	b.ne 0x0082c2ec
0082c2b8	ldr s0,[x0, #0x10]
0082c2bc	adrp x8,0x29a000
0082c2c0	strb wzr,[x0, #0x14]
0082c2c4	ldr d1,[x8, #0x830]
0082c2c8	adrp x8,0x29d000
0082c2cc	uxtl v0.8H,v0.8B
0082c2d0	ldr q2,[x8, #0x150]
0082c2d4	eor v0.8B,v0.8B,v1.8B
0082c2d8	ldr q1,[x0]
0082c2dc	eor v1.16B,v1.16B,v2.16B
0082c2e0	uzp1 v0.8B,v0.8B,v0.8B
0082c2e4	str q1,[x0]
0082c2e8	str s0,[x0, #0x10]
0082c2ec	ret
