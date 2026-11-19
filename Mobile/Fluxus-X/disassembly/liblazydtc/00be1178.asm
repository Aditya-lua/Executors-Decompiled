; FUN_00be1178 @ 00be1178
00be1178	paciasp
00be117c	sub sp,sp,#0x1e0
00be1180	stp x29,x30,[sp, #0x180]
00be1184	stp x28,x27,[sp, #0x190]
00be1188	stp x26,x25,[sp, #0x1a0]
00be118c	stp x24,x23,[sp, #0x1b0]
00be1190	stp x22,x21,[sp, #0x1c0]
00be1194	stp x20,x19,[sp, #0x1d0]
00be1198	add x29,sp,#0x180
00be119c	ldr w8,[x3, #0x8]
00be11a0	mov w9,#0x4a
00be11a4	mov x25,x3
00be11a8	mov x20,x2
00be11ac	mov x21,x1
00be11b0	sub x27,x29,#0xb0
00be11b4	ands w8,w8,w9
00be11b8	stp x5,x4,[sp, #0x10]
00be11bc	b.eq 0x00be11e0
00be11c0	cmp w8,#0x40
00be11c4	b.eq 0x00be11d8
00be11c8	cmp w8,#0x8
00be11cc	b.ne 0x00be11e8
00be11d0	mov w23,#0x10
00be11d4	b 0x00be11ec
00be11d8	mov w23,#0x8
00be11dc	b 0x00be11ec
00be11e0	mov w23,wzr
00be11e4	b 0x00be11ec
00be11e8	mov w23,#0xa
00be11ec	sub x2,x29,#0x74
00be11f0	mov x1,x25
00be11f4	bl 0x00c0cb44
00be11f8	mov x24,x0
00be11fc	sub x8,x29,#0x90
00be1200	sub x1,x29,#0xc
00be1204	mov x0,x25
00be1208	bl 0x00c0cc28
00be120c	stp xzr,xzr,[x27, #0x8]
00be1210	str xzr,[x27, #0x18]
00be1214	sub x0,x29,#0xa8
00be1218	mov w1,#0x16
00be121c	mov w2,wzr
00be1220	sub x19,x29,#0xa8
00be1224	bl 0x00c30250
00be1228	ldurb w8,[x29, #-0xa8]
00be122c	ldr x9,[x27, #0x18]
00be1230	add x10,sp,#0x30
00be1234	orr x28,x19,#0x1
00be1238	add x22,sp,#0x28
00be123c	str x10,[sp, #0x28]
00be1240	tst w8,#0x1
00be1244	str wzr,[sp, #0x24]
00be1248	csinc x25,x9,x19,ne
00be124c	mov w19,#0x16
00be1250	str x25,[x27]
00be1254	b 0x00be1260
00be1258	add x8,x8,#0x4
00be125c	str x8,[x21, #0x18]
00be1260	cbz x21,0x00be1278
00be1264	ldp x8,x9,[x21, #0x18]
00be1268	cmp x8,x9
00be126c	b.eq 0x00be1288
00be1270	ldr w0,[x8]
00be1274	b 0x00be1298
00be1278	mov w26,#0x1
00be127c	cbnz x20,0x00be12a8
00be1280	tbz w26,#0x0,0x00be12e0
00be1284	b 0x00be1424
00be1288	ldr x8,[x21]
00be128c	ldr x8,[x8, #0x48]
00be1290	mov x0,x21
00be1294	blr x8
00be1298	cmn w0,#0x1
00be129c	cset w26,eq
00be12a0	csel x21,xzr,x21,eq
00be12a4	cbz x20,0x00be1280
00be12a8	ldp x8,x9,[x20, #0x18]
00be12ac	cmp x8,x9
00be12b0	b.eq 0x00be12bc
00be12b4	ldr w0,[x8]
00be12b8	b 0x00be12cc
00be12bc	ldr x8,[x20]
00be12c0	ldr x8,[x8, #0x48]
00be12c4	mov x0,x20
00be12c8	blr x8
00be12cc	cmn w0,#0x1
00be12d0	cset w8,eq
00be12d4	csel x20,xzr,x20,eq
00be12d8	cmp w26,w8
00be12dc	b.eq 0x00be1424
00be12e0	ldurb w8,[x29, #-0xa8]
00be12e4	ldr x9,[x27, #0x10]
00be12e8	ldr x11,[x27]
00be12ec	lsr x10,x8,#0x1
00be12f0	tst w8,#0x1
00be12f4	csel x26,x10,x9,eq
00be12f8	add x9,x25,x26
00be12fc	cmp x11,x9
00be1300	b.ne 0x00be13b8
00be1304	cmp x26,#0x1
00be1308	b.lt 0x00be1320
00be130c	sub x0,x29,#0xa8
00be1310	mov x1,x26
00be1314	mov w2,wzr
00be1318	bl 0x00c30250
00be131c	b 0x00be1344
00be1320	lsl x9,x26,#0x1
00be1324	tbnz w8,#0x0,0x00be1338
00be1328	lsl w8,w9,#0x1
00be132c	sturb w8,[x29, #-0xa8]
00be1330	mov x8,x28
00be1334	b 0x00be1340
00be1338	ldr x8,[x27, #0x18]
00be133c	str x9,[x27, #0x10]
00be1340	strb wzr,[x8, x9]
00be1344	ldp x9,x10,[x27, #0x8]
00be1348	ldurb w8,[x29, #-0xa8]
00be134c	tst w8,#0x1
00be1350	and x11,x9,#-0x2
00be1354	ubfx x12,x9,#0x1,#0x7
00be1358	sub x11,x11,#0x1
00be135c	csel x8,x19,x11,eq
00be1360	tst x9,#0x1
00be1364	csel x10,x12,x10,eq
00be1368	subs x1,x8,x10
00be136c	b.ls 0x00be1380
00be1370	sub x0,x29,#0xa8
00be1374	mov w2,wzr
00be1378	bl 0x00c30250
00be137c	b 0x00be13a0
00be1380	tbnz w9,#0x0,0x00be1394
00be1384	lsl w9,w8,#0x1
00be1388	sturb w9,[x29, #-0xa8]
00be138c	mov x9,x28
00be1390	b 0x00be139c
00be1394	ldr x9,[x27, #0x18]
00be1398	str x8,[x27, #0x10]
00be139c	strb wzr,[x9, x8]
00be13a0	ldurb w8,[x29, #-0xa8]
00be13a4	ldr x9,[x27, #0x18]
00be13a8	tst w8,#0x1
00be13ac	csel x25,x28,x9,eq
00be13b0	add x8,x25,x26
00be13b4	str x8,[x27]
00be13b8	ldp x8,x9,[x21, #0x18]
00be13bc	cmp x8,x9
00be13c0	b.eq 0x00be13cc
00be13c4	ldr w0,[x8]
00be13c8	b 0x00be13dc
00be13cc	ldr x8,[x21]
00be13d0	ldr x8,[x8, #0x48]
00be13d4	mov x0,x21
00be13d8	blr x8
00be13dc	ldur w5,[x29, #-0xc]
00be13e0	sub x3,x29,#0xb0
00be13e4	add x4,sp,#0x24
00be13e8	sub x6,x29,#0x90
00be13ec	add x7,sp,#0x30
00be13f0	mov w1,w23
00be13f4	mov x2,x25
00be13f8	stp x22,x24,[sp]
00be13fc	bl 0x00c44120
00be1400	cbnz w0,0x00be1424
00be1404	ldp x8,x9,[x21, #0x18]
00be1408	cmp x8,x9
00be140c	b.ne 0x00be1258
00be1410	ldr x8,[x21]
00be1414	ldr x8,[x8, #0x50]
00be1418	mov x0,x21
00be141c	blr x8
00be1420	b 0x00be1260
00be1424	ldurb w8,[x29, #-0x90]
00be1428	ldr x9,[x27, #0x28]
00be142c	ldr x22,[sp, #0x18]
00be1430	lsr x10,x8,#0x1
00be1434	tst w8,#0x1
00be1438	csel x8,x10,x9,eq
00be143c	cbz x8,0x00be1460
00be1440	ldr x8,[sp, #0x28]
00be1444	add x9,sp,#0x30
00be1448	sub x9,x8,x9
00be144c	cmp x9,#0x9f
00be1450	b.gt 0x00be1460
00be1454	ldr w9,[sp, #0x24]
00be1458	str w9,[x8], #0x4
00be145c	str x8,[sp, #0x28]
00be1460	ldr x1,[x27]
00be1464	mov x0,x25
00be1468	mov x2,x22
00be146c	mov w3,w23
00be1470	bl 0x00c0c5f4
00be1474	ldurb w10,[x29, #-0x90]
00be1478	ldr x12,[sp, #0x28]
00be147c	add x11,sp,#0x30
00be1480	ldr x8,[x27, #0x28]
00be1484	lsr x9,x10,#0x1
00be1488	ands w13,w10,#0x1
00be148c	sub x11,x12,x11
00be1490	csel x8,x9,x8,eq
00be1494	ldr x9,[sp, #0x10]
00be1498	cmp x11,#0x5
00be149c	str x0,[x9]
00be14a0	b.lt 0x00be1600
00be14a4	cbz x8,0x00be1600
00be14a8	sub x8,x12,#0x4
00be14ac	add x9,sp,#0x30
00be14b0	cmp x9,x8
00be14b4	cset w11,cc
00be14b8	cmp x9,x12
00be14bc	b.eq 0x00be156c
00be14c0	cbz w11,0x00be156c
00be14c4	add x10,sp,#0x30
00be14c8	sub x14,x12,#0x8
00be14cc	add x11,x10,#0x4
00be14d0	cmp x14,x11
00be14d4	csel x13,x14,x11,hi
00be14d8	sub x13,x13,#0x4
00be14dc	cmp x13,x10
00be14e0	cinc x15,x10,ne
00be14e4	cmp x13,x10
00be14e8	sub x15,x13,x15
00be14ec	lsr x15,x15,#0x3
00be14f0	cinc x13,x15,ne
00be14f4	cmp x13,#0x13
00be14f8	b.cc 0x00be1540
00be14fc	cmp x14,x11
00be1500	csel x14,x14,x11,hi
00be1504	sub x14,x14,#0x4
00be1508	cmp x14,x10
00be150c	cinc x15,x10,ne
00be1510	cmp x14,x10
00be1514	sub x15,x14,x15
00be1518	lsr x15,x15,#0x3
00be151c	cinc x14,x15,ne
00be1520	cmp x10,x12
00be1524	b.cs 0x00be16e0
00be1528	lsl x14,x14,#0x2
00be152c	sub x15,x12,x14
00be1530	add x11,x11,x14
00be1534	sub x14,x15,#0x4
00be1538	cmp x14,x11
00be153c	b.cs 0x00be16e0
00be1540	mov x11,x8
00be1544	add x10,x10,#0x4
00be1548	ldr w12,[x11]
00be154c	ldur w13,[x10, #-0x4]
00be1550	stur w12,[x10, #-0x4]
00be1554	str w13,[x11], #-0x4
00be1558	cmp x10,x11
00be155c	add x10,x10,#0x4
00be1560	b.cc 0x00be1548
00be1564	ldurb w10,[x29, #-0x90]
00be1568	and w13,w10,#0x1
00be156c	ldr x11,[x27, #0x30]
00be1570	cmp w13,#0x0
00be1574	sub x12,x29,#0x90
00be1578	csinc x11,x11,x12,ne
00be157c	cmp x9,x8
00be1580	b.cs 0x00be15d8
00be1584	lsr w9,w10,#0x1
00be1588	ldr x10,[x27, #0x28]
00be158c	cmp w13,#0x0
00be1590	csel x9,x9,x10,eq
00be1594	add x10,sp,#0x30
00be1598	add x9,x11,x9
00be159c	b 0x00be15b8
00be15a0	sub x12,x9,x11
00be15a4	add x10,x10,#0x4
00be15a8	cmp x12,#0x1
00be15ac	cinc x11,x11,gt
00be15b0	cmp x10,x8
00be15b4	b.cs 0x00be15d8
00be15b8	ldrb w12,[x11]
00be15bc	cbz w12,0x00be15a0
00be15c0	cmp w12,#0xff
00be15c4	b.eq 0x00be15a0
00be15c8	ldr w13,[x10]
00be15cc	cmp w13,w12
00be15d0	b.eq 0x00be15a0
00be15d4	b 0x00be15f8
00be15d8	ldrb w9,[x11]
00be15dc	cbz w9,0x00be1600
00be15e0	cmp w9,#0xff
00be15e4	b.eq 0x00be1600
00be15e8	ldr w8,[x8]
00be15ec	sub w8,w8,#0x1
00be15f0	cmp w8,w9
00be15f4	b.cc 0x00be1600
00be15f8	mov w8,#0x4
00be15fc	str w8,[x22]
00be1600	cbz x21,0x00be1618
00be1604	ldp x8,x9,[x21, #0x18]
00be1608	cmp x8,x9
00be160c	b.eq 0x00be1628
00be1610	ldr w0,[x8]
00be1614	b 0x00be1638
00be1618	mov w19,#0x1
00be161c	cbnz x20,0x00be1648
00be1620	tbnz w19,#0x0,0x00be167c
00be1624	b 0x00be1688
00be1628	ldr x8,[x21]
00be162c	ldr x8,[x8, #0x48]
00be1630	mov x0,x21
00be1634	blr x8
00be1638	cmn w0,#0x1
00be163c	cset w19,eq
00be1640	csel x21,xzr,x21,eq
00be1644	cbz x20,0x00be1620
00be1648	ldp x8,x9,[x20, #0x18]
00be164c	cmp x8,x9
00be1650	b.eq 0x00be165c
00be1654	ldr w0,[x8]
00be1658	b 0x00be166c
00be165c	ldr x8,[x20]
00be1660	ldr x8,[x8, #0x48]
00be1664	mov x0,x20
00be1668	blr x8
00be166c	cmn w0,#0x1
00be1670	cset w8,eq
00be1674	eor w8,w19,w8
00be1678	tbnz w8,#0x0,0x00be1688
00be167c	ldr w8,[x22]
00be1680	orr w8,w8,#0x2
00be1684	str w8,[x22]
00be1688	ldurb w8,[x29, #-0xa8]
00be168c	tbz w8,#0x0,0x00be16a0
00be1690	ldr x8,[x27, #0x8]
00be1694	ldr x0,[x27, #0x18]
00be1698	and x1,x8,#-0x2
00be169c	bl 0x00c2fe80
00be16a0	ldurb w8,[x29, #-0x90]
00be16a4	tbz w8,#0x0,0x00be16b8
00be16a8	ldr x8,[x27, #0x20]
00be16ac	ldr x0,[x27, #0x30]
00be16b0	and x1,x8,#-0x2
00be16b4	bl 0x00c2fe80
00be16b8	mov x0,x21
00be16bc	ldp x20,x19,[sp, #0x1d0]
00be16c0	ldp x22,x21,[sp, #0x1c0]
00be16c4	ldp x24,x23,[sp, #0x1b0]
00be16c8	ldp x26,x25,[sp, #0x1a0]
00be16cc	ldp x28,x27,[sp, #0x190]
00be16d0	ldp x29,x30,[sp, #0x180]
00be16d4	add sp,sp,#0x1e0
00be16d8	autiasp
00be16dc	ret
00be16e0	add x13,x13,#0x1
00be16e4	add x15,sp,#0x30
00be16e8	sub x12,x12,#0x10
00be16ec	and x14,x13,#0x7ffffffffffffff8
00be16f0	lsl x10,x14,#0x2
00be16f4	mov x16,x14
00be16f8	sub x11,x8,x10
00be16fc	add x10,x15,x10
00be1700	add x15,x15,#0x10
00be1704	ldp q1,q0,[x12, #-0x10]
00be1708	sub x16,x16,#0x8
00be170c	ldp q2,q3,[x15, #-0x10]
00be1710	rev64 v0.4S,v0.4S
00be1714	rev64 v1.4S,v1.4S
00be1718	rev64 v2.4S,v2.4S
00be171c	rev64 v3.4S,v3.4S
00be1720	ext v0.16B,v0.16B,v0.16B,0x8
00be1724	ext v1.16B,v1.16B,v1.16B,0x8
00be1728	ext v2.16B,v2.16B,v2.16B,0x8
00be172c	ext v3.16B,v3.16B,v3.16B,0x8
00be1730	stp q0,q1,[x15, #-0x10]
00be1734	add x15,x15,#0x20
00be1738	stp q3,q2,[x12, #-0x10]
00be173c	sub x12,x12,#0x20
00be1740	cbnz x16,0x00be1704
00be1744	cmp x13,x14
00be1748	b.eq 0x00be1564
00be174c	b 0x00be1544
