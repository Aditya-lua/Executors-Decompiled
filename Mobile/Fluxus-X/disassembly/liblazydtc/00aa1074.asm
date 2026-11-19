; ossl_pw_get_passphrase @ 00aa1074
00aa1074	sub sp,sp,#0x70
00aa1078	stp x28,x27,[sp, #0x10]
00aa107c	stp x26,x25,[sp, #0x20]
00aa1080	stp x24,x23,[sp, #0x30]
00aa1084	stp x22,x21,[sp, #0x40]
00aa1088	stp x20,x19,[sp, #0x50]
00aa108c	stp x29,x30,[sp, #0x60]
00aa1090	ldr w8,[x5]
00aa1094	mov x21,x5
00aa1098	mov w24,w4
00aa109c	mov x19,x2
00aa10a0	mov x27,x1
00aa10a4	cmp w8,#0x1
00aa10a8	mov x20,x0
00aa10ac	add x29,sp,#0x60
00aa10b0	b.ne 0x00aa10c4
00aa10b4	ldr x1,[x21, #0x8]
00aa10b8	cbz x1,0x00aa1144
00aa10bc	add x8,x21,#0x10
00aa10c0	b 0x00aa10d8
00aa10c4	ldrb w9,[x21, #0x18]
00aa10c8	tbz w9,#0x0,0x00aa10fc
00aa10cc	ldr x1,[x21, #0x20]
00aa10d0	cbz x1,0x00aa10fc
00aa10d4	add x8,x21,#0x28
00aa10d8	ldr x8,[x8]
00aa10dc	mov x0,x20
00aa10e0	cmp x8,x27
00aa10e4	csel x21,x27,x8,hi
00aa10e8	mov x2,x21
00aa10ec	bl 0x00c2ffd0
00aa10f0	str x21,[x19]
00aa10f4	mov w24,#0x1
00aa10f8	b 0x00aa1334
00aa10fc	cmp w8,#0x3
00aa1100	b.ne 0x00aa1144
00aa1104	ldp x8,x4,[x21, #0x8]
00aa1108	mov x0,x20
00aa110c	mov x1,x27
00aa1110	mov x2,x19
00aa1114	blr x8
00aa1118	mov w24,w0
00aa111c	cbz w24,0x00aa1334
00aa1120	ldrb w8,[x21, #0x18]
00aa1124	tbz w8,#0x0,0x00aa1334
00aa1128	ldr x0,[x21, #0x20]
00aa112c	cbz x0,0x00aa1388
00aa1130	ldr x2,[x19]
00aa1134	ldr x1,[x21, #0x28]
00aa1138	cmp x2,x1
00aa113c	b.hi 0x00aa1390
00aa1140	b 0x00aa13b0
00aa1144	adrp x1,0x29e000
00aa1148	add x1,x1,#0x225
00aa114c	mov x0,x3
00aa1150	bl 0x00c36530
00aa1154	cbz x0,0x00aa116c
00aa1158	ldr w8,[x0, #0x8]
00aa115c	cmp w8,#0x4
00aa1160	b.ne 0x00aa11b8
00aa1164	ldr x25,[x0, #0x10]
00aa1168	b 0x00aa1170
00aa116c	mov x25,xzr
00aa1170	ldr w8,[x21]
00aa1174	cmp w8,#0x4
00aa1178	b.eq 0x00aa11ec
00aa117c	cmp w8,#0x2
00aa1180	b.ne 0x00aa12f8
00aa1184	ldr x0,[x21, #0x8]
00aa1188	mov w1,w24
00aa118c	bl 0x00c3e980
00aa1190	mov x22,x0
00aa1194	mov x26,x0
00aa1198	cbnz x0,0x00aa11f8
00aa119c	bl 0x00c342a0
00aa11a0	adrp x0,0x2b0000
00aa11a4	adrp x2,0x2b8000
00aa11a8	add x0,x0,#0x38e
00aa11ac	add x2,x2,#0x3c
00aa11b0	mov w1,#0x110
00aa11b4	b 0x00aa13f4
00aa11b8	bl 0x00c342a0
00aa11bc	adrp x0,0x2b0000
00aa11c0	adrp x2,0x2b8000
00aa11c4	add x0,x0,#0x38e
00aa11c8	add x2,x2,#0x3c
00aa11cc	mov w1,#0x100
00aa11d0	bl 0x00c342b0
00aa11d4	mov w8,#0x28
00aa11d8	movk w8,#0x8, LSL #16
00aa11dc	adrp x2,0x2bf000
00aa11e0	add w1,w8,#0xde
00aa11e4	add x2,x2,#0xfcd
00aa11e8	b 0x00aa1328
00aa11ec	ldr x26,[x21, #0x8]
00aa11f0	cbz x26,0x00aa12f8
00aa11f4	mov x22,xzr
00aa11f8	cbz x20,0x00aa1358
00aa11fc	cbz x27,0x00aa1358
00aa1200	cbz x19,0x00aa1358
00aa1204	ldr x28,[x21, #0x10]
00aa1208	bl 0x00c3e9f0
00aa120c	cbz x0,0x00aa140c
00aa1210	mov x1,x26
00aa1214	mov x23,x0
00aa1218	bl 0x00c3ea10
00aa121c	cbz x28,0x00aa122c
00aa1220	mov x0,x23
00aa1224	mov x1,x28
00aa1228	bl 0x00c3e9a0
00aa122c	adrp x1,0x2b5000
00aa1230	add x1,x1,#0xf4c
00aa1234	mov x0,x23
00aa1238	mov x2,x25
00aa123c	bl 0x00c3e9c0
00aa1240	mov x28,x0
00aa1244	cbz x0,0x00aa1444
00aa1248	add x25,x27,#0x1
00aa124c	adrp x1,0x2b0000
00aa1250	add x1,x1,#0x38e
00aa1254	mov w2,#0x97
00aa1258	mov x0,x25
00aa125c	bl 0x00c34250
00aa1260	mov x26,x0
00aa1264	cbz x0,0x00aa1488
00aa1268	mov w2,#0x2
00aa126c	mov x0,x23
00aa1270	mov x1,x28
00aa1274	mov x3,x26
00aa1278	mov w4,wzr
00aa127c	mov w5,w27
00aa1280	str x28,[sp, #0x8]
00aa1284	bl 0x00c3e990
00aa1288	cmp w0,#0x0
00aa128c	b.le 0x00aa14bc
00aa1290	mov w28,w0
00aa1294	cbz w24,0x00aa14e8
00aa1298	adrp x1,0x2b0000
00aa129c	add x1,x1,#0x38e
00aa12a0	mov w2,#0xa7
00aa12a4	mov x0,x25
00aa12a8	bl 0x00c34250
00aa12ac	cbz x0,0x00aa1534
00aa12b0	ldr x1,[sp, #0x8]
00aa12b4	mov x3,x0
00aa12b8	mov w2,#0x2
00aa12bc	mov x0,x23
00aa12c0	mov w4,wzr
00aa12c4	mov w5,w27
00aa12c8	mov x6,x26
00aa12cc	str x3,[sp]
00aa12d0	bl 0x00c3e9b0
00aa12d4	cmp w0,#0x0
00aa12d8	b.gt 0x00aa14ec
00aa12dc	bl 0x00c342a0
00aa12e0	adrp x0,0x2b0000
00aa12e4	adrp x2,0x2a2000
00aa12e8	add x0,x0,#0x38e
00aa12ec	add x2,x2,#0x749
00aa12f0	mov w1,#0xb1
00aa12f4	b 0x00aa15d4
00aa12f8	bl 0x00c342a0
00aa12fc	adrp x0,0x2b0000
00aa1300	adrp x2,0x2b8000
00aa1304	add x0,x0,#0x38e
00aa1308	add x2,x2,#0x3c
00aa130c	mov w1,#0x119
00aa1310	bl 0x00c342b0
00aa1314	mov w8,#0x28
00aa1318	movk w8,#0x8, LSL #16
00aa131c	adrp x2,0x2ba000
00aa1320	add w1,w8,#0xde
00aa1324	add x2,x2,#0x1f7
00aa1328	orr w0,wzr,#0xf
00aa132c	bl 0x00c342c0
00aa1330	mov w24,wzr
00aa1334	mov w0,w24
00aa1338	ldp x29,x30,[sp, #0x60]
00aa133c	ldp x20,x19,[sp, #0x50]
00aa1340	ldp x22,x21,[sp, #0x40]
00aa1344	ldp x24,x23,[sp, #0x30]
00aa1348	ldp x26,x25,[sp, #0x20]
00aa134c	ldp x28,x27,[sp, #0x10]
00aa1350	add sp,sp,#0x70
00aa1354	ret
00aa1358	bl 0x00c342a0
00aa135c	adrp x0,0x2b0000
00aa1360	adrp x2,0x2a2000
00aa1364	add x0,x0,#0x38e
00aa1368	add x2,x2,#0x749
00aa136c	mov w1,#0x80
00aa1370	bl 0x00c342b0
00aa1374	mov w8,#0x100
00aa1378	movk w8,#0xc, LSL #16
00aa137c	add w1,w8,#0x2
00aa1380	orr w0,wzr,#0xf
00aa1384	b 0x00aa1434
00aa1388	ldr x1,[x21, #0x28]
00aa138c	ldr x2,[x19]
00aa1390	adrp x3,0x2b0000
00aa1394	add x2,x2,#0x1
00aa1398	add x3,x3,#0x38e
00aa139c	mov w4,#0x12a
00aa13a0	bl 0x00c38050
00aa13a4	cbz x0,0x00aa13d0
00aa13a8	str x0,[x21, #0x20]
00aa13ac	ldr x2,[x19]
00aa13b0	mov x1,x20
00aa13b4	bl 0x00c2ffd0
00aa13b8	ldr x8,[x21, #0x20]
00aa13bc	ldr x9,[x19]
00aa13c0	strb wzr,[x8, x9]
00aa13c4	ldr x8,[x19]
00aa13c8	str x8,[x21, #0x28]
00aa13cc	b 0x00aa1334
00aa13d0	ldr x1,[x19]
00aa13d4	mov x0,x20
00aa13d8	bl 0x00c34750
00aa13dc	bl 0x00c342a0
00aa13e0	adrp x0,0x2b0000
00aa13e4	adrp x2,0x2b8000
00aa13e8	add x0,x0,#0x38e
00aa13ec	add x2,x2,#0x3c
00aa13f0	mov w1,#0x12e
00aa13f4	bl 0x00c342b0
00aa13f8	mov w1,#0x100
00aa13fc	orr w0,wzr,#0xf
00aa1400	movk w1,#0xc, LSL #16
00aa1404	mov x2,xzr
00aa1408	b 0x00aa132c
00aa140c	bl 0x00c342a0
00aa1410	adrp x0,0x2b0000
00aa1414	adrp x2,0x2a2000
00aa1418	add x0,x0,#0x38e
00aa141c	add x2,x2,#0x749
00aa1420	mov w1,#0x85
00aa1424	bl 0x00c342b0
00aa1428	mov w1,#0x100
00aa142c	orr w0,wzr,#0xf
00aa1430	movk w1,#0xc, LSL #16
00aa1434	mov x2,xzr
00aa1438	bl 0x00c342c0
00aa143c	mov w24,wzr
00aa1440	b 0x00aa1638
00aa1444	bl 0x00c342a0
00aa1448	adrp x0,0x2b0000
00aa144c	adrp x2,0x2a2000
00aa1450	add x0,x0,#0x38e
00aa1454	add x2,x2,#0x749
00aa1458	mov w1,#0x92
00aa145c	bl 0x00c342b0
00aa1460	mov w1,#0x100
00aa1464	orr w0,wzr,#0xf
00aa1468	movk w1,#0xc, LSL #16
00aa146c	mov x2,xzr
00aa1470	bl 0x00c342c0
00aa1474	mov x26,xzr
00aa1478	mov x0,xzr
00aa147c	mov w24,wzr
00aa1480	add x25,x27,#0x1
00aa1484	b 0x00aa15f4
00aa1488	bl 0x00c342a0
00aa148c	adrp x0,0x2b0000
00aa1490	adrp x2,0x2a2000
00aa1494	add x0,x0,#0x38e
00aa1498	add x2,x2,#0x749
00aa149c	mov w1,#0x99
00aa14a0	bl 0x00c342b0
00aa14a4	mov w1,#0x100
00aa14a8	orr w0,wzr,#0xf
00aa14ac	movk w1,#0xc, LSL #16
00aa14b0	mov x2,xzr
00aa14b4	bl 0x00c342c0
00aa14b8	b 0x00aa1568
00aa14bc	bl 0x00c342a0
00aa14c0	adrp x0,0x2b0000
00aa14c4	adrp x2,0x2a2000
00aa14c8	add x0,x0,#0x38e
00aa14cc	add x2,x2,#0x749
00aa14d0	mov w1,#0xa1
00aa14d4	bl 0x00c342b0
00aa14d8	mov w1,#0x28
00aa14dc	orr w0,wzr,#0xf
00aa14e0	movk w1,#0x8, LSL #16
00aa14e4	b 0x00aa155c
00aa14e8	str xzr,[sp]
00aa14ec	mov x0,x23
00aa14f0	bl 0x00c3ea00
00aa14f4	cmn w0,#0x1
00aa14f8	b.eq 0x00aa1574
00aa14fc	cmn w0,#0x2
00aa1500	b.ne 0x00aa1590
00aa1504	bl 0x00c342a0
00aa1508	adrp x0,0x2b0000
00aa150c	adrp x2,0x2a2000
00aa1510	add x0,x0,#0x38e
00aa1514	add x2,x2,#0x749
00aa1518	mov w1,#0xb8
00aa151c	bl 0x00c342b0
00aa1520	mov w8,#0x28
00aa1524	movk w8,#0x8, LSL #16
00aa1528	add w1,w8,#0xe1
00aa152c	orr w0,wzr,#0xf
00aa1530	b 0x00aa15e4
00aa1534	bl 0x00c342a0
00aa1538	adrp x0,0x2b0000
00aa153c	adrp x2,0x2a2000
00aa1540	add x0,x0,#0x38e
00aa1544	add x2,x2,#0x749
00aa1548	mov w1,#0xa9
00aa154c	bl 0x00c342b0
00aa1550	mov w1,#0x100
00aa1554	orr w0,wzr,#0xf
00aa1558	movk w1,#0xc, LSL #16
00aa155c	mov x2,xzr
00aa1560	bl 0x00c342c0
00aa1564	ldr x28,[sp, #0x8]
00aa1568	mov x0,xzr
00aa156c	mov w24,wzr
00aa1570	b 0x00aa15f4
00aa1574	bl 0x00c342a0
00aa1578	adrp x0,0x2b0000
00aa157c	adrp x2,0x2a2000
00aa1580	add x0,x0,#0x38e
00aa1584	add x2,x2,#0x749
00aa1588	mov w1,#0xbb
00aa158c	b 0x00aa15d4
00aa1590	sub w1,w28,#0x1
00aa1594	mov x0,x23
00aa1598	bl 0x00c3e9e0
00aa159c	tbnz w0,#0x1f,0x00aa15bc
00aa15a0	sxtw x2,w0
00aa15a4	mov x0,x20
00aa15a8	mov x1,x26
00aa15ac	str x2,[x19]
00aa15b0	bl 0x00c2ffd0
00aa15b4	mov w24,#0x1
00aa15b8	b 0x00aa15f0
00aa15bc	bl 0x00c342a0
00aa15c0	adrp x0,0x2b0000
00aa15c4	adrp x2,0x2a2000
00aa15c8	add x0,x0,#0x38e
00aa15cc	add x2,x2,#0x749
00aa15d0	orr w1,wzr,#0xc0
00aa15d4	bl 0x00c342b0
00aa15d8	mov w1,#0x28
00aa15dc	orr w0,wzr,#0xf
00aa15e0	movk w1,#0x8, LSL #16
00aa15e4	mov x2,xzr
00aa15e8	bl 0x00c342c0
00aa15ec	mov w24,wzr
00aa15f0	ldp x0,x28,[sp]
00aa15f4	adrp x27,0x2b0000
00aa15f8	add x27,x27,#0x38e
00aa15fc	mov w3,#0xca
00aa1600	mov x1,x25
00aa1604	mov x2,x27
00aa1608	bl 0x00c345e0
00aa160c	mov w3,#0xcb
00aa1610	mov x0,x26
00aa1614	mov x1,x25
00aa1618	mov x2,x27
00aa161c	bl 0x00c345e0
00aa1620	mov w2,#0xcc
00aa1624	mov x0,x28
00aa1628	mov x1,x27
00aa162c	bl 0x00c32310
00aa1630	mov x0,x23
00aa1634	bl 0x00c3e9d0
00aa1638	mov x0,x22
00aa163c	bl 0x00c32a70
00aa1640	cbnz w24,0x00aa1120
00aa1644	b 0x00aa1334
