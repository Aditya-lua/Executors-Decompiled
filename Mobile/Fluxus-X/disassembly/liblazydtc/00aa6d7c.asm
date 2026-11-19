; ossl_md5_sha1_final @ 00aa6d7c
00aa6d7c	stp x20,x19,[sp, #-0x20]!
00aa6d80	stp x29,x30,[sp, #0x10]
00aa6d84	add x29,sp,#0x10
00aa6d88	mov x19,x1
00aa6d8c	mov x20,x0
00aa6d90	bl 0x00c32000
00aa6d94	cbz w0,0x00aa6dac
00aa6d98	ldp x29,x30,[sp, #0x10]
00aa6d9c	add x0,x20,#0x10
00aa6da0	add x1,x19,#0x5c
00aa6da4	ldp x20,x19,[sp], #0x20
00aa6da8	b 0x00c3d570
00aa6dac	ldp x29,x30,[sp, #0x10]
00aa6db0	ldp x20,x19,[sp], #0x20
00aa6db4	ret
