; X509v3_add_ext @ 00b0d49c
00b0d49c	str x23,[sp, #-0x40]!
00b0d4a0	stp x22,x21,[sp, #0x10]
00b0d4a4	stp x20,x19,[sp, #0x20]
00b0d4a8	stp x29,x30,[sp, #0x30]
00b0d4ac	add x29,sp,#0x30
00b0d4b0	cbz x0,0x00b0d51c
00b0d4b4	ldr x19,[x0]
00b0d4b8	mov w22,w2
00b0d4bc	mov x21,x1
00b0d4c0	mov x20,x0
00b0d4c4	cbnz x19,0x00b0d4d4
00b0d4c8	bl 0x00c34780
00b0d4cc	mov x19,x0
00b0d4d0	cbz x0,0x00b0d55c
00b0d4d4	mov x0,x19
00b0d4d8	bl 0x00c325e0
00b0d4dc	mov w23,w0
00b0d4e0	mov x0,x21
00b0d4e4	bl 0x00c40d10
00b0d4e8	mov x21,x0
00b0d4ec	cbz x0,0x00b0d590
00b0d4f0	cmp w23,w22
00b0d4f4	ccmp w22,#0x0,#0x8,ge
00b0d4f8	csel w2,w23,w22,lt
00b0d4fc	mov x0,x19
00b0d500	mov x1,x21
00b0d504	bl 0x00c35890
00b0d508	cbz w0,0x00b0d560
00b0d50c	ldr x8,[x20]
00b0d510	cbz x8,0x00b0d5c4
00b0d514	mov x0,x19
00b0d518	b 0x00b0d5b0
00b0d51c	bl 0x00c342a0
00b0d520	adrp x0,0x2a2000
00b0d524	adrp x2,0x2b8000
00b0d528	add x0,x0,#0xeaa
00b0d52c	add x2,x2,#0x81c
00b0d530	mov w1,#0x6b
00b0d534	bl 0x00c342b0
00b0d538	mov w8,#0x100
00b0d53c	movk w8,#0xc, LSL #16
00b0d540	add w1,w8,#0x2
00b0d544	mov w0,#0xb
00b0d548	mov x2,xzr
00b0d54c	bl 0x00c342c0
00b0d550	mov x0,xzr
00b0d554	bl 0x00c35b00
00b0d558	b 0x00b0d5ac
00b0d55c	mov x21,xzr
00b0d560	bl 0x00c342a0
00b0d564	adrp x0,0x2a2000
00b0d568	adrp x2,0x2b8000
00b0d56c	add x0,x0,#0xeaa
00b0d570	add x2,x2,#0x81c
00b0d574	mov w1,#0x83
00b0d578	bl 0x00c342b0
00b0d57c	mov w1,#0x100
00b0d580	mov w0,#0xb
00b0d584	movk w1,#0xc, LSL #16
00b0d588	mov x2,xzr
00b0d58c	bl 0x00c342c0
00b0d590	mov x0,x21
00b0d594	bl 0x00c35b00
00b0d598	ldr x8,[x20]
00b0d59c	mov x0,xzr
00b0d5a0	cbnz x8,0x00b0d5b0
00b0d5a4	mov x0,x19
00b0d5a8	bl 0x00c34770
00b0d5ac	mov x0,xzr
00b0d5b0	ldp x29,x30,[sp, #0x30]
00b0d5b4	ldp x20,x19,[sp, #0x20]
00b0d5b8	ldp x22,x21,[sp, #0x10]
00b0d5bc	ldr x23,[sp], #0x40
00b0d5c0	ret
00b0d5c4	str x19,[x20]
00b0d5c8	mov x0,x19
00b0d5cc	b 0x00b0d5b0
