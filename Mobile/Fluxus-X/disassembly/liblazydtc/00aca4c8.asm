; ossl_rand_pool_new @ 00aca4c8
00aca4c8	str x23,[sp, #-0x40]!
00aca4cc	stp x20,x19,[sp, #0x20]
00aca4d0	mov w20,w1
00aca4d4	adrp x1,0x29e000
00aca4d8	stp x22,x21,[sp, #0x10]
00aca4dc	mov x22,x2
00aca4e0	mov w21,w0
00aca4e4	add x1,x1,#0x966
00aca4e8	mov w0,#0x40
00aca4ec	mov w2,#0x19
00aca4f0	stp x29,x30,[sp, #0x30]
00aca4f4	add x29,sp,#0x30
00aca4f8	mov x23,x3
00aca4fc	bl 0x00c34250
00aca500	cmp w20,#0x0
00aca504	orr w8,wzr,#0x30
00aca508	mov w9,#0x10
00aca50c	mov x19,x0
00aca510	csel x8,x9,x8,ne
00aca514	cbz x0,0x00aca568
00aca518	cmp x23,#0x3, LSL #12
00aca51c	orr w9,wzr,#0x3000
00aca520	csel x9,x23,x9,cc
00aca524	cmp x8,x22
00aca528	csel x8,x8,x22,hi
00aca52c	cmp x8,x9
00aca530	adrp x1,0x29e000
00aca534	csel x0,x9,x8,hi
00aca538	add x1,x1,#0x966
00aca53c	stp x22,x9,[x19, #0x18]
00aca540	str x0,[x19, #0x28]
00aca544	cbz w20,0x00aca59c
00aca548	mov w2,#0x29
00aca54c	bl 0x00c35710
00aca550	str x0,[x19]
00aca554	cbz x0,0x00aca5ac
00aca558	sxtw x8,w21
00aca55c	str x8,[x19, #0x38]
00aca560	str w20,[x19, #0x14]
00aca564	b 0x00aca5f4
00aca568	bl 0x00c342a0
00aca56c	adrp x0,0x29e000
00aca570	adrp x2,0x2b6000
00aca574	add x0,x0,#0x966
00aca578	add x2,x2,#0x3ac
00aca57c	mov w1,#0x1d
00aca580	bl 0x00c342b0
00aca584	mov w1,#0x100
00aca588	mov w0,#0x24
00aca58c	movk w1,#0xc, LSL #16
00aca590	mov x2,xzr
00aca594	bl 0x00c342c0
00aca598	b 0x00aca5f4
00aca59c	mov w2,#0x2b
00aca5a0	bl 0x00c34250
00aca5a4	str x0,[x19]
00aca5a8	cbnz x0,0x00aca558
00aca5ac	bl 0x00c342a0
00aca5b0	adrp x20,0x29e000
00aca5b4	add x20,x20,#0x966
00aca5b8	adrp x2,0x2b6000
00aca5bc	add x2,x2,#0x3ac
00aca5c0	mov w1,#0x2e
00aca5c4	mov x0,x20
00aca5c8	bl 0x00c342b0
00aca5cc	mov w1,#0x100
00aca5d0	mov w0,#0x24
00aca5d4	movk w1,#0xc, LSL #16
00aca5d8	mov x2,xzr
00aca5dc	bl 0x00c342c0
00aca5e0	mov w2,#0x37
00aca5e4	mov x0,x19
00aca5e8	mov x1,x20
00aca5ec	bl 0x00c32310
00aca5f0	mov x19,xzr
00aca5f4	mov x0,x19
00aca5f8	ldp x29,x30,[sp, #0x30]
00aca5fc	ldp x20,x19,[sp, #0x20]
00aca600	ldp x22,x21,[sp, #0x10]
00aca604	ldr x23,[sp], #0x40
00aca608	ret
