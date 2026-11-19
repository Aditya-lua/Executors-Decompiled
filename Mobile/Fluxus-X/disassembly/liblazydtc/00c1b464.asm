; FUN_00c1b464 @ 00c1b464
00c1b464	paciasp
00c1b468	stp x29,x30,[sp, #-0x60]!
00c1b46c	stp x28,x27,[sp, #0x10]
00c1b470	stp x26,x25,[sp, #0x20]
00c1b474	stp x24,x23,[sp, #0x30]
00c1b478	stp x22,x21,[sp, #0x40]
00c1b47c	stp x20,x19,[sp, #0x50]
00c1b480	mov x29,sp
00c1b484	ldr x8,[x0, #0x8]
00c1b488	cbz x8,0x00c1b668
00c1b48c	ldr x24,[x1, #0x8]
00c1b490	mov x19,x0
00c1b494	mov x20,x1
00c1b498	mov x22,xzr
00c1b49c	mov w23,#0x1
00c1b4a0	mov w25,#0x28
00c1b4a4	mov w26,#0x29
00c1b4a8	mov w27,#0x202c
00c1b4ac	b 0x00c1b4c4
00c1b4b0	str x24,[x20, #0x8]
00c1b4b4	ldr x8,[x19, #0x8]
00c1b4b8	add x22,x22,#0x1
00c1b4bc	cmp x22,x8
00c1b4c0	b.eq 0x00c1b668
00c1b4c4	mov x28,x24
00c1b4c8	tbnz w23,#0x0,0x00c1b51c
00c1b4cc	ldr x8,[x20, #0x10]
00c1b4d0	add x9,x24,#0x2
00c1b4d4	ldr x0,[x20]
00c1b4d8	cmp x9,x8
00c1b4dc	b.ls 0x00c1b508
00c1b4e0	lsl x8,x8,#0x1
00c1b4e4	add x9,x24,#0x3e2
00c1b4e8	cmp x8,x9
00c1b4ec	csel x1,x8,x9,hi
00c1b4f0	str x1,[x20, #0x10]
00c1b4f4	bl 0x00c30950
00c1b4f8	str x0,[x20]
00c1b4fc	cbz x0,0x00c1b688
00c1b500	ldr x8,[x20, #0x8]
00c1b504	b 0x00c1b50c
00c1b508	mov x8,x24
00c1b50c	strh w27,[x0, x8#0x0]
00c1b510	ldr x8,[x20, #0x8]
00c1b514	add x28,x8,#0x2
00c1b518	str x28,[x20, #0x8]
00c1b51c	ldr x8,[x19]
00c1b520	ldr x21,[x8, x22, LSL #0x3]
00c1b524	ldurh w8,[x21, #0x9]
00c1b528	ubfx w8,w8,#0x1,#0x5
00c1b52c	cmp w8,#0x9
00c1b530	b.cs 0x00c1b570
00c1b534	ldr x8,[x21]
00c1b538	mov x0,x21
00c1b53c	mov x1,x20
00c1b540	ldr x8,[x8, #0x20]
00c1b544	blr x8
00c1b548	ldurh w8,[x21, #0x9]
00c1b54c	and w8,w8,#0xc0
00c1b550	cmp w8,#0x40
00c1b554	b.eq 0x00c1b650
00c1b558	ldr x8,[x21]
00c1b55c	mov x0,x21
00c1b560	mov x1,x20
00c1b564	ldr x8,[x8, #0x28]
00c1b568	blr x8
00c1b56c	b 0x00c1b650
00c1b570	ldr w10,[x20, #0x20]
00c1b574	ldr x9,[x20, #0x10]
00c1b578	add x8,x28,#0x1
00c1b57c	ldr x0,[x20]
00c1b580	add w10,w10,#0x1
00c1b584	cmp x8,x9
00c1b588	str w10,[x20, #0x20]
00c1b58c	b.ls 0x00c1b5bc
00c1b590	lsl x8,x9,#0x1
00c1b594	add x9,x28,#0x3e1
00c1b598	cmp x8,x9
00c1b59c	csel x1,x8,x9,hi
00c1b5a0	str x1,[x20, #0x10]
00c1b5a4	bl 0x00c30950
00c1b5a8	str x0,[x20]
00c1b5ac	cbz x0,0x00c1b690
00c1b5b0	ldr x9,[x20, #0x8]
00c1b5b4	add x8,x9,#0x1
00c1b5b8	b 0x00c1b5c0
00c1b5bc	mov x9,x28
00c1b5c0	str x8,[x20, #0x8]
00c1b5c4	ldr x8,[x21]
00c1b5c8	mov x1,x20
00c1b5cc	strb w25,[x0, x9]
00c1b5d0	mov x0,x21
00c1b5d4	ldr x8,[x8, #0x20]
00c1b5d8	blr x8
00c1b5dc	ldurh w8,[x21, #0x9]
00c1b5e0	and w8,w8,#0xc0
00c1b5e4	cmp w8,#0x40
00c1b5e8	b.eq 0x00c1b600
00c1b5ec	ldr x8,[x21]
00c1b5f0	mov x0,x21
00c1b5f4	mov x1,x20
00c1b5f8	ldr x8,[x8, #0x28]
00c1b5fc	blr x8
00c1b600	ldp x8,x10,[x20, #0x8]
00c1b604	ldr w11,[x20, #0x20]
00c1b608	ldr x0,[x20]
00c1b60c	sub w11,w11,#0x1
00c1b610	add x9,x8,#0x1
00c1b614	str w11,[x20, #0x20]
00c1b618	cmp x9,x10
00c1b61c	b.ls 0x00c1b648
00c1b620	lsl x9,x10,#0x1
00c1b624	add x8,x8,#0x3e1
00c1b628	cmp x9,x8
00c1b62c	csel x1,x9,x8,hi
00c1b630	str x1,[x20, #0x10]
00c1b634	bl 0x00c30950
00c1b638	str x0,[x20]
00c1b63c	cbz x0,0x00c1b68c
00c1b640	ldr x8,[x20, #0x8]
00c1b644	add x9,x8,#0x1
00c1b648	str x9,[x20, #0x8]
00c1b64c	strb w26,[x0, x8]
00c1b650	ldr x8,[x20, #0x8]
00c1b654	cmp x28,x8
00c1b658	b.eq 0x00c1b4b0
00c1b65c	mov w23,wzr
00c1b660	mov x24,x8
00c1b664	b 0x00c1b4b4
00c1b668	ldp x20,x19,[sp, #0x50]
00c1b66c	ldp x22,x21,[sp, #0x40]
00c1b670	ldp x24,x23,[sp, #0x30]
00c1b674	ldp x26,x25,[sp, #0x20]
00c1b678	ldp x28,x27,[sp, #0x10]
00c1b67c	ldp x29,x30,[sp], #0x60
00c1b680	autiasp
00c1b684	ret
00c1b688	bl 0x00c30b40
00c1b68c	bl 0x00c30b40
00c1b690	bl 0x00c30b40
