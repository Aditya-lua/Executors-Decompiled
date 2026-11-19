; FUN_00b2ff90 @ 00b2ff90
00b2ff90	sub sp,sp,#0x160
00b2ff94	stp x28,x27,[sp, #0x100]
00b2ff98	stp x26,x25,[sp, #0x110]
00b2ff9c	stp x24,x23,[sp, #0x120]
00b2ffa0	stp x22,x21,[sp, #0x130]
00b2ffa4	stp x20,x19,[sp, #0x140]
00b2ffa8	stp x29,x30,[sp, #0x150]
00b2ffac	stp x1,x2,[sp, #0x10]
00b2ffb0	ldr q0,[x0]
00b2ffb4	cmp x2,#0x40
00b2ffb8	mov w10,#0x40
00b2ffbc	csel x8,x2,x10,cc
00b2ffc0	str q0,[sp, #0x80]
00b2ffc4	ldr q0,[x0, #0x10]
00b2ffc8	ldr w10,[sp, #0x80]
00b2ffcc	mov x9,xzr
00b2ffd0	stp x0,x8,[sp, #0x30]
00b2ffd4	str q0,[sp, #0x90]
00b2ffd8	ldr w6,[sp, #0x90]
00b2ffdc	ldr x8,[sp, #0x10]
00b2ffe0	str x9,[sp, #0x78]
00b2ffe4	ldr x13,[sp, #0x30]
00b2ffe8	add w10,w6,w10
00b2ffec	add x11,x8,x9
00b2fff0	ldp q0,q1,[x11]
00b2fff4	stp q0,q1,[sp, #0xc0]
00b2fff8	ldr q1,[x11, #0x20]
00b2fffc	mov w9,v0.S[0x1]
00b30000	fmov w8,s0
00b30004	str w9,[sp, #0x6c]
00b30008	str q1,[sp, #0xe0]
00b3000c	ldr q1,[x11, #0x30]
00b30010	str w8,[sp, #0x74]
00b30014	add w10,w10,w8
00b30018	ldr x8,[sp, #0x38]
00b3001c	str q1,[sp, #0xf0]
00b30020	ldp w11,w14,[x13, #0x20]
00b30024	add w12,w9,w10
00b30028	mov w9,#0xe667
00b3002c	movk w9,#0x6a09, LSL #16
00b30030	add w11,w11,w8
00b30034	cmp x8,x11
00b30038	mov w8,#0x527f
00b3003c	str w11,[x13, #0x20]
00b30040	eor w11,w10,w11
00b30044	movk w8,#0x510e, LSL #16
00b30048	eor w11,w11,w8
00b3004c	ror w11,w11,#0x10
00b30050	cinc w10,w14,hi
00b30054	add w14,w11,w9
00b30058	eor w15,w14,w6
00b3005c	ror w15,w15,#0xc
00b30060	add w27,w12,w15
00b30064	eor w11,w27,w11
00b30068	ror w16,w11,#0x8
00b3006c	add w12,w16,w14
00b30070	str w10,[x13, #0x24]
00b30074	eor w11,w12,w15
00b30078	ror w29,w11,#0x7
00b3007c	ldr w11,[sp, #0x84]
00b30080	ldr w14,[sp, #0x94]
00b30084	ldp w19,w9,[sp, #0xc8]
00b30088	ldp w30,w25,[x13, #0x28]
00b3008c	ldp w13,w7,[sp, #0xd0]
00b30090	add w11,w14,w11
00b30094	add w11,w11,w19
00b30098	add w15,w9,w11
00b3009c	mov w6,w9
00b300a0	str w9,[sp, #0x64]
00b300a4	mov w9,#0x688c
00b300a8	eor w10,w11,w10
00b300ac	movk w9,#0x9b05, LSL #16
00b300b0	eor w10,w10,w9
00b300b4	mov w9,#0xae85
00b300b8	ror w10,w10,#0x10
00b300bc	movk w9,#0xbb67, LSL #16
00b300c0	add w17,w10,w9
00b300c4	eor w11,w17,w14
00b300c8	ror w18,w11,#0xc
00b300cc	add w14,w15,w18
00b300d0	eor w10,w14,w10
00b300d4	ror w15,w10,#0x8
00b300d8	add w11,w15,w17
00b300dc	ldr w17,[sp, #0x88]
00b300e0	ldr w9,[sp, #0x98]
00b300e4	mov w10,#0xd9ab
00b300e8	movk w10,#0x1f83, LSL #16
00b300ec	mov w28,w13
00b300f0	add w17,w9,w17
00b300f4	add w17,w17,w13
00b300f8	eor w30,w17,w30
00b300fc	eor w30,w30,w10
00b30100	mov w10,#0xf372
00b30104	ror w30,w30,#0x10
00b30108	movk w10,#0x3c6e, LSL #16
00b3010c	str w13,[sp, #0x60]
00b30110	add w13,w30,w10
00b30114	eor w9,w13,w9
00b30118	add w17,w7,w17
00b3011c	ror w9,w9,#0xc
00b30120	add w17,w17,w9
00b30124	eor w30,w17,w30
00b30128	ror w1,w30,#0x8
00b3012c	ldr w30,[sp, #0x8c]
00b30130	ldr w2,[sp, #0x9c]
00b30134	ldp w4,w26,[sp, #0xd8]
00b30138	mov w10,#0xcd19
00b3013c	movk w10,#0x5be0, LSL #16
00b30140	add w30,w2,w30
00b30144	add w30,w30,w4
00b30148	eor w25,w30,w25
00b3014c	mov w8,#0xf53a
00b30150	eor w25,w25,w10
00b30154	movk w8,#0xa54f, LSL #16
00b30158	ror w25,w25,#0x10
00b3015c	stp w8,w16,[sp, #0xac]
00b30160	add w8,w25,w8
00b30164	ldp w21,w3,[sp, #0xe0]
00b30168	ldr w5,[sp, #0xe8]
00b3016c	add w13,w1,w13
00b30170	eor w2,w8,w2
00b30174	eor w9,w13,w9
00b30178	add w30,w26,w30
00b3017c	ror w2,w2,#0xc
00b30180	eor w18,w11,w18
00b30184	ror w9,w9,#0x7
00b30188	add w30,w30,w2
00b3018c	ror w18,w18,#0x7
00b30190	str w27,[sp, #0x80]
00b30194	add w14,w9,w14
00b30198	eor w25,w30,w25
00b3019c	add w27,w18,w27
00b301a0	add w14,w14,w5
00b301a4	ror w25,w25,#0x8
00b301a8	add w27,w27,w21
00b301ac	ldp w20,w23,[sp, #0xec]
00b301b0	eor w16,w14,w16
00b301b4	add w8,w25,w8
00b301b8	eor w25,w25,w27
00b301bc	ror w16,w16,#0x10
00b301c0	ror w25,w25,#0x10
00b301c4	eor w2,w8,w2
00b301c8	add w8,w16,w8
00b301cc	add w13,w25,w13
00b301d0	ror w2,w2,#0x7
00b301d4	eor w9,w8,w9
00b301d8	eor w18,w13,w18
00b301dc	ldr w0,[sp, #0xf4]
00b301e0	add w14,w20,w14
00b301e4	ror w9,w9,#0xc
00b301e8	add w17,w2,w17
00b301ec	add w27,w3,w27
00b301f0	ror w18,w18,#0xc
00b301f4	add w14,w14,w9
00b301f8	add w17,w17,w23
00b301fc	add w27,w27,w18
00b30200	str w15,[sp, #0xb4]
00b30204	eor w16,w14,w16
00b30208	eor w15,w17,w15
00b3020c	eor w25,w27,w25
00b30210	ror w16,w16,#0x8
00b30214	ror w15,w15,#0x10
00b30218	ror w25,w25,#0x8
00b3021c	mov w24,w5
00b30220	mov w5,w20
00b30224	add w17,w0,w17
00b30228	mov w20,w0
00b3022c	add w0,w16,w8
00b30230	add w10,w15,w12
00b30234	add w13,w25,w13
00b30238	eor w9,w0,w9
00b3023c	eor w2,w10,w2
00b30240	eor w18,w13,w18
00b30244	str w12,[sp, #0xa0]
00b30248	ror w12,w9,#0x7
00b3024c	ror w2,w2,#0xc
00b30250	ror w8,w18,#0x7
00b30254	add w9,w17,w2
00b30258	add w17,w12,w3
00b3025c	add w18,w8,w28
00b30260	eor w15,w9,w15
00b30264	add w17,w17,w9
00b30268	add w14,w18,w14
00b3026c	ldp w9,w18,[sp, #0xf8]
00b30270	add w30,w30,w29
00b30274	str w1,[sp, #0xb8]
00b30278	str w11,[sp, #0xa4]
00b3027c	add w30,w30,w9
00b30280	eor w1,w30,w1
00b30284	ror w1,w1,#0x10
00b30288	add w11,w1,w11
00b3028c	str w29,[sp, #0x90]
00b30290	eor w29,w11,w29
00b30294	add w30,w18,w30
00b30298	ror w29,w29,#0xc
00b3029c	add w30,w30,w29
00b302a0	eor w1,w30,w1
00b302a4	ror w1,w1,#0x8
00b302a8	add w11,w1,w11
00b302ac	ror w15,w15,#0x8
00b302b0	eor w29,w11,w29
00b302b4	add w10,w15,w10
00b302b8	add w27,w9,w27
00b302bc	ror w29,w29,#0x7
00b302c0	eor w2,w10,w2
00b302c4	add w27,w27,w29
00b302c8	eor w15,w15,w14
00b302cc	ror w2,w2,#0x7
00b302d0	eor w16,w27,w16
00b302d4	ror w15,w15,#0x10
00b302d8	mov w22,w4
00b302dc	str w4,[sp, #0x5c]
00b302e0	add w4,w2,w20
00b302e4	ror w16,w16,#0x10
00b302e8	add w11,w11,w15
00b302ec	add w4,w4,w30
00b302f0	str w8,[sp, #0x94]
00b302f4	add w30,w16,w10
00b302f8	eor w8,w11,w8
00b302fc	add w14,w14,w21
00b30300	eor w10,w30,w29
00b30304	ror w8,w8,#0xc
00b30308	mov w28,w20
00b3030c	mov w20,w9
00b30310	ror w9,w10,#0xc
00b30314	add w10,w14,w8
00b30318	eor w14,w10,w15
00b3031c	eor w15,w1,w17
00b30320	ror w15,w15,#0x10
00b30324	str w13,[sp, #0xa8]
00b30328	add w13,w15,w13
00b3032c	str w3,[sp, #0x54]
00b30330	mov w3,w18
00b30334	stp w12,w2,[sp, #0x98]
00b30338	eor w12,w13,w12
00b3033c	add w17,w3,w17
00b30340	ror w12,w12,#0xc
00b30344	add w27,w27,w24
00b30348	add w17,w17,w12
00b3034c	add w27,w27,w9
00b30350	eor w15,w17,w15
00b30354	eor w1,w4,w25
00b30358	str w25,[sp, #0xbc]
00b3035c	eor w16,w27,w16
00b30360	ror w25,w15,#0x8
00b30364	ror w1,w1,#0x10
00b30368	ror w16,w16,#0x8
00b3036c	add w15,w25,w13
00b30370	add w13,w1,w0
00b30374	stp w0,w16,[sp, #0xac]
00b30378	eor w0,w13,w2
00b3037c	mov w18,w24
00b30380	str w24,[sp, #0x50]
00b30384	mov w24,w21
00b30388	str w21,[sp, #0x48]
00b3038c	ror w14,w14,#0x8
00b30390	ldr w21,[sp, #0x6c]
00b30394	add w4,w4,w22
00b30398	ror w0,w0,#0xc
00b3039c	add w11,w14,w11
00b303a0	add w2,w4,w0
00b303a4	eor w8,w11,w8
00b303a8	eor w1,w2,w1
00b303ac	ror w29,w8,#0x7
00b303b0	ror w1,w1,#0x8
00b303b4	add w8,w29,w21
00b303b8	add w13,w1,w13
00b303bc	add w8,w8,w27
00b303c0	add w27,w16,w30
00b303c4	eor w0,w13,w0
00b303c8	add w17,w17,w5
00b303cc	eor w9,w27,w9
00b303d0	ror w0,w0,#0x7
00b303d4	ror w9,w9,#0x7
00b303d8	add w2,w2,w7
00b303dc	add w17,w17,w0
00b303e0	stp w14,w25,[sp, #0xb4]
00b303e4	add w2,w2,w9
00b303e8	eor w14,w17,w14
00b303ec	eor w4,w2,w25
00b303f0	ror w25,w14,#0x10
00b303f4	stp w27,w11,[sp, #0xa0]
00b303f8	add w27,w25,w27
00b303fc	eor w14,w27,w0
00b30400	add w17,w17,w26
00b30404	ror w0,w14,#0xc
00b30408	add w14,w17,w0
00b3040c	eor w17,w14,w25
00b30410	ror w17,w17,#0x8
00b30414	add w25,w17,w27
00b30418	eor w0,w25,w0
00b3041c	ror w30,w0,#0x7
00b30420	str w3,[sp, #0x68]
00b30424	add w0,w30,w3
00b30428	ldr w3,[sp, #0x74]
00b3042c	eor w12,w15,w12
00b30430	ror w4,w4,#0x10
00b30434	ror w12,w12,#0x7
00b30438	add w10,w10,w3
00b3043c	add w11,w4,w11
00b30440	add w10,w10,w12
00b30444	str w9,[sp, #0x90]
00b30448	eor w9,w11,w9
00b3044c	eor w16,w16,w10
00b30450	eor w1,w8,w1
00b30454	add w2,w2,w6
00b30458	ror w9,w9,#0xc
00b3045c	ror w16,w16,#0x10
00b30460	ror w1,w1,#0x10
00b30464	add w2,w2,w9
00b30468	add w13,w16,w13
00b3046c	add w15,w1,w15
00b30470	eor w4,w2,w4
00b30474	add w0,w0,w2
00b30478	eor w12,w13,w12
00b3047c	eor w2,w15,w29
00b30480	add w8,w8,w23
00b30484	ror w27,w12,#0xc
00b30488	ror w12,w2,#0xc
00b3048c	add w8,w8,w12
00b30490	eor w1,w8,w1
00b30494	ror w1,w1,#0x8
00b30498	add w10,w10,w19
00b3049c	add w15,w1,w15
00b304a0	add w10,w10,w27
00b304a4	eor w12,w15,w12
00b304a8	eor w16,w10,w16
00b304ac	add w10,w10,w23
00b304b0	ror w12,w12,#0x7
00b304b4	add w10,w10,w12
00b304b8	ror w2,w4,#0x8
00b304bc	eor w17,w10,w17
00b304c0	add w11,w2,w11
00b304c4	ror w17,w17,#0x10
00b304c8	mov w22,w5
00b304cc	eor w9,w11,w9
00b304d0	add w11,w17,w11
00b304d4	add w8,w8,w22
00b304d8	ror w9,w9,#0x7
00b304dc	str w12,[sp, #0x94]
00b304e0	eor w12,w11,w12
00b304e4	ror w16,w16,#0x8
00b304e8	add w8,w8,w9
00b304ec	add w10,w10,w3
00b304f0	ror w12,w12,#0xc
00b304f4	add w13,w16,w13
00b304f8	eor w16,w8,w16
00b304fc	add w29,w10,w12
00b30500	ror w16,w16,#0x10
00b30504	eor w10,w29,w17
00b30508	add w4,w16,w25
00b3050c	ror w25,w10,#0x8
00b30510	add w11,w25,w11
00b30514	eor w9,w4,w9
00b30518	eor w10,w11,w12
00b3051c	add w8,w8,w24
00b30520	ror w9,w9,#0xc
00b30524	ror w10,w10,#0x7
00b30528	add w8,w8,w9
00b3052c	add w12,w10,w18
00b30530	mov w5,w7
00b30534	eor w16,w8,w16
00b30538	add w12,w12,w8
00b3053c	eor w8,w13,w27
00b30540	ror w8,w8,#0x7
00b30544	add w14,w14,w5
00b30548	add w14,w14,w8
00b3054c	eor w17,w2,w14
00b30550	ror w17,w17,#0x10
00b30554	str w15,[sp, #0xa8]
00b30558	add w15,w17,w15
00b3055c	str w7,[sp, #0x70]
00b30560	mov w7,w19
00b30564	stp w8,w30,[sp, #0x98]
00b30568	eor w8,w15,w8
00b3056c	add w2,w14,w7
00b30570	ror w14,w8,#0xc
00b30574	str w1,[sp, #0xbc]
00b30578	add w8,w2,w14
00b3057c	eor w1,w0,w1
00b30580	eor w2,w8,w17
00b30584	ror w1,w1,#0x10
00b30588	str w13,[sp, #0xac]
00b3058c	ror w2,w2,#0x8
00b30590	add w13,w1,w13
00b30594	ror w17,w16,#0x8
00b30598	add w16,w2,w15
00b3059c	eor w15,w13,w30
00b305a0	add w0,w0,w28
00b305a4	ror w15,w15,#0xc
00b305a8	ldr w5,[sp, #0x54]
00b305ac	add w0,w0,w15
00b305b0	add w4,w17,w4
00b305b4	eor w1,w0,w1
00b305b8	eor w9,w4,w9
00b305bc	ror w1,w1,#0x8
00b305c0	ror w9,w9,#0x7
00b305c4	add w0,w0,w5
00b305c8	add w13,w1,w13
00b305cc	add w0,w0,w9
00b305d0	eor w15,w13,w15
00b305d4	add w8,w8,w26
00b305d8	str w2,[sp, #0xb8]
00b305dc	eor w2,w0,w2
00b305e0	ror w15,w15,#0x7
00b305e4	ror w2,w2,#0x10
00b305e8	add w8,w8,w15
00b305ec	stp w4,w11,[sp, #0xa0]
00b305f0	add w27,w2,w11
00b305f4	eor w11,w8,w25
00b305f8	ror w11,w11,#0x10
00b305fc	add w4,w11,w4
00b30600	eor w15,w4,w15
00b30604	stp w17,w25,[sp, #0xb0]
00b30608	add w8,w8,w21
00b3060c	ror w25,w15,#0xc
00b30610	add w15,w8,w25
00b30614	mov w19,w23
00b30618	str w23,[sp, #0x4c]
00b3061c	ldr w23,[sp, #0x60]
00b30620	eor w8,w15,w11
00b30624	ror w8,w8,#0x8
00b30628	add w4,w8,w4
00b3062c	ldr w30,[sp, #0x64]
00b30630	str w9,[sp, #0x90]
00b30634	eor w9,w27,w9
00b30638	eor w11,w4,w25
00b3063c	add w0,w0,w23
00b30640	ror w9,w9,#0xc
00b30644	ror w11,w11,#0x7
00b30648	add w0,w0,w9
00b3064c	add w25,w11,w22
00b30650	eor w14,w16,w14
00b30654	eor w1,w12,w1
00b30658	eor w2,w0,w2
00b3065c	add w0,w25,w0
00b30660	add w25,w29,w30
00b30664	ror w14,w14,#0x7
00b30668	ror w1,w1,#0x10
00b3066c	add w25,w25,w14
00b30670	add w16,w1,w16
00b30674	str w22,[sp, #0x2c]
00b30678	eor w17,w17,w25
00b3067c	ldr w22,[sp, #0x5c]
00b30680	eor w10,w16,w10
00b30684	add w12,w12,w20
00b30688	ror w17,w17,#0x10
00b3068c	ror w10,w10,#0xc
00b30690	add w13,w17,w13
00b30694	add w12,w12,w10
00b30698	eor w14,w13,w14
00b3069c	eor w1,w12,w1
00b306a0	add w25,w25,w22
00b306a4	ror w14,w14,#0xc
00b306a8	ror w1,w1,#0x8
00b306ac	add w25,w25,w14
00b306b0	add w16,w1,w16
00b306b4	eor w17,w25,w17
00b306b8	eor w10,w16,w10
00b306bc	add w25,w25,w30
00b306c0	ror w17,w17,#0x8
00b306c4	ror w2,w2,#0x8
00b306c8	ror w10,w10,#0x7
00b306cc	add w13,w17,w13
00b306d0	str w1,[sp, #0xbc]
00b306d4	add w27,w2,w27
00b306d8	add w25,w25,w10
00b306dc	eor w1,w0,w1
00b306e0	eor w9,w27,w9
00b306e4	eor w8,w25,w8
00b306e8	eor w14,w13,w14
00b306ec	ror w1,w1,#0x10
00b306f0	add w12,w12,w26
00b306f4	ror w9,w9,#0x7
00b306f8	ror w8,w8,#0x10
00b306fc	ror w14,w14,#0x7
00b30700	add w15,w15,w28
00b30704	str w13,[sp, #0xac]
00b30708	add w13,w1,w13
00b3070c	mov w6,w21
00b30710	mov w21,w20
00b30714	add w12,w12,w9
00b30718	add w27,w8,w27
00b3071c	stp w14,w11,[sp, #0x98]
00b30720	add w15,w15,w14
00b30724	eor w11,w13,w11
00b30728	str w10,[sp, #0x94]
00b3072c	eor w17,w12,w17
00b30730	eor w10,w27,w10
00b30734	eor w2,w2,w15
00b30738	add w0,w0,w21
00b3073c	ror w11,w11,#0xc
00b30740	add w25,w25,w6
00b30744	ror w17,w17,#0x10
00b30748	ror w10,w10,#0xc
00b3074c	ror w2,w2,#0x10
00b30750	add w0,w0,w11
00b30754	str w16,[sp, #0xa8]
00b30758	add w4,w17,w4
00b3075c	add w29,w25,w10
00b30760	add w16,w2,w16
00b30764	eor w1,w0,w1
00b30768	eor w9,w4,w9
00b3076c	eor w8,w29,w8
00b30770	eor w14,w16,w14
00b30774	ror w1,w1,#0x8
00b30778	add w12,w12,w5
00b3077c	ror w9,w9,#0xc
00b30780	ror w8,w8,#0x8
00b30784	add w15,w15,w19
00b30788	ror w14,w14,#0xc
00b3078c	add w13,w1,w13
00b30790	add w12,w12,w9
00b30794	add w25,w8,w27
00b30798	add w15,w15,w14
00b3079c	eor w11,w13,w11
00b307a0	eor w17,w12,w17
00b307a4	eor w10,w25,w10
00b307a8	eor w2,w15,w2
00b307ac	add w15,w15,w23
00b307b0	ror w11,w11,#0x7
00b307b4	ror w10,w10,#0x7
00b307b8	ror w17,w17,#0x8
00b307bc	add w15,w15,w11
00b307c0	mov w24,w7
00b307c4	mov w20,w26
00b307c8	str w26,[sp, #0x58]
00b307cc	add w27,w10,w7
00b307d0	mov w26,w21
00b307d4	str w21,[sp, #0x44]
00b307d8	mov w21,w23
00b307dc	stp w17,w8,[sp, #0xb0]
00b307e0	ldr w23,[sp, #0x68]
00b307e4	eor w8,w15,w8
00b307e8	ldp w7,w3,[sp, #0x70]
00b307ec	add w4,w17,w4
00b307f0	ror w8,w8,#0x10
00b307f4	stp w4,w25,[sp, #0xa0]
00b307f8	eor w9,w4,w9
00b307fc	add w4,w8,w4
00b30800	eor w11,w4,w11
00b30804	ror w9,w9,#0x7
00b30808	add w0,w0,w23
00b3080c	add w15,w15,w3
00b30810	ror w11,w11,#0xc
00b30814	ror w2,w2,#0x8
00b30818	add w0,w0,w9
00b3081c	add w15,w15,w11
00b30820	add w16,w2,w16
00b30824	str w2,[sp, #0xb8]
00b30828	eor w2,w0,w2
00b3082c	ldr w19,[sp, #0x48]
00b30830	eor w8,w15,w8
00b30834	ror w2,w2,#0x10
00b30838	ror w8,w8,#0x8
00b3083c	ldr w18,[sp, #0x50]
00b30840	add w25,w2,w25
00b30844	add w4,w8,w4
00b30848	str w9,[sp, #0x90]
00b3084c	eor w9,w25,w9
00b30850	eor w11,w4,w11
00b30854	add w0,w0,w19
00b30858	ror w9,w9,#0xc
00b3085c	ror w11,w11,#0x7
00b30860	add w12,w27,w12
00b30864	add w0,w0,w9
00b30868	add w27,w11,w18
00b3086c	eor w14,w16,w14
00b30870	eor w2,w0,w2
00b30874	add w0,w27,w0
00b30878	add w27,w29,w7
00b3087c	ror w14,w14,#0x7
00b30880	add w27,w27,w14
00b30884	eor w17,w17,w27
00b30888	eor w1,w12,w1
00b3088c	ror w17,w17,#0x10
00b30890	ror w1,w1,#0x10
00b30894	add w13,w17,w13
00b30898	add w16,w1,w16
00b3089c	eor w14,w13,w14
00b308a0	eor w10,w16,w10
00b308a4	add w27,w27,w18
00b308a8	add w12,w12,w22
00b308ac	ror w14,w14,#0xc
00b308b0	ror w10,w10,#0xc
00b308b4	add w27,w27,w14
00b308b8	add w12,w12,w10
00b308bc	eor w17,w27,w17
00b308c0	eor w1,w12,w1
00b308c4	ror w17,w17,#0x8
00b308c8	ror w1,w1,#0x8
00b308cc	ror w2,w2,#0x8
00b308d0	add w13,w17,w13
00b308d4	str w1,[sp, #0xbc]
00b308d8	add w16,w1,w16
00b308dc	add w25,w2,w25
00b308e0	eor w1,w0,w1
00b308e4	eor w10,w16,w10
00b308e8	eor w9,w25,w9
00b308ec	eor w14,w13,w14
00b308f0	ror w1,w1,#0x10
00b308f4	add w27,w27,w7
00b308f8	add w12,w12,w5
00b308fc	ror w10,w10,#0x7
00b30900	ror w9,w9,#0x7
00b30904	ror w14,w14,#0x7
00b30908	add w15,w15,w24
00b3090c	str w13,[sp, #0xac]
00b30910	add w13,w1,w13
00b30914	add w12,w12,w9
00b30918	add w27,w27,w10
00b3091c	stp w14,w11,[sp, #0x98]
00b30920	add w15,w15,w14
00b30924	eor w11,w13,w11
00b30928	eor w17,w12,w17
00b3092c	eor w8,w27,w8
00b30930	eor w2,w2,w15
00b30934	add w0,w0,w23
00b30938	ror w11,w11,#0xc
00b3093c	ror w17,w17,#0x10
00b30940	ror w8,w8,#0x10
00b30944	ror w2,w2,#0x10
00b30948	add w0,w0,w11
00b3094c	str w16,[sp, #0xa8]
00b30950	add w4,w17,w4
00b30954	add w25,w8,w25
00b30958	add w16,w2,w16
00b3095c	eor w1,w0,w1
00b30960	str w10,[sp, #0x94]
00b30964	eor w9,w4,w9
00b30968	eor w10,w25,w10
00b3096c	eor w14,w16,w14
00b30970	ror w1,w1,#0x8
00b30974	add w12,w12,w3
00b30978	add w27,w27,w20
00b3097c	ror w9,w9,#0xc
00b30980	ror w10,w10,#0xc
00b30984	add w15,w15,w21
00b30988	ror w14,w14,#0xc
00b3098c	add w13,w1,w13
00b30990	mov w18,w22
00b30994	add w12,w12,w9
00b30998	add w29,w27,w10
00b3099c	add w15,w15,w14
00b309a0	eor w11,w13,w11
00b309a4	eor w17,w12,w17
00b309a8	eor w8,w29,w8
00b309ac	eor w2,w15,w2
00b309b0	add w15,w15,w18
00b309b4	ror w11,w11,#0x7
00b309b8	ror w8,w8,#0x8
00b309bc	ror w17,w17,#0x8
00b309c0	add w15,w15,w11
00b309c4	add w25,w8,w25
00b309c8	stp w17,w8,[sp, #0xb0]
00b309cc	eor w8,w15,w8
00b309d0	add w4,w17,w4
00b309d4	ror w8,w8,#0x10
00b309d8	stp w4,w25,[sp, #0xa0]
00b309dc	eor w9,w4,w9
00b309e0	add w4,w8,w4
00b309e4	eor w11,w4,w11
00b309e8	ror w9,w9,#0x7
00b309ec	add w0,w0,w30
00b309f0	add w15,w15,w19
00b309f4	ror w11,w11,#0xc
00b309f8	ror w2,w2,#0x8
00b309fc	add w0,w0,w9
00b30a00	add w15,w15,w11
00b30a04	add w16,w2,w16
00b30a08	str w2,[sp, #0xb8]
00b30a0c	eor w2,w0,w2
00b30a10	eor w8,w15,w8
00b30a14	ror w2,w2,#0x10
00b30a18	ror w8,w8,#0x8
00b30a1c	eor w10,w25,w10
00b30a20	add w25,w2,w25
00b30a24	add w4,w8,w4
00b30a28	ldr w5,[sp, #0x2c]
00b30a2c	ror w10,w10,#0x7
00b30a30	str w9,[sp, #0x90]
00b30a34	eor w9,w25,w9
00b30a38	eor w11,w4,w11
00b30a3c	add w27,w10,w26
00b30a40	add w0,w0,w28
00b30a44	ror w9,w9,#0xc
00b30a48	ror w11,w11,#0x7
00b30a4c	add w12,w27,w12
00b30a50	add w0,w0,w9
00b30a54	add w27,w11,w19
00b30a58	eor w14,w16,w14
00b30a5c	eor w2,w0,w2
00b30a60	add w0,w27,w0
00b30a64	add w27,w29,w5
00b30a68	ror w14,w14,#0x7
00b30a6c	add w27,w27,w14
00b30a70	mov w20,w28
00b30a74	eor w17,w17,w27
00b30a78	ldr w28,[sp, #0x4c]
00b30a7c	eor w1,w12,w1
00b30a80	ldr w6,[sp, #0x6c]
00b30a84	ror w17,w17,#0x10
00b30a88	ror w1,w1,#0x10
00b30a8c	add w13,w17,w13
00b30a90	add w16,w1,w16
00b30a94	eor w14,w13,w14
00b30a98	eor w10,w16,w10
00b30a9c	add w27,w27,w28
00b30aa0	add w12,w12,w6
00b30aa4	ror w14,w14,#0xc
00b30aa8	ror w10,w10,#0xc
00b30aac	add w27,w27,w14
00b30ab0	add w12,w12,w10
00b30ab4	eor w17,w27,w17
00b30ab8	eor w1,w12,w1
00b30abc	ror w17,w17,#0x8
00b30ac0	ror w1,w1,#0x8
00b30ac4	ror w2,w2,#0x8
00b30ac8	add w13,w17,w13
00b30acc	str w1,[sp, #0xbc]
00b30ad0	add w16,w1,w16
00b30ad4	add w25,w2,w25
00b30ad8	eor w1,w0,w1
00b30adc	mov w22,w3
00b30ae0	eor w10,w16,w10
00b30ae4	eor w9,w25,w9
00b30ae8	eor w14,w13,w14
00b30aec	ror w1,w1,#0x10
00b30af0	add w27,w27,w18
00b30af4	add w12,w12,w24
00b30af8	ror w10,w10,#0x7
00b30afc	ror w9,w9,#0x7
00b30b00	ror w14,w14,#0x7
00b30b04	add w15,w15,w22
00b30b08	str w13,[sp, #0xac]
00b30b0c	add w13,w1,w13
00b30b10	add w12,w12,w9
00b30b14	add w27,w27,w10
00b30b18	stp w14,w11,[sp, #0x98]
00b30b1c	add w15,w15,w14
00b30b20	eor w11,w13,w11
00b30b24	eor w17,w12,w17
00b30b28	eor w8,w27,w8
00b30b2c	ldr w26,[sp, #0x50]
00b30b30	eor w2,w2,w15
00b30b34	add w0,w0,w30
00b30b38	ror w11,w11,#0xc
00b30b3c	ror w17,w17,#0x10
00b30b40	ror w8,w8,#0x10
00b30b44	ror w2,w2,#0x10
00b30b48	add w0,w0,w11
00b30b4c	str w16,[sp, #0xa8]
00b30b50	add w4,w17,w4
00b30b54	add w25,w8,w25
00b30b58	add w16,w2,w16
00b30b5c	eor w1,w0,w1
00b30b60	str w10,[sp, #0x94]
00b30b64	eor w9,w4,w9
00b30b68	eor w10,w25,w10
00b30b6c	eor w14,w16,w14
00b30b70	ror w1,w1,#0x8
00b30b74	add w12,w12,w28
00b30b78	add w27,w27,w26
00b30b7c	ror w9,w9,#0xc
00b30b80	ror w10,w10,#0xc
00b30b84	add w15,w15,w5
00b30b88	ror w14,w14,#0xc
00b30b8c	add w13,w1,w13
00b30b90	add w12,w12,w9
00b30b94	add w29,w27,w10
00b30b98	add w15,w15,w14
00b30b9c	eor w11,w13,w11
00b30ba0	eor w17,w12,w17
00b30ba4	eor w8,w29,w8
00b30ba8	eor w2,w15,w2
00b30bac	add w15,w15,w23
00b30bb0	ror w11,w11,#0x7
00b30bb4	ror w8,w8,#0x8
00b30bb8	ror w17,w17,#0x8
00b30bbc	add w15,w15,w11
00b30bc0	add w25,w8,w25
00b30bc4	stp w17,w8,[sp, #0xb0]
00b30bc8	eor w8,w15,w8
00b30bcc	ldr w18,[sp, #0x44]
00b30bd0	add w4,w17,w4
00b30bd4	ror w8,w8,#0x10
00b30bd8	stp w4,w25,[sp, #0xa0]
00b30bdc	eor w9,w4,w9
00b30be0	add w4,w8,w4
00b30be4	eor w11,w4,w11
00b30be8	ror w9,w9,#0x7
00b30bec	add w0,w0,w6
00b30bf0	add w15,w15,w18
00b30bf4	ror w11,w11,#0xc
00b30bf8	ror w2,w2,#0x8
00b30bfc	add w0,w0,w9
00b30c00	add w15,w15,w11
00b30c04	eor w10,w25,w10
00b30c08	add w16,w2,w16
00b30c0c	str w2,[sp, #0xb8]
00b30c10	eor w2,w0,w2
00b30c14	ldr w30,[sp, #0x54]
00b30c18	eor w8,w15,w8
00b30c1c	ror w10,w10,#0x7
00b30c20	ror w2,w2,#0x10
00b30c24	ror w8,w8,#0x8
00b30c28	add w27,w10,w21
00b30c2c	add w25,w2,w25
00b30c30	add w4,w8,w4
00b30c34	ldr w7,[sp, #0x58]
00b30c38	add w12,w27,w12
00b30c3c	str w9,[sp, #0x90]
00b30c40	eor w9,w25,w9
00b30c44	eor w11,w4,w11
00b30c48	add w0,w0,w30
00b30c4c	ror w9,w9,#0xc
00b30c50	ror w11,w11,#0x7
00b30c54	eor w1,w12,w1
00b30c58	add w0,w0,w9
00b30c5c	add w27,w11,w21
00b30c60	eor w14,w16,w14
00b30c64	ror w1,w1,#0x10
00b30c68	eor w2,w0,w2
00b30c6c	add w0,w27,w0
00b30c70	add w27,w29,w7
00b30c74	ror w14,w14,#0x7
00b30c78	add w16,w1,w16
00b30c7c	add w27,w27,w14
00b30c80	eor w10,w16,w10
00b30c84	mov w3,w19
00b30c88	eor w17,w17,w27
00b30c8c	ldr w19,[sp, #0x70]
00b30c90	add w12,w12,w20
00b30c94	ror w10,w10,#0xc
00b30c98	ror w17,w17,#0x10
00b30c9c	add w12,w12,w10
00b30ca0	add w13,w17,w13
00b30ca4	eor w1,w12,w1
00b30ca8	eor w14,w13,w14
00b30cac	ror w1,w1,#0x8
00b30cb0	add w27,w27,w19
00b30cb4	ror w14,w14,#0xc
00b30cb8	add w16,w1,w16
00b30cbc	add w27,w27,w14
00b30cc0	eor w10,w16,w10
00b30cc4	eor w17,w27,w17
00b30cc8	add w27,w27,w6
00b30ccc	ror w10,w10,#0x7
00b30cd0	add w27,w27,w10
00b30cd4	ror w2,w2,#0x8
00b30cd8	eor w8,w27,w8
00b30cdc	add w25,w2,w25
00b30ce0	ror w8,w8,#0x10
00b30ce4	eor w9,w25,w9
00b30ce8	add w25,w8,w25
00b30cec	add w12,w12,w28
00b30cf0	ror w9,w9,#0x7
00b30cf4	str w10,[sp, #0x94]
00b30cf8	eor w10,w25,w10
00b30cfc	ror w17,w17,#0x8
00b30d00	add w12,w12,w9
00b30d04	add w27,w27,w23
00b30d08	ror w10,w10,#0xc
00b30d0c	add w13,w17,w13
00b30d10	str w1,[sp, #0xbc]
00b30d14	eor w17,w12,w17
00b30d18	add w29,w27,w10
00b30d1c	eor w1,w0,w1
00b30d20	ror w17,w17,#0x10
00b30d24	eor w8,w29,w8
00b30d28	eor w14,w13,w14
00b30d2c	ror w1,w1,#0x10
00b30d30	add w4,w17,w4
00b30d34	ror w8,w8,#0x8
00b30d38	ror w14,w14,#0x7
00b30d3c	add w15,w15,w18
00b30d40	str w13,[sp, #0xac]
00b30d44	add w13,w1,w13
00b30d48	eor w9,w4,w9
00b30d4c	add w25,w8,w25
00b30d50	stp w14,w11,[sp, #0x98]
00b30d54	add w15,w15,w14
00b30d58	eor w11,w13,w11
00b30d5c	add w12,w12,w19
00b30d60	ror w9,w9,#0xc
00b30d64	eor w10,w25,w10
00b30d68	eor w2,w2,w15
00b30d6c	add w0,w0,w26
00b30d70	ror w11,w11,#0xc
00b30d74	add w12,w12,w9
00b30d78	ror w10,w10,#0x7
00b30d7c	ror w2,w2,#0x10
00b30d80	add w0,w0,w11
00b30d84	str w24,[sp, #0x28]
00b30d88	str w16,[sp, #0xa8]
00b30d8c	eor w17,w12,w17
00b30d90	add w27,w10,w22
00b30d94	mov w24,w22
00b30d98	add w16,w2,w16
00b30d9c	eor w1,w0,w1
00b30da0	ldr w22,[sp, #0x48]
00b30da4	eor w14,w16,w14
00b30da8	ror w17,w17,#0x8
00b30dac	ror w1,w1,#0x8
00b30db0	add w15,w15,w20
00b30db4	ror w14,w14,#0xc
00b30db8	add w4,w17,w4
00b30dbc	add w13,w1,w13
00b30dc0	add w15,w15,w14
00b30dc4	eor w9,w4,w9
00b30dc8	eor w11,w13,w11
00b30dcc	eor w2,w15,w2
00b30dd0	add w15,w15,w30
00b30dd4	ror w9,w9,#0x7
00b30dd8	add w0,w0,w22
00b30ddc	ror w11,w11,#0x7
00b30de0	ror w2,w2,#0x8
00b30de4	add w0,w0,w9
00b30de8	add w15,w15,w11
00b30dec	stp w17,w8,[sp, #0xb0]
00b30df0	add w16,w2,w16
00b30df4	str w2,[sp, #0xb8]
00b30df8	eor w2,w0,w2
00b30dfc	mov w6,w5
00b30e00	add w0,w0,w5
00b30e04	eor w8,w15,w8
00b30e08	ldr w5,[sp, #0x28]
00b30e0c	ror w8,w8,#0x10
00b30e10	stp w4,w25,[sp, #0xa0]
00b30e14	add w4,w8,w4
00b30e18	eor w11,w4,w11
00b30e1c	add w15,w15,w5
00b30e20	ror w11,w11,#0xc
00b30e24	add w15,w15,w11
00b30e28	eor w8,w15,w8
00b30e2c	mov w23,w18
00b30e30	ror w2,w2,#0x10
00b30e34	ror w8,w8,#0x8
00b30e38	ldr w18,[sp, #0x64]
00b30e3c	add w25,w2,w25
00b30e40	add w4,w8,w4
00b30e44	ldr w3,[sp, #0x5c]
00b30e48	add w12,w27,w12
00b30e4c	str w9,[sp, #0x90]
00b30e50	eor w9,w25,w9
00b30e54	eor w11,w4,w11
00b30e58	ror w9,w9,#0xc
00b30e5c	ror w11,w11,#0x7
00b30e60	eor w1,w12,w1
00b30e64	add w0,w0,w9
00b30e68	add w27,w11,w18
00b30e6c	eor w14,w16,w14
00b30e70	ror w1,w1,#0x10
00b30e74	eor w2,w0,w2
00b30e78	add w0,w27,w0
00b30e7c	add w27,w29,w3
00b30e80	ror w14,w14,#0x7
00b30e84	add w16,w1,w16
00b30e88	add w27,w27,w14
00b30e8c	eor w10,w16,w10
00b30e90	eor w17,w17,w27
00b30e94	add w12,w12,w7
00b30e98	ror w10,w10,#0xc
00b30e9c	ror w17,w17,#0x10
00b30ea0	add w12,w12,w10
00b30ea4	add w13,w17,w13
00b30ea8	eor w1,w12,w1
00b30eac	eor w14,w13,w14
00b30eb0	ror w1,w1,#0x8
00b30eb4	add w27,w27,w18
00b30eb8	ror w14,w14,#0xc
00b30ebc	add w16,w1,w16
00b30ec0	add w27,w27,w14
00b30ec4	eor w10,w16,w10
00b30ec8	eor w17,w27,w17
00b30ecc	add w27,w27,w7
00b30ed0	ror w10,w10,#0x7
00b30ed4	add w27,w27,w10
00b30ed8	ror w2,w2,#0x8
00b30edc	eor w8,w27,w8
00b30ee0	add w25,w2,w25
00b30ee4	ror w8,w8,#0x10
00b30ee8	eor w9,w25,w9
00b30eec	add w25,w8,w25
00b30ef0	str w10,[sp, #0x94]
00b30ef4	eor w10,w25,w10
00b30ef8	add w27,w27,w23
00b30efc	ror w10,w10,#0xc
00b30f00	add w29,w27,w10
00b30f04	ror w17,w17,#0x8
00b30f08	eor w8,w29,w8
00b30f0c	add w13,w17,w13
00b30f10	str w1,[sp, #0xbc]
00b30f14	ror w8,w8,#0x8
00b30f18	eor w1,w0,w1
00b30f1c	add w25,w8,w25
00b30f20	eor w14,w13,w14
00b30f24	ror w1,w1,#0x10
00b30f28	add w12,w12,w20
00b30f2c	ror w9,w9,#0x7
00b30f30	eor w10,w25,w10
00b30f34	ror w14,w14,#0x7
00b30f38	add w15,w15,w28
00b30f3c	str w13,[sp, #0xac]
00b30f40	add w13,w1,w13
00b30f44	add w12,w12,w9
00b30f48	ror w10,w10,#0x7
00b30f4c	stp w14,w11,[sp, #0x98]
00b30f50	add w15,w15,w14
00b30f54	eor w11,w13,w11
00b30f58	eor w17,w12,w17
00b30f5c	add w27,w10,w19
00b30f60	eor w2,w2,w15
00b30f64	ldr w19,[sp, #0x6c]
00b30f68	add w0,w0,w30
00b30f6c	ror w11,w11,#0xc
00b30f70	ror w17,w17,#0x10
00b30f74	ror w2,w2,#0x10
00b30f78	add w0,w0,w11
00b30f7c	str w16,[sp, #0xa8]
00b30f80	add w4,w17,w4
00b30f84	add w16,w2,w16
00b30f88	eor w1,w0,w1
00b30f8c	eor w9,w4,w9
00b30f90	eor w14,w16,w14
00b30f94	ror w1,w1,#0x8
00b30f98	add w12,w12,w6
00b30f9c	ror w9,w9,#0xc
00b30fa0	add w15,w15,w19
00b30fa4	ror w14,w14,#0xc
00b30fa8	add w13,w1,w13
00b30fac	add w12,w12,w9
00b30fb0	add w15,w15,w14
00b30fb4	eor w11,w13,w11
00b30fb8	eor w17,w12,w17
00b30fbc	eor w2,w15,w2
00b30fc0	add w15,w15,w22
00b30fc4	ror w11,w11,#0x7
00b30fc8	ror w17,w17,#0x8
00b30fcc	add w15,w15,w11
00b30fd0	stp w17,w8,[sp, #0xb0]
00b30fd4	eor w8,w15,w8
00b30fd8	add w4,w17,w4
00b30fdc	ror w8,w8,#0x10
00b30fe0	stp w4,w25,[sp, #0xa0]
00b30fe4	eor w9,w4,w9
00b30fe8	add w4,w8,w4
00b30fec	eor w11,w4,w11
00b30ff0	ror w9,w9,#0x7
00b30ff4	add w0,w0,w5
00b30ff8	add w15,w15,w3
00b30ffc	ror w11,w11,#0xc
00b31000	ror w2,w2,#0x8
00b31004	add w0,w0,w9
00b31008	add w15,w15,w11
00b3100c	add w16,w2,w16
00b31010	str w2,[sp, #0xb8]
00b31014	eor w2,w0,w2
00b31018	eor w8,w15,w8
00b3101c	mov w21,w30
00b31020	ror w2,w2,#0x10
00b31024	ror w8,w8,#0x8
00b31028	add w25,w2,w25
00b3102c	add w4,w8,w4
00b31030	ldr w21,[sp, #0x68]
00b31034	str w9,[sp, #0x90]
00b31038	eor w9,w25,w9
00b3103c	eor w11,w4,w11
00b31040	add w12,w27,w12
00b31044	add w0,w0,w26
00b31048	ror w9,w9,#0xc
00b3104c	ror w11,w11,#0x7
00b31050	add w0,w0,w9
00b31054	add w27,w11,w24
00b31058	eor w14,w16,w14
00b3105c	eor w1,w12,w1
00b31060	eor w2,w0,w2
00b31064	add w0,w27,w0
00b31068	add w27,w29,w21
00b3106c	ror w14,w14,#0x7
00b31070	ror w1,w1,#0x10
00b31074	add w27,w27,w14
00b31078	add w16,w1,w16
00b3107c	mov w7,w28
00b31080	mov w28,w22
00b31084	mov w22,w3
00b31088	mov w3,w24
00b3108c	eor w17,w17,w27
00b31090	ldr w24,[sp, #0x60]
00b31094	eor w10,w16,w10
00b31098	add w12,w12,w3
00b3109c	ror w17,w17,#0x10
00b310a0	ror w10,w10,#0xc
00b310a4	add w13,w17,w13
00b310a8	add w12,w12,w10
00b310ac	eor w14,w13,w14
00b310b0	eor w1,w12,w1
00b310b4	add w27,w27,w24
00b310b8	ror w29,w14,#0xc
00b310bc	ror w1,w1,#0x8
00b310c0	ror w2,w2,#0x8
00b310c4	add w14,w27,w29
00b310c8	add w27,w1,w16
00b310cc	add w16,w2,w25
00b310d0	mov w18,w23
00b310d4	eor w10,w27,w10
00b310d8	eor w9,w16,w9
00b310dc	eor w17,w14,w17
00b310e0	add w14,w14,w18
00b310e4	add w12,w12,w22
00b310e8	ror w10,w10,#0x7
00b310ec	ror w9,w9,#0x7
00b310f0	ror w17,w17,#0x8
00b310f4	add w12,w12,w9
00b310f8	add w14,w14,w10
00b310fc	add w13,w17,w13
00b31100	eor w17,w12,w17
00b31104	eor w8,w14,w8
00b31108	ror w17,w17,#0x10
00b3110c	ror w8,w8,#0x10
00b31110	add w4,w17,w4
00b31114	add w16,w8,w16
00b31118	str w10,[sp, #0x94]
00b3111c	eor w9,w4,w9
00b31120	eor w10,w16,w10
00b31124	add w25,w12,w21
00b31128	add w14,w14,w30
00b3112c	ror w12,w9,#0xc
00b31130	ror w9,w10,#0xc
00b31134	mov w23,w30
00b31138	add w30,w14,w9
00b3113c	eor w8,w30,w8
00b31140	ror w14,w8,#0x8
00b31144	add w10,w14,w16
00b31148	eor w8,w10,w9
00b3114c	eor w9,w13,w29
00b31150	ror w9,w9,#0x7
00b31154	add w15,w15,w6
00b31158	add w15,w15,w9
00b3115c	ror w16,w8,#0x7
00b31160	eor w2,w2,w15
00b31164	ldr w3,[sp, #0x64]
00b31168	add w25,w25,w12
00b3116c	add w8,w16,w7
00b31170	ror w2,w2,#0x10
00b31174	str w1,[sp, #0xbc]
00b31178	eor w17,w25,w17
00b3117c	add w8,w8,w25
00b31180	add w25,w2,w27
00b31184	eor w1,w0,w1
00b31188	stp w9,w11,[sp, #0x98]
00b3118c	eor w9,w25,w9
00b31190	ror w1,w1,#0x10
00b31194	str w13,[sp, #0xac]
00b31198	add w15,w15,w3
00b3119c	ror w9,w9,#0xc
00b311a0	add w13,w1,w13
00b311a4	str w20,[sp, #0x24]
00b311a8	add w15,w15,w9
00b311ac	eor w11,w13,w11
00b311b0	mov w21,w6
00b311b4	add w0,w0,w28
00b311b8	eor w2,w15,w2
00b311bc	ldr w6,[sp, #0x24]
00b311c0	ror w11,w11,#0xc
00b311c4	ror w2,w2,#0x8
00b311c8	add w0,w0,w11
00b311cc	add w25,w2,w25
00b311d0	eor w1,w0,w1
00b311d4	eor w9,w25,w9
00b311d8	ror w1,w1,#0x8
00b311dc	str w27,[sp, #0xa8]
00b311e0	add w27,w30,w6
00b311e4	ror w9,w9,#0x7
00b311e8	add w13,w1,w13
00b311ec	ror w17,w17,#0x8
00b311f0	add w27,w27,w9
00b311f4	eor w11,w13,w11
00b311f8	str w17,[sp, #0xb0]
00b311fc	add w4,w17,w4
00b31200	eor w17,w17,w27
00b31204	ldr w7,[sp, #0x58]
00b31208	add w15,w15,w19
00b3120c	ror w11,w11,#0x7
00b31210	ror w17,w17,#0x10
00b31214	add w15,w15,w11
00b31218	add w13,w17,w13
00b3121c	stp w14,w2,[sp, #0xb4]
00b31220	eor w14,w15,w14
00b31224	eor w9,w13,w9
00b31228	ror w14,w14,#0x10
00b3122c	add w27,w27,w7
00b31230	ror w9,w9,#0xc
00b31234	stp w4,w10,[sp, #0xa0]
00b31238	eor w12,w4,w12
00b3123c	add w4,w14,w4
00b31240	add w27,w27,w9
00b31244	eor w11,w4,w11
00b31248	mov w20,w5
00b3124c	mov w5,w26
00b31250	eor w17,w27,w17
00b31254	add w26,w27,w28
00b31258	add w15,w15,w24
00b3125c	ror w27,w11,#0xc
00b31260	add w0,w0,w5
00b31264	ror w12,w12,#0x7
00b31268	add w11,w15,w27
00b3126c	mov w18,w28
00b31270	eor w14,w11,w14
00b31274	add w15,w11,w7
00b31278	add w11,w0,w12
00b3127c	eor w0,w11,w2
00b31280	ldr w18,[sp, #0x70]
00b31284	ror w0,w0,#0x10
00b31288	add w10,w0,w10
00b3128c	str w12,[sp, #0x90]
00b31290	eor w12,w10,w12
00b31294	eor w1,w8,w1
00b31298	add w11,w11,w18
00b3129c	ror w12,w12,#0xc
00b312a0	ror w1,w1,#0x10
00b312a4	add w2,w11,w12
00b312a8	add w25,w1,w25
00b312ac	ror w11,w17,#0x8
00b312b0	eor w17,w2,w0
00b312b4	eor w16,w25,w16
00b312b8	ror w17,w17,#0x8
00b312bc	add w8,w8,w20
00b312c0	ror w16,w16,#0xc
00b312c4	add w0,w17,w10
00b312c8	add w8,w8,w16
00b312cc	eor w10,w0,w12
00b312d0	eor w1,w8,w1
00b312d4	add w8,w8,w5
00b312d8	ror w10,w10,#0x7
00b312dc	add w8,w8,w10
00b312e0	add w13,w11,w13
00b312e4	eor w12,w8,w11
00b312e8	add w11,w8,w20
00b312ec	ror w8,w1,#0x8
00b312f0	add w1,w8,w25
00b312f4	eor w16,w1,w16
00b312f8	ror w16,w16,#0x7
00b312fc	eor w9,w13,w9
00b31300	mov w5,w24
00b31304	ror w14,w14,#0x8
00b31308	add w24,w26,w16
00b3130c	ror w9,w9,#0x7
00b31310	add w4,w14,w4
00b31314	eor w14,w24,w14
00b31318	add w15,w15,w9
00b3131c	eor w17,w17,w15
00b31320	add w15,w15,w22
00b31324	eor w22,w4,w27
00b31328	ror w14,w14,#0x10
00b3132c	ror w22,w22,#0x7
00b31330	add w0,w14,w0
00b31334	add w20,w24,w5
00b31338	add w24,w22,w19
00b3133c	stp w16,w9,[sp, #0x94]
00b31340	eor w16,w0,w16
00b31344	add w2,w24,w2
00b31348	ror w16,w16,#0xc
00b3134c	str w8,[sp, #0xbc]
00b31350	eor w8,w2,w8
00b31354	add w7,w20,w16
00b31358	eor w14,w7,w14
00b3135c	ror w8,w8,#0x10
00b31360	add w2,w2,w18
00b31364	stp w1,w13,[sp, #0xa8]
00b31368	ror w17,w17,#0x10
00b3136c	add w13,w8,w13
00b31370	ror w12,w12,#0x10
00b31374	ror w14,w14,#0x8
00b31378	ldr w18,[sp, #0x68]
00b3137c	add w1,w17,w1
00b31380	eor w20,w13,w22
00b31384	add w4,w12,w4
00b31388	add w0,w14,w0
00b3138c	eor w9,w1,w9
00b31390	ror w20,w20,#0xc
00b31394	eor w10,w4,w10
00b31398	eor w16,w0,w16
00b3139c	ror w9,w9,#0xc
00b313a0	add w2,w2,w20
00b313a4	ror w10,w10,#0xc
00b313a8	ror w16,w16,#0x7
00b313ac	add w15,w15,w9
00b313b0	eor w8,w2,w8
00b313b4	add w11,w11,w10
00b313b8	add w18,w16,w18
00b313bc	eor w17,w15,w17
00b313c0	eor w12,w11,w12
00b313c4	add w11,w18,w11
00b313c8	ror w8,w8,#0x8
00b313cc	ror w17,w17,#0x8
00b313d0	add w13,w8,w13
00b313d4	eor w8,w11,w8
00b313d8	add w1,w17,w1
00b313dc	ror w8,w8,#0x10
00b313e0	eor w9,w1,w9
00b313e4	add w1,w8,w1
00b313e8	eor w16,w1,w16
00b313ec	add w11,w11,w21
00b313f0	ror w16,w16,#0xc
00b313f4	add w11,w11,w16
00b313f8	add w15,w15,w3
00b313fc	ror w12,w12,#0x8
00b31400	ldr w3,[sp, #0x44]
00b31404	eor w8,w11,w8
00b31408	add w18,w12,w4
00b3140c	ror w8,w8,#0x8
00b31410	add w7,w7,w23
00b31414	ror w9,w9,#0x7
00b31418	eor w10,w18,w10
00b3141c	str w8,[sp, #0xbc]
00b31420	add w8,w8,w1
00b31424	add w2,w2,w6
00b31428	add w4,w7,w9
00b3142c	ror w10,w10,#0x7
00b31430	str w8,[sp, #0xa8]
00b31434	eor w8,w8,w16
00b31438	stp w12,w14,[sp, #0xb0]
00b3143c	eor w12,w12,w4
00b31440	add w4,w4,w3
00b31444	add w2,w2,w10
00b31448	ldr w3,[sp, #0x74]
00b3144c	ror w8,w8,#0x7
00b31450	str w17,[sp, #0xb8]
00b31454	eor w17,w2,w17
00b31458	eor w5,w13,w20
00b3145c	str w8,[sp, #0x94]
00b31460	ror w8,w12,#0x10
00b31464	ror w5,w5,#0x7
00b31468	add w12,w8,w13
00b3146c	ror w13,w17,#0x10
00b31470	add w15,w15,w5
00b31474	eor w9,w12,w9
00b31478	add w16,w13,w0
00b3147c	str w10,[sp, #0x90]
00b31480	add w2,w2,w3
00b31484	eor w14,w15,w14
00b31488	ldr w3,[sp, #0x4c]
00b3148c	ror w9,w9,#0xc
00b31490	eor w10,w16,w10
00b31494	stp w18,w0,[sp, #0xa0]
00b31498	add w17,w4,w9
00b3149c	ror w0,w10,#0xc
00b314a0	ror w10,w14,#0x10
00b314a4	eor w8,w17,w8
00b314a8	add w18,w10,w18
00b314ac	ror w8,w8,#0x8
00b314b0	eor w1,w18,w5
00b314b4	add w15,w15,w3
00b314b8	add w12,w8,w12
00b314bc	ror w1,w1,#0xc
00b314c0	add w14,w2,w0
00b314c4	eor w9,w12,w9
00b314c8	add w15,w15,w1
00b314cc	eor w13,w14,w13
00b314d0	ror w9,w9,#0x7
00b314d4	eor w10,w15,w10
00b314d8	ldr x2,[sp, #0x30]
00b314dc	ror w13,w13,#0x8
00b314e0	str w9,[sp, #0x98]
00b314e4	ror w9,w10,#0x8
00b314e8	add w16,w13,w16
00b314ec	add w18,w9,w18
00b314f0	str w22,[sp, #0x9c]
00b314f4	str w11,[sp, #0x80]
00b314f8	stp w12,w8,[sp, #0xac]
00b314fc	stp w9,w13,[sp, #0xb4]
00b31500	stp w18,w16,[sp, #0xa0]
00b31504	ldr w10,[x2]
00b31508	mov w28,w19
00b3150c	eor w10,w10,w18
00b31510	eor w10,w10,w11
00b31514	ldr w11,[x2, #0x4]
00b31518	str w10,[x2]
00b3151c	eor w11,w11,w16
00b31520	eor w11,w11,w17
00b31524	stp w10,w11,[sp, #0x80]
00b31528	str w11,[x2, #0x4]
00b3152c	ldr w11,[sp, #0xa8]
00b31530	ldr w17,[x2, #0x8]
00b31534	eor w11,w17,w11
00b31538	eor w11,w11,w15
00b3153c	str w11,[sp, #0x88]
00b31540	ldr w15,[x2, #0xc]
00b31544	str w11,[x2, #0x8]
00b31548	eor w11,w15,w12
00b3154c	ldr w12,[x2, #0x10]
00b31550	eor w11,w11,w14
00b31554	eor w14,w16,w0
00b31558	str w11,[x2, #0xc]
00b3155c	eor w8,w12,w8
00b31560	eor w6,w8,w14, ROR #0x7
00b31564	stp w11,w6,[sp, #0x8c]
00b31568	ldr w8,[x2, #0x14]
00b3156c	ldr w11,[sp, #0x94]
00b31570	eor w8,w8,w9
00b31574	eor w8,w8,w11
00b31578	str w8,[sp, #0x94]
00b3157c	stp w6,w8,[x2, #0x10]
00b31580	ldr w8,[x2, #0x18]
00b31584	ldr w9,[sp, #0x98]
00b31588	eor w11,w18,w1
00b3158c	eor w8,w8,w13
00b31590	eor w8,w8,w9
00b31594	str w8,[sp, #0x98]
00b31598	str w8,[x2, #0x18]
00b3159c	ldr w8,[sp, #0xbc]
00b315a0	ldr w9,[x2, #0x1c]
00b315a4	eor w8,w9,w8
00b315a8	eor w8,w8,w11, ROR #0x7
00b315ac	ldr x9,[sp, #0x78]
00b315b0	ldr x11,[sp, #0x38]
00b315b4	str w8,[sp, #0x9c]
00b315b8	str w8,[x2, #0x1c]
00b315bc	add x9,x9,x11
00b315c0	str x9,[sp, #0x78]
00b315c4	ldr x9,[sp, #0x18]
00b315c8	ldr x11,[sp, #0x78]
00b315cc	cmp x9,x11
00b315d0	ldr x9,[sp, #0x78]
00b315d4	b.ne 0x00b2ffdc
00b315d8	ldp x29,x30,[sp, #0x150]
00b315dc	ldp x20,x19,[sp, #0x140]
00b315e0	ldp x22,x21,[sp, #0x130]
00b315e4	ldp x24,x23,[sp, #0x120]
00b315e8	ldp x26,x25,[sp, #0x110]
00b315ec	ldp x28,x27,[sp, #0x100]
00b315f0	add sp,sp,#0x160
00b315f4	ret
