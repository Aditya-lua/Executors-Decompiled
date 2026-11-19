; EVP_CIPHER_up_ref @ 00a5cc54
00a5cc54	ldr w8,[x0, #0x18]
00a5cc58	cbnz w8,0x00a5cc70
00a5cc5c	add x8,x0,#0x80
00a5cc60	ldxr w9,[x8]
00a5cc64	add w9,w9,#0x1
00a5cc68	stxr w10,w9,[x8]
00a5cc6c	cbnz w10,0x00a5cc60
00a5cc70	mov w0,#0x1
00a5cc74	ret
