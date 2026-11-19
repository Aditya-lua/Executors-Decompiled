; FUN_00b2d914 @ 00b2d914
00b2d914	stp x22,x21,[sp, #-0x30]!
00b2d918	stp x20,x19,[sp, #0x10]
00b2d91c	stp x29,x30,[sp, #0x20]
00b2d920	add x29,sp,#0x20
00b2d924	mov x22,x3
00b2d928	mov x19,x2
00b2d92c	mov x21,x1
00b2d930	mov x20,x0
00b2d934	bl 0x00c41000
00b2d938	mov w8,w0
00b2d93c	cmp x22,#0x20
00b2d940	mov w0,wzr
00b2d944	b.cc 0x00b2d968
00b2d948	cbz w8,0x00b2d968
00b2d94c	mov x0,x21
00b2d950	mov x1,x20
00b2d954	bl 0x00c3e5f0
00b2d958	cbz w0,0x00b2d968
00b2d95c	mov w8,#0x20
00b2d960	mov w0,#0x1
00b2d964	str x8,[x19]
00b2d968	ldp x29,x30,[sp, #0x20]
00b2d96c	ldp x20,x19,[sp, #0x10]
00b2d970	ldp x22,x21,[sp], #0x30
00b2d974	ret
