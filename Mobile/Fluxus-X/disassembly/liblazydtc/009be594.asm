; SSL_set_session @ 009be594
009be594	stp x20,x19,[sp, #-0x20]!
009be598	stp x29,x30,[sp, #0x10]
009be59c	ldr x8,[x0, #0x918]
009be5a0	mov x19,x0
009be5a4	mov x20,x1
009be5a8	add x29,sp,#0x10
009be5ac	cbz x8,0x009be5e0
009be5b0	ldrb w8,[x19, #0x44]
009be5b4	tbnz w8,#0x0,0x009be5e0
009be5b8	mov x0,x19
009be5bc	bl 0x00c344e0
009be5c0	cbnz w0,0x009be5e0
009be5c4	mov x0,x19
009be5c8	bl 0x00c347f0
009be5cc	cbnz w0,0x009be5e0
009be5d0	ldr x0,[x19, #0xb88]
009be5d4	ldr x1,[x19, #0x918]
009be5d8	mov w2,#0x1
009be5dc	bl 0x009be2fc
009be5e0	ldr x8,[x19, #0x9a8]
009be5e4	ldr x1,[x8, #0x8]
009be5e8	ldr x8,[x19, #0x8]
009be5ec	cmp x1,x8
009be5f0	b.eq 0x009be600
009be5f4	mov x0,x19
009be5f8	bl 0x00c35ae0
009be5fc	cbz w0,0x009be630
009be600	cbz x20,0x009be620
009be604	add x8,x20,#0x2d0
009be608	ldxr w9,[x8]
009be60c	add w9,w9,#0x1
009be610	stxr w10,w9,[x8]
009be614	cbnz w10,0x009be608
009be618	ldr x8,[x20, #0x2c8]
009be61c	str x8,[x19, #0x9b8]
009be620	ldr x0,[x19, #0x918]
009be624	bl 0x009bdb1c
009be628	mov w0,#0x1
009be62c	str x20,[x19, #0x918]
009be630	ldp x29,x30,[sp, #0x10]
009be634	ldp x20,x19,[sp], #0x20
009be638	ret
