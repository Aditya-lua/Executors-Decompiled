; FUN_0082c048 @ 0082c048
0082c048	ldrb w8,[x0, #0x14]
0082c04c	cmp w8,#0x1
0082c050	b.ne 0x0082c088
0082c054	ldr s0,[x0, #0x10]
0082c058	adrp x8,0x29b000
0082c05c	strb wzr,[x0, #0x14]
0082c060	ldr d1,[x8, #0x4e8]
0082c064	adrp x8,0x29c000
0082c068	uxtl v0.8H,v0.8B
0082c06c	ldr q2,[x8, #0xef0]
0082c070	eor v0.8B,v0.8B,v1.8B
0082c074	ldr q1,[x0]
0082c078	eor v1.16B,v1.16B,v2.16B
0082c07c	uzp1 v0.8B,v0.8B,v0.8B
0082c080	str q1,[x0]
0082c084	str s0,[x0, #0x10]
0082c088	ret
