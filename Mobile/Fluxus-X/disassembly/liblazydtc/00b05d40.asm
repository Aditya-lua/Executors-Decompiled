; i2s_ASN1_INTEGER @ 00b05d40
00b05d40	stp x20,x19,[sp, #-0x20]!
00b05d44	stp x29,x30,[sp, #0x10]
00b05d48	add x29,sp,#0x10
00b05d4c	cbz x1,0x00b05db4
00b05d50	mov x0,x1
00b05d54	mov x1,xzr
00b05d58	bl 0x00c375e0
00b05d5c	mov x19,x0
00b05d60	cbz x0,0x00b05d74
00b05d64	mov x0,x19
00b05d68	bl 0x00b05c0c
00b05d6c	mov x20,x0
00b05d70	cbnz x0,0x00b05da8
00b05d74	bl 0x00c342a0
00b05d78	adrp x0,0x2c2000
00b05d7c	adrp x2,0x2b4000
00b05d80	add x0,x0,#0x5ca
00b05d84	add x2,x2,#0xa9e
00b05d88	mov w1,#0xbd
00b05d8c	bl 0x00c342b0
00b05d90	mov w1,#0x100
00b05d94	mov w0,#0x22
00b05d98	movk w1,#0xc, LSL #16
00b05d9c	mov x2,xzr
00b05da0	bl 0x00c342c0
00b05da4	mov x20,xzr
00b05da8	mov x0,x19
00b05dac	bl 0x00c36290
00b05db0	b 0x00b05db8
00b05db4	mov x20,xzr
00b05db8	ldp x29,x30,[sp, #0x10]
00b05dbc	mov x0,x20
00b05dc0	ldp x20,x19,[sp], #0x20
00b05dc4	ret
