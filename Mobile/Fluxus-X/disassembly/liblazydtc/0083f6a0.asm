; FUN_0083f6a0 @ 0083f6a0
0083f6a0	ldrb w8,[x0, #0x11]
0083f6a4	cmp w8,#0x1
0083f6a8	b.ne 0x0083f6d0
0083f6ac	adrp x8,0x29c000
0083f6b0	ldr q0,[x0]
0083f6b4	strb wzr,[x0, #0x11]
0083f6b8	ldr q1,[x8, #0xfa0]
0083f6bc	ldrb w8,[x0, #0x10]
0083f6c0	eor v0.16B,v0.16B,v1.16B
0083f6c4	eor w8,w8,#0x33333333
0083f6c8	strb w8,[x0, #0x10]
0083f6cc	str q0,[x0]
0083f6d0	ret
