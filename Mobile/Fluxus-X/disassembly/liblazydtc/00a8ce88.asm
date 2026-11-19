; ossl_aria_set_decrypt_key @ 00a8ce88
00a8ce88	str x19,[sp, #-0x20]!
00a8ce8c	stp x29,x30,[sp, #0x10]
00a8ce90	add x29,sp,#0x10
00a8ce94	mov x19,x2
00a8ce98	bl 0x00a8c5dc
00a8ce9c	cbnz w0,0x00a8cfec
00a8cea0	ldr w8,[x19, #0x110]
00a8cea4	ldr q1,[x19]
00a8cea8	orr w9,wzr,#0xff00ff00
00a8ceac	orr w10,wzr,#0xff00ff
00a8ceb0	add x8,x19,x8, LSL #0x4
00a8ceb4	ldr q0,[x8]
00a8ceb8	add x11,x19,#0x10
00a8cebc	str q0,[x19]
00a8cec0	str q1,[x8], #-0x10
00a8cec4	b 0x00a8cf5c
00a8cec8	ldp w16,w17,[x8]
00a8cecc	ldp w18,w0,[x8, #0x8]
00a8ced0	ror w1,w16,#0x8
00a8ced4	eor w16,w1,w16
00a8ced8	eor w16,w1,w16, ROR #0x10
00a8cedc	ror w1,w17,#0x8
00a8cee0	eor w17,w1,w17
00a8cee4	eor w17,w1,w17, ROR #0x10
00a8cee8	ror w1,w18,#0x8
00a8ceec	eor w18,w1,w18
00a8cef0	eor w18,w1,w18, ROR #0x10
00a8cef4	ror w1,w0,#0x8
00a8cef8	eor w0,w1,w0
00a8cefc	eor w0,w1,w0, ROR #0x10
00a8cf00	eor w17,w17,w18
00a8cf04	eor w18,w0,w18
00a8cf08	eor w1,w17,w16
00a8cf0c	eor w16,w18,w16
00a8cf10	eor w17,w0,w17
00a8cf14	eor w18,w18,w1
00a8cf18	and w0,w9,w16, LSL #0x8
00a8cf1c	and w16,w10,w16, LSR #0x8
00a8cf20	orr w16,w0,w16
00a8cf24	ror w18,w18,#0x10
00a8cf28	rev w17,w17
00a8cf2c	eor w16,w16,w18
00a8cf30	eor w18,w18,w17
00a8cf34	eor w0,w16,w1
00a8cf38	eor w16,w16,w17
00a8cf3c	eor w17,w18,w1
00a8cf40	eor w18,w0,w18
00a8cf44	stp w0,w17,[x11]
00a8cf48	stp w18,w16,[x11, #0x8]
00a8cf4c	stp w15,w14,[x8]
00a8cf50	stp w13,w12,[x8, #0x8]
00a8cf54	sub x8,x8,#0x10
00a8cf58	add x11,x11,#0x10
00a8cf5c	ldp w12,w13,[x11]
00a8cf60	ldp w14,w15,[x11, #0x8]
00a8cf64	cmp x11,x8
00a8cf68	ror w16,w12,#0x8
00a8cf6c	eor w12,w16,w12
00a8cf70	eor w12,w16,w12, ROR #0x10
00a8cf74	ror w16,w13,#0x8
00a8cf78	eor w13,w16,w13
00a8cf7c	eor w13,w16,w13, ROR #0x10
00a8cf80	ror w16,w14,#0x8
00a8cf84	eor w14,w16,w14
00a8cf88	eor w14,w16,w14, ROR #0x10
00a8cf8c	ror w16,w15,#0x8
00a8cf90	eor w15,w16,w15
00a8cf94	eor w15,w16,w15, ROR #0x10
00a8cf98	eor w13,w13,w14
00a8cf9c	eor w14,w15,w14
00a8cfa0	eor w16,w13,w12
00a8cfa4	eor w12,w14,w12
00a8cfa8	eor w13,w15,w13
00a8cfac	eor w14,w14,w16
00a8cfb0	and w15,w9,w12, LSL #0x8
00a8cfb4	and w12,w10,w12, LSR #0x8
00a8cfb8	orr w12,w15,w12
00a8cfbc	ror w14,w14,#0x10
00a8cfc0	rev w13,w13
00a8cfc4	eor w12,w12,w14
00a8cfc8	eor w14,w14,w13
00a8cfcc	eor w15,w12,w16
00a8cfd0	eor w12,w12,w13
00a8cfd4	eor w13,w15,w14
00a8cfd8	eor w14,w14,w16
00a8cfdc	b.cc 0x00a8cec8
00a8cfe0	mov w0,wzr
00a8cfe4	stp w15,w14,[x8]
00a8cfe8	stp w13,w12,[x8, #0x8]
00a8cfec	ldp x29,x30,[sp, #0x10]
00a8cff0	ldr x19,[sp], #0x20
00a8cff4	ret
