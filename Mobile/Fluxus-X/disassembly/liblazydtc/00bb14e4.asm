; FUN_00bb14e4 @ 00bb14e4
00bb14e4	sub sp,sp,#0x60
00bb14e8	stp x29,x30,[sp, #0x10]
00bb14ec	stp x26,x25,[sp, #0x20]
00bb14f0	stp x24,x23,[sp, #0x30]
00bb14f4	stp x22,x21,[sp, #0x40]
00bb14f8	stp x20,x19,[sp, #0x50]
00bb14fc	add x29,sp,#0x10
00bb1500	mrs x21,tpidr_el0
00bb1504	add x22,x0,#0x7, LSL #12
00bb1508	mov x20,x0
00bb150c	ldr x8,[x21, #0x28]
00bb1510	mov x19,x2
00bb1514	str x8,[sp, #0x8]
00bb1518	mov w8,#0x74e8
00bb151c	ldr w3,[x22, #0x598]
00bb1520	add x0,x0,x8
00bb1524	bl 0x00c435f0
00bb1528	cmn x0,#0x78
00bb152c	b.hi 0x00bb162c
00bb1530	cbz x0,0x00bb153c
00bb1534	mov x0,#-0x48
00bb1538	b 0x00bb162c
00bb153c	ldr w8,[x22, #0x610]
00bb1540	cmp w8,#0x1
00bb1544	b.ne 0x00bb15cc
00bb1548	ldr x23,[x20, #0x7608]
00bb154c	cbz x23,0x00bb15cc
00bb1550	ldr x8,[x20, #0x75f0]
00bb1554	cbz x8,0x00bb15cc
00bb1558	ldr w24,[x22, #0x504]
00bb155c	add x0,sp,#0x4
00bb1560	mov w1,#0x4
00bb1564	mov x2,xzr
00bb1568	str w24,[sp, #0x4]
00bb156c	bl 0x00c436b0
00bb1570	ldr x8,[x23, #0x8]
00bb1574	sub x25,x8,#0x1
00bb1578	and x8,x25,x0
00bb157c	ldr x9,[x23]
00bb1580	mov x26,x8
00bb1584	ldr x0,[x9, x8, LSL #0x3]
00bb1588	bl 0x00c435d0
00bb158c	and x8,x26,x25
00bb1590	cmp w0,w24
00bb1594	ccmp w0,#0x0,#0x4,ne
00bb1598	add x8,x8,#0x1
00bb159c	b.ne 0x00bb157c
00bb15a0	ldr x8,[x23]
00bb15a4	ldr x23,[x8, x26, LSL #0x3]
00bb15a8	cbz x23,0x00bb15cc
00bb15ac	ldr x0,[x20, #0x75e8]
00bb15b0	bl 0x00c435b0
00bb15b4	ldr w8,[x22, #0x504]
00bb15b8	mov w9,#0xffffffff
00bb15bc	str xzr,[x20, #0x75e8]
00bb15c0	str x23,[x20, #0x75f0]
00bb15c4	str w8,[x22, #0x5f8]
00bb15c8	str w9,[x22, #0x600]
00bb15cc	ldr w8,[x22, #0x504]
00bb15d0	cbz w8,0x00bb15e0
00bb15d4	ldr w9,[x22, #0x5f8]
00bb15d8	cmp w9,w8
00bb15dc	b.ne 0x00bb1610
00bb15e0	ldr w8,[x22, #0x508]
00bb15e4	cbz w8,0x00bb1618
00bb15e8	ldr w8,[x22, #0x59c]
00bb15ec	cmp w8,#0x0
00bb15f0	cset w9,eq
00bb15f4	str w9,[x22, #0x5a0]
00bb15f8	cbnz w8,0x00bb161c
00bb15fc	mov w8,#0x7538
00bb1600	mov x1,xzr
00bb1604	add x0,x20,x8
00bb1608	bl 0x00c436c0
00bb160c	b 0x00bb161c
00bb1610	mov x0,#-0x20
00bb1614	b 0x00bb162c
00bb1618	str wzr,[x22, #0x5a0]
00bb161c	ldr x8,[x20, #0x7518]
00bb1620	mov x0,xzr
00bb1624	add x8,x8,x19
00bb1628	str x8,[x20, #0x7518]
00bb162c	ldr x8,[x21, #0x28]
00bb1630	ldr x9,[sp, #0x8]
00bb1634	cmp x8,x9
00bb1638	b.ne 0x00bb1658
00bb163c	ldp x20,x19,[sp, #0x50]
00bb1640	ldp x22,x21,[sp, #0x40]
00bb1644	ldp x24,x23,[sp, #0x30]
00bb1648	ldp x26,x25,[sp, #0x20]
00bb164c	ldp x29,x30,[sp, #0x10]
00bb1650	add sp,sp,#0x60
00bb1654	ret
00bb1658	bl 0x00c2fec0
