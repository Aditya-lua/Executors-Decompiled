; ix::HttpServer::makeRedirectServer @ 0097c520
0097c520	sub sp,sp,#0xe0
0097c524	str x25,[sp, #0x90]
0097c528	stp x24,x23,[sp, #0xa0]
0097c52c	stp x22,x21,[sp, #0xb0]
0097c530	stp x20,x19,[sp, #0xc0]
0097c534	stp x29,x30,[sp, #0xd0]
0097c538	add x29,sp,#0xd0
0097c53c	mrs x25,tpidr_el0
0097c540	ldr x8,[x25, #0x28]
0097c544	mov x9,sp
0097c548	mov x19,x0
0097c54c	add x21,x9,#0x8
0097c550	stur x8,[x29, #-0x48]
0097c554	stp x0,xzr,[sp]
0097c558	stp xzr,xzr,[sp, #0x10]
0097c55c	ldrb w8,[x1]
0097c560	tbnz w8,#0x0,0x0097c578
0097c564	ldr x8,[x1, #0x10]
0097c568	str x8,[x21, #0x10]
0097c56c	ldr q0,[x1]
0097c570	str q0,[x21]
0097c574	b 0x0097c5d8
0097c578	ldr x20,[x1, #0x8]
0097c57c	cmn x20,#0x10
0097c580	b.cs 0x0097c738
0097c584	ldr x22,[x1, #0x10]
0097c588	cmp x20,#0x17
0097c58c	b.cs 0x0097c5a4
0097c590	lsl w8,w20,#0x1
0097c594	add x23,x21,#0x1
0097c598	strb w8,[sp, #0x8]
0097c59c	cbnz x20,0x0097c5c4
0097c5a0	b 0x0097c5d4
0097c5a4	add x8,x20,#0x10
0097c5a8	and x24,x8,#-0x10
0097c5ac	mov x0,x24
0097c5b0	bl 0x00c2fed0
0097c5b4	orr x8,x24,#0x1
0097c5b8	mov x23,x0
0097c5bc	stp x20,x0,[sp, #0x10]
0097c5c0	str x8,[sp, #0x8]
0097c5c4	mov x0,x23
0097c5c8	mov x1,x22
0097c5cc	mov x2,x20
0097c5d0	bl 0x00c2ffd0
0097c5d4	strb wzr,[x23, x20]
0097c5d8	str xzr,[sp, #0x40]
0097c5dc	mov w0,#0x28
0097c5e0	bl 0x00c2fed0
0097c5e4	adrp x8,0xc51000
0097c5e8	ldr x9,[sp]
0097c5ec	ldrb w10,[sp, #0x8]
0097c5f0	add x8,x8,#0xac8
0097c5f4	add x8,x8,#0x10
0097c5f8	mov x20,x0
0097c5fc	str x8,[x0]
0097c600	str xzr,[x0, #0x10]!
0097c604	stur x9,[x0, #-0x8]
0097c608	stp xzr,xzr,[x0, #0x8]
0097c60c	tbnz w10,#0x0,0x0097c624
0097c610	ldr x8,[x21, #0x10]
0097c614	ldr q0,[x21]
0097c618	str x8,[x0, #0x10]
0097c61c	str q0,[x0]
0097c620	b 0x0097c684
0097c624	ldr x21,[sp, #0x10]
0097c628	cmn x21,#0x10
0097c62c	b.cs 0x0097c740
0097c630	ldr x22,[sp, #0x18]
0097c634	cmp x21,#0x17
0097c638	b.cs 0x0097c650
0097c63c	lsl w8,w21,#0x1
0097c640	add x23,x20,#0x11
0097c644	strb w8,[x20, #0x10]
0097c648	cbnz x21,0x0097c670
0097c64c	b 0x0097c680
0097c650	add x8,x21,#0x10
0097c654	and x24,x8,#-0x10
0097c658	mov x0,x24
0097c65c	bl 0x00c2fed0
0097c660	orr x8,x24,#0x1
0097c664	mov x23,x0
0097c668	stp x21,x0,[x20, #0x18]
0097c66c	str x8,[x20, #0x10]
0097c670	mov x0,x23
0097c674	mov x1,x22
0097c678	mov x2,x21
0097c67c	bl 0x00c2ffd0
0097c680	strb wzr,[x23, x21]
0097c684	str x20,[sp, #0x40]
0097c688	mov x0,x20
0097c68c	bl 0x0097f914
0097c690	add x1,x19,#0x2f0
0097c694	str x0,[sp, #0x70]
0097c698	add x0,sp,#0x50
0097c69c	add x19,sp,#0x50
0097c6a0	bl 0x00c33340
0097c6a4	ldr x0,[sp, #0x70]
0097c6a8	cmp x19,x0
0097c6ac	b.eq 0x0097c6c0
0097c6b0	cbz x0,0x0097c6cc
0097c6b4	ldr x8,[x0]
0097c6b8	ldr x8,[x8, #0x28]
0097c6bc	b 0x0097c6c8
0097c6c0	ldr x8,[x0]
0097c6c4	ldr x8,[x8, #0x20]
0097c6c8	blr x8
0097c6cc	ldr x0,[sp, #0x40]
0097c6d0	add x8,sp,#0x20
0097c6d4	cmp x8,x0
0097c6d8	b.eq 0x0097c6ec
0097c6dc	cbz x0,0x0097c6f8
0097c6e0	ldr x8,[x0]
0097c6e4	ldr x8,[x8, #0x28]
0097c6e8	b 0x0097c6f4
0097c6ec	ldr x8,[x0]
0097c6f0	ldr x8,[x8, #0x20]
0097c6f4	blr x8
0097c6f8	ldrb w8,[sp, #0x8]
0097c6fc	tbz w8,#0x0,0x0097c708
0097c700	ldr x0,[sp, #0x18]
0097c704	bl 0x00c301d0
0097c708	ldr x8,[x25, #0x28]
0097c70c	ldur x9,[x29, #-0x48]
0097c710	cmp x8,x9
0097c714	b.ne 0x0097c734
0097c718	ldp x29,x30,[sp, #0xd0]
0097c71c	ldp x20,x19,[sp, #0xc0]
0097c720	ldp x22,x21,[sp, #0xb0]
0097c724	ldp x24,x23,[sp, #0xa0]
0097c728	ldr x25,[sp, #0x90]
0097c72c	add sp,sp,#0xe0
0097c730	ret
0097c734	bl 0x00c2fec0
0097c738	mov x0,x21
0097c73c	bl 0x00c30ce0
0097c740	bl 0x00c30ce0
