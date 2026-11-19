; FUN_00bd137c @ 00bd137c
00bd137c	paciasp
00bd1380	sub sp,sp,#0x60
00bd1384	stp x29,x30,[sp, #0x20]
00bd1388	stp x24,x23,[sp, #0x30]
00bd138c	stp x22,x21,[sp, #0x40]
00bd1390	stp x20,x19,[sp, #0x50]
00bd1394	add x29,sp,#0x20
00bd1398	mov w20,w1
00bd139c	mov x19,x0
00bd13a0	add x0,sp,#0x8
00bd13a4	mov x1,x19
00bd13a8	bl 0x00c43fa0
00bd13ac	ldrb w8,[sp, #0x8]
00bd13b0	cmp w8,#0x1
00bd13b4	b.ne 0x00bd1484
00bd13b8	ldr x8,[x19]
00bd13bc	ldur x9,[x8, #-0x18]
00bd13c0	sub x8,x29,#0x8
00bd13c4	add x0,x19,x9
00bd13c8	bl 0x00c30070
00bd13cc	adrp x1,0xcb4000
00bd13d0	sub x0,x29,#0x8
00bd13d4	ldr x1,[x1, #0xf40]
00bd13d8	bl 0x00c30080
00bd13dc	mov x21,x0
00bd13e0	sub x0,x29,#0x8
00bd13e4	bl 0x00c30090
00bd13e8	ldr x8,[x19]
00bd13ec	ldur x8,[x8, #-0x18]
00bd13f0	add x2,x19,x8
00bd13f4	ldr w3,[x2, #0x90]
00bd13f8	ldr x22,[x2, #0x28]
00bd13fc	cmn w3,#0x1
00bd1400	b.ne 0x00bd144c
00bd1404	sub x8,x29,#0x8
00bd1408	mov x0,x2
00bd140c	mov x24,x2
00bd1410	bl 0x00c30070
00bd1414	adrp x1,0xcb4000
00bd1418	sub x0,x29,#0x8
00bd141c	ldr x1,[x1, #0x998]
00bd1420	bl 0x00c30080
00bd1424	ldr x8,[x0]
00bd1428	ldr x8,[x8, #0x38]
00bd142c	mov w1,#0x20
00bd1430	blr x8
00bd1434	mov w23,w0
00bd1438	sub x0,x29,#0x8
00bd143c	bl 0x00c30090
00bd1440	and w3,w23,#0xff
00bd1444	mov x2,x24
00bd1448	str w3,[x24, #0x90]
00bd144c	ldr x8,[x21]
00bd1450	mov w4,w20
00bd1454	ldr x8,[x8, #0x30]
00bd1458	mov x0,x21
00bd145c	mov x1,x22
00bd1460	blr x8
00bd1464	cbnz x0,0x00bd1484
00bd1468	ldr x8,[x19]
00bd146c	mov w9,#0x5
00bd1470	ldur x8,[x8, #-0x18]
00bd1474	add x0,x19,x8
00bd1478	ldr w8,[x0, #0x20]
00bd147c	orr w1,w8,w9
00bd1480	bl 0x00c30130
00bd1484	add x0,sp,#0x8
00bd1488	bl 0x00c43fb0
00bd148c	mov x0,x19
00bd1490	ldp x20,x19,[sp, #0x50]
00bd1494	ldp x22,x21,[sp, #0x40]
00bd1498	ldp x24,x23,[sp, #0x30]
00bd149c	ldp x29,x30,[sp, #0x20]
00bd14a0	add sp,sp,#0x60
00bd14a4	autiasp
00bd14a8	ret
