; FUN_0082e9dc @ 0082e9dc
0082e9dc	ldrb w8,[x0, #0x11]
0082e9e0	cmp w8,#0x1
0082e9e4	b.ne 0x0082ea0c
0082e9e8	adrp x8,0x29c000
0082e9ec	ldr q0,[x0]
0082e9f0	strb wzr,[x0, #0x11]
0082e9f4	ldr q1,[x8, #0xe70]
0082e9f8	ldrb w8,[x0, #0x10]
0082e9fc	eor v0.16B,v0.16B,v1.16B
0082ea00	eor w8,w8,#0xffffffe3
0082ea04	strb w8,[x0, #0x10]
0082ea08	str q0,[x0]
0082ea0c	ret
