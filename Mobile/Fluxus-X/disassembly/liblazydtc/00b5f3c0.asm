; FUN_00b5f3c0 @ 00b5f3c0
00b5f3c0	stp x22,x21,[sp, #-0x30]!
00b5f3c4	stp x20,x19,[sp, #0x10]
00b5f3c8	stp x29,x30,[sp, #0x20]
00b5f3cc	add x29,sp,#0x20
00b5f3d0	mov x20,x0
00b5f3d4	bl 0x00c41000
00b5f3d8	cbz w0,0x00b5f4b8
00b5f3dc	adrp x1,0x2a3000
00b5f3e0	add x1,x1,#0x265
00b5f3e4	orr w0,wzr,#0xc0
00b5f3e8	mov w2,#0x3df
00b5f3ec	bl 0x00c34250
00b5f3f0	mov x19,x0
00b5f3f4	cbz x0,0x00b5f4c0
00b5f3f8	mov w2,#0xb8
00b5f3fc	mov x0,x19
00b5f400	mov x1,x20
00b5f404	bl 0x00c2ffd0
00b5f408	mov x22,x19
00b5f40c	str xzr,[x22, #0x20]!
00b5f410	mov x21,x22
00b5f414	str xzr,[x22, #0x50]
00b5f418	str xzr,[x22, #0x98]
00b5f41c	stur xzr,[x22, #-0x10]
00b5f420	str xzr,[x21, #-0x18]!
00b5f424	str xzr,[x22, #0x8]
00b5f428	ldr x0,[x20, #0x10]
00b5f42c	cbz x0,0x00b5f43c
00b5f430	bl 0x00c3d900
00b5f434	cbz w0,0x00b5f4b0
00b5f438	ldr x0,[x20, #0x10]
00b5f43c	str x0,[x19, #0x10]
00b5f440	ldr x0,[x20, #0x20]
00b5f444	cbz x0,0x00b5f454
00b5f448	bl 0x00c35820
00b5f44c	cbz w0,0x00b5f4b0
00b5f450	ldr x0,[x20, #0x20]
00b5f454	str x0,[x22]
00b5f458	ldr x0,[x20, #0x70]
00b5f45c	cbz x0,0x00b5f46c
00b5f460	bl 0x00c35820
00b5f464	cbz w0,0x00b5f4b0
00b5f468	ldr x0,[x20, #0x70]
00b5f46c	str x0,[x19, #0x70]
00b5f470	ldr x8,[x20, #0x28]
00b5f474	cbz x8,0x00b5f490
00b5f478	bl 0x00c31fa0
00b5f47c	str x0,[x19, #0x28]
00b5f480	cbz x0,0x00b5f4b0
00b5f484	ldr x1,[x20, #0x28]
00b5f488	bl 0x00c34bf0
00b5f48c	cbz w0,0x00b5f4b0
00b5f490	ldr x0,[x20, #0x8]
00b5f494	cbz x0,0x00b5f4f0
00b5f498	adrp x1,0x2a3000
00b5f49c	add x1,x1,#0x265
00b5f4a0	mov w2,#0x401
00b5f4a4	bl 0x00c34600
00b5f4a8	str x0,[x21]
00b5f4ac	cbnz x0,0x00b5f4f0
00b5f4b0	mov x0,x19
00b5f4b4	bl 0x00b5f318
00b5f4b8	mov x19,xzr
00b5f4bc	b 0x00b5f4f0
00b5f4c0	bl 0x00c342a0
00b5f4c4	adrp x0,0x2a3000
00b5f4c8	adrp x2,0x2ba000
00b5f4cc	add x0,x0,#0x265
00b5f4d0	add x2,x2,#0xb5f
00b5f4d4	mov w1,#0x3e1
00b5f4d8	bl 0x00c342b0
00b5f4dc	mov w1,#0x100
00b5f4e0	mov w0,#0x39
00b5f4e4	movk w1,#0xc, LSL #16
00b5f4e8	mov x2,xzr
00b5f4ec	bl 0x00c342c0
00b5f4f0	mov x0,x19
00b5f4f4	ldp x29,x30,[sp, #0x20]
00b5f4f8	ldp x20,x19,[sp, #0x10]
00b5f4fc	ldp x22,x21,[sp], #0x30
00b5f500	ret
