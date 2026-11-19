; FUN_00ac13c0 @ 00ac13c0
00ac13c0	stp x24,x23,[sp, #-0x40]!
00ac13c4	stp x22,x21,[sp, #0x10]
00ac13c8	stp x20,x19,[sp, #0x20]
00ac13cc	stp x29,x30,[sp, #0x30]
00ac13d0	mov x19,x0
00ac13d4	ldr x0,[x0]
00ac13d8	mov x20,x3
00ac13dc	mov w21,w2
00ac13e0	mov w22,w1
00ac13e4	add x29,sp,#0x30
00ac13e8	cbz x0,0x00ac1434
00ac13ec	bl 0x00c325e0
00ac13f0	cmp w0,#0x1
00ac13f4	b.lt 0x00ac1440
00ac13f8	mov w23,wzr
00ac13fc	ldr x0,[x19]
00ac1400	mov w1,w23
00ac1404	bl 0x00c32610
00ac1408	mov x24,x0
00ac140c	bl 0x00c3f7b0
00ac1410	bl 0x00c37750
00ac1414	cmp w0,w22
00ac1418	b.eq 0x00ac1470
00ac141c	ldr x0,[x19]
00ac1420	add w23,w23,#0x1
00ac1424	bl 0x00c325e0
00ac1428	cmp w23,w0
00ac142c	b.lt 0x00ac13fc
00ac1430	b 0x00ac1440
00ac1434	bl 0x00c34780
00ac1438	str x0,[x19]
00ac143c	cbz x0,0x00ac14b0
00ac1440	mov w0,w22
00ac1444	mov w1,w21
00ac1448	mov x2,x20
00ac144c	bl 0x00c3f790
00ac1450	cbz x0,0x00ac14b0
00ac1454	mov x20,x0
00ac1458	ldr x0,[x19]
00ac145c	mov x1,x20
00ac1460	bl 0x00c347a0
00ac1464	cbz w0,0x00ac14a4
00ac1468	mov w0,#0x1
00ac146c	b 0x00ac14b0
00ac1470	mov x0,x24
00ac1474	bl 0x00c3d9a0
00ac1478	mov w0,w22
00ac147c	mov w1,w21
00ac1480	mov x2,x20
00ac1484	bl 0x00c3f790
00ac1488	cbz x0,0x00ac14b0
00ac148c	mov x20,x0
00ac1490	ldr x0,[x19]
00ac1494	mov w1,w23
00ac1498	mov x2,x20
00ac149c	bl 0x00c38080
00ac14a0	cbnz x0,0x00ac1468
00ac14a4	mov x0,x20
00ac14a8	bl 0x00c3d9a0
00ac14ac	mov w0,wzr
00ac14b0	ldp x29,x30,[sp, #0x30]
00ac14b4	ldp x20,x19,[sp, #0x20]
00ac14b8	ldp x22,x21,[sp, #0x10]
00ac14bc	ldp x24,x23,[sp], #0x40
00ac14c0	ret
