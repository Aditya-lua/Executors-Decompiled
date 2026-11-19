; mbedtls_aria_setkey_enc @ 00b70134
00b70134	sub sp,sp,#0xb0
00b70138	stp x28,x27,[sp, #0x50]
00b7013c	stp x26,x25,[sp, #0x60]
00b70140	stp x24,x23,[sp, #0x70]
00b70144	stp x22,x21,[sp, #0x80]
00b70148	stp x20,x19,[sp, #0x90]
00b7014c	stp x29,x30,[sp, #0xa0]
00b70150	add x29,sp,#0xa0
00b70154	mrs x9,tpidr_el0
00b70158	ldr x8,[x9, #0x28]
00b7015c	subs w18,w2,#0x80
00b70160	str x8,[sp, #0x48]
00b70164	b.eq 0x00b70178
00b70168	cmp w2,#0x100
00b7016c	b.eq 0x00b70178
00b70170	cmp w2,#0xc0
00b70174	b.ne 0x00b70820
00b70178	str x9,[sp]
00b7017c	ldp w8,w9,[x1]
00b70180	cmp w2,#0xbf
00b70184	stp w8,w9,[sp, #0x8]
00b70188	ldp w10,w11,[x1, #0x8]
00b7018c	stp xzr,xzr,[sp, #0x18]
00b70190	stp w10,w11,[sp, #0x10]
00b70194	b.ls 0x00b701b0
00b70198	ldr x12,[x1, #0x10]
00b7019c	cmp w2,#0x100
00b701a0	str x12,[sp, #0x18]
00b701a4	b.ne 0x00b701b0
00b701a8	ldr x12,[x1, #0x18]
00b701ac	str x12,[sp, #0x20]
00b701b0	adrp x17,0x77d000
00b701b4	lsr w1,w18,#0x6
00b701b8	add x17,x17,#0x6ec
00b701bc	cmp w18,#0x80
00b701c0	lsl w18,w1,#0x1
00b701c4	add x3,x17,w1, UXTW  #0x4
00b701c8	csinc w5,wzr,w1,cs
00b701cc	add w4,w18,#0xc
00b701d0	ldp w18,w1,[x3]
00b701d4	ldp w2,w3,[x3, #0x8]
00b701d8	mov x12,x0
00b701dc	add w7,w5,#0x1
00b701e0	cmp w5,#0x2
00b701e4	adrp x13,0x77d000
00b701e8	adrp x14,0x77d000
00b701ec	add x6,x17,w5, UXTW  #0x4
00b701f0	strb w4,[x12], #0x84
00b701f4	csel x5,x7,xzr,cc
00b701f8	eor w18,w18,w8
00b701fc	add x13,x13,#0x71c
00b70200	add x14,x14,#0x81c
00b70204	ldp w21,w22,[x6]
00b70208	ldp w20,w4,[x6, #0x8]
00b7020c	add x17,x17,x5, LSL #0x4
00b70210	eor w6,w3,w11
00b70214	and w3,w18,#0xff
00b70218	ubfx w5,w18,#0x8,#0x8
00b7021c	ldrb w26,[x13, w3, UXTW ]
00b70220	ldrb w3,[x14, w5, UXTW ]
00b70224	adrp x15,0x77d000
00b70228	eor w1,w1,w9
00b7022c	eor w2,w2,w10
00b70230	add x15,x15,#0x91c
00b70234	and w24,w1,#0xff
00b70238	ubfx w25,w1,#0x8,#0x8
00b7023c	and w27,w2,#0xff
00b70240	bfm w26,w3,#0x18,#0x7
00b70244	ubfx w3,w2,#0x10,#0x8
00b70248	adrp x16,0x77d000
00b7024c	ldrb w24,[x13, w24, UXTW ]
00b70250	ldrb w25,[x14, w25, UXTW ]
00b70254	ldrb w27,[x13, w27, UXTW ]
00b70258	ldrb w3,[x15, w3, UXTW ]
00b7025c	add x16,x16,#0xa1c
00b70260	ubfx w28,w2,#0x8,#0x8
00b70264	lsr w2,w2,#0x18
00b70268	ldrb w28,[x14, w28, UXTW ]
00b7026c	ldrb w2,[x16, w2, UXTW ]
00b70270	bfm w24,w25,#0x18,#0x7
00b70274	and w25,w6,#0xff
00b70278	bfm w27,w3,#0x10,#0xf
00b7027c	ubfx w3,w6,#0x8,#0x8
00b70280	ldrb w19,[x13, w25, UXTW ]
00b70284	ldrb w3,[x14, w3, UXTW ]
00b70288	bfm w28,w2,#0x10,#0x7
00b7028c	ubfx w2,w6,#0x10,#0x8
00b70290	ldrb w2,[x15, w2, UXTW ]
00b70294	ubfx w5,w1,#0x10,#0x8
00b70298	bfm w19,w3,#0x18,#0x7
00b7029c	ldrb w5,[x15, w5, UXTW ]
00b702a0	mov w25,w19
00b702a4	lsr w1,w1,#0x18
00b702a8	bfm w25,w2,#0x10,#0x7
00b702ac	lsr w2,w6,#0x18
00b702b0	ldrb w1,[x16, w1, UXTW ]
00b702b4	ubfx w7,w18,#0x10,#0x8
00b702b8	ldrb w2,[x16, w2, UXTW ]
00b702bc	ldrb w7,[x15, w7, UXTW ]
00b702c0	orr w27,w28,w27, LSL #0x8
00b702c4	mov w28,w24
00b702c8	lsr w18,w18,#0x18
00b702cc	bfm w28,w5,#0x10,#0x7
00b702d0	ldrb w18,[x16, w18, UXTW ]
00b702d4	ldr w23,[sp, #0x18]
00b702d8	bfm w28,w1,#0x8,#0x7
00b702dc	mov w30,w26
00b702e0	bfm w25,w2,#0x8,#0x7
00b702e4	eor w2,w27,w28
00b702e8	bfm w30,w7,#0x10,#0x7
00b702ec	ldp w3,w5,[x17]
00b702f0	ldp w7,w6,[x17, #0x8]
00b702f4	extr w17,w24,w28,#0x10
00b702f8	lsr w24,w2,#0x8
00b702fc	lsl w2,w2,#0x8
00b70300	bfm w30,w18,#0x8,#0x7
00b70304	and w24,w24,#0xff00ff
00b70308	and w2,w2,#0xff00ff00
00b7030c	extr w18,w19,w25,#0x10
00b70310	rev w1,w25
00b70314	extr w19,w26,w30,#0x10
00b70318	orr w2,w24,w2
00b7031c	lsr w24,w17,#0x8
00b70320	eor w23,w23,w17
00b70324	lsl w17,w17,#0x8
00b70328	eor w1,w1,w19
00b7032c	and w24,w24,#0xff00ff
00b70330	and w17,w17,#0xff00ff00
00b70334	eor w18,w18,w27, ROR #0x10
00b70338	orr w17,w24,w17
00b7033c	eor w1,w1,w2
00b70340	eor w17,w17,w19
00b70344	eor w2,w1,w18, ROR #0x10
00b70348	rev w19,w1
00b7034c	eor w24,w17,w27
00b70350	eor w17,w25,w17
00b70354	lsr w25,w2,#0x8
00b70358	lsl w2,w2,#0x8
00b7035c	eor w19,w24,w19
00b70360	rev w24,w17
00b70364	and w17,w25,#0xff00ff
00b70368	and w2,w2,#0xff00ff00
00b7036c	orr w17,w17,w2
00b70370	eor w17,w23,w17
00b70374	eor w2,w17,w21
00b70378	ldr w21,[sp, #0x1c]
00b7037c	and w23,w2,#0xff
00b70380	ubfx w25,w2,#0x8,#0x8
00b70384	ldrb w23,[x15, w23, UXTW ]
00b70388	ldrb w25,[x16, w25, UXTW ]
00b7038c	ubfx w26,w2,#0x10,#0x8
00b70390	lsr w2,w2,#0x18
00b70394	ldrb w26,[x13, w26, UXTW ]
00b70398	ldrb w2,[x14, w2, UXTW ]
00b7039c	eor w21,w21,w30
00b703a0	eor w18,w21,w18
00b703a4	bfm w23,w25,#0x18,#0x7
00b703a8	eor w18,w18,w1
00b703ac	mov w21,w23
00b703b0	eor w22,w22,w18
00b703b4	bfm w21,w26,#0x10,#0x7
00b703b8	bfm w21,w2,#0x8,#0x7
00b703bc	and w2,w22,#0xff
00b703c0	ubfx w26,w22,#0x8,#0x8
00b703c4	ldr w25,[sp, #0x20]
00b703c8	ldrb w2,[x15, w2, UXTW ]
00b703cc	ldrb w26,[x16, w26, UXTW ]
00b703d0	ubfx w27,w22,#0x10,#0x8
00b703d4	lsr w22,w22,#0x18
00b703d8	ldrb w27,[x13, w27, UXTW ]
00b703dc	ldrb w22,[x14, w22, UXTW ]
00b703e0	eor w24,w24,w25
00b703e4	bfm w2,w26,#0x18,#0x7
00b703e8	eor w1,w24,w1, ROR #0x10
00b703ec	mov w24,w2
00b703f0	eor w20,w20,w1
00b703f4	bfm w24,w27,#0x10,#0x7
00b703f8	and w26,w20,#0xff
00b703fc	bfm w24,w22,#0x8,#0x7
00b70400	ubfx w22,w20,#0x10,#0x8
00b70404	ldr w25,[sp, #0x24]
00b70408	ldrb w26,[x15, w26, UXTW ]
00b7040c	ldrb w22,[x13, w22, UXTW ]
00b70410	ubfx w27,w20,#0x8,#0x8
00b70414	lsr w20,w20,#0x18
00b70418	ldrb w27,[x16, w27, UXTW ]
00b7041c	ldrb w20,[x14, w20, UXTW ]
00b70420	extr w28,w2,w24,#0x10
00b70424	eor w2,w19,w25
00b70428	lsr w19,w28,#0x8
00b7042c	bfm w26,w22,#0x10,#0xf
00b70430	lsl w22,w28,#0x8
00b70434	and w19,w19,#0xff00ff
00b70438	and w22,w22,#0xff00ff00
00b7043c	eor w4,w4,w2
00b70440	bfm w27,w20,#0x10,#0x7
00b70444	orr w19,w19,w22
00b70448	and w20,w4,#0xff
00b7044c	ubfx w22,w4,#0x8,#0x8
00b70450	ldrb w20,[x15, w20, UXTW ]
00b70454	ldrb w22,[x16, w22, UXTW ]
00b70458	orr w26,w27,w26, LSL #0x8
00b7045c	ubfx w27,w4,#0x10,#0x8
00b70460	lsr w4,w4,#0x18
00b70464	ldrb w27,[x13, w27, UXTW ]
00b70468	eor w24,w26,w24
00b7046c	ldrb w4,[x14, w4, UXTW ]
00b70470	bfm w20,w22,#0x18,#0x7
00b70474	lsr w22,w24,#0x8
00b70478	lsl w24,w24,#0x8
00b7047c	and w22,w22,#0xff00ff
00b70480	and w24,w24,#0xff00ff00
00b70484	orr w22,w22,w24
00b70488	mov w24,w20
00b7048c	bfm w24,w27,#0x10,#0x7
00b70490	extr w23,w23,w21,#0x10
00b70494	bfm w24,w4,#0x8,#0x7
00b70498	eor w19,w19,w23
00b7049c	eor w27,w26,w11
00b704a0	extr w4,w20,w24,#0x10
00b704a4	rev w20,w24
00b704a8	eor w27,w27,w19
00b704ac	eor w19,w24,w19
00b704b0	eor w20,w20,w23
00b704b4	eor w21,w21,w9
00b704b8	eor w4,w4,w26, ROR #0x10
00b704bc	rev w19,w19
00b704c0	eor w20,w20,w22
00b704c4	eor w21,w21,w4
00b704c8	eor w19,w19,w10
00b704cc	eor w4,w20,w4, ROR #0x10
00b704d0	rev w22,w20
00b704d4	eor w21,w21,w20
00b704d8	eor w19,w19,w20, ROR #0x10
00b704dc	lsr w20,w4,#0x8
00b704e0	lsl w4,w4,#0x8
00b704e4	and w20,w20,#0xff00ff
00b704e8	and w4,w4,#0xff00ff00
00b704ec	eor w25,w28,w8
00b704f0	orr w4,w20,w4
00b704f4	eor w22,w27,w22
00b704f8	eor w4,w25,w4
00b704fc	eor w5,w21,w5
00b70500	eor w7,w19,w7
00b70504	eor w6,w22,w6
00b70508	eor w3,w4,w3
00b7050c	and w23,w5,#0xff
00b70510	ubfx w24,w5,#0x8,#0x8
00b70514	and w27,w7,#0xff
00b70518	stp w4,w21,[sp, #0x28]
00b7051c	and w21,w6,#0xff
00b70520	and w4,w3,#0xff
00b70524	ubfx w20,w7,#0x8,#0x8
00b70528	ldrb w23,[x13, w23, UXTW ]
00b7052c	ldrb w24,[x14, w24, UXTW ]
00b70530	ldrb w27,[x13, w27, UXTW ]
00b70534	stp w19,w22,[sp, #0x30]
00b70538	ubfx w19,w6,#0x8,#0x8
00b7053c	ldrb w21,[x13, w21, UXTW ]
00b70540	ldrb w4,[x13, w4, UXTW ]
00b70544	ubfx w13,w3,#0x8,#0x8
00b70548	ubfx w26,w5,#0x10,#0x8
00b7054c	ubfx w25,w7,#0x10,#0x8
00b70550	ldrb w20,[x14, w20, UXTW ]
00b70554	ubfx w22,w6,#0x10,#0x8
00b70558	ldrb w19,[x14, w19, UXTW ]
00b7055c	ldrb w28,[x14, w13, UXTW ]
00b70560	ubfx w13,w3,#0x10,#0x8
00b70564	lsr w14,w7,#0x18
00b70568	ldrb w26,[x15, w26, UXTW ]
00b7056c	ldrb w25,[x15, w25, UXTW ]
00b70570	ldrb w22,[x15, w22, UXTW ]
00b70574	ldrb w15,[x15, w13, UXTW ]
00b70578	lsr w13,w5,#0x18
00b7057c	ldrb w7,[x16, w14, UXTW ]
00b70580	ldrb w5,[x16, w13, UXTW ]
00b70584	lsr w13,w6,#0x18
00b70588	ldrb w6,[x16, w13, UXTW ]
00b7058c	bfm w23,w24,#0x18,#0x7
00b70590	lsr w13,w3,#0x18
00b70594	mov w3,w23
00b70598	bfm w21,w19,#0x18,#0x7
00b7059c	ldrb w16,[x16, w13, UXTW ]
00b705a0	bfm w27,w25,#0x10,#0xf
00b705a4	bfm w20,w7,#0x10,#0x7
00b705a8	bfm w3,w26,#0x10,#0x7
00b705ac	mov w19,w21
00b705b0	orr w7,w20,w27, LSL #0x8
00b705b4	bfm w3,w5,#0x8,#0x7
00b705b8	bfm w19,w22,#0x10,#0x7
00b705bc	bfm w4,w28,#0x18,#0x7
00b705c0	bfm w19,w6,#0x8,#0x7
00b705c4	extr w5,w23,w3,#0x10
00b705c8	eor w3,w7,w3
00b705cc	mov w6,w4
00b705d0	lsr w22,w3,#0x8
00b705d4	lsl w3,w3,#0x8
00b705d8	bfm w6,w15,#0x10,#0x7
00b705dc	extr w21,w21,w19,#0x10
00b705e0	lsr w23,w5,#0x8
00b705e4	lsl w24,w5,#0x8
00b705e8	and w15,w22,#0xff00ff
00b705ec	and w3,w3,#0xff00ff00
00b705f0	bfm w6,w16,#0x8,#0x7
00b705f4	eor w20,w7,w2
00b705f8	rev w19,w19
00b705fc	eor w7,w21,w7, ROR #0x10
00b70600	and w21,w23,#0xff00ff
00b70604	and w22,w24,#0xff00ff00
00b70608	orr w15,w15,w3
00b7060c	extr w3,w4,w6,#0x10
00b70610	orr w16,w21,w22
00b70614	eor w4,w6,w18
00b70618	eor w6,w19,w3
00b7061c	eor w16,w16,w3
00b70620	eor w15,w6,w15
00b70624	eor w3,w4,w7
00b70628	rev w4,w16
00b7062c	eor w6,w15,w7, ROR #0x10
00b70630	eor w16,w20,w16
00b70634	rev w7,w15
00b70638	eor w4,w4,w1
00b7063c	lsr w20,w6,#0x8
00b70640	lsl w6,w6,#0x8
00b70644	eor w4,w4,w19
00b70648	eor w16,w16,w7
00b7064c	and w7,w20,#0xff00ff
00b70650	and w6,w6,#0xff00ff00
00b70654	add x13,sp,#0x8
00b70658	eor w5,w5,w17
00b7065c	eor w3,w3,w15
00b70660	eor w15,w4,w15, ROR #0x10
00b70664	orr w4,w7,w6
00b70668	add x14,x13,#0x8
00b7066c	eor w4,w5,w4
00b70670	stp w15,w16,[sp, #0x40]
00b70674	mov w15,#0x1
00b70678	stp w17,w18,[sp, #0x18]
00b7067c	str w1,[sp, #0x20]
00b70680	str w2,[sp, #0x24]
00b70684	stp w4,w3,[sp, #0x38]
00b70688	and x16,x15,#0x3
00b7068c	add x16,x13,x16, LSL #0x4
00b70690	ldr w3,[x16, #0xc]
00b70694	ldr w4,[x16]
00b70698	ldp w5,w21,[x14, #-0x8]
00b7069c	add x15,x15,#0x1
00b706a0	rev w3,w3
00b706a4	rev w4,w4
00b706a8	extr w6,w3,w4,#0x13
00b706ac	rev w6,w6
00b706b0	eor w6,w6,w5
00b706b4	stur w6,[x12, #-0x80]
00b706b8	ldr w6,[x16, #0x4]
00b706bc	extr w7,w3,w4,#0x1f
00b706c0	extr w19,w3,w4,#0x3
00b706c4	extr w20,w3,w4,#0x1
00b706c8	rev w6,w6
00b706cc	extr w22,w4,w6,#0x13
00b706d0	rev w22,w22
00b706d4	eor w22,w22,w21
00b706d8	stur w22,[x12, #-0x7c]
00b706dc	ldr w16,[x16, #0x8]
00b706e0	extr w22,w4,w6,#0x1f
00b706e4	extr w23,w4,w6,#0x3
00b706e8	extr w4,w4,w6,#0x1
00b706ec	rev w16,w16
00b706f0	extr w28,w6,w16,#0x3
00b706f4	extr w24,w6,w16,#0x13
00b706f8	extr w25,w16,w3,#0x13
00b706fc	extr w26,w6,w16,#0x1f
00b70700	extr w27,w16,w3,#0x1f
00b70704	extr w30,w16,w3,#0x3
00b70708	extr w6,w6,w16,#0x1
00b7070c	extr w16,w16,w3,#0x1
00b70710	rev w3,w7
00b70714	rev w7,w22
00b70718	rev w4,w4
00b7071c	rev w22,w28
00b70720	eor w3,w3,w5
00b70724	eor w4,w4,w5
00b70728	eor w5,w22,w5
00b7072c	ldr w22,[x14]
00b70730	rev w28,w30
00b70734	rev w6,w6
00b70738	eor w7,w7,w21
00b7073c	eor w28,w28,w21
00b70740	eor w6,w6,w21
00b70744	rev w21,w24
00b70748	eor w21,w21,w22
00b7074c	stur w21,[x12, #-0x78]
00b70750	ldr w21,[x14, #0x4]
00b70754	rev w19,w19
00b70758	rev w24,w26
00b7075c	rev w16,w16
00b70760	stp w3,w7,[x12, #-0x40]
00b70764	stp w5,w28,[x12]
00b70768	rev w3,w20
00b7076c	rev w5,w23
00b70770	rev w7,w25
00b70774	rev w20,w27
00b70778	eor w19,w22,w19
00b7077c	eor w24,w24,w22
00b70780	eor w16,w16,w22
00b70784	stp w4,w6,[x12, #0x40]
00b70788	eor w4,w7,w21
00b7078c	eor w6,w20,w21
00b70790	eor w5,w21,w5
00b70794	eor w3,w21,w3
00b70798	cmp x15,#0x5
00b7079c	add x14,x14,#0x10
00b707a0	stur w4,[x12, #-0x74]
00b707a4	stp w24,w6,[x12, #-0x38]
00b707a8	stp w19,w5,[x12, #0x8]
00b707ac	stp w16,w3,[x12, #0x48]
00b707b0	add x12,x12,#0x10
00b707b4	b.ne 0x00b70688
00b707b8	rev w12,w17
00b707bc	rev w13,w18
00b707c0	rev w14,w1
00b707c4	rev w15,w2
00b707c8	extr w16,w12,w13,#0xd
00b707cc	extr w13,w13,w14,#0xd
00b707d0	extr w14,w14,w15,#0xd
00b707d4	extr w12,w15,w12,#0xd
00b707d8	rev w15,w16
00b707dc	rev w13,w13
00b707e0	rev w14,w14
00b707e4	rev w12,w12
00b707e8	eor w8,w15,w8
00b707ec	eor w9,w13,w9
00b707f0	eor w10,w14,w10
00b707f4	eor w11,w12,w11
00b707f8	str w8,[x0, #0x104]
00b707fc	str w9,[x0, #0x108]
00b70800	str w10,[x0, #0x10c]
00b70804	str w11,[x0, #0x110]
00b70808	add x0,sp,#0x8
00b7080c	mov w1,#0x40
00b70810	bl 0x00c42220
00b70814	ldr x9,[sp]
00b70818	mov w0,wzr
00b7081c	b 0x00b70824
00b70820	mov w0,#0xffffffa4
00b70824	ldr x8,[x9, #0x28]
00b70828	ldr x9,[sp, #0x48]
00b7082c	cmp x8,x9
00b70830	b.ne 0x00b70854
00b70834	ldp x29,x30,[sp, #0xa0]
00b70838	ldp x20,x19,[sp, #0x90]
00b7083c	ldp x22,x21,[sp, #0x80]
00b70840	ldp x24,x23,[sp, #0x70]
00b70844	ldp x26,x25,[sp, #0x60]
00b70848	ldp x28,x27,[sp, #0x50]
00b7084c	add sp,sp,#0xb0
00b70850	ret
00b70854	bl 0x00c2fec0
