; FUN_00a5d3a4 @ 00a5d3a4
00a5d3a4	sub sp,sp,#0xb0
00a5d3a8	stp x28,x27,[sp, #0x50]
00a5d3ac	stp x26,x25,[sp, #0x60]
00a5d3b0	stp x24,x23,[sp, #0x70]
00a5d3b4	stp x22,x21,[sp, #0x80]
00a5d3b8	stp x20,x19,[sp, #0x90]
00a5d3bc	stp x29,x30,[sp, #0xa0]
00a5d3c0	str x1,[sp, #0x48]
00a5d3c4	mov x21,x0
00a5d3c8	ldr x0,[x0]
00a5d3cc	mov w25,w2
00a5d3d0	adrp x2,0xc5d000
00a5d3d4	mov x24,x1
00a5d3d8	add x2,x2,#0x6b8
00a5d3dc	mov w1,wzr
00a5d3e0	add x29,sp,#0xa0
00a5d3e4	mov x20,x7
00a5d3e8	mov x28,x6
00a5d3ec	mov x19,x5
00a5d3f0	mov x27,x4
00a5d3f4	mov w22,w3
00a5d3f8	bl 0x00c3b520
00a5d3fc	ldr x8,[x21]
00a5d400	mov x26,x0
00a5d404	mov x0,x8
00a5d408	bl 0x00c3b650
00a5d40c	adrp x8,0x2ab000
00a5d410	add x8,x8,#0x32c
00a5d414	cmp x19,#0x0
00a5d418	csel x10,x8,x19,eq
00a5d41c	str xzr,[sp, #0x40]
00a5d420	cbz x26,0x00a5d45c
00a5d424	mov x23,x0
00a5d428	cbz x0,0x00a5d45c
00a5d42c	cmp w25,#0x0
00a5d430	b.le 0x00a5d48c
00a5d434	mov x1,x27
00a5d438	cbz w22,0x00a5d4a8
00a5d43c	cbz x1,0x00a5d4a8
00a5d440	bl 0x00c342a0
00a5d444	adrp x0,0x29e000
00a5d448	adrp x2,0x2d3000
00a5d44c	add x0,x0,#0x17d
00a5d450	add x2,x2,#0xb24
00a5d454	mov w1,#0x128
00a5d458	b 0x00a5d6b4
00a5d45c	bl 0x00c342a0
00a5d460	adrp x0,0x29e000
00a5d464	adrp x2,0x2d3000
00a5d468	add x0,x0,#0x17d
00a5d46c	add x2,x2,#0xb24
00a5d470	mov w1,#0x116
00a5d474	bl 0x00c342b0
00a5d478	mov w8,#0x10d
00a5d47c	movk w8,#0x8, LSL #16
00a5d480	sub w1,w8,#0x7
00a5d484	orr w0,wzr,#0x6
00a5d488	b 0x00a5d6c4
00a5d48c	bl 0x00c342a0
00a5d490	adrp x0,0x29e000
00a5d494	adrp x2,0x2d3000
00a5d498	add x0,x0,#0x17d
00a5d49c	add x2,x2,#0xb24
00a5d4a0	mov w1,#0x11f
00a5d4a4	b 0x00a5d6b4
00a5d4a8	cbnz w22,0x00a5d4c8
00a5d4ac	cbz x1,0x00a5d4c8
00a5d4b0	mov x0,x23
00a5d4b4	mov x22,x10
00a5d4b8	bl 0x00c3b620
00a5d4bc	mov x10,x22
00a5d4c0	mov x1,x27
00a5d4c4	mov w22,w0
00a5d4c8	cbz w22,0x00a5d520
00a5d4cc	sub w8,w25,#0x1
00a5d4d0	cmp w8,#0xfe
00a5d4d4	b.hi 0x00a5d69c
00a5d4d8	sub w8,w22,#0x1
00a5d4dc	orr w9,wzr,#0x7ffffe
00a5d4e0	cmp w8,w9
00a5d4e4	b.hi 0x00a5d69c
00a5d4e8	and w2,w25,#0xff
00a5d4ec	bfm w2,w22,#0x18,#0x16
00a5d4f0	cbz w2,0x00a5d69c
00a5d4f4	add x4,sp,#0x40
00a5d4f8	mov x0,x26
00a5d4fc	mov x1,x24
00a5d500	mov x3,x10
00a5d504	mov x24,x10
00a5d508	bl 0x00c3b580
00a5d50c	mov x10,x24
00a5d510	mov x1,x27
00a5d514	cbz w0,0x00a5d520
00a5d518	mov w8,wzr
00a5d51c	b 0x00a5d5f8
00a5d520	adrp x8,0xc5d000
00a5d524	add x8,x8,#0x680
00a5d528	ldp q1,q0,[x8, #0x10]
00a5d52c	ldr q2,[x8]
00a5d530	ldr x8,[x8, #0x30]
00a5d534	ldr x9,[x29, #0x10]
00a5d538	stp q1,q0,[sp, #0x10]
00a5d53c	str q2,[sp]
00a5d540	str x8,[sp, #0x30]
00a5d544	ldrb w8,[x21, #0x28]
00a5d548	ldr x0,[x21]
00a5d54c	stp x1,x10,[x21, #0x10]
00a5d550	add x2,sp,#0x48
00a5d554	and w8,w8,#0xfe
00a5d558	mov x4,sp
00a5d55c	mov w1,w25
00a5d560	mov w3,wzr
00a5d564	mov x5,x21
00a5d568	stp w25,w22,[x21, #0x8]
00a5d56c	mov x24,x10
00a5d570	stp x28,x20,[x21, #0x30]
00a5d574	mov x28,x9
00a5d578	str x9,[x21, #0x40]
00a5d57c	strb w8,[x21, #0x28]
00a5d580	bl 0x00c3b540
00a5d584	str x0,[sp, #0x40]
00a5d588	cbz x0,0x00a5d5e8
00a5d58c	cbnz w22,0x00a5d5a4
00a5d590	mov x0,x23
00a5d594	mov x1,x27
00a5d598	bl 0x00c3b620
00a5d59c	mov w22,w0
00a5d5a0	cbz w0,0x00a5d6f0
00a5d5a4	sub w8,w25,#0x1
00a5d5a8	cmp w8,#0xfe
00a5d5ac	b.hi 0x00a5d5e8
00a5d5b0	sub w8,w22,#0x1
00a5d5b4	orr w9,wzr,#0x7ffffe
00a5d5b8	cmp w8,w9
00a5d5bc	mov x1,x27
00a5d5c0	b.hi 0x00a5d5ec
00a5d5c4	and w2,w25,#0xff
00a5d5c8	bfm w2,w22,#0x18,#0x16
00a5d5cc	cbz w2,0x00a5d5ec
00a5d5d0	ldp x4,x1,[sp, #0x40]
00a5d5d4	mov x0,x26
00a5d5d8	mov x3,x24
00a5d5dc	mov x5,x20
00a5d5e0	mov x6,x28
00a5d5e4	bl 0x00c3b590
00a5d5e8	mov x1,x27
00a5d5ec	ldrb w8,[x21, #0x28]
00a5d5f0	mvn w8,w8
00a5d5f4	and w8,w8,#0x1
00a5d5f8	ldr x0,[sp, #0x40]
00a5d5fc	cmp w22,#0x0
00a5d600	ccmp x1,#0x0,#0x0,eq
00a5d604	b.eq 0x00a5d6d0
00a5d608	cbnz x0,0x00a5d6d0
00a5d60c	mov w9,#0x10d
00a5d610	movk w9,#0x8, LSL #16
00a5d614	sub w10,w9,#0x1
00a5d618	cmp w8,#0x0
00a5d61c	csel w24,w9,w10,eq
00a5d620	cbnz x1,0x00a5d638
00a5d624	mov x0,x23
00a5d628	mov w1,w22
00a5d62c	mov x2,xzr
00a5d630	bl 0x00c3b640
00a5d634	mov x1,x0
00a5d638	mov x20,x1
00a5d63c	bl 0x00c342a0
00a5d640	adrp x0,0x29e000
00a5d644	adrp x2,0x2d3000
00a5d648	add x0,x0,#0x17d
00a5d64c	add x2,x2,#0xb24
00a5d650	mov w1,#0x182
00a5d654	bl 0x00c342b0
00a5d658	ldr x0,[x21]
00a5d65c	bl 0x00c3b530
00a5d660	adrp x8,0x2cb000
00a5d664	add x8,x8,#0x889
00a5d668	cmp x20,#0x0
00a5d66c	csel x4,x8,x20,eq
00a5d670	cmp x19,#0x0
00a5d674	adrp x2,0x2af000
00a5d678	mov x3,x0
00a5d67c	csel x6,x8,x19,eq
00a5d680	add x2,x2,#0xf7a
00a5d684	orr w0,wzr,#0x6
00a5d688	mov w1,w24
00a5d68c	mov w5,w22
00a5d690	bl 0x00c342c0
00a5d694	ldr x0,[sp, #0x40]
00a5d698	b 0x00a5d6d0
00a5d69c	bl 0x00c342a0
00a5d6a0	adrp x0,0x29e000
00a5d6a4	adrp x2,0x2d3000
00a5d6a8	add x0,x0,#0x17d
00a5d6ac	add x2,x2,#0xb24
00a5d6b0	mov w1,#0x139
00a5d6b4	bl 0x00c342b0
00a5d6b8	mov w1,#0x103
00a5d6bc	orr w0,wzr,#0x6
00a5d6c0	movk w1,#0xc, LSL #16
00a5d6c4	mov x2,xzr
00a5d6c8	bl 0x00c342c0
00a5d6cc	mov x0,xzr
00a5d6d0	ldp x29,x30,[sp, #0xa0]
00a5d6d4	ldp x20,x19,[sp, #0x90]
00a5d6d8	ldp x22,x21,[sp, #0x80]
00a5d6dc	ldp x24,x23,[sp, #0x70]
00a5d6e0	ldp x26,x25,[sp, #0x60]
00a5d6e4	ldp x28,x27,[sp, #0x50]
00a5d6e8	add sp,sp,#0xb0
00a5d6ec	ret
00a5d6f0	bl 0x00c342a0
00a5d6f4	adrp x0,0x29e000
00a5d6f8	adrp x2,0x2d3000
00a5d6fc	add x0,x0,#0x17d
00a5d700	add x2,x2,#0xb24
00a5d704	mov w1,#0x16a
00a5d708	bl 0x00c342b0
00a5d70c	adrp x2,0x2a5000
00a5d710	mov w1,#0x10d
00a5d714	add x2,x2,#0xfb2
00a5d718	orr w0,wzr,#0x6
00a5d71c	movk w1,#0x8, LSL #16
00a5d720	mov x3,x27
00a5d724	bl 0x00c342c0
00a5d728	ldr x0,[sp, #0x40]
00a5d72c	blr x28
00a5d730	mov x1,x27
00a5d734	str xzr,[sp, #0x40]
00a5d738	b 0x00a5d5ec
