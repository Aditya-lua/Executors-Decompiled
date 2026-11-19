; FUN_00b47c90 @ 00b47c90
00b47c90	sub sp,sp,#0x140
00b47c94	stp x28,x27,[sp, #0xe0]
00b47c98	stp x26,x25,[sp, #0xf0]
00b47c9c	stp x24,x23,[sp, #0x100]
00b47ca0	stp x22,x21,[sp, #0x110]
00b47ca4	stp x20,x19,[sp, #0x120]
00b47ca8	stp x29,x30,[sp, #0x130]
00b47cac	add x29,sp,#0x130
00b47cb0	mov x21,x3
00b47cb4	mov x19,x2
00b47cb8	mov x20,x1
00b47cbc	mov x26,x0
00b47cc0	bl 0x00c41000
00b47cc4	cbz w0,0x00b47ec4
00b47cc8	mov x0,x26
00b47ccc	mov x1,x21
00b47cd0	bl 0x00b4828c
00b47cd4	cbz w0,0x00b47ec4
00b47cd8	ldr x21,[x26, #0x10]
00b47cdc	cbz x21,0x00b47d64
00b47ce0	ldr x24,[x26, #0x20]
00b47ce4	cbz x24,0x00b47d8c
00b47ce8	ldr x17,[x26, #0x50]
00b47cec	cbnz x17,0x00b47d08
00b47cf0	mov x0,x26
00b47cf4	bl 0x00b484c8
00b47cf8	cbz w0,0x00b47ec4
00b47cfc	ldr x21,[x26, #0x10]
00b47d00	ldr x24,[x26, #0x20]
00b47d04	ldr x17,[x26, #0x50]
00b47d08	ldr x27,[x26, #0x30]
00b47d0c	cmp x27,#0x2
00b47d10	b.cc 0x00b47ec4
00b47d14	ldr x23,[x26, #0x38]
00b47d18	cbz x23,0x00b47ec4
00b47d1c	ldr x11,[x26, #0x40]
00b47d20	mov w28,wzr
00b47d24	cbz x11,0x00b47ec8
00b47d28	sub x8,x27,#0x1
00b47d2c	tst x8,x27
00b47d30	mov w28,wzr
00b47d34	b.ne 0x00b47ec8
00b47d38	orr w8,wzr,#0x3fffffff
00b47d3c	udiv x8,x8,x23
00b47d40	cmp x8,x11
00b47d44	b.cs 0x00b47db4
00b47d48	bl 0x00c342a0
00b47d4c	adrp x0,0x2b6000
00b47d50	adrp x2,0x2ba000
00b47d54	add x0,x0,#0x95f
00b47d58	add x2,x2,#0xb28
00b47d5c	mov w1,#0x1ab
00b47d60	b 0x00b47eb0
00b47d64	bl 0x00c342a0
00b47d68	adrp x0,0x2b6000
00b47d6c	adrp x2,0x2c8000
00b47d70	add x0,x0,#0x95f
00b47d74	add x2,x2,#0x74a
00b47d78	mov w1,#0xa1
00b47d7c	bl 0x00c342b0
00b47d80	mov w0,#0x39
00b47d84	mov w1,#0x82
00b47d88	b 0x00b47ebc
00b47d8c	bl 0x00c342a0
00b47d90	adrp x0,0x2b6000
00b47d94	adrp x2,0x2c8000
00b47d98	add x0,x0,#0x95f
00b47d9c	add x2,x2,#0x74a
00b47da0	mov w1,#0xa6
00b47da4	bl 0x00c342b0
00b47da8	mov w0,#0x39
00b47dac	mov w1,#0x83
00b47db0	b 0x00b47ebc
00b47db4	ldr x12,[x26, #0x18]
00b47db8	ldr x28,[x26, #0x28]
00b47dbc	ldr x8,[x26, #0x48]
00b47dc0	ldp x13,x14,[x26]
00b47dc4	lsl x9,x23,#0x4
00b47dc8	cmp x9,#0x3f
00b47dcc	b.hi 0x00b47dfc
00b47dd0	mov w10,#0x1
00b47dd4	lsl x9,x10,x9
00b47dd8	cmp x9,x27
00b47ddc	b.hi 0x00b47dfc
00b47de0	bl 0x00c342a0
00b47de4	adrp x0,0x2b6000
00b47de8	adrp x2,0x2ba000
00b47dec	add x0,x0,#0x95f
00b47df0	add x2,x2,#0xb28
00b47df4	mov w1,#0x1b6
00b47df8	b 0x00b47eb0
00b47dfc	lsl x25,x11,#0x7
00b47e00	mul x15,x25,x23
00b47e04	lsr x9,x15,#0x1f
00b47e08	cbz x9,0x00b47e28
00b47e0c	bl 0x00c342a0
00b47e10	adrp x0,0x2b6000
00b47e14	adrp x2,0x2ba000
00b47e18	add x0,x0,#0x95f
00b47e1c	add x2,x2,#0xb28
00b47e20	mov w1,#0x1c8
00b47e24	b 0x00b47eb0
00b47e28	orr x10,xzr,#0x1ffffffffffffff
00b47e2c	add x9,x27,#0x2
00b47e30	udiv x10,x10,x23
00b47e34	cmp x9,x10
00b47e38	b.ls 0x00b47e58
00b47e3c	bl 0x00c342a0
00b47e40	adrp x0,0x2b6000
00b47e44	adrp x2,0x2ba000
00b47e48	add x0,x0,#0x95f
00b47e4c	add x2,x2,#0xb28
00b47e50	mov w1,#0x1d2
00b47e54	b 0x00b47eb0
00b47e58	lsl x16,x23,#0x5
00b47e5c	mul x9,x9,x16
00b47e60	lsl x9,x9,#0x2
00b47e64	mvn x10,x9
00b47e68	cmp x15,x10
00b47e6c	b.ls 0x00b47e8c
00b47e70	bl 0x00c342a0
00b47e74	adrp x0,0x2b6000
00b47e78	adrp x2,0x2ba000
00b47e7c	add x0,x0,#0x95f
00b47e80	add x2,x2,#0xb28
00b47e84	mov w1,#0x1d9
00b47e88	b 0x00b47eb0
00b47e8c	add x0,x15,x9
00b47e90	cmp x0,x8
00b47e94	b.ls 0x00b47eec
00b47e98	bl 0x00c342a0
00b47e9c	adrp x0,0x2b6000
00b47ea0	adrp x2,0x2ba000
00b47ea4	add x0,x0,#0x95f
00b47ea8	add x2,x2,#0xb28
00b47eac	mov w1,#0x1e2
00b47eb0	bl 0x00c342b0
00b47eb4	orr w0,wzr,#0x6
00b47eb8	mov w1,#0xac
00b47ebc	mov x2,xzr
00b47ec0	bl 0x00c342c0
00b47ec4	mov w28,wzr
00b47ec8	mov w0,w28
00b47ecc	ldp x29,x30,[sp, #0x130]
00b47ed0	ldp x20,x19,[sp, #0x120]
00b47ed4	ldp x22,x21,[sp, #0x110]
00b47ed8	ldp x24,x23,[sp, #0x100]
00b47edc	ldp x26,x25,[sp, #0xf0]
00b47ee0	ldp x28,x27,[sp, #0xe0]
00b47ee4	add sp,sp,#0x140
00b47ee8	ret
00b47eec	cbz x20,0x00b4824c
00b47ef0	adrp x1,0x2b6000
00b47ef4	add x1,x1,#0x95f
00b47ef8	mov w2,#0x1ea
00b47efc	str x17,[sp, #0x18]
00b47f00	stur x16,[x29, #-0x68]
00b47f04	stp x15,x14,[sp, #0x20]
00b47f08	stp x13,x12,[sp, #0x30]
00b47f0c	str x11,[sp, #0x78]
00b47f10	str x0,[sp, #0x10]
00b47f14	bl 0x00c32320
00b47f18	cbz x0,0x00b48254
00b47f1c	ldp x8,x1,[sp, #0x30]
00b47f20	mov x2,x24
00b47f24	ldp x5,x24,[sp, #0x18]
00b47f28	mov x26,x0
00b47f2c	str x8,[sp]
00b47f30	ldr x8,[sp, #0x28]
00b47f34	mov w4,#0x1
00b47f38	mov x0,x21
00b47f3c	mov w3,w28
00b47f40	mov w6,w24
00b47f44	mov x7,x26
00b47f48	str x8,[sp, #0x8]
00b47f4c	bl 0x00c3d8c0
00b47f50	cbz w0,0x00b48200
00b47f54	ldur x13,[x29, #-0x68]
00b47f58	add x12,x25,#0x100
00b47f5c	lsl x15,x27,#0x7
00b47f60	add x28,x26,x24
00b47f64	lsl x8,x13,#0x2
00b47f68	lsl x14,x23,#0x7
00b47f6c	lsl x9,x27,#0x5
00b47f70	stur x15,[x29, #-0x88]
00b47f74	add x15,x25,#0x180
00b47f78	str x12,[sp, #0x98]
00b47f7c	nop
00b47f80	madd x12,x23,x12,x26
00b47f84	stur x15,[x29, #-0x90]
00b47f88	add x15,x28,x8
00b47f8c	sub x9,x9,#0x20
00b47f90	str x12,[sp, #0x90]
00b47f94	neg x12,x14
00b47f98	sub x10,x13,#0x10
00b47f9c	str x12,[sp, #0x58]
00b47fa0	add x12,x15,x8
00b47fa4	mul x8,x9,x23
00b47fa8	stur x10,[x29, #-0x80]
00b47fac	add x10,x25,#0x80
00b47fb0	add x8,x12,x8, LSL #0x2
00b47fb4	madd x10,x23,x10,x26
00b47fb8	str x8,[sp, #0x48]
00b47fbc	add x8,x12,x13, LSL #0x2
00b47fc0	mov x11,xzr
00b47fc4	add x22,x28,#0x10
00b47fc8	str x8,[sp, #0x40]
00b47fcc	add x8,x10,#0x10
00b47fd0	stur x15,[x29, #-0x70]
00b47fd4	stur x12,[x29, #-0x78]
00b47fd8	stur x10,[x29, #-0x60]
00b47fdc	str x8,[sp, #0x88]
00b47fe0	stp x14,x26,[sp, #0x68]
00b47fe4	str x28,[sp, #0x60]
00b47fe8	str x22,[sp, #0x50]
00b47fec	ldur x25,[x29, #-0x78]
00b47ff0	nop
00b47ff4	madd x24,x14,x11,x26
00b47ff8	str x11,[sp, #0x80]
00b47ffc	cbz x13,0x00b48048
00b48000	ldur x10,[x29, #-0x78]
00b48004	mov x8,x13
00b48008	mov x9,x24
00b4800c	ldrb w11,[x9]
00b48010	subs x8,x8,#0x1
00b48014	str w11,[x10]
00b48018	ldrb w12,[x9, #0x1]
00b4801c	bfm w11,w12,#0x18,#0x7
00b48020	str w11,[x10]
00b48024	ldrb w12,[x9, #0x2]
00b48028	bfm w11,w12,#0x10,#0x7
00b4802c	str w11,[x10]
00b48030	ldrb w12,[x9, #0x3]
00b48034	add x9,x9,#0x4
00b48038	bfm w11,w12,#0x8,#0x7
00b4803c	str w11,[x10], #0x4
00b48040	b.ne 0x00b4800c
00b48044	ldr x25,[sp, #0x40]
00b48048	ldr x22,[sp, #0x58]
00b4804c	mov w26,#0x1
00b48050	mov x28,x14
00b48054	add x1,x25,x22
00b48058	mov x0,x25
00b4805c	mov x2,x23
00b48060	bl 0x00b48550
00b48064	add x26,x26,#0x1
00b48068	cmp x27,x26
00b4806c	add x25,x25,x28
00b48070	b.ne 0x00b48054
00b48074	ldr x28,[sp, #0x60]
00b48078	ldr x1,[sp, #0x48]
00b4807c	mov x2,x23
00b48080	mov x0,x28
00b48084	bl 0x00b48550
00b48088	ldr x26,[sp, #0x70]
00b4808c	ldr x22,[sp, #0x50]
00b48090	mov x25,xzr
00b48094	ldur x12,[x29, #-0x68]
00b48098	cbz x12,0x00b48160
00b4809c	ldp x11,x8,[x29, #-0x88]
00b480a0	ldur x13,[x29, #-0x60]
00b480a4	ldr w8,[x28, x8, LSL #0x2]
00b480a8	udiv x10,x8,x27
00b480ac	lsl x9,x8,#0x7
00b480b0	msub x8,x10,x27,x8
00b480b4	mul x10,x11,x10
00b480b8	ldur x11,[x29, #-0x90]
00b480bc	mul x8,x8,x12
00b480c0	add x11,x11,x9
00b480c4	sub x11,x11,x10
00b480c8	madd x11,x23,x11,x26
00b480cc	cmp x13,x11
00b480d0	ldur x11,[x29, #-0x78]
00b480d4	add x8,x11,x8, LSL #0x2
00b480d8	b.cs 0x00b48124
00b480dc	ldr x11,[sp, #0x98]
00b480e0	add x9,x11,x9
00b480e4	sub x9,x9,x10
00b480e8	ldr x10,[sp, #0x90]
00b480ec	nop
00b480f0	madd x9,x23,x9,x26
00b480f4	mov x11,x12
00b480f8	cmp x9,x10
00b480fc	ldur x10,[x29, #-0x60]
00b48100	mov x9,x28
00b48104	b.cs 0x00b48124
00b48108	ldr w12,[x9], #0x4
00b4810c	ldr w13,[x8], #0x4
00b48110	subs x11,x11,#0x1
00b48114	eor w12,w13,w12
00b48118	str w12,[x10], #0x4
00b4811c	b.ne 0x00b48108
00b48120	b 0x00b48160
00b48124	ldr x11,[sp, #0x88]
00b48128	mov x9,xzr
00b4812c	mov x10,x12
00b48130	mov x12,x22
00b48134	add x13,x8,x9, LSL #0x2
00b48138	ldp q0,q1,[x12, #-0x10]
00b4813c	ldp q2,q3,[x13]
00b48140	add x9,x9,#0x8
00b48144	add x12,x12,#0x20
00b48148	subs x10,x10,#0x8
00b4814c	eor v0.16B,v2.16B,v0.16B
00b48150	eor v1.16B,v3.16B,v1.16B
00b48154	stp q0,q1,[x11, #-0x10]
00b48158	add x11,x11,#0x20
00b4815c	b.ne 0x00b48134
00b48160	ldur x1,[x29, #-0x70]
00b48164	mov x0,x28
00b48168	mov x2,x23
00b4816c	bl 0x00b48550
00b48170	add x25,x25,#0x1
00b48174	cmp x25,x27
00b48178	b.ne 0x00b48094
00b4817c	ldur x13,[x29, #-0x68]
00b48180	ldr x14,[sp, #0x68]
00b48184	mov x8,x28
00b48188	mov x9,x13
00b4818c	cbz x13,0x00b481bc
00b48190	ldr w10,[x8], #0x4
00b48194	subs x9,x9,#0x1
00b48198	strb w10,[x24]
00b4819c	lsr w11,w10,#0x8
00b481a0	lsr w12,w10,#0x10
00b481a4	lsr w10,w10,#0x18
00b481a8	strb w11,[x24, #0x1]
00b481ac	strb w12,[x24, #0x2]
00b481b0	strb w10,[x24, #0x3]
00b481b4	add x24,x24,#0x4
00b481b8	b.ne 0x00b48190
00b481bc	ldp x8,x11,[sp, #0x78]
00b481c0	add x11,x11,#0x1
00b481c4	cmp x11,x8
00b481c8	b.ne 0x00b47fec
00b481cc	ldp x8,x1,[sp, #0x30]
00b481d0	ldr x5,[sp, #0x18]
00b481d4	mov w4,#0x1
00b481d8	mov x0,x21
00b481dc	str x8,[sp]
00b481e0	ldp x3,x8,[sp, #0x20]
00b481e4	mov x2,x26
00b481e8	mov w6,w19
00b481ec	mov x7,x20
00b481f0	str x8,[sp, #0x8]
00b481f4	mov w28,#0x1
00b481f8	bl 0x00c3d8c0
00b481fc	cbnz w0,0x00b48230
00b48200	bl 0x00c342a0
00b48204	adrp x0,0x2b6000
00b48208	adrp x2,0x2ba000
00b4820c	add x0,x0,#0x95f
00b48210	add x2,x2,#0xb28
00b48214	orr w1,wzr,#0x1ff
00b48218	bl 0x00c342b0
00b4821c	orr w0,wzr,#0x6
00b48220	mov w1,#0xb5
00b48224	mov x2,xzr
00b48228	bl 0x00c342c0
00b4822c	mov w28,wzr
00b48230	ldr x1,[sp, #0x10]
00b48234	adrp x2,0x2b6000
00b48238	add x2,x2,#0x95f
00b4823c	mov w3,#0x201
00b48240	mov x0,x26
00b48244	bl 0x00c345e0
00b48248	b 0x00b47ec8
00b4824c	mov w28,#0x1
00b48250	b 0x00b47ec8
00b48254	bl 0x00c342a0
00b48258	adrp x0,0x2b6000
00b4825c	adrp x2,0x2ba000
00b48260	add x0,x0,#0x95f
00b48264	add x2,x2,#0xb28
00b48268	mov w1,#0x1ec
00b4826c	bl 0x00c342b0
00b48270	mov w1,#0x100
00b48274	orr w0,wzr,#0x6
00b48278	movk w1,#0xc, LSL #16
00b4827c	b 0x00b47ebc
