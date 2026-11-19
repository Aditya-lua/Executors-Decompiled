; FUN_00ae1058 @ 00ae1058
00ae1058	adrp x18,0x775000
00ae105c	add x18,x18,#0xbe8
00ae1060	ldp x14,x15,[x1, #0x30]
00ae1064	ldp x16,x17,[x1, #0x10]
00ae1068	ldr x18,[x18, x2, LSL #0x3]
00ae106c	ldp x3,x2,[x1, #0x40]
00ae1070	ldp x8,x9,[x1, #0x20]
00ae1074	ldp x13,x10,[x1]
00ae1078	ldp x11,x12,[x1, #0x50]
00ae107c	eor x15,x15,x16
00ae1080	eor x16,x3,x17
00ae1084	ldp x17,x3,[x1, #0x60]
00ae1088	eor x9,x9,x13
00ae108c	eor x10,x14,x10
00ae1090	eor x8,x2,x8
00ae1094	eor x9,x9,x11
00ae1098	ldp x11,x2,[x1, #0x70]
00ae109c	eor x10,x10,x12
00ae10a0	eor x12,x16,x3
00ae10a4	ldp x16,x3,[x1, #0x80]
00ae10a8	eor x15,x15,x17
00ae10ac	eor x8,x8,x11
00ae10b0	eor x9,x9,x2
00ae10b4	ldp x2,x11,[x1, #0x90]
00ae10b8	eor x10,x10,x16
00ae10bc	eor x15,x15,x3
00ae10c0	ldp x16,x3,[x1, #0xa0]
00ae10c4	eor x8,x8,x11
00ae10c8	eor x12,x12,x2
00ae10cc	eor x16,x9,x16
00ae10d0	ldp x9,x11,[x1, #0xb0]
00ae10d4	eor x10,x10,x3
00ae10d8	ldr x3,[x1, #0xc0]
00ae10dc	eor x15,x15,x9
00ae10e0	eor x12,x12,x11
00ae10e4	eor x11,x8,x3
00ae10e8	eor x8,x11,x10, ROR #0x3f
00ae10ec	eor x9,x16,x15, ROR #0x3f
00ae10f0	eor x10,x10,x12, ROR #0x3f
00ae10f4	eor x11,x15,x11, ROR #0x3f
00ae10f8	eor x12,x12,x16, ROR #0x3f
00ae10fc	eor x14,x9,x14
00ae1100	eor x15,x10,x17
00ae1104	eor x16,x11,x2
00ae1108	eor x17,x3,x12
00ae110c	ror x14,x14,#0x14
00ae1110	ror x15,x15,#0x15
00ae1114	ror x16,x16,#0x2b
00ae1118	ror x17,x17,#0x32
00ae111c	bic x2,x15,x14
00ae1120	eor x13,x8,x13
00ae1124	bic x3,x16,x15
00ae1128	eor x18,x2,x18
00ae112c	bic x2,x17,x16
00ae1130	eor x15,x2,x15
00ae1134	bic x2,x13,x17
00ae1138	eor x3,x3,x14
00ae113c	bic x14,x14,x13
00ae1140	eor x16,x16,x2
00ae1144	eor x14,x14,x17
00ae1148	eor x13,x18,x13
00ae114c	stp x15,x16,[x0, #0x10]
00ae1150	str x14,[x0, #0x20]
00ae1154	stp x13,x3,[x0]
00ae1158	ldp x14,x15,[x1, #0x48]
00ae115c	ldr x16,[x1, #0x80]
00ae1160	ldr x13,[x1, #0x18]
00ae1164	ldr x17,[x1, #0xb0]
00ae1168	eor x14,x14,x12
00ae116c	eor x15,x15,x8
00ae1170	eor x16,x16,x9
00ae1174	eor x13,x13,x11
00ae1178	eor x17,x17,x10
00ae117c	ror x14,x14,#0x2c
00ae1180	ror x15,x15,#0x3d
00ae1184	ror x16,x16,#0x13
00ae1188	ror x13,x13,#0x24
00ae118c	ror x17,x17,#0x3
00ae1190	bic x18,x15,x14
00ae1194	bic x2,x16,x15
00ae1198	bic x3,x17,x16
00ae119c	eor x2,x2,x14
00ae11a0	bic x14,x14,x13
00ae11a4	eor x18,x18,x13
00ae11a8	bic x13,x13,x17
00ae11ac	eor x15,x3,x15
00ae11b0	eor x13,x13,x16
00ae11b4	eor x14,x17,x14
00ae11b8	stp x18,x2,[x0, #0x28]
00ae11bc	stp x15,x13,[x0, #0x38]
00ae11c0	str x14,[x0, #0x48]
00ae11c4	ldr x14,[x1, #0x38]
00ae11c8	ldr x15,[x1, #0x68]
00ae11cc	ldp x16,x17,[x1, #0x98]
00ae11d0	ldr x13,[x1, #0x8]
00ae11d4	eor x14,x14,x10
00ae11d8	eor x15,x15,x11
00ae11dc	eor x16,x16,x12
00ae11e0	eor x13,x13,x9
00ae11e4	eor x17,x17,x8
00ae11e8	ror x14,x14,#0x3a
00ae11ec	ror x15,x15,#0x27
00ae11f0	ror x16,x16,#0x38
00ae11f4	ror x13,x13,#0x3f
00ae11f8	ror x17,x17,#0x2e
00ae11fc	bic x18,x15,x14
00ae1200	bic x2,x16,x15
00ae1204	bic x3,x17,x16
00ae1208	eor x2,x2,x14
00ae120c	bic x14,x14,x13
00ae1210	eor x18,x18,x13
00ae1214	bic x13,x13,x17
00ae1218	eor x15,x3,x15
00ae121c	eor x13,x13,x16
00ae1220	eor x14,x17,x14
00ae1224	stp x18,x2,[x0, #0x50]
00ae1228	stp x15,x13,[x0, #0x60]
00ae122c	str x14,[x0, #0x70]
00ae1230	ldp x13,x14,[x1, #0x20]
00ae1234	ldr x15,[x1, #0x58]
00ae1238	ldr x16,[x1, #0x88]
00ae123c	ldr x17,[x1, #0xb8]
00ae1240	eor x14,x14,x8
00ae1244	eor x15,x15,x9
00ae1248	eor x16,x16,x10
00ae124c	eor x13,x13,x12
00ae1250	eor x17,x17,x11
00ae1254	ror x14,x14,#0x1c
00ae1258	ror x15,x15,#0x36
00ae125c	ror x16,x16,#0x31
00ae1260	ror x13,x13,#0x25
00ae1264	ror x17,x17,#0x8
00ae1268	bic x18,x15,x14
00ae126c	bic x2,x16,x15
00ae1270	bic x3,x17,x16
00ae1274	eor x2,x2,x14
00ae1278	bic x14,x14,x13
00ae127c	eor x18,x18,x13
00ae1280	bic x13,x13,x17
00ae1284	eor x15,x3,x15
00ae1288	eor x13,x13,x16
00ae128c	eor x14,x17,x14
00ae1290	stp x18,x2,[x0, #0x78]
00ae1294	stp x15,x13,[x0, #0x88]
00ae1298	str x14,[x0, #0x98]
00ae129c	ldr x13,[x1, #0x10]
00ae12a0	ldr x14,[x1, #0x40]
00ae12a4	ldp x15,x16,[x1, #0x70]
00ae12a8	ldr x17,[x1, #0xa8]
00ae12ac	eor x10,x13,x10
00ae12b0	eor x11,x14,x11
00ae12b4	eor x12,x15,x12
00ae12b8	eor x8,x16,x8
00ae12bc	eor x9,x17,x9
00ae12c0	ror x10,x10,#0x2
00ae12c4	ror x11,x11,#0x9
00ae12c8	ror x12,x12,#0x19
00ae12cc	ror x8,x8,#0x17
00ae12d0	ror x9,x9,#0x3e
00ae12d4	bic x13,x12,x11
00ae12d8	bic x14,x8,x12
00ae12dc	bic x15,x9,x8
00ae12e0	bic x16,x10,x9
00ae12e4	bic x17,x11,x10
00ae12e8	eor x10,x13,x10
00ae12ec	eor x11,x14,x11
00ae12f0	eor x12,x15,x12
00ae12f4	eor x8,x16,x8
00ae12f8	eor x9,x9,x17
00ae12fc	stp x10,x11,[x0, #0xa0]
00ae1300	stp x12,x8,[x0, #0xb0]
00ae1304	str x9,[x0, #0xc0]
00ae1308	ret
