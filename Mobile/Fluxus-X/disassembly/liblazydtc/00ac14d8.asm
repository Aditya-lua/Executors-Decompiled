; BIO_set_cipher @ 00ac14d8
00ac14d8	stp x26,x25,[sp, #-0x50]!
00ac14dc	stp x24,x23,[sp, #0x10]
00ac14e0	stp x22,x21,[sp, #0x20]
00ac14e4	stp x20,x19,[sp, #0x30]
00ac14e8	stp x29,x30,[sp, #0x40]
00ac14ec	add x29,sp,#0x40
00ac14f0	mov w21,w4
00ac14f4	mov x23,x3
00ac14f8	mov x24,x2
00ac14fc	mov x19,x1
00ac1500	mov x20,x0
00ac1504	bl 0x00c321b0
00ac1508	cbz x0,0x00ac1610
00ac150c	mov x25,x0
00ac1510	mov x0,x20
00ac1514	bl 0x00c38610
00ac1518	mov x22,x0
00ac151c	cbz x0,0x00ac1554
00ac1520	sxtw x5,w21
00ac1524	orr w1,wzr,#0x6
00ac1528	mov w4,#0x4
00ac152c	mov w6,#0x1
00ac1530	mov x0,x20
00ac1534	mov x2,x19
00ac1538	mov x3,xzr
00ac153c	mov x7,xzr
00ac1540	blr x22
00ac1544	cmp x0,#0x1
00ac1548	mov x26,xzr
00ac154c	b.ge 0x00ac1588
00ac1550	b 0x00ac15e0
00ac1554	mov x0,x20
00ac1558	bl 0x00c38600
00ac155c	mov x26,x0
00ac1560	cbz x0,0x00ac1588
00ac1564	sxtw x4,w21
00ac1568	orr w1,wzr,#0x6
00ac156c	mov w3,#0x4
00ac1570	mov x0,x20
00ac1574	mov x2,x19
00ac1578	mov x5,xzr
00ac157c	blr x26
00ac1580	cmp x0,#0x1
00ac1584	b.lt 0x00ac15e0
00ac1588	mov w1,#0x1
00ac158c	mov x0,x20
00ac1590	bl 0x00c322b0
00ac1594	ldr x0,[x25, #0x18]
00ac1598	mov x1,x19
00ac159c	mov x2,xzr
00ac15a0	mov x3,x24
00ac15a4	mov x4,x23
00ac15a8	mov w5,w21
00ac15ac	bl 0x00c34be0
00ac15b0	cbz w0,0x00ac1610
00ac15b4	cbz x22,0x00ac15e8
00ac15b8	sxtw x5,w21
00ac15bc	mov w1,#0x86
00ac15c0	mov w4,#0x4
00ac15c4	mov w6,#0x1
00ac15c8	mov x0,x20
00ac15cc	mov x2,x19
00ac15d0	mov x3,xzr
00ac15d4	mov x7,xzr
00ac15d8	blr x22
00ac15dc	b 0x00ac1610
00ac15e0	mov w0,wzr
00ac15e4	b 0x00ac1610
00ac15e8	cbz x26,0x00ac160c
00ac15ec	sxtw x4,w21
00ac15f0	orr w1,wzr,#0x6
00ac15f4	mov w3,#0x4
00ac15f8	mov w5,#0x1
00ac15fc	mov x0,x20
00ac1600	mov x2,x19
00ac1604	blr x26
00ac1608	b 0x00ac1610
00ac160c	mov w0,#0x1
00ac1610	ldp x29,x30,[sp, #0x40]
00ac1614	ldp x20,x19,[sp, #0x30]
00ac1618	ldp x22,x21,[sp, #0x20]
00ac161c	ldp x24,x23,[sp, #0x10]
00ac1620	ldp x26,x25,[sp], #0x50
00ac1624	ret
