; mbedtls_rsa_export_crt @ 00ba6220
00ba6220	stp x22,x21,[sp, #-0x30]!
00ba6224	stp x20,x19,[sp, #0x10]
00ba6228	stp x29,x30,[sp, #0x20]
00ba622c	add x29,sp,#0x20
00ba6230	mov x22,x1
00ba6234	mov x20,x0
00ba6238	add x0,x0,#0x10
00ba623c	mov x1,xzr
00ba6240	mov x19,x3
00ba6244	mov x21,x2
00ba6248	bl 0x00c41b40
00ba624c	cbz w0,0x00ba62d8
00ba6250	add x0,x20,#0x40
00ba6254	mov x1,xzr
00ba6258	bl 0x00c41b40
00ba625c	cbz w0,0x00ba62d8
00ba6260	add x0,x20,#0x50
00ba6264	mov x1,xzr
00ba6268	bl 0x00c41b40
00ba626c	cbz w0,0x00ba62d8
00ba6270	add x0,x20,#0x30
00ba6274	mov x1,xzr
00ba6278	bl 0x00c41b40
00ba627c	cbz w0,0x00ba62d8
00ba6280	add x0,x20,#0x20
00ba6284	mov x1,xzr
00ba6288	bl 0x00c41b40
00ba628c	cbz w0,0x00ba62d8
00ba6290	cbz x22,0x00ba62a4
00ba6294	add x1,x20,#0x60
00ba6298	mov x0,x22
00ba629c	bl 0x00c41b60
00ba62a0	cbnz w0,0x00ba62cc
00ba62a4	cbz x21,0x00ba62b8
00ba62a8	add x1,x20,#0x70
00ba62ac	mov x0,x21
00ba62b0	bl 0x00c41b60
00ba62b4	cbnz w0,0x00ba62cc
00ba62b8	cbz x19,0x00ba62ec
00ba62bc	add x1,x20,#0x80
00ba62c0	mov x0,x19
00ba62c4	bl 0x00c41b60
00ba62c8	cbz w0,0x00ba62dc
00ba62cc	mov w8,#0xffffbf80
00ba62d0	add w0,w0,w8
00ba62d4	b 0x00ba62dc
00ba62d8	mov w0,#0xffffbf80
00ba62dc	ldp x29,x30,[sp, #0x20]
00ba62e0	ldp x20,x19,[sp, #0x10]
00ba62e4	ldp x22,x21,[sp], #0x30
00ba62e8	ret
00ba62ec	mov w0,wzr
00ba62f0	b 0x00ba62dc
