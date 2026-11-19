; AES_decrypt @ 00a89a3c
00a89a3c	str x21,[sp, #-0x20]!
00a89a40	stp x20,x19,[sp, #0x10]
00a89a44	ldp w8,w12,[x0]
00a89a48	ldp w11,w13,[x2]
00a89a4c	ldp w14,w15,[x0, #0x8]
00a89a50	ldr w3,[x2, #0xf0]
00a89a54	ldp w18,w0,[x2, #0x8]
00a89a58	rev w8,w8
00a89a5c	eor w16,w8,w11
00a89a60	rev w8,w12
00a89a64	eor w17,w8,w13
00a89a68	rev w8,w14
00a89a6c	asr w14,w3,#0x1
00a89a70	rev w13,w15
00a89a74	eor w18,w8,w18
00a89a78	sub w8,w14,#0x1
00a89a7c	mov w4,#0x1
00a89a80	adrp x10,0x768000
00a89a84	adrp x11,0x768000
00a89a88	adrp x12,0x768000
00a89a8c	eor w0,w13,w0
00a89a90	lsl x13,x8,#0x3
00a89a94	adrp x15,0x768000
00a89a98	add x9,x2,#0x18
00a89a9c	add x10,x10,#0x2a0
00a89aa0	add x11,x11,#0x6a0
00a89aa4	add x12,x12,#0xaa0
00a89aa8	sub w14,w4,w14
00a89aac	add x8,x13,#0x8
00a89ab0	add x15,x15,#0xea0
00a89ab4	b 0x00a89b84
00a89ab8	ubfx w4,w0,#0x10,#0x8
00a89abc	ldr w3,[x10, w3, UXTW #0x2]
00a89ac0	ldr w4,[x11, w4, UXTW #0x2]
00a89ac4	lsr w6,w17,#0x18
00a89ac8	ubfx w7,w16,#0x10,#0x8
00a89acc	lsr w19,w18,#0x18
00a89ad0	ubfx w20,w17,#0x10,#0x8
00a89ad4	lsr w21,w0,#0x18
00a89ad8	eor w3,w4,w3
00a89adc	ubfx w4,w18,#0x10,#0x8
00a89ae0	ldr w6,[x10, w6, UXTW #0x2]
00a89ae4	ldr w7,[x11, w7, UXTW #0x2]
00a89ae8	ldr w19,[x10, w19, UXTW #0x2]
00a89aec	ldr w20,[x11, w20, UXTW #0x2]
00a89af0	ldr w21,[x10, w21, UXTW #0x2]
00a89af4	ldr w4,[x11, w4, UXTW #0x2]
00a89af8	ubfx w5,w18,#0x8,#0x8
00a89afc	eor w6,w7,w6
00a89b00	ubfx w7,w0,#0x8,#0x8
00a89b04	eor w19,w20,w19
00a89b08	ubfx w20,w16,#0x8,#0x8
00a89b0c	eor w4,w4,w21
00a89b10	ubfx w21,w17,#0x8,#0x8
00a89b14	ldr w5,[x12, w5, UXTW #0x2]
00a89b18	ldr w7,[x12, w7, UXTW #0x2]
00a89b1c	ldr w20,[x12, w20, UXTW #0x2]
00a89b20	and w17,w17,#0xff
00a89b24	and w18,w18,#0xff
00a89b28	and w0,w0,#0xff
00a89b2c	ldr w17,[x15, w17, UXTW #0x2]
00a89b30	ldr w18,[x15, w18, UXTW #0x2]
00a89b34	ldr w0,[x15, w0, UXTW #0x2]
00a89b38	ldr w21,[x12, w21, UXTW #0x2]
00a89b3c	and w16,w16,#0xff
00a89b40	eor w3,w3,w5
00a89b44	eor w5,w6,w7
00a89b48	eor w6,w19,w20
00a89b4c	ldr w16,[x15, w16, UXTW #0x2]
00a89b50	eor w17,w3,w17
00a89b54	eor w18,w5,w18
00a89b58	ldp w3,w5,[x9, #0x8]
00a89b5c	eor w0,w6,w0
00a89b60	ldp w6,w7,[x9, #0x10]
00a89b64	eor w4,w4,w21
00a89b68	eor w4,w4,w16
00a89b6c	add w14,w14,#0x1
00a89b70	eor w16,w17,w3
00a89b74	eor w17,w18,w5
00a89b78	eor w18,w0,w6
00a89b7c	eor w0,w4,w7
00a89b80	add x9,x9,#0x20
00a89b84	lsr w3,w16,#0x18
00a89b88	ubfx w4,w0,#0x10,#0x8
00a89b8c	ldr w3,[x10, w3, UXTW #0x2]
00a89b90	ldr w4,[x11, w4, UXTW #0x2]
00a89b94	lsr w6,w17,#0x18
00a89b98	ubfx w7,w16,#0x10,#0x8
00a89b9c	lsr w19,w18,#0x18
00a89ba0	ubfx w20,w17,#0x10,#0x8
00a89ba4	lsr w21,w0,#0x18
00a89ba8	eor w3,w4,w3
00a89bac	ubfx w4,w18,#0x10,#0x8
00a89bb0	ldr w6,[x10, w6, UXTW #0x2]
00a89bb4	ldr w7,[x11, w7, UXTW #0x2]
00a89bb8	ldr w19,[x10, w19, UXTW #0x2]
00a89bbc	ldr w20,[x11, w20, UXTW #0x2]
00a89bc0	ldr w21,[x10, w21, UXTW #0x2]
00a89bc4	ldr w4,[x11, w4, UXTW #0x2]
00a89bc8	ubfx w5,w18,#0x8,#0x8
00a89bcc	eor w6,w7,w6
00a89bd0	ubfx w7,w0,#0x8,#0x8
00a89bd4	eor w19,w20,w19
00a89bd8	ubfx w20,w16,#0x8,#0x8
00a89bdc	eor w4,w4,w21
00a89be0	ubfx w21,w17,#0x8,#0x8
00a89be4	ldr w5,[x12, w5, UXTW #0x2]
00a89be8	ldr w7,[x12, w7, UXTW #0x2]
00a89bec	and w17,w17,#0xff
00a89bf0	and w18,w18,#0xff
00a89bf4	ldr w20,[x12, w20, UXTW #0x2]
00a89bf8	and w0,w0,#0xff
00a89bfc	ldr w17,[x15, w17, UXTW #0x2]
00a89c00	ldr w18,[x15, w18, UXTW #0x2]
00a89c04	ldr w0,[x15, w0, UXTW #0x2]
00a89c08	ldr w21,[x12, w21, UXTW #0x2]
00a89c0c	eor w3,w3,w5
00a89c10	eor w5,w6,w7
00a89c14	and w16,w16,#0xff
00a89c18	eor w6,w19,w20
00a89c1c	ldr w16,[x15, w16, UXTW #0x2]
00a89c20	eor w17,w3,w17
00a89c24	eor w18,w5,w18
00a89c28	ldp w3,w5,[x9, #-0x8]
00a89c2c	eor w0,w6,w0
00a89c30	ldp w6,w7,[x9]
00a89c34	eor w4,w4,w21
00a89c38	eor w4,w4,w16
00a89c3c	eor w16,w17,w3
00a89c40	eor w17,w18,w5
00a89c44	eor w18,w0,w6
00a89c48	eor w0,w4,w7
00a89c4c	lsr w3,w16,#0x18
00a89c50	cbnz w14,0x00a89ab8
00a89c54	adrp x10,0x769000
00a89c58	add x10,x10,#0x2a0
00a89c5c	ubfx w11,w0,#0x10,#0x8
00a89c60	ldrb w3,[x10, w3, UXTW ]
00a89c64	ubfx w12,w18,#0x8,#0x8
00a89c68	ldrb w11,[x10, w11, UXTW ]
00a89c6c	add x9,x2,x13, LSL #0x2
00a89c70	and w13,w17,#0xff
00a89c74	ldrb w12,[x10, w12, UXTW ]
00a89c78	ldr w8,[x2, x8, LSL #0x2]
00a89c7c	lsr w14,w17,#0x18
00a89c80	ubfx w15,w16,#0x10,#0x8
00a89c84	ubfx w2,w0,#0x8,#0x8
00a89c88	and w4,w18,#0xff
00a89c8c	lsr w5,w18,#0x18
00a89c90	ubfx w6,w17,#0x10,#0x8
00a89c94	ubfx w7,w16,#0x8,#0x8
00a89c98	and w19,w0,#0xff
00a89c9c	lsr w0,w0,#0x18
00a89ca0	ubfx w18,w18,#0x10,#0x8
00a89ca4	ubfx w17,w17,#0x8,#0x8
00a89ca8	and w16,w16,#0xff
00a89cac	ldrb w13,[x10, w13, UXTW ]
00a89cb0	ldrb w14,[x10, w14, UXTW ]
00a89cb4	ldrb w15,[x10, w15, UXTW ]
00a89cb8	ldrb w2,[x10, w2, UXTW ]
00a89cbc	ldrb w4,[x10, w4, UXTW ]
00a89cc0	ldrb w5,[x10, w5, UXTW ]
00a89cc4	ldrb w6,[x10, w6, UXTW ]
00a89cc8	ldrb w7,[x10, w7, UXTW ]
00a89ccc	ldrb w19,[x10, w19, UXTW ]
00a89cd0	ldrb w0,[x10, w0, UXTW ]
00a89cd4	ldrb w18,[x10, w18, UXTW ]
00a89cd8	ldrb w17,[x10, w17, UXTW ]
00a89cdc	ldrb w10,[x10, w16, UXTW ]
00a89ce0	lsl w16,w3,#0x18
00a89ce4	bfm w16,w11,#0x10,#0x7
00a89ce8	bfm w16,w12,#0x18,#0x7
00a89cec	orr w11,w16,w13
00a89cf0	eor w8,w11,w8
00a89cf4	lsr w11,w8,#0x18
00a89cf8	strb w11,[x1]
00a89cfc	lsr w11,w8,#0x10
00a89d00	strb w8,[x1, #0x3]
00a89d04	lsr w8,w8,#0x8
00a89d08	strb w11,[x1, #0x1]
00a89d0c	strb w8,[x1, #0x2]
00a89d10	lsl w11,w14,#0x18
00a89d14	ldr w8,[x9, #0x24]
00a89d18	bfm w11,w15,#0x10,#0x7
00a89d1c	bfm w11,w2,#0x18,#0x7
00a89d20	orr w11,w11,w4
00a89d24	eor w8,w11,w8
00a89d28	lsr w11,w8,#0x18
00a89d2c	strb w11,[x1, #0x4]
00a89d30	lsr w11,w8,#0x10
00a89d34	strb w8,[x1, #0x7]
00a89d38	lsr w8,w8,#0x8
00a89d3c	strb w11,[x1, #0x5]
00a89d40	strb w8,[x1, #0x6]
00a89d44	lsl w11,w5,#0x18
00a89d48	ldr w8,[x9, #0x28]
00a89d4c	bfm w11,w6,#0x10,#0x7
00a89d50	bfm w11,w7,#0x18,#0x7
00a89d54	orr w11,w11,w19
00a89d58	eor w8,w11,w8
00a89d5c	lsr w11,w8,#0x18
00a89d60	lsr w13,w8,#0x10
00a89d64	lsr w14,w8,#0x8
00a89d68	strb w8,[x1, #0xb]
00a89d6c	strb w11,[x1, #0x8]
00a89d70	strb w13,[x1, #0x9]
00a89d74	strb w14,[x1, #0xa]
00a89d78	lsl w12,w0,#0x18
00a89d7c	ldr w8,[x9, #0x2c]
00a89d80	bfm w12,w18,#0x10,#0x7
00a89d84	bfm w12,w17,#0x18,#0x7
00a89d88	orr w9,w12,w10
00a89d8c	eor w8,w9,w8
00a89d90	lsr w9,w8,#0x18
00a89d94	lsr w10,w8,#0x10
00a89d98	lsr w11,w8,#0x8
00a89d9c	strb w9,[x1, #0xc]
00a89da0	strb w10,[x1, #0xd]
00a89da4	strb w11,[x1, #0xe]
00a89da8	strb w8,[x1, #0xf]
00a89dac	ldp x20,x19,[sp, #0x10]
00a89db0	ldr x21,[sp], #0x20
00a89db4	ret
