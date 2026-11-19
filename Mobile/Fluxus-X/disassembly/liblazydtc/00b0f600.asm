; X509_STORE_CTX_new @ 00b0f600
00b0f600	stp x29,x30,[sp, #-0x10]!
00b0f604	adrp x1,0x2a0000
00b0f608	add x1,x1,#0xe02
00b0f60c	mov w0,#0x110
00b0f610	mov w2,#0x8ec
00b0f614	mov x29,sp
00b0f618	bl 0x00c34250
00b0f61c	cbz x0,0x00b0f62c
00b0f620	str xzr,[x0, #0x100]
00b0f624	ldp x29,x30,[sp], #0x10
00b0f628	ret
00b0f62c	bl 0x00c342a0
00b0f630	adrp x0,0x2a0000
00b0f634	adrp x2,0x2d0000
00b0f638	add x0,x0,#0xe02
00b0f63c	add x2,x2,#0x5ba
00b0f640	mov w1,#0x8ef
00b0f644	bl 0x00c342b0
00b0f648	mov w1,#0x100
00b0f64c	mov w0,#0xb
00b0f650	movk w1,#0xc, LSL #16
00b0f654	mov x2,xzr
00b0f658	bl 0x00c342c0
00b0f65c	mov x0,xzr
00b0f660	ldp x29,x30,[sp], #0x10
00b0f664	ret
