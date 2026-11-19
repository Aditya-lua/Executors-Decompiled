; FSE_decompress_wksp_bmi2 @ 00bc0e80
00bc0e80	sub sp,sp,#0xb0
00bc0e84	stp x29,x30,[sp, #0x60]
00bc0e88	stp x26,x25,[sp, #0x70]
00bc0e8c	stp x24,x23,[sp, #0x80]
00bc0e90	stp x22,x21,[sp, #0x90]
00bc0e94	stp x20,x19,[sp, #0xa0]
00bc0e98	add x29,sp,#0x60
00bc0e9c	mrs x22,tpidr_el0
00bc0ea0	mov w9,#0xff
00bc0ea4	ldr x8,[x22, #0x28]
00bc0ea8	cmp x6,#0x200
00bc0eac	stur x8,[x29, #-0x8]
00bc0eb0	str w9,[sp, #0x8]
00bc0eb4	b.cs 0x00bc0ec0
00bc0eb8	mov x0,#-0x1
00bc0ebc	b 0x00bc0f40
00bc0ec0	mov x20,x3
00bc0ec4	mov x21,x2
00bc0ec8	mov w19,w4
00bc0ecc	mov x24,x1
00bc0ed0	mov x23,x0
00bc0ed4	add x1,sp,#0x8
00bc0ed8	add x2,sp,#0xc
00bc0edc	mov x25,x5
00bc0ee0	mov x0,x5
00bc0ee4	mov x3,x21
00bc0ee8	mov x4,x20
00bc0eec	mov w5,wzr
00bc0ef0	mov x26,x6
00bc0ef4	bl 0x00c43750
00bc0ef8	cmn x0,#0x78
00bc0efc	b.hi 0x00bc0f40
00bc0f00	ldr w3,[sp, #0xc]
00bc0f04	cmp w3,w19
00bc0f08	b.hi 0x00bc0f3c
00bc0f0c	mov w9,#0x1
00bc0f10	ldr w2,[sp, #0x8]
00bc0f14	lsl w8,w9,w3
00bc0f18	lsl x9,x9,x3
00bc0f1c	add w10,w2,#0x1
00bc0f20	add x9,x9,w8, SXTW  #0x2
00bc0f24	add x9,x9,w10, UXTW  #0x1
00bc0f28	add x9,x9,#0x13
00bc0f2c	and x9,x9,#-0x4
00bc0f30	add x10,x9,#0x204
00bc0f34	cmp x10,x26
00bc0f38	b.ls 0x00bc0f6c
00bc0f3c	mov x0,#-0x2c
00bc0f40	ldr x8,[x22, #0x28]
00bc0f44	ldur x9,[x29, #-0x8]
00bc0f48	cmp x8,x9
00bc0f4c	b.ne 0x00bc1728
00bc0f50	ldp x20,x19,[sp, #0xa0]
00bc0f54	ldp x22,x21,[sp, #0x90]
00bc0f58	ldp x24,x23,[sp, #0x80]
00bc0f5c	ldp x26,x25,[sp, #0x70]
00bc0f60	ldp x29,x30,[sp, #0x60]
00bc0f64	add sp,sp,#0xb0
00bc0f68	ret
00bc0f6c	sbfiz x8,x8,#0x2,#0x20
00bc0f70	mov x9,x26
00bc0f74	add x19,x25,#0x200
00bc0f78	mov x26,x0
00bc0f7c	mov x1,x25
00bc0f80	mov x0,x19
00bc0f84	add x8,x8,#0x4
00bc0f88	sub x9,x9,x8
00bc0f8c	add x4,x19,x8
00bc0f90	sub x5,x9,#0x200
00bc0f94	bl 0x00bc0bdc
00bc0f98	cmn x0,#0x78
00bc0f9c	b.hi 0x00bc0f40
00bc0fa0	ldrh w8,[x25, #0x202]
00bc0fa4	add x24,x23,x24
00bc0fa8	add x1,x21,x26
00bc0fac	sub x0,x20,x26
00bc0fb0	sub x25,x24,#0x3
00bc0fb4	cbz w8,0x00bc1004
00bc0fb8	cbz x0,0x00bc10ac
00bc0fbc	add x8,x1,#0x8
00bc0fc0	cmp x0,#0x8
00bc0fc4	stp x1,x8,[sp, #0x48]
00bc0fc8	b.cc 0x00bc10b4
00bc0fcc	add x8,x21,x20
00bc0fd0	ldr x9,[x8, #-0x8]!
00bc0fd4	str x8,[sp, #0x40]
00bc0fd8	lsr x8,x9,#0x38
00bc0fdc	str x9,[sp, #0x30]
00bc0fe0	cbz x8,0x00bc0eb8
00bc0fe4	clz w8,w8
00bc0fe8	mov w9,#0x8
00bc0fec	cmn x0,#0x78
00bc0ff0	eor w8,w8,#0x1f
00bc0ff4	sub w8,w9,w8
00bc0ff8	str w8,[sp, #0x38]
00bc0ffc	b.ls 0x00bc114c
00bc1000	b 0x00bc0f40
00bc1004	mov x2,x0
00bc1008	add x0,sp,#0x30
00bc100c	bl 0x00bc172c
00bc1010	cmn x0,#0x78
00bc1014	b.hi 0x00bc0f40
00bc1018	add x0,sp,#0x20
00bc101c	add x1,sp,#0x30
00bc1020	mov x2,x19
00bc1024	bl 0x00bc184c
00bc1028	add x0,sp,#0x10
00bc102c	add x1,sp,#0x30
00bc1030	mov x2,x19
00bc1034	bl 0x00bc184c
00bc1038	ldr w15,[sp, #0x38]
00bc103c	cmp w15,#0x40
00bc1040	b.hi 0x00bc1208
00bc1044	ldr x10,[sp, #0x40]
00bc1048	ldr x8,[sp, #0x50]
00bc104c	adrp x9,0x789000
00bc1050	add x9,x9,#0xb24
00bc1054	mov x0,x23
00bc1058	cmp x10,x8
00bc105c	b.cs 0x00bc11d8
00bc1060	ldr x11,[sp, #0x48]
00bc1064	cmp x10,x11
00bc1068	b.eq 0x00bc1210
00bc106c	lsr x12,x15,#0x3
00bc1070	sub w14,w10,w11
00bc1074	sub x13,x10,x12
00bc1078	cmp x13,x11
00bc107c	ldp x16,x13,[sp, #0x10]
00bc1080	csel w12,w14,w12,cc
00bc1084	sub x10,x10,x12
00bc1088	sub w15,w15,w12, LSL #0x3
00bc108c	ldp x17,x12,[sp, #0x20]
00bc1090	ldr x14,[x10]
00bc1094	cmp w15,#0x40
00bc1098	str x14,[sp, #0x30]
00bc109c	b.ls 0x00bc1220
00bc10a0	adrp x10,0x789000
00bc10a4	add x10,x10,#0xba8
00bc10a8	b 0x00bc1338
00bc10ac	mov x0,#-0x48
00bc10b0	b 0x00bc0f40
00bc10b4	ldrb w8,[x1]
00bc10b8	cmp x0,#0x4
00bc10bc	str x1,[sp, #0x40]
00bc10c0	str x8,[sp, #0x30]
00bc10c4	b.gt 0x00bc10e4
00bc10c8	cmp x0,#0x2
00bc10cc	b.eq 0x00bc1124
00bc10d0	cmp x0,#0x3
00bc10d4	b.eq 0x00bc111c
00bc10d8	cmp x0,#0x4
00bc10dc	b.eq 0x00bc1114
00bc10e0	b 0x00bc1130
00bc10e4	cmp x0,#0x5
00bc10e8	b.eq 0x00bc110c
00bc10ec	cmp x0,#0x6
00bc10f0	b.eq 0x00bc1104
00bc10f4	cmp x0,#0x7
00bc10f8	b.ne 0x00bc1130
00bc10fc	ldrb w9,[x1, #0x6]
00bc1100	orr x8,x8,x9, LSL #0x30
00bc1104	ldrb w9,[x1, #0x5]
00bc1108	add x8,x8,x9, LSL #0x28
00bc110c	ldrb w9,[x1, #0x4]
00bc1110	add x8,x8,x9, LSL #0x20
00bc1114	ldrb w9,[x1, #0x3]
00bc1118	add x8,x8,x9, LSL #0x18
00bc111c	ldrb w9,[x1, #0x2]
00bc1120	add x8,x8,x9, LSL #0x10
00bc1124	ldrb w9,[x1, #0x1]
00bc1128	add x8,x8,x9, LSL #0x8
00bc112c	str x8,[sp, #0x30]
00bc1130	add x8,x21,x20
00bc1134	ldurb w8,[x8, #-0x1]
00bc1138	cbz w8,0x00bc1208
00bc113c	clz w8,w8
00bc1140	sub w8,w8,w0, LSL #0x3
00bc1144	add w8,w8,#0x29
00bc1148	str w8,[sp, #0x38]
00bc114c	add x0,sp,#0x20
00bc1150	add x1,sp,#0x30
00bc1154	mov x2,x19
00bc1158	bl 0x00bc184c
00bc115c	add x0,sp,#0x10
00bc1160	add x1,sp,#0x30
00bc1164	mov x2,x19
00bc1168	bl 0x00bc184c
00bc116c	ldr w14,[sp, #0x38]
00bc1170	cmp w14,#0x40
00bc1174	b.hi 0x00bc1208
00bc1178	ldr x9,[sp, #0x40]
00bc117c	ldr x8,[sp, #0x50]
00bc1180	mov x17,x23
00bc1184	cmp x9,x8
00bc1188	b.cs 0x00bc11f0
00bc118c	ldr x10,[sp, #0x48]
00bc1190	cmp x9,x10
00bc1194	b.eq 0x00bc147c
00bc1198	lsr x11,x14,#0x3
00bc119c	sub w13,w9,w10
00bc11a0	sub x12,x9,x11
00bc11a4	cmp x12,x10
00bc11a8	ldp x16,x12,[sp, #0x10]
00bc11ac	csel w11,w13,w11,cc
00bc11b0	sub x9,x9,x11
00bc11b4	sub w14,w14,w11, LSL #0x3
00bc11b8	ldp x15,x11,[sp, #0x20]
00bc11bc	ldr x13,[x9]
00bc11c0	cmp w14,#0x40
00bc11c4	str x13,[sp, #0x30]
00bc11c8	b.ls 0x00bc148c
00bc11cc	adrp x9,0x789000
00bc11d0	add x9,x9,#0xba8
00bc11d4	b 0x00bc1598
00bc11d8	sub x10,x10,x15, LSR #0x3
00bc11dc	ldr x11,[sp, #0x48]
00bc11e0	and w15,w15,#0x7
00bc11e4	ldr x14,[x10]
00bc11e8	str x14,[sp, #0x30]
00bc11ec	b 0x00bc1218
00bc11f0	sub x9,x9,x14, LSR #0x3
00bc11f4	ldr x10,[sp, #0x48]
00bc11f8	and w14,w14,#0x7
00bc11fc	ldr x13,[x9]
00bc1200	str x13,[sp, #0x30]
00bc1204	b 0x00bc1484
00bc1208	mov x0,#-0x14
00bc120c	b 0x00bc0f40
00bc1210	ldr x14,[sp, #0x30]
00bc1214	mov x11,x10
00bc1218	ldp x17,x12,[sp, #0x20]
00bc121c	ldp x16,x13,[sp, #0x10]
00bc1220	adrp x1,0x789000
00bc1224	add x1,x1,#0xba8
00bc1228	cmp x10,x8
00bc122c	b.cs 0x00bc1258
00bc1230	cmp x10,x11
00bc1234	b.eq 0x00bc1338
00bc1238	lsr w14,w15,#0x3
00bc123c	sub w3,w10,w11
00bc1240	sub x2,x10,x14
00bc1244	cmp x2,x11
00bc1248	csel w14,w14,w3,cs
00bc124c	cset w2,cs
00bc1250	sub w15,w15,w14, LSL #0x3
00bc1254	b 0x00bc1264
00bc1258	lsr w14,w15,#0x3
00bc125c	and w15,w15,#0x7
00bc1260	mov w2,#0x1
00bc1264	sub x10,x10,w14, UXTW 
00bc1268	cmp x0,x25
00bc126c	ldr x14,[x10]
00bc1270	b.cs 0x00bc1338
00bc1274	tbz w2,#0x0,0x00bc1338
00bc1278	add x17,x12,x17, LSL #0x2
00bc127c	add x16,x13,x16, LSL #0x2
00bc1280	ldrb w2,[x17, #0x2]
00bc1284	ldrb w3,[x17, #0x3]
00bc1288	ldrh w17,[x17]
00bc128c	add w15,w15,w3
00bc1290	ldr w3,[x9, x3, LSL #0x2]
00bc1294	strb w2,[x0]
00bc1298	neg w2,w15
00bc129c	ldrb w4,[x16, #0x3]
00bc12a0	ldrb w5,[x16, #0x2]
00bc12a4	lsr x2,x14,x2
00bc12a8	ldrh w16,[x16]
00bc12ac	add w15,w15,w4
00bc12b0	ldr w4,[x9, x4, LSL #0x2]
00bc12b4	strb w5,[x0, #0x1]
00bc12b8	and x2,x2,x3
00bc12bc	neg w3,w15
00bc12c0	lsr x3,x14,x3
00bc12c4	add x2,x12,x2, LSL #0x2
00bc12c8	and x3,x3,x4
00bc12cc	add x17,x2,x17, LSL #0x2
00bc12d0	add x2,x13,x3, LSL #0x2
00bc12d4	ldrb w3,[x17, #0x2]
00bc12d8	ldrb w4,[x17, #0x3]
00bc12dc	ldrh w17,[x17]
00bc12e0	add x16,x2,x16, LSL #0x2
00bc12e4	ldr w2,[x9, x4, LSL #0x2]
00bc12e8	strb w3,[x0, #0x2]
00bc12ec	add w15,w15,w4
00bc12f0	ldrb w3,[x16, #0x3]
00bc12f4	neg w4,w15
00bc12f8	ldrb w6,[x16, #0x2]
00bc12fc	lsr x4,x14,x4
00bc1300	add w15,w15,w3
00bc1304	ldr w3,[x9, x3, LSL #0x2]
00bc1308	neg w5,w15
00bc130c	and x2,x4,x2
00bc1310	ldrh w4,[x16]
00bc1314	lsr x5,x14,x5
00bc1318	add x17,x2,x17
00bc131c	cmp w15,#0x40
00bc1320	strb w6,[x0, #0x3]
00bc1324	add x0,x0,#0x4
00bc1328	and x16,x5,x3
00bc132c	add x16,x16,x4
00bc1330	b.ls 0x00bc1228
00bc1334	mov x10,x1
00bc1338	sub x1,x24,#0x2
00bc133c	str x10,[sp, #0x40]
00bc1340	cmp x0,x1
00bc1344	str w15,[sp, #0x38]
00bc1348	str x14,[sp, #0x30]
00bc134c	str x17,[sp, #0x20]
00bc1350	str x16,[sp, #0x10]
00bc1354	b.hi 0x00bc15b0
00bc1358	add x0,x0,#0x1
00bc135c	b 0x00bc1390
00bc1360	lsr w14,w4,#0x3
00bc1364	and w15,w4,#0x7
00bc1368	sub x10,x10,x14
00bc136c	ldr x14,[x10]
00bc1370	neg w4,w4
00bc1374	lsr x2,x2,x4
00bc1378	add x4,x0,#0x1
00bc137c	add x0,x0,#0x2
00bc1380	cmp x4,x1
00bc1384	and x2,x2,x3
00bc1388	add x16,x2,x16
00bc138c	b.hi 0x00bc15b0
00bc1390	add x17,x12,x17, LSL #0x2
00bc1394	ldrb w2,[x17, #0x3]
00bc1398	ldrb w4,[x17, #0x2]
00bc139c	add w3,w15,w2
00bc13a0	ldrh w15,[x17]
00bc13a4	ldr w17,[x9, x2, LSL #0x2]
00bc13a8	cmp w3,#0x40
00bc13ac	sturb w4,[x0, #-0x1]
00bc13b0	b.hi 0x00bc16d0
00bc13b4	cmp x10,x8
00bc13b8	b.cs 0x00bc13e8
00bc13bc	cmp x10,x11
00bc13c0	b.eq 0x00bc13fc
00bc13c4	lsr w2,w3,#0x3
00bc13c8	sub w5,w10,w11
00bc13cc	sub x4,x10,x2
00bc13d0	cmp x4,x11
00bc13d4	csel w2,w5,w2,cc
00bc13d8	sub x10,x10,x2
00bc13dc	sub w4,w3,w2, LSL #0x3
00bc13e0	ldr x2,[x10]
00bc13e4	b 0x00bc1404
00bc13e8	lsr w2,w3,#0x3
00bc13ec	and w4,w3,#0x7
00bc13f0	sub x10,x10,x2
00bc13f4	ldr x2,[x10]
00bc13f8	b 0x00bc1404
00bc13fc	mov w4,w3
00bc1400	mov x2,x14
00bc1404	cmp x0,x1
00bc1408	b.hi 0x00bc15b0
00bc140c	add x16,x13,x16, LSL #0x2
00bc1410	neg w3,w3
00bc1414	lsr x14,x14,x3
00bc1418	ldrb w3,[x16, #0x3]
00bc141c	ldrb w5,[x16, #0x2]
00bc1420	ldrh w16,[x16]
00bc1424	and x14,x14,x17
00bc1428	add w4,w4,w3
00bc142c	ldr w3,[x9, x3, LSL #0x2]
00bc1430	add x17,x14,x15
00bc1434	cmp w4,#0x40
00bc1438	strb w5,[x0]
00bc143c	b.hi 0x00bc16e0
00bc1440	cmp x10,x8
00bc1444	b.cs 0x00bc1360
00bc1448	cmp x10,x11
00bc144c	b.eq 0x00bc1470
00bc1450	lsr w14,w4,#0x3
00bc1454	sub w5,w10,w11
00bc1458	sub x15,x10,x14
00bc145c	cmp x15,x11
00bc1460	csel w14,w5,w14,cc
00bc1464	sub x10,x10,x14
00bc1468	sub w15,w4,w14, LSL #0x3
00bc146c	b 0x00bc136c
00bc1470	mov w15,w4
00bc1474	mov x14,x2
00bc1478	b 0x00bc1370
00bc147c	ldr x13,[sp, #0x30]
00bc1480	mov x10,x9
00bc1484	ldp x15,x11,[sp, #0x20]
00bc1488	ldp x16,x12,[sp, #0x10]
00bc148c	adrp x0,0x789000
00bc1490	add x0,x0,#0xba8
00bc1494	cmp x9,x8
00bc1498	b.cs 0x00bc14c4
00bc149c	cmp x9,x10
00bc14a0	b.eq 0x00bc1598
00bc14a4	lsr w13,w14,#0x3
00bc14a8	sub w2,w9,w10
00bc14ac	sub x1,x9,x13
00bc14b0	cmp x1,x10
00bc14b4	csel w13,w13,w2,cs
00bc14b8	cset w1,cs
00bc14bc	sub w14,w14,w13, LSL #0x3
00bc14c0	b 0x00bc14d0
00bc14c4	lsr w13,w14,#0x3
00bc14c8	and w14,w14,#0x7
00bc14cc	mov w1,#0x1
00bc14d0	sub x9,x9,w13, UXTW 
00bc14d4	cmp x17,x25
00bc14d8	ldr x13,[x9]
00bc14dc	b.cs 0x00bc1598
00bc14e0	tbz w1,#0x0,0x00bc1598
00bc14e4	add x15,x11,x15, LSL #0x2
00bc14e8	lsl x3,x13,x14
00bc14ec	add x16,x12,x16, LSL #0x2
00bc14f0	ldrb w1,[x15, #0x2]
00bc14f4	ldrb w2,[x15, #0x3]
00bc14f8	ldrh w15,[x15]
00bc14fc	neg w4,w2
00bc1500	strb w1,[x17]
00bc1504	add w14,w14,w2
00bc1508	lsr x1,x3,x4
00bc150c	ldrb w2,[x16, #0x3]
00bc1510	lsl x3,x13,x14
00bc1514	ldrb w5,[x16, #0x2]
00bc1518	ldrh w16,[x16]
00bc151c	neg w4,w2
00bc1520	add x1,x11,x1, LSL #0x2
00bc1524	add w14,w14,w2
00bc1528	lsr x3,x3,x4
00bc152c	strb w5,[x17, #0x1]
00bc1530	add x15,x1,x15, LSL #0x2
00bc1534	add x1,x12,x3, LSL #0x2
00bc1538	ldrb w3,[x15, #0x2]
00bc153c	ldrb w4,[x15, #0x3]
00bc1540	ldrh w15,[x15]
00bc1544	add x16,x1,x16, LSL #0x2
00bc1548	lsl x1,x13,x14
00bc154c	strb w3,[x17, #0x2]
00bc1550	add w14,w14,w4
00bc1554	neg w3,w4
00bc1558	ldrb w2,[x16, #0x3]
00bc155c	lsl x4,x13,x14
00bc1560	lsr x1,x1,x3
00bc1564	ldrh w3,[x16]
00bc1568	ldrb w6,[x16, #0x2]
00bc156c	neg w5,w2
00bc1570	add w14,w14,w2
00bc1574	add x15,x1,x15
00bc1578	lsr x16,x4,x5
00bc157c	cmp w14,#0x40
00bc1580	strb w6,[x17, #0x3]
00bc1584	add x17,x17,#0x4
00bc1588	add x16,x16,x3
00bc158c	b.ls 0x00bc1494
00bc1590	mov x9,x0
00bc1594	b 0x00bc1598
00bc1598	sub x0,x24,#0x2
00bc159c	str x13,[sp, #0x30]
00bc15a0	cmp x17,x0
00bc15a4	str x15,[sp, #0x20]
00bc15a8	str x16,[sp, #0x10]
00bc15ac	b.ls 0x00bc15b8
00bc15b0	mov x0,#-0x46
00bc15b4	b 0x00bc0f40
00bc15b8	add x17,x17,#0x1
00bc15bc	b 0x00bc15f4
00bc15c0	lsr w13,w14,#0x3
00bc15c4	and w14,w14,#0x7
00bc15c8	sub x9,x9,w13, UXTW 
00bc15cc	ldr x13,[x9]
00bc15d0	str x13,[sp, #0x30]
00bc15d4	lsl x1,x2,x1
00bc15d8	neg w2,w4
00bc15dc	lsr x1,x1,x2
00bc15e0	add x2,x17,#0x1
00bc15e4	add x17,x17,#0x2
00bc15e8	cmp x2,x0
00bc15ec	add x16,x1,x16
00bc15f0	b.hi 0x00bc15b0
00bc15f4	add x15,x11,x15, LSL #0x2
00bc15f8	ldrb w3,[x15, #0x3]
00bc15fc	ldrb w2,[x15, #0x2]
00bc1600	ldrh w15,[x15]
00bc1604	add w1,w14,w3
00bc1608	sturb w2,[x17, #-0x1]
00bc160c	cmp w1,#0x40
00bc1610	b.hi 0x00bc16fc
00bc1614	cmp x9,x8
00bc1618	b.cs 0x00bc1640
00bc161c	cmp x9,x10
00bc1620	b.eq 0x00bc16b8
00bc1624	lsr w2,w1,#0x3
00bc1628	sub w5,w9,w10
00bc162c	sub x4,x9,x2
00bc1630	cmp x4,x10
00bc1634	csel w2,w5,w2,cc
00bc1638	sub w1,w1,w2, LSL #0x3
00bc163c	b 0x00bc1648
00bc1640	lsr w2,w1,#0x3
00bc1644	and w1,w1,#0x7
00bc1648	sub x9,x9,w2, UXTW 
00bc164c	ldr x2,[x9]
00bc1650	str x2,[sp, #0x30]
00bc1654	cmp x17,x0
00bc1658	b.hi 0x00bc15b0
00bc165c	add x16,x12,x16, LSL #0x2
00bc1660	lsl x13,x13,x14
00bc1664	neg w14,w3
00bc1668	ldrb w4,[x16, #0x3]
00bc166c	lsr x13,x13,x14
00bc1670	ldrb w3,[x16, #0x2]
00bc1674	ldrh w16,[x16]
00bc1678	add w14,w1,w4
00bc167c	add x15,x13,x15
00bc1680	strb w3,[x17]
00bc1684	cmp w14,#0x40
00bc1688	b.hi 0x00bc1710
00bc168c	cmp x9,x8
00bc1690	b.cs 0x00bc15c0
00bc1694	cmp x9,x10
00bc1698	b.eq 0x00bc16c8
00bc169c	lsr w13,w14,#0x3
00bc16a0	sub w5,w9,w10
00bc16a4	sub x3,x9,x13
00bc16a8	cmp x3,x10
00bc16ac	csel w13,w5,w13,cc
00bc16b0	sub w14,w14,w13, LSL #0x3
00bc16b4	b 0x00bc15c8
00bc16b8	mov x2,x13
00bc16bc	cmp x17,x0
00bc16c0	b.ls 0x00bc165c
00bc16c4	b 0x00bc15b0
00bc16c8	mov x13,x2
00bc16cc	b 0x00bc15d4
00bc16d0	add x8,x13,x16, LSL #0x2
00bc16d4	ldrb w8,[x8, #0x2]
00bc16d8	strb w8,[x0], #0x1
00bc16dc	b 0x00bc16f4
00bc16e0	add x8,x12,x17, LSL #0x2
00bc16e4	add x9,x0,#0x2
00bc16e8	ldrb w8,[x8, #0x2]
00bc16ec	strb w8,[x0, #0x1]
00bc16f0	mov x0,x9
00bc16f4	sub x0,x0,x23
00bc16f8	b 0x00bc0f40
00bc16fc	add x8,x12,x16, LSL #0x2
00bc1700	ldrb w8,[x8, #0x2]
00bc1704	strb w8,[x17], #0x1
00bc1708	sub x0,x17,x23
00bc170c	b 0x00bc0f40
00bc1710	add x8,x11,x15, LSL #0x2
00bc1714	add x9,x17,#0x2
00bc1718	sub x0,x9,x23
00bc171c	ldrb w8,[x8, #0x2]
00bc1720	strb w8,[x17, #0x1]
00bc1724	b 0x00bc0f40
00bc1728	bl 0x00c2fec0
