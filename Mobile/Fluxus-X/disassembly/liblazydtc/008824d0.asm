; FUN_008824d0 @ 008824d0
008824d0	sub sp,sp,#0xe0
008824d4	stp x29,x30,[sp, #0xb0]
008824d8	stp x22,x21,[sp, #0xc0]
008824dc	stp x20,x19,[sp, #0xd0]
008824e0	add x29,sp,#0xb0
008824e4	mrs x21,tpidr_el0
008824e8	mov x19,x1
008824ec	mov x2,xzr
008824f0	ldr x8,[x21, #0x28]
008824f4	mov x3,xzr
008824f8	mov w7,wzr
008824fc	add x22,sp,#0x10
00882500	adrp x4,0x2b1000
00882504	add x4,x4,#0x390
00882508	add x1,sp,#0x30
0088250c	sub x5,x29,#0x1c
00882510	add x6,sp,#0x20
00882514	mov x20,x0
00882518	stur x8,[x29, #-0x8]
0088251c	stp xzr,xzr,[sp, #0x30]
00882520	sturb wzr,[x29, #-0x1c]
00882524	sturb wzr,[x29, #-0xc]
00882528	stp xzr,xzr,[sp, #0x20]
0088252c	stp xzr,xzr,[sp, #0x10]
00882530	stp x22,xzr,[sp]
00882534	bl 0x00850b3c
00882538	mov x2,xzr
0088253c	mov x3,xzr
00882540	mov w7,wzr
00882544	adrp x4,0x2bc000
00882548	add x4,x4,#0xc27
0088254c	add x0,x20,#0x78
00882550	add x1,sp,#0x30
00882554	sub x5,x29,#0x30
00882558	add x6,sp,#0x20
0088255c	stp xzr,xzr,[sp, #0x30]
00882560	sturb wzr,[x29, #-0x30]
00882564	sturb wzr,[x29, #-0x20]
00882568	stp xzr,xzr,[sp, #0x20]
0088256c	stp xzr,xzr,[sp, #0x10]
00882570	stp x22,xzr,[sp]
00882574	bl 0x00850b3c
00882578	mov x2,xzr
0088257c	mov x3,xzr
00882580	mov w7,wzr
00882584	adrp x4,0x2ae000
00882588	add x4,x4,#0xf43
0088258c	add x0,x20,#0xf0
00882590	add x1,sp,#0x30
00882594	sub x5,x29,#0x44
00882598	add x6,sp,#0x20
0088259c	stp xzr,xzr,[sp, #0x30]
008825a0	sturb wzr,[x29, #-0x44]
008825a4	sturb wzr,[x29, #-0x34]
008825a8	stp xzr,xzr,[sp, #0x20]
008825ac	stp xzr,xzr,[sp, #0x10]
008825b0	stp x22,xzr,[sp]
008825b4	bl 0x00850b3c
008825b8	mov x2,xzr
008825bc	mov x3,xzr
008825c0	mov w7,wzr
008825c4	adrp x4,0x2ca000
008825c8	add x4,x4,#0xa6b
008825cc	add x0,x20,#0x168
008825d0	add x1,sp,#0x30
008825d4	add x5,sp,#0x58
008825d8	add x6,sp,#0x20
008825dc	stp xzr,xzr,[sp, #0x30]
008825e0	strb wzr,[sp, #0x58]
008825e4	strb wzr,[sp, #0x68]
008825e8	stp xzr,xzr,[sp, #0x20]
008825ec	stp xzr,xzr,[sp, #0x10]
008825f0	stp x22,xzr,[sp]
008825f4	bl 0x00850b3c
008825f8	mov x2,xzr
008825fc	mov x3,xzr
00882600	mov w7,wzr
00882604	add x0,x20,#0x1e0
00882608	add x1,sp,#0x30
0088260c	add x5,sp,#0x44
00882610	add x6,sp,#0x20
00882614	mov x4,x19
00882618	stp xzr,xzr,[sp, #0x30]
0088261c	strb wzr,[sp, #0x44]
00882620	strb wzr,[sp, #0x54]
00882624	stp xzr,xzr,[sp, #0x20]
00882628	stp xzr,xzr,[sp, #0x10]
0088262c	stp x22,xzr,[sp]
00882630	bl 0x00850b3c
00882634	ldr x8,[x21, #0x28]
00882638	ldur x9,[x29, #-0x8]
0088263c	cmp x8,x9
00882640	b.ne 0x00882658
00882644	ldp x20,x19,[sp, #0xd0]
00882648	ldp x22,x21,[sp, #0xc0]
0088264c	ldp x29,x30,[sp, #0xb0]
00882650	add sp,sp,#0xe0
00882654	ret
00882658	bl 0x00c2fec0
