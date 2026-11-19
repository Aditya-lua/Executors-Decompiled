; ossl_core_bio_new_mem_buf @ 00a4e4c8
00a4e4c8	stp x20,x19,[sp, #-0x20]!
00a4e4cc	stp x29,x30,[sp, #0x10]
00a4e4d0	add x29,sp,#0x10
00a4e4d4	bl 0x00c31a50
00a4e4d8	cbz x0,0x00a4e534
00a4e4dc	adrp x1,0x2b2000
00a4e4e0	mov x19,x0
00a4e4e4	add x1,x1,#0x1d3
00a4e4e8	orr w0,wzr,#0x18
00a4e4ec	mov w2,#0x1a
00a4e4f0	bl 0x00c32320
00a4e4f4	mov x20,x0
00a4e4f8	cbz x0,0x00a4e518
00a4e4fc	bl 0x00c34d50
00a4e500	str x0,[x20, #0x8]
00a4e504	cbz x0,0x00a4e518
00a4e508	mov w8,#0x1
00a4e50c	stlr w8,[x20]
00a4e510	str x19,[x20, #0x10]
00a4e514	b 0x00a4e538
00a4e518	adrp x1,0x2b2000
00a4e51c	add x1,x1,#0x1d3
00a4e520	mov w2,#0x1d
00a4e524	mov x0,x20
00a4e528	bl 0x00c32310
00a4e52c	mov x0,x19
00a4e530	bl 0x00c31a40
00a4e534	mov x20,xzr
00a4e538	ldp x29,x30,[sp, #0x10]
00a4e53c	mov x0,x20
00a4e540	ldp x20,x19,[sp], #0x20
00a4e544	ret
