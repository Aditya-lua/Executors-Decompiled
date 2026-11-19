; FUN_00adfe04 @ 00adfe04
00adfe04	sub sp,sp,#0x120
00adfe08	stp x28,x27,[sp, #0xc0]
00adfe0c	stp x26,x25,[sp, #0xd0]
00adfe10	stp x24,x23,[sp, #0xe0]
00adfe14	stp x22,x21,[sp, #0xf0]
00adfe18	stp x20,x19,[sp, #0x100]
00adfe1c	stp x29,x30,[sp, #0x110]
00adfe20	str x0,[sp, #0x8]
00adfe24	cbz x2,0x00ae0aa4
00adfe28	ldr x8,[sp, #0x8]
00adfe2c	mov x3,x1
00adfe30	mov w26,#0x9
00adfe34	add x30,sp,#0x80
00adfe38	ldp w19,w0,[x8]
00adfe3c	ldp w18,w16,[x8, #0x8]
00adfe40	ldp w4,w1,[x8, #0x10]
00adfe44	ldp w6,w17,[x8, #0x18]
00adfe48	ldr w8,[x3]
00adfe4c	ror w9,w4,#0x6
00adfe50	eor w9,w9,w4, ROR #0xb
00adfe54	and w10,w1,w4
00adfe58	bic w11,w6,w4
00adfe5c	eor w9,w9,w4, ROR #0x19
00adfe60	eor w10,w11,w10
00adfe64	add w9,w17,w9
00adfe68	rev w8,w8
00adfe6c	add w9,w9,w10
00adfe70	ror w12,w19,#0x2
00adfe74	eor w14,w18,w0
00adfe78	str w8,[sp, #0x80]
00adfe7c	add w8,w9,w8
00adfe80	mov w9,#0x2f98
00adfe84	and w15,w18,w0
00adfe88	eor w11,w12,w19, ROR #0xd
00adfe8c	and w12,w14,w19
00adfe90	movk w9,#0x428a, LSL #16
00adfe94	eor w11,w11,w19, ROR #0x16
00adfe98	eor w12,w12,w15
00adfe9c	add w8,w8,w9
00adfea0	ldr w9,[x3, #0x4]
00adfea4	add w11,w12,w11
00adfea8	add w14,w8,w16
00adfeac	add w8,w11,w8
00adfeb0	and w11,w14,w4
00adfeb4	bic w12,w1,w14
00adfeb8	and w13,w0,w19
00adfebc	str w17,[sp, #0x10]
00adfec0	ror w10,w14,#0x6
00adfec4	ror w15,w8,#0x2
00adfec8	and w17,w8,w0
00adfecc	eor w11,w11,w12
00adfed0	str w16,[sp, #0x20]
00adfed4	and w16,w8,w19
00adfed8	eor w10,w10,w14, ROR #0xb
00adfedc	eor w12,w15,w8, ROR #0xd
00adfee0	eor w13,w17,w13
00adfee4	rev w9,w9
00adfee8	add w11,w6,w11
00adfeec	eor w10,w10,w14, ROR #0x19
00adfef0	eor w12,w12,w8, ROR #0x16
00adfef4	eor w13,w13,w16
00adfef8	str w9,[sp, #0x84]
00adfefc	add w9,w11,w9
00adff00	add w11,w12,w13
00adff04	add w9,w9,w10
00adff08	ldr w10,[x3, #0x8]
00adff0c	mov w12,#0x4491
00adff10	movk w12,#0x7137, LSL #16
00adff14	add w9,w9,w12
00adff18	add w13,w9,w18
00adff1c	add w9,w11,w9
00adff20	str w18,[sp, #0x24]
00adff24	ror w11,w13,#0x6
00adff28	and w12,w13,w14
00adff2c	bic w15,w4,w13
00adff30	ror w16,w9,#0x2
00adff34	eor w18,w9,w8
00adff38	rev w10,w10
00adff3c	and w17,w9,w8
00adff40	eor w11,w11,w13, ROR #0xb
00adff44	eor w12,w12,w15
00adff48	eor w15,w16,w9, ROR #0xd
00adff4c	and w16,w18,w19
00adff50	str w10,[sp, #0x88]
00adff54	add w10,w1,w10
00adff58	eor w11,w11,w13, ROR #0x19
00adff5c	eor w15,w15,w9, ROR #0x16
00adff60	eor w16,w16,w17
00adff64	add w10,w10,w12
00adff68	add w15,w15,w16
00adff6c	ldr w16,[x3, #0xc]
00adff70	add w10,w10,w11
00adff74	mov w11,#0xfbcf
00adff78	movk w11,#0xb5c0, LSL #16
00adff7c	add w10,w10,w11
00adff80	add w12,w10,w0
00adff84	add w10,w15,w10
00adff88	str w1,[sp, #0x18]
00adff8c	rev w11,w16
00adff90	ror w15,w12,#0x6
00adff94	and w16,w12,w13
00adff98	bic w17,w14,w12
00adff9c	ror w18,w10,#0x2
00adffa0	eor w1,w10,w9
00adffa4	str w0,[sp, #0x28]
00adffa8	and w0,w10,w9
00adffac	str w11,[sp, #0x8c]
00adffb0	eor w15,w15,w12, ROR #0xb
00adffb4	eor w16,w16,w17
00adffb8	add w11,w4,w11
00adffbc	eor w17,w18,w10, ROR #0xd
00adffc0	and w18,w1,w8
00adffc4	eor w15,w15,w12, ROR #0x19
00adffc8	add w11,w11,w16
00adffcc	eor w16,w17,w10, ROR #0x16
00adffd0	eor w17,w18,w0
00adffd4	ldr w18,[x3, #0x10]
00adffd8	add w11,w11,w15
00adffdc	add w15,w16,w17
00adffe0	mov w16,#0xdba5
00adffe4	movk w16,#0xe9b5, LSL #16
00adffe8	add w11,w11,w16
00adffec	add w17,w11,w19
00adfff0	add w11,w15,w11
00adfff4	rev w15,w18
00adfff8	ror w16,w17,#0x6
00adfffc	and w18,w17,w12
00ae0000	bic w0,w13,w17
00ae0004	str w15,[sp, #0x90]
00ae0008	add w14,w14,w15
00ae000c	eor w15,w11,w10
00ae0010	eor w18,w18,w0
00ae0014	and w0,w11,w10
00ae0018	eor w16,w16,w17, ROR #0xb
00ae001c	and w15,w15,w9
00ae0020	ror w1,w11,#0x2
00ae0024	eor w16,w16,w17, ROR #0x19
00ae0028	add w14,w14,w18
00ae002c	eor w15,w15,w0
00ae0030	ldr w0,[x3, #0x14]
00ae0034	eor w1,w1,w11, ROR #0xd
00ae0038	add w14,w14,w16
00ae003c	mov w16,#0xc25b
00ae0040	eor w18,w1,w11, ROR #0x16
00ae0044	movk w16,#0x3956, LSL #16
00ae0048	add w15,w18,w15
00ae004c	add w16,w14,w16
00ae0050	add w14,w16,w8
00ae0054	add w8,w15,w16
00ae0058	rev w15,w0
00ae005c	ror w16,w14,#0x6
00ae0060	and w18,w14,w17
00ae0064	bic w0,w12,w14
00ae0068	ror w1,w8,#0x2
00ae006c	str w15,[sp, #0x94]
00ae0070	add w13,w13,w15
00ae0074	eor w15,w8,w11
00ae0078	eor w18,w18,w0
00ae007c	and w0,w8,w11
00ae0080	eor w16,w16,w14, ROR #0xb
00ae0084	eor w1,w1,w8, ROR #0xd
00ae0088	and w15,w15,w10
00ae008c	eor w16,w16,w14, ROR #0x19
00ae0090	add w13,w13,w18
00ae0094	eor w18,w1,w8, ROR #0x16
00ae0098	eor w15,w15,w0
00ae009c	ldr w0,[x3, #0x18]
00ae00a0	add w13,w13,w16
00ae00a4	add w16,w18,w15
00ae00a8	mov w15,#0x11f1
00ae00ac	movk w15,#0x59f1, LSL #16
00ae00b0	add w13,w13,w15
00ae00b4	add w15,w13,w9
00ae00b8	add w9,w16,w13
00ae00bc	rev w13,w0
00ae00c0	ror w16,w15,#0x6
00ae00c4	and w18,w15,w14
00ae00c8	bic w0,w17,w15
00ae00cc	str w13,[sp, #0x98]
00ae00d0	add w12,w12,w13
00ae00d4	eor w13,w9,w8
00ae00d8	eor w18,w18,w0
00ae00dc	and w0,w9,w8
00ae00e0	eor w16,w16,w15, ROR #0xb
00ae00e4	and w13,w13,w11
00ae00e8	ror w1,w9,#0x2
00ae00ec	eor w16,w16,w15, ROR #0x19
00ae00f0	add w12,w12,w18
00ae00f4	eor w13,w13,w0
00ae00f8	ldr w0,[x3, #0x1c]
00ae00fc	eor w1,w1,w9, ROR #0xd
00ae0100	add w12,w12,w16
00ae0104	mov w16,#0x82a4
00ae0108	eor w18,w1,w9, ROR #0x16
00ae010c	movk w16,#0x923f, LSL #16
00ae0110	add w13,w18,w13
00ae0114	add w12,w12,w16
00ae0118	add w16,w12,w10
00ae011c	add w12,w13,w12
00ae0120	rev w10,w0
00ae0124	ror w13,w16,#0x6
00ae0128	and w18,w16,w15
00ae012c	bic w0,w14,w16
00ae0130	ror w1,w12,#0x2
00ae0134	str w10,[sp, #0x9c]
00ae0138	add w10,w17,w10
00ae013c	eor w17,w12,w9
00ae0140	eor w18,w18,w0
00ae0144	and w0,w12,w9
00ae0148	eor w13,w13,w16, ROR #0xb
00ae014c	eor w1,w1,w12, ROR #0xd
00ae0150	and w17,w17,w8
00ae0154	eor w13,w13,w16, ROR #0x19
00ae0158	add w10,w10,w18
00ae015c	eor w18,w1,w12, ROR #0x16
00ae0160	eor w17,w17,w0
00ae0164	ldr w0,[x3, #0x20]
00ae0168	add w10,w10,w13
00ae016c	add w13,w18,w17
00ae0170	mov w17,#0x5ed5
00ae0174	movk w17,#0xab1c, LSL #16
00ae0178	add w10,w10,w17
00ae017c	add w17,w10,w11
00ae0180	add w13,w13,w10
00ae0184	rev w10,w0
00ae0188	ror w11,w17,#0x6
00ae018c	and w18,w17,w16
00ae0190	bic w0,w15,w17
00ae0194	ror w1,w13,#0x2
00ae0198	str w10,[sp, #0xa0]
00ae019c	add w10,w14,w10
00ae01a0	eor w14,w13,w12
00ae01a4	eor w18,w18,w0
00ae01a8	and w0,w13,w12
00ae01ac	eor w11,w11,w17, ROR #0xb
00ae01b0	eor w1,w1,w13, ROR #0xd
00ae01b4	and w14,w14,w9
00ae01b8	eor w11,w11,w17, ROR #0x19
00ae01bc	add w10,w10,w18
00ae01c0	eor w18,w1,w13, ROR #0x16
00ae01c4	eor w14,w14,w0
00ae01c8	ldr w0,[x3, #0x24]
00ae01cc	add w10,w10,w11
00ae01d0	add w11,w18,w14
00ae01d4	mov w14,#0xaa98
00ae01d8	movk w14,#0xd807, LSL #16
00ae01dc	add w10,w10,w14
00ae01e0	add w18,w10,w8
00ae01e4	add w11,w11,w10
00ae01e8	rev w8,w0
00ae01ec	ror w10,w18,#0x6
00ae01f0	and w14,w18,w17
00ae01f4	bic w0,w16,w18
00ae01f8	ror w1,w11,#0x2
00ae01fc	str w8,[sp, #0xa4]
00ae0200	add w8,w8,w15
00ae0204	eor w15,w11,w13
00ae0208	eor w14,w14,w0
00ae020c	and w0,w11,w13
00ae0210	eor w10,w10,w18, ROR #0xb
00ae0214	eor w1,w1,w11, ROR #0xd
00ae0218	and w15,w15,w12
00ae021c	eor w10,w10,w18, ROR #0x19
00ae0220	add w8,w8,w14
00ae0224	eor w14,w1,w11, ROR #0x16
00ae0228	eor w15,w15,w0
00ae022c	ldr w0,[x3, #0x28]
00ae0230	add w8,w8,w10
00ae0234	add w10,w14,w15
00ae0238	mov w14,#0x5b01
00ae023c	movk w14,#0x1283, LSL #16
00ae0240	add w8,w8,w14
00ae0244	add w14,w8,w9
00ae0248	add w10,w10,w8
00ae024c	rev w8,w0
00ae0250	ror w9,w14,#0x6
00ae0254	and w15,w14,w18
00ae0258	bic w0,w17,w14
00ae025c	ror w1,w10,#0x2
00ae0260	str w8,[sp, #0xa8]
00ae0264	add w8,w8,w16
00ae0268	eor w16,w10,w11
00ae026c	eor w15,w15,w0
00ae0270	and w0,w10,w11
00ae0274	eor w9,w9,w14, ROR #0xb
00ae0278	eor w1,w1,w10, ROR #0xd
00ae027c	and w16,w16,w13
00ae0280	eor w9,w9,w14, ROR #0x19
00ae0284	add w8,w8,w15
00ae0288	eor w15,w1,w10, ROR #0x16
00ae028c	eor w16,w16,w0
00ae0290	ldr w0,[x3, #0x2c]
00ae0294	add w8,w8,w9
00ae0298	add w9,w15,w16
00ae029c	mov w15,#0x85be
00ae02a0	movk w15,#0x2431, LSL #16
00ae02a4	add w8,w8,w15
00ae02a8	add w12,w8,w12
00ae02ac	add w8,w9,w8
00ae02b0	rev w9,w0
00ae02b4	ror w15,w12,#0x6
00ae02b8	and w16,w12,w14
00ae02bc	bic w0,w18,w12
00ae02c0	ror w1,w8,#0x2
00ae02c4	str w9,[sp, #0xac]
00ae02c8	add w9,w9,w17
00ae02cc	eor w17,w8,w10
00ae02d0	eor w16,w16,w0
00ae02d4	and w0,w8,w10
00ae02d8	eor w15,w15,w12, ROR #0xb
00ae02dc	eor w1,w1,w8, ROR #0xd
00ae02e0	and w17,w17,w11
00ae02e4	eor w15,w15,w12, ROR #0x19
00ae02e8	add w9,w9,w16
00ae02ec	eor w16,w1,w8, ROR #0x16
00ae02f0	eor w17,w17,w0
00ae02f4	ldr w0,[x3, #0x30]
00ae02f8	add w9,w9,w15
00ae02fc	add w15,w16,w17
00ae0300	mov w16,#0x7dc3
00ae0304	movk w16,#0x550c, LSL #16
00ae0308	add w9,w9,w16
00ae030c	add w13,w9,w13
00ae0310	add w9,w15,w9
00ae0314	rev w15,w0
00ae0318	ror w16,w13,#0x6
00ae031c	and w17,w13,w12
00ae0320	bic w0,w14,w13
00ae0324	ror w1,w9,#0x2
00ae0328	str w15,[sp, #0xb0]
00ae032c	add w15,w15,w18
00ae0330	eor w18,w9,w8
00ae0334	eor w17,w17,w0
00ae0338	and w0,w9,w8
00ae033c	eor w16,w16,w13, ROR #0xb
00ae0340	eor w1,w1,w9, ROR #0xd
00ae0344	and w18,w18,w10
00ae0348	eor w16,w16,w13, ROR #0x19
00ae034c	add w15,w15,w17
00ae0350	eor w17,w1,w9, ROR #0x16
00ae0354	eor w18,w18,w0
00ae0358	ldr w0,[x3, #0x34]
00ae035c	add w15,w15,w16
00ae0360	add w16,w17,w18
00ae0364	mov w17,#0x5d74
00ae0368	movk w17,#0x72be, LSL #16
00ae036c	add w15,w15,w17
00ae0370	add w5,w15,w11
00ae0374	str w4,[sp, #0x1c]
00ae0378	add w4,w16,w15
00ae037c	rev w11,w0
00ae0380	ror w15,w5,#0x6
00ae0384	and w16,w5,w13
00ae0388	bic w17,w12,w5
00ae038c	eor w16,w16,w17
00ae0390	str w11,[sp, #0xb4]
00ae0394	add w11,w11,w14
00ae0398	eor w14,w4,w9
00ae039c	eor w15,w15,w5, ROR #0xb
00ae03a0	and w17,w4,w9
00ae03a4	and w14,w14,w8
00ae03a8	eor w15,w15,w5, ROR #0x19
00ae03ac	add w11,w11,w16
00ae03b0	ror w18,w4,#0x2
00ae03b4	eor w14,w14,w17
00ae03b8	ldr w17,[x3, #0x38]
00ae03bc	add w11,w11,w15
00ae03c0	mov w15,#0xb1fe
00ae03c4	eor w18,w18,w4, ROR #0xd
00ae03c8	movk w15,#0x80de, LSL #16
00ae03cc	eor w16,w18,w4, ROR #0x16
00ae03d0	add w11,w11,w15
00ae03d4	add w14,w16,w14
00ae03d8	add w20,w11,w10
00ae03dc	str w6,[sp, #0x14]
00ae03e0	add w6,w14,w11
00ae03e4	rev w10,w17
00ae03e8	and w14,w20,w5
00ae03ec	bic w15,w13,w20
00ae03f0	ror w16,w6,#0x2
00ae03f4	eor w14,w14,w15
00ae03f8	str w10,[sp, #0xb8]
00ae03fc	add w10,w10,w12
00ae0400	eor w12,w6,w4
00ae0404	ror w11,w20,#0x6
00ae0408	and w15,w6,w4
00ae040c	eor w16,w16,w6, ROR #0xd
00ae0410	add w10,w10,w14
00ae0414	and w14,w12,w9
00ae0418	eor w11,w11,w20, ROR #0xb
00ae041c	eor w16,w16,w6, ROR #0x16
00ae0420	eor w14,w14,w15
00ae0424	eor w11,w11,w20, ROR #0x19
00ae0428	add w14,w16,w14
00ae042c	mov w16,#0x6a7
00ae0430	add w10,w10,w11
00ae0434	ldr w11,[x3, #0x3c]
00ae0438	movk w16,#0x9bdc, LSL #16
00ae043c	add w10,w10,w16
00ae0440	add w23,w10,w8
00ae0444	add w7,w14,w10
00ae0448	and w8,w23,w20
00ae044c	bic w10,w5,w23
00ae0450	eor w8,w8,w10
00ae0454	rev w10,w11
00ae0458	str w10,[sp, #0xbc]
00ae045c	add w10,w10,w13
00ae0460	add w8,w10,w8
00ae0464	ror w10,w23,#0x6
00ae0468	eor w10,w10,w23, ROR #0xb
00ae046c	eor w10,w10,w23, ROR #0x19
00ae0470	add w8,w8,w10
00ae0474	ror w10,w7,#0x2
00ae0478	and w11,w7,w12
00ae047c	eor w10,w10,w7, ROR #0xd
00ae0480	eor w11,w11,w15
00ae0484	eor w10,w10,w7, ROR #0x16
00ae0488	add w10,w10,w11
00ae048c	adrp x11,0x775000
00ae0490	add x11,x11,#0xae8
00ae0494	str x3,[sp, #0x30]
00ae0498	add x3,x11,#0x5c
00ae049c	mov w11,#0xf174
00ae04a0	movk w11,#0xc19b, LSL #16
00ae04a4	add w8,w8,w11
00ae04a8	str w19,[sp, #0x2c]
00ae04ac	add w22,w8,w9
00ae04b0	add w19,w10,w8
00ae04b4	mov w21,#0x12
00ae04b8	str x2,[sp, #0x38]
00ae04bc	add w8,w21,#0x7
00ae04c0	str x8,[sp, #0x78]
00ae04c4	sub w8,w21,#0x2
00ae04c8	str w8,[sp, #0x74]
00ae04cc	mov w8,#0xa
00ae04d0	and x8,x21,x8
00ae04d4	str x8,[sp, #0x68]
00ae04d8	add w8,w21,#0x1
00ae04dc	and w11,w23,w22
00ae04e0	bic w0,w20,w22
00ae04e4	str x8,[sp, #0x60]
00ae04e8	add w8,w21,#0xa
00ae04ec	str x8,[sp, #0x58]
00ae04f0	add w8,w21,#0x10
00ae04f4	eor w0,w0,w11
00ae04f8	ldr x11,[sp, #0x78]
00ae04fc	eor w17,w19,w7
00ae0500	str x8,[sp, #0x50]
00ae0504	add w8,w21,#0xb
00ae0508	sub w10,w21,#0x1
00ae050c	and w12,w19,w7
00ae0510	str x8,[sp, #0x48]
00ae0514	add w8,w21,#0x3
00ae0518	and w17,w17,w6
00ae051c	str x8,[sp, #0x40]
00ae0520	eor w8,w17,w12
00ae0524	and x17,x10,x26
00ae0528	mov w10,#0x9
00ae052c	and x26,x11,x10
00ae0530	ldr w10,[sp, #0x74]
00ae0534	ror w25,w22,#0x6
00ae0538	ror w24,w19,#0x2
00ae053c	ldp w9,w29,[x3, #-0x1c]
00ae0540	eor w25,w25,w22, ROR #0xb
00ae0544	eor w24,w24,w19, ROR #0xd
00ae0548	add w27,w21,#0xc
00ae054c	eor w25,w25,w22, ROR #0x19
00ae0550	and w12,w10,#0x8
00ae0554	eor w24,w24,w19, ROR #0x16
00ae0558	add w25,w25,w5
00ae055c	and x27,x27,#0xe
00ae0560	lsl x5,x17,#0x2
00ae0564	add w8,w24,w8
00ae0568	lsl x24,x12,#0x2
00ae056c	lsl x17,x27,#0x2
00ae0570	ldr w26,[x30, x26, LSL #0x2]
00ae0574	add w0,w25,w0
00ae0578	ldr w25,[x30, x24#0x0]
00ae057c	add w20,w29,w20
00ae0580	ldr w29,[x30, x5#0x0]
00ae0584	ldr w27,[x30, x17#0x0]
00ae0588	add w9,w0,w9
00ae058c	add w0,w25,w26
00ae0590	ror w26,w29,#0x12
00ae0594	ldr x10,[sp, #0x68]
00ae0598	ror w25,w27,#0x13
00ae059c	eor w26,w26,w29, LSR #0x3
00ae05a0	eor w25,w25,w27, LSR #0xa
00ae05a4	eor w26,w26,w29, ROR #0x7
00ae05a8	eor w25,w25,w27, ROR #0x11
00ae05ac	add w0,w0,w26
00ae05b0	add x16,x21,#0x8
00ae05b4	add w0,w0,w25
00ae05b8	lsl x25,x10,#0x2
00ae05bc	mov w10,#0xa
00ae05c0	str w0,[x30, x24#0x0]
00ae05c4	and x24,x16,x10
00ae05c8	add w9,w9,w0
00ae05cc	ldp w26,w27,[x3, #-0x14]
00ae05d0	add w4,w9,w4
00ae05d4	add w0,w8,w9
00ae05d8	ldr w9,[x30, x24, LSL #0x2]
00ae05dc	add w26,w26,w23
00ae05e0	and w24,w4,w22
00ae05e4	bic w23,w23,w4
00ae05e8	add w9,w9,w29
00ae05ec	ror w29,w4,#0x6
00ae05f0	add w13,w21,#0xd
00ae05f4	eor w23,w24,w23
00ae05f8	eor w29,w29,w4, ROR #0xb
00ae05fc	and x13,x13,#0xf
00ae0600	ldr w8,[x30, x25#0x0]
00ae0604	add w20,w20,w23
00ae0608	eor w23,w0,w19
00ae060c	eor w29,w29,w4, ROR #0x19
00ae0610	lsl x13,x13,#0x2
00ae0614	and w24,w0,w19
00ae0618	and w23,w23,w7
00ae061c	add w29,w20,w29
00ae0620	ror w20,w0,#0x2
00ae0624	eor w23,w23,w24
00ae0628	ldr w24,[x30, x13#0x0]
00ae062c	eor w20,w20,w0, ROR #0xd
00ae0630	eor w20,w20,w0, ROR #0x16
00ae0634	add w23,w20,w23
00ae0638	ror w20,w8,#0x12
00ae063c	eor w20,w20,w8, LSR #0x3
00ae0640	eor w8,w20,w8, ROR #0x7
00ae0644	ror w20,w24,#0x13
00ae0648	eor w20,w20,w24, LSR #0xa
00ae064c	eor w24,w20,w24, ROR #0x11
00ae0650	add w8,w9,w8
00ae0654	add w2,w21,#0xe
00ae0658	add w14,w21,#0x9
00ae065c	mov w28,#0xb
00ae0660	add w8,w8,w24
00ae0664	and x2,x2,#0x8
00ae0668	and x14,x14,x28
00ae066c	orr w9,w12,#0x3
00ae0670	str w8,[x30, x5#0x0]
00ae0674	add w8,w29,w8
00ae0678	lsl x11,x2,#0x2
00ae067c	add w6,w8,w6
00ae0680	add w2,w23,w8
00ae0684	ldr w8,[x30, w9, UXTW #0x2]
00ae0688	ldr w9,[x30, x14, LSL #0x2]
00ae068c	ldr w14,[x30, x25#0x0]
00ae0690	add w27,w27,w22
00ae0694	and w23,w6,w4
00ae0698	bic w22,w22,w6
00ae069c	eor w29,w23,w22
00ae06a0	eor w22,w2,w0
00ae06a4	add w9,w14,w9
00ae06a8	ror w14,w2,#0x2
00ae06ac	and w24,w2,w0
00ae06b0	and w22,w22,w19
00ae06b4	ldr w23,[x30, x11#0x0]
00ae06b8	eor w14,w14,w2, ROR #0xd
00ae06bc	eor w22,w22,w24
00ae06c0	eor w14,w14,w2, ROR #0x16
00ae06c4	add w14,w14,w22
00ae06c8	ror w22,w8,#0x12
00ae06cc	eor w22,w22,w8, LSR #0x3
00ae06d0	eor w8,w22,w8, ROR #0x7
00ae06d4	ror w22,w23,#0x13
00ae06d8	eor w22,w22,w23, LSR #0xa
00ae06dc	eor w24,w22,w23, ROR #0x11
00ae06e0	add w8,w9,w8
00ae06e4	add w15,w21,#0x2
00ae06e8	add w8,w8,w24
00ae06ec	str w8,[x30, x25#0x0]
00ae06f0	and x25,x15,#0xc
00ae06f4	ldp x10,x15,[sp, #0x58]
00ae06f8	add w8,w26,w8
00ae06fc	ror w26,w6,#0x6
00ae0700	ldp w9,w24,[x3, #-0xc]
00ae0704	and x28,x15,x28
00ae0708	eor w26,w26,w6, ROR #0xb
00ae070c	and x10,x10,#0xc
00ae0710	lsl x28,x28,#0x2
00ae0714	eor w26,w26,w6, ROR #0x19
00ae0718	add w8,w8,w29
00ae071c	lsl x25,x25,#0x2
00ae0720	ldr w10,[x30, x10, LSL #0x2]
00ae0724	add w8,w8,w26
00ae0728	ldr w26,[x30, x28#0x0]
00ae072c	ldr w29,[x30, x25#0x0]
00ae0730	add w7,w8,w7
00ae0734	add w9,w9,w4
00ae0738	add w14,w14,w8
00ae073c	and w8,w7,w6
00ae0740	bic w4,w4,w7
00ae0744	ldr w5,[x30, x5#0x0]
00ae0748	eor w8,w8,w4
00ae074c	eor w4,w14,w2
00ae0750	add w10,w26,w10
00ae0754	and w26,w14,w2
00ae0758	and w4,w4,w0
00ae075c	eor w4,w4,w26
00ae0760	ror w26,w29,#0x12
00ae0764	eor w26,w26,w29, LSR #0x3
00ae0768	eor w26,w26,w29, ROR #0x7
00ae076c	ror w29,w5,#0x13
00ae0770	eor w29,w29,w5, LSR #0xa
00ae0774	ldr x15,[sp, #0x50]
00ae0778	eor w5,w29,w5, ROR #0x11
00ae077c	add w10,w10,w26
00ae0780	add w10,w10,w5
00ae0784	str w10,[x30, x28#0x0]
00ae0788	mov w5,#0xa
00ae078c	add w10,w27,w10
00ae0790	and x5,x15,x5
00ae0794	ldr x15,[sp, #0x48]
00ae0798	add w8,w10,w8
00ae079c	ror w10,w7,#0x6
00ae07a0	ror w29,w14,#0x2
00ae07a4	eor w10,w10,w7, ROR #0xb
00ae07a8	eor w29,w29,w14, ROR #0xd
00ae07ac	mov w26,#0x5
00ae07b0	eor w10,w10,w7, ROR #0x19
00ae07b4	eor w29,w29,w14, ROR #0x16
00ae07b8	mov w28,#0xd
00ae07bc	orr w26,w12,w26
00ae07c0	add w8,w8,w10
00ae07c4	add w4,w29,w4
00ae07c8	and x15,x15,x28
00ae07cc	ldr w26,[x30, w26, UXTW #0x2]
00ae07d0	add w19,w8,w19
00ae07d4	ldr w27,[x30, x15, LSL #0x2]
00ae07d8	add w15,w4,w8
00ae07dc	and w8,w19,w7
00ae07e0	bic w4,w6,w19
00ae07e4	ldr w5,[x30, x5, LSL #0x2]
00ae07e8	ldr w10,[x30, x25#0x0]
00ae07ec	eor w8,w8,w4
00ae07f0	eor w4,w15,w14
00ae07f4	add w24,w24,w6
00ae07f8	and w6,w15,w14
00ae07fc	and w4,w4,w2
00ae0800	eor w4,w4,w6
00ae0804	ror w6,w26,#0x12
00ae0808	eor w6,w6,w26, LSR #0x3
00ae080c	add w10,w10,w27
00ae0810	eor w6,w6,w26, ROR #0x7
00ae0814	ror w26,w5,#0x13
00ae0818	eor w26,w26,w5, LSR #0xa
00ae081c	add w10,w10,w6
00ae0820	ldr x6,[sp, #0x40]
00ae0824	eor w5,w26,w5, ROR #0x11
00ae0828	add w10,w10,w5
00ae082c	str w10,[x30, x25#0x0]
00ae0830	ldur w5,[x3, #-0x4]
00ae0834	add w9,w9,w10
00ae0838	ror w10,w19,#0x6
00ae083c	add w1,w21,#0x4
00ae0840	ror w26,w15,#0x2
00ae0844	and x6,x6,x28
00ae0848	eor w10,w10,w19, ROR #0xb
00ae084c	eor w26,w26,w15, ROR #0xd
00ae0850	and x1,x1,#0xe
00ae0854	lsl x6,x6,#0x2
00ae0858	eor w10,w10,w19, ROR #0x19
00ae085c	add w8,w9,w8
00ae0860	eor w26,w26,w15, ROR #0x16
00ae0864	lsl x1,x1,#0x2
00ae0868	ldr w17,[x30, x17#0x0]
00ae086c	add w8,w8,w10
00ae0870	ldr w10,[x30, x6#0x0]
00ae0874	add w18,w21,#0x11
00ae0878	mov w27,#0xb
00ae087c	add w4,w26,w4
00ae0880	add w25,w5,w7
00ae0884	ldr w9,[x30, x1#0x0]
00ae0888	add w5,w8,w0
00ae088c	and x18,x18,x27
00ae0890	add w4,w4,w8
00ae0894	and w8,w5,w19
00ae0898	bic w0,w7,w5
00ae089c	ldr w18,[x30, x18, LSL #0x2]
00ae08a0	eor w8,w8,w0
00ae08a4	eor w0,w4,w15
00ae08a8	add w10,w10,w17
00ae08ac	and w17,w4,w15
00ae08b0	and w0,w0,w14
00ae08b4	eor w17,w0,w17
00ae08b8	ror w0,w9,#0x12
00ae08bc	eor w0,w0,w9, LSR #0x3
00ae08c0	eor w9,w0,w9, ROR #0x7
00ae08c4	ror w0,w18,#0x13
00ae08c8	eor w0,w0,w18, LSR #0xa
00ae08cc	eor w18,w0,w18, ROR #0x11
00ae08d0	ror w0,w4,#0x2
00ae08d4	eor w0,w0,w4, ROR #0xd
00ae08d8	eor w0,w0,w4, ROR #0x16
00ae08dc	add w9,w10,w9
00ae08e0	add w17,w0,w17
00ae08e4	add w9,w9,w18
00ae08e8	ror w0,w5,#0x6
00ae08ec	orr w12,w12,#0x7
00ae08f0	str w9,[x30, x6#0x0]
00ae08f4	eor w0,w0,w5, ROR #0xb
00ae08f8	add w9,w24,w9
00ae08fc	add w20,w21,#0x12
00ae0900	eor w0,w0,w5, ROR #0x19
00ae0904	add w8,w9,w8
00ae0908	ldr w9,[x30, w12, UXTW #0x2]
00ae090c	and x18,x20,#0xc
00ae0910	add w8,w8,w0
00ae0914	ldr w12,[x30, x18, LSL #0x2]
00ae0918	add w20,w8,w2
00ae091c	ldr w13,[x30, x13#0x0]
00ae0920	ldr w18,[x30, x1#0x0]
00ae0924	add w6,w17,w8
00ae0928	and w8,w20,w5
00ae092c	bic w17,w19,w20
00ae0930	eor w8,w8,w17
00ae0934	ror w17,w9,#0x12
00ae0938	eor w17,w17,w9, LSR #0x3
00ae093c	ldr w10,[x3], #0x20
00ae0940	eor w9,w17,w9, ROR #0x7
00ae0944	ror w17,w12,#0x13
00ae0948	ror w0,w6,#0x2
00ae094c	add w13,w18,w13
00ae0950	eor w18,w6,w4
00ae0954	eor w17,w17,w12, LSR #0xa
00ae0958	add w22,w21,#0x5
00ae095c	and w2,w6,w4
00ae0960	eor w0,w0,w6, ROR #0xd
00ae0964	eor w12,w17,w12, ROR #0x11
00ae0968	and w17,w18,w15
00ae096c	add w9,w13,w9
00ae0970	add x23,x21,#0x6
00ae0974	add w21,w21,#0x13
00ae0978	eor w0,w0,w6, ROR #0x16
00ae097c	eor w17,w17,w2
00ae0980	and x7,x22,#0xf
00ae0984	add w9,w9,w12
00ae0988	add w10,w10,w19
00ae098c	add w17,w0,w17
00ae0990	and x13,x23,#0x8
00ae0994	and x0,x21,x28
00ae0998	lsl x19,x7,#0x2
00ae099c	ror w12,w20,#0x6
00ae09a0	str w9,[x30, x1#0x0]
00ae09a4	add w9,w25,w9
00ae09a8	eor w12,w12,w20, ROR #0xb
00ae09ac	add w8,w9,w8
00ae09b0	ldr w9,[x30, x13, LSL #0x2]
00ae09b4	ldr w13,[x30, x0, LSL #0x2]
00ae09b8	ldr w11,[x30, x11#0x0]
00ae09bc	ldr w0,[x30, x19#0x0]
00ae09c0	eor w12,w12,w20, ROR #0x19
00ae09c4	add w8,w8,w12
00ae09c8	cmp x23,#0x40
00ae09cc	add w23,w8,w14
00ae09d0	and w12,w23,w20
00ae09d4	bic w14,w5,w23
00ae09d8	add w11,w0,w11
00ae09dc	ror w0,w9,#0x12
00ae09e0	eor w12,w12,w14
00ae09e4	ror w14,w13,#0x13
00ae09e8	eor w0,w0,w9, LSR #0x3
00ae09ec	eor w14,w14,w13, LSR #0xa
00ae09f0	eor w9,w0,w9, ROR #0x7
00ae09f4	add w7,w17,w8
00ae09f8	eor w13,w14,w13, ROR #0x11
00ae09fc	add w9,w11,w9
00ae0a00	ror w8,w23,#0x6
00ae0a04	ror w17,w7,#0x2
00ae0a08	add w9,w9,w13
00ae0a0c	and w18,w7,w18
00ae0a10	eor w8,w8,w23, ROR #0xb
00ae0a14	eor w17,w17,w7, ROR #0xd
00ae0a18	str w9,[x30, x19#0x0]
00ae0a1c	add w9,w10,w9
00ae0a20	eor w18,w18,w2
00ae0a24	eor w8,w8,w23, ROR #0x19
00ae0a28	eor w17,w17,w7, ROR #0x16
00ae0a2c	add w9,w9,w12
00ae0a30	add w14,w17,w18
00ae0a34	add w8,w9,w8
00ae0a38	mov w26,#0x9
00ae0a3c	add w22,w8,w15
00ae0a40	add w19,w14,w8
00ae0a44	mov x21,x16
00ae0a48	b.cc 0x00ae04bc
00ae0a4c	ldp w0,w8,[sp, #0x28]
00ae0a50	ldp w16,w18,[sp, #0x20]
00ae0a54	ldp x3,x2,[sp, #0x30]
00ae0a58	add w8,w19,w8
00ae0a5c	add w18,w6,w18
00ae0a60	add w16,w4,w16
00ae0a64	ldp w1,w4,[sp, #0x18]
00ae0a68	ldp w17,w6,[sp, #0x10]
00ae0a6c	mov w19,w8
00ae0a70	ldr x8,[sp, #0x8]
00ae0a74	subs x2,x2,#0x1
00ae0a78	add x3,x3,#0x40
00ae0a7c	add w0,w7,w0
00ae0a80	add w4,w22,w4
00ae0a84	add w1,w23,w1
00ae0a88	add w6,w20,w6
00ae0a8c	add w17,w5,w17
00ae0a90	stp w19,w0,[x8]
00ae0a94	stp w18,w16,[x8, #0x8]
00ae0a98	stp w4,w1,[x8, #0x10]
00ae0a9c	stp w6,w17,[x8, #0x18]
00ae0aa0	b.ne 0x00adfe48
00ae0aa4	ldp x29,x30,[sp, #0x110]
00ae0aa8	ldp x20,x19,[sp, #0x100]
00ae0aac	ldp x22,x21,[sp, #0xf0]
00ae0ab0	ldp x24,x23,[sp, #0xe0]
00ae0ab4	ldp x26,x25,[sp, #0xd0]
00ae0ab8	ldp x28,x27,[sp, #0xc0]
00ae0abc	add sp,sp,#0x120
00ae0ac0	ret
