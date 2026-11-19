; FUN_00ba1398 @ 00ba1398
00ba1398	sub sp,sp,#0x80
00ba139c	stp x26,x25,[sp, #0x30]
00ba13a0	stp x24,x23,[sp, #0x40]
00ba13a4	stp x22,x21,[sp, #0x50]
00ba13a8	stp x20,x19,[sp, #0x60]
00ba13ac	stp x29,x30,[sp, #0x70]
00ba13b0	add x29,sp,#0x70
00ba13b4	mrs x26,tpidr_el0
00ba13b8	ldr x8,[x26, #0x28]
00ba13bc	mov x22,x0
00ba13c0	add x0,sp,#0x18
00ba13c4	mov x19,x3
00ba13c8	mov x20,x2
00ba13cc	mov x21,x1
00ba13d0	str x8,[sp, #0x28]
00ba13d4	bl 0x00c41c00
00ba13d8	add x0,sp,#0x8
00ba13dc	bl 0x00c41c00
00ba13e0	add x0,sp,#0x8
00ba13e4	mov w1,#0x1
00ba13e8	bl 0x00c41c40
00ba13ec	mov w24,w0
00ba13f0	cbnz w0,0x00ba1468
00ba13f4	add x23,x22,#0x1d0
00ba13f8	add x3,x22,#0x1e0
00ba13fc	add x4,x22,#0x70
00ba1400	add x0,sp,#0x18
00ba1404	mov w1,#0xffffffff
00ba1408	mov x2,x23
00ba140c	mov x5,x20
00ba1410	mov x6,x19
00ba1414	bl 0x00ba0f6c
00ba1418	mov w24,w0
00ba141c	cbnz w0,0x00ba1468
00ba1420	add x25,x22,#0x8
00ba1424	add x3,x22,#0x190
00ba1428	add x5,x22,#0x160
00ba142c	add x2,sp,#0x8
00ba1430	add x4,sp,#0x18
00ba1434	mov x0,x25
00ba1438	mov x1,x21
00ba143c	bl 0x00c42720
00ba1440	mov w24,w0
00ba1444	cbnz w0,0x00ba1468
00ba1448	mov x0,x25
00ba144c	mov x1,x21
00ba1450	mov x2,x23
00ba1454	mov x3,x21
00ba1458	mov x4,x20
00ba145c	mov x5,x19
00ba1460	bl 0x00c42700
00ba1464	mov w24,w0
00ba1468	add x0,sp,#0x18
00ba146c	bl 0x00c41bb0
00ba1470	add x0,sp,#0x8
00ba1474	bl 0x00c41bb0
00ba1478	ldr x8,[x26, #0x28]
00ba147c	ldr x9,[sp, #0x28]
00ba1480	cmp x8,x9
00ba1484	b.ne 0x00ba14a8
00ba1488	mov w0,w24
00ba148c	ldp x29,x30,[sp, #0x70]
00ba1490	ldp x20,x19,[sp, #0x60]
00ba1494	ldp x22,x21,[sp, #0x50]
00ba1498	ldp x24,x23,[sp, #0x40]
00ba149c	ldp x26,x25,[sp, #0x30]
00ba14a0	add sp,sp,#0x80
00ba14a4	ret
00ba14a8	bl 0x00c2fec0
