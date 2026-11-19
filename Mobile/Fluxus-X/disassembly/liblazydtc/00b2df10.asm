; ossl_blake2b_update @ 00b2df10
00b2df10	str x23,[sp, #-0x40]!
00b2df14	stp x22,x21,[sp, #0x10]
00b2df18	stp x20,x19,[sp, #0x20]
00b2df1c	stp x29,x30,[sp, #0x30]
00b2df20	ldr x8,[x0, #0xe0]
00b2df24	mov w9,#0x80
00b2df28	mov x20,x2
00b2df2c	mov x19,x0
00b2df30	sub x22,x9,x8
00b2df34	cmp x22,x2
00b2df38	mov x21,x1
00b2df3c	add x29,sp,#0x30
00b2df40	b.cs 0x00b2dfb8
00b2df44	cbz x8,0x00b2df78
00b2df48	add x23,x19,#0x60
00b2df4c	add x0,x23,x8
00b2df50	mov x1,x21
00b2df54	mov x2,x22
00b2df58	bl 0x00c2ffd0
00b2df5c	mov w2,#0x80
00b2df60	mov x0,x19
00b2df64	mov x1,x23
00b2df68	bl 0x00b2dff0
00b2df6c	add x21,x21,x22
00b2df70	sub x20,x20,x22
00b2df74	str xzr,[x19, #0xe0]
00b2df78	cmp x20,#0x81
00b2df7c	b.cc 0x00b2dfb4
00b2df80	and x8,x20,#0x7f
00b2df84	tst x20,#0x7f
00b2df88	mov w9,#0x80
00b2df8c	csel x22,x9,x8,eq
00b2df90	sub x20,x20,x22
00b2df94	mov x0,x19
00b2df98	mov x1,x21
00b2df9c	mov x2,x20
00b2dfa0	bl 0x00b2dff0
00b2dfa4	ldr x8,[x19, #0xe0]
00b2dfa8	add x21,x21,x20
00b2dfac	mov x20,x22
00b2dfb0	b 0x00b2dfb8
00b2dfb4	mov x8,xzr
00b2dfb8	add x8,x19,x8
00b2dfbc	add x0,x8,#0x60
00b2dfc0	mov x1,x21
00b2dfc4	mov x2,x20
00b2dfc8	bl 0x00c2ffd0
00b2dfcc	ldr x8,[x19, #0xe0]
00b2dfd0	mov w0,#0x1
00b2dfd4	add x8,x8,x20
00b2dfd8	str x8,[x19, #0xe0]
00b2dfdc	ldp x29,x30,[sp, #0x30]
00b2dfe0	ldp x20,x19,[sp, #0x20]
00b2dfe4	ldp x22,x21,[sp, #0x10]
00b2dfe8	ldr x23,[sp], #0x40
00b2dfec	ret
