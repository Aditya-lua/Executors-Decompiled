; i2d_ECPrivateKey @ 00a25e10
00a25e10	sub sp,sp,#0x40
00a25e14	stp x22,x21,[sp, #0x10]
00a25e18	stp x20,x19,[sp, #0x20]
00a25e1c	stp x29,x30,[sp, #0x30]
00a25e20	add x29,sp,#0x30
00a25e24	stp xzr,xzr,[sp]
00a25e28	cbz x0,0x00a25f4c
00a25e2c	ldr x8,[x0, #0x18]
00a25e30	mov x22,x0
00a25e34	cbz x8,0x00a25f4c
00a25e38	ldrb w8,[x22, #0x30]
00a25e3c	mov x21,x1
00a25e40	tbnz w8,#0x1,0x00a25e4c
00a25e44	ldr x8,[x22, #0x20]
00a25e48	cbz x8,0x00a25f4c
00a25e4c	adrp x0,0xc5b000
00a25e50	add x0,x0,#0x2e0
00a25e54	bl 0x00c372e0
00a25e58	mov x19,x0
00a25e5c	cbz x0,0x00a25fe0
00a25e60	ldr w8,[x22, #0x10]
00a25e64	add x1,sp,#0x8
00a25e68	mov x0,x22
00a25e6c	str w8,[x19]
00a25e70	bl 0x00c3a860
00a25e74	mov x20,x0
00a25e78	cbz x0,0x00a2601c
00a25e7c	ldr x0,[x19, #0x8]
00a25e80	ldr x1,[sp, #0x8]
00a25e84	mov w2,w20
00a25e88	bl 0x00c37be0
00a25e8c	str xzr,[sp, #0x8]
00a25e90	ldr w8,[x22, #0x30]
00a25e94	tbnz w8,#0x0,0x00a25eb0
00a25e98	ldr x0,[x22, #0x18]
00a25e9c	ldr x1,[x19, #0x10]
00a25ea0	bl 0x00a24dfc
00a25ea4	str x0,[x19, #0x10]
00a25ea8	cbz x0,0x00a26038
00a25eac	ldr w8,[x22, #0x30]
00a25eb0	tbnz w8,#0x1,0x00a25efc
00a25eb4	bl 0x00c38040
00a25eb8	str x0,[x19, #0x18]
00a25ebc	cbz x0,0x00a26054
00a25ec0	ldr w1,[x22, #0x34]
00a25ec4	mov x2,sp
00a25ec8	mov x0,x22
00a25ecc	mov x3,xzr
00a25ed0	bl 0x00c3a820
00a25ed4	cbz x0,0x00a26080
00a25ed8	mov x2,x0
00a25edc	ldr x0,[x19, #0x18]
00a25ee0	ldr x8,[x0, #0x10]
00a25ee4	and x8,x8,#-0x10
00a25ee8	orr x8,x8,#0x8
00a25eec	str x8,[x0, #0x10]
00a25ef0	ldr x1,[sp]
00a25ef4	bl 0x00c37be0
00a25ef8	str xzr,[sp]
00a25efc	adrp x2,0xc5b000
00a25f00	add x2,x2,#0x2e0
00a25f04	mov x0,x19
00a25f08	mov x1,x21
00a25f0c	bl 0x00c36170
00a25f10	mov w21,w0
00a25f14	cbnz w0,0x00a25f8c
00a25f18	bl 0x00c342a0
00a25f1c	adrp x0,0x2af000
00a25f20	adrp x2,0x2ab000
00a25f24	add x0,x0,#0xe09
00a25f28	add x2,x2,#0xf3c
00a25f2c	mov w1,#0x43a
00a25f30	bl 0x00c342b0
00a25f34	mov w1,#0x10
00a25f38	mov w0,#0x10
00a25f3c	movk w1,#0x8, LSL #16
00a25f40	mov x2,xzr
00a25f44	bl 0x00c342c0
00a25f48	b 0x00a25f8c
00a25f4c	bl 0x00c342a0
00a25f50	adrp x0,0x2af000
00a25f54	adrp x2,0x2ab000
00a25f58	add x0,x0,#0xe09
00a25f5c	add x2,x2,#0xf3c
00a25f60	mov w1,#0x407
00a25f64	bl 0x00c342b0
00a25f68	mov w8,#0x100
00a25f6c	movk w8,#0xc, LSL #16
00a25f70	add w1,w8,#0x2
00a25f74	mov w0,#0x10
00a25f78	mov x2,xzr
00a25f7c	bl 0x00c342c0
00a25f80	mov w21,wzr
00a25f84	mov x20,xzr
00a25f88	mov x19,xzr
00a25f8c	ldr x0,[sp, #0x8]
00a25f90	adrp x22,0x2af000
00a25f94	add x22,x22,#0xe09
00a25f98	mov w3,#0x43f
00a25f9c	mov x1,x20
00a25fa0	mov x2,x22
00a25fa4	bl 0x00c345e0
00a25fa8	ldr x0,[sp]
00a25fac	mov w2,#0x440
00a25fb0	mov x1,x22
00a25fb4	bl 0x00c32310
00a25fb8	adrp x1,0xc5b000
00a25fbc	add x1,x1,#0x2e0
00a25fc0	mov x0,x19
00a25fc4	bl 0x00c36160
00a25fc8	mov w0,w21
00a25fcc	ldp x29,x30,[sp, #0x30]
00a25fd0	ldp x20,x19,[sp, #0x20]
00a25fd4	ldp x22,x21,[sp, #0x10]
00a25fd8	add sp,sp,#0x40
00a25fdc	ret
00a25fe0	bl 0x00c342a0
00a25fe4	adrp x0,0x2af000
00a25fe8	adrp x2,0x2ab000
00a25fec	add x0,x0,#0xe09
00a25ff0	add x2,x2,#0xf3c
00a25ff4	mov w1,#0x40c
00a25ff8	bl 0x00c342b0
00a25ffc	mov w1,#0x100
00a26000	mov w0,#0x10
00a26004	movk w1,#0xc, LSL #16
00a26008	mov x2,xzr
00a2600c	bl 0x00c342c0
00a26010	mov w21,wzr
00a26014	mov x20,xzr
00a26018	b 0x00a25f8c
00a2601c	bl 0x00c342a0
00a26020	adrp x0,0x2af000
00a26024	adrp x2,0x2ab000
00a26028	add x0,x0,#0xe09
00a2602c	add x2,x2,#0xf3c
00a26030	mov w1,#0x415
00a26034	b 0x00a26098
00a26038	bl 0x00c342a0
00a2603c	adrp x0,0x2af000
00a26040	adrp x2,0x2ab000
00a26044	add x0,x0,#0xe09
00a26048	add x2,x2,#0xf3c
00a2604c	mov w1,#0x420
00a26050	b 0x00a26098
00a26054	bl 0x00c342a0
00a26058	adrp x0,0x2af000
00a2605c	adrp x2,0x2ab000
00a26060	add x0,x0,#0xe09
00a26064	add x2,x2,#0xf3c
00a26068	mov w1,#0x428
00a2606c	bl 0x00c342b0
00a26070	mov w1,#0x100
00a26074	mov w0,#0x10
00a26078	movk w1,#0xc, LSL #16
00a2607c	b 0x00a260a8
00a26080	bl 0x00c342a0
00a26084	adrp x0,0x2af000
00a26088	adrp x2,0x2ab000
00a2608c	add x0,x0,#0xe09
00a26090	add x2,x2,#0xf3c
00a26094	mov w1,#0x42f
00a26098	bl 0x00c342b0
00a2609c	mov w1,#0x10
00a260a0	mov w0,#0x10
00a260a4	movk w1,#0x8, LSL #16
00a260a8	mov x2,xzr
00a260ac	bl 0x00c342c0
00a260b0	mov w21,wzr
00a260b4	b 0x00a25f8c
