; FUN_00b6c998 @ 00b6c998
00b6c998	sub sp,sp,#0x70
00b6c99c	str x19,[sp, #0x50]
00b6c9a0	stp x29,x30,[sp, #0x60]
00b6c9a4	add x29,sp,#0x60
00b6c9a8	mrs x19,tpidr_el0
00b6c9ac	ldr x8,[x19, #0x28]
00b6c9b0	mov w12,#0xa
00b6c9b4	stur x8,[x29, #-0x18]
00b6c9b8	ldr q0,[x0, #0x10]
00b6c9bc	str q0,[sp, #0x10]
00b6c9c0	ldr q0,[x0]
00b6c9c4	ldp w11,w15,[sp, #0x10]
00b6c9c8	ldp w18,w3,[sp, #0x18]
00b6c9cc	str q0,[sp]
00b6c9d0	ldr q0,[x0, #0x30]
00b6c9d4	ldp w4,w5,[sp]
00b6c9d8	ldp w7,w6,[sp, #0x8]
00b6c9dc	str q0,[sp, #0x30]
00b6c9e0	ldr q0,[x0, #0x20]
00b6c9e4	ldp w8,w9,[sp, #0x30]
00b6c9e8	ldp w13,w16,[sp, #0x38]
00b6c9ec	str q0,[sp, #0x20]
00b6c9f0	ldp w10,w14,[sp, #0x20]
00b6c9f4	ldp w17,w2,[sp, #0x28]
00b6c9f8	add w4,w4,w11
00b6c9fc	add w5,w5,w15
00b6ca00	add w7,w7,w18
00b6ca04	add w6,w6,w3
00b6ca08	eor w8,w8,w4
00b6ca0c	eor w9,w9,w5
00b6ca10	eor w13,w13,w7
00b6ca14	eor w16,w16,w6
00b6ca18	ror w8,w8,#0x10
00b6ca1c	ror w9,w9,#0x10
00b6ca20	ror w13,w13,#0x10
00b6ca24	ror w16,w16,#0x10
00b6ca28	add w10,w8,w10
00b6ca2c	add w14,w9,w14
00b6ca30	add w17,w13,w17
00b6ca34	add w2,w16,w2
00b6ca38	eor w11,w10,w11
00b6ca3c	eor w15,w14,w15
00b6ca40	eor w18,w17,w18
00b6ca44	eor w3,w2,w3
00b6ca48	ror w11,w11,#0x14
00b6ca4c	ror w15,w15,#0x14
00b6ca50	ror w18,w18,#0x14
00b6ca54	ror w3,w3,#0x14
00b6ca58	add w4,w11,w4
00b6ca5c	add w5,w15,w5
00b6ca60	add w7,w18,w7
00b6ca64	add w6,w3,w6
00b6ca68	eor w8,w4,w8
00b6ca6c	eor w9,w5,w9
00b6ca70	eor w13,w7,w13
00b6ca74	eor w16,w6,w16
00b6ca78	ror w8,w8,#0x18
00b6ca7c	ror w9,w9,#0x18
00b6ca80	ror w13,w13,#0x18
00b6ca84	ror w16,w16,#0x18
00b6ca88	add w10,w8,w10
00b6ca8c	add w14,w9,w14
00b6ca90	add w17,w13,w17
00b6ca94	add w2,w16,w2
00b6ca98	eor w11,w10,w11
00b6ca9c	eor w15,w14,w15
00b6caa0	eor w18,w17,w18
00b6caa4	eor w3,w2,w3
00b6caa8	ror w11,w11,#0x19
00b6caac	ror w15,w15,#0x19
00b6cab0	ror w18,w18,#0x19
00b6cab4	ror w3,w3,#0x19
00b6cab8	add w4,w15,w4
00b6cabc	add w5,w18,w5
00b6cac0	add w7,w3,w7
00b6cac4	add w6,w6,w11
00b6cac8	eor w16,w16,w4
00b6cacc	eor w8,w5,w8
00b6cad0	eor w9,w7,w9
00b6cad4	eor w13,w6,w13
00b6cad8	ror w16,w16,#0x10
00b6cadc	ror w8,w8,#0x10
00b6cae0	ror w9,w9,#0x10
00b6cae4	ror w13,w13,#0x10
00b6cae8	add w17,w16,w17
00b6caec	add w2,w8,w2
00b6caf0	add w10,w9,w10
00b6caf4	add w14,w13,w14
00b6caf8	eor w15,w17,w15
00b6cafc	eor w18,w2,w18
00b6cb00	eor w3,w10,w3
00b6cb04	eor w11,w14,w11
00b6cb08	ror w15,w15,#0x14
00b6cb0c	ror w18,w18,#0x14
00b6cb10	ror w3,w3,#0x14
00b6cb14	ror w11,w11,#0x14
00b6cb18	add w4,w15,w4
00b6cb1c	add w5,w18,w5
00b6cb20	add w7,w3,w7
00b6cb24	add w6,w11,w6
00b6cb28	eor w16,w4,w16
00b6cb2c	eor w8,w5,w8
00b6cb30	eor w9,w7,w9
00b6cb34	eor w13,w6,w13
00b6cb38	ror w16,w16,#0x18
00b6cb3c	ror w8,w8,#0x18
00b6cb40	ror w9,w9,#0x18
00b6cb44	ror w13,w13,#0x18
00b6cb48	add w17,w16,w17
00b6cb4c	add w2,w8,w2
00b6cb50	add w10,w9,w10
00b6cb54	add w14,w13,w14
00b6cb58	eor w15,w17,w15
00b6cb5c	eor w18,w2,w18
00b6cb60	eor w3,w10,w3
00b6cb64	eor w11,w14,w11
00b6cb68	subs x12,x12,#0x1
00b6cb6c	ror w15,w15,#0x19
00b6cb70	ror w18,w18,#0x19
00b6cb74	ror w3,w3,#0x19
00b6cb78	ror w11,w11,#0x19
00b6cb7c	b.ne 0x00b6c9f8
00b6cb80	ldr w12,[x0]
00b6cb84	add w12,w4,w12
00b6cb88	str w12,[sp]
00b6cb8c	ldr w12,[x0, #0x4]
00b6cb90	add w12,w5,w12
00b6cb94	str w12,[sp, #0x4]
00b6cb98	ldr w12,[x0, #0x8]
00b6cb9c	add w12,w7,w12
00b6cba0	str w12,[sp, #0x8]
00b6cba4	ldr w12,[x0, #0xc]
00b6cba8	add w12,w6,w12
00b6cbac	str w12,[sp, #0xc]
00b6cbb0	ldr w12,[x0, #0x10]
00b6cbb4	add w11,w11,w12
00b6cbb8	str w11,[sp, #0x10]
00b6cbbc	ldr w11,[x0, #0x14]
00b6cbc0	add w11,w15,w11
00b6cbc4	str w11,[sp, #0x14]
00b6cbc8	ldr w11,[x0, #0x18]
00b6cbcc	add w11,w18,w11
00b6cbd0	str w11,[sp, #0x18]
00b6cbd4	ldr w11,[x0, #0x1c]
00b6cbd8	add w11,w3,w11
00b6cbdc	str w11,[sp, #0x1c]
00b6cbe0	ldr w11,[x0, #0x20]
00b6cbe4	add w10,w10,w11
00b6cbe8	str w10,[sp, #0x20]
00b6cbec	ldr w10,[x0, #0x24]
00b6cbf0	add w10,w14,w10
00b6cbf4	str w10,[sp, #0x24]
00b6cbf8	ldr w10,[x0, #0x28]
00b6cbfc	add w10,w17,w10
00b6cc00	str w10,[sp, #0x28]
00b6cc04	ldr w10,[x0, #0x2c]
00b6cc08	add w10,w2,w10
00b6cc0c	str w10,[sp, #0x2c]
00b6cc10	ldr w10,[x0, #0x30]
00b6cc14	ldr q0,[sp, #0x20]
00b6cc18	add w8,w8,w10
00b6cc1c	str w8,[sp, #0x30]
00b6cc20	ldr w8,[x0, #0x34]
00b6cc24	add w8,w9,w8
00b6cc28	str w8,[sp, #0x34]
00b6cc2c	ldr w8,[x0, #0x38]
00b6cc30	add w8,w13,w8
00b6cc34	str w8,[sp, #0x38]
00b6cc38	ldr w8,[x0, #0x3c]
00b6cc3c	mov x0,sp
00b6cc40	add w8,w16,w8
00b6cc44	str w8,[sp, #0x3c]
00b6cc48	str q0,[x1, #0x20]
00b6cc4c	ldr q0,[sp, #0x10]
00b6cc50	str q0,[x1, #0x10]
00b6cc54	ldr q0,[sp, #0x30]
00b6cc58	str q0,[x1, #0x30]
00b6cc5c	ldr q0,[sp]
00b6cc60	str q0,[x1]
00b6cc64	mov w1,#0x40
00b6cc68	bl 0x00c42220
00b6cc6c	ldr x8,[x19, #0x28]
00b6cc70	ldur x9,[x29, #-0x18]
00b6cc74	cmp x8,x9
00b6cc78	b.ne 0x00b6cc8c
00b6cc7c	ldp x29,x30,[sp, #0x60]
00b6cc80	ldr x19,[sp, #0x50]
00b6cc84	add sp,sp,#0x70
00b6cc88	ret
00b6cc8c	bl 0x00c2fec0
