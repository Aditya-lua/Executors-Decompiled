; ossl_i2d_X448_PUBKEY @ 00b1e0e0
00b1e0e0	str x21,[sp, #-0x30]!
00b1e0e4	stp x20,x19,[sp, #0x10]
00b1e0e8	stp x29,x30,[sp, #0x20]
00b1e0ec	add x29,sp,#0x20
00b1e0f0	cbz x0,0x00b1e16c
00b1e0f4	mov x19,x1
00b1e0f8	mov x21,x0
00b1e0fc	bl 0x00c36450
00b1e100	cbz x0,0x00b1e138
00b1e104	mov w1,#0x40b
00b1e108	mov x2,x21
00b1e10c	mov x20,x0
00b1e110	bl 0x00c39b70
00b1e114	mov x0,x20
00b1e118	mov x1,x19
00b1e11c	bl 0x00b1d40c
00b1e120	mov w19,w0
00b1e124	mov x0,x20
00b1e128	str xzr,[x20, #0x20]
00b1e12c	bl 0x00c32450
00b1e130	mov w0,w19
00b1e134	b 0x00b1e16c
00b1e138	bl 0x00c342a0
00b1e13c	adrp x0,0x2bc000
00b1e140	adrp x2,0x2b8000
00b1e144	add x0,x0,#0x79f
00b1e148	add x2,x2,#0x860
00b1e14c	orr w1,wzr,#0x3e0
00b1e150	bl 0x00c342b0
00b1e154	mov w1,#0x100
00b1e158	mov w0,#0xd
00b1e15c	movk w1,#0xc, LSL #16
00b1e160	mov x2,xzr
00b1e164	bl 0x00c342c0
00b1e168	mov w0,#0xffffffff
00b1e16c	ldp x29,x30,[sp, #0x20]
00b1e170	ldp x20,x19,[sp, #0x10]
00b1e174	ldr x21,[sp], #0x30
00b1e178	ret
