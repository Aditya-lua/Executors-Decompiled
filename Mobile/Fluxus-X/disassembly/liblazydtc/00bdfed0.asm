; FUN_00bdfed0 @ 00bdfed0
00bdfed0	paciasp
00bdfed4	sub sp,sp,#0x1e0
00bdfed8	stp x29,x30,[sp, #0x180]
00bdfedc	stp x28,x27,[sp, #0x190]
00bdfee0	stp x26,x25,[sp, #0x1a0]
00bdfee4	stp x24,x23,[sp, #0x1b0]
00bdfee8	stp x22,x21,[sp, #0x1c0]
00bdfeec	stp x20,x19,[sp, #0x1d0]
00bdfef0	add x29,sp,#0x180
00bdfef4	ldr w8,[x3, #0x8]
00bdfef8	mov w9,#0x4a
00bdfefc	mov x25,x3
00bdff00	mov x20,x2
00bdff04	mov x21,x1
00bdff08	sub x27,x29,#0xb0
00bdff0c	ands w8,w8,w9
00bdff10	stp x5,x4,[sp, #0x10]
00bdff14	b.eq 0x00bdff38
00bdff18	cmp w8,#0x40
00bdff1c	b.eq 0x00bdff30
00bdff20	cmp w8,#0x8
00bdff24	b.ne 0x00bdff40
00bdff28	mov w23,#0x10
00bdff2c	b 0x00bdff44
00bdff30	mov w23,#0x8
00bdff34	b 0x00bdff44
00bdff38	mov w23,wzr
00bdff3c	b 0x00bdff44
00bdff40	mov w23,#0xa
00bdff44	sub x2,x29,#0x74
00bdff48	mov x1,x25
00bdff4c	bl 0x00c0cb44
00bdff50	mov x24,x0
00bdff54	sub x8,x29,#0x90
00bdff58	sub x1,x29,#0xc
00bdff5c	mov x0,x25
00bdff60	bl 0x00c0cc28
00bdff64	stp xzr,xzr,[x27, #0x8]
00bdff68	str xzr,[x27, #0x18]
00bdff6c	sub x0,x29,#0xa8
00bdff70	mov w1,#0x16
00bdff74	mov w2,wzr
00bdff78	sub x19,x29,#0xa8
00bdff7c	bl 0x00c30250
00bdff80	ldurb w8,[x29, #-0xa8]
00bdff84	ldr x9,[x27, #0x18]
00bdff88	add x10,sp,#0x30
00bdff8c	orr x28,x19,#0x1
00bdff90	add x22,sp,#0x28
00bdff94	str x10,[sp, #0x28]
00bdff98	tst w8,#0x1
00bdff9c	str wzr,[sp, #0x24]
00bdffa0	csinc x25,x9,x19,ne
00bdffa4	mov w19,#0x16
00bdffa8	str x25,[x27]
00bdffac	b 0x00bdffb8
00bdffb0	add x8,x8,#0x4
00bdffb4	str x8,[x21, #0x18]
00bdffb8	cbz x21,0x00bdffd0
00bdffbc	ldp x8,x9,[x21, #0x18]
00bdffc0	cmp x8,x9
00bdffc4	b.eq 0x00bdffe0
00bdffc8	ldr w0,[x8]
00bdffcc	b 0x00bdfff0
00bdffd0	mov w26,#0x1
00bdffd4	cbnz x20,0x00be0000
00bdffd8	tbz w26,#0x0,0x00be0038
00bdffdc	b 0x00be017c
00bdffe0	ldr x8,[x21]
00bdffe4	ldr x8,[x8, #0x48]
00bdffe8	mov x0,x21
00bdffec	blr x8
00bdfff0	cmn w0,#0x1
00bdfff4	cset w26,eq
00bdfff8	csel x21,xzr,x21,eq
00bdfffc	cbz x20,0x00bdffd8
00be0000	ldp x8,x9,[x20, #0x18]
00be0004	cmp x8,x9
00be0008	b.eq 0x00be0014
00be000c	ldr w0,[x8]
00be0010	b 0x00be0024
00be0014	ldr x8,[x20]
00be0018	ldr x8,[x8, #0x48]
00be001c	mov x0,x20
00be0020	blr x8
00be0024	cmn w0,#0x1
00be0028	cset w8,eq
00be002c	csel x20,xzr,x20,eq
00be0030	cmp w26,w8
00be0034	b.eq 0x00be017c
00be0038	ldurb w8,[x29, #-0xa8]
00be003c	ldr x9,[x27, #0x10]
00be0040	ldr x11,[x27]
00be0044	lsr x10,x8,#0x1
00be0048	tst w8,#0x1
00be004c	csel x26,x10,x9,eq
00be0050	add x9,x25,x26
00be0054	cmp x11,x9
00be0058	b.ne 0x00be0110
00be005c	cmp x26,#0x1
00be0060	b.lt 0x00be0078
00be0064	sub x0,x29,#0xa8
00be0068	mov x1,x26
00be006c	mov w2,wzr
00be0070	bl 0x00c30250
00be0074	b 0x00be009c
00be0078	lsl x9,x26,#0x1
00be007c	tbnz w8,#0x0,0x00be0090
00be0080	lsl w8,w9,#0x1
00be0084	sturb w8,[x29, #-0xa8]
00be0088	mov x8,x28
00be008c	b 0x00be0098
00be0090	ldr x8,[x27, #0x18]
00be0094	str x9,[x27, #0x10]
00be0098	strb wzr,[x8, x9]
00be009c	ldp x9,x10,[x27, #0x8]
00be00a0	ldurb w8,[x29, #-0xa8]
00be00a4	tst w8,#0x1
00be00a8	and x11,x9,#-0x2
00be00ac	ubfx x12,x9,#0x1,#0x7
00be00b0	sub x11,x11,#0x1
00be00b4	csel x8,x19,x11,eq
00be00b8	tst x9,#0x1
00be00bc	csel x10,x12,x10,eq
00be00c0	subs x1,x8,x10
00be00c4	b.ls 0x00be00d8
00be00c8	sub x0,x29,#0xa8
00be00cc	mov w2,wzr
00be00d0	bl 0x00c30250
00be00d4	b 0x00be00f8
00be00d8	tbnz w9,#0x0,0x00be00ec
00be00dc	lsl w9,w8,#0x1
00be00e0	sturb w9,[x29, #-0xa8]
00be00e4	mov x9,x28
00be00e8	b 0x00be00f4
00be00ec	ldr x9,[x27, #0x18]
00be00f0	str x8,[x27, #0x10]
00be00f4	strb wzr,[x9, x8]
00be00f8	ldurb w8,[x29, #-0xa8]
00be00fc	ldr x9,[x27, #0x18]
00be0100	tst w8,#0x1
00be0104	csel x25,x28,x9,eq
00be0108	add x8,x25,x26
00be010c	str x8,[x27]
00be0110	ldp x8,x9,[x21, #0x18]
00be0114	cmp x8,x9
00be0118	b.eq 0x00be0124
00be011c	ldr w0,[x8]
00be0120	b 0x00be0134
00be0124	ldr x8,[x21]
00be0128	ldr x8,[x8, #0x48]
00be012c	mov x0,x21
00be0130	blr x8
00be0134	ldur w5,[x29, #-0xc]
00be0138	sub x3,x29,#0xb0
00be013c	add x4,sp,#0x24
00be0140	sub x6,x29,#0x90
00be0144	add x7,sp,#0x30
00be0148	mov w1,w23
00be014c	mov x2,x25
00be0150	stp x22,x24,[sp]
00be0154	bl 0x00c44120
00be0158	cbnz w0,0x00be017c
00be015c	ldp x8,x9,[x21, #0x18]
00be0160	cmp x8,x9
00be0164	b.ne 0x00bdffb0
00be0168	ldr x8,[x21]
00be016c	ldr x8,[x8, #0x50]
00be0170	mov x0,x21
00be0174	blr x8
00be0178	b 0x00bdffb8
00be017c	ldurb w8,[x29, #-0x90]
00be0180	ldr x9,[x27, #0x28]
00be0184	ldr x22,[sp, #0x18]
00be0188	lsr x10,x8,#0x1
00be018c	tst w8,#0x1
00be0190	csel x8,x10,x9,eq
00be0194	cbz x8,0x00be01b8
00be0198	ldr x8,[sp, #0x28]
00be019c	add x9,sp,#0x30
00be01a0	sub x9,x8,x9
00be01a4	cmp x9,#0x9f
00be01a8	b.gt 0x00be01b8
00be01ac	ldr w9,[sp, #0x24]
00be01b0	str w9,[x8], #0x4
00be01b4	str x8,[sp, #0x28]
00be01b8	ldr x1,[x27]
00be01bc	mov x0,x25
00be01c0	mov x2,x22
00be01c4	mov w3,w23
00be01c8	bl 0x00c0c1fc
00be01cc	ldurb w10,[x29, #-0x90]
00be01d0	ldr x12,[sp, #0x28]
00be01d4	add x11,sp,#0x30
00be01d8	ldr x8,[x27, #0x28]
00be01dc	lsr x9,x10,#0x1
00be01e0	ands w13,w10,#0x1
00be01e4	sub x11,x12,x11
00be01e8	csel x8,x9,x8,eq
00be01ec	ldr x9,[sp, #0x10]
00be01f0	cmp x11,#0x5
00be01f4	strh w0,[x9]
00be01f8	b.lt 0x00be0358
00be01fc	cbz x8,0x00be0358
00be0200	sub x8,x12,#0x4
00be0204	add x9,sp,#0x30
00be0208	cmp x9,x8
00be020c	cset w11,cc
00be0210	cmp x9,x12
00be0214	b.eq 0x00be02c4
00be0218	cbz w11,0x00be02c4
00be021c	add x10,sp,#0x30
00be0220	sub x14,x12,#0x8
00be0224	add x11,x10,#0x4
00be0228	cmp x14,x11
00be022c	csel x13,x14,x11,hi
00be0230	sub x13,x13,#0x4
00be0234	cmp x13,x10
00be0238	cinc x15,x10,ne
00be023c	cmp x13,x10
00be0240	sub x15,x13,x15
00be0244	lsr x15,x15,#0x3
00be0248	cinc x13,x15,ne
00be024c	cmp x13,#0x13
00be0250	b.cc 0x00be0298
00be0254	cmp x14,x11
00be0258	csel x14,x14,x11,hi
00be025c	sub x14,x14,#0x4
00be0260	cmp x14,x10
00be0264	cinc x15,x10,ne
00be0268	cmp x14,x10
00be026c	sub x15,x14,x15
00be0270	lsr x15,x15,#0x3
00be0274	cinc x14,x15,ne
00be0278	cmp x10,x12
00be027c	b.cs 0x00be0438
00be0280	lsl x14,x14,#0x2
00be0284	sub x15,x12,x14
00be0288	add x11,x11,x14
00be028c	sub x14,x15,#0x4
00be0290	cmp x14,x11
00be0294	b.cs 0x00be0438
00be0298	mov x11,x8
00be029c	add x10,x10,#0x4
00be02a0	ldr w12,[x11]
00be02a4	ldur w13,[x10, #-0x4]
00be02a8	stur w12,[x10, #-0x4]
00be02ac	str w13,[x11], #-0x4
00be02b0	cmp x10,x11
00be02b4	add x10,x10,#0x4
00be02b8	b.cc 0x00be02a0
00be02bc	ldurb w10,[x29, #-0x90]
00be02c0	and w13,w10,#0x1
00be02c4	ldr x11,[x27, #0x30]
00be02c8	cmp w13,#0x0
00be02cc	sub x12,x29,#0x90
00be02d0	csinc x11,x11,x12,ne
00be02d4	cmp x9,x8
00be02d8	b.cs 0x00be0330
00be02dc	lsr w9,w10,#0x1
00be02e0	ldr x10,[x27, #0x28]
00be02e4	cmp w13,#0x0
00be02e8	csel x9,x9,x10,eq
00be02ec	add x10,sp,#0x30
00be02f0	add x9,x11,x9
00be02f4	b 0x00be0310
00be02f8	sub x12,x9,x11
00be02fc	add x10,x10,#0x4
00be0300	cmp x12,#0x1
00be0304	cinc x11,x11,gt
00be0308	cmp x10,x8
00be030c	b.cs 0x00be0330
00be0310	ldrb w12,[x11]
00be0314	cbz w12,0x00be02f8
00be0318	cmp w12,#0xff
00be031c	b.eq 0x00be02f8
00be0320	ldr w13,[x10]
00be0324	cmp w13,w12
00be0328	b.eq 0x00be02f8
00be032c	b 0x00be0350
00be0330	ldrb w9,[x11]
00be0334	cbz w9,0x00be0358
00be0338	cmp w9,#0xff
00be033c	b.eq 0x00be0358
00be0340	ldr w8,[x8]
00be0344	sub w8,w8,#0x1
00be0348	cmp w8,w9
00be034c	b.cc 0x00be0358
00be0350	mov w8,#0x4
00be0354	str w8,[x22]
00be0358	cbz x21,0x00be0370
00be035c	ldp x8,x9,[x21, #0x18]
00be0360	cmp x8,x9
00be0364	b.eq 0x00be0380
00be0368	ldr w0,[x8]
00be036c	b 0x00be0390
00be0370	mov w19,#0x1
00be0374	cbnz x20,0x00be03a0
00be0378	tbnz w19,#0x0,0x00be03d4
00be037c	b 0x00be03e0
00be0380	ldr x8,[x21]
00be0384	ldr x8,[x8, #0x48]
00be0388	mov x0,x21
00be038c	blr x8
00be0390	cmn w0,#0x1
00be0394	cset w19,eq
00be0398	csel x21,xzr,x21,eq
00be039c	cbz x20,0x00be0378
00be03a0	ldp x8,x9,[x20, #0x18]
00be03a4	cmp x8,x9
00be03a8	b.eq 0x00be03b4
00be03ac	ldr w0,[x8]
00be03b0	b 0x00be03c4
00be03b4	ldr x8,[x20]
00be03b8	ldr x8,[x8, #0x48]
00be03bc	mov x0,x20
00be03c0	blr x8
00be03c4	cmn w0,#0x1
00be03c8	cset w8,eq
00be03cc	eor w8,w19,w8
00be03d0	tbnz w8,#0x0,0x00be03e0
00be03d4	ldr w8,[x22]
00be03d8	orr w8,w8,#0x2
00be03dc	str w8,[x22]
00be03e0	ldurb w8,[x29, #-0xa8]
00be03e4	tbz w8,#0x0,0x00be03f8
00be03e8	ldr x8,[x27, #0x8]
00be03ec	ldr x0,[x27, #0x18]
00be03f0	and x1,x8,#-0x2
00be03f4	bl 0x00c2fe80
00be03f8	ldurb w8,[x29, #-0x90]
00be03fc	tbz w8,#0x0,0x00be0410
00be0400	ldr x8,[x27, #0x20]
00be0404	ldr x0,[x27, #0x30]
00be0408	and x1,x8,#-0x2
00be040c	bl 0x00c2fe80
00be0410	mov x0,x21
00be0414	ldp x20,x19,[sp, #0x1d0]
00be0418	ldp x22,x21,[sp, #0x1c0]
00be041c	ldp x24,x23,[sp, #0x1b0]
00be0420	ldp x26,x25,[sp, #0x1a0]
00be0424	ldp x28,x27,[sp, #0x190]
00be0428	ldp x29,x30,[sp, #0x180]
00be042c	add sp,sp,#0x1e0
00be0430	autiasp
00be0434	ret
00be0438	add x13,x13,#0x1
00be043c	add x15,sp,#0x30
00be0440	sub x12,x12,#0x10
00be0444	and x14,x13,#0x7ffffffffffffff8
00be0448	lsl x10,x14,#0x2
00be044c	mov x16,x14
00be0450	sub x11,x8,x10
00be0454	add x10,x15,x10
00be0458	add x15,x15,#0x10
00be045c	ldp q1,q0,[x12, #-0x10]
00be0460	sub x16,x16,#0x8
00be0464	ldp q2,q3,[x15, #-0x10]
00be0468	rev64 v0.4S,v0.4S
00be046c	rev64 v1.4S,v1.4S
00be0470	rev64 v2.4S,v2.4S
00be0474	rev64 v3.4S,v3.4S
00be0478	ext v0.16B,v0.16B,v0.16B,0x8
00be047c	ext v1.16B,v1.16B,v1.16B,0x8
00be0480	ext v2.16B,v2.16B,v2.16B,0x8
00be0484	ext v3.16B,v3.16B,v3.16B,0x8
00be0488	stp q0,q1,[x15, #-0x10]
00be048c	add x15,x15,#0x20
00be0490	stp q3,q2,[x12, #-0x10]
00be0494	sub x12,x12,#0x20
00be0498	cbnz x16,0x00be045c
00be049c	cmp x13,x14
00be04a0	b.eq 0x00be02bc
00be04a4	b 0x00be029c
