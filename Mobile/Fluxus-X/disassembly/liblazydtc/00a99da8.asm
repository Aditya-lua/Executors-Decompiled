; CRYPTO_secure_malloc_init @ 00a99da8
00a99da8	stp x24,x23,[sp, #-0x40]!
00a99dac	stp x22,x21,[sp, #0x10]
00a99db0	adrp x22,0xd22000
00a99db4	ldrb w8,[x22, #0xf0]
00a99db8	stp x20,x19,[sp, #0x20]
00a99dbc	mov x20,x0
00a99dc0	mov w0,wzr
00a99dc4	stp x29,x30,[sp, #0x30]
00a99dc8	add x29,sp,#0x30
00a99dcc	tbnz w8,#0x0,0x00a9a054
00a99dd0	mov x21,x1
00a99dd4	bl 0x00c34d50
00a99dd8	adrp x23,0xd22000
00a99ddc	str x0,[x23, #0xf8]
00a99de0	cbz x0,0x00a9a054
00a99de4	adrp x19,0xd22000
00a99de8	add x19,x19,#0x108
00a99dec	mov w2,#0x50
00a99df0	mov x0,x19
00a99df4	mov w1,wzr
00a99df8	bl 0x00c301c0
00a99dfc	cbz x20,0x00a9a068
00a99e00	sub x8,x20,#0x1
00a99e04	tst x8,x20
00a99e08	b.ne 0x00a9a080
00a99e0c	cmp x21,#0x11
00a99e10	b.cs 0x00a99e1c
00a99e14	mov w21,#0x10
00a99e18	b 0x00a99e28
00a99e1c	sub x8,x21,#0x1
00a99e20	tst x8,x21
00a99e24	b.ne 0x00a9a0e0
00a99e28	udiv x9,x20,x21
00a99e2c	lsl x8,x9,#0x1
00a99e30	tst x9,#0x7ffffffffffffffc
00a99e34	str x20,[x19, #0x18]
00a99e38	str x21,[x19, #0x30]
00a99e3c	str x8,[x19, #0x48]
00a99e40	b.eq 0x00a99e70
00a99e44	mov x9,#-0x1
00a99e48	str x9,[x19, #0x28]
00a99e4c	cbz x8,0x00a99e78
00a99e50	mov x9,#-0x1
00a99e54	orr x0,xzr,#-0x8
00a99e58	add x9,x9,#0x1
00a99e5c	lsr x8,x8,#0x1
00a99e60	add x0,x0,#0x8
00a99e64	cbnz x8,0x00a99e58
00a99e68	str x9,[x19, #0x28]
00a99e6c	b 0x00a99e7c
00a99e70	mov x0,xzr
00a99e74	b 0x00a99fe4
00a99e78	orr x0,xzr,#-0x8
00a99e7c	adrp x1,0x2d6000
00a99e80	add x1,x1,#0xc
00a99e84	mov w2,#0x1cf
00a99e88	bl 0x00c34250
00a99e8c	str x0,[x19, #0x20]
00a99e90	cbz x0,0x00a9a098
00a99e94	ldr x8,[x19, #0x48]
00a99e98	adrp x1,0x2d6000
00a99e9c	add x1,x1,#0xc
00a99ea0	mov w2,#0x1d4
00a99ea4	lsr x0,x8,#0x3
00a99ea8	bl 0x00c34250
00a99eac	str x0,[x19, #0x38]
00a99eb0	cbz x0,0x00a9a0b0
00a99eb4	ldr x8,[x19, #0x48]
00a99eb8	adrp x1,0x2d6000
00a99ebc	add x1,x1,#0xc
00a99ec0	mov w2,#0x1d9
00a99ec4	lsr x0,x8,#0x3
00a99ec8	bl 0x00c34250
00a99ecc	str x0,[x19, #0x40]
00a99ed0	cbz x0,0x00a9a0c8
00a99ed4	mov w0,#0x28
00a99ed8	bl 0x00c30bc0
00a99edc	ldr x8,[x19, #0x18]
00a99ee0	cmp x0,#0x1
00a99ee4	mov w9,#0x1000
00a99ee8	csel x20,x9,x0,lt
00a99eec	lsl x21,x20,#0x1
00a99ef0	add x1,x21,x8
00a99ef4	orr w2,wzr,#0x3
00a99ef8	mov w3,#0x22
00a99efc	mov w4,#0xffffffff
00a99f00	mov x0,xzr
00a99f04	mov x5,xzr
00a99f08	str x1,[x19, #0x8]
00a99f0c	bl 0x00c30b60
00a99f10	cmn x0,#0x1
00a99f14	str x0,[x19]
00a99f18	b.eq 0x00a99fe0
00a99f1c	ldr x2,[x19, #0x38]
00a99f20	add x0,x0,x20
00a99f24	mov w1,wzr
00a99f28	str x0,[x19, #0x10]
00a99f2c	bl 0x00a9afb8
00a99f30	ldr x0,[x19, #0x20]
00a99f34	ldr x1,[x19, #0x10]
00a99f38	bl 0x00a9b0a0
00a99f3c	ldr x0,[x19]
00a99f40	mov x1,x20
00a99f44	mov w2,wzr
00a99f48	bl 0x00c30b70
00a99f4c	ldr x8,[x19, #0x18]
00a99f50	ldr x9,[x19]
00a99f54	neg x10,x20
00a99f58	lsr w23,w0,#0x1f
00a99f5c	add x8,x21,x8
00a99f60	sub x8,x8,#0x1
00a99f64	and x8,x8,x10
00a99f68	add x0,x9,x8
00a99f6c	mov x1,x20
00a99f70	mov w2,wzr
00a99f74	bl 0x00c30b70
00a99f78	ldp x1,x2,[x19, #0x10]
00a99f7c	cmp w0,#0x0
00a99f80	mov w20,#0x2
00a99f84	mov w0,#0x11c
00a99f88	mov w3,#0x1
00a99f8c	csinc w23,w20,w23,lt
00a99f90	mov w21,#0x1
00a99f94	bl 0x00c30bb0
00a99f98	mov w24,w23
00a99f9c	tbz x0,#0x3f,0x00a99fc4
00a99fa0	bl 0x00c30710
00a99fa4	ldr w8,[x0]
00a99fa8	mov w24,#0x2
00a99fac	cmp w8,#0x26
00a99fb0	b.ne 0x00a99fc4
00a99fb4	ldp x0,x1,[x19, #0x10]
00a99fb8	bl 0x00c3e820
00a99fbc	cmp w0,#0x0
00a99fc0	csel w24,w24,w23,lt
00a99fc4	ldp x0,x1,[x19, #0x10]
00a99fc8	mov w2,#0x10
00a99fcc	bl 0x00c3e810
00a99fd0	cmp w0,#0x0
00a99fd4	csel w0,w20,w24,lt
00a99fd8	strb w21,[x22, #0xf0]
00a99fdc	b 0x00a9a054
00a99fe0	ldr x0,[x19, #0x20]
00a99fe4	adrp x20,0x2d6000
00a99fe8	add x20,x20,#0xc
00a99fec	mov w2,#0x244
00a99ff0	mov x1,x20
00a99ff4	bl 0x00c32310
00a99ff8	ldr x0,[x19, #0x38]
00a99ffc	mov w2,#0x245
00a9a000	mov x1,x20
00a9a004	bl 0x00c32310
00a9a008	ldr x0,[x19, #0x40]
00a9a00c	mov w2,#0x246
00a9a010	mov x1,x20
00a9a014	bl 0x00c32310
00a9a018	ldr x0,[x19]
00a9a01c	cmn x0,#0x1
00a9a020	b.eq 0x00a9a030
00a9a024	ldr x1,[x19, #0x8]
00a9a028	cbz x1,0x00a9a030
00a9a02c	bl 0x00c30b80
00a9a030	adrp x0,0xd22000
00a9a034	add x0,x0,#0x108
00a9a038	mov w2,#0x50
00a9a03c	mov w1,wzr
00a9a040	bl 0x00c301c0
00a9a044	ldr x0,[x23, #0xf8]
00a9a048	bl 0x00c34d40
00a9a04c	mov w0,wzr
00a9a050	str xzr,[x23, #0xf8]
00a9a054	ldp x29,x30,[sp, #0x30]
00a9a058	ldp x20,x19,[sp, #0x20]
00a9a05c	ldp x22,x21,[sp, #0x10]
00a9a060	ldp x24,x23,[sp], #0x40
00a9a064	ret
00a9a068	adrp x0,0x2c5000
00a9a06c	adrp x1,0x2d6000
00a9a070	add x0,x0,#0xd09
00a9a074	add x1,x1,#0xc
00a9a078	mov w2,#0x1a8
00a9a07c	bl 0x00c3c240
00a9a080	adrp x0,0x2a8000
00a9a084	adrp x1,0x2d6000
00a9a088	add x0,x0,#0x33d
00a9a08c	add x1,x1,#0xc
00a9a090	mov w2,#0x1a9
00a9a094	bl 0x00c3c240
00a9a098	adrp x0,0x2b7000
00a9a09c	adrp x1,0x2d6000
00a9a0a0	add x0,x0,#0xfea
00a9a0a4	add x1,x1,#0xc
00a9a0a8	mov w2,#0x1d0
00a9a0ac	bl 0x00c3c240
00a9a0b0	adrp x0,0x2ba000
00a9a0b4	adrp x1,0x2d6000
00a9a0b8	add x0,x0,#0x1a9
00a9a0bc	add x1,x1,#0xc
00a9a0c0	mov w2,#0x1d5
00a9a0c4	bl 0x00c3c240
00a9a0c8	adrp x0,0x2a4000
00a9a0cc	adrp x1,0x2d6000
00a9a0d0	add x0,x0,#0x39a
00a9a0d4	add x1,x1,#0xc
00a9a0d8	mov w2,#0x1da
00a9a0dc	bl 0x00c3c240
00a9a0e0	adrp x0,0x2c3000
00a9a0e4	adrp x1,0x2d6000
00a9a0e8	add x0,x0,#0xcb5
00a9a0ec	add x1,x1,#0xc
00a9a0f0	mov w2,#0x1be
00a9a0f4	bl 0x00c3c240
