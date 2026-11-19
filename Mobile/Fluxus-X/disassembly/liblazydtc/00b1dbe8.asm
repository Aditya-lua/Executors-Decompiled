; i2d_EC_PUBKEY @ 00b1dbe8
00b1dbe8	str x21,[sp, #-0x30]!
00b1dbec	stp x20,x19,[sp, #0x10]
00b1dbf0	stp x29,x30,[sp, #0x20]
00b1dbf4	add x29,sp,#0x20
00b1dbf8	cbz x0,0x00b1dc74
00b1dbfc	mov x19,x1
00b1dc00	mov x21,x0
00b1dc04	bl 0x00c36450
00b1dc08	cbz x0,0x00b1dc40
00b1dc0c	mov w1,#0x198
00b1dc10	mov x2,x21
00b1dc14	mov x20,x0
00b1dc18	bl 0x00c39b70
00b1dc1c	mov x0,x20
00b1dc20	mov x1,x19
00b1dc24	bl 0x00b1d40c
00b1dc28	mov w19,w0
00b1dc2c	mov x0,x20
00b1dc30	str xzr,[x20, #0x20]
00b1dc34	bl 0x00c32450
00b1dc38	mov w0,w19
00b1dc3c	b 0x00b1dc74
00b1dc40	bl 0x00c342a0
00b1dc44	adrp x0,0x2bc000
00b1dc48	adrp x2,0x2a8000
00b1dc4c	add x0,x0,#0x79f
00b1dc50	add x2,x2,#0xa7e
00b1dc54	mov w1,#0x339
00b1dc58	bl 0x00c342b0
00b1dc5c	mov w1,#0x100
00b1dc60	mov w0,#0xd
00b1dc64	movk w1,#0xc, LSL #16
00b1dc68	mov x2,xzr
00b1dc6c	bl 0x00c342c0
00b1dc70	mov w0,#0xffffffff
00b1dc74	ldp x29,x30,[sp, #0x20]
00b1dc78	ldp x20,x19,[sp, #0x10]
00b1dc7c	ldr x21,[sp], #0x30
00b1dc80	ret
