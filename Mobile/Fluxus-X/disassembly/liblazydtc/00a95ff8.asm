; IDEA_cbc_encrypt @ 00a95ff8
00a95ff8	sub sp,sp,#0x90
00a95ffc	stp x28,x27,[sp, #0x30]
00a96000	stp x26,x25,[sp, #0x40]
00a96004	stp x24,x23,[sp, #0x50]
00a96008	stp x22,x21,[sp, #0x60]
00a9600c	stp x20,x19,[sp, #0x70]
00a96010	stp x29,x30,[sp, #0x80]
00a96014	ldrb w8,[x4]
00a96018	ldrb w9,[x4, #0x1]
00a9601c	ldrb w12,[x4, #0x4]
00a96020	ldrb w13,[x4, #0x5]
00a96024	lsl x8,x8,#0x18
00a96028	ldrb w10,[x4, #0x2]
00a9602c	bfm x8,x9,#0x30,#0x7
00a96030	ldrb w9,[x4, #0x6]
00a96034	lsl x12,x12,#0x18
00a96038	ldrb w11,[x4, #0x3]
00a9603c	bfm x12,x13,#0x30,#0x7
00a96040	ldrb w13,[x4, #0x7]
00a96044	bfm x8,x10,#0x38,#0x7
00a96048	bfm x12,x9,#0x38,#0x7
00a9604c	mov x19,x4
00a96050	mov x21,x3
00a96054	mov x23,x2
00a96058	mov x28,x1
00a9605c	mov x22,x0
00a96060	orr x25,x8,x11
00a96064	orr x24,x12,x13
00a96068	subs x8,x2,#0x8
00a9606c	add x29,sp,#0x80
00a96070	cbz w5,0x00a96224
00a96074	b.lt 0x00a96164
00a96078	str x8,[sp, #0x10]
00a9607c	mvn x8,x23
00a96080	orr x9,xzr,#-0x10
00a96084	cmn x8,#0x10
00a96088	csinv x8,x9,x23,le
00a9608c	add x8,x8,x23
00a96090	add x8,x8,#0x8
00a96094	and x26,x8,#-0x8
00a96098	add x20,x26,#0x8
00a9609c	add x8,x22,x20
00a960a0	add x23,x23,#0x8
00a960a4	mov x27,x28
00a960a8	str x8,[sp, #0x18]
00a960ac	ldrb w8,[x22]
00a960b0	ldrb w9,[x22, #0x1]
00a960b4	ldrb w12,[x22, #0x4]
00a960b8	ldrb w13,[x22, #0x5]
00a960bc	lsl x8,x8,#0x18
00a960c0	ldrb w10,[x22, #0x2]
00a960c4	bfm x8,x9,#0x30,#0x7
00a960c8	ldrb w9,[x22, #0x6]
00a960cc	lsl x12,x12,#0x18
00a960d0	ldrb w11,[x22, #0x3]
00a960d4	bfm x12,x13,#0x30,#0x7
00a960d8	ldrb w13,[x22, #0x7]
00a960dc	bfm x8,x10,#0x38,#0x7
00a960e0	bfm x12,x9,#0x38,#0x7
00a960e4	orr x8,x8,x11
00a960e8	orr x9,x12,x13
00a960ec	eor x8,x8,x25
00a960f0	eor x9,x9,x24
00a960f4	add x0,sp,#0x20
00a960f8	mov x1,x21
00a960fc	stp x8,x9,[sp, #0x20]
00a96100	bl 0x00a96454
00a96104	ldr x25,[sp, #0x20]
00a96108	sub x23,x23,#0x8
00a9610c	add x22,x22,#0x8
00a96110	cmp x23,#0xf
00a96114	lsr x8,x25,#0x18
00a96118	lsr x9,x25,#0x10
00a9611c	strb w8,[x27]
00a96120	lsr x8,x25,#0x8
00a96124	strb w25,[x27, #0x3]
00a96128	strb w9,[x27, #0x1]
00a9612c	strb w8,[x27, #0x2]
00a96130	ldr x24,[sp, #0x28]
00a96134	lsr x8,x24,#0x18
00a96138	strb w8,[x27, #0x4]
00a9613c	lsr x8,x24,#0x10
00a96140	strb w8,[x27, #0x5]
00a96144	lsr x8,x24,#0x8
00a96148	strb w24,[x27, #0x7]
00a9614c	strb w8,[x27, #0x6]
00a96150	add x27,x27,#0x8
00a96154	b.gt 0x00a960ac
00a96158	ldp x8,x22,[sp, #0x10]
00a9615c	add x28,x28,x20
00a96160	sub x23,x8,x26
00a96164	cbz x23,0x00a963ec
00a96168	sub x9,x23,#0x1
00a9616c	cmp x9,#0x6
00a96170	mov x8,xzr
00a96174	b.hi 0x00a9644c
00a96178	adrp x10,0x76e000
00a9617c	add x10,x10,#0x82c
00a96180	ldrsw x9,[x10, x9, LSL #0x2]
00a96184	add x11,x9,x10
00a96188	add x9,x22,x23
00a9618c	mov x10,x8
00a96190	br x11
00a96194	ldrb w8,[x9, #-0x1]!
00a96198	lsl x8,x8,#0x8
00a9619c	ldrb w10,[x9, #-0x1]!
00a961a0	bfm x8,x10,#0x30,#0x7
00a961a4	ldrb w10,[x9, #-0x1]!
00a961a8	orr x8,x8,x10, LSL #0x18
00a961ac	mov x10,x8
00a961b0	ldrb w8,[x9, #-0x1]!
00a961b4	ldrb w11,[x9, #-0x1]!
00a961b8	bfm x8,x11,#0x38,#0x7
00a961bc	ldrb w11,[x9, #-0x1]!
00a961c0	bfm x8,x11,#0x30,#0x7
00a961c4	ldurb w9,[x9, #-0x1]
00a961c8	orr x8,x8,x9, LSL #0x18
00a961cc	eor x8,x8,x25
00a961d0	eor x9,x10,x24
00a961d4	add x0,sp,#0x20
00a961d8	mov x1,x21
00a961dc	stp x8,x9,[sp, #0x20]
00a961e0	bl 0x00a96454
00a961e4	ldp x22,x26,[sp, #0x20]
00a961e8	lsr x8,x22,#0x18
00a961ec	strb w8,[x28]
00a961f0	lsr x8,x22,#0x8
00a961f4	strb w8,[x28, #0x2]
00a961f8	lsr x8,x26,#0x18
00a961fc	strb w8,[x28, #0x4]
00a96200	lsr x8,x26,#0x10
00a96204	lsr x9,x22,#0x10
00a96208	strb w8,[x28, #0x5]
00a9620c	lsr x8,x26,#0x8
00a96210	strb w22,[x28, #0x3]
00a96214	strb w9,[x28, #0x1]
00a96218	strb w8,[x28, #0x6]
00a9621c	strb w26,[x28, #0x7]
00a96220	b 0x00a963f4
00a96224	b.lt 0x00a963e4
00a96228	stp x8,x28,[sp, #0x10]
00a9622c	mvn x8,x23
00a96230	orr x9,xzr,#-0x10
00a96234	cmn x8,#0x10
00a96238	csinv x8,x9,x23,le
00a9623c	add x8,x8,x23
00a96240	add x8,x8,#0x8
00a96244	and x8,x8,#-0x8
00a96248	str x8,[sp, #0x8]
00a9624c	add x8,x8,#0x8
00a96250	add x26,x22,x8
00a96254	add x23,x23,#0x8
00a96258	mov x20,x28
00a9625c	str x8,[sp]
00a96260	ldrb w8,[x22]
00a96264	ldrb w9,[x22, #0x1]
00a96268	ldrb w10,[x22, #0x2]
00a9626c	ldrb w11,[x22, #0x3]
00a96270	lsl x8,x8,#0x18
00a96274	bfm x8,x9,#0x30,#0x7
00a96278	bfm x8,x10,#0x38,#0x7
00a9627c	mov x27,x25
00a96280	orr x25,x8,x11
00a96284	str x25,[sp, #0x20]
00a96288	ldrb w8,[x22, #0x4]
00a9628c	ldrb w9,[x22, #0x5]
00a96290	ldrb w10,[x22, #0x6]
00a96294	ldrb w11,[x22, #0x7]
00a96298	lsl x8,x8,#0x18
00a9629c	bfm x8,x9,#0x30,#0x7
00a962a0	bfm x8,x10,#0x38,#0x7
00a962a4	mov x28,x24
00a962a8	orr x24,x8,x11
00a962ac	add x0,sp,#0x20
00a962b0	mov x1,x21
00a962b4	str x24,[sp, #0x28]
00a962b8	bl 0x00a96454
00a962bc	ldp x8,x9,[sp, #0x20]
00a962c0	sub x23,x23,#0x8
00a962c4	add x22,x22,#0x8
00a962c8	cmp x23,#0xf
00a962cc	eor x8,x8,x27
00a962d0	lsr x10,x8,#0x18
00a962d4	eor x9,x9,x28
00a962d8	strb w10,[x20]
00a962dc	lsr x10,x8,#0x10
00a962e0	strb w8,[x20, #0x3]
00a962e4	lsr x8,x8,#0x8
00a962e8	strb w10,[x20, #0x1]
00a962ec	lsr x10,x9,#0x18
00a962f0	strb w8,[x20, #0x2]
00a962f4	lsr x8,x9,#0x10
00a962f8	strb w9,[x20, #0x7]
00a962fc	lsr x9,x9,#0x8
00a96300	strb w10,[x20, #0x4]
00a96304	strb w8,[x20, #0x5]
00a96308	strb w9,[x20, #0x6]
00a9630c	add x20,x20,#0x8
00a96310	b.gt 0x00a96260
00a96314	ldp x9,x8,[sp, #0x8]
00a96318	ldr x28,[sp, #0x18]
00a9631c	sub x23,x8,x9
00a96320	ldr x8,[sp]
00a96324	add x28,x28,x8
00a96328	cbz x23,0x00a963ec
00a9632c	ldrb w8,[x26]
00a96330	ldrb w9,[x26, #0x1]
00a96334	ldrb w10,[x26, #0x2]
00a96338	ldrb w11,[x26, #0x3]
00a9633c	lsl x8,x8,#0x18
00a96340	bfm x8,x9,#0x30,#0x7
00a96344	bfm x8,x10,#0x38,#0x7
00a96348	orr x22,x8,x11
00a9634c	ldrb w8,[x26, #0x4]
00a96350	ldrb w9,[x26, #0x5]
00a96354	ldrb w10,[x26, #0x6]
00a96358	ldrb w11,[x26, #0x7]
00a9635c	lsl x8,x8,#0x18
00a96360	bfm x8,x9,#0x30,#0x7
00a96364	bfm x8,x10,#0x38,#0x7
00a96368	orr x26,x8,x11
00a9636c	add x0,sp,#0x20
00a96370	mov x1,x21
00a96374	stp x22,x26,[sp, #0x20]
00a96378	bl 0x00a96454
00a9637c	sub x8,x23,#0x1
00a96380	cmp x8,#0x6
00a96384	b.hi 0x00a963f4
00a96388	adrp x11,0x76e000
00a9638c	add x11,x11,#0x848
00a96390	ldrsw x8,[x11, x8, LSL #0x2]
00a96394	ldp x9,x10,[sp, #0x20]
00a96398	add x11,x8,x11
00a9639c	eor x9,x9,x25
00a963a0	eor x10,x10,x24
00a963a4	add x8,x28,x23
00a963a8	br x11
00a963ac	lsr x11,x10,#0x8
00a963b0	strb w11,[x8, #-0x1]!
00a963b4	lsr x11,x10,#0x10
00a963b8	strb w11,[x8, #-0x1]!
00a963bc	lsr x10,x10,#0x18
00a963c0	strb w10,[x8, #-0x1]!
00a963c4	strb w9,[x8, #-0x1]!
00a963c8	lsr x10,x9,#0x8
00a963cc	strb w10,[x8, #-0x1]!
00a963d0	lsr x10,x9,#0x10
00a963d4	strb w10,[x8, #-0x1]!
00a963d8	lsr x9,x9,#0x18
00a963dc	sturb w9,[x8, #-0x1]
00a963e0	b 0x00a963f4
00a963e4	mov x26,x22
00a963e8	cbnz x23,0x00a9632c
00a963ec	mov x22,x25
00a963f0	mov x26,x24
00a963f4	lsr x8,x22,#0x18
00a963f8	lsr x9,x22,#0x10
00a963fc	lsr x10,x22,#0x8
00a96400	lsr x11,x26,#0x18
00a96404	lsr x12,x26,#0x10
00a96408	lsr x13,x26,#0x8
00a9640c	strb w22,[x19, #0x3]
00a96410	strb w8,[x19]
00a96414	strb w9,[x19, #0x1]
00a96418	strb w10,[x19, #0x2]
00a9641c	strb w11,[x19, #0x4]
00a96420	strb w12,[x19, #0x5]
00a96424	strb w13,[x19, #0x6]
00a96428	strb w26,[x19, #0x7]
00a9642c	ldp x29,x30,[sp, #0x80]
00a96430	ldp x20,x19,[sp, #0x70]
00a96434	ldp x22,x21,[sp, #0x60]
00a96438	ldp x24,x23,[sp, #0x50]
00a9643c	ldp x26,x25,[sp, #0x40]
00a96440	ldp x28,x27,[sp, #0x30]
00a96444	add sp,sp,#0x90
00a96448	ret
00a9644c	mov x10,x8
00a96450	b 0x00a961cc
