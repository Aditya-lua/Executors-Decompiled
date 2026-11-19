; ZSTD_DCtx_reset @ 00bb2568
00bb2568	stp x29,x30,[sp, #-0x20]!
00bb256c	stp x20,x19,[sp, #0x10]
00bb2570	mov x29,sp
00bb2574	and w8,w1,#0xfffffffd
00bb2578	add x19,x0,#0x7, LSL #12
00bb257c	cmp w8,#0x1
00bb2580	b.ne 0x00bb2590
00bb2584	str wzr,[x19, #0x61c]
00bb2588	str wzr,[x19, #0x66c]
00bb258c	str w8,[x19, #0x5e0]
00bb2590	and w8,w1,#0xfffffffe
00bb2594	cmp w8,#0x2
00bb2598	b.ne 0x00bb25ac
00bb259c	ldr w8,[x19, #0x61c]
00bb25a0	cbz w8,0x00bb25b4
00bb25a4	mov x0,#-0x3c
00bb25a8	b 0x00bb25fc
00bb25ac	mov x0,xzr
00bb25b0	b 0x00bb25fc
00bb25b4	ldr x8,[x0, #0x75e8]
00bb25b8	mov x20,x0
00bb25bc	mov x0,x8
00bb25c0	bl 0x00c435b0
00bb25c4	fmov d0,xzr
00bb25c8	movi v1.2D,#0x0
00bb25cc	mov w8,#0x1
00bb25d0	mov x0,xzr
00bb25d4	movk w8,#0x800, LSL #16
00bb25d8	mov w9,#0x75e8
00bb25dc	str wzr,[x19, #0x600]
00bb25e0	mov v0.D[0x1],v0.D[0x0]
00bb25e4	str wzr,[x19, #0x670]
00bb25e8	str x8,[x20, #0x7638]
00bb25ec	str d1,[x20, #0x7598]
00bb25f0	str q0,[x20,x9]
00bb25f4	str d1,[x20, #0x7610]
00bb25f8	str wzr,[x19, #0x618]
00bb25fc	ldp x20,x19,[sp, #0x10]
00bb2600	ldp x29,x30,[sp], #0x20
00bb2604	ret
