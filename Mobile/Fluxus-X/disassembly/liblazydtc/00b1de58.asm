; ossl_i2d_ED448_PUBKEY @ 00b1de58
00b1de58	str x21,[sp, #-0x30]!
00b1de5c	stp x20,x19,[sp, #0x10]
00b1de60	stp x29,x30,[sp, #0x20]
00b1de64	add x29,sp,#0x20
00b1de68	cbz x0,0x00b1dee4
00b1de6c	mov x19,x1
00b1de70	mov x21,x0
00b1de74	bl 0x00c36450
00b1de78	cbz x0,0x00b1deb0
00b1de7c	mov w1,#0x440
00b1de80	mov x2,x21
00b1de84	mov x20,x0
00b1de88	bl 0x00c39b70
00b1de8c	mov x0,x20
00b1de90	mov x1,x19
00b1de94	bl 0x00b1d40c
00b1de98	mov w19,w0
00b1de9c	mov x0,x20
00b1dea0	str xzr,[x20, #0x20]
00b1dea4	bl 0x00c32450
00b1dea8	mov w0,w19
00b1deac	b 0x00b1dee4
00b1deb0	bl 0x00c342a0
00b1deb4	adrp x0,0x2bc000
00b1deb8	adrp x2,0x2d2000
00b1debc	add x0,x0,#0x79f
00b1dec0	add x2,x2,#0x64e
00b1dec4	mov w1,#0x38c
00b1dec8	bl 0x00c342b0
00b1decc	mov w1,#0x100
00b1ded0	mov w0,#0xd
00b1ded4	movk w1,#0xc, LSL #16
00b1ded8	mov x2,xzr
00b1dedc	bl 0x00c342c0
00b1dee0	mov w0,#0xffffffff
00b1dee4	ldp x29,x30,[sp, #0x20]
00b1dee8	ldp x20,x19,[sp, #0x10]
00b1deec	ldr x21,[sp], #0x30
00b1def0	ret
