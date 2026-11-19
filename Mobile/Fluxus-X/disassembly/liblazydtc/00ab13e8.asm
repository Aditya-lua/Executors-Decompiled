; OCSP_url_svcloc_new @ 00ab13e8
00ab13e8	str x23,[sp, #-0x40]!
00ab13ec	stp x22,x21,[sp, #0x10]
00ab13f0	stp x20,x19,[sp, #0x20]
00ab13f4	stp x29,x30,[sp, #0x30]
00ab13f8	add x29,sp,#0x30
00ab13fc	mov x20,x1
00ab1400	mov x21,x0
00ab1404	bl 0x00c3eec0
00ab1408	mov x19,x0
00ab140c	cbz x0,0x00ab14c8
00ab1410	ldr x0,[x19]
00ab1414	bl 0x00c34810
00ab1418	mov x0,x21
00ab141c	bl 0x00c34f50
00ab1420	str x0,[x19]
00ab1424	cbz x0,0x00ab14c8
00ab1428	cbz x20,0x00ab14b0
00ab142c	ldr x8,[x20]
00ab1430	cbz x8,0x00ab1440
00ab1434	bl 0x00c34780
00ab1438	str x0,[x19, #0x8]
00ab143c	cbz x0,0x00ab14c8
00ab1440	ldr x8,[x20]
00ab1444	cbz x8,0x00ab14b0
00ab1448	add x21,x20,#0x8
00ab144c	orr w23,wzr,#0x6
00ab1450	bl 0x00c3ef80
00ab1454	mov x20,x0
00ab1458	cbz x0,0x00ab1504
00ab145c	mov w0,#0xb2
00ab1460	bl 0x00c37740
00ab1464	str x0,[x20]
00ab1468	cbz x0,0x00ab1504
00ab146c	bl 0x00c38150
00ab1470	mov x22,x0
00ab1474	cbz x0,0x00ab1510
00ab1478	ldur x1,[x21, #-0x8]
00ab147c	mov w2,#0xffffffff
00ab1480	mov x0,x22
00ab1484	bl 0x00c378a0
00ab1488	cbz w0,0x00ab1510
00ab148c	ldr x8,[x20, #0x8]
00ab1490	mov x1,x20
00ab1494	str w23,[x8]
00ab1498	str x22,[x8, #0x8]
00ab149c	ldr x0,[x19, #0x8]
00ab14a0	bl 0x00c347a0
00ab14a4	cbz w0,0x00ab1504
00ab14a8	ldr x8,[x21], #0x8
00ab14ac	cbnz x8,0x00ab1450
00ab14b0	mov w0,#0x173
00ab14b4	mov w1,wzr
00ab14b8	mov x2,x19
00ab14bc	bl 0x00c3ef90
00ab14c0	mov x21,x0
00ab14c4	b 0x00ab14cc
00ab14c8	mov x21,xzr
00ab14cc	mov x22,xzr
00ab14d0	mov x20,xzr
00ab14d4	mov x0,x22
00ab14d8	bl 0x00c38140
00ab14dc	mov x0,x20
00ab14e0	bl 0x00c3ef70
00ab14e4	mov x0,x19
00ab14e8	bl 0x00c3eeb0
00ab14ec	mov x0,x21
00ab14f0	ldp x29,x30,[sp, #0x30]
00ab14f4	ldp x20,x19,[sp, #0x20]
00ab14f8	ldp x22,x21,[sp, #0x10]
00ab14fc	ldr x23,[sp], #0x40
00ab1500	ret
00ab1504	mov x21,xzr
00ab1508	mov x22,xzr
00ab150c	b 0x00ab14d4
00ab1510	mov x21,xzr
00ab1514	b 0x00ab14d4
