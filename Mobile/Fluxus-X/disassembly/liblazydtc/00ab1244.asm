; OCSP_crlID_new @ 00ab1244
00ab1244	stp x22,x21,[sp, #-0x30]!
00ab1248	stp x20,x19,[sp, #0x10]
00ab124c	stp x29,x30,[sp, #0x20]
00ab1250	add x29,sp,#0x20
00ab1254	mov x20,x2
00ab1258	mov x21,x1
00ab125c	mov x22,x0
00ab1260	bl 0x00c3ee60
00ab1264	mov x19,x0
00ab1268	cbz x0,0x00ab12dc
00ab126c	cbz x22,0x00ab128c
00ab1270	bl 0x00c38150
00ab1274	str x0,[x19]
00ab1278	cbz x0,0x00ab12dc
00ab127c	mov w2,#0xffffffff
00ab1280	mov x1,x22
00ab1284	bl 0x00c378a0
00ab1288	cbz w0,0x00ab12dc
00ab128c	cbz x21,0x00ab12a8
00ab1290	bl 0x00c37f30
00ab1294	str x0,[x19, #0x8]
00ab1298	cbz x0,0x00ab12dc
00ab129c	ldr x1,[x21]
00ab12a0	bl 0x00c375b0
00ab12a4	cbz w0,0x00ab12dc
00ab12a8	cbz x20,0x00ab12c4
00ab12ac	bl 0x00c38130
00ab12b0	str x0,[x19, #0x10]
00ab12b4	cbz x0,0x00ab12dc
00ab12b8	mov x1,x20
00ab12bc	bl 0x00c374e0
00ab12c0	cbz w0,0x00ab12dc
00ab12c4	mov w0,#0x16f
00ab12c8	mov w1,wzr
00ab12cc	mov x2,x19
00ab12d0	bl 0x00c3ef90
00ab12d4	mov x20,x0
00ab12d8	b 0x00ab12e0
00ab12dc	mov x20,xzr
00ab12e0	mov x0,x19
00ab12e4	bl 0x00c3ee50
00ab12e8	mov x0,x20
00ab12ec	ldp x29,x30,[sp, #0x20]
00ab12f0	ldp x20,x19,[sp, #0x10]
00ab12f4	ldp x22,x21,[sp], #0x30
00ab12f8	ret
