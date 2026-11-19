; FUN_00b3f48c @ 00b3f48c
00b3f48c	str x28,[sp, #-0x40]!
00b3f490	stp x22,x21,[sp, #0x10]
00b3f494	stp x20,x19,[sp, #0x20]
00b3f498	stp x29,x30,[sp, #0x30]
00b3f49c	add x29,sp,#0x30
00b3f4a0	sub sp,sp,#0x410
00b3f4a4	mov x20,x5
00b3f4a8	mov w22,w3
00b3f4ac	mov x21,x2
00b3f4b0	bl 0x00b3f5b8
00b3f4b4	cbz x0,0x00b3f530
00b3f4b8	stur xzr,[x29, #-0x28]
00b3f4bc	mov x19,x0
00b3f4c0	ldr x0,[x20]
00b3f4c4	bl 0x00c41210
00b3f4c8	ldr x8,[x20, #0x10]
00b3f4cc	cbz x8,0x00b3f580
00b3f4d0	mov x21,x0
00b3f4d4	add x5,x20,#0x18
00b3f4d8	add x0,sp,#0x10
00b3f4dc	mov w1,#0x400
00b3f4e0	sub x2,x29,#0x28
00b3f4e4	mov w4,#0x1
00b3f4e8	mov x3,xzr
00b3f4ec	bl 0x00c3ea20
00b3f4f0	cbz w0,0x00b3f554
00b3f4f4	ldr x1,[x20, #0x10]
00b3f4f8	ldur w3,[x29, #-0x28]
00b3f4fc	mov w0,#0xffffffff
00b3f500	add x2,sp,#0x10
00b3f504	mov x4,xzr
00b3f508	mov w5,wzr
00b3f50c	mov w6,wzr
00b3f510	mov x7,x19
00b3f514	stp x21,xzr,[sp]
00b3f518	bl 0x00c3f5e0
00b3f51c	ldur x1,[x29, #-0x28]
00b3f520	mov x20,x0
00b3f524	add x0,sp,#0x10
00b3f528	bl 0x00c34750
00b3f52c	b 0x00b3f584
00b3f530	cmp w22,#0x10
00b3f534	b.eq 0x00b3f5a8
00b3f538	cmp w22,#0x6
00b3f53c	mov x20,xzr
00b3f540	b.ne 0x00b3f58c
00b3f544	mov x0,x21
00b3f548	bl 0x00c37660
00b3f54c	mov x20,xzr
00b3f550	b 0x00b3f58c
00b3f554	bl 0x00c342a0
00b3f558	adrp x0,0x2c2000
00b3f55c	adrp x2,0x2dc000
00b3f560	add x0,x0,#0x9ea
00b3f564	add x2,x2,#0xea5
00b3f568	mov w1,#0x74
00b3f56c	bl 0x00c342b0
00b3f570	mov w0,#0x39
00b3f574	mov w1,#0x9f
00b3f578	mov x2,xzr
00b3f57c	bl 0x00c342c0
00b3f580	mov x20,xzr
00b3f584	mov x0,x19
00b3f588	bl 0x00c37d00
00b3f58c	mov x0,x20
00b3f590	add sp,sp,#0x410
00b3f594	ldp x29,x30,[sp, #0x30]
00b3f598	ldp x20,x19,[sp, #0x20]
00b3f59c	ldp x22,x21,[sp, #0x10]
00b3f5a0	ldr x28,[sp], #0x40
00b3f5a4	ret
00b3f5a8	mov x0,x21
00b3f5ac	bl 0x00c37890
00b3f5b0	mov x20,xzr
00b3f5b4	b 0x00b3f58c
