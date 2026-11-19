; cpr::Session::prepareCommonDownload @ 008eca00
008eca00	sub sp,sp,#0xc0
008eca04	stp x24,x23,[sp, #0x80]
008eca08	stp x22,x21,[sp, #0x90]
008eca0c	stp x20,x19,[sp, #0xa0]
008eca10	stp x29,x30,[sp, #0xb0]
008eca14	add x29,sp,#0xb0
008eca18	mrs x24,tpidr_el0
008eca1c	ldr x8,[x24, #0x28]
008eca20	mov x19,x0
008eca24	stur x8,[x29, #-0x38]
008eca28	bl 0x00c312e0
008eca2c	ldr x1,[x19, #0x18]
008eca30	add x0,x19,#0x48
008eca34	add x8,sp,#0x48
008eca38	bl 0x00c30f50
008eca3c	ldrb w8,[sp, #0x48]
008eca40	ldr x9,[sp, #0x50]
008eca44	lsr w10,w8,#0x1
008eca48	tst w8,#0x1
008eca4c	csel x8,x10,x9,eq
008eca50	cbz x8,0x008ecb3c
008eca54	add x20,x19,#0x30
008eca58	adrp x1,0x2a3000
008eca5c	add x1,x1,#0x5cf
008eca60	sub x8,x29,#0x50
008eca64	mov x0,x20
008eca68	bl 0x00c30fa0
008eca6c	adrp x13,0xcb4000
008eca70	ldurb w8,[x29, #-0x50]
008eca74	ldp x12,x9,[x29, #-0x48]
008eca78	ldur x11,[x29, #-0x4f]
008eca7c	ldr x13,[x13, #0xa28]
008eca80	add x10,sp,#0x8
008eca84	add x0,x10,#0x8
008eca88	strb w8,[sp, #0x10]
008eca8c	add x22,x13,#0x10
008eca90	stur x11,[sp, #0x11]
008eca94	stp x12,x9,[sp, #0x18]
008eca98	str x22,[sp, #0x8]
008eca9c	sub x8,x29,#0x50
008ecaa0	add x1,sp,#0x48
008ecaa4	bl 0x00c31770
008ecaa8	adrp x21,0xcb4000
008ecaac	ldurb w8,[x29, #-0x50]
008ecab0	ldp x12,x9,[x29, #-0x48]
008ecab4	ldur x11,[x29, #-0x4f]
008ecab8	ldr x21,[x21, #0xa30]
008ecabc	add x10,sp,#0x28
008ecac0	add x23,x10,#0x8
008ecac4	strb w8,[sp, #0x30]
008ecac8	add x10,x21,#0x10
008ecacc	str x10,[sp, #0x8]
008ecad0	ldrb w10,[sp, #0x10]
008ecad4	stur x11,[sp, #0x31]
008ecad8	stp x12,x9,[sp, #0x38]
008ecadc	str x22,[sp, #0x28]
008ecae0	tbz w10,#0x0,0x008ecaf4
008ecae4	ldr x0,[sp, #0x20]
008ecae8	bl 0x00c301d0
008ecaec	ldrb w8,[sp, #0x30]
008ecaf0	ldr x9,[sp, #0x40]
008ecaf4	ldr x10,[x19, #0x18]
008ecaf8	tst w8,#0x1
008ecafc	csinc x2,x9,x23,ne
008ecb00	ldr x0,[x10]
008ecb04	mov w1,#0x2712
008ecb08	bl 0x00c317c0
008ecb0c	add x8,x21,#0x10
008ecb10	str x8,[sp, #0x28]
008ecb14	ldrb w8,[sp, #0x30]
008ecb18	tbz w8,#0x0,0x008ecb64
008ecb1c	ldr x0,[sp, #0x40]
008ecb20	bl 0x00c301d0
008ecb24	ldrb w22,[x20]
008ecb28	tbz w22,#0x0,0x008ecb6c
008ecb2c	ldp x2,x21,[x19, #0x38]
008ecb30	cbnz x2,0x008ecb78
008ecb34	mov x8,#-0x1
008ecb38	b 0x008ecb90
008ecb3c	mov x20,x19
008ecb40	ldrb w8,[x20, #0x30]!
008ecb44	ldur x9,[x20, #-0x18]
008ecb48	ldr x0,[x9]
008ecb4c	tbnz w8,#0x0,0x008ecb58
008ecb50	add x2,x20,#0x1
008ecb54	b 0x008ecb5c
008ecb58	ldr x2,[x19, #0x40]
008ecb5c	mov w1,#0x2712
008ecb60	bl 0x00c317c0
008ecb64	ldrb w22,[x20]
008ecb68	tbnz w22,#0x0,0x008ecb2c
008ecb6c	add x21,x20,#0x1
008ecb70	lsr w2,w22,#0x1
008ecb74	cbz x2,0x008ecb34
008ecb78	mov w1,#0x3a
008ecb7c	mov x0,x21
008ecb80	bl 0x00c300a0
008ecb84	sub x8,x0,x21
008ecb88	cmp x0,#0x0
008ecb8c	csinv x8,x8,xzr,ne
008ecb90	stp xzr,xzr,[sp, #0x28]
008ecb94	str xzr,[sp, #0x38]
008ecb98	ldp x9,x10,[x19, #0x38]
008ecb9c	lsr w11,w22,#0x1
008ecba0	tst w22,#0x1
008ecba4	csel x9,x11,x9,eq
008ecba8	csinc x21,x10,x20,ne
008ecbac	cmp x9,x8
008ecbb0	csel x20,x9,x8,cc
008ecbb4	cmn x20,#0x10
008ecbb8	b.cs 0x008ecd6c
008ecbbc	cmp x20,#0x17
008ecbc0	b.cs 0x008ecbdc
008ecbc4	add x9,sp,#0x28
008ecbc8	lsl w8,w20,#0x1
008ecbcc	orr x22,x9,#0x1
008ecbd0	strb w8,[sp, #0x28]
008ecbd4	cbnz x20,0x008ecbfc
008ecbd8	b 0x008ecc0c
008ecbdc	add x8,x20,#0x10
008ecbe0	and x23,x8,#-0x10
008ecbe4	mov x0,x23
008ecbe8	bl 0x00c2fed0
008ecbec	orr x8,x23,#0x1
008ecbf0	mov x22,x0
008ecbf4	stp x20,x0,[sp, #0x30]
008ecbf8	str x8,[sp, #0x28]
008ecbfc	mov x0,x22
008ecc00	mov x1,x21
008ecc04	mov x2,x20
008ecc08	bl 0x00c2ffd0
008ecc0c	strb wzr,[x22, x20]
008ecc10	add x20,x19,#0x68
008ecc14	add x1,sp,#0x28
008ecc18	mov x0,x20
008ecc1c	bl 0x00c310f0
008ecc20	tbz w0,#0x0,0x008ecca0
008ecc24	ldr x8,[x19, #0x18]
008ecc28	ldr x21,[x8]
008ecc2c	add x1,sp,#0x28
008ecc30	mov x0,x20
008ecc34	bl 0x00c310e0
008ecc38	ldrb w8,[x0]
008ecc3c	ldr x9,[x0, #0x10]
008ecc40	tst w8,#0x1
008ecc44	csinc x2,x9,x0,ne
008ecc48	mov w1,#0x2714
008ecc4c	mov x0,x21
008ecc50	bl 0x00c317c0
008ecc54	add x20,x19,#0x80
008ecc58	add x1,sp,#0x28
008ecc5c	mov x0,x20
008ecc60	bl 0x00c31160
008ecc64	tbz w0,#0x0,0x008ecca0
008ecc68	ldr x8,[x19, #0x18]
008ecc6c	ldr x0,[x8]
008ecc70	mov w1,#0x6f
008ecc74	orr x2,xzr,#-0x11
008ecc78	bl 0x00c317c0
008ecc7c	ldr x8,[x19, #0x18]
008ecc80	ldr x21,[x8]
008ecc84	add x1,sp,#0x28
008ecc88	mov x0,x20
008ecc8c	bl 0x00c31150
008ecc90	mov x2,x0
008ecc94	mov w1,#0x2716
008ecc98	mov x0,x21
008ecc9c	bl 0x00c317c0
008ecca0	ldr x8,[x19, #0x18]
008ecca4	add x20,x19,#0x260
008ecca8	strb wzr,[x8, #0x20]
008eccac	ldrb w8,[x19, #0x260]
008eccb0	tbnz w8,#0x0,0x008eccbc
008eccb4	strh wzr,[x20]
008eccb8	b 0x008eccc8
008eccbc	ldr x8,[x19, #0x270]
008eccc0	strb wzr,[x8]
008eccc4	str xzr,[x19, #0x268]
008eccc8	ldr x8,[x19, #0x18]
008ecccc	ldr x9,[x19, #0x150]
008eccd0	ldr x0,[x8]
008eccd4	cbz x9,0x008ecd44
008eccd8	adrp x2,0xcb4000
008eccdc	ldr x2,[x2, #0xcf8]
008ecce0	mov w1,#0x4e6f
008ecce4	bl 0x00c317c0
008ecce8	ldr x8,[x19, #0x18]
008eccec	add x2,x19,#0x120
008eccf0	ldr x0,[x8]
008eccf4	mov w1,#0x272d
008eccf8	bl 0x00c317c0
008eccfc	ldrb w8,[sp, #0x28]
008ecd00	tbz w8,#0x0,0x008ecd0c
008ecd04	ldr x0,[sp, #0x38]
008ecd08	bl 0x00c301d0
008ecd0c	ldrb w8,[sp, #0x48]
008ecd10	tbz w8,#0x0,0x008ecd1c
008ecd14	ldr x0,[sp, #0x58]
008ecd18	bl 0x00c301d0
008ecd1c	ldr x8,[x24, #0x28]
008ecd20	ldur x9,[x29, #-0x38]
008ecd24	cmp x8,x9
008ecd28	b.ne 0x008ecd74
008ecd2c	ldp x29,x30,[sp, #0xb0]
008ecd30	ldp x20,x19,[sp, #0xa0]
008ecd34	ldp x22,x21,[sp, #0x90]
008ecd38	ldp x24,x23,[sp, #0x80]
008ecd3c	add sp,sp,#0xc0
008ecd40	ret
008ecd44	adrp x2,0xcb4000
008ecd48	ldr x2,[x2, #0xcd0]
008ecd4c	mov w1,#0x4e6f
008ecd50	bl 0x00c317c0
008ecd54	ldr x8,[x19, #0x18]
008ecd58	ldr x0,[x8]
008ecd5c	mov w1,#0x272d
008ecd60	mov x2,x20
008ecd64	bl 0x00c317c0
008ecd68	b 0x008eccfc
008ecd6c	add x0,sp,#0x28
008ecd70	bl 0x00c30ce0
008ecd74	bl 0x00c2fec0
