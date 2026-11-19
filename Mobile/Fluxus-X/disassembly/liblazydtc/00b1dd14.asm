; ossl_i2d_ED25519_PUBKEY @ 00b1dd14
00b1dd14	str x21,[sp, #-0x30]!
00b1dd18	stp x20,x19,[sp, #0x10]
00b1dd1c	stp x29,x30,[sp, #0x20]
00b1dd20	add x29,sp,#0x20
00b1dd24	cbz x0,0x00b1dda0
00b1dd28	mov x19,x1
00b1dd2c	mov x21,x0
00b1dd30	bl 0x00c36450
00b1dd34	cbz x0,0x00b1dd6c
00b1dd38	mov w1,#0x43f
00b1dd3c	mov x2,x21
00b1dd40	mov x20,x0
00b1dd44	bl 0x00c39b70
00b1dd48	mov x0,x20
00b1dd4c	mov x1,x19
00b1dd50	bl 0x00b1d40c
00b1dd54	mov w19,w0
00b1dd58	mov x0,x20
00b1dd5c	str xzr,[x20, #0x20]
00b1dd60	bl 0x00c32450
00b1dd64	mov w0,w19
00b1dd68	b 0x00b1dda0
00b1dd6c	bl 0x00c342a0
00b1dd70	adrp x0,0x2bc000
00b1dd74	adrp x2,0x2bc000
00b1dd78	add x0,x0,#0x79f
00b1dd7c	add x2,x2,#0x7b6
00b1dd80	mov w1,#0x362
00b1dd84	bl 0x00c342b0
00b1dd88	mov w1,#0x100
00b1dd8c	mov w0,#0xd
00b1dd90	movk w1,#0xc, LSL #16
00b1dd94	mov x2,xzr
00b1dd98	bl 0x00c342c0
00b1dd9c	mov w0,#0xffffffff
00b1dda0	ldp x29,x30,[sp, #0x20]
00b1dda4	ldp x20,x19,[sp, #0x10]
00b1dda8	ldr x21,[sp], #0x30
00b1ddac	ret
