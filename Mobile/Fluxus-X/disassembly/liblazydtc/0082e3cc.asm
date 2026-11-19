; FUN_0082e3cc @ 0082e3cc
0082e3cc	ldrb w8,[x0, #0x11]
0082e3d0	cmp w8,#0x1
0082e3d4	b.ne 0x0082e400
0082e3d8	adrp x8,0x29c000
0082e3dc	ldr q0,[x0]
0082e3e0	mov w9,#0xa9
0082e3e4	ldr q1,[x8, #0x330]
0082e3e8	ldrb w8,[x0, #0x10]
0082e3ec	strb wzr,[x0, #0x11]
0082e3f0	eor v0.16B,v0.16B,v1.16B
0082e3f4	eor w8,w8,w9
0082e3f8	strb w8,[x0, #0x10]
0082e3fc	str q0,[x0]
0082e400	ret
