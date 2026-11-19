; FUN_0083f590 @ 0083f590
0083f590	ldrb w8,[x0, #0x12]
0083f594	cmp w8,#0x1
0083f598	b.ne 0x0083f5d4
0083f59c	adrp x8,0x29c000
0083f5a0	ldr q0,[x0]
0083f5a4	ldrb w9,[x0, #0x10]
0083f5a8	ldr q1,[x8, #0x400]
0083f5ac	ldrb w10,[x0, #0x11]
0083f5b0	mov w8,#0xd1
0083f5b4	mov w11,#0x95
0083f5b8	eor w8,w9,w8
0083f5bc	strb wzr,[x0, #0x12]
0083f5c0	eor v0.16B,v0.16B,v1.16B
0083f5c4	eor w9,w10,w11
0083f5c8	strb w8,[x0, #0x10]
0083f5cc	strb w9,[x0, #0x11]
0083f5d0	str q0,[x0]
0083f5d4	ret
