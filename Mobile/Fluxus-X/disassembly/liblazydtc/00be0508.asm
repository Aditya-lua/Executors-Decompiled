; FUN_00be0508 @ 00be0508
00be0508	paciasp
00be050c	sub sp,sp,#0x1e0
00be0510	stp x29,x30,[sp, #0x180]
00be0514	stp x28,x27,[sp, #0x190]
00be0518	stp x26,x25,[sp, #0x1a0]
00be051c	stp x24,x23,[sp, #0x1b0]
00be0520	stp x22,x21,[sp, #0x1c0]
00be0524	stp x20,x19,[sp, #0x1d0]
00be0528	add x29,sp,#0x180
00be052c	ldr w8,[x3, #0x8]
00be0530	mov w9,#0x4a
00be0534	mov x25,x3
00be0538	mov x20,x2
00be053c	mov x21,x1
00be0540	sub x27,x29,#0xb0
00be0544	ands w8,w8,w9
00be0548	stp x5,x4,[sp, #0x10]
00be054c	b.eq 0x00be0570
00be0550	cmp w8,#0x40
00be0554	b.eq 0x00be0568
00be0558	cmp w8,#0x8
00be055c	b.ne 0x00be0578
00be0560	mov w23,#0x10
00be0564	b 0x00be057c
00be0568	mov w23,#0x8
00be056c	b 0x00be057c
00be0570	mov w23,wzr
00be0574	b 0x00be057c
00be0578	mov w23,#0xa
00be057c	sub x2,x29,#0x74
00be0580	mov x1,x25
00be0584	bl 0x00c0cb44
00be0588	mov x24,x0
00be058c	sub x8,x29,#0x90
00be0590	sub x1,x29,#0xc
00be0594	mov x0,x25
00be0598	bl 0x00c0cc28
00be059c	stp xzr,xzr,[x27, #0x8]
00be05a0	str xzr,[x27, #0x18]
00be05a4	sub x0,x29,#0xa8
00be05a8	mov w1,#0x16
00be05ac	mov w2,wzr
00be05b0	sub x19,x29,#0xa8
00be05b4	bl 0x00c30250
00be05b8	ldurb w8,[x29, #-0xa8]
00be05bc	ldr x9,[x27, #0x18]
00be05c0	add x10,sp,#0x30
00be05c4	orr x28,x19,#0x1
00be05c8	add x22,sp,#0x28
00be05cc	str x10,[sp, #0x28]
00be05d0	tst w8,#0x1
00be05d4	str wzr,[sp, #0x24]
00be05d8	csinc x25,x9,x19,ne
00be05dc	mov w19,#0x16
00be05e0	str x25,[x27]
00be05e4	b 0x00be05f0
00be05e8	add x8,x8,#0x4
00be05ec	str x8,[x21, #0x18]
00be05f0	cbz x21,0x00be0608
00be05f4	ldp x8,x9,[x21, #0x18]
00be05f8	cmp x8,x9
00be05fc	b.eq 0x00be0618
00be0600	ldr w0,[x8]
00be0604	b 0x00be0628
00be0608	mov w26,#0x1
00be060c	cbnz x20,0x00be0638
00be0610	tbz w26,#0x0,0x00be0670
00be0614	b 0x00be07b4
00be0618	ldr x8,[x21]
00be061c	ldr x8,[x8, #0x48]
00be0620	mov x0,x21
00be0624	blr x8
00be0628	cmn w0,#0x1
00be062c	cset w26,eq
00be0630	csel x21,xzr,x21,eq
00be0634	cbz x20,0x00be0610
00be0638	ldp x8,x9,[x20, #0x18]
00be063c	cmp x8,x9
00be0640	b.eq 0x00be064c
00be0644	ldr w0,[x8]
00be0648	b 0x00be065c
00be064c	ldr x8,[x20]
00be0650	ldr x8,[x8, #0x48]
00be0654	mov x0,x20
00be0658	blr x8
00be065c	cmn w0,#0x1
00be0660	cset w8,eq
00be0664	csel x20,xzr,x20,eq
00be0668	cmp w26,w8
00be066c	b.eq 0x00be07b4
00be0670	ldurb w8,[x29, #-0xa8]
00be0674	ldr x9,[x27, #0x10]
00be0678	ldr x11,[x27]
00be067c	lsr x10,x8,#0x1
00be0680	tst w8,#0x1
00be0684	csel x26,x10,x9,eq
00be0688	add x9,x25,x26
00be068c	cmp x11,x9
00be0690	b.ne 0x00be0748
00be0694	cmp x26,#0x1
00be0698	b.lt 0x00be06b0
00be069c	sub x0,x29,#0xa8
00be06a0	mov x1,x26
00be06a4	mov w2,wzr
00be06a8	bl 0x00c30250
00be06ac	b 0x00be06d4
00be06b0	lsl x9,x26,#0x1
00be06b4	tbnz w8,#0x0,0x00be06c8
00be06b8	lsl w8,w9,#0x1
00be06bc	sturb w8,[x29, #-0xa8]
00be06c0	mov x8,x28
00be06c4	b 0x00be06d0
00be06c8	ldr x8,[x27, #0x18]
00be06cc	str x9,[x27, #0x10]
00be06d0	strb wzr,[x8, x9]
00be06d4	ldp x9,x10,[x27, #0x8]
00be06d8	ldurb w8,[x29, #-0xa8]
00be06dc	tst w8,#0x1
00be06e0	and x11,x9,#-0x2
00be06e4	ubfx x12,x9,#0x1,#0x7
00be06e8	sub x11,x11,#0x1
00be06ec	csel x8,x19,x11,eq
00be06f0	tst x9,#0x1
00be06f4	csel x10,x12,x10,eq
00be06f8	subs x1,x8,x10
00be06fc	b.ls 0x00be0710
00be0700	sub x0,x29,#0xa8
00be0704	mov w2,wzr
00be0708	bl 0x00c30250
00be070c	b 0x00be0730
00be0710	tbnz w9,#0x0,0x00be0724
00be0714	lsl w9,w8,#0x1
00be0718	sturb w9,[x29, #-0xa8]
00be071c	mov x9,x28
00be0720	b 0x00be072c
00be0724	ldr x9,[x27, #0x18]
00be0728	str x8,[x27, #0x10]
00be072c	strb wzr,[x9, x8]
00be0730	ldurb w8,[x29, #-0xa8]
00be0734	ldr x9,[x27, #0x18]
00be0738	tst w8,#0x1
00be073c	csel x25,x28,x9,eq
00be0740	add x8,x25,x26
00be0744	str x8,[x27]
00be0748	ldp x8,x9,[x21, #0x18]
00be074c	cmp x8,x9
00be0750	b.eq 0x00be075c
00be0754	ldr w0,[x8]
00be0758	b 0x00be076c
00be075c	ldr x8,[x21]
00be0760	ldr x8,[x8, #0x48]
00be0764	mov x0,x21
00be0768	blr x8
00be076c	ldur w5,[x29, #-0xc]
00be0770	sub x3,x29,#0xb0
00be0774	add x4,sp,#0x24
00be0778	sub x6,x29,#0x90
00be077c	add x7,sp,#0x30
00be0780	mov w1,w23
00be0784	mov x2,x25
00be0788	stp x22,x24,[sp]
00be078c	bl 0x00c44120
00be0790	cbnz w0,0x00be07b4
00be0794	ldp x8,x9,[x21, #0x18]
00be0798	cmp x8,x9
00be079c	b.ne 0x00be05e8
00be07a0	ldr x8,[x21]
00be07a4	ldr x8,[x8, #0x50]
00be07a8	mov x0,x21
00be07ac	blr x8
00be07b0	b 0x00be05f0
00be07b4	ldurb w8,[x29, #-0x90]
00be07b8	ldr x9,[x27, #0x28]
00be07bc	ldr x22,[sp, #0x18]
00be07c0	lsr x10,x8,#0x1
00be07c4	tst w8,#0x1
00be07c8	csel x8,x10,x9,eq
00be07cc	cbz x8,0x00be07f0
00be07d0	ldr x8,[sp, #0x28]
00be07d4	add x9,sp,#0x30
00be07d8	sub x9,x8,x9
00be07dc	cmp x9,#0x9f
00be07e0	b.gt 0x00be07f0
00be07e4	ldr w9,[sp, #0x24]
00be07e8	str w9,[x8], #0x4
00be07ec	str x8,[sp, #0x28]
00be07f0	ldr x1,[x27]
00be07f4	mov x0,x25
00be07f8	mov x2,x22
00be07fc	mov w3,w23
00be0800	bl 0x00c0c354
00be0804	ldurb w10,[x29, #-0x90]
00be0808	ldr x12,[sp, #0x28]
00be080c	add x11,sp,#0x30
00be0810	ldr x8,[x27, #0x28]
00be0814	lsr x9,x10,#0x1
00be0818	ands w13,w10,#0x1
00be081c	sub x11,x12,x11
00be0820	csel x8,x9,x8,eq
00be0824	ldr x9,[sp, #0x10]
00be0828	cmp x11,#0x5
00be082c	str w0,[x9]
00be0830	b.lt 0x00be0990
00be0834	cbz x8,0x00be0990
00be0838	sub x8,x12,#0x4
00be083c	add x9,sp,#0x30
00be0840	cmp x9,x8
00be0844	cset w11,cc
00be0848	cmp x9,x12
00be084c	b.eq 0x00be08fc
00be0850	cbz w11,0x00be08fc
00be0854	add x10,sp,#0x30
00be0858	sub x14,x12,#0x8
00be085c	add x11,x10,#0x4
00be0860	cmp x14,x11
00be0864	csel x13,x14,x11,hi
00be0868	sub x13,x13,#0x4
00be086c	cmp x13,x10
00be0870	cinc x15,x10,ne
00be0874	cmp x13,x10
00be0878	sub x15,x13,x15
00be087c	lsr x15,x15,#0x3
00be0880	cinc x13,x15,ne
00be0884	cmp x13,#0x13
00be0888	b.cc 0x00be08d0
00be088c	cmp x14,x11
00be0890	csel x14,x14,x11,hi
00be0894	sub x14,x14,#0x4
00be0898	cmp x14,x10
00be089c	cinc x15,x10,ne
00be08a0	cmp x14,x10
00be08a4	sub x15,x14,x15
00be08a8	lsr x15,x15,#0x3
00be08ac	cinc x14,x15,ne
00be08b0	cmp x10,x12
00be08b4	b.cs 0x00be0a70
00be08b8	lsl x14,x14,#0x2
00be08bc	sub x15,x12,x14
00be08c0	add x11,x11,x14
00be08c4	sub x14,x15,#0x4
00be08c8	cmp x14,x11
00be08cc	b.cs 0x00be0a70
00be08d0	mov x11,x8
00be08d4	add x10,x10,#0x4
00be08d8	ldr w12,[x11]
00be08dc	ldur w13,[x10, #-0x4]
00be08e0	stur w12,[x10, #-0x4]
00be08e4	str w13,[x11], #-0x4
00be08e8	cmp x10,x11
00be08ec	add x10,x10,#0x4
00be08f0	b.cc 0x00be08d8
00be08f4	ldurb w10,[x29, #-0x90]
00be08f8	and w13,w10,#0x1
00be08fc	ldr x11,[x27, #0x30]
00be0900	cmp w13,#0x0
00be0904	sub x12,x29,#0x90
00be0908	csinc x11,x11,x12,ne
00be090c	cmp x9,x8
00be0910	b.cs 0x00be0968
00be0914	lsr w9,w10,#0x1
00be0918	ldr x10,[x27, #0x28]
00be091c	cmp w13,#0x0
00be0920	csel x9,x9,x10,eq
00be0924	add x10,sp,#0x30
00be0928	add x9,x11,x9
00be092c	b 0x00be0948
00be0930	sub x12,x9,x11
00be0934	add x10,x10,#0x4
00be0938	cmp x12,#0x1
00be093c	cinc x11,x11,gt
00be0940	cmp x10,x8
00be0944	b.cs 0x00be0968
00be0948	ldrb w12,[x11]
00be094c	cbz w12,0x00be0930
00be0950	cmp w12,#0xff
00be0954	b.eq 0x00be0930
00be0958	ldr w13,[x10]
00be095c	cmp w13,w12
00be0960	b.eq 0x00be0930
00be0964	b 0x00be0988
00be0968	ldrb w9,[x11]
00be096c	cbz w9,0x00be0990
00be0970	cmp w9,#0xff
00be0974	b.eq 0x00be0990
00be0978	ldr w8,[x8]
00be097c	sub w8,w8,#0x1
00be0980	cmp w8,w9
00be0984	b.cc 0x00be0990
00be0988	mov w8,#0x4
00be098c	str w8,[x22]
00be0990	cbz x21,0x00be09a8
00be0994	ldp x8,x9,[x21, #0x18]
00be0998	cmp x8,x9
00be099c	b.eq 0x00be09b8
00be09a0	ldr w0,[x8]
00be09a4	b 0x00be09c8
00be09a8	mov w19,#0x1
00be09ac	cbnz x20,0x00be09d8
00be09b0	tbnz w19,#0x0,0x00be0a0c
00be09b4	b 0x00be0a18
00be09b8	ldr x8,[x21]
00be09bc	ldr x8,[x8, #0x48]
00be09c0	mov x0,x21
00be09c4	blr x8
00be09c8	cmn w0,#0x1
00be09cc	cset w19,eq
00be09d0	csel x21,xzr,x21,eq
00be09d4	cbz x20,0x00be09b0
00be09d8	ldp x8,x9,[x20, #0x18]
00be09dc	cmp x8,x9
00be09e0	b.eq 0x00be09ec
00be09e4	ldr w0,[x8]
00be09e8	b 0x00be09fc
00be09ec	ldr x8,[x20]
00be09f0	ldr x8,[x8, #0x48]
00be09f4	mov x0,x20
00be09f8	blr x8
00be09fc	cmn w0,#0x1
00be0a00	cset w8,eq
00be0a04	eor w8,w19,w8
00be0a08	tbnz w8,#0x0,0x00be0a18
00be0a0c	ldr w8,[x22]
00be0a10	orr w8,w8,#0x2
00be0a14	str w8,[x22]
00be0a18	ldurb w8,[x29, #-0xa8]
00be0a1c	tbz w8,#0x0,0x00be0a30
00be0a20	ldr x8,[x27, #0x8]
00be0a24	ldr x0,[x27, #0x18]
00be0a28	and x1,x8,#-0x2
00be0a2c	bl 0x00c2fe80
00be0a30	ldurb w8,[x29, #-0x90]
00be0a34	tbz w8,#0x0,0x00be0a48
00be0a38	ldr x8,[x27, #0x20]
00be0a3c	ldr x0,[x27, #0x30]
00be0a40	and x1,x8,#-0x2
00be0a44	bl 0x00c2fe80
00be0a48	mov x0,x21
00be0a4c	ldp x20,x19,[sp, #0x1d0]
00be0a50	ldp x22,x21,[sp, #0x1c0]
00be0a54	ldp x24,x23,[sp, #0x1b0]
00be0a58	ldp x26,x25,[sp, #0x1a0]
00be0a5c	ldp x28,x27,[sp, #0x190]
00be0a60	ldp x29,x30,[sp, #0x180]
00be0a64	add sp,sp,#0x1e0
00be0a68	autiasp
00be0a6c	ret
00be0a70	add x13,x13,#0x1
00be0a74	add x15,sp,#0x30
00be0a78	sub x12,x12,#0x10
00be0a7c	and x14,x13,#0x7ffffffffffffff8
00be0a80	lsl x10,x14,#0x2
00be0a84	mov x16,x14
00be0a88	sub x11,x8,x10
00be0a8c	add x10,x15,x10
00be0a90	add x15,x15,#0x10
00be0a94	ldp q1,q0,[x12, #-0x10]
00be0a98	sub x16,x16,#0x8
00be0a9c	ldp q2,q3,[x15, #-0x10]
00be0aa0	rev64 v0.4S,v0.4S
00be0aa4	rev64 v1.4S,v1.4S
00be0aa8	rev64 v2.4S,v2.4S
00be0aac	rev64 v3.4S,v3.4S
00be0ab0	ext v0.16B,v0.16B,v0.16B,0x8
00be0ab4	ext v1.16B,v1.16B,v1.16B,0x8
00be0ab8	ext v2.16B,v2.16B,v2.16B,0x8
00be0abc	ext v3.16B,v3.16B,v3.16B,0x8
00be0ac0	stp q0,q1,[x15, #-0x10]
00be0ac4	add x15,x15,#0x20
00be0ac8	stp q3,q2,[x12, #-0x10]
00be0acc	sub x12,x12,#0x20
00be0ad0	cbnz x16,0x00be0a94
00be0ad4	cmp x13,x14
00be0ad8	b.eq 0x00be08f4
00be0adc	b 0x00be08d4
