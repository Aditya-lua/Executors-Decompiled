; EVP_CIPHER_names_do_all @ 00a5f5bc
00a5f5bc	mov x8,x0
00a5f5c0	ldr x0,[x0, #0x78]
00a5f5c4	cbz x0,0x00a5f5d8
00a5f5c8	mov x3,x2
00a5f5cc	mov x2,x1
00a5f5d0	ldr w1,[x8, #0x60]
00a5f5d4	b 0x00c3bfa0
00a5f5d8	mov w0,#0x1
00a5f5dc	ret
