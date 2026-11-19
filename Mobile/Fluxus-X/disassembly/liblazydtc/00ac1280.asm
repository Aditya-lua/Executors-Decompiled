; PKCS7_set_signed_attributes @ 00ac1280
00ac1280	stp x22,x21,[sp, #-0x30]!
00ac1284	stp x20,x19,[sp, #0x10]
00ac1288	stp x29,x30,[sp, #0x20]
00ac128c	mov x20,x1
00ac1290	adrp x1,0xcb5000
00ac1294	mov x19,x0
00ac1298	ldr x0,[x0, #0x18]
00ac129c	ldr x1,[x1, #0x640]
00ac12a0	add x29,sp,#0x20
00ac12a4	bl 0x00c32600
00ac12a8	mov x0,x20
00ac12ac	bl 0x00c35330
00ac12b0	str x0,[x19, #0x18]
00ac12b4	cbz x0,0x00ac130c
00ac12b8	mov x0,x20
00ac12bc	bl 0x00c325e0
00ac12c0	cmp w0,#0x1
00ac12c4	b.lt 0x00ac1308
00ac12c8	mov w21,wzr
00ac12cc	ldr x22,[x19, #0x18]
00ac12d0	mov x0,x20
00ac12d4	mov w1,w21
00ac12d8	bl 0x00c32610
00ac12dc	bl 0x00c3f7a0
00ac12e0	mov x2,x0
00ac12e4	mov x0,x22
00ac12e8	mov w1,w21
00ac12ec	bl 0x00c38080
00ac12f0	cbz x0,0x00ac130c
00ac12f4	mov x0,x20
00ac12f8	add w21,w21,#0x1
00ac12fc	bl 0x00c325e0
00ac1300	cmp w21,w0
00ac1304	b.lt 0x00ac12cc
00ac1308	mov w0,#0x1
00ac130c	ldp x29,x30,[sp, #0x20]
00ac1310	ldp x20,x19,[sp, #0x10]
00ac1314	ldp x22,x21,[sp], #0x30
00ac1318	ret
