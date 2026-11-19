; curl_multi_perform @ 0092c424
0092c424	sub sp,sp,#0xf0
0092c428	stp x28,x27,[sp, #0x90]
0092c42c	stp x26,x25,[sp, #0xa0]
0092c430	stp x24,x23,[sp, #0xb0]
0092c434	stp x22,x21,[sp, #0xc0]
0092c438	stp x20,x19,[sp, #0xd0]
0092c43c	stp x29,x30,[sp, #0xe0]
0092c440	add x29,sp,#0xe0
0092c444	mrs x20,tpidr_el0
0092c448	ldr x8,[x20, #0x28]
0092c44c	mov x23,x1
0092c450	mov x19,x0
0092c454	stur x8,[x29, #-0x58]
0092c458	bl 0x00941cb8
0092c45c	stp x0,x1,[sp, #0x28]
0092c460	cbz x19,0x0092c548
0092c464	ldr w8,[x19]
0092c468	mov w9,#0xab1e
0092c46c	movk w9,#0xb, LSL #16
0092c470	cmp w8,w9
0092c474	b.ne 0x0092c548
0092c478	ldrb w8,[x19, #0x231]
0092c47c	tbnz w8,#0x2,0x0092c580
0092c480	movi v0.2D,#0x0
0092c484	str xzr,[sp, #0x58]
0092c488	stur q0,[sp, #0x48]
0092c48c	stur q0,[sp, #0x38]
0092c490	ldr x22,[x19, #0x8]
0092c494	str x20,[sp, #0x10]
0092c498	cbz x22,0x0092c588
0092c49c	mov w21,wzr
0092c4a0	mov w24,#0x1
0092c4a4	ldr x8,[x19, #0x1d8]
0092c4a8	ldr x25,[x22, #0x10]
0092c4ac	cmp x22,x8
0092c4b0	b.eq 0x0092c538
0092c4b4	add x20,x22,#0xa82
0092c4b8	ldr x8,[x20]
0092c4bc	ldrb w9,[sp, #0x58]
0092c4c0	ubfx x10,x8,#0x1f,#0x1
0092c4c4	cmp w10,w9
0092c4c8	b.eq 0x0092c520
0092c4cc	cbnz w9,0x0092c4e4
0092c4d0	mov w0,#0xd
0092c4d4	add x1,sp,#0x38
0092c4d8	mov x2,xzr
0092c4dc	bl 0x00c31b20
0092c4e0	ldr x8,[x20]
0092c4e4	ubfx x9,x8,#0x1f,#0x1
0092c4e8	strb w9,[sp, #0x58]
0092c4ec	tbnz w8,#0x1f,0x0092c520
0092c4f0	mov w0,#0xd
0092c4f4	add x2,sp,#0x38
0092c4f8	mov x1,xzr
0092c4fc	bl 0x00c31b20
0092c500	ldur q0,[sp, #0x38]
0092c504	ldur q1,[sp, #0x48]
0092c508	mov w0,#0xd
0092c50c	add x1,sp,#0x60
0092c510	mov x2,xzr
0092c514	stp q0,q1,[sp, #0x60]
0092c518	str x24,[sp, #0x68]
0092c51c	bl 0x00c31b20
0092c520	add x1,sp,#0x28
0092c524	mov x0,x19
0092c528	mov x2,x22
0092c52c	bl 0x0092c7cc
0092c530	cmp w0,#0x0
0092c534	csel w21,w21,w0,eq
0092c538	mov x22,x25
0092c53c	cbnz x25,0x0092c4a4
0092c540	ldrb w8,[sp, #0x58]
0092c544	b 0x0092c590
0092c548	mov w21,#0x1
0092c54c	ldr x8,[x20, #0x28]
0092c550	ldur x9,[x29, #-0x58]
0092c554	cmp x8,x9
0092c558	b.ne 0x0092c7c8
0092c55c	mov w0,w21
0092c560	ldp x29,x30,[sp, #0xe0]
0092c564	ldp x20,x19,[sp, #0xd0]
0092c568	ldp x22,x21,[sp, #0xc0]
0092c56c	ldp x24,x23,[sp, #0xb0]
0092c570	ldp x26,x25,[sp, #0xa0]
0092c574	ldp x28,x27,[sp, #0x90]
0092c578	add sp,sp,#0xf0
0092c57c	ret
0092c580	mov w21,#0x8
0092c584	b 0x0092c54c
0092c588	mov w8,wzr
0092c58c	mov w21,wzr
0092c590	ldr x9,[x19, #0x1d8]
0092c594	add x20,x9,#0xa82
0092c598	ldr x9,[x20]
0092c59c	ubfx x10,x9,#0x1f,#0x1
0092c5a0	cmp w10,w8
0092c5a4	b.eq 0x0092c600
0092c5a8	cbnz w8,0x0092c5c0
0092c5ac	mov w0,#0xd
0092c5b0	add x1,sp,#0x38
0092c5b4	mov x2,xzr
0092c5b8	bl 0x00c31b20
0092c5bc	ldr x9,[x20]
0092c5c0	ubfx x8,x9,#0x1f,#0x1
0092c5c4	strb w8,[sp, #0x58]
0092c5c8	tbnz w9,#0x1f,0x0092c600
0092c5cc	mov w0,#0xd
0092c5d0	add x2,sp,#0x38
0092c5d4	mov x1,xzr
0092c5d8	bl 0x00c31b20
0092c5dc	ldur q0,[sp, #0x38]
0092c5e0	ldur q1,[sp, #0x48]
0092c5e4	mov w8,#0x1
0092c5e8	mov w0,#0xd
0092c5ec	add x1,sp,#0x60
0092c5f0	mov x2,xzr
0092c5f4	stp q0,q1,[sp, #0x60]
0092c5f8	str x8,[sp, #0x68]
0092c5fc	bl 0x00c31b20
0092c600	mov x0,x19
0092c604	str x23,[sp, #0x8]
0092c608	bl 0x00910f38
0092c60c	ldrb w8,[sp, #0x58]
0092c610	cbnz w8,0x0092c624
0092c614	mov w0,#0xd
0092c618	add x1,sp,#0x38
0092c61c	mov x2,xzr
0092c620	bl 0x00c31b20
0092c624	add x8,x19,#0x40
0092c628	str x8,[sp, #0x18]
0092c62c	ldr x2,[x19, #0xd0]
0092c630	ldp x0,x1,[sp, #0x28]
0092c634	add x3,sp,#0x60
0092c638	bl 0x0094152c
0092c63c	str x0,[x19, #0xd0]
0092c640	ldr x8,[sp, #0x60]
0092c644	cbz x8,0x0092c79c
0092c648	ldr x24,[x8, #0x30]
0092c64c	ldr w8,[x24, #0x58]
0092c650	cmp w8,#0x1
0092c654	b.ne 0x0092c70c
0092c658	add x1,sp,#0x28
0092c65c	add x2,sp,#0x24
0092c660	add x3,sp,#0x20
0092c664	mov x0,x24
0092c668	bl 0x0092ddf8
0092c66c	tbz w0,#0x0,0x0092c704
0092c670	cbz x24,0x0092c6a0
0092c674	ldrb w8,[x24, #0xa85]
0092c678	tbz w8,#0x4,0x0092c6a0
0092c67c	ldr x8,[x24, #0x12a0]
0092c680	cbz x8,0x0092c690
0092c684	ldr w8,[x8, #0x8]
0092c688	cmp w8,#0x1
0092c68c	b.lt 0x0092c6a0
0092c690	adrp x1,0x2db000
0092c694	mov x0,x24
0092c698	add x1,x1,#0x286
0092c69c	bl 0x00904c98
0092c6a0	str xzr,[x24, #0x10]
0092c6a4	ldr x8,[x19, #0x8]
0092c6a8	cbz x8,0x0092c6bc
0092c6ac	ldr x8,[x19, #0x10]
0092c6b0	str x24,[x8, #0x10]
0092c6b4	str x8,[x24, #0x18]
0092c6b8	b 0x0092c6c4
0092c6bc	str xzr,[x24, #0x18]
0092c6c0	str x24,[x19, #0x8]
0092c6c4	str x24,[x19, #0x10]
0092c6c8	ldr w8,[x24, #0x58]
0092c6cc	cmp w8,#0x3
0092c6d0	b.eq 0x0092c6e4
0092c6d4	orr w8,wzr,#0x3
0092c6d8	mov x0,x24
0092c6dc	str w8,[x24, #0x58]
0092c6e0	bl 0x009425cc
0092c6e4	ldr x0,[sp, #0x18]
0092c6e8	add x1,x24,#0x28
0092c6ec	mov x2,xzr
0092c6f0	bl 0x00925d80
0092c6f4	mov w2,#0x8
0092c6f8	mov x0,x24
0092c6fc	mov x1,xzr
0092c700	bl 0x0092aff8
0092c704	ldr x8,[sp, #0x60]
0092c708	ldr x24,[x8, #0x30]
0092c70c	ldr x23,[x24, #0xe10]
0092c710	cbz x23,0x0092c78c
0092c714	ldp x25,x27,[sp, #0x28]
0092c718	add x20,x24,#0xdc8
0092c71c	add x28,x24,#0xe10
0092c720	ldr x22,[x23]
0092c724	ldr x26,[x23, #0x10]
0092c728	mov x2,x25
0092c72c	mov x3,x27
0092c730	ldp x0,x1,[x22, #0x18]
0092c734	bl 0x00941e38
0092c738	cmp x0,#0x0
0092c73c	b.gt 0x0092c758
0092c740	mov x0,x28
0092c744	mov x1,x23
0092c748	mov x2,xzr
0092c74c	bl 0x00925d80
0092c750	mov x23,x26
0092c754	cbnz x26,0x0092c720
0092c758	ldr x8,[x28]
0092c75c	cbz x8,0x0092c78c
0092c760	ldur q0,[x22, #0x18]
0092c764	add x3,x24,#0xdd8
0092c768	str q0,[x20]
0092c76c	ldr x2,[x19, #0xd0]
0092c770	ldr x0,[x24, #0xdc8]
0092c774	ldr x1,[x24, #0xdd0]
0092c778	bl 0x00941454
0092c77c	str x0,[x19, #0xd0]
0092c780	ldr x8,[sp, #0x60]
0092c784	cbnz x8,0x0092c62c
0092c788	b 0x0092c79c
0092c78c	str xzr,[x24, #0xdc8]
0092c790	str wzr,[x24, #0xdd0]
0092c794	ldr x8,[sp, #0x60]
0092c798	cbnz x8,0x0092c62c
0092c79c	ldr x9,[sp, #0x8]
0092c7a0	cbz x9,0x0092c7ac
0092c7a4	ldr w8,[x19, #0x1c]
0092c7a8	str w8,[x9]
0092c7ac	ldr x20,[sp, #0x10]
0092c7b0	cmp w21,#0x0
0092c7b4	b.gt 0x0092c54c
0092c7b8	mov x0,x19
0092c7bc	bl 0x0092b1f4
0092c7c0	mov w21,w0
0092c7c4	b 0x0092c54c
0092c7c8	bl 0x00c2fec0
