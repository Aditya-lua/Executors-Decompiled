; ossl_provider_doall_activated @ 00aa3f0c
00aa3f0c	str x27,[sp, #-0x60]!
00aa3f10	stp x20,x19,[sp, #0x40]
00aa3f14	mov x20,x2
00aa3f18	adrp x2,0xc6d000
00aa3f1c	stp x22,x21,[sp, #0x30]
00aa3f20	mov x21,x1
00aa3f24	add x2,x2,#0x4c8
00aa3f28	mov w1,#0x1
00aa3f2c	stp x26,x25,[sp, #0x10]
00aa3f30	stp x24,x23,[sp, #0x20]
00aa3f34	stp x29,x30,[sp, #0x50]
00aa3f38	add x29,sp,#0x50
00aa3f3c	mov x19,x0
00aa3f40	bl 0x00c3b520
00aa3f44	mov x23,x0
00aa3f48	cbnz x0,0x00aa3f7c
00aa3f4c	bl 0x00c342a0
00aa3f50	adrp x0,0x2aa000
00aa3f54	adrp x2,0x2bb000
00aa3f58	add x0,x0,#0x4b5
00aa3f5c	add x2,x2,#0xf7d
00aa3f60	mov w1,#0x156
00aa3f64	bl 0x00c342b0
00aa3f68	mov w1,#0x103
00aa3f6c	orr w0,wzr,#0xf
00aa3f70	movk w1,#0xc, LSL #16
00aa3f74	mov x2,xzr
00aa3f78	bl 0x00c342c0
00aa3f7c	mov x0,x19
00aa3f80	bl 0x00c3def0
00aa3f84	cbz w0,0x00aa3f94
00aa3f88	mov w0,#0x40
00aa3f8c	mov x1,xzr
00aa3f90	bl 0x00c35500
00aa3f94	cbz x23,0x00aa411c
00aa3f98	mov x0,x23
00aa3f9c	bl 0x00aa4178
00aa3fa0	cbz w0,0x00aa412c
00aa3fa4	ldr x0,[x23, #0x20]
00aa3fa8	bl 0x00c35680
00aa3fac	cbz w0,0x00aa412c
00aa3fb0	ldr x0,[x23, #0x8]
00aa3fb4	bl 0x00c35330
00aa3fb8	cbz x0,0x00aa4124
00aa3fbc	mov x19,x0
00aa3fc0	bl 0x00c325e0
00aa3fc4	mov w22,w0
00aa3fc8	cmp w0,#0x1
00aa3fcc	b.lt 0x00aa4150
00aa3fd0	mov w26,w22
00aa3fd4	sub w25,w22,#0x1
00aa3fd8	mov x0,x19
00aa3fdc	mov w1,w25
00aa3fe0	bl 0x00c32610
00aa3fe4	mov x24,x0
00aa3fe8	ldr x0,[x0, #0x8]
00aa3fec	bl 0x00c356a0
00aa3ff0	cbz w0,0x00aa40b8
00aa3ff4	ldrb w8,[x24]
00aa3ff8	tbnz w8,#0x1,0x00aa4010
00aa3ffc	mov x0,x19
00aa4000	mov w1,w25
00aa4004	bl 0x00c35320
00aa4008	sub w26,w26,#0x1
00aa400c	b 0x00aa4038
00aa4010	add x27,x24,#0x10
00aa4014	ldxr w8,[x27]
00aa4018	add w8,w8,#0x1
00aa401c	stxr w9,w8,[x27]
00aa4020	cbnz w9,0x00aa4014
00aa4024	mov x0,x24
00aa4028	mov w1,wzr
00aa402c	mov w2,wzr
00aa4030	bl 0x00aa3714
00aa4034	tbnz w0,#0x1f,0x00aa4098
00aa4038	ldr x0,[x24, #0x8]
00aa403c	bl 0x00c35690
00aa4040	cmp w22,#0x1
00aa4044	mov w22,w25
00aa4048	b.gt 0x00aa3fd4
00aa404c	ldr x0,[x23, #0x20]
00aa4050	bl 0x00c35690
00aa4054	cmp w26,#0x1
00aa4058	b.lt 0x00aa4084
00aa405c	mov w22,wzr
00aa4060	mov x0,x19
00aa4064	mov w1,w22
00aa4068	bl 0x00c32610
00aa406c	mov x1,x20
00aa4070	blr x21
00aa4074	cbz w0,0x00aa4170
00aa4078	add w22,w22,#0x1
00aa407c	cmp w22,w26
00aa4080	b.lt 0x00aa4060
00aa4084	mov w22,wzr
00aa4088	mov w20,#0x1
00aa408c	cmp w22,w26
00aa4090	b.lt 0x00aa40cc
00aa4094	b 0x00aa4110
00aa4098	ldxr w8,[x27]
00aa409c	subs w8,w8,#0x1
00aa40a0	stxr w9,w8,[x27]
00aa40a4	cbnz w9,0x00aa4098
00aa40a8	b.ne 0x00aa40b0
00aa40ac	dmb ISHLD
00aa40b0	ldr x0,[x24, #0x8]
00aa40b4	bl 0x00c35690
00aa40b8	ldr x0,[x23, #0x20]
00aa40bc	bl 0x00c35690
00aa40c0	mov w20,wzr
00aa40c4	cmp w22,w26
00aa40c8	b.ge 0x00aa4110
00aa40cc	mov x0,x19
00aa40d0	mov w1,w22
00aa40d4	bl 0x00c32610
00aa40d8	mov w2,#0x1
00aa40dc	mov w1,wzr
00aa40e0	mov x21,x0
00aa40e4	bl 0x00aa3c88
00aa40e8	add x8,x21,#0x10
00aa40ec	ldxr w9,[x8]
00aa40f0	subs w9,w9,#0x1
00aa40f4	stxr w10,w9,[x8]
00aa40f8	cbnz w10,0x00aa40ec
00aa40fc	b.ne 0x00aa4104
00aa4100	dmb ISHLD
00aa4104	add w22,w22,#0x1
00aa4108	cmp w22,w26
00aa410c	b.ne 0x00aa40cc
00aa4110	mov x0,x19
00aa4114	bl 0x00c34770
00aa4118	b 0x00aa4130
00aa411c	mov w20,#0x1
00aa4120	b 0x00aa4130
00aa4124	ldr x0,[x23, #0x20]
00aa4128	bl 0x00c35690
00aa412c	mov w20,wzr
00aa4130	mov w0,w20
00aa4134	ldp x29,x30,[sp, #0x50]
00aa4138	ldp x20,x19,[sp, #0x40]
00aa413c	ldp x22,x21,[sp, #0x30]
00aa4140	ldp x24,x23,[sp, #0x20]
00aa4144	ldp x26,x25,[sp, #0x10]
00aa4148	ldr x27,[sp], #0x60
00aa414c	ret
00aa4150	ldr x0,[x23, #0x20]
00aa4154	bl 0x00c35690
00aa4158	mov w20,#0x1
00aa415c	mov w26,w22
00aa4160	mov w22,wzr
00aa4164	cmp w22,w26
00aa4168	b.lt 0x00aa40cc
00aa416c	b 0x00aa4110
00aa4170	mov w22,wzr
00aa4174	b 0x00aa40c0
