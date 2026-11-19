; FUN_00bdc9a8 @ 00bdc9a8
00bdc9a8	paciasp
00bdc9ac	sub sp,sp,#0x180
00bdc9b0	stp x29,x30,[sp, #0x120]
00bdc9b4	stp x28,x27,[sp, #0x130]
00bdc9b8	stp x26,x25,[sp, #0x140]
00bdc9bc	stp x24,x23,[sp, #0x150]
00bdc9c0	stp x22,x21,[sp, #0x160]
00bdc9c4	stp x20,x19,[sp, #0x170]
00bdc9c8	add x29,sp,#0x120
00bdc9cc	ldr w8,[x3, #0x8]
00bdc9d0	mov w9,#0x4a
00bdc9d4	mov x22,x4
00bdc9d8	mov x0,x3
00bdc9dc	mov x21,x2
00bdc9e0	mov x19,x1
00bdc9e4	ands w8,w8,w9
00bdc9e8	sub x26,x29,#0x48
00bdc9ec	str x5,[sp, #0x18]
00bdc9f0	b.eq 0x00bdca14
00bdc9f4	cmp w8,#0x40
00bdc9f8	b.eq 0x00bdca0c
00bdc9fc	cmp w8,#0x8
00bdca00	b.ne 0x00bdca1c
00bdca04	mov w23,#0x10
00bdca08	b 0x00bdca20
00bdca0c	mov w23,#0x8
00bdca10	b 0x00bdca20
00bdca14	mov w23,wzr
00bdca18	b 0x00bdca20
00bdca1c	mov w23,#0xa
00bdca20	sub x8,x29,#0x28
00bdca24	sub x1,x29,#0xc
00bdca28	bl 0x00c0bec0
00bdca2c	stp xzr,xzr,[x26, #0x8]
00bdca30	str xzr,[x26, #0x18]
00bdca34	sub x0,x29,#0x40
00bdca38	mov w1,#0x16
00bdca3c	mov w2,wzr
00bdca40	sub x20,x29,#0x40
00bdca44	bl 0x00c30250
00bdca48	ldurb w8,[x29, #-0x40]
00bdca4c	add x10,sp,#0x38
00bdca50	str x22,[sp, #0x20]
00bdca54	ldr x9,[x26, #0x18]
00bdca58	str x10,[sp, #0x30]
00bdca5c	adrp x28,0xcb5000
00bdca60	tst w8,#0x1
00bdca64	ldr x28,[x28, #0xc08]
00bdca68	orr x27,x20,#0x1
00bdca6c	csinc x24,x9,x20,ne
00bdca70	mov w20,#0x16
00bdca74	add x22,sp,#0x30
00bdca78	str x24,[x26]
00bdca7c	str wzr,[sp, #0x2c]
00bdca80	b 0x00bdca8c
00bdca84	add x8,x8,#0x1
00bdca88	str x8,[x19, #0x18]
00bdca8c	cbz x19,0x00bdcab8
00bdca90	ldp x8,x9,[x19, #0x18]
00bdca94	cmp x8,x9
00bdca98	b.eq 0x00bdcac8
00bdca9c	mov w25,wzr
00bdcaa0	cbz x21,0x00bdcac0
00bdcaa4	ldp x8,x9,[x21, #0x18]
00bdcaa8	cmp x8,x9
00bdcaac	b.eq 0x00bdcaec
00bdcab0	tbnz w25,#0x0,0x00bdcb10
00bdcab4	b 0x00bdcc54
00bdcab8	mov w25,#0x1
00bdcabc	cbnz x21,0x00bdcaa4
00bdcac0	tbz w25,#0x0,0x00bdcb10
00bdcac4	b 0x00bdcc54
00bdcac8	ldr x8,[x19]
00bdcacc	ldr x8,[x8, #0x48]
00bdcad0	mov x0,x19
00bdcad4	blr x8
00bdcad8	cmn w0,#0x1
00bdcadc	cset w25,eq
00bdcae0	csel x19,xzr,x19,eq
00bdcae4	cbnz x21,0x00bdcaa4
00bdcae8	b 0x00bdcac0
00bdcaec	ldr x8,[x21]
00bdcaf0	ldr x8,[x8, #0x48]
00bdcaf4	mov x0,x21
00bdcaf8	blr x8
00bdcafc	cmn w0,#0x1
00bdcb00	cset w8,eq
00bdcb04	csel x21,xzr,x21,eq
00bdcb08	cmp w25,w8
00bdcb0c	b.eq 0x00bdcc54
00bdcb10	ldurb w8,[x29, #-0x40]
00bdcb14	ldr x9,[x26, #0x10]
00bdcb18	ldr x11,[x26]
00bdcb1c	lsr x10,x8,#0x1
00bdcb20	tst w8,#0x1
00bdcb24	csel x25,x10,x9,eq
00bdcb28	add x9,x24,x25
00bdcb2c	cmp x11,x9
00bdcb30	b.ne 0x00bdcbe8
00bdcb34	cmp x25,#0x1
00bdcb38	b.lt 0x00bdcb50
00bdcb3c	sub x0,x29,#0x40
00bdcb40	mov x1,x25
00bdcb44	mov w2,wzr
00bdcb48	bl 0x00c30250
00bdcb4c	b 0x00bdcb74
00bdcb50	lsl x9,x25,#0x1
00bdcb54	tbnz w8,#0x0,0x00bdcb68
00bdcb58	lsl w8,w9,#0x1
00bdcb5c	sturb w8,[x29, #-0x40]
00bdcb60	mov x8,x27
00bdcb64	b 0x00bdcb70
00bdcb68	ldr x8,[x26, #0x18]
00bdcb6c	str x9,[x26, #0x10]
00bdcb70	strb wzr,[x8, x9]
00bdcb74	ldp x9,x10,[x26, #0x8]
00bdcb78	ldurb w8,[x29, #-0x40]
00bdcb7c	tst w8,#0x1
00bdcb80	and x11,x9,#-0x2
00bdcb84	ubfx x12,x9,#0x1,#0x7
00bdcb88	sub x11,x11,#0x1
00bdcb8c	csel x8,x20,x11,eq
00bdcb90	tst x9,#0x1
00bdcb94	csel x10,x12,x10,eq
00bdcb98	subs x1,x8,x10
00bdcb9c	b.ls 0x00bdcbb0
00bdcba0	sub x0,x29,#0x40
00bdcba4	mov w2,wzr
00bdcba8	bl 0x00c30250
00bdcbac	b 0x00bdcbd0
00bdcbb0	tbnz w9,#0x0,0x00bdcbc4
00bdcbb4	lsl w9,w8,#0x1
00bdcbb8	sturb w9,[x29, #-0x40]
00bdcbbc	mov x9,x27
00bdcbc0	b 0x00bdcbcc
00bdcbc4	ldr x9,[x26, #0x18]
00bdcbc8	str x8,[x26, #0x10]
00bdcbcc	strb wzr,[x9, x8]
00bdcbd0	ldurb w8,[x29, #-0x40]
00bdcbd4	ldr x9,[x26, #0x18]
00bdcbd8	tst w8,#0x1
00bdcbdc	csel x24,x27,x9,eq
00bdcbe0	add x8,x24,x25
00bdcbe4	str x8,[x26]
00bdcbe8	ldp x8,x9,[x19, #0x18]
00bdcbec	cmp x8,x9
00bdcbf0	b.eq 0x00bdcbfc
00bdcbf4	ldrb w0,[x8]
00bdcbf8	b 0x00bdcc0c
00bdcbfc	ldr x8,[x19]
00bdcc00	ldr x8,[x8, #0x48]
00bdcc04	mov x0,x19
00bdcc08	blr x8
00bdcc0c	ldurb w5,[x29, #-0xc]
00bdcc10	sub x3,x29,#0x48
00bdcc14	add x4,sp,#0x2c
00bdcc18	sub x6,x29,#0x28
00bdcc1c	add x7,sp,#0x38
00bdcc20	mov w1,w23
00bdcc24	mov x2,x24
00bdcc28	stp x22,x28,[sp]
00bdcc2c	bl 0x00c440f0
00bdcc30	cbnz w0,0x00bdcc54
00bdcc34	ldp x8,x9,[x19, #0x18]
00bdcc38	cmp x8,x9
00bdcc3c	b.ne 0x00bdca84
00bdcc40	ldr x8,[x19]
00bdcc44	ldr x8,[x8, #0x50]
00bdcc48	mov x0,x19
00bdcc4c	blr x8
00bdcc50	b 0x00bdca8c
00bdcc54	ldurb w8,[x29, #-0x28]
00bdcc58	ldr x9,[x26, #0x28]
00bdcc5c	ldr x22,[sp, #0x20]
00bdcc60	lsr x10,x8,#0x1
00bdcc64	tst w8,#0x1
00bdcc68	csel x8,x10,x9,eq
00bdcc6c	cbz x8,0x00bdcc90
00bdcc70	ldr x8,[sp, #0x30]
00bdcc74	add x9,sp,#0x38
00bdcc78	sub x9,x8,x9
00bdcc7c	cmp x9,#0x9f
00bdcc80	b.gt 0x00bdcc90
00bdcc84	ldr w9,[sp, #0x2c]
00bdcc88	str w9,[x8], #0x4
00bdcc8c	str x8,[sp, #0x30]
00bdcc90	ldr x1,[x26]
00bdcc94	mov x0,x24
00bdcc98	mov x2,x22
00bdcc9c	mov w3,w23
00bdcca0	bl 0x00c0c5f4
00bdcca4	ldurb w10,[x29, #-0x28]
00bdcca8	ldr x12,[sp, #0x30]
00bdccac	add x11,sp,#0x38
00bdccb0	ldr x8,[x26, #0x28]
00bdccb4	lsr x9,x10,#0x1
00bdccb8	ands w13,w10,#0x1
00bdccbc	sub x11,x12,x11
00bdccc0	csel x8,x9,x8,eq
00bdccc4	ldr x9,[sp, #0x18]
00bdccc8	cmp x11,#0x5
00bdcccc	str x0,[x9]
00bdccd0	b.lt 0x00bdce30
00bdccd4	cbz x8,0x00bdce30
00bdccd8	sub x8,x12,#0x4
00bdccdc	add x9,sp,#0x38
00bdcce0	cmp x9,x8
00bdcce4	cset w11,cc
00bdcce8	cmp x9,x12
00bdccec	b.eq 0x00bdcd9c
00bdccf0	cbz w11,0x00bdcd9c
00bdccf4	add x10,sp,#0x38
00bdccf8	sub x14,x12,#0x8
00bdccfc	add x11,x10,#0x4
00bdcd00	cmp x14,x11
00bdcd04	csel x13,x14,x11,hi
00bdcd08	sub x13,x13,#0x4
00bdcd0c	cmp x13,x10
00bdcd10	cinc x15,x10,ne
00bdcd14	cmp x13,x10
00bdcd18	sub x15,x13,x15
00bdcd1c	lsr x15,x15,#0x3
00bdcd20	cinc x13,x15,ne
00bdcd24	cmp x13,#0x13
00bdcd28	b.cc 0x00bdcd70
00bdcd2c	cmp x14,x11
00bdcd30	csel x14,x14,x11,hi
00bdcd34	sub x14,x14,#0x4
00bdcd38	cmp x14,x10
00bdcd3c	cinc x15,x10,ne
00bdcd40	cmp x14,x10
00bdcd44	sub x15,x14,x15
00bdcd48	lsr x15,x15,#0x3
00bdcd4c	cinc x14,x15,ne
00bdcd50	cmp x10,x12
00bdcd54	b.cs 0x00bdcf14
00bdcd58	lsl x14,x14,#0x2
00bdcd5c	sub x15,x12,x14
00bdcd60	add x11,x11,x14
00bdcd64	sub x14,x15,#0x4
00bdcd68	cmp x14,x11
00bdcd6c	b.cs 0x00bdcf14
00bdcd70	mov x11,x8
00bdcd74	add x10,x10,#0x4
00bdcd78	ldr w12,[x11]
00bdcd7c	ldur w13,[x10, #-0x4]
00bdcd80	stur w12,[x10, #-0x4]
00bdcd84	str w13,[x11], #-0x4
00bdcd88	cmp x10,x11
00bdcd8c	add x10,x10,#0x4
00bdcd90	b.cc 0x00bdcd78
00bdcd94	ldurb w10,[x29, #-0x28]
00bdcd98	and w13,w10,#0x1
00bdcd9c	ldr x11,[x26, #0x30]
00bdcda0	cmp w13,#0x0
00bdcda4	sub x12,x29,#0x28
00bdcda8	csinc x11,x11,x12,ne
00bdcdac	cmp x9,x8
00bdcdb0	b.cs 0x00bdce08
00bdcdb4	lsr w9,w10,#0x1
00bdcdb8	ldr x10,[x26, #0x28]
00bdcdbc	cmp w13,#0x0
00bdcdc0	csel x9,x9,x10,eq
00bdcdc4	add x10,sp,#0x38
00bdcdc8	add x9,x11,x9
00bdcdcc	b 0x00bdcde8
00bdcdd0	sub x12,x9,x11
00bdcdd4	add x10,x10,#0x4
00bdcdd8	cmp x12,#0x1
00bdcddc	cinc x11,x11,gt
00bdcde0	cmp x10,x8
00bdcde4	b.cs 0x00bdce08
00bdcde8	ldrb w12,[x11]
00bdcdec	cbz w12,0x00bdcdd0
00bdcdf0	cmp w12,#0xff
00bdcdf4	b.eq 0x00bdcdd0
00bdcdf8	ldr w13,[x10]
00bdcdfc	cmp w13,w12
00bdce00	b.eq 0x00bdcdd0
00bdce04	b 0x00bdce28
00bdce08	ldrb w9,[x11]
00bdce0c	cbz w9,0x00bdce30
00bdce10	cmp w9,#0xff
00bdce14	b.eq 0x00bdce30
00bdce18	ldr w8,[x8]
00bdce1c	sub w8,w8,#0x1
00bdce20	cmp w8,w9
00bdce24	b.cc 0x00bdce30
00bdce28	mov w8,#0x4
00bdce2c	str w8,[x22]
00bdce30	cbz x19,0x00bdcebc
00bdce34	ldp x8,x9,[x19, #0x18]
00bdce38	cmp x8,x9
00bdce3c	b.eq 0x00bdcecc
00bdce40	mov w20,wzr
00bdce44	cbz x21,0x00bdcec4
00bdce48	ldp x8,x9,[x21, #0x18]
00bdce4c	cmp x8,x9
00bdce50	b.eq 0x00bdcef0
00bdce54	tbnz w20,#0x0,0x00bdce64
00bdce58	ldr w8,[x22]
00bdce5c	orr w8,w8,#0x2
00bdce60	str w8,[x22]
00bdce64	ldurb w8,[x29, #-0x40]
00bdce68	tbz w8,#0x0,0x00bdce7c
00bdce6c	ldr x8,[x26, #0x8]
00bdce70	ldr x0,[x26, #0x18]
00bdce74	and x1,x8,#-0x2
00bdce78	bl 0x00c2fe80
00bdce7c	ldurb w8,[x29, #-0x28]
00bdce80	tbz w8,#0x0,0x00bdce94
00bdce84	ldr x8,[x26, #0x20]
00bdce88	ldr x0,[x26, #0x30]
00bdce8c	and x1,x8,#-0x2
00bdce90	bl 0x00c2fe80
00bdce94	mov x0,x19
00bdce98	ldp x20,x19,[sp, #0x170]
00bdce9c	ldp x22,x21,[sp, #0x160]
00bdcea0	ldp x24,x23,[sp, #0x150]
00bdcea4	ldp x26,x25,[sp, #0x140]
00bdcea8	ldp x28,x27,[sp, #0x130]
00bdceac	ldp x29,x30,[sp, #0x120]
00bdceb0	add sp,sp,#0x180
00bdceb4	autiasp
00bdceb8	ret
00bdcebc	mov w20,#0x1
00bdcec0	cbnz x21,0x00bdce48
00bdcec4	tbnz w20,#0x0,0x00bdce58
00bdcec8	b 0x00bdce64
00bdcecc	ldr x8,[x19]
00bdced0	ldr x8,[x8, #0x48]
00bdced4	mov x0,x19
00bdced8	blr x8
00bdcedc	cmn w0,#0x1
00bdcee0	cset w20,eq
00bdcee4	csel x19,xzr,x19,eq
00bdcee8	cbnz x21,0x00bdce48
00bdceec	b 0x00bdcec4
00bdcef0	ldr x8,[x21]
00bdcef4	ldr x8,[x8, #0x48]
00bdcef8	mov x0,x21
00bdcefc	blr x8
00bdcf00	cmn w0,#0x1
00bdcf04	cset w8,eq
00bdcf08	eor w8,w20,w8
00bdcf0c	tbz w8,#0x0,0x00bdce58
00bdcf10	b 0x00bdce64
00bdcf14	add x13,x13,#0x1
00bdcf18	add x15,sp,#0x38
00bdcf1c	sub x12,x12,#0x10
00bdcf20	and x14,x13,#0x7ffffffffffffff8
00bdcf24	lsl x10,x14,#0x2
00bdcf28	mov x16,x14
00bdcf2c	sub x11,x8,x10
00bdcf30	add x10,x15,x10
00bdcf34	add x15,x15,#0x10
00bdcf38	ldp q1,q0,[x12, #-0x10]
00bdcf3c	sub x16,x16,#0x8
00bdcf40	ldp q2,q3,[x15, #-0x10]
00bdcf44	rev64 v0.4S,v0.4S
00bdcf48	rev64 v1.4S,v1.4S
00bdcf4c	rev64 v2.4S,v2.4S
00bdcf50	rev64 v3.4S,v3.4S
00bdcf54	ext v0.16B,v0.16B,v0.16B,0x8
00bdcf58	ext v1.16B,v1.16B,v1.16B,0x8
00bdcf5c	ext v2.16B,v2.16B,v2.16B,0x8
00bdcf60	ext v3.16B,v3.16B,v3.16B,0x8
00bdcf64	stp q0,q1,[x15, #-0x10]
00bdcf68	add x15,x15,#0x20
00bdcf6c	stp q3,q2,[x12, #-0x10]
00bdcf70	sub x12,x12,#0x20
00bdcf74	cbnz x16,0x00bdcf38
00bdcf78	cmp x13,x14
00bdcf7c	b.eq 0x00bdcd94
00bdcf80	b 0x00bdcd74
