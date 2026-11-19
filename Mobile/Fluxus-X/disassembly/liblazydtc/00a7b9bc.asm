; EVP_SIGNATURE_names_do_all @ 00a7b9bc
00a7b9bc	mov x8,x0
00a7b9c0	ldr x0,[x0, #0x18]
00a7b9c4	cbz x0,0x00a7b9d8
00a7b9c8	mov x3,x2
00a7b9cc	mov x2,x1
00a7b9d0	ldr w1,[x8]
00a7b9d4	b 0x00c3bfa0
00a7b9d8	mov w0,#0x1
00a7b9dc	ret
