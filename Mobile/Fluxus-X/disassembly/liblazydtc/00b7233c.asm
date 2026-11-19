; mbedtls_camellia_crypt_ecb @ 00b7233c
00b7233c	cmp w1,#0x1
00b72340	b.ls 0x00b7234c
00b72344	mov w0,#0xffffffdc
00b72348	ret
00b7234c	ldp w8,w9,[x2]
00b72350	ldp w12,w10,[x0]
00b72354	ldp w11,w13,[x2, #0x8]
00b72358	rev w8,w8
00b7235c	eor w14,w10,w8
00b72360	ldp w15,w8,[x0, #0x8]
00b72364	rev w9,w9
00b72368	rev w10,w11
00b7236c	eor w15,w15,w9
00b72370	ldr w9,[x0, #0x10]
00b72374	eor w16,w8,w10
00b72378	rev w8,w13
00b7237c	eor w17,w9,w8
00b72380	cbz w12,0x00b72724
00b72384	mov w13,#0x1
00b72388	adrp x9,0x77e000
00b7238c	adrp x10,0x77e000
00b72390	adrp x11,0x77e000
00b72394	sub w12,w13,w12
00b72398	adrp x13,0x77e000
00b7239c	add x8,x0,#0x28
00b723a0	add x9,x9,#0x210
00b723a4	add x10,x10,#0x310
00b723a8	add x11,x11,#0x410
00b723ac	add x13,x13,#0x510
00b723b0	b 0x00b723e4
00b723b4	ldp w18,w2,[x8, #0x1c]
00b723b8	ldp w0,w1,[x8, #0x24]
00b723bc	add w12,w12,#0x1
00b723c0	add x8,x8,#0x40
00b723c4	and w18,w18,w14
00b723c8	orr w1,w1,w17
00b723cc	eor w15,w15,w18, ROR #0x1f
00b723d0	eor w16,w1,w16
00b723d4	orr w18,w15,w2
00b723d8	and w0,w16,w0
00b723dc	eor w14,w18,w14
00b723e0	eor w17,w17,w0, ROR #0x1f
00b723e4	ldp w18,w0,[x8, #-0x14]
00b723e8	eor w18,w18,w14
00b723ec	lsr w1,w18,#0x18
00b723f0	ubfx w2,w18,#0x10,#0x8
00b723f4	ldrb w1,[x9, w1, UXTW ]
00b723f8	ubfx w4,w18,#0x8,#0x8
00b723fc	ldrb w2,[x10, w2, UXTW ]
00b72400	ldrb w4,[x11, w4, UXTW ]
00b72404	eor w0,w0,w15
00b72408	lsr w5,w0,#0x18
00b7240c	lsl w1,w1,#0x18
00b72410	ubfx w6,w0,#0x10,#0x8
00b72414	ldrb w5,[x10, w5, UXTW ]
00b72418	bfm w1,w2,#0x10,#0x7
00b7241c	ldrb w6,[x11, w6, UXTW ]
00b72420	bfm w1,w4,#0x18,#0x7
00b72424	ubfx w4,w0,#0x8,#0x8
00b72428	ldrb w4,[x13, w4, UXTW ]
00b7242c	and w0,w0,#0xff
00b72430	and w18,w18,#0xff
00b72434	ldrb w0,[x9, w0, UXTW ]
00b72438	lsl w7,w5,#0x18
00b7243c	ldrb w18,[x13, w18, UXTW ]
00b72440	bfm w7,w6,#0x10,#0x7
00b72444	bfm w7,w4,#0x18,#0x7
00b72448	orr w0,w7,w0
00b7244c	orr w18,w1,w18
00b72450	bfm w5,w0,#0x18,#0x17
00b72454	ldp w2,w6,[x8, #-0xc]
00b72458	eor w18,w5,w18
00b7245c	eor w0,w0,w18, ROR #0x10
00b72460	eor w1,w18,w0, ROR #0x8
00b72464	eor w16,w0,w16
00b72468	eor w18,w16,w1, ROR #0x8
00b7246c	eor w16,w1,w17
00b72470	eor w17,w18,w2
00b72474	eor w0,w16,w6
00b72478	lsr w1,w17,#0x18
00b7247c	ubfx w2,w17,#0x10,#0x8
00b72480	lsr w6,w0,#0x18
00b72484	ldrb w1,[x9, w1, UXTW ]
00b72488	ubfx w7,w0,#0x10,#0x8
00b7248c	ldrb w2,[x10, w2, UXTW ]
00b72490	ldrb w6,[x10, w6, UXTW ]
00b72494	ldrb w7,[x11, w7, UXTW ]
00b72498	lsl w1,w1,#0x18
00b7249c	bfm w1,w2,#0x10,#0x7
00b724a0	lsl w2,w6,#0x18
00b724a4	bfm w2,w7,#0x10,#0x7
00b724a8	ubfx w7,w0,#0x8,#0x8
00b724ac	ubfx w5,w17,#0x8,#0x8
00b724b0	and w0,w0,#0xff
00b724b4	ldrb w7,[x13, w7, UXTW ]
00b724b8	and w17,w17,#0xff
00b724bc	ldrb w5,[x11, w5, UXTW ]
00b724c0	ldrb w0,[x9, w0, UXTW ]
00b724c4	ldrb w17,[x13, w17, UXTW ]
00b724c8	bfm w2,w7,#0x18,#0x7
00b724cc	bfm w1,w5,#0x18,#0x7
00b724d0	orr w0,w2,w0
00b724d4	orr w17,w1,w17
00b724d8	bfm w6,w0,#0x18,#0x17
00b724dc	ldur w4,[x8, #-0x4]
00b724e0	eor w17,w6,w17
00b724e4	ldp w5,w7,[x8]
00b724e8	eor w0,w0,w17, ROR #0x10
00b724ec	eor w1,w17,w0, ROR #0x8
00b724f0	eor w14,w0,w14
00b724f4	eor w17,w14,w1, ROR #0x8
00b724f8	eor w14,w1,w15
00b724fc	eor w15,w17,w4
00b72500	eor w0,w14,w5
00b72504	lsr w1,w15,#0x18
00b72508	ubfx w2,w15,#0x10,#0x8
00b7250c	lsr w5,w0,#0x18
00b72510	ldrb w1,[x9, w1, UXTW ]
00b72514	ubfx w6,w0,#0x10,#0x8
00b72518	ldrb w2,[x10, w2, UXTW ]
00b7251c	ldrb w5,[x10, w5, UXTW ]
00b72520	ldrb w6,[x11, w6, UXTW ]
00b72524	lsl w1,w1,#0x18
00b72528	bfm w1,w2,#0x10,#0x7
00b7252c	lsl w2,w5,#0x18
00b72530	bfm w2,w6,#0x10,#0x7
00b72534	ubfx w6,w0,#0x8,#0x8
00b72538	ubfx w4,w15,#0x8,#0x8
00b7253c	and w0,w0,#0xff
00b72540	ldrb w6,[x13, w6, UXTW ]
00b72544	and w15,w15,#0xff
00b72548	ldrb w4,[x11, w4, UXTW ]
00b7254c	ldrb w0,[x9, w0, UXTW ]
00b72550	ldrb w15,[x13, w15, UXTW ]
00b72554	bfm w2,w6,#0x18,#0x7
00b72558	bfm w1,w4,#0x18,#0x7
00b7255c	orr w0,w2,w0
00b72560	orr w15,w1,w15
00b72564	bfm w5,w0,#0x18,#0x17
00b72568	eor w15,w5,w15
00b7256c	ldp w4,w6,[x8, #0x8]
00b72570	eor w0,w0,w15, ROR #0x10
00b72574	eor w15,w15,w0, ROR #0x8
00b72578	eor w18,w0,w18
00b7257c	eor w18,w18,w15, ROR #0x8
00b72580	eor w15,w15,w16
00b72584	eor w16,w18,w7
00b72588	eor w0,w15,w4
00b7258c	lsr w1,w16,#0x18
00b72590	ubfx w2,w16,#0x10,#0x8
00b72594	lsr w5,w0,#0x18
00b72598	ldrb w1,[x9, w1, UXTW ]
00b7259c	ubfx w7,w0,#0x10,#0x8
00b725a0	ldrb w2,[x10, w2, UXTW ]
00b725a4	ldrb w5,[x10, w5, UXTW ]
00b725a8	ldrb w7,[x11, w7, UXTW ]
00b725ac	lsl w1,w1,#0x18
00b725b0	bfm w1,w2,#0x10,#0x7
00b725b4	lsl w2,w5,#0x18
00b725b8	bfm w2,w7,#0x10,#0x7
00b725bc	ubfx w7,w0,#0x8,#0x8
00b725c0	ubfx w4,w16,#0x8,#0x8
00b725c4	and w0,w0,#0xff
00b725c8	ldrb w7,[x13, w7, UXTW ]
00b725cc	and w16,w16,#0xff
00b725d0	ldrb w4,[x11, w4, UXTW ]
00b725d4	ldrb w0,[x9, w0, UXTW ]
00b725d8	ldrb w16,[x13, w16, UXTW ]
00b725dc	bfm w2,w7,#0x18,#0x7
00b725e0	bfm w1,w4,#0x18,#0x7
00b725e4	orr w0,w2,w0
00b725e8	orr w16,w1,w16
00b725ec	bfm w5,w0,#0x18,#0x17
00b725f0	eor w16,w5,w16
00b725f4	eor w0,w0,w16, ROR #0x10
00b725f8	eor w16,w16,w0, ROR #0x8
00b725fc	eor w17,w0,w17
00b72600	ldp w4,w7,[x8, #0x10]
00b72604	eor w0,w17,w16, ROR #0x8
00b72608	eor w1,w16,w14
00b7260c	eor w14,w0,w6
00b72610	lsr w17,w14,#0x18
00b72614	ubfx w2,w14,#0x10,#0x8
00b72618	ldrb w17,[x9, w17, UXTW ]
00b7261c	eor w16,w1,w4
00b72620	ubfx w4,w14,#0x8,#0x8
00b72624	ldrb w2,[x10, w2, UXTW ]
00b72628	ldrb w4,[x11, w4, UXTW ]
00b7262c	lsr w5,w16,#0x18
00b72630	lsl w17,w17,#0x18
00b72634	ubfx w6,w16,#0x10,#0x8
00b72638	ldrb w5,[x10, w5, UXTW ]
00b7263c	bfm w17,w2,#0x10,#0x7
00b72640	ldrb w6,[x11, w6, UXTW ]
00b72644	bfm w17,w4,#0x18,#0x7
00b72648	ubfx w4,w16,#0x8,#0x8
00b7264c	ldrb w4,[x13, w4, UXTW ]
00b72650	and w16,w16,#0xff
00b72654	and w14,w14,#0xff
00b72658	ldrb w16,[x9, w16, UXTW ]
00b7265c	lsl w2,w5,#0x18
00b72660	ldrb w14,[x13, w14, UXTW ]
00b72664	bfm w2,w6,#0x10,#0x7
00b72668	bfm w2,w4,#0x18,#0x7
00b7266c	orr w16,w2,w16
00b72670	orr w14,w17,w14
00b72674	bfm w5,w16,#0x18,#0x17
00b72678	eor w14,w5,w14
00b7267c	ldr w4,[x8, #0x18]
00b72680	eor w16,w16,w14, ROR #0x10
00b72684	eor w14,w14,w16, ROR #0x8
00b72688	eor w16,w16,w18
00b7268c	eor w16,w16,w14, ROR #0x8
00b72690	eor w17,w14,w15
00b72694	eor w14,w16,w7
00b72698	eor w15,w17,w4
00b7269c	lsr w18,w14,#0x18
00b726a0	ubfx w2,w14,#0x10,#0x8
00b726a4	lsr w5,w15,#0x18
00b726a8	ldrb w18,[x9, w18, UXTW ]
00b726ac	ubfx w6,w15,#0x10,#0x8
00b726b0	ldrb w2,[x10, w2, UXTW ]
00b726b4	ldrb w5,[x10, w5, UXTW ]
00b726b8	ldrb w6,[x11, w6, UXTW ]
00b726bc	lsl w18,w18,#0x18
00b726c0	bfm w18,w2,#0x10,#0x7
00b726c4	lsl w2,w5,#0x18
00b726c8	bfm w2,w6,#0x10,#0x7
00b726cc	ubfx w6,w15,#0x8,#0x8
00b726d0	ubfx w4,w14,#0x8,#0x8
00b726d4	and w15,w15,#0xff
00b726d8	ldrb w6,[x13, w6, UXTW ]
00b726dc	and w14,w14,#0xff
00b726e0	ldrb w4,[x11, w4, UXTW ]
00b726e4	ldrb w15,[x9, w15, UXTW ]
00b726e8	ldrb w14,[x13, w14, UXTW ]
00b726ec	bfm w2,w6,#0x18,#0x7
00b726f0	bfm w18,w4,#0x18,#0x7
00b726f4	orr w15,w2,w15
00b726f8	orr w14,w18,w14
00b726fc	bfm w5,w15,#0x18,#0x17
00b72700	eor w14,w5,w14
00b72704	eor w15,w15,w14, ROR #0x10
00b72708	eor w18,w14,w15, ROR #0x8
00b7270c	eor w14,w15,w0
00b72710	eor w14,w14,w18, ROR #0x8
00b72714	eor w15,w18,w1
00b72718	cbnz w12,0x00b723b4
00b7271c	add x8,x8,#0x1c
00b72720	b 0x00b72728
00b72724	add x8,x0,#0x14
00b72728	ldp w9,w10,[x8]
00b7272c	ldp w11,w8,[x8, #0x8]
00b72730	mov w0,wzr
00b72734	eor w9,w9,w16
00b72738	eor w10,w10,w17
00b7273c	eor w11,w11,w14
00b72740	eor w8,w8,w15
00b72744	rev w9,w9
00b72748	rev w10,w10
00b7274c	rev w11,w11
00b72750	rev w8,w8
00b72754	stp w9,w10,[x3]
00b72758	stp w11,w8,[x3, #0x8]
00b7275c	ret
