; FUN_0082c194 @ 0082c194
0082c194	ldrb w8,[x0, #0x13]
0082c198	cmp w8,#0x1
0082c19c	b.ne 0x0082c1e4
0082c1a0	adrp x8,0x29d000
0082c1a4	ldrb w9,[x0, #0x10]
0082c1a8	ldrb w10,[x0, #0x11]
0082c1ac	ldr q0,[x0]
0082c1b0	ldr q1,[x8, #0x140]
0082c1b4	mov w8,#0x15
0082c1b8	eor w8,w10,w8
0082c1bc	ldrb w10,[x0, #0x12]
0082c1c0	eor w9,w9,#0xfffffff9
0082c1c4	eor v0.16B,v0.16B,v1.16B
0082c1c8	strb w9,[x0, #0x10]
0082c1cc	mov w9,#0x57
0082c1d0	eor w9,w10,w9
0082c1d4	strb w8,[x0, #0x11]
0082c1d8	strb w9,[x0, #0x12]
0082c1dc	str q0,[x0]
0082c1e0	strb wzr,[x0, #0x13]
0082c1e4	ret
