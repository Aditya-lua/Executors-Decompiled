; FUN_0082f0b8 @ 0082f0b8
0082f0b8	ldrb w8,[x0, #0x12]
0082f0bc	cmp w8,#0x1
0082f0c0	b.ne 0x0082f0f8
0082f0c4	adrp x8,0x29c000
0082f0c8	ldr q0,[x0]
0082f0cc	ldrb w9,[x0, #0x10]
0082f0d0	ldr q1,[x8, #0x970]
0082f0d4	ldrb w8,[x0, #0x11]
0082f0d8	mov w10,#0x91
0082f0dc	eor w9,w9,#0x3f
0082f0e0	strb wzr,[x0, #0x12]
0082f0e4	eor v0.16B,v0.16B,v1.16B
0082f0e8	eor w8,w8,w10
0082f0ec	strb w9,[x0, #0x10]
0082f0f0	strb w8,[x0, #0x11]
0082f0f4	str q0,[x0]
0082f0f8	ret
