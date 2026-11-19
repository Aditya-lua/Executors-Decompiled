; i2d_RSA_PUBKEY @ 00b1d624
00b1d624	str x21,[sp, #-0x30]!
00b1d628	stp x20,x19,[sp, #0x10]
00b1d62c	stp x29,x30,[sp, #0x20]
00b1d630	add x29,sp,#0x20
00b1d634	cbz x0,0x00b1d6b0
00b1d638	mov x19,x1
00b1d63c	mov x21,x0
00b1d640	bl 0x00c36450
00b1d644	cbz x0,0x00b1d67c
00b1d648	orr w1,wzr,#0x6
00b1d64c	mov x2,x21
00b1d650	mov x20,x0
00b1d654	bl 0x00c39b70
00b1d658	mov x0,x20
00b1d65c	mov x1,x19
00b1d660	bl 0x00b1d40c
00b1d664	mov w19,w0
00b1d668	mov x0,x20
00b1d66c	str xzr,[x20, #0x20]
00b1d670	bl 0x00c32450
00b1d674	mov w0,w19
00b1d678	b 0x00b1d6b0
00b1d67c	bl 0x00c342a0
00b1d680	adrp x0,0x2bc000
00b1d684	adrp x2,0x2a8000
00b1d688	add x0,x0,#0x79f
00b1d68c	add x2,x2,#0xa6f
00b1d690	mov w1,#0x277
00b1d694	bl 0x00c342b0
00b1d698	mov w1,#0x100
00b1d69c	mov w0,#0xd
00b1d6a0	movk w1,#0xc, LSL #16
00b1d6a4	mov x2,xzr
00b1d6a8	bl 0x00c342c0
00b1d6ac	mov w0,#0xffffffff
00b1d6b0	ldp x29,x30,[sp, #0x20]
00b1d6b4	ldp x20,x19,[sp, #0x10]
00b1d6b8	ldr x21,[sp], #0x30
00b1d6bc	ret
