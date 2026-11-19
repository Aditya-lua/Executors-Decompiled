; FUN_00a9b9e4 @ 00a9b9e4
00a9b9e4	mov w9,#0x1
00a9b9e8	add x8,x4,x4, LSL #0x1
00a9b9ec	bfm x9,x4,#0x3f,#0x3e
00a9b9f0	tst w5,#0xff
00a9b9f4	csel x8,x8,x9,ne
00a9b9f8	cbz x2,0x00a9ba00
00a9b9fc	str x8,[x2]
00a9ba00	cbz x0,0x00a9bab0
00a9ba04	cmp x8,x1
00a9ba08	b.ls 0x00a9ba4c
00a9ba0c	stp x29,x30,[sp, #-0x10]!
00a9ba10	mov x29,sp
00a9ba14	bl 0x00c342a0
00a9ba18	adrp x0,0x2c9000
00a9ba1c	adrp x2,0x2d6000
00a9ba20	add x0,x0,#0xd7c
00a9ba24	add x2,x2,#0x1d
00a9ba28	mov w1,#0xee
00a9ba2c	bl 0x00c342b0
00a9ba30	orr w0,wzr,#0xf
00a9ba34	mov w1,#0x74
00a9ba38	mov x2,xzr
00a9ba3c	bl 0x00c342c0
00a9ba40	mov w0,wzr
00a9ba44	ldp x29,x30,[sp], #0x10
00a9ba48	ret
00a9ba4c	cbz x4,0x00a9baa0
00a9ba50	adrp x8,0x2a3000
00a9ba54	add x8,x8,#0x64c
00a9ba58	ldrb w9,[x3]
00a9ba5c	tst w5,#0xff
00a9ba60	lsr w9,w9,#0x4
00a9ba64	ldrb w9,[x8, w9, UXTW ]
00a9ba68	strb w9,[x0]
00a9ba6c	ldrb w9,[x3]
00a9ba70	and x9,x9,#0xf
00a9ba74	ldrb w9,[x8, x9]
00a9ba78	strb w9,[x0, #0x1]
00a9ba7c	b.eq 0x00a9ba90
00a9ba80	add x9,x0,#0x3
00a9ba84	strb w5,[x0, #0x2]
00a9ba88	mov x0,x9
00a9ba8c	b 0x00a9ba94
00a9ba90	add x0,x0,#0x2
00a9ba94	subs x4,x4,#0x1
00a9ba98	add x3,x3,#0x1
00a9ba9c	b.ne 0x00a9ba58
00a9baa0	sub x8,x0,#0x1
00a9baa4	tst w5,#0xff
00a9baa8	csel x8,x8,x0,ne
00a9baac	strb wzr,[x8]
00a9bab0	mov w0,#0x1
00a9bab4	ret
