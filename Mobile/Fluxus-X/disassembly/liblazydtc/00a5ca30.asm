; EVP_CIPHER_CTX_copy @ 00a5ca30
00a5ca30	stp x20,x19,[sp, #-0x20]!
00a5ca34	stp x29,x30,[sp, #0x10]
00a5ca38	add x29,sp,#0x10
00a5ca3c	cbz x1,0x00a5cad4
00a5ca40	ldr x8,[x1]
00a5ca44	mov x20,x1
00a5ca48	cbz x8,0x00a5cad4
00a5ca4c	ldr x9,[x8, #0x78]
00a5ca50	mov x19,x0
00a5ca54	cbz x9,0x00a5cb10
00a5ca58	ldr x8,[x8, #0xc8]
00a5ca5c	cbz x8,0x00a5cba4
00a5ca60	mov x0,x19
00a5ca64	bl 0x00a5a430
00a5ca68	mov w2,#0xb8
00a5ca6c	mov x0,x19
00a5ca70	mov x1,x20
00a5ca74	bl 0x00c2ffd0
00a5ca78	str xzr,[x19, #0xa8]
00a5ca7c	ldr x8,[x20, #0xb0]
00a5ca80	cbz x8,0x00a5caa0
00a5ca84	ldr w9,[x8, #0x18]
00a5ca88	cbnz w9,0x00a5caa0
00a5ca8c	add x8,x8,#0x80
00a5ca90	ldxr w9,[x8]
00a5ca94	add w9,w9,#0x1
00a5ca98	stxr w10,w9,[x8]
00a5ca9c	cbnz w10,0x00a5ca90
00a5caa0	ldr x8,[x20]
00a5caa4	ldr x0,[x20, #0xa8]
00a5caa8	ldr x8,[x8, #0xc8]
00a5caac	blr x8
00a5cab0	str x0,[x19, #0xa8]
00a5cab4	cbnz x0,0x00a5cb9c
00a5cab8	bl 0x00c342a0
00a5cabc	adrp x0,0x2a5000
00a5cac0	adrp x2,0x2cd000
00a5cac4	add x0,x0,#0xf9d
00a5cac8	add x2,x2,#0xa6b
00a5cacc	mov w1,#0x59c
00a5cad0	b 0x00a5cbbc
00a5cad4	bl 0x00c342a0
00a5cad8	adrp x0,0x2a5000
00a5cadc	adrp x2,0x2cd000
00a5cae0	add x0,x0,#0xf9d
00a5cae4	add x2,x2,#0xa6b
00a5cae8	mov w1,#0x584
00a5caec	bl 0x00c342b0
00a5caf0	orr w0,wzr,#0x6
00a5caf4	mov w1,#0x6f
00a5caf8	mov x2,xzr
00a5cafc	bl 0x00c342c0
00a5cb00	mov w0,wzr
00a5cb04	ldp x29,x30,[sp, #0x10]
00a5cb08	ldp x20,x19,[sp], #0x20
00a5cb0c	ret
00a5cb10	ldr x0,[x20, #0x8]
00a5cb14	cbz x0,0x00a5cb20
00a5cb18	bl 0x00c323b0
00a5cb1c	cbz w0,0x00a5cbcc
00a5cb20	mov x0,x19
00a5cb24	bl 0x00a5a430
00a5cb28	mov w2,#0xb8
00a5cb2c	mov x0,x19
00a5cb30	mov x1,x20
00a5cb34	bl 0x00c2ffd0
00a5cb38	ldr x8,[x20, #0x78]
00a5cb3c	cbz x8,0x00a5cb74
00a5cb40	ldr x8,[x20]
00a5cb44	ldrsw x0,[x8, #0x38]
00a5cb48	cbz w0,0x00a5cb74
00a5cb4c	adrp x1,0x2a5000
00a5cb50	add x1,x1,#0xf9d
00a5cb54	mov w2,#0x5b1
00a5cb58	bl 0x00c32320
00a5cb5c	str x0,[x19, #0x78]
00a5cb60	cbz x0,0x00a5cbf8
00a5cb64	ldr x8,[x20]
00a5cb68	ldr x1,[x20, #0x78]
00a5cb6c	ldrsw x2,[x8, #0x38]
00a5cb70	bl 0x00c2ffd0
00a5cb74	ldr x8,[x20]
00a5cb78	ldrb w9,[x8, #0x11]
00a5cb7c	tbz w9,#0x2,0x00a5cb9c
00a5cb80	ldr x8,[x8, #0x50]
00a5cb84	mov w1,#0x8
00a5cb88	mov x0,x20
00a5cb8c	mov w2,wzr
00a5cb90	mov x3,x19
00a5cb94	blr x8
00a5cb98	cbz w0,0x00a5cc28
00a5cb9c	mov w0,#0x1
00a5cba0	b 0x00a5cb04
00a5cba4	bl 0x00c342a0
00a5cba8	adrp x0,0x2a5000
00a5cbac	adrp x2,0x2cd000
00a5cbb0	add x0,x0,#0xf9d
00a5cbb4	add x2,x2,#0xa6b
00a5cbb8	mov w1,#0x58c
00a5cbbc	bl 0x00c342b0
00a5cbc0	orr w0,wzr,#0x6
00a5cbc4	mov w1,#0xbe
00a5cbc8	b 0x00a5caf8
00a5cbcc	bl 0x00c342a0
00a5cbd0	adrp x0,0x2a5000
00a5cbd4	adrp x2,0x2cd000
00a5cbd8	add x0,x0,#0xf9d
00a5cbdc	add x2,x2,#0xa6b
00a5cbe0	mov w1,#0x5a8
00a5cbe4	bl 0x00c342b0
00a5cbe8	mov w1,#0x26
00a5cbec	orr w0,wzr,#0x6
00a5cbf0	movk w1,#0x8, LSL #16
00a5cbf4	b 0x00a5caf8
00a5cbf8	str xzr,[x19]
00a5cbfc	bl 0x00c342a0
00a5cc00	adrp x0,0x2a5000
00a5cc04	adrp x2,0x2cd000
00a5cc08	add x0,x0,#0xf9d
00a5cc0c	add x2,x2,#0xa6b
00a5cc10	mov w1,#0x5b4
00a5cc14	bl 0x00c342b0
00a5cc18	mov w1,#0x100
00a5cc1c	orr w0,wzr,#0x6
00a5cc20	movk w1,#0xc, LSL #16
00a5cc24	b 0x00a5caf8
00a5cc28	str xzr,[x19]
00a5cc2c	bl 0x00c342a0
00a5cc30	adrp x0,0x2a5000
00a5cc34	adrp x2,0x2cd000
00a5cc38	add x0,x0,#0xf9d
00a5cc3c	add x2,x2,#0xa6b
00a5cc40	mov w1,#0x5bd
00a5cc44	bl 0x00c342b0
00a5cc48	orr w0,wzr,#0x6
00a5cc4c	mov w1,#0x86
00a5cc50	b 0x00a5caf8
