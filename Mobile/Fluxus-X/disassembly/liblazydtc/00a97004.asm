; IDEA_set_encrypt_key @ 00a97004
00a97004	ldrb w8,[x0]
00a97008	lsl w9,w8,#0x8
00a9700c	str w9,[x1]
00a97010	ldrb w9,[x0, #0x1]
00a97014	bfm w9,w8,#0x18,#0x7
00a97018	str w9,[x1]
00a9701c	ldrb w8,[x0, #0x2]
00a97020	lsl w9,w8,#0x8
00a97024	str w9,[x1, #0x4]
00a97028	ldrb w9,[x0, #0x3]
00a9702c	bfm w9,w8,#0x18,#0x7
00a97030	str w9,[x1, #0x4]
00a97034	ldrb w8,[x0, #0x4]
00a97038	lsl w9,w8,#0x8
00a9703c	str w9,[x1, #0x8]
00a97040	ldrb w9,[x0, #0x5]
00a97044	bfm w9,w8,#0x18,#0x7
00a97048	str w9,[x1, #0x8]
00a9704c	ldrb w8,[x0, #0x6]
00a97050	lsl w9,w8,#0x8
00a97054	str w9,[x1, #0xc]
00a97058	ldrb w9,[x0, #0x7]
00a9705c	bfm w9,w8,#0x18,#0x7
00a97060	str w9,[x1, #0xc]
00a97064	ldrb w8,[x0, #0x8]
00a97068	lsl w9,w8,#0x8
00a9706c	str w9,[x1, #0x10]
00a97070	ldrb w9,[x0, #0x9]
00a97074	bfm w9,w8,#0x18,#0x7
00a97078	str w9,[x1, #0x10]
00a9707c	ldrb w8,[x0, #0xa]
00a97080	lsl w9,w8,#0x8
00a97084	str w9,[x1, #0x14]
00a97088	ldrb w9,[x0, #0xb]
00a9708c	bfm w9,w8,#0x18,#0x7
00a97090	str w9,[x1, #0x14]
00a97094	ldrb w8,[x0, #0xc]
00a97098	lsl w9,w8,#0x8
00a9709c	str w9,[x1, #0x18]
00a970a0	ldrb w9,[x0, #0xd]
00a970a4	bfm w9,w8,#0x18,#0x7
00a970a8	str w9,[x1, #0x18]
00a970ac	ldrb w8,[x0, #0xe]
00a970b0	lsl w9,w8,#0x8
00a970b4	str w9,[x1, #0x1c]
00a970b8	ldrb w9,[x0, #0xf]
00a970bc	bfm w9,w8,#0x18,#0x7
00a970c0	mov w8,#0x20
00a970c4	str w9,[x1, #0x1c]
00a970c8	b 0x00a970f0
00a970cc	ldur w12,[x9, #-0x20]
00a970d0	add x8,x8,#0x20
00a970d4	lsr w13,w12,#0x7
00a970d8	lsl w12,w12,#0x9
00a970dc	orr w11,w13,w11, LSL #0x9
00a970e0	orr w10,w12,w10, LSR #0x7
00a970e4	and w11,w11,#0xffff
00a970e8	and w10,w10,#0xffff
00a970ec	stp w11,w10,[x9, #0x18]
00a970f0	add x9,x1,x8
00a970f4	ldp w14,w11,[x9, #-0x8]
00a970f8	ldp w16,w13,[x9, #-0x10]
00a970fc	ldur w15,[x9, #-0x14]
00a97100	ldp w10,w12,[x9, #-0x1c]
00a97104	lsr w17,w11,#0x7
00a97108	orr w17,w17,w14, LSL #0x9
00a9710c	lsr w14,w14,#0x7
00a97110	orr w14,w14,w13, LSL #0x9
00a97114	lsr w13,w13,#0x7
00a97118	orr w13,w13,w16, LSL #0x9
00a9711c	lsr w16,w16,#0x7
00a97120	orr w16,w16,w15, LSL #0x9
00a97124	lsr w15,w15,#0x7
00a97128	orr w15,w15,w12, LSL #0x9
00a9712c	lsr w12,w12,#0x7
00a97130	orr w12,w12,w10, LSL #0x9
00a97134	and w12,w12,#0xffff
00a97138	and w15,w15,#0xffff
00a9713c	stp w12,w15,[x9]
00a97140	and w12,w16,#0xffff
00a97144	and w13,w13,#0xffff
00a97148	stp w12,w13,[x9, #0x8]
00a9714c	cmp w8,#0xc0
00a97150	and w12,w14,#0xffff
00a97154	and w13,w17,#0xffff
00a97158	stp w12,w13,[x9, #0x10]
00a9715c	b.ne 0x00a970cc
00a97160	ret
