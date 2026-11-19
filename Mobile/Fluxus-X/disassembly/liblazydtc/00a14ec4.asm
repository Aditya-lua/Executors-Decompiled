; DES_encrypt1 @ 00a14ec4
00a14ec4	str x23,[sp, #-0x30]!
00a14ec8	stp x22,x21,[sp, #0x10]
00a14ecc	stp x20,x19,[sp, #0x20]
00a14ed0	ldp w12,w13,[x0]
00a14ed4	orr w9,wzr,#0x55555555
00a14ed8	orr w10,wzr,#0x33333333
00a14edc	orr w8,wzr,#0xf0f0f0f
00a14ee0	eor w14,w12,w13, LSR #0x4
00a14ee4	and w14,w14,#0xf0f0f0f
00a14ee8	eor w13,w13,w14, LSL #0x4
00a14eec	eor w12,w14,w12
00a14ef0	and w14,w13,#0xffff
00a14ef4	eor w14,w14,w12, LSR #0x10
00a14ef8	eor w13,w14,w13
00a14efc	eor w12,w12,w14, LSL #0x10
00a14f00	eor w14,w12,w13, LSR #0x2
00a14f04	and w14,w14,#0x33333333
00a14f08	eor w12,w14,w12
00a14f0c	eor w13,w13,w14, LSL #0x2
00a14f10	eor w14,w13,w12, LSR #0x8
00a14f14	and w14,w14,#0xff00ff
00a14f18	eor w13,w14,w13
00a14f1c	eor w12,w12,w14, LSL #0x8
00a14f20	eor w14,w12,w13, LSR #0x1
00a14f24	and w14,w14,#0x55555555
00a14f28	eor w12,w14,w12
00a14f2c	eor w13,w13,w14, LSL #0x1
00a14f30	orr w11,wzr,#0xff00ff
00a14f34	ror w3,w12,#0x1d
00a14f38	ror w4,w13,#0x1d
00a14f3c	cbz w2,0x00a15604
00a14f40	ldp w2,w5,[x1]
00a14f44	adrp x12,0xcb5000
00a14f48	ldr x12,[x12, #0x4c8]
00a14f4c	ldp w6,w7,[x1, #0x8]
00a14f50	eor w21,w2,w3
00a14f54	ubfx w2,w21,#0x2,#0x6
00a14f58	ldr w22,[x12, w2, UXTW #0x2]
00a14f5c	add x13,x12,#0x200
00a14f60	ubfx w23,w21,#0xa,#0x6
00a14f64	add x14,x12,#0x400
00a14f68	eor w4,w22,w4
00a14f6c	ubfx w22,w21,#0x12,#0x6
00a14f70	ldr w23,[x13, w23, UXTW #0x2]
00a14f74	add x15,x12,#0x600
00a14f78	lsr w21,w21,#0x1a
00a14f7c	ldr w22,[x14, w22, UXTW #0x2]
00a14f80	ldr w21,[x15, w21, UXTW #0x2]
00a14f84	eor w5,w5,w3
00a14f88	eor w4,w4,w23
00a14f8c	add x16,x12,#0x100
00a14f90	eor w4,w4,w22
00a14f94	ubfx w22,w5,#0x6,#0x6
00a14f98	add x17,x12,#0x300
00a14f9c	eor w4,w4,w21
00a14fa0	ubfx w21,w5,#0xe,#0x6
00a14fa4	ldr w22,[x16, w22, UXTW #0x2]
00a14fa8	add x18,x12,#0x500
00a14fac	ror w23,w5,#0x4
00a14fb0	ubfx w5,w5,#0x16,#0x6
00a14fb4	ldr w21,[x17, w21, UXTW #0x2]
00a14fb8	add x2,x12,#0x700
00a14fbc	ldr w5,[x18, w5, UXTW #0x2]
00a14fc0	lsr w23,w23,#0x1a
00a14fc4	ldr w23,[x2, w23, UXTW #0x2]
00a14fc8	eor w4,w4,w22
00a14fcc	eor w4,w4,w21
00a14fd0	eor w4,w4,w5
00a14fd4	eor w4,w4,w23
00a14fd8	eor w5,w4,w6
00a14fdc	ubfx w6,w5,#0x2,#0x6
00a14fe0	ldr w6,[x12, w6, UXTW #0x2]
00a14fe4	ubfx w23,w5,#0xa,#0x6
00a14fe8	ldr w23,[x13, w23, UXTW #0x2]
00a14fec	eor w7,w4,w7
00a14ff0	eor w3,w6,w3
00a14ff4	ubfx w6,w5,#0x12,#0x6
00a14ff8	lsr w5,w5,#0x1a
00a14ffc	ldr w6,[x14, w6, UXTW #0x2]
00a15000	ldr w5,[x15, w5, UXTW #0x2]
00a15004	eor w3,w3,w23
00a15008	ror w23,w7,#0x4
00a1500c	eor w3,w3,w6
00a15010	ubfx w6,w7,#0x6,#0x6
00a15014	eor w3,w3,w5
00a15018	ubfx w5,w7,#0xe,#0x6
00a1501c	ldr w6,[x16, w6, UXTW #0x2]
00a15020	ubfx w7,w7,#0x16,#0x6
00a15024	ldr w5,[x17, w5, UXTW #0x2]
00a15028	ldr w7,[x18, w7, UXTW #0x2]
00a1502c	lsr w23,w23,#0x1a
00a15030	ldr w23,[x2, w23, UXTW #0x2]
00a15034	ldp w19,w20,[x1, #0x10]
00a15038	eor w3,w3,w6
00a1503c	eor w3,w3,w5
00a15040	eor w3,w3,w7
00a15044	eor w3,w3,w23
00a15048	eor w5,w3,w19
00a1504c	ubfx w6,w5,#0x2,#0x6
00a15050	ldr w6,[x12, w6, UXTW #0x2]
00a15054	ubfx w23,w5,#0xa,#0x6
00a15058	ldr w23,[x13, w23, UXTW #0x2]
00a1505c	eor w20,w3,w20
00a15060	eor w4,w6,w4
00a15064	ubfx w6,w5,#0x12,#0x6
00a15068	lsr w5,w5,#0x1a
00a1506c	ldr w6,[x14, w6, UXTW #0x2]
00a15070	ldr w5,[x15, w5, UXTW #0x2]
00a15074	eor w4,w4,w23
00a15078	ror w23,w20,#0x4
00a1507c	eor w4,w4,w6
00a15080	ubfx w6,w20,#0x6,#0x6
00a15084	eor w4,w4,w5
00a15088	ubfx w5,w20,#0xe,#0x6
00a1508c	ldr w6,[x16, w6, UXTW #0x2]
00a15090	ubfx w20,w20,#0x16,#0x6
00a15094	ldr w5,[x17, w5, UXTW #0x2]
00a15098	ldr w20,[x18, w20, UXTW #0x2]
00a1509c	lsr w23,w23,#0x1a
00a150a0	ldr w23,[x2, w23, UXTW #0x2]
00a150a4	ldp w21,w22,[x1, #0x18]
00a150a8	eor w4,w4,w6
00a150ac	eor w4,w4,w5
00a150b0	eor w4,w4,w20
00a150b4	eor w4,w4,w23
00a150b8	eor w5,w4,w21
00a150bc	ubfx w6,w5,#0x2,#0x6
00a150c0	ldr w6,[x12, w6, UXTW #0x2]
00a150c4	ubfx w23,w5,#0xa,#0x6
00a150c8	ldr w23,[x13, w23, UXTW #0x2]
00a150cc	eor w22,w4,w22
00a150d0	eor w3,w6,w3
00a150d4	ubfx w6,w5,#0x12,#0x6
00a150d8	lsr w5,w5,#0x1a
00a150dc	ldr w6,[x14, w6, UXTW #0x2]
00a150e0	ldr w5,[x15, w5, UXTW #0x2]
00a150e4	eor w3,w3,w23
00a150e8	ror w23,w22,#0x4
00a150ec	eor w3,w3,w6
00a150f0	ubfx w6,w22,#0x6,#0x6
00a150f4	eor w3,w3,w5
00a150f8	ubfx w5,w22,#0xe,#0x6
00a150fc	ldr w6,[x16, w6, UXTW #0x2]
00a15100	ubfx w22,w22,#0x16,#0x6
00a15104	ldr w5,[x17, w5, UXTW #0x2]
00a15108	ldr w22,[x18, w22, UXTW #0x2]
00a1510c	lsr w23,w23,#0x1a
00a15110	ldr w23,[x2, w23, UXTW #0x2]
00a15114	ldp w7,w19,[x1, #0x20]
00a15118	eor w3,w3,w6
00a1511c	eor w3,w3,w5
00a15120	eor w3,w3,w22
00a15124	eor w3,w3,w23
00a15128	eor w5,w3,w7
00a1512c	ubfx w6,w5,#0x2,#0x6
00a15130	ldr w6,[x12, w6, UXTW #0x2]
00a15134	ubfx w23,w5,#0xa,#0x6
00a15138	ldr w23,[x13, w23, UXTW #0x2]
00a1513c	eor w19,w3,w19
00a15140	eor w4,w6,w4
00a15144	ubfx w6,w5,#0x12,#0x6
00a15148	lsr w5,w5,#0x1a
00a1514c	ldr w6,[x14, w6, UXTW #0x2]
00a15150	ldr w5,[x15, w5, UXTW #0x2]
00a15154	eor w4,w4,w23
00a15158	ror w23,w19,#0x4
00a1515c	eor w4,w4,w6
00a15160	ubfx w6,w19,#0x6,#0x6
00a15164	eor w4,w4,w5
00a15168	ubfx w5,w19,#0xe,#0x6
00a1516c	ldr w6,[x16, w6, UXTW #0x2]
00a15170	ubfx w19,w19,#0x16,#0x6
00a15174	ldr w5,[x17, w5, UXTW #0x2]
00a15178	ldr w19,[x18, w19, UXTW #0x2]
00a1517c	lsr w23,w23,#0x1a
00a15180	ldr w23,[x2, w23, UXTW #0x2]
00a15184	ldp w20,w21,[x1, #0x28]
00a15188	eor w4,w4,w6
00a1518c	eor w4,w4,w5
00a15190	eor w4,w4,w19
00a15194	eor w4,w4,w23
00a15198	eor w5,w4,w20
00a1519c	ubfx w6,w5,#0x2,#0x6
00a151a0	ldr w6,[x12, w6, UXTW #0x2]
00a151a4	ubfx w23,w5,#0xa,#0x6
00a151a8	ldr w23,[x13, w23, UXTW #0x2]
00a151ac	eor w21,w4,w21
00a151b0	eor w3,w6,w3
00a151b4	ubfx w6,w5,#0x12,#0x6
00a151b8	lsr w5,w5,#0x1a
00a151bc	ldr w6,[x14, w6, UXTW #0x2]
00a151c0	ldr w5,[x15, w5, UXTW #0x2]
00a151c4	eor w3,w3,w23
00a151c8	ror w23,w21,#0x4
00a151cc	eor w3,w3,w6
00a151d0	ubfx w6,w21,#0x6,#0x6
00a151d4	eor w3,w3,w5
00a151d8	ubfx w5,w21,#0xe,#0x6
00a151dc	ldr w6,[x16, w6, UXTW #0x2]
00a151e0	ubfx w21,w21,#0x16,#0x6
00a151e4	ldr w5,[x17, w5, UXTW #0x2]
00a151e8	ldr w21,[x18, w21, UXTW #0x2]
00a151ec	lsr w23,w23,#0x1a
00a151f0	ldr w23,[x2, w23, UXTW #0x2]
00a151f4	ldp w7,w22,[x1, #0x30]
00a151f8	eor w3,w3,w6
00a151fc	eor w3,w3,w5
00a15200	eor w3,w3,w21
00a15204	eor w3,w3,w23
00a15208	eor w5,w3,w7
00a1520c	ubfx w6,w5,#0x2,#0x6
00a15210	ldr w6,[x12, w6, UXTW #0x2]
00a15214	ubfx w23,w5,#0xa,#0x6
00a15218	ldr w23,[x13, w23, UXTW #0x2]
00a1521c	eor w22,w3,w22
00a15220	eor w4,w6,w4
00a15224	ubfx w6,w5,#0x12,#0x6
00a15228	lsr w5,w5,#0x1a
00a1522c	ldr w6,[x14, w6, UXTW #0x2]
00a15230	ldr w5,[x15, w5, UXTW #0x2]
00a15234	eor w4,w4,w23
00a15238	ror w23,w22,#0x4
00a1523c	eor w4,w4,w6
00a15240	ubfx w6,w22,#0x6,#0x6
00a15244	eor w4,w4,w5
00a15248	ubfx w5,w22,#0xe,#0x6
00a1524c	ldr w6,[x16, w6, UXTW #0x2]
00a15250	ubfx w22,w22,#0x16,#0x6
00a15254	ldr w5,[x17, w5, UXTW #0x2]
00a15258	ldr w22,[x18, w22, UXTW #0x2]
00a1525c	lsr w23,w23,#0x1a
00a15260	ldr w23,[x2, w23, UXTW #0x2]
00a15264	ldp w19,w20,[x1, #0x38]
00a15268	eor w4,w4,w6
00a1526c	eor w4,w4,w5
00a15270	eor w4,w4,w22
00a15274	eor w4,w4,w23
00a15278	eor w5,w4,w19
00a1527c	ubfx w6,w5,#0x2,#0x6
00a15280	ldr w6,[x12, w6, UXTW #0x2]
00a15284	ubfx w23,w5,#0xa,#0x6
00a15288	ldr w23,[x13, w23, UXTW #0x2]
00a1528c	eor w20,w4,w20
00a15290	eor w3,w6,w3
00a15294	ubfx w6,w5,#0x12,#0x6
00a15298	lsr w5,w5,#0x1a
00a1529c	ldr w6,[x14, w6, UXTW #0x2]
00a152a0	ldr w5,[x15, w5, UXTW #0x2]
00a152a4	eor w3,w3,w23
00a152a8	ror w23,w20,#0x4
00a152ac	eor w3,w3,w6
00a152b0	ubfx w6,w20,#0x6,#0x6
00a152b4	eor w3,w3,w5
00a152b8	ubfx w5,w20,#0xe,#0x6
00a152bc	ldr w6,[x16, w6, UXTW #0x2]
00a152c0	ubfx w20,w20,#0x16,#0x6
00a152c4	ldr w5,[x17, w5, UXTW #0x2]
00a152c8	ldr w20,[x18, w20, UXTW #0x2]
00a152cc	lsr w23,w23,#0x1a
00a152d0	ldr w23,[x2, w23, UXTW #0x2]
00a152d4	ldp w7,w21,[x1, #0x40]
00a152d8	eor w3,w3,w6
00a152dc	eor w3,w3,w5
00a152e0	eor w3,w3,w20
00a152e4	eor w3,w3,w23
00a152e8	eor w5,w3,w7
00a152ec	ubfx w6,w5,#0x2,#0x6
00a152f0	ldr w6,[x12, w6, UXTW #0x2]
00a152f4	ubfx w23,w5,#0xa,#0x6
00a152f8	ldr w23,[x13, w23, UXTW #0x2]
00a152fc	eor w21,w3,w21
00a15300	eor w4,w6,w4
00a15304	ubfx w6,w5,#0x12,#0x6
00a15308	lsr w5,w5,#0x1a
00a1530c	ldr w6,[x14, w6, UXTW #0x2]
00a15310	ldr w5,[x15, w5, UXTW #0x2]
00a15314	eor w4,w4,w23
00a15318	ror w23,w21,#0x4
00a1531c	eor w4,w4,w6
00a15320	ubfx w6,w21,#0x6,#0x6
00a15324	eor w4,w4,w5
00a15328	ubfx w5,w21,#0xe,#0x6
00a1532c	ldr w6,[x16, w6, UXTW #0x2]
00a15330	ubfx w21,w21,#0x16,#0x6
00a15334	ldr w5,[x17, w5, UXTW #0x2]
00a15338	ldr w21,[x18, w21, UXTW #0x2]
00a1533c	lsr w23,w23,#0x1a
00a15340	ldr w23,[x2, w23, UXTW #0x2]
00a15344	ldp w19,w22,[x1, #0x48]
00a15348	eor w4,w4,w6
00a1534c	eor w4,w4,w5
00a15350	eor w4,w4,w21
00a15354	eor w4,w4,w23
00a15358	eor w5,w4,w19
00a1535c	ubfx w6,w5,#0x2,#0x6
00a15360	ldr w6,[x12, w6, UXTW #0x2]
00a15364	ubfx w23,w5,#0xa,#0x6
00a15368	ldr w23,[x13, w23, UXTW #0x2]
00a1536c	eor w22,w4,w22
00a15370	eor w3,w6,w3
00a15374	ubfx w6,w5,#0x12,#0x6
00a15378	lsr w5,w5,#0x1a
00a1537c	ldr w6,[x14, w6, UXTW #0x2]
00a15380	ldr w5,[x15, w5, UXTW #0x2]
00a15384	eor w3,w3,w23
00a15388	ror w23,w22,#0x4
00a1538c	eor w3,w3,w6
00a15390	ubfx w6,w22,#0x6,#0x6
00a15394	eor w3,w3,w5
00a15398	ubfx w5,w22,#0xe,#0x6
00a1539c	ldr w6,[x16, w6, UXTW #0x2]
00a153a0	ubfx w22,w22,#0x16,#0x6
00a153a4	ldr w5,[x17, w5, UXTW #0x2]
00a153a8	ldr w22,[x18, w22, UXTW #0x2]
00a153ac	lsr w23,w23,#0x1a
00a153b0	ldr w23,[x2, w23, UXTW #0x2]
00a153b4	ldp w7,w20,[x1, #0x50]
00a153b8	eor w3,w3,w6
00a153bc	eor w3,w3,w5
00a153c0	eor w3,w3,w22
00a153c4	eor w3,w3,w23
00a153c8	eor w5,w3,w7
00a153cc	ubfx w6,w5,#0x2,#0x6
00a153d0	ldr w6,[x12, w6, UXTW #0x2]
00a153d4	ubfx w23,w5,#0xa,#0x6
00a153d8	ldr w23,[x13, w23, UXTW #0x2]
00a153dc	eor w20,w3,w20
00a153e0	eor w4,w6,w4
00a153e4	ubfx w6,w5,#0x12,#0x6
00a153e8	lsr w5,w5,#0x1a
00a153ec	ldr w6,[x14, w6, UXTW #0x2]
00a153f0	ldr w5,[x15, w5, UXTW #0x2]
00a153f4	eor w4,w4,w23
00a153f8	ror w23,w20,#0x4
00a153fc	eor w4,w4,w6
00a15400	ubfx w6,w20,#0x6,#0x6
00a15404	eor w4,w4,w5
00a15408	ubfx w5,w20,#0xe,#0x6
00a1540c	ldr w6,[x16, w6, UXTW #0x2]
00a15410	ubfx w20,w20,#0x16,#0x6
00a15414	ldr w5,[x17, w5, UXTW #0x2]
00a15418	ldr w20,[x18, w20, UXTW #0x2]
00a1541c	lsr w23,w23,#0x1a
00a15420	ldr w23,[x2, w23, UXTW #0x2]
00a15424	ldp w19,w21,[x1, #0x58]
00a15428	eor w4,w4,w6
00a1542c	eor w4,w4,w5
00a15430	eor w4,w4,w20
00a15434	eor w4,w4,w23
00a15438	eor w5,w4,w19
00a1543c	ubfx w6,w5,#0x2,#0x6
00a15440	ldr w6,[x12, w6, UXTW #0x2]
00a15444	ubfx w23,w5,#0xa,#0x6
00a15448	ldr w23,[x13, w23, UXTW #0x2]
00a1544c	eor w21,w4,w21
00a15450	eor w3,w6,w3
00a15454	ubfx w6,w5,#0x12,#0x6
00a15458	lsr w5,w5,#0x1a
00a1545c	ldr w6,[x14, w6, UXTW #0x2]
00a15460	ldr w5,[x15, w5, UXTW #0x2]
00a15464	eor w3,w3,w23
00a15468	ror w23,w21,#0x4
00a1546c	eor w3,w3,w6
00a15470	ubfx w6,w21,#0x6,#0x6
00a15474	eor w3,w3,w5
00a15478	ubfx w5,w21,#0xe,#0x6
00a1547c	ldr w6,[x16, w6, UXTW #0x2]
00a15480	ubfx w21,w21,#0x16,#0x6
00a15484	ldr w5,[x17, w5, UXTW #0x2]
00a15488	ldr w21,[x18, w21, UXTW #0x2]
00a1548c	lsr w23,w23,#0x1a
00a15490	ldr w23,[x2, w23, UXTW #0x2]
00a15494	ldp w7,w22,[x1, #0x60]
00a15498	eor w3,w3,w6
00a1549c	eor w3,w3,w5
00a154a0	eor w3,w3,w21
00a154a4	eor w3,w3,w23
00a154a8	eor w5,w3,w7
00a154ac	ubfx w6,w5,#0x2,#0x6
00a154b0	ldr w6,[x12, w6, UXTW #0x2]
00a154b4	ubfx w23,w5,#0xa,#0x6
00a154b8	ldr w23,[x13, w23, UXTW #0x2]
00a154bc	eor w22,w3,w22
00a154c0	eor w4,w6,w4
00a154c4	ubfx w6,w5,#0x12,#0x6
00a154c8	lsr w5,w5,#0x1a
00a154cc	ldr w6,[x14, w6, UXTW #0x2]
00a154d0	ldr w5,[x15, w5, UXTW #0x2]
00a154d4	eor w4,w4,w23
00a154d8	ror w23,w22,#0x4
00a154dc	eor w4,w4,w6
00a154e0	ubfx w6,w22,#0x6,#0x6
00a154e4	eor w4,w4,w5
00a154e8	ubfx w5,w22,#0xe,#0x6
00a154ec	ldr w6,[x16, w6, UXTW #0x2]
00a154f0	ubfx w22,w22,#0x16,#0x6
00a154f4	ldr w5,[x17, w5, UXTW #0x2]
00a154f8	ldr w22,[x18, w22, UXTW #0x2]
00a154fc	lsr w23,w23,#0x1a
00a15500	ldr w23,[x2, w23, UXTW #0x2]
00a15504	ldp w19,w20,[x1, #0x68]
00a15508	eor w4,w4,w6
00a1550c	eor w4,w4,w5
00a15510	eor w4,w4,w22
00a15514	eor w4,w4,w23
00a15518	eor w5,w4,w19
00a1551c	eor w19,w4,w20
00a15520	ubfx w20,w5,#0x2,#0x6
00a15524	ldr w20,[x12, w20, UXTW #0x2]
00a15528	ubfx w23,w5,#0xa,#0x6
00a1552c	ldr w23,[x13, w23, UXTW #0x2]
00a15530	ror w22,w19,#0x4
00a15534	eor w3,w20,w3
00a15538	ubfx w20,w5,#0x12,#0x6
00a1553c	ldr w20,[x14, w20, UXTW #0x2]
00a15540	lsr w5,w5,#0x1a
00a15544	eor w3,w3,w23
00a15548	ubfx w23,w19,#0x6,#0x6
00a1554c	ldr w5,[x15, w5, UXTW #0x2]
00a15550	eor w3,w3,w20
00a15554	ubfx w20,w19,#0xe,#0x6
00a15558	ldr w23,[x16, w23, UXTW #0x2]
00a1555c	ubfx w19,w19,#0x16,#0x6
00a15560	ldr w20,[x17, w20, UXTW #0x2]
00a15564	ldr w19,[x18, w19, UXTW #0x2]
00a15568	lsr w22,w22,#0x1a
00a1556c	ldr w22,[x2, w22, UXTW #0x2]
00a15570	eor w3,w3,w5
00a15574	ldp w7,w21,[x1, #0x70]
00a15578	eor w3,w3,w23
00a1557c	eor w3,w3,w20
00a15580	eor w3,w3,w19
00a15584	eor w3,w3,w22
00a15588	eor w5,w3,w7
00a1558c	ubfx w20,w5,#0x2,#0x6
00a15590	eor w7,w3,w21
00a15594	ubfx w21,w5,#0xa,#0x6
00a15598	ldr w12,[x12, w20, UXTW #0x2]
00a1559c	ubfx w22,w5,#0x12,#0x6
00a155a0	ldr w13,[x13, w21, UXTW #0x2]
00a155a4	lsr w5,w5,#0x1a
00a155a8	ldr w14,[x14, w22, UXTW #0x2]
00a155ac	ubfx w23,w7,#0x6,#0x6
00a155b0	ldr w15,[x15, w5, UXTW #0x2]
00a155b4	ubfx w20,w7,#0xe,#0x6
00a155b8	ldr w16,[x16, w23, UXTW #0x2]
00a155bc	eor w12,w12,w4
00a155c0	ror w19,w7,#0x4
00a155c4	ubfx w7,w7,#0x16,#0x6
00a155c8	ldr w17,[x17, w20, UXTW #0x2]
00a155cc	eor w12,w12,w13
00a155d0	ldr w18,[x18, w7, UXTW #0x2]
00a155d4	lsr w5,w19,#0x1a
00a155d8	eor w12,w12,w14
00a155dc	ldr w2,[x2, w5, UXTW #0x2]
00a155e0	eor w12,w12,w15
00a155e4	ldr w6,[x1, #0x78]
00a155e8	eor w12,w12,w16
00a155ec	eor w12,w12,w17
00a155f0	eor w12,w12,w18
00a155f4	eor w12,w12,w2
00a155f8	eor w13,w12,w6
00a155fc	add x14,x1,#0x7c
00a15600	b 0x00a15cc4
00a15604	ldp w2,w5,[x1, #0x78]
00a15608	adrp x12,0xcb5000
00a1560c	ldr x12,[x12, #0x4c8]
00a15610	ldp w6,w7,[x1, #0x70]
00a15614	eor w21,w2,w3
00a15618	ubfx w2,w21,#0x2,#0x6
00a1561c	ldr w22,[x12, w2, UXTW #0x2]
00a15620	add x13,x12,#0x200
00a15624	ubfx w23,w21,#0xa,#0x6
00a15628	add x14,x12,#0x400
00a1562c	eor w4,w22,w4
00a15630	ubfx w22,w21,#0x12,#0x6
00a15634	ldr w23,[x13, w23, UXTW #0x2]
00a15638	add x15,x12,#0x600
00a1563c	lsr w21,w21,#0x1a
00a15640	ldr w22,[x14, w22, UXTW #0x2]
00a15644	ldr w21,[x15, w21, UXTW #0x2]
00a15648	eor w5,w5,w3
00a1564c	eor w4,w4,w23
00a15650	add x16,x12,#0x100
00a15654	eor w4,w4,w22
00a15658	ubfx w22,w5,#0x6,#0x6
00a1565c	add x17,x12,#0x300
00a15660	eor w4,w4,w21
00a15664	ubfx w21,w5,#0xe,#0x6
00a15668	ldr w22,[x16, w22, UXTW #0x2]
00a1566c	add x18,x12,#0x500
00a15670	ror w23,w5,#0x4
00a15674	ubfx w5,w5,#0x16,#0x6
00a15678	ldr w21,[x17, w21, UXTW #0x2]
00a1567c	add x2,x12,#0x700
00a15680	ldr w5,[x18, w5, UXTW #0x2]
00a15684	lsr w23,w23,#0x1a
00a15688	ldr w23,[x2, w23, UXTW #0x2]
00a1568c	eor w4,w4,w22
00a15690	eor w4,w4,w21
00a15694	eor w4,w4,w5
00a15698	eor w4,w4,w23
00a1569c	eor w5,w4,w6
00a156a0	ubfx w6,w5,#0x2,#0x6
00a156a4	ldr w6,[x12, w6, UXTW #0x2]
00a156a8	ubfx w23,w5,#0xa,#0x6
00a156ac	ldr w23,[x13, w23, UXTW #0x2]
00a156b0	eor w7,w4,w7
00a156b4	eor w3,w6,w3
00a156b8	ubfx w6,w5,#0x12,#0x6
00a156bc	lsr w5,w5,#0x1a
00a156c0	ldr w6,[x14, w6, UXTW #0x2]
00a156c4	ldr w5,[x15, w5, UXTW #0x2]
00a156c8	eor w3,w3,w23
00a156cc	ror w23,w7,#0x4
00a156d0	eor w3,w3,w6
00a156d4	ubfx w6,w7,#0x6,#0x6
00a156d8	eor w3,w3,w5
00a156dc	ubfx w5,w7,#0xe,#0x6
00a156e0	ldr w6,[x16, w6, UXTW #0x2]
00a156e4	ubfx w7,w7,#0x16,#0x6
00a156e8	ldr w5,[x17, w5, UXTW #0x2]
00a156ec	ldr w7,[x18, w7, UXTW #0x2]
00a156f0	lsr w23,w23,#0x1a
00a156f4	ldr w23,[x2, w23, UXTW #0x2]
00a156f8	ldp w19,w20,[x1, #0x68]
00a156fc	eor w3,w3,w6
00a15700	eor w3,w3,w5
00a15704	eor w3,w3,w7
00a15708	eor w3,w3,w23
00a1570c	eor w5,w3,w19
00a15710	ubfx w6,w5,#0x2,#0x6
00a15714	ldr w6,[x12, w6, UXTW #0x2]
00a15718	ubfx w23,w5,#0xa,#0x6
00a1571c	ldr w23,[x13, w23, UXTW #0x2]
00a15720	eor w20,w3,w20
00a15724	eor w4,w6,w4
00a15728	ubfx w6,w5,#0x12,#0x6
00a1572c	lsr w5,w5,#0x1a
00a15730	ldr w6,[x14, w6, UXTW #0x2]
00a15734	ldr w5,[x15, w5, UXTW #0x2]
00a15738	eor w4,w4,w23
00a1573c	ror w23,w20,#0x4
00a15740	eor w4,w4,w6
00a15744	ubfx w6,w20,#0x6,#0x6
00a15748	eor w4,w4,w5
00a1574c	ubfx w5,w20,#0xe,#0x6
00a15750	ldr w6,[x16, w6, UXTW #0x2]
00a15754	ubfx w20,w20,#0x16,#0x6
00a15758	ldr w5,[x17, w5, UXTW #0x2]
00a1575c	ldr w20,[x18, w20, UXTW #0x2]
00a15760	lsr w23,w23,#0x1a
00a15764	ldr w23,[x2, w23, UXTW #0x2]
00a15768	ldp w21,w22,[x1, #0x60]
00a1576c	eor w4,w4,w6
00a15770	eor w4,w4,w5
00a15774	eor w4,w4,w20
00a15778	eor w4,w4,w23
00a1577c	eor w5,w4,w21
00a15780	ubfx w6,w5,#0x2,#0x6
00a15784	ldr w6,[x12, w6, UXTW #0x2]
00a15788	ubfx w23,w5,#0xa,#0x6
00a1578c	ldr w23,[x13, w23, UXTW #0x2]
00a15790	eor w22,w4,w22
00a15794	eor w3,w6,w3
00a15798	ubfx w6,w5,#0x12,#0x6
00a1579c	lsr w5,w5,#0x1a
00a157a0	ldr w6,[x14, w6, UXTW #0x2]
00a157a4	ldr w5,[x15, w5, UXTW #0x2]
00a157a8	eor w3,w3,w23
00a157ac	ror w23,w22,#0x4
00a157b0	eor w3,w3,w6
00a157b4	ubfx w6,w22,#0x6,#0x6
00a157b8	eor w3,w3,w5
00a157bc	ubfx w5,w22,#0xe,#0x6
00a157c0	ldr w6,[x16, w6, UXTW #0x2]
00a157c4	ubfx w22,w22,#0x16,#0x6
00a157c8	ldr w5,[x17, w5, UXTW #0x2]
00a157cc	ldr w22,[x18, w22, UXTW #0x2]
00a157d0	lsr w23,w23,#0x1a
00a157d4	ldr w23,[x2, w23, UXTW #0x2]
00a157d8	ldp w7,w19,[x1, #0x58]
00a157dc	eor w3,w3,w6
00a157e0	eor w3,w3,w5
00a157e4	eor w3,w3,w22
00a157e8	eor w3,w3,w23
00a157ec	eor w5,w3,w7
00a157f0	ubfx w6,w5,#0x2,#0x6
00a157f4	ldr w6,[x12, w6, UXTW #0x2]
00a157f8	ubfx w23,w5,#0xa,#0x6
00a157fc	ldr w23,[x13, w23, UXTW #0x2]
00a15800	eor w19,w3,w19
00a15804	eor w4,w6,w4
00a15808	ubfx w6,w5,#0x12,#0x6
00a1580c	lsr w5,w5,#0x1a
00a15810	ldr w6,[x14, w6, UXTW #0x2]
00a15814	ldr w5,[x15, w5, UXTW #0x2]
00a15818	eor w4,w4,w23
00a1581c	ror w23,w19,#0x4
00a15820	eor w4,w4,w6
00a15824	ubfx w6,w19,#0x6,#0x6
00a15828	eor w4,w4,w5
00a1582c	ubfx w5,w19,#0xe,#0x6
00a15830	ldr w6,[x16, w6, UXTW #0x2]
00a15834	ubfx w19,w19,#0x16,#0x6
00a15838	ldr w5,[x17, w5, UXTW #0x2]
00a1583c	ldr w19,[x18, w19, UXTW #0x2]
00a15840	lsr w23,w23,#0x1a
00a15844	ldr w23,[x2, w23, UXTW #0x2]
00a15848	ldp w20,w21,[x1, #0x50]
00a1584c	eor w4,w4,w6
00a15850	eor w4,w4,w5
00a15854	eor w4,w4,w19
00a15858	eor w4,w4,w23
00a1585c	eor w5,w4,w20
00a15860	ubfx w6,w5,#0x2,#0x6
00a15864	ldr w6,[x12, w6, UXTW #0x2]
00a15868	ubfx w23,w5,#0xa,#0x6
00a1586c	ldr w23,[x13, w23, UXTW #0x2]
00a15870	eor w21,w4,w21
00a15874	eor w3,w6,w3
00a15878	ubfx w6,w5,#0x12,#0x6
00a1587c	lsr w5,w5,#0x1a
00a15880	ldr w6,[x14, w6, UXTW #0x2]
00a15884	ldr w5,[x15, w5, UXTW #0x2]
00a15888	eor w3,w3,w23
00a1588c	ror w23,w21,#0x4
00a15890	eor w3,w3,w6
00a15894	ubfx w6,w21,#0x6,#0x6
00a15898	eor w3,w3,w5
00a1589c	ubfx w5,w21,#0xe,#0x6
00a158a0	ldr w6,[x16, w6, UXTW #0x2]
00a158a4	ubfx w21,w21,#0x16,#0x6
00a158a8	ldr w5,[x17, w5, UXTW #0x2]
00a158ac	ldr w21,[x18, w21, UXTW #0x2]
00a158b0	lsr w23,w23,#0x1a
00a158b4	ldr w23,[x2, w23, UXTW #0x2]
00a158b8	ldp w7,w22,[x1, #0x48]
00a158bc	eor w3,w3,w6
00a158c0	eor w3,w3,w5
00a158c4	eor w3,w3,w21
00a158c8	eor w3,w3,w23
00a158cc	eor w5,w3,w7
00a158d0	ubfx w6,w5,#0x2,#0x6
00a158d4	ldr w6,[x12, w6, UXTW #0x2]
00a158d8	ubfx w23,w5,#0xa,#0x6
00a158dc	ldr w23,[x13, w23, UXTW #0x2]
00a158e0	eor w22,w3,w22
00a158e4	eor w4,w6,w4
00a158e8	ubfx w6,w5,#0x12,#0x6
00a158ec	lsr w5,w5,#0x1a
00a158f0	ldr w6,[x14, w6, UXTW #0x2]
00a158f4	ldr w5,[x15, w5, UXTW #0x2]
00a158f8	eor w4,w4,w23
00a158fc	ror w23,w22,#0x4
00a15900	eor w4,w4,w6
00a15904	ubfx w6,w22,#0x6,#0x6
00a15908	eor w4,w4,w5
00a1590c	ubfx w5,w22,#0xe,#0x6
00a15910	ldr w6,[x16, w6, UXTW #0x2]
00a15914	ubfx w22,w22,#0x16,#0x6
00a15918	ldr w5,[x17, w5, UXTW #0x2]
00a1591c	ldr w22,[x18, w22, UXTW #0x2]
00a15920	lsr w23,w23,#0x1a
00a15924	ldr w23,[x2, w23, UXTW #0x2]
00a15928	ldp w19,w20,[x1, #0x40]
00a1592c	eor w4,w4,w6
00a15930	eor w4,w4,w5
00a15934	eor w4,w4,w22
00a15938	eor w4,w4,w23
00a1593c	eor w5,w4,w19
00a15940	ubfx w6,w5,#0x2,#0x6
00a15944	ldr w6,[x12, w6, UXTW #0x2]
00a15948	ubfx w23,w5,#0xa,#0x6
00a1594c	ldr w23,[x13, w23, UXTW #0x2]
00a15950	eor w20,w4,w20
00a15954	eor w3,w6,w3
00a15958	ubfx w6,w5,#0x12,#0x6
00a1595c	lsr w5,w5,#0x1a
00a15960	ldr w6,[x14, w6, UXTW #0x2]
00a15964	ldr w5,[x15, w5, UXTW #0x2]
00a15968	eor w3,w3,w23
00a1596c	ror w23,w20,#0x4
00a15970	eor w3,w3,w6
00a15974	ubfx w6,w20,#0x6,#0x6
00a15978	eor w3,w3,w5
00a1597c	ubfx w5,w20,#0xe,#0x6
00a15980	ldr w6,[x16, w6, UXTW #0x2]
00a15984	ubfx w20,w20,#0x16,#0x6
00a15988	ldr w5,[x17, w5, UXTW #0x2]
00a1598c	ldr w20,[x18, w20, UXTW #0x2]
00a15990	lsr w23,w23,#0x1a
00a15994	ldr w23,[x2, w23, UXTW #0x2]
00a15998	ldp w7,w21,[x1, #0x38]
00a1599c	eor w3,w3,w6
00a159a0	eor w3,w3,w5
00a159a4	eor w3,w3,w20
00a159a8	eor w3,w3,w23
00a159ac	eor w5,w3,w7
00a159b0	ubfx w6,w5,#0x2,#0x6
00a159b4	ldr w6,[x12, w6, UXTW #0x2]
00a159b8	ubfx w23,w5,#0xa,#0x6
00a159bc	ldr w23,[x13, w23, UXTW #0x2]
00a159c0	eor w21,w3,w21
00a159c4	eor w4,w6,w4
00a159c8	ubfx w6,w5,#0x12,#0x6
00a159cc	lsr w5,w5,#0x1a
00a159d0	ldr w6,[x14, w6, UXTW #0x2]
00a159d4	ldr w5,[x15, w5, UXTW #0x2]
00a159d8	eor w4,w4,w23
00a159dc	ror w23,w21,#0x4
00a159e0	eor w4,w4,w6
00a159e4	ubfx w6,w21,#0x6,#0x6
00a159e8	eor w4,w4,w5
00a159ec	ubfx w5,w21,#0xe,#0x6
00a159f0	ldr w6,[x16, w6, UXTW #0x2]
00a159f4	ubfx w21,w21,#0x16,#0x6
00a159f8	ldr w5,[x17, w5, UXTW #0x2]
00a159fc	ldr w21,[x18, w21, UXTW #0x2]
00a15a00	lsr w23,w23,#0x1a
00a15a04	ldr w23,[x2, w23, UXTW #0x2]
00a15a08	ldp w19,w22,[x1, #0x30]
00a15a0c	eor w4,w4,w6
00a15a10	eor w4,w4,w5
00a15a14	eor w4,w4,w21
00a15a18	eor w4,w4,w23
00a15a1c	eor w5,w4,w19
00a15a20	ubfx w6,w5,#0x2,#0x6
00a15a24	ldr w6,[x12, w6, UXTW #0x2]
00a15a28	ubfx w23,w5,#0xa,#0x6
00a15a2c	ldr w23,[x13, w23, UXTW #0x2]
00a15a30	eor w22,w4,w22
00a15a34	eor w3,w6,w3
00a15a38	ubfx w6,w5,#0x12,#0x6
00a15a3c	lsr w5,w5,#0x1a
00a15a40	ldr w6,[x14, w6, UXTW #0x2]
00a15a44	ldr w5,[x15, w5, UXTW #0x2]
00a15a48	eor w3,w3,w23
00a15a4c	ror w23,w22,#0x4
00a15a50	eor w3,w3,w6
00a15a54	ubfx w6,w22,#0x6,#0x6
00a15a58	eor w3,w3,w5
00a15a5c	ubfx w5,w22,#0xe,#0x6
00a15a60	ldr w6,[x16, w6, UXTW #0x2]
00a15a64	ubfx w22,w22,#0x16,#0x6
00a15a68	ldr w5,[x17, w5, UXTW #0x2]
00a15a6c	ldr w22,[x18, w22, UXTW #0x2]
00a15a70	lsr w23,w23,#0x1a
00a15a74	ldr w23,[x2, w23, UXTW #0x2]
00a15a78	ldp w7,w20,[x1, #0x28]
00a15a7c	eor w3,w3,w6
00a15a80	eor w3,w3,w5
00a15a84	eor w3,w3,w22
00a15a88	eor w3,w3,w23
00a15a8c	eor w5,w3,w7
00a15a90	ubfx w6,w5,#0x2,#0x6
00a15a94	ldr w6,[x12, w6, UXTW #0x2]
00a15a98	ubfx w23,w5,#0xa,#0x6
00a15a9c	ldr w23,[x13, w23, UXTW #0x2]
00a15aa0	eor w20,w3,w20
00a15aa4	eor w4,w6,w4
00a15aa8	ubfx w6,w5,#0x12,#0x6
00a15aac	lsr w5,w5,#0x1a
00a15ab0	ldr w6,[x14, w6, UXTW #0x2]
00a15ab4	ldr w5,[x15, w5, UXTW #0x2]
00a15ab8	eor w4,w4,w23
00a15abc	ror w23,w20,#0x4
00a15ac0	eor w4,w4,w6
00a15ac4	ubfx w6,w20,#0x6,#0x6
00a15ac8	eor w4,w4,w5
00a15acc	ubfx w5,w20,#0xe,#0x6
00a15ad0	ldr w6,[x16, w6, UXTW #0x2]
00a15ad4	ubfx w20,w20,#0x16,#0x6
00a15ad8	ldr w5,[x17, w5, UXTW #0x2]
00a15adc	ldr w20,[x18, w20, UXTW #0x2]
00a15ae0	lsr w23,w23,#0x1a
00a15ae4	ldr w23,[x2, w23, UXTW #0x2]
00a15ae8	ldp w19,w21,[x1, #0x20]
00a15aec	eor w4,w4,w6
00a15af0	eor w4,w4,w5
00a15af4	eor w4,w4,w20
00a15af8	eor w4,w4,w23
00a15afc	eor w5,w4,w19
00a15b00	ubfx w6,w5,#0x2,#0x6
00a15b04	ldr w6,[x12, w6, UXTW #0x2]
00a15b08	ubfx w23,w5,#0xa,#0x6
00a15b0c	ldr w23,[x13, w23, UXTW #0x2]
00a15b10	eor w21,w4,w21
00a15b14	eor w3,w6,w3
00a15b18	ubfx w6,w5,#0x12,#0x6
00a15b1c	lsr w5,w5,#0x1a
00a15b20	ldr w6,[x14, w6, UXTW #0x2]
00a15b24	ldr w5,[x15, w5, UXTW #0x2]
00a15b28	eor w3,w3,w23
00a15b2c	ror w23,w21,#0x4
00a15b30	eor w3,w3,w6
00a15b34	ubfx w6,w21,#0x6,#0x6
00a15b38	eor w3,w3,w5
00a15b3c	ubfx w5,w21,#0xe,#0x6
00a15b40	ldr w6,[x16, w6, UXTW #0x2]
00a15b44	ubfx w21,w21,#0x16,#0x6
00a15b48	ldr w5,[x17, w5, UXTW #0x2]
00a15b4c	ldr w21,[x18, w21, UXTW #0x2]
00a15b50	lsr w23,w23,#0x1a
00a15b54	ldr w23,[x2, w23, UXTW #0x2]
00a15b58	ldp w7,w22,[x1, #0x18]
00a15b5c	eor w3,w3,w6
00a15b60	eor w3,w3,w5
00a15b64	eor w3,w3,w21
00a15b68	eor w3,w3,w23
00a15b6c	eor w5,w3,w7
00a15b70	ubfx w6,w5,#0x2,#0x6
00a15b74	ldr w6,[x12, w6, UXTW #0x2]
00a15b78	ubfx w23,w5,#0xa,#0x6
00a15b7c	ldr w23,[x13, w23, UXTW #0x2]
00a15b80	eor w22,w3,w22
00a15b84	eor w4,w6,w4
00a15b88	ubfx w6,w5,#0x12,#0x6
00a15b8c	lsr w5,w5,#0x1a
00a15b90	ldr w6,[x14, w6, UXTW #0x2]
00a15b94	ldr w5,[x15, w5, UXTW #0x2]
00a15b98	eor w4,w4,w23
00a15b9c	ror w23,w22,#0x4
00a15ba0	eor w4,w4,w6
00a15ba4	ubfx w6,w22,#0x6,#0x6
00a15ba8	eor w4,w4,w5
00a15bac	ubfx w5,w22,#0xe,#0x6
00a15bb0	ldr w6,[x16, w6, UXTW #0x2]
00a15bb4	ubfx w22,w22,#0x16,#0x6
00a15bb8	ldr w5,[x17, w5, UXTW #0x2]
00a15bbc	ldr w22,[x18, w22, UXTW #0x2]
00a15bc0	lsr w23,w23,#0x1a
00a15bc4	ldr w23,[x2, w23, UXTW #0x2]
00a15bc8	ldp w19,w20,[x1, #0x10]
00a15bcc	eor w4,w4,w6
00a15bd0	eor w4,w4,w5
00a15bd4	eor w4,w4,w22
00a15bd8	eor w4,w4,w23
00a15bdc	eor w5,w4,w19
00a15be0	eor w19,w4,w20
00a15be4	ubfx w20,w5,#0x2,#0x6
00a15be8	ldr w20,[x12, w20, UXTW #0x2]
00a15bec	ubfx w23,w5,#0xa,#0x6
00a15bf0	ldr w23,[x13, w23, UXTW #0x2]
00a15bf4	ror w22,w19,#0x4
00a15bf8	eor w3,w20,w3
00a15bfc	ubfx w20,w5,#0x12,#0x6
00a15c00	ldr w20,[x14, w20, UXTW #0x2]
00a15c04	lsr w5,w5,#0x1a
00a15c08	eor w3,w3,w23
00a15c0c	ubfx w23,w19,#0x6,#0x6
00a15c10	ldr w5,[x15, w5, UXTW #0x2]
00a15c14	eor w3,w3,w20
00a15c18	ubfx w20,w19,#0xe,#0x6
00a15c1c	ldr w23,[x16, w23, UXTW #0x2]
00a15c20	ubfx w19,w19,#0x16,#0x6
00a15c24	ldr w20,[x17, w20, UXTW #0x2]
00a15c28	ldr w19,[x18, w19, UXTW #0x2]
00a15c2c	lsr w22,w22,#0x1a
00a15c30	ldr w22,[x2, w22, UXTW #0x2]
00a15c34	eor w3,w3,w5
00a15c38	ldp w7,w21,[x1, #0x8]
00a15c3c	eor w3,w3,w23
00a15c40	eor w3,w3,w20
00a15c44	eor w3,w3,w19
00a15c48	eor w3,w3,w22
00a15c4c	eor w5,w3,w7
00a15c50	ubfx w20,w5,#0x2,#0x6
00a15c54	eor w7,w3,w21
00a15c58	ubfx w21,w5,#0xa,#0x6
00a15c5c	ldr w12,[x12, w20, UXTW #0x2]
00a15c60	ubfx w22,w5,#0x12,#0x6
00a15c64	ldr w13,[x13, w21, UXTW #0x2]
00a15c68	lsr w5,w5,#0x1a
00a15c6c	ldr w14,[x14, w22, UXTW #0x2]
00a15c70	ubfx w23,w7,#0x6,#0x6
00a15c74	ldr w15,[x15, w5, UXTW #0x2]
00a15c78	ubfx w20,w7,#0xe,#0x6
00a15c7c	ldr w16,[x16, w23, UXTW #0x2]
00a15c80	eor w12,w12,w4
00a15c84	ror w19,w7,#0x4
00a15c88	ubfx w7,w7,#0x16,#0x6
00a15c8c	ldr w17,[x17, w20, UXTW #0x2]
00a15c90	eor w12,w12,w13
00a15c94	ldr w18,[x18, w7, UXTW #0x2]
00a15c98	lsr w5,w19,#0x1a
00a15c9c	eor w12,w12,w14
00a15ca0	ldr w2,[x2, w5, UXTW #0x2]
00a15ca4	eor w12,w12,w15
00a15ca8	ldr w6,[x1]
00a15cac	eor w12,w12,w16
00a15cb0	eor w12,w12,w17
00a15cb4	eor w12,w12,w18
00a15cb8	eor w12,w12,w2
00a15cbc	eor w13,w12,w6
00a15cc0	add x14,x1,#0x4
00a15cc4	adrp x16,0xcb5000
00a15cc8	ldr w14,[x14]
00a15ccc	ldr x16,[x16, #0x4c8]
00a15cd0	ubfx w15,w13,#0x2,#0x6
00a15cd4	ubfx w17,w13,#0xa,#0x6
00a15cd8	ubfx w18,w13,#0x12,#0x6
00a15cdc	ldr w15,[x16, w15, UXTW #0x2]
00a15ce0	add x17,x16,w17, UXTW  #0x2
00a15ce4	ldr w17,[x17, #0x200]
00a15ce8	lsr w13,w13,#0x1a
00a15cec	ror w1,w12,#0x3
00a15cf0	add x18,x16,w18, UXTW  #0x2
00a15cf4	eor w12,w12,w14
00a15cf8	add x13,x16,w13, UXTW  #0x2
00a15cfc	ldr w18,[x18, #0x400]
00a15d00	ubfx w2,w12,#0x6,#0x6
00a15d04	ldr w13,[x13, #0x600]
00a15d08	ubfx w4,w12,#0xe,#0x6
00a15d0c	eor w15,w15,w3
00a15d10	add x2,x16,w2, UXTW  #0x2
00a15d14	ror w14,w12,#0x4
00a15d18	ubfx w12,w12,#0x16,#0x6
00a15d1c	add x3,x16,w4, UXTW  #0x2
00a15d20	eor w15,w15,w17
00a15d24	ldr w17,[x2, #0x100]
00a15d28	add x12,x16,w12, UXTW  #0x2
00a15d2c	lsr w14,w14,#0x1a
00a15d30	ldr w2,[x3, #0x300]
00a15d34	ldr w12,[x12, #0x500]
00a15d38	add x14,x16,w14, UXTW  #0x2
00a15d3c	eor w15,w15,w18
00a15d40	ldr w14,[x14, #0x700]
00a15d44	eor w13,w15,w13
00a15d48	eor w13,w13,w17
00a15d4c	eor w13,w13,w2
00a15d50	eor w12,w13,w12
00a15d54	eor w12,w12,w14
00a15d58	ror w12,w12,#0x3
00a15d5c	eor w13,w1,w12, LSR #0x1
00a15d60	and w9,w13,w9
00a15d64	eor w13,w9,w1
00a15d68	eor w9,w12,w9, LSL #0x1
00a15d6c	eor w12,w9,w13, LSR #0x8
00a15d70	and w11,w12,w11
00a15d74	eor w9,w11,w9
00a15d78	eor w11,w13,w11, LSL #0x8
00a15d7c	eor w12,w11,w9, LSR #0x2
00a15d80	and w10,w12,w10
00a15d84	eor w9,w9,w10, LSL #0x2
00a15d88	eor w11,w10,w11
00a15d8c	and w10,w9,#0xffff
00a15d90	eor w10,w10,w11, LSR #0x10
00a15d94	eor w9,w10,w9
00a15d98	eor w10,w11,w10, LSL #0x10
00a15d9c	eor w11,w10,w9, LSR #0x4
00a15da0	and w8,w11,w8
00a15da4	eor w10,w8,w10
00a15da8	eor w8,w9,w8, LSL #0x4
00a15dac	stp w10,w8,[x0]
00a15db0	ldp x20,x19,[sp, #0x20]
00a15db4	ldp x22,x21,[sp, #0x10]
00a15db8	ldr x23,[sp], #0x30
00a15dbc	ret
