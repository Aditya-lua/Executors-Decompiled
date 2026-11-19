; ssl_cert_clear_certs @ 009ac474
009ac474	str x23,[sp, #-0x40]!
009ac478	stp x22,x21,[sp, #0x10]
009ac47c	stp x20,x19,[sp, #0x20]
009ac480	stp x29,x30,[sp, #0x30]
009ac484	add x29,sp,#0x30
009ac488	cbz x0,0x009ac4f0
009ac48c	adrp x20,0xcb4000
009ac490	ldr x20,[x20, #0xd88]
009ac494	adrp x21,0x2d5000
009ac498	mov x19,x0
009ac49c	mov x22,xzr
009ac4a0	add x21,x21,#0x6b3
009ac4a4	add x23,x19,x22
009ac4a8	ldr x0,[x23, #0x20]
009ac4ac	bl 0x00c31a90
009ac4b0	ldr x0,[x23, #0x28]
009ac4b4	str xzr,[x23, #0x20]
009ac4b8	bl 0x00c32450
009ac4bc	ldr x0,[x23, #0x30]
009ac4c0	mov x1,x20
009ac4c4	str xzr,[x23, #0x28]
009ac4c8	bl 0x00c32600
009ac4cc	ldr x0,[x23, #0x38]
009ac4d0	mov w2,#0xe3
009ac4d4	mov x1,x21
009ac4d8	str xzr,[x23, #0x30]
009ac4dc	bl 0x00c32310
009ac4e0	add x22,x22,#0x28
009ac4e4	cmp x22,#0x168
009ac4e8	stp xzr,xzr,[x23, #0x38]
009ac4ec	b.ne 0x009ac4a4
009ac4f0	ldp x29,x30,[sp, #0x30]
009ac4f4	ldp x20,x19,[sp, #0x20]
009ac4f8	ldp x22,x21,[sp, #0x10]
009ac4fc	ldr x23,[sp], #0x40
009ac500	ret
