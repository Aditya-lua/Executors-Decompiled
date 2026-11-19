; OSSL_PARAM_get_utf8_string @ 00a9f460
00a9f460	stp x22,x21,[sp, #-0x30]!
00a9f464	mov x21,x0
00a9f468	mov w0,wzr
00a9f46c	stp x20,x19,[sp, #0x10]
00a9f470	stp x29,x30,[sp, #0x20]
00a9f474	add x29,sp,#0x20
00a9f478	cbz x21,0x00a9f524
00a9f47c	mov x19,x1
00a9f480	cbz x1,0x00a9f524
00a9f484	ldr w8,[x21, #0x8]
00a9f488	mov w0,wzr
00a9f48c	cmp w8,#0x4
00a9f490	b.ne 0x00a9f524
00a9f494	ldr x8,[x21, #0x10]
00a9f498	cbz x8,0x00a9f520
00a9f49c	ldr x8,[x19]
00a9f4a0	ldr x22,[x21, #0x18]
00a9f4a4	mov x20,x2
00a9f4a8	cbnz x8,0x00a9f4d0
00a9f4ac	add x20,x22,#0x1
00a9f4b0	adrp x1,0x2a2000
00a9f4b4	add x1,x1,#0x739
00a9f4b8	mov w2,#0x463
00a9f4bc	mov x0,x20
00a9f4c0	bl 0x00c32320
00a9f4c4	cbz x0,0x00a9f524
00a9f4c8	mov x8,x0
00a9f4cc	str x0,[x19]
00a9f4d0	cmp x20,x22
00a9f4d4	mov w0,wzr
00a9f4d8	b.cc 0x00a9f524
00a9f4dc	ldr x1,[x21, #0x10]
00a9f4e0	mov x0,x8
00a9f4e4	mov x2,x22
00a9f4e8	bl 0x00c2ffd0
00a9f4ec	ldr x1,[x21, #0x18]
00a9f4f0	cmp x1,x20
00a9f4f4	b.cc 0x00a9f504
00a9f4f8	ldr x0,[x21, #0x10]
00a9f4fc	bl 0x00c358a0
00a9f500	mov x1,x0
00a9f504	cmp x1,x20
00a9f508	mov w0,wzr
00a9f50c	b.cs 0x00a9f524
00a9f510	ldr x8,[x19]
00a9f514	mov w0,#0x1
00a9f518	strb wzr,[x8, x1]
00a9f51c	b 0x00a9f524
00a9f520	mov w0,wzr
00a9f524	ldp x29,x30,[sp, #0x20]
00a9f528	ldp x20,x19,[sp, #0x10]
00a9f52c	ldp x22,x21,[sp], #0x30
00a9f530	ret
