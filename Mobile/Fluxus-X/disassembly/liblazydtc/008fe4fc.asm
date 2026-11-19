; std::__ndk1::__deque_base<std::__ndk1::function<void()>,std::__ndk1::allocator<std::__ndk1::function<void()>>>::clear @ 008fe4fc
008fe4fc	str x23,[sp, #-0x40]!
008fe500	stp x22,x21,[sp, #0x10]
008fe504	stp x20,x19,[sp, #0x20]
008fe508	stp x29,x30,[sp, #0x30]
008fe50c	add x29,sp,#0x30
008fe510	ldp x8,x9,[x0, #0x8]
008fe514	mov x19,x0
008fe518	cmp x9,x8
008fe51c	b.eq 0x008fe5c8
008fe520	ldr x11,[x19, #0x20]
008fe524	orr x12,xzr,#-0x3f3f3f3f3f3f3f40
008fe528	movk x12,#0xc0c1
008fe52c	mov x20,x19
008fe530	umulh x10,x11,x12
008fe534	lsr x10,x10,#0x6
008fe538	ldr x13,[x8, x10, LSL #0x3]
008fe53c	ldr x14,[x20, #0x28]!
008fe540	mov w15,#0x55
008fe544	msub x16,x10,x15,x11
008fe548	orr w17,wzr,#0x30
008fe54c	add x11,x14,x11
008fe550	umulh x12,x11,x12
008fe554	lsr x12,x12,#0x6
008fe558	ldr x14,[x8, x12, LSL #0x3]
008fe55c	nop
008fe560	msub x11,x12,x15,x11
008fe564	madd x22,x16,x17,x13
008fe568	madd x21,x11,x17,x14
008fe56c	cmp x21,x22
008fe570	b.eq 0x008fe5cc
008fe574	add x23,x8,x10, LSL #0x3
008fe578	ldr x0,[x22, #0x20]
008fe57c	cmp x22,x0
008fe580	b.eq 0x008fe594
008fe584	cbz x0,0x008fe5a0
008fe588	ldr x8,[x0]
008fe58c	ldr x8,[x8, #0x28]
008fe590	b 0x008fe59c
008fe594	ldr x8,[x0]
008fe598	ldr x8,[x8, #0x20]
008fe59c	blr x8
008fe5a0	ldr x8,[x23]
008fe5a4	add x22,x22,#0x30
008fe5a8	sub x8,x22,x8
008fe5ac	cmp x8,#0xff0
008fe5b0	b.ne 0x008fe5b8
008fe5b4	ldr x22,[x23, #0x8]!
008fe5b8	cmp x21,x22
008fe5bc	b.ne 0x008fe578
008fe5c0	ldp x8,x9,[x19, #0x8]
008fe5c4	b 0x008fe5cc
008fe5c8	add x20,x19,#0x28
008fe5cc	sub x9,x9,x8
008fe5d0	asr x9,x9,#0x3
008fe5d4	cmp x9,#0x3
008fe5d8	str xzr,[x20]
008fe5dc	b.cc 0x008fe604
008fe5e0	ldr x0,[x8]
008fe5e4	bl 0x00c301d0
008fe5e8	ldp x8,x9,[x19, #0x8]
008fe5ec	add x8,x8,#0x8
008fe5f0	sub x9,x9,x8
008fe5f4	asr x9,x9,#0x3
008fe5f8	cmp x9,#0x2
008fe5fc	str x8,[x19, #0x8]
008fe600	b.hi 0x008fe5e0
008fe604	cmp x9,#0x1
008fe608	b.eq 0x008fe61c
008fe60c	cmp x9,#0x2
008fe610	b.ne 0x008fe624
008fe614	mov w8,#0x55
008fe618	b 0x008fe620
008fe61c	mov w8,#0x2a
008fe620	str x8,[x19, #0x20]
008fe624	ldp x29,x30,[sp, #0x30]
008fe628	ldp x20,x19,[sp, #0x20]
008fe62c	ldp x22,x21,[sp, #0x10]
008fe630	ldr x23,[sp], #0x40
008fe634	ret
