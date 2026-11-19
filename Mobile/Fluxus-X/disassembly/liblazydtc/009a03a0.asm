; WebSocketHandshakeKeyGen::static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator() @ 009a03a0
009a03a0	ldp w9,w10,[x1, #0x8]
009a03a4	ldp w11,w12,[x1]
009a03a8	ldr w14,[x2]
009a03ac	ldr w13,[x1, #0x10]
009a03b0	mov w8,#0x7999
009a03b4	eor w15,w12,w9
009a03b8	and w15,w15,w10
009a03bc	eor w15,w15,w12
009a03c0	add w14,w14,w15
009a03c4	ror w16,w13,#0x1b
009a03c8	add w11,w14,w11
009a03cc	movk w8,#0x5a82, LSL #16
009a03d0	add w11,w11,w16
009a03d4	ror w10,w10,#0x2
009a03d8	add w11,w11,w8
009a03dc	str w10,[x1, #0xc]
009a03e0	str w11,[x1]
009a03e4	eor w15,w10,w9
009a03e8	ldr w16,[x2, #0x4]
009a03ec	and w15,w13,w15
009a03f0	eor w15,w15,w9
009a03f4	add w12,w12,w15
009a03f8	ror w15,w11,#0x1b
009a03fc	add w12,w12,w16
009a0400	add w12,w12,w15
009a0404	ror w13,w13,#0x2
009a0408	add w12,w12,w8
009a040c	str w13,[x1, #0x10]
009a0410	str w12,[x1, #0x4]
009a0414	eor w14,w13,w10
009a0418	ldr w16,[x2, #0x8]
009a041c	and w14,w11,w14
009a0420	eor w14,w14,w10
009a0424	add w9,w9,w14
009a0428	ror w15,w12,#0x1b
009a042c	add w9,w9,w16
009a0430	add w9,w9,w15
009a0434	ror w11,w11,#0x2
009a0438	add w9,w9,w8
009a043c	str w11,[x1]
009a0440	str w9,[x1, #0x8]
009a0444	eor w14,w11,w13
009a0448	ldr w16,[x2, #0xc]
009a044c	and w14,w14,w12
009a0450	eor w14,w14,w13
009a0454	add w10,w10,w14
009a0458	ror w15,w9,#0x1b
009a045c	add w10,w10,w16
009a0460	add w10,w10,w15
009a0464	ror w12,w12,#0x2
009a0468	add w10,w10,w8
009a046c	str w12,[x1, #0x4]
009a0470	str w10,[x1, #0xc]
009a0474	eor w14,w12,w11
009a0478	ldr w16,[x2, #0x10]
009a047c	and w14,w14,w9
009a0480	eor w14,w14,w11
009a0484	add w13,w13,w14
009a0488	ror w15,w10,#0x1b
009a048c	add w13,w13,w16
009a0490	add w13,w13,w15
009a0494	ror w9,w9,#0x2
009a0498	add w13,w13,w8
009a049c	str w9,[x1, #0x8]
009a04a0	str w13,[x1, #0x10]
009a04a4	eor w14,w9,w12
009a04a8	ldr w15,[x2, #0x14]
009a04ac	and w14,w10,w14
009a04b0	eor w14,w14,w12
009a04b4	ror w10,w10,#0x2
009a04b8	add w11,w11,w14
009a04bc	eor w14,w10,w9
009a04c0	ror w16,w13,#0x1b
009a04c4	str w10,[x1, #0xc]
009a04c8	add w10,w11,w15
009a04cc	add w10,w10,w16
009a04d0	add w10,w10,w8
009a04d4	str w10,[x1]
009a04d8	ldr w11,[x2, #0x18]
009a04dc	and w14,w13,w14
009a04e0	eor w9,w14,w9
009a04e4	ror w10,w10,#0x1b
009a04e8	add w11,w12,w11
009a04ec	add w9,w11,w9
009a04f0	add w9,w9,w10
009a04f4	ror w13,w13,#0x2
009a04f8	add w8,w9,w8
009a04fc	str w8,[x1, #0x4]
009a0500	str w13,[x1, #0x10]
009a0504	ret
