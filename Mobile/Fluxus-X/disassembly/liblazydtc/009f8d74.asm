; X509_PKEY_new @ 009f8d74
009f8d74	str x19,[sp, #-0x20]!
009f8d78	adrp x1,0x2ab000
009f8d7c	add x1,x1,#0xe2e
009f8d80	mov w0,#0x50
009f8d84	mov w2,#0x14
009f8d88	stp x29,x30,[sp, #0x10]
009f8d8c	add x29,sp,#0x10
009f8d90	bl 0x00c34250
009f8d94	cbz x0,0x009f8e00
009f8d98	mov x19,x0
009f8d9c	bl 0x00c38250
009f8da0	str x0,[x19, #0x8]
009f8da4	bl 0x00c38170
009f8da8	ldr x8,[x19, #0x8]
009f8dac	str x0,[x19, #0x10]
009f8db0	cbz x0,0x009f8db8
009f8db4	cbnz x8,0x009f8e34
009f8db8	mov x0,x8
009f8dbc	bl 0x00c38240
009f8dc0	ldr x0,[x19, #0x10]
009f8dc4	bl 0x00c35530
009f8dc8	ldr x0,[x19, #0x18]
009f8dcc	bl 0x00c32450
009f8dd0	ldr w8,[x19, #0x30]
009f8dd4	cbz w8,0x009f8dec
009f8dd8	ldr x0,[x19, #0x28]
009f8ddc	adrp x1,0x2ab000
009f8de0	add x1,x1,#0xe2e
009f8de4	mov w2,#0x2d
009f8de8	bl 0x00c32310
009f8dec	adrp x1,0x2ab000
009f8df0	add x1,x1,#0xe2e
009f8df4	mov w2,#0x2e
009f8df8	mov x0,x19
009f8dfc	bl 0x00c32310
009f8e00	bl 0x00c342a0
009f8e04	adrp x0,0x2ab000
009f8e08	adrp x2,0x2a9000
009f8e0c	add x0,x0,#0xe2e
009f8e10	add x2,x2,#0xfa4
009f8e14	mov w1,#0x20
009f8e18	bl 0x00c342b0
009f8e1c	mov w1,#0x100
009f8e20	mov w0,#0xd
009f8e24	movk w1,#0xc, LSL #16
009f8e28	mov x2,xzr
009f8e2c	bl 0x00c342c0
009f8e30	mov x19,xzr
009f8e34	ldp x29,x30,[sp, #0x10]
009f8e38	mov x0,x19
009f8e3c	ldr x19,[sp], #0x20
009f8e40	ret
