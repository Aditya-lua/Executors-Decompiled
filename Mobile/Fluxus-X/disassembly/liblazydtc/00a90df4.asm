; CAST_set_key @ 00a90df4
00a90df4	sub sp,sp,#0x160
00a90df8	cmp w1,#0x10
00a90dfc	mov w8,#0x10
00a90e00	movi v0.2D,#0x0
00a90e04	csel w17,w1,w8,lt
00a90e08	cmp w1,#0x0
00a90e0c	stp x28,x27,[sp, #0x100]
00a90e10	stp x26,x25,[sp, #0x110]
00a90e14	stp x24,x23,[sp, #0x120]
00a90e18	stp x22,x21,[sp, #0x130]
00a90e1c	stp x20,x19,[sp, #0x140]
00a90e20	stp x29,x30,[sp, #0x150]
00a90e24	stp q0,q0,[sp, #0xe0]
00a90e28	stp q0,q0,[sp, #0xc0]
00a90e2c	b.le 0x00a90eec
00a90e30	sxtw x9,w17
00a90e34	cmp x9,#0x1
00a90e38	csinc x11,x9,xzr,gt
00a90e3c	cmp x11,#0x2
00a90e40	mov x10,xzr
00a90e44	b.cc 0x00a90e7c
00a90e48	and x10,x11,#0x7ffffffffffffffe
00a90e4c	add x13,sp,#0xc0
00a90e50	add x12,x2,#0x1
00a90e54	orr x13,x13,#0x4
00a90e58	mov x14,x10
00a90e5c	ldurb w15,[x12, #-0x1]
00a90e60	ldrb w16,[x12], #0x2
00a90e64	subs x14,x14,#0x2
00a90e68	stp w15,w16,[x13, #-0x4]
00a90e6c	add x13,x13,#0x8
00a90e70	b.ne 0x00a90e5c
00a90e74	cmp x11,x10
00a90e78	b.eq 0x00a90e94
00a90e7c	add x11,sp,#0xc0
00a90e80	ldrb w12,[x2, x10]
00a90e84	str w12,[x11, x10, LSL #0x2]
00a90e88	add x10,x10,#0x1
00a90e8c	cmp x10,x9
00a90e90	b.lt 0x00a90e80
00a90e94	ldp w9,w14,[sp, #0xc0]
00a90e98	ldp w15,w11,[sp, #0xc8]
00a90e9c	ldp w18,w2,[sp, #0xd0]
00a90ea0	ldp w3,w12,[sp, #0xd8]
00a90ea4	ldp w10,w13,[sp, #0xe0]
00a90ea8	ldp w24,w8,[sp, #0xe8]
00a90eac	ldp w5,w6,[sp, #0xf0]
00a90eb0	ldp w4,w16,[sp, #0xf8]
00a90eb4	lsl w22,w9,#0x18
00a90eb8	lsl w23,w14,#0x10
00a90ebc	lsl w14,w15,#0x8
00a90ec0	lsl w20,w18,#0x18
00a90ec4	lsl w21,w2,#0x10
00a90ec8	lsl w15,w3,#0x8
00a90ecc	lsl w7,w10,#0x18
00a90ed0	lsl w19,w13,#0x10
00a90ed4	lsl w18,w24,#0x8
00a90ed8	lsl w9,w5,#0x18
00a90edc	lsl w3,w6,#0x10
00a90ee0	lsl w2,w4,#0x8
00a90ee4	str x8,[sp, #0x30]
00a90ee8	b 0x00a90f44
00a90eec	str xzr,[sp, #0x30]
00a90ef0	mov w13,wzr
00a90ef4	mov w24,wzr
00a90ef8	mov x10,xzr
00a90efc	mov w4,wzr
00a90f00	mov w5,wzr
00a90f04	mov w6,wzr
00a90f08	mov w16,wzr
00a90f0c	mov w2,wzr
00a90f10	mov w3,wzr
00a90f14	mov w9,wzr
00a90f18	mov w18,wzr
00a90f1c	mov w19,wzr
00a90f20	mov w7,wzr
00a90f24	mov w12,wzr
00a90f28	mov w15,wzr
00a90f2c	mov w21,wzr
00a90f30	mov w20,wzr
00a90f34	mov w11,wzr
00a90f38	mov w14,wzr
00a90f3c	mov w23,wzr
00a90f40	mov w22,wzr
00a90f44	cmp w17,#0xb
00a90f48	orr w3,w3,w9
00a90f4c	adrp x9,0xcb5000
00a90f50	adrp x17,0xcb5000
00a90f54	orr w20,w21,w20
00a90f58	ldr x9,[x9, #0x490]
00a90f5c	ldr x17,[x17, #0x498]
00a90f60	orr w15,w20,w15
00a90f64	orr w8,w15,w12
00a90f68	orr w7,w19,w7
00a90f6c	str w8,[sp, #0x2c]
00a90f70	ldr x8,[sp, #0x30]
00a90f74	orr w18,w7,w18
00a90f78	ldr w19,[x9, w16, UXTW #0x2]
00a90f7c	ldr w7,[x17, x10, LSL #0x2]
00a90f80	orr w22,w23,w22
00a90f84	orr w14,w22,w14
00a90f88	orr w2,w3,w2
00a90f8c	mov x28,xzr
00a90f90	cset w21,lt
00a90f94	orr w3,w14,w11
00a90f98	orr w8,w18,w8
00a90f9c	orr w2,w2,w16
00a90fa0	str x0,[sp, #0x8]
00a90fa4	str w21,[x0, #0x80]
00a90fa8	add x9,sp,#0x40
00a90fac	add x9,x9,x28, LSL #0x2
00a90fb0	str x28,[sp, #0x20]
00a90fb4	str x9,[sp, #0x38]
00a90fb8	adrp x23,0xcb5000
00a90fbc	ldr x23,[x23, #0x488]
00a90fc0	adrp x14,0xcb5000
00a90fc4	ldr w6,[x23, w6, UXTW #0x2]
00a90fc8	ldr x14,[x14, #0x498]
00a90fcc	eor w16,w6,w3
00a90fd0	mov x9,x14
00a90fd4	ldr w20,[x14, w5, UXTW #0x2]
00a90fd8	adrp x14,0xcb5000
00a90fdc	ldr x14,[x14, #0x4a0]
00a90fe0	eor w16,w16,w19
00a90fe4	eor w16,w16,w20
00a90fe8	ldr w5,[x23, w13, UXTW #0x2]
00a90fec	ldr w21,[x14, w4, UXTW #0x2]
00a90ff0	adrp x13,0xcb5000
00a90ff4	ldr w4,[x14, w24, UXTW #0x2]
00a90ff8	ldr x13,[x13, #0x490]
00a90ffc	eor w16,w16,w21
00a91000	ldr x12,[sp, #0x30]
00a91004	eor w20,w16,w7
00a91008	lsr w6,w20,#0x18
00a9100c	ubfx w1,w20,#0x8,#0x8
00a91010	lsl x25,x6,#0x2
00a91014	ubfx w3,w20,#0x10,#0x8
00a91018	lsl x1,x1,#0x2
00a9101c	ldr w24,[x23, x25#0x0]
00a91020	ldr w17,[x13, w12, UXTW #0x2]
00a91024	and w16,w20,#0xff
00a91028	lsl x12,x3,#0x2
00a9102c	ldr w21,[x13, x1#0x0]
00a91030	lsl x19,x16,#0x2
00a91034	ldr w16,[x9, x12#0x0]
00a91038	ldr w22,[x14, x19#0x0]
00a9103c	ldr w6,[x23, x1#0x0]
00a91040	ldr w1,[x14, x1#0x0]
00a91044	eor w18,w24,w8
00a91048	eor w18,w18,w21
00a9104c	eor w18,w18,w16
00a91050	eor w18,w18,w22
00a91054	eor w24,w1,w20
00a91058	eor w20,w18,w4
00a9105c	ubfx w4,w20,#0x8,#0x8
00a91060	ubfx w21,w20,#0x10,#0x8
00a91064	lsl x4,x4,#0x2
00a91068	lsl x21,x21,#0x2
00a9106c	and w18,w20,#0xff
00a91070	ldr w27,[x13, x4#0x0]
00a91074	ldr w28,[x9, x21#0x0]
00a91078	lsr w22,w20,#0x18
00a9107c	lsl x18,x18,#0x2
00a91080	lsl x22,x22,#0x2
00a91084	ldr w26,[x23, x18#0x0]
00a91088	ldr w29,[x14, x22#0x0]
00a9108c	eor w27,w28,w27
00a91090	ldr w4,[x14, x4#0x0]
00a91094	eor w2,w27,w2
00a91098	ldr w21,[x23, x21#0x0]
00a9109c	eor w2,w2,w26
00a910a0	ldr w30,[x9, x18#0x0]
00a910a4	ldr w18,[x13, x18#0x0]
00a910a8	eor w2,w2,w29
00a910ac	ldr w22,[x9, x22#0x0]
00a910b0	eor w2,w2,w5
00a910b4	ldr w7,[x14, x25#0x0]
00a910b8	ldr w25,[x9, x25#0x0]
00a910bc	eor w27,w27,w29
00a910c0	and w5,w2,#0xff
00a910c4	ubfx w26,w2,#0x8,#0x8
00a910c8	ubfx w28,w2,#0x10,#0x8
00a910cc	lsr w29,w2,#0x18
00a910d0	eor w2,w4,w2
00a910d4	ldr w26,[x23, w26, UXTW #0x2]
00a910d8	lsl x28,x28,#0x2
00a910dc	lsl x5,x5,#0x2
00a910e0	lsl x29,x29,#0x2
00a910e4	eor w2,w2,w21
00a910e8	ldr w8,[sp, #0x2c]
00a910ec	ldr w21,[x13, x28#0x0]
00a910f0	ldr w10,[x9, x5#0x0]
00a910f4	ldr w0,[x14, x29#0x0]
00a910f8	ldr w29,[x23, x29#0x0]
00a910fc	ldr w5,[x13, x5#0x0]
00a91100	eor w18,w2,w18
00a91104	eor w18,w18,w22
00a91108	eor w18,w18,w25
00a9110c	eor w15,w26,w8
00a91110	eor w2,w27,w26
00a91114	and w22,w18,#0xff
00a91118	ubfx w26,w18,#0x10,#0x8
00a9111c	lsr w27,w18,#0x18
00a91120	mov x11,x14
00a91124	eor w15,w15,w21
00a91128	eor w21,w29,w21
00a9112c	eor w2,w2,w5
00a91130	lsl x5,x27,#0x2
00a91134	lsl x26,x26,#0x2
00a91138	lsl x22,x22,#0x2
00a9113c	ldr w3,[x9, x19#0x0]
00a91140	ldr w28,[x9, x28#0x0]
00a91144	mov x14,x9
00a91148	ubfx w25,w18,#0x8,#0x8
00a9114c	eor w10,w15,w10
00a91150	eor w15,w21,w30
00a91154	ldr w27,[x23, x5#0x0]
00a91158	ldr w29,[x9, x26#0x0]
00a9115c	ldr w30,[x11, x22#0x0]
00a91160	ldr w8,[x23, x22#0x0]
00a91164	ldr w22,[x9, x22#0x0]
00a91168	ldr x9,[sp, #0x38]
00a9116c	ldr w25,[x13, w25, UXTW #0x2]
00a91170	eor w10,w10,w0
00a91174	eor w15,w15,w4
00a91178	eor w21,w10,w17
00a9117c	eor w10,w15,w6
00a91180	and w15,w21,#0xff
00a91184	ubfx w17,w21,#0x8,#0x8
00a91188	lsr w4,w21,#0x18
00a9118c	ubfx w0,w21,#0x10,#0x8
00a91190	stp w10,w2,[x9]
00a91194	lsl x10,x4,#0x2
00a91198	ldr w17,[x23, w17, UXTW #0x2]
00a9119c	ldr w6,[x13, w15, UXTW #0x2]
00a911a0	eor w15,w24,w27
00a911a4	ldr w0,[x13, w0, UXTW #0x2]
00a911a8	eor w4,w8,w25
00a911ac	ldr w8,[x23, x10#0x0]
00a911b0	eor w15,w15,w25
00a911b4	ldr w26,[x23, x26#0x0]
00a911b8	ldr w5,[x13, x5#0x0]
00a911bc	eor w15,w15,w29
00a911c0	eor w15,w15,w30
00a911c4	eor w16,w17,w16
00a911c8	and w17,w15,#0xff
00a911cc	ldr w10,[x11, x10#0x0]
00a911d0	eor w8,w0,w8
00a911d4	lsl x17,x17,#0x2
00a911d8	eor w2,w5,w26
00a911dc	ubfx w5,w15,#0x8,#0x8
00a911e0	ubfx w24,w15,#0x10,#0x8
00a911e4	eor w8,w8,w3
00a911e8	ldr w3,[x23, x17#0x0]
00a911ec	lsr w25,w15,#0x18
00a911f0	eor w16,w16,w6
00a911f4	ldr w0,[x13, w5, UXTW #0x2]
00a911f8	lsl x5,x24,#0x2
00a911fc	lsl x6,x25,#0x2
00a91200	eor w16,w16,w7
00a91204	ldr w7,[x14, x5#0x0]
00a91208	eor w8,w8,w1
00a9120c	ldr w24,[x11, x6#0x0]
00a91210	eor w10,w16,w10
00a91214	eor w8,w8,w28
00a91218	ldr w12,[x23, x12#0x0]
00a9121c	stp w8,w10,[x9, #0x8]
00a91220	eor w8,w3,w20
00a91224	eor w8,w8,w0
00a91228	eor w8,w8,w7
00a9122c	ldr w5,[x23, x5#0x0]
00a91230	ldr w6,[x13, x6#0x0]
00a91234	eor w8,w8,w24
00a91238	eor w16,w8,w12
00a9123c	ldr w25,[x11, x17#0x0]
00a91240	and w8,w16,#0xff
00a91244	ubfx w17,w16,#0x8,#0x8
00a91248	eor w10,w0,w3
00a9124c	ubfx w0,w16,#0x10,#0x8
00a91250	lsl x17,x17,#0x2
00a91254	lsl x8,x8,#0x2
00a91258	eor w5,w6,w5
00a9125c	lsr w1,w16,#0x18
00a91260	lsl x0,x0,#0x2
00a91264	ldr w6,[x23, x17#0x0]
00a91268	ldr w20,[x14, x8#0x0]
00a9126c	ldr w29,[x11, x8#0x0]
00a91270	ldr w8,[x13, x8#0x0]
00a91274	lsl x1,x1,#0x2
00a91278	ldr w7,[x13, x0#0x0]
00a9127c	ldr w26,[x14, x1#0x0]
00a91280	ldr w28,[x14, x17#0x0]
00a91284	ldr w30,[x11, x1#0x0]
00a91288	ldr w27,[x11, x0#0x0]
00a9128c	ldr w19,[x13, x19#0x0]
00a91290	str w8,[sp, #0x30]
00a91294	eor w8,w6,w21
00a91298	eor w8,w8,w7
00a9129c	ldr w24,[x23, x1#0x0]
00a912a0	ldr w1,[x23, x0#0x0]
00a912a4	eor w10,w10,w26
00a912a8	eor w0,w5,w28
00a912ac	eor w8,w8,w20
00a912b0	eor w10,w10,w27
00a912b4	eor w0,w0,w29
00a912b8	eor w8,w8,w30
00a912bc	eor w10,w10,w22
00a912c0	eor w0,w0,w25
00a912c4	eor w5,w8,w19
00a912c8	stp w10,w0,[x9, #0x18]
00a912cc	ubfx w0,w5,#0x10,#0x8
00a912d0	mov x12,x11
00a912d4	and w8,w5,#0xff
00a912d8	lsl x0,x0,#0x2
00a912dc	ubfx w10,w5,#0x8,#0x8
00a912e0	lsl x8,x8,#0x2
00a912e4	ldr w7,[x12, x0#0x0]
00a912e8	ldr w21,[x13, x0#0x0]
00a912ec	ldr w0,[x23, x0#0x0]
00a912f0	lsr w6,w5,#0x18
00a912f4	lsl x10,x10,#0x2
00a912f8	ldr w20,[x12, x8#0x0]
00a912fc	ldr w8,[x13, x8#0x0]
00a91300	ldr w6,[x14, w6, UXTW #0x2]
00a91304	ldr w19,[x14, x10#0x0]
00a91308	ldr w10,[x12, x10#0x0]
00a9130c	eor w18,w0,w18
00a91310	eor w8,w18,w8
00a91314	eor w4,w4,w6
00a91318	eor w2,w2,w19
00a9131c	eor w8,w8,w6
00a91320	eor w4,w4,w7
00a91324	eor w2,w2,w20
00a91328	eor w8,w8,w10
00a9132c	ldr w3,[x11, x17#0x0]
00a91330	mov x11,x9
00a91334	eor w0,w4,w24
00a91338	eor w18,w2,w21
00a9133c	eor w4,w8,w26
00a91340	stp w0,w18,[x11, #0x10]
00a91344	lsr w0,w4,#0x18
00a91348	and w8,w4,#0xff
00a9134c	ubfx w10,w4,#0x8,#0x8
00a91350	lsl x0,x0,#0x2
00a91354	ubfx w18,w4,#0x10,#0x8
00a91358	lsl x10,x10,#0x2
00a9135c	lsl x2,x8,#0x2
00a91360	ldr w8,[x23, x0#0x0]
00a91364	lsl x18,x18,#0x2
00a91368	ldr w6,[x13, x10#0x0]
00a9136c	ldr w7,[x14, x18#0x0]
00a91370	ldr w19,[x12, x2#0x0]
00a91374	eor w8,w8,w16
00a91378	ldr w20,[x23, x2#0x0]
00a9137c	eor w8,w8,w6
00a91380	eor w8,w8,w7
00a91384	ldr w11,[x23, x18#0x0]
00a91388	ldr w21,[x13, x0#0x0]
00a9138c	eor w8,w8,w19
00a91390	eor w8,w8,w3
00a91394	eor w16,w20,w6
00a91398	and w3,w8,#0xff
00a9139c	ubfx w6,w8,#0x8,#0x8
00a913a0	mov x9,x13
00a913a4	lsl x3,x3,#0x2
00a913a8	lsl x6,x6,#0x2
00a913ac	eor w30,w21,w11
00a913b0	ubfx w7,w8,#0x10,#0x8
00a913b4	ldr w20,[x23, x3#0x0]
00a913b8	ldr w21,[x9, x6#0x0]
00a913bc	lsr w19,w8,#0x18
00a913c0	lsl x7,x7,#0x2
00a913c4	lsl x19,x19,#0x2
00a913c8	ldr w22,[x14, x7#0x0]
00a913cc	mov x28,x23
00a913d0	ldr w23,[x12, x19#0x0]
00a913d4	eor w26,w21,w20
00a913d8	ldr w7,[x28, x7#0x0]
00a913dc	ldr w6,[x12, x6#0x0]
00a913e0	eor w5,w26,w5
00a913e4	ldr w25,[x9, x19#0x0]
00a913e8	eor w5,w5,w22
00a913ec	eor w5,w5,w23
00a913f0	ldr w13,[x14, x10#0x0]
00a913f4	eor w1,w5,w1
00a913f8	ldr w3,[x9, x3#0x0]
00a913fc	eor w6,w6,w7
00a91400	ubfx w7,w1,#0x8,#0x8
00a91404	ldr w19,[x14, x19#0x0]
00a91408	eor w25,w6,w25
00a9140c	and w5,w1,#0xff
00a91410	ubfx w20,w1,#0x10,#0x8
00a91414	lsr w21,w1,#0x18
00a91418	eor w1,w6,w1
00a9141c	lsl x6,x7,#0x2
00a91420	ldr w24,[x14, x0#0x0]
00a91424	lsl x7,x20,#0x2
00a91428	ldr w27,[x28, x6#0x0]
00a9142c	str w13,[sp, #0x2c]
00a91430	lsl x5,x5,#0x2
00a91434	ldr w13,[x9, x7#0x0]
00a91438	mov x18,x9
00a9143c	lsl x20,x21,#0x2
00a91440	eor w1,w1,w3
00a91444	ldr w9,[x14, x5#0x0]
00a91448	ldr w17,[x12, x10#0x0]
00a9144c	ldr w10,[x12, x20#0x0]
00a91450	ldr w6,[x14, x6#0x0]
00a91454	eor w1,w1,w19
00a91458	str w11,[sp, #0x14]
00a9145c	ldr w11,[x14, x20#0x0]
00a91460	eor w3,w1,w24
00a91464	eor w15,w27,w15
00a91468	lsr w21,w3,#0x18
00a9146c	eor w13,w15,w13
00a91470	ldr w20,[x12, x7#0x0]
00a91474	ubfx w22,w3,#0x8,#0x8
00a91478	lsl x24,x21,#0x2
00a9147c	eor w9,w13,w9
00a91480	ldr w5,[x12, x5#0x0]
00a91484	ubfx w1,w3,#0x10,#0x8
00a91488	lsl x19,x22,#0x2
00a9148c	eor w6,w25,w6
00a91490	ldr w25,[x28, x24#0x0]
00a91494	ldr w13,[sp, #0x2c]
00a91498	eor w9,w9,w10
00a9149c	ldr w10,[sp, #0x30]
00a914a0	ldr w0,[x28, x7#0x0]
00a914a4	and w23,w3,#0xff
00a914a8	str w1,[sp, #0x10]
00a914ac	ldr w7,[x14, w1, UXTW #0x2]
00a914b0	eor w11,w26,w11
00a914b4	ldr w26,[x18, x19#0x0]
00a914b8	ldr x1,[sp, #0x38]
00a914bc	lsl x29,x23,#0x2
00a914c0	ldr w15,[x12, x29#0x0]
00a914c4	eor w11,w11,w20
00a914c8	eor w5,w6,w5
00a914cc	eor w11,w11,w13
00a914d0	eor w9,w9,w10
00a914d4	eor w10,w25,w4
00a914d8	stp w11,w5,[x1, #0x28]
00a914dc	ubfx w13,w9,#0x8,#0x8
00a914e0	lsr w5,w9,#0x18
00a914e4	eor w10,w10,w26
00a914e8	lsl x5,x5,#0x2
00a914ec	ldr w13,[x14, w13, UXTW #0x2]
00a914f0	eor w10,w10,w7
00a914f4	and w11,w9,#0xff
00a914f8	ubfx w4,w9,#0x10,#0x8
00a914fc	ldr w6,[x14, x5#0x0]
00a91500	eor w10,w10,w15
00a91504	ldr w4,[x12, w4, UXTW #0x2]
00a91508	ldr w11,[x12, w11, UXTW #0x2]
00a9150c	eor w10,w10,w17
00a91510	ldr w5,[x18, x5#0x0]
00a91514	ubfx w15,w10,#0x10,#0x8
00a91518	lsr w25,w10,#0x18
00a9151c	and w26,w10,#0xff
00a91520	ubfx w27,w10,#0x8,#0x8
00a91524	str w10,[sp, #0x2c]
00a91528	eor w10,w30,w13
00a9152c	ldr w13,[x14, w15, UXTW #0x2]
00a91530	ldr w30,[x12, w25, UXTW #0x2]
00a91534	eor w16,w16,w6
00a91538	eor w10,w10,w11
00a9153c	eor w16,w16,w4
00a91540	eor w10,w10,w5
00a91544	eor w16,w16,w0
00a91548	lsl x20,x26,#0x2
00a9154c	stp w16,w10,[x1, #0x20]
00a91550	eor w10,w30,w13
00a91554	ldr w13,[sp, #0x14]
00a91558	lsl x17,x27,#0x2
00a9155c	ldr w11,[x28, x20#0x0]
00a91560	ldr w6,[x18, x17#0x0]
00a91564	eor w8,w10,w8
00a91568	eor w8,w8,w13
00a9156c	eor w8,w8,w11
00a91570	eor w8,w8,w6
00a91574	str x24,[sp, #0x18]
00a91578	ubfx w24,w8,#0x8,#0x8
00a9157c	ldr w11,[x28, w24, UXTW #0x2]
00a91580	and w16,w8,#0xff
00a91584	ubfx w13,w8,#0x10,#0x8
00a91588	lsl x4,x16,#0x2
00a9158c	ldr w0,[x18, w13, UXTW #0x2]
00a91590	eor w9,w11,w9
00a91594	eor w10,w10,w11
00a91598	ldr w11,[x18, x4#0x0]
00a9159c	lsr w30,w8,#0x18
00a915a0	ldr w4,[x14, x4#0x0]
00a915a4	str x16,[sp, #0x30]
00a915a8	lsl x16,x30,#0x2
00a915ac	ldr w5,[x28, x16#0x0]
00a915b0	eor w9,w9,w0
00a915b4	eor w10,w10,w11
00a915b8	ldr w11,[x14, x20#0x0]
00a915bc	eor w9,w9,w4
00a915c0	ldr w4,[x12, x16#0x0]
00a915c4	ldr w2,[x18, x2#0x0]
00a915c8	eor w0,w5,w0
00a915cc	ldr w17,[x12, x17#0x0]
00a915d0	ldr w5,[x18, x20#0x0]
00a915d4	eor w11,w0,w11
00a915d8	ldr w0,[x28, x29#0x0]
00a915dc	eor w9,w9,w4
00a915e0	eor w2,w9,w2
00a915e4	eor w11,w11,w17
00a915e8	ubfx w6,w2,#0x10,#0x8
00a915ec	eor w10,w10,w5
00a915f0	eor w9,w11,w0
00a915f4	lsr w5,w2,#0x18
00a915f8	lsl x11,x6,#0x2
00a915fc	stp w9,w10,[x1, #0x30]
00a91600	ldr w10,[x28, w5, UXTW #0x2]
00a91604	ldr w17,[x18, x11#0x0]
00a91608	ubfx w4,w2,#0x8,#0x8
00a9160c	ldr w9,[x28, w4, UXTW #0x2]
00a91610	ldr w0,[x14, x29#0x0]
00a91614	eor w10,w17,w10
00a91618	ldr x17,[sp, #0x18]
00a9161c	and w29,w2,#0xff
00a91620	ldr w20,[x12, x19#0x0]
00a91624	ldr w19,[x18, w29, UXTW #0x2]
00a91628	ldr w17,[x12, x17#0x0]
00a9162c	eor w9,w9,w7
00a91630	ldr w7,[x14, x16#0x0]
00a91634	ldr w11,[x12, x11#0x0]
00a91638	eor w10,w10,w0
00a9163c	eor w9,w9,w19
00a91640	eor w9,w9,w17
00a91644	eor w10,w10,w20
00a91648	eor w9,w9,w11
00a9164c	eor w10,w10,w7
00a91650	stp w10,w9,[x1, #0x38]
00a91654	ldr x9,[sp, #0x20]
00a91658	mov w28,#0x10
00a9165c	cbz x9,0x00a90fa8
00a91660	ldr x8,[sp, #0x30]
00a91664	ldr q0,[sp, #0x80]
00a91668	ldr q1,[sp, #0x40]
00a9166c	ldr x9,[sp, #0x8]
00a91670	stp w24,w8,[sp, #0xe8]
00a91674	ldr w8,[sp, #0x10]
00a91678	movi v3.4S,#0x10
00a9167c	movi v4.4S,#0x1f
00a91680	add v0.4S,v0.4S,v3.4S
00a91684	stp w21,w8,[sp, #0xc0]
00a91688	mov x8,x9
00a9168c	and v2.16B,v0.16B,v4.16B
00a91690	stp w5,w6,[sp, #0xf0]
00a91694	stp w4,w29,[sp, #0xf8]
00a91698	stp w30,w13,[sp, #0xe0]
00a9169c	stp w22,w23,[sp, #0xc8]
00a916a0	stp w27,w26,[sp, #0xd8]
00a916a4	stp w25,w15,[sp, #0xd0]
00a916a8	st2 {v1.4S,v2.4S},[x8], #0x20
00a916ac	ldr q0,[sp, #0x90]
00a916b0	ldr q1,[sp, #0x50]
00a916b4	add v0.4S,v0.4S,v3.4S
00a916b8	and v2.16B,v0.16B,v4.16B
00a916bc	st2 {v1.4S,v2.4S},[x8]
00a916c0	ldr q0,[sp, #0xa0]
00a916c4	ldr q1,[sp, #0x60]
00a916c8	add x8,x9,#0x40
00a916cc	add v0.4S,v0.4S,v3.4S
00a916d0	and v2.16B,v0.16B,v4.16B
00a916d4	st2 {v1.4S,v2.4S},[x8]
00a916d8	ldr q0,[sp, #0xb0]
00a916dc	ldr q1,[sp, #0x70]
00a916e0	add x8,x9,#0x60
00a916e4	add v0.4S,v0.4S,v3.4S
00a916e8	and v2.16B,v0.16B,v4.16B
00a916ec	st2 {v1.4S,v2.4S},[x8]
00a916f0	ldp x29,x30,[sp, #0x150]
00a916f4	ldp x20,x19,[sp, #0x140]
00a916f8	ldp x22,x21,[sp, #0x130]
00a916fc	ldp x24,x23,[sp, #0x120]
00a91700	ldp x26,x25,[sp, #0x110]
00a91704	ldp x28,x27,[sp, #0x100]
00a91708	add sp,sp,#0x160
00a9170c	ret
