; mbedtls_gcm_setkey @ 00b76f54
00b76f54	sub sp,sp,#0x60
00b76f58	str x23,[sp, #0x20]
00b76f5c	stp x22,x21,[sp, #0x30]
00b76f60	stp x20,x19,[sp, #0x40]
00b76f64	stp x29,x30,[sp, #0x50]
00b76f68	add x29,sp,#0x50
00b76f6c	mrs x23,tpidr_el0
00b76f70	ldr x8,[x23, #0x28]
00b76f74	mov w20,w3
00b76f78	mov x21,x2
00b76f7c	mov x19,x0
00b76f80	cmp w3,#0x80
00b76f84	str x8,[sp, #0x18]
00b76f88	b.eq 0x00b76f9c
00b76f8c	cmp w20,#0x100
00b76f90	b.eq 0x00b76f9c
00b76f94	cmp w20,#0xc0
00b76f98	b.ne 0x00b771e0
00b76f9c	mov w2,#0x1
00b76fa0	mov w0,w1
00b76fa4	mov w1,w20
00b76fa8	bl 0x00c42160
00b76fac	mov x22,x0
00b76fb0	cbz x0,0x00b771e0
00b76fb4	ldr w8,[x22, #0x8]
00b76fb8	and w8,w8,#0x1f
00b76fbc	cmp w8,#0x10
00b76fc0	b.ne 0x00b771e0
00b76fc4	mov x0,x19
00b76fc8	bl 0x00c30290
00b76fcc	mov x0,x19
00b76fd0	mov x1,x22
00b76fd4	bl 0x00c30280
00b76fd8	cbnz w0,0x00b771e4
00b76fdc	mov w3,#0x1
00b76fe0	mov x0,x19
00b76fe4	mov x1,x21
00b76fe8	mov w2,w20
00b76fec	bl 0x00c302a0
00b76ff0	cbnz w0,0x00b771e4
00b76ff4	add x1,sp,#0x8
00b76ff8	mov w2,#0x10
00b76ffc	add x3,sp,#0x8
00b77000	mov x4,sp
00b77004	mov x0,x19
00b77008	stp xzr,xzr,[sp, #0x8]
00b7700c	str xzr,[sp]
00b77010	bl 0x00c42180
00b77014	cbnz w0,0x00b771e4
00b77018	strb wzr,[x19, #0x1a1]
00b7701c	ldp x8,x9,[sp, #0x8]
00b77020	orr w10,wzr,#0xffffffe1
00b77024	stp xzr,xzr,[x19, #0x60]
00b77028	rev x11,x9
00b7702c	rev x13,x8
00b77030	lsr x12,x8,#0x31
00b77034	tst x9,#0x100000000000000
00b77038	lsr x14,x11,#0x1
00b7703c	lsr x15,x13,#0x1
00b77040	and w12,w12,#0x80
00b77044	csel w16,wzr,w10,eq
00b77048	stp x13,x11,[x19, #0xe0]
00b7704c	rev x11,x14
00b77050	rev x13,x15
00b77054	orr w12,w12,w11
00b77058	eor w14,w16,w13
00b7705c	stp x13,x11,[x19, #0xa0]
00b77060	strb w12,[x19, #0xa8]
00b77064	strb w14,[x19, #0xa0]
00b77068	tst x11,#0x100000000000000
00b7706c	ldp x11,x12,[x19, #0xa0]
00b77070	lsr x13,x13,#0x31
00b77074	and w13,w13,#0x80
00b77078	csel w14,wzr,w10,eq
00b7707c	rev x15,x12
00b77080	rev x16,x11
00b77084	eor x17,x9,x12
00b77088	eor x18,x8,x11
00b7708c	lsr x1,x15,#0x1
00b77090	lsr x2,x16,#0x1
00b77094	stp x16,x15,[x19, #0xa0]
00b77098	rev x15,x18
00b7709c	rev x16,x17
00b770a0	rev x17,x1
00b770a4	rev x18,x2
00b770a8	orr w13,w13,w17
00b770ac	eor w14,w14,w18
00b770b0	stp x18,x17,[x19, #0x80]
00b770b4	strb w13,[x19, #0x88]
00b770b8	strb w14,[x19, #0x80]
00b770bc	ldp x14,x13,[x19, #0x80]
00b770c0	stp x15,x16,[x19, #0x120]
00b770c4	tst x17,#0x100000000000000
00b770c8	lsr x15,x18,#0x31
00b770cc	rev x16,x13
00b770d0	rev x17,x14
00b770d4	lsr x4,x16,#0x1
00b770d8	lsr x5,x17,#0x1
00b770dc	and w15,w15,#0x80
00b770e0	csel w10,wzr,w10,eq
00b770e4	rev x4,x4
00b770e8	rev x5,x5
00b770ec	orr w15,w15,w4
00b770f0	eor w10,w10,w5
00b770f4	stp x5,x4,[x19, #0x70]
00b770f8	strb w15,[x19, #0x78]
00b770fc	strb w10,[x19, #0x70]
00b77100	ldp x10,x15,[x19, #0x70]
00b77104	eor x18,x12,x13
00b77108	eor x2,x11,x14
00b7710c	eor x1,x9,x13
00b77110	eor x3,x8,x14
00b77114	stp x17,x16,[x19, #0x80]
00b77118	eor x16,x9,x18
00b7711c	eor x17,x8,x2
00b77120	rev x2,x2
00b77124	rev x18,x18
00b77128	rev x3,x3
00b7712c	rev x1,x1
00b77130	rev x17,x17
00b77134	rev x16,x16
00b77138	eor x13,x15,x13
00b7713c	eor x14,x10,x14
00b77140	stp x2,x18,[x19, #0xc0]
00b77144	stp x3,x1,[x19, #0x100]
00b77148	stp x17,x16,[x19, #0x140]
00b7714c	rev x16,x10
00b77150	eor x17,x12,x15
00b77154	eor x18,x9,x15
00b77158	eor x1,x11,x10
00b7715c	eor x10,x8,x10
00b77160	rev x15,x15
00b77164	eor x12,x12,x13
00b77168	eor x11,x11,x14
00b7716c	stp x16,x15,[x19, #0x70]
00b77170	eor x16,x9,x17
00b77174	eor x2,x9,x13
00b77178	eor x3,x8,x1
00b7717c	eor x4,x8,x14
00b77180	rev x14,x14
00b77184	rev x13,x13
00b77188	rev x15,x1
00b7718c	rev x17,x17
00b77190	rev x10,x10
00b77194	rev x18,x18
00b77198	eor x9,x9,x12
00b7719c	eor x8,x8,x11
00b771a0	stp x14,x13,[x19, #0x90]
00b771a4	stp x15,x17,[x19, #0xb0]
00b771a8	rev x11,x11
00b771ac	rev x12,x12
00b771b0	stp x10,x18,[x19, #0xf0]
00b771b4	rev x10,x4
00b771b8	rev x13,x2
00b771bc	rev x14,x3
00b771c0	rev x15,x16
00b771c4	rev x8,x8
00b771c8	rev x9,x9
00b771cc	stp x11,x12,[x19, #0xd0]
00b771d0	stp x10,x13,[x19, #0x110]
00b771d4	stp x14,x15,[x19, #0x130]
00b771d8	stp x8,x9,[x19, #0x150]
00b771dc	b 0x00b771e4
00b771e0	mov w0,#0xffffffec
00b771e4	ldr x8,[x23, #0x28]
00b771e8	ldr x9,[sp, #0x18]
00b771ec	cmp x8,x9
00b771f0	b.ne 0x00b7720c
00b771f4	ldp x29,x30,[sp, #0x50]
00b771f8	ldp x20,x19,[sp, #0x40]
00b771fc	ldp x22,x21,[sp, #0x30]
00b77200	ldr x23,[sp, #0x20]
00b77204	add sp,sp,#0x60
00b77208	ret
00b7720c	bl 0x00c2fec0
