; ossl_curve448_precomputed_scalarmul @ 00a47c54
00a47c54	sub sp,sp,#0x1d0
00a47c58	mov x8,x2
00a47c5c	adrp x2,0x760000
00a47c60	stp x20,x19,[sp, #0x1b0]
00a47c64	str x1,[sp, #0x20]
00a47c68	mov x20,x0
00a47c6c	add x2,x2,#0x9c0
00a47c70	add x0,sp,#0x28
00a47c74	mov x1,x8
00a47c78	stp x28,x27,[sp, #0x170]
00a47c7c	stp x26,x25,[sp, #0x180]
00a47c80	stp x24,x23,[sp, #0x190]
00a47c84	stp x22,x21,[sp, #0x1a0]
00a47c88	stp x29,x30,[sp, #0x1c0]
00a47c8c	add x29,sp,#0x1c0
00a47c90	add x26,sp,#0x28
00a47c94	bl 0x00c3a600
00a47c98	add x0,sp,#0x28
00a47c9c	add x1,sp,#0x28
00a47ca0	bl 0x00c3a640
00a47ca4	add x8,x20,#0x40
00a47ca8	add x27,sp,#0x60
00a47cac	str x8,[sp, #0x10]
00a47cb0	add x8,x20,#0xc0
00a47cb4	str x8,[sp, #0x8]
00a47cb8	add x8,x27,#0x80
00a47cbc	add x28,x20,#0x80
00a47cc0	mov w22,#0x12
00a47cc4	str x8,[sp, #0x18]
00a47cc8	add x8,x27,#0x40
00a47ccc	str x8,[sp]
00a47cd0	cmp x22,#0x12
00a47cd4	b.eq 0x00a47ce8
00a47cd8	mov x0,x20
00a47cdc	mov x1,x20
00a47ce0	mov w2,wzr
00a47ce4	bl 0x00a4761c
00a47ce8	mov x21,xzr
00a47cec	sub x19,x22,#0x1
00a47cf0	mov w8,#0x5a
00a47cf4	madd x9,x21,x8,x19
00a47cf8	ubfx x8,x9,#0x6,#0x1a
00a47cfc	add x11,x9,#0x12
00a47d00	ldr x8,[x26, x8, LSL #0x3]
00a47d04	ubfx x14,x11,#0x6,#0x1a
00a47d08	ldr x14,[x26, x14, LSL #0x3]
00a47d0c	and x10,x9,#0x3f
00a47d10	add x12,x9,#0x24
00a47d14	add x13,x9,#0x36
00a47d18	and x11,x11,#0x3f
00a47d1c	lsr x8,x8,x10
00a47d20	ubfx x10,x12,#0x6,#0x1a
00a47d24	ldr x10,[x26, x10, LSL #0x3]
00a47d28	lsr x11,x14,x11
00a47d2c	ubfx x14,x13,#0x6,#0x1a
00a47d30	ldr x14,[x26, x14, LSL #0x3]
00a47d34	and x12,x12,#0x3f
00a47d38	and w8,w8,#0x1
00a47d3c	lsr x10,x10,x12
00a47d40	and x12,x13,#0x3f
00a47d44	bfm w8,w11,#0x1f,#0x0
00a47d48	lsr x12,x14,x12
00a47d4c	add x9,x9,#0x48
00a47d50	bfm w8,w10,#0x1e,#0x0
00a47d54	cmp x9,#0x1bd
00a47d58	bfm w8,w12,#0x1d,#0x0
00a47d5c	b.hi 0x00a47d78
00a47d60	ubfx x10,x9,#0x6,#0x1a
00a47d64	ldr x10,[x26, x10, LSL #0x3]
00a47d68	and x9,x9,#0x3f
00a47d6c	lsr x9,x10,x9
00a47d70	ubfiz w9,w9,#0x4,#0x1
00a47d74	orr w8,w8,w9
00a47d78	asr w9,w8,#0x4
00a47d7c	sub w23,w9,#0x1
00a47d80	eor w8,w23,w8
00a47d84	and w24,w8,#0xf
00a47d88	ldr x8,[sp, #0x20]
00a47d8c	orr w9,wzr,#0xc00
00a47d90	add x0,sp,#0x60
00a47d94	orr w2,wzr,#0xc0
00a47d98	mov w1,wzr
00a47d9c	madd x25,x21,x9,x8
00a47da0	bl 0x00c301c0
00a47da4	mov x8,xzr
00a47da8	mov x10,x24
00a47dac	sub x24,x24,#0x1
00a47db0	bic x10,x24,x10
00a47db4	asr x10,x10,#0x3f
00a47db8	and w10,w10,#0xff
00a47dbc	mov x9,xzr
00a47dc0	mvn w11,w10
00a47dc4	ldrb w12,[x25, x9]
00a47dc8	stur w10,[x29, #-0xa0]
00a47dcc	ldur w13,[x29, #-0xa0]
00a47dd0	stur w11,[x29, #-0xa0]
00a47dd4	ldur w14,[x29, #-0xa0]
00a47dd8	ldrb w14,[x27, x9]
00a47ddc	and w12,w12,w13
00a47de0	orr w12,w14,w12
00a47de4	strb w12,[x27, x9]
00a47de8	add x9,x9,#0x1
00a47dec	cmp x9,#0xc0
00a47df0	b.ne 0x00a47dc4
00a47df4	add x8,x8,#0x1
00a47df8	cmp x8,#0x10
00a47dfc	add x25,x25,#0xc0
00a47e00	b.ne 0x00a47da8
00a47e04	ldr x8,[sp, #0x60]
00a47e08	ldr x9,[sp, #0xa0]
00a47e0c	sxtw x23,w23
00a47e10	ldr x2,[sp, #0x18]
00a47e14	adrp x1,0x760000
00a47e18	eor x10,x9,x8
00a47e1c	and x10,x10,x23
00a47e20	eor x8,x10,x8
00a47e24	eor x9,x10,x9
00a47e28	str x8,[sp, #0x60]
00a47e2c	str x9,[sp, #0xa0]
00a47e30	ldr x8,[sp, #0x68]
00a47e34	ldr x9,[sp, #0xa8]
00a47e38	sub x0,x29,#0xa0
00a47e3c	add x1,x1,#0x980
00a47e40	eor x10,x9,x8
00a47e44	and x10,x10,x23
00a47e48	eor x8,x10,x8
00a47e4c	eor x9,x10,x9
00a47e50	str x8,[sp, #0x68]
00a47e54	str x9,[sp, #0xa8]
00a47e58	ldr x8,[sp, #0x70]
00a47e5c	ldr x9,[sp, #0xb0]
00a47e60	eor x10,x9,x8
00a47e64	and x10,x10,x23
00a47e68	eor x8,x10,x8
00a47e6c	eor x9,x10,x9
00a47e70	str x8,[sp, #0x70]
00a47e74	str x9,[sp, #0xb0]
00a47e78	ldr x8,[sp, #0x78]
00a47e7c	ldr x9,[sp, #0xb8]
00a47e80	eor x10,x9,x8
00a47e84	and x10,x10,x23
00a47e88	eor x8,x10,x8
00a47e8c	eor x9,x10,x9
00a47e90	str x8,[sp, #0x78]
00a47e94	str x9,[sp, #0xb8]
00a47e98	ldr x8,[sp, #0x80]
00a47e9c	ldr x9,[sp, #0xc0]
00a47ea0	eor x10,x9,x8
00a47ea4	and x10,x10,x23
00a47ea8	eor x8,x10,x8
00a47eac	eor x9,x10,x9
00a47eb0	str x8,[sp, #0x80]
00a47eb4	str x9,[sp, #0xc0]
00a47eb8	ldr x8,[sp, #0x88]
00a47ebc	ldr x9,[sp, #0xc8]
00a47ec0	eor x10,x9,x8
00a47ec4	and x10,x10,x23
00a47ec8	eor x8,x10,x8
00a47ecc	eor x9,x10,x9
00a47ed0	str x8,[sp, #0x88]
00a47ed4	str x9,[sp, #0xc8]
00a47ed8	ldr x8,[sp, #0x90]
00a47edc	ldr x9,[sp, #0xd0]
00a47ee0	eor x10,x9,x8
00a47ee4	and x10,x10,x23
00a47ee8	eor x8,x10,x8
00a47eec	eor x9,x10,x9
00a47ef0	str x8,[sp, #0x90]
00a47ef4	str x9,[sp, #0xd0]
00a47ef8	ldr x8,[sp, #0x98]
00a47efc	ldr x9,[sp, #0xd8]
00a47f00	eor x10,x9,x8
00a47f04	and x10,x10,x23
00a47f08	eor x8,x10,x8
00a47f0c	eor x9,x10,x9
00a47f10	str x8,[sp, #0x98]
00a47f14	str x9,[sp, #0xd8]
00a47f18	bl 0x00c3a5f0
00a47f1c	mvn x8,x23
00a47f20	ldur x9,[x29, #-0xa0]
00a47f24	ldr x10,[sp, #0xe0]
00a47f28	stur x23,[x29, #-0x60]
00a47f2c	ldur x11,[x29, #-0x60]
00a47f30	stur x8,[x29, #-0x60]
00a47f34	ldur x12,[x29, #-0x60]
00a47f38	cmp x22,#0x12
00a47f3c	and x9,x11,x9
00a47f40	ldur x11,[x29, #-0x98]
00a47f44	and x10,x12,x10
00a47f48	orr x9,x10,x9
00a47f4c	str x9,[sp, #0xe0]
00a47f50	ldr x9,[sp, #0xe8]
00a47f54	stur x23,[x29, #-0x60]
00a47f58	ldur x10,[x29, #-0x60]
00a47f5c	stur x8,[x29, #-0x60]
00a47f60	ldur x12,[x29, #-0x60]
00a47f64	and x10,x10,x11
00a47f68	ldur x11,[x29, #-0x90]
00a47f6c	and x9,x12,x9
00a47f70	orr x9,x9,x10
00a47f74	str x9,[sp, #0xe8]
00a47f78	ldr x9,[sp, #0xf0]
00a47f7c	stur x23,[x29, #-0x60]
00a47f80	ldur x10,[x29, #-0x60]
00a47f84	stur x8,[x29, #-0x60]
00a47f88	ldur x12,[x29, #-0x60]
00a47f8c	and x10,x10,x11
00a47f90	ldur x11,[x29, #-0x88]
00a47f94	and x9,x12,x9
00a47f98	orr x9,x9,x10
00a47f9c	str x9,[sp, #0xf0]
00a47fa0	ldr x9,[sp, #0xf8]
00a47fa4	stur x23,[x29, #-0x60]
00a47fa8	ldur x10,[x29, #-0x60]
00a47fac	stur x8,[x29, #-0x60]
00a47fb0	ldur x12,[x29, #-0x60]
00a47fb4	and x10,x10,x11
00a47fb8	ldur x11,[x29, #-0x80]
00a47fbc	and x9,x12,x9
00a47fc0	orr x9,x9,x10
00a47fc4	str x9,[sp, #0xf8]
00a47fc8	ldr x9,[sp, #0x100]
00a47fcc	stur x23,[x29, #-0x60]
00a47fd0	ldur x10,[x29, #-0x60]
00a47fd4	stur x8,[x29, #-0x60]
00a47fd8	ldur x12,[x29, #-0x60]
00a47fdc	and x10,x10,x11
00a47fe0	ldur x11,[x29, #-0x78]
00a47fe4	and x9,x12,x9
00a47fe8	orr x9,x9,x10
00a47fec	str x9,[sp, #0x100]
00a47ff0	ldr x9,[sp, #0x108]
00a47ff4	stur x23,[x29, #-0x60]
00a47ff8	ldur x10,[x29, #-0x60]
00a47ffc	stur x8,[x29, #-0x60]
00a48000	ldur x12,[x29, #-0x60]
00a48004	and x10,x10,x11
00a48008	ldur x11,[x29, #-0x70]
00a4800c	and x9,x12,x9
00a48010	orr x9,x9,x10
00a48014	str x9,[sp, #0x108]
00a48018	ldr x9,[sp, #0x110]
00a4801c	stur x23,[x29, #-0x60]
00a48020	ldur x10,[x29, #-0x60]
00a48024	stur x8,[x29, #-0x60]
00a48028	ldur x12,[x29, #-0x60]
00a4802c	and x10,x10,x11
00a48030	ldur x11,[x29, #-0x68]
00a48034	and x9,x12,x9
00a48038	orr x9,x9,x10
00a4803c	str x9,[sp, #0x110]
00a48040	ldr x9,[sp, #0x118]
00a48044	stur x23,[x29, #-0x60]
00a48048	ldur x10,[x29, #-0x60]
00a4804c	stur x8,[x29, #-0x60]
00a48050	ldur x8,[x29, #-0x60]
00a48054	and x10,x10,x11
00a48058	and x8,x8,x9
00a4805c	orr x8,x8,x10
00a48060	str x8,[sp, #0x118]
00a48064	b.ne 0x00a480c0
00a48068	cbnz x21,0x00a480c0
00a4806c	ldr x23,[sp, #0x10]
00a48070	ldr x24,[sp]
00a48074	add x2,sp,#0x60
00a48078	mov x0,x23
00a4807c	mov x1,x24
00a48080	bl 0x00c3a590
00a48084	add x2,sp,#0x60
00a48088	mov x0,x20
00a4808c	mov x1,x24
00a48090	bl 0x00c3a5f0
00a48094	ldr x0,[sp, #0x8]
00a48098	mov x1,x23
00a4809c	mov x2,x20
00a480a0	bl 0x00c3a4b0
00a480a4	adrp x8,0x760000
00a480a8	add x8,x8,#0xa00
00a480ac	ldp q1,q0,[x8, #0x20]
00a480b0	ldp q3,q2,[x8]
00a480b4	stp q1,q0,[x28, #0x20]
00a480b8	stp q3,q2,[x28]
00a480bc	b 0x00a480e0
00a480c0	cmp x22,#0x1
00a480c4	cset w8,ne
00a480c8	cmp x21,#0x4
00a480cc	cset w9,eq
00a480d0	and w2,w8,w9
00a480d4	add x1,sp,#0x60
00a480d8	mov x0,x20
00a480dc	bl 0x00a4812c
00a480e0	add x21,x21,#0x1
00a480e4	cmp x21,#0x5
00a480e8	b.ne 0x00a47cf0
00a480ec	mov x22,x19
00a480f0	cbnz x19,0x00a47cd0
00a480f4	add x0,sp,#0x60
00a480f8	orr w1,wzr,#0xc0
00a480fc	bl 0x00c34750
00a48100	add x0,sp,#0x28
00a48104	orr w1,wzr,#0x38
00a48108	bl 0x00c34750
00a4810c	ldp x29,x30,[sp, #0x1c0]
00a48110	ldp x20,x19,[sp, #0x1b0]
00a48114	ldp x22,x21,[sp, #0x1a0]
00a48118	ldp x24,x23,[sp, #0x190]
00a4811c	ldp x26,x25,[sp, #0x180]
00a48120	ldp x28,x27,[sp, #0x170]
00a48124	add sp,sp,#0x1d0
00a48128	ret
