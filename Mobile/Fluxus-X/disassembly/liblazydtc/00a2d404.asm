; BN_GF2m_mod_exp @ 00a2d404
00a2d404	str x27,[sp, #-0x60]!
00a2d408	stp x24,x23,[sp, #0x20]
00a2d40c	mov x24,x0
00a2d410	mov x0,x3
00a2d414	stp x26,x25,[sp, #0x10]
00a2d418	stp x22,x21,[sp, #0x30]
00a2d41c	stp x20,x19,[sp, #0x40]
00a2d420	stp x29,x30,[sp, #0x50]
00a2d424	add x29,sp,#0x50
00a2d428	mov x20,x4
00a2d42c	mov x26,x3
00a2d430	mov x22,x2
00a2d434	mov x23,x1
00a2d438	bl 0x00c322f0
00a2d43c	add w27,w0,#0x1
00a2d440	adrp x1,0x2d9000
00a2d444	mov w25,w0
00a2d448	sbfiz x0,x27,#0x2,#0x20
00a2d44c	add x1,x1,#0xb49
00a2d450	mov w2,#0x39b
00a2d454	bl 0x00c32320
00a2d458	cbz x0,0x00a2d4b4
00a2d45c	mov x19,x0
00a2d460	mov x0,x26
00a2d464	bl 0x00c369b0
00a2d468	mov w21,wzr
00a2d46c	cbz w0,0x00a2d508
00a2d470	bl 0x00c342a0
00a2d474	adrp x0,0x2d9000
00a2d478	adrp x2,0x2a0000
00a2d47c	add x0,x0,#0xb49
00a2d480	add x2,x2,#0xa6
00a2d484	mov w1,#0x3a2
00a2d488	bl 0x00c342b0
00a2d48c	orr w0,wzr,#0x3
00a2d490	mov w1,#0x6a
00a2d494	mov x2,xzr
00a2d498	bl 0x00c342c0
00a2d49c	adrp x1,0x2d9000
00a2d4a0	add x1,x1,#0xb49
00a2d4a4	mov w2,#0x3a8
00a2d4a8	mov x0,x19
00a2d4ac	bl 0x00c32310
00a2d4b0	b 0x00a2d4e8
00a2d4b4	bl 0x00c342a0
00a2d4b8	adrp x0,0x2d9000
00a2d4bc	adrp x2,0x2a0000
00a2d4c0	add x0,x0,#0xb49
00a2d4c4	add x2,x2,#0xa6
00a2d4c8	mov w1,#0x39d
00a2d4cc	bl 0x00c342b0
00a2d4d0	mov w1,#0x100
00a2d4d4	orr w0,wzr,#0x3
00a2d4d8	movk w1,#0xc, LSL #16
00a2d4dc	mov x2,xzr
00a2d4e0	bl 0x00c342c0
00a2d4e4	mov w21,wzr
00a2d4e8	mov w0,w21
00a2d4ec	ldp x29,x30,[sp, #0x50]
00a2d4f0	ldp x20,x19,[sp, #0x40]
00a2d4f4	ldp x22,x21,[sp, #0x30]
00a2d4f8	ldp x24,x23,[sp, #0x20]
00a2d4fc	ldp x26,x25,[sp, #0x10]
00a2d500	ldr x27,[sp], #0x60
00a2d504	ret
00a2d508	ldrsw x8,[x26, #0x8]
00a2d50c	cmp w8,#0x1
00a2d510	b.lt 0x00a2d5b0
00a2d514	ldr x9,[x26]
00a2d518	mov w21,wzr
00a2d51c	lsl w10,w8,#0x6
00a2d520	sub x11,x8,#0x1
00a2d524	ldr x12,[x9, x11, LSL #0x3]
00a2d528	cbz x12,0x00a2d560
00a2d52c	orr x13,xzr,#-0x8000000000000000
00a2d530	mov w14,#0xffffffff
00a2d534	tst x13,x12
00a2d538	b.eq 0x00a2d550
00a2d53c	cmp w21,w25
00a2d540	b.gt 0x00a2d54c
00a2d544	add w15,w10,w14
00a2d548	str w15,[x19, w21, SXTW #0x2]
00a2d54c	add w21,w21,#0x1
00a2d550	sub w14,w14,#0x1
00a2d554	cmn w14,#0x41
00a2d558	lsr x13,x13,#0x1
00a2d55c	b.ne 0x00a2d534
00a2d560	cmp x8,#0x1
00a2d564	sub w10,w10,#0x40
00a2d568	mov x8,x11
00a2d56c	b.gt 0x00a2d520
00a2d570	cmp w21,w25
00a2d574	b.gt 0x00a2d584
00a2d578	mov w8,#0xffffffff
00a2d57c	str w8,[x19, w21, SXTW #0x2]
00a2d580	add w21,w21,#0x1
00a2d584	cbz w21,0x00a2d470
00a2d588	cmp w21,w27
00a2d58c	b.gt 0x00a2d470
00a2d590	mov x0,x24
00a2d594	mov x1,x23
00a2d598	mov x2,x22
00a2d59c	mov x3,x19
00a2d5a0	mov x4,x20
00a2d5a4	bl 0x00a2d2bc
00a2d5a8	mov w21,w0
00a2d5ac	b 0x00a2d49c
00a2d5b0	mov w21,wzr
00a2d5b4	cmp w21,w25
00a2d5b8	b.le 0x00a2d578
00a2d5bc	b 0x00a2d584
