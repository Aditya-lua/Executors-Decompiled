; FUN_00b4d4a8 @ 00b4d4a8
00b4d4a8	stp x22,x21,[sp, #-0x30]!
00b4d4ac	stp x20,x19,[sp, #0x10]
00b4d4b0	stp x29,x30,[sp, #0x20]
00b4d4b4	add x29,sp,#0x20
00b4d4b8	mov x20,x2
00b4d4bc	mov x22,x1
00b4d4c0	mov x21,x0
00b4d4c4	bl 0x00c41000
00b4d4c8	mov x19,xzr
00b4d4cc	cbz x21,0x00b4d640
00b4d4d0	cbz w0,0x00b4d640
00b4d4d4	ldr x0,[x21]
00b4d4d8	bl 0x00c3a1d0
00b4d4dc	mov x19,x0
00b4d4e0	cbz x0,0x00b4d640
00b4d4e4	ldr w8,[x21, #0x3c]
00b4d4e8	cmp w8,#0x2
00b4d4ec	b.ne 0x00b4d500
00b4d4f0	ldr x8,[x21, #0x18]
00b4d4f4	cmp x8,#0x800
00b4d4f8	cset w8,cc
00b4d4fc	str w8,[x21, #0x3c]
00b4d500	stp x22,x20,[x21, #0x58]
00b4d504	bl 0x00c38c40
00b4d508	mov x20,x0
00b4d50c	cbz x0,0x00b4d524
00b4d510	adrp x1,0xb4d000
00b4d514	add x1,x1,#0xdc4
00b4d518	mov x0,x20
00b4d51c	mov x2,x21
00b4d520	bl 0x00c38c50
00b4d524	mov x0,x19
00b4d528	bl 0x00c3a330
00b4d52c	ldr x1,[x21, #0x8]
00b4d530	mov x22,x0
00b4d534	cbz x1,0x00b4d544
00b4d538	mov x0,x22
00b4d53c	bl 0x00c39c80
00b4d540	cbz w0,0x00b4d62c
00b4d544	ldr x1,[x21, #0x28]
00b4d548	cbz x1,0x00b4d55c
00b4d54c	ldr x2,[x21, #0x30]
00b4d550	mov x0,x22
00b4d554	bl 0x00c3dcc0
00b4d558	cbz w0,0x00b4d62c
00b4d55c	ldr w1,[x21, #0x38]
00b4d560	cmn w1,#0x1
00b4d564	b.eq 0x00b4d590
00b4d568	mov x0,x22
00b4d56c	bl 0x00c3dcd0
00b4d570	ldr w1,[x21, #0x40]
00b4d574	cmn w1,#0x1
00b4d578	b.eq 0x00b4d5a0
00b4d57c	mov x0,x22
00b4d580	bl 0x00c3dcf0
00b4d584	ldr x1,[x21, #0x48]
00b4d588	cbnz x1,0x00b4d5a8
00b4d58c	b 0x00b4d5b8
00b4d590	ldr w1,[x21, #0x44]
00b4d594	cbz w1,0x00b4d5a0
00b4d598	mov x0,x22
00b4d59c	bl 0x00c3dce0
00b4d5a0	ldr x1,[x21, #0x48]
00b4d5a4	cbz x1,0x00b4d5b8
00b4d5a8	ldr x2,[x21, #0x50]
00b4d5ac	mov x0,x22
00b4d5b0	bl 0x00c3dc90
00b4d5b4	cbz w0,0x00b4d62c
00b4d5b8	ldrb w8,[x21, #0x10]
00b4d5bc	tbz w8,#0x2,0x00b4d5e0
00b4d5c0	ldr w1,[x21, #0x3c]
00b4d5c4	ldr w2,[x21, #0x18]
00b4d5c8	ldr w3,[x21, #0x20]
00b4d5cc	mov x0,x19
00b4d5d0	mov x4,x20
00b4d5d4	bl 0x00c3a280
00b4d5d8	cmp w0,#0x1
00b4d5dc	b.lt 0x00b4d62c
00b4d5e0	ldr w8,[x21, #0x3c]
00b4d5e4	mov w1,#0x4
00b4d5e8	mov x0,x22
00b4d5ec	cmp w8,#0x1
00b4d5f0	cset w2,eq
00b4d5f4	bl 0x00c3dcb0
00b4d5f8	ldrb w8,[x21, #0x10]
00b4d5fc	tst w8,#0x3
00b4d600	b.eq 0x00b4d638
00b4d604	ldr x8,[x22]
00b4d608	cbz x8,0x00b4d62c
00b4d60c	ldr x8,[x22, #0x8]
00b4d610	cbz x8,0x00b4d62c
00b4d614	ldr x8,[x22, #0x10]
00b4d618	cbz x8,0x00b4d62c
00b4d61c	mov x0,x19
00b4d620	bl 0x00c3a290
00b4d624	cmp w0,#0x0
00b4d628	b.gt 0x00b4d638
00b4d62c	mov x0,x19
00b4d630	bl 0x00c3a0a0
00b4d634	mov x19,xzr
00b4d638	mov x0,x20
00b4d63c	bl 0x00c38c20
00b4d640	mov x0,x19
00b4d644	ldp x29,x30,[sp, #0x20]
00b4d648	ldp x20,x19,[sp, #0x10]
00b4d64c	ldp x22,x21,[sp], #0x30
00b4d650	ret
