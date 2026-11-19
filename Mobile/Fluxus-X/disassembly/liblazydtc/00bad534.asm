; mbedtls_sha256_finish @ 00bad534
00bad534	stp x20,x19,[sp, #-0x20]!
00bad538	stp x29,x30,[sp, #0x10]
00bad53c	add x29,sp,#0x10
00bad540	ldr w8,[x0, #0x40]
00bad544	mov w9,#0x80
00bad548	mov x20,x1
00bad54c	mov x19,x0
00bad550	and x8,x8,#0x3f
00bad554	add w10,w8,#0x1
00bad558	strb w9,[x0, x8]
00bad55c	cmp w10,#0x38
00bad560	add x0,x0,x10
00bad564	b.hi 0x00bad57c
00bad568	mov w9,#0x37
00bad56c	sub w2,w9,w8
00bad570	mov w1,wzr
00bad574	bl 0x00c301c0
00bad578	b 0x00bad5a4
00bad57c	eor w2,w8,#0x3f
00bad580	mov w1,wzr
00bad584	bl 0x00c301c0
00bad588	mov x0,x19
00bad58c	mov x1,x19
00bad590	bl 0x00c434f0
00bad594	stp xzr,xzr,[x19, #0x28]
00bad598	stp xzr,xzr,[x19, #0x18]
00bad59c	stp xzr,xzr,[x19, #0x8]
00bad5a0	str xzr,[x19]
00bad5a4	ldp w8,w9,[x19, #0x40]
00bad5a8	mov x0,x19
00bad5ac	mov x1,x19
00bad5b0	extr w9,w9,w8,#0x1d
00bad5b4	lsl w8,w8,#0x3
00bad5b8	rev w9,w9
00bad5bc	rev w8,w8
00bad5c0	stp w9,w8,[x19, #0x38]
00bad5c4	bl 0x00c434f0
00bad5c8	ldr w8,[x19, #0x48]
00bad5cc	rev w8,w8
00bad5d0	str w8,[x20]
00bad5d4	ldr w8,[x19, #0x4c]
00bad5d8	rev w8,w8
00bad5dc	str w8,[x20, #0x4]
00bad5e0	ldr w8,[x19, #0x50]
00bad5e4	rev w8,w8
00bad5e8	str w8,[x20, #0x8]
00bad5ec	ldr w8,[x19, #0x54]
00bad5f0	rev w8,w8
00bad5f4	str w8,[x20, #0xc]
00bad5f8	ldr w8,[x19, #0x58]
00bad5fc	rev w8,w8
00bad600	str w8,[x20, #0x10]
00bad604	ldr w8,[x19, #0x5c]
00bad608	rev w8,w8
00bad60c	str w8,[x20, #0x14]
00bad610	ldr w8,[x19, #0x60]
00bad614	rev w8,w8
00bad618	str w8,[x20, #0x18]
00bad61c	ldr w8,[x19, #0x68]
00bad620	cbnz w8,0x00bad630
00bad624	ldr w8,[x19, #0x64]
00bad628	rev w8,w8
00bad62c	str w8,[x20, #0x1c]
00bad630	mov w1,#0x6c
00bad634	mov x0,x19
00bad638	bl 0x00c42220
00bad63c	ldp x29,x30,[sp, #0x10]
00bad640	mov w0,wzr
00bad644	ldp x20,x19,[sp], #0x20
00bad648	ret
