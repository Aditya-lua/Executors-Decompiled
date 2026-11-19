; X509_REQ_delete_attr @ 00b0c438
00b0c438	str x19,[sp, #-0x20]!
00b0c43c	stp x29,x30,[sp, #0x10]
00b0c440	add x29,sp,#0x10
00b0c444	cbz x0,0x00b0c464
00b0c448	mov x19,x0
00b0c44c	ldr x0,[x0, #0x30]
00b0c450	bl 0x00c3d0e0
00b0c454	cbz x0,0x00b0c498
00b0c458	mov w8,#0x1
00b0c45c	str w8,[x19, #0x10]
00b0c460	b 0x00b0c498
00b0c464	bl 0x00c342a0
00b0c468	adrp x0,0x2a4000
00b0c46c	adrp x2,0x29e000
00b0c470	add x0,x0,#0xaf5
00b0c474	add x2,x2,#0xc40
00b0c478	mov w1,#0xdd
00b0c47c	bl 0x00c342b0
00b0c480	mov w1,#0x102
00b0c484	mov w0,#0xb
00b0c488	movk w1,#0xc, LSL #16
00b0c48c	mov x2,xzr
00b0c490	bl 0x00c342c0
00b0c494	mov x0,xzr
00b0c498	ldp x29,x30,[sp, #0x10]
00b0c49c	ldr x19,[sp], #0x20
00b0c4a0	ret
