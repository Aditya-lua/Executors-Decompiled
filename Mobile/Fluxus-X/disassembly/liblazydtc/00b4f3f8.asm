; FUN_00b4f3f8 @ 00b4f3f8
00b4f3f8	stp x20,x19,[sp, #-0x20]!
00b4f3fc	stp x29,x30,[sp, #0x10]
00b4f400	add x29,sp,#0x10
00b4f404	mov x20,x1
00b4f408	mov x19,x0
00b4f40c	bl 0x00c41000
00b4f410	mov w8,w0
00b4f414	cmp x20,#0x8
00b4f418	mov x0,xzr
00b4f41c	b.ne 0x00b4f44c
00b4f420	cbz w8,0x00b4f44c
00b4f424	ldr x20,[x19]
00b4f428	mov x0,x20
00b4f42c	bl 0x00c36880
00b4f430	cbz x0,0x00b4f44c
00b4f434	bl 0x00c36870
00b4f438	cmp w0,#0x494
00b4f43c	mov x0,xzr
00b4f440	b.ne 0x00b4f44c
00b4f444	mov x0,x20
00b4f448	str xzr,[x19]
00b4f44c	ldp x29,x30,[sp, #0x10]
00b4f450	ldp x20,x19,[sp], #0x20
00b4f454	ret
