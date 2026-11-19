; mbedtls_aria_crypt_ecb @ 00b70a60
00b70a60	stp x24,x23,[sp, #-0x30]!
00b70a64	stp x22,x21,[sp, #0x10]
00b70a68	stp x20,x19,[sp, #0x20]
00b70a6c	mov x10,x0
00b70a70	ldp w3,w18,[x1]
00b70a74	ldr w4,[x1, #0x8]
00b70a78	ldr w1,[x1, #0xc]
00b70a7c	ldrb w12,[x10], #0x10
00b70a80	mov w11,#0x2
00b70a84	adrp x13,0x77d000
00b70a88	adrp x14,0x77d000
00b70a8c	adrp x16,0x77d000
00b70a90	cmp w12,#0x2
00b70a94	adrp x17,0x77d000
00b70a98	orr w8,wzr,#0xff00ff00
00b70a9c	orr w9,wzr,#0xff00ff
00b70aa0	add x13,x13,#0x71c
00b70aa4	add x14,x14,#0x81c
00b70aa8	add x16,x16,#0x91c
00b70aac	csel w15,w12,w11,hi
00b70ab0	add x17,x17,#0xa1c
00b70ab4	b 0x00b70b3c
00b70ab8	extr w20,w4,w18,#0x10
00b70abc	extr w4,w6,w1,#0x10
00b70ac0	and w6,w9,w19, LSR #0x8
00b70ac4	and w7,w8,w7, LSL #0x8
00b70ac8	orr w6,w6,w7
00b70acc	and w7,w9,w20, LSR #0x8
00b70ad0	and w19,w8,w20, LSL #0x8
00b70ad4	orr w7,w7,w19
00b70ad8	rev w19,w1
00b70adc	extr w5,w5,w3,#0x10
00b70ae0	eor w18,w6,w18
00b70ae4	eor w19,w19,w5
00b70ae8	eor w5,w7,w5
00b70aec	and w7,w9,w18, LSR #0x8
00b70af0	and w18,w8,w18, LSL #0x8
00b70af4	eor w4,w4,w6, ROR #0x10
00b70af8	orr w18,w7,w18
00b70afc	eor w3,w4,w3
00b70b00	eor w6,w6,w5
00b70b04	eor w1,w1,w5
00b70b08	eor w5,w19,w18
00b70b0c	rev w1,w1
00b70b10	eor w18,w3,w5
00b70b14	eor w3,w5,w4, ROR #0x10
00b70b18	rev w7,w5
00b70b1c	eor w4,w1,w5, ROR #0x10
00b70b20	and w5,w9,w3, LSR #0x8
00b70b24	and w3,w8,w3, LSL #0x8
00b70b28	orr w3,w5,w3
00b70b2c	add x11,x11,#0x2
00b70b30	eor w1,w6,w7
00b70b34	eor w3,w3,w20
00b70b38	add x10,x10,#0x20
00b70b3c	ldp w5,w6,[x10, #-0xc]
00b70b40	ldp w7,w19,[x10, #-0x4]
00b70b44	ldr w20,[x10, #0x4]
00b70b48	cmp x11,x12
00b70b4c	eor w3,w5,w3
00b70b50	eor w18,w6,w18
00b70b54	and w5,w3,#0xff
00b70b58	ubfx w6,w3,#0x8,#0x8
00b70b5c	ldrb w5,[x13, w5, UXTW ]
00b70b60	ldrb w6,[x14, w6, UXTW ]
00b70b64	eor w4,w7,w4
00b70b68	eor w1,w19,w1
00b70b6c	and w19,w18,#0xff
00b70b70	ubfx w21,w18,#0x8,#0x8
00b70b74	and w22,w4,#0xff
00b70b78	bfm w5,w6,#0x18,#0x7
00b70b7c	ubfx w6,w4,#0x10,#0x8
00b70b80	ldrb w19,[x13, w19, UXTW ]
00b70b84	ldrb w21,[x14, w21, UXTW ]
00b70b88	ldrb w22,[x13, w22, UXTW ]
00b70b8c	ldrb w6,[x16, w6, UXTW ]
00b70b90	ubfx w23,w4,#0x8,#0x8
00b70b94	lsr w4,w4,#0x18
00b70b98	bfm w19,w21,#0x18,#0x7
00b70b9c	and w21,w1,#0xff
00b70ba0	ldrb w23,[x14, w23, UXTW ]
00b70ba4	ldrb w4,[x17, w4, UXTW ]
00b70ba8	bfm w22,w6,#0x10,#0xf
00b70bac	ubfx w6,w1,#0x8,#0x8
00b70bb0	ldrb w21,[x13, w21, UXTW ]
00b70bb4	ldrb w6,[x14, w6, UXTW ]
00b70bb8	ubfx w7,w3,#0x10,#0x8
00b70bbc	bfm w23,w4,#0x10,#0x7
00b70bc0	ubfx w4,w18,#0x10,#0x8
00b70bc4	ldrb w7,[x16, w7, UXTW ]
00b70bc8	lsr w3,w3,#0x18
00b70bcc	lsr w18,w18,#0x18
00b70bd0	bfm w21,w6,#0x18,#0x7
00b70bd4	ubfx w6,w1,#0x10,#0x8
00b70bd8	ldrb w4,[x16, w4, UXTW ]
00b70bdc	lsr w1,w1,#0x18
00b70be0	ldrb w3,[x17, w3, UXTW ]
00b70be4	ldrb w18,[x17, w18, UXTW ]
00b70be8	ldrb w6,[x16, w6, UXTW ]
00b70bec	ldrb w1,[x17, w1, UXTW ]
00b70bf0	orr w22,w23,w22, LSL #0x8
00b70bf4	mov w23,w5
00b70bf8	bfm w23,w7,#0x10,#0x7
00b70bfc	mov w7,w19
00b70c00	bfm w7,w4,#0x10,#0x7
00b70c04	mov w4,w21
00b70c08	bfm w4,w6,#0x10,#0x7
00b70c0c	bfm w23,w3,#0x8,#0x7
00b70c10	ldp w3,w6,[x10, #0x8]
00b70c14	bfm w7,w18,#0x8,#0x7
00b70c18	bfm w4,w1,#0x8,#0x7
00b70c1c	extr w1,w19,w7,#0x10
00b70c20	eor w7,w22,w7
00b70c24	extr w19,w21,w4,#0x10
00b70c28	and w21,w9,w7, LSR #0x8
00b70c2c	and w7,w8,w7, LSL #0x8
00b70c30	ldr w18,[x10, #0x10]
00b70c34	rev w4,w4
00b70c38	extr w5,w5,w23,#0x10
00b70c3c	orr w7,w21,w7
00b70c40	and w21,w9,w1, LSR #0x8
00b70c44	eor w20,w20,w1
00b70c48	and w1,w8,w1, LSL #0x8
00b70c4c	eor w3,w3,w23
00b70c50	eor w23,w4,w5
00b70c54	eor w19,w19,w22, ROR #0x10
00b70c58	orr w1,w21,w1
00b70c5c	eor w3,w3,w19
00b70c60	eor w7,w23,w7
00b70c64	eor w1,w1,w5
00b70c68	eor w5,w7,w19, ROR #0x10
00b70c6c	eor w21,w1,w22
00b70c70	rev w1,w1
00b70c74	eor w3,w3,w7
00b70c78	rev w19,w7
00b70c7c	and w22,w9,w5, LSR #0x8
00b70c80	and w5,w8,w5, LSL #0x8
00b70c84	eor w1,w6,w1
00b70c88	eor w18,w21,w18
00b70c8c	and w6,w3,#0xff
00b70c90	ubfx w21,w3,#0x8,#0x8
00b70c94	orr w5,w22,w5
00b70c98	eor w1,w1,w4
00b70c9c	eor w19,w18,w19
00b70ca0	ldrb w4,[x16, w6, UXTW ]
00b70ca4	ldrb w18,[x17, w21, UXTW ]
00b70ca8	ubfx w23,w3,#0x10,#0x8
00b70cac	eor w20,w20,w5
00b70cb0	eor w22,w1,w7, ROR #0x10
00b70cb4	and w1,w19,#0xff
00b70cb8	ubfx w5,w19,#0x8,#0x8
00b70cbc	lsr w3,w3,#0x18
00b70cc0	ldrb w21,[x13, w23, UXTW ]
00b70cc4	and w7,w20,#0xff
00b70cc8	ubfx w24,w20,#0x8,#0x8
00b70ccc	ldrb w6,[x16, w1, UXTW ]
00b70cd0	ldrb w1,[x17, w5, UXTW ]
00b70cd4	ldrb w3,[x14, w3, UXTW ]
00b70cd8	ldrb w5,[x16, w7, UXTW ]
00b70cdc	ldrb w7,[x17, w24, UXTW ]
00b70ce0	bfm w4,w18,#0x18,#0x7
00b70ce4	mov w18,w4
00b70ce8	bfm w18,w21,#0x10,#0x7
00b70cec	bfm w6,w1,#0x18,#0x7
00b70cf0	and w1,w22,#0xff
00b70cf4	ubfx w24,w22,#0x8,#0x8
00b70cf8	bfm w5,w7,#0x18,#0x7
00b70cfc	bfm w18,w3,#0x8,#0x7
00b70d00	ubfx w3,w22,#0x10,#0x8
00b70d04	ldrb w7,[x16, w1, UXTW ]
00b70d08	ldrb w1,[x17, w24, UXTW ]
00b70d0c	ubfx w21,w20,#0x10,#0x8
00b70d10	ldrb w3,[x13, w3, UXTW ]
00b70d14	ldrb w21,[x13, w21, UXTW ]
00b70d18	bfm w7,w1,#0x18,#0x7
00b70d1c	ubfx w23,w19,#0x10,#0x8
00b70d20	bfm w7,w3,#0x10,#0x7
00b70d24	mov w3,w5
00b70d28	ldrb w23,[x13, w23, UXTW ]
00b70d2c	bfm w3,w21,#0x10,#0x7
00b70d30	lsr w19,w19,#0x18
00b70d34	lsr w20,w20,#0x18
00b70d38	lsr w21,w22,#0x18
00b70d3c	ldrb w20,[x14, w20, UXTW ]
00b70d40	ldrb w21,[x14, w21, UXTW ]
00b70d44	ldrb w22,[x14, w19, UXTW ]
00b70d48	mov w1,w6
00b70d4c	bfm w1,w23,#0x10,#0x7
00b70d50	mov w19,w7
00b70d54	bfm w3,w20,#0x8,#0x7
00b70d58	bfm w19,w21,#0x8,#0x7
00b70d5c	bfm w1,w22,#0x8,#0x7
00b70d60	b.cc 0x00b70ab8
00b70d64	add w8,w15,#0x1
00b70d68	and w8,w8,#0x1fe
00b70d6c	add x8,x0,w8, UXTW  #0x4
00b70d70	ldp w9,w10,[x8, #0x4]
00b70d74	ldp w11,w8,[x8, #0xc]
00b70d78	mov w0,wzr
00b70d7c	eor w9,w9,w3
00b70d80	eor w10,w10,w18
00b70d84	eor w11,w11,w19
00b70d88	eor w8,w8,w1
00b70d8c	stp w9,w10,[x2]
00b70d90	stp w11,w8,[x2, #0x8]
00b70d94	ldp x20,x19,[sp, #0x20]
00b70d98	ldp x22,x21,[sp, #0x10]
00b70d9c	ldp x24,x23,[sp], #0x30
00b70da0	ret
