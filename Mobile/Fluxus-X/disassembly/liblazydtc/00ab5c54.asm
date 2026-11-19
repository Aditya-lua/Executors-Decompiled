; FUN_00ab5c54 @ 00ab5c54
00ab5c54	sub sp,sp,#0xc0
00ab5c58	stp x28,x27,[sp, #0x60]
00ab5c5c	stp x26,x25,[sp, #0x70]
00ab5c60	stp x24,x23,[sp, #0x80]
00ab5c64	stp x22,x21,[sp, #0x90]
00ab5c68	adrp x28,0x2ce000
00ab5c6c	adrp x21,0x2b2000
00ab5c70	adrp x23,0x2b8000
00ab5c74	adrp x25,0x2ba000
00ab5c78	stp x20,x19,[sp, #0xa0]
00ab5c7c	mov w19,w7
00ab5c80	mov x27,x4
00ab5c84	mov x24,x3
00ab5c88	mov x26,xzr
00ab5c8c	add x28,x28,#0x16c
00ab5c90	add x21,x21,#0x972
00ab5c94	add x23,x23,#0x4e1
00ab5c98	add x25,x25,#0x5f6
00ab5c9c	stp x29,x30,[sp, #0xb0]
00ab5ca0	add x29,sp,#0xb0
00ab5ca4	stp x5,x6,[sp, #0x18]
00ab5ca8	stp x1,x2,[sp, #0x8]
00ab5cac	str x0,[sp]
00ab5cb0	stp xzr,xzr,[sp, #0x38]
00ab5cb4	stp xzr,xzr,[sp, #0x28]
00ab5cb8	tbnz w19,#0x0,0x00ab5cf0
00ab5cbc	mov w2,#0xe2
00ab5cc0	mov x0,x26
00ab5cc4	mov x1,x28
00ab5cc8	bl 0x00c32310
00ab5ccc	ldr x0,[sp, #0x38]
00ab5cd0	mov w2,#0xe2
00ab5cd4	mov x1,x28
00ab5cd8	bl 0x00c32310
00ab5cdc	ldr x0,[sp, #0x30]
00ab5ce0	mov w2,#0xe2
00ab5ce4	mov x1,x28
00ab5ce8	bl 0x00c32310
00ab5cec	b 0x00ab5d28
00ab5cf0	orr w3,wzr,#0xe0
00ab5cf4	mov x0,x26
00ab5cf8	mov x1,xzr
00ab5cfc	mov x2,x28
00ab5d00	bl 0x00c38e10
00ab5d04	ldr x0,[sp, #0x38]
00ab5d08	orr w3,wzr,#0xe0
00ab5d0c	mov x1,xzr
00ab5d10	mov x2,x28
00ab5d14	bl 0x00c38e10
00ab5d18	ldp x1,x0,[sp, #0x28]
00ab5d1c	orr w3,wzr,#0xe0
00ab5d20	mov x2,x28
00ab5d24	bl 0x00c38e10
00ab5d28	add x1,sp,#0x40
00ab5d2c	add x2,sp,#0x38
00ab5d30	add x3,sp,#0x30
00ab5d34	add x4,sp,#0x28
00ab5d38	mov x0,x27
00ab5d3c	mov w5,w19
00ab5d40	bl 0x00ab7038
00ab5d44	cbz w0,0x00ab60ac
00ab5d48	ldr x26,[sp, #0x40]
00ab5d4c	mov x1,x24
00ab5d50	mov x0,x26
00ab5d54	bl 0x00c301f0
00ab5d58	cbz w0,0x00ab5ff8
00ab5d5c	mov x0,x24
00ab5d60	mov x1,x21
00ab5d64	bl 0x00c301f0
00ab5d68	cbz w0,0x00ab5ebc
00ab5d6c	mov x0,x24
00ab5d70	mov x1,x23
00ab5d74	bl 0x00c301f0
00ab5d78	cbz w0,0x00ab5f54
00ab5d7c	adrp x1,0x2c6000
00ab5d80	mov x0,x26
00ab5d84	add x1,x1,#0xe6
00ab5d88	bl 0x00c301f0
00ab5d8c	cbnz w0,0x00ab5da4
00ab5d90	adrp x1,0x2b8000
00ab5d94	mov x0,x24
00ab5d98	add x1,x1,#0x4cf
00ab5d9c	bl 0x00c301f0
00ab5da0	cbz w0,0x00ab5ff8
00ab5da4	adrp x1,0x2c0000
00ab5da8	mov x0,x26
00ab5dac	add x1,x1,#0x3d5
00ab5db0	bl 0x00c301f0
00ab5db4	mov w20,w0
00ab5db8	cbnz w0,0x00ab5dd0
00ab5dbc	adrp x1,0x2d0000
00ab5dc0	mov x0,x24
00ab5dc4	add x1,x1,#0x239
00ab5dc8	bl 0x00c301f0
00ab5dcc	cbz w0,0x00ab5ff8
00ab5dd0	adrp x1,0x2d6000
00ab5dd4	mov x0,x26
00ab5dd8	add x1,x1,#0x403
00ab5ddc	bl 0x00c301f0
00ab5de0	cbnz w0,0x00ab5df8
00ab5de4	adrp x1,0x29e000
00ab5de8	mov x0,x24
00ab5dec	add x1,x1,#0x8ab
00ab5df0	bl 0x00c301f0
00ab5df4	cbz w0,0x00ab5ff8
00ab5df8	adrp x1,0x2d0000
00ab5dfc	mov x0,x26
00ab5e00	add x1,x1,#0x239
00ab5e04	bl 0x00c301f0
00ab5e08	mov w22,w0
00ab5e0c	cbnz w0,0x00ab5e24
00ab5e10	adrp x1,0x2c6000
00ab5e14	mov x0,x24
00ab5e18	add x1,x1,#0xbc
00ab5e1c	bl 0x00c301f0
00ab5e20	cbz w0,0x00ab5ff8
00ab5e24	cbnz w20,0x00ab5e3c
00ab5e28	adrp x1,0x2c6000
00ab5e2c	mov x0,x24
00ab5e30	add x1,x1,#0xbc
00ab5e34	bl 0x00c301f0
00ab5e38	cbz w0,0x00ab5ff8
00ab5e3c	cbnz w22,0x00ab5e50
00ab5e40	mov x0,x24
00ab5e44	mov x1,x25
00ab5e48	bl 0x00c301f0
00ab5e4c	cbz w0,0x00ab5ff8
00ab5e50	adrp x1,0x2c0000
00ab5e54	mov x0,x26
00ab5e58	add x1,x1,#0x3fe
00ab5e5c	bl 0x00c301f0
00ab5e60	cbnz w0,0x00ab5e74
00ab5e64	mov x0,x24
00ab5e68	mov x1,x25
00ab5e6c	bl 0x00c301f0
00ab5e70	cbz w0,0x00ab5ff8
00ab5e74	cbnz w22,0x00ab5e8c
00ab5e78	adrp x1,0x2c6000
00ab5e7c	mov x0,x24
00ab5e80	add x1,x1,#0x137
00ab5e84	bl 0x00c301f0
00ab5e88	cbz w0,0x00ab5ff8
00ab5e8c	mov x0,x26
00ab5e90	mov x1,x25
00ab5e94	bl 0x00c301f0
00ab5e98	mov w22,wzr
00ab5e9c	cbnz w0,0x00ab5fc4
00ab5ea0	adrp x1,0x2c6000
00ab5ea4	mov x0,x24
00ab5ea8	add x1,x1,#0x137
00ab5eac	bl 0x00c301f0
00ab5eb0	mov w22,wzr
00ab5eb4	cbnz w0,0x00ab5fc4
00ab5eb8	b 0x00ab5ff8
00ab5ebc	adrp x1,0x2c6000
00ab5ec0	mov x0,x26
00ab5ec4	add x1,x1,#0xd0
00ab5ec8	bl 0x00c301f0
00ab5ecc	cbz w0,0x00ab5ff8
00ab5ed0	adrp x1,0x2a2000
00ab5ed4	mov x0,x26
00ab5ed8	add x1,x1,#0xb4c
00ab5edc	bl 0x00c301f0
00ab5ee0	cbz w0,0x00ab5ff8
00ab5ee4	mov x0,x26
00ab5ee8	bl 0x00c2ff50
00ab5eec	cmp w0,#0xd
00ab5ef0	mov w22,wzr
00ab5ef4	b.lt 0x00ab5fc4
00ab5ef8	add x8,x26,w0, SXTW 
00ab5efc	sub x20,x8,#0xb
00ab5f00	adrp x1,0x2a2000
00ab5f04	mov x0,x20
00ab5f08	add x1,x1,#0xb4c
00ab5f0c	bl 0x00c301f0
00ab5f10	mov w22,wzr
00ab5f14	cbnz w0,0x00ab5fc4
00ab5f18	ldrb w8,[x20, #-0x1]!
00ab5f1c	mov w22,wzr
00ab5f20	cmp w8,#0x20
00ab5f24	b.ne 0x00ab5fc4
00ab5f28	sub w2,w20,w26
00ab5f2c	cmp w2,#0x1
00ab5f30	b.lt 0x00ab5fcc
00ab5f34	mov x0,xzr
00ab5f38	mov x1,x26
00ab5f3c	bl 0x00c352c0
00ab5f40	cbz x0,0x00ab5fd8
00ab5f44	ldr x8,[x0, #0xb8]
00ab5f48	mov w22,wzr
00ab5f4c	cbz x8,0x00ab5fc4
00ab5f50	b 0x00ab5ff8
00ab5f54	mov x0,x26
00ab5f58	bl 0x00c2ff50
00ab5f5c	cmp w0,#0xc
00ab5f60	mov w22,wzr
00ab5f64	b.lt 0x00ab5fc4
00ab5f68	add x8,x26,w0, SXTW 
00ab5f6c	sub x20,x8,#0xa
00ab5f70	mov x0,x20
00ab5f74	mov x1,x23
00ab5f78	bl 0x00c301f0
00ab5f7c	mov w22,wzr
00ab5f80	cbnz w0,0x00ab5fc4
00ab5f84	ldrb w8,[x20, #-0x1]!
00ab5f88	mov w22,wzr
00ab5f8c	cmp w8,#0x20
00ab5f90	b.ne 0x00ab5fc4
00ab5f94	sub w2,w20,w26
00ab5f98	cmp w2,#0x1
00ab5f9c	b.lt 0x00ab5fe4
00ab5fa0	add x0,sp,#0x48
00ab5fa4	mov x1,x26
00ab5fa8	bl 0x00c352c0
00ab5fac	cbz x0,0x00ab5ff0
00ab5fb0	ldr x8,[x0, #0x70]
00ab5fb4	ldr x0,[sp, #0x48]
00ab5fb8	cmp x8,#0x0
00ab5fbc	cset w22,ne
00ab5fc0	bl 0x00c32360
00ab5fc4	cbz w22,0x00ab5cb8
00ab5fc8	b 0x00ab5ff8
00ab5fcc	mov w22,wzr
00ab5fd0	cbz w22,0x00ab5cb8
00ab5fd4	b 0x00ab5ff8
00ab5fd8	mov w22,wzr
00ab5fdc	cbz w22,0x00ab5cb8
00ab5fe0	b 0x00ab5ff8
00ab5fe4	mov w22,wzr
00ab5fe8	cbz w22,0x00ab5cb8
00ab5fec	b 0x00ab5ff8
00ab5ff0	mov w22,wzr
00ab5ff4	cbz w22,0x00ab5cb8
00ab5ff8	ldr x20,[sp, #0x38]
00ab5ffc	add x1,sp,#0x48
00ab6000	mov x0,x20
00ab6004	bl 0x00ab6b40
00ab6008	cbz w0,0x00ab6060
00ab600c	ldr x21,[sp, #0x30]
00ab6010	ldp x3,x4,[sp, #0x18]
00ab6014	add x0,sp,#0x48
00ab6018	add x2,sp,#0x28
00ab601c	mov x1,x21
00ab6020	bl 0x00ab6950
00ab6024	cbz w0,0x00ab6060
00ab6028	ldp x8,x9,[sp]
00ab602c	str x21,[x8]
00ab6030	ldr x8,[sp, #0x28]
00ab6034	str x8,[x9]
00ab6038	ldr x8,[sp, #0x10]
00ab603c	cbz x8,0x00ab60e4
00ab6040	str x26,[x8]
00ab6044	tbnz w19,#0x0,0x00ab613c
00ab6048	adrp x1,0x2ce000
00ab604c	add x1,x1,#0x16c
00ab6050	mov w2,#0xe2
00ab6054	mov x0,x20
00ab6058	bl 0x00c32310
00ab605c	b 0x00ab6154
00ab6060	mov w21,#0x1
00ab6064	tbnz w19,#0x0,0x00ab60ec
00ab6068	adrp x19,0x2ce000
00ab606c	add x19,x19,#0x16c
00ab6070	mov w2,#0xe2
00ab6074	mov x0,x26
00ab6078	mov x1,x19
00ab607c	bl 0x00c32310
00ab6080	mov w2,#0xe2
00ab6084	mov x0,x20
00ab6088	mov x1,x19
00ab608c	bl 0x00c32310
00ab6090	tbz w21,#0x0,0x00ab6154
00ab6094	ldr x0,[sp, #0x30]
00ab6098	adrp x1,0x2ce000
00ab609c	add x1,x1,#0x16c
00ab60a0	mov w2,#0xe2
00ab60a4	bl 0x00c32310
00ab60a8	b 0x00ab6134
00ab60ac	bl 0x00c32410
00ab60b0	asr w8,w0,#0x1f
00ab60b4	and w8,w8,#0x7f800000
00ab60b8	orr w8,w8,#0x7fffff
00ab60bc	and w8,w8,w0
00ab60c0	cmp w8,#0x6c
00ab60c4	mov w0,wzr
00ab60c8	b.ne 0x00ab6158
00ab60cc	adrp x1,0x2d6000
00ab60d0	add x1,x1,#0x438
00ab60d4	mov w0,#0x2
00ab60d8	mov x2,x24
00ab60dc	bl 0x00c37fb0
00ab60e0	b 0x00ab6134
00ab60e4	mov w21,wzr
00ab60e8	tbz w19,#0x0,0x00ab6068
00ab60ec	adrp x19,0x2ce000
00ab60f0	add x19,x19,#0x16c
00ab60f4	orr w3,wzr,#0xe0
00ab60f8	mov x0,x26
00ab60fc	mov x1,xzr
00ab6100	mov x2,x19
00ab6104	bl 0x00c38e10
00ab6108	orr w3,wzr,#0xe0
00ab610c	mov x0,x20
00ab6110	mov x1,xzr
00ab6114	mov x2,x19
00ab6118	bl 0x00c38e10
00ab611c	tbz w21,#0x0,0x00ab6154
00ab6120	ldp x1,x0,[sp, #0x28]
00ab6124	adrp x2,0x2ce000
00ab6128	add x2,x2,#0x16c
00ab612c	orr w3,wzr,#0xe0
00ab6130	bl 0x00c38e10
00ab6134	mov w0,wzr
00ab6138	b 0x00ab6158
00ab613c	adrp x2,0x2ce000
00ab6140	add x2,x2,#0x16c
00ab6144	orr w3,wzr,#0xe0
00ab6148	mov x0,x20
00ab614c	mov x1,xzr
00ab6150	bl 0x00c38e10
00ab6154	mov w0,#0x1
00ab6158	ldp x29,x30,[sp, #0xb0]
00ab615c	ldp x20,x19,[sp, #0xa0]
00ab6160	ldp x22,x21,[sp, #0x90]
00ab6164	ldp x24,x23,[sp, #0x80]
00ab6168	ldp x26,x25,[sp, #0x70]
00ab616c	ldp x28,x27,[sp, #0x60]
00ab6170	add sp,sp,#0xc0
00ab6174	ret
