; FUN_00ad1338 @ 00ad1338
00ad1338	str x21,[sp, #-0x30]!
00ad133c	mov x21,x1
00ad1340	adrp x1,0x2b0000
00ad1344	stp x20,x19,[sp, #0x10]
00ad1348	mov x20,x0
00ad134c	add x1,x1,#0x862
00ad1350	orr w0,wzr,#0xe0
00ad1354	mov w2,#0x4d
00ad1358	stp x29,x30,[sp, #0x20]
00ad135c	add x29,sp,#0x20
00ad1360	bl 0x00c34250
00ad1364	mov x19,x0
00ad1368	cbz x0,0x00ad13b4
00ad136c	add x8,x19,#0xa0
00ad1370	mov w9,#0x1
00ad1374	stlr w9,[x8]
00ad1378	bl 0x00c34d50
00ad137c	str x0,[x19, #0xd0]
00ad1380	cbz x0,0x00ad13e8
00ad1384	str x21,[x19, #0x8]
00ad1388	bl 0x00c3e1f0
00ad138c	str x0,[x19, #0x18]
00ad1390	ldr w8,[x0, #0x48]
00ad1394	and w8,w8,#0xfffffbff
00ad1398	str w8,[x19, #0xa4]
00ad139c	cbz x20,0x00ad1430
00ad13a0	mov x0,x20
00ad13a4	bl 0x00c323b0
00ad13a8	cbz w0,0x00ad146c
00ad13ac	str x20,[x19, #0x20]
00ad13b0	b 0x00ad1440
00ad13b4	bl 0x00c342a0
00ad13b8	adrp x0,0x2b0000
00ad13bc	adrp x2,0x2ba000
00ad13c0	add x0,x0,#0x862
00ad13c4	add x2,x2,#0x719
00ad13c8	mov w1,#0x50
00ad13cc	bl 0x00c342b0
00ad13d0	mov w1,#0x100
00ad13d4	mov w0,#0x4
00ad13d8	movk w1,#0xc, LSL #16
00ad13dc	mov x2,xzr
00ad13e0	bl 0x00c342c0
00ad13e4	b 0x00ad1518
00ad13e8	bl 0x00c342a0
00ad13ec	adrp x20,0x2b0000
00ad13f0	add x20,x20,#0x862
00ad13f4	adrp x2,0x2ba000
00ad13f8	add x2,x2,#0x719
00ad13fc	mov w1,#0x57
00ad1400	mov x0,x20
00ad1404	bl 0x00c342b0
00ad1408	mov w1,#0x100
00ad140c	mov w0,#0x4
00ad1410	movk w1,#0xc, LSL #16
00ad1414	mov x2,xzr
00ad1418	bl 0x00c342c0
00ad141c	mov w2,#0x58
00ad1420	mov x0,x19
00ad1424	mov x1,x20
00ad1428	bl 0x00c32310
00ad142c	b 0x00ad1514
00ad1430	bl 0x00c3bdd0
00ad1434	mov x20,x0
00ad1438	str x0,[x19, #0x20]
00ad143c	cbz x0,0x00ad14a0
00ad1440	mov x0,x20
00ad1444	bl 0x00c3bdc0
00ad1448	str x0,[x19, #0x18]
00ad144c	cbnz x0,0x00ad14a4
00ad1450	bl 0x00c342a0
00ad1454	adrp x0,0x2b0000
00ad1458	adrp x2,0x2ba000
00ad145c	add x0,x0,#0x862
00ad1460	add x2,x2,#0x719
00ad1464	mov w1,#0x6c
00ad1468	b 0x00ad1484
00ad146c	bl 0x00c342a0
00ad1470	adrp x0,0x2b0000
00ad1474	adrp x2,0x2ba000
00ad1478	add x0,x0,#0x862
00ad147c	add x2,x2,#0x719
00ad1480	mov w1,#0x62
00ad1484	bl 0x00c342b0
00ad1488	mov w1,#0x26
00ad148c	mov w0,#0x4
00ad1490	movk w1,#0x8, LSL #16
00ad1494	mov x2,xzr
00ad1498	bl 0x00c342c0
00ad149c	b 0x00ad150c
00ad14a0	ldr x0,[x19, #0x18]
00ad14a4	ldr w8,[x0, #0x48]
00ad14a8	add x2,x19,#0x90
00ad14ac	mov w0,#0x9
00ad14b0	mov x1,x19
00ad14b4	and w8,w8,#0xfffffbff
00ad14b8	str w8,[x19, #0xa4]
00ad14bc	bl 0x00c356e0
00ad14c0	cbz w0,0x00ad150c
00ad14c4	ldr x8,[x19, #0x18]
00ad14c8	ldr x8,[x8, #0x38]
00ad14cc	cbz x8,0x00ad1518
00ad14d0	mov x0,x19
00ad14d4	blr x8
00ad14d8	cbnz w0,0x00ad1518
00ad14dc	bl 0x00c342a0
00ad14e0	adrp x0,0x2b0000
00ad14e4	adrp x2,0x2ba000
00ad14e8	add x0,x0,#0x862
00ad14ec	add x2,x2,#0x719
00ad14f0	mov w1,#0x7a
00ad14f4	bl 0x00c342b0
00ad14f8	mov w8,#0x100
00ad14fc	movk w8,#0xc, LSL #16
00ad1500	add w1,w8,#0x5
00ad1504	mov w0,#0x4
00ad1508	b 0x00ad1494
00ad150c	mov x0,x19
00ad1510	bl 0x00ad159c
00ad1514	mov x19,xzr
00ad1518	mov x0,x19
00ad151c	ldp x29,x30,[sp, #0x20]
00ad1520	ldp x20,x19,[sp, #0x10]
00ad1524	ldr x21,[sp], #0x30
00ad1528	ret
