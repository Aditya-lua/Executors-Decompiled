; FUN_00bf11d8 @ 00bf11d8
00bf11d8	paciasp
00bf11dc	stp x29,x30,[sp, #-0x50]!
00bf11e0	str x25,[sp, #0x10]
00bf11e4	stp x24,x23,[sp, #0x20]
00bf11e8	stp x22,x21,[sp, #0x30]
00bf11ec	stp x20,x19,[sp, #0x40]
00bf11f0	mov x29,sp
00bf11f4	ldp x22,x25,[x0]
00bf11f8	adrp x9,0xcb5000
00bf11fc	ldr x8,[x2]
00bf1200	ldr x9,[x9, #0xc18]
00bf1204	mov w11,#0x4
00bf1208	mov x12,#0x7fffffffffffffff
00bf120c	ldr x24,[x1]
00bf1210	mov x19,x2
00bf1214	subs x8,x8,x22
00bf1218	mov x21,x1
00bf121c	mov x20,x0
00bf1220	lsl x10,x8,#0x1
00bf1224	csel x10,x11,x10,eq
00bf1228	cmp x8,x12
00bf122c	csinv x23,x10,xzr,cc
00bf1230	cmp x25,x9
00bf1234	b.eq 0x00bf1250
00bf1238	mov x0,x22
00bf123c	mov x1,x23
00bf1240	bl 0x00c30950
00bf1244	cbz x0,0x00bf12b4
00bf1248	str x0,[x20]
00bf124c	b 0x00bf1270
00bf1250	mov x0,x23
00bf1254	bl 0x00c308d0
00bf1258	cbz x0,0x00bf12b4
00bf125c	str x0,[x20]
00bf1260	cbz x22,0x00bf1270
00bf1264	mov x0,x22
00bf1268	blr x25
00bf126c	ldr x0,[x20]
00bf1270	sub x8,x24,x22
00bf1274	and x10,x23,#-0x4
00bf1278	add x8,x0,x8
00bf127c	str x8,[x21]
00bf1280	adrp x8,0xcb4000
00bf1284	ldr x8,[x8, #0xbf8]
00bf1288	ldr x9,[x20]
00bf128c	str x8,[x20, #0x8]
00bf1290	add x8,x9,x10
00bf1294	str x8,[x19]
00bf1298	ldp x20,x19,[sp, #0x40]
00bf129c	ldr x25,[sp, #0x10]
00bf12a0	ldp x22,x21,[sp, #0x30]
00bf12a4	ldp x24,x23,[sp, #0x20]
00bf12a8	ldp x29,x30,[sp], #0x50
00bf12ac	autiasp
00bf12b0	ret
00bf12b4	bl 0x00c43cc0
00bf12b8	bl 0x007fe114
