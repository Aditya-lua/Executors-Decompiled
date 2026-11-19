; FSE_readNCount_bmi2 @ 00bc03cc
00bc03cc	sub sp,sp,#0x60
00bc03d0	stp x29,x30,[sp, #0x10]
00bc03d4	str x25,[sp, #0x20]
00bc03d8	stp x24,x23,[sp, #0x30]
00bc03dc	stp x22,x21,[sp, #0x40]
00bc03e0	stp x20,x19,[sp, #0x50]
00bc03e4	add x29,sp,#0x10
00bc03e8	mrs x24,tpidr_el0
00bc03ec	mov x23,x4
00bc03f0	mov x20,x3
00bc03f4	ldr x8,[x24, #0x28]
00bc03f8	mov x22,x2
00bc03fc	mov x19,x1
00bc0400	mov x21,x0
00bc0404	cmp x4,#0x7
00bc0408	str x8,[sp, #0x8]
00bc040c	b.hi 0x00bc0454
00bc0410	mov x0,sp
00bc0414	mov x1,x20
00bc0418	mov x2,x23
00bc041c	str xzr,[sp]
00bc0420	bl 0x00c2ffd0
00bc0424	mov x3,sp
00bc0428	mov x0,x21
00bc042c	mov x1,x19
00bc0430	mov x2,x22
00bc0434	mov w4,#0x8
00bc0438	bl 0x00c43750
00bc043c	mov x8,#-0x77
00bc0440	cmp x0,x23
00bc0444	ccmp x0,x8,#0x2,hi
00bc0448	mov x8,#-0x14
00bc044c	csel x0,x8,x0,cc
00bc0450	b 0x00bc0674
00bc0454	ldr w8,[x19]
00bc0458	mov x0,x21
00bc045c	mov w1,wzr
00bc0460	add w25,w8,#0x1
00bc0464	ubfiz x2,x25,#0x1,#0x20
00bc0468	bl 0x00c301c0
00bc046c	ldr w10,[x20]
00bc0470	and w9,w10,#0xf
00bc0474	cmp w9,#0xa
00bc0478	b.ls 0x00bc0484
00bc047c	mov x0,#-0x2c
00bc0480	b 0x00bc0674
00bc0484	mov w11,#0x20
00bc0488	add x15,x20,x23
00bc048c	add w14,w9,#0x5
00bc0490	lsl w12,w11,w9
00bc0494	lsr w0,w10,#0x4
00bc0498	mov w8,wzr
00bc049c	add w16,w9,#0x6
00bc04a0	mov w13,#0x1
00bc04a4	str w14,[x22]
00bc04a8	sub x14,x15,#0x7
00bc04ac	sub x15,x15,#0x4
00bc04b0	orr w9,w12,#0x1
00bc04b4	mov w17,#0x4
00bc04b8	mov w1,#0x1
00bc04bc	mov x10,x20
00bc04c0	tbnz w1,#0x0,0x00bc0588
00bc04c4	mvn w1,w0
00bc04c8	orr w1,w1,#0x80000000
00bc04cc	rbit w1,w1
00bc04d0	clz w1,w1
00bc04d4	cmp w1,#0x18
00bc04d8	b.cc 0x00bc051c
00bc04dc	sub w0,w10,w14
00bc04e0	add x1,x10,#0x3
00bc04e4	cmp x10,x14
00bc04e8	add w0,w17,w0, LSL #0x3
00bc04ec	csel x10,x15,x1,hi
00bc04f0	add w8,w8,#0x24
00bc04f4	ldr w1,[x10]
00bc04f8	and w0,w0,#0x1f
00bc04fc	csel w17,w0,w17,hi
00bc0500	lsr w0,w1,w17
00bc0504	mvn w1,w0
00bc0508	orr w1,w1,#0x80000000
00bc050c	rbit w1,w1
00bc0510	clz w1,w1
00bc0514	cmp w1,#0x17
00bc0518	b.hi 0x00bc04dc
00bc051c	lsr w2,w1,#0x1
00bc0520	and w1,w1,#0x1e
00bc0524	lsr w0,w0,w1
00bc0528	add w17,w17,w1
00bc052c	add w2,w2,w2, LSL #0x1
00bc0530	add w17,w17,#0x2
00bc0534	and w0,w0,#0x3
00bc0538	add w8,w2,w8
00bc053c	add w8,w8,w0
00bc0540	cmp w8,w25
00bc0544	b.cs 0x00bc0650
00bc0548	lsr w0,w17,#0x3
00bc054c	cmp x10,x14
00bc0550	b.hi 0x00bc0568
00bc0554	add x10,x10,x0
00bc0558	and w17,w17,#0x7
00bc055c	ldr w0,[x10]
00bc0560	lsr w0,w0,w17
00bc0564	b 0x00bc0588
00bc0568	add x1,x10,x0
00bc056c	cmp x1,x15
00bc0570	b.ls 0x00bc0554
00bc0574	sub w0,w10,w15
00bc0578	mov x10,x15
00bc057c	add w17,w17,w0, LSL #0x3
00bc0580	and w17,w17,#0x1f
00bc0584	b 0x00bc055c
00bc0588	lsl w1,w12,#0x1
00bc058c	sub w3,w12,#0x1
00bc0590	sub w1,w1,#0x1
00bc0594	and w2,w0,w1
00bc0598	sub w1,w1,w9
00bc059c	and w0,w0,w3
00bc05a0	cmp w2,w12
00bc05a4	csel w3,wzr,w1,lt
00bc05a8	cmp w0,w1
00bc05ac	sub w2,w2,w3
00bc05b0	sub w3,w16,#0x1
00bc05b4	csel w0,w2,w0,cs
00bc05b8	csel w3,w16,w3,cs
00bc05bc	sub w2,w0,#0x1
00bc05c0	sub w1,w13,w0
00bc05c4	cmp w0,#0x0
00bc05c8	csel w0,w1,w2,gt
00bc05cc	cmp w2,#0x0
00bc05d0	add w17,w3,w17
00bc05d4	add w9,w0,w9
00bc05d8	cset w1,ne
00bc05dc	strh w2,[x21, w8, UXTW #0x1]
00bc05e0	cmp w9,w12
00bc05e4	add w8,w8,#0x1
00bc05e8	b.ge 0x00bc0604
00bc05ec	cmp w9,#0x2
00bc05f0	b.lt 0x00bc0650
00bc05f4	clz w16,w9
00bc05f8	eor w12,w16,#0x1f
00bc05fc	sub w16,w11,w16
00bc0600	lsl w12,w13,w12
00bc0604	cmp w8,w25
00bc0608	b.cs 0x00bc0650
00bc060c	sbfx x0,x17,#0x3,#0x1d
00bc0610	cmp x10,x14
00bc0614	b.hi 0x00bc0630
00bc0618	add x10,x10,x0
00bc061c	and w17,w17,#0x7
00bc0620	ldr w0,[x10]
00bc0624	lsr w0,w0,w17
00bc0628	tbz w1,#0x0,0x00bc04c4
00bc062c	b 0x00bc0588
00bc0630	add x2,x10,x0
00bc0634	cmp x2,x15
00bc0638	b.ls 0x00bc0618
00bc063c	sub w0,w10,w15
00bc0640	mov x10,x15
00bc0644	add w17,w17,w0, LSL #0x3
00bc0648	and w17,w17,#0x1f
00bc064c	b 0x00bc0620
00bc0650	cmp w9,#0x1
00bc0654	b.ne 0x00bc0670
00bc0658	cmp w8,w25
00bc065c	b.ls 0x00bc0668
00bc0660	mov x0,#-0x30
00bc0664	b 0x00bc0674
00bc0668	cmp w17,#0x20
00bc066c	b.le 0x00bc06a0
00bc0670	mov x0,#-0x14
00bc0674	ldr x8,[x24, #0x28]
00bc0678	ldr x9,[sp, #0x8]
00bc067c	cmp x8,x9
00bc0680	b.ne 0x00bc06bc
00bc0684	ldp x20,x19,[sp, #0x50]
00bc0688	ldr x25,[sp, #0x20]
00bc068c	ldp x22,x21,[sp, #0x40]
00bc0690	ldp x24,x23,[sp, #0x30]
00bc0694	ldp x29,x30,[sp, #0x10]
00bc0698	add sp,sp,#0x60
00bc069c	ret
00bc06a0	add w9,w17,#0x7
00bc06a4	sub w8,w8,#0x1
00bc06a8	asr w9,w9,#0x3
00bc06ac	str w8,[x19]
00bc06b0	add x9,x10,w9, SXTW 
00bc06b4	sub x0,x9,x20
00bc06b8	b 0x00bc0674
00bc06bc	bl 0x00c2fec0
