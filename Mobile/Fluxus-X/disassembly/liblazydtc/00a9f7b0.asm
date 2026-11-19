; OSSL_PARAM_get_octet_ptr @ 00a9f7b0
00a9f7b0	mov w8,wzr
00a9f7b4	cbz x0,0x00a9f7e8
00a9f7b8	cbz x1,0x00a9f7e8
00a9f7bc	ldr w8,[x0, #0x8]
00a9f7c0	cmp w8,#0x7
00a9f7c4	mov w8,wzr
00a9f7c8	b.ne 0x00a9f7e8
00a9f7cc	cbz x2,0x00a9f7d8
00a9f7d0	ldr x8,[x0, #0x18]
00a9f7d4	str x8,[x2]
00a9f7d8	ldr x8,[x0, #0x10]
00a9f7dc	ldr x8,[x8]
00a9f7e0	str x8,[x1]
00a9f7e4	mov w8,#0x1
00a9f7e8	mov w0,w8
00a9f7ec	ret
