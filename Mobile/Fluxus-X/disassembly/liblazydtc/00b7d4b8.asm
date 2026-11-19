; mbedtls_mpi_safe_cond_swap @ 00b7d4b8
00b7d4b8	str x25,[sp, #-0x50]!
00b7d4bc	stp x24,x23,[sp, #0x10]
00b7d4c0	stp x22,x21,[sp, #0x20]
00b7d4c4	stp x20,x19,[sp, #0x30]
00b7d4c8	stp x29,x30,[sp, #0x40]
00b7d4cc	add x29,sp,#0x40
00b7d4d0	mov x20,x1
00b7d4d4	mov x19,x0
00b7d4d8	cmp x0,x1
00b7d4dc	b.eq 0x00b7d624
00b7d4e0	and x21,x2,#0xff
00b7d4e4	neg x8,x21
00b7d4e8	orr x21,x8,x21
00b7d4ec	asr x21,x21,#0x3f
00b7d4f0	ldrh w22,[x20, #0xa]
00b7d4f4	mov w8,#0x2710
00b7d4f8	cmp x22,x8
00b7d4fc	b.ls 0x00b7d508
00b7d500	orr w0,wzr,#0xfffffff0
00b7d504	b 0x00b7d628
00b7d508	ldrh w23,[x19, #0xa]
00b7d50c	cmp w23,w22
00b7d510	b.cs 0x00b7d560
00b7d514	mov w1,#0x8
00b7d518	mov x0,x22
00b7d51c	bl 0x00c30a30
00b7d520	mov x24,x0
00b7d524	cbz x0,0x00b7d500
00b7d528	ldr x25,[x19]
00b7d52c	cbz x25,0x00b7d550
00b7d530	lsl x23,x23,#0x3
00b7d534	mov x0,x24
00b7d538	mov x1,x25
00b7d53c	mov x2,x23
00b7d540	bl 0x00c2ffd0
00b7d544	mov x0,x25
00b7d548	mov x1,x23
00b7d54c	bl 0x00c42230
00b7d550	mov x23,x22
00b7d554	strh w22,[x19, #0xa]
00b7d558	str x24,[x19]
00b7d55c	b 0x00b7d570
00b7d560	mov w8,#0x2710
00b7d564	cmp w23,w8
00b7d568	mov w22,w23
00b7d56c	b.hi 0x00b7d500
00b7d570	ldrh w25,[x20, #0xa]
00b7d574	cmp w25,w22
00b7d578	b.cs 0x00b7d5c0
00b7d57c	mov w1,#0x8
00b7d580	mov x0,x23
00b7d584	bl 0x00c30a30
00b7d588	mov x23,x0
00b7d58c	cbz x0,0x00b7d500
00b7d590	ldr x24,[x20]
00b7d594	cbz x24,0x00b7d5b8
00b7d598	lsl x25,x25,#0x3
00b7d59c	mov x0,x23
00b7d5a0	mov x1,x24
00b7d5a4	mov x2,x25
00b7d5a8	bl 0x00c2ffd0
00b7d5ac	mov x0,x24
00b7d5b0	mov x1,x25
00b7d5b4	bl 0x00c42230
00b7d5b8	strh w22,[x20, #0xa]
00b7d5bc	str x23,[x20]
00b7d5c0	ldrsh w8,[x20, #0x8]
00b7d5c4	ldrsh w9,[x19, #0x8]
00b7d5c8	mov x10,x21
00b7d5cc	mov x3,x21
00b7d5d0	add w8,w8,#0x1
00b7d5d4	add w9,w9,#0x1
00b7d5d8	and x8,x8,x10
00b7d5dc	mvn x10,x10
00b7d5e0	and x10,x10,x9
00b7d5e4	orr x10,x8,x10
00b7d5e8	sub w8,w10,#0x1
00b7d5ec	strh w8,[x19, #0x8]
00b7d5f0	ldrsh w8,[x20, #0x8]
00b7d5f4	mov x10,x21
00b7d5f8	add w8,w8,#0x1
00b7d5fc	and x9,x9,x10
00b7d600	mvn x10,x10
00b7d604	and x10,x10,x8
00b7d608	orr x10,x9,x10
00b7d60c	sub w8,w10,#0x1
00b7d610	strh w8,[x20, #0x8]
00b7d614	ldr x1,[x20]
00b7d618	ldr x0,[x19]
00b7d61c	ldrh w2,[x19, #0xa]
00b7d620	bl 0x00c41df0
00b7d624	mov w0,wzr
00b7d628	ldp x29,x30,[sp, #0x40]
00b7d62c	ldp x20,x19,[sp, #0x30]
00b7d630	ldp x22,x21,[sp, #0x20]
00b7d634	ldp x24,x23,[sp, #0x10]
00b7d638	ldr x25,[sp], #0x50
00b7d63c	ret
