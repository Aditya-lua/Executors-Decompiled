; std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::__push_back_slow_path<cpr::Parameter_const&> @ 008fccc0
008fccc0	str x25,[sp, #-0x50]!
008fccc4	stp x24,x23,[sp, #0x10]
008fccc8	stp x22,x21,[sp, #0x20]
008fcccc	stp x20,x19,[sp, #0x30]
008fccd0	stp x29,x30,[sp, #0x40]
008fccd4	add x29,sp,#0x40
008fccd8	ldp x9,x8,[x0]
008fccdc	orr x10,xzr,#-0x5555555555555556
008fcce0	movk x10,#0xaaab
008fcce4	orr x23,xzr,#0x5555555555555555
008fcce8	sub x8,x8,x9
008fccec	asr x8,x8,#0x4
008fccf0	mul x20,x8,x10
008fccf4	movk x23,#0x555, LSL #48
008fccf8	add x8,x20,#0x1
008fccfc	mov x19,x0
008fcd00	cmp x8,x23
008fcd04	mov x21,x1
008fcd08	b.hi 0x008fce50
008fcd0c	ldr x11,[x19, #0x10]
008fcd10	sub x9,x11,x9
008fcd14	asr x9,x9,#0x4
008fcd18	mul x9,x9,x10
008fcd1c	orr x10,xzr,#-0x5555555555555556
008fcd20	movk x10,#0xaaa9
008fcd24	movk x10,#0x2aa, LSL #48
008fcd28	cmp x9,x10
008fcd2c	b.hi 0x008fcd40
008fcd30	lsl x9,x9,#0x1
008fcd34	cmp x9,x8
008fcd38	csel x23,x8,x9,cc
008fcd3c	cbz x23,0x008fce44
008fcd40	add x8,x23,x23, LSL #0x1
008fcd44	lsl x0,x8,#0x4
008fcd48	bl 0x00c2fed0
008fcd4c	mov x22,x0
008fcd50	mov x24,x0
008fcd54	orr w25,wzr,#0x30
008fcd58	madd x20,x20,x25,x24
008fcd5c	mov x0,x20
008fcd60	mov x1,x21
008fcd64	bl 0x00c30f30
008fcd68	ldp x22,x10,[x19]
008fcd6c	nop
008fcd70	madd x8,x23,x25,x24
008fcd74	add x9,x20,#0x30
008fcd78	cmp x10,x22
008fcd7c	b.eq 0x008fcdc8
008fcd80	ldur x11,[x10, #-0x20]
008fcd84	stur x11,[x20, #-0x20]
008fcd88	ldur q0,[x10, #-0x30]
008fcd8c	stur q0,[x20, #-0x30]
008fcd90	ldur x11,[x10, #-0x8]
008fcd94	stp xzr,xzr,[x10, #-0x28]
008fcd98	stur xzr,[x10, #-0x30]
008fcd9c	stur x11,[x20, #-0x8]
008fcda0	ldur q0,[x10, #-0x18]
008fcda4	stur q0,[x20, #-0x18]
008fcda8	stp xzr,xzr,[x10, #-0x18]
008fcdac	stur xzr,[x10, #-0x8]
008fcdb0	sub x10,x10,#0x30
008fcdb4	cmp x22,x10
008fcdb8	sub x20,x20,#0x30
008fcdbc	b.ne 0x008fcd80
008fcdc0	ldp x21,x22,[x19]
008fcdc4	b 0x008fcdcc
008fcdc8	mov x21,x22
008fcdcc	cmp x22,x21
008fcdd0	stp x20,x9,[x19]
008fcdd4	str x8,[x19, #0x10]
008fcdd8	b.eq 0x008fce0c
008fcddc	ldurb w8,[x22, #-0x18]
008fcde0	tbz w8,#0x0,0x008fcdec
008fcde4	ldur x0,[x22, #-0x8]
008fcde8	bl 0x00c301d0
008fcdec	ldurb w8,[x22, #-0x30]
008fcdf0	sub x19,x22,#0x30
008fcdf4	tbz w8,#0x0,0x008fce00
008fcdf8	ldur x0,[x22, #-0x20]
008fcdfc	bl 0x00c301d0
008fce00	cmp x21,x19
008fce04	mov x22,x19
008fce08	b.ne 0x008fcddc
008fce0c	cbz x21,0x008fce2c
008fce10	mov x0,x21
008fce14	ldp x29,x30,[sp, #0x40]
008fce18	ldp x20,x19,[sp, #0x30]
008fce1c	ldp x22,x21,[sp, #0x20]
008fce20	ldp x24,x23,[sp, #0x10]
008fce24	ldr x25,[sp], #0x50
008fce28	b 0x00c301d0
008fce2c	ldp x29,x30,[sp, #0x40]
008fce30	ldp x20,x19,[sp, #0x30]
008fce34	ldp x22,x21,[sp, #0x20]
008fce38	ldp x24,x23,[sp, #0x10]
008fce3c	ldr x25,[sp], #0x50
008fce40	ret
008fce44	mov x22,xzr
008fce48	mov x24,xzr
008fce4c	b 0x008fcd54
008fce50	mov x0,x19
008fce54	bl 0x00c30bd0
