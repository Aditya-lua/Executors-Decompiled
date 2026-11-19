; mbedtls_sha512 @ 00bae50c
00bae50c	sub sp,sp,#0x160
00bae510	stp x28,x27,[sp, #0x100]
00bae514	stp x26,x25,[sp, #0x110]
00bae518	stp x24,x23,[sp, #0x120]
00bae51c	stp x22,x21,[sp, #0x130]
00bae520	stp x20,x19,[sp, #0x140]
00bae524	stp x29,x30,[sp, #0x150]
00bae528	add x29,sp,#0x150
00bae52c	mrs x9,tpidr_el0
00bae530	ldr x8,[x9, #0x28]
00bae534	mov w22,w3
00bae538	mov x20,x1
00bae53c	mov x21,x0
00bae540	cmp w3,#0x1
00bae544	stur x8,[x29, #-0x60]
00bae548	b.ls 0x00bae554
00bae54c	mov w19,#0xffffff8b
00bae550	b 0x00bae73c
00bae554	str x9,[sp, #0x10]
00bae558	mov x8,#0x9ed8
00bae55c	mov x9,#0xc908
00bae560	movk x8,#0xc105, LSL #16
00bae564	movk x9,#0xf3bc, LSL #16
00bae568	movk x8,#0x9d5d, LSL #32
00bae56c	movk x9,#0xe667, LSL #32
00bae570	cmp w22,#0x0
00bae574	movk x8,#0xcbbb, LSL #48
00bae578	movk x9,#0x6a09, LSL #48
00bae57c	mov x10,#0xd507
00bae580	mov x11,#0xa73b
00bae584	csel x8,x9,x8,eq
00bae588	movk x10,#0x367c, LSL #16
00bae58c	movk x11,#0x84ca, LSL #16
00bae590	mov x16,#0xb31
00bae594	str x8,[sp, #0x8]
00bae598	mov x8,#0x82d1
00bae59c	movk x10,#0x292a, LSL #32
00bae5a0	movk x11,#0xae85, LSL #32
00bae5a4	movk x16,#0xffc0, LSL #16
00bae5a8	movk x8,#0xade6, LSL #16
00bae5ac	movk x10,#0x629a, LSL #48
00bae5b0	movk x11,#0xbb67, LSL #48
00bae5b4	movk x16,#0x2667, LSL #32
00bae5b8	movk x8,#0x527f, LSL #32
00bae5bc	movk x16,#0x6733, LSL #48
00bae5c0	movk x8,#0x510e, LSL #48
00bae5c4	csel x9,x11,x10,eq
00bae5c8	str x9,[sp]
00bae5cc	mov x9,#0x1511
00bae5d0	mov x10,#0x6c1f
00bae5d4	mov x11,#0x8fa7
00bae5d8	csel x28,x8,x16,eq
00bae5dc	mov x8,#0xbd6b
00bae5e0	movk x9,#0x6858, LSL #16
00bae5e4	movk x10,#0x2b3e, LSL #16
00bae5e8	movk x11,#0x64f9, LSL #16
00bae5ec	movk x8,#0xfb41, LSL #16
00bae5f0	movk x9,#0x4a87, LSL #32
00bae5f4	movk x10,#0x688c, LSL #32
00bae5f8	movk x11,#0x2e0d, LSL #32
00bae5fc	movk x8,#0xd9ab, LSL #32
00bae600	movk x9,#0x8eb4, LSL #48
00bae604	movk x10,#0x9b05, LSL #48
00bae608	movk x11,#0xdb0c, LSL #48
00bae60c	movk x8,#0x1f83, LSL #48
00bae610	mov x12,#0xdd17
00bae614	mov x13,#0xf82b
00bae618	mov x14,#0x5939
00bae61c	mov x15,#0x36f1
00bae620	csel x19,x10,x9,eq
00bae624	mov x9,#0x4fa4
00bae628	csel x23,x8,x11,eq
00bae62c	mov x8,#0x2179
00bae630	movk x12,#0x3070, LSL #16
00bae634	movk x13,#0xfe94, LSL #16
00bae638	movk x14,#0xf70e, LSL #16
00bae63c	movk x15,#0x5f1d, LSL #16
00bae640	movk x9,#0xbefa, LSL #16
00bae644	movk x8,#0x137e, LSL #16
00bae648	movk x12,#0x15a, LSL #32
00bae64c	movk x13,#0xf372, LSL #32
00bae650	movk x14,#0xecd8, LSL #32
00bae654	movk x15,#0xf53a, LSL #32
00bae658	movk x9,#0x481d, LSL #32
00bae65c	movk x8,#0xcd19, LSL #32
00bae660	movk x12,#0x9159, LSL #48
00bae664	movk x13,#0x3c6e, LSL #48
00bae668	movk x14,#0x152f, LSL #48
00bae66c	movk x15,#0xa54f, LSL #48
00bae670	mov x25,x2
00bae674	movk x9,#0x47b5, LSL #48
00bae678	movk x8,#0x5be0, LSL #48
00bae67c	add x0,sp,#0x18
00bae680	mov w2,#0xd8
00bae684	mov w1,wzr
00bae688	csel x26,x13,x12,eq
00bae68c	csel x27,x15,x14,eq
00bae690	csel x24,x8,x9,eq
00bae694	bl 0x00c301c0
00bae698	ldr x8,[sp, #0x8]
00bae69c	stp x27,x28,[sp, #0x40]
00bae6a0	stp x19,x23,[sp, #0x50]
00bae6a4	str x24,[sp, #0x60]
00bae6a8	str x8,[sp, #0x28]
00bae6ac	ldr x8,[sp]
00bae6b0	str w22,[sp, #0xe8]
00bae6b4	stp x8,x26,[sp, #0x30]
00bae6b8	cbz x20,0x00bae71c
00bae6bc	str x20,[sp, #0x18]
00bae6c0	cmp x20,#0x80
00bae6c4	b.cc 0x00bae704
00bae6c8	mov x24,x20
00bae6cc	mov x22,x21
00bae6d0	add x0,sp,#0x18
00bae6d4	mov x1,x22
00bae6d8	bl 0x00c43500
00bae6dc	sub x24,x24,#0x80
00bae6e0	cmp x24,#0x7f
00bae6e4	add x22,x22,#0x80
00bae6e8	b.hi 0x00bae6d0
00bae6ec	and x8,x20,#-0x80
00bae6f0	add x21,x21,x8
00bae6f4	sub x20,x20,x8
00bae6f8	cbnz x8,0x00bae6c0
00bae6fc	mov w19,#0xffffffff
00bae700	b 0x00bae72c
00bae704	cbz x20,0x00bae71c
00bae708	add x8,sp,#0x18
00bae70c	add x0,x8,#0x50
00bae710	mov x1,x21
00bae714	mov x2,x20
00bae718	bl 0x00c2ffd0
00bae71c	add x0,sp,#0x18
00bae720	mov x1,x25
00bae724	bl 0x00c42b60
00bae728	mov w19,wzr
00bae72c	add x0,sp,#0x18
00bae730	mov w1,#0xd8
00bae734	bl 0x00c42220
00bae738	ldr x9,[sp, #0x10]
00bae73c	ldr x8,[x9, #0x28]
00bae740	ldur x9,[x29, #-0x60]
00bae744	cmp x8,x9
00bae748	b.ne 0x00bae770
00bae74c	mov w0,w19
00bae750	ldp x29,x30,[sp, #0x150]
00bae754	ldp x20,x19,[sp, #0x140]
00bae758	ldp x22,x21,[sp, #0x130]
00bae75c	ldp x24,x23,[sp, #0x120]
00bae760	ldp x26,x25,[sp, #0x110]
00bae764	ldp x28,x27,[sp, #0x100]
00bae768	add sp,sp,#0x160
00bae76c	ret
00bae770	bl 0x00c2fec0
