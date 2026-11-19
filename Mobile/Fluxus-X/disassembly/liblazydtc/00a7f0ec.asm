; ossl_ffc_params_simple_validate @ 00a7f0ec
00a7f0ec	sub sp,sp,#0xa0
00a7f0f0	stp x22,x21,[sp, #0x70]
00a7f0f4	stp x20,x19,[sp, #0x80]
00a7f0f8	stp x29,x30,[sp, #0x90]
00a7f0fc	add x29,sp,#0x90
00a7f100	mov w20,w2
00a7f104	mov x22,x1
00a7f108	mov x21,x0
00a7f10c	add x0,sp,#0x8
00a7f110	orr w2,wzr,#0x60
00a7f114	mov w1,wzr
00a7f118	mov x19,x3
00a7f11c	stur wzr,[x29, #-0x24]
00a7f120	bl 0x00c301c0
00a7f124	cbz x22,0x00a7f1b0
00a7f128	cmp x19,#0x0
00a7f12c	sub x8,x29,#0x24
00a7f130	add x0,sp,#0x8
00a7f134	mov x1,x22
00a7f138	csel x19,x8,x19,eq
00a7f13c	bl 0x00c39c80
00a7f140	cbz w0,0x00a7f25c
00a7f144	mov w8,#0x2
00a7f148	mov w9,#0xffffffff
00a7f14c	str w8,[sp, #0x48]
00a7f150	str w9,[sp, #0x40]
00a7f154	ldrb w8,[x22, #0x40]
00a7f158	ldr x0,[sp, #0x8]
00a7f15c	tbnz w8,#0x2,0x00a7f1b8
00a7f160	cbz x0,0x00a7f210
00a7f164	ldr x8,[sp, #0x10]
00a7f168	cbz x8,0x00a7f210
00a7f16c	bl 0x00c322f0
00a7f170	ldr x8,[sp, #0x10]
00a7f174	sxtw x22,w0
00a7f178	mov x0,x8
00a7f17c	bl 0x00c322f0
00a7f180	sxtw x5,w0
00a7f184	add x1,sp,#0x8
00a7f188	mov x0,x21
00a7f18c	mov w2,wzr
00a7f190	mov w3,w20
00a7f194	mov x4,x22
00a7f198	mov x6,x19
00a7f19c	mov x7,xzr
00a7f1a0	bl 0x00c3dd10
00a7f1a4	mov w20,w0
00a7f1a8	cbnz w0,0x00a7f24c
00a7f1ac	b 0x00a7f210
00a7f1b0	mov w0,wzr
00a7f1b4	b 0x00a7f25c
00a7f1b8	cbz x0,0x00a7f208
00a7f1bc	ldr x8,[sp, #0x10]
00a7f1c0	cbz x8,0x00a7f208
00a7f1c4	bl 0x00c322f0
00a7f1c8	ldr x8,[sp, #0x10]
00a7f1cc	sxtw x22,w0
00a7f1d0	mov x0,x8
00a7f1d4	bl 0x00c322f0
00a7f1d8	sxtw x5,w0
00a7f1dc	add x1,sp,#0x8
00a7f1e0	mov x0,x21
00a7f1e4	mov w2,wzr
00a7f1e8	mov w3,w20
00a7f1ec	mov x4,x22
00a7f1f0	mov x6,x19
00a7f1f4	mov x7,xzr
00a7f1f8	bl 0x00c3dd00
00a7f1fc	mov w20,w0
00a7f200	cbnz w0,0x00a7f24c
00a7f204	b 0x00a7f210
00a7f208	mov w8,#0x800
00a7f20c	str w8,[x19]
00a7f210	ldrb w8,[x19]
00a7f214	mov w20,wzr
00a7f218	tbz w8,#0x3,0x00a7f24c
00a7f21c	bl 0x00c342a0
00a7f220	adrp x0,0x2d1000
00a7f224	adrp x2,0x2d9000
00a7f228	add x0,x0,#0xb13
00a7f22c	add x2,x2,#0xda9
00a7f230	mov w1,#0x7d
00a7f234	bl 0x00c342b0
00a7f238	mov w0,#0x5
00a7f23c	orr w1,wzr,#0x78
00a7f240	mov x2,xzr
00a7f244	bl 0x00c342c0
00a7f248	mov w20,wzr
00a7f24c	add x0,sp,#0x8
00a7f250	bl 0x00c3a040
00a7f254	cmp w20,#0x0
00a7f258	cset w0,ne
00a7f25c	ldp x29,x30,[sp, #0x90]
00a7f260	ldp x20,x19,[sp, #0x80]
00a7f264	ldp x22,x21,[sp, #0x70]
00a7f268	add sp,sp,#0xa0
00a7f26c	ret
