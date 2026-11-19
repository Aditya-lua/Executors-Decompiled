; BIO_new_ex @ 009fbcb8
009fbcb8	str x21,[sp, #-0x30]!
009fbcbc	mov x21,x1
009fbcc0	adrp x1,0x2b2000
009fbcc4	stp x20,x19,[sp, #0x10]
009fbcc8	mov x20,x0
009fbccc	add x1,x1,#0x42
009fbcd0	mov w0,#0x88
009fbcd4	mov w2,#0x53
009fbcd8	stp x29,x30,[sp, #0x20]
009fbcdc	add x29,sp,#0x20
009fbce0	bl 0x00c34250
009fbce4	mov x19,x0
009fbce8	cbz x0,0x009fbd4c
009fbcec	stp x20,x21,[x19]
009fbcf0	add x20,x19,#0x70
009fbcf4	mov w8,#0x1
009fbcf8	add x9,x19,#0x58
009fbcfc	orr w0,wzr,#0xc
009fbd00	mov x1,x19
009fbd04	mov x2,x20
009fbd08	str w8,[x19, #0x2c]
009fbd0c	stlr w8,[x9]
009fbd10	bl 0x00c356e0
009fbd14	cbz w0,0x009fbe10
009fbd18	bl 0x00c34d50
009fbd1c	str x0,[x19, #0x80]
009fbd20	cbz x0,0x009fbd80
009fbd24	ldr x8,[x21, #0x48]
009fbd28	cbz x8,0x009fbd40
009fbd2c	mov x0,x19
009fbd30	blr x8
009fbd34	cbz w0,0x009fbdc4
009fbd38	ldr x8,[x21, #0x48]
009fbd3c	cbnz x8,0x009fbe28
009fbd40	mov w8,#0x1
009fbd44	str w8,[x19, #0x28]
009fbd48	b 0x009fbe28
009fbd4c	bl 0x00c342a0
009fbd50	adrp x0,0x2b2000
009fbd54	adrp x2,0x2af000
009fbd58	add x0,x0,#0x42
009fbd5c	add x2,x2,#0xd12
009fbd60	mov w1,#0x56
009fbd64	bl 0x00c342b0
009fbd68	mov w1,#0x100
009fbd6c	mov w0,#0x20
009fbd70	movk w1,#0xc, LSL #16
009fbd74	mov x2,xzr
009fbd78	bl 0x00c342c0
009fbd7c	b 0x009fbe28
009fbd80	bl 0x00c342a0
009fbd84	adrp x0,0x2b2000
009fbd88	adrp x2,0x2af000
009fbd8c	add x0,x0,#0x42
009fbd90	add x2,x2,#0xd12
009fbd94	mov w1,#0x64
009fbd98	bl 0x00c342b0
009fbd9c	mov w1,#0x100
009fbda0	mov w0,#0x20
009fbda4	movk w1,#0xc, LSL #16
009fbda8	mov x2,xzr
009fbdac	bl 0x00c342c0
009fbdb0	orr w0,wzr,#0xc
009fbdb4	mov x1,x19
009fbdb8	mov x2,x20
009fbdbc	bl 0x00c356c0
009fbdc0	b 0x009fbe10
009fbdc4	bl 0x00c342a0
009fbdc8	adrp x0,0x2b2000
009fbdcc	adrp x2,0x2af000
009fbdd0	add x0,x0,#0x42
009fbdd4	add x2,x2,#0xd12
009fbdd8	mov w1,#0x6a
009fbddc	bl 0x00c342b0
009fbde0	mov w8,#0x100
009fbde4	movk w8,#0xc, LSL #16
009fbde8	add w1,w8,#0x5
009fbdec	mov w0,#0x20
009fbdf0	mov x2,xzr
009fbdf4	bl 0x00c342c0
009fbdf8	orr w0,wzr,#0xc
009fbdfc	mov x1,x19
009fbe00	mov x2,x20
009fbe04	bl 0x00c356c0
009fbe08	ldr x0,[x19, #0x80]
009fbe0c	bl 0x00c34d40
009fbe10	adrp x1,0x2b2000
009fbe14	add x1,x1,#0x42
009fbe18	mov w2,#0x75
009fbe1c	mov x0,x19
009fbe20	bl 0x00c32310
009fbe24	mov x19,xzr
009fbe28	mov x0,x19
009fbe2c	ldp x29,x30,[sp, #0x20]
009fbe30	ldp x20,x19,[sp, #0x10]
009fbe34	ldr x21,[sp], #0x30
009fbe38	ret
