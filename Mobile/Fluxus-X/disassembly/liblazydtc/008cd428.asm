; FUN_008cd428 @ 008cd428
008cd428	sub sp,sp,#0x60
008cd42c	stp x29,x30,[sp, #0x20]
008cd430	stp x24,x23,[sp, #0x30]
008cd434	stp x22,x21,[sp, #0x40]
008cd438	stp x20,x19,[sp, #0x50]
008cd43c	add x29,sp,#0x20
008cd440	mrs x23,tpidr_el0
008cd444	mov x20,x3
008cd448	mov x21,x2
008cd44c	ldr x8,[x23, #0x28]
008cd450	mov x19,x1
008cd454	mov x22,x0
008cd458	stur x8,[x29, #-0x8]
008cd45c	ldr w8,[x2, #0xc]
008cd460	ldr w9,[x3, #0xc]
008cd464	cmp w8,#0x4
008cd468	csel x10,x2,xzr,eq
008cd46c	cmp x3,#0x0
008cd470	ccmp w9,#0x4,#0x0,ne
008cd474	cset w11,eq
008cd478	cbz x10,0x008cd4ac
008cd47c	cbz w11,0x008cd4ac
008cd480	ldr s0,[x10]
008cd484	mov w8,#0x4
008cd488	fneg s0,s0
008cd48c	str s0,[x19]
008cd490	ldr s0,[x10, #0x4]
008cd494	fneg s0,s0
008cd498	str s0,[x19, #0x4]
008cd49c	ldr s0,[x10, #0x8]
008cd4a0	fneg s0,s0
008cd4a4	str s0,[x19, #0x8]
008cd4a8	b 0x008cd578
008cd4ac	cbz x10,0x008cd4d4
008cd4b0	cmp w9,#0x3
008cd4b4	b.eq 0x008cd508
008cd4b8	cmp w9,#0x5
008cd4bc	b.ne 0x008cd508
008cd4c0	ldr x8,[x20]
008cd4c4	add x1,sp,#0x10
008cd4c8	add x0,x8,#0x18
008cd4cc	bl 0x008b93c8
008cd4d0	b 0x008cd508
008cd4d4	cmp w8,#0x3
008cd4d8	eor w9,w11,#0x1
008cd4dc	csinc w9,w9,wzr,ne
008cd4e0	tbnz w9,#0x0,0x008cd508
008cd4e4	cmp w8,#0x5
008cd4e8	b.ne 0x008cd508
008cd4ec	ldr x8,[x21]
008cd4f0	add x1,sp,#0x10
008cd4f4	add x0,x8,#0x18
008cd4f8	bl 0x008b93c8
008cd4fc	cbz w0,0x008cd508
008cd500	ldr d0,[sp, #0x10]
008cd504	str d0,[sp, #0x8]
008cd508	ldr w8,[x21, #0xc]
008cd50c	mov x24,x21
008cd510	cmp w8,#0x3
008cd514	b.eq 0x008cd540
008cd518	cmp w8,#0x5
008cd51c	b.ne 0x008cd580
008cd520	ldr x8,[x21]
008cd524	add x1,sp,#0x10
008cd528	add x0,x8,#0x18
008cd52c	bl 0x008b93c8
008cd530	cbz w0,0x008cd580
008cd534	ldr d0,[sp, #0x10]
008cd538	add x24,sp,#0x8
008cd53c	str d0,[sp, #0x8]
008cd540	ldr w8,[x20, #0xc]
008cd544	cmp w8,#0x3
008cd548	b.eq 0x008cd568
008cd54c	cmp w8,#0x5
008cd550	b.ne 0x008cd580
008cd554	ldr x8,[x20]
008cd558	add x1,sp,#0x10
008cd55c	add x0,x8,#0x18
008cd560	bl 0x008b93c8
008cd564	cbz w0,0x008cd580
008cd568	ldr d0,[x24]
008cd56c	mov w8,#0x3
008cd570	fneg d0,d0
008cd574	str d0,[x19]
008cd578	str w8,[x19, #0xc]
008cd57c	b 0x008cd5c8
008cd580	mov x0,x22
008cd584	mov x1,x21
008cd588	mov w2,#0xf
008cd58c	bl 0x008be028
008cd590	ldr w8,[x0, #0xc]
008cd594	cbnz w8,0x008cd5b0
008cd598	mov x0,x22
008cd59c	mov x1,x20
008cd5a0	mov w2,#0xf
008cd5a4	bl 0x008be028
008cd5a8	ldr w8,[x0, #0xc]
008cd5ac	cbz w8,0x008cd5f0
008cd5b0	mov x2,x0
008cd5b4	mov x0,x22
008cd5b8	mov x1,x19
008cd5bc	mov x3,x21
008cd5c0	mov x4,x20
008cd5c4	bl 0x008cb070
008cd5c8	ldr x8,[x23, #0x28]
008cd5cc	ldur x9,[x29, #-0x8]
008cd5d0	cmp x8,x9
008cd5d4	b.ne 0x008cd614
008cd5d8	ldp x20,x19,[sp, #0x50]
008cd5dc	ldp x22,x21,[sp, #0x40]
008cd5e0	ldp x24,x23,[sp, #0x30]
008cd5e4	ldp x29,x30,[sp, #0x20]
008cd5e8	add sp,sp,#0x60
008cd5ec	ret
008cd5f0	ldr x8,[x23, #0x28]
008cd5f4	ldur x9,[x29, #-0x8]
008cd5f8	cmp x8,x9
008cd5fc	b.ne 0x008cd614
008cd600	mov x0,x22
008cd604	mov x1,x21
008cd608	mov x2,x20
008cd60c	mov w3,#0xf
008cd610	bl 0x008b3afc
008cd614	bl 0x00c2fec0
