; ossl_core_bio_new_from_bio @ 00a4e384
00a4e384	stp x20,x19,[sp, #-0x20]!
00a4e388	adrp x1,0x2b2000
00a4e38c	mov x20,x0
00a4e390	add x1,x1,#0x1d3
00a4e394	orr w0,wzr,#0x18
00a4e398	mov w2,#0x1a
00a4e39c	stp x29,x30,[sp, #0x10]
00a4e3a0	add x29,sp,#0x10
00a4e3a4	bl 0x00c32320
00a4e3a8	mov x19,x0
00a4e3ac	cbz x0,0x00a4e3f8
00a4e3b0	bl 0x00c34d50
00a4e3b4	str x0,[x19, #0x8]
00a4e3b8	cbz x0,0x00a4e3f8
00a4e3bc	mov w8,#0x1
00a4e3c0	mov x0,x20
00a4e3c4	stlr w8,[x19]
00a4e3c8	bl 0x00c322d0
00a4e3cc	cbz w0,0x00a4e3dc
00a4e3d0	mov x0,x19
00a4e3d4	str x20,[x19, #0x10]
00a4e3d8	b 0x00a4e410
00a4e3dc	ldxr w8,[x19]
00a4e3e0	subs w9,w8,#0x1
00a4e3e4	stxr w10,w9,[x19]
00a4e3e8	cbnz w10,0x00a4e3dc
00a4e3ec	b.ne 0x00a4e41c
00a4e3f0	dmb ISHLD
00a4e3f4	b 0x00a4e428
00a4e3f8	adrp x1,0x2b2000
00a4e3fc	add x1,x1,#0x1d3
00a4e400	mov w2,#0x1d
00a4e404	mov x0,x19
00a4e408	bl 0x00c32310
00a4e40c	mov x0,xzr
00a4e410	ldp x29,x30,[sp, #0x10]
00a4e414	ldp x20,x19,[sp], #0x20
00a4e418	ret
00a4e41c	cmp w8,#0x1
00a4e420	mov x0,xzr
00a4e424	b.gt 0x00a4e410
00a4e428	ldr x0,[x19, #0x10]
00a4e42c	bl 0x00c31a40
00a4e430	ldr x0,[x19, #0x8]
00a4e434	bl 0x00c34d40
00a4e438	adrp x1,0x2b2000
00a4e43c	add x1,x1,#0x1d3
00a4e440	mov w2,#0x34
00a4e444	b 0x00a4e404
