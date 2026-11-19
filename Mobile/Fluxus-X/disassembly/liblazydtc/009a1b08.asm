; WebSocketHandshakeKeyGen::static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator() @ 009a1b08
009a1b08	sub sp,sp,#0x40
009a1b0c	str x21,[sp, #0x10]
009a1b10	stp x20,x19,[sp, #0x20]
009a1b14	stp x29,x30,[sp, #0x30]
009a1b18	add x29,sp,#0x30
009a1b1c	mrs x21,tpidr_el0
009a1b20	ldr x8,[x21, #0x28]
009a1b24	mov x0,sp
009a1b28	mov x20,x2
009a1b2c	mov x19,x1
009a1b30	str x8,[sp, #0x8]
009a1b34	bl 0x00c33b00
009a1b38	ldr w9,[x20, #0x30]
009a1b3c	ldr w10,[x20, #0x1c]
009a1b40	ldr w11,[x20, #0x4]
009a1b44	ldr w12,[x20, #0x3c]
009a1b48	mov w8,#0xc1d6
009a1b4c	eor w9,w10,w9
009a1b50	eor w9,w9,w11
009a1b54	eor w9,w9,w12
009a1b58	ror w9,w9,#0x1f
009a1b5c	str w9,[x20, #0x3c]
009a1b60	ldp w10,w11,[x19]
009a1b64	ldr w13,[x19, #0x10]
009a1b68	ldp w12,w14,[x19, #0x8]
009a1b6c	movk w8,#0xca62, LSL #16
009a1b70	eor w10,w10,w11
009a1b74	eor w10,w10,w13
009a1b78	add w9,w9,w10
009a1b7c	ror w12,w12,#0x1b
009a1b80	add w9,w9,w14
009a1b84	add w9,w9,w12
009a1b88	ror w11,w11,#0x2
009a1b8c	add w9,w9,w8
009a1b90	str w11,[x19, #0x4]
009a1b94	str w9,[x19, #0xc]
009a1b98	ldr w9,[x20, #0x34]
009a1b9c	ldr w10,[x20, #0x20]
009a1ba0	ldr w11,[x20, #0x8]
009a1ba4	ldr w12,[x20]
009a1ba8	eor w9,w10,w9
009a1bac	eor w9,w9,w11
009a1bb0	eor w9,w9,w12
009a1bb4	ror w9,w9,#0x1f
009a1bb8	str w9,[x20]
009a1bbc	ldp w10,w11,[x19, #0x4]
009a1bc0	ldr w13,[x19]
009a1bc4	ldp w12,w14,[x19, #0xc]
009a1bc8	eor w10,w10,w11
009a1bcc	eor w10,w10,w13
009a1bd0	add w9,w9,w10
009a1bd4	ror w12,w12,#0x1b
009a1bd8	add w9,w9,w14
009a1bdc	add w9,w9,w12
009a1be0	ror w11,w11,#0x2
009a1be4	add w9,w9,w8
009a1be8	str w11,[x19, #0x8]
009a1bec	str w9,[x19, #0x10]
009a1bf0	ldr w9,[x20, #0x38]
009a1bf4	ldr w10,[x20, #0x24]
009a1bf8	ldr w11,[x20, #0xc]
009a1bfc	ldr w12,[x20, #0x4]
009a1c00	eor w9,w10,w9
009a1c04	eor w9,w9,w11
009a1c08	eor w9,w9,w12
009a1c0c	ror w9,w9,#0x1f
009a1c10	str w9,[x20, #0x4]
009a1c14	ldp w10,w11,[x19, #0x8]
009a1c18	ldp w14,w12,[x19]
009a1c1c	ldr w13,[x19, #0x10]
009a1c20	eor w10,w10,w11
009a1c24	eor w10,w10,w12
009a1c28	add w9,w9,w10
009a1c2c	ror w12,w13,#0x1b
009a1c30	add w9,w9,w14
009a1c34	add w9,w9,w12
009a1c38	ror w11,w11,#0x2
009a1c3c	add w9,w9,w8
009a1c40	str w11,[x19, #0xc]
009a1c44	str w9,[x19]
009a1c48	ldr w9,[x20, #0x3c]
009a1c4c	ldr w10,[x20, #0x28]
009a1c50	ldr w11,[x20, #0x10]
009a1c54	ldr w12,[x20, #0x8]
009a1c58	eor w9,w10,w9
009a1c5c	eor w9,w9,w11
009a1c60	eor w9,w9,w12
009a1c64	ror w9,w9,#0x1f
009a1c68	str w9,[x20, #0x8]
009a1c6c	ldp w11,w10,[x19, #0xc]
009a1c70	ldr w13,[x19, #0x8]
009a1c74	ldp w12,w14,[x19]
009a1c78	eor w11,w11,w10
009a1c7c	eor w11,w11,w13
009a1c80	add w9,w9,w11
009a1c84	ror w12,w12,#0x1b
009a1c88	add w9,w9,w14
009a1c8c	add w9,w9,w12
009a1c90	ror w10,w10,#0x2
009a1c94	add w8,w9,w8
009a1c98	str w10,[x19, #0x10]
009a1c9c	str w8,[x19, #0x4]
009a1ca0	ldr x8,[x21, #0x28]
009a1ca4	ldr x9,[sp, #0x8]
009a1ca8	cmp x8,x9
009a1cac	b.ne 0x009a1cc4
009a1cb0	ldp x29,x30,[sp, #0x30]
009a1cb4	ldp x20,x19,[sp, #0x20]
009a1cb8	ldr x21,[sp, #0x10]
009a1cbc	add sp,sp,#0x40
009a1cc0	ret
009a1cc4	bl 0x00c2fec0
