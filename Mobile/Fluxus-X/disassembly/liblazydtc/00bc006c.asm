; FUN_00bc006c @ 00bc006c
00bc006c	ldp x14,x8,[x3]
00bc0070	sub x9,x1,x0
00bc0074	add x8,x8,x14
00bc0078	cmp x8,x9
00bc007c	b.ls 0x00bc0088
00bc0080	mov x0,#-0x46
00bc0084	ret
00bc0088	ldr x11,[x4]
00bc008c	sub x9,x5,x11
00bc0090	cmp x14,x9
00bc0094	b.ls 0x00bc00a0
00bc0098	mov x0,#-0x14
00bc009c	ret
00bc00a0	ldr x9,[x3, #0x10]
00bc00a4	subs x15,x0,x11
00bc00a8	add x10,x11,x14
00bc00ac	b.ls 0x00bc00b8
00bc00b0	cmp x0,x10
00bc00b4	b.cc 0x00bc0080
00bc00b8	stp x29,x30,[sp, #-0x40]!
00bc00bc	stp x24,x23,[sp, #0x10]
00bc00c0	stp x22,x21,[sp, #0x20]
00bc00c4	stp x20,x19,[sp, #0x30]
00bc00c8	mov x29,sp
00bc00cc	cmp x14,#0x8
00bc00d0	mov x13,x0
00bc00d4	add x0,x0,x14
00bc00d8	b.cc 0x00bc0138
00bc00dc	cmn x15,#0x7
00bc00e0	b.ge 0x00bc0138
00bc00e4	sub x12,x0,#0x20
00bc00e8	cmp x13,x12
00bc00ec	b.hi 0x00bc0170
00bc00f0	cmn x15,#0x11
00bc00f4	b.hi 0x00bc0170
00bc00f8	sub x15,x12,x13
00bc00fc	ldr q0,[x11]
00bc0100	cmp x15,#0x11
00bc0104	str q0,[x13]
00bc0108	b.cc 0x00bc0130
00bc010c	add x16,x13,#0x10
00bc0110	add x17,x11,#0x20
00bc0114	ldur q0,[x17, #-0x10]
00bc0118	str q0,[x16]
00bc011c	ldr q0,[x17], #0x20
00bc0120	str q0,[x16, #0x10]
00bc0124	add x16,x16,#0x20
00bc0128	cmp x16,x12
00bc012c	b.cc 0x00bc0114
00bc0130	add x11,x11,x15
00bc0134	b 0x00bc0174
00bc0138	cbz x14,0x00bc02d0
00bc013c	add x14,x14,x13
00bc0140	add x16,x13,#0x1
00bc0144	cmp x14,x16
00bc0148	csinc x14,x14,x13,hi
00bc014c	sub x12,x14,x13
00bc0150	cmp x12,#0x8
00bc0154	b.cc 0x00bc0220
00bc0158	cmp x15,#0x20
00bc015c	b.cc 0x00bc0218
00bc0160	cmp x12,#0x20
00bc0164	b.cs 0x00bc0228
00bc0168	mov x15,xzr
00bc016c	b 0x00bc0260
00bc0170	mov x12,x13
00bc0174	add x13,x14,x13
00bc0178	sub x13,x13,x12
00bc017c	cmp x13,#0x8
00bc0180	b.cc 0x00bc01a0
00bc0184	sub x14,x12,x11
00bc0188	cmp x14,#0x20
00bc018c	b.cc 0x00bc01a0
00bc0190	cmp x13,#0x20
00bc0194	b.cs 0x00bc01ac
00bc0198	mov x16,xzr
00bc019c	b 0x00bc01e4
00bc01a0	mov x14,x12
00bc01a4	mov x15,x11
00bc01a8	b 0x00bc02a0
00bc01ac	and x16,x13,#-0x20
00bc01b0	add x14,x11,#0x10
00bc01b4	add x15,x12,#0x10
00bc01b8	mov x17,x16
00bc01bc	ldp q0,q1,[x14, #-0x10]
00bc01c0	subs x17,x17,#0x20
00bc01c4	add x14,x14,#0x20
00bc01c8	stp q0,q1,[x15, #-0x10]
00bc01cc	add x15,x15,#0x20
00bc01d0	b.ne 0x00bc01bc
00bc01d4	cmp x13,x16
00bc01d8	b.eq 0x00bc02d0
00bc01dc	tst x13,#0x18
00bc01e0	b.eq 0x00bc0298
00bc01e4	and x17,x13,#-0x8
00bc01e8	add x1,x12,x16
00bc01ec	add x14,x12,x17
00bc01f0	add x15,x11,x17
00bc01f4	add x11,x11,x16
00bc01f8	sub x16,x16,x17
00bc01fc	ldr d0,[x11], #0x8
00bc0200	adds x16,x16,#0x8
00bc0204	str d0,[x1], #0x8
00bc0208	b.ne 0x00bc01fc
00bc020c	cmp x13,x17
00bc0210	b.ne 0x00bc02a0
00bc0214	b 0x00bc02d0
00bc0218	mov x14,x11
00bc021c	b 0x00bc02c0
00bc0220	mov x14,x11
00bc0224	b 0x00bc02c0
00bc0228	and x15,x12,#-0x20
00bc022c	add x14,x11,#0x10
00bc0230	add x16,x13,#0x10
00bc0234	mov x17,x15
00bc0238	ldp q0,q1,[x14, #-0x10]
00bc023c	subs x17,x17,#0x20
00bc0240	add x14,x14,#0x20
00bc0244	stp q0,q1,[x16, #-0x10]
00bc0248	add x16,x16,#0x20
00bc024c	b.ne 0x00bc0238
00bc0250	cmp x12,x15
00bc0254	b.eq 0x00bc02d0
00bc0258	tst x12,#0x18
00bc025c	b.eq 0x00bc02b8
00bc0260	and x16,x12,#-0x8
00bc0264	mov x17,x13
00bc0268	add x13,x13,x16
00bc026c	add x14,x11,x16
00bc0270	add x11,x11,x15
00bc0274	add x17,x17,x15
00bc0278	sub x15,x15,x16
00bc027c	ldr d0,[x11], #0x8
00bc0280	adds x15,x15,#0x8
00bc0284	str d0,[x17], #0x8
00bc0288	b.ne 0x00bc027c
00bc028c	cmp x12,x16
00bc0290	b.ne 0x00bc02c0
00bc0294	b 0x00bc02d0
00bc0298	add x14,x12,x16
00bc029c	add x15,x11,x16
00bc02a0	add x11,x12,x13
00bc02a4	ldrb w12,[x15], #0x1
00bc02a8	strb w12,[x14], #0x1
00bc02ac	cmp x14,x11
00bc02b0	b.ne 0x00bc02a4
00bc02b4	b 0x00bc02d0
00bc02b8	add x13,x13,x15
00bc02bc	add x14,x11,x15
00bc02c0	ldrb w11,[x14], #0x1
00bc02c4	strb w11,[x13], #0x1
00bc02c8	cmp x13,x0
00bc02cc	b.cc 0x00bc02c0
00bc02d0	ldr x11,[x3, #0x10]
00bc02d4	sub x12,x0,x6
00bc02d8	sub x9,x0,x9
00bc02dc	str x10,[x4]
00bc02e0	cmp x11,x12
00bc02e4	b.ls 0x00bc02fc
00bc02e8	sub x10,x0,x7
00bc02ec	cmp x11,x10
00bc02f0	b.ls 0x00bc0330
00bc02f4	mov x0,#-0x14
00bc02f8	b 0x00bc031c
00bc02fc	ldr x3,[x3, #0x8]
00bc0300	mov x20,x8
00bc0304	mov x8,x9
00bc0308	mov x1,x2
00bc030c	mov x2,x8
00bc0310	mov w4,#0x1
00bc0314	bl 0x00bbfc7c
00bc0318	mov x0,x20
00bc031c	ldp x20,x19,[sp, #0x30]
00bc0320	ldp x22,x21,[sp, #0x20]
00bc0324	ldp x24,x23,[sp, #0x10]
00bc0328	ldp x29,x30,[sp], #0x40
00bc032c	ret
00bc0330	ldr x10,[x29, #0x40]
00bc0334	mov x20,x8
00bc0338	sub x21,x9,x6
00bc033c	ldr x8,[x3, #0x8]
00bc0340	add x1,x10,x21
00bc0344	add x9,x1,x8
00bc0348	cmp x9,x10
00bc034c	b.ls 0x00bc0388
00bc0350	neg x8,x21
00bc0354	mov x22,x2
00bc0358	mov x19,x0
00bc035c	mov x2,x8
00bc0360	mov x23,x6
00bc0364	mov x24,x3
00bc0368	bl 0x00c2ff60
00bc036c	ldr x9,[x24, #0x8]
00bc0370	mov x2,x22
00bc0374	mov x8,x23
00bc0378	sub x0,x19,x21
00bc037c	add x3,x9,x21
00bc0380	str x3,[x24, #0x8]
00bc0384	b 0x00bc0308
00bc0388	mov x2,x8
00bc038c	bl 0x00c2ff60
00bc0390	b 0x00bc0318
