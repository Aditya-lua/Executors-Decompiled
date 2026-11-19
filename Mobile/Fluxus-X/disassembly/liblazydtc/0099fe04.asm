; WebSocketHandshakeKeyGen::sha1 @ 0099fe04
0099fe04	sub sp,sp,#0x50
0099fe08	str x21,[sp, #0x20]
0099fe0c	stp x20,x19,[sp, #0x30]
0099fe10	stp x29,x30,[sp, #0x40]
0099fe14	add x29,sp,#0x40
0099fe18	mrs x21,tpidr_el0
0099fe1c	ldr x8,[x21, #0x28]
0099fe20	mov x20,x1
0099fe24	mov x19,x0
0099fe28	add x1,sp,#0x4
0099fe2c	str x8,[sp, #0x18]
0099fe30	ldr w8,[x0, #0x10]
0099fe34	mov x2,x20
0099fe38	str w8,[sp, #0x4]
0099fe3c	ldr w8,[x0, #0xc]
0099fe40	str w8,[sp, #0x8]
0099fe44	ldr w8,[x0, #0x8]
0099fe48	str w8,[sp, #0xc]
0099fe4c	ldr w8,[x0, #0x4]
0099fe50	str w8,[sp, #0x10]
0099fe54	ldr w8,[x0]
0099fe58	mov x0,sp
0099fe5c	str w8,[sp, #0x14]
0099fe60	bl 0x00c33a70
0099fe64	ldp w9,w10,[sp, #0xc]
0099fe68	ldp w14,w11,[sp, #0x4]
0099fe6c	ldr w12,[x20, #0x3c]
0099fe70	ldur d0,[x20, #0x34]
0099fe74	ldr d1,[x20, #0x20]
0099fe78	ldr w13,[sp, #0x14]
0099fe7c	eor w15,w11,w9
0099fe80	ldp d2,d3,[x20]
0099fe84	and w15,w15,w10
0099fe88	ror w10,w10,#0x2
0099fe8c	eor w15,w15,w11
0099fe90	eor v0.8B,v1.8B,v0.8B
0099fe94	add w15,w12,w15
0099fe98	fmov s1,w12
0099fe9c	eor w12,w10,w9
0099fea0	and w12,w13,w12
0099fea4	mov w8,#0x7999
0099fea8	ror w16,w13,#0x1b
0099feac	eor v0.8B,v0.8B,v3.8B
0099feb0	add w14,w15,w14
0099feb4	eor w12,w12,w9
0099feb8	movk w8,#0x5a82, LSL #16
0099febc	ror w13,w13,#0x2
0099fec0	eor v0.8B,v0.8B,v2.8B
0099fec4	add w11,w11,w12
0099fec8	add w12,w14,w16
0099fecc	eor w15,w13,w10
0099fed0	shl v2.2S,v0.2S,0x1
0099fed4	ushr v0.2S,v0.2S,#0x1f
0099fed8	add w12,w12,w8
0099fedc	orr v0.8B,v0.8B,v2.8B
0099fee0	ror w16,w12,#0x1b
0099fee4	and w15,w12,w15
0099fee8	ror w12,w12,#0x2
0099feec	str d0,[x20]
0099fef0	zip1 v1.2S,v1.2S,v0.2S
0099fef4	str w12,[sp, #0x4]
0099fef8	mov w14,v0.S[0x1]
0099fefc	add w11,w11,w16
0099ff00	fmov w16,s0
0099ff04	eor v0.8B,v3.8B,v1.8B
0099ff08	ldr d1,[x20, #0x28]
0099ff0c	add w11,w11,w16
0099ff10	ldr d2,[x20, #0x10]
0099ff14	eor w15,w15,w10
0099ff18	add w11,w11,w8
0099ff1c	add w9,w9,w15
0099ff20	ror w15,w11,#0x1b
0099ff24	eor w16,w12,w13
0099ff28	add w9,w9,w15
0099ff2c	eor v0.8B,v0.8B,v1.8B
0099ff30	and w16,w11,w16
0099ff34	ror w11,w11,#0x2
0099ff38	add w9,w9,w14
0099ff3c	eor v0.8B,v0.8B,v2.8B
0099ff40	eor w15,w16,w13
0099ff44	eor w16,w11,w12
0099ff48	add w9,w9,w8
0099ff4c	shl v1.2S,v0.2S,0x1
0099ff50	ushr v0.2S,v0.2S,#0x1f
0099ff54	add w10,w10,w15
0099ff58	and w15,w9,w16
0099ff5c	orr v0.8B,v0.8B,v1.8B
0099ff60	eor w12,w15,w12
0099ff64	fmov w15,s0
0099ff68	ror w14,w9,#0x1b
0099ff6c	add w10,w10,w15
0099ff70	add w10,w10,w14
0099ff74	ror w9,w9,#0x2
0099ff78	add w12,w13,w12
0099ff7c	mov w13,v0.S[0x1]
0099ff80	add w10,w10,w8
0099ff84	add w12,w12,w13
0099ff88	stp w9,w10,[sp, #0xc]
0099ff8c	ror w10,w10,#0x1b
0099ff90	add w10,w12,w10
0099ff94	add w8,w10,w8
0099ff98	mov x0,sp
0099ff9c	add x1,sp,#0x4
0099ffa0	mov x2,x20
0099ffa4	str w11,[sp, #0x8]
0099ffa8	str d0,[x20, #0x8]
0099ffac	str w8,[sp, #0x14]
0099ffb0	bl 0x00c33ab0
0099ffb4	ldr w8,[x20, #0x10]
0099ffb8	ldr w9,[x20, #0x3c]
0099ffbc	ldr w10,[x20, #0x24]
0099ffc0	ldr w11,[x20, #0x1c]
0099ffc4	mov x0,sp
0099ffc8	eor w8,w9,w8
0099ffcc	eor w8,w8,w10
0099ffd0	eor w8,w8,w11
0099ffd4	ror w8,w8,#0x1f
0099ffd8	str w8,[x20, #0x1c]
0099ffdc	ldp w10,w9,[sp, #0x8]
0099ffe0	ldr w11,[sp, #0x4]
0099ffe4	add x1,sp,#0x4
0099ffe8	mov x2,x20
0099ffec	eor w10,w10,w9
0099fff0	eor w10,w10,w11
0099fff4	ldp w12,w11,[sp, #0x10]
0099fff8	add w8,w8,w10
0099fffc	mov w10,#0xeba1
009a0000	movk w10,#0x6ed9, LSL #16
009a0004	ror w12,w12,#0x1b
009a0008	add w8,w8,w11
009a000c	add w8,w8,w12
009a0010	ror w9,w9,#0x2
009a0014	add w8,w8,w10
009a0018	str w8,[sp, #0x14]
009a001c	str w9,[sp, #0xc]
009a0020	bl 0x00c33ac0
009a0024	ldr w8,[x20, #0x20]
009a0028	ldr w9,[x20, #0xc]
009a002c	ldr w10,[x20, #0x34]
009a0030	ldr w11,[x20, #0x2c]
009a0034	mov x0,sp
009a0038	eor w8,w9,w8
009a003c	eor w8,w8,w10
009a0040	eor w8,w8,w11
009a0044	ror w8,w8,#0x1f
009a0048	str w8,[x20, #0x2c]
009a004c	ldp w10,w9,[sp, #0x8]
009a0050	ldr w11,[sp, #0x4]
009a0054	add x1,sp,#0x4
009a0058	mov x2,x20
009a005c	orr w12,w10,w9
009a0060	and w11,w12,w11
009a0064	and w10,w10,w9
009a0068	orr w10,w11,w10
009a006c	ldp w12,w11,[sp, #0x10]
009a0070	add w8,w8,w10
009a0074	mov w10,#0xbcdc
009a0078	movk w10,#0x8f1b, LSL #16
009a007c	ror w12,w12,#0x1b
009a0080	add w8,w8,w11
009a0084	add w8,w8,w12
009a0088	ror w9,w9,#0x2
009a008c	add w8,w8,w10
009a0090	str w8,[sp, #0x14]
009a0094	str w9,[sp, #0xc]
009a0098	bl 0x00c33ad0
009a009c	ldr w8,[x20, #0x30]
009a00a0	ldr w9,[x20, #0x1c]
009a00a4	ldr w10,[x20, #0x4]
009a00a8	ldr w11,[x20, #0x3c]
009a00ac	eor w8,w9,w8
009a00b0	eor w8,w8,w10
009a00b4	eor w8,w8,w11
009a00b8	ror w8,w8,#0x1f
009a00bc	str w8,[x20, #0x3c]
009a00c0	ldp w10,w9,[sp, #0x8]
009a00c4	ldp w13,w14,[x19, #0x8]
009a00c8	ldr w11,[sp, #0x4]
009a00cc	ldr w15,[x19, #0x10]
009a00d0	ldp w16,w17,[x19]
009a00d4	add w14,w14,w10
009a00d8	eor w10,w10,w9
009a00dc	add w15,w15,w11
009a00e0	eor w10,w10,w11
009a00e4	ldp w12,w11,[sp, #0x10]
009a00e8	add w8,w8,w10
009a00ec	ror w9,w9,#0x2
009a00f0	add w9,w13,w9
009a00f4	add w17,w17,w12
009a00f8	ror w12,w12,#0x1b
009a00fc	add w8,w8,w11
009a0100	mov w13,#0xc1d6
009a0104	add w8,w8,w12
009a0108	movk w13,#0xca62, LSL #16
009a010c	add w8,w16,w8
009a0110	add w8,w8,w13
009a0114	stp w14,w15,[x19, #0xc]
009a0118	stp w17,w9,[x19, #0x4]
009a011c	str w8,[x19]
009a0120	ldr x8,[x21, #0x28]
009a0124	ldr x9,[sp, #0x18]
009a0128	cmp x8,x9
009a012c	b.ne 0x009a0144
009a0130	ldp x29,x30,[sp, #0x40]
009a0134	ldp x20,x19,[sp, #0x30]
009a0138	ldr x21,[sp, #0x20]
009a013c	add sp,sp,#0x50
009a0140	ret
009a0144	bl 0x00c2fec0
