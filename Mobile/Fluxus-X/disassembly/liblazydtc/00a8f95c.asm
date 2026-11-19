; Camellia_DecryptBlock_Rounds @ 00a8f95c
00a8f95c	lsl w8,w0,#0x4
00a8f960	ldp w9,w10,[x1]
00a8f964	mov w13,#0x10
00a8f968	add x17,x2,w8, SXTW  #0x2
00a8f96c	sub x8,x13,w8, SXTW 
00a8f970	ldp w13,w15,[x17]
00a8f974	ldp w11,w12,[x1, #0x8]
00a8f978	rev w9,w9
00a8f97c	rev w10,w10
00a8f980	eor w14,w9,w13
00a8f984	eor w15,w10,w15
00a8f988	ldp w9,w10,[x17, #0x8]
00a8f98c	rev w11,w11
00a8f990	eor w16,w11,w9
00a8f994	rev w11,w12
00a8f998	sub x9,x17,#0x20
00a8f99c	eor w17,w11,w10
00a8f9a0	adrp x10,0x76b000
00a8f9a4	add x10,x10,#0x5a0
00a8f9a8	b 0x00a8f9e0
00a8f9ac	ldp w15,w13,[x9, #-0x1c]
00a8f9b0	ldur w18,[x9, #-0x20]
00a8f9b4	ldur w0,[x9, #-0x14]
00a8f9b8	add x8,x8,#0x10
00a8f9bc	and w13,w13,w11
00a8f9c0	orr w16,w15,w17
00a8f9c4	eor w15,w12,w13, ROR #0x1f
00a8f9c8	eor w16,w16,w14
00a8f9cc	orr w12,w15,w0
00a8f9d0	and w13,w16,w18
00a8f9d4	eor w14,w12,w11
00a8f9d8	eor w17,w17,w13, ROR #0x1f
00a8f9dc	sub x9,x9,#0x40
00a8f9e0	ldp w18,w0,[x9, #0x18]
00a8f9e4	add x12,x10,#0x400
00a8f9e8	add x11,x10,#0xc00
00a8f9ec	add x13,x10,#0x800
00a8f9f0	eor w18,w18,w14
00a8f9f4	and w1,w18,#0xff
00a8f9f8	ubfx w4,w18,#0x8,#0x8
00a8f9fc	ldr w1,[x12, w1, UXTW #0x2]
00a8fa00	ldr w4,[x11, w4, UXTW #0x2]
00a8fa04	ubfx w6,w18,#0x10,#0x8
00a8fa08	ldr w6,[x13, w6, UXTW #0x2]
00a8fa0c	lsr w18,w18,#0x18
00a8fa10	ldr w18,[x10, w18, UXTW #0x2]
00a8fa14	eor w0,w0,w15
00a8fa18	and w5,w0,#0xff
00a8fa1c	eor w1,w4,w1
00a8fa20	ubfx w4,w0,#0x8,#0x8
00a8fa24	ldr w5,[x10, w5, UXTW #0x2]
00a8fa28	ldr w4,[x12, w4, UXTW #0x2]
00a8fa2c	eor w1,w1,w6
00a8fa30	eor w18,w1,w18
00a8fa34	ubfx w1,w0,#0x10,#0x8
00a8fa38	lsr w0,w0,#0x18
00a8fa3c	ldr w1,[x11, w1, UXTW #0x2]
00a8fa40	ldr w0,[x13, w0, UXTW #0x2]
00a8fa44	eor w4,w4,w5
00a8fa48	ldp w5,w6,[x9, #0x10]
00a8fa4c	eor w4,w4,w18
00a8fa50	eor w17,w17,w18, ROR #0x8
00a8fa54	eor w18,w4,w1
00a8fa58	eor w18,w18,w0
00a8fa5c	eor w16,w18,w16
00a8fa60	eor w17,w17,w18
00a8fa64	eor w18,w16,w5
00a8fa68	and w0,w18,#0xff
00a8fa6c	ubfx w1,w18,#0x8,#0x8
00a8fa70	ldr w0,[x12, w0, UXTW #0x2]
00a8fa74	ldr w1,[x11, w1, UXTW #0x2]
00a8fa78	eor w4,w17,w6
00a8fa7c	ubfx w6,w18,#0x10,#0x8
00a8fa80	ldr w6,[x13, w6, UXTW #0x2]
00a8fa84	lsr w18,w18,#0x18
00a8fa88	ldr w18,[x10, w18, UXTW #0x2]
00a8fa8c	and w5,w4,#0xff
00a8fa90	eor w0,w1,w0
00a8fa94	ubfx w1,w4,#0x8,#0x8
00a8fa98	ldr w5,[x10, w5, UXTW #0x2]
00a8fa9c	ldr w1,[x12, w1, UXTW #0x2]
00a8faa0	eor w0,w0,w6
00a8faa4	eor w18,w0,w18
00a8faa8	ubfx w0,w4,#0x10,#0x8
00a8faac	lsr w4,w4,#0x18
00a8fab0	ldr w0,[x11, w0, UXTW #0x2]
00a8fab4	ldr w4,[x13, w4, UXTW #0x2]
00a8fab8	eor w1,w1,w5
00a8fabc	ldp w5,w6,[x9, #0x8]
00a8fac0	eor w1,w1,w18
00a8fac4	eor w15,w15,w18, ROR #0x8
00a8fac8	eor w18,w1,w0
00a8facc	eor w18,w18,w4
00a8fad0	eor w14,w18,w14
00a8fad4	eor w15,w15,w18
00a8fad8	eor w18,w14,w5
00a8fadc	and w0,w18,#0xff
00a8fae0	ubfx w1,w18,#0x8,#0x8
00a8fae4	ldr w0,[x12, w0, UXTW #0x2]
00a8fae8	ldr w1,[x11, w1, UXTW #0x2]
00a8faec	eor w4,w15,w6
00a8faf0	ubfx w6,w18,#0x10,#0x8
00a8faf4	ldr w6,[x13, w6, UXTW #0x2]
00a8faf8	lsr w18,w18,#0x18
00a8fafc	ldr w18,[x10, w18, UXTW #0x2]
00a8fb00	and w5,w4,#0xff
00a8fb04	eor w0,w1,w0
00a8fb08	ubfx w1,w4,#0x8,#0x8
00a8fb0c	ldr w5,[x10, w5, UXTW #0x2]
00a8fb10	ldr w1,[x12, w1, UXTW #0x2]
00a8fb14	eor w0,w0,w6
00a8fb18	eor w18,w0,w18
00a8fb1c	ubfx w0,w4,#0x10,#0x8
00a8fb20	lsr w4,w4,#0x18
00a8fb24	ldr w0,[x11, w0, UXTW #0x2]
00a8fb28	ldr w4,[x13, w4, UXTW #0x2]
00a8fb2c	eor w1,w1,w5
00a8fb30	ldp w5,w6,[x9]
00a8fb34	eor w1,w1,w18
00a8fb38	eor w17,w17,w18, ROR #0x8
00a8fb3c	eor w18,w1,w0
00a8fb40	eor w18,w18,w4
00a8fb44	eor w16,w18,w16
00a8fb48	eor w17,w17,w18
00a8fb4c	eor w18,w16,w5
00a8fb50	and w0,w18,#0xff
00a8fb54	ubfx w1,w18,#0x8,#0x8
00a8fb58	ldr w0,[x12, w0, UXTW #0x2]
00a8fb5c	ldr w1,[x11, w1, UXTW #0x2]
00a8fb60	eor w4,w17,w6
00a8fb64	ubfx w6,w18,#0x10,#0x8
00a8fb68	ldr w6,[x13, w6, UXTW #0x2]
00a8fb6c	lsr w18,w18,#0x18
00a8fb70	ldr w18,[x10, w18, UXTW #0x2]
00a8fb74	and w5,w4,#0xff
00a8fb78	eor w0,w1,w0
00a8fb7c	ubfx w1,w4,#0x8,#0x8
00a8fb80	ldr w5,[x10, w5, UXTW #0x2]
00a8fb84	ldr w1,[x12, w1, UXTW #0x2]
00a8fb88	eor w0,w0,w6
00a8fb8c	eor w18,w0,w18
00a8fb90	ubfx w0,w4,#0x10,#0x8
00a8fb94	lsr w4,w4,#0x18
00a8fb98	ldr w0,[x11, w0, UXTW #0x2]
00a8fb9c	ldr w4,[x13, w4, UXTW #0x2]
00a8fba0	eor w1,w1,w5
00a8fba4	ldp w5,w6,[x9, #-0x8]
00a8fba8	eor w1,w1,w18
00a8fbac	eor w15,w15,w18, ROR #0x8
00a8fbb0	eor w18,w1,w0
00a8fbb4	eor w18,w18,w4
00a8fbb8	eor w0,w18,w14
00a8fbbc	eor w14,w0,w5
00a8fbc0	eor w15,w15,w18
00a8fbc4	and w18,w14,#0xff
00a8fbc8	ubfx w1,w14,#0x8,#0x8
00a8fbcc	ldr w18,[x12, w18, UXTW #0x2]
00a8fbd0	ldr w1,[x11, w1, UXTW #0x2]
00a8fbd4	eor w4,w15,w6
00a8fbd8	ubfx w6,w14,#0x10,#0x8
00a8fbdc	ldr w6,[x13, w6, UXTW #0x2]
00a8fbe0	lsr w14,w14,#0x18
00a8fbe4	ldr w14,[x10, w14, UXTW #0x2]
00a8fbe8	and w5,w4,#0xff
00a8fbec	eor w18,w1,w18
00a8fbf0	ubfx w1,w4,#0x8,#0x8
00a8fbf4	ldr w5,[x10, w5, UXTW #0x2]
00a8fbf8	ldr w1,[x12, w1, UXTW #0x2]
00a8fbfc	eor w18,w18,w6
00a8fc00	eor w14,w18,w14
00a8fc04	ubfx w18,w4,#0x10,#0x8
00a8fc08	lsr w4,w4,#0x18
00a8fc0c	ldr w18,[x11, w18, UXTW #0x2]
00a8fc10	ldr w4,[x13, w4, UXTW #0x2]
00a8fc14	eor w1,w1,w5
00a8fc18	ldp w5,w6,[x9, #-0x10]
00a8fc1c	eor w1,w1,w14
00a8fc20	eor w17,w17,w14, ROR #0x8
00a8fc24	eor w14,w1,w18
00a8fc28	eor w18,w14,w4
00a8fc2c	eor w14,w18,w16
00a8fc30	eor w17,w17,w18
00a8fc34	eor w16,w14,w5
00a8fc38	eor w18,w17,w6
00a8fc3c	and w1,w16,#0xff
00a8fc40	ubfx w6,w18,#0x8,#0x8
00a8fc44	ubfx w4,w16,#0x8,#0x8
00a8fc48	ldr w1,[x12, w1, UXTW #0x2]
00a8fc4c	ldr w12,[x12, w6, UXTW #0x2]
00a8fc50	ubfx w6,w18,#0x10,#0x8
00a8fc54	ubfx w5,w16,#0x10,#0x8
00a8fc58	ldr w4,[x11, w4, UXTW #0x2]
00a8fc5c	ldr w11,[x11, w6, UXTW #0x2]
00a8fc60	lsr w6,w18,#0x18
00a8fc64	and w18,w18,#0xff
00a8fc68	ldr w5,[x13, w5, UXTW #0x2]
00a8fc6c	ldr w18,[x10, w18, UXTW #0x2]
00a8fc70	lsr w16,w16,#0x18
00a8fc74	ldr w16,[x10, w16, UXTW #0x2]
00a8fc78	eor w1,w4,w1
00a8fc7c	ldr w13,[x13, w6, UXTW #0x2]
00a8fc80	eor w12,w12,w18
00a8fc84	eor w18,w1,w5
00a8fc88	eor w16,w18,w16
00a8fc8c	eor w12,w12,w16
00a8fc90	eor w11,w12,w11
00a8fc94	eor w15,w15,w16, ROR #0x8
00a8fc98	eor w12,w11,w13
00a8fc9c	eor w11,w12,w0
00a8fca0	eor w12,w15,w12
00a8fca4	cbnz x8,0x00a8f9ac
00a8fca8	ldp w8,w9,[x2]
00a8fcac	ldp w10,w13,[x2, #0x8]
00a8fcb0	eor w8,w8,w14
00a8fcb4	eor w9,w9,w17
00a8fcb8	eor w10,w10,w11
00a8fcbc	eor w11,w13,w12
00a8fcc0	lsr w12,w8,#0x18
00a8fcc4	lsr w13,w8,#0x10
00a8fcc8	strb w8,[x3, #0x3]
00a8fccc	lsr w8,w8,#0x8
00a8fcd0	strb w12,[x3]
00a8fcd4	lsr w12,w9,#0x18
00a8fcd8	strb w13,[x3, #0x1]
00a8fcdc	lsr w13,w9,#0x10
00a8fce0	strb w9,[x3, #0x7]
00a8fce4	lsr w9,w9,#0x8
00a8fce8	strb w8,[x3, #0x2]
00a8fcec	lsr w8,w10,#0x18
00a8fcf0	strb w12,[x3, #0x4]
00a8fcf4	lsr w12,w10,#0x10
00a8fcf8	strb w10,[x3, #0xb]
00a8fcfc	lsr w10,w10,#0x8
00a8fd00	strb w13,[x3, #0x5]
00a8fd04	lsr w13,w11,#0x18
00a8fd08	strb w9,[x3, #0x6]
00a8fd0c	lsr w9,w11,#0x10
00a8fd10	strb w8,[x3, #0x8]
00a8fd14	lsr w8,w11,#0x8
00a8fd18	strb w12,[x3, #0x9]
00a8fd1c	strb w10,[x3, #0xa]
00a8fd20	strb w13,[x3, #0xc]
00a8fd24	strb w9,[x3, #0xd]
00a8fd28	strb w8,[x3, #0xe]
00a8fd2c	strb w11,[x3, #0xf]
00a8fd30	ret
