; cpr::Session::DownloadAsync @ 008f1210
008f1210	sub sp,sp,#0x90
008f1214	str x27,[sp, #0x30]
008f1218	stp x26,x25,[sp, #0x40]
008f121c	stp x24,x23,[sp, #0x50]
008f1220	stp x22,x21,[sp, #0x60]
008f1224	stp x20,x19,[sp, #0x70]
008f1228	stp x29,x30,[sp, #0x80]
008f122c	add x29,sp,#0x80
008f1230	mrs x25,tpidr_el0
008f1234	mov x20,x8
008f1238	ldr x8,[x25, #0x28]
008f123c	mov x19,x1
008f1240	str x8,[sp, #0x28]
008f1244	add x8,sp,#0x8
008f1248	bl 0x00c31300
008f124c	str x19,[sp, #0x18]
008f1250	bl 0x00c30d70
008f1254	add x8,x0,#0x20
008f1258	ldar w8,[x8]
008f125c	mov x21,x0
008f1260	cbnz w8,0x008f1270
008f1264	mov x0,x21
008f1268	mov x1,xzr
008f126c	bl 0x00c31330
008f1270	add x8,x21,#0x30
008f1274	ldar x8,[x8]
008f1278	cbnz x8,0x008f1298
008f127c	add x8,x21,#0x28
008f1280	ldar x8,[x8]
008f1284	ldr x9,[x21, #0x10]
008f1288	cmp x8,x9
008f128c	b.cs 0x008f1298
008f1290	mov x0,x21
008f1294	bl 0x00c31320
008f1298	ldp x24,x22,[sp, #0x8]
008f129c	ldr x27,[sp, #0x18]
008f12a0	stp xzr,xzr,[sp, #0x8]
008f12a4	orr w0,wzr,#0x60
008f12a8	bl 0x00c2fed0
008f12ac	str xzr,[x0, #0x10]
008f12b0	adrp x8,0xcb4000
008f12b4	ldr x8,[x8, #0xd50]
008f12b8	mov x26,x0
008f12bc	mov x19,x0
008f12c0	str xzr,[x26, #0x8]!
008f12c4	add x8,x8,#0x10
008f12c8	str x8,[x0]
008f12cc	str xzr,[x0, #0x40]
008f12d0	mov w0,#0x28
008f12d4	bl 0x00c2fed0
008f12d8	adrp x8,0xc4e000
008f12dc	add x8,x8,#0xab8
008f12e0	mov x23,x0
008f12e4	add x8,x8,#0x10
008f12e8	stp x22,x27,[x0, #0x10]
008f12ec	stp x8,x24,[x0]
008f12f0	str x0,[x19, #0x40]
008f12f4	mov w0,#0x188
008f12f8	bl 0x00c2fed0
008f12fc	mov x24,x0
008f1300	add x0,x0,#0x8
008f1304	mov w2,#0x6c
008f1308	mov w1,wzr
008f130c	bl 0x00c301c0
008f1310	adrp x8,0xcb4000
008f1314	ldr x8,[x8, #0xd40]
008f1318	str x24,[x19, #0x50]
008f131c	add x8,x8,#0x10
008f1320	str x8,[x24]
008f1324	add x0,sp,#0x20
008f1328	mov x1,x24
008f132c	bl 0x00c316e0
008f1330	add x22,x21,#0xa8
008f1334	mov x0,x22
008f1338	bl 0x00c2ff10
008f133c	add x23,x19,#0x20
008f1340	ldxr x8,[x26]
008f1344	add x8,x8,#0x1
008f1348	stxr w9,x8,[x26]
008f134c	cbnz w9,0x008f1340
008f1350	ldp x9,x10,[x21, #0x80]
008f1354	ldp x12,x8,[x21, #0x98]
008f1358	mov w11,#0x55
008f135c	subs x13,x10,x9
008f1360	asr x13,x13,#0x3
008f1364	mul x11,x13,x11
008f1368	sub x11,x11,#0x1
008f136c	csel x13,xzr,x11,eq
008f1370	add x11,x8,x12
008f1374	cmp x13,x11
008f1378	b.ne 0x008f1390
008f137c	add x0,x21,#0x78
008f1380	bl 0x00c31620
008f1384	ldp x11,x8,[x21, #0x98]
008f1388	ldp x9,x10,[x21, #0x80]
008f138c	add x11,x11,x8
008f1390	cmp x10,x9
008f1394	b.eq 0x008f13c0
008f1398	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f139c	movk x10,#0xc0c1
008f13a0	umulh x10,x11,x10
008f13a4	lsr x10,x10,#0x6
008f13a8	ldr x9,[x9, x10, LSL #0x3]
008f13ac	mov w12,#0x55
008f13b0	msub x10,x10,x12,x11
008f13b4	orr w11,wzr,#0x30
008f13b8	madd x9,x10,x11,x9
008f13bc	b 0x008f13c4
008f13c0	mov x9,xzr
008f13c4	adrp x10,0xc4e000
008f13c8	add x10,x10,#0xb18
008f13cc	add x8,x8,#0x1
008f13d0	add x10,x10,#0x10
008f13d4	mov x0,x22
008f13d8	stp x23,x19,[x9, #0x8]
008f13dc	str x9,[x9, #0x20]
008f13e0	str x10,[x9]
008f13e4	str x8,[x21, #0xa0]
008f13e8	bl 0x00c2ff20
008f13ec	add x0,x21,#0xd0
008f13f0	bl 0x00c315f0
008f13f4	ldr x21,[sp, #0x20]
008f13f8	ldaxr x8,[x26]
008f13fc	sub x9,x8,#0x1
008f1400	stlxr w10,x9,[x26]
008f1404	cbnz w10,0x008f13f8
008f1408	cbnz x8,0x008f1424
008f140c	ldr x8,[x19]
008f1410	mov x0,x19
008f1414	ldr x8,[x8, #0x10]
008f1418	blr x8
008f141c	mov x0,x19
008f1420	bl 0x00c2ff00
008f1424	ldr x19,[sp, #0x10]
008f1428	stp xzr,xzr,[x20, #0x8]
008f142c	str x21,[x20]
008f1430	cbz x19,0x008f1464
008f1434	add x8,x19,#0x8
008f1438	ldaxr x9,[x8]
008f143c	sub x10,x9,#0x1
008f1440	stlxr w11,x10,[x8]
008f1444	cbnz w11,0x008f1438
008f1448	cbnz x9,0x008f1464
008f144c	ldr x8,[x19]
008f1450	mov x0,x19
008f1454	ldr x8,[x8, #0x10]
008f1458	blr x8
008f145c	mov x0,x19
008f1460	bl 0x00c2ff00
008f1464	ldr x8,[x25, #0x28]
008f1468	ldr x9,[sp, #0x28]
008f146c	cmp x8,x9
008f1470	b.ne 0x008f1494
008f1474	ldp x29,x30,[sp, #0x80]
008f1478	ldp x20,x19,[sp, #0x70]
008f147c	ldp x22,x21,[sp, #0x60]
008f1480	ldp x24,x23,[sp, #0x50]
008f1484	ldp x26,x25,[sp, #0x40]
008f1488	ldr x27,[sp, #0x30]
008f148c	add sp,sp,#0x90
008f1490	ret
008f1494	bl 0x00c2fec0
