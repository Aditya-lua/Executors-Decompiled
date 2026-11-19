; EVP_PKEY_private_check @ 00a74160
00a74160	stp x29,x30,[sp, #-0x10]!
00a74164	ldr x8,[x0, #0x88]
00a74168	mov x29,sp
00a7416c	cbz x8,0x00a7418c
00a74170	mov w1,#0x1
00a74174	mov w2,wzr
00a74178	bl 0x00a741fc
00a7417c	cmn w0,#0x1
00a74180	b.eq 0x00a741c4
00a74184	ldp x29,x30,[sp], #0x10
00a74188	ret
00a7418c	bl 0x00c342a0
00a74190	adrp x0,0x2a6000
00a74194	adrp x2,0x2b2000
00a74198	add x0,x0,#0x4f
00a7419c	add x2,x2,#0x297
00a741a0	mov w1,#0x8e
00a741a4	bl 0x00c342b0
00a741a8	orr w0,wzr,#0x6
00a741ac	mov w1,#0x9a
00a741b0	mov x2,xzr
00a741b4	bl 0x00c342c0
00a741b8	mov w0,wzr
00a741bc	ldp x29,x30,[sp], #0x10
00a741c0	ret
00a741c4	bl 0x00c342a0
00a741c8	adrp x0,0x2a6000
00a741cc	adrp x2,0x2b2000
00a741d0	add x0,x0,#0x4f
00a741d4	add x2,x2,#0x297
00a741d8	mov w1,#0x97
00a741dc	bl 0x00c342b0
00a741e0	orr w0,wzr,#0x6
00a741e4	mov w1,#0x96
00a741e8	mov x2,xzr
00a741ec	bl 0x00c342c0
00a741f0	orr w0,wzr,#0xfffffffe
00a741f4	ldp x29,x30,[sp], #0x10
00a741f8	ret
