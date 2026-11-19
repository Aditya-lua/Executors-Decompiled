; FUN_00aaa048 @ 00aaa048
00aaa048	ldrb w9,[x0, #0xf]
00aaa04c	adrp x8,0x76e000
00aaa050	add x8,x8,#0x998
00aaa054	ldrb w10,[x2, #0xf]
00aaa058	eor w10,w10,w9
00aaa05c	and x9,x10,#0xf
00aaa060	add x11,x1,x9, LSL #0x4
00aaa064	ldp x9,x11,[x11]
00aaa068	and x12,x10,#0xff
00aaa06c	orr w10,wzr,#0xe
00aaa070	b 0x00aaa0ac
00aaa074	ldrb w12,[x0, x10]
00aaa078	ldrb w13,[x2, x10]
00aaa07c	and x14,x9,#0xf
00aaa080	extr x15,x11,x9,#0x4
00aaa084	ldr x9,[x8, x14, LSL #0x3]
00aaa088	eor w12,w13,w12
00aaa08c	and x13,x12,#0xf
00aaa090	add x13,x1,x13, LSL #0x4
00aaa094	ldp x14,x13,[x13]
00aaa098	eor x9,x9,x11, LSR #0x4
00aaa09c	and x12,x12,#0xff
00aaa0a0	sub x10,x10,#0x1
00aaa0a4	eor x9,x9,x14
00aaa0a8	eor x11,x13,x15
00aaa0ac	and x12,x12,#-0x10
00aaa0b0	and x13,x11,#0xf
00aaa0b4	extr x14,x9,x11,#0x4
00aaa0b8	ldr x11,[x8, x13, LSL #0x3]
00aaa0bc	add x12,x1,x12
00aaa0c0	ldp x13,x12,[x12]
00aaa0c4	cmn x10,#0x1
00aaa0c8	eor x9,x11,x9, LSR #0x4
00aaa0cc	eor x11,x9,x13
00aaa0d0	eor x9,x12,x14
00aaa0d4	b.ne 0x00aaa074
00aaa0d8	lsr x12,x11,#0x38
00aaa0dc	lsr x10,x11,#0x20
00aaa0e0	strb w12,[x0]
00aaa0e4	lsr x12,x11,#0x30
00aaa0e8	strb w12,[x0, #0x1]
00aaa0ec	lsr x12,x11,#0x28
00aaa0f0	strb w10,[x0, #0x3]
00aaa0f4	ubfx x10,x11,#0x10,#0x10
00aaa0f8	strb w12,[x0, #0x2]
00aaa0fc	ubfx x12,x11,#0x18,#0x8
00aaa100	strb w11,[x0, #0x7]
00aaa104	ubfx x11,x11,#0x8,#0x18
00aaa108	strb w10,[x0, #0x5]
00aaa10c	lsr x10,x9,#0x38
00aaa110	strb w12,[x0, #0x4]
00aaa114	lsr x12,x9,#0x20
00aaa118	strb w11,[x0, #0x6]
00aaa11c	lsr x11,x9,#0x30
00aaa120	strb w10,[x0, #0x8]
00aaa124	lsr x10,x9,#0x28
00aaa128	strb w11,[x0, #0x9]
00aaa12c	ubfx x11,x9,#0x18,#0x8
00aaa130	strb w10,[x0, #0xa]
00aaa134	ubfx x10,x9,#0x10,#0x10
00aaa138	strb w12,[x0, #0xb]
00aaa13c	ubfx x12,x9,#0x8,#0x18
00aaa140	subs x3,x3,#0x10
00aaa144	add x2,x2,#0x10
00aaa148	strb w9,[x0, #0xf]
00aaa14c	strb w11,[x0, #0xc]
00aaa150	strb w10,[x0, #0xd]
00aaa154	strb w12,[x0, #0xe]
00aaa158	b.ne 0x00aaa054
00aaa15c	ret
