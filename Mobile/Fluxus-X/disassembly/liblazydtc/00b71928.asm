; mbedtls_camellia_setkey_enc @ 00b71928
00b71928	sub sp,sp,#0x160
00b7192c	stp x28,x23,[sp, #0x120]
00b71930	stp x22,x21,[sp, #0x130]
00b71934	stp x20,x19,[sp, #0x140]
00b71938	stp x29,x30,[sp, #0x150]
00b7193c	add x29,sp,#0x150
00b71940	mrs x22,tpidr_el0
00b71944	ldr x8,[x22, #0x28]
00b71948	mov w20,w2
00b7194c	mov x21,x1
00b71950	mov x19,x0
00b71954	sub x9,x29,#0x78
00b71958	add x0,x0,#0x4
00b7195c	movi v0.2D,#0x0
00b71960	mov w2,#0x110
00b71964	mov w1,wzr
00b71968	str x8,[sp, #0x8]
00b7196c	stp q0,q0,[x9, #0x20]
00b71970	stp q0,q0,[x9]
00b71974	bl 0x00c301c0
00b71978	cmp w20,#0x100
00b7197c	b.eq 0x00b719a4
00b71980	cmp w20,#0xc0
00b71984	b.eq 0x00b719a4
00b71988	cmp w20,#0x80
00b7198c	b.ne 0x00b72150
00b71990	orr w8,wzr,#0x3
00b71994	mov w23,wzr
00b71998	str w8,[x19]
00b7199c	mov w8,#0x10
00b719a0	b 0x00b719b8
00b719a4	mov w9,#0x4
00b719a8	lsr w8,w20,#0x3
00b719ac	mov w23,#0x1
00b719b0	str w9,[x19]
00b719b4	cbz w8,0x00b719c8
00b719b8	mov w2,w8
00b719bc	sub x0,x29,#0x78
00b719c0	mov x1,x21
00b719c4	bl 0x00c2ffd0
00b719c8	sub x8,x29,#0x78
00b719cc	cmp w20,#0xc0
00b719d0	b.ne 0x00b719f0
00b719d4	ldur d0,[x29, #-0x68]
00b719d8	add x9,x8,#0x18
00b719dc	add x10,x8,#0x14
00b719e0	add x8,x8,#0x1c
00b719e4	mvn v0.8B,v0.8B
00b719e8	stur d0,[x29, #-0x60]
00b719ec	b 0x00b719fc
00b719f0	add x10,x8,#0x14
00b719f4	add x9,x8,#0x18
00b719f8	add x8,x8,#0x1c
00b719fc	adrp x11,0x29c000
00b71a00	ldr q0,[x11, #0x470]
00b71a04	adrp x12,0x29c000
00b71a08	ldp w14,w15,[x29, #-0x78]
00b71a0c	ldp w16,w17,[x29, #-0x70]
00b71a10	str q0,[sp, #0xa0]
00b71a14	ldr q0,[x12, #0x2a0]
00b71a18	ldur w18,[x29, #-0x68]
00b71a1c	ldr w0,[x10]
00b71a20	ldr w1,[x9]
00b71a24	adrp x13,0x29c000
00b71a28	ldr w2,[x8]
00b71a2c	str q0,[sp, #0xb0]
00b71a30	ldr q0,[x13, #0xdb0]
00b71a34	rev w12,w14
00b71a38	rev w13,w15
00b71a3c	mov w3,#0x667f
00b71a40	stp w12,w13,[sp, #0x60]
00b71a44	rev w12,w16
00b71a48	rev w13,w17
00b71a4c	eor w14,w18,w14
00b71a50	movk w3,#0xa09e, LSL #16
00b71a54	eor w15,w0,w15
00b71a58	eor w16,w1,w16
00b71a5c	stp w12,w13,[sp, #0x68]
00b71a60	rev w13,w14
00b71a64	adrp x8,0x77e000
00b71a68	rev w18,w18
00b71a6c	rev w0,w0
00b71a70	rev w12,w15
00b71a74	rev w15,w16
00b71a78	eor w16,w13,w3
00b71a7c	add x8,x8,#0x210
00b71a80	adrp x10,0x77e000
00b71a84	rev w1,w1
00b71a88	eor w17,w2,w17
00b71a8c	rev w2,w2
00b71a90	stp w18,w0,[sp, #0x70]
00b71a94	lsr w0,w16,#0x18
00b71a98	add x10,x10,#0x310
00b71a9c	adrp x9,0x77e000
00b71aa0	stp w1,w2,[sp, #0x78]
00b71aa4	ubfx w1,w16,#0x10,#0x8
00b71aa8	ldrb w0,[x8, w0, UXTW ]
00b71aac	mov w4,#0x908b
00b71ab0	add x9,x9,#0x410
00b71ab4	ubfx w2,w16,#0x8,#0x8
00b71ab8	ldrb w1,[x10, w1, UXTW ]
00b71abc	movk w4,#0x3bcc, LSL #16
00b71ac0	ldrb w2,[x9, w2, UXTW ]
00b71ac4	rev w14,w17
00b71ac8	eor w17,w12,w4
00b71acc	lsr w3,w17,#0x18
00b71ad0	lsl w0,w0,#0x18
00b71ad4	adrp x11,0x77e000
00b71ad8	ubfx w4,w17,#0x10,#0x8
00b71adc	ldrb w3,[x10, w3, UXTW ]
00b71ae0	bfm w0,w1,#0x10,#0x7
00b71ae4	add x11,x11,#0x510
00b71ae8	ldrb w4,[x9, w4, UXTW ]
00b71aec	bfm w0,w2,#0x18,#0x7
00b71af0	ubfx w2,w17,#0x8,#0x8
00b71af4	ldrb w2,[x11, w2, UXTW ]
00b71af8	and w17,w17,#0xff
00b71afc	and w16,w16,#0xff
00b71b00	ldrb w17,[x8, w17, UXTW ]
00b71b04	lsl w1,w3,#0x18
00b71b08	ldrb w16,[x11, w16, UXTW ]
00b71b0c	bfm w1,w4,#0x10,#0x7
00b71b10	bfm w1,w2,#0x18,#0x7
00b71b14	orr w17,w1,w17
00b71b18	orr w16,w0,w16
00b71b1c	bfm w3,w17,#0x18,#0x17
00b71b20	ldp w18,w4,[sp, #0xa8]
00b71b24	eor w16,w3,w16
00b71b28	eor w17,w17,w16, ROR #0x10
00b71b2c	eor w16,w16,w17, ROR #0x8
00b71b30	eor w15,w17,w15
00b71b34	eor w15,w15,w16, ROR #0x8
00b71b38	eor w14,w16,w14
00b71b3c	eor w16,w15,w18
00b71b40	lsr w18,w16,#0x18
00b71b44	ubfx w0,w16,#0x10,#0x8
00b71b48	ldrb w18,[x8, w18, UXTW ]
00b71b4c	ubfx w1,w16,#0x8,#0x8
00b71b50	ldrb w0,[x10, w0, UXTW ]
00b71b54	ldrb w1,[x9, w1, UXTW ]
00b71b58	eor w17,w14,w4
00b71b5c	lsr w3,w17,#0x18
00b71b60	lsl w18,w18,#0x18
00b71b64	ubfx w4,w17,#0x10,#0x8
00b71b68	ldrb w3,[x10, w3, UXTW ]
00b71b6c	bfm w18,w0,#0x10,#0x7
00b71b70	ldrb w4,[x9, w4, UXTW ]
00b71b74	bfm w18,w1,#0x18,#0x7
00b71b78	ubfx w1,w17,#0x8,#0x8
00b71b7c	ldrb w1,[x11, w1, UXTW ]
00b71b80	and w17,w17,#0xff
00b71b84	and w16,w16,#0xff
00b71b88	ldrb w17,[x8, w17, UXTW ]
00b71b8c	lsl w0,w3,#0x18
00b71b90	ldrb w16,[x11, w16, UXTW ]
00b71b94	bfm w0,w4,#0x10,#0x7
00b71b98	bfm w0,w1,#0x18,#0x7
00b71b9c	orr w17,w0,w17
00b71ba0	orr w16,w18,w16
00b71ba4	bfm w3,w17,#0x18,#0x17
00b71ba8	ldr w0,[sp, #0x60]
00b71bac	eor w16,w3,w16
00b71bb0	ldr w2,[sp, #0xb0]
00b71bb4	eor w17,w17,w16, ROR #0x10
00b71bb8	stp w13,w12,[sp, #0x80]
00b71bbc	eor w16,w16,w17, ROR #0x8
00b71bc0	eor w13,w17,w13
00b71bc4	eor w13,w13,w16, ROR #0x8
00b71bc8	eor w13,w13,w0
00b71bcc	eor w12,w16,w12
00b71bd0	eor w16,w2,w13
00b71bd4	lsr w0,w16,#0x18
00b71bd8	ldr w17,[sp, #0x64]
00b71bdc	ubfx w2,w16,#0x10,#0x8
00b71be0	ldrb w0,[x8, w0, UXTW ]
00b71be4	ldp w4,w1,[sp, #0xb4]
00b71be8	ldrb w2,[x10, w2, UXTW ]
00b71bec	ubfx w3,w16,#0x8,#0x8
00b71bf0	and w16,w16,#0xff
00b71bf4	ldrb w3,[x9, w3, UXTW ]
00b71bf8	ldrb w16,[x11, w16, UXTW ]
00b71bfc	eor w17,w12,w17
00b71c00	lsl w0,w0,#0x18
00b71c04	eor w12,w4,w17
00b71c08	bfm w0,w2,#0x10,#0x7
00b71c0c	ldp w4,w2,[sp, #0x68]
00b71c10	bfm w0,w3,#0x18,#0x7
00b71c14	lsr w3,w12,#0x18
00b71c18	orr w16,w0,w16
00b71c1c	ubfx w0,w12,#0x10,#0x8
00b71c20	ldrb w3,[x10, w3, UXTW ]
00b71c24	eor w15,w15,w4
00b71c28	ubfx w4,w12,#0x8,#0x8
00b71c2c	ldrb w0,[x9, w0, UXTW ]
00b71c30	and w12,w12,#0xff
00b71c34	ldrb w4,[x11, w4, UXTW ]
00b71c38	ldrb w12,[x8, w12, UXTW ]
00b71c3c	eor w2,w14,w2
00b71c40	lsl w14,w3,#0x18
00b71c44	bfm w14,w0,#0x10,#0x7
00b71c48	bfm w14,w4,#0x18,#0x7
00b71c4c	orr w12,w14,w12
00b71c50	bfm w3,w12,#0x18,#0x17
00b71c54	eor w14,w3,w16
00b71c58	ldr w18,[sp, #0xbc]
00b71c5c	eor w12,w12,w14, ROR #0x10
00b71c60	eor w16,w14,w12, ROR #0x8
00b71c64	eor w12,w12,w15
00b71c68	eor w14,w12,w16, ROR #0x8
00b71c6c	eor w15,w16,w2
00b71c70	eor w12,w14,w1
00b71c74	eor w16,w15,w18
00b71c78	lsr w18,w12,#0x18
00b71c7c	ubfx w0,w12,#0x10,#0x8
00b71c80	lsr w2,w16,#0x18
00b71c84	ldrb w18,[x8, w18, UXTW ]
00b71c88	ubfx w3,w16,#0x10,#0x8
00b71c8c	ldrb w0,[x10, w0, UXTW ]
00b71c90	ldrb w2,[x10, w2, UXTW ]
00b71c94	ubfx w4,w16,#0x8,#0x8
00b71c98	ldrb w3,[x9, w3, UXTW ]
00b71c9c	ubfx w1,w12,#0x8,#0x8
00b71ca0	ldrb w4,[x11, w4, UXTW ]
00b71ca4	and w16,w16,#0xff
00b71ca8	ldrb w1,[x9, w1, UXTW ]
00b71cac	lsl w18,w18,#0x18
00b71cb0	and w12,w12,#0xff
00b71cb4	ldrb w16,[x8, w16, UXTW ]
00b71cb8	bfm w18,w0,#0x10,#0x7
00b71cbc	lsl w0,w2,#0x18
00b71cc0	ldrb w12,[x11, w12, UXTW ]
00b71cc4	bfm w0,w3,#0x10,#0x7
00b71cc8	bfm w0,w4,#0x18,#0x7
00b71ccc	bfm w18,w1,#0x18,#0x7
00b71cd0	orr w16,w0,w16
00b71cd4	orr w12,w18,w12
00b71cd8	bfm w2,w16,#0x18,#0x17
00b71cdc	eor w12,w2,w12
00b71ce0	eor w16,w16,w12, ROR #0x10
00b71ce4	eor w18,w12,w16, ROR #0x8
00b71ce8	eor w12,w16,w13
00b71cec	cmp w20,#0x81
00b71cf0	eor w12,w12,w18, ROR #0x8
00b71cf4	eor w16,w18,w17
00b71cf8	stp xzr,xzr,[sp, #0x90]
00b71cfc	str q0,[sp, #0xc0]
00b71d00	stp w13,w17,[sp, #0x80]
00b71d04	stp w14,w15,[sp, #0x88]
00b71d08	stp w12,w16,[sp, #0x80]
00b71d0c	b.cc 0x00b71e40
00b71d10	ldp w13,w17,[sp, #0x70]
00b71d14	ldp w1,w2,[sp, #0xc0]
00b71d18	ldp w18,w0,[sp, #0x78]
00b71d1c	eor w13,w12,w13
00b71d20	eor w12,w16,w17
00b71d24	eor w16,w1,w13
00b71d28	eor w14,w14,w18
00b71d2c	lsr w18,w16,#0x18
00b71d30	eor w15,w15,w0
00b71d34	ubfx w0,w16,#0x10,#0x8
00b71d38	ldrb w18,[x8, w18, UXTW ]
00b71d3c	ubfx w1,w16,#0x8,#0x8
00b71d40	ldrb w0,[x10, w0, UXTW ]
00b71d44	ldrb w1,[x9, w1, UXTW ]
00b71d48	eor w17,w2,w12
00b71d4c	lsr w2,w17,#0x18
00b71d50	lsl w18,w18,#0x18
00b71d54	ubfx w3,w17,#0x10,#0x8
00b71d58	ldrb w2,[x10, w2, UXTW ]
00b71d5c	bfm w18,w0,#0x10,#0x7
00b71d60	ldrb w3,[x9, w3, UXTW ]
00b71d64	bfm w18,w1,#0x18,#0x7
00b71d68	ubfx w1,w17,#0x8,#0x8
00b71d6c	ldrb w1,[x11, w1, UXTW ]
00b71d70	and w17,w17,#0xff
00b71d74	and w16,w16,#0xff
00b71d78	ldrb w17,[x8, w17, UXTW ]
00b71d7c	lsl w0,w2,#0x18
00b71d80	ldrb w16,[x11, w16, UXTW ]
00b71d84	bfm w0,w3,#0x10,#0x7
00b71d88	bfm w0,w1,#0x18,#0x7
00b71d8c	orr w17,w0,w17
00b71d90	orr w16,w18,w16
00b71d94	bfm w2,w17,#0x18,#0x17
00b71d98	ldp w18,w0,[sp, #0xc8]
00b71d9c	eor w16,w2,w16
00b71da0	eor w17,w17,w16, ROR #0x10
00b71da4	eor w16,w16,w17, ROR #0x8
00b71da8	eor w14,w17,w14
00b71dac	eor w14,w14,w16, ROR #0x8
00b71db0	eor w15,w16,w15
00b71db4	stp w14,w15,[sp, #0x98]
00b71db8	eor w14,w14,w18
00b71dbc	eor w15,w15,w0
00b71dc0	lsr w16,w14,#0x18
00b71dc4	ubfx w17,w14,#0x10,#0x8
00b71dc8	lsr w0,w15,#0x18
00b71dcc	ubfx w18,w14,#0x8,#0x8
00b71dd0	ubfx w1,w15,#0x10,#0x8
00b71dd4	ldrb w17,[x10, w17, UXTW ]
00b71dd8	ldrb w10,[x10, w0, UXTW ]
00b71ddc	ldrb w16,[x8, w16, UXTW ]
00b71de0	and w14,w14,#0xff
00b71de4	ubfx w0,w15,#0x8,#0x8
00b71de8	ldrb w18,[x9, w18, UXTW ]
00b71dec	ldrb w9,[x9, w1, UXTW ]
00b71df0	and w15,w15,#0xff
00b71df4	ldrb w14,[x11, w14, UXTW ]
00b71df8	ldrb w11,[x11, w0, UXTW ]
00b71dfc	ldrb w8,[x8, w15, UXTW ]
00b71e00	lsl w15,w16,#0x18
00b71e04	lsl w16,w10,#0x18
00b71e08	bfm w16,w9,#0x10,#0x7
00b71e0c	bfm w15,w17,#0x10,#0x7
00b71e10	bfm w16,w11,#0x18,#0x7
00b71e14	bfm w15,w18,#0x18,#0x7
00b71e18	orr w8,w16,w8
00b71e1c	orr w9,w15,w14
00b71e20	bfm w10,w8,#0x18,#0x17
00b71e24	eor w9,w10,w9
00b71e28	eor w8,w8,w9, ROR #0x10
00b71e2c	eor w9,w9,w8, ROR #0x8
00b71e30	eor w8,w8,w13
00b71e34	eor w8,w8,w9, ROR #0x8
00b71e38	eor w9,w9,w12
00b71e3c	stp w8,w9,[sp, #0x90]
00b71e40	ldp w8,w10,[sp, #0x60]
00b71e44	ldp w11,w12,[sp, #0x68]
00b71e48	extr w9,w8,w10,#0x11
00b71e4c	str w9,[sp, #0x20]
00b71e50	extr w9,w10,w11,#0x11
00b71e54	str w9,[sp, #0x24]
00b71e58	extr w9,w11,w12,#0x11
00b71e5c	str w9,[sp, #0x28]
00b71e60	extr w9,w12,w8,#0x11
00b71e64	stp w8,w10,[sp, #0x10]
00b71e68	stp w11,w12,[sp, #0x18]
00b71e6c	str w9,[sp, #0x2c]
00b71e70	cbnz w23,0x00b71e8c
00b71e74	extr w9,w8,w10,#0x2
00b71e78	extr w13,w10,w11,#0x2
00b71e7c	extr w14,w11,w12,#0x2
00b71e80	extr w15,w12,w8,#0x2
00b71e84	stp w9,w13,[sp, #0x30]
00b71e88	stp w14,w15,[sp, #0x38]
00b71e8c	extr w13,w8,w10,#0x13
00b71e90	extr w14,w10,w11,#0x13
00b71e94	extr w15,w11,w12,#0x13
00b71e98	extr w16,w12,w8,#0x13
00b71e9c	extr w17,w8,w10,#0x4
00b71ea0	extr w10,w10,w11,#0x4
00b71ea4	extr w11,w11,w12,#0x4
00b71ea8	extr w12,w12,w8,#0x4
00b71eac	adrp x8,0x77d000
00b71eb0	stp w13,w14,[sp, #0x40]
00b71eb4	mov w13,#0x50
00b71eb8	add x8,x8,#0xd7c
00b71ebc	mov x9,xzr
00b71ec0	stp w17,w10,[sp, #0x50]
00b71ec4	stp w11,w12,[sp, #0x58]
00b71ec8	nop
00b71ecc	madd x10,x23,x13,x8
00b71ed0	add x11,sp,#0x10
00b71ed4	stp w15,w16,[sp, #0x48]
00b71ed8	ldrsb x12,[x10, x9]
00b71edc	cmn x12,#0x1
00b71ee0	b.eq 0x00b71ef0
00b71ee4	ldr w13,[x11, x9, LSL #0x2]
00b71ee8	add x12,x19,x12, LSL #0x2
00b71eec	str w13,[x12, #0x4]
00b71ef0	add x9,x9,#0x1
00b71ef4	cmp x9,#0x14
00b71ef8	b.ne 0x00b71ed8
00b71efc	cmp w20,#0x81
00b71f00	b.cc 0x00b71f98
00b71f04	ldp w9,w10,[sp, #0x70]
00b71f08	ldp w11,w12,[sp, #0x78]
00b71f0c	stp w9,w10,[sp, #0x10]
00b71f10	stp w11,w12,[sp, #0x18]
00b71f14	cbz w23,0x00b71f60
00b71f18	extr w13,w9,w10,#0x11
00b71f1c	extr w14,w10,w11,#0x11
00b71f20	extr w15,w11,w12,#0x11
00b71f24	extr w16,w12,w9,#0x11
00b71f28	extr w17,w9,w10,#0x2
00b71f2c	extr w18,w10,w11,#0x2
00b71f30	extr w0,w11,w12,#0x2
00b71f34	extr w1,w12,w9,#0x2
00b71f38	extr w2,w9,w10,#0x4
00b71f3c	extr w10,w10,w11,#0x4
00b71f40	extr w11,w11,w12,#0x4
00b71f44	extr w9,w12,w9,#0x4
00b71f48	stp w13,w14,[sp, #0x20]
00b71f4c	stp w15,w16,[sp, #0x28]
00b71f50	stp w17,w18,[sp, #0x30]
00b71f54	stp w0,w1,[sp, #0x38]
00b71f58	stp w2,w10,[sp, #0x50]
00b71f5c	stp w11,w9,[sp, #0x58]
00b71f60	mov w10,#0x50
00b71f64	madd x10,x23,x10,x8
00b71f68	mov x9,xzr
00b71f6c	add x10,x10,#0x14
00b71f70	add x11,sp,#0x10
00b71f74	ldrsb x12,[x10, x9]
00b71f78	cmn x12,#0x1
00b71f7c	b.eq 0x00b71f8c
00b71f80	ldr w13,[x11, x9, LSL #0x2]
00b71f84	add x12,x19,x12, LSL #0x2
00b71f88	str w13,[x12, #0x4]
00b71f8c	add x9,x9,#0x1
00b71f90	cmp x9,#0x14
00b71f94	b.ne 0x00b71f74
00b71f98	ldp w9,w12,[sp, #0x80]
00b71f9c	ldp w11,w10,[sp, #0x88]
00b71fa0	extr w13,w9,w12,#0x11
00b71fa4	str w13,[sp, #0x20]
00b71fa8	extr w13,w12,w11,#0x11
00b71fac	str w13,[sp, #0x24]
00b71fb0	extr w13,w11,w10,#0x11
00b71fb4	str w13,[sp, #0x28]
00b71fb8	extr w13,w10,w9,#0x11
00b71fbc	str w13,[sp, #0x2c]
00b71fc0	extr w13,w9,w12,#0x2
00b71fc4	str w13,[sp, #0x30]
00b71fc8	extr w13,w12,w11,#0x2
00b71fcc	str w13,[sp, #0x34]
00b71fd0	extr w13,w11,w10,#0x2
00b71fd4	str w13,[sp, #0x38]
00b71fd8	extr w13,w10,w9,#0x2
00b71fdc	str w13,[sp, #0x3c]
00b71fe0	extr w13,w9,w12,#0x13
00b71fe4	str w13,[sp, #0x40]
00b71fe8	extr w13,w12,w11,#0x13
00b71fec	str w13,[sp, #0x44]
00b71ff0	extr w13,w11,w10,#0x13
00b71ff4	str w13,[sp, #0x48]
00b71ff8	extr w13,w10,w9,#0x13
00b71ffc	stp w9,w12,[sp, #0x10]
00b72000	stp w11,w10,[sp, #0x18]
00b72004	str w13,[sp, #0x4c]
00b72008	cbnz w23,0x00b72024
00b7200c	extr w13,w9,w12,#0x4
00b72010	extr w12,w12,w11,#0x4
00b72014	extr w11,w11,w10,#0x4
00b72018	extr w9,w10,w9,#0x4
00b7201c	stp w13,w12,[sp, #0x50]
00b72020	stp w11,w9,[sp, #0x58]
00b72024	mov w10,#0x50
00b72028	madd x10,x23,x10,x8
00b7202c	mov x9,xzr
00b72030	add x10,x10,#0x28
00b72034	add x11,sp,#0x10
00b72038	ldrsb x12,[x10, x9]
00b7203c	cmn x12,#0x1
00b72040	b.eq 0x00b72050
00b72044	ldr w13,[x11, x9, LSL #0x2]
00b72048	add x12,x19,x12, LSL #0x2
00b7204c	str w13,[x12, #0x4]
00b72050	add x9,x9,#0x1
00b72054	cmp x9,#0x14
00b72058	b.ne 0x00b72038
00b7205c	cmp w20,#0x81
00b72060	b.cc 0x00b720f8
00b72064	ldp w9,w10,[sp, #0x90]
00b72068	ldp w11,w12,[sp, #0x98]
00b7206c	stp w9,w10,[sp, #0x10]
00b72070	stp w11,w12,[sp, #0x18]
00b72074	cbz w23,0x00b720c0
00b72078	extr w13,w9,w10,#0x11
00b7207c	extr w14,w10,w11,#0x11
00b72080	extr w15,w11,w12,#0x11
00b72084	extr w16,w12,w9,#0x11
00b72088	extr w17,w9,w10,#0x2
00b7208c	extr w18,w10,w11,#0x2
00b72090	extr w0,w11,w12,#0x2
00b72094	extr w1,w12,w9,#0x2
00b72098	extr w2,w9,w10,#0x4
00b7209c	extr w10,w10,w11,#0x4
00b720a0	extr w11,w11,w12,#0x4
00b720a4	extr w9,w12,w9,#0x4
00b720a8	stp w13,w14,[sp, #0x20]
00b720ac	stp w15,w16,[sp, #0x28]
00b720b0	stp w17,w18,[sp, #0x30]
00b720b4	stp w0,w1,[sp, #0x38]
00b720b8	stp w2,w10,[sp, #0x50]
00b720bc	stp w11,w9,[sp, #0x58]
00b720c0	mov w10,#0x50
00b720c4	madd x8,x23,x10,x8
00b720c8	mov x9,xzr
00b720cc	add x8,x8,#0x3c
00b720d0	add x10,sp,#0x10
00b720d4	ldrsb x11,[x8, x9]
00b720d8	cmn x11,#0x1
00b720dc	b.eq 0x00b720ec
00b720e0	ldr w12,[x10, x9, LSL #0x2]
00b720e4	add x11,x19,x11, LSL #0x2
00b720e8	str w12,[x11, #0x4]
00b720ec	add x9,x9,#0x1
00b720f0	cmp x9,#0x14
00b720f4	b.ne 0x00b720d4
00b720f8	mov w9,w23
00b720fc	mov w10,#0x20
00b72100	bfm w9,w23,#0x1f,#0x0
00b72104	adrp x12,0x77d000
00b72108	bfm w10,w9,#0x1e,#0x1
00b7210c	mov w11,#0x14
00b72110	add x12,x12,#0xe1c
00b72114	add x10,x19,w10, UXTW  #0x2
00b72118	mov x8,xzr
00b7211c	madd x9,x23,x11,x12
00b72120	add x10,x10,#0x4
00b72124	ldrsb x11,[x9, x8]
00b72128	cmn x11,#0x1
00b7212c	b.eq 0x00b7213c
00b72130	add x11,x19,x11, LSL #0x2
00b72134	ldr w11,[x11, #0x4]
00b72138	str w11,[x10, x8, LSL #0x2]
00b7213c	add x8,x8,#0x1
00b72140	cmp x8,#0x14
00b72144	b.ne 0x00b72124
00b72148	mov w0,wzr
00b7214c	b 0x00b72154
00b72150	mov w0,#0xffffffdc
00b72154	ldr x8,[x22, #0x28]
00b72158	ldr x9,[sp, #0x8]
00b7215c	cmp x8,x9
00b72160	b.ne 0x00b7217c
00b72164	ldp x29,x30,[sp, #0x150]
00b72168	ldp x20,x19,[sp, #0x140]
00b7216c	ldp x22,x21,[sp, #0x130]
00b72170	ldp x28,x23,[sp, #0x120]
00b72174	add sp,sp,#0x160
00b72178	ret
00b7217c	bl 0x00c2fec0
