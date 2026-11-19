; FUN_00c204b0 @ 00c204b0
00c204b0	paciasp
00c204b4	stp x29,x30,[sp, #-0x50]!
00c204b8	stp x26,x25,[sp, #0x10]
00c204bc	stp x24,x23,[sp, #0x20]
00c204c0	stp x22,x21,[sp, #0x30]
00c204c4	stp x20,x19,[sp, #0x40]
00c204c8	mov x29,sp
00c204cc	movi v0.2D,#-0x1
00c204d0	ldr x21,[x0, #0x10]
00c204d4	ldr x25,[x1, #0x8]
00c204d8	ldp w22,w23,[x1, #0x18]
00c204dc	ldr x8,[x21]
00c204e0	mov x19,x1
00c204e4	mov x20,x0
00c204e8	str d0,[x1, #0x18]
00c204ec	ldr x8,[x8, #0x20]
00c204f0	mov x0,x21
00c204f4	blr x8
00c204f8	ldurh w8,[x21, #0x9]
00c204fc	and w8,w8,#0xc0
00c20500	cmp w8,#0x40
00c20504	b.eq 0x00c2051c
00c20508	ldr x8,[x21]
00c2050c	ldr x8,[x8, #0x28]
00c20510	mov x0,x21
00c20514	mov x1,x19
00c20518	blr x8
00c2051c	ldr w24,[x19, #0x1c]
00c20520	cmn w24,#0x1
00c20524	b.eq 0x00c205d8
00c20528	cbz w24,0x00c2062c
00c2052c	cmp w24,#0x2
00c20530	b.cc 0x00c20630
00c20534	mov w25,#0x1
00c20538	mov w26,#0x202c
00c2053c	b 0x00c2054c
00c20540	add w25,w25,#0x1
00c20544	cmp w24,w25
00c20548	b.eq 0x00c20630
00c2054c	ldp x8,x9,[x19, #0x8]
00c20550	ldr x0,[x19]
00c20554	add x10,x8,#0x2
00c20558	cmp x10,x9
00c2055c	b.ls 0x00c20584
00c20560	lsl x9,x9,#0x1
00c20564	add x8,x8,#0x3e2
00c20568	cmp x9,x8
00c2056c	csel x1,x9,x8,hi
00c20570	str x1,[x19, #0x10]
00c20574	bl 0x00c30950
00c20578	str x0,[x19]
00c2057c	cbz x0,0x00c20650
00c20580	ldr x8,[x19, #0x8]
00c20584	strh w26,[x0, x8#0x0]
00c20588	ldr x8,[x19, #0x8]
00c2058c	ldr x21,[x20, #0x10]
00c20590	str w25,[x19, #0x18]
00c20594	add x8,x8,#0x2
00c20598	ldr x9,[x21]
00c2059c	str x8,[x19, #0x8]
00c205a0	ldr x8,[x9, #0x20]
00c205a4	mov x0,x21
00c205a8	mov x1,x19
00c205ac	blr x8
00c205b0	ldurh w8,[x21, #0x9]
00c205b4	and w8,w8,#0xc0
00c205b8	cmp w8,#0x40
00c205bc	b.eq 0x00c20540
00c205c0	ldr x8,[x21]
00c205c4	ldr x8,[x8, #0x28]
00c205c8	mov x0,x21
00c205cc	mov x1,x19
00c205d0	blr x8
00c205d4	b 0x00c20540
00c205d8	ldp x8,x9,[x19, #0x8]
00c205dc	ldr x0,[x19]
00c205e0	add x10,x8,#0x3
00c205e4	cmp x10,x9
00c205e8	b.ls 0x00c20610
00c205ec	lsl x9,x9,#0x1
00c205f0	add x8,x8,#0x3e3
00c205f4	cmp x9,x8
00c205f8	csel x1,x9,x8,hi
00c205fc	str x1,[x19, #0x10]
00c20600	bl 0x00c30950
00c20604	str x0,[x19]
00c20608	cbz x0,0x00c20654
00c2060c	ldr x8,[x19, #0x8]
00c20610	add x8,x0,x8
00c20614	mov w9,#0x2e
00c20618	mov w10,#0x2e2e
00c2061c	strb w9,[x8, #0x2]
00c20620	strh w10,[x8]
00c20624	ldr x8,[x19, #0x8]
00c20628	add x25,x8,#0x3
00c2062c	str x25,[x19, #0x8]
00c20630	stp w22,w23,[x19, #0x18]
00c20634	ldp x20,x19,[sp, #0x40]
00c20638	ldp x22,x21,[sp, #0x30]
00c2063c	ldp x24,x23,[sp, #0x20]
00c20640	ldp x26,x25,[sp, #0x10]
00c20644	ldp x29,x30,[sp], #0x50
00c20648	autiasp
00c2064c	ret
00c20650	bl 0x00c30b40
00c20654	bl 0x00c30b40
