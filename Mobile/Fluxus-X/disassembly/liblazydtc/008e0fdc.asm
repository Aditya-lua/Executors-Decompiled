; blake3_hasher_finalize_seek @ 008e0fdc
008e0fdc	sub sp,sp,#0x140
008e0fe0	stp x29,x30,[sp, #0xe0]
008e0fe4	str x28,[sp, #0xf0]
008e0fe8	stp x26,x25,[sp, #0x100]
008e0fec	stp x24,x23,[sp, #0x110]
008e0ff0	stp x22,x21,[sp, #0x120]
008e0ff4	stp x20,x19,[sp, #0x130]
008e0ff8	add x29,sp,#0xe0
008e0ffc	mrs x24,tpidr_el0
008e1000	ldr x8,[x24, #0x28]
008e1004	stur x8,[x29, #-0x8]
008e1008	cbz x3,0x008e13fc
008e100c	ldrb w23,[x0, #0x90]
008e1010	mov x20,x3
008e1014	mov x19,x2
008e1018	mov x21,x1
008e101c	mov x22,x0
008e1020	cbz x23,0x008e1084
008e1024	ldrb w8,[x22, #0x89]
008e1028	ldrb w2,[x22, #0x88]
008e102c	orr x9,x2,x8, LSL #0x6
008e1030	cbz x9,0x008e1184
008e1034	ldp q0,q1,[x22, #0x20]
008e1038	cmp w8,#0x0
008e103c	ldrb w8,[x22, #0x8a]
008e1040	cset w9,eq
008e1044	ldur q2,[x22, #0x48]
008e1048	ldr x3,[x22, #0x40]
008e104c	strb w2,[sp, #0x88]
008e1050	stp q0,q1,[sp, #0x20]
008e1054	ldur q0,[x22, #0x58]
008e1058	orr w8,w8,w9
008e105c	ldur q1,[x22, #0x68]
008e1060	orr w4,w8,#0x2
008e1064	stur q2,[sp, #0x48]
008e1068	stur q0,[sp, #0x58]
008e106c	ldur q0,[x22, #0x78]
008e1070	stur q1,[sp, #0x68]
008e1074	stur q0,[sp, #0x78]
008e1078	str x3,[sp, #0x40]
008e107c	strb w4,[sp, #0x89]
008e1080	b 0x008e11d4
008e1084	ldp q0,q1,[x22, #0x20]
008e1088	add x25,sp,#0x20
008e108c	ldrb w8,[x22, #0x89]
008e1090	ldur q2,[x22, #0x48]
008e1094	ldrb w2,[x22, #0x88]
008e1098	stp q0,q1,[sp, #0x20]
008e109c	ldur q0,[x22, #0x58]
008e10a0	cmp w8,#0x0
008e10a4	ldrb w8,[x22, #0x8a]
008e10a8	cset w9,eq
008e10ac	ldur q1,[x22, #0x68]
008e10b0	stur q0,[sp, #0x58]
008e10b4	ldur q0,[x22, #0x78]
008e10b8	ands x23,x21,#0x3f
008e10bc	orr w8,w8,w9
008e10c0	ldr x9,[x22, #0x40]
008e10c4	lsr x22,x21,#0x6
008e10c8	orr w10,w8,#0x2
008e10cc	stur q2,[sp, #0x48]
008e10d0	stur q1,[sp, #0x68]
008e10d4	stur q0,[sp, #0x78]
008e10d8	strb w2,[sp, #0x88]
008e10dc	str x9,[sp, #0x40]
008e10e0	strb w10,[sp, #0x89]
008e10e4	b.eq 0x008e1134
008e10e8	mov w9,#0xa
008e10ec	add x0,sp,#0x20
008e10f0	add x1,x25,#0x28
008e10f4	orr w4,w8,w9
008e10f8	sub x5,x29,#0x50
008e10fc	mov x3,x22
008e1100	sub x26,x29,#0x50
008e1104	bl 0x00c30ae0
008e1108	mov w8,#0x40
008e110c	add x1,x26,x23
008e1110	mov x0,x19
008e1114	sub x8,x8,x23
008e1118	cmp x20,x8
008e111c	csel x21,x20,x8,cc
008e1120	mov x2,x21
008e1124	bl 0x00c2ffd0
008e1128	add x19,x19,x21
008e112c	sub x20,x20,x21
008e1130	add x22,x22,#0x1
008e1134	lsr x21,x20,#0x6
008e1138	cmp x20,#0x40
008e113c	b.cc 0x008e1164
008e1140	ldrb w8,[sp, #0x89]
008e1144	ldrb w2,[sp, #0x88]
008e1148	add x0,sp,#0x20
008e114c	add x1,x25,#0x28
008e1150	mov x3,x22
008e1154	mov x5,x19
008e1158	orr w4,w8,#0x8
008e115c	mov x6,x21
008e1160	bl 0x00c30af0
008e1164	ands x23,x20,#0x3f
008e1168	b.eq 0x008e13fc
008e116c	ldrb w8,[sp, #0x89]
008e1170	ldrb w2,[sp, #0x88]
008e1174	and x20,x20,#-0x40
008e1178	add x0,sp,#0x20
008e117c	add x1,x25,#0x28
008e1180	b 0x008e13dc
008e1184	subs x23,x23,#0x2
008e1188	ldp q0,q1,[x22]
008e118c	add x8,x22,x23, LSL #0x5
008e1190	mov w2,#0x40
008e1194	str xzr,[sp, #0x40]
008e1198	strb w2,[sp, #0x88]
008e119c	stp q0,q1,[sp, #0x20]
008e11a0	ldur q0,[x8, #0xa1]
008e11a4	ldur q2,[x8, #0x91]
008e11a8	ldur q1,[x8, #0xb1]
008e11ac	stur q0,[sp, #0x58]
008e11b0	ldur q0,[x8, #0xc1]
008e11b4	ldrb w8,[x22, #0x8a]
008e11b8	stur q2,[sp, #0x48]
008e11bc	orr w4,w8,#0x4
008e11c0	stur q1,[sp, #0x68]
008e11c4	stur q0,[sp, #0x78]
008e11c8	strb w4,[sp, #0x89]
008e11cc	b.eq 0x008e132c
008e11d0	mov x3,xzr
008e11d4	lsl x8,x23,#0x5
008e11d8	add x25,sp,#0x20
008e11dc	add x26,x8,#0x71
008e11e0	add x8,x22,x26
008e11e4	sub x0,x29,#0x50
008e11e8	add x1,x25,#0x28
008e11ec	ldp q0,q1,[x8]
008e11f0	sub x23,x23,#0x1
008e11f4	stp q0,q1,[sp]
008e11f8	ldp q0,q2,[sp, #0x20]
008e11fc	stp q0,q2,[x29, #-0x50]
008e1200	bl 0x00c30ac0
008e1204	ldp w8,w9,[x29, #-0x50]
008e1208	ldp q0,q1,[x22]
008e120c	mov x3,xzr
008e1210	mov w2,#0x40
008e1214	sub x26,x26,#0x20
008e1218	str xzr,[sp, #0x40]
008e121c	lsr w10,w8,#0x8
008e1220	strb w8,[sp, #0x68]
008e1224	lsr w11,w8,#0x10
008e1228	lsr w8,w8,#0x18
008e122c	strb w9,[sp, #0x6c]
008e1230	strb w10,[sp, #0x69]
008e1234	lsr w10,w9,#0x8
008e1238	strb w11,[sp, #0x6a]
008e123c	lsr w11,w9,#0x10
008e1240	strb w8,[sp, #0x6b]
008e1244	lsr w8,w9,#0x18
008e1248	strb w10,[sp, #0x6d]
008e124c	ldp w9,w10,[x29, #-0x48]
008e1250	strb w11,[sp, #0x6e]
008e1254	strb w8,[sp, #0x6f]
008e1258	lsr w11,w9,#0x8
008e125c	lsr w8,w9,#0x10
008e1260	strb w9,[sp, #0x70]
008e1264	lsr w9,w9,#0x18
008e1268	strb w10,[sp, #0x74]
008e126c	strb w8,[sp, #0x72]
008e1270	lsr w8,w10,#0x8
008e1274	strb w9,[sp, #0x73]
008e1278	lsr w9,w10,#0x10
008e127c	lsr w10,w10,#0x18
008e1280	strb w8,[sp, #0x75]
008e1284	strb w9,[sp, #0x76]
008e1288	ldp w8,w9,[x29, #-0x40]
008e128c	strb w10,[sp, #0x77]
008e1290	strb w11,[sp, #0x71]
008e1294	lsr w10,w8,#0x10
008e1298	lsr w11,w8,#0x8
008e129c	strb w8,[sp, #0x78]
008e12a0	lsr w8,w8,#0x18
008e12a4	strb w9,[sp, #0x7c]
008e12a8	strb w10,[sp, #0x7a]
008e12ac	lsr w10,w9,#0x8
008e12b0	strb w11,[sp, #0x79]
008e12b4	strb w10,[sp, #0x7d]
008e12b8	ldp w11,w10,[x29, #-0x38]
008e12bc	strb w8,[sp, #0x7b]
008e12c0	lsr w8,w9,#0x10
008e12c4	lsr w9,w9,#0x18
008e12c8	stp q0,q1,[sp, #0x20]
008e12cc	ldp q2,q0,[sp]
008e12d0	strb w8,[sp, #0x7e]
008e12d4	lsr w8,w11,#0x8
008e12d8	strb w9,[sp, #0x7f]
008e12dc	lsr w9,w11,#0x18
008e12e0	strb w8,[sp, #0x81]
008e12e4	lsr w8,w11,#0x10
008e12e8	strb w9,[sp, #0x83]
008e12ec	lsr w9,w10,#0x18
008e12f0	strb w8,[sp, #0x82]
008e12f4	lsr w8,w10,#0x8
008e12f8	strb w11,[sp, #0x80]
008e12fc	strb w8,[sp, #0x85]
008e1300	lsr w8,w10,#0x10
008e1304	stur q2,[x25, #0x28]
008e1308	strb w8,[sp, #0x86]
008e130c	ldrb w8,[x22, #0x8a]
008e1310	strb w10,[sp, #0x84]
008e1314	orr w4,w8,#0x4
008e1318	stur q0,[x25, #0x38]
008e131c	strb w9,[sp, #0x87]
008e1320	strb w2,[sp, #0x88]
008e1324	strb w4,[sp, #0x89]
008e1328	cbnz x23,0x008e11e0
008e132c	lsr x22,x21,#0x6
008e1330	ands x23,x21,#0x3f
008e1334	b.eq 0x008e1388
008e1338	add x8,sp,#0x20
008e133c	add x0,sp,#0x20
008e1340	orr w4,w4,#0x8
008e1344	add x1,x8,#0x28
008e1348	sub x5,x29,#0x50
008e134c	mov w2,#0x40
008e1350	mov x3,x22
008e1354	mov w21,#0x40
008e1358	sub x25,x29,#0x50
008e135c	bl 0x00c30ae0
008e1360	sub x8,x21,x23
008e1364	add x1,x25,x23
008e1368	mov x0,x19
008e136c	cmp x20,x8
008e1370	csel x21,x20,x8,cc
008e1374	mov x2,x21
008e1378	bl 0x00c2ffd0
008e137c	add x19,x19,x21
008e1380	sub x20,x20,x21
008e1384	add x22,x22,#0x1
008e1388	lsr x21,x20,#0x6
008e138c	cmp x20,#0x40
008e1390	b.cc 0x008e13bc
008e1394	ldrb w8,[sp, #0x89]
008e1398	ldrb w2,[sp, #0x88]
008e139c	add x9,sp,#0x20
008e13a0	add x0,sp,#0x20
008e13a4	add x1,x9,#0x28
008e13a8	mov x3,x22
008e13ac	orr w4,w8,#0x8
008e13b0	mov x5,x19
008e13b4	mov x6,x21
008e13b8	bl 0x00c30af0
008e13bc	ands x23,x20,#0x3f
008e13c0	b.eq 0x008e13fc
008e13c4	ldrb w8,[sp, #0x89]
008e13c8	ldrb w2,[sp, #0x88]
008e13cc	add x9,sp,#0x20
008e13d0	and x20,x20,#-0x40
008e13d4	add x0,sp,#0x20
008e13d8	add x1,x9,#0x28
008e13dc	add x3,x21,x22
008e13e0	orr w4,w8,#0x8
008e13e4	sub x5,x29,#0x50
008e13e8	bl 0x00c30ae0
008e13ec	add x0,x19,x20
008e13f0	sub x1,x29,#0x50
008e13f4	mov x2,x23
008e13f8	bl 0x00c2ffd0
008e13fc	ldr x8,[x24, #0x28]
008e1400	ldur x9,[x29, #-0x8]
008e1404	cmp x8,x9
008e1408	b.ne 0x008e142c
008e140c	ldp x20,x19,[sp, #0x130]
008e1410	ldr x28,[sp, #0xf0]
008e1414	ldp x22,x21,[sp, #0x120]
008e1418	ldp x24,x23,[sp, #0x110]
008e141c	ldp x26,x25,[sp, #0x100]
008e1420	ldp x29,x30,[sp, #0xe0]
008e1424	add sp,sp,#0x140
008e1428	ret
008e142c	bl 0x00c2fec0
