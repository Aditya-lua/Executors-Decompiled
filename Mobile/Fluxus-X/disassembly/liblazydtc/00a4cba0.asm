; OSSL_DECODER_from_bio @ 00a4cba0
00a4cba0	sub sp,sp,#0x90
00a4cba4	stp x28,x27,[sp, #0x30]
00a4cba8	stp x26,x25,[sp, #0x40]
00a4cbac	stp x24,x23,[sp, #0x50]
00a4cbb0	stp x22,x21,[sp, #0x60]
00a4cbb4	stp x20,x19,[sp, #0x70]
00a4cbb8	stp x29,x30,[sp, #0x80]
00a4cbbc	add x29,sp,#0x80
00a4cbc0	cbz x1,0x00a4cc38
00a4cbc4	mov x20,x0
00a4cbc8	cbz x0,0x00a4cc08
00a4cbcc	ldr x0,[x20, #0x18]
00a4cbd0	cbz x0,0x00a4cc08
00a4cbd4	mov x21,x1
00a4cbd8	bl 0x00c325e0
00a4cbdc	cbz w0,0x00a4cc08
00a4cbe0	bl 0x00c32420
00a4cbe4	mov x22,x0
00a4cbe8	mov w1,#0x85
00a4cbec	mov x0,x21
00a4cbf0	mov x2,xzr
00a4cbf4	mov x3,xzr
00a4cbf8	bl 0x00c321a0
00a4cbfc	tbnz w0,#0x1f,0x00a4cc90
00a4cc00	mov x19,xzr
00a4cc04	b 0x00a4ccac
00a4cc08	bl 0x00c342a0
00a4cc0c	adrp x0,0x2bd000
00a4cc10	adrp x2,0x2c1000
00a4cc14	add x0,x0,#0x9db
00a4cc18	add x2,x2,#0xb99
00a4cc1c	mov w1,#0x3b
00a4cc20	bl 0x00c342b0
00a4cc24	adrp x2,0x2d5000
00a4cc28	add x2,x2,#0xc06
00a4cc2c	orr w0,wzr,#0x3c
00a4cc30	mov w1,#0x66
00a4cc34	b 0x00a4cc64
00a4cc38	bl 0x00c342a0
00a4cc3c	adrp x0,0x2bd000
00a4cc40	adrp x2,0x2c1000
00a4cc44	add x0,x0,#0x9db
00a4cc48	add x2,x2,#0xb99
00a4cc4c	mov w1,#0x36
00a4cc50	bl 0x00c342b0
00a4cc54	mov w1,#0x102
00a4cc58	orr w0,wzr,#0x3c
00a4cc5c	movk w1,#0xc, LSL #16
00a4cc60	mov x2,xzr
00a4cc64	bl 0x00c342c0
00a4cc68	mov w27,wzr
00a4cc6c	mov w0,w27
00a4cc70	ldp x29,x30,[sp, #0x80]
00a4cc74	ldp x20,x19,[sp, #0x70]
00a4cc78	ldp x22,x21,[sp, #0x60]
00a4cc7c	ldp x24,x23,[sp, #0x50]
00a4cc80	ldp x26,x25,[sp, #0x40]
00a4cc84	ldp x28,x27,[sp, #0x30]
00a4cc88	add sp,sp,#0x90
00a4cc8c	ret
00a4cc90	bl 0x00c384a0
00a4cc94	bl 0x00c32240
00a4cc98	cbz x0,0x00a4cc68
00a4cc9c	mov x1,x21
00a4cca0	mov x19,x0
00a4cca4	bl 0x00c35640
00a4cca8	mov x21,x0
00a4ccac	stp x20,x21,[sp, #0x8]
00a4ccb0	add x21,x20,#0x38
00a4ccb4	mov x0,x21
00a4ccb8	stp xzr,xzr,[sp, #0x18]
00a4ccbc	str xzr,[sp, #0x28]
00a4ccc0	bl 0x00c3b4b0
00a4ccc4	add x1,sp,#0x8
00a4ccc8	mov x0,xzr
00a4cccc	bl 0x00a4cdd0
00a4ccd0	ldrb w8,[sp, #0x28]
00a4ccd4	tbnz w8,#0x1,0x00a4cd94
00a4ccd8	ldp x8,x9,[x20]
00a4ccdc	adrp x10,0x2ab000
00a4cce0	adrp x11,0x2d7000
00a4cce4	add x10,x10,#0x32c
00a4cce8	add x11,x11,#0xdd7
00a4ccec	adrp x12,0x2a1000
00a4ccf0	adrp x14,0x2a7000
00a4ccf4	cmp x9,#0x0
00a4ccf8	add x12,x12,#0x9a2
00a4ccfc	adrp x13,0x2bd000
00a4cd00	add x14,x14,#0x15d
00a4cd04	csel x20,x11,x10,ne
00a4cd08	csel x28,x10,x9,eq
00a4cd0c	ccmp x8,#0x0,#0x4,ne
00a4cd10	add x13,x13,#0x9fe
00a4cd14	csel x24,x10,x12,eq
00a4cd18	csel x23,x14,x10,ne
00a4cd1c	cmp x8,#0x0
00a4cd20	csel x26,x13,x10,ne
00a4cd24	csel x25,x10,x8,eq
00a4cd28	bl 0x00c32420
00a4cd2c	cmp x0,x22
00a4cd30	b.eq 0x00a4cd40
00a4cd34	bl 0x00c32410
00a4cd38	mov w27,wzr
00a4cd3c	cbnz x0,0x00a4cd98
00a4cd40	bl 0x00c342a0
00a4cd44	adrp x0,0x2bd000
00a4cd48	adrp x2,0x2c1000
00a4cd4c	add x0,x0,#0x9db
00a4cd50	add x2,x2,#0xb99
00a4cd54	mov w1,#0x65
00a4cd58	bl 0x00c342b0
00a4cd5c	adrp x2,0x2a7000
00a4cd60	mov w1,#0x10c
00a4cd64	add x2,x2,#0xea0
00a4cd68	orr w0,wzr,#0x3c
00a4cd6c	movk w1,#0x8, LSL #16
00a4cd70	mov x3,x24
00a4cd74	mov x4,x26
00a4cd78	mov x5,x25
00a4cd7c	mov x6,x23
00a4cd80	mov x7,x20
00a4cd84	str x28,[sp]
00a4cd88	bl 0x00c342c0
00a4cd8c	mov w27,wzr
00a4cd90	b 0x00a4cd98
00a4cd94	mov w27,w0
00a4cd98	mov x0,x21
00a4cd9c	bl 0x00c3b4a0
00a4cda0	cbz x19,0x00a4cc6c
00a4cda4	mov x0,x19
00a4cda8	bl 0x00c35630
00a4cdac	mov x0,x19
00a4cdb0	bl 0x00c31a40
00a4cdb4	b 0x00a4cc6c
