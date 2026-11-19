; mbedtls_oid_from_numeric_string @ 00baa3e8
00baa3e8	stp x22,x21,[sp, #-0x30]!
00baa3ec	stp x20,x19,[sp, #0x10]
00baa3f0	stp x29,x30,[sp, #0x20]
00baa3f4	add x29,sp,#0x20
00baa3f8	mov x20,x2
00baa3fc	mov x22,x1
00baa400	mov x19,x0
00baa404	cbz x2,0x00baa480
00baa408	mov x9,xzr
00baa40c	cmp x20,#0x1
00baa410	mov x8,xzr
00baa414	b.eq 0x00baa458
00baa418	and x8,x20,#-0x2
00baa41c	mov x9,xzr
00baa420	mov x10,xzr
00baa424	add x11,x22,#0x1
00baa428	mov x12,x8
00baa42c	ldurb w13,[x11, #-0x1]
00baa430	ldrb w14,[x11], #0x2
00baa434	cmp w13,#0x2e
00baa438	cinc x9,x9,eq
00baa43c	cmp w14,#0x2e
00baa440	cinc x10,x10,eq
00baa444	subs x12,x12,#0x2
00baa448	b.ne 0x00baa42c
00baa44c	cmp x8,x20
00baa450	add x9,x10,x9
00baa454	b.eq 0x00baa474
00baa458	add x10,x22,x8
00baa45c	sub x8,x20,x8
00baa460	ldrb w11,[x10], #0x1
00baa464	cmp w11,#0x2e
00baa468	cinc x9,x9,eq
00baa46c	subs x8,x8,#0x1
00baa470	b.ne 0x00baa460
00baa474	sub x8,x9,#0x1
00baa478	cmp x8,#0x7e
00baa47c	b.ls 0x00baa488
00baa480	mov w20,#0xffffff98
00baa484	b 0x00baa5c0
00baa488	add x21,x9,x9, LSL #0x2
00baa48c	mov w1,#0x1
00baa490	mov x0,x21
00baa494	bl 0x00c30a30
00baa498	str x0,[x19, #0x10]
00baa49c	cbz x0,0x00baa4f8
00baa4a0	cmp x20,#0x1
00baa4a4	b.lt 0x00baa5b0
00baa4a8	mov w10,#0x9999
00baa4ac	mov w12,wzr
00baa4b0	add x8,x22,x20
00baa4b4	add x9,x0,x21
00baa4b8	mov w20,#0xffffff98
00baa4bc	movk w10,#0x1999, LSL #16
00baa4c0	mov w11,#0xa
00baa4c4	ldrb w13,[x22]
00baa4c8	sub w14,w13,#0x30
00baa4cc	cmp w14,#0x9
00baa4d0	b.hi 0x00baa500
00baa4d4	cmp w12,w10
00baa4d8	b.hi 0x00baa5b0
00baa4dc	madd w12,w12,w11,w13
00baa4e0	add x22,x22,#0x1
00baa4e4	mov w20,wzr
00baa4e8	cmp x22,x8
00baa4ec	sub w12,w12,#0x30
00baa4f0	b.cc 0x00baa4c4
00baa4f4	b 0x00baa504
00baa4f8	mov w20,#0xffffff96
00baa4fc	b 0x00baa5c0
00baa500	cbnz w20,0x00baa5b4
00baa504	cmp w12,#0x2
00baa508	mov w20,#0xffffff98
00baa50c	b.hi 0x00baa5b4
00baa510	cmp x22,x8
00baa514	b.cs 0x00baa5b4
00baa518	ldrb w11,[x22]
00baa51c	cmp w11,#0x2e
00baa520	b.ne 0x00baa5b0
00baa524	add x11,x22,#0x1
00baa528	cmp x11,x8
00baa52c	b.cs 0x00baa5b0
00baa530	mov w13,wzr
00baa534	mov w20,#0xffffff98
00baa538	mov w14,#0xa
00baa53c	ldrb w15,[x11]
00baa540	sub w16,w15,#0x30
00baa544	cmp w16,#0x9
00baa548	b.hi 0x00baa570
00baa54c	cmp w13,w10
00baa550	b.hi 0x00baa5b0
00baa554	madd w13,w13,w14,w15
00baa558	add x11,x11,#0x1
00baa55c	mov w20,wzr
00baa560	cmp x11,x8
00baa564	sub w13,w13,#0x30
00baa568	b.cc 0x00baa53c
00baa56c	b 0x00baa574
00baa570	cbnz w20,0x00baa5b4
00baa574	cmp w12,#0x1
00baa578	b.hi 0x00baa584
00baa57c	cmp w13,#0x27
00baa580	b.hi 0x00baa5b0
00baa584	cmp x11,x8
00baa588	b.cs 0x00baa59c
00baa58c	ldrb w14,[x11]
00baa590	cmp w14,#0x2e
00baa594	b.ne 0x00baa5b0
00baa598	add x11,x11,#0x1
00baa59c	add w12,w12,w12, LSL #0x2
00baa5a0	lsl w14,w12,#0x3
00baa5a4	mvn w12,w14
00baa5a8	cmp w13,w12
00baa5ac	b.ls 0x00baa5d4
00baa5b0	mov w20,#0xffffff98
00baa5b4	ldr x0,[x19, #0x10]
00baa5b8	bl 0x00c30960
00baa5bc	stp xzr,xzr,[x19, #0x8]
00baa5c0	mov w0,w20
00baa5c4	ldp x29,x30,[sp, #0x20]
00baa5c8	ldp x20,x19,[sp, #0x10]
00baa5cc	ldp x22,x21,[sp], #0x30
00baa5d0	ret
00baa5d4	add w13,w13,w14
00baa5d8	mov x12,xzr
00baa5dc	mov w14,w13
00baa5e0	lsr w14,w14,#0x7
00baa5e4	add x12,x12,#0x1
00baa5e8	cbnz w14,0x00baa5e0
00baa5ec	sub x14,x12,#0x1
00baa5f0	cmp x21,x14
00baa5f4	b.ls 0x00baa748
00baa5f8	add x15,x0,x12
00baa5fc	and w16,w13,#0x7f
00baa600	cmp x12,#0x2
00baa604	sturb w16,[x15, #-0x1]
00baa608	b.cc 0x00baa62c
00baa60c	sub x15,x15,#0x2
00baa610	mov w16,#0x1
00baa614	lsr w13,w13,#0x7
00baa618	add x16,x16,#0x1
00baa61c	orr w17,w13,#0x80
00baa620	cmp x14,x16
00baa624	strb w17,[x15], #-0x1
00baa628	b.cs 0x00baa614
00baa62c	cmp x11,x8
00baa630	add x12,x0,x12
00baa634	b.cs 0x00baa700
00baa638	mov w13,#0xa
00baa63c	mov w14,wzr
00baa640	mov w20,#0xffffff98
00baa644	ldrb w15,[x11]
00baa648	sub w16,w15,#0x30
00baa64c	cmp w16,#0x9
00baa650	b.hi 0x00baa678
00baa654	cmp w14,w10
00baa658	b.hi 0x00baa5b0
00baa65c	madd w14,w14,w13,w15
00baa660	add x11,x11,#0x1
00baa664	mov w20,wzr
00baa668	cmp x11,x8
00baa66c	sub w14,w14,#0x30
00baa670	b.cc 0x00baa644
00baa674	b 0x00baa67c
00baa678	cbnz w20,0x00baa5b4
00baa67c	cmp x11,x8
00baa680	b.cs 0x00baa694
00baa684	ldrb w15,[x11]
00baa688	cmp w15,#0x2e
00baa68c	b.ne 0x00baa5b0
00baa690	add x11,x11,#0x1
00baa694	mov x15,xzr
00baa698	sub x0,x12,#0x1
00baa69c	mov w18,w14
00baa6a0	mov x16,x15
00baa6a4	mov x17,x0
00baa6a8	lsr w18,w18,#0x7
00baa6ac	add x15,x15,#0x1
00baa6b0	add x0,x0,#0x1
00baa6b4	cbnz w18,0x00baa6a0
00baa6b8	sub x18,x9,x12
00baa6bc	cmp x18,x16
00baa6c0	b.ls 0x00baa748
00baa6c4	and w18,w14,#0x7f
00baa6c8	cmp x15,#0x2
00baa6cc	strb w18,[x12, x16]
00baa6d0	b.cc 0x00baa6f0
00baa6d4	mov w18,#0x1
00baa6d8	lsr w14,w14,#0x7
00baa6dc	add x18,x18,#0x1
00baa6e0	orr w0,w14,#0x80
00baa6e4	cmp x16,x18
00baa6e8	strb w0,[x17], #-0x1
00baa6ec	b.cs 0x00baa6d8
00baa6f0	cmp x11,x8
00baa6f4	add x12,x12,x15
00baa6f8	b.cc 0x00baa63c
00baa6fc	ldr x0,[x19, #0x10]
00baa700	sub x21,x12,x0
00baa704	mov x20,x0
00baa708	mov w1,#0x1
00baa70c	mov x0,x21
00baa710	bl 0x00c30a30
00baa714	mov x22,x0
00baa718	cbz x0,0x00baa750
00baa71c	mov x0,x22
00baa720	mov x1,x20
00baa724	mov x2,x21
00baa728	bl 0x00c2ffd0
00baa72c	mov x0,x20
00baa730	bl 0x00c30960
00baa734	orr w8,wzr,#0x6
00baa738	mov w20,wzr
00baa73c	stp x21,x22,[x19, #0x8]
00baa740	str w8,[x19]
00baa744	b 0x00baa5c0
00baa748	mov w20,#0xfffffff5
00baa74c	b 0x00baa5b4
00baa750	mov w20,#0xffffff96
00baa754	b 0x00baa5b4
