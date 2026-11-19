; OSSL_STORE_INFO_new_CERT @ 00aea494
00aea494	str x19,[sp, #-0x20]!
00aea498	adrp x1,0x2c2000
00aea49c	mov x19,x0
00aea4a0	add x1,x1,#0x3bd
00aea4a4	orr w0,wzr,#0x18
00aea4a8	mov w2,#0x220
00aea4ac	stp x29,x30,[sp, #0x10]
00aea4b0	add x29,sp,#0x10
00aea4b4	bl 0x00c34250
00aea4b8	cbz x0,0x00aea4cc
00aea4bc	mov w8,#0x5
00aea4c0	str w8,[x0]
00aea4c4	str x19,[x0, #0x8]
00aea4c8	b 0x00aea500
00aea4cc	bl 0x00c342a0
00aea4d0	adrp x0,0x2c2000
00aea4d4	adrp x2,0x2b6000
00aea4d8	add x0,x0,#0x3bd
00aea4dc	add x2,x2,#0x483
00aea4e0	mov w1,#0x264
00aea4e4	bl 0x00c342b0
00aea4e8	mov w1,#0x100
00aea4ec	mov w0,#0x2c
00aea4f0	movk w1,#0xc, LSL #16
00aea4f4	mov x2,xzr
00aea4f8	bl 0x00c342c0
00aea4fc	mov x0,xzr
00aea500	ldp x29,x30,[sp, #0x10]
00aea504	ldr x19,[sp], #0x20
00aea508	ret
