; ossl_ec_key_pairwise_check @ 00a2f110
00a2f110	str x21,[sp, #-0x30]!
00a2f114	stp x20,x19,[sp, #0x10]
00a2f118	stp x29,x30,[sp, #0x20]
00a2f11c	add x29,sp,#0x20
00a2f120	cbz x0,0x00a2f1ac
00a2f124	mov x21,x0
00a2f128	ldr x0,[x0, #0x18]
00a2f12c	cbz x0,0x00a2f1ac
00a2f130	ldr x8,[x21, #0x20]
00a2f134	cbz x8,0x00a2f1ac
00a2f138	ldr x8,[x21, #0x28]
00a2f13c	cbz x8,0x00a2f1ac
00a2f140	mov x20,x1
00a2f144	bl 0x00c3ab70
00a2f148	mov x19,x0
00a2f14c	cbz x0,0x00a2f224
00a2f150	ldr x0,[x21, #0x18]
00a2f154	ldr x2,[x21, #0x28]
00a2f158	mov x1,x19
00a2f15c	mov x3,xzr
00a2f160	mov x4,xzr
00a2f164	mov x5,x20
00a2f168	bl 0x00c3ae30
00a2f16c	cbz w0,0x00a2f1f4
00a2f170	ldp x0,x2,[x21, #0x18]
00a2f174	mov x1,x19
00a2f178	mov x3,x20
00a2f17c	bl 0x00c3a890
00a2f180	cbz w0,0x00a2f234
00a2f184	bl 0x00c342a0
00a2f188	adrp x0,0x2b4000
00a2f18c	adrp x2,0x2c9000
00a2f190	add x0,x0,#0x15e
00a2f194	add x2,x2,#0x72e
00a2f198	mov w1,#0x228
00a2f19c	bl 0x00c342b0
00a2f1a0	mov w0,#0x10
00a2f1a4	mov w1,#0x7b
00a2f1a8	b 0x00a2f21c
00a2f1ac	bl 0x00c342a0
00a2f1b0	adrp x0,0x2b4000
00a2f1b4	adrp x2,0x2c9000
00a2f1b8	add x0,x0,#0x15e
00a2f1bc	add x2,x2,#0x72e
00a2f1c0	mov w1,#0x21a
00a2f1c4	bl 0x00c342b0
00a2f1c8	mov w1,#0x102
00a2f1cc	mov w0,#0x10
00a2f1d0	movk w1,#0xc, LSL #16
00a2f1d4	mov x2,xzr
00a2f1d8	bl 0x00c342c0
00a2f1dc	mov w20,wzr
00a2f1e0	mov w0,w20
00a2f1e4	ldp x29,x30,[sp, #0x20]
00a2f1e8	ldp x20,x19,[sp, #0x10]
00a2f1ec	ldr x21,[sp], #0x30
00a2f1f0	ret
00a2f1f4	bl 0x00c342a0
00a2f1f8	adrp x0,0x2b4000
00a2f1fc	adrp x2,0x2c9000
00a2f200	add x0,x0,#0x15e
00a2f204	add x2,x2,#0x72e
00a2f208	mov w1,#0x224
00a2f20c	bl 0x00c342b0
00a2f210	mov w1,#0x10
00a2f214	mov w0,#0x10
00a2f218	movk w1,#0x8, LSL #16
00a2f21c	mov x2,xzr
00a2f220	bl 0x00c342c0
00a2f224	mov w20,wzr
00a2f228	mov x0,x19
00a2f22c	bl 0x00c3ab60
00a2f230	b 0x00a2f1e0
00a2f234	mov w20,#0x1
00a2f238	b 0x00a2f228
