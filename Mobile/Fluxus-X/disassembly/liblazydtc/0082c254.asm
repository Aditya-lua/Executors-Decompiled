; FUN_0082c254 @ 0082c254
0082c254	ldrb w8,[x0, #0x13]
0082c258	cmp w8,#0x1
0082c25c	b.ne 0x0082c2a8
0082c260	adrp x8,0x29c000
0082c264	ldr q0,[x0]
0082c268	ldrb w9,[x0, #0x10]
0082c26c	ldrb w10,[x0, #0x11]
0082c270	ldr q1,[x8, #0x250]
0082c274	mov w11,#0x15
0082c278	mov w8,#0xd7
0082c27c	eor w9,w9,w11
0082c280	strb wzr,[x0, #0x13]
0082c284	eor w8,w10,w8
0082c288	ldrb w10,[x0, #0x12]
0082c28c	eor v0.16B,v0.16B,v1.16B
0082c290	strb w9,[x0, #0x10]
0082c294	mov w9,#0x9b
0082c298	eor w9,w10,w9
0082c29c	strb w8,[x0, #0x11]
0082c2a0	strb w9,[x0, #0x12]
0082c2a4	str q0,[x0]
0082c2a8	ret
