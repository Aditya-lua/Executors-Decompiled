; FUN_00bd11b4 @ 00bd11b4
00bd11b4	paciasp
00bd11b8	sub sp,sp,#0x60
00bd11bc	stp x29,x30,[sp, #0x10]
00bd11c0	str x25,[sp, #0x20]
00bd11c4	stp x24,x23,[sp, #0x30]
00bd11c8	stp x22,x21,[sp, #0x40]
00bd11cc	stp x20,x19,[sp, #0x50]
00bd11d0	add x29,sp,#0x10
00bd11d4	mov w20,w1
00bd11d8	mov x19,x0
00bd11dc	mov x0,sp
00bd11e0	mov x1,x19
00bd11e4	bl 0x00c43fa0
00bd11e8	ldrb w8,[sp]
00bd11ec	cmp w8,#0x1
00bd11f0	b.ne 0x00bd12e4
00bd11f4	ldr x8,[x19]
00bd11f8	ldur x8,[x8, #-0x18]
00bd11fc	add x0,x19,x8
00bd1200	ldr w24,[x0, #0x8]
00bd1204	add x8,x29,#0x18
00bd1208	bl 0x00c30070
00bd120c	adrp x1,0xcb4000
00bd1210	add x0,x29,#0x18
00bd1214	ldr x1,[x1, #0xf40]
00bd1218	bl 0x00c30080
00bd121c	mov x21,x0
00bd1220	add x0,x29,#0x18
00bd1224	bl 0x00c30090
00bd1228	ldr x8,[x19]
00bd122c	ldur x8,[x8, #-0x18]
00bd1230	add x2,x19,x8
00bd1234	ldr w3,[x2, #0x90]
00bd1238	ldr x22,[x2, #0x28]
00bd123c	cmn w3,#0x1
00bd1240	b.ne 0x00bd128c
00bd1244	add x8,x29,#0x18
00bd1248	mov x0,x2
00bd124c	mov x25,x2
00bd1250	bl 0x00c30070
00bd1254	adrp x1,0xcb4000
00bd1258	add x0,x29,#0x18
00bd125c	ldr x1,[x1, #0x998]
00bd1260	bl 0x00c30080
00bd1264	ldr x8,[x0]
00bd1268	ldr x8,[x8, #0x38]
00bd126c	mov w1,#0x20
00bd1270	blr x8
00bd1274	mov w23,w0
00bd1278	add x0,x29,#0x18
00bd127c	bl 0x00c30090
00bd1280	and w3,w23,#0xff
00bd1284	mov x2,x25
00bd1288	str w3,[x25, #0x90]
00bd128c	mov w8,#0x4a
00bd1290	and w8,w24,w8
00bd1294	cmp w8,#0x40
00bd1298	b.eq 0x00bd12a4
00bd129c	cmp w8,#0x8
00bd12a0	b.ne 0x00bd12ac
00bd12a4	and x4,x20,#0xffff
00bd12a8	b 0x00bd12b0
00bd12ac	sxth x4,w20
00bd12b0	ldr x8,[x21]
00bd12b4	ldr x8,[x8, #0x20]
00bd12b8	mov x0,x21
00bd12bc	mov x1,x22
00bd12c0	blr x8
00bd12c4	cbnz x0,0x00bd12e4
00bd12c8	ldr x8,[x19]
00bd12cc	mov w9,#0x5
00bd12d0	ldur x8,[x8, #-0x18]
00bd12d4	add x0,x19,x8
00bd12d8	ldr w8,[x0, #0x20]
00bd12dc	orr w1,w8,w9
00bd12e0	bl 0x00c30130
00bd12e4	mov x0,sp
00bd12e8	bl 0x00c43fb0
00bd12ec	mov x0,x19
00bd12f0	ldp x20,x19,[sp, #0x50]
00bd12f4	ldr x25,[sp, #0x20]
00bd12f8	ldp x22,x21,[sp, #0x40]
00bd12fc	ldp x24,x23,[sp, #0x30]
00bd1300	ldp x29,x30,[sp, #0x10]
00bd1304	add sp,sp,#0x60
00bd1308	autiasp
00bd130c	ret
