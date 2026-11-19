; FUN_0080e25c @ 0080e25c
0080e25c	ldrb w8,[x0, #0x7a]
0080e260	cmp w8,#0x1
0080e264	b.ne 0x0080e30c
0080e268	adrp x8,0x29b000
0080e26c	ldp d1,d2,[x0]
0080e270	ldr d0,[x8, #0x9a8]
0080e274	ldp d3,d4,[x0, #0x10]
0080e278	ldp d5,d6,[x0, #0x20]
0080e27c	ldrb w8,[x0, #0x78]
0080e280	eor v1.8B,v1.8B,v0.8B
0080e284	eor v2.8B,v2.8B,v0.8B
0080e288	ldrb w9,[x0, #0x79]
0080e28c	eor v3.8B,v3.8B,v0.8B
0080e290	eor v4.8B,v4.8B,v0.8B
0080e294	eor w8,w8,#0xf
0080e298	eor v6.8B,v6.8B,v0.8B
0080e29c	strb w8,[x0, #0x78]
0080e2a0	mov w8,#0x31
0080e2a4	stp d1,d2,[x0]
0080e2a8	eor v1.8B,v5.8B,v0.8B
0080e2ac	eor w8,w9,w8
0080e2b0	ldp d2,d5,[x0, #0x30]
0080e2b4	stp d3,d4,[x0, #0x10]
0080e2b8	strb w8,[x0, #0x79]
0080e2bc	stp d1,d6,[x0, #0x20]
0080e2c0	eor v4.8B,v5.8B,v0.8B
0080e2c4	ldp d3,d5,[x0, #0x40]
0080e2c8	eor v2.8B,v2.8B,v0.8B
0080e2cc	strb wzr,[x0, #0x7a]
0080e2d0	eor v1.8B,v3.8B,v0.8B
0080e2d4	ldp d3,d6,[x0, #0x50]
0080e2d8	eor v5.8B,v5.8B,v0.8B
0080e2dc	stp d2,d4,[x0, #0x30]
0080e2e0	eor v2.8B,v3.8B,v0.8B
0080e2e4	eor v4.8B,v6.8B,v0.8B
0080e2e8	ldp d3,d6,[x0, #0x60]
0080e2ec	stp d1,d5,[x0, #0x40]
0080e2f0	ldr d5,[x0, #0x70]
0080e2f4	stp d2,d4,[x0, #0x50]
0080e2f8	eor v1.8B,v3.8B,v0.8B
0080e2fc	eor v3.8B,v6.8B,v0.8B
0080e300	eor v0.8B,v5.8B,v0.8B
0080e304	stp d1,d3,[x0, #0x60]
0080e308	str d0,[x0, #0x70]
0080e30c	ret
