; ossl_bn_gen_dsa_nonce_fixed_top @ 00a1ded4
00a1ded4	sub sp,sp,#0x160
00a1ded8	stp x28,x27,[sp, #0x100]
00a1dedc	stp x26,x25,[sp, #0x110]
00a1dee0	stp x24,x23,[sp, #0x120]
00a1dee4	stp x22,x21,[sp, #0x130]
00a1dee8	stp x20,x19,[sp, #0x140]
00a1deec	stp x29,x30,[sp, #0x150]
00a1def0	add x29,sp,#0x150
00a1def4	mov x21,x5
00a1def8	mov x23,x4
00a1defc	mov x24,x3
00a1df00	mov x22,x2
00a1df04	mov x25,x1
00a1df08	mov x26,x0
00a1df0c	bl 0x00c31fa0
00a1df10	mov x20,x0
00a1df14	mov x0,x25
00a1df18	bl 0x00c322f0
00a1df1c	add w8,w0,#0x7
00a1df20	add w9,w0,#0xe
00a1df24	cmp w8,#0x0
00a1df28	csel w8,w9,w8,lt
00a1df2c	asr w8,w8,#0x3
00a1df30	mov x0,x21
00a1df34	add w19,w8,#0x1
00a1df38	bl 0x00c38aa0
00a1df3c	cbz x20,0x00a1e0f4
00a1df40	adrp x1,0x2c1000
00a1df44	mov x27,x0
00a1df48	add x1,x1,#0xaac
00a1df4c	mov w2,#0x142
00a1df50	mov x0,x19
00a1df54	bl 0x00c32320
00a1df58	mov x21,x0
00a1df5c	cbz x0,0x00a1e128
00a1df60	orr w8,wzr,#0xff
00a1df64	add x1,sp,#0x18
00a1df68	orr w2,wzr,#0x60
00a1df6c	mov x0,x22
00a1df70	strb w8,[x21]
00a1df74	bl 0x00c38c70
00a1df78	tbnz w0,#0x1f,0x00a1e0fc
00a1df7c	adrp x1,0x2b7000
00a1df80	add x1,x1,#0x998
00a1df84	mov x0,x27
00a1df88	mov x2,xzr
00a1df8c	bl 0x00c357f0
00a1df90	mov x22,x0
00a1df94	cbz x0,0x00a1e134
00a1df98	stp x24,x23,[sp]
00a1df9c	mov w23,wzr
00a1dfa0	cmp w19,#0x2
00a1dfa4	strb wzr,[sp, #0x14]
00a1dfa8	b.cc 0x00a1e078
00a1dfac	mov w24,#0x1
00a1dfb0	sub x1,x29,#0x98
00a1dfb4	mov w2,#0x40
00a1dfb8	mov x0,x27
00a1dfbc	mov w3,wzr
00a1dfc0	bl 0x00c358b0
00a1dfc4	cmp w0,#0x1
00a1dfc8	b.lt 0x00a1e160
00a1dfcc	mov x0,x20
00a1dfd0	mov x1,x22
00a1dfd4	mov x2,xzr
00a1dfd8	bl 0x00c31f70
00a1dfdc	cbz w0,0x00a1e160
00a1dfe0	add x1,sp,#0x14
00a1dfe4	mov w2,#0x1
00a1dfe8	mov x0,x20
00a1dfec	bl 0x00c31f80
00a1dff0	cbz w0,0x00a1e160
00a1dff4	add x1,sp,#0x18
00a1dff8	orr w2,wzr,#0x60
00a1dffc	mov x0,x20
00a1e000	bl 0x00c31f80
00a1e004	cbz w0,0x00a1e160
00a1e008	ldp x1,x2,[sp]
00a1e00c	mov x0,x20
00a1e010	bl 0x00c31f80
00a1e014	cbz w0,0x00a1e160
00a1e018	sub x1,x29,#0x98
00a1e01c	mov w2,#0x40
00a1e020	mov x0,x20
00a1e024	bl 0x00c31f80
00a1e028	cbz w0,0x00a1e160
00a1e02c	add x1,sp,#0x78
00a1e030	mov x0,x20
00a1e034	mov x2,xzr
00a1e038	bl 0x00c31f60
00a1e03c	cbz w0,0x00a1e160
00a1e040	sub w8,w19,w24
00a1e044	cmp w8,#0x40
00a1e048	mov w9,#0x40
00a1e04c	csel w28,w8,w9,cc
00a1e050	add x0,x21,w24, UXTW 
00a1e054	add x1,sp,#0x78
00a1e058	mov x2,x28
00a1e05c	bl 0x00c2ffd0
00a1e060	ldrb w8,[sp, #0x14]
00a1e064	add w24,w28,w24
00a1e068	cmp w19,w24
00a1e06c	add w8,w8,#0x1
00a1e070	strb w8,[sp, #0x14]
00a1e074	b.hi 0x00a1dfb0
00a1e078	mov x0,x21
00a1e07c	mov w1,w19
00a1e080	mov x2,x26
00a1e084	bl 0x00c36970
00a1e088	cbz x0,0x00a1e160
00a1e08c	mov w1,#0x4
00a1e090	mov x0,x26
00a1e094	bl 0x00c38dc0
00a1e098	mov x0,x25
00a1e09c	bl 0x00c322f0
00a1e0a0	mov w1,w0
00a1e0a4	mov x0,x26
00a1e0a8	bl 0x00c38ea0
00a1e0ac	mov x0,x26
00a1e0b0	mov x1,x25
00a1e0b4	bl 0x00c369c0
00a1e0b8	tbnz w0,#0x1f,0x00a1e1d4
00a1e0bc	add w23,w23,#0x1
00a1e0c0	cmp w23,#0x40
00a1e0c4	b.cc 0x00a1dfa0
00a1e0c8	bl 0x00c342a0
00a1e0cc	adrp x0,0x2c1000
00a1e0d0	adrp x2,0x2a3000
00a1e0d4	add x0,x0,#0xaac
00a1e0d8	add x2,x2,#0xea6
00a1e0dc	mov w1,#0x183
00a1e0e0	bl 0x00c342b0
00a1e0e4	mov w1,#0x103
00a1e0e8	orr w0,wzr,#0x3
00a1e0ec	movk w1,#0xc, LSL #16
00a1e0f0	b 0x00a1e158
00a1e0f4	mov x21,xzr
00a1e0f8	b 0x00a1e128
00a1e0fc	bl 0x00c342a0
00a1e100	adrp x0,0x2c1000
00a1e104	adrp x2,0x2a3000
00a1e108	add x0,x0,#0xaac
00a1e10c	add x2,x2,#0xea6
00a1e110	mov w1,#0x14f
00a1e114	bl 0x00c342b0
00a1e118	orr w0,wzr,#0x3
00a1e11c	mov w1,#0x75
00a1e120	mov x2,xzr
00a1e124	bl 0x00c342c0
00a1e128	mov w23,wzr
00a1e12c	mov x22,xzr
00a1e130	b 0x00a1e164
00a1e134	bl 0x00c342a0
00a1e138	adrp x0,0x2c1000
00a1e13c	adrp x2,0x2a3000
00a1e140	add x0,x0,#0xaac
00a1e144	add x2,x2,#0xea6
00a1e148	mov w1,#0x155
00a1e14c	bl 0x00c342b0
00a1e150	orr w0,wzr,#0x3
00a1e154	orr w1,wzr,#0x78
00a1e158	mov x2,xzr
00a1e15c	bl 0x00c342c0
00a1e160	mov w23,wzr
00a1e164	mov x0,x20
00a1e168	bl 0x00c31f90
00a1e16c	mov x0,x22
00a1e170	bl 0x00c35800
00a1e174	adrp x2,0x2c1000
00a1e178	add x2,x2,#0xaac
00a1e17c	mov w3,#0x188
00a1e180	mov x0,x21
00a1e184	mov x1,x19
00a1e188	bl 0x00c345e0
00a1e18c	add x0,sp,#0x78
00a1e190	mov w1,#0x40
00a1e194	bl 0x00c34750
00a1e198	sub x0,x29,#0x98
00a1e19c	mov w1,#0x40
00a1e1a0	bl 0x00c34750
00a1e1a4	add x0,sp,#0x18
00a1e1a8	orr w1,wzr,#0x60
00a1e1ac	bl 0x00c34750
00a1e1b0	mov w0,w23
00a1e1b4	ldp x29,x30,[sp, #0x150]
00a1e1b8	ldp x20,x19,[sp, #0x140]
00a1e1bc	ldp x22,x21,[sp, #0x130]
00a1e1c0	ldp x24,x23,[sp, #0x120]
00a1e1c4	ldp x26,x25,[sp, #0x110]
00a1e1c8	ldp x28,x27,[sp, #0x100]
00a1e1cc	add sp,sp,#0x160
00a1e1d0	ret
00a1e1d4	mov w23,#0x1
00a1e1d8	b 0x00a1e164
