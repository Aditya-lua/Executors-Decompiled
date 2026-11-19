; WebSocketHandshakeKeyGen::static_for<7,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator() @ 009a12bc
009a12bc	sub sp,sp,#0x40
009a12c0	str x21,[sp, #0x10]
009a12c4	stp x20,x19,[sp, #0x20]
009a12c8	stp x29,x30,[sp, #0x30]
009a12cc	add x29,sp,#0x30
009a12d0	mrs x21,tpidr_el0
009a12d4	ldr x8,[x21, #0x28]
009a12d8	mov x0,sp
009a12dc	mov x20,x2
009a12e0	mov x19,x1
009a12e4	str x8,[sp, #0x8]
009a12e8	bl 0x00c33af0
009a12ec	ldr w8,[x20, #0x20]
009a12f0	ldr w9,[x20, #0xc]
009a12f4	ldr w10,[x20, #0x34]
009a12f8	ldr w11,[x20, #0x2c]
009a12fc	eor w8,w9,w8
009a1300	eor w8,w8,w10
009a1304	eor w8,w8,w11
009a1308	ror w9,w8,#0x1f
009a130c	str w9,[x20, #0x2c]
009a1310	ldp w10,w11,[x19]
009a1314	ldr w12,[x19, #0x10]
009a1318	mov w8,#0xbcdc
009a131c	movk w8,#0x8f1b, LSL #16
009a1320	orr w13,w10,w11
009a1324	and w12,w13,w12
009a1328	ldp w14,w13,[x19, #0x8]
009a132c	and w10,w10,w11
009a1330	orr w10,w12,w10
009a1334	add w9,w9,w10
009a1338	ror w14,w14,#0x1b
009a133c	add w9,w9,w13
009a1340	add w9,w9,w14
009a1344	ror w11,w11,#0x2
009a1348	add w9,w9,w8
009a134c	str w11,[x19, #0x4]
009a1350	str w9,[x19, #0xc]
009a1354	ldr w9,[x20, #0x24]
009a1358	ldr w10,[x20, #0x10]
009a135c	ldr w11,[x20, #0x38]
009a1360	ldr w12,[x20, #0x30]
009a1364	eor w9,w10,w9
009a1368	eor w9,w9,w11
009a136c	eor w9,w9,w12
009a1370	ror w9,w9,#0x1f
009a1374	str w9,[x20, #0x30]
009a1378	ldp w10,w11,[x19, #0x4]
009a137c	ldr w12,[x19]
009a1380	orr w14,w10,w11
009a1384	and w12,w14,w12
009a1388	ldp w13,w14,[x19, #0xc]
009a138c	and w10,w10,w11
009a1390	orr w10,w12,w10
009a1394	add w9,w9,w10
009a1398	ror w13,w13,#0x1b
009a139c	add w9,w9,w14
009a13a0	add w9,w9,w13
009a13a4	ror w11,w11,#0x2
009a13a8	add w9,w9,w8
009a13ac	str w11,[x19, #0x8]
009a13b0	str w9,[x19, #0x10]
009a13b4	ldr w9,[x20, #0x28]
009a13b8	ldr w10,[x20, #0x14]
009a13bc	ldr w11,[x20, #0x3c]
009a13c0	ldr w12,[x20, #0x34]
009a13c4	eor w9,w10,w9
009a13c8	eor w9,w9,w11
009a13cc	eor w9,w9,w12
009a13d0	ror w9,w9,#0x1f
009a13d4	str w9,[x20, #0x34]
009a13d8	ldp w10,w11,[x19, #0x8]
009a13dc	ldp w13,w12,[x19]
009a13e0	orr w14,w10,w11
009a13e4	and w12,w14,w12
009a13e8	ldr w14,[x19, #0x10]
009a13ec	and w10,w10,w11
009a13f0	orr w10,w12,w10
009a13f4	ror w11,w11,#0x2
009a13f8	add w9,w9,w10
009a13fc	str w11,[x19, #0xc]
009a1400	ror w11,w14,#0x1b
009a1404	add w9,w9,w13
009a1408	add w9,w9,w11
009a140c	add w9,w9,w8
009a1410	str w9,[x19]
009a1414	ldr w9,[x20, #0x2c]
009a1418	ldr w10,[x20, #0x18]
009a141c	ldr w11,[x20]
009a1420	ldr w12,[x20, #0x38]
009a1424	eor w9,w10,w9
009a1428	eor w9,w9,w11
009a142c	eor w9,w9,w12
009a1430	ror w9,w9,#0x1f
009a1434	str w9,[x20, #0x38]
009a1438	ldp w11,w10,[x19, #0xc]
009a143c	ldr w12,[x19, #0x8]
009a1440	orr w13,w11,w10
009a1444	and w12,w13,w12
009a1448	ldp w14,w13,[x19]
009a144c	and w11,w11,w10
009a1450	ror w10,w10,#0x2
009a1454	str w10,[x19, #0x10]
009a1458	orr w10,w12,w11
009a145c	add w9,w9,w10
009a1460	ror w14,w14,#0x1b
009a1464	add w9,w9,w13
009a1468	add w9,w9,w14
009a146c	add w8,w9,w8
009a1470	str w8,[x19, #0x4]
009a1474	ldr x8,[x21, #0x28]
009a1478	ldr x9,[sp, #0x8]
009a147c	cmp x8,x9
009a1480	b.ne 0x009a1498
009a1484	ldp x29,x30,[sp, #0x30]
009a1488	ldp x20,x19,[sp, #0x20]
009a148c	ldr x21,[sp, #0x10]
009a1490	add sp,sp,#0x40
009a1494	ret
009a1498	bl 0x00c2fec0
