; X509_PUBKEY_dup @ 00b1cb44
00b1cb44	str x21,[sp, #-0x30]!
00b1cb48	adrp x1,0x2bc000
00b1cb4c	stp x20,x19,[sp, #0x10]
00b1cb50	mov x20,x0
00b1cb54	add x1,x1,#0x79f
00b1cb58	orr w0,wzr,#0x30
00b1cb5c	mov w2,#0x11d
00b1cb60	stp x29,x30,[sp, #0x20]
00b1cb64	add x29,sp,#0x20
00b1cb68	bl 0x00c34250
00b1cb6c	cbz x0,0x00b1cc6c
00b1cb70	mov x19,x0
00b1cb74	ldp x8,x21,[x20, #0x18]
00b1cb78	ldr x0,[x0, #0x20]
00b1cb7c	adrp x1,0x2bc000
00b1cb80	add x1,x1,#0x79f
00b1cb84	mov w2,#0x34
00b1cb88	str x8,[x19, #0x18]
00b1cb8c	bl 0x00c32310
00b1cb90	str xzr,[x19, #0x20]
00b1cb94	cbz x21,0x00b1cbb4
00b1cb98	adrp x1,0x2bc000
00b1cb9c	add x1,x1,#0x79f
00b1cba0	mov w2,#0x37
00b1cba4	mov x0,x21
00b1cba8	bl 0x00c34600
00b1cbac	str x0,[x19, #0x20]
00b1cbb0	cbz x0,0x00b1cc2c
00b1cbb4	ldr x0,[x20]
00b1cbb8	bl 0x00c38230
00b1cbbc	str x0,[x19]
00b1cbc0	cbz x0,0x00b1cc2c
00b1cbc4	bl 0x00c38040
00b1cbc8	str x0,[x19, #0x8]
00b1cbcc	cbz x0,0x00b1cc2c
00b1cbd0	ldr x8,[x20, #0x8]
00b1cbd4	ldr x1,[x8, #0x8]
00b1cbd8	ldr w2,[x8]
00b1cbdc	bl 0x00c373c0
00b1cbe0	cbz w0,0x00b1cc2c
00b1cbe4	ldr x8,[x20, #0x10]
00b1cbe8	cbz x8,0x00b1cca0
00b1cbec	bl 0x00c35250
00b1cbf0	ldr x0,[x20, #0x10]
00b1cbf4	bl 0x00c3d910
00b1cbf8	mov x8,x0
00b1cbfc	mov x0,x19
00b1cc00	str x8,[x0, #0x10]!
00b1cc04	cbnz x8,0x00b1cc24
00b1cc08	ldrb w8,[x19, #0x28]
00b1cc0c	mov x1,x19
00b1cc10	orr w8,w8,#0x1
00b1cc14	strb w8,[x19, #0x28]
00b1cc18	bl 0x00b1cd70
00b1cc1c	cmp w0,#0x0
00b1cc20	b.le 0x00b1ccb4
00b1cc24	bl 0x00c35240
00b1cc28	b 0x00b1cca0
00b1cc2c	ldr x0,[x19]
00b1cc30	bl 0x00c38240
00b1cc34	ldr x0,[x19, #0x8]
00b1cc38	bl 0x00c38030
00b1cc3c	ldr x0,[x19, #0x10]
00b1cc40	bl 0x00c32450
00b1cc44	ldr x0,[x19, #0x20]
00b1cc48	adrp x20,0x2bc000
00b1cc4c	add x20,x20,#0x79f
00b1cc50	mov w2,#0x5d
00b1cc54	mov x1,x20
00b1cc58	bl 0x00c32310
00b1cc5c	mov w2,#0x5e
00b1cc60	mov x0,x19
00b1cc64	mov x1,x20
00b1cc68	bl 0x00c32310
00b1cc6c	bl 0x00c342a0
00b1cc70	adrp x0,0x2bc000
00b1cc74	adrp x2,0x2be000
00b1cc78	add x0,x0,#0x79f
00b1cc7c	add x2,x2,#0x67b
00b1cc80	mov w1,#0x128
00b1cc84	bl 0x00c342b0
00b1cc88	mov w1,#0x100
00b1cc8c	mov w0,#0xb
00b1cc90	movk w1,#0xc, LSL #16
00b1cc94	mov x2,xzr
00b1cc98	bl 0x00c342c0
00b1cc9c	mov x19,xzr
00b1cca0	mov x0,x19
00b1cca4	ldp x29,x30,[sp, #0x20]
00b1cca8	ldp x20,x19,[sp, #0x10]
00b1ccac	ldr x21,[sp], #0x30
00b1ccb0	ret
00b1ccb4	ldr x0,[x19]
00b1ccb8	bl 0x00c38240
00b1ccbc	ldr x0,[x19, #0x8]
00b1ccc0	bl 0x00c38030
00b1ccc4	ldr x0,[x19, #0x10]
00b1ccc8	bl 0x00c32450
00b1cccc	ldr x0,[x19, #0x20]
00b1ccd0	adrp x20,0x2bc000
00b1ccd4	add x20,x20,#0x79f
00b1ccd8	mov w2,#0x5d
00b1ccdc	mov x1,x20
00b1cce0	bl 0x00c32310
00b1cce4	mov w2,#0x5e
00b1cce8	mov x0,x19
00b1ccec	mov x1,x20
00b1ccf0	bl 0x00c32310
00b1ccf4	bl 0x00c35ed0
00b1ccf8	b 0x00b1cc9c
