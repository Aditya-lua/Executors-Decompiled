; mbedtls_des_setkey @ 00b749b8
00b749b8	stp x28,x27,[sp, #-0x60]!
00b749bc	stp x26,x25,[sp, #0x10]
00b749c0	stp x24,x23,[sp, #0x20]
00b749c4	stp x22,x21,[sp, #0x30]
00b749c8	stp x20,x19,[sp, #0x40]
00b749cc	stp x29,x30,[sp, #0x50]
00b749d0	ldp w9,w10,[x1]
00b749d4	adrp x11,0x77e000
00b749d8	add x11,x11,#0x8c0
00b749dc	adrp x12,0x77e000
00b749e0	rev w9,w9
00b749e4	rev w10,w10
00b749e8	eor w13,w9,w10, LSR #0x4
00b749ec	and w13,w13,#0xf0f0f0f
00b749f0	eor w10,w10,w13, LSL #0x4
00b749f4	lsr w14,w9,#0x1d
00b749f8	eor w15,w13,w9
00b749fc	eor w9,w10,w9
00b74a00	ubfx w16,w15,#0x8,#0x4
00b74a04	and w9,w9,#0x10101010
00b74a08	and w13,w15,#0xf
00b74a0c	ubfx w17,w15,#0x10,#0x4
00b74a10	ubfx w18,w15,#0x18,#0x4
00b74a14	ubfx w1,w15,#0x5,#0x4
00b74a18	ubfx w2,w15,#0xd,#0x4
00b74a1c	ubfx w15,w15,#0x15,#0x4
00b74a20	ldr w16,[x11, w16, UXTW #0x2]
00b74a24	eor w9,w9,w10
00b74a28	add x12,x12,#0x900
00b74a2c	ldr w14,[x11, w14, UXTW #0x2]
00b74a30	ldr w13,[x11, w13, UXTW #0x2]
00b74a34	ldr w17,[x11, w17, UXTW #0x2]
00b74a38	ldr w18,[x11, w18, UXTW #0x2]
00b74a3c	ldr w1,[x11, w1, UXTW #0x2]
00b74a40	ldr w2,[x11, w2, UXTW #0x2]
00b74a44	ldr w11,[x11, w15, UXTW #0x2]
00b74a48	ubfx w15,w9,#0x9,#0x4
00b74a4c	ubfx w10,w9,#0x1,#0x4
00b74a50	ldr w15,[x12, w15, UXTW #0x2]
00b74a54	ubfx w3,w9,#0x11,#0x4
00b74a58	ubfx w4,w9,#0x19,#0x4
00b74a5c	ubfx w5,w9,#0x4,#0x4
00b74a60	ubfx w6,w9,#0xc,#0x4
00b74a64	ubfx w7,w9,#0x14,#0x4
00b74a68	lsr w9,w9,#0x1c
00b74a6c	ldr w10,[x12, w10, UXTW #0x2]
00b74a70	ldr w3,[x12, w3, UXTW #0x2]
00b74a74	ldr w19,[x12, w9, UXTW #0x2]
00b74a78	lsl w9,w16,#0x2
00b74a7c	ldr w4,[x12, w4, UXTW #0x2]
00b74a80	orr w9,w9,w13, LSL #0x3
00b74a84	ldr w5,[x12, w5, UXTW #0x2]
00b74a88	ldr w6,[x12, w6, UXTW #0x2]
00b74a8c	ldr w7,[x12, w7, UXTW #0x2]
00b74a90	orr w9,w9,w17, LSL #0x1
00b74a94	lsl w12,w15,#0x2
00b74a98	orr w9,w9,w18
00b74a9c	orr w10,w12,w10, LSL #0x3
00b74aa0	orr w9,w9,w1, LSL #0x7
00b74aa4	orr w10,w10,w3, LSL #0x1
00b74aa8	orr w9,w9,w2, LSL #0x6
00b74aac	orr w10,w10,w4
00b74ab0	orr w9,w9,w11, LSL #0x5
00b74ab4	orr w11,w10,w5, LSL #0x7
00b74ab8	orr w12,w11,w6, LSL #0x6
00b74abc	orr w13,w9,w14, LSL #0x4
00b74ac0	orr w14,w12,w7, LSL #0x5
00b74ac4	and w18,w13,#0xfffffff
00b74ac8	orr w13,w14,w19, LSL #0x4
00b74acc	mov w8,wzr
00b74ad0	mov w9,#0x24000000
00b74ad4	mov w10,#0x2080000
00b74ad8	mov w11,#0x11
00b74adc	and w15,w13,#0xfffffff
00b74ae0	and w14,w8,#0x7fffffff
00b74ae4	cmp w14,#0xf
00b74ae8	b.hi 0x00b74b10
00b74aec	mov w12,#0x1
00b74af0	lsl w14,w12,w14
00b74af4	mov w12,#0x8103
00b74af8	tst w14,w12
00b74afc	b.eq 0x00b74b10
00b74b00	orr w14,wzr,#0xffffffe
00b74b04	mov w1,#0x1b
00b74b08	mov w17,#0x1
00b74b0c	b 0x00b74b1c
00b74b10	orr w14,wzr,#0xffffffc
00b74b14	mov w1,#0x1a
00b74b18	mov w17,#0x2
00b74b1c	lsl w16,w18,w17
00b74b20	and w4,w16,w14
00b74b24	lsr w18,w18,w1
00b74b28	and w13,w9,w4, LSL #0x4
00b74b2c	lsr w3,w16,#0xd
00b74b30	lsl w27,w16,#0x11
00b74b34	bfm w13,w18,#0x4,#0x0
00b74b38	orr w18,w4,w18
00b74b3c	and w27,w27,#0x10000000
00b74b40	bfm w13,w3,#0x5,#0x0
00b74b44	lsr w3,w18,#0xe
00b74b48	bfm w27,w3,#0x3,#0x0
00b74b4c	and w3,w10,w18, LSL #0x12
00b74b50	lsr w2,w16,#0x12
00b74b54	orr w13,w13,w3
00b74b58	lsr w3,w18,#0x11
00b74b5c	lsl w17,w15,w17
00b74b60	lsr w15,w15,w1
00b74b64	lsr w1,w16,#0xc
00b74b68	lsr w5,w16,#0x1
00b74b6c	lsr w28,w16,#0x2
00b74b70	bfm w27,w3,#0x5,#0x0
00b74b74	bfm w13,w2,#0x8,#0x0
00b74b78	lsr w2,w18,#0x4
00b74b7c	bfm w27,w2,#0x6,#0x0
00b74b80	bfm w13,w1,#0xb,#0x0
00b74b84	and w28,w28,#0x2000000
00b74b88	and w5,w5,#0x100000
00b74b8c	orr w27,w27,w28
00b74b90	orr w13,w13,w5
00b74b94	lsr w5,w4,#0x17
00b74b98	bfm w27,w5,#0x8,#0x0
00b74b9c	lsl w5,w18,#0xa
00b74ba0	and w5,w5,#0x40000
00b74ba4	lsl w29,w16,#0xb
00b74ba8	orr w13,w13,w5
00b74bac	lsr w5,w18,#0x5
00b74bb0	bfm w27,w5,#0xb,#0x0
00b74bb4	lsl w5,w4,#0x2
00b74bb8	and w29,w29,#0x100000
00b74bbc	lsl w4,w4,#0x3
00b74bc0	lsr w6,w16,#0xa
00b74bc4	lsr w30,w16,#0x6
00b74bc8	and w5,w5,#0x20000
00b74bcc	orr w27,w27,w29
00b74bd0	and w4,w4,#0x80000
00b74bd4	and w6,w6,#0x10000
00b74bd8	and w30,w30,#0x40000
00b74bdc	orr w13,w13,w5
00b74be0	orr w4,w27,w4
00b74be4	lsl w27,w18,#0xf
00b74be8	and w14,w17,w14
00b74bec	lsr w7,w17,#0xd
00b74bf0	and w21,w17,#0x100
00b74bf4	lsr w16,w16,#0x4
00b74bf8	orr w13,w13,w6
00b74bfc	orr w4,w4,w30
00b74c00	and w27,w27,#0x20000
00b74c04	lsr w19,w17,#0x4
00b74c08	ubfiz w28,w15,#0x2,#0x1
00b74c0c	orr w15,w14,w15
00b74c10	and w7,w7,#0x2000
00b74c14	and w16,w16,#0x10000
00b74c18	orr w13,w13,w21
00b74c1c	orr w4,w4,w27
00b74c20	lsr w12,w17,#0x2
00b74c24	and w2,w17,#0x200
00b74c28	and w19,w19,#0x1000
00b74c2c	lsl w5,w15,#0x6
00b74c30	orr w13,w13,w7
00b74c34	orr w16,w4,w16
00b74c38	lsr w20,w17,#0x1
00b74c3c	and w12,w12,#0x2000
00b74c40	lsl w21,w15,#0x8
00b74c44	and w5,w5,#0x800
00b74c48	orr w13,w13,w19
00b74c4c	orr w16,w16,w2
00b74c50	and w20,w20,#0x400
00b74c54	lsr w14,w14,#0xe
00b74c58	and w21,w21,#0x1000
00b74c5c	orr w13,w13,w5
00b74c60	orr w12,w16,w12
00b74c64	lsr w22,w17,#0x5
00b74c68	lsr w3,w17,#0x9
00b74c6c	and w29,w14,#0x200
00b74c70	and w14,w14,#0x8080808
00b74c74	orr w13,w13,w20
00b74c78	orr w12,w12,w21
00b74c7c	lsr w23,w17,#0xa
00b74c80	and w22,w22,#0x20
00b74c84	and w3,w3,#0x400
00b74c88	lsl w30,w15,#0x7
00b74c8c	orr w13,w13,w29
00b74c90	orr w12,w12,w14
00b74c94	lsr w1,w17,#0x7
00b74c98	and w23,w23,#0x10
00b74c9c	lsr w6,w15,#0x3
00b74ca0	and w30,w30,#0x100
00b74ca4	orr w13,w13,w22
00b74ca8	orr w12,w12,w3
00b74cac	lsr w24,w17,#0x12
00b74cb0	and w1,w1,#0x20
00b74cb4	and w7,w6,#0x8
00b74cb8	orr w13,w13,w23
00b74cbc	orr w12,w12,w30
00b74cc0	lsr w25,w17,#0x1a
00b74cc4	and w24,w24,#0x4
00b74cc8	and w6,w6,w11
00b74ccc	orr w13,w13,w7
00b74cd0	orr w12,w12,w1
00b74cd4	ubfx w26,w17,#0x18,#0x1
00b74cd8	lsr w17,w17,#0x15
00b74cdc	and w25,w25,#0x2
00b74ce0	orr w13,w13,w24
00b74ce4	orr w12,w12,w6
00b74ce8	and w17,w17,#0x2
00b74cec	orr w13,w13,w25
00b74cf0	orr w12,w12,w28
00b74cf4	add w8,w8,#0x1
00b74cf8	orr w13,w13,w26
00b74cfc	orr w12,w12,w17
00b74d00	cmp w8,#0x10
00b74d04	stp w13,w12,[x0], #0x8
00b74d08	b.ne 0x00b74ae0
00b74d0c	ldp x29,x30,[sp, #0x50]
00b74d10	ldp x20,x19,[sp, #0x40]
00b74d14	ldp x22,x21,[sp, #0x30]
00b74d18	ldp x24,x23,[sp, #0x20]
00b74d1c	ldp x26,x25,[sp, #0x10]
00b74d20	ldp x28,x27,[sp], #0x60
00b74d24	ret
