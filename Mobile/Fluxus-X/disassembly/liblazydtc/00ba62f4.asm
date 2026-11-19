; mbedtls_rsa_export @ 00ba62f4
00ba62f4	str x25,[sp, #-0x50]!
00ba62f8	stp x24,x23,[sp, #0x10]
00ba62fc	stp x22,x21,[sp, #0x20]
00ba6300	stp x20,x19,[sp, #0x30]
00ba6304	stp x29,x30,[sp, #0x40]
00ba6308	add x29,sp,#0x40
00ba630c	add x25,x0,#0x10
00ba6310	mov x24,x1
00ba6314	mov x20,x0
00ba6318	mov x0,x25
00ba631c	mov x1,xzr
00ba6320	mov x19,x5
00ba6324	mov x21,x4
00ba6328	mov x22,x3
00ba632c	mov x23,x2
00ba6330	bl 0x00c41b40
00ba6334	cbz w0,0x00ba6378
00ba6338	add x0,x20,#0x40
00ba633c	mov x1,xzr
00ba6340	bl 0x00c41b40
00ba6344	cbz w0,0x00ba6378
00ba6348	add x0,x20,#0x50
00ba634c	mov x1,xzr
00ba6350	bl 0x00c41b40
00ba6354	cbz w0,0x00ba6378
00ba6358	add x0,x20,#0x30
00ba635c	mov x1,xzr
00ba6360	bl 0x00c41b40
00ba6364	cbz w0,0x00ba6378
00ba6368	add x0,x20,#0x20
00ba636c	mov x1,xzr
00ba6370	bl 0x00c41b40
00ba6374	cbnz w0,0x00ba6388
00ba6378	mov w0,#0xffffbf80
00ba637c	cbnz x23,0x00ba63f0
00ba6380	cbnz x22,0x00ba63f0
00ba6384	cbnz x21,0x00ba63f0
00ba6388	cbz x24,0x00ba639c
00ba638c	mov x0,x24
00ba6390	mov x1,x25
00ba6394	bl 0x00c41b60
00ba6398	cbnz w0,0x00ba63f0
00ba639c	cbz x23,0x00ba63b0
00ba63a0	add x1,x20,#0x40
00ba63a4	mov x0,x23
00ba63a8	bl 0x00c41b60
00ba63ac	cbnz w0,0x00ba63f0
00ba63b0	cbz x22,0x00ba63c4
00ba63b4	add x1,x20,#0x50
00ba63b8	mov x0,x22
00ba63bc	bl 0x00c41b60
00ba63c0	cbnz w0,0x00ba63f0
00ba63c4	cbz x21,0x00ba63d8
00ba63c8	add x1,x20,#0x30
00ba63cc	mov x0,x21
00ba63d0	bl 0x00c41b60
00ba63d4	cbnz w0,0x00ba63f0
00ba63d8	cbz x19,0x00ba63ec
00ba63dc	add x1,x20,#0x20
00ba63e0	mov x0,x19
00ba63e4	bl 0x00c41b60
00ba63e8	cbnz w0,0x00ba63f0
00ba63ec	mov w0,wzr
00ba63f0	ldp x29,x30,[sp, #0x40]
00ba63f4	ldp x20,x19,[sp, #0x30]
00ba63f8	ldp x22,x21,[sp, #0x20]
00ba63fc	ldp x24,x23,[sp, #0x10]
00ba6400	ldr x25,[sp], #0x50
00ba6404	ret
