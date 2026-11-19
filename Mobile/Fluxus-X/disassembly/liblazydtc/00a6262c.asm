; OSSL_ENCODER_CTX_set_construct_data @ 00a6262c
00a6262c	cbz x0,0x00a6263c
00a62630	str x1,[x0, #0x30]
00a62634	mov w0,#0x1
00a62638	ret
00a6263c	stp x29,x30,[sp, #-0x10]!
00a62640	mov x29,sp
00a62644	bl 0x00c342a0
00a62648	adrp x0,0x2a0000
00a6264c	adrp x2,0x2b7000
00a62650	add x0,x0,#0x26d
00a62654	add x2,x2,#0xcb7
00a62658	mov w1,#0x15a
00a6265c	bl 0x00c342b0
00a62660	mov w1,#0x102
00a62664	mov w0,#0x3b
00a62668	movk w1,#0xc, LSL #16
00a6266c	mov x2,xzr
00a62670	bl 0x00c342c0
00a62674	mov w0,wzr
00a62678	ldp x29,x30,[sp], #0x10
00a6267c	ret
