; WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<1>>::operator() @ 009a0148
009a0148	sub sp,sp,#0x40
009a014c	str x21,[sp, #0x10]
009a0150	stp x20,x19,[sp, #0x20]
009a0154	stp x29,x30,[sp, #0x30]
009a0158	add x29,sp,#0x30
009a015c	mrs x21,tpidr_el0
009a0160	ldr x8,[x21, #0x28]
009a0164	mov x0,sp
009a0168	mov x20,x2
009a016c	mov x19,x1
009a0170	str x8,[sp, #0x8]
009a0174	bl 0x00c33a30
009a0178	ldp w10,w8,[x19, #0xc]
009a017c	ldp w13,w9,[x19, #0x4]
009a0180	ldr w11,[x20, #0x2c]
009a0184	ldr w12,[x19]
009a0188	mov w14,#0x7999
009a018c	eor w15,w9,w10
009a0190	and w15,w15,w8
009a0194	eor w15,w15,w9
009a0198	add w11,w11,w15
009a019c	ror w16,w12,#0x1b
009a01a0	add w11,w11,w13
009a01a4	movk w14,#0x5a82, LSL #16
009a01a8	add w11,w11,w16
009a01ac	ror w8,w8,#0x2
009a01b0	add w11,w11,w14
009a01b4	str w8,[x19, #0x10]
009a01b8	str w11,[x19, #0x4]
009a01bc	eor w15,w8,w10
009a01c0	ldr w16,[x20, #0x30]
009a01c4	and w15,w12,w15
009a01c8	eor w15,w15,w10
009a01cc	add w9,w9,w15
009a01d0	ror w15,w11,#0x1b
009a01d4	add w9,w9,w16
009a01d8	add w9,w9,w15
009a01dc	ror w12,w12,#0x2
009a01e0	add w9,w9,w14
009a01e4	str w12,[x19]
009a01e8	str w9,[x19, #0x8]
009a01ec	eor w13,w12,w8
009a01f0	ldr w16,[x20, #0x34]
009a01f4	and w13,w11,w13
009a01f8	eor w13,w13,w8
009a01fc	add w10,w10,w13
009a0200	ror w15,w9,#0x1b
009a0204	add w10,w10,w16
009a0208	ror w11,w11,#0x2
009a020c	add w10,w10,w15
009a0210	eor w13,w11,w12
009a0214	add w10,w10,w14
009a0218	and w13,w13,w9
009a021c	str w11,[x19, #0x4]
009a0220	str w10,[x19, #0xc]
009a0224	eor w11,w13,w12
009a0228	ldr w12,[x20, #0x38]
009a022c	add w8,w8,w11
009a0230	ror w10,w10,#0x1b
009a0234	ror w9,w9,#0x2
009a0238	add w8,w8,w12
009a023c	add w8,w8,w10
009a0240	add w8,w8,w14
009a0244	str w9,[x19, #0x8]
009a0248	str w8,[x19, #0x10]
009a024c	ldr x8,[x21, #0x28]
009a0250	ldr x9,[sp, #0x8]
009a0254	cmp x8,x9
009a0258	b.ne 0x009a0270
009a025c	ldp x29,x30,[sp, #0x30]
009a0260	ldp x20,x19,[sp, #0x20]
009a0264	ldr x21,[sp, #0x10]
009a0268	add sp,sp,#0x40
009a026c	ret
009a0270	bl 0x00c2fec0
