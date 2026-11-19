; WebSocketHandshakeKeyGen::static_for<11,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator() @ 009a10dc
009a10dc	sub sp,sp,#0x40
009a10e0	str x21,[sp, #0x10]
009a10e4	stp x20,x19,[sp, #0x20]
009a10e8	stp x29,x30,[sp, #0x30]
009a10ec	add x29,sp,#0x30
009a10f0	mrs x21,tpidr_el0
009a10f4	ldr x8,[x21, #0x28]
009a10f8	mov x0,sp
009a10fc	mov x20,x2
009a1100	mov x19,x1
009a1104	str x8,[sp, #0x8]
009a1108	bl 0x00c33b30
009a110c	ldr w8,[x20, #0x30]
009a1110	ldr w9,[x20, #0x1c]
009a1114	ldr w10,[x20, #0x4]
009a1118	ldr w11,[x20, #0x3c]
009a111c	eor w8,w9,w8
009a1120	eor w8,w8,w10
009a1124	eor w8,w8,w11
009a1128	ror w9,w8,#0x1f
009a112c	str w9,[x20, #0x3c]
009a1130	ldp w10,w13,[x19]
009a1134	ldp w8,w11,[x19, #0xc]
009a1138	ldr w12,[x19, #0x8]
009a113c	ror w13,w13,#0x1b
009a1140	orr w14,w11,w10
009a1144	and w14,w14,w8
009a1148	and w11,w11,w10
009a114c	ror w10,w10,#0x2
009a1150	str w10,[x19]
009a1154	orr w10,w14,w11
009a1158	add w9,w9,w10
009a115c	mov w8,#0xbcdc
009a1160	add w9,w9,w12
009a1164	movk w8,#0x8f1b, LSL #16
009a1168	add w9,w9,w13
009a116c	add w9,w9,w8
009a1170	str w9,[x19, #0x8]
009a1174	ldr w9,[x20, #0x34]
009a1178	ldr w10,[x20, #0x20]
009a117c	ldr w11,[x20, #0x8]
009a1180	ldr w12,[x20]
009a1184	eor w9,w10,w9
009a1188	eor w9,w9,w11
009a118c	eor w9,w9,w12
009a1190	ror w9,w9,#0x1f
009a1194	str w9,[x20]
009a1198	ldp w10,w11,[x19]
009a119c	ldr w12,[x19, #0x10]
009a11a0	orr w13,w10,w11
009a11a4	and w12,w13,w12
009a11a8	ldp w14,w13,[x19, #0x8]
009a11ac	and w10,w10,w11
009a11b0	orr w10,w12,w10
009a11b4	add w9,w9,w10
009a11b8	ror w14,w14,#0x1b
009a11bc	add w9,w9,w13
009a11c0	add w9,w9,w14
009a11c4	ror w11,w11,#0x2
009a11c8	add w9,w9,w8
009a11cc	str w11,[x19, #0x4]
009a11d0	str w9,[x19, #0xc]
009a11d4	ldr w9,[x20, #0x38]
009a11d8	ldr w10,[x20, #0x24]
009a11dc	ldr w11,[x20, #0xc]
009a11e0	ldr w12,[x20, #0x4]
009a11e4	eor w9,w10,w9
009a11e8	eor w9,w9,w11
009a11ec	eor w9,w9,w12
009a11f0	ror w9,w9,#0x1f
009a11f4	str w9,[x20, #0x4]
009a11f8	ldp w10,w11,[x19, #0x4]
009a11fc	ldr w12,[x19]
009a1200	orr w14,w10,w11
009a1204	and w12,w14,w12
009a1208	ldp w13,w14,[x19, #0xc]
009a120c	and w10,w10,w11
009a1210	orr w10,w12,w10
009a1214	add w9,w9,w10
009a1218	ror w13,w13,#0x1b
009a121c	add w9,w9,w14
009a1220	add w9,w9,w13
009a1224	ror w11,w11,#0x2
009a1228	add w9,w9,w8
009a122c	str w11,[x19, #0x8]
009a1230	str w9,[x19, #0x10]
009a1234	ldr w9,[x20, #0x3c]
009a1238	ldr w10,[x20, #0x28]
009a123c	ldr w11,[x20, #0x10]
009a1240	ldr w12,[x20, #0x8]
009a1244	eor w9,w10,w9
009a1248	eor w9,w9,w11
009a124c	eor w9,w9,w12
009a1250	ror w9,w9,#0x1f
009a1254	str w9,[x20, #0x8]
009a1258	ldp w10,w11,[x19, #0x8]
009a125c	ldp w13,w12,[x19]
009a1260	ldr w14,[x19, #0x10]
009a1264	orr w15,w10,w11
009a1268	and w12,w15,w12
009a126c	and w10,w10,w11
009a1270	orr w10,w12,w10
009a1274	add w9,w9,w10
009a1278	ror w14,w14,#0x1b
009a127c	add w9,w9,w13
009a1280	add w9,w9,w14
009a1284	ror w11,w11,#0x2
009a1288	add w8,w9,w8
009a128c	str w11,[x19, #0xc]
009a1290	str w8,[x19]
009a1294	ldr x8,[x21, #0x28]
009a1298	ldr x9,[sp, #0x8]
009a129c	cmp x8,x9
009a12a0	b.ne 0x009a12b8
009a12a4	ldp x29,x30,[sp, #0x30]
009a12a8	ldp x20,x19,[sp, #0x20]
009a12ac	ldr x21,[sp, #0x10]
009a12b0	add sp,sp,#0x40
009a12b4	ret
009a12b8	bl 0x00c2fec0
