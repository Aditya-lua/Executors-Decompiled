; BN_BLINDING_invert_ex @ 00ad1140
00ad1140	stp x20,x19,[sp, #-0x20]!
00ad1144	mov x4,x3
00ad1148	mov x8,x1
00ad114c	mov x19,x0
00ad1150	stp x29,x30,[sp, #0x10]
00ad1154	add x29,sp,#0x10
00ad1158	cbnz x1,0x00ad1164
00ad115c	ldr x8,[x2, #0x8]
00ad1160	cbz x8,0x00ad127c
00ad1164	ldr x3,[x2, #0x38]
00ad1168	cbz x3,0x00ad1260
00ad116c	ldr w10,[x19, #0xc]
00ad1170	ldrsw x9,[x8, #0x8]
00ad1174	cmp w10,w9
00ad1178	b.lt 0x00ad123c
00ad117c	ldrsw x10,[x19, #0x8]
00ad1180	cbz w9,0x00ad1224
00ad1184	ldr x11,[x19]
00ad1188	cmp x9,#0x1
00ad118c	csinc x13,x9,xzr,hi
00ad1190	cmp x13,#0x4
00ad1194	mov x12,xzr
00ad1198	b.cc 0x00ad1200
00ad119c	adrp x15,0x29c000
00ad11a0	ldr q1,[x15, #0x550]
00ad11a4	mov w15,#0x2
00ad11a8	and x12,x13,#-0x4
00ad11ac	dup v2.2D,x15
00ad11b0	mov w15,#0x4
00ad11b4	dup v0.2D,x10
00ad11b8	add x14,x11,#0x10
00ad11bc	dup v3.2D,x15
00ad11c0	mov x15,x12
00ad11c4	ldp q6,q7,[x14, #-0x10]
00ad11c8	add v4.2D,v1.2D,v2.2D
00ad11cc	sub v5.2D,v1.2D,v0.2D
00ad11d0	sub v4.2D,v4.2D,v0.2D
00ad11d4	sshr v5.2D,v5.2D,#0x3f
00ad11d8	sshr v4.2D,v4.2D,#0x3f
00ad11dc	and v5.16B,v6.16B,v5.16B
00ad11e0	and v4.16B,v7.16B,v4.16B
00ad11e4	add v1.2D,v1.2D,v3.2D
00ad11e8	subs x15,x15,#0x4
00ad11ec	stp q5,q4,[x14, #-0x10]
00ad11f0	add x14,x14,#0x20
00ad11f4	b.ne 0x00ad11c4
00ad11f8	cmp x13,x12
00ad11fc	b.eq 0x00ad1224
00ad1200	neg x13,x10
00ad1204	lsl x14,x12,#0x3
00ad1208	ldr x15,[x11, x14#0x0]
00ad120c	add x16,x13,x12
00ad1210	add x12,x12,#0x1
00ad1214	cmp x12,x9
00ad1218	and x15,x15,x16, ASR #0x3f
00ad121c	str x15,[x11, x14#0x0]
00ad1220	b.cc 0x00ad1204
00ad1224	sub x11,x9,x10
00ad1228	asr x11,x11,#0x3f
00ad122c	bic w9,w9,w11
00ad1230	and w10,w10,w11
00ad1234	orr w9,w9,w10
00ad1238	str w9,[x19, #0x8]
00ad123c	mov x0,x19
00ad1240	mov x1,x19
00ad1244	mov x2,x8
00ad1248	bl 0x00c39000
00ad124c	mov w20,w0
00ad1250	mov x0,x19
00ad1254	bl 0x00c38e50
00ad1258	mov w0,w20
00ad125c	b 0x00ad12ac
00ad1260	ldr x3,[x2, #0x18]
00ad1264	ldp x29,x30,[sp, #0x10]
00ad1268	mov x0,x19
00ad126c	mov x1,x19
00ad1270	mov x2,x8
00ad1274	ldp x20,x19,[sp], #0x20
00ad1278	b 0x00c38ef0
00ad127c	bl 0x00c342a0
00ad1280	adrp x0,0x2be000
00ad1284	adrp x2,0x2b2000
00ad1288	add x0,x0,#0x30a
00ad128c	add x2,x2,#0xac8
00ad1290	mov w1,#0xaf
00ad1294	bl 0x00c342b0
00ad1298	orr w0,wzr,#0x3
00ad129c	mov w1,#0x6b
00ad12a0	mov x2,xzr
00ad12a4	bl 0x00c342c0
00ad12a8	mov w0,wzr
00ad12ac	ldp x29,x30,[sp, #0x10]
00ad12b0	ldp x20,x19,[sp], #0x20
00ad12b4	ret
