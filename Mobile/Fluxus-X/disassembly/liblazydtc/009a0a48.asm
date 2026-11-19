; WebSocketHandshakeKeyGen::static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator() @ 009a0a48
009a0a48	sub sp,sp,#0x40
009a0a4c	str x21,[sp, #0x10]
009a0a50	stp x20,x19,[sp, #0x20]
009a0a54	stp x29,x30,[sp, #0x30]
009a0a58	add x29,sp,#0x30
009a0a5c	mrs x21,tpidr_el0
009a0a60	ldr x8,[x21, #0x28]
009a0a64	mov x0,sp
009a0a68	mov x20,x2
009a0a6c	mov x19,x1
009a0a70	str x8,[sp, #0x8]
009a0a74	bl 0x00c33ae0
009a0a78	ldr w9,[x20, #0x10]
009a0a7c	ldr w10,[x20, #0x3c]
009a0a80	ldr w11,[x20, #0x24]
009a0a84	ldr w12,[x20, #0x1c]
009a0a88	mov w8,#0xeba1
009a0a8c	eor w9,w10,w9
009a0a90	eor w9,w9,w11
009a0a94	eor w9,w9,w12
009a0a98	ror w9,w9,#0x1f
009a0a9c	str w9,[x20, #0x1c]
009a0aa0	ldp w10,w11,[x19]
009a0aa4	ldr w13,[x19, #0x10]
009a0aa8	ldp w12,w14,[x19, #0x8]
009a0aac	movk w8,#0x6ed9, LSL #16
009a0ab0	eor w10,w10,w11
009a0ab4	eor w10,w10,w13
009a0ab8	add w9,w9,w10
009a0abc	ror w12,w12,#0x1b
009a0ac0	add w9,w9,w14
009a0ac4	add w9,w9,w12
009a0ac8	ror w11,w11,#0x2
009a0acc	add w9,w9,w8
009a0ad0	str w11,[x19, #0x4]
009a0ad4	str w9,[x19, #0xc]
009a0ad8	ldr w9,[x20, #0x14]
009a0adc	ldr w10,[x20]
009a0ae0	ldr w11,[x20, #0x28]
009a0ae4	ldr w12,[x20, #0x20]
009a0ae8	eor w9,w10,w9
009a0aec	eor w9,w9,w11
009a0af0	eor w9,w9,w12
009a0af4	ror w9,w9,#0x1f
009a0af8	str w9,[x20, #0x20]
009a0afc	ldp w10,w11,[x19, #0x4]
009a0b00	ldr w13,[x19]
009a0b04	ldp w12,w14,[x19, #0xc]
009a0b08	eor w10,w10,w11
009a0b0c	eor w10,w10,w13
009a0b10	add w9,w9,w10
009a0b14	ror w12,w12,#0x1b
009a0b18	add w9,w9,w14
009a0b1c	add w9,w9,w12
009a0b20	ror w11,w11,#0x2
009a0b24	add w9,w9,w8
009a0b28	str w11,[x19, #0x8]
009a0b2c	str w9,[x19, #0x10]
009a0b30	ldr w9,[x20, #0x18]
009a0b34	ldr w10,[x20, #0x4]
009a0b38	ldr w11,[x20, #0x2c]
009a0b3c	ldr w12,[x20, #0x24]
009a0b40	eor w9,w10,w9
009a0b44	eor w9,w9,w11
009a0b48	eor w9,w9,w12
009a0b4c	ror w9,w9,#0x1f
009a0b50	str w9,[x20, #0x24]
009a0b54	ldp w10,w11,[x19, #0x8]
009a0b58	ldp w14,w12,[x19]
009a0b5c	ldr w13,[x19, #0x10]
009a0b60	eor w10,w10,w11
009a0b64	eor w10,w10,w12
009a0b68	add w9,w9,w10
009a0b6c	ror w12,w13,#0x1b
009a0b70	add w9,w9,w14
009a0b74	add w9,w9,w12
009a0b78	ror w11,w11,#0x2
009a0b7c	add w9,w9,w8
009a0b80	str w11,[x19, #0xc]
009a0b84	str w9,[x19]
009a0b88	ldr w9,[x20, #0x1c]
009a0b8c	ldr w10,[x20, #0x8]
009a0b90	ldr w11,[x20, #0x30]
009a0b94	ldr w12,[x20, #0x28]
009a0b98	eor w9,w10,w9
009a0b9c	eor w9,w9,w11
009a0ba0	eor w9,w9,w12
009a0ba4	ror w9,w9,#0x1f
009a0ba8	str w9,[x20, #0x28]
009a0bac	ldp w11,w10,[x19, #0xc]
009a0bb0	ldr w13,[x19, #0x8]
009a0bb4	ldp w12,w14,[x19]
009a0bb8	eor w11,w11,w10
009a0bbc	eor w11,w11,w13
009a0bc0	add w9,w9,w11
009a0bc4	ror w12,w12,#0x1b
009a0bc8	add w9,w9,w14
009a0bcc	add w9,w9,w12
009a0bd0	ror w10,w10,#0x2
009a0bd4	add w8,w9,w8
009a0bd8	str w10,[x19, #0x10]
009a0bdc	str w8,[x19, #0x4]
009a0be0	ldr x8,[x21, #0x28]
009a0be4	ldr x9,[sp, #0x8]
009a0be8	cmp x8,x9
009a0bec	b.ne 0x009a0c04
009a0bf0	ldp x29,x30,[sp, #0x30]
009a0bf4	ldp x20,x19,[sp, #0x20]
009a0bf8	ldr x21,[sp, #0x10]
009a0bfc	add sp,sp,#0x40
009a0c00	ret
009a0c04	bl 0x00c2fec0
