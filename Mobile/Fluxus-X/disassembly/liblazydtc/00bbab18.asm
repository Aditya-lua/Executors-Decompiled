; ZSTD_decodeSeqHeaders @ 00bbab18
00bbab18	cbz x3,0x00bbacb0
00bbab1c	sub sp,sp,#0x80
00bbab20	stp x29,x30,[sp, #0x30]
00bbab24	stp x26,x25,[sp, #0x40]
00bbab28	stp x24,x23,[sp, #0x50]
00bbab2c	stp x22,x21,[sp, #0x60]
00bbab30	stp x20,x19,[sp, #0x70]
00bbab34	add x29,sp,#0x30
00bbab38	mov x8,x2
00bbab3c	add x20,x2,x3
00bbab40	ldrsb w9,[x8], #0x1
00bbab44	and w21,w9,#0xff
00bbab48	tbnz w9,#0x1f,0x00bbacb8
00bbab4c	str w21,[x1]
00bbab50	cbz w21,0x00bbace0
00bbab54	add x19,x8,#0x1
00bbab58	cmp x19,x20
00bbab5c	b.hi 0x00bbad00
00bbab60	ldrb w24,[x8]
00bbab64	tst w24,#0x3
00bbab68	b.ne 0x00bbacf0
00bbab6c	add x23,x0,#0x7, LSL #12
00bbab70	mov x22,x2
00bbab74	lsr w2,w24,#0x6
00bbab78	ldr w9,[x23, #0x5fc]
00bbab7c	ldr w8,[x23, #0x534]
00bbab80	mov w10,#0x6abc
00bbab84	sub x6,x20,x19
00bbab88	add x25,x0,x10
00bbab8c	adrp x10,0x789000
00bbab90	add x10,x10,#0x36c
00bbab94	str w9,[sp, #0x18]
00bbab98	adrp x9,0x789000
00bbab9c	add x9,x9,#0x348
00bbaba0	adrp x7,0x789000
00bbaba4	add x7,x7,#0x2b8
00bbaba8	mov x1,x0
00bbabac	add x0,x0,#0x20
00bbabb0	mov w3,#0x23
00bbabb4	mov w4,#0x9
00bbabb8	mov x5,x19
00bbabbc	str x25,[sp, #0x28]
00bbabc0	str w8,[sp, #0x10]
00bbabc4	mov x26,x1
00bbabc8	stp x9,x10,[sp]
00bbabcc	str w21,[sp, #0x20]
00bbabd0	bl 0x00bbad38
00bbabd4	cmn x0,#0x78
00bbabd8	b.hi 0x00bbacf0
00bbabdc	ldr w9,[x23, #0x5fc]
00bbabe0	add x19,x19,x0
00bbabe4	ubfx w2,w24,#0x4,#0x2
00bbabe8	ldr w8,[x23, #0x534]
00bbabec	mov w10,#0x1028
00bbabf0	sub x6,x20,x19
00bbabf4	adrp x11,0x789000
00bbabf8	add x11,x11,#0x614
00bbabfc	str w9,[sp, #0x18]
00bbac00	adrp x9,0x789000
00bbac04	add x9,x9,#0x5f4
00bbac08	adrp x7,0x789000
00bbac0c	add x7,x7,#0x574
00bbac10	add x0,x26,x10
00bbac14	add x1,x26,#0x10
00bbac18	mov w3,#0x1f
00bbac1c	mov w4,#0x8
00bbac20	mov x5,x19
00bbac24	str x25,[sp, #0x28]
00bbac28	str w8,[sp, #0x10]
00bbac2c	stp x9,x11,[sp]
00bbac30	str w21,[sp, #0x20]
00bbac34	bl 0x00bbad38
00bbac38	cmn x0,#0x78
00bbac3c	b.hi 0x00bbacf0
00bbac40	ubfx w2,w24,#0x2,#0x2
00bbac44	add x19,x19,x0
00bbac48	ldr w8,[x23, #0x534]
00bbac4c	ldr w9,[x23, #0x5fc]
00bbac50	mov w10,#0x1830
00bbac54	sub x6,x20,x19
00bbac58	adrp x11,0x789000
00bbac5c	add x11,x11,#0x828
00bbac60	adrp x12,0x789000
00bbac64	add x12,x12,#0x7f0
00bbac68	adrp x7,0x789000
00bbac6c	add x7,x7,#0x71c
00bbac70	add x0,x26,x10
00bbac74	add x1,x26,#0x8
00bbac78	mov w3,#0x34
00bbac7c	mov w4,#0x9
00bbac80	mov x5,x19
00bbac84	str x25,[sp, #0x28]
00bbac88	str w21,[sp, #0x20]
00bbac8c	str w9,[sp, #0x18]
00bbac90	str w8,[sp, #0x10]
00bbac94	stp x12,x11,[sp]
00bbac98	bl 0x00bbad38
00bbac9c	cmn x0,#0x78
00bbaca0	b.hi 0x00bbacf0
00bbaca4	add x8,x19,x0
00bbaca8	sub x0,x8,x22
00bbacac	b 0x00bbad04
00bbacb0	mov x0,#-0x48
00bbacb4	ret
00bbacb8	cmp w21,#0xff
00bbacbc	b.eq 0x00bbacf8
00bbacc0	cmp x3,#0x1
00bbacc4	b.eq 0x00bbad00
00bbacc8	ldrb w8,[x2, #0x1]
00bbaccc	orr w9,w8,w21, LSL #0x8
00bbacd0	add x8,x2,#0x2
00bbacd4	sub w21,w9,#0x8, LSL #12
00bbacd8	str w21,[x1]
00bbacdc	cbnz w21,0x00bbab54
00bbace0	cmp x8,x20
00bbace4	mov x8,#-0x14
00bbace8	csel x0,x3,x8,eq
00bbacec	b 0x00bbad04
00bbacf0	mov x0,#-0x14
00bbacf4	b 0x00bbad04
00bbacf8	cmp x3,#0x3
00bbacfc	b.cs 0x00bbad20
00bbad00	mov x0,#-0x48
00bbad04	ldp x20,x19,[sp, #0x70]
00bbad08	ldp x22,x21,[sp, #0x60]
00bbad0c	ldp x24,x23,[sp, #0x50]
00bbad10	ldp x26,x25,[sp, #0x40]
00bbad14	ldp x29,x30,[sp, #0x30]
00bbad18	add sp,sp,#0x80
00bbad1c	ret
00bbad20	ldurh w8,[x2, #0x1]
00bbad24	mov w9,#0x7f00
00bbad28	add w21,w8,w9
00bbad2c	add x8,x2,#0x3
00bbad30	str w21,[x1]
00bbad34	b 0x00bbab54
