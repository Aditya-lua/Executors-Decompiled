; FUN_00b56f74 @ 00b56f74
00b56f74	sub sp,sp,#0xc0
00b56f78	stp x28,x27,[sp, #0x60]
00b56f7c	stp x26,x25,[sp, #0x70]
00b56f80	stp x24,x23,[sp, #0x80]
00b56f84	stp x22,x21,[sp, #0x90]
00b56f88	stp x20,x19,[sp, #0xa0]
00b56f8c	stp x29,x30,[sp, #0xb0]
00b56f90	ldr x26,[x0, #0xf8]
00b56f94	mov x28,x3
00b56f98	mov x21,x2
00b56f9c	mov x22,x1
00b56fa0	add x29,sp,#0xb0
00b56fa4	str x0,[sp, #0x10]
00b56fa8	cbz x3,0x00b570fc
00b56fac	mov x25,x4
00b56fb0	cbz x4,0x00b570fc
00b56fb4	ldrb w8,[x26, #0x63]
00b56fb8	ldrb w9,[x26, #0x62]
00b56fbc	ldrb w10,[x26, #0x61]
00b56fc0	ldrb w11,[x26, #0x60]
00b56fc4	add w8,w8,#0x1
00b56fc8	strb w8,[x26, #0x63]
00b56fcc	add w8,w9,w8, LSR #0x8
00b56fd0	strb w8,[x26, #0x62]
00b56fd4	add w8,w10,w8, LSR #0x8
00b56fd8	strb w8,[x26, #0x61]
00b56fdc	add w8,w11,w8, LSR #0x8
00b56fe0	strb w8,[x26, #0x60]
00b56fe4	mov x10,x26
00b56fe8	ldrb w9,[x10, #0x5f]!
00b56fec	mov x20,x26
00b56ff0	mov x19,x26
00b56ff4	mov x23,x26
00b56ff8	add w8,w9,w8, LSR #0x8
00b56ffc	str x10,[sp, #0x50]
00b57000	strb w8,[x10]
00b57004	mov x10,x26
00b57008	ldrb w9,[x10, #0x5e]!
00b5700c	mov x27,x26
00b57010	mov x24,x26
00b57014	mov x1,x28
00b57018	add w8,w9,w8, LSR #0x8
00b5701c	str x10,[sp, #0x48]
00b57020	strb w8,[x10]
00b57024	mov x10,x26
00b57028	ldrb w9,[x10, #0x5d]!
00b5702c	mov x2,x25
00b57030	mov x3,xzr
00b57034	mov x4,xzr
00b57038	add w8,w9,w8, LSR #0x8
00b5703c	str x10,[sp, #0x40]
00b57040	strb w8,[x10]
00b57044	mov x10,x26
00b57048	ldrb w9,[x10, #0x5c]!
00b5704c	mov x5,xzr
00b57050	mov x6,xzr
00b57054	add w8,w9,w8, LSR #0x8
00b57058	str x10,[sp, #0x38]
00b5705c	strb w8,[x10]
00b57060	mov x10,x26
00b57064	ldrb w9,[x10, #0x5b]!
00b57068	add w8,w9,w8, LSR #0x8
00b5706c	str x10,[sp, #0x30]
00b57070	strb w8,[x10]
00b57074	mov x10,x26
00b57078	ldrb w9,[x10, #0x5a]!
00b5707c	add w8,w9,w8, LSR #0x8
00b57080	str x10,[sp, #0x28]
00b57084	strb w8,[x10]
00b57088	mov x10,x26
00b5708c	ldrb w9,[x10, #0x59]!
00b57090	add w8,w9,w8, LSR #0x8
00b57094	str x10,[sp, #0x20]
00b57098	strb w8,[x10]
00b5709c	ldrb w9,[x20, #0x58]!
00b570a0	add w8,w9,w8, LSR #0x8
00b570a4	strb w8,[x20]
00b570a8	ldrb w9,[x19, #0x57]!
00b570ac	add w8,w9,w8, LSR #0x8
00b570b0	strb w8,[x19]
00b570b4	ldrb w9,[x23, #0x56]!
00b570b8	add w8,w9,w8, LSR #0x8
00b570bc	strb w8,[x23]
00b570c0	ldrb w9,[x27, #0x55]!
00b570c4	add w8,w9,w8, LSR #0x8
00b570c8	strb w8,[x27]
00b570cc	ldrb w9,[x24, #0x54]!
00b570d0	add w8,w9,w8, LSR #0x8
00b570d4	strb w8,[x24]
00b570d8	bl 0x00b57484
00b570dc	cbz w0,0x00b57464
00b570e0	ldr w8,[x26, #0x30]
00b570e4	cmp w8,#0x0
00b570e8	csel x28,x28,xzr,eq
00b570ec	csinc x8,x25,xzr,eq
00b570f0	str x28,[sp, #0x18]
00b570f4	str x8,[sp, #0x8]
00b570f8	b 0x00b5714c
00b570fc	add x8,x26,#0x5f
00b57100	str x8,[sp, #0x50]
00b57104	add x8,x26,#0x5e
00b57108	str x8,[sp, #0x48]
00b5710c	add x8,x26,#0x5d
00b57110	str x8,[sp, #0x40]
00b57114	add x8,x26,#0x5c
00b57118	str x8,[sp, #0x38]
00b5711c	add x8,x26,#0x5b
00b57120	str x8,[sp, #0x30]
00b57124	add x8,x26,#0x5a
00b57128	str x8,[sp, #0x28]
00b5712c	add x8,x26,#0x59
00b57130	str xzr,[sp, #0x8]
00b57134	add x24,x26,#0x54
00b57138	stp x28,x8,[sp, #0x18]
00b5713c	add x20,x26,#0x58
00b57140	add x19,x26,#0x57
00b57144	add x23,x26,#0x56
00b57148	add x27,x26,#0x55
00b5714c	ldrb w16,[x26, #0x63]
00b57150	ldrb w17,[x26, #0x62]
00b57154	ldrb w10,[x26, #0x61]
00b57158	ldrb w11,[x26, #0x60]
00b5715c	ldrb w12,[x26, #0x5f]
00b57160	add w4,w16,#0x1
00b57164	ldrb w13,[x26, #0x5e]
00b57168	add w3,w17,w4, LSR #0x8
00b5716c	ldrb w14,[x26, #0x5d]
00b57170	add w2,w10,w3, LSR #0x8
00b57174	ldrb w15,[x26, #0x5c]
00b57178	add w1,w11,w2, LSR #0x8
00b5717c	ldrb w5,[x26, #0x5b]
00b57180	add w0,w12,w1, LSR #0x8
00b57184	ldrb w6,[x26, #0x5a]
00b57188	add w18,w13,w0, LSR #0x8
00b5718c	ldrb w7,[x26, #0x59]
00b57190	add w17,w14,w18, LSR #0x8
00b57194	ldrb w25,[x26, #0x58]
00b57198	add w16,w15,w17, LSR #0x8
00b5719c	ldrb w30,[x26, #0x57]
00b571a0	add w15,w5,w16, LSR #0x8
00b571a4	ldrb w8,[x26, #0x56]
00b571a8	add w14,w6,w15, LSR #0x8
00b571ac	ldrb w9,[x26, #0x55]
00b571b0	add w13,w7,w14, LSR #0x8
00b571b4	ldrb w28,[x26, #0x54]
00b571b8	add w12,w25,w13, LSR #0x8
00b571bc	add w11,w30,w12, LSR #0x8
00b571c0	add w10,w8,w11, LSR #0x8
00b571c4	add w9,w9,w10, LSR #0x8
00b571c8	add w8,w28,w9, LSR #0x8
00b571cc	strb w4,[x26, #0x63]
00b571d0	strb w3,[x26, #0x62]
00b571d4	strb w2,[x26, #0x61]
00b571d8	strb w1,[x26, #0x60]
00b571dc	strb w0,[x26, #0x5f]
00b571e0	strb w18,[x26, #0x5e]
00b571e4	strb w17,[x26, #0x5d]
00b571e8	strb w16,[x26, #0x5c]
00b571ec	strb w15,[x26, #0x5b]
00b571f0	strb w14,[x26, #0x5a]
00b571f4	strb w13,[x26, #0x59]
00b571f8	strb w12,[x26, #0x58]
00b571fc	strb w11,[x26, #0x57]
00b57200	strb w10,[x26, #0x56]
00b57204	strb w9,[x26, #0x55]
00b57208	strb w8,[x26, #0x54]
00b5720c	cbz x21,0x00b57384
00b57210	mov x0,x22
00b57214	mov w1,wzr
00b57218	mov x2,x21
00b5721c	bl 0x00c301c0
00b57220	ldr x28,[sp, #0x18]
00b57224	ldr x0,[x26, #0x8]
00b57228	mov w5,#0xffffffff
00b5722c	mov x1,xzr
00b57230	mov x2,xzr
00b57234	mov x3,xzr
00b57238	mov x4,x24
00b5723c	bl 0x00c34be0
00b57240	cbz w0,0x00b57464
00b57244	ldr w9,[x26, #0x60]
00b57248	lsr x8,x21,#0x1e
00b5724c	cmp x8,#0x0
00b57250	mov w8,#0x40000000
00b57254	csel w25,w21,w8,eq
00b57258	add w8,w25,#0xf
00b5725c	rev w9,w9
00b57260	adds w8,w9,w8, LSR #0x4
00b57264	b.cc 0x00b57320
00b57268	ldp x12,x11,[sp, #0x48]
00b5726c	cmp w8,#0x0
00b57270	lsl w8,w9,#0x4
00b57274	csneg w25,w25,w8,eq
00b57278	ldrb w10,[x11]
00b5727c	add w10,w10,#0x1
00b57280	strb w10,[x11]
00b57284	ldrb w11,[x12]
00b57288	add w10,w11,w10, LSR #0x8
00b5728c	strb w10,[x12]
00b57290	ldr x12,[sp, #0x40]
00b57294	ldrb w11,[x12]
00b57298	add w10,w11,w10, LSR #0x8
00b5729c	strb w10,[x12]
00b572a0	ldr x12,[sp, #0x38]
00b572a4	ldrb w11,[x12]
00b572a8	add w10,w11,w10, LSR #0x8
00b572ac	strb w10,[x12]
00b572b0	ldr x12,[sp, #0x30]
00b572b4	ldrb w11,[x12]
00b572b8	add w10,w11,w10, LSR #0x8
00b572bc	strb w10,[x12]
00b572c0	ldr x12,[sp, #0x28]
00b572c4	ldrb w11,[x12]
00b572c8	add w10,w11,w10, LSR #0x8
00b572cc	strb w10,[x12]
00b572d0	ldr x12,[sp, #0x20]
00b572d4	ldrb w11,[x12]
00b572d8	add w10,w11,w10, LSR #0x8
00b572dc	strb w10,[x12]
00b572e0	ldrb w11,[x20]
00b572e4	add w10,w11,w10, LSR #0x8
00b572e8	strb w10,[x20]
00b572ec	ldrb w11,[x19]
00b572f0	add w10,w11,w10, LSR #0x8
00b572f4	strb w10,[x19]
00b572f8	ldrb w11,[x23]
00b572fc	add w10,w11,w10, LSR #0x8
00b57300	strb w10,[x23]
00b57304	ldrb w11,[x27]
00b57308	add w10,w11,w10, LSR #0x8
00b5730c	strb w10,[x27]
00b57310	ldrb w11,[x24]
00b57314	add w8,w11,w10, LSR #0x8
00b57318	strb w8,[x24]
00b5731c	mov w8,wzr
00b57320	ldr x0,[x26, #0x8]
00b57324	lsr w9,w8,#0x18
00b57328	lsr w10,w8,#0x10
00b5732c	strb w9,[x26, #0x60]
00b57330	lsr w9,w8,#0x8
00b57334	sub x2,x29,#0x54
00b57338	mov x1,x22
00b5733c	mov x3,x22
00b57340	mov w4,w25
00b57344	strb w10,[x26, #0x61]
00b57348	strb w9,[x26, #0x62]
00b5734c	strb w8,[x26, #0x63]
00b57350	bl 0x00c36d70
00b57354	cbz w0,0x00b57464
00b57358	ldur w8,[x29, #-0x54]
00b5735c	mov w0,wzr
00b57360	cmp w8,w25
00b57364	b.ne 0x00b57464
00b57368	sxtw x8,w25
00b5736c	subs x21,x21,x8
00b57370	add x22,x22,x8
00b57374	b.ne 0x00b57224
00b57378	ldr x0,[sp, #0x10]
00b5737c	mov x1,x28
00b57380	b 0x00b57444
00b57384	and w4,w4,#0xff
00b57388	add w4,w4,#0x1
00b5738c	strb w4,[x26, #0x63]
00b57390	lsr w4,w4,#0x8
00b57394	add w3,w4,w3, UXTB 
00b57398	strb w3,[x26, #0x62]
00b5739c	lsr w3,w3,#0x8
00b573a0	add w2,w3,w2, UXTB 
00b573a4	strb w2,[x26, #0x61]
00b573a8	lsr w2,w2,#0x8
00b573ac	add w1,w2,w1, UXTB 
00b573b0	strb w1,[x26, #0x60]
00b573b4	lsr w1,w1,#0x8
00b573b8	add w0,w1,w0, UXTB 
00b573bc	strb w0,[x26, #0x5f]
00b573c0	lsr w0,w0,#0x8
00b573c4	add w18,w0,w18, UXTB 
00b573c8	strb w18,[x26, #0x5e]
00b573cc	lsr w18,w18,#0x8
00b573d0	add w17,w18,w17, UXTB 
00b573d4	strb w17,[x26, #0x5d]
00b573d8	lsr w17,w17,#0x8
00b573dc	add w16,w17,w16, UXTB 
00b573e0	strb w16,[x26, #0x5c]
00b573e4	lsr w16,w16,#0x8
00b573e8	add w15,w16,w15, UXTB 
00b573ec	strb w15,[x26, #0x5b]
00b573f0	lsr w15,w15,#0x8
00b573f4	add w14,w15,w14, UXTB 
00b573f8	strb w14,[x26, #0x5a]
00b573fc	lsr w14,w14,#0x8
00b57400	add w13,w14,w13, UXTB 
00b57404	strb w13,[x26, #0x59]
00b57408	lsr w13,w13,#0x8
00b5740c	add w12,w13,w12, UXTB 
00b57410	strb w12,[x26, #0x58]
00b57414	lsr w12,w12,#0x8
00b57418	add w11,w12,w11, UXTB 
00b5741c	strb w11,[x26, #0x57]
00b57420	lsr w11,w11,#0x8
00b57424	add w10,w11,w10, UXTB 
00b57428	strb w10,[x26, #0x56]
00b5742c	lsr w10,w10,#0x8
00b57430	add w9,w10,w9, UXTB 
00b57434	add w8,w8,w9, LSR #0x8
00b57438	strb w9,[x26, #0x55]
00b5743c	strb w8,[x26, #0x54]
00b57440	ldp x0,x1,[sp, #0x10]
00b57444	ldr x2,[sp, #0x8]
00b57448	mov x3,xzr
00b5744c	mov x4,xzr
00b57450	mov x5,xzr
00b57454	mov x6,xzr
00b57458	bl 0x00b57484
00b5745c	cmp w0,#0x0
00b57460	cset w0,ne
00b57464	ldp x29,x30,[sp, #0xb0]
00b57468	ldp x20,x19,[sp, #0xa0]
00b5746c	ldp x22,x21,[sp, #0x90]
00b57470	ldp x24,x23,[sp, #0x80]
00b57474	ldp x26,x25,[sp, #0x70]
00b57478	ldp x28,x27,[sp, #0x60]
00b5747c	add sp,sp,#0xc0
00b57480	ret
