; FUN_00ba1078 @ 00ba1078
00ba1078	sub sp,sp,#0xd0
00ba107c	stp x28,x27,[sp, #0x70]
00ba1080	stp x26,x25,[sp, #0x80]
00ba1084	stp x24,x23,[sp, #0x90]
00ba1088	stp x22,x21,[sp, #0xa0]
00ba108c	stp x20,x19,[sp, #0xb0]
00ba1090	stp x29,x30,[sp, #0xc0]
00ba1094	add x29,sp,#0xc0
00ba1098	mrs x20,tpidr_el0
00ba109c	ldr x8,[x20, #0x28]
00ba10a0	ldr x19,[x29, #0x10]
00ba10a4	mov x24,x6
00ba10a8	mov x25,x5
00ba10ac	stur x8,[x29, #-0x58]
00ba10b0	ldr x8,[x7]
00ba10b4	mov x23,x4
00ba10b8	mov x26,x3
00ba10bc	mov x21,x1
00ba10c0	cmp x8,x19
00ba10c4	mov w27,w0
00ba10c8	b.ls 0x00ba10d4
00ba10cc	mov w22,#0xffffb100
00ba10d0	b 0x00ba125c
00ba10d4	ldp x28,x22,[x29, #0x18]
00ba10d8	add x0,sp,#0x38
00ba10dc	str w2,[sp, #0xc]
00ba10e0	str x7,[sp]
00ba10e4	bl 0x00c42760
00ba10e8	add x0,sp,#0x28
00ba10ec	bl 0x00c41c00
00ba10f0	add x0,sp,#0x18
00ba10f4	bl 0x00c41c00
00ba10f8	add x2,sp,#0x28
00ba10fc	add x3,sp,#0x38
00ba1100	mov x0,x21
00ba1104	mov x1,x26
00ba1108	mov x4,x28
00ba110c	mov x5,x22
00ba1110	bl 0x00c42670
00ba1114	mov w22,w0
00ba1118	cbnz w0,0x00ba1244
00ba111c	ldr w2,[sp, #0xc]
00ba1120	add x4,sp,#0x38
00ba1124	add x7,sp,#0x18
00ba1128	mov w0,w27
00ba112c	mov x1,x21
00ba1130	mov x3,x26
00ba1134	mov x5,x25
00ba1138	mov x6,x24
00ba113c	bl 0x00ba2054
00ba1140	mov w22,w0
00ba1144	cbnz w0,0x00ba1244
00ba1148	add x0,sp,#0x18
00ba114c	add x1,sp,#0x18
00ba1150	mov x2,x23
00ba1154	bl 0x00c41c80
00ba1158	mov w22,w0
00ba115c	cbnz w0,0x00ba1244
00ba1160	add x0,sp,#0x18
00ba1164	add x1,sp,#0x28
00ba1168	add x2,sp,#0x18
00ba116c	bl 0x00c41d60
00ba1170	mov w22,w0
00ba1174	cbnz w0,0x00ba1244
00ba1178	add x2,x21,#0x68
00ba117c	add x0,sp,#0x18
00ba1180	add x1,sp,#0x18
00ba1184	bl 0x00c41c60
00ba1188	mov w22,w0
00ba118c	cbnz w0,0x00ba1244
00ba1190	ldr x8,[sp]
00ba1194	ldr w2,[sp, #0xc]
00ba1198	add x1,sp,#0x38
00ba119c	add x3,sp,#0x10
00ba11a0	ldr x4,[x8]
00ba11a4	mov x0,x21
00ba11a8	sub x5,x19,x4
00ba11ac	bl 0x00c427e0
00ba11b0	mov w22,w0
00ba11b4	cbnz w0,0x00ba1244
00ba11b8	ldr x21,[sp]
00ba11bc	ldr x8,[sp, #0x10]
00ba11c0	add x0,sp,#0x18
00ba11c4	ldr x9,[x21]
00ba11c8	add x8,x9,x8
00ba11cc	str x8,[x21]
00ba11d0	bl 0x00c41d30
00ba11d4	str x0,[sp, #0x10]
00ba11d8	ldr x8,[x21]
00ba11dc	cmp x8,x19
00ba11e0	b.ls 0x00ba11ec
00ba11e4	mov w22,#0xffffb100
00ba11e8	b 0x00ba1244
00ba11ec	cmp x0,#0xff
00ba11f0	mov w22,#0xffffb100
00ba11f4	b.hi 0x00ba1244
00ba11f8	sub x9,x19,x8
00ba11fc	add x10,x0,#0x1
00ba1200	cmp x9,x10
00ba1204	b.cc 0x00ba1244
00ba1208	ldr x10,[sp]
00ba120c	add x9,x8,#0x1
00ba1210	str x9,[x10]
00ba1214	strb w0,[x8]
00ba1218	ldr x1,[x10]
00ba121c	ldr x2,[sp, #0x10]
00ba1220	add x0,sp,#0x18
00ba1224	bl 0x00c41d80
00ba1228	mov w22,w0
00ba122c	cbnz w0,0x00ba1244
00ba1230	ldr x10,[sp]
00ba1234	ldr x8,[sp, #0x10]
00ba1238	ldr x9,[x10]
00ba123c	add x8,x9,x8
00ba1240	str x8,[x10]
00ba1244	add x0,sp,#0x38
00ba1248	bl 0x00c42750
00ba124c	add x0,sp,#0x28
00ba1250	bl 0x00c41bb0
00ba1254	add x0,sp,#0x18
00ba1258	bl 0x00c41bb0
00ba125c	ldr x8,[x20, #0x28]
00ba1260	ldur x9,[x29, #-0x58]
00ba1264	cmp x8,x9
00ba1268	b.ne 0x00ba1290
00ba126c	mov w0,w22
00ba1270	ldp x29,x30,[sp, #0xc0]
00ba1274	ldp x20,x19,[sp, #0xb0]
00ba1278	ldp x22,x21,[sp, #0xa0]
00ba127c	ldp x24,x23,[sp, #0x90]
00ba1280	ldp x26,x25,[sp, #0x80]
00ba1284	ldp x28,x27,[sp, #0x70]
00ba1288	add sp,sp,#0xd0
00ba128c	ret
00ba1290	bl 0x00c2fec0
