; i2d_PUBKEY @ 00b1d40c
00b1d40c	str x23,[sp, #-0x40]!
00b1d410	stp x22,x21,[sp, #0x10]
00b1d414	mov x21,x0
00b1d418	stp x20,x19,[sp, #0x20]
00b1d41c	stp x29,x30,[sp, #0x30]
00b1d420	add x29,sp,#0x30
00b1d424	cbz x0,0x00b1d56c
00b1d428	ldr x8,[x21, #0x8]
00b1d42c	mov x19,x1
00b1d430	cbz x8,0x00b1d488
00b1d434	adrp x0,0xc82000
00b1d438	add x0,x0,#0x640
00b1d43c	bl 0x00c372e0
00b1d440	cbz x0,0x00b1d538
00b1d444	ldr x8,[x21, #0x8]
00b1d448	mov x20,x0
00b1d44c	ldr x8,[x8, #0x28]
00b1d450	cbz x8,0x00b1d540
00b1d454	mov x0,x20
00b1d458	mov x1,x21
00b1d45c	blr x8
00b1d460	cbz w0,0x00b1d540
00b1d464	adrp x2,0xc82000
00b1d468	add x2,x2,#0x640
00b1d46c	mov x0,x20
00b1d470	mov x1,x19
00b1d474	str x21,[x20, #0x10]
00b1d478	bl 0x00c36170
00b1d47c	mov w21,w0
00b1d480	str xzr,[x20, #0x10]
00b1d484	b 0x00b1d544
00b1d488	ldr x8,[x21, #0x60]
00b1d48c	cbz x8,0x00b1d538
00b1d490	adrp x2,0x2b7000
00b1d494	adrp x3,0x2a2000
00b1d498	add x2,x2,#0x291
00b1d49c	add x3,x3,#0xb58
00b1d4a0	mov w1,#0x86
00b1d4a4	mov x0,x21
00b1d4a8	mov x4,xzr
00b1d4ac	bl 0x00c3b960
00b1d4b0	mov x20,x0
00b1d4b4	bl 0x00c32280
00b1d4b8	bl 0x00c32240
00b1d4bc	mov x22,x0
00b1d4c0	mov x0,x20
00b1d4c4	str xzr,[sp, #0x8]
00b1d4c8	bl 0x00c3b7d0
00b1d4cc	mov w21,#0xffffffff
00b1d4d0	cbz x22,0x00b1d55c
00b1d4d4	cbz w0,0x00b1d55c
00b1d4d8	mov x0,x20
00b1d4dc	mov x1,x22
00b1d4e0	bl 0x00c3b860
00b1d4e4	cbz w0,0x00b1d558
00b1d4e8	mov w1,#0x73
00b1d4ec	add x3,sp,#0x8
00b1d4f0	mov x0,x22
00b1d4f4	mov x2,xzr
00b1d4f8	bl 0x00c321a0
00b1d4fc	cmp x0,#0x1
00b1d500	b.lt 0x00b1d558
00b1d504	ldr x8,[sp, #0x8]
00b1d508	ldr x21,[x8]
00b1d50c	cbz x19,0x00b1d55c
00b1d510	ldr x0,[x19]
00b1d514	cbz x0,0x00b1d584
00b1d518	ldr x1,[x8, #0x8]
00b1d51c	sxtw x23,w21
00b1d520	mov x2,x23
00b1d524	bl 0x00c2ffd0
00b1d528	ldr x8,[x19]
00b1d52c	add x8,x8,x23
00b1d530	str x8,[x19]
00b1d534	b 0x00b1d55c
00b1d538	mov w21,#0xffffffff
00b1d53c	b 0x00b1d56c
00b1d540	mov w21,#0xffffffff
00b1d544	adrp x1,0xc82000
00b1d548	add x1,x1,#0x640
00b1d54c	mov x0,x20
00b1d550	bl 0x00c36160
00b1d554	b 0x00b1d56c
00b1d558	mov w21,#0xffffffff
00b1d55c	mov x0,x22
00b1d560	bl 0x00c31a40
00b1d564	mov x0,x20
00b1d568	bl 0x00c3b890
00b1d56c	mov w0,w21
00b1d570	ldp x29,x30,[sp, #0x30]
00b1d574	ldp x20,x19,[sp, #0x20]
00b1d578	ldp x22,x21,[sp, #0x10]
00b1d57c	ldr x23,[sp], #0x40
00b1d580	ret
00b1d584	ldr x9,[x8, #0x8]
00b1d588	str x9,[x19]
00b1d58c	stp xzr,xzr,[x8]
00b1d590	b 0x00b1d55c
