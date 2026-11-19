; cpr::AcceptEncoding::AcceptEncoding @ 008e539c
008e539c	sub sp,sp,#0xc0
008e53a0	stp x28,x27,[sp, #0x60]
008e53a4	stp x26,x25,[sp, #0x70]
008e53a8	stp x24,x23,[sp, #0x80]
008e53ac	stp x22,x21,[sp, #0x90]
008e53b0	stp x20,x19,[sp, #0xa0]
008e53b4	stp x29,x30,[sp, #0xb0]
008e53b8	add x29,sp,#0xb0
008e53bc	mrs x8,tpidr_el0
008e53c0	str x8,[sp, #0x8]
008e53c4	ldr x8,[x8, #0x28]
008e53c8	movi v0.2D,#0x0
008e53cc	orr w9,wzr,#0x3f800000
008e53d0	mov x19,x0
008e53d4	str x8,[sp, #0x58]
008e53d8	stp q0,q0,[x0]
008e53dc	str w9,[x0, #0x20]
008e53e0	ldr x8,[x1, #0x8]
008e53e4	cbz x8,0x008e577c
008e53e8	ldr x25,[x1]
008e53ec	add x9,sp,#0x30
008e53f0	add x10,x19,#0x10
008e53f4	orr x9,x9,#0x1
008e53f8	add x8,x25,x8, LSL #0x2
008e53fc	str x9,[sp, #0x28]
008e5400	stp x10,x8,[sp, #0x18]
008e5404	str x19,[sp, #0x10]
008e5408	adrp x8,0xd1f000
008e540c	add x8,x8,#0xef8
008e5410	ldr x8,[x8, #0x8]
008e5414	cbz x8,0x008e57b0
008e5418	ldr w9,[x25]
008e541c	ldr w10,[x8, #0x20]
008e5420	cmp w10,w9
008e5424	b.le 0x008e5434
008e5428	ldr x8,[x8]
008e542c	cbnz x8,0x008e541c
008e5430	b 0x008e57b0
008e5434	b.ge 0x008e5444
008e5438	ldr x8,[x8, #0x8]
008e543c	cbnz x8,0x008e541c
008e5440	b 0x008e57b0
008e5444	cbz x8,0x008e57b0
008e5448	stp xzr,xzr,[sp, #0x38]
008e544c	str xzr,[sp, #0x30]
008e5450	ldrb w9,[x8, #0x28]!
008e5454	tbnz w9,#0x0,0x008e546c
008e5458	ldr x9,[x8, #0x10]
008e545c	str x9,[sp, #0x40]
008e5460	ldr q0,[x8]
008e5464	str q0,[sp, #0x30]
008e5468	b 0x008e54cc
008e546c	ldr x20,[x8, #0x8]
008e5470	cmn x20,#0x10
008e5474	b.cs 0x008e57f0
008e5478	ldr x21,[x8, #0x10]
008e547c	cmp x20,#0x17
008e5480	b.cs 0x008e5498
008e5484	ldr x22,[sp, #0x28]
008e5488	lsl w8,w20,#0x1
008e548c	strb w8,[sp, #0x30]
008e5490	cbnz x20,0x008e54b8
008e5494	b 0x008e54c8
008e5498	add x8,x20,#0x10
008e549c	and x23,x8,#-0x10
008e54a0	mov x0,x23
008e54a4	bl 0x00c2fed0
008e54a8	orr x8,x23,#0x1
008e54ac	mov x22,x0
008e54b0	stp x20,x0,[sp, #0x38]
008e54b4	str x8,[sp, #0x30]
008e54b8	mov x0,x22
008e54bc	mov x1,x21
008e54c0	mov x2,x20
008e54c4	bl 0x00c2ffd0
008e54c8	strb wzr,[x22, x20]
008e54cc	ldrb w8,[sp, #0x30]
008e54d0	ldp x10,x9,[sp, #0x38]
008e54d4	lsr w11,w8,#0x1
008e54d8	tst w8,#0x1
008e54dc	ldr x8,[sp, #0x28]
008e54e0	csel x2,x11,x10,eq
008e54e4	csel x1,x8,x9,eq
008e54e8	add x0,sp,#0x50
008e54ec	bl 0x00c30d50
008e54f0	ldr x23,[x19, #0x8]
008e54f4	mov x20,x0
008e54f8	cbz x23,0x008e561c
008e54fc	sub x14,x23,#0x1
008e5500	ands x26,x14,x23
008e5504	b.eq 0x008e5520
008e5508	cmp x20,x23
008e550c	mov x24,x20
008e5510	b.cc 0x008e5524
008e5514	udiv x8,x20,x23
008e5518	msub x24,x8,x23,x20
008e551c	b 0x008e5524
008e5520	and x24,x14,x20
008e5524	ldr x8,[x19]
008e5528	ldr x8,[x8, x24, LSL #0x3]
008e552c	cbz x8,0x008e561c
008e5530	ldr x22,[x8]
008e5534	cbz x22,0x008e561c
008e5538	ldrb w8,[sp, #0x30]
008e553c	ldp x9,x10,[sp, #0x38]
008e5540	and w27,w8,#0x1
008e5544	lsr w11,w8,#0x1
008e5548	tst w8,#0x1
008e554c	ldr x8,[sp, #0x28]
008e5550	csel x21,x11,x9,eq
008e5554	csel x28,x8,x10,eq
008e5558	ldr x8,[x22, #0x8]
008e555c	cmp x8,x20
008e5560	b.eq 0x008e5590
008e5564	cbz x26,0x008e5584
008e5568	cmp x8,x23
008e556c	b.cc 0x008e5588
008e5570	udiv x9,x8,x23
008e5574	msub x8,x9,x23,x8
008e5578	cmp x8,x24
008e557c	b.eq 0x008e5590
008e5580	b 0x008e5618
008e5584	and x8,x8,x14
008e5588	cmp x8,x24
008e558c	b.ne 0x008e5618
008e5590	mov x8,x22
008e5594	ldrb w10,[x8, #0x10]!
008e5598	ldr x11,[x8, #0x8]
008e559c	lsr w9,w10,#0x1
008e55a0	tst w10,#0x1
008e55a4	csel x11,x9,x11,eq
008e55a8	cmp x11,x21
008e55ac	b.ne 0x008e5610
008e55b0	ldr x11,[x22, #0x20]
008e55b4	tst w10,#0x1
008e55b8	csinc x0,x11,x8,ne
008e55bc	tbnz w10,#0x0,0x008e55f4
008e55c0	cbz x21,0x008e56c8
008e55c4	add x8,x8,#0x1
008e55c8	neg x9,x9
008e55cc	mov x10,x28
008e55d0	ldrb w11,[x8]
008e55d4	ldrb w12,[x10]
008e55d8	cmp w11,w12
008e55dc	b.ne 0x008e5610
008e55e0	add x8,x8,#0x1
008e55e4	adds x9,x9,#0x1
008e55e8	add x10,x10,#0x1
008e55ec	b.ne 0x008e55d0
008e55f0	b 0x008e56c8
008e55f4	cbz x21,0x008e56c8
008e55f8	mov x1,x28
008e55fc	mov x2,x21
008e5600	mov x19,x14
008e5604	bl 0x00c300b0
008e5608	mov x14,x19
008e560c	cbz w0,0x008e56c8
008e5610	ldr x22,[x22]
008e5614	cbnz x22,0x008e5558
008e5618	ldr x19,[sp, #0x10]
008e561c	mov w0,#0x28
008e5620	bl 0x00c2fed0
008e5624	ldr x8,[sp, #0x40]
008e5628	ldr q0,[sp, #0x30]
008e562c	stp xzr,xzr,[sp, #0x38]
008e5630	str xzr,[sp, #0x30]
008e5634	str x8,[x0, #0x20]
008e5638	str q0,[x0, #0x10]
008e563c	stp xzr,x20,[x0]
008e5640	ldr x8,[x19, #0x18]
008e5644	ldr s0,[x19, #0x20]
008e5648	mov x21,x0
008e564c	add x8,x8,#0x1
008e5650	ucvtf s1,x8
008e5654	cbz x23,0x008e5668
008e5658	ucvtf s2,x23
008e565c	fmul s2,s0,s2
008e5660	fcmp s2,s1
008e5664	b.pl 0x008e56e4
008e5668	cmp x23,#0x3
008e566c	lsl x8,x23,#0x1
008e5670	b.cc 0x008e5684
008e5674	sub x9,x23,#0x1
008e5678	tst x9,x23
008e567c	cset w9,ne
008e5680	b 0x008e5688
008e5684	mov w9,#0x1
008e5688	fdiv s0,s1,s0
008e568c	orr x8,x9,x8
008e5690	fcvtpu x9,s0
008e5694	cmp x8,x9
008e5698	add x22,x21,#0x10
008e569c	csel x1,x9,x8,cc
008e56a0	mov x0,x19
008e56a4	bl 0x00c30d00
008e56a8	ldr x23,[x19, #0x8]
008e56ac	sub x8,x23,#0x1
008e56b0	tst x8,x23
008e56b4	b.eq 0x008e56d4
008e56b8	cmp x20,x23
008e56bc	b.cs 0x008e56dc
008e56c0	mov x24,x20
008e56c4	b 0x008e56e4
008e56c8	ldr x19,[sp, #0x10]
008e56cc	cbnz w27,0x008e5764
008e56d0	b 0x008e576c
008e56d4	and x24,x8,x20
008e56d8	b 0x008e56e4
008e56dc	udiv x8,x20,x23
008e56e0	msub x24,x8,x23,x20
008e56e4	ldr x9,[x19]
008e56e8	ldr x8,[x9, x24, LSL #0x3]
008e56ec	cbz x8,0x008e56fc
008e56f0	ldr x9,[x8]
008e56f4	str x9,[x21]
008e56f8	b 0x008e5748
008e56fc	ldr x10,[sp, #0x18]
008e5700	ldr x8,[x10]
008e5704	str x8,[x21]
008e5708	str x21,[x10]
008e570c	str x10,[x9, x24, LSL #0x3]
008e5710	ldr x8,[x21]
008e5714	cbz x8,0x008e574c
008e5718	ldr x8,[x8, #0x8]
008e571c	sub x9,x23,#0x1
008e5720	tst x9,x23
008e5724	b.eq 0x008e573c
008e5728	cmp x8,x23
008e572c	b.cc 0x008e5740
008e5730	udiv x9,x8,x23
008e5734	msub x8,x9,x23,x8
008e5738	b 0x008e5740
008e573c	and x8,x8,x9
008e5740	ldr x9,[x19]
008e5744	add x8,x9,x8, LSL #0x3
008e5748	str x21,[x8]
008e574c	ldr x8,[x19, #0x18]
008e5750	add x8,x8,#0x1
008e5754	str x8,[x19, #0x18]
008e5758	ldrb w8,[sp, #0x30]
008e575c	and w27,w8,#0x1
008e5760	cbz w27,0x008e576c
008e5764	ldr x0,[sp, #0x40]
008e5768	bl 0x00c301d0
008e576c	ldr x8,[sp, #0x20]
008e5770	add x25,x25,#0x4
008e5774	cmp x25,x8
008e5778	b.ne 0x008e5408
008e577c	ldr x8,[sp, #0x8]
008e5780	ldr x8,[x8, #0x28]
008e5784	ldr x9,[sp, #0x58]
008e5788	cmp x8,x9
008e578c	b.ne 0x008e57f8
008e5790	ldp x29,x30,[sp, #0xb0]
008e5794	ldp x20,x19,[sp, #0xa0]
008e5798	ldp x22,x21,[sp, #0x90]
008e579c	ldp x24,x23,[sp, #0x80]
008e57a0	ldp x26,x25,[sp, #0x70]
008e57a4	ldp x28,x27,[sp, #0x60]
008e57a8	add sp,sp,#0xc0
008e57ac	ret
008e57b0	mov w0,#0x10
008e57b4	bl 0x00c30000
008e57b8	mov x21,x0
008e57bc	adrp x1,0x29f000
008e57c0	add x1,x1,#0x3b7
008e57c4	bl 0x00c30040
008e57c8	adrp x8,0xcb4000
008e57cc	ldr x8,[x8, #0x9e0]
008e57d0	add x8,x8,#0x10
008e57d4	str x8,[x21]
008e57d8	adrp x1,0xcb4000
008e57dc	adrp x2,0xcb4000
008e57e0	ldr x1,[x1, #0x9d0]
008e57e4	ldr x2,[x2, #0x9d8]
008e57e8	mov x0,x21
008e57ec	bl 0x00c30020
008e57f0	add x0,sp,#0x30
008e57f4	bl 0x00c30ce0
008e57f8	bl 0x00c2fec0
