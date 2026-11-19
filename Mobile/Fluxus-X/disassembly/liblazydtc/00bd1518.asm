; FUN_00bd1518 @ 00bd1518
00bd1518	paciasp
00bd151c	sub sp,sp,#0x60
00bd1520	stp x29,x30,[sp, #0x20]
00bd1524	stp x24,x23,[sp, #0x30]
00bd1528	stp x22,x21,[sp, #0x40]
00bd152c	stp x20,x19,[sp, #0x50]
00bd1530	add x29,sp,#0x20
00bd1534	mov x20,x1
00bd1538	mov x19,x0
00bd153c	add x0,sp,#0x8
00bd1540	mov x1,x19
00bd1544	bl 0x00c43fa0
00bd1548	ldrb w8,[sp, #0x8]
00bd154c	cmp w8,#0x1
00bd1550	b.ne 0x00bd1620
00bd1554	ldr x8,[x19]
00bd1558	ldur x9,[x8, #-0x18]
00bd155c	sub x8,x29,#0x8
00bd1560	add x0,x19,x9
00bd1564	bl 0x00c30070
00bd1568	adrp x1,0xcb4000
00bd156c	sub x0,x29,#0x8
00bd1570	ldr x1,[x1, #0xf40]
00bd1574	bl 0x00c30080
00bd1578	mov x21,x0
00bd157c	sub x0,x29,#0x8
00bd1580	bl 0x00c30090
00bd1584	ldr x8,[x19]
00bd1588	ldur x8,[x8, #-0x18]
00bd158c	add x2,x19,x8
00bd1590	ldr w3,[x2, #0x90]
00bd1594	ldr x22,[x2, #0x28]
00bd1598	cmn w3,#0x1
00bd159c	b.ne 0x00bd15e8
00bd15a0	sub x8,x29,#0x8
00bd15a4	mov x0,x2
00bd15a8	mov x24,x2
00bd15ac	bl 0x00c30070
00bd15b0	adrp x1,0xcb4000
00bd15b4	sub x0,x29,#0x8
00bd15b8	ldr x1,[x1, #0x998]
00bd15bc	bl 0x00c30080
00bd15c0	ldr x8,[x0]
00bd15c4	ldr x8,[x8, #0x38]
00bd15c8	mov w1,#0x20
00bd15cc	blr x8
00bd15d0	mov w23,w0
00bd15d4	sub x0,x29,#0x8
00bd15d8	bl 0x00c30090
00bd15dc	and w3,w23,#0xff
00bd15e0	mov x2,x24
00bd15e4	str w3,[x24, #0x90]
00bd15e8	ldr x8,[x21]
00bd15ec	ldr x8,[x8, #0x20]
00bd15f0	mov x0,x21
00bd15f4	mov x1,x22
00bd15f8	mov x4,x20
00bd15fc	blr x8
00bd1600	cbnz x0,0x00bd1620
00bd1604	ldr x8,[x19]
00bd1608	mov w9,#0x5
00bd160c	ldur x8,[x8, #-0x18]
00bd1610	add x0,x19,x8
00bd1614	ldr w8,[x0, #0x20]
00bd1618	orr w1,w8,w9
00bd161c	bl 0x00c30130
00bd1620	add x0,sp,#0x8
00bd1624	bl 0x00c43fb0
00bd1628	mov x0,x19
00bd162c	ldp x20,x19,[sp, #0x50]
00bd1630	ldp x22,x21,[sp, #0x40]
00bd1634	ldp x24,x23,[sp, #0x30]
00bd1638	ldp x29,x30,[sp, #0x20]
00bd163c	add sp,sp,#0x60
00bd1640	autiasp
00bd1644	ret
