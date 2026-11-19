; FUN_00a10a24 @ 00a10a24
00a10a24	stp x28,x25,[sp, #-0x50]!
00a10a28	stp x24,x23,[sp, #0x10]
00a10a2c	stp x22,x21,[sp, #0x20]
00a10a30	stp x20,x19,[sp, #0x30]
00a10a34	stp x29,x30,[sp, #0x40]
00a10a38	add x29,sp,#0x40
00a10a3c	sub sp,sp,#0x240
00a10a40	mov x24,x3
00a10a44	adrp x3,0xa11000
00a10a48	mov w19,w2
00a10a4c	mov x20,x1
00a10a50	movi d0,#-0x1
00a10a54	mov w8,#0x1
00a10a58	add x3,x3,#0x474
00a10a5c	mov w1,#0x2c
00a10a60	mov w2,#0x1
00a10a64	add x4,sp,#0x28
00a10a68	str xzr,[sp, #0x20]
00a10a6c	str xzr,[sp, #0x8]
00a10a70	str d0,[sp, #0x28]
00a10a74	str w8,[sp, #0x34]
00a10a78	str wzr,[sp, #0x220]
00a10a7c	bl 0x00c35230
00a10a80	cbz w0,0x00a10ab0
00a10a84	mov w8,#0xc2
00a10a88	mov x19,xzr
00a10a8c	str w8,[x24]
00a10a90	mov x0,x19
00a10a94	add sp,sp,#0x240
00a10a98	ldp x29,x30,[sp, #0x40]
00a10a9c	ldp x20,x19,[sp, #0x30]
00a10aa0	ldp x22,x21,[sp, #0x20]
00a10aa4	ldp x24,x23,[sp, #0x10]
00a10aa8	ldp x28,x25,[sp], #0x50
00a10aac	ret
00a10ab0	ldr w21,[sp, #0x30]
00a10ab4	and w8,w21,#0xfffffffe
00a10ab8	cmp w8,#0x10
00a10abc	b.ne 0x00a10ad4
00a10ac0	cbz x20,0x00a10b30
00a10ac4	cmp w19,#0x32
00a10ac8	b.lt 0x00a10b70
00a10acc	mov w8,#0xb5
00a10ad0	b 0x00a10a88
00a10ad4	ldr x20,[sp, #0x38]
00a10ad8	ldr w22,[sp, #0x34]
00a10adc	bl 0x00c37a40
00a10ae0	mov x19,x0
00a10ae4	cbz x0,0x00a10b38
00a10ae8	adrp x9,0x2ab000
00a10aec	add x9,x9,#0x32c
00a10af0	cmp x20,#0x0
00a10af4	sub w8,w21,#0x1
00a10af8	csel x20,x9,x20,eq
00a10afc	cmp w8,#0x1d
00a10b00	b.hi 0x00a10eec
00a10b04	adrp x9,0x752000
00a10b08	add x9,x9,#0x5d8
00a10b0c	ldrsw x8,[x9, x8, LSL #0x2]
00a10b10	add x8,x8,x9
00a10b14	br x8
00a10b18	cmp w22,#0x1
00a10b1c	b.eq 0x00a10c60
00a10b20	cmp w22,#0x2
00a10b24	b.ne 0x00a10c9c
00a10b28	mov w22,#0x1000
00a10b2c	b 0x00a10c64
00a10b30	orr w8,wzr,#0xc0
00a10b34	b 0x00a10a88
00a10b38	bl 0x00c342a0
00a10b3c	adrp x0,0x2a9000
00a10b40	adrp x2,0x2d9000
00a10b44	add x0,x0,#0xfe8
00a10b48	add x2,x2,#0xa31
00a10b4c	mov w1,#0x248
00a10b50	bl 0x00c342b0
00a10b54	mov w1,#0x100
00a10b58	mov w0,#0xd
00a10b5c	movk w1,#0xc, LSL #16
00a10b60	mov x2,xzr
00a10b64	bl 0x00c342c0
00a10b68	cbnz x19,0x00a1110c
00a10b6c	b 0x00a10a90
00a10b70	ldr x23,[sp, #0x38]
00a10b74	stur xzr,[x29, #-0x58]
00a10b78	bl 0x00c34780
00a10b7c	mov x22,x0
00a10b80	cbz x0,0x00a10c20
00a10b84	cbz x23,0x00a10bfc
00a10b88	mov x0,x20
00a10b8c	mov x1,x23
00a10b90	bl 0x00c396b0
00a10b94	mov x23,x0
00a10b98	cbz x0,0x00a10c18
00a10b9c	mov x0,x23
00a10ba0	bl 0x00c325e0
00a10ba4	cmp w0,#0x1
00a10ba8	b.lt 0x00a10bfc
00a10bac	mov w25,wzr
00a10bb0	add w19,w19,#0x1
00a10bb4	mov x0,x23
00a10bb8	mov w1,w25
00a10bbc	bl 0x00c32610
00a10bc0	ldr x0,[x0, #0x10]
00a10bc4	mov x1,x20
00a10bc8	mov w2,w19
00a10bcc	mov x3,x24
00a10bd0	bl 0x00a10a24
00a10bd4	cbz x0,0x00a10c18
00a10bd8	mov x1,x0
00a10bdc	mov x0,x22
00a10be0	bl 0x00c347a0
00a10be4	cbz w0,0x00a10c18
00a10be8	mov x0,x23
00a10bec	add w25,w25,#0x1
00a10bf0	bl 0x00c325e0
00a10bf4	cmp w25,w0
00a10bf8	b.lt 0x00a10bb4
00a10bfc	sub x1,x29,#0x58
00a10c00	mov x0,x22
00a10c04	cmp w21,#0x11
00a10c08	b.ne 0x00a10dec
00a10c0c	bl 0x00c381f0
00a10c10	mov w24,w0
00a10c14	tbz w0,#0x1f,0x00a10df8
00a10c18	mov x19,xzr
00a10c1c	b 0x00a10c28
00a10c20	mov x19,xzr
00a10c24	mov x23,xzr
00a10c28	ldur x0,[x29, #-0x58]
00a10c2c	adrp x1,0x2a9000
00a10c30	add x1,x1,#0xfe8
00a10c34	mov w2,#0x1c6
00a10c38	bl 0x00c32310
00a10c3c	adrp x1,0xcb5000
00a10c40	ldr x1,[x1, #0x348]
00a10c44	mov x0,x22
00a10c48	bl 0x00c32600
00a10c4c	mov x0,x20
00a10c50	mov x1,x23
00a10c54	bl 0x00c396d0
00a10c58	cbnz x19,0x00a1110c
00a10c5c	b 0x00a10a90
00a10c60	mov w22,#0x1001
00a10c64	mov w0,w21
00a10c68	add x23,x19,#0x8
00a10c6c	bl 0x00c37fa0
00a10c70	mov x4,x0
00a10c74	mov w2,#0xffffffff
00a10c78	mov x0,x23
00a10c7c	mov x1,x20
00a10c80	mov w3,w22
00a10c84	bl 0x00c37640
00a10c88	cmp w0,#0x0
00a10c8c	b.le 0x00a10cc4
00a10c90	str w21,[x19]
00a10c94	cbnz x19,0x00a1110c
00a10c98	b 0x00a10a90
00a10c9c	bl 0x00c342a0
00a10ca0	adrp x0,0x2a9000
00a10ca4	adrp x2,0x2d9000
00a10ca8	add x0,x0,#0xfe8
00a10cac	add x2,x2,#0xa31
00a10cb0	mov w1,#0x2a2
00a10cb4	bl 0x00c342b0
00a10cb8	mov w0,#0xd
00a10cbc	mov w1,#0xb1
00a10cc0	b 0x00a110f4
00a10cc4	bl 0x00c342a0
00a10cc8	adrp x0,0x2a9000
00a10ccc	adrp x2,0x2d9000
00a10cd0	add x0,x0,#0xfe8
00a10cd4	add x2,x2,#0xa31
00a10cd8	mov w1,#0x2a8
00a10cdc	bl 0x00c342b0
00a10ce0	mov w1,#0x100
00a10ce4	mov w0,#0xd
00a10ce8	movk w1,#0xc, LSL #16
00a10cec	b 0x00a10f10
00a10cf0	cmp w22,#0x1
00a10cf4	b.ne 0x00a10f30
00a10cf8	mov x0,xzr
00a10cfc	mov x1,x20
00a10d00	bl 0x00c396f0
00a10d04	str x0,[x19, #0x8]
00a10d08	cbnz x0,0x00a10c90
00a10d0c	bl 0x00c342a0
00a10d10	adrp x0,0x2a9000
00a10d14	adrp x2,0x2d9000
00a10d18	add x0,x0,#0xfe8
00a10d1c	add x2,x2,#0xa31
00a10d20	mov w1,#0x26e
00a10d24	bl 0x00c342b0
00a10d28	mov w0,#0xd
00a10d2c	mov w1,#0xb4
00a10d30	b 0x00a10f10
00a10d34	bl 0x00c37950
00a10d38	str x0,[x19, #0x8]
00a10d3c	cbz x0,0x00a10f80
00a10d40	mov x4,x0
00a10d44	cmp w22,#0x1
00a10d48	b.eq 0x00a10ffc
00a10d4c	cmp w22,#0x3
00a10d50	b.ne 0x00a11044
00a10d54	sub x1,x29,#0x58
00a10d58	mov x0,x20
00a10d5c	bl 0x00c396a0
00a10d60	cbz x0,0x00a11310
00a10d64	ldr x8,[x19, #0x8]
00a10d68	str x0,[x8, #0x8]
00a10d6c	ldur x8,[x29, #-0x58]
00a10d70	ldr x9,[x19, #0x8]
00a10d74	str w8,[x9]
00a10d78	ldr x8,[x19, #0x8]
00a10d7c	str w21,[x8, #0x4]
00a10d80	cmp w21,#0x3
00a10d84	b.ne 0x00a10c90
00a10d88	b 0x00a11018
00a10d8c	cmp w22,#0x1
00a10d90	b.ne 0x00a10f58
00a10d94	bl 0x00c37950
00a10d98	str x0,[x19, #0x8]
00a10d9c	cbz x0,0x00a11098
00a10da0	mov w2,#0xffffffff
00a10da4	mov x1,x20
00a10da8	bl 0x00c378a0
00a10dac	cbz w0,0x00a110b4
00a10db0	ldr x8,[x19, #0x8]
00a10db4	str w21,[x8, #0x4]
00a10db8	ldr x0,[x19, #0x8]
00a10dbc	bl 0x00c37900
00a10dc0	cbnz w0,0x00a10c90
00a10dc4	bl 0x00c342a0
00a10dc8	adrp x0,0x2a9000
00a10dcc	adrp x2,0x2d9000
00a10dd0	add x0,x0,#0xfe8
00a10dd4	add x2,x2,#0xa31
00a10dd8	mov w1,#0x28e
00a10ddc	bl 0x00c342b0
00a10de0	mov w0,#0xd
00a10de4	mov w1,#0xb8
00a10de8	b 0x00a10f10
00a10dec	bl 0x00c381e0
00a10df0	mov w24,w0
00a10df4	tbnz w0,#0x1f,0x00a10c18
00a10df8	bl 0x00c37a40
00a10dfc	mov x19,x0
00a10e00	cbz x0,0x00a10c28
00a10e04	mov w0,w21
00a10e08	bl 0x00c378b0
00a10e0c	str x0,[x19, #0x8]
00a10e10	cbz x0,0x00a10c28
00a10e14	str w21,[x19]
00a10e18	ldur x8,[x29, #-0x58]
00a10e1c	str x8,[x0, #0x8]
00a10e20	ldr x8,[x19, #0x8]
00a10e24	str w24,[x8]
00a10e28	stur xzr,[x29, #-0x58]
00a10e2c	b 0x00a10c28
00a10e30	cmp w22,#0x1
00a10e34	b.ne 0x00a10fac
00a10e38	add x1,x19,#0x8
00a10e3c	sub x0,x29,#0x58
00a10e40	stp xzr,xzr,[x29, #-0x58]
00a10e44	stur x20,[x29, #-0x48]
00a10e48	bl 0x00c396c0
00a10e4c	cbnz w0,0x00a10c90
00a10e50	bl 0x00c342a0
00a10e54	adrp x0,0x2a9000
00a10e58	adrp x2,0x2d9000
00a10e5c	add x0,x0,#0xfe8
00a10e60	add x2,x2,#0xa31
00a10e64	mov w1,#0x261
00a10e68	bl 0x00c342b0
00a10e6c	mov w0,#0xd
00a10e70	mov w1,#0xb0
00a10e74	b 0x00a10f10
00a10e78	ldrb w8,[x20]
00a10e7c	cbz w8,0x00a10c90
00a10e80	bl 0x00c342a0
00a10e84	adrp x0,0x2a9000
00a10e88	adrp x2,0x2d9000
00a10e8c	add x0,x0,#0xfe8
00a10e90	add x2,x2,#0xa31
00a10e94	mov w1,#0x253
00a10e98	bl 0x00c342b0
00a10e9c	mov w0,#0xd
00a10ea0	mov w1,#0xb6
00a10ea4	b 0x00a110f4
00a10ea8	cmp w22,#0x1
00a10eac	b.ne 0x00a10fd4
00a10eb0	mov x0,x20
00a10eb4	mov w1,wzr
00a10eb8	bl 0x00c39690
00a10ebc	str x0,[x19, #0x8]
00a10ec0	cbnz x0,0x00a10c90
00a10ec4	bl 0x00c342a0
00a10ec8	adrp x0,0x2a9000
00a10ecc	adrp x2,0x2d9000
00a10ed0	add x0,x0,#0xfe8
00a10ed4	add x2,x2,#0xa31
00a10ed8	mov w1,#0x279
00a10edc	bl 0x00c342b0
00a10ee0	mov w0,#0xd
00a10ee4	mov w1,#0xb7
00a10ee8	b 0x00a10f10
00a10eec	bl 0x00c342a0
00a10ef0	adrp x0,0x2a9000
00a10ef4	adrp x2,0x2d9000
00a10ef8	add x0,x0,#0xfe8
00a10efc	add x2,x2,#0xa31
00a10f00	mov w1,#0x2d9
00a10f04	bl 0x00c342b0
00a10f08	mov w0,#0xd
00a10f0c	mov w1,#0xc4
00a10f10	mov x2,xzr
00a10f14	bl 0x00c342c0
00a10f18	adrp x1,0x2af000
00a10f1c	add x1,x1,#0xd9b
00a10f20	mov w0,#0x2
00a10f24	mov x2,x20
00a10f28	bl 0x00c37fb0
00a10f2c	b 0x00a110fc
00a10f30	bl 0x00c342a0
00a10f34	adrp x0,0x2a9000
00a10f38	adrp x2,0x2d9000
00a10f3c	add x0,x0,#0xfe8
00a10f40	add x2,x2,#0xa31
00a10f44	mov w1,#0x269
00a10f48	bl 0x00c342b0
00a10f4c	mov w0,#0xd
00a10f50	mov w1,#0xb9
00a10f54	b 0x00a110f4
00a10f58	bl 0x00c342a0
00a10f5c	adrp x0,0x2a9000
00a10f60	adrp x2,0x2d9000
00a10f64	add x0,x0,#0xfe8
00a10f68	add x2,x2,#0xa31
00a10f6c	mov w1,#0x281
00a10f70	bl 0x00c342b0
00a10f74	mov w0,#0xd
00a10f78	mov w1,#0xc1
00a10f7c	b 0x00a110f4
00a10f80	bl 0x00c342a0
00a10f84	adrp x0,0x2a9000
00a10f88	adrp x2,0x2d9000
00a10f8c	add x0,x0,#0xfe8
00a10f90	add x2,x2,#0xa31
00a10f94	mov w1,#0x2b1
00a10f98	bl 0x00c342b0
00a10f9c	mov w1,#0x100
00a10fa0	mov w0,#0xd
00a10fa4	movk w1,#0xc, LSL #16
00a10fa8	b 0x00a110f4
00a10fac	bl 0x00c342a0
00a10fb0	adrp x0,0x2a9000
00a10fb4	adrp x2,0x2d9000
00a10fb8	add x0,x0,#0xfe8
00a10fbc	add x2,x2,#0xa31
00a10fc0	mov w1,#0x25a
00a10fc4	bl 0x00c342b0
00a10fc8	mov w0,#0xd
00a10fcc	mov w1,#0xbe
00a10fd0	b 0x00a110f4
00a10fd4	bl 0x00c342a0
00a10fd8	adrp x0,0x2a9000
00a10fdc	adrp x2,0x2d9000
00a10fe0	add x0,x0,#0xfe8
00a10fe4	add x2,x2,#0xa31
00a10fe8	mov w1,#0x275
00a10fec	bl 0x00c342b0
00a10ff0	mov w0,#0xd
00a10ff4	mov w1,#0xbf
00a10ff8	b 0x00a110f4
00a10ffc	mov w2,#0xffffffff
00a11000	mov x0,x4
00a11004	mov x1,x20
00a11008	bl 0x00c378a0
00a1100c	cbz w0,0x00a11338
00a11010	cmp w21,#0x3
00a11014	b.ne 0x00a10c90
00a11018	ldr x8,[x19, #0x8]
00a1101c	ldr x9,[x8, #0x10]
00a11020	and x9,x9,#-0x10
00a11024	str x9,[x8, #0x10]
00a11028	ldr x8,[x19, #0x8]
00a1102c	ldr x9,[x8, #0x10]
00a11030	orr x9,x9,#0x8
00a11034	str x9,[x8, #0x10]
00a11038	str w21,[x19]
00a1103c	cbnz x19,0x00a1110c
00a11040	b 0x00a10a90
00a11044	cmp w21,#0x3
00a11048	b.ne 0x00a110d0
00a1104c	cmp w22,#0x4
00a11050	b.ne 0x00a110d0
00a11054	adrp x3,0xa11000
00a11058	add x3,x3,#0xa80
00a1105c	mov w1,#0x2c
00a11060	mov w2,#0x1
00a11064	mov x0,x20
00a11068	bl 0x00c35230
00a1106c	cbnz w0,0x00a10c90
00a11070	bl 0x00c342a0
00a11074	adrp x0,0x2a9000
00a11078	adrp x2,0x2d9000
00a1107c	add x0,x0,#0xfe8
00a11080	add x2,x2,#0xa31
00a11084	mov w1,#0x2c6
00a11088	bl 0x00c342b0
00a1108c	mov w0,#0xd
00a11090	mov w1,#0xbc
00a11094	b 0x00a10f10
00a11098	bl 0x00c342a0
00a1109c	adrp x0,0x2a9000
00a110a0	adrp x2,0x2d9000
00a110a4	add x0,x0,#0xfe8
00a110a8	add x2,x2,#0xa31
00a110ac	mov w1,#0x285
00a110b0	b 0x00a10cdc
00a110b4	bl 0x00c342a0
00a110b8	adrp x0,0x2a9000
00a110bc	adrp x2,0x2d9000
00a110c0	add x0,x0,#0xfe8
00a110c4	add x2,x2,#0xa31
00a110c8	mov w1,#0x289
00a110cc	b 0x00a10cdc
00a110d0	bl 0x00c342a0
00a110d4	adrp x0,0x2a9000
00a110d8	adrp x2,0x2d9000
00a110dc	add x0,x0,#0xfe8
00a110e0	add x2,x2,#0xa31
00a110e4	mov w1,#0x2cc
00a110e8	bl 0x00c342b0
00a110ec	mov w0,#0xd
00a110f0	mov w1,#0xaf
00a110f4	mov x2,xzr
00a110f8	bl 0x00c342c0
00a110fc	mov x0,x19
00a11100	bl 0x00c37cc0
00a11104	mov x19,xzr
00a11108	cbz x19,0x00a10a90
00a1110c	ldr w8,[sp, #0x28]
00a11110	cmn w8,#0x1
00a11114	b.ne 0x00a11120
00a11118	ldr w8,[sp, #0x220]
00a1111c	cbz w8,0x00a10a90
00a11120	add x1,sp,#0x20
00a11124	mov x0,x19
00a11128	bl 0x00c37880
00a1112c	mov w20,w0
00a11130	mov x0,x19
00a11134	bl 0x00c37cc0
00a11138	ldr w8,[sp, #0x28]
00a1113c	ldr x9,[sp, #0x20]
00a11140	cmn w8,#0x1
00a11144	stur x9,[x29, #-0x58]
00a11148	b.eq 0x00a11188
00a1114c	sxtw x4,w20
00a11150	sub x0,x29,#0x58
00a11154	add x1,sp,#0x8
00a11158	add x2,sp,#0x4
00a1115c	mov x3,sp
00a11160	bl 0x00c376a0
00a11164	tbnz w0,#0x7,0x00a11194
00a11168	ldur w8,[x29, #-0x58]
00a1116c	ldr w9,[sp, #0x20]
00a11170	sub w8,w9,w8
00a11174	add w21,w20,w8
00a11178	tbnz w0,#0x0,0x00a111a0
00a1117c	ldr w1,[sp, #0x8]
00a11180	and w22,w0,#0x20
00a11184	b 0x00a111ac
00a11188	mov w22,wzr
00a1118c	mov w21,w20
00a11190	b 0x00a111bc
00a11194	mov x19,xzr
00a11198	mov x20,xzr
00a1119c	b 0x00a112e4
00a111a0	mov w1,wzr
00a111a4	str xzr,[sp, #0x8]
00a111a8	mov w22,#0x2
00a111ac	ldr w2,[sp, #0x28]
00a111b0	mov w0,wzr
00a111b4	bl 0x00c376b0
00a111b8	mov w20,w0
00a111bc	ldrsw x8,[sp, #0x220]
00a111c0	cmp w8,#0x1
00a111c4	b.lt 0x00a11208
00a111c8	orr w9,wzr,#0x18
00a111cc	add x10,sp,#0x28
00a111d0	madd x8,x8,x9,x10
00a111d4	mov w19,wzr
00a111d8	add x23,x8,#0x10
00a111dc	ldursw x8,[x23, #-0x4]
00a111e0	ldur w2,[x23, #-0x10]
00a111e4	mov w0,wzr
00a111e8	add x1,x8,w20, SXTW 
00a111ec	str x1,[x23], #-0x18
00a111f0	bl 0x00c376b0
00a111f4	ldr w8,[sp, #0x220]
00a111f8	add w19,w19,#0x1
00a111fc	mov w20,w0
00a11200	cmp w19,w8
00a11204	b.lt 0x00a111dc
00a11208	sxtw x19,w20
00a1120c	adrp x1,0x2a9000
00a11210	add x1,x1,#0xfe8
00a11214	mov w2,#0xc3
00a11218	mov x0,x19
00a1121c	bl 0x00c32320
00a11220	mov x20,x0
00a11224	cbz x0,0x00a112e0
00a11228	ldr w8,[sp, #0x220]
00a1122c	str x20,[sp, #0x18]
00a11230	cmp w8,#0x1
00a11234	b.lt 0x00a11284
00a11238	add x8,sp,#0x28
00a1123c	mov w23,wzr
00a11240	add x24,x8,#0x28
00a11244	ldp w4,w1,[x24, #-0xc]
00a11248	ldr w2,[x24]
00a1124c	ldur w3,[x24, #-0x10]
00a11250	add x0,sp,#0x18
00a11254	bl 0x00c376c0
00a11258	ldur w8,[x24, #-0x4]
00a1125c	cbz w8,0x00a11270
00a11260	ldr x8,[sp, #0x18]
00a11264	add x9,x8,#0x1
00a11268	str x9,[sp, #0x18]
00a1126c	strb wzr,[x8]
00a11270	ldr w8,[sp, #0x220]
00a11274	add w23,w23,#0x1
00a11278	add x24,x24,#0x18
00a1127c	cmp w23,w8
00a11280	b.lt 0x00a11244
00a11284	ldr w3,[sp, #0x28]
00a11288	cmn w3,#0x1
00a1128c	b.eq 0x00a112b4
00a11290	ldr w4,[sp, #0x2c]
00a11294	ldr w2,[sp, #0x8]
00a11298	and w8,w3,#0xfffffffe
00a1129c	add x0,sp,#0x18
00a112a0	cmp w4,#0x0
00a112a4	ccmp w8,#0x10,#0x0,eq
00a112a8	mov w8,#0x20
00a112ac	csel w1,w8,w22,eq
00a112b0	bl 0x00c376c0
00a112b4	ldr x0,[sp, #0x18]
00a112b8	ldur x1,[x29, #-0x58]
00a112bc	sxtw x2,w21
00a112c0	bl 0x00c2ffd0
00a112c4	add x1,sp,#0x10
00a112c8	mov x0,xzr
00a112cc	mov x2,x19
00a112d0	str x20,[sp, #0x10]
00a112d4	bl 0x00c381b0
00a112d8	mov x19,x0
00a112dc	b 0x00a112e4
00a112e0	mov x19,xzr
00a112e4	ldr x0,[sp, #0x20]
00a112e8	adrp x21,0x2a9000
00a112ec	add x21,x21,#0xfe8
00a112f0	mov w2,#0xe9
00a112f4	mov x1,x21
00a112f8	bl 0x00c32310
00a112fc	mov w2,#0xea
00a11300	mov x0,x20
00a11304	mov x1,x21
00a11308	bl 0x00c32310
00a1130c	b 0x00a10a90
00a11310	bl 0x00c342a0
00a11314	adrp x0,0x2a9000
00a11318	adrp x2,0x2d9000
00a1131c	add x0,x0,#0xfe8
00a11320	add x2,x2,#0xa31
00a11324	mov w1,#0x2b7
00a11328	bl 0x00c342b0
00a1132c	mov w0,#0xd
00a11330	mov w1,#0xb2
00a11334	b 0x00a10f10
00a11338	bl 0x00c342a0
00a1133c	adrp x0,0x2a9000
00a11340	adrp x2,0x2d9000
00a11344	add x0,x0,#0xfe8
00a11348	add x2,x2,#0xa31
00a1134c	mov w1,#0x2bf
00a11350	b 0x00a10cdc
