; OPENSSL_gmtime_diff @ 00a9c064
00a9c064	ldp w11,w9,[x2, #0x4]
00a9c068	ldr w10,[x2]
00a9c06c	mov w12,#0xe10
00a9c070	mov w8,#0x5180
00a9c074	orr w13,wzr,#0x3c
00a9c078	mul w9,w9,w12
00a9c07c	movk w8,#0x1, LSL #16
00a9c080	madd w9,w11,w13,w9
00a9c084	add w10,w9,w10
00a9c088	sub w13,w8,#0x1
00a9c08c	mov w9,#0xae80
00a9c090	cmp w10,w13
00a9c094	movk w9,#0xfffe, LSL #16
00a9c098	b.le 0x00a9c0a8
00a9c09c	add w10,w10,w9
00a9c0a0	mov w12,#0x1
00a9c0a4	b 0x00a9c0b8
00a9c0a8	add w11,w10,w8
00a9c0ac	cmp w10,#0x0
00a9c0b0	sbfx x12,x10,#0x1f,#0x1
00a9c0b4	csel w10,w11,w10,lt
00a9c0b8	ldp w14,w15,[x2, #0xc]
00a9c0bc	mov w17,#0xaaab
00a9c0c0	ldr w16,[x2, #0x14]
00a9c0c4	movk w17,#0x2aaa, LSL #16
00a9c0c8	sub w2,w15,#0xd
00a9c0cc	smull x2,w2,w17
00a9c0d0	lsr x4,x2,#0x3f
00a9c0d4	asr x2,x2,#0x21
00a9c0d8	add w2,w2,w4
00a9c0dc	mov w4,#0xfffffff4
00a9c0e0	madd w15,w2,w4,w15
00a9c0e4	mov w4,#0x5b5c
00a9c0e8	mov w18,#0x5b5
00a9c0ec	movk w4,#0x2a, LSL #16
00a9c0f0	add w16,w16,w2
00a9c0f4	mov w2,#0x16f
00a9c0f8	madd w18,w16,w18,w4
00a9c0fc	mov w4,#0x1a90
00a9c100	mul w15,w15,w2
00a9c104	mov w2,#0x851f
00a9c108	mov w11,#0x1c0
00a9c10c	movk w2,#0x51eb, LSL #16
00a9c110	add w16,w16,w4
00a9c114	movk w11,#0x6b, LSL #16
00a9c118	sub w15,w15,#0x16f
00a9c11c	smull x16,w16,w2
00a9c120	add w18,w18,w11
00a9c124	smull x15,w15,w17
00a9c128	lsr x17,x16,#0x3f
00a9c12c	asr x16,x16,#0x25
00a9c130	add w2,w18,#0x3
00a9c134	cmp w18,#0x0
00a9c138	add w16,w16,w17
00a9c13c	csel w18,w2,w18,lt
00a9c140	lsr x2,x15,#0x3f
00a9c144	asr x15,x15,#0x21
00a9c148	add w16,w16,w16, LSL #0x1
00a9c14c	add w15,w15,w2
00a9c150	add w14,w14,w18, ASR #0x2
00a9c154	add w17,w16,#0x3
00a9c158	cmp w16,#0x0
00a9c15c	add w14,w14,w15
00a9c160	csel w15,w17,w16,lt
00a9c164	sub w14,w14,w15, ASR #0x2
00a9c168	mov w15,#0xffff82b5
00a9c16c	add w14,w14,w15
00a9c170	adds x12,x12,w14, SXTW 
00a9c174	b.mi 0x00a9c1a8
00a9c178	ldp w16,w14,[x3, #0x4]
00a9c17c	ldr w15,[x3]
00a9c180	mov w17,#0xe10
00a9c184	mul w14,w14,w17
00a9c188	orr w17,wzr,#0x3c
00a9c18c	madd w14,w16,w17,w14
00a9c190	add w15,w14,w15
00a9c194	cmp w15,w13
00a9c198	b.le 0x00a9c1b0
00a9c19c	add w13,w15,w9
00a9c1a0	mov w14,#0x1
00a9c1a4	b 0x00a9c1c0
00a9c1a8	mov w0,wzr
00a9c1ac	ret
00a9c1b0	add w13,w15,w8
00a9c1b4	cmp w15,#0x0
00a9c1b8	sbfx x14,x15,#0x1f,#0x1
00a9c1bc	csel w13,w13,w15,lt
00a9c1c0	ldp w15,w16,[x3, #0xc]
00a9c1c4	mov w18,#0xaaab
00a9c1c8	ldr w17,[x3, #0x14]
00a9c1cc	movk w18,#0x2aaa, LSL #16
00a9c1d0	sub w3,w16,#0xd
00a9c1d4	smull x3,w3,w18
00a9c1d8	lsr x4,x3,#0x3f
00a9c1dc	asr x3,x3,#0x21
00a9c1e0	add w3,w3,w4
00a9c1e4	mov w2,#0x5b5
00a9c1e8	mov w4,#0xfffffff4
00a9c1ec	add w17,w17,w3
00a9c1f0	madd w16,w3,w4,w16
00a9c1f4	madd w11,w17,w2,w11
00a9c1f8	mov w2,#0x16f
00a9c1fc	mul w16,w16,w2
00a9c200	mov w2,#0x1a90
00a9c204	add w17,w17,w2
00a9c208	mov w2,#0x851f
00a9c20c	mov w4,#0x5b5c
00a9c210	movk w2,#0x51eb, LSL #16
00a9c214	movk w4,#0x2a, LSL #16
00a9c218	mov w3,#0x5b5f
00a9c21c	sub w16,w16,#0x16f
00a9c220	smull x17,w17,w2
00a9c224	movk w3,#0x2a, LSL #16
00a9c228	add w4,w11,w4
00a9c22c	smull x16,w16,w18
00a9c230	lsr x18,x17,#0x3f
00a9c234	asr x17,x17,#0x25
00a9c238	add w11,w11,w3
00a9c23c	cmp w4,#0x0
00a9c240	add w17,w17,w18
00a9c244	csel w11,w11,w4,lt
00a9c248	lsr x2,x16,#0x3f
00a9c24c	asr x16,x16,#0x21
00a9c250	add w17,w17,w17, LSL #0x1
00a9c254	add w16,w16,w2
00a9c258	add w11,w15,w11, ASR #0x2
00a9c25c	add w15,w17,#0x3
00a9c260	cmp w17,#0x0
00a9c264	add w11,w11,w16
00a9c268	csel w15,w15,w17,lt
00a9c26c	sub w11,w11,w15, ASR #0x2
00a9c270	mov w15,#0xffff82b5
00a9c274	add w11,w11,w15
00a9c278	adds x11,x14,w11, SXTW 
00a9c27c	b.mi 0x00a9c2e8
00a9c280	sub x11,x11,x12
00a9c284	sub w10,w13,w10
00a9c288	cmp x11,#0x0
00a9c28c	cset w12,gt
00a9c290	cmp w10,#0x0
00a9c294	cset w13,lt
00a9c298	add w8,w10,w8
00a9c29c	and w14,w13,w12
00a9c2a0	tst w13,w12
00a9c2a4	csel w12,w8,w10,ne
00a9c2a8	sub x8,x11,x14
00a9c2ac	cmp x8,#0x0
00a9c2b0	cset w10,lt
00a9c2b4	cmp w12,#0x0
00a9c2b8	cset w11,gt
00a9c2bc	add w9,w12,w9
00a9c2c0	tst w11,w10
00a9c2c4	csel w9,w9,w12,ne
00a9c2c8	cbz x0,0x00a9c2d8
00a9c2cc	and w10,w11,w10
00a9c2d0	add w8,w8,w10
00a9c2d4	str w8,[x0]
00a9c2d8	cbz x1,0x00a9c2e0
00a9c2dc	str w9,[x1]
00a9c2e0	mov w0,#0x1
00a9c2e4	ret
00a9c2e8	mov w0,wzr
00a9c2ec	ret
