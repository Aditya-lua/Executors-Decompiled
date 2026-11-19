; FUN_00b2a430 @ 00b2a430
00b2a430	stp x28,x27,[sp, #-0x60]!
00b2a434	stp x26,x25,[sp, #0x10]
00b2a438	stp x24,x23,[sp, #0x20]
00b2a43c	stp x22,x21,[sp, #0x30]
00b2a440	stp x20,x19,[sp, #0x40]
00b2a444	stp x29,x30,[sp, #0x50]
00b2a448	ldr w9,[x0, #0x130]
00b2a44c	mov x19,x0
00b2a450	add x29,sp,#0x50
00b2a454	cbz w9,0x00b2a4ec
00b2a458	cbz x3,0x00b2a4f8
00b2a45c	cmp w9,#0x3f
00b2a460	b.hi 0x00b2a4f8
00b2a464	orr w10,wzr,#0x3f
00b2a468	sub w10,w10,w9
00b2a46c	neg x8,x3
00b2a470	mvn x11,x10
00b2a474	cmp x8,x11
00b2a478	csinv x8,x8,x10,hi
00b2a47c	neg x11,x8
00b2a480	cmp x11,#0x20
00b2a484	add x8,x19,#0xf0
00b2a488	b.cs 0x00b2a68c
00b2a48c	mov w10,w9
00b2a490	mov x20,x1
00b2a494	mov x21,x2
00b2a498	mov x9,xzr
00b2a49c	mov w10,w10
00b2a4a0	sub x11,x3,#0x1
00b2a4a4	add x12,x10,x9
00b2a4a8	ldrb w13,[x21, x9]
00b2a4ac	ldrb w14,[x8, w12, UXTW ]
00b2a4b0	cmp x11,x9
00b2a4b4	eor w13,w14,w13
00b2a4b8	strb w13,[x20, x9]
00b2a4bc	add x9,x9,#0x1
00b2a4c0	b.eq 0x00b2a4d0
00b2a4c4	add w12,w12,#0x1
00b2a4c8	cmp w12,#0x40
00b2a4cc	b.cc 0x00b2a4a4
00b2a4d0	add w10,w10,w9
00b2a4d4	add x20,x20,x9
00b2a4d8	sub x3,x3,x9
00b2a4dc	add x21,x21,x9
00b2a4e0	str w10,[x19, #0x130]
00b2a4e4	cbnz x3,0x00b2a50c
00b2a4e8	b 0x00b2a76c
00b2a4ec	mov x21,x2
00b2a4f0	mov x20,x1
00b2a4f4	b 0x00b2a534
00b2a4f8	mov x21,x2
00b2a4fc	mov x20,x1
00b2a500	mov w10,w9
00b2a504	str w10,[x19, #0x130]
00b2a508	cbz x3,0x00b2a76c
00b2a50c	cmp w10,#0x40
00b2a510	b.ne 0x00b2a534
00b2a514	ldr w8,[x19, #0xe0]
00b2a518	str wzr,[x19, #0x130]
00b2a51c	adds w8,w8,#0x1
00b2a520	str w8,[x19, #0xe0]
00b2a524	b.ne 0x00b2a534
00b2a528	ldr w8,[x19, #0xe4]
00b2a52c	add w8,w8,#0x1
00b2a530	str w8,[x19, #0xe4]
00b2a534	and w25,w3,#0x3f
00b2a538	sub x26,x3,x25
00b2a53c	cmp x26,#0x40
00b2a540	add x22,x19,#0xe0
00b2a544	b.cc 0x00b2a5c8
00b2a548	ldr w28,[x19, #0xe0]
00b2a54c	add x23,x19,#0xc0
00b2a550	mov w27,#0x10000000
00b2a554	lsr x9,x26,#0x22
00b2a558	lsr x8,x26,#0x6
00b2a55c	cmp x9,#0x0
00b2a560	csel x8,x8,x27,eq
00b2a564	add w9,w28,w8
00b2a568	cmp x8,x9
00b2a56c	csel w28,wzr,w9,hi
00b2a570	csel x9,x9,xzr,hi
00b2a574	sub x8,x8,x9
00b2a578	lsl x24,x8,#0x6
00b2a57c	mov x0,x20
00b2a580	mov x1,x21
00b2a584	mov x2,x24
00b2a588	mov x3,x23
00b2a58c	mov x4,x22
00b2a590	bl 0x00c392e0
00b2a594	sub x26,x26,x24
00b2a598	add x21,x21,x24
00b2a59c	add x20,x20,x24
00b2a5a0	str w28,[x22]
00b2a5a4	cbz w28,0x00b2a5b4
00b2a5a8	cmp x26,#0x3f
00b2a5ac	b.hi 0x00b2a554
00b2a5b0	b 0x00b2a5c8
00b2a5b4	ldr w8,[x19, #0xe4]
00b2a5b8	add w8,w8,#0x1
00b2a5bc	str w8,[x19, #0xe4]
00b2a5c0	cmp x26,#0x3f
00b2a5c4	b.hi 0x00b2a554
00b2a5c8	cbz w25,0x00b2a76c
00b2a5cc	movi v0.2D,#0x0
00b2a5d0	mov x0,x19
00b2a5d4	str q0,[x0, #0xf0]!
00b2a5d8	sub x3,x0,#0x30
00b2a5dc	mov w2,#0x40
00b2a5e0	mov x1,x0
00b2a5e4	mov x4,x22
00b2a5e8	stp q0,q0,[x0, #0x20]
00b2a5ec	str q0,[x0, #0x10]
00b2a5f0	bl 0x00c392e0
00b2a5f4	cmp w25,#0x20
00b2a5f8	mov x8,xzr
00b2a5fc	b.cc 0x00b2a73c
00b2a600	add x8,x21,x25
00b2a604	add x9,x20,x25
00b2a608	add x10,x19,#0xf0
00b2a60c	cmp x20,x8
00b2a610	add x11,x10,x25
00b2a614	cset w8,cc
00b2a618	cmp x21,x9
00b2a61c	cset w12,cc
00b2a620	cmp x20,x11
00b2a624	and w11,w8,w12
00b2a628	cset w8,cc
00b2a62c	cmp x9,x10
00b2a630	cset w9,hi
00b2a634	tbnz w11,#0x0,0x00b2a738
00b2a638	and w9,w8,w9
00b2a63c	mov x8,xzr
00b2a640	tbnz w9,#0x0,0x00b2a73c
00b2a644	and x8,x25,#0x20
00b2a648	add x9,x21,#0x10
00b2a64c	add x10,x20,#0x10
00b2a650	add x11,x19,#0x100
00b2a654	mov x12,x8
00b2a658	ldp q0,q1,[x9, #-0x10]
00b2a65c	ldp q2,q3,[x11, #-0x10]
00b2a660	subs x12,x12,#0x20
00b2a664	add x9,x9,#0x20
00b2a668	add x11,x11,#0x20
00b2a66c	eor v0.16B,v2.16B,v0.16B
00b2a670	eor v1.16B,v3.16B,v1.16B
00b2a674	stp q0,q1,[x10, #-0x10]
00b2a678	add x10,x10,#0x20
00b2a67c	b.ne 0x00b2a658
00b2a680	cmp x8,x25
00b2a684	b.ne 0x00b2a73c
00b2a688	b 0x00b2a768
00b2a68c	neg x12,x3
00b2a690	mvn x13,x10
00b2a694	cmp x12,x13
00b2a698	csinv x10,x12,x10,hi
00b2a69c	sub x13,x2,x10
00b2a6a0	sub x12,x1,x10
00b2a6a4	sub x10,x9,x10
00b2a6a8	cmp x13,x1
00b2a6ac	add x10,x8,x10
00b2a6b0	cset w13,hi
00b2a6b4	cmp x12,x2
00b2a6b8	add x14,x8,x9
00b2a6bc	cset w15,hi
00b2a6c0	cmp x10,x1
00b2a6c4	cset w10,hi
00b2a6c8	cmp x14,x12
00b2a6cc	and w13,w13,w15
00b2a6d0	cset w12,cc
00b2a6d4	tbnz w13,#0x0,0x00b2a48c
00b2a6d8	and w10,w10,w12
00b2a6dc	tbnz w10,#0x0,0x00b2a48c
00b2a6e0	and x12,x11,#0x1ffffffe0
00b2a6e4	add x13,x2,#0x10
00b2a6e8	add w10,w9,w12
00b2a6ec	add x20,x1,x12
00b2a6f0	sub x3,x3,x12
00b2a6f4	add x21,x2,x12
00b2a6f8	add x14,x1,#0x10
00b2a6fc	mov x15,x12
00b2a700	add x16,x8,w9, UXTW 
00b2a704	ldp q0,q1,[x13, #-0x10]
00b2a708	ldp q2,q3,[x16]
00b2a70c	add x13,x13,#0x20
00b2a710	subs x15,x15,#0x20
00b2a714	add w9,w9,#0x20
00b2a718	eor v0.16B,v2.16B,v0.16B
00b2a71c	eor v1.16B,v3.16B,v1.16B
00b2a720	stp q0,q1,[x14, #-0x10]
00b2a724	add x14,x14,#0x20
00b2a728	b.ne 0x00b2a700
00b2a72c	cmp x12,x11
00b2a730	b.ne 0x00b2a498
00b2a734	b 0x00b2a504
00b2a738	mov x8,xzr
00b2a73c	add x11,x19,x8
00b2a740	add x9,x21,x8
00b2a744	add x10,x20,x8
00b2a748	add x11,x11,#0xf0
00b2a74c	sub x8,x25,x8
00b2a750	ldrb w12,[x9], #0x1
00b2a754	ldrb w13,[x11], #0x1
00b2a758	subs x8,x8,#0x1
00b2a75c	eor w12,w13,w12
00b2a760	strb w12,[x10], #0x1
00b2a764	b.ne 0x00b2a750
00b2a768	str w25,[x19, #0x130]
00b2a76c	ldp x29,x30,[sp, #0x50]
00b2a770	ldp x20,x19,[sp, #0x40]
00b2a774	ldp x22,x21,[sp, #0x30]
00b2a778	ldp x24,x23,[sp, #0x20]
00b2a77c	ldp x26,x25,[sp, #0x10]
00b2a780	mov w0,#0x1
00b2a784	ldp x28,x27,[sp], #0x60
00b2a788	ret
