; FUN_00a3d570 @ 00a3d570
00a3d570	str x21,[sp, #-0x30]!
00a3d574	stp x20,x19,[sp, #0x10]
00a3d578	stp x29,x30,[sp, #0x20]
00a3d57c	mov x21,x0
00a3d580	ldr x0,[x0, #0x88]
00a3d584	add x29,sp,#0x20
00a3d588	cbz x0,0x00a3d5d4
00a3d58c	ldr x8,[x21, #0x90]
00a3d590	cbz x8,0x00a3d5d4
00a3d594	mov x19,x2
00a3d598	mov x20,x1
00a3d59c	bl 0x00c3b2e0
00a3d5a0	ldr x8,[x21, #0x90]
00a3d5a4	mov x21,x0
00a3d5a8	mov x0,x8
00a3d5ac	bl 0x00c3b2e0
00a3d5b0	cbz x21,0x00a3d5fc
00a3d5b4	ldr x8,[x21, #0x50]
00a3d5b8	cbz x8,0x00a3d5fc
00a3d5bc	cbz x0,0x00a3d624
00a3d5c0	str x8,[x20]
00a3d5c4	add x8,x0,#0x11
00a3d5c8	mov w0,#0x1
00a3d5cc	str x8,[x19]
00a3d5d0	b 0x00a3d654
00a3d5d4	bl 0x00c342a0
00a3d5d8	adrp x0,0x2aa000
00a3d5dc	adrp x2,0x2bd000
00a3d5e0	add x0,x0,#0x129
00a3d5e4	add x2,x2,#0x9c7
00a3d5e8	mov w1,#0x2dc
00a3d5ec	bl 0x00c342b0
00a3d5f0	mov w0,#0x10
00a3d5f4	mov w1,#0x8c
00a3d5f8	b 0x00a3d648
00a3d5fc	bl 0x00c342a0
00a3d600	adrp x0,0x2aa000
00a3d604	adrp x2,0x2bd000
00a3d608	add x0,x0,#0x129
00a3d60c	add x2,x2,#0x9c7
00a3d610	mov w1,#0x2e2
00a3d614	bl 0x00c342b0
00a3d618	mov w0,#0x10
00a3d61c	mov w1,#0x7b
00a3d620	b 0x00a3d648
00a3d624	bl 0x00c342a0
00a3d628	adrp x0,0x2aa000
00a3d62c	adrp x2,0x2bd000
00a3d630	add x0,x0,#0x129
00a3d634	add x2,x2,#0x9c7
00a3d638	mov w1,#0x2e6
00a3d63c	bl 0x00c342b0
00a3d640	mov w0,#0x10
00a3d644	mov w1,#0x85
00a3d648	mov x2,xzr
00a3d64c	bl 0x00c342c0
00a3d650	mov w0,wzr
00a3d654	ldp x29,x30,[sp, #0x20]
00a3d658	ldp x20,x19,[sp, #0x10]
00a3d65c	ldr x21,[sp], #0x30
00a3d660	ret
