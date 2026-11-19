; std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::__emplace_back_slow_path<cpr::File_const&> @ 008fd4f8
008fd4f8	str x25,[sp, #-0x50]!
008fd4fc	stp x24,x23,[sp, #0x10]
008fd500	stp x22,x21,[sp, #0x20]
008fd504	stp x20,x19,[sp, #0x30]
008fd508	stp x29,x30,[sp, #0x40]
008fd50c	add x29,sp,#0x40
008fd510	ldp x9,x8,[x0]
008fd514	orr x10,xzr,#-0x5555555555555556
008fd518	movk x10,#0xaaab
008fd51c	orr x23,xzr,#0x5555555555555555
008fd520	sub x8,x8,x9
008fd524	asr x8,x8,#0x4
008fd528	mul x20,x8,x10
008fd52c	movk x23,#0x555, LSL #48
008fd530	add x8,x20,#0x1
008fd534	mov x19,x0
008fd538	cmp x8,x23
008fd53c	mov x21,x1
008fd540	b.hi 0x008fd688
008fd544	ldr x11,[x19, #0x10]
008fd548	sub x9,x11,x9
008fd54c	asr x9,x9,#0x4
008fd550	mul x9,x9,x10
008fd554	orr x10,xzr,#-0x5555555555555556
008fd558	movk x10,#0xaaa9
008fd55c	movk x10,#0x2aa, LSL #48
008fd560	cmp x9,x10
008fd564	b.hi 0x008fd578
008fd568	lsl x9,x9,#0x1
008fd56c	cmp x9,x8
008fd570	csel x23,x8,x9,cc
008fd574	cbz x23,0x008fd67c
008fd578	add x8,x23,x23, LSL #0x1
008fd57c	lsl x0,x8,#0x4
008fd580	bl 0x00c2fed0
008fd584	mov x22,x0
008fd588	mov x24,x0
008fd58c	orr w25,wzr,#0x30
008fd590	madd x20,x20,x25,x24
008fd594	mov x0,x20
008fd598	mov x1,x21
008fd59c	bl 0x00c31060
008fd5a0	ldp x22,x10,[x19]
008fd5a4	nop
008fd5a8	madd x8,x23,x25,x24
008fd5ac	add x9,x20,#0x30
008fd5b0	cmp x10,x22
008fd5b4	b.eq 0x008fd600
008fd5b8	ldur x11,[x10, #-0x20]
008fd5bc	stur x11,[x20, #-0x20]
008fd5c0	ldur q0,[x10, #-0x30]
008fd5c4	stur q0,[x20, #-0x30]
008fd5c8	ldur x11,[x10, #-0x8]
008fd5cc	stp xzr,xzr,[x10, #-0x28]
008fd5d0	stur xzr,[x10, #-0x30]
008fd5d4	stur x11,[x20, #-0x8]
008fd5d8	ldur q0,[x10, #-0x18]
008fd5dc	stur q0,[x20, #-0x18]
008fd5e0	stp xzr,xzr,[x10, #-0x18]
008fd5e4	stur xzr,[x10, #-0x8]
008fd5e8	sub x10,x10,#0x30
008fd5ec	cmp x22,x10
008fd5f0	sub x20,x20,#0x30
008fd5f4	b.ne 0x008fd5b8
008fd5f8	ldp x21,x22,[x19]
008fd5fc	b 0x008fd604
008fd600	mov x21,x22
008fd604	cmp x22,x21
008fd608	stp x20,x9,[x19]
008fd60c	str x8,[x19, #0x10]
008fd610	b.eq 0x008fd644
008fd614	ldurb w8,[x22, #-0x18]
008fd618	tbz w8,#0x0,0x008fd624
008fd61c	ldur x0,[x22, #-0x8]
008fd620	bl 0x00c301d0
008fd624	ldurb w8,[x22, #-0x30]
008fd628	sub x19,x22,#0x30
008fd62c	tbz w8,#0x0,0x008fd638
008fd630	ldur x0,[x22, #-0x20]
008fd634	bl 0x00c301d0
008fd638	cmp x21,x19
008fd63c	mov x22,x19
008fd640	b.ne 0x008fd614
008fd644	cbz x21,0x008fd664
008fd648	mov x0,x21
008fd64c	ldp x29,x30,[sp, #0x40]
008fd650	ldp x20,x19,[sp, #0x30]
008fd654	ldp x22,x21,[sp, #0x20]
008fd658	ldp x24,x23,[sp, #0x10]
008fd65c	ldr x25,[sp], #0x50
008fd660	b 0x00c301d0
008fd664	ldp x29,x30,[sp, #0x40]
008fd668	ldp x20,x19,[sp, #0x30]
008fd66c	ldp x22,x21,[sp, #0x20]
008fd670	ldp x24,x23,[sp, #0x10]
008fd674	ldr x25,[sp], #0x50
008fd678	ret
008fd67c	mov x22,xzr
008fd680	mov x24,xzr
008fd684	b 0x008fd58c
008fd688	mov x0,x19
008fd68c	bl 0x00c30bd0
