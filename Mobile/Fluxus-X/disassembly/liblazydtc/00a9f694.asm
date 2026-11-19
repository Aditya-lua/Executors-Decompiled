; OSSL_PARAM_set_octet_string @ 00a9f694
00a9f694	cbz x0,0x00a9f6ec
00a9f698	mov x9,x0
00a9f69c	str xzr,[x0, #0x20]
00a9f6a0	cbz x1,0x00a9f6f4
00a9f6a4	ldr x0,[x9, #0x10]
00a9f6a8	str x2,[x9, #0x20]
00a9f6ac	cbz x0,0x00a9f6fc
00a9f6b0	ldr w8,[x9, #0x8]
00a9f6b4	cmp w8,#0x5
00a9f6b8	mov w8,wzr
00a9f6bc	b.ne 0x00a9f6e4
00a9f6c0	ldr x8,[x9, #0x18]
00a9f6c4	cmp x8,x2
00a9f6c8	mov w8,wzr
00a9f6cc	b.cc 0x00a9f6e4
00a9f6d0	stp x29,x30,[sp, #-0x10]!
00a9f6d4	mov x29,sp
00a9f6d8	bl 0x00c2ffd0
00a9f6dc	mov w8,#0x1
00a9f6e0	ldp x29,x30,[sp], #0x10
00a9f6e4	mov w0,w8
00a9f6e8	ret
00a9f6ec	mov w0,wzr
00a9f6f0	ret
00a9f6f4	mov w0,wzr
00a9f6f8	ret
00a9f6fc	mov w8,#0x1
00a9f700	mov w0,w8
00a9f704	ret
