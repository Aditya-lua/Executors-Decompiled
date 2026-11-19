; FUN_0083f4cc @ 0083f4cc
0083f4cc	ldrb w8,[x0, #0x12]
0083f4d0	cmp w8,#0x1
0083f4d4	b.ne 0x0083f510
0083f4d8	adrp x8,0x29c000
0083f4dc	ldr q0,[x0]
0083f4e0	ldrb w9,[x0, #0x10]
0083f4e4	ldr q1,[x8, #0x100]
0083f4e8	ldrb w10,[x0, #0x11]
0083f4ec	mov w8,#0x7b
0083f4f0	mov w11,#0x2f
0083f4f4	eor w8,w9,w8
0083f4f8	strb wzr,[x0, #0x12]
0083f4fc	eor v0.16B,v0.16B,v1.16B
0083f500	eor w9,w10,w11
0083f504	strb w8,[x0, #0x10]
0083f508	strb w9,[x0, #0x11]
0083f50c	str q0,[x0]
0083f510	ret
