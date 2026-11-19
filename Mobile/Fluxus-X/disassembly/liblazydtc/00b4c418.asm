; FUN_00b4c418 @ 00b4c418
00b4c418	stp x20,x19,[sp, #-0x20]!
00b4c41c	stp x29,x30,[sp, #0x10]
00b4c420	add x29,sp,#0x10
00b4c424	mov x20,x1
00b4c428	mov x19,x0
00b4c42c	bl 0x00c41000
00b4c430	mov w8,w0
00b4c434	cmp x20,#0x8
00b4c438	mov x0,xzr
00b4c43c	b.ne 0x00b4c44c
00b4c440	cbz w8,0x00b4c44c
00b4c444	ldr x0,[x19]
00b4c448	str xzr,[x19]
00b4c44c	ldp x29,x30,[sp, #0x10]
00b4c450	ldp x20,x19,[sp], #0x20
00b4c454	ret
