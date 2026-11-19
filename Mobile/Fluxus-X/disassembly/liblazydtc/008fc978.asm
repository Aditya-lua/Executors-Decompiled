; std::__ndk1::vector<cpr::Pair,std::__ndk1::allocator<cpr::Pair>>::__push_back_slow_path<cpr::Pair_const&> @ 008fc978
008fc978	str x25,[sp, #-0x50]!
008fc97c	stp x24,x23,[sp, #0x10]
008fc980	stp x22,x21,[sp, #0x20]
008fc984	stp x20,x19,[sp, #0x30]
008fc988	stp x29,x30,[sp, #0x40]
008fc98c	add x29,sp,#0x40
008fc990	ldp x9,x8,[x0]
008fc994	orr x10,xzr,#-0x5555555555555556
008fc998	movk x10,#0xaaab
008fc99c	orr x23,xzr,#0x5555555555555555
008fc9a0	sub x8,x8,x9
008fc9a4	asr x8,x8,#0x4
008fc9a8	mul x20,x8,x10
008fc9ac	movk x23,#0x555, LSL #48
008fc9b0	add x8,x20,#0x1
008fc9b4	mov x19,x0
008fc9b8	cmp x8,x23
008fc9bc	mov x21,x1
008fc9c0	b.hi 0x008fcb08
008fc9c4	ldr x11,[x19, #0x10]
008fc9c8	sub x9,x11,x9
008fc9cc	asr x9,x9,#0x4
008fc9d0	mul x9,x9,x10
008fc9d4	orr x10,xzr,#-0x5555555555555556
008fc9d8	movk x10,#0xaaa9
008fc9dc	movk x10,#0x2aa, LSL #48
008fc9e0	cmp x9,x10
008fc9e4	b.hi 0x008fc9f8
008fc9e8	lsl x9,x9,#0x1
008fc9ec	cmp x9,x8
008fc9f0	csel x23,x8,x9,cc
008fc9f4	cbz x23,0x008fcafc
008fc9f8	add x8,x23,x23, LSL #0x1
008fc9fc	lsl x0,x8,#0x4
008fca00	bl 0x00c2fed0
008fca04	mov x22,x0
008fca08	mov x24,x0
008fca0c	orr w25,wzr,#0x30
008fca10	madd x20,x20,x25,x24
008fca14	mov x0,x20
008fca18	mov x1,x21
008fca1c	bl 0x00c30f20
008fca20	ldp x22,x10,[x19]
008fca24	nop
008fca28	madd x8,x23,x25,x24
008fca2c	add x9,x20,#0x30
008fca30	cmp x10,x22
008fca34	b.eq 0x008fca80
008fca38	ldur x11,[x10, #-0x20]
008fca3c	stur x11,[x20, #-0x20]
008fca40	ldur q0,[x10, #-0x30]
008fca44	stur q0,[x20, #-0x30]
008fca48	ldur x11,[x10, #-0x8]
008fca4c	stp xzr,xzr,[x10, #-0x28]
008fca50	stur xzr,[x10, #-0x30]
008fca54	stur x11,[x20, #-0x8]
008fca58	ldur q0,[x10, #-0x18]
008fca5c	stur q0,[x20, #-0x18]
008fca60	stp xzr,xzr,[x10, #-0x18]
008fca64	stur xzr,[x10, #-0x8]
008fca68	sub x10,x10,#0x30
008fca6c	cmp x22,x10
008fca70	sub x20,x20,#0x30
008fca74	b.ne 0x008fca38
008fca78	ldp x21,x22,[x19]
008fca7c	b 0x008fca84
008fca80	mov x21,x22
008fca84	cmp x22,x21
008fca88	stp x20,x9,[x19]
008fca8c	str x8,[x19, #0x10]
008fca90	b.eq 0x008fcac4
008fca94	ldurb w8,[x22, #-0x18]
008fca98	tbz w8,#0x0,0x008fcaa4
008fca9c	ldur x0,[x22, #-0x8]
008fcaa0	bl 0x00c301d0
008fcaa4	ldurb w8,[x22, #-0x30]
008fcaa8	sub x19,x22,#0x30
008fcaac	tbz w8,#0x0,0x008fcab8
008fcab0	ldur x0,[x22, #-0x20]
008fcab4	bl 0x00c301d0
008fcab8	cmp x21,x19
008fcabc	mov x22,x19
008fcac0	b.ne 0x008fca94
008fcac4	cbz x21,0x008fcae4
008fcac8	mov x0,x21
008fcacc	ldp x29,x30,[sp, #0x40]
008fcad0	ldp x20,x19,[sp, #0x30]
008fcad4	ldp x22,x21,[sp, #0x20]
008fcad8	ldp x24,x23,[sp, #0x10]
008fcadc	ldr x25,[sp], #0x50
008fcae0	b 0x00c301d0
008fcae4	ldp x29,x30,[sp, #0x40]
008fcae8	ldp x20,x19,[sp, #0x30]
008fcaec	ldp x22,x21,[sp, #0x20]
008fcaf0	ldp x24,x23,[sp, #0x10]
008fcaf4	ldr x25,[sp], #0x50
008fcaf8	ret
008fcafc	mov x22,xzr
008fcb00	mov x24,xzr
008fcb04	b 0x008fca0c
008fcb08	mov x0,x19
008fcb0c	bl 0x00c30bd0
