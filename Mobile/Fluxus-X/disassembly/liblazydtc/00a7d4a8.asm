; ossl_ffc_params_todata @ 00a7d4a8
00a7d4a8	str x21,[sp, #-0x30]!
00a7d4ac	stp x20,x19,[sp, #0x10]
00a7d4b0	stp x29,x30,[sp, #0x20]
00a7d4b4	add x29,sp,#0x20
00a7d4b8	cbz x0,0x00a7d694
00a7d4bc	ldr x3,[x0]
00a7d4c0	mov x19,x2
00a7d4c4	mov x20,x1
00a7d4c8	mov x21,x0
00a7d4cc	cbz x3,0x00a7d4e8
00a7d4d0	adrp x2,0x2a3000
00a7d4d4	add x2,x2,#0x8e7
00a7d4d8	mov x0,x20
00a7d4dc	mov x1,x19
00a7d4e0	bl 0x00c39de0
00a7d4e4	cbz w0,0x00a7d694
00a7d4e8	ldr x3,[x21, #0x8]
00a7d4ec	cbz x3,0x00a7d508
00a7d4f0	adrp x2,0x2cf000
00a7d4f4	add x2,x2,#0x3b1
00a7d4f8	mov x0,x20
00a7d4fc	mov x1,x19
00a7d500	bl 0x00c39de0
00a7d504	cbz w0,0x00a7d694
00a7d508	ldr x3,[x21, #0x10]
00a7d50c	cbz x3,0x00a7d528
00a7d510	adrp x2,0x2d9000
00a7d514	add x2,x2,#0x2e5
00a7d518	mov x0,x20
00a7d51c	mov x1,x19
00a7d520	bl 0x00c39de0
00a7d524	cbz w0,0x00a7d694
00a7d528	ldr x3,[x21, #0x18]
00a7d52c	cbz x3,0x00a7d548
00a7d530	adrp x2,0x2d9000
00a7d534	add x2,x2,#0xa61
00a7d538	mov x0,x20
00a7d53c	mov x1,x19
00a7d540	bl 0x00c39de0
00a7d544	cbz w0,0x00a7d694
00a7d548	ldr w3,[x21, #0x38]
00a7d54c	adrp x2,0x2a7000
00a7d550	add x2,x2,#0xf40
00a7d554	mov x0,x20
00a7d558	mov x1,x19
00a7d55c	bl 0x00c3adb0
00a7d560	cbz w0,0x00a7d694
00a7d564	ldr w3,[x21, #0x30]
00a7d568	adrp x2,0x2d9000
00a7d56c	add x2,x2,#0xd90
00a7d570	mov x0,x20
00a7d574	mov x1,x19
00a7d578	bl 0x00c3adb0
00a7d57c	cbz w0,0x00a7d694
00a7d580	ldr w3,[x21, #0x3c]
00a7d584	adrp x2,0x2a4000
00a7d588	add x2,x2,#0x10a
00a7d58c	mov x0,x20
00a7d590	mov x1,x19
00a7d594	bl 0x00c3adb0
00a7d598	cbz w0,0x00a7d694
00a7d59c	ldr x3,[x21, #0x20]
00a7d5a0	cbz x3,0x00a7d5c0
00a7d5a4	ldr x4,[x21, #0x28]
00a7d5a8	adrp x2,0x2bb000
00a7d5ac	add x2,x2,#0x864
00a7d5b0	mov x0,x20
00a7d5b4	mov x1,x19
00a7d5b8	bl 0x00c3adc0
00a7d5bc	cbz w0,0x00a7d694
00a7d5c0	ldr w0,[x21, #0x34]
00a7d5c4	cbz w0,0x00a7d5f0
00a7d5c8	bl 0x00c39f50
00a7d5cc	bl 0x00c3db90
00a7d5d0	cbz x0,0x00a7d694
00a7d5d4	adrp x2,0x2a2000
00a7d5d8	mov x3,x0
00a7d5dc	add x2,x2,#0x238
00a7d5e0	mov x0,x20
00a7d5e4	mov x1,x19
00a7d5e8	bl 0x00c3add0
00a7d5ec	cbz w0,0x00a7d694
00a7d5f0	ldr w8,[x21, #0x40]
00a7d5f4	adrp x2,0x2a0000
00a7d5f8	add x2,x2,#0x3c6
00a7d5fc	mov x0,x20
00a7d600	and w3,w8,#0x1
00a7d604	mov x1,x19
00a7d608	bl 0x00c3adb0
00a7d60c	cbz w0,0x00a7d694
00a7d610	ldr w8,[x21, #0x40]
00a7d614	adrp x2,0x2c1000
00a7d618	add x2,x2,#0xd34
00a7d61c	mov x0,x20
00a7d620	ubfx w3,w8,#0x1,#0x1
00a7d624	mov x1,x19
00a7d628	bl 0x00c3adb0
00a7d62c	cbz w0,0x00a7d694
00a7d630	ldr w8,[x21, #0x40]
00a7d634	adrp x2,0x2c5000
00a7d638	add x2,x2,#0xb86
00a7d63c	mov x0,x20
00a7d640	ubfx w3,w8,#0x2,#0x1
00a7d644	mov x1,x19
00a7d648	bl 0x00c3adb0
00a7d64c	cbz w0,0x00a7d694
00a7d650	ldr x3,[x21, #0x48]
00a7d654	cbz x3,0x00a7d670
00a7d658	adrp x2,0x29d000
00a7d65c	add x2,x2,#0xe2e
00a7d660	mov x0,x20
00a7d664	mov x1,x19
00a7d668	bl 0x00c3add0
00a7d66c	cbz w0,0x00a7d694
00a7d670	ldr x3,[x21, #0x50]
00a7d674	cbz x3,0x00a7d690
00a7d678	adrp x2,0x2d3000
00a7d67c	add x2,x2,#0x7c2
00a7d680	mov x0,x20
00a7d684	mov x1,x19
00a7d688	bl 0x00c3add0
00a7d68c	cbz w0,0x00a7d694
00a7d690	mov w0,#0x1
00a7d694	ldp x29,x30,[sp, #0x20]
00a7d698	ldp x20,x19,[sp, #0x10]
00a7d69c	ldr x21,[sp], #0x30
00a7d6a0	ret
