; FUN_0082eb80 @ 0082eb80
0082eb80	ldrb w8,[x0, #0x14]
0082eb84	cmp w8,#0x1
0082eb88	b.ne 0x0082ebc0
0082eb8c	ldr s0,[x0, #0x10]
0082eb90	adrp x8,0x29b000
0082eb94	strb wzr,[x0, #0x14]
0082eb98	ldr d1,[x8, #0x408]
0082eb9c	adrp x8,0x29c000
0082eba0	uxtl v0.8H,v0.8B
0082eba4	ldr q2,[x8, #0x810]
0082eba8	eor v0.8B,v0.8B,v1.8B
0082ebac	ldr q1,[x0]
0082ebb0	eor v1.16B,v1.16B,v2.16B
0082ebb4	uzp1 v0.8B,v0.8B,v0.8B
0082ebb8	str q1,[x0]
0082ebbc	str s0,[x0, #0x10]
0082ebc0	ret
