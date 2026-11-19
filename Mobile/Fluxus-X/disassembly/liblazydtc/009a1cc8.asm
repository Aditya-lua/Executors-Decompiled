; WebSocketHandshakeKeyGen::static_for<3,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator() @ 009a1cc8
009a1cc8	ldr w8,[x2, #0x24]
009a1ccc	ldr w9,[x2, #0x10]
009a1cd0	ldr w10,[x2, #0x38]
009a1cd4	ldr w11,[x2, #0x30]
009a1cd8	eor w8,w9,w8
009a1cdc	eor w8,w8,w10
009a1ce0	eor w8,w8,w11
009a1ce4	ror w8,w8,#0x1f
009a1ce8	str w8,[x2, #0x30]
009a1cec	ldp w9,w10,[x1, #0x8]
009a1cf0	ldp w12,w11,[x1]
009a1cf4	ldr w13,[x1, #0x10]
009a1cf8	eor w9,w9,w10
009a1cfc	eor w9,w9,w11
009a1d00	add w8,w8,w9
009a1d04	mov w11,#0xc1d6
009a1d08	ror w13,w13,#0x1b
009a1d0c	add w8,w8,w12
009a1d10	movk w11,#0xca62, LSL #16
009a1d14	add w8,w8,w13
009a1d18	ror w10,w10,#0x2
009a1d1c	add w8,w8,w11
009a1d20	str w10,[x1, #0xc]
009a1d24	str w8,[x1]
009a1d28	ldr w8,[x2, #0x28]
009a1d2c	ldr w9,[x2, #0x14]
009a1d30	ldr w10,[x2, #0x3c]
009a1d34	ldr w12,[x2, #0x34]
009a1d38	eor w8,w9,w8
009a1d3c	eor w8,w8,w10
009a1d40	eor w8,w8,w12
009a1d44	ror w8,w8,#0x1f
009a1d48	str w8,[x2, #0x34]
009a1d4c	ldp w10,w9,[x1, #0xc]
009a1d50	ldr w12,[x1, #0x8]
009a1d54	eor w10,w10,w9
009a1d58	eor w10,w10,w12
009a1d5c	ldp w13,w12,[x1]
009a1d60	add w8,w8,w10
009a1d64	ror w9,w9,#0x2
009a1d68	str w9,[x1, #0x10]
009a1d6c	ror w13,w13,#0x1b
009a1d70	add w8,w8,w12
009a1d74	add w8,w8,w13
009a1d78	add w8,w8,w11
009a1d7c	str w8,[x1, #0x4]
009a1d80	ldr w8,[x2, #0x2c]
009a1d84	ldr w9,[x2, #0x18]
009a1d88	ldr w10,[x2]
009a1d8c	ldr w12,[x2, #0x38]
009a1d90	eor w8,w9,w8
009a1d94	eor w8,w8,w10
009a1d98	eor w8,w8,w12
009a1d9c	ror w8,w8,#0x1f
009a1da0	str w8,[x2, #0x38]
009a1da4	ldp w14,w9,[x1, #0xc]
009a1da8	ldp w10,w12,[x1]
009a1dac	ldr w13,[x1, #0x8]
009a1db0	eor w9,w9,w10
009a1db4	eor w9,w9,w14
009a1db8	add w8,w8,w9
009a1dbc	ror w12,w12,#0x1b
009a1dc0	add w8,w8,w13
009a1dc4	add w8,w8,w12
009a1dc8	ror w10,w10,#0x2
009a1dcc	add w8,w8,w11
009a1dd0	str w8,[x1, #0x8]
009a1dd4	str w10,[x1]
009a1dd8	ret
