; X509_add_certs @ 00b0948c
00b0948c	sub sp,sp,#0x20
00b09490	stp x29,x30,[sp, #0x10]
00b09494	add x29,sp,#0x10
00b09498	str x0,[sp, #0x8]
00b0949c	cbz x0,0x00b094ac
00b094a0	add x0,sp,#0x8
00b094a4	bl 0x00b094ec
00b094a8	b 0x00b094e0
00b094ac	bl 0x00c342a0
00b094b0	adrp x0,0x2d4000
00b094b4	adrp x2,0x2aa000
00b094b8	add x0,x0,#0x58a
00b094bc	add x2,x2,#0xb60
00b094c0	mov w1,#0xe7
00b094c4	bl 0x00c342b0
00b094c8	mov w1,#0x102
00b094cc	mov w0,#0xb
00b094d0	movk w1,#0xc, LSL #16
00b094d4	mov x2,xzr
00b094d8	bl 0x00c342c0
00b094dc	mov w0,wzr
00b094e0	ldp x29,x30,[sp, #0x10]
00b094e4	add sp,sp,#0x20
00b094e8	ret
