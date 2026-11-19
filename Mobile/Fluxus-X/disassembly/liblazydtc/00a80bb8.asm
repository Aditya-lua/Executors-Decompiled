; ossl_lib_ctx_read_lock @ 00a80bb8
00a80bb8	cbz x0,0x00a80bc4
00a80bbc	ldr x0,[x0]
00a80bc0	b 0x00c35680
00a80bc4	stp x29,x30,[sp, #-0x10]!
00a80bc8	adrp x0,0xd21000
00a80bcc	adrp x1,0xa81000
00a80bd0	add x0,x0,#0xd5c
00a80bd4	add x1,x1,#0x348
00a80bd8	mov x29,sp
00a80bdc	bl 0x00c34d60
00a80be0	cbz w0,0x00a80c04
00a80be4	adrp x8,0xd21000
00a80be8	ldr w8,[x8, #0xd60]
00a80bec	mov x0,xzr
00a80bf0	cbz w8,0x00a80c08
00a80bf4	adrp x0,0xd21000
00a80bf8	add x0,x0,#0xd58
00a80bfc	bl 0x00c38360
00a80c00	b 0x00a80c08
00a80c04	mov x0,xzr
00a80c08	adrp x8,0xd21000
00a80c0c	add x8,x8,#0xb90
00a80c10	cmp x0,#0x0
00a80c14	csel x0,x8,x0,eq
00a80c18	ldp x29,x30,[sp], #0x10
00a80c1c	ldr x0,[x0]
00a80c20	b 0x00c35680
