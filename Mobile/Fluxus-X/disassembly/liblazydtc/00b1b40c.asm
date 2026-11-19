; X509_CRL_METHOD_new @ 00b1b40c
00b1b40c	stp x22,x21,[sp, #-0x30]!
00b1b410	mov x21,x1
00b1b414	adrp x1,0x2d6000
00b1b418	stp x20,x19,[sp, #0x10]
00b1b41c	mov x20,x2
00b1b420	mov x22,x0
00b1b424	add x1,x1,#0x879
00b1b428	mov w0,#0x28
00b1b42c	mov w2,#0x1e9
00b1b430	stp x29,x30,[sp, #0x20]
00b1b434	add x29,sp,#0x20
00b1b438	mov x19,x3
00b1b43c	bl 0x00c32320
00b1b440	cbz x0,0x00b1b458
00b1b444	mov w8,#0x1
00b1b448	stp x22,x21,[x0, #0x8]
00b1b44c	stp x20,x19,[x0, #0x18]
00b1b450	str w8,[x0]
00b1b454	b 0x00b1b48c
00b1b458	bl 0x00c342a0
00b1b45c	adrp x0,0x2d6000
00b1b460	adrp x2,0x2d0000
00b1b464	add x0,x0,#0x879
00b1b468	add x2,x2,#0x5f4
00b1b46c	mov w1,#0x1ec
00b1b470	bl 0x00c342b0
00b1b474	mov w1,#0x100
00b1b478	mov w0,#0xb
00b1b47c	movk w1,#0xc, LSL #16
00b1b480	mov x2,xzr
00b1b484	bl 0x00c342c0
00b1b488	mov x0,xzr
00b1b48c	ldp x29,x30,[sp, #0x20]
00b1b490	ldp x20,x19,[sp, #0x10]
00b1b494	ldp x22,x21,[sp], #0x30
00b1b498	ret
