; X509v3_get_ext @ 00b0d404
00b0d404	stp x20,x19,[sp, #-0x20]!
00b0d408	stp x29,x30,[sp, #0x10]
00b0d40c	add x29,sp,#0x10
00b0d410	cbz x0,0x00b0d444
00b0d414	mov w19,w1
00b0d418	mov x20,x0
00b0d41c	bl 0x00c325e0
00b0d420	tbnz w19,#0x1f,0x00b0d440
00b0d424	cmp w0,w19
00b0d428	mov x0,xzr
00b0d42c	b.le 0x00b0d444
00b0d430	mov x0,x20
00b0d434	mov w1,w19
00b0d438	bl 0x00c32610
00b0d43c	b 0x00b0d444
00b0d440	mov x0,xzr
00b0d444	ldp x29,x30,[sp, #0x10]
00b0d448	ldp x20,x19,[sp], #0x20
00b0d44c	ret
