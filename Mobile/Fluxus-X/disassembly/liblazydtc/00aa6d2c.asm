; ossl_md5_sha1_update @ 00aa6d2c
00aa6d2c	str x21,[sp, #-0x30]!
00aa6d30	stp x20,x19,[sp, #0x10]
00aa6d34	stp x29,x30,[sp, #0x20]
00aa6d38	add x29,sp,#0x20
00aa6d3c	mov x19,x2
00aa6d40	mov x20,x1
00aa6d44	mov x21,x0
00aa6d48	bl 0x00c32020
00aa6d4c	cbz w0,0x00aa6d6c
00aa6d50	mov x1,x20
00aa6d54	mov x2,x19
00aa6d58	ldp x29,x30,[sp, #0x20]
00aa6d5c	ldp x20,x19,[sp, #0x10]
00aa6d60	add x0,x21,#0x5c
00aa6d64	ldr x21,[sp], #0x30
00aa6d68	b 0x00c3d590
00aa6d6c	ldp x29,x30,[sp, #0x20]
00aa6d70	ldp x20,x19,[sp, #0x10]
00aa6d74	ldr x21,[sp], #0x30
00aa6d78	ret
