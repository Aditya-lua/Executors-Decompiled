; std::__ndk1::money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00bf12bc
00bf12bc	paciasp
00bf12c0	stp x29,x30,[sp, #-0x60]!
00bf12c4	stp x28,x27,[sp, #0x10]
00bf12c8	stp x26,x25,[sp, #0x20]
00bf12cc	stp x24,x23,[sp, #0x30]
00bf12d0	stp x22,x21,[sp, #0x40]
00bf12d4	stp x20,x19,[sp, #0x50]
00bf12d8	mov x29,sp
00bf12dc	sub sp,sp,#0x210
00bf12e0	mov w25,w2
00bf12e4	mov x21,x1
00bf12e8	sub x8,x29,#0x6c
00bf12ec	adrp x2,0x2be000
00bf12f0	add x2,x2,#0xc54
00bf12f4	sub x0,x29,#0x6c
00bf12f8	mov w1,#0x64
00bf12fc	mov w27,w4
00bf1300	mov x22,x3
00bf1304	stur x8,[x29, #-0x78]
00bf1308	str q0,[sp, #0x40]
00bf130c	bl 0x00c31ed0
00bf1310	cmp w0,#0x64
00bf1314	b.cc 0x00bf1370
00bf1318	adrp x8,0xd27000
00bf131c	add x8,x8,#0xf8
00bf1320	adrp x19,0xd27000
00bf1324	ldarb w8,[x8]
00bf1328	tbz w8,#0x0,0x00bf1650
00bf132c	ldr x1,[x19, #0xf0]
00bf1330	ldr q0,[sp, #0x40]
00bf1334	adrp x2,0x2be000
00bf1338	add x2,x2,#0xc54
00bf133c	sub x0,x29,#0x78
00bf1340	mov x19,xzr
00bf1344	bl 0x00c0cdd4
00bf1348	mov w28,w0
00bf134c	cmn w0,#0x1
00bf1350	b.eq 0x00bf1688
00bf1354	sxtw x0,w28
00bf1358	ldur x19,[x29, #-0x78]
00bf135c	bl 0x00c308d0
00bf1360	cbz x0,0x00bf1690
00bf1364	mov x20,x0
00bf1368	mov x24,x0
00bf136c	b 0x00bf1380
00bf1370	mov w28,w0
00bf1374	mov x20,xzr
00bf1378	mov x19,xzr
00bf137c	sub x24,x29,#0xdc
00bf1380	sub x8,x29,#0xe8
00bf1384	mov x0,x22
00bf1388	stp x21,x19,[sp, #0x38]
00bf138c	bl 0x00c30070
00bf1390	adrp x23,0xcb4000
00bf1394	ldr x23,[x23, #0x998]
00bf1398	ldur x21,[x29, #-0xe8]
00bf139c	str x23,[sp, #0xe8]
00bf13a0	ldar x8,[x23]
00bf13a4	cmn x8,#0x1
00bf13a8	b.eq 0x00bf13d4
00bf13ac	add x8,sp,#0xe8
00bf13b0	add x9,sp,#0x68
00bf13b4	str x8,[sp, #0x68]
00bf13b8	str x9,[sp, #0x100]
00bf13bc	adrp x0,0xcb4000
00bf13c0	nop
00bf13c4	adr x2,0xc0bab0
00bf13c8	ldr x0,[x0, #0x998]
00bf13cc	add x1,sp,#0x100
00bf13d0	bl 0x00c305d0
00bf13d4	ldp x8,x10,[x21, #0x10]
00bf13d8	ldrsw x9,[x23, #0x8]
00bf13dc	sub x9,x9,#0x1
00bf13e0	sub x10,x10,x8
00bf13e4	cmp x9,x10, ASR #0x3
00bf13e8	b.cs 0x00bf164c
00bf13ec	ldr x26,[x8, x9, LSL #0x3]
00bf13f0	cbz x26,0x00bf164c
00bf13f4	ldr x8,[x26]
00bf13f8	ldur x1,[x29, #-0x78]
00bf13fc	sxtw x21,w28
00bf1400	ldr x8,[x8, #0x40]
00bf1404	add x2,x1,x21
00bf1408	mov x0,x26
00bf140c	mov x3,x24
00bf1410	blr x8
00bf1414	mov w19,w27
00bf1418	cmp w28,#0x1
00bf141c	b.lt 0x00bf1434
00bf1420	ldur x8,[x29, #-0x78]
00bf1424	ldrb w8,[x8]
00bf1428	cmp w8,#0x2d
00bf142c	cset w27,eq
00bf1430	b 0x00bf1438
00bf1434	mov w27,wzr
00bf1438	stp xzr,xzr,[sp, #0x100]
00bf143c	str xzr,[sp, #0x110]
00bf1440	stp xzr,xzr,[sp, #0xe8]
00bf1444	str xzr,[sp, #0xf8]
00bf1448	stp xzr,xzr,[sp, #0xd0]
00bf144c	str xzr,[sp, #0xe0]
00bf1450	add x8,sp,#0xcc
00bf1454	add x9,sp,#0xd0
00bf1458	and w0,w25,#0x1
00bf145c	sub x2,x29,#0xe8
00bf1460	sub x3,x29,#0xec
00bf1464	sub x4,x29,#0xf0
00bf1468	sub x5,x29,#0xf4
00bf146c	add x6,sp,#0x100
00bf1470	add x7,sp,#0xe8
00bf1474	mov w1,w27
00bf1478	stp x9,x8,[sp]
00bf147c	bl 0x00c44240
00bf1480	ldrsw x23,[sp, #0xcc]
00bf1484	cmp w28,w23
00bf1488	b.le 0x00bf14dc
00bf148c	ldrb w8,[sp, #0xd0]
00bf1490	ldrb w9,[sp, #0xe8]
00bf1494	ldr x10,[sp, #0xd8]
00bf1498	lsr x11,x8,#0x1
00bf149c	tst w8,#0x1
00bf14a0	ldr x8,[sp, #0xf0]
00bf14a4	lsr x12,x9,#0x1
00bf14a8	csel x10,x11,x10,eq
00bf14ac	sub x11,x21,x23
00bf14b0	tst w9,#0x1
00bf14b4	csel x8,x12,x8,eq
00bf14b8	add x9,x23,x11, LSL #0x1
00bf14bc	add x8,x10,x8
00bf14c0	add x8,x9,x8
00bf14c4	add x0,x8,#0x1
00bf14c8	cmp x0,#0x65
00bf14cc	b.cs 0x00bf1518
00bf14d0	mov x25,xzr
00bf14d4	add x28,sp,#0x68
00bf14d8	b 0x00bf1528
00bf14dc	ldrb w8,[sp, #0xd0]
00bf14e0	ldrb w9,[sp, #0xe8]
00bf14e4	ldr x10,[sp, #0xd8]
00bf14e8	lsr x11,x8,#0x1
00bf14ec	tst w8,#0x1
00bf14f0	ldr x8,[sp, #0xf0]
00bf14f4	lsr x12,x9,#0x1
00bf14f8	csel x10,x11,x10,eq
00bf14fc	tst w9,#0x1
00bf1500	csel x8,x12,x8,eq
00bf1504	add x9,x23,x10
00bf1508	add x8,x9,x8
00bf150c	add x0,x8,#0x2
00bf1510	cmp x0,#0x65
00bf1514	b.cc 0x00bf14d0
00bf1518	bl 0x00c308d0
00bf151c	mov x25,x0
00bf1520	mov x28,x0
00bf1524	cbz x0,0x00bf1694
00bf1528	ldr w3,[x22, #0x8]
00bf152c	ldurb w8,[x29, #-0xf0]
00bf1530	ldurb w9,[x29, #-0xf4]
00bf1534	add x10,sp,#0xd0
00bf1538	add x11,sp,#0xe8
00bf153c	add x1,sp,#0x60
00bf1540	stp x11,x10,[sp, #0x20]
00bf1544	add x10,sp,#0x100
00bf1548	sub x11,x29,#0xec
00bf154c	add x2,sp,#0x58
00bf1550	add x5,x24,x21
00bf1554	mov x0,x28
00bf1558	mov x4,x24
00bf155c	mov x6,x26
00bf1560	mov w7,w27
00bf1564	str w23,[sp, #0x30]
00bf1568	str x10,[sp, #0x18]
00bf156c	strb w9,[sp, #0x10]
00bf1570	strb w8,[sp, #0x8]
00bf1574	str x11,[sp]
00bf1578	bl 0x00c44250
00bf157c	ldp x3,x2,[sp, #0x58]
00bf1580	ldr x0,[sp, #0x38]
00bf1584	mov x1,x28
00bf1588	mov x4,x22
00bf158c	mov w5,w19
00bf1590	bl 0x00be5420
00bf1594	mov x21,x0
00bf1598	cbz x25,0x00bf15a4
00bf159c	mov x0,x25
00bf15a0	bl 0x00c30960
00bf15a4	ldrb w8,[sp, #0xd0]
00bf15a8	ldr x19,[sp, #0x40]
00bf15ac	tbnz w8,#0x0,0x00bf1618
00bf15b0	ldrb w8,[sp, #0xe8]
00bf15b4	tbnz w8,#0x0,0x00bf1630
00bf15b8	ldrb w8,[sp, #0x100]
00bf15bc	tbz w8,#0x0,0x00bf15d0
00bf15c0	ldr x8,[sp, #0x100]
00bf15c4	ldr x0,[sp, #0x110]
00bf15c8	and x1,x8,#-0x2
00bf15cc	bl 0x00c2fe80
00bf15d0	sub x0,x29,#0xe8
00bf15d4	bl 0x00c30090
00bf15d8	cbz x20,0x00bf15e4
00bf15dc	mov x0,x20
00bf15e0	bl 0x00c30960
00bf15e4	cbz x19,0x00bf15f0
00bf15e8	mov x0,x19
00bf15ec	bl 0x00c30960
00bf15f0	mov x0,x21
00bf15f4	add sp,sp,#0x210
00bf15f8	ldp x20,x19,[sp, #0x50]
00bf15fc	ldp x22,x21,[sp, #0x40]
00bf1600	ldp x24,x23,[sp, #0x30]
00bf1604	ldp x26,x25,[sp, #0x20]
00bf1608	ldp x28,x27,[sp, #0x10]
00bf160c	ldp x29,x30,[sp], #0x60
00bf1610	autiasp
00bf1614	ret
00bf1618	ldr x8,[sp, #0xd0]
00bf161c	ldr x0,[sp, #0xe0]
00bf1620	and x1,x8,#-0x2
00bf1624	bl 0x00c2fe80
00bf1628	ldrb w8,[sp, #0xe8]
00bf162c	tbz w8,#0x0,0x00bf15b8
00bf1630	ldr x8,[sp, #0xe8]
00bf1634	ldr x0,[sp, #0xf8]
00bf1638	and x1,x8,#-0x2
00bf163c	bl 0x00c2fe80
00bf1640	ldrb w8,[sp, #0x100]
00bf1644	tbnz w8,#0x0,0x00bf15c0
00bf1648	b 0x00bf15d0
00bf164c	bl 0x00bd8968
00bf1650	adrp x0,0xd27000
00bf1654	add x0,x0,#0xf8
00bf1658	bl 0x00c2fe90
00bf165c	cbz w0,0x00bf132c
00bf1660	adrp x1,0x2c6000
00bf1664	add x1,x1,#0xbfc
00bf1668	mov w0,#0x1fbf
00bf166c	mov x2,xzr
00bf1670	bl 0x00c43890
00bf1674	str x0,[x19, #0xf0]
00bf1678	adrp x0,0xd27000
00bf167c	add x0,x0,#0xf8
00bf1680	bl 0x00c2fea0
00bf1684	b 0x00bf132c
00bf1688	mov x19,xzr
00bf168c	bl 0x00c43cc0
00bf1690	bl 0x00c43cc0
00bf1694	bl 0x00c43cc0
00bf1698	mov x21,x0
00bf169c	adrp x0,0xd27000
00bf16a0	add x0,x0,#0xf8
00bf16a4	bl 0x00c2feb0
00bf16a8	mov x0,x21
00bf16ac	bl 0x00c2c090
