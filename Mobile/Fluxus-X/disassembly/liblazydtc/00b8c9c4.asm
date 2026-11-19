; psa_aead_update @ 00b8c9c4
00b8c9c4	stp x26,x25,[sp, #-0x50]!
00b8c9c8	stp x24,x23,[sp, #0x10]
00b8c9cc	stp x22,x21,[sp, #0x20]
00b8c9d0	stp x20,x19,[sp, #0x30]
00b8c9d4	stp x29,x30,[sp, #0x40]
00b8c9d8	add x29,sp,#0x40
00b8c9dc	mov x24,x5
00b8c9e0	mov x25,x4
00b8c9e4	mov x19,x3
00b8c9e8	mov x26,x2
00b8c9ec	mov x21,x1
00b8c9f0	mov x22,x0
00b8c9f4	cbz x2,0x00b8ca40
00b8c9f8	mov w1,#0x1
00b8c9fc	mov x0,x26
00b8ca00	bl 0x00c30a30
00b8ca04	mov x20,x0
00b8ca08	cbz x0,0x00b8cab0
00b8ca0c	mov x0,x20
00b8ca10	mov x1,x21
00b8ca14	mov x2,x26
00b8ca18	bl 0x00c2ffd0
00b8ca1c	cbz x25,0x00b8ca48
00b8ca20	mov w1,#0x1
00b8ca24	mov x0,x25
00b8ca28	bl 0x00c30a30
00b8ca2c	mov x21,x0
00b8ca30	mov x23,x25
00b8ca34	cbnz x0,0x00b8ca54
00b8ca38	mov x19,xzr
00b8ca3c	b 0x00b8cab8
00b8ca40	mov x20,xzr
00b8ca44	cbnz x25,0x00b8ca20
00b8ca48	mov x23,xzr
00b8ca4c	mov x21,xzr
00b8ca50	mov x19,xzr
00b8ca54	str xzr,[x24]
00b8ca58	ldr w8,[x22]
00b8ca5c	cbz w8,0x00b8ca80
00b8ca60	ldrb w9,[x22, #0x20]
00b8ca64	tbz w9,#0x0,0x00b8ca80
00b8ca68	tbnz w9,#0x1,0x00b8cb18
00b8ca6c	ldr w9,[x22, #0x4]
00b8ca70	mov w10,#0x100
00b8ca74	movk w10,#0x550, LSL #16
00b8ca78	cmp w9,w10
00b8ca7c	b.ne 0x00b8cb30
00b8ca80	mov w24,#0xffffff77
00b8ca84	ldr w8,[x22]
00b8ca88	cbz w8,0x00b8cac8
00b8ca8c	cmp w8,#0x1
00b8ca90	b.ne 0x00b8ca9c
00b8ca94	add x0,x22,#0x28
00b8ca98	bl 0x00c42db0
00b8ca9c	mov w2,#0x1d8
00b8caa0	mov x0,x22
00b8caa4	mov w1,wzr
00b8caa8	bl 0x00c301c0
00b8caac	b 0x00b8cac8
00b8cab0	mov x19,xzr
00b8cab4	mov x21,xzr
00b8cab8	mov x23,xzr
00b8cabc	mov w24,#0xffffff73
00b8cac0	ldr w8,[x22]
00b8cac4	cbnz w8,0x00b8ca8c
00b8cac8	mov x0,x20
00b8cacc	bl 0x00c30960
00b8cad0	cbz x21,0x00b8cafc
00b8cad4	cbz x19,0x00b8caf8
00b8cad8	cbz x23,0x00b8caec
00b8cadc	mov x0,x19
00b8cae0	mov x1,x21
00b8cae4	mov x2,x23
00b8cae8	bl 0x00c2ffd0
00b8caec	mov x0,x21
00b8caf0	bl 0x00c30960
00b8caf4	b 0x00b8cafc
00b8caf8	mov w24,#0xffffff69
00b8cafc	mov w0,w24
00b8cb00	ldp x29,x30,[sp, #0x40]
00b8cb04	ldp x20,x19,[sp, #0x30]
00b8cb08	ldp x22,x21,[sp, #0x20]
00b8cb0c	ldp x24,x23,[sp, #0x10]
00b8cb10	ldp x26,x25,[sp], #0x50
00b8cb14	ret
00b8cb18	ldr x9,[x22, #0x10]
00b8cb1c	cbnz x9,0x00b8cb6c
00b8cb20	ldr x9,[x22, #0x18]
00b8cb24	subs x9,x9,x26
00b8cb28	b.cc 0x00b8cb6c
00b8cb2c	str x9,[x22, #0x18]
00b8cb30	cmp w8,#0x1
00b8cb34	b.ne 0x00b8cb6c
00b8cb38	add x0,x22,#0x28
00b8cb3c	mov x1,x20
00b8cb40	mov x2,x26
00b8cb44	mov x3,x21
00b8cb48	mov x4,x25
00b8cb4c	mov x5,x24
00b8cb50	bl 0x00c42e30
00b8cb54	mov w24,w0
00b8cb58	cbnz w0,0x00b8cac0
00b8cb5c	ldrb w8,[x22, #0x20]
00b8cb60	orr w8,w8,#0x8
00b8cb64	strb w8,[x22, #0x20]
00b8cb68	b 0x00b8cac8
00b8cb6c	mov w24,#0xffffff79
00b8cb70	ldr w8,[x22]
00b8cb74	cbnz w8,0x00b8ca8c
00b8cb78	b 0x00b8cac8
