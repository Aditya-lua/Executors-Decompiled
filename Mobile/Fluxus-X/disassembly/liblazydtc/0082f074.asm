; FUN_0082f074 @ 0082f074
0082f074	ldrb w8,[x0, #0x14]
0082f078	cmp w8,#0x1
0082f07c	b.ne 0x0082f0b4
0082f080	ldr s0,[x0, #0x10]
0082f084	adrp x8,0x29a000
0082f088	strb wzr,[x0, #0x14]
0082f08c	ldr d1,[x8, #0xce0]
0082f090	adrp x8,0x29c000
0082f094	uxtl v0.8H,v0.8B
0082f098	ldr q2,[x8, #0x820]
0082f09c	eor v0.8B,v0.8B,v1.8B
0082f0a0	ldr q1,[x0]
0082f0a4	eor v1.16B,v1.16B,v2.16B
0082f0a8	uzp1 v0.8B,v0.8B,v0.8B
0082f0ac	str q1,[x0]
0082f0b0	str s0,[x0, #0x10]
0082f0b4	ret
