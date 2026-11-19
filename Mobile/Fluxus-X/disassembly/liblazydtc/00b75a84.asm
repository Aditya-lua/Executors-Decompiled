; mbedtls_des_self_test @ 00b75a84
00b75a84	stp x28,x27,[sp, #-0x60]!
00b75a88	stp x26,x25,[sp, #0x10]
00b75a8c	stp x24,x23,[sp, #0x20]
00b75a90	stp x22,x21,[sp, #0x30]
00b75a94	stp x20,x19,[sp, #0x40]
00b75a98	stp x29,x30,[sp, #0x50]
00b75a9c	add x29,sp,#0x50
00b75aa0	sub sp,sp,#0x3b0
00b75aa4	mrs x8,tpidr_el0
00b75aa8	str x8,[sp, #0x8]
00b75aac	ldr x8,[x8, #0x28]
00b75ab0	mov w19,w0
00b75ab4	add x0,sp,#0x1a0
00b75ab8	mov w2,#0x80
00b75abc	mov w1,wzr
00b75ac0	stur x8,[x29, #-0x60]
00b75ac4	bl 0x00c301c0
00b75ac8	add x0,sp,#0x20
00b75acc	orr w2,wzr,#0x180
00b75ad0	mov w1,wzr
00b75ad4	add x21,sp,#0x20
00b75ad8	bl 0x00c301c0
00b75adc	add x26,sp,#0x220
00b75ae0	adrp x23,0x2b0000
00b75ae4	adrp x28,0x77e000
00b75ae8	mov w25,wzr
00b75aec	add x20,x21,#0x80
00b75af0	add x23,x23,#0xf6d
00b75af4	add x28,x28,#0x790
00b75af8	add x22,x26,#0x80
00b75afc	lsr w24,w25,#0x1
00b75b00	cbz w19,0x00b75b40
00b75b04	orr w8,wzr,#0x38
00b75b08	orr w9,wzr,#0x38
00b75b0c	cmp w24,#0x0
00b75b10	madd w2,w24,w8,w9
00b75b14	mov w8,#0x33
00b75b18	mov w9,#0x20
00b75b1c	csel w1,w9,w8,eq
00b75b20	adrp x8,0x2be000
00b75b24	adrp x9,0x2ca000
00b75b28	tst w25,#0x1
00b75b2c	add x8,x8,#0xbd0
00b75b30	add x9,x9,#0x8db
00b75b34	csel x3,x9,x8,eq
00b75b38	mov x0,x23
00b75b3c	bl 0x00c41af0
00b75b40	and w8,w25,#0x7fffffff
00b75b44	cmp w8,#0x5
00b75b48	mov x8,#0x6f4e
00b75b4c	movk x8,#0x2077, LSL #16
00b75b50	movk x8,#0x7369, LSL #32
00b75b54	movk x8,#0x7420, LSL #48
00b75b58	str x8,[sp, #0x18]
00b75b5c	b.hi 0x00b76168
00b75b60	and x8,x25,#0x7fffffff
00b75b64	ldrsw x8,[x28, x8, LSL #0x2]
00b75b68	add x8,x8,x28
00b75b6c	br x8
00b75b70	adrp x1,0x77f000
00b75b74	add x0,sp,#0x1a0
00b75b78	add x1,x1,#0x140
00b75b7c	bl 0x00c424b0
00b75b80	ldr x8,[sp, #0x218]
00b75b84	ldr x9,[sp, #0x1a0]
00b75b88	str x8,[sp, #0x1a0]
00b75b8c	str x9,[sp, #0x218]
00b75b90	ldr x8,[sp, #0x210]
00b75b94	ldr x9,[sp, #0x1a8]
00b75b98	str x8,[sp, #0x1a8]
00b75b9c	str x9,[sp, #0x210]
00b75ba0	ldr x8,[sp, #0x208]
00b75ba4	ldr x9,[sp, #0x1b0]
00b75ba8	str x8,[sp, #0x1b0]
00b75bac	str x9,[sp, #0x208]
00b75bb0	ldr x8,[sp, #0x200]
00b75bb4	ldr x9,[sp, #0x1b8]
00b75bb8	str x8,[sp, #0x1b8]
00b75bbc	str x9,[sp, #0x200]
00b75bc0	ldr x8,[sp, #0x1f8]
00b75bc4	ldr x9,[sp, #0x1c0]
00b75bc8	str x8,[sp, #0x1c0]
00b75bcc	str x9,[sp, #0x1f8]
00b75bd0	ldr x8,[sp, #0x1f0]
00b75bd4	ldr x9,[sp, #0x1c8]
00b75bd8	str x8,[sp, #0x1c8]
00b75bdc	str x9,[sp, #0x1f0]
00b75be0	ldr x8,[sp, #0x1e8]
00b75be4	ldr x9,[sp, #0x1d0]
00b75be8	str x8,[sp, #0x1d0]
00b75bec	str x9,[sp, #0x1e8]
00b75bf0	ldp x9,x8,[sp, #0x1d8]
00b75bf4	stp x8,x9,[sp, #0x1d8]
00b75bf8	b 0x00b75d20
00b75bfc	adrp x1,0x77f000
00b75c00	add x0,sp,#0x20
00b75c04	add x1,x1,#0x140
00b75c08	bl 0x00c42300
00b75c0c	b 0x00b75d20
00b75c10	adrp x27,0x77f000
00b75c14	add x27,x27,#0x140
00b75c18	add x0,sp,#0x220
00b75c1c	mov x1,x27
00b75c20	bl 0x00c424b0
00b75c24	add x1,x27,#0x8
00b75c28	mov x0,x20
00b75c2c	bl 0x00c424b0
00b75c30	mov x8,xzr
00b75c34	mov x9,xzr
00b75c38	orr w10,wzr,#0xf8
00b75c3c	add x11,x22,x10
00b75c40	ldp w12,w11,[x11, #-0x100]
00b75c44	add x13,x21,x8
00b75c48	add x15,x22,x8
00b75c4c	add x9,x9,#0x2
00b75c50	stp w12,w11,[x13]
00b75c54	ldr x14,[x21, x10#0x0]
00b75c58	cmp x9,#0x20
00b75c5c	sub x10,x10,#0x8
00b75c60	str w12,[x13, #0x100]
00b75c64	str x14,[x15]
00b75c68	ldr x14,[x26, x8#0x0]
00b75c6c	add x8,x8,#0x8
00b75c70	str w11,[x13, #0x104]
00b75c74	str x14,[x15, #0x80]
00b75c78	b.cc 0x00b75c3c
00b75c7c	b 0x00b75cec
00b75c80	adrp x27,0x77f000
00b75c84	add x27,x27,#0x140
00b75c88	add x0,sp,#0x20
00b75c8c	mov x1,x27
00b75c90	bl 0x00c424b0
00b75c94	add x1,x27,#0x8
00b75c98	mov x0,x22
00b75c9c	bl 0x00c424b0
00b75ca0	mov x8,xzr
00b75ca4	mov x9,xzr
00b75ca8	orr w10,wzr,#0xf8
00b75cac	add x11,x20,x10
00b75cb0	ldp w12,w11,[x11, #-0x100]
00b75cb4	add x13,x26,x8
00b75cb8	add x15,x20,x8
00b75cbc	add x9,x9,#0x2
00b75cc0	stp w12,w11,[x13]
00b75cc4	ldr x14,[x26, x10#0x0]
00b75cc8	cmp x9,#0x20
00b75ccc	sub x10,x10,#0x8
00b75cd0	str w12,[x13, #0x100]
00b75cd4	str x14,[x15]
00b75cd8	ldr x14,[x21, x8#0x0]
00b75cdc	add x8,x8,#0x8
00b75ce0	str w11,[x13, #0x104]
00b75ce4	str x14,[x15, #0x80]
00b75ce8	b.cc 0x00b75cac
00b75cec	add x0,sp,#0x220
00b75cf0	orr w1,wzr,#0x180
00b75cf4	bl 0x00c42220
00b75cf8	b 0x00b75d20
00b75cfc	adrp x1,0x77f000
00b75d00	add x0,sp,#0x1a0
00b75d04	add x1,x1,#0x140
00b75d08	bl 0x00c424b0
00b75d0c	b 0x00b75d20
00b75d10	adrp x1,0x77f000
00b75d14	add x0,sp,#0x20
00b75d18	add x1,x1,#0x140
00b75d1c	bl 0x00c42310
00b75d20	mov w27,#0x64
00b75d24	cbz w24,0x00b75d44
00b75d28	add x0,sp,#0x20
00b75d2c	add x1,sp,#0x18
00b75d30	add x2,sp,#0x18
00b75d34	bl 0x00c422b0
00b75d38	subs w27,w27,#0x1
00b75d3c	b.ne 0x00b75d24
00b75d40	b 0x00b75d5c
00b75d44	add x0,sp,#0x1a0
00b75d48	add x1,sp,#0x18
00b75d4c	add x2,sp,#0x18
00b75d50	bl 0x00c42330
00b75d54	subs w27,w27,#0x1
00b75d58	b.ne 0x00b75d24
00b75d5c	mov w8,w24
00b75d60	tbnz w25,#0x0,0x00b75d70
00b75d64	adrp x9,0x77f000
00b75d68	add x9,x9,#0x158
00b75d6c	b 0x00b75d78
00b75d70	adrp x9,0x77f000
00b75d74	add x9,x9,#0x170
00b75d78	ldr x8,[x9, x8, LSL #0x3]
00b75d7c	ldr x9,[sp, #0x18]
00b75d80	cmp x9,x8
00b75d84	b.ne 0x00b76170
00b75d88	cbz w19,0x00b75d98
00b75d8c	adrp x0,0x77c000
00b75d90	add x0,x0,#0x87c
00b75d94	bl 0x00c30760
00b75d98	add w25,w25,#0x1
00b75d9c	cmp w25,#0x6
00b75da0	b.cc 0x00b75afc
00b75da4	cbz w19,0x00b75db0
00b75da8	mov w0,#0xa
00b75dac	bl 0x00c42240
00b75db0	add x8,sp,#0x20
00b75db4	add x27,sp,#0x220
00b75db8	mov w26,wzr
00b75dbc	add x28,x8,#0x80
00b75dc0	add x24,x27,#0x80
00b75dc4	lsr w21,w26,#0x1
00b75dc8	and w25,w26,#0x1
00b75dcc	cbz w19,0x00b75e10
00b75dd0	orr w8,wzr,#0x38
00b75dd4	orr w9,wzr,#0x38
00b75dd8	cmp w21,#0x0
00b75ddc	madd w2,w21,w8,w9
00b75de0	mov w8,#0x33
00b75de4	mov w9,#0x20
00b75de8	csel w1,w9,w8,eq
00b75dec	adrp x8,0x2be000
00b75df0	adrp x9,0x2ca000
00b75df4	cmp w25,#0x0
00b75df8	add x8,x8,#0xbd0
00b75dfc	add x9,x9,#0x8db
00b75e00	adrp x0,0x2bc000
00b75e04	csel x3,x9,x8,eq
00b75e08	add x0,x0,#0xaf3
00b75e0c	bl 0x00c41af0
00b75e10	mov x8,#0x3412
00b75e14	movk x8,#0x7856, LSL #16
00b75e18	movk x8,#0xab90, LSL #32
00b75e1c	movk x8,#0xefcd, LSL #48
00b75e20	str x8,[sp, #0x10]
00b75e24	and w8,w26,#0x7fffffff
00b75e28	cmp w8,#0x5
00b75e2c	mov x8,#0x6f4e
00b75e30	movk x8,#0x2077, LSL #16
00b75e34	movk x8,#0x7369, LSL #32
00b75e38	movk x8,#0x7420, LSL #48
00b75e3c	str x8,[sp, #0x18]
00b75e40	b.hi 0x00b76168
00b75e44	adrp x9,0x77e000
00b75e48	and x8,x26,#0x7fffffff
00b75e4c	add x9,x9,#0x7a8
00b75e50	ldrsw x8,[x9, x8, LSL #0x2]
00b75e54	add x8,x8,x9
00b75e58	br x8
00b75e5c	adrp x1,0x77f000
00b75e60	add x0,sp,#0x1a0
00b75e64	add x1,x1,#0x140
00b75e68	bl 0x00c424b0
00b75e6c	ldr x8,[sp, #0x218]
00b75e70	ldr x9,[sp, #0x1a0]
00b75e74	str x8,[sp, #0x1a0]
00b75e78	str x9,[sp, #0x218]
00b75e7c	ldr x8,[sp, #0x210]
00b75e80	ldr x9,[sp, #0x1a8]
00b75e84	str x8,[sp, #0x1a8]
00b75e88	str x9,[sp, #0x210]
00b75e8c	ldr x8,[sp, #0x208]
00b75e90	ldr x9,[sp, #0x1b0]
00b75e94	str x8,[sp, #0x1b0]
00b75e98	str x9,[sp, #0x208]
00b75e9c	ldr x8,[sp, #0x200]
00b75ea0	ldr x9,[sp, #0x1b8]
00b75ea4	str x8,[sp, #0x1b8]
00b75ea8	str x9,[sp, #0x200]
00b75eac	ldr x8,[sp, #0x1f8]
00b75eb0	ldr x9,[sp, #0x1c0]
00b75eb4	str x8,[sp, #0x1c0]
00b75eb8	str x9,[sp, #0x1f8]
00b75ebc	ldr x8,[sp, #0x1f0]
00b75ec0	ldr x9,[sp, #0x1c8]
00b75ec4	str x8,[sp, #0x1c8]
00b75ec8	str x9,[sp, #0x1f0]
00b75ecc	ldr x8,[sp, #0x1e8]
00b75ed0	ldr x9,[sp, #0x1d0]
00b75ed4	str x8,[sp, #0x1d0]
00b75ed8	str x9,[sp, #0x1e8]
00b75edc	ldp x9,x8,[sp, #0x1d8]
00b75ee0	stp x8,x9,[sp, #0x1d8]
00b75ee4	b 0x00b76014
00b75ee8	adrp x1,0x77f000
00b75eec	add x0,sp,#0x20
00b75ef0	add x1,x1,#0x140
00b75ef4	bl 0x00c42300
00b75ef8	b 0x00b76014
00b75efc	adrp x23,0x77f000
00b75f00	add x23,x23,#0x140
00b75f04	add x0,sp,#0x220
00b75f08	mov x1,x23
00b75f0c	bl 0x00c424b0
00b75f10	add x1,x23,#0x8
00b75f14	mov x0,x20
00b75f18	add x23,sp,#0x20
00b75f1c	bl 0x00c424b0
00b75f20	mov x8,xzr
00b75f24	mov x9,xzr
00b75f28	orr w10,wzr,#0xf8
00b75f2c	add x11,x24,x10
00b75f30	ldp w12,w11,[x11, #-0x100]
00b75f34	add x13,x23,x8
00b75f38	add x15,x24,x8
00b75f3c	add x9,x9,#0x2
00b75f40	stp w12,w11,[x13]
00b75f44	ldr x14,[x23, x10#0x0]
00b75f48	cmp x9,#0x20
00b75f4c	sub x10,x10,#0x8
00b75f50	str w12,[x13, #0x100]
00b75f54	str x14,[x15]
00b75f58	ldr x14,[x27, x8#0x0]
00b75f5c	add x8,x8,#0x8
00b75f60	str w11,[x13, #0x104]
00b75f64	str x14,[x15, #0x80]
00b75f68	b.cc 0x00b75f2c
00b75f6c	b 0x00b75ff4
00b75f70	adrp x1,0x77f000
00b75f74	add x0,sp,#0x1a0
00b75f78	add x1,x1,#0x140
00b75f7c	bl 0x00c424b0
00b75f80	b 0x00b76014
00b75f84	adrp x23,0x77f000
00b75f88	add x23,x23,#0x140
00b75f8c	add x0,sp,#0x20
00b75f90	mov x1,x23
00b75f94	bl 0x00c424b0
00b75f98	add x1,x23,#0x8
00b75f9c	mov x0,x22
00b75fa0	add x23,sp,#0x20
00b75fa4	bl 0x00c424b0
00b75fa8	mov x8,xzr
00b75fac	mov x9,xzr
00b75fb0	orr w10,wzr,#0xf8
00b75fb4	add x11,x28,x10
00b75fb8	ldp w12,w11,[x11, #-0x100]
00b75fbc	add x13,x27,x8
00b75fc0	add x15,x28,x8
00b75fc4	add x9,x9,#0x2
00b75fc8	stp w12,w11,[x13]
00b75fcc	ldr x14,[x27, x10#0x0]
00b75fd0	cmp x9,#0x20
00b75fd4	sub x10,x10,#0x8
00b75fd8	str w12,[x13, #0x100]
00b75fdc	str x14,[x15]
00b75fe0	ldr x14,[x23, x8#0x0]
00b75fe4	add x8,x8,#0x8
00b75fe8	str w11,[x13, #0x104]
00b75fec	str x14,[x15, #0x80]
00b75ff0	b.cc 0x00b75fb4
00b75ff4	add x0,sp,#0x220
00b75ff8	orr w1,wzr,#0x180
00b75ffc	bl 0x00c42220
00b76000	b 0x00b76014
00b76004	adrp x1,0x77f000
00b76008	add x0,sp,#0x20
00b7600c	add x1,x1,#0x140
00b76010	bl 0x00c42310
00b76014	mov w23,wzr
00b76018	str x26,[sp]
00b7601c	cbnz w25,0x00b76094
00b76020	cbz w21,0x00b7604c
00b76024	add x0,sp,#0x20
00b76028	mov w2,#0x8
00b7602c	add x3,sp,#0x10
00b76030	add x4,sp,#0x18
00b76034	add x5,sp,#0x18
00b76038	mov w1,wzr
00b7603c	bl 0x00c422a0
00b76040	mov w26,w0
00b76044	cbz w0,0x00b76070
00b76048	b 0x00b76184
00b7604c	add x0,sp,#0x1a0
00b76050	mov w2,#0x8
00b76054	add x3,sp,#0x10
00b76058	add x4,sp,#0x18
00b7605c	add x5,sp,#0x18
00b76060	mov w1,wzr
00b76064	bl 0x00c42320
00b76068	mov w26,w0
00b7606c	cbnz w0,0x00b76184
00b76070	add w23,w23,#0x1
00b76074	cmp w23,#0x63
00b76078	add x27,sp,#0x220
00b7607c	b.ls 0x00b76020
00b76080	mov w8,w21
00b76084	cbnz w25,0x00b7611c
00b76088	adrp x9,0x77f000
00b7608c	add x9,x9,#0x188
00b76090	b 0x00b76124
00b76094	mov x27,#0x3412
00b76098	movk x27,#0x7856, LSL #16
00b7609c	movk x27,#0xab90, LSL #32
00b760a0	movk x27,#0xefcd, LSL #48
00b760a4	cbz w21,0x00b760d0
00b760a8	add x0,sp,#0x20
00b760ac	mov w2,#0x8
00b760b0	add x3,sp,#0x10
00b760b4	add x4,sp,#0x18
00b760b8	add x5,sp,#0x18
00b760bc	mov w1,w25
00b760c0	bl 0x00c422a0
00b760c4	mov w26,w0
00b760c8	cbz w0,0x00b760f4
00b760cc	b 0x00b76184
00b760d0	add x0,sp,#0x1a0
00b760d4	mov w2,#0x8
00b760d8	add x3,sp,#0x10
00b760dc	add x4,sp,#0x18
00b760e0	add x5,sp,#0x18
00b760e4	mov w1,w25
00b760e8	bl 0x00c42320
00b760ec	mov w26,w0
00b760f0	cbnz w0,0x00b76184
00b760f4	ldr x8,[sp, #0x18]
00b760f8	add w23,w23,#0x1
00b760fc	cmp w23,#0x64
00b76100	str x27,[sp, #0x18]
00b76104	mov x27,x8
00b76108	b.cc 0x00b760a4
00b7610c	add x27,sp,#0x220
00b76110	str x8,[sp, #0x18]
00b76114	mov w8,w21
00b76118	cbz w25,0x00b76088
00b7611c	adrp x9,0x77f000
00b76120	add x9,x9,#0x1a0
00b76124	ldr x8,[x9, x8, LSL #0x3]
00b76128	ldr x9,[sp, #0x18]
00b7612c	ldr x26,[sp]
00b76130	cmp x9,x8
00b76134	b.ne 0x00b76170
00b76138	cbz w19,0x00b76148
00b7613c	adrp x0,0x77c000
00b76140	add x0,x0,#0x87c
00b76144	bl 0x00c30760
00b76148	add w26,w26,#0x1
00b7614c	cmp w26,#0x6
00b76150	b.cc 0x00b75dc4
00b76154	cbz w19,0x00b76160
00b76158	mov w0,#0xa
00b7615c	bl 0x00c42240
00b76160	mov w26,wzr
00b76164	b 0x00b76184
00b76168	mov w0,#0x1
00b7616c	b 0x00b761a4
00b76170	cbz w19,0x00b76180
00b76174	adrp x0,0x77c000
00b76178	add x0,x0,#0x854
00b7617c	bl 0x00c30760
00b76180	mov w26,#0x1
00b76184	add x0,sp,#0x1a0
00b76188	mov w1,#0x80
00b7618c	bl 0x00c42220
00b76190	add x0,sp,#0x20
00b76194	orr w1,wzr,#0x180
00b76198	bl 0x00c42220
00b7619c	cmp w26,#0x0
00b761a0	cset w0,ne
00b761a4	ldr x8,[sp, #0x8]
00b761a8	ldr x8,[x8, #0x28]
00b761ac	ldur x9,[x29, #-0x60]
00b761b0	cmp x8,x9
00b761b4	b.ne 0x00b761d8
00b761b8	add sp,sp,#0x3b0
00b761bc	ldp x29,x30,[sp, #0x50]
00b761c0	ldp x20,x19,[sp, #0x40]
00b761c4	ldp x22,x21,[sp, #0x30]
00b761c8	ldp x24,x23,[sp, #0x20]
00b761cc	ldp x26,x25,[sp, #0x10]
00b761d0	ldp x28,x27,[sp], #0x60
00b761d4	ret
00b761d8	bl 0x00c2fec0
