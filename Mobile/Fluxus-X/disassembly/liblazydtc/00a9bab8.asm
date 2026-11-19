; ossl_buf2hexstr_sep @ 00a9bab8
00a9bab8	cbz x1,0x00a9bb68
00a9babc	str x25,[sp, #-0x50]!
00a9bac0	mov w25,#0x1
00a9bac4	stp x24,x23,[sp, #0x10]
00a9bac8	add x24,x1,x1, LSL #0x1
00a9bacc	bfm x25,x1,#0x3f,#0x3e
00a9bad0	tst w2,#0xff
00a9bad4	stp x22,x21,[sp, #0x20]
00a9bad8	mov x21,x1
00a9badc	csel x23,x25,x24,eq
00a9bae0	adrp x1,0x2c9000
00a9bae4	stp x20,x19,[sp, #0x30]
00a9bae8	mov w20,w2
00a9baec	mov x22,x0
00a9baf0	add x1,x1,#0xd7c
00a9baf4	mov w2,#0x113
00a9baf8	mov x0,x23
00a9bafc	stp x29,x30,[sp, #0x40]
00a9bb00	add x29,sp,#0x40
00a9bb04	bl 0x00c32320
00a9bb08	mov x19,x0
00a9bb0c	cbz x0,0x00a9bb7c
00a9bb10	tst w20,#0xff
00a9bb14	csel x8,x24,x25,ne
00a9bb18	cmp x8,x23
00a9bb1c	b.ls 0x00a9bbb0
00a9bb20	bl 0x00c342a0
00a9bb24	adrp x20,0x2c9000
00a9bb28	add x20,x20,#0xd7c
00a9bb2c	adrp x2,0x2d6000
00a9bb30	add x2,x2,#0x1d
00a9bb34	mov w1,#0xee
00a9bb38	mov x0,x20
00a9bb3c	bl 0x00c342b0
00a9bb40	orr w0,wzr,#0xf
00a9bb44	mov w1,#0x74
00a9bb48	mov x2,xzr
00a9bb4c	bl 0x00c342c0
00a9bb50	mov w2,#0x11a
00a9bb54	mov x0,x19
00a9bb58	mov x1,x20
00a9bb5c	bl 0x00c32310
00a9bb60	mov x19,xzr
00a9bb64	b 0x00a9bc14
00a9bb68	adrp x1,0x2c9000
00a9bb6c	add x1,x1,#0xd7c
00a9bb70	mov w0,#0x1
00a9bb74	mov w2,#0x110
00a9bb78	b 0x00c34250
00a9bb7c	bl 0x00c342a0
00a9bb80	adrp x0,0x2c9000
00a9bb84	adrp x2,0x2c1000
00a9bb88	add x0,x0,#0xd7c
00a9bb8c	add x2,x2,#0xf69
00a9bb90	mov w1,#0x114
00a9bb94	bl 0x00c342b0
00a9bb98	mov w1,#0x100
00a9bb9c	orr w0,wzr,#0xf
00a9bba0	movk w1,#0xc, LSL #16
00a9bba4	mov x2,xzr
00a9bba8	bl 0x00c342c0
00a9bbac	b 0x00a9bc14
00a9bbb0	adrp x8,0x2a3000
00a9bbb4	add x8,x8,#0x64c
00a9bbb8	mov x9,x19
00a9bbbc	ldrb w10,[x22]
00a9bbc0	tst w20,#0xff
00a9bbc4	lsr w10,w10,#0x4
00a9bbc8	ldrb w10,[x8, w10, UXTW ]
00a9bbcc	strb w10,[x9]
00a9bbd0	ldrb w10,[x22]
00a9bbd4	and x10,x10,#0xf
00a9bbd8	ldrb w10,[x8, x10]
00a9bbdc	strb w10,[x9, #0x1]
00a9bbe0	b.eq 0x00a9bbf4
00a9bbe4	add x10,x9,#0x3
00a9bbe8	strb w20,[x9, #0x2]
00a9bbec	mov x9,x10
00a9bbf0	b 0x00a9bbf8
00a9bbf4	add x9,x9,#0x2
00a9bbf8	subs x21,x21,#0x1
00a9bbfc	add x22,x22,#0x1
00a9bc00	b.ne 0x00a9bbbc
00a9bc04	sub x8,x9,#0x1
00a9bc08	tst w20,#0xff
00a9bc0c	csel x8,x8,x9,ne
00a9bc10	strb wzr,[x8]
00a9bc14	mov x0,x19
00a9bc18	ldp x29,x30,[sp, #0x40]
00a9bc1c	ldp x20,x19,[sp, #0x30]
00a9bc20	ldp x22,x21,[sp, #0x20]
00a9bc24	ldp x24,x23,[sp, #0x10]
00a9bc28	ldr x25,[sp], #0x50
00a9bc2c	ret
