; FUN_0083d640 @ 0083d640
0083d640	ldrb w8,[x0, #0x16]
0083d644	cmp w8,#0x1
0083d648	b.ne 0x0083d69c
0083d64c	ldr s0,[x0, #0x10]
0083d650	adrp x8,0x29b000
0083d654	ldrb w9,[x0, #0x14]
0083d658	ldr d1,[x8, #0x618]
0083d65c	adrp x8,0x29c000
0083d660	ldrb w10,[x0, #0x15]
0083d664	uxtl v0.8H,v0.8B
0083d668	ldr q2,[x8, #0xa30]
0083d66c	mov w8,#0x5b
0083d670	eor w8,w9,w8
0083d674	eor w9,w10,#0xffffffc1
0083d678	strb wzr,[x0, #0x16]
0083d67c	strb w8,[x0, #0x14]
0083d680	eor v0.8B,v0.8B,v1.8B
0083d684	ldr q1,[x0]
0083d688	strb w9,[x0, #0x15]
0083d68c	eor v1.16B,v1.16B,v2.16B
0083d690	uzp1 v0.8B,v0.8B,v0.8B
0083d694	str q1,[x0]
0083d698	str s0,[x0, #0x10]
0083d69c	ret
