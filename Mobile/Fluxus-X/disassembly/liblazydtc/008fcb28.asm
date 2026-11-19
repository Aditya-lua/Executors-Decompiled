; std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::__push_back_slow_path<cpr::Parameter> @ 008fcb28
008fcb28	stp x22,x21,[sp, #-0x30]!
008fcb2c	stp x20,x19,[sp, #0x10]
008fcb30	stp x29,x30,[sp, #0x20]
008fcb34	add x29,sp,#0x20
008fcb38	ldp x9,x8,[x0]
008fcb3c	orr x10,xzr,#-0x5555555555555556
008fcb40	movk x10,#0xaaab
008fcb44	orr x22,xzr,#0x5555555555555555
008fcb48	sub x8,x8,x9
008fcb4c	asr x8,x8,#0x4
008fcb50	mul x21,x8,x10
008fcb54	movk x22,#0x555, LSL #48
008fcb58	add x8,x21,#0x1
008fcb5c	mov x19,x0
008fcb60	cmp x8,x22
008fcb64	mov x20,x1
008fcb68	b.hi 0x008fccb8
008fcb6c	ldr x11,[x19, #0x10]
008fcb70	sub x9,x11,x9
008fcb74	asr x9,x9,#0x4
008fcb78	mul x9,x9,x10
008fcb7c	orr x10,xzr,#-0x5555555555555556
008fcb80	movk x10,#0xaaa9
008fcb84	movk x10,#0x2aa, LSL #48
008fcb88	cmp x9,x10
008fcb8c	b.hi 0x008fcba0
008fcb90	lsl x9,x9,#0x1
008fcb94	cmp x9,x8
008fcb98	csel x22,x8,x9,cc
008fcb9c	cbz x22,0x008fccb0
008fcba0	add x8,x22,x22, LSL #0x1
008fcba4	lsl x0,x8,#0x4
008fcba8	bl 0x00c2fed0
008fcbac	ldr x8,[x20, #0x10]
008fcbb0	orr w10,wzr,#0x30
008fcbb4	madd x9,x21,x10,x0
008fcbb8	str x8,[x9, #0x10]
008fcbbc	ldr q0,[x20]
008fcbc0	str q0,[x9]
008fcbc4	ldr x8,[x20, #0x28]
008fcbc8	stp xzr,xzr,[x20, #0x8]
008fcbcc	str xzr,[x20]
008fcbd0	str x8,[x9, #0x28]
008fcbd4	ldur q0,[x20, #0x18]
008fcbd8	nop
008fcbdc	madd x8,x22,x10,x0
008fcbe0	add x10,x9,#0x30
008fcbe4	stur q0,[x9, #0x18]
008fcbe8	stp xzr,xzr,[x20, #0x20]
008fcbec	str xzr,[x20, #0x18]
008fcbf0	ldp x21,x11,[x19]
008fcbf4	cmp x11,x21
008fcbf8	b.eq 0x008fcc44
008fcbfc	ldur x12,[x11, #-0x20]
008fcc00	stur x12,[x9, #-0x20]
008fcc04	ldur q0,[x11, #-0x30]
008fcc08	stur q0,[x9, #-0x30]
008fcc0c	ldur x12,[x11, #-0x8]
008fcc10	stp xzr,xzr,[x11, #-0x28]
008fcc14	stur xzr,[x11, #-0x30]
008fcc18	stur x12,[x9, #-0x8]
008fcc1c	ldur q0,[x11, #-0x18]
008fcc20	stur q0,[x9, #-0x18]
008fcc24	stp xzr,xzr,[x11, #-0x18]
008fcc28	stur xzr,[x11, #-0x8]
008fcc2c	sub x11,x11,#0x30
008fcc30	cmp x21,x11
008fcc34	sub x9,x9,#0x30
008fcc38	b.ne 0x008fcbfc
008fcc3c	ldp x20,x21,[x19]
008fcc40	b 0x008fcc48
008fcc44	mov x20,x21
008fcc48	cmp x21,x20
008fcc4c	stp x9,x10,[x19]
008fcc50	str x8,[x19, #0x10]
008fcc54	b.eq 0x008fcc88
008fcc58	ldurb w8,[x21, #-0x18]
008fcc5c	tbz w8,#0x0,0x008fcc68
008fcc60	ldur x0,[x21, #-0x8]
008fcc64	bl 0x00c301d0
008fcc68	ldurb w8,[x21, #-0x30]
008fcc6c	sub x19,x21,#0x30
008fcc70	tbz w8,#0x0,0x008fcc7c
008fcc74	ldur x0,[x21, #-0x20]
008fcc78	bl 0x00c301d0
008fcc7c	cmp x20,x19
008fcc80	mov x21,x19
008fcc84	b.ne 0x008fcc58
008fcc88	cbz x20,0x008fcca0
008fcc8c	mov x0,x20
008fcc90	ldp x29,x30,[sp, #0x20]
008fcc94	ldp x20,x19,[sp, #0x10]
008fcc98	ldp x22,x21,[sp], #0x30
008fcc9c	b 0x00c301d0
008fcca0	ldp x29,x30,[sp, #0x20]
008fcca4	ldp x20,x19,[sp, #0x10]
008fcca8	ldp x22,x21,[sp], #0x30
008fccac	ret
008fccb0	mov x0,xzr
008fccb4	b 0x008fcbac
008fccb8	mov x0,x19
008fccbc	bl 0x00c30bd0
