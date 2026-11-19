; ossl_d2i_X448_PUBKEY @ 00b1e038
00b1e038	sub sp,sp,#0x40
00b1e03c	stp x22,x21,[sp, #0x10]
00b1e040	stp x20,x19,[sp, #0x20]
00b1e044	stp x29,x30,[sp, #0x30]
00b1e048	ldr x8,[x1]
00b1e04c	mov x20,x1
00b1e050	mov x19,x0
00b1e054	add x1,sp,#0x8
00b1e058	mov w5,#0x1
00b1e05c	mov x0,xzr
00b1e060	mov x3,xzr
00b1e064	mov x4,xzr
00b1e068	add x29,sp,#0x30
00b1e06c	str x8,[sp, #0x8]
00b1e070	bl 0x00b1d214
00b1e074	cbz x0,0x00b1e0c4
00b1e078	mov x22,x0
00b1e07c	bl 0x00c324b0
00b1e080	cmp w0,#0x40b
00b1e084	b.ne 0x00b1e0bc
00b1e088	mov x0,x22
00b1e08c	bl 0x00c3da10
00b1e090	mov x21,x0
00b1e094	mov x0,x22
00b1e098	bl 0x00c32450
00b1e09c	cbz x21,0x00b1e0c8
00b1e0a0	ldr x8,[sp, #0x8]
00b1e0a4	str x8,[x20]
00b1e0a8	cbz x19,0x00b1e0c8
00b1e0ac	ldr x0,[x19]
00b1e0b0	bl 0x00c3b270
00b1e0b4	str x21,[x19]
00b1e0b8	b 0x00b1e0c8
00b1e0bc	mov x0,x22
00b1e0c0	bl 0x00c32450
00b1e0c4	mov x21,xzr
00b1e0c8	mov x0,x21
00b1e0cc	ldp x29,x30,[sp, #0x30]
00b1e0d0	ldp x20,x19,[sp, #0x20]
00b1e0d4	ldp x22,x21,[sp, #0x10]
00b1e0d8	add sp,sp,#0x40
00b1e0dc	ret
