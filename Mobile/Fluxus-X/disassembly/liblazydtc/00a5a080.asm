; FUN_00a5a080 @ 00a5a080
00a5a080	cbz x0,0x00a5a08c
00a5a084	ldrb w8,[x0, #0x5c]
00a5a088	tbnz w8,#0x1,0x00a5a0a0
00a5a08c	adrp x8,0x766000
00a5a090	add x8,x8,#0x154
00a5a094	cmp w3,#0x1
00a5a098	b.ge 0x00a5a0b0
00a5a09c	b 0x00a5a0d4
00a5a0a0	adrp x8,0x766000
00a5a0a4	add x8,x8,#0xd4
00a5a0a8	cmp w3,#0x1
00a5a0ac	b.lt 0x00a5a0d4
00a5a0b0	ldrsb w9,[x2]
00a5a0b4	tbnz w9,#0x1f,0x00a5a0d4
00a5a0b8	and x9,x9,#0xff
00a5a0bc	ldrb w9,[x8, x9]
00a5a0c0	cmp w9,#0xe0
00a5a0c4	b.ne 0x00a5a0d4
00a5a0c8	subs w3,w3,#0x1
00a5a0cc	add x2,x2,#0x1
00a5a0d0	b.gt 0x00a5a0b0
00a5a0d4	sxtw x11,w3
00a5a0d8	mov w10,#0x13
00a5a0dc	mov x9,x11
00a5a0e0	cmp x11,#0x4
00a5a0e4	b.lt 0x00a5a10c
00a5a0e8	add x11,x2,x9
00a5a0ec	ldursb w11,[x11, #-0x1]
00a5a0f0	tbnz w11,#0x1f,0x00a5a10c
00a5a0f4	and x11,x11,#0xff
00a5a0f8	ldrb w11,[x8, x11]
00a5a0fc	orr w11,w11,w10
00a5a100	cmp w11,#0xf3
00a5a104	sub x11,x9,#0x1
00a5a108	b.eq 0x00a5a0dc
00a5a10c	tst w9,#0x3
00a5a110	b.eq 0x00a5a11c
00a5a114	mov w0,#0xffffffff
00a5a118	ret
00a5a11c	cmp w9,#0x1
00a5a120	b.lt 0x00a5a1f0
00a5a124	mov x10,xzr
00a5a128	mov x0,xzr
00a5a12c	add x12,x2,x10
00a5a130	ldrsb w11,[x12]
00a5a134	tbnz w11,#0x1f,0x00a5a174
00a5a138	and x11,x11,#0xff
00a5a13c	ldrb w11,[x8, x11]
00a5a140	ldrsb w13,[x12, #0x1]
00a5a144	tbnz w13,#0x1f,0x00a5a180
00a5a148	and x13,x13,#0xff
00a5a14c	ldrb w13,[x8, x13]
00a5a150	ldrsb w14,[x12, #0x2]
00a5a154	tbnz w14,#0x1f,0x00a5a18c
00a5a158	and x14,x14,#0xff
00a5a15c	ldrb w14,[x8, x14]
00a5a160	ldrsb w12,[x12, #0x3]
00a5a164	tbnz w12,#0x1f,0x00a5a198
00a5a168	and x12,x12,#0xff
00a5a16c	ldrb w12,[x8, x12]
00a5a170	b 0x00a5a19c
00a5a174	orr w11,wzr,#0xff
00a5a178	ldrsb w13,[x12, #0x1]
00a5a17c	tbz w13,#0x1f,0x00a5a148
00a5a180	orr w13,wzr,#0xff
00a5a184	ldrsb w14,[x12, #0x2]
00a5a188	tbz w14,#0x1f,0x00a5a158
00a5a18c	orr w14,wzr,#0xff
00a5a190	ldrsb w12,[x12, #0x3]
00a5a194	tbz w12,#0x1f,0x00a5a168
00a5a198	orr w12,wzr,#0xff
00a5a19c	orr w15,w13,w11
00a5a1a0	orr w15,w15,w14
00a5a1a4	orr w15,w15,w12
00a5a1a8	sxtb w15,w15
00a5a1ac	tbnz w15,#0x1f,0x00a5a1f8
00a5a1b0	lsl w13,w13,#0xc
00a5a1b4	lsl w14,w14,#0x6
00a5a1b8	add x10,x10,#0x4
00a5a1bc	orr w11,w13,w11, LSL #0x12
00a5a1c0	orr w13,w14,w13
00a5a1c4	add x15,x1,x0
00a5a1c8	orr w12,w12,w14
00a5a1cc	cmp w10,w9
00a5a1d0	lsr w11,w11,#0x10
00a5a1d4	lsr w13,w13,#0x8
00a5a1d8	add x0,x0,#0x3
00a5a1dc	strb w12,[x15, #0x2]
00a5a1e0	strb w11,[x15]
00a5a1e4	strb w13,[x15, #0x1]
00a5a1e8	b.lt 0x00a5a12c
00a5a1ec	ret
00a5a1f0	mov w0,wzr
00a5a1f4	ret
00a5a1f8	mov w0,#0xffffffff
00a5a1fc	ret
