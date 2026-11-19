; FUN_0083f484 @ 0083f484
0083f484	ldrb w8,[x0, #0x12]
0083f488	cmp w8,#0x1
0083f48c	b.ne 0x0083f4c8
0083f490	adrp x8,0x29d000
0083f494	ldr q0,[x0]
0083f498	ldrb w9,[x0, #0x10]
0083f49c	ldr q1,[x8, #0x1d0]
0083f4a0	ldrb w10,[x0, #0x11]
0083f4a4	mov w8,#0x75
0083f4a8	mov w11,#0x5
0083f4ac	eor w8,w9,w8
0083f4b0	strb wzr,[x0, #0x12]
0083f4b4	eor v0.16B,v0.16B,v1.16B
0083f4b8	eor w9,w10,w11
0083f4bc	strb w8,[x0, #0x10]
0083f4c0	strb w9,[x0, #0x11]
0083f4c4	str q0,[x0]
0083f4c8	ret
