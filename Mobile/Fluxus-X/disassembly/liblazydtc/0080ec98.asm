; FUN_0080ec98 @ 0080ec98
0080ec98	ldrb w8,[x0, #0x12]
0080ec9c	cmp w8,#0x1
0080eca0	b.ne 0x0080ecdc
0080eca4	adrp x8,0x29c000
0080eca8	ldr q0,[x0]
0080ecac	ldrb w9,[x0, #0x10]
0080ecb0	ldr q1,[x8, #0xd30]
0080ecb4	ldrb w10,[x0, #0x11]
0080ecb8	mov w8,#0x7b
0080ecbc	mov w11,#0x59
0080ecc0	eor w8,w9,w8
0080ecc4	strb wzr,[x0, #0x12]
0080ecc8	eor v0.16B,v0.16B,v1.16B
0080eccc	eor w9,w10,w11
0080ecd0	strb w8,[x0, #0x10]
0080ecd4	strb w9,[x0, #0x11]
0080ecd8	str q0,[x0]
0080ecdc	ret
