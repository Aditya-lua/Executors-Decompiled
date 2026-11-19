; FUN_0083f668 @ 0083f668
0083f668	ldrb w8,[x0, #0x11]
0083f66c	cmp w8,#0x1
0083f670	b.ne 0x0083f69c
0083f674	adrp x8,0x29c000
0083f678	ldr q0,[x0]
0083f67c	mov w9,#0x17
0083f680	ldr q1,[x8, #0xc60]
0083f684	ldrb w8,[x0, #0x10]
0083f688	strb wzr,[x0, #0x11]
0083f68c	eor v0.16B,v0.16B,v1.16B
0083f690	eor w8,w8,w9
0083f694	strb w8,[x0, #0x10]
0083f698	str q0,[x0]
0083f69c	ret
