; OSSL_DECODER_CTX_new @ 00a4f0ec
00a4f0ec	str x19,[sp, #-0x20]!
00a4f0f0	adrp x1,0x2db000
00a4f0f4	add x1,x1,#0xf32
00a4f0f8	mov w0,#0x68
00a4f0fc	mov w2,#0x28d
00a4f100	stp x29,x30,[sp, #0x10]
00a4f104	add x29,sp,#0x10
00a4f108	bl 0x00c34250
00a4f10c	mov x19,x0
00a4f110	cbnz x0,0x00a4f144
00a4f114	bl 0x00c342a0
00a4f118	adrp x0,0x2db000
00a4f11c	adrp x2,0x2af000
00a4f120	add x0,x0,#0xf32
00a4f124	add x2,x2,#0xebd
00a4f128	mov w1,#0x28e
00a4f12c	bl 0x00c342b0
00a4f130	mov w1,#0x100
00a4f134	orr w0,wzr,#0x3c
00a4f138	movk w1,#0xc, LSL #16
00a4f13c	mov x2,xzr
00a4f140	bl 0x00c342c0
00a4f144	ldp x29,x30,[sp, #0x10]
00a4f148	mov x0,x19
00a4f14c	ldr x19,[sp], #0x20
00a4f150	ret
