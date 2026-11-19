; FUN_0080c97c @ 0080c97c
0080c97c	sub sp,sp,#0x70
0080c980	stp x29,x30,[sp, #0x20]
0080c984	stp x26,x25,[sp, #0x30]
0080c988	stp x24,x23,[sp, #0x40]
0080c98c	stp x22,x21,[sp, #0x50]
0080c990	stp x20,x19,[sp, #0x60]
0080c994	add x29,sp,#0x20
0080c998	mrs x22,tpidr_el0
0080c99c	mov x11,#0x2d69
0080c9a0	mov x19,x0
0080c9a4	ldr x8,[x22, #0x28]
0080c9a8	movk x11,#0xeb38, LSL #16
0080c9ac	mov x21,x3
0080c9b0	movk x11,#0xea08, LSL #32
0080c9b4	stur x8,[x29, #-0x8]
0080c9b8	movk x11,#0x9ddf, LSL #48
0080c9bc	ldr x8,[x1]
0080c9c0	ldr x23,[x0, #0x8]
0080c9c4	lsl w9,w8,#0x3
0080c9c8	lsr x10,x8,#0x20
0080c9cc	add x9,x9,#0x8
0080c9d0	eor x9,x9,x10
0080c9d4	mul x9,x9,x11
0080c9d8	eor x10,x10,x9, LSR #0x2f
0080c9dc	eor x9,x10,x9
0080c9e0	mul x9,x9,x11
0080c9e4	eor x9,x9,x9, LSR #0x2f
0080c9e8	mul x24,x9,x11
0080c9ec	cbz x23,0x0080ca14
0080c9f0	fmov d0,x23
0080c9f4	cnt v0.8B,v0.8B
0080c9f8	addv b0,v0.8B
0080c9fc	fmov x9,d0
0080ca00	cmp x9,#0x1
0080ca04	b.hi 0x0080ca18
0080ca08	sub x10,x23,#0x1
0080ca0c	and x26,x24,x10
0080ca10	b 0x0080ca2c
0080ca14	b 0x0080ca90
0080ca18	cmp x24,x23
0080ca1c	mov x26,x24
0080ca20	b.cc 0x0080ca2c
0080ca24	udiv x10,x24,x23
0080ca28	msub x26,x10,x23,x24
0080ca2c	ldr x10,[x19]
0080ca30	ldr x10,[x10, x26, LSL #0x3]
0080ca34	cbz x10,0x0080ca90
0080ca38	ldr x20,[x10]
0080ca3c	cbz x20,0x0080ca90
0080ca40	sub x10,x23,#0x1
0080ca44	b 0x0080ca5c
0080ca48	ldr x11,[x20, #0x10]
0080ca4c	cmp x11,x8
0080ca50	b.eq 0x0080cbb0
0080ca54	ldr x20,[x20]
0080ca58	cbz x20,0x0080ca90
0080ca5c	ldr x11,[x20, #0x8]
0080ca60	cmp x11,x24
0080ca64	b.eq 0x0080ca48
0080ca68	cmp x9,#0x1
0080ca6c	b.hi 0x0080ca78
0080ca70	and x11,x11,x10
0080ca74	b 0x0080ca88
0080ca78	cmp x11,x23
0080ca7c	b.cc 0x0080ca88
0080ca80	udiv x12,x11,x23
0080ca84	msub x11,x12,x23,x11
0080ca88	cmp x11,x26
0080ca8c	b.eq 0x0080ca54
0080ca90	mov w0,#0x28
0080ca94	add x25,x19,#0x10
0080ca98	bl 0x00c2fed0
0080ca9c	ldr x9,[x19, #0x18]
0080caa0	mov w8,#0x1
0080caa4	ldr s1,[x19, #0x20]
0080caa8	stp x25,x8,[sp, #0x8]
0080caac	ldr x8,[x21]
0080cab0	mov x20,x0
0080cab4	add x9,x9,#0x1
0080cab8	str x0,[sp]
0080cabc	ucvtf s0,x9
0080cac0	ldr x8,[x8]
0080cac4	stp xzr,x24,[x0]
0080cac8	str xzr,[x0, #0x20]
0080cacc	stp x8,xzr,[x0, #0x10]
0080cad0	cbz x23,0x0080cae4
0080cad4	ucvtf s2,x23
0080cad8	fmul s2,s1,s2
0080cadc	fcmp s2,s0
0080cae0	b.pl 0x0080cbfc
0080cae4	lsl x8,x23,#0x1
0080cae8	cmp x23,#0x3
0080caec	b.cc 0x0080cb00
0080caf0	sub x9,x23,#0x1
0080caf4	tst x23,x9
0080caf8	cset w9,ne
0080cafc	b 0x0080cb04
0080cb00	mov w9,#0x1
0080cb04	fdiv s0,s0,s1
0080cb08	orr x8,x9,x8
0080cb0c	fcvtpu x10,s0
0080cb10	cmp x8,x10
0080cb14	csel x21,x8,x10,hi
0080cb18	subs x8,x21,#0x1
0080cb1c	b.ne 0x0080cb28
0080cb20	mov w21,#0x2
0080cb24	b 0x0080cb40
0080cb28	tst x21,x8
0080cb2c	b.eq 0x0080cb40
0080cb30	mov x0,x21
0080cb34	bl 0x00c301b0
0080cb38	ldr x23,[x19, #0x8]
0080cb3c	mov x21,x0
0080cb40	cmp x21,x23
0080cb44	b.ls 0x0080cb58
0080cb48	mov x0,x19
0080cb4c	mov x1,x21
0080cb50	bl 0x0080cd3c
0080cb54	b 0x0080cbcc
0080cb58	b.cs 0x0080cbcc
0080cb5c	ldr x8,[x19, #0x18]
0080cb60	ldr s1,[x19, #0x20]
0080cb64	cmp x23,#0x3
0080cb68	ucvtf s0,x8
0080cb6c	fdiv s0,s0,s1
0080cb70	fcvtpu x0,s0
0080cb74	b.cc 0x0080cbb8
0080cb78	fmov d0,x23
0080cb7c	cnt v0.8B,v0.8B
0080cb80	addv b0,v0.8B
0080cb84	fmov x8,d0
0080cb88	cmp x8,#0x1
0080cb8c	b.hi 0x0080cbb8
0080cb90	sub x8,x0,#0x1
0080cb94	mov w9,#0x1
0080cb98	cmp x0,#0x2
0080cb9c	clz x8,x8
0080cba0	neg x8,x8
0080cba4	lsl x8,x9,x8
0080cba8	csel x0,x0,x8,cc
0080cbac	b 0x0080cbbc
0080cbb0	mov x1,xzr
0080cbb4	b 0x0080cc24
0080cbb8	bl 0x00c301b0
0080cbbc	cmp x21,x0
0080cbc0	csel x21,x21,x0,hi
0080cbc4	cmp x21,x23
0080cbc8	b.cc 0x0080cb48
0080cbcc	ldr x23,[x19, #0x8]
0080cbd0	sub x8,x23,#0x1
0080cbd4	tst x23,x8
0080cbd8	b.ne 0x0080cbe4
0080cbdc	and x26,x8,x24
0080cbe0	b 0x0080cbfc
0080cbe4	cmp x24,x23
0080cbe8	b.cs 0x0080cbf4
0080cbec	mov x26,x24
0080cbf0	b 0x0080cbfc
0080cbf4	udiv x8,x24,x23
0080cbf8	msub x26,x8,x23,x24
0080cbfc	ldr x8,[x19]
0080cc00	ldr x9,[x8, x26, LSL #0x3]
0080cc04	cbz x9,0x0080cc54
0080cc08	ldr x8,[x9]
0080cc0c	str x8,[x20]
0080cc10	str x20,[x9]
0080cc14	ldr x8,[x19, #0x18]
0080cc18	mov w1,#0x1
0080cc1c	add x8,x8,#0x1
0080cc20	str x8,[x19, #0x18]
0080cc24	ldr x8,[x22, #0x28]
0080cc28	ldur x9,[x29, #-0x8]
0080cc2c	cmp x8,x9
0080cc30	b.ne 0x0080ccc4
0080cc34	mov x0,x20
0080cc38	ldp x20,x19,[sp, #0x60]
0080cc3c	ldp x22,x21,[sp, #0x50]
0080cc40	ldp x24,x23,[sp, #0x40]
0080cc44	ldp x26,x25,[sp, #0x30]
0080cc48	ldp x29,x30,[sp, #0x20]
0080cc4c	add sp,sp,#0x70
0080cc50	ret
0080cc54	ldr x9,[x25]
0080cc58	str x20,[x25]
0080cc5c	str x9,[x20]
0080cc60	str x25,[x8, x26, LSL #0x3]
0080cc64	ldr x9,[x20]
0080cc68	cbz x9,0x0080cc14
0080cc6c	sub x10,x23,#0x1
0080cc70	ldr x9,[x9, #0x8]
0080cc74	tst x23,x10
0080cc78	b.ne 0x0080cc88
0080cc7c	and x9,x9,x10
0080cc80	str x20,[x8, x9, LSL #0x3]
0080cc84	b 0x0080cc14
0080cc88	cmp x9,x23
0080cc8c	b.cc 0x0080cc98
0080cc90	udiv x10,x9,x23
0080cc94	msub x9,x10,x23,x9
0080cc98	str x20,[x8, x9, LSL #0x3]
0080cc9c	b 0x0080cc14
0080ccc4	bl 0x00c2fec0
