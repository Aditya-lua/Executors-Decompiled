; FUN_0082e4b4 @ 0082e4b4
0082e4b4	ldrb w8,[x0, #0x13]
0082e4b8	cmp w8,#0x1
0082e4bc	b.ne 0x0082e508
0082e4c0	adrp x8,0x29d000
0082e4c4	ldr q0,[x0]
0082e4c8	ldrb w9,[x0, #0x10]
0082e4cc	ldrb w10,[x0, #0x11]
0082e4d0	ldr q1,[x8, #0xc0]
0082e4d4	mov w11,#0x91
0082e4d8	mov w8,#0x57
0082e4dc	eor w9,w9,w11
0082e4e0	strb wzr,[x0, #0x13]
0082e4e4	eor w8,w10,w8
0082e4e8	ldrb w10,[x0, #0x12]
0082e4ec	eor v0.16B,v0.16B,v1.16B
0082e4f0	strb w9,[x0, #0x10]
0082e4f4	mov w9,#0x37
0082e4f8	eor w9,w10,w9
0082e4fc	strb w8,[x0, #0x11]
0082e500	strb w9,[x0, #0x12]
0082e504	str q0,[x0]
0082e508	ret
