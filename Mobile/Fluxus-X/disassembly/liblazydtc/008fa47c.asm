; std::__ndk1::__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>::push_back @ 008fa47c
008fa47c	stp x24,x23,[sp, #-0x40]!
008fa480	stp x22,x21,[sp, #0x10]
008fa484	stp x20,x19,[sp, #0x20]
008fa488	stp x29,x30,[sp, #0x30]
008fa48c	add x29,sp,#0x30
008fa490	ldp x23,x8,[x0, #0x10]
008fa494	mov x19,x0
008fa498	mov x20,x1
008fa49c	cmp x23,x8
008fa4a0	b.ne 0x008fa604
008fa4a4	ldp x22,x21,[x19]
008fa4a8	subs x9,x21,x22
008fa4ac	b.ls 0x008fa4f4
008fa4b0	asr x8,x9,#0x3
008fa4b4	add x9,x8,#0x1
008fa4b8	add x10,x8,#0x2
008fa4bc	cmp x9,#0x0
008fa4c0	csinc x8,x10,x8,lt
008fa4c4	subs x2,x23,x21
008fa4c8	asr x8,x8,#0x1
008fa4cc	sub x22,x21,x8, LSL #0x3
008fa4d0	asr x23,x2,#0x3
008fa4d4	b.eq 0x008fa518
008fa4d8	mov x0,x22
008fa4dc	mov x1,x21
008fa4e0	neg x24,x8
008fa4e4	bl 0x00c2ff60
008fa4e8	ldr x8,[x19, #0x8]
008fa4ec	add x8,x8,x24, LSL #0x3
008fa4f0	b 0x008fa51c
008fa4f4	subs x8,x8,x22
008fa4f8	asr x8,x8,#0x2
008fa4fc	csinc x24,x8,xzr,ne
008fa500	cbz x24,0x008fa528
008fa504	lsr x8,x24,#0x3d
008fa508	cbnz x8,0x008fa62c
008fa50c	lsl x0,x24,#0x3
008fa510	bl 0x00c2fed0
008fa514	b 0x008fa52c
008fa518	mov x8,x22
008fa51c	add x23,x22,x23, LSL #0x3
008fa520	stp x8,x23,[x19, #0x8]
008fa524	b 0x008fa604
008fa528	mov x0,xzr
008fa52c	lsr x13,x24,#0x2
008fa530	cmp x21,x23
008fa534	add x9,x0,x13, LSL #0x3
008fa538	add x8,x0,x24, LSL #0x3
008fa53c	b.eq 0x008fa568
008fa540	sub x10,x23,#0x8
008fa544	sub x10,x10,x21
008fa548	lsr x14,x10,#0x3
008fa54c	add x11,x13,x14
008fa550	add x12,x14,#0x1
008fa554	cmp x12,#0x4
008fa558	add x10,x11,#0x1
008fa55c	b.cs 0x008fa570
008fa560	mov x11,x9
008fa564	b 0x008fa5d4
008fa568	mov x23,x9
008fa56c	b 0x008fa5ec
008fa570	add x14,x21,x14, LSL #0x3
008fa574	add x14,x14,#0x8
008fa578	cmp x9,x14
008fa57c	b.cs 0x008fa594
008fa580	add x11,x0,x11, LSL #0x3
008fa584	add x11,x11,#0x8
008fa588	cmp x21,x11
008fa58c	mov x11,x9
008fa590	b.cc 0x008fa5d4
008fa594	and x14,x12,#0x3ffffffffffffffc
008fa598	add x13,x0,x13, LSL #0x3
008fa59c	lsl x16,x14,#0x3
008fa5a0	add x15,x21,#0x10
008fa5a4	add x11,x9,x16
008fa5a8	add x21,x21,x16
008fa5ac	add x13,x13,#0x10
008fa5b0	mov x16,x14
008fa5b4	ldp q0,q1,[x15, #-0x10]
008fa5b8	add x15,x15,#0x20
008fa5bc	subs x16,x16,#0x4
008fa5c0	stp q0,q1,[x13, #-0x10]
008fa5c4	add x13,x13,#0x20
008fa5c8	b.ne 0x008fa5b4
008fa5cc	cmp x12,x14
008fa5d0	b.eq 0x008fa5e4
008fa5d4	ldr x12,[x21], #0x8
008fa5d8	cmp x23,x21
008fa5dc	str x12,[x11], #0x8
008fa5e0	b.ne 0x008fa5d4
008fa5e4	ldr x22,[x19]
008fa5e8	add x23,x0,x10, LSL #0x3
008fa5ec	stp x0,x9,[x19]
008fa5f0	stp x23,x8,[x19, #0x10]
008fa5f4	cbz x22,0x008fa604
008fa5f8	mov x0,x22
008fa5fc	bl 0x00c301d0
008fa600	ldr x23,[x19, #0x10]
008fa604	ldr x8,[x20]
008fa608	str x8,[x23]
008fa60c	ldr x8,[x19, #0x10]
008fa610	add x8,x8,#0x8
008fa614	str x8,[x19, #0x10]
008fa618	ldp x29,x30,[sp, #0x30]
008fa61c	ldp x20,x19,[sp, #0x20]
008fa620	ldp x22,x21,[sp, #0x10]
008fa624	ldp x24,x23,[sp], #0x40
008fa628	ret
008fa62c	mov w0,#0x10
008fa630	bl 0x00c30000
008fa634	mov x19,x0
008fa638	adrp x1,0x2ad000
008fa63c	add x1,x1,#0x51
008fa640	bl 0x00c30040
008fa644	adrp x8,0xcb4000
008fa648	ldr x8,[x8, #0x980]
008fa64c	adrp x1,0xcb4000
008fa650	adrp x2,0xcb4000
008fa654	mov x0,x19
008fa658	add x8,x8,#0x10
008fa65c	str x8,[x19]
008fa660	ldr x1,[x1, #0x970]
008fa664	ldr x2,[x2, #0x978]
008fa668	bl 0x00c30020
