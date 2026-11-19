; ZSTD_decompressContinue @ 00bb0f68
00bb0f68	sub sp,sp,#0xb0
00bb0f6c	stp x29,x30,[sp, #0x50]
00bb0f70	str x27,[sp, #0x60]
00bb0f74	stp x26,x25,[sp, #0x70]
00bb0f78	stp x24,x23,[sp, #0x80]
00bb0f7c	stp x22,x21,[sp, #0x90]
00bb0f80	stp x20,x19,[sp, #0xa0]
00bb0f84	add x29,sp,#0x50
00bb0f88	mrs x24,tpidr_el0
00bb0f8c	mov w9,#0x74f8
00bb0f90	mov x20,x4
00bb0f94	ldr x8,[x24, #0x28]
00bb0f98	add x25,x0,x9
00bb0f9c	mov x21,x3
00bb0fa0	mov x19,x0
00bb0fa4	stur x8,[x29, #-0x8]
00bb0fa8	ldr w8,[x25, #0x34]
00bb0fac	sub w8,w8,#0x3
00bb0fb0	cmp w8,#0x2
00bb0fb4	b.cs 0x00bb1054
00bb0fb8	ldr w9,[x25, #0x30]
00bb0fbc	ldr x8,[x19, #0x74e0]
00bb0fc0	cbz w9,0x00bb10fc
00bb0fc4	cmp x20,x8
00bb0fc8	b.ne 0x00bb1060
00bb0fcc	mov x0,x19
00bb0fd0	mov x22,x1
00bb0fd4	mov x27,x2
00bb0fd8	bl 0x00c43630
00bb0fdc	ldr x9,[x19, #0x7518]
00bb0fe0	ldr w8,[x25, #0x34]
00bb0fe4	mov x0,#-0x1
00bb0fe8	add x23,x9,x20
00bb0fec	cmp w8,#0x2
00bb0ff0	str x23,[x19, #0x7518]
00bb0ff4	b.le 0x00bb1094
00bb0ff8	add x9,x19,#0x17, LSL #12
00bb0ffc	cmp w8,#0x5
00bb1000	add x26,x9,#0x6c8
00bb1004	b.gt 0x00bb1118
00bb1008	sub w9,w8,#0x3
00bb100c	cmp w9,#0x2
00bb1010	b.cs 0x00bb112c
00bb1014	ldr w9,[x25, #0x30]
00bb1018	cbz w9,0x00bb127c
00bb101c	cmp w9,#0x1
00bb1020	mov x2,x27
00bb1024	b.eq 0x00bb1264
00bb1028	cmp w9,#0x2
00bb102c	b.ne 0x00bb13d0
00bb1030	mov x0,x19
00bb1034	mov x1,x22
00bb1038	mov x3,x21
00bb103c	mov x4,x20
00bb1040	mov w5,#0x1
00bb1044	bl 0x00c43640
00bb1048	mov x8,x22
00bb104c	mov x20,x0
00bb1050	b 0x00bb13b0
00bb1054	ldr x8,[x19, #0x74e0]
00bb1058	cmp x20,x8
00bb105c	b.eq 0x00bb0fcc
00bb1060	mov x0,#-0x48
00bb1064	ldr x8,[x24, #0x28]
00bb1068	ldur x9,[x29, #-0x8]
00bb106c	cmp x8,x9
00bb1070	b.ne 0x00bb14e0
00bb1074	ldp x20,x19,[sp, #0xa0]
00bb1078	ldr x27,[sp, #0x60]
00bb107c	ldp x22,x21,[sp, #0x90]
00bb1080	ldp x24,x23,[sp, #0x80]
00bb1084	ldp x26,x25,[sp, #0x70]
00bb1088	ldp x29,x30,[sp, #0x50]
00bb108c	add sp,sp,#0xb0
00bb1090	ret
00bb1094	cbz w8,0x00bb11fc
00bb1098	cmp w8,#0x1
00bb109c	b.eq 0x00bb121c
00bb10a0	cmp w8,#0x2
00bb10a4	b.ne 0x00bb1064
00bb10a8	add x2,sp,#0x8
00bb10ac	mov x0,x21
00bb10b0	mov w1,#0x3
00bb10b4	bl 0x00c43620
00bb10b8	cmn x0,#0x78
00bb10bc	b.hi 0x00bb1064
00bb10c0	ldr w8,[x25]
00bb10c4	cmp x0,x8
00bb10c8	b.hi 0x00bb13d0
00bb10cc	ldp w9,w8,[sp, #0x8]
00bb10d0	ldr w10,[sp, #0x10]
00bb10d4	str x0,[x19, #0x74e0]
00bb10d8	str w9,[x25, #0x30]
00bb10dc	str x10,[x19, #0x75d0]
00bb10e0	cbz x0,0x00bb1474
00bb10e4	cmp w8,#0x0
00bb10e8	mov w8,#0x3
00bb10ec	cinc w8,w8,ne
00bb10f0	mov x0,xzr
00bb10f4	str w8,[x25, #0x34]
00bb10f8	b 0x00bb1064
00bb10fc	cmp x20,x8
00bb1100	csel x8,x20,x8,cc
00bb1104	cmp x8,#0x1
00bb1108	csinc x8,x8,xzr,hi
00bb110c	cmp x20,x8
00bb1110	b.ne 0x00bb1060
00bb1114	b 0x00bb0fcc
00bb1118	cmp w8,#0x6
00bb111c	b.eq 0x00bb11d4
00bb1120	cmp w8,#0x7
00bb1124	b.eq 0x00bb11c4
00bb1128	b 0x00bb1064
00bb112c	cmp w8,#0x5
00bb1130	b.ne 0x00bb1064
00bb1134	ldr w8,[x25, #0xa8]
00bb1138	cbz w8,0x00bb1154
00bb113c	mov w8,#0x7538
00bb1140	add x0,x19,x8
00bb1144	bl 0x00c43670
00bb1148	ldr w8,[x21]
00bb114c	cmp w8,w0
00bb1150	b.ne 0x00bb12c8
00bb1154	adrp x8,0xcb5000
00bb1158	ldr x8,[x8, #0xac8]
00bb115c	cbz x8,0x00bb11c4
00bb1160	ldr x0,[x26, #0x18]
00bb1164	cbz x0,0x00bb11c4
00bb1168	movi v0.2D,#0x0
00bb116c	adrp x9,0x29a000
00bb1170	ldr x8,[x19, #0x75f0]
00bb1174	ldr d1,[x9, #0xd48]
00bb1178	ldr x20,[x19, #0x7520]
00bb117c	str d1,[sp, #0x8]
00bb1180	stp q0,q0,[sp, #0x20]
00bb1184	stur q0,[sp, #0x10]
00bb1188	cbz x8,0x00bb11b4
00bb118c	mov x0,x8
00bb1190	bl 0x00c435d0
00bb1194	ldr x8,[x19, #0x75f0]
00bb1198	str w0,[sp, #0x10]
00bb119c	mov x0,x8
00bb11a0	bl 0x00c43580
00bb11a4	ldr w8,[x25, #0x104]
00bb11a8	str x0,[sp, #0x18]
00bb11ac	ldr x0,[x26, #0x18]
00bb11b0	str w8,[sp, #0x14]
00bb11b4	add x1,sp,#0x8
00bb11b8	stp x20,x23,[sp, #0x20]
00bb11bc	str x19,[sp, #0x40]
00bb11c0	bl 0x00c43680
00bb11c4	mov x0,xzr
00bb11c8	str xzr,[x19, #0x74e0]
00bb11cc	str wzr,[x25, #0x34]
00bb11d0	b 0x00bb1064
00bb11d4	sub x8,x19,x20
00bb11d8	mov x1,x21
00bb11dc	mov x2,x20
00bb11e0	add x8,x8,#0x17, LSL #12
00bb11e4	add x0,x8,#0x6cc
00bb11e8	bl 0x00c2ffd0
00bb11ec	ldr w8,[x26]
00bb11f0	mov x0,xzr
00bb11f4	mov w9,#0x7
00bb11f8	b 0x00bb1398
00bb11fc	ldr w8,[x25, #0xa0]
00bb1200	cbz w8,0x00bb128c
00bb1204	mov w8,#0x1
00bb1208	cmp x20,x8
00bb120c	b.cs 0x00bb1320
00bb1210	mov x0,#-0x48
00bb1214	str x0,[x19, #0x7590]
00bb1218	b 0x00bb1064
00bb121c	ldr x22,[x19, #0x7590]
00bb1220	add x8,x19,#0x17, LSL #12
00bb1224	mov x1,x21
00bb1228	add x23,x8,#0x6c4
00bb122c	mov x2,x20
00bb1230	sub x8,x22,x20
00bb1234	add x0,x23,x8
00bb1238	bl 0x00c2ffd0
00bb123c	mov x0,x19
00bb1240	mov x1,x23
00bb1244	mov x2,x22
00bb1248	bl 0x00bb14e4
00bb124c	cmn x0,#0x78
00bb1250	b.hi 0x00bb1064
00bb1254	mov x0,xzr
00bb1258	mov w8,#0x3
00bb125c	mov w9,#0x2
00bb1260	b 0x00bb1398
00bb1264	ldr x20,[x19, #0x75d0]
00bb1268	mov x8,x22
00bb126c	cmp x20,x2
00bb1270	b.ls 0x00bb12d0
00bb1274	mov x20,#-0x46
00bb1278	b 0x00bb13b0
00bb127c	cmp x20,x27
00bb1280	b.ls 0x00bb12ec
00bb1284	mov x0,#-0x46
00bb1288	b 0x00bb1064
00bb128c	ldr w8,[x21]
00bb1290	mov w9,#0xd2a5
00bb1294	movk w9,#0x184, LSL #16
00bb1298	cmp w9,w8, LSR #0x4
00bb129c	b.ne 0x00bb1314
00bb12a0	add x8,x19,#0x17, LSL #12
00bb12a4	mov x1,x21
00bb12a8	mov x2,x20
00bb12ac	add x0,x8,#0x6c4
00bb12b0	bl 0x00c2ffd0
00bb12b4	mov w8,#0x8
00bb12b8	mov x0,xzr
00bb12bc	mov w9,#0x6
00bb12c0	sub x8,x8,x20
00bb12c4	b 0x00bb1398
00bb12c8	mov x0,#-0x16
00bb12cc	b 0x00bb1064
00bb12d0	cbz x8,0x00bb13a4
00bb12d4	ldrb w1,[x21]
00bb12d8	mov x0,x8
00bb12dc	mov x2,x20
00bb12e0	bl 0x00c301c0
00bb12e4	mov x8,x22
00bb12e8	b 0x00bb13b0
00bb12ec	mov x8,x22
00bb12f0	cbz x22,0x00bb1458
00bb12f4	mov x0,x8
00bb12f8	mov x1,x21
00bb12fc	mov x2,x20
00bb1300	bl 0x00c2ff60
00bb1304	mov x8,x22
00bb1308	cmn x20,#0x78
00bb130c	b.ls 0x00bb1464
00bb1310	b 0x00bb1414
00bb1314	mov w8,#0x5
00bb1318	cmp x20,x8
00bb131c	b.cc 0x00bb1210
00bb1320	add x9,x21,x8
00bb1324	adrp x12,0x364000
00bb1328	add x12,x12,#0xd50
00bb132c	ldurb w9,[x9, #-0x1]
00bb1330	and x10,x9,#0x3
00bb1334	lsr x11,x9,#0x6
00bb1338	cmp w9,#0x40
00bb133c	ldr x10,[x12, x10, LSL #0x3]
00bb1340	adrp x12,0x364000
00bb1344	add x12,x12,#0xe90
00bb1348	ldr x11,[x12, x11, LSL #0x3]
00bb134c	cset w12,cc
00bb1350	ands w9,w9,#0x20
00bb1354	add x8,x10,x8
00bb1358	and w9,w12,w9, LSR #0x5
00bb135c	add x8,x8,x11
00bb1360	cinc x8,x8,eq
00bb1364	add x0,x8,x9
00bb1368	cmn x0,#0x78
00bb136c	str x0,[x19, #0x7590]
00bb1370	b.hi 0x00bb1064
00bb1374	add x8,x19,#0x17, LSL #12
00bb1378	mov x22,x0
00bb137c	mov x1,x21
00bb1380	add x0,x8,#0x6c4
00bb1384	mov x2,x20
00bb1388	bl 0x00c2ffd0
00bb138c	sub x8,x22,x20
00bb1390	mov w9,#0x1
00bb1394	mov x0,xzr
00bb1398	str x8,[x19, #0x74e0]
00bb139c	str w9,[x25, #0x34]
00bb13a0	b 0x00bb1064
00bb13a4	cmp x20,#0x0
00bb13a8	mov x9,#-0x4a
00bb13ac	csel x20,xzr,x9,eq
00bb13b0	mov x9,xzr
00bb13b4	cmn x20,#0x78
00bb13b8	mov x0,x20
00bb13bc	str xzr,[x19, #0x74e0]
00bb13c0	b.hi 0x00bb1064
00bb13c4	ldr w10,[x25]
00bb13c8	cmp x20,x10
00bb13cc	b.ls 0x00bb13d8
00bb13d0	mov x0,#-0x14
00bb13d4	b 0x00bb1064
00bb13d8	ldr x10,[x19, #0x7520]
00bb13dc	ldr w11,[x25, #0xa8]
00bb13e0	add x10,x10,x20
00bb13e4	str x10,[x19, #0x7520]
00bb13e8	cbz w11,0x00bb1408
00bb13ec	mov w8,#0x7538
00bb13f0	mov x1,x22
00bb13f4	mov x2,x20
00bb13f8	add x0,x19,x8
00bb13fc	bl 0x00c43650
00bb1400	ldr x9,[x19, #0x74e0]
00bb1404	mov x8,x22
00bb1408	add x8,x8,x20
00bb140c	str x8,[x19, #0x74c0]
00bb1410	cbz x9,0x00bb141c
00bb1414	mov x0,x20
00bb1418	b 0x00bb1064
00bb141c	ldr w8,[x25, #0x34]
00bb1420	cmp w8,#0x4
00bb1424	b.ne 0x00bb1490
00bb1428	ldr x8,[x19, #0x74e8]
00bb142c	cmn x8,#0x1
00bb1430	b.eq 0x00bb1440
00bb1434	ldr x9,[x19, #0x7520]
00bb1438	cmp x9,x8
00bb143c	b.ne 0x00bb13d0
00bb1440	ldr w8,[x25, #0x10]
00bb1444	cbz w8,0x00bb14c0
00bb1448	mov w8,#0x4
00bb144c	mov w9,#0x5
00bb1450	mov x0,x20
00bb1454	b 0x00bb1398
00bb1458	cbz x20,0x00bb1464
00bb145c	mov x0,#-0x4a
00bb1460	b 0x00bb1064
00bb1464	ldr x9,[x19, #0x74e0]
00bb1468	sub x9,x9,x20
00bb146c	str x9,[x19, #0x74e0]
00bb1470	b 0x00bb13c4
00bb1474	cbz w8,0x00bb14a8
00bb1478	ldr w8,[x25, #0x10]
00bb147c	cbz w8,0x00bb14b8
00bb1480	mov w8,#0x4
00bb1484	str x8,[x19, #0x74e0]
00bb1488	mov w8,#0x5
00bb148c	b 0x00bb10f0
00bb1490	mov w8,#0x2
00bb1494	mov w9,#0x3
00bb1498	mov x0,x20
00bb149c	str w8,[x25, #0x34]
00bb14a0	str x9,[x19, #0x74e0]
00bb14a4	b 0x00bb1064
00bb14a8	mov w8,#0x3
00bb14ac	str x8,[x19, #0x74e0]
00bb14b0	mov w8,#0x2
00bb14b4	b 0x00bb10f0
00bb14b8	str xzr,[x19, #0x74e0]
00bb14bc	b 0x00bb10f0
00bb14c0	ldr x1,[x19, #0x7520]
00bb14c4	ldr x2,[x19, #0x7518]
00bb14c8	mov x0,x19
00bb14cc	mov w3,#0x1
00bb14d0	bl 0x00bb165c
00bb14d4	str xzr,[x19, #0x74e0]
00bb14d8	mov x0,x20
00bb14dc	b 0x00bb11cc
00bb14e0	bl 0x00c2fec0
