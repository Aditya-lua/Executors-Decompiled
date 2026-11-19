; mbedtls_sha1_finish @ 00bac4a4
00bac4a4	stp x22,x21,[sp, #-0x30]!
00bac4a8	stp x20,x19,[sp, #0x10]
00bac4ac	stp x29,x30,[sp, #0x20]
00bac4b0	add x29,sp,#0x20
00bac4b4	mov x21,x0
00bac4b8	ldr w22,[x21], #0x1c
00bac4bc	mov x20,x1
00bac4c0	mov x19,x0
00bac4c4	mov w9,#0x80
00bac4c8	and w8,w22,#0x3f
00bac4cc	add w10,w8,#0x1
00bac4d0	cmp w10,#0x38
00bac4d4	add x0,x21,x10
00bac4d8	strb w9,[x21, w8, UXTW ]
00bac4dc	b.hi 0x00bac4f4
00bac4e0	mov w9,#0x37
00bac4e4	sub w2,w9,w8
00bac4e8	mov w1,wzr
00bac4ec	bl 0x00c301c0
00bac4f0	b 0x00bac520
00bac4f4	eor w2,w8,#0x3f
00bac4f8	mov w1,wzr
00bac4fc	bl 0x00c301c0
00bac500	mov x0,x19
00bac504	mov x1,x21
00bac508	bl 0x00c434e0
00bac50c	stp xzr,xzr,[x21, #0x28]
00bac510	stp xzr,xzr,[x21, #0x18]
00bac514	stp xzr,xzr,[x21, #0x8]
00bac518	str xzr,[x21]
00bac51c	ldr w22,[x19]
00bac520	ldr w8,[x19, #0x4]
00bac524	lsl w9,w22,#0x3
00bac528	rev w9,w9
00bac52c	mov x0,x19
00bac530	extr w8,w8,w22,#0x1d
00bac534	rev w8,w8
00bac538	mov x1,x21
00bac53c	stp w8,w9,[x19, #0x54]
00bac540	bl 0x00c434e0
00bac544	ldr w8,[x19, #0x8]
00bac548	mov w1,#0x5c
00bac54c	mov x0,x19
00bac550	rev w8,w8
00bac554	str w8,[x20]
00bac558	ldr w8,[x19, #0xc]
00bac55c	rev w8,w8
00bac560	str w8,[x20, #0x4]
00bac564	ldr w8,[x19, #0x10]
00bac568	rev w8,w8
00bac56c	str w8,[x20, #0x8]
00bac570	ldr w8,[x19, #0x14]
00bac574	rev w8,w8
00bac578	str w8,[x20, #0xc]
00bac57c	ldr w8,[x19, #0x18]
00bac580	rev w8,w8
00bac584	str w8,[x20, #0x10]
00bac588	bl 0x00c42220
00bac58c	ldp x29,x30,[sp, #0x20]
00bac590	ldp x20,x19,[sp, #0x10]
00bac594	mov w0,wzr
00bac598	ldp x22,x21,[sp], #0x30
00bac59c	ret
