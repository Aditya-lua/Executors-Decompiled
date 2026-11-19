; ERR_clear_error @ 00a54194
00a54194	str x23,[sp, #-0x40]!
00a54198	stp x22,x21,[sp, #0x10]
00a5419c	stp x20,x19,[sp, #0x20]
00a541a0	stp x29,x30,[sp, #0x30]
00a541a4	add x29,sp,#0x30
00a541a8	bl 0x00a54260
00a541ac	cbz x0,0x00a5424c
00a541b0	adrp x20,0x2d3000
00a541b4	mov x19,x0
00a541b8	mov x21,xzr
00a541bc	add x22,x0,#0x180
00a541c0	mov w23,#0xffffffff
00a541c4	add x20,x20,#0xaa2
00a541c8	add x8,x19,x21
00a541cc	ldrb w9,[x8, #0x200]
00a541d0	tbnz w9,#0x0,0x00a541e4
00a541d4	mov w9,wzr
00a541d8	stur xzr,[x22, #-0x80]
00a541dc	str xzr,[x22]
00a541e0	b 0x00a541f4
00a541e4	ldur x9,[x22, #-0x80]
00a541e8	cbz x9,0x00a541f8
00a541ec	strb wzr,[x9]
00a541f0	mov w9,#0x1
00a541f4	str w9,[x8, #0x200]
00a541f8	add x8,x19,x21
00a541fc	str wzr,[x8, #0x40]
00a54200	str wzr,[x8]
00a54204	stur xzr,[x22, #-0x100]
00a54208	str w23,[x8, #0x2c0]
00a5420c	ldr x0,[x22, #0xc0]
00a54210	mov w2,#0x56
00a54214	mov x1,x20
00a54218	bl 0x00c32310
00a5421c	ldr x0,[x22, #0x180]
00a54220	mov w2,#0x58
00a54224	mov x1,x20
00a54228	str xzr,[x22, #0xc0]
00a5422c	bl 0x00c32310
00a54230	add x21,x21,#0x4
00a54234	str xzr,[x22, #0x180]
00a54238	cmp x21,#0x40
00a5423c	add x22,x22,#0x8
00a54240	b.ne 0x00a541c8
00a54244	movi d0,#0x0
00a54248	str d0,[x19, #0x380]
00a5424c	ldp x29,x30,[sp, #0x30]
00a54250	ldp x20,x19,[sp, #0x20]
00a54254	ldp x22,x21,[sp, #0x10]
00a54258	ldr x23,[sp], #0x40
00a5425c	ret
