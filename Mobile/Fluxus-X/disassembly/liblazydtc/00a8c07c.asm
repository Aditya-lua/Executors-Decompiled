; ossl_aria_encrypt @ 00a8c07c
00a8c07c	cbz x0,0x00a8c5d8
00a8c080	cbz x1,0x00a8c5d8
00a8c084	cbz x2,0x00a8c5d8
00a8c088	ldr w16,[x2, #0x110]
00a8c08c	cmp w16,#0x10
00a8c090	b.hi 0x00a8c5d8
00a8c094	mov w8,#0x1
00a8c098	mov w9,#0x5000
00a8c09c	lsl w8,w8,w16
00a8c0a0	movk w9,#0x1, LSL #16
00a8c0a4	tst w8,w9
00a8c0a8	b.eq 0x00a8c5d8
00a8c0ac	stp x22,x21,[sp, #-0x20]!
00a8c0b0	stp x20,x19,[sp, #0x10]
00a8c0b4	ldp w11,w12,[x0]
00a8c0b8	ldp w15,w17,[x2]
00a8c0bc	ldp w13,w14,[x0, #0x8]
00a8c0c0	adrp x9,0x769000
00a8c0c4	rev w11,w11
00a8c0c8	adrp x8,0x769000
00a8c0cc	rev w12,w12
00a8c0d0	eor w15,w15,w11
00a8c0d4	ldp w18,w0,[x2, #0x8]
00a8c0d8	add x9,x9,#0x4d0
00a8c0dc	add x8,x8,#0x8d0
00a8c0e0	eor w12,w17,w12
00a8c0e4	lsr w11,w15,#0x18
00a8c0e8	ubfx w17,w15,#0x10,#0x8
00a8c0ec	ldr w11,[x9, w11, UXTW #0x2]
00a8c0f0	ldr w17,[x8, w17, UXTW #0x2]
00a8c0f4	rev w13,w13
00a8c0f8	rev w14,w14
00a8c0fc	adrp x10,0x769000
00a8c100	eor w13,w18,w13
00a8c104	eor w14,w0,w14
00a8c108	add x10,x10,#0xcd0
00a8c10c	ubfx w18,w15,#0x8,#0x8
00a8c110	lsr w0,w12,#0x18
00a8c114	ubfx w3,w12,#0x10,#0x8
00a8c118	lsr w4,w13,#0x18
00a8c11c	ubfx w5,w13,#0x10,#0x8
00a8c120	lsr w6,w14,#0x18
00a8c124	eor w11,w17,w11
00a8c128	ubfx w17,w14,#0x10,#0x8
00a8c12c	ldr w0,[x9, w0, UXTW #0x2]
00a8c130	ldr w3,[x8, w3, UXTW #0x2]
00a8c134	ldr w4,[x9, w4, UXTW #0x2]
00a8c138	ldr w5,[x8, w5, UXTW #0x2]
00a8c13c	ldr w6,[x9, w6, UXTW #0x2]
00a8c140	ldr w17,[x8, w17, UXTW #0x2]
00a8c144	ldr w18,[x10, w18, UXTW #0x2]
00a8c148	eor w0,w3,w0
00a8c14c	ubfx w3,w12,#0x8,#0x8
00a8c150	eor w4,w5,w4
00a8c154	ubfx w5,w13,#0x8,#0x8
00a8c158	eor w17,w17,w6
00a8c15c	ubfx w6,w14,#0x8,#0x8
00a8c160	eor w18,w11,w18
00a8c164	adrp x11,0x76a000
00a8c168	ldr w3,[x10, w3, UXTW #0x2]
00a8c16c	ldr w5,[x10, w5, UXTW #0x2]
00a8c170	ldr w6,[x10, w6, UXTW #0x2]
00a8c174	add x11,x11,#0xd0
00a8c178	and w12,w12,#0xff
00a8c17c	and w13,w13,#0xff
00a8c180	and w14,w14,#0xff
00a8c184	and w15,w15,#0xff
00a8c188	ldr w12,[x11, w12, UXTW #0x2]
00a8c18c	ldr w13,[x11, w13, UXTW #0x2]
00a8c190	ldr w14,[x11, w14, UXTW #0x2]
00a8c194	ldr w15,[x11, w15, UXTW #0x2]
00a8c198	eor w0,w0,w3
00a8c19c	eor w3,w4,w5
00a8c1a0	eor w17,w17,w6
00a8c1a4	eor w12,w0,w12
00a8c1a8	eor w13,w3,w13
00a8c1ac	eor w14,w17,w14
00a8c1b0	eor w15,w18,w15
00a8c1b4	eor w12,w12,w13
00a8c1b8	eor w13,w14,w13
00a8c1bc	eor w17,w12,w15
00a8c1c0	eor w12,w14,w12
00a8c1c4	eor w14,w13,w15
00a8c1c8	lsl w15,w14,#0x8
00a8c1cc	lsr w14,w14,#0x8
00a8c1d0	and w15,w15,#0xff00ff00
00a8c1d4	and w14,w14,#0xff00ff
00a8c1d8	ldp w18,w0,[x2, #0x10]
00a8c1dc	orr w14,w15,w14
00a8c1e0	ldp w15,w3,[x2, #0x18]
00a8c1e4	eor w13,w13,w17
00a8c1e8	rev w12,w12
00a8c1ec	ror w13,w13,#0x10
00a8c1f0	eor w3,w3,w12
00a8c1f4	eor w12,w13,w12
00a8c1f8	eor w13,w14,w13
00a8c1fc	eor w14,w0,w17
00a8c200	eor w0,w14,w12
00a8c204	eor w12,w12,w15
00a8c208	eor w14,w13,w17
00a8c20c	cmp w16,#0x2
00a8c210	eor w17,w3,w13
00a8c214	eor w3,w14,w18
00a8c218	eor w18,w12,w14
00a8c21c	add x12,x2,#0x20
00a8c220	b.eq 0x00a8c468
00a8c224	sub w15,w16,#0x4
00a8c228	mov w4,#0x2
00a8c22c	and w15,w15,#0xfffffffe
00a8c230	orr w13,wzr,#0xff00ff00
00a8c234	orr w14,wzr,#0xff00ff
00a8c238	add x15,x15,#0x4
00a8c23c	sub w16,w4,w16
00a8c240	lsr w4,w3,#0x18
00a8c244	ubfx w5,w3,#0x10,#0x8
00a8c248	lsr w7,w0,#0x18
00a8c24c	ubfx w19,w0,#0x10,#0x8
00a8c250	ldr w4,[x10, w4, UXTW #0x2]
00a8c254	ldr w5,[x11, w5, UXTW #0x2]
00a8c258	ldr w7,[x10, w7, UXTW #0x2]
00a8c25c	ldr w19,[x11, w19, UXTW #0x2]
00a8c260	lsr w21,w18,#0x18
00a8c264	ubfx w22,w18,#0x10,#0x8
00a8c268	eor w4,w5,w4
00a8c26c	lsr w5,w17,#0x18
00a8c270	eor w7,w19,w7
00a8c274	ubfx w19,w17,#0x10,#0x8
00a8c278	ldr w21,[x10, w21, UXTW #0x2]
00a8c27c	ldr w22,[x11, w22, UXTW #0x2]
00a8c280	ldr w5,[x10, w5, UXTW #0x2]
00a8c284	ldr w19,[x11, w19, UXTW #0x2]
00a8c288	ubfx w6,w3,#0x8,#0x8
00a8c28c	ubfx w20,w0,#0x8,#0x8
00a8c290	eor w21,w22,w21
00a8c294	ubfx w22,w18,#0x8,#0x8
00a8c298	eor w5,w19,w5
00a8c29c	ubfx w19,w17,#0x8,#0x8
00a8c2a0	and w0,w0,#0xff
00a8c2a4	and w18,w18,#0xff
00a8c2a8	and w17,w17,#0xff
00a8c2ac	ldr w6,[x9, w6, UXTW #0x2]
00a8c2b0	ldr w20,[x9, w20, UXTW #0x2]
00a8c2b4	ldr w22,[x9, w22, UXTW #0x2]
00a8c2b8	ldr w19,[x9, w19, UXTW #0x2]
00a8c2bc	and w3,w3,#0xff
00a8c2c0	ldr w0,[x8, w0, UXTW #0x2]
00a8c2c4	ldr w18,[x8, w18, UXTW #0x2]
00a8c2c8	ldr w17,[x8, w17, UXTW #0x2]
00a8c2cc	ldr w3,[x8, w3, UXTW #0x2]
00a8c2d0	eor w4,w4,w6
00a8c2d4	eor w6,w7,w20
00a8c2d8	eor w21,w21,w22
00a8c2dc	eor w5,w5,w19
00a8c2e0	eor w0,w6,w0
00a8c2e4	eor w18,w21,w18
00a8c2e8	eor w17,w5,w17
00a8c2ec	ldp w7,w20,[x12]
00a8c2f0	eor w3,w4,w3
00a8c2f4	eor w0,w0,w18
00a8c2f8	eor w18,w17,w18
00a8c2fc	ldp w19,w22,[x12, #0x8]
00a8c300	eor w4,w0,w3
00a8c304	eor w17,w17,w0
00a8c308	eor w0,w18,w3
00a8c30c	eor w18,w18,w4
00a8c310	rev w0,w0
00a8c314	and w3,w13,w17, LSL #0x8
00a8c318	and w17,w14,w17, LSR #0x8
00a8c31c	ror w4,w4,#0x10
00a8c320	eor w0,w0,w18
00a8c324	orr w17,w3,w17
00a8c328	eor w3,w20,w4
00a8c32c	eor w4,w0,w4
00a8c330	eor w18,w17,w18
00a8c334	eor w0,w0,w22
00a8c338	eor w5,w4,w7
00a8c33c	eor w4,w4,w19
00a8c340	eor w3,w3,w18
00a8c344	eor w17,w0,w17
00a8c348	eor w18,w4,w18
00a8c34c	lsr w0,w5,#0x18
00a8c350	ubfx w4,w5,#0x10,#0x8
00a8c354	ubfx w6,w5,#0x8,#0x8
00a8c358	lsr w7,w3,#0x18
00a8c35c	ubfx w19,w3,#0x10,#0x8
00a8c360	ldr w0,[x9, w0, UXTW #0x2]
00a8c364	ldr w4,[x8, w4, UXTW #0x2]
00a8c368	lsr w21,w17,#0x18
00a8c36c	ubfx w22,w17,#0x10,#0x8
00a8c370	ldr w6,[x10, w6, UXTW #0x2]
00a8c374	ldr w7,[x9, w7, UXTW #0x2]
00a8c378	ldr w19,[x8, w19, UXTW #0x2]
00a8c37c	ldr w21,[x9, w21, UXTW #0x2]
00a8c380	ldr w22,[x8, w22, UXTW #0x2]
00a8c384	and w5,w5,#0xff
00a8c388	ldr w5,[x11, w5, UXTW #0x2]
00a8c38c	eor w0,w4,w0
00a8c390	ubfx w20,w3,#0x8,#0x8
00a8c394	eor w7,w19,w7
00a8c398	lsr w19,w18,#0x18
00a8c39c	eor w21,w22,w21
00a8c3a0	ubfx w22,w18,#0x10,#0x8
00a8c3a4	eor w0,w0,w6
00a8c3a8	ubfx w4,w17,#0x8,#0x8
00a8c3ac	ldr w20,[x10, w20, UXTW #0x2]
00a8c3b0	ldr w19,[x9, w19, UXTW #0x2]
00a8c3b4	ldr w22,[x8, w22, UXTW #0x2]
00a8c3b8	eor w0,w0,w5
00a8c3bc	ubfx w5,w18,#0x8,#0x8
00a8c3c0	ldr w4,[x10, w4, UXTW #0x2]
00a8c3c4	and w3,w3,#0xff
00a8c3c8	and w17,w17,#0xff
00a8c3cc	and w18,w18,#0xff
00a8c3d0	ldr w5,[x10, w5, UXTW #0x2]
00a8c3d4	ldr w3,[x11, w3, UXTW #0x2]
00a8c3d8	ldr w17,[x11, w17, UXTW #0x2]
00a8c3dc	ldr w18,[x11, w18, UXTW #0x2]
00a8c3e0	eor w6,w7,w20
00a8c3e4	eor w7,w22,w19
00a8c3e8	eor w4,w21,w4
00a8c3ec	eor w5,w7,w5
00a8c3f0	eor w3,w6,w3
00a8c3f4	eor w17,w4,w17
00a8c3f8	eor w18,w5,w18
00a8c3fc	eor w3,w3,w18
00a8c400	eor w18,w17,w18
00a8c404	eor w4,w3,w0
00a8c408	eor w0,w18,w0
00a8c40c	eor w17,w17,w3
00a8c410	and w3,w13,w0, LSL #0x8
00a8c414	and w0,w14,w0, LSR #0x8
00a8c418	ldp w6,w7,[x12, #0x10]
00a8c41c	orr w0,w3,w0
00a8c420	ldp w3,w5,[x12, #0x18]
00a8c424	eor w18,w18,w4
00a8c428	rev w17,w17
00a8c42c	ror w18,w18,#0x10
00a8c430	eor w5,w5,w17
00a8c434	eor w19,w0,w18
00a8c438	eor w17,w18,w17
00a8c43c	eor w18,w7,w4
00a8c440	eor w4,w19,w4
00a8c444	eor w0,w18,w17
00a8c448	eor w18,w17,w3
00a8c44c	adds w16,w16,#0x2
00a8c450	eor w17,w5,w19
00a8c454	eor w3,w4,w6
00a8c458	eor w18,w18,w4
00a8c45c	add x12,x12,#0x20
00a8c460	b.ne 0x00a8c240
00a8c464	add x12,x2,x15, LSL #0x4
00a8c468	ubfx w14,w3,#0x10,#0x8
00a8c46c	lsr w13,w3,#0x18
00a8c470	lsr w16,w0,#0x18
00a8c474	lsr w5,w18,#0x18
00a8c478	lsr w19,w17,#0x18
00a8c47c	ldr w14,[x11, w14, UXTW #0x2]
00a8c480	ubfx w2,w0,#0x10,#0x8
00a8c484	ubfx w6,w18,#0x10,#0x8
00a8c488	ldr w13,[x10, w13, UXTW #0x2]
00a8c48c	ldr w16,[x10, w16, UXTW #0x2]
00a8c490	ldr w5,[x10, w5, UXTW #0x2]
00a8c494	ldr w10,[x10, w19, UXTW #0x2]
00a8c498	ubfx w19,w17,#0x10,#0x8
00a8c49c	ldr w2,[x11, w2, UXTW #0x2]
00a8c4a0	ldr w6,[x11, w6, UXTW #0x2]
00a8c4a4	ldr w11,[x11, w19, UXTW #0x2]
00a8c4a8	ubfx w15,w3,#0x8,#0x8
00a8c4ac	ubfx w4,w0,#0x8,#0x8
00a8c4b0	ubfx w7,w18,#0x8,#0x8
00a8c4b4	ubfx w19,w17,#0x8,#0x8
00a8c4b8	ldr w15,[x9, w15, UXTW #0x2]
00a8c4bc	lsl w14,w14,#0x8
00a8c4c0	ldr w4,[x9, w4, UXTW #0x2]
00a8c4c4	ldr w7,[x9, w7, UXTW #0x2]
00a8c4c8	ldr w9,[x9, w19, UXTW #0x2]
00a8c4cc	and w3,w3,#0xff
00a8c4d0	and w14,w14,#0xff0000
00a8c4d4	and w0,w0,#0xff
00a8c4d8	and w18,w18,#0xff
00a8c4dc	and w17,w17,#0xff
00a8c4e0	lsl x3,x3,#0x2
00a8c4e4	bfm w14,w13,#0x8,#0x7
00a8c4e8	lsl w13,w2,#0x8
00a8c4ec	lsl w11,w11,#0x8
00a8c4f0	lsl x0,x0,#0x2
00a8c4f4	lsl x18,x18,#0x2
00a8c4f8	lsl x17,x17,#0x2
00a8c4fc	ldrb w3,[x8, x3]
00a8c500	and w13,w13,#0xff0000
00a8c504	and w11,w11,#0xff0000
00a8c508	ldrb w0,[x8, x0]
00a8c50c	ldrb w18,[x8, x18]
00a8c510	ldrb w8,[x8, x17]
00a8c514	bfm w13,w16,#0x8,#0x7
00a8c518	lsl w16,w6,#0x8
00a8c51c	bfm w11,w10,#0x8,#0x7
00a8c520	bfm w14,w15,#0x18,#0x7
00a8c524	ldp w10,w15,[x12]
00a8c528	and w16,w16,#0xff0000
00a8c52c	bfm w11,w9,#0x18,#0x7
00a8c530	ldp w9,w12,[x12, #0x8]
00a8c534	bfm w16,w5,#0x8,#0x7
00a8c538	bfm w13,w4,#0x18,#0x7
00a8c53c	bfm w16,w7,#0x18,#0x7
00a8c540	orr w14,w14,w3
00a8c544	orr w13,w13,w0
00a8c548	orr w16,w16,w18
00a8c54c	orr w8,w11,w8
00a8c550	eor w10,w14,w10
00a8c554	eor w11,w13,w15
00a8c558	eor w9,w16,w9
00a8c55c	eor w8,w8,w12
00a8c560	lsr w12,w10,#0x18
00a8c564	lsr w13,w10,#0x10
00a8c568	lsr w14,w10,#0x8
00a8c56c	strb w10,[x1, #0x3]
00a8c570	lsr w10,w11,#0x18
00a8c574	lsr w15,w11,#0x10
00a8c578	lsr w16,w11,#0x8
00a8c57c	strb w11,[x1, #0x7]
00a8c580	lsr w11,w9,#0x18
00a8c584	lsr w17,w9,#0x10
00a8c588	lsr w18,w9,#0x8
00a8c58c	strb w9,[x1, #0xb]
00a8c590	lsr w9,w8,#0x18
00a8c594	lsr w0,w8,#0x10
00a8c598	strb w12,[x1]
00a8c59c	lsr w12,w8,#0x8
00a8c5a0	strb w13,[x1, #0x1]
00a8c5a4	strb w14,[x1, #0x2]
00a8c5a8	strb w10,[x1, #0x4]
00a8c5ac	strb w15,[x1, #0x5]
00a8c5b0	strb w16,[x1, #0x6]
00a8c5b4	strb w11,[x1, #0x8]
00a8c5b8	strb w17,[x1, #0x9]
00a8c5bc	strb w18,[x1, #0xa]
00a8c5c0	strb w9,[x1, #0xc]
00a8c5c4	strb w0,[x1, #0xd]
00a8c5c8	strb w12,[x1, #0xe]
00a8c5cc	strb w8,[x1, #0xf]
00a8c5d0	ldp x20,x19,[sp, #0x10]
00a8c5d4	ldp x22,x21,[sp], #0x20
00a8c5d8	ret
