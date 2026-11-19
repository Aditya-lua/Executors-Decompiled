; FUN_00a9cab8 @ 00a9cab8
00a9cab8	str x23,[sp, #-0x40]!
00a9cabc	stp x22,x21,[sp, #0x10]
00a9cac0	stp x20,x19,[sp, #0x20]
00a9cac4	stp x29,x30,[sp, #0x30]
00a9cac8	ldr x8,[x0, #0x18]
00a9cacc	ldr x9,[x1, #0x18]
00a9cad0	mov x19,x1
00a9cad4	mov x20,x0
00a9cad8	mov w21,w2
00a9cadc	subs x23,x8,x9
00a9cae0	add x29,sp,#0x30
00a9cae4	b.eq 0x00a9cb20
00a9cae8	ldr x8,[x19, #0x10]
00a9caec	cbz x8,0x00a9cb64
00a9caf0	ldr x9,[x20, #0x8]
00a9caf4	cbz x9,0x00a9cc3c
00a9caf8	ldr x10,[x19, #0x8]
00a9cafc	add x9,x9,x10
00a9cb00	add x10,x9,x8
00a9cb04	subs x8,x8,#0x1
00a9cb08	sturb w23,[x10, #-0x1]
00a9cb0c	lsr x23,x23,#0x8
00a9cb10	b.ne 0x00a9cb00
00a9cb14	mov w0,wzr
00a9cb18	cbnz x23,0x00a9cc70
00a9cb1c	b 0x00a9cc4c
00a9cb20	ldr w9,[x19, #0x20]
00a9cb24	mov w0,wzr
00a9cb28	tbnz w9,#0x0,0x00a9cc70
00a9cb2c	tbz w9,#0x1,0x00a9cae8
00a9cb30	cbz w21,0x00a9cc84
00a9cb34	mov x9,x19
00a9cb38	ldr x10,[x20, #0x10]
00a9cb3c	ldr x12,[x9, #0x8]!
00a9cb40	ldr x11,[x9, #0x8]
00a9cb44	sub x10,x10,x11
00a9cb48	cmp x10,x12
00a9cb4c	b.ne 0x00a9cb58
00a9cb50	sub x8,x8,x11
00a9cb54	stp x10,x8,[x20, #0x10]
00a9cb58	stp xzr,xzr,[x9]
00a9cb5c	ldr x8,[x19, #0x10]
00a9cb60	cbnz x8,0x00a9caf0
00a9cb64	ldrb w8,[x20, #0x30]
00a9cb68	tbz w8,#0x0,0x00a9cc4c
00a9cb6c	ldr x8,[x19]
00a9cb70	cbz x8,0x00a9cc4c
00a9cb74	cbnz x23,0x00a9cb80
00a9cb78	ldrb w8,[x19, #0x20]
00a9cb7c	tbnz w8,#0x1,0x00a9cc4c
00a9cb80	mov x22,xzr
00a9cb84	mov x8,x23
00a9cb88	lsr x8,x8,#0x8
00a9cb8c	add x22,x22,#0x1
00a9cb90	cbnz x8,0x00a9cb88
00a9cb94	cmp x22,#0x8
00a9cb98	b.hi 0x00a9cc84
00a9cb9c	add x2,sp,#0x8
00a9cba0	mov x0,x20
00a9cba4	mov x1,x22
00a9cba8	bl 0x00a9c32c
00a9cbac	cbz w0,0x00a9cc84
00a9cbb0	ldr q0,[x20, #0x10]
00a9cbb4	dup v1.2D,x22
00a9cbb8	add v0.2D,v0.2D,v1.2D
00a9cbbc	str q0,[x20, #0x10]
00a9cbc0	ldr x8,[sp, #0x8]
00a9cbc4	cbz x8,0x00a9cbec
00a9cbc8	mov x10,x22
00a9cbcc	mov x9,x23
00a9cbd0	add x11,x8,x10
00a9cbd4	subs x10,x10,#0x1
00a9cbd8	sturb w9,[x11, #-0x1]
00a9cbdc	lsr x9,x9,#0x8
00a9cbe0	b.ne 0x00a9cbd0
00a9cbe4	mov w0,wzr
00a9cbe8	cbnz x9,0x00a9cc70
00a9cbec	cmp x23,#0x80
00a9cbf0	b.cc 0x00a9cc4c
00a9cbf4	mov w1,#0x1
00a9cbf8	add x2,sp,#0x8
00a9cbfc	mov x0,x20
00a9cc00	bl 0x00a9c32c
00a9cc04	cbz w0,0x00a9cc70
00a9cc08	ldr q0,[x20, #0x10]
00a9cc0c	mov w8,#0x1
00a9cc10	dup v1.2D,x8
00a9cc14	add v0.2D,v0.2D,v1.2D
00a9cc18	str q0,[x20, #0x10]
00a9cc1c	ldr x8,[sp, #0x8]
00a9cc20	cbz x8,0x00a9cc4c
00a9cc24	mov w0,wzr
00a9cc28	orr w9,w22,#0x80
00a9cc2c	tst x22,#0x7fffffffffffff00
00a9cc30	strb w9,[x8]
00a9cc34	b.ne 0x00a9cc70
00a9cc38	b 0x00a9cc4c
00a9cc3c	ldr x9,[x20]
00a9cc40	cbz x9,0x00a9cc4c
00a9cc44	ldr x9,[x9, #0x8]
00a9cc48	cbnz x9,0x00a9caf8
00a9cc4c	cbz w21,0x00a9cc6c
00a9cc50	ldr x8,[x19]
00a9cc54	adrp x1,0x2bd000
00a9cc58	add x1,x1,#0xe31
00a9cc5c	mov w2,#0x120
00a9cc60	mov x0,x19
00a9cc64	str x8,[x20, #0x28]
00a9cc68	bl 0x00c32310
00a9cc6c	mov w0,#0x1
00a9cc70	ldp x29,x30,[sp, #0x30]
00a9cc74	ldp x20,x19,[sp, #0x20]
00a9cc78	ldp x22,x21,[sp, #0x10]
00a9cc7c	ldr x23,[sp], #0x40
00a9cc80	ret
00a9cc84	mov w0,wzr
00a9cc88	b 0x00a9cc70
