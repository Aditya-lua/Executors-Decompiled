; EVP_KEYEXCH_names_do_all @ 00a63e6c
00a63e6c	mov x8,x0
00a63e70	ldr x0,[x0, #0x18]
00a63e74	cbz x0,0x00a63e88
00a63e78	mov x3,x2
00a63e7c	mov x2,x1
00a63e80	ldr w1,[x8]
00a63e84	b 0x00c3bfa0
00a63e88	mov w0,#0x1
00a63e8c	ret
