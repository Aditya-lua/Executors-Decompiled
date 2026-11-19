; FUN_00a020d4 @ 00a020d4
00a020d4	sub sp,sp,#0x50
00a020d8	stp x22,x21,[sp, #0x20]
00a020dc	stp x20,x19,[sp, #0x30]
00a020e0	stp x29,x30,[sp, #0x40]
00a020e4	add x29,sp,#0x40
00a020e8	mov w20,w3
00a020ec	mov w19,w2
00a020f0	mov x22,x1
00a020f4	mov x21,x0
00a020f8	bl 0x00a015e8
00a020fc	add w8,w0,#0x7
00a02100	add w9,w0,#0xe
00a02104	cmp w8,#0x0
00a02108	csel w8,w9,w8,lt
00a0210c	cmn w19,#0x1
00a02110	asr w8,w8,#0x3
00a02114	b.eq 0x00a02198
00a02118	cmp w8,w19
00a0211c	b.le 0x00a0219c
00a02120	ldr q0,[x21]
00a02124	str q0,[sp]
00a02128	ldr x8,[x21, #0x10]
00a0212c	str x8,[sp, #0x10]
00a02130	ldr w8,[sp, #0x8]
00a02134	cmp w8,#0x1
00a02138	b.lt 0x00a02164
00a0213c	ldr x9,[sp]
00a02140	sxtw x10,w8
00a02144	add x9,x9,x10, LSL #0x3
00a02148	sub x9,x9,#0x8
00a0214c	ldr x10,[x9]
00a02150	cbnz x10,0x00a02160
00a02154	subs w8,w8,#0x1
00a02158	sub x9,x9,#0x8
00a0215c	b.gt 0x00a0214c
00a02160	str w8,[sp, #0x8]
00a02164	cbnz w8,0x00a0216c
00a02168	str wzr,[sp, #0x10]
00a0216c	mov x0,sp
00a02170	bl 0x00a015e8
00a02174	add w8,w0,#0x7
00a02178	add w9,w0,#0xe
00a0217c	cmp w8,#0x0
00a02180	csel w8,w9,w8,lt
00a02184	asr w8,w8,#0x3
00a02188	cmp w8,w19
00a0218c	b.le 0x00a0219c
00a02190	mov w19,#0xffffffff
00a02194	b 0x00a02234
00a02198	mov w19,w8
00a0219c	ldrsw x12,[x21, #0xc]
00a021a0	cbz w12,0x00a02220
00a021a4	cbz w19,0x00a02234
00a021a8	ldrsw x13,[x21, #0x8]
00a021ac	sxtw x10,w19
00a021b0	cmp w20,#0x0
00a021b4	mov w14,#0x1
00a021b8	add x11,x22,x10
00a021bc	lsl x13,x13,#0x3
00a021c0	mov x8,xzr
00a021c4	mov x9,xzr
00a021c8	csel x11,x11,x22,eq
00a021cc	sub x12,x14,x12, LSL #0x3
00a021d0	neg x13,x13
00a021d4	ldr x14,[x21]
00a021d8	and x15,x9,#-0x8
00a021dc	sub x16,x11,#0x1
00a021e0	cmp w20,#0x0
00a021e4	ldr x14,[x14, x15#0x0]
00a021e8	csel x15,x16,x11,eq
00a021ec	csinc x11,x16,x11,eq
00a021f0	ubfiz x16,x9,#0x3,#0x3
00a021f4	lsr x14,x14,x16
00a021f8	add x16,x13,x8
00a021fc	asr x16,x16,#0x3f
00a02200	and w14,w14,w16
00a02204	add x16,x12,x9
00a02208	add x8,x8,#0x1
00a0220c	cmp x8,x10
00a02210	add x9,x9,x16, LSR #0x3f
00a02214	strb w14,[x15]
00a02218	b.cc 0x00a021d4
00a0221c	b 0x00a02234
00a02220	cbz w19,0x00a02234
00a02224	sxtw x2,w19
00a02228	mov x0,x22
00a0222c	mov w1,wzr
00a02230	bl 0x00c301c0
00a02234	mov w0,w19
00a02238	ldp x29,x30,[sp, #0x40]
00a0223c	ldp x20,x19,[sp, #0x30]
00a02240	ldp x22,x21,[sp, #0x20]
00a02244	add sp,sp,#0x50
00a02248	ret
