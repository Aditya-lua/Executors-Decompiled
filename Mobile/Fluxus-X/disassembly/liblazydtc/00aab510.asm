; CRYPTO_ocb128_init @ 00aab510
00aab510	stp x24,x23,[sp, #-0x40]!
00aab514	stp x22,x21,[sp, #0x10]
00aab518	mov x23,x2
00aab51c	mov x21,x1
00aab520	mov w2,#0xb0
00aab524	mov w1,wzr
00aab528	stp x20,x19,[sp, #0x20]
00aab52c	stp x29,x30,[sp, #0x30]
00aab530	add x29,sp,#0x30
00aab534	mov x22,x5
00aab538	mov x24,x4
00aab53c	mov x20,x3
00aab540	mov x19,x0
00aab544	bl 0x00c301c0
00aab548	adrp x1,0x2a6000
00aab54c	mov w8,#0x5
00aab550	add x1,x1,#0x3f0
00aab554	mov w0,#0x50
00aab558	mov w2,#0x9e
00aab55c	str x8,[x19, #0x30]
00aab560	bl 0x00c32320
00aab564	str x0,[x19, #0x58]
00aab568	cbz x0,0x00aab6a4
00aab56c	stp x23,x22,[x19, #0x18]
00aab570	add x22,x19,#0x38
00aab574	mov x0,x22
00aab578	mov x1,x22
00aab57c	mov x2,x21
00aab580	stp x20,x24,[x19]
00aab584	str x21,[x19, #0x10]
00aab588	blr x20
00aab58c	ldrsb w8,[x19, #0x38]
00aab590	add x21,x19,#0x48
00aab594	mov w1,#0x1
00aab598	mov x0,x22
00aab59c	lsr w8,w8,#0x7
00aab5a0	mov x2,x21
00aab5a4	and w23,w8,#0xffffff87
00aab5a8	mov w20,#0x1
00aab5ac	bl 0x00aab930
00aab5b0	ldrb w8,[x19, #0x57]
00aab5b4	ldr x22,[x19, #0x58]
00aab5b8	mov w1,#0x1
00aab5bc	mov x0,x21
00aab5c0	eor w8,w8,w23
00aab5c4	strb w8,[x19, #0x57]
00aab5c8	ldrsb w8,[x19, #0x48]
00aab5cc	mov x2,x22
00aab5d0	lsr w8,w8,#0x7
00aab5d4	and w23,w8,#0xffffff87
00aab5d8	bl 0x00aab930
00aab5dc	ldrb w8,[x22, #0xf]
00aab5e0	mov w1,#0x1
00aab5e4	eor w8,w8,w23
00aab5e8	strb w8,[x22, #0xf]
00aab5ec	ldr x21,[x19, #0x58]
00aab5f0	ldrsb w8,[x21]
00aab5f4	add x2,x21,#0x10
00aab5f8	mov x0,x21
00aab5fc	lsr w8,w8,#0x7
00aab600	and w22,w8,#0xffffff87
00aab604	bl 0x00aab930
00aab608	ldrb w8,[x21, #0x1f]
00aab60c	mov w1,#0x1
00aab610	eor w8,w8,w22
00aab614	strb w8,[x21, #0x1f]
00aab618	ldr x21,[x19, #0x58]
00aab61c	ldrsb w8,[x21, #0x10]!
00aab620	add x2,x21,#0x10
00aab624	lsr w8,w8,#0x7
00aab628	mov x0,x21
00aab62c	and w22,w8,#0xffffff87
00aab630	bl 0x00aab930
00aab634	ldrb w8,[x21, #0x1f]
00aab638	mov w1,#0x1
00aab63c	eor w8,w8,w22
00aab640	strb w8,[x21, #0x1f]
00aab644	ldr x21,[x19, #0x58]
00aab648	ldrsb w8,[x21, #0x20]!
00aab64c	add x2,x21,#0x10
00aab650	lsr w8,w8,#0x7
00aab654	mov x0,x21
00aab658	and w22,w8,#0xffffff87
00aab65c	bl 0x00aab930
00aab660	ldrb w8,[x21, #0x1f]
00aab664	mov w1,#0x1
00aab668	eor w8,w8,w22
00aab66c	strb w8,[x21, #0x1f]
00aab670	ldr x21,[x19, #0x58]
00aab674	ldrsb w8,[x21, #0x30]!
00aab678	add x2,x21,#0x10
00aab67c	lsr w8,w8,#0x7
00aab680	mov x0,x21
00aab684	and w22,w8,#0xffffff87
00aab688	bl 0x00aab930
00aab68c	ldrb w8,[x21, #0x1f]
00aab690	mov w9,#0x4
00aab694	eor w8,w8,w22
00aab698	strb w8,[x21, #0x1f]
00aab69c	str x9,[x19, #0x28]
00aab6a0	b 0x00aab6d8
00aab6a4	bl 0x00c342a0
00aab6a8	adrp x0,0x2a6000
00aab6ac	adrp x2,0x2cd000
00aab6b0	add x0,x0,#0x3f0
00aab6b4	add x2,x2,#0xde1
00aab6b8	mov w1,#0x9f
00aab6bc	bl 0x00c342b0
00aab6c0	mov w1,#0x100
00aab6c4	orr w0,wzr,#0xf
00aab6c8	movk w1,#0xc, LSL #16
00aab6cc	mov x2,xzr
00aab6d0	bl 0x00c342c0
00aab6d4	mov w20,wzr
00aab6d8	mov w0,w20
00aab6dc	ldp x29,x30,[sp, #0x30]
00aab6e0	ldp x20,x19,[sp, #0x20]
00aab6e4	ldp x22,x21,[sp, #0x10]
00aab6e8	ldp x24,x23,[sp], #0x40
00aab6ec	ret
