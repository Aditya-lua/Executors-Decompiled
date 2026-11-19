; FUN_00a54388 @ 00a54388
00a54388	str x23,[sp, #-0x40]!
00a5438c	stp x22,x21,[sp, #0x10]
00a54390	stp x20,x19,[sp, #0x20]
00a54394	stp x29,x30,[sp, #0x30]
00a54398	add x21,x0,x1, LSL #0x2
00a5439c	ldrb w8,[x21, #0x200]
00a543a0	mov x19,x1
00a543a4	mov x20,x0
00a543a8	add x29,sp,#0x30
00a543ac	tbnz w8,#0x0,0x00a543c4
00a543b0	mov w8,wzr
00a543b4	add x9,x20,x19, LSL #0x3
00a543b8	str xzr,[x9, #0x100]
00a543bc	str xzr,[x9, #0x180]
00a543c0	b 0x00a54400
00a543c4	add x22,x20,x19, LSL #0x3
00a543c8	ldr x0,[x22, #0x100]
00a543cc	cbz w2,0x00a543f4
00a543d0	adrp x1,0x2d3000
00a543d4	add x1,x1,#0xaa2
00a543d8	orr w2,wzr,#0x18
00a543dc	add x23,x22,#0x100
00a543e0	bl 0x00c32310
00a543e4	mov w8,wzr
00a543e8	str xzr,[x23]
00a543ec	str xzr,[x22, #0x180]
00a543f0	b 0x00a54400
00a543f4	cbz x0,0x00a54408
00a543f8	strb wzr,[x0]
00a543fc	mov w8,#0x1
00a54400	add x9,x21,#0x200
00a54404	str w8,[x9]
00a54408	add x8,x20,x19, LSL #0x2
00a5440c	add x20,x20,x19, LSL #0x3
00a54410	mov w9,#0xffffffff
00a54414	str wzr,[x8, #0x40]
00a54418	str wzr,[x8]
00a5441c	str xzr,[x20, #0x80]
00a54420	str w9,[x8, #0x2c0]
00a54424	ldr x0,[x20, #0x240]
00a54428	adrp x19,0x2d3000
00a5442c	add x19,x19,#0xaa2
00a54430	mov w2,#0x56
00a54434	mov x1,x19
00a54438	bl 0x00c32310
00a5443c	ldr x0,[x20, #0x300]
00a54440	mov w2,#0x58
00a54444	mov x1,x19
00a54448	str xzr,[x20, #0x240]
00a5444c	bl 0x00c32310
00a54450	str xzr,[x20, #0x300]
00a54454	ldp x29,x30,[sp, #0x30]
00a54458	ldp x20,x19,[sp, #0x20]
00a5445c	ldp x22,x21,[sp, #0x10]
00a54460	ldr x23,[sp], #0x40
00a54464	ret
