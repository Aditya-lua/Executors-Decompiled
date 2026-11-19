; OCSP_cert_id_new @ 00ab1598
00ab1598	sub sp,sp,#0x80
00ab159c	str x23,[sp, #0x40]
00ab15a0	stp x22,x21,[sp, #0x50]
00ab15a4	stp x20,x19,[sp, #0x60]
00ab15a8	stp x29,x30,[sp, #0x70]
00ab15ac	add x29,sp,#0x70
00ab15b0	mov x20,x3
00ab15b4	mov x22,x2
00ab15b8	mov x23,x1
00ab15bc	mov x21,x0
00ab15c0	bl 0x00c3ee40
00ab15c4	mov x19,x0
00ab15c8	cbz x0,0x00ab16a4
00ab15cc	ldr x0,[x19]
00ab15d0	bl 0x00c37660
00ab15d4	mov x0,x21
00ab15d8	bl 0x00c34c30
00ab15dc	cbz w0,0x00ab1678
00ab15e0	bl 0x00c37740
00ab15e4	str x0,[x19]
00ab15e8	cbz x0,0x00ab16a4
00ab15ec	bl 0x00c37a40
00ab15f0	str x0,[x19, #0x8]
00ab15f4	cbz x0,0x00ab16a4
00ab15f8	mov w8,#0x5
00ab15fc	str w8,[x0]
00ab1600	mov x2,sp
00ab1604	sub x3,x29,#0x24
00ab1608	mov x0,x23
00ab160c	mov x1,x21
00ab1610	bl 0x00c3f040
00ab1614	cbz w0,0x00ab16cc
00ab1618	ldur w2,[x29, #-0x24]
00ab161c	add x0,x19,#0x10
00ab1620	mov x1,sp
00ab1624	bl 0x00c377a0
00ab1628	cbz w0,0x00ab16a4
00ab162c	ldr x0,[x22, #0x8]
00ab1630	ldrsw x1,[x22]
00ab1634	mov x2,sp
00ab1638	sub x3,x29,#0x24
00ab163c	mov x4,x21
00ab1640	mov x5,xzr
00ab1644	bl 0x00c370c0
00ab1648	cbz w0,0x00ab16a4
00ab164c	ldur w2,[x29, #-0x24]
00ab1650	add x0,x19,#0x28
00ab1654	mov x1,sp
00ab1658	bl 0x00c377a0
00ab165c	cbz w0,0x00ab16a4
00ab1660	cbz x20,0x00ab16b0
00ab1664	add x0,x19,#0x40
00ab1668	mov x1,x20
00ab166c	bl 0x00c37940
00ab1670	cbnz w0,0x00ab16b0
00ab1674	b 0x00ab16a4
00ab1678	bl 0x00c342a0
00ab167c	adrp x0,0x2c0000
00ab1680	adrp x2,0x2d2000
00ab1684	add x0,x0,#0x394
00ab1688	add x2,x2,#0x1ca
00ab168c	mov w1,#0x3b
00ab1690	bl 0x00c342b0
00ab1694	mov w0,#0x27
00ab1698	orr w1,wzr,#0x78
00ab169c	mov x2,xzr
00ab16a0	bl 0x00c342c0
00ab16a4	mov x0,x19
00ab16a8	bl 0x00c32520
00ab16ac	mov x19,xzr
00ab16b0	mov x0,x19
00ab16b4	ldp x29,x30,[sp, #0x70]
00ab16b8	ldp x20,x19,[sp, #0x60]
00ab16bc	ldp x22,x21,[sp, #0x50]
00ab16c0	ldr x23,[sp, #0x40]
00ab16c4	add sp,sp,#0x80
00ab16c8	ret
00ab16cc	bl 0x00c342a0
00ab16d0	adrp x0,0x2c0000
00ab16d4	adrp x2,0x2d2000
00ab16d8	add x0,x0,#0x394
00ab16dc	add x2,x2,#0x1ca
00ab16e0	mov w1,#0x56
00ab16e4	bl 0x00c342b0
00ab16e8	mov w0,#0x27
00ab16ec	mov w1,#0x66
00ab16f0	b 0x00ab169c
