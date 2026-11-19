; FUN_00a1f3b0 @ 00a1f3b0
00a1f3b0	sub sp,sp,#0x50
00a1f3b4	stp x29,x30,[sp, #0x40]
00a1f3b8	add x29,sp,#0x40
00a1f3bc	stp x20,x19,[sp, #0x30]
00a1f3c0	mov x4,x1
00a1f3c4	mov x20,x0
00a1f3c8	sub x1,x29,#0x18
00a1f3cc	add x2,sp,#0x14
00a1f3d0	mov x3,sp
00a1f3d4	mov x0,xzr
00a1f3d8	str x21,[sp, #0x20]
00a1f3dc	bl 0x00c32be0
00a1f3e0	cbz w0,0x00a1f59c
00a1f3e4	ldr x3,[sp]
00a1f3e8	add x1,sp,#0x10
00a1f3ec	add x2,sp,#0x8
00a1f3f0	mov x0,xzr
00a1f3f4	bl 0x00c32b50
00a1f3f8	ldr w8,[sp, #0x10]
00a1f3fc	cmn w8,#0x1
00a1f400	b.eq 0x00a1f460
00a1f404	cmp w8,#0x5
00a1f408	b.eq 0x00a1f460
00a1f40c	cmp w8,#0x10
00a1f410	b.ne 0x00a1f4c4
00a1f414	ldr x8,[sp, #0x8]
00a1f418	add x1,sp,#0x18
00a1f41c	mov x0,xzr
00a1f420	ldr x9,[x8, #0x8]
00a1f424	str x9,[sp, #0x18]
00a1f428	ldrsw x2,[x8]
00a1f42c	bl 0x00c3a160
00a1f430	mov x19,x0
00a1f434	cbnz x0,0x00a1f46c
00a1f438	bl 0x00c342a0
00a1f43c	adrp x0,0x2db000
00a1f440	adrp x2,0x2db000
00a1f444	add x0,x0,#0xe7d
00a1f448	add x2,x2,#0xe94
00a1f44c	mov w1,#0x33
00a1f450	bl 0x00c342b0
00a1f454	mov w0,#0xa
00a1f458	mov w1,#0x68
00a1f45c	b 0x00a1f524
00a1f460	bl 0x00c3a100
00a1f464	mov x19,x0
00a1f468	cbz x0,0x00a1f4fc
00a1f46c	ldrsw x2,[sp, #0x14]
00a1f470	sub x1,x29,#0x18
00a1f474	mov x0,xzr
00a1f478	bl 0x00c37c70
00a1f47c	mov x21,x0
00a1f480	cbz x0,0x00a1f534
00a1f484	mov x0,x21
00a1f488	mov x1,xzr
00a1f48c	bl 0x00c375e0
00a1f490	str x0,[x19, #0x68]
00a1f494	cbz x0,0x00a1f55c
00a1f498	ldr x8,[x19, #0xc0]
00a1f49c	mov x0,x21
00a1f4a0	add x8,x8,#0x1
00a1f4a4	str x8,[x19, #0xc0]
00a1f4a8	bl 0x00c37c30
00a1f4ac	mov w1,#0x74
00a1f4b0	mov x0,x20
00a1f4b4	mov x2,x19
00a1f4b8	bl 0x00c39b70
00a1f4bc	mov w0,#0x1
00a1f4c0	b 0x00a1f59c
00a1f4c4	bl 0x00c342a0
00a1f4c8	adrp x0,0x2db000
00a1f4cc	adrp x2,0x2db000
00a1f4d0	add x0,x0,#0xe7d
00a1f4d4	add x2,x2,#0xe94
00a1f4d8	mov w1,#0x3d
00a1f4dc	bl 0x00c342b0
00a1f4e0	mov w0,#0xa
00a1f4e4	mov w1,#0x69
00a1f4e8	mov x2,xzr
00a1f4ec	bl 0x00c342c0
00a1f4f0	mov x21,xzr
00a1f4f4	mov x19,xzr
00a1f4f8	b 0x00a1f588
00a1f4fc	bl 0x00c342a0
00a1f500	adrp x0,0x2db000
00a1f504	adrp x2,0x2db000
00a1f508	add x0,x0,#0xe7d
00a1f50c	add x2,x2,#0xe94
00a1f510	mov w1,#0x39
00a1f514	bl 0x00c342b0
00a1f518	mov w1,#0x100
00a1f51c	mov w0,#0xa
00a1f520	movk w1,#0xc, LSL #16
00a1f524	mov x2,xzr
00a1f528	bl 0x00c342c0
00a1f52c	mov x21,xzr
00a1f530	b 0x00a1f588
00a1f534	bl 0x00c342a0
00a1f538	adrp x0,0x2db000
00a1f53c	adrp x2,0x2db000
00a1f540	add x0,x0,#0xe7d
00a1f544	add x2,x2,#0xe94
00a1f548	mov w1,#0x42
00a1f54c	bl 0x00c342b0
00a1f550	mov w0,#0xa
00a1f554	mov w1,#0x68
00a1f558	b 0x00a1f580
00a1f55c	bl 0x00c342a0
00a1f560	adrp x0,0x2db000
00a1f564	adrp x2,0x2db000
00a1f568	add x0,x0,#0xe7d
00a1f56c	add x2,x2,#0xe94
00a1f570	mov w1,#0x47
00a1f574	bl 0x00c342b0
00a1f578	mov w0,#0xa
00a1f57c	mov w1,#0x6c
00a1f580	mov x2,xzr
00a1f584	bl 0x00c342c0
00a1f588	mov x0,x21
00a1f58c	bl 0x00c37c30
00a1f590	mov x0,x19
00a1f594	bl 0x00c3a0a0
00a1f598	mov w0,wzr
00a1f59c	ldp x29,x30,[sp, #0x40]
00a1f5a0	ldp x20,x19,[sp, #0x30]
00a1f5a4	ldr x21,[sp, #0x20]
00a1f5a8	add sp,sp,#0x50
00a1f5ac	ret
