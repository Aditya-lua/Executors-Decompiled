; ix::WebSocketHandshake::sendErrorResponse @ 0099b348
0099b348	stp x28,x27,[sp, #-0x60]!
0099b34c	stp x26,x25,[sp, #0x10]
0099b350	stp x24,x23,[sp, #0x20]
0099b354	stp x22,x21,[sp, #0x30]
0099b358	stp x20,x19,[sp, #0x40]
0099b35c	stp x29,x30,[sp, #0x50]
0099b360	add x29,sp,#0x50
0099b364	sub sp,sp,#0x1f0
0099b368	mov x21,x8
0099b36c	adrp x27,0xcb4000
0099b370	adrp x8,0xcb4000
0099b374	mrs x28,tpidr_el0
0099b378	ldr x27,[x27, #0xc90]
0099b37c	ldr x8,[x8, #0xc88]
0099b380	ldr x9,[x28, #0x28]
0099b384	add x19,sp,#0x80
0099b388	movi v0.2D,#0x0
0099b38c	add x10,x8,#0x18
0099b390	mov x22,x2
0099b394	mov w23,w1
0099b398	mov x24,x0
0099b39c	add x0,x19,#0x80
0099b3a0	add x20,x27,#0x40
0099b3a4	mov v0.D[0x0],x10
0099b3a8	add x25,x19,#0x18
0099b3ac	add x8,x8,#0x40
0099b3b0	str x9,[sp, #0x10]
0099b3b4	str x20,[sp, #0x90]
0099b3b8	str x8,[sp, #0x100]
0099b3bc	str q0,[sp, #0x80]
0099b3c0	mov x1,x25
0099b3c4	str x0,[sp, #0x8]
0099b3c8	bl 0x00c30100
0099b3cc	str xzr,[sp, #0x188]
0099b3d0	adrp x11,0xcb4000
0099b3d4	ldr x11,[x11, #0xa08]
0099b3d8	mov w8,#0xffffffff
0099b3dc	fmov d0,x20
0099b3e0	str w8,[sp, #0x190]
0099b3e4	add x8,x11,#0x10
0099b3e8	add x20,x19,#0x20
0099b3ec	add x9,x27,#0x18
0099b3f0	add x10,x27,#0x68
0099b3f4	mov v0.D[0x1],x8
0099b3f8	mov x0,x20
0099b3fc	add x26,x19,#0x10
0099b400	str x9,[sp, #0x80]
0099b404	str x10,[sp, #0x100]
0099b408	str q0,[sp, #0x90]
0099b40c	bl 0x00c30480
0099b410	movi v0.2D,#0x0
0099b414	stur q0,[x19, #0x48]
0099b418	stur q0,[x19, #0x38]
0099b41c	stur q0,[x19, #0x28]
0099b420	adrp x9,0xcb4000
0099b424	ldr x9,[x9, #0xa00]
0099b428	orr w8,wzr,#0x18
0099b42c	add x9,x9,#0x10
0099b430	str x9,[sp, #0x98]
0099b434	stur q0,[x19, #0x68]
0099b438	stur q0,[x19, #0x58]
0099b43c	str w8,[sp, #0xf8]
0099b440	adrp x1,0x2d7000
0099b444	add x1,x1,#0x710
0099b448	mov w2,#0x9
0099b44c	mov x0,x26
0099b450	bl 0x00c30e90
0099b454	mov x0,x26
0099b458	mov w1,w23
0099b45c	bl 0x00c31aa0
0099b460	adrp x1,0x2a1000
0099b464	add x1,x1,#0x9a2
0099b468	mov w2,#0x1
0099b46c	mov x0,x26
0099b470	bl 0x00c30e90
0099b474	ldrb w8,[x22]
0099b478	ldp x10,x9,[x22, #0x8]
0099b47c	tst w8,#0x1
0099b480	lsr w11,w8,#0x1
0099b484	csinc x1,x9,x22,ne
0099b488	csel x2,x11,x10,eq
0099b48c	mov x0,x26
0099b490	bl 0x00c30e90
0099b494	adrp x1,0x2b9000
0099b498	add x1,x1,#0x17a
0099b49c	mov w2,#0x2
0099b4a0	mov x0,x26
0099b4a4	bl 0x00c30e90
0099b4a8	adrp x1,0x2a7000
0099b4ac	add x1,x1,#0x7d4
0099b4b0	mov w2,#0x8
0099b4b4	mov x0,x26
0099b4b8	bl 0x00c30e90
0099b4bc	mov x26,x0
0099b4c0	sub x8,x29,#0xa0
0099b4c4	sub x19,x29,#0xa0
0099b4c8	bl 0x00c331c0
0099b4cc	ldurb w8,[x29, #-0xa0]
0099b4d0	ldp x10,x9,[x29, #-0x98]
0099b4d4	orr x11,x19,#0x1
0099b4d8	tst w8,#0x1
0099b4dc	lsr w12,w8,#0x1
0099b4e0	csel x1,x11,x9,eq
0099b4e4	csel x2,x12,x10,eq
0099b4e8	mov x0,x26
0099b4ec	bl 0x00c30e90
0099b4f0	adrp x1,0x2b9000
0099b4f4	add x1,x1,#0x17a
0099b4f8	mov w2,#0x2
0099b4fc	bl 0x00c30e90
0099b500	ldurb w8,[x29, #-0xa0]
0099b504	tbz w8,#0x0,0x0099b510
0099b508	ldur x0,[x29, #-0x90]
0099b50c	bl 0x00c301d0
0099b510	adrp x1,0xd21000
0099b514	add x1,x1,#0x848
0099b518	sub x8,x29,#0xa0
0099b51c	mov w0,#0x1
0099b520	bl 0x00c32e00
0099b524	ldr x8,[x24, #0x8]
0099b528	ldr x24,[x8]
0099b52c	add x8,sp,#0x60
0099b530	mov x0,x25
0099b534	bl 0x00c30e20
0099b538	add x1,sp,#0x60
0099b53c	sub x2,x29,#0xa0
0099b540	mov x0,x24
0099b544	bl 0x00c33180
0099b548	ldrb w8,[sp, #0x60]
0099b54c	mov w24,w0
0099b550	tbz w8,#0x0,0x0099b55c
0099b554	ldr x0,[sp, #0x70]
0099b558	bl 0x00c301d0
0099b55c	tbz w24,#0x0,0x0099b5c0
0099b560	add x8,sp,#0x18
0099b564	add x8,x8,#0x8
0099b568	stp xzr,xzr,[sp, #0x20]
0099b56c	stp xzr,xzr,[sp, #0x60]
0099b570	str x8,[sp, #0x18]
0099b574	str xzr,[sp, #0x70]
0099b578	add x4,sp,#0x18
0099b57c	add x5,sp,#0x60
0099b580	mov x0,x21
0099b584	mov w1,wzr
0099b588	mov w2,w23
0099b58c	mov x3,x22
0099b590	bl 0x00c33bc0
0099b594	adrp x21,0xcb4000
0099b598	ldrb w8,[sp, #0x60]
0099b59c	ldr x19,[sp, #0x8]
0099b5a0	ldr x21,[x21, #0xa08]
0099b5a4	tbz w8,#0x0,0x0099b5b0
0099b5a8	ldr x0,[sp, #0x70]
0099b5ac	bl 0x00c301d0
0099b5b0	ldr x1,[sp, #0x20]
0099b5b4	add x0,sp,#0x18
0099b5b8	bl 0x00c32fc0
0099b5bc	b 0x0099b664
0099b5c0	stp xzr,xzr,[sp, #0x60]
0099b5c4	str xzr,[sp, #0x70]
0099b5c8	orr w0,wzr,#0x30
0099b5cc	bl 0x00c2fed0
0099b5d0	adrp x9,0x29d000
0099b5d4	adrp x8,0x29c000
0099b5d8	add x9,x9,#0xa64
0099b5dc	ldr q0,[x8, #0xa60]
0099b5e0	ldur x8,[x9, #0x1e]
0099b5e4	ldp q1,q2,[x9]
0099b5e8	str x0,[sp, #0x70]
0099b5ec	str q0,[sp, #0x60]
0099b5f0	stur x8,[x0, #0x1e]
0099b5f4	add x8,sp,#0x48
0099b5f8	add x8,x8,#0x8
0099b5fc	stp q1,q2,[x0]
0099b600	strb wzr,[x0, #0x26]
0099b604	stp xzr,xzr,[sp, #0x50]
0099b608	stp xzr,xzr,[sp, #0x30]
0099b60c	stp xzr,x8,[sp, #0x40]
0099b610	mov w2,#0x1f4
0099b614	add x3,sp,#0x60
0099b618	add x4,sp,#0x48
0099b61c	add x5,sp,#0x30
0099b620	mov x0,x21
0099b624	mov w1,wzr
0099b628	bl 0x00c33bc0
0099b62c	adrp x21,0xcb4000
0099b630	ldrb w8,[sp, #0x30]
0099b634	ldr x19,[sp, #0x8]
0099b638	ldr x21,[x21, #0xa08]
0099b63c	tbz w8,#0x0,0x0099b648
0099b640	ldr x0,[sp, #0x40]
0099b644	bl 0x00c301d0
0099b648	ldr x1,[sp, #0x50]
0099b64c	add x0,sp,#0x48
0099b650	bl 0x00c32fc0
0099b654	ldrb w8,[sp, #0x60]
0099b658	tbz w8,#0x0,0x0099b664
0099b65c	ldr x0,[sp, #0x70]
0099b660	bl 0x00c301d0
0099b664	ldur x0,[x29, #-0x80]
0099b668	sub x8,x29,#0xa0
0099b66c	cmp x8,x0
0099b670	b.eq 0x0099b684
0099b674	cbz x0,0x0099b690
0099b678	ldr x8,[x0]
0099b67c	ldr x8,[x8, #0x28]
0099b680	b 0x0099b68c
0099b684	ldr x8,[x0]
0099b688	ldr x8,[x8, #0x20]
0099b68c	blr x8
0099b690	adrp x11,0xcb4000
0099b694	add x8,x27,#0x18
0099b698	ldr x11,[x11, #0xa00]
0099b69c	str x8,[sp, #0x80]
0099b6a0	ldrb w8,[sp, #0xd8]
0099b6a4	add x9,x27,#0x68
0099b6a8	add x10,x27,#0x40
0099b6ac	add x11,x11,#0x10
0099b6b0	str x9,[sp, #0x100]
0099b6b4	stp x10,x11,[sp, #0x90]
0099b6b8	tbz w8,#0x0,0x0099b6c4
0099b6bc	ldr x0,[sp, #0xe8]
0099b6c0	bl 0x00c301d0
0099b6c4	add x8,x21,#0x10
0099b6c8	mov x0,x20
0099b6cc	str x8,[sp, #0x98]
0099b6d0	bl 0x00c30090
0099b6d4	mov x0,x19
0099b6d8	bl 0x00c30ee0
0099b6dc	ldr x8,[x28, #0x28]
0099b6e0	ldr x9,[sp, #0x10]
0099b6e4	cmp x8,x9
0099b6e8	b.ne 0x0099b70c
0099b6ec	add sp,sp,#0x1f0
0099b6f0	ldp x29,x30,[sp, #0x50]
0099b6f4	ldp x20,x19,[sp, #0x40]
0099b6f8	ldp x22,x21,[sp, #0x30]
0099b6fc	ldp x24,x23,[sp, #0x20]
0099b700	ldp x26,x25,[sp, #0x10]
0099b704	ldp x28,x27,[sp], #0x60
0099b708	ret
0099b70c	bl 0x00c2fec0
