; ssl_generate_param_group @ 009aa118
009aa118	str x21,[sp, #-0x30]!
009aa11c	stp x20,x19,[sp, #0x10]
009aa120	stp x29,x30,[sp, #0x20]
009aa124	str xzr,[sp, #0x8]
009aa128	mov x20,x0
009aa12c	ldr x0,[x0, #0x9a8]
009aa130	add x29,sp,#0x20
009aa134	bl 0x00c34ae0
009aa138	cbz x0,0x009aa1a4
009aa13c	ldr x8,[x20, #0x9a8]
009aa140	mov x21,x0
009aa144	ldr x1,[x0, #0x10]
009aa148	ldr x0,[x8]
009aa14c	ldr x2,[x8, #0x440]
009aa150	bl 0x00c34630
009aa154	mov x19,x0
009aa158	cbz x0,0x009aa1a8
009aa15c	mov x0,x19
009aa160	bl 0x00c34720
009aa164	cmp w0,#0x1
009aa168	b.lt 0x009aa1a8
009aa16c	ldr x1,[x21, #0x8]
009aa170	mov x0,x19
009aa174	bl 0x00c34660
009aa178	cmp w0,#0x0
009aa17c	b.le 0x009aa1c4
009aa180	add x1,sp,#0x8
009aa184	mov x0,x19
009aa188	bl 0x00c34710
009aa18c	cmp w0,#0x0
009aa190	b.gt 0x009aa1a8
009aa194	ldr x0,[sp, #0x8]
009aa198	bl 0x00c32450
009aa19c	str xzr,[sp, #0x8]
009aa1a0	b 0x009aa1a8
009aa1a4	mov x19,xzr
009aa1a8	mov x0,x19
009aa1ac	bl 0x00c34620
009aa1b0	ldr x0,[sp, #0x8]
009aa1b4	ldp x29,x30,[sp, #0x20]
009aa1b8	ldp x20,x19,[sp, #0x10]
009aa1bc	ldr x21,[sp], #0x30
009aa1c0	ret
009aa1c4	bl 0x00c342a0
009aa1c8	adrp x0,0x2a3000
009aa1cc	adrp x2,0x2af000
009aa1d0	add x0,x0,#0xa43
009aa1d4	add x2,x2,#0x823
009aa1d8	mov w1,#0x1290
009aa1dc	bl 0x00c342b0
009aa1e0	mov w2,#0x6
009aa1e4	mov w1,#0x50
009aa1e8	movk w2,#0x8, LSL #16
009aa1ec	mov x0,x20
009aa1f0	mov x3,xzr
009aa1f4	bl 0x00c34410
009aa1f8	b 0x009aa1a8
