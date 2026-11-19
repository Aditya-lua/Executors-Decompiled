; OCSP_cert_to_id @ 00ab1518
00ab1518	stp x22,x21,[sp, #-0x30]!
00ab151c	stp x20,x19,[sp, #0x10]
00ab1520	mov x19,x2
00ab1524	mov x22,x1
00ab1528	mov x20,x0
00ab152c	stp x29,x30,[sp, #0x20]
00ab1530	add x29,sp,#0x20
00ab1534	cbz x0,0x00ab1558
00ab1538	cbz x22,0x00ab1564
00ab153c	mov x0,x22
00ab1540	bl 0x00c32cf0
00ab1544	mov x21,x0
00ab1548	mov x0,x22
00ab154c	bl 0x00c3f060
00ab1550	mov x22,x0
00ab1554	b 0x00ab1570
00ab1558	bl 0x00c324d0
00ab155c	mov x20,x0
00ab1560	cbnz x22,0x00ab153c
00ab1564	mov x0,x19
00ab1568	bl 0x00c32d20
00ab156c	mov x21,x0
00ab1570	mov x0,x19
00ab1574	bl 0x00c3f050
00ab1578	mov x2,x0
00ab157c	mov x0,x20
00ab1580	ldp x29,x30,[sp, #0x20]
00ab1584	ldp x20,x19,[sp, #0x10]
00ab1588	mov x1,x21
00ab158c	mov x3,x22
00ab1590	ldp x22,x21,[sp], #0x30
00ab1594	b 0x00ab1598
