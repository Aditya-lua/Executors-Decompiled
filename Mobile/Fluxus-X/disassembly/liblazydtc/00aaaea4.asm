; CRYPTO_gcm128_decrypt_ctr32 @ 00aaaea4
00aaaea4	stp x28,x27,[sp, #-0x60]!
00aaaea8	stp x26,x25,[sp, #0x10]
00aaaeac	stp x24,x23,[sp, #0x20]
00aaaeb0	stp x22,x21,[sp, #0x30]
00aaaeb4	stp x20,x19,[sp, #0x40]
00aaaeb8	stp x29,x30,[sp, #0x50]
00aaaebc	ldr x8,[x0, #0x38]
00aaaec0	orr x10,xzr,#0xfffffffe0
00aaaec4	mov x19,x0
00aaaec8	mov w0,#0xffffffff
00aaaecc	adds x8,x8,x3
00aaaed0	cset w9,cs
00aaaed4	cmp x8,x10
00aaaed8	add x29,sp,#0x50
00aaaedc	b.hi 0x00aab224
00aaaee0	tbnz w9,#0x0,0x00aab224
00aaaee4	ldr w9,[x19, #0x174]
00aaaee8	ldr x23,[x19, #0x180]
00aaaeec	mov x24,x4
00aaaef0	mov x20,x3
00aaaef4	mov x21,x2
00aaaef8	mov x22,x1
00aaaefc	str x8,[x19, #0x38]
00aaaf00	cbz w9,0x00aaaf24
00aaaf04	cbz x20,0x00aab1c8
00aaaf08	ldr q0,[x19, #0x40]
00aaaf0c	add x8,x19,#0x188
00aaaf10	mov w27,#0x10
00aaaf14	str q0,[x8]
00aaaf18	str wzr,[x19, #0x174]
00aaaf1c	stp xzr,xzr,[x19, #0x40]
00aaaf20	b 0x00aaaf28
00aaaf24	ldr w27,[x19, #0x170]
00aaaf28	ldr w25,[x19, #0xc]
00aaaf2c	ands w8,w27,#0xf
00aaaf30	b.eq 0x00aaaf74
00aaaf34	cbz x20,0x00aab21c
00aaaf38	add x9,x19,#0x10
00aaaf3c	ldrb w10,[x22], #0x1
00aaaf40	add x11,x19,w27, UXTW 
00aaaf44	add w27,w27,#0x1
00aaaf48	subs x20,x20,#0x1
00aaaf4c	strb w10,[x11, #0x188]
00aaaf50	ldrb w11,[x9, w8, UXTW ]
00aaaf54	add w8,w8,#0x1
00aaaf58	and w8,w8,#0xf
00aaaf5c	eor w10,w11,w10
00aaaf60	strb w10,[x21], #0x1
00aaaf64	b.eq 0x00aaaf6c
00aaaf68	cbnz w8,0x00aaaf3c
00aaaf6c	cbnz w8,0x00aab21c
00aaaf70	b 0x00aaaf80
00aaaf74	cmp x20,#0x10
00aaaf78	b.cc 0x00aaaf98
00aaaf7c	cbz w27,0x00aaaf98
00aaaf80	add x0,x19,#0x40
00aaaf84	add x1,x19,#0x60
00aaaf88	add x2,x19,#0x188
00aaaf8c	mov w3,w27
00aaaf90	bl 0x00aaa048
00aaaf94	mov w27,wzr
00aaaf98	cmp x20,#0xc00
00aaaf9c	rev w28,w25
00aaafa0	b.cc 0x00aab00c
00aaafa4	add x25,x19,#0x40
00aaafa8	add x26,x19,#0x60
00aaafac	orr w3,wzr,#0xc00
00aaafb0	mov x0,x25
00aaafb4	mov x1,x26
00aaafb8	mov x2,x22
00aaafbc	bl 0x00aaa048
00aaafc0	orr w2,wzr,#0xc0
00aaafc4	mov x0,x22
00aaafc8	mov x1,x21
00aaafcc	mov x3,x23
00aaafd0	mov x4,x19
00aaafd4	blr x24
00aaafd8	add w28,w28,#0xc0
00aaafdc	sub x20,x20,#0xc00
00aaafe0	add x21,x21,#0xc00
00aaafe4	lsr w8,w28,#0x18
00aaafe8	lsr w9,w28,#0x10
00aaafec	lsr w10,w28,#0x8
00aaaff0	cmp x20,#0xbff
00aaaff4	add x22,x22,#0xc00
00aaaff8	strb w28,[x19, #0xf]
00aaaffc	strb w8,[x19, #0xc]
00aab000	strb w9,[x19, #0xd]
00aab004	strb w10,[x19, #0xe]
00aab008	b.hi 0x00aaafac
00aab00c	ands x25,x20,#-0x10
00aab010	b.eq 0x00aab070
00aab014	add x0,x19,#0x40
00aab018	add x1,x19,#0x60
00aab01c	mov x2,x22
00aab020	mov x3,x25
00aab024	lsr x26,x20,#0x4
00aab028	bl 0x00aaa048
00aab02c	mov x0,x22
00aab030	mov x1,x21
00aab034	mov x2,x26
00aab038	mov x3,x23
00aab03c	mov x4,x19
00aab040	blr x24
00aab044	add w28,w28,w26
00aab048	add x21,x21,x25
00aab04c	add x22,x22,x25
00aab050	lsr w8,w28,#0x18
00aab054	lsr w9,w28,#0x10
00aab058	lsr w10,w28,#0x8
00aab05c	sub x20,x20,x25
00aab060	strb w28,[x19, #0xf]
00aab064	strb w8,[x19, #0xc]
00aab068	strb w9,[x19, #0xd]
00aab06c	strb w10,[x19, #0xe]
00aab070	cbz x20,0x00aab21c
00aab074	ldr x8,[x19, #0x178]
00aab078	add x24,x19,#0x10
00aab07c	mov x0,x19
00aab080	mov x1,x24
00aab084	mov x2,x23
00aab088	blr x8
00aab08c	add w8,w28,#0x1
00aab090	cmp x20,#0x20
00aab094	lsr w9,w8,#0x18
00aab098	lsr w10,w8,#0x10
00aab09c	lsr w11,w8,#0x8
00aab0a0	strb w9,[x19, #0xc]
00aab0a4	strb w10,[x19, #0xd]
00aab0a8	strb w11,[x19, #0xe]
00aab0ac	strb w8,[x19, #0xf]
00aab0b0	b.cc 0x00aab1e0
00aab0b4	sub x8,x20,#0x1
00aab0b8	cmn w27,w8
00aab0bc	b.cs 0x00aab1e0
00aab0c0	lsr x8,x8,#0x20
00aab0c4	cbnz x8,0x00aab1e0
00aab0c8	add x8,x19,#0x188
00aab0cc	mov w10,w27
00aab0d0	add x16,x21,x20
00aab0d4	add x9,x8,x10
00aab0d8	add x11,x20,x10
00aab0dc	add x13,x8,x11
00aab0e0	cmp x9,x16
00aab0e4	add x12,x22,x20
00aab0e8	cset w8,cc
00aab0ec	cmp x21,x13
00aab0f0	add x17,x19,#0x10
00aab0f4	cset w11,cc
00aab0f8	cmp x9,x12
00aab0fc	add x14,x17,x20
00aab100	and w18,w8,w11
00aab104	cset w8,cc
00aab108	cmp x22,x13
00aab10c	cset w11,cc
00aab110	cmp x9,x14
00aab114	cset w9,cc
00aab118	cmp x13,x17
00aab11c	cset w13,hi
00aab120	cmp x21,x12
00aab124	cset w12,cc
00aab128	cmp x22,x16
00aab12c	cset w15,cc
00aab130	cmp x21,x14
00aab134	cset w14,cc
00aab138	cmp x16,x17
00aab13c	cset w16,hi
00aab140	tbnz w18,#0x0,0x00aab1e0
00aab144	and w8,w8,w11
00aab148	tbnz w8,#0x0,0x00aab1e0
00aab14c	and w8,w9,w13
00aab150	tbnz w8,#0x0,0x00aab1e0
00aab154	and w8,w12,w15
00aab158	tbnz w8,#0x0,0x00aab1e0
00aab15c	and w8,w14,w16
00aab160	tbnz w8,#0x0,0x00aab1e0
00aab164	and x8,x20,#-0x20
00aab168	mov x12,xzr
00aab16c	add w9,w27,w8
00aab170	sub x11,x20,x8
00aab174	and x14,x12,#0xffffffe0
00aab178	add x15,x22,x14
00aab17c	ldp q0,q1,[x15]
00aab180	add w13,w10,w12
00aab184	add x13,x19,x13
00aab188	add x15,x13,#0x188
00aab18c	add x13,x13,#0x198
00aab190	str q0,[x15]
00aab194	add x15,x24,x14
00aab198	str q1,[x13]
00aab19c	ldp q2,q3,[x15]
00aab1a0	add x12,x12,#0x20
00aab1a4	add x13,x21,x14
00aab1a8	cmp x8,x12
00aab1ac	eor v0.16B,v2.16B,v0.16B
00aab1b0	eor v1.16B,v3.16B,v1.16B
00aab1b4	stp q0,q1,[x13]
00aab1b8	b.ne 0x00aab174
00aab1bc	cmp x20,x8
00aab1c0	b.ne 0x00aab1ec
00aab1c4	b 0x00aab218
00aab1c8	add x0,x19,#0x40
00aab1cc	add x1,x19,#0x60
00aab1d0	bl 0x00aa9de0
00aab1d4	mov w0,wzr
00aab1d8	str wzr,[x19, #0x174]
00aab1dc	b 0x00aab224
00aab1e0	mov w8,wzr
00aab1e4	mov w9,w27
00aab1e8	mov x11,x20
00aab1ec	mov w10,w8
00aab1f0	ldrb w12,[x22, x10]
00aab1f4	add x13,x19,w9, UXTW 
00aab1f8	subs x11,x11,#0x1
00aab1fc	add w9,w9,#0x1
00aab200	strb w12,[x13, #0x188]
00aab204	ldrb w13,[x24, x10]
00aab208	add w8,w8,#0x1
00aab20c	eor w12,w13,w12
00aab210	strb w12,[x21, x10]
00aab214	b.ne 0x00aab1ec
00aab218	add w27,w27,w20
00aab21c	mov w0,wzr
00aab220	str w27,[x19, #0x170]
00aab224	ldp x29,x30,[sp, #0x50]
00aab228	ldp x20,x19,[sp, #0x40]
00aab22c	ldp x22,x21,[sp, #0x30]
00aab230	ldp x24,x23,[sp, #0x20]
00aab234	ldp x26,x25,[sp, #0x10]
00aab238	ldp x28,x27,[sp], #0x60
00aab23c	ret
