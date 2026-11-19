; OSSL_PARAM_BLD_push_BN_pad @ 00a9d470
00a9d470	stp x22,x21,[sp, #-0x30]!
00a9d474	stp x20,x19,[sp, #0x10]
00a9d478	mov x20,x3
00a9d47c	mov x19,x2
00a9d480	mov x21,x1
00a9d484	mov x22,x0
00a9d488	stp x29,x30,[sp, #0x20]
00a9d48c	add x29,sp,#0x20
00a9d490	cbz x2,0x00a9d4d4
00a9d494	mov x0,x19
00a9d498	bl 0x00c37f40
00a9d49c	cbz w0,0x00a9d500
00a9d4a0	bl 0x00c342a0
00a9d4a4	adrp x0,0x29e000
00a9d4a8	adrp x2,0x2da000
00a9d4ac	add x0,x0,#0x440
00a9d4b0	add x2,x2,#0xf1
00a9d4b4	mov w1,#0xd0
00a9d4b8	bl 0x00c342b0
00a9d4bc	adrp x2,0x2d8000
00a9d4c0	mov w1,#0x10c
00a9d4c4	add x2,x2,#0x21b
00a9d4c8	orr w0,wzr,#0xf
00a9d4cc	movk w1,#0x8, LSL #16
00a9d4d0	b 0x00a9d57c
00a9d4d4	mov w5,wzr
00a9d4d8	mov w4,#0x2
00a9d4dc	mov x0,x22
00a9d4e0	mov x1,x21
00a9d4e4	mov w2,w20
00a9d4e8	mov x3,x20
00a9d4ec	bl 0x00a9d5b4
00a9d4f0	cbz x0,0x00a9d584
00a9d4f4	str x19,[x0, #0x20]
00a9d4f8	mov w0,#0x1
00a9d4fc	b 0x00a9d584
00a9d500	mov x0,x19
00a9d504	bl 0x00c322f0
00a9d508	cmn w0,#0xf
00a9d50c	b.gt 0x00a9d538
00a9d510	bl 0x00c342a0
00a9d514	adrp x0,0x29e000
00a9d518	adrp x2,0x2da000
00a9d51c	add x0,x0,#0x440
00a9d520	add x2,x2,#0xf1
00a9d524	mov w1,#0xd7
00a9d528	bl 0x00c342b0
00a9d52c	orr w0,wzr,#0xf
00a9d530	mov w1,#0x73
00a9d534	b 0x00a9d578
00a9d538	add w8,w0,#0x7
00a9d53c	add w9,w0,#0xe
00a9d540	cmp w8,#0x0
00a9d544	csel w8,w9,w8,lt
00a9d548	sbfx x8,x8,#0x3,#0x1d
00a9d54c	cmp x8,x20
00a9d550	b.ls 0x00a9d594
00a9d554	bl 0x00c342a0
00a9d558	adrp x0,0x29e000
00a9d55c	adrp x2,0x2da000
00a9d560	add x0,x0,#0x440
00a9d564	add x2,x2,#0xf1
00a9d568	mov w1,#0xdb
00a9d56c	bl 0x00c342b0
00a9d570	orr w0,wzr,#0xf
00a9d574	mov w1,#0x74
00a9d578	mov x2,xzr
00a9d57c	bl 0x00c342c0
00a9d580	mov w0,wzr
00a9d584	ldp x29,x30,[sp, #0x20]
00a9d588	ldp x20,x19,[sp, #0x10]
00a9d58c	ldp x22,x21,[sp], #0x30
00a9d590	ret
00a9d594	mov w1,#0x8
00a9d598	mov x0,x19
00a9d59c	bl 0x00c38ce0
00a9d5a0	cmp w0,#0x8
00a9d5a4	cset w5,eq
00a9d5a8	cmp x20,#0x0
00a9d5ac	cinc x20,x20,eq
00a9d5b0	b 0x00a9d4d8
