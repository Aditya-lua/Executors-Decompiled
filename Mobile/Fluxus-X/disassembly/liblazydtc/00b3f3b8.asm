; FUN_00b3f3b8 @ 00b3f3b8
00b3f3b8	sub sp,sp,#0x50
00b3f3bc	mov w9,#0xffffffff
00b3f3c0	stp x23,xzr,[sp, #0x10]
00b3f3c4	stp x22,x21,[sp, #0x20]
00b3f3c8	stp x20,x19,[sp, #0x30]
00b3f3cc	stp x29,x30,[sp, #0x40]
00b3f3d0	str w9,[sp, #0xc]
00b3f3d4	ldr w9,[x6, #0xc]
00b3f3d8	add x29,sp,#0x40
00b3f3dc	cbz w9,0x00b3f424
00b3f3e0	mov x19,x6
00b3f3e4	mov x20,x5
00b3f3e8	mov x8,x4
00b3f3ec	mov w22,w2
00b3f3f0	mov x23,x1
00b3f3f4	mov x21,x0
00b3f3f8	cbz x4,0x00b3f42c
00b3f3fc	ldr w2,[x19, #0x8]
00b3f400	add x3,sp,#0x18
00b3f404	add x4,sp,#0xc
00b3f408	mov x0,x23
00b3f40c	mov w1,w22
00b3f410	blr x8
00b3f414	cbz w0,0x00b3f424
00b3f418	ldr x2,[sp, #0x18]
00b3f41c	ldr w3,[sp, #0xc]
00b3f420	b 0x00b3f434
00b3f424	mov w20,wzr
00b3f428	b 0x00b3f470
00b3f42c	mov x2,xzr
00b3f430	mov w3,#0xffffffff
00b3f434	mov x0,x23
00b3f438	mov w1,w22
00b3f43c	mov x4,x20
00b3f440	mov x5,x19
00b3f444	bl 0x00b3f48c
00b3f448	mov x19,x0
00b3f44c	cbz x0,0x00b3f464
00b3f450	mov x0,x21
00b3f454	mov x1,x19
00b3f458	bl 0x00c3f300
00b3f45c	mov w20,w0
00b3f460	b 0x00b3f468
00b3f464	mov w20,wzr
00b3f468	mov x0,x19
00b3f46c	bl 0x00c382f0
00b3f470	mov w0,w20
00b3f474	ldp x29,x30,[sp, #0x40]
00b3f478	ldp x20,x19,[sp, #0x30]
00b3f47c	ldp x22,x21,[sp, #0x20]
00b3f480	ldr x23,[sp, #0x10]
00b3f484	add sp,sp,#0x50
00b3f488	ret
