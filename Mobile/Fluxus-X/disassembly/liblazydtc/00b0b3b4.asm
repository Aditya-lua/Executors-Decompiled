; X509_STORE_CTX_get1_crls @ 00b0b3b4
00b0b3b4	sub sp,sp,#0x160
00b0b3b8	str x28,[sp, #0x110]
00b0b3bc	stp x24,x23,[sp, #0x120]
00b0b3c0	stp x22,x21,[sp, #0x130]
00b0b3c4	stp x20,x19,[sp, #0x140]
00b0b3c8	stp x29,x30,[sp, #0x150]
00b0b3cc	add x29,sp,#0x150
00b0b3d0	mov x20,x1
00b0b3d4	mov x22,x0
00b0b3d8	bl 0x00c34780
00b0b3dc	adrp x1,0x2aa000
00b0b3e0	mov x19,x0
00b0b3e4	add x1,x1,#0xba3
00b0b3e8	mov w0,#0x10
00b0b3ec	orr w2,wzr,#0x1c0
00b0b3f0	bl 0x00c34250
00b0b3f4	mov x21,x0
00b0b3f8	cbz x0,0x00b0b44c
00b0b3fc	mov x23,x21
00b0b400	str wzr,[x21]
00b0b404	cbz x19,0x00b0b484
00b0b408	cbz x23,0x00b0b484
00b0b40c	ldr x24,[x22]
00b0b410	cbz x24,0x00b0b484
00b0b414	mov w1,#0x2
00b0b418	mov x0,x22
00b0b41c	mov x2,x20
00b0b420	mov x3,x23
00b0b424	bl 0x00b0aa34
00b0b428	cbz w0,0x00b0b484
00b0b42c	ldr w8,[x23]
00b0b430	cmp w8,#0x2
00b0b434	b.eq 0x00b0b4f0
00b0b438	cmp w8,#0x1
00b0b43c	b.ne 0x00b0b4f8
00b0b440	ldr x0,[x23, #0x8]
00b0b444	bl 0x00c31a90
00b0b448	b 0x00b0b4f8
00b0b44c	bl 0x00c342a0
00b0b450	adrp x0,0x2aa000
00b0b454	adrp x2,0x2b0000
00b0b458	add x0,x0,#0xba3
00b0b45c	add x2,x2,#0xa62
00b0b460	mov w1,#0x1c3
00b0b464	bl 0x00c342b0
00b0b468	mov w1,#0x100
00b0b46c	mov w0,#0xb
00b0b470	movk w1,#0xc, LSL #16
00b0b474	mov x2,xzr
00b0b478	bl 0x00c342c0
00b0b47c	mov x23,xzr
00b0b480	cbnz x19,0x00b0b408
00b0b484	cbz x23,0x00b0b4b0
00b0b488	ldr w8,[x23]
00b0b48c	cmp w8,#0x2
00b0b490	b.eq 0x00b0b4a8
00b0b494	cmp w8,#0x1
00b0b498	b.ne 0x00b0b4b0
00b0b49c	ldr x0,[x23, #0x8]
00b0b4a0	bl 0x00c31a90
00b0b4a4	b 0x00b0b4b0
00b0b4a8	ldr x0,[x23, #0x8]
00b0b4ac	bl 0x00c382b0
00b0b4b0	adrp x1,0x2aa000
00b0b4b4	add x1,x1,#0xba3
00b0b4b8	mov w2,#0x1f3
00b0b4bc	mov x0,x21
00b0b4c0	bl 0x00c32310
00b0b4c4	mov x0,x19
00b0b4c8	bl 0x00c34770
00b0b4cc	mov x19,xzr
00b0b4d0	mov x0,x19
00b0b4d4	ldp x29,x30,[sp, #0x150]
00b0b4d8	ldp x20,x19,[sp, #0x140]
00b0b4dc	ldp x22,x21,[sp, #0x130]
00b0b4e0	ldp x24,x23,[sp, #0x120]
00b0b4e4	ldr x28,[sp, #0x110]
00b0b4e8	add sp,sp,#0x160
00b0b4ec	ret
00b0b4f0	ldr x0,[x23, #0x8]
00b0b4f4	bl 0x00c382b0
00b0b4f8	adrp x1,0x2aa000
00b0b4fc	add x1,x1,#0xba3
00b0b500	mov w2,#0x1f3
00b0b504	mov x0,x21
00b0b508	bl 0x00c32310
00b0b50c	ldr x0,[x24, #0x98]
00b0b510	bl 0x00c356a0
00b0b514	cbz w0,0x00b0b4c4
00b0b518	ldr x0,[x24, #0x8]
00b0b51c	mov w8,#0x2
00b0b520	stur w8,[x29, #-0x50]
00b0b524	add x8,sp,#0x8
00b0b528	sub x1,x29,#0x50
00b0b52c	sub x2,x29,#0x34
00b0b530	stur x8,[x29, #-0x48]
00b0b534	str x20,[sp, #0x20]
00b0b538	bl 0x00c40220
00b0b53c	tbnz w0,#0x1f,0x00b0b59c
00b0b540	ldur w8,[x29, #-0x34]
00b0b544	cmp w8,#0x1
00b0b548	b.lt 0x00b0b590
00b0b54c	mov w20,w0
00b0b550	mov w22,wzr
00b0b554	ldr x0,[x24, #0x8]
00b0b558	add w1,w20,w22
00b0b55c	bl 0x00c32610
00b0b560	ldr x21,[x0, #0x8]
00b0b564	mov x0,x21
00b0b568	bl 0x00c3f810
00b0b56c	cbz w0,0x00b0b5a8
00b0b570	mov x0,x19
00b0b574	mov x1,x21
00b0b578	bl 0x00c347a0
00b0b57c	cbz w0,0x00b0b5b4
00b0b580	ldur w8,[x29, #-0x34]
00b0b584	add w22,w22,#0x1
00b0b588	cmp w22,w8
00b0b58c	b.lt 0x00b0b554
00b0b590	ldr x0,[x24, #0x98]
00b0b594	bl 0x00c35690
00b0b598	b 0x00b0b4d0
00b0b59c	ldr x0,[x24, #0x98]
00b0b5a0	bl 0x00c35690
00b0b5a4	b 0x00b0b4c4
00b0b5a8	ldr x0,[x24, #0x98]
00b0b5ac	bl 0x00c35690
00b0b5b0	b 0x00b0b5c4
00b0b5b4	ldr x0,[x24, #0x98]
00b0b5b8	bl 0x00c35690
00b0b5bc	mov x0,x21
00b0b5c0	bl 0x00c382b0
00b0b5c4	adrp x1,0xcb5000
00b0b5c8	ldr x1,[x1, #0x388]
00b0b5cc	mov x0,x19
00b0b5d0	bl 0x00c32600
00b0b5d4	b 0x00b0b4cc
