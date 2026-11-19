; OSSL_PARAM_BLD_push_BN @ 00a9d410
00a9d410	str x21,[sp, #-0x30]!
00a9d414	stp x20,x19,[sp, #0x10]
00a9d418	mov x19,x2
00a9d41c	mov x20,x1
00a9d420	mov x21,x0
00a9d424	stp x29,x30,[sp, #0x20]
00a9d428	add x29,sp,#0x20
00a9d42c	cbz x2,0x00a9d450
00a9d430	mov x0,x19
00a9d434	bl 0x00c322f0
00a9d438	add w8,w0,#0x7
00a9d43c	add w9,w0,#0xe
00a9d440	cmp w8,#0x0
00a9d444	csel w8,w9,w8,lt
00a9d448	sbfx x3,x8,#0x3,#0x1d
00a9d44c	b 0x00a9d454
00a9d450	mov x3,xzr
00a9d454	mov x1,x20
00a9d458	mov x2,x19
00a9d45c	ldp x29,x30,[sp, #0x20]
00a9d460	ldp x20,x19,[sp, #0x10]
00a9d464	mov x0,x21
00a9d468	ldr x21,[sp], #0x30
00a9d46c	b 0x00a9d470
