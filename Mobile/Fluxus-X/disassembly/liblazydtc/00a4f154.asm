; OSSL_DECODER_CTX_set_params @ 00a4f154
00a4f154	str x25,[sp, #-0x50]!
00a4f158	stp x24,x23,[sp, #0x10]
00a4f15c	stp x22,x21,[sp, #0x20]
00a4f160	stp x20,x19,[sp, #0x30]
00a4f164	stp x29,x30,[sp, #0x40]
00a4f168	add x29,sp,#0x40
00a4f16c	cbz x0,0x00a4f1e4
00a4f170	ldr x8,[x0, #0x18]
00a4f174	mov x20,x0
00a4f178	cbz x8,0x00a4f21c
00a4f17c	mov x0,x20
00a4f180	mov x19,x1
00a4f184	bl 0x00c3b320
00a4f188	cbz w0,0x00a4f21c
00a4f18c	mov x22,xzr
00a4f190	sxtw x25,w0
00a4f194	mov w21,#0x1
00a4f198	ldr x0,[x20, #0x18]
00a4f19c	mov w1,w22
00a4f1a0	bl 0x00c32610
00a4f1a4	mov x24,x0
00a4f1a8	bl 0x00c3b390
00a4f1ac	mov x23,x0
00a4f1b0	mov x0,x24
00a4f1b4	bl 0x00c3b3a0
00a4f1b8	cbz x0,0x00a4f1d4
00a4f1bc	ldr x8,[x23, #0x58]
00a4f1c0	cbz x8,0x00a4f1d4
00a4f1c4	mov x1,x19
00a4f1c8	blr x8
00a4f1cc	cmp w0,#0x0
00a4f1d0	csel w21,wzr,w21,eq
00a4f1d4	add x22,x22,#0x1
00a4f1d8	cmp x22,x25
00a4f1dc	b.cc 0x00a4f198
00a4f1e0	b 0x00a4f220
00a4f1e4	bl 0x00c342a0
00a4f1e8	adrp x0,0x2db000
00a4f1ec	adrp x2,0x2a5000
00a4f1f0	add x0,x0,#0xf32
00a4f1f4	add x2,x2,#0xef9
00a4f1f8	mov w1,#0x29b
00a4f1fc	bl 0x00c342b0
00a4f200	mov w1,#0x102
00a4f204	orr w0,wzr,#0x3c
00a4f208	movk w1,#0xc, LSL #16
00a4f20c	mov x2,xzr
00a4f210	bl 0x00c342c0
00a4f214	mov w21,wzr
00a4f218	b 0x00a4f220
00a4f21c	mov w21,#0x1
00a4f220	mov w0,w21
00a4f224	ldp x29,x30,[sp, #0x40]
00a4f228	ldp x20,x19,[sp, #0x30]
00a4f22c	ldp x22,x21,[sp, #0x20]
00a4f230	ldp x24,x23,[sp, #0x10]
00a4f234	ldr x25,[sp], #0x50
00a4f238	ret
