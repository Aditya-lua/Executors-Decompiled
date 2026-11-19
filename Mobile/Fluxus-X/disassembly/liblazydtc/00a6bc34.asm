; EVP_PKEY_set1_EC_KEY @ 00a6bc34
00a6bc34	stp x20,x19,[sp, #-0x20]!
00a6bc38	mov x20,x0
00a6bc3c	mov x0,x1
00a6bc40	stp x29,x30,[sp, #0x10]
00a6bc44	add x29,sp,#0x10
00a6bc48	mov x19,x1
00a6bc4c	bl 0x00c3afa0
00a6bc50	cbz w0,0x00a6bc7c
00a6bc54	mov w1,#0x198
00a6bc58	mov x0,x20
00a6bc5c	mov x2,x19
00a6bc60	bl 0x00c39b70
00a6bc64	cbz w0,0x00a6bc70
00a6bc68	mov w0,#0x1
00a6bc6c	b 0x00a6bc7c
00a6bc70	mov x0,x19
00a6bc74	bl 0x00c3a7c0
00a6bc78	mov w0,wzr
00a6bc7c	ldp x29,x30,[sp, #0x10]
00a6bc80	ldp x20,x19,[sp], #0x20
00a6bc84	ret
