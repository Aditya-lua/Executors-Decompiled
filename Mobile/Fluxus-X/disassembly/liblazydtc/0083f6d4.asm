; FUN_0083f6d4 @ 0083f6d4
0083f6d4	ldrb w8,[x0, #0x11]
0083f6d8	cmp w8,#0x1
0083f6dc	b.ne 0x0083f708
0083f6e0	adrp x8,0x29c000
0083f6e4	ldr q0,[x0]
0083f6e8	mov w9,#0xa9
0083f6ec	ldr q1,[x8, #0x8c0]
0083f6f0	ldrb w8,[x0, #0x10]
0083f6f4	strb wzr,[x0, #0x11]
0083f6f8	eor v0.16B,v0.16B,v1.16B
0083f6fc	eor w8,w8,w9
0083f700	strb w8,[x0, #0x10]
0083f704	str q0,[x0]
0083f708	ret
