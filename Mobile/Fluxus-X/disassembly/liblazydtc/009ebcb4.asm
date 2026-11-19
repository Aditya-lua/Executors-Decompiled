; tls_handle_alpn @ 009ebcb4
009ebcb4	sub sp,sp,#0x40
009ebcb8	stp x21,xzr,[sp, #0x10]
009ebcbc	stp x20,x19,[sp, #0x20]
009ebcc0	stp x29,x30,[sp, #0x30]
009ebcc4	strb wzr,[sp, #0xc]
009ebcc8	ldr x9,[x0, #0x9a8]
009ebccc	mov x19,x0
009ebcd0	add x29,sp,#0x30
009ebcd4	ldr x8,[x9, #0x298]
009ebcd8	cbz x8,0x009ebda0
009ebcdc	ldr x3,[x19, #0x498]
009ebce0	cbz x3,0x009ebda0
009ebce4	ldr w4,[x19, #0x4a0]
009ebce8	ldr x5,[x9, #0x2a0]
009ebcec	add x1,sp,#0x18
009ebcf0	add x2,sp,#0xc
009ebcf4	mov x0,x19
009ebcf8	blr x8
009ebcfc	cmp w0,#0x3
009ebd00	b.eq 0x009ebda0
009ebd04	cbnz w0,0x009ebdc8
009ebd08	ldr x0,[x19, #0x488]
009ebd0c	adrp x20,0x2bd000
009ebd10	add x20,x20,#0x74c
009ebd14	mov w2,#0x848
009ebd18	mov x1,x20
009ebd1c	bl 0x00c32310
009ebd20	ldr x0,[sp, #0x18]
009ebd24	ldrb w1,[sp, #0xc]
009ebd28	mov w3,#0x849
009ebd2c	mov x2,x20
009ebd30	bl 0x00c345f0
009ebd34	str x0,[x19, #0x488]
009ebd38	cbz x0,0x009ebdf0
009ebd3c	ldrb w20,[sp, #0xc]
009ebd40	ldr x8,[x19, #0x918]
009ebd44	str wzr,[x19, #0x484]
009ebd48	str x20,[x19, #0x490]
009ebd4c	ldr x21,[x8, #0x358]
009ebd50	cbz x21,0x009ebd74
009ebd54	ldr x8,[x8, #0x360]
009ebd58	cmp x8,x20
009ebd5c	b.ne 0x009ebd74
009ebd60	ldr x0,[sp, #0x18]
009ebd64	mov x1,x21
009ebd68	mov x2,x20
009ebd6c	bl 0x00c300b0
009ebd70	cbz w0,0x009ebdb0
009ebd74	ldr w8,[x19, #0x4d0]
009ebd78	str wzr,[x19, #0xb34]
009ebd7c	cbnz w8,0x009ebdb0
009ebd80	cbz x21,0x009ebe30
009ebd84	bl 0x00c342a0
009ebd88	adrp x0,0x2bd000
009ebd8c	adrp x2,0x2af000
009ebd90	add x0,x0,#0x74c
009ebd94	add x2,x2,#0xc13
009ebd98	mov w1,#0x865
009ebd9c	b 0x009ebe0c
009ebda0	ldr x8,[x19, #0x918]
009ebda4	ldr x8,[x8, #0x358]
009ebda8	cbz x8,0x009ebdb0
009ebdac	str wzr,[x19, #0xb34]
009ebdb0	mov w0,#0x1
009ebdb4	ldp x29,x30,[sp, #0x30]
009ebdb8	ldp x20,x19,[sp, #0x20]
009ebdbc	ldr x21,[sp, #0x10]
009ebdc0	add sp,sp,#0x40
009ebdc4	ret
009ebdc8	bl 0x00c342a0
009ebdcc	adrp x0,0x2bd000
009ebdd0	adrp x2,0x2af000
009ebdd4	add x0,x0,#0x74c
009ebdd8	add x2,x2,#0xc13
009ebddc	mov w1,#0x876
009ebde0	bl 0x00c342b0
009ebde4	orr w1,wzr,#0x78
009ebde8	mov w2,#0xeb
009ebdec	b 0x009ebe1c
009ebdf0	str xzr,[x19, #0x490]
009ebdf4	bl 0x00c342a0
009ebdf8	adrp x0,0x2bd000
009ebdfc	adrp x2,0x2af000
009ebe00	add x0,x0,#0x74c
009ebe04	add x2,x2,#0xc13
009ebe08	mov w1,#0x84c
009ebe0c	bl 0x00c342b0
009ebe10	mov w2,#0x103
009ebe14	mov w1,#0x50
009ebe18	movk w2,#0xc, LSL #16
009ebe1c	mov x0,x19
009ebe20	mov x3,xzr
009ebe24	bl 0x00c34410
009ebe28	mov w0,wzr
009ebe2c	b 0x009ebdb4
009ebe30	ldr x0,[sp, #0x18]
009ebe34	adrp x2,0x2bd000
009ebe38	add x2,x2,#0x74c
009ebe3c	mov w3,#0x869
009ebe40	mov x1,x20
009ebe44	bl 0x00c345f0
009ebe48	ldr x8,[x19, #0x918]
009ebe4c	str x0,[x8, #0x358]
009ebe50	cbz x0,0x009ebe60
009ebe54	ldrb w9,[sp, #0xc]
009ebe58	str x9,[x8, #0x360]
009ebe5c	b 0x009ebdb0
009ebe60	bl 0x00c342a0
009ebe64	adrp x0,0x2bd000
009ebe68	adrp x2,0x2af000
009ebe6c	add x0,x0,#0x74c
009ebe70	add x2,x2,#0xc13
009ebe74	mov w1,#0x86c
009ebe78	b 0x009ebe0c
