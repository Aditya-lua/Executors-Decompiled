; FUN_0080e0f0 @ 0080e0f0
0080e0f0	ldrb w8,[x0, #0x5e]
0080e0f4	cmp w8,#0x1
0080e0f8	b.ne 0x0080e1c4
0080e0fc	adrp x8,0x29b000
0080e100	ldp d1,d2,[x0]
0080e104	ldp d3,d4,[x0, #0x10]
0080e108	mov w9,#0x57
0080e10c	ldr d0,[x8, #0x4a0]
0080e110	ldp d5,d6,[x0, #0x20]
0080e114	ldrb w8,[x0, #0x58]
0080e118	strb wzr,[x0, #0x5e]
0080e11c	eor v1.8B,v1.8B,v0.8B
0080e120	eor v2.8B,v2.8B,v0.8B
0080e124	eor v3.8B,v3.8B,v0.8B
0080e128	eor v4.8B,v4.8B,v0.8B
0080e12c	eor w8,w8,w9
0080e130	mov w9,#0xd5
0080e134	strb w8,[x0, #0x58]
0080e138	ldrb w8,[x0, #0x59]
0080e13c	stp d1,d2,[x0]
0080e140	eor v1.8B,v5.8B,v0.8B
0080e144	eor v5.8B,v6.8B,v0.8B
0080e148	stp d3,d4,[x0, #0x10]
0080e14c	ldp d2,d3,[x0, #0x30]
0080e150	eor w8,w8,w9
0080e154	ldrb w9,[x0, #0x5a]
0080e158	stp d1,d5,[x0, #0x20]
0080e15c	eor v2.8B,v2.8B,v0.8B
0080e160	eor v1.8B,v3.8B,v0.8B
0080e164	strb w8,[x0, #0x59]
0080e168	mov w8,#0x65
0080e16c	ldr d3,[x0, #0x50]
0080e170	eor w8,w9,w8
0080e174	ldrb w9,[x0, #0x5b]
0080e178	strb w8,[x0, #0x5a]
0080e17c	mov w8,#0x69
0080e180	stp d2,d1,[x0, #0x30]
0080e184	ldp d1,d2,[x0, #0x40]
0080e188	eor w8,w9,w8
0080e18c	mov w9,#0xc5
0080e190	strb w8,[x0, #0x5b]
0080e194	ldrb w8,[x0, #0x5c]
0080e198	eor v1.8B,v1.8B,v0.8B
0080e19c	eor v2.8B,v2.8B,v0.8B
0080e1a0	eor v0.8B,v3.8B,v0.8B
0080e1a4	eor w8,w8,w9
0080e1a8	ldrb w9,[x0, #0x5d]
0080e1ac	strb w8,[x0, #0x5c]
0080e1b0	mov w8,#0x8d
0080e1b4	eor w8,w9,w8
0080e1b8	stp d1,d2,[x0, #0x40]
0080e1bc	str d0,[x0, #0x50]
0080e1c0	strb w8,[x0, #0x5d]
0080e1c4	ret
