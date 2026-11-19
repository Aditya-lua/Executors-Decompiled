; FUN_00bdc36c @ 00bdc36c
00bdc36c	paciasp
00bdc370	sub sp,sp,#0x180
00bdc374	stp x29,x30,[sp, #0x120]
00bdc378	stp x28,x27,[sp, #0x130]
00bdc37c	stp x26,x25,[sp, #0x140]
00bdc380	stp x24,x23,[sp, #0x150]
00bdc384	stp x22,x21,[sp, #0x160]
00bdc388	stp x20,x19,[sp, #0x170]
00bdc38c	add x29,sp,#0x120
00bdc390	ldr w8,[x3, #0x8]
00bdc394	mov w9,#0x4a
00bdc398	mov x22,x4
00bdc39c	mov x0,x3
00bdc3a0	mov x21,x2
00bdc3a4	mov x19,x1
00bdc3a8	ands w8,w8,w9
00bdc3ac	sub x26,x29,#0x48
00bdc3b0	str x5,[sp, #0x18]
00bdc3b4	b.eq 0x00bdc3d8
00bdc3b8	cmp w8,#0x40
00bdc3bc	b.eq 0x00bdc3d0
00bdc3c0	cmp w8,#0x8
00bdc3c4	b.ne 0x00bdc3e0
00bdc3c8	mov w23,#0x10
00bdc3cc	b 0x00bdc3e4
00bdc3d0	mov w23,#0x8
00bdc3d4	b 0x00bdc3e4
00bdc3d8	mov w23,wzr
00bdc3dc	b 0x00bdc3e4
00bdc3e0	mov w23,#0xa
00bdc3e4	sub x8,x29,#0x28
00bdc3e8	sub x1,x29,#0xc
00bdc3ec	bl 0x00c0bec0
00bdc3f0	stp xzr,xzr,[x26, #0x8]
00bdc3f4	str xzr,[x26, #0x18]
00bdc3f8	sub x0,x29,#0x40
00bdc3fc	mov w1,#0x16
00bdc400	mov w2,wzr
00bdc404	sub x20,x29,#0x40
00bdc408	bl 0x00c30250
00bdc40c	ldurb w8,[x29, #-0x40]
00bdc410	add x10,sp,#0x38
00bdc414	str x22,[sp, #0x20]
00bdc418	ldr x9,[x26, #0x18]
00bdc41c	str x10,[sp, #0x30]
00bdc420	adrp x28,0xcb5000
00bdc424	tst w8,#0x1
00bdc428	ldr x28,[x28, #0xc08]
00bdc42c	orr x27,x20,#0x1
00bdc430	csinc x24,x9,x20,ne
00bdc434	mov w20,#0x16
00bdc438	add x22,sp,#0x30
00bdc43c	str x24,[x26]
00bdc440	str wzr,[sp, #0x2c]
00bdc444	b 0x00bdc450
00bdc448	add x8,x8,#0x1
00bdc44c	str x8,[x19, #0x18]
00bdc450	cbz x19,0x00bdc47c
00bdc454	ldp x8,x9,[x19, #0x18]
00bdc458	cmp x8,x9
00bdc45c	b.eq 0x00bdc48c
00bdc460	mov w25,wzr
00bdc464	cbz x21,0x00bdc484
00bdc468	ldp x8,x9,[x21, #0x18]
00bdc46c	cmp x8,x9
00bdc470	b.eq 0x00bdc4b0
00bdc474	tbnz w25,#0x0,0x00bdc4d4
00bdc478	b 0x00bdc618
00bdc47c	mov w25,#0x1
00bdc480	cbnz x21,0x00bdc468
00bdc484	tbz w25,#0x0,0x00bdc4d4
00bdc488	b 0x00bdc618
00bdc48c	ldr x8,[x19]
00bdc490	ldr x8,[x8, #0x48]
00bdc494	mov x0,x19
00bdc498	blr x8
00bdc49c	cmn w0,#0x1
00bdc4a0	cset w25,eq
00bdc4a4	csel x19,xzr,x19,eq
00bdc4a8	cbnz x21,0x00bdc468
00bdc4ac	b 0x00bdc484
00bdc4b0	ldr x8,[x21]
00bdc4b4	ldr x8,[x8, #0x48]
00bdc4b8	mov x0,x21
00bdc4bc	blr x8
00bdc4c0	cmn w0,#0x1
00bdc4c4	cset w8,eq
00bdc4c8	csel x21,xzr,x21,eq
00bdc4cc	cmp w25,w8
00bdc4d0	b.eq 0x00bdc618
00bdc4d4	ldurb w8,[x29, #-0x40]
00bdc4d8	ldr x9,[x26, #0x10]
00bdc4dc	ldr x11,[x26]
00bdc4e0	lsr x10,x8,#0x1
00bdc4e4	tst w8,#0x1
00bdc4e8	csel x25,x10,x9,eq
00bdc4ec	add x9,x24,x25
00bdc4f0	cmp x11,x9
00bdc4f4	b.ne 0x00bdc5ac
00bdc4f8	cmp x25,#0x1
00bdc4fc	b.lt 0x00bdc514
00bdc500	sub x0,x29,#0x40
00bdc504	mov x1,x25
00bdc508	mov w2,wzr
00bdc50c	bl 0x00c30250
00bdc510	b 0x00bdc538
00bdc514	lsl x9,x25,#0x1
00bdc518	tbnz w8,#0x0,0x00bdc52c
00bdc51c	lsl w8,w9,#0x1
00bdc520	sturb w8,[x29, #-0x40]
00bdc524	mov x8,x27
00bdc528	b 0x00bdc534
00bdc52c	ldr x8,[x26, #0x18]
00bdc530	str x9,[x26, #0x10]
00bdc534	strb wzr,[x8, x9]
00bdc538	ldp x9,x10,[x26, #0x8]
00bdc53c	ldurb w8,[x29, #-0x40]
00bdc540	tst w8,#0x1
00bdc544	and x11,x9,#-0x2
00bdc548	ubfx x12,x9,#0x1,#0x7
00bdc54c	sub x11,x11,#0x1
00bdc550	csel x8,x20,x11,eq
00bdc554	tst x9,#0x1
00bdc558	csel x10,x12,x10,eq
00bdc55c	subs x1,x8,x10
00bdc560	b.ls 0x00bdc574
00bdc564	sub x0,x29,#0x40
00bdc568	mov w2,wzr
00bdc56c	bl 0x00c30250
00bdc570	b 0x00bdc594
00bdc574	tbnz w9,#0x0,0x00bdc588
00bdc578	lsl w9,w8,#0x1
00bdc57c	sturb w9,[x29, #-0x40]
00bdc580	mov x9,x27
00bdc584	b 0x00bdc590
00bdc588	ldr x9,[x26, #0x18]
00bdc58c	str x8,[x26, #0x10]
00bdc590	strb wzr,[x9, x8]
00bdc594	ldurb w8,[x29, #-0x40]
00bdc598	ldr x9,[x26, #0x18]
00bdc59c	tst w8,#0x1
00bdc5a0	csel x24,x27,x9,eq
00bdc5a4	add x8,x24,x25
00bdc5a8	str x8,[x26]
00bdc5ac	ldp x8,x9,[x19, #0x18]
00bdc5b0	cmp x8,x9
00bdc5b4	b.eq 0x00bdc5c0
00bdc5b8	ldrb w0,[x8]
00bdc5bc	b 0x00bdc5d0
00bdc5c0	ldr x8,[x19]
00bdc5c4	ldr x8,[x8, #0x48]
00bdc5c8	mov x0,x19
00bdc5cc	blr x8
00bdc5d0	ldurb w5,[x29, #-0xc]
00bdc5d4	sub x3,x29,#0x48
00bdc5d8	add x4,sp,#0x2c
00bdc5dc	sub x6,x29,#0x28
00bdc5e0	add x7,sp,#0x38
00bdc5e4	mov w1,w23
00bdc5e8	mov x2,x24
00bdc5ec	stp x22,x28,[sp]
00bdc5f0	bl 0x00c440f0
00bdc5f4	cbnz w0,0x00bdc618
00bdc5f8	ldp x8,x9,[x19, #0x18]
00bdc5fc	cmp x8,x9
00bdc600	b.ne 0x00bdc448
00bdc604	ldr x8,[x19]
00bdc608	ldr x8,[x8, #0x50]
00bdc60c	mov x0,x19
00bdc610	blr x8
00bdc614	b 0x00bdc450
00bdc618	ldurb w8,[x29, #-0x28]
00bdc61c	ldr x9,[x26, #0x28]
00bdc620	ldr x22,[sp, #0x20]
00bdc624	lsr x10,x8,#0x1
00bdc628	tst w8,#0x1
00bdc62c	csel x8,x10,x9,eq
00bdc630	cbz x8,0x00bdc654
00bdc634	ldr x8,[sp, #0x30]
00bdc638	add x9,sp,#0x38
00bdc63c	sub x9,x8,x9
00bdc640	cmp x9,#0x9f
00bdc644	b.gt 0x00bdc654
00bdc648	ldr w9,[sp, #0x2c]
00bdc64c	str w9,[x8], #0x4
00bdc650	str x8,[sp, #0x30]
00bdc654	ldr x1,[x26]
00bdc658	mov x0,x24
00bdc65c	mov x2,x22
00bdc660	mov w3,w23
00bdc664	bl 0x00c0c4ac
00bdc668	ldurb w10,[x29, #-0x28]
00bdc66c	ldr x12,[sp, #0x30]
00bdc670	add x11,sp,#0x38
00bdc674	ldr x8,[x26, #0x28]
00bdc678	lsr x9,x10,#0x1
00bdc67c	ands w13,w10,#0x1
00bdc680	sub x11,x12,x11
00bdc684	csel x8,x9,x8,eq
00bdc688	ldr x9,[sp, #0x18]
00bdc68c	cmp x11,#0x5
00bdc690	str x0,[x9]
00bdc694	b.lt 0x00bdc7f4
00bdc698	cbz x8,0x00bdc7f4
00bdc69c	sub x8,x12,#0x4
00bdc6a0	add x9,sp,#0x38
00bdc6a4	cmp x9,x8
00bdc6a8	cset w11,cc
00bdc6ac	cmp x9,x12
00bdc6b0	b.eq 0x00bdc760
00bdc6b4	cbz w11,0x00bdc760
00bdc6b8	add x10,sp,#0x38
00bdc6bc	sub x14,x12,#0x8
00bdc6c0	add x11,x10,#0x4
00bdc6c4	cmp x14,x11
00bdc6c8	csel x13,x14,x11,hi
00bdc6cc	sub x13,x13,#0x4
00bdc6d0	cmp x13,x10
00bdc6d4	cinc x15,x10,ne
00bdc6d8	cmp x13,x10
00bdc6dc	sub x15,x13,x15
00bdc6e0	lsr x15,x15,#0x3
00bdc6e4	cinc x13,x15,ne
00bdc6e8	cmp x13,#0x13
00bdc6ec	b.cc 0x00bdc734
00bdc6f0	cmp x14,x11
00bdc6f4	csel x14,x14,x11,hi
00bdc6f8	sub x14,x14,#0x4
00bdc6fc	cmp x14,x10
00bdc700	cinc x15,x10,ne
00bdc704	cmp x14,x10
00bdc708	sub x15,x14,x15
00bdc70c	lsr x15,x15,#0x3
00bdc710	cinc x14,x15,ne
00bdc714	cmp x10,x12
00bdc718	b.cs 0x00bdc8d8
00bdc71c	lsl x14,x14,#0x2
00bdc720	sub x15,x12,x14
00bdc724	add x11,x11,x14
00bdc728	sub x14,x15,#0x4
00bdc72c	cmp x14,x11
00bdc730	b.cs 0x00bdc8d8
00bdc734	mov x11,x8
00bdc738	add x10,x10,#0x4
00bdc73c	ldr w12,[x11]
00bdc740	ldur w13,[x10, #-0x4]
00bdc744	stur w12,[x10, #-0x4]
00bdc748	str w13,[x11], #-0x4
00bdc74c	cmp x10,x11
00bdc750	add x10,x10,#0x4
00bdc754	b.cc 0x00bdc73c
00bdc758	ldurb w10,[x29, #-0x28]
00bdc75c	and w13,w10,#0x1
00bdc760	ldr x11,[x26, #0x30]
00bdc764	cmp w13,#0x0
00bdc768	sub x12,x29,#0x28
00bdc76c	csinc x11,x11,x12,ne
00bdc770	cmp x9,x8
00bdc774	b.cs 0x00bdc7cc
00bdc778	lsr w9,w10,#0x1
00bdc77c	ldr x10,[x26, #0x28]
00bdc780	cmp w13,#0x0
00bdc784	csel x9,x9,x10,eq
00bdc788	add x10,sp,#0x38
00bdc78c	add x9,x11,x9
00bdc790	b 0x00bdc7ac
00bdc794	sub x12,x9,x11
00bdc798	add x10,x10,#0x4
00bdc79c	cmp x12,#0x1
00bdc7a0	cinc x11,x11,gt
00bdc7a4	cmp x10,x8
00bdc7a8	b.cs 0x00bdc7cc
00bdc7ac	ldrb w12,[x11]
00bdc7b0	cbz w12,0x00bdc794
00bdc7b4	cmp w12,#0xff
00bdc7b8	b.eq 0x00bdc794
00bdc7bc	ldr w13,[x10]
00bdc7c0	cmp w13,w12
00bdc7c4	b.eq 0x00bdc794
00bdc7c8	b 0x00bdc7ec
00bdc7cc	ldrb w9,[x11]
00bdc7d0	cbz w9,0x00bdc7f4
00bdc7d4	cmp w9,#0xff
00bdc7d8	b.eq 0x00bdc7f4
00bdc7dc	ldr w8,[x8]
00bdc7e0	sub w8,w8,#0x1
00bdc7e4	cmp w8,w9
00bdc7e8	b.cc 0x00bdc7f4
00bdc7ec	mov w8,#0x4
00bdc7f0	str w8,[x22]
00bdc7f4	cbz x19,0x00bdc880
00bdc7f8	ldp x8,x9,[x19, #0x18]
00bdc7fc	cmp x8,x9
00bdc800	b.eq 0x00bdc890
00bdc804	mov w20,wzr
00bdc808	cbz x21,0x00bdc888
00bdc80c	ldp x8,x9,[x21, #0x18]
00bdc810	cmp x8,x9
00bdc814	b.eq 0x00bdc8b4
00bdc818	tbnz w20,#0x0,0x00bdc828
00bdc81c	ldr w8,[x22]
00bdc820	orr w8,w8,#0x2
00bdc824	str w8,[x22]
00bdc828	ldurb w8,[x29, #-0x40]
00bdc82c	tbz w8,#0x0,0x00bdc840
00bdc830	ldr x8,[x26, #0x8]
00bdc834	ldr x0,[x26, #0x18]
00bdc838	and x1,x8,#-0x2
00bdc83c	bl 0x00c2fe80
00bdc840	ldurb w8,[x29, #-0x28]
00bdc844	tbz w8,#0x0,0x00bdc858
00bdc848	ldr x8,[x26, #0x20]
00bdc84c	ldr x0,[x26, #0x30]
00bdc850	and x1,x8,#-0x2
00bdc854	bl 0x00c2fe80
00bdc858	mov x0,x19
00bdc85c	ldp x20,x19,[sp, #0x170]
00bdc860	ldp x22,x21,[sp, #0x160]
00bdc864	ldp x24,x23,[sp, #0x150]
00bdc868	ldp x26,x25,[sp, #0x140]
00bdc86c	ldp x28,x27,[sp, #0x130]
00bdc870	ldp x29,x30,[sp, #0x120]
00bdc874	add sp,sp,#0x180
00bdc878	autiasp
00bdc87c	ret
00bdc880	mov w20,#0x1
00bdc884	cbnz x21,0x00bdc80c
00bdc888	tbnz w20,#0x0,0x00bdc81c
00bdc88c	b 0x00bdc828
00bdc890	ldr x8,[x19]
00bdc894	ldr x8,[x8, #0x48]
00bdc898	mov x0,x19
00bdc89c	blr x8
00bdc8a0	cmn w0,#0x1
00bdc8a4	cset w20,eq
00bdc8a8	csel x19,xzr,x19,eq
00bdc8ac	cbnz x21,0x00bdc80c
00bdc8b0	b 0x00bdc888
00bdc8b4	ldr x8,[x21]
00bdc8b8	ldr x8,[x8, #0x48]
00bdc8bc	mov x0,x21
00bdc8c0	blr x8
00bdc8c4	cmn w0,#0x1
00bdc8c8	cset w8,eq
00bdc8cc	eor w8,w20,w8
00bdc8d0	tbz w8,#0x0,0x00bdc81c
00bdc8d4	b 0x00bdc828
00bdc8d8	add x13,x13,#0x1
00bdc8dc	add x15,sp,#0x38
00bdc8e0	sub x12,x12,#0x10
00bdc8e4	and x14,x13,#0x7ffffffffffffff8
00bdc8e8	lsl x10,x14,#0x2
00bdc8ec	mov x16,x14
00bdc8f0	sub x11,x8,x10
00bdc8f4	add x10,x15,x10
00bdc8f8	add x15,x15,#0x10
00bdc8fc	ldp q1,q0,[x12, #-0x10]
00bdc900	sub x16,x16,#0x8
00bdc904	ldp q2,q3,[x15, #-0x10]
00bdc908	rev64 v0.4S,v0.4S
00bdc90c	rev64 v1.4S,v1.4S
00bdc910	rev64 v2.4S,v2.4S
00bdc914	rev64 v3.4S,v3.4S
00bdc918	ext v0.16B,v0.16B,v0.16B,0x8
00bdc91c	ext v1.16B,v1.16B,v1.16B,0x8
00bdc920	ext v2.16B,v2.16B,v2.16B,0x8
00bdc924	ext v3.16B,v3.16B,v3.16B,0x8
00bdc928	stp q0,q1,[x15, #-0x10]
00bdc92c	add x15,x15,#0x20
00bdc930	stp q3,q2,[x12, #-0x10]
00bdc934	sub x12,x12,#0x20
00bdc938	cbnz x16,0x00bdc8fc
00bdc93c	cmp x13,x14
00bdc940	b.eq 0x00bdc758
00bdc944	b 0x00bdc738
