; WebSocketHandshakeKeyGen::static_for<3,WebSocketHandshakeKeyGen::Sha1Loop<3>>::operator() @ 009a0c08
009a0c08	ldr w8,[x2, #0x4]
009a0c0c	ldr w9,[x2, #0x30]
009a0c10	ldr w10,[x2, #0x18]
009a0c14	ldr w11,[x2, #0x10]
009a0c18	eor w8,w9,w8
009a0c1c	eor w8,w8,w10
009a0c20	eor w8,w8,w11
009a0c24	ror w8,w8,#0x1f
009a0c28	str w8,[x2, #0x10]
009a0c2c	ldp w9,w10,[x1, #0x8]
009a0c30	ldp w12,w11,[x1]
009a0c34	ldr w13,[x1, #0x10]
009a0c38	eor w9,w9,w10
009a0c3c	eor w9,w9,w11
009a0c40	add w8,w8,w9
009a0c44	mov w11,#0xeba1
009a0c48	ror w13,w13,#0x1b
009a0c4c	add w8,w8,w12
009a0c50	movk w11,#0x6ed9, LSL #16
009a0c54	add w8,w8,w13
009a0c58	ror w10,w10,#0x2
009a0c5c	add w8,w8,w11
009a0c60	str w10,[x1, #0xc]
009a0c64	str w8,[x1]
009a0c68	ldr w8,[x2, #0x8]
009a0c6c	ldr w9,[x2, #0x34]
009a0c70	ldr w10,[x2, #0x1c]
009a0c74	ldr w12,[x2, #0x14]
009a0c78	eor w8,w9,w8
009a0c7c	eor w8,w8,w10
009a0c80	eor w8,w8,w12
009a0c84	ror w8,w8,#0x1f
009a0c88	str w8,[x2, #0x14]
009a0c8c	ldp w10,w9,[x1, #0xc]
009a0c90	ldr w12,[x1, #0x8]
009a0c94	eor w10,w10,w9
009a0c98	eor w10,w10,w12
009a0c9c	ldp w13,w12,[x1]
009a0ca0	add w8,w8,w10
009a0ca4	ror w9,w9,#0x2
009a0ca8	str w9,[x1, #0x10]
009a0cac	ror w13,w13,#0x1b
009a0cb0	add w8,w8,w12
009a0cb4	add w8,w8,w13
009a0cb8	add w8,w8,w11
009a0cbc	str w8,[x1, #0x4]
009a0cc0	ldr w8,[x2, #0xc]
009a0cc4	ldr w9,[x2, #0x38]
009a0cc8	ldr w10,[x2, #0x20]
009a0ccc	ldr w12,[x2, #0x18]
009a0cd0	eor w8,w9,w8
009a0cd4	eor w8,w8,w10
009a0cd8	eor w8,w8,w12
009a0cdc	ror w8,w8,#0x1f
009a0ce0	str w8,[x2, #0x18]
009a0ce4	ldp w14,w9,[x1, #0xc]
009a0ce8	ldp w10,w12,[x1]
009a0cec	ldr w13,[x1, #0x8]
009a0cf0	eor w9,w9,w10
009a0cf4	eor w9,w9,w14
009a0cf8	add w8,w8,w9
009a0cfc	ror w12,w12,#0x1b
009a0d00	add w8,w8,w13
009a0d04	add w8,w8,w12
009a0d08	ror w10,w10,#0x2
009a0d0c	add w8,w8,w11
009a0d10	str w8,[x1, #0x8]
009a0d14	str w10,[x1]
009a0d18	ret
