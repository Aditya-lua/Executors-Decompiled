; FUN_0083f5d8 @ 0083f5d8
0083f5d8	ldrb w8,[x0, #0x12]
0083f5dc	cmp w8,#0x1
0083f5e0	b.ne 0x0083f61c
0083f5e4	adrp x8,0x29c000
0083f5e8	ldr q0,[x0]
0083f5ec	ldrb w9,[x0, #0x10]
0083f5f0	ldr q1,[x8, #0xbd0]
0083f5f4	ldrb w10,[x0, #0x11]
0083f5f8	mov w8,#0xc5
0083f5fc	mov w11,#0x41
0083f600	eor w8,w9,w8
0083f604	strb wzr,[x0, #0x12]
0083f608	eor v0.16B,v0.16B,v1.16B
0083f60c	eor w9,w10,w11
0083f610	strb w8,[x0, #0x10]
0083f614	strb w9,[x0, #0x11]
0083f618	str q0,[x0]
0083f61c	ret
