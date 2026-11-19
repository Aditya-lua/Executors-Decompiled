; X509_add1_reject_object @ 00b1f3ac
00b1f3ac	str x21,[sp, #-0x30]!
00b1f3b0	stp x20,x19,[sp, #0x10]
00b1f3b4	mov x20,x0
00b1f3b8	mov x0,x1
00b1f3bc	stp x29,x30,[sp, #0x20]
00b1f3c0	add x29,sp,#0x20
00b1f3c4	bl 0x00c37730
00b1f3c8	cbz x0,0x00b1f42c
00b1f3cc	mov x19,x0
00b1f3d0	cbz x20,0x00b1f420
00b1f3d4	ldr x21,[x20, #0x150]
00b1f3d8	cbnz x21,0x00b1f3f4
00b1f3dc	adrp x0,0xc82000
00b1f3e0	add x0,x0,#0xc60
00b1f3e4	bl 0x00c372e0
00b1f3e8	mov x21,x0
00b1f3ec	str x0,[x20, #0x150]
00b1f3f0	cbz x0,0x00b1f420
00b1f3f4	ldr x0,[x21, #0x8]
00b1f3f8	cbnz x0,0x00b1f408
00b1f3fc	bl 0x00c34780
00b1f400	str x0,[x21, #0x8]
00b1f404	cbz x0,0x00b1f420
00b1f408	mov x1,x19
00b1f40c	bl 0x00c347a0
00b1f410	cmp w0,#0x0
00b1f414	b.le 0x00b1f420
00b1f418	mov w0,#0x1
00b1f41c	b 0x00b1f42c
00b1f420	mov x0,x19
00b1f424	bl 0x00c37660
00b1f428	mov w0,wzr
00b1f42c	ldp x29,x30,[sp, #0x20]
00b1f430	ldp x20,x19,[sp, #0x10]
00b1f434	ldr x21,[sp], #0x30
00b1f438	ret
