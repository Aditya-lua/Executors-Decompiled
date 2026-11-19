; FUN_008bd4ec @ 008bd4ec
008bd4ec	sub sp,sp,#0x1c0
008bd4f0	stp x29,x30,[sp, #0x160]
008bd4f4	stp x28,x27,[sp, #0x170]
008bd4f8	stp x26,x25,[sp, #0x180]
008bd4fc	stp x24,x23,[sp, #0x190]
008bd500	stp x22,x21,[sp, #0x1a0]
008bd504	stp x20,x19,[sp, #0x1b0]
008bd508	add x29,sp,#0x160
008bd50c	mrs x23,tpidr_el0
008bd510	ldr x8,[x23, #0x28]
008bd514	stur x8,[x29, #-0x8]
008bd518	ldrb w8,[x1, #0x7]
008bd51c	cmp w8,#0x0
008bd520	cset w9,eq
008bd524	eor w9,w2,w9
008bd528	tbnz w9,#0x0,0x008bd6d0
008bd52c	mov x20,x1
008bd530	mov x19,x0
008bd534	tbz w2,#0x0,0x008bd668
008bd538	mov w8,#0x1
008bd53c	ldr x21,[x20, #0x28]
008bd540	adrp x22,0xd1f000
008bd544	strb w8,[x20, #0x7]
008bd548	adrp x8,0xd1f000
008bd54c	add x8,x8,#0xc90
008bd550	ldarb w8,[x8]
008bd554	tbz w8,#0x0,0x008bd700
008bd558	ldr x8,[x22, #0xc88]
008bd55c	add x8,x8,#0x7f3, LSL #12
008bd560	add x8,x8,#0x700
008bd564	cmp x21,x8
008bd568	b.eq 0x008bd6d0
008bd56c	mov x25,xzr
008bd570	mov w21,wzr
008bd574	mov w22,wzr
008bd578	mov w24,#0x140
008bd57c	add x26,sp,#0x8
008bd580	mov w27,#0x1
008bd584	ldr x8,[x19, #0x60]
008bd588	mov x0,x20
008bd58c	add x8,x8,x25, LSL #0x3
008bd590	ldr x1,[x8, #0x338]
008bd594	bl 0x008bb440
008bd598	ldr w9,[x0, #0xc]
008bd59c	lsl w8,w27,w25
008bd5a0	ldr q0,[x0]
008bd5a4	str q0,[x26,x24]
008bd5a8	sub x24,x24,#0x10
008bd5ac	cmp w9,#0x0
008bd5b0	cset w9,ne
008bd5b4	cmp x25,#0x7
008bd5b8	add x25,x25,#0x1
008bd5bc	cset w10,hi
008bd5c0	orr w21,w21,w9
008bd5c4	orr w10,w10,w9
008bd5c8	tst w10,#0x1
008bd5cc	csel w8,wzr,w8,ne
008bd5d0	cmn x24,#0x10
008bd5d4	orr w22,w8,w22
008bd5d8	b.ne 0x008bd584
008bd5dc	strb w22,[x20, #0x6]
008bd5e0	tbz w21,#0x0,0x008bd6d0
008bd5e4	ldr w8,[x20, #0x8]
008bd5e8	cmn w8,#0x15
008bd5ec	b.lt 0x008bd730
008bd5f0	add w8,w8,#0x15
008bd5f4	ldrb w2,[x20, #0x1]
008bd5f8	mov x0,x19
008bd5fc	ubfiz x1,x8,#0x4,#0x20
008bd600	bl 0x008b777c
008bd604	cbz x0,0x008bd6d0
008bd608	ldrsw x8,[x20, #0x8]
008bd60c	ldr x21,[x20, #0x20]
008bd610	mov x22,x0
008bd614	cbz w8,0x008bd628
008bd618	lsl x2,x8,#0x4
008bd61c	add x0,x22,#0x150
008bd620	mov x1,x21
008bd624	bl 0x00c2ffd0
008bd628	add x1,sp,#0x8
008bd62c	mov x0,x22
008bd630	mov w2,#0x150
008bd634	bl 0x00c2ffd0
008bd638	ldrsw x10,[x20, #0x8]
008bd63c	ldrb w9,[x20, #0x7]
008bd640	add x8,x22,#0x150
008bd644	ldrb w3,[x20, #0x1]
008bd648	str x8,[x20, #0x20]
008bd64c	mov x0,x19
008bd650	lsl x2,x10,#0x4
008bd654	orr w8,w9,#0x2
008bd658	mov x1,x21
008bd65c	strb w8,[x20, #0x7]
008bd660	bl 0x008b7a9c
008bd664	b 0x008bd6d0
008bd668	tbz w8,#0x1,0x008bd6cc
008bd66c	ldr w8,[x20, #0x8]
008bd670	ldr x21,[x20, #0x20]
008bd674	cbz w8,0x008bd6b0
008bd678	tbnz w8,#0x1f,0x008bd730
008bd67c	lsl x1,x8,#0x4
008bd680	ldrb w2,[x20, #0x1]
008bd684	mov x0,x19
008bd688	bl 0x008b7610
008bd68c	ldrsw x8,[x20, #0x8]
008bd690	mov x1,x21
008bd694	mov x22,x0
008bd698	lsl x2,x8,#0x4
008bd69c	bl 0x00c2ffd0
008bd6a0	ldrsw x8,[x20, #0x8]
008bd6a4	lsl x8,x8,#0x4
008bd6a8	add x2,x8,#0x150
008bd6ac	b 0x008bd6b8
008bd6b0	mov x22,xzr
008bd6b4	mov w2,#0x150
008bd6b8	ldrb w3,[x20, #0x1]
008bd6bc	sub x1,x21,#0x150
008bd6c0	mov x0,x19
008bd6c4	str x22,[x20, #0x20]
008bd6c8	bl 0x008b7a9c
008bd6cc	strb wzr,[x20, #0x7]
008bd6d0	ldr x8,[x23, #0x28]
008bd6d4	ldur x9,[x29, #-0x8]
008bd6d8	cmp x8,x9
008bd6dc	b.ne 0x008bd770
008bd6e0	ldp x20,x19,[sp, #0x1b0]
008bd6e4	ldp x22,x21,[sp, #0x1a0]
008bd6e8	ldp x24,x23,[sp, #0x190]
008bd6ec	ldp x26,x25,[sp, #0x180]
008bd6f0	ldp x28,x27,[sp, #0x170]
008bd6f4	ldp x29,x30,[sp, #0x160]
008bd6f8	add sp,sp,#0x1c0
008bd6fc	ret
008bd700	adrp x0,0xd1f000
008bd704	add x0,x0,#0xc90
008bd708	bl 0x00c2fe90
008bd70c	cbz w0,0x008bd558
008bd710	adrp x8,0xcca000
008bd714	ldr x0,[x8, #0x8c8]
008bd718	bl 0x007fe1ec
008bd71c	str x0,[x22, #0xc88]
008bd720	adrp x0,0xd1f000
008bd724	add x0,x0,#0xc90
008bd728	bl 0x00c2fea0
008bd72c	b 0x008bd558
008bd730	ldr x8,[x23, #0x28]
008bd734	ldur x9,[x29, #-0x8]
008bd738	cmp x8,x9
008bd73c	b.ne 0x008bd770
008bd740	mov x0,x19
008bd744	bl 0x008b75fc
008bd770	bl 0x00c2fec0
