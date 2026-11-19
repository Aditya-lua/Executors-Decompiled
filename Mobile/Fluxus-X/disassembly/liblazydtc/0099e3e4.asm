; ix::WebSocketHandshake::serverHandshake @ 0099e3e4
0099e3e4	stp x28,x27,[sp, #-0x60]!
0099e3e8	stp x26,x25,[sp, #0x10]
0099e3ec	stp x24,x23,[sp, #0x20]
0099e3f0	stp x22,x21,[sp, #0x30]
0099e3f4	stp x20,x19,[sp, #0x40]
0099e3f8	stp x29,x30,[sp, #0x50]
0099e3fc	add x29,sp,#0x50
0099e400	sub sp,sp,#0x310
0099e404	mrs x28,tpidr_el0
0099e408	ldr x10,[x28, #0x28]
0099e40c	mov w9,w1
0099e410	mov x20,x0
0099e414	mov x19,x8
0099e418	str x10,[sp, #0x48]
0099e41c	ldr x10,[x0]
0099e420	sub x8,x29,#0xa0
0099e424	mov x22,x3
0099e428	mov w21,w2
0099e42c	stlrb wzr,[x10]
0099e430	ldr x1,[x0]
0099e434	mov w0,w9
0099e438	bl 0x00c32e00
0099e43c	stp xzr,xzr,[sp, #0x138]
0099e440	str xzr,[sp, #0x148]
0099e444	stp xzr,xzr,[sp, #0x120]
0099e448	str xzr,[sp, #0x130]
0099e44c	stp xzr,xzr,[sp, #0x108]
0099e450	str xzr,[sp, #0x118]
0099e454	ldr x8,[x22]
0099e458	cbz x8,0x0099e4f4
0099e45c	add x9,x8,#0x18
0099e460	add x10,sp,#0x138
0099e464	cmp x10,x9
0099e468	b.eq 0x0099e490
0099e46c	ldrb w10,[x8, #0x18]
0099e470	ldp x8,x11,[x8, #0x20]
0099e474	tst w10,#0x1
0099e478	lsr w12,w10,#0x1
0099e47c	csinc x1,x11,x9,ne
0099e480	csel x2,x12,x8,eq
0099e484	add x0,sp,#0x138
0099e488	bl 0x00c31090
0099e48c	ldr x8,[x22]
0099e490	add x9,sp,#0x120
0099e494	cmp x9,x8
0099e498	b.eq 0x0099e4c0
0099e49c	ldrb w9,[x8]
0099e4a0	ldp x11,x10,[x8, #0x8]
0099e4a4	tst w9,#0x1
0099e4a8	lsr w12,w9,#0x1
0099e4ac	csinc x1,x10,x8,ne
0099e4b0	csel x2,x12,x11,eq
0099e4b4	add x0,sp,#0x120
0099e4b8	bl 0x00c31090
0099e4bc	ldr x8,[x22]
0099e4c0	add x9,x8,#0x30
0099e4c4	add x10,sp,#0x108
0099e4c8	cmp x10,x9
0099e4cc	b.eq 0x0099e5e8
0099e4d0	ldrb w10,[x8, #0x30]
0099e4d4	ldp x8,x11,[x8, #0x38]
0099e4d8	tst w10,#0x1
0099e4dc	lsr w12,w10,#0x1
0099e4e0	csinc x1,x11,x9,ne
0099e4e4	csel x2,x12,x8,eq
0099e4e8	add x0,sp,#0x108
0099e4ec	bl 0x00c31090
0099e4f0	b 0x0099e5e8
0099e4f4	ldr x8,[x20, #0x8]
0099e4f8	ldr x0,[x8]
0099e4fc	sub x8,x29,#0xc0
0099e500	sub x1,x29,#0xa0
0099e504	sub x23,x29,#0xc0
0099e508	bl 0x00c33190
0099e50c	ldurb w8,[x29, #-0xb8]
0099e510	ldurb w27,[x29, #-0xc0]
0099e514	stp xzr,xzr,[x29, #-0xe0]
0099e518	stur xzr,[x29, #-0xd0]
0099e51c	tbnz w8,#0x0,0x0099e6e0
0099e520	add x8,x23,#0x8
0099e524	ldr x9,[x8, #0x10]
0099e528	ldr q0,[x8]
0099e52c	stur x9,[x29, #-0xd0]
0099e530	stur q0,[x29, #-0xe0]
0099e534	cbz w27,0x0099e714
0099e538	add x8,sp,#0x160
0099e53c	sub x0,x29,#0xe0
0099e540	add x23,sp,#0x160
0099e544	bl 0x00c32f60
0099e548	ldrb w8,[sp, #0x160]
0099e54c	ldp x10,x9,[sp, #0x168]
0099e550	orr x11,x23,#0x1
0099e554	tst w8,#0x1
0099e558	lsr w12,w8,#0x1
0099e55c	csel x1,x11,x9,eq
0099e560	csel x2,x12,x10,eq
0099e564	add x0,sp,#0x138
0099e568	bl 0x00c31090
0099e56c	ldrb w8,[sp, #0x178]
0099e570	ldp x10,x9,[sp, #0x180]
0099e574	add x23,sp,#0x160
0099e578	add x11,x23,#0x19
0099e57c	tst w8,#0x1
0099e580	lsr w12,w8,#0x1
0099e584	csel x1,x11,x9,eq
0099e588	csel x2,x12,x10,eq
0099e58c	add x0,sp,#0x120
0099e590	bl 0x00c31090
0099e594	ldrb w8,[sp, #0x190]
0099e598	ldp x10,x9,[sp, #0x198]
0099e59c	add x11,x23,#0x31
0099e5a0	tst w8,#0x1
0099e5a4	lsr w12,w8,#0x1
0099e5a8	csel x1,x11,x9,eq
0099e5ac	csel x2,x12,x10,eq
0099e5b0	add x0,sp,#0x108
0099e5b4	bl 0x00c31090
0099e5b8	ldrb w8,[sp, #0x190]
0099e5bc	tbnz w8,#0x0,0x0099e7f8
0099e5c0	ldrb w8,[sp, #0x178]
0099e5c4	tbnz w8,#0x0,0x0099e808
0099e5c8	ldrb w8,[sp, #0x160]
0099e5cc	tbnz w8,#0x0,0x0099e818
0099e5d0	ldurb w8,[x29, #-0xe0]
0099e5d4	tbnz w8,#0x0,0x0099e828
0099e5d8	ldurb w8,[x29, #-0xb8]
0099e5dc	tbz w8,#0x0,0x0099e5e8
0099e5e0	ldur x0,[x29, #-0xa8]
0099e5e4	bl 0x00c301d0
0099e5e8	ldrb w8,[sp, #0x138]
0099e5ec	ldr x9,[sp, #0x140]
0099e5f0	lsr w10,w8,#0x1
0099e5f4	tst w8,#0x1
0099e5f8	csel x9,x10,x9,eq
0099e5fc	cmp x9,#0x3
0099e600	b.ne 0x0099e62c
0099e604	ldr x9,[sp, #0x148]
0099e608	add x10,sp,#0x138
0099e60c	orr x10,x10,#0x1
0099e610	tst w8,#0x1
0099e614	adrp x1,0x2d7000
0099e618	csel x0,x10,x9,eq
0099e61c	add x1,x1,#0x152
0099e620	orr w2,wzr,#0x3
0099e624	bl 0x00c300b0
0099e628	cbz w0,0x0099e780
0099e62c	adrp x0,0x2b7000
0099e630	add x0,x0,#0x3e0
0099e634	add x8,sp,#0x160
0099e638	add x1,sp,#0x138
0099e63c	bl 0x00c304a0
0099e640	mov w1,#0x190
0099e644	add x2,sp,#0x160
0099e648	mov x8,x19
0099e64c	mov x0,x20
0099e650	bl 0x00c33ba0
0099e654	ldrb w8,[sp, #0x160]
0099e658	tbz w8,#0x0,0x0099e664
0099e65c	ldr x0,[sp, #0x170]
0099e660	bl 0x00c301d0
0099e664	ldrb w8,[sp, #0x108]
0099e668	tbnz w8,#0x0,0x0099e8a8
0099e66c	ldrb w8,[sp, #0x120]
0099e670	tbnz w8,#0x0,0x0099e8b8
0099e674	ldrb w8,[sp, #0x138]
0099e678	tbz w8,#0x0,0x0099e684
0099e67c	ldr x0,[sp, #0x148]
0099e680	bl 0x00c301d0
0099e684	ldur x0,[x29, #-0x80]
0099e688	sub x8,x29,#0xa0
0099e68c	cmp x8,x0
0099e690	b.eq 0x0099e6a4
0099e694	cbz x0,0x0099e6b0
0099e698	ldr x8,[x0]
0099e69c	ldr x8,[x8, #0x28]
0099e6a0	b 0x0099e6ac
0099e6a4	ldr x8,[x0]
0099e6a8	ldr x8,[x8, #0x20]
0099e6ac	blr x8
0099e6b0	ldr x8,[x28, #0x28]
0099e6b4	ldr x9,[sp, #0x48]
0099e6b8	cmp x8,x9
0099e6bc	b.ne 0x0099f92c
0099e6c0	add sp,sp,#0x310
0099e6c4	ldp x29,x30,[sp, #0x50]
0099e6c8	ldp x20,x19,[sp, #0x40]
0099e6cc	ldp x22,x21,[sp, #0x30]
0099e6d0	ldp x24,x23,[sp, #0x20]
0099e6d4	ldp x26,x25,[sp, #0x10]
0099e6d8	ldp x28,x27,[sp], #0x60
0099e6dc	ret
0099e6e0	ldur x23,[x29, #-0xb0]
0099e6e4	cmn x23,#0x10
0099e6e8	b.cs 0x0099f930
0099e6ec	ldur x24,[x29, #-0xa8]
0099e6f0	cmp x23,#0x17
0099e6f4	b.cs 0x0099e83c
0099e6f8	sub x9,x29,#0xe0
0099e6fc	lsl w8,w23,#0x1
0099e700	orr x25,x9,#0x1
0099e704	sturb w8,[x29, #-0xe0]
0099e708	cbnz x23,0x0099e85c
0099e70c	strb wzr,[x25, x23]
0099e710	cbnz w27,0x0099e538
0099e714	stp xzr,xzr,[sp, #0x160]
0099e718	str xzr,[sp, #0x170]
0099e71c	mov w0,#0x20
0099e720	bl 0x00c2fed0
0099e724	adrp x9,0x2af000
0099e728	adrp x8,0x29c000
0099e72c	add x9,x9,#0x6d8
0099e730	ldr q0,[x8, #0xb10]
0099e734	ldur q1,[x9, #0xf]
0099e738	ldr q2,[x9]
0099e73c	str x0,[sp, #0x170]
0099e740	str q0,[sp, #0x160]
0099e744	stur q1,[x0, #0xf]
0099e748	str q2,[x0]
0099e74c	strb wzr,[x0, #0x1f]
0099e750	mov w1,#0x190
0099e754	add x2,sp,#0x160
0099e758	mov x8,x19
0099e75c	mov x0,x20
0099e760	bl 0x00c33ba0
0099e764	ldrb w8,[sp, #0x160]
0099e768	tbnz w8,#0x0,0x0099e878
0099e76c	ldurb w8,[x29, #-0xe0]
0099e770	tbnz w8,#0x0,0x0099e888
0099e774	ldurb w8,[x29, #-0xb8]
0099e778	tbz w8,#0x0,0x0099e664
0099e77c	b 0x0099e898
0099e780	ldrb w8,[sp, #0x108]
0099e784	ldr x9,[sp, #0x110]
0099e788	lsr w10,w8,#0x1
0099e78c	tst w8,#0x1
0099e790	csel x9,x10,x9,eq
0099e794	cmp x9,#0x8
0099e798	b.ne 0x0099e7cc
0099e79c	ldr x9,[sp, #0x118]
0099e7a0	add x10,sp,#0x108
0099e7a4	orr x10,x10,#0x1
0099e7a8	tst w8,#0x1
0099e7ac	csel x8,x10,x9,eq
0099e7b0	ldr x8,[x8]
0099e7b4	mov x9,#0x5448
0099e7b8	movk x9,#0x5054, LSL #16
0099e7bc	movk x9,#0x312f, LSL #32
0099e7c0	movk x9,#0x312e, LSL #48
0099e7c4	cmp x8,x9
0099e7c8	b.eq 0x0099e8cc
0099e7cc	adrp x0,0x2b9000
0099e7d0	add x0,x0,#0x682
0099e7d4	add x8,sp,#0x160
0099e7d8	add x1,sp,#0x108
0099e7dc	bl 0x00c304a0
0099e7e0	mov w1,#0x190
0099e7e4	add x2,sp,#0x160
0099e7e8	mov x8,x19
0099e7ec	mov x0,x20
0099e7f0	bl 0x00c33ba0
0099e7f4	b 0x0099e654
0099e7f8	ldr x0,[sp, #0x1a0]
0099e7fc	bl 0x00c301d0
0099e800	ldrb w8,[sp, #0x178]
0099e804	tbz w8,#0x0,0x0099e5c8
0099e808	ldr x0,[sp, #0x188]
0099e80c	bl 0x00c301d0
0099e810	ldrb w8,[sp, #0x160]
0099e814	tbz w8,#0x0,0x0099e5d0
0099e818	ldr x0,[sp, #0x170]
0099e81c	bl 0x00c301d0
0099e820	ldurb w8,[x29, #-0xe0]
0099e824	tbz w8,#0x0,0x0099e5d8
0099e828	ldur x0,[x29, #-0xd0]
0099e82c	bl 0x00c301d0
0099e830	ldurb w8,[x29, #-0xb8]
0099e834	tbnz w8,#0x0,0x0099e5e0
0099e838	b 0x0099e5e8
0099e83c	add x8,x23,#0x10
0099e840	and x26,x8,#-0x10
0099e844	mov x0,x26
0099e848	bl 0x00c2fed0
0099e84c	orr x8,x26,#0x1
0099e850	mov x25,x0
0099e854	stp x23,x0,[x29, #-0xd8]
0099e858	stur x8,[x29, #-0xe0]
0099e85c	mov x0,x25
0099e860	mov x1,x24
0099e864	mov x2,x23
0099e868	bl 0x00c2ffd0
0099e86c	strb wzr,[x25, x23]
0099e870	cbnz w27,0x0099e538
0099e874	b 0x0099e714
0099e878	ldr x0,[sp, #0x170]
0099e87c	bl 0x00c301d0
0099e880	ldurb w8,[x29, #-0xe0]
0099e884	tbz w8,#0x0,0x0099e774
0099e888	ldur x0,[x29, #-0xd0]
0099e88c	bl 0x00c301d0
0099e890	ldurb w8,[x29, #-0xb8]
0099e894	tbz w8,#0x0,0x0099e664
0099e898	ldur x0,[x29, #-0xa8]
0099e89c	bl 0x00c301d0
0099e8a0	ldrb w8,[sp, #0x108]
0099e8a4	tbz w8,#0x0,0x0099e66c
0099e8a8	ldr x0,[sp, #0x118]
0099e8ac	bl 0x00c301d0
0099e8b0	ldrb w8,[sp, #0x120]
0099e8b4	tbz w8,#0x0,0x0099e674
0099e8b8	ldr x0,[sp, #0x130]
0099e8bc	bl 0x00c301d0
0099e8c0	ldrb w8,[sp, #0x138]
0099e8c4	tbnz w8,#0x0,0x0099e67c
0099e8c8	b 0x0099e684
0099e8cc	add x9,sp,#0xf0
0099e8d0	add x25,x9,#0x8
0099e8d4	stp xzr,xzr,[sp, #0xf8]
0099e8d8	str x25,[sp, #0xf0]
0099e8dc	ldr x8,[x22]
0099e8e0	cbz x8,0x0099e904
0099e8e4	add x10,x8,#0x60
0099e8e8	cmp x9,x10
0099e8ec	b.eq 0x0099e940
0099e8f0	ldr x1,[x8, #0x60]
0099e8f4	add x2,x8,#0x68
0099e8f8	add x0,sp,#0xf0
0099e8fc	bl 0x00c33130
0099e900	b 0x0099e940
0099e904	ldr x0,[x20, #0x8]
0099e908	add x8,sp,#0x160
0099e90c	sub x1,x29,#0xa0
0099e910	add x23,sp,#0x160
0099e914	bl 0x00c33170
0099e918	ldrb w22,[sp, #0x160]
0099e91c	ldr x1,[sp, #0x168]
0099e920	add x2,x23,#0x10
0099e924	add x0,sp,#0xf0
0099e928	bl 0x00c33130
0099e92c	cbz w22,0x0099ed08
0099e930	ldr x1,[sp, #0x170]
0099e934	add x8,sp,#0x160
0099e938	add x0,x8,#0x8
0099e93c	bl 0x00c32fc0
0099e940	adrp x9,0x2a9000
0099e944	add x9,x9,#0xac4
0099e948	ldr q0,[x9]
0099e94c	ldr x24,[sp, #0xf8]
0099e950	add x26,sp,#0x160
0099e954	mov w8,#0x22
0099e958	mov w9,#0x79
0099e95c	stp xzr,xzr,[sp, #0x160]
0099e960	str xzr,[sp, #0x170]
0099e964	strb w8,[sp, #0x160]
0099e968	str q0,[sp, #0x30]
0099e96c	stur q0,[x26, #0x1]
0099e970	sturh w9,[x26, #0x11]
0099e974	cbz x24,0x0099e9c8
0099e978	add x8,sp,#0xf0
0099e97c	add x22,x8,#0x10
0099e980	mov w27,#0x8
0099e984	mov x23,x25
0099e988	add x1,x24,#0x20
0099e98c	add x2,sp,#0x160
0099e990	mov x0,x22
0099e994	bl 0x00c331d0
0099e998	tst w0,#0x1
0099e99c	csel x8,x27,xzr,ne
0099e9a0	csel x23,x23,x24,ne
0099e9a4	ldr x24,[x24, x8#0x0]
0099e9a8	cbnz x24,0x0099e988
0099e9ac	cmp x23,x25
0099e9b0	b.eq 0x0099e9c8
0099e9b4	add x2,x23,#0x20
0099e9b8	add x1,sp,#0x160
0099e9bc	mov x0,x22
0099e9c0	bl 0x00c331d0
0099e9c4	tbz w0,#0x0,0x0099ea38
0099e9c8	mov x23,x25
0099e9cc	ldrb w8,[sp, #0x160]
0099e9d0	tbz w8,#0x0,0x0099ea40
0099e9d4	ldr x0,[sp, #0x170]
0099e9d8	bl 0x00c301d0
0099e9dc	cmp x23,x25
0099e9e0	b.ne 0x0099ea48
0099e9e4	stp xzr,xzr,[sp, #0x160]
0099e9e8	str xzr,[sp, #0x170]
0099e9ec	mov w0,#0x20
0099e9f0	bl 0x00c2fed0
0099e9f4	adrp x9,0x2db000
0099e9f8	adrp x8,0x29c000
0099e9fc	add x9,x9,#0x760
0099ea00	ldr q0,[x8, #0xb10]
0099ea04	ldur q1,[x9, #0xf]
0099ea08	ldr q2,[x9]
0099ea0c	str x0,[sp, #0x170]
0099ea10	str q0,[sp, #0x160]
0099ea14	stur q1,[x0, #0xf]
0099ea18	str q2,[x0]
0099ea1c	strb wzr,[x0, #0x1f]
0099ea20	mov w1,#0x190
0099ea24	add x2,sp,#0x160
0099ea28	mov x8,x19
0099ea2c	mov x0,x20
0099ea30	bl 0x00c33ba0
0099ea34	b 0x0099eb18
0099ea38	ldrb w8,[sp, #0x160]
0099ea3c	tbnz w8,#0x0,0x0099e9d4
0099ea40	cmp x23,x25
0099ea44	b.eq 0x0099e9e4
0099ea48	orr w8,wzr,#0xe
0099ea4c	stp xzr,xzr,[sp, #0x160]
0099ea50	ldr x24,[sp, #0xf8]
0099ea54	strb w8,[sp, #0x160]
0099ea58	mov x8,#0x7075
0099ea5c	movk x8,#0x7267, LSL #16
0099ea60	movk x8,#0x6461, LSL #32
0099ea64	movk x8,#0x65, LSL #48
0099ea68	str xzr,[sp, #0x170]
0099ea6c	stur x8,[x26, #0x1]
0099ea70	cbz x24,0x0099eac4
0099ea74	add x8,sp,#0xf0
0099ea78	add x22,x8,#0x10
0099ea7c	mov w27,#0x8
0099ea80	mov x23,x25
0099ea84	add x1,x24,#0x20
0099ea88	add x2,sp,#0x160
0099ea8c	mov x0,x22
0099ea90	bl 0x00c331d0
0099ea94	tst w0,#0x1
0099ea98	csel x8,x27,xzr,ne
0099ea9c	csel x23,x23,x24,ne
0099eaa0	ldr x24,[x24, x8#0x0]
0099eaa4	cbnz x24,0x0099ea84
0099eaa8	cmp x23,x25
0099eaac	b.eq 0x0099eac4
0099eab0	add x2,x23,#0x20
0099eab4	add x1,sp,#0x160
0099eab8	mov x0,x22
0099eabc	bl 0x00c331d0
0099eac0	tbz w0,#0x0,0x0099eb2c
0099eac4	mov x23,x25
0099eac8	ldrb w8,[sp, #0x160]
0099eacc	tbz w8,#0x0,0x0099eb34
0099ead0	ldr x0,[sp, #0x170]
0099ead4	bl 0x00c301d0
0099ead8	cmp x23,x25
0099eadc	b.ne 0x0099eb3c
0099eae0	adrp x8,0x2bd000
0099eae4	add x8,x8,#0x371
0099eae8	ldr q0,[x8]
0099eaec	ldur x8,[x8, #0xe]
0099eaf0	mov w9,#0x2c
0099eaf4	strb w9,[sp, #0x160]
0099eaf8	stur q0,[x26, #0x1]
0099eafc	stur x8,[x26, #0xf]
0099eb00	strb wzr,[sp, #0x177]
0099eb04	mov w1,#0x190
0099eb08	add x2,sp,#0x160
0099eb0c	mov x8,x19
0099eb10	mov x0,x20
0099eb14	bl 0x00c33ba0
0099eb18	ldrb w8,[sp, #0x160]
0099eb1c	tbz w8,#0x0,0x0099ed78
0099eb20	ldr x0,[sp, #0x170]
0099eb24	bl 0x00c301d0
0099eb28	b 0x0099ed78
0099eb2c	ldrb w8,[sp, #0x160]
0099eb30	tbnz w8,#0x0,0x0099ead0
0099eb34	cmp x23,x25
0099eb38	b.eq 0x0099eae0
0099eb3c	mov x9,#0x7075
0099eb40	movk x9,#0x7267, LSL #16
0099eb44	movk x9,#0x6461, LSL #32
0099eb48	orr w8,wzr,#0xe
0099eb4c	movk x9,#0x65, LSL #48
0099eb50	add x10,sp,#0x160
0099eb54	stp xzr,xzr,[sp, #0x160]
0099eb58	str xzr,[sp, #0x170]
0099eb5c	strb w8,[sp, #0x160]
0099eb60	stur x9,[x26, #0x1]
0099eb64	stur x10,[x29, #-0xc0]
0099eb68	adrp x2,0x74a000
0099eb6c	add x2,x2,#0xba8
0099eb70	add x0,sp,#0xf0
0099eb74	add x1,sp,#0x160
0099eb78	sub x3,x29,#0xc0
0099eb7c	sub x4,x29,#0xe0
0099eb80	bl 0x00c32fb0
0099eb84	adrp x9,0x29d000
0099eb88	add x9,x9,#0xa8b
0099eb8c	ldr x9,[x9]
0099eb90	mov w8,#0x12
0099eb94	sub x23,x29,#0xe0
0099eb98	add x0,x0,#0x38
0099eb9c	stp xzr,xzr,[x29, #-0xc0]
0099eba0	sturb w8,[x29, #-0xc0]
0099eba4	mov w8,#0x74
0099eba8	stur xzr,[x29, #-0xb0]
0099ebac	sturh w8,[x23, #0x29]
0099ebb0	stur x9,[x23, #0x21]
0099ebb4	sub x1,x29,#0xc0
0099ebb8	bl 0x00c33740
0099ebbc	mov w22,wzr
0099ebc0	tbz w0,#0x0,0x0099ec60
0099ebc4	mov x9,#0x7055
0099ebc8	movk x9,#0x7267, LSL #16
0099ebcc	movk x9,#0x6461, LSL #32
0099ebd0	orr w8,wzr,#0xe
0099ebd4	movk x9,#0x65, LSL #48
0099ebd8	sub x10,x29,#0xe0
0099ebdc	stp xzr,xzr,[x29, #-0xe0]
0099ebe0	stur xzr,[x29, #-0xd0]
0099ebe4	sturb w8,[x29, #-0xe0]
0099ebe8	stur x9,[x23, #0x1]
0099ebec	str x10,[sp, #0xd0]
0099ebf0	adrp x2,0x74a000
0099ebf4	add x2,x2,#0xba8
0099ebf8	add x0,sp,#0xf0
0099ebfc	sub x1,x29,#0xe0
0099ec00	add x3,sp,#0xd0
0099ec04	add x4,sp,#0x80
0099ec08	bl 0x00c32fb0
0099ec0c	mov x8,x0
0099ec10	ldrb w9,[x8, #0x38]!
0099ec14	ldr x10,[x0, #0x40]
0099ec18	lsr w11,w9,#0x1
0099ec1c	tst w9,#0x1
0099ec20	csel x10,x11,x10,eq
0099ec24	cmp x10,#0x13
0099ec28	b.ne 0x0099f1f0
0099ec2c	ldr x10,[x0, #0x48]
0099ec30	tst w9,#0x1
0099ec34	adrp x1,0x2b9000
0099ec38	add x1,x1,#0x6ad
0099ec3c	csinc x0,x10,x8,ne
0099ec40	mov w2,#0x13
0099ec44	bl 0x00c300b0
0099ec48	cmp w0,#0x0
0099ec4c	cset w22,ne
0099ec50	ldurb w8,[x29, #-0xe0]
0099ec54	tbz w8,#0x0,0x0099ec60
0099ec58	ldur x0,[x29, #-0xd0]
0099ec5c	bl 0x00c301d0
0099ec60	ldurb w8,[x29, #-0xc0]
0099ec64	tbnz w8,#0x0,0x0099ed90
0099ec68	ldrb w8,[sp, #0x160]
0099ec6c	tbnz w8,#0x0,0x0099eda0
0099ec70	cbz w22,0x0099edac
0099ec74	mov x9,#0x7075
0099ec78	movk x9,#0x7267, LSL #16
0099ec7c	movk x9,#0x6461, LSL #32
0099ec80	orr w8,wzr,#0xe
0099ec84	movk x9,#0x65, LSL #48
0099ec88	sub x10,x29,#0xc0
0099ec8c	stp xzr,xzr,[x29, #-0xc0]
0099ec90	stur xzr,[x29, #-0xb0]
0099ec94	sturb w8,[x29, #-0xc0]
0099ec98	stur x9,[x23, #0x21]
0099ec9c	stur x10,[x29, #-0xe0]
0099eca0	adrp x2,0x74a000
0099eca4	add x2,x2,#0xba8
0099eca8	add x0,sp,#0xf0
0099ecac	sub x1,x29,#0xc0
0099ecb0	sub x3,x29,#0xe0
0099ecb4	add x4,sp,#0xd0
0099ecb8	bl 0x00c32fb0
0099ecbc	add x1,x0,#0x38
0099ecc0	adrp x0,0x2cf000
0099ecc4	add x0,x0,#0x531
0099ecc8	add x8,sp,#0x160
0099eccc	bl 0x00c304a0
0099ecd0	mov w1,#0x190
0099ecd4	add x2,sp,#0x160
0099ecd8	mov x8,x19
0099ecdc	mov x0,x20
0099ece0	bl 0x00c33ba0
0099ece4	ldrb w8,[sp, #0x160]
0099ece8	tbz w8,#0x0,0x0099ecf4
0099ecec	ldr x0,[sp, #0x170]
0099ecf0	bl 0x00c301d0
0099ecf4	ldurb w8,[x29, #-0xc0]
0099ecf8	tbz w8,#0x0,0x0099ed78
0099ecfc	ldur x0,[x29, #-0xb0]
0099ed00	bl 0x00c301d0
0099ed04	b 0x0099ed78
0099ed08	stp xzr,xzr,[x29, #-0xc0]
0099ed0c	stur xzr,[x29, #-0xb0]
0099ed10	mov w0,#0x20
0099ed14	bl 0x00c2fed0
0099ed18	adrp x9,0x2ab000
0099ed1c	adrp x8,0x29c000
0099ed20	add x9,x9,#0x960
0099ed24	ldr q0,[x8, #0xb80]
0099ed28	ldur q1,[x9, #0xa]
0099ed2c	ldr q2,[x9]
0099ed30	stur x0,[x29, #-0xb0]
0099ed34	stur q0,[x29, #-0xc0]
0099ed38	stur q1,[x0, #0xa]
0099ed3c	str q2,[x0]
0099ed40	strb wzr,[x0, #0x1a]
0099ed44	mov w1,#0x190
0099ed48	sub x2,x29,#0xc0
0099ed4c	mov x8,x19
0099ed50	mov x0,x20
0099ed54	bl 0x00c33ba0
0099ed58	ldurb w8,[x29, #-0xc0]
0099ed5c	tbz w8,#0x0,0x0099ed68
0099ed60	ldur x0,[x29, #-0xb0]
0099ed64	bl 0x00c301d0
0099ed68	ldr x1,[sp, #0x170]
0099ed6c	add x8,sp,#0x160
0099ed70	add x0,x8,#0x8
0099ed74	bl 0x00c32fc0
0099ed78	ldr x1,[sp, #0xf8]
0099ed7c	add x0,sp,#0xf0
0099ed80	bl 0x00c32fc0
0099ed84	ldrb w8,[sp, #0x108]
0099ed88	tbz w8,#0x0,0x0099e66c
0099ed8c	b 0x0099e8a8
0099ed90	ldur x0,[x29, #-0xb0]
0099ed94	bl 0x00c301d0
0099ed98	ldrb w8,[sp, #0x160]
0099ed9c	tbz w8,#0x0,0x0099ec70
0099eda0	ldr x0,[sp, #0x170]
0099eda4	bl 0x00c301d0
0099eda8	cbnz w22,0x0099ec74
0099edac	adrp x9,0x2a3000
0099edb0	add x9,x9,#0xa2d
0099edb4	ldr q0,[x9]
0099edb8	ldur x9,[x9, #0xd]
0099edbc	ldr x27,[sp, #0xf8]
0099edc0	mov w8,#0x2a
0099edc4	stp xzr,xzr,[sp, #0x160]
0099edc8	str xzr,[sp, #0x170]
0099edcc	strb w8,[sp, #0x160]
0099edd0	str q0,[sp, #0x20]
0099edd4	stur q0,[x26, #0x1]
0099edd8	str x9,[sp, #0x18]
0099eddc	stur x9,[x26, #0xe]
0099ede0	strb wzr,[sp, #0x176]
0099ede4	cbz x27,0x0099ee38
0099ede8	add x8,sp,#0xf0
0099edec	add x22,x8,#0x10
0099edf0	mov w23,#0x8
0099edf4	mov x24,x25
0099edf8	add x1,x27,#0x20
0099edfc	add x2,sp,#0x160
0099ee00	mov x0,x22
0099ee04	bl 0x00c331d0
0099ee08	tst w0,#0x1
0099ee0c	csel x8,x23,xzr,ne
0099ee10	csel x24,x24,x27,ne
0099ee14	ldr x27,[x27, x8#0x0]
0099ee18	cbnz x27,0x0099edf8
0099ee1c	cmp x24,x25
0099ee20	b.eq 0x0099ee38
0099ee24	add x2,x24,#0x20
0099ee28	add x1,sp,#0x160
0099ee2c	mov x0,x22
0099ee30	bl 0x00c331d0
0099ee34	tbz w0,#0x0,0x0099eeb0
0099ee38	mov x24,x25
0099ee3c	ldrb w8,[sp, #0x160]
0099ee40	tbz w8,#0x0,0x0099eeb8
0099ee44	ldr x0,[sp, #0x170]
0099ee48	bl 0x00c301d0
0099ee4c	cmp x24,x25
0099ee50	b.ne 0x0099eec0
0099ee54	stp xzr,xzr,[sp, #0x160]
0099ee58	str xzr,[sp, #0x170]
0099ee5c	orr w0,wzr,#0x30
0099ee60	bl 0x00c2fed0
0099ee64	adrp x11,0x2b7000
0099ee68	adrp x8,0x29c000
0099ee6c	add x11,x11,#0x404
0099ee70	ldr q0,[x8, #0x910]
0099ee74	ldp q1,q2,[x11]
0099ee78	mov w9,#0x65
0099ee7c	mov w10,#0x756c
0099ee80	str x0,[sp, #0x170]
0099ee84	strb w9,[x0, #0x22]
0099ee88	strh w10,[x0, #0x20]
0099ee8c	str q0,[sp, #0x160]
0099ee90	stp q1,q2,[x0]
0099ee94	strb wzr,[x0, #0x23]
0099ee98	mov w1,#0x190
0099ee9c	add x2,sp,#0x160
0099eea0	mov x8,x19
0099eea4	mov x0,x20
0099eea8	bl 0x00c33ba0
0099eeac	b 0x0099eb18
0099eeb0	ldrb w8,[sp, #0x160]
0099eeb4	tbnz w8,#0x0,0x0099ee44
0099eeb8	cmp x24,x25
0099eebc	b.eq 0x0099ee54
0099eec0	adrp x27,0xcb4000
0099eec4	adrp x9,0xcb4000
0099eec8	ldr x27,[x27, #0xc90]
0099eecc	ldr x9,[x9, #0xc88]
0099eed0	add x22,sp,#0x160
0099eed4	movi v0.2D,#0x0
0099eed8	add x0,x22,#0x80
0099eedc	add x8,x9,#0x40
0099eee0	add x9,x9,#0x18
0099eee4	add x23,x27,#0x40
0099eee8	add x24,x22,#0x18
0099eeec	mov v0.D[0x0],x9
0099eef0	str x23,[sp, #0x170]
0099eef4	str x8,[sp, #0x1e0]
0099eef8	str q0,[sp, #0x160]
0099eefc	mov x1,x24
0099ef00	str x0,[sp, #0x10]
0099ef04	bl 0x00c30100
0099ef08	str xzr,[sp, #0x268]
0099ef0c	add x9,x27,#0x18
0099ef10	add x10,x27,#0x68
0099ef14	adrp x27,0xcb4000
0099ef18	ldr x27,[x27, #0xa08]
0099ef1c	mov w8,#0xffffffff
0099ef20	fmov d0,x23
0099ef24	str w8,[sp, #0x270]
0099ef28	add x8,x27,#0x10
0099ef2c	mov v0.D[0x1],x8
0099ef30	add x0,x22,#0x20
0099ef34	str x9,[sp, #0x160]
0099ef38	str x10,[sp, #0x1e0]
0099ef3c	str q0,[sp, #0x170]
0099ef40	str x0,[sp, #0x8]
0099ef44	bl 0x00c30480
0099ef48	movi v1.2D,#0x0
0099ef4c	stur q1,[x26, #0x48]
0099ef50	stur q1,[x26, #0x38]
0099ef54	stur q1,[x26, #0x28]
0099ef58	adrp x9,0xcb4000
0099ef5c	ldr x9,[x9, #0xa00]
0099ef60	ldr q0,[sp, #0x20]
0099ef64	ldr x10,[sp, #0x18]
0099ef68	mov w8,#0x2a
0099ef6c	add x9,x9,#0x10
0099ef70	stp xzr,xzr,[x29, #-0xc0]
0099ef74	sturb w8,[x29, #-0xc0]
0099ef78	orr w8,wzr,#0x18
0099ef7c	sub x23,x29,#0xe0
0099ef80	str x9,[sp, #0x178]
0099ef84	sub x9,x29,#0xc0
0099ef88	stur xzr,[x29, #-0xb0]
0099ef8c	stur q0,[x23, #0x21]
0099ef90	stur x10,[x23, #0x2e]
0099ef94	sturb wzr,[x29, #-0xaa]
0099ef98	stur q1,[x26, #0x68]
0099ef9c	stur q1,[x26, #0x58]
0099efa0	str w8,[sp, #0x1d8]
0099efa4	stur x9,[x29, #-0xe0]
0099efa8	adrp x2,0x74a000
0099efac	add x2,x2,#0xba8
0099efb0	add x0,sp,#0xf0
0099efb4	sub x1,x29,#0xc0
0099efb8	sub x3,x29,#0xe0
0099efbc	add x4,sp,#0xd0
0099efc0	bl 0x00c32fb0
0099efc4	ldrb w9,[x0, #0x38]
0099efc8	ldp x10,x11,[x0, #0x40]
0099efcc	add x12,x0,#0x39
0099efd0	add x8,x22,#0x10
0099efd4	tst w9,#0x1
0099efd8	lsr w13,w9,#0x1
0099efdc	csel x1,x12,x11,eq
0099efe0	csel x2,x13,x10,eq
0099efe4	mov x0,x8
0099efe8	bl 0x00c30e90
0099efec	ldurb w8,[x29, #-0xc0]
0099eff0	tbz w8,#0x0,0x0099effc
0099eff4	ldur x0,[x29, #-0xb0]
0099eff8	bl 0x00c301d0
0099effc	add x0,sp,#0x160
0099f000	add x1,sp,#0xd0
0099f004	bl 0x00c32f80
0099f008	ldr w8,[sp, #0xd0]
0099f00c	cmp w8,#0xd
0099f010	b.ne 0x0099f200
0099f014	adrp x24,0xcb4000
0099f018	ldr x24,[x24, #0xc90]
0099f01c	adrp x11,0xcb4000
0099f020	ldr x11,[x11, #0xa00]
0099f024	add x8,x24,#0x18
0099f028	str x8,[sp, #0x160]
0099f02c	ldrb w8,[sp, #0x1b8]
0099f030	add x9,x24,#0x68
0099f034	add x10,x24,#0x40
0099f038	add x11,x11,#0x10
0099f03c	str x9,[sp, #0x1e0]
0099f040	stp x10,x11,[sp, #0x170]
0099f044	tbz w8,#0x0,0x0099f050
0099f048	ldr x0,[sp, #0x1c8]
0099f04c	bl 0x00c301d0
0099f050	ldr x0,[sp, #0x8]
0099f054	add x8,x27,#0x10
0099f058	str x8,[sp, #0x178]
0099f05c	bl 0x00c30090
0099f060	ldr x0,[sp, #0x10]
0099f064	bl 0x00c30ee0
0099f068	ldr q0,[sp, #0x30]
0099f06c	mov w8,#0x22
0099f070	mov w9,#0x79
0099f074	add x10,sp,#0x160
0099f078	stp xzr,xzr,[x29, #-0xc0]
0099f07c	stur xzr,[x23, #0x35]
0099f080	stur xzr,[x29, #-0xb0]
0099f084	stp xzr,xzr,[sp, #0x160]
0099f088	str xzr,[sp, #0x170]
0099f08c	strb w8,[sp, #0x160]
0099f090	stur q0,[x26, #0x1]
0099f094	sturh w9,[x26, #0x11]
0099f098	stur x10,[x29, #-0xe0]
0099f09c	adrp x2,0x74a000
0099f0a0	add x2,x2,#0xba8
0099f0a4	add x0,sp,#0xf0
0099f0a8	add x1,sp,#0x160
0099f0ac	sub x3,x29,#0xe0
0099f0b0	add x4,sp,#0xd0
0099f0b4	bl 0x00c32fb0
0099f0b8	add x0,x0,#0x38
0099f0bc	sub x1,x29,#0xc0
0099f0c0	bl 0x00c33b60
0099f0c4	ldrb w8,[sp, #0x160]
0099f0c8	tbz w8,#0x0,0x0099f0d4
0099f0cc	ldr x0,[sp, #0x170]
0099f0d0	bl 0x00c301d0
0099f0d4	adrp x8,0xcb4000
0099f0d8	ldr x8,[x8, #0xc88]
0099f0dc	add x22,sp,#0x160
0099f0e0	movi v0.2D,#0x0
0099f0e4	add x23,x24,#0x40
0099f0e8	mov x9,x8
0099f0ec	add x9,x9,#0x18
0099f0f0	add x8,x8,#0x40
0099f0f4	add x0,x22,#0x80
0099f0f8	add x1,x22,#0x18
0099f0fc	mov v0.D[0x0],x9
0099f100	str x23,[sp, #0x170]
0099f104	str x8,[sp, #0x1e0]
0099f108	str q0,[sp, #0x160]
0099f10c	str x0,[sp, #0x30]
0099f110	str x1,[sp, #0x18]
0099f114	bl 0x00c30100
0099f118	fmov d0,x23
0099f11c	add x11,x27,#0x10
0099f120	mov w8,#0xffffffff
0099f124	add x9,x24,#0x18
0099f128	add x10,x24,#0x68
0099f12c	mov v0.D[0x1],x11
0099f130	add x0,x22,#0x20
0099f134	str xzr,[sp, #0x268]
0099f138	add x24,x22,#0x10
0099f13c	str w8,[sp, #0x270]
0099f140	str x9,[sp, #0x160]
0099f144	str x10,[sp, #0x1e0]
0099f148	str q0,[sp, #0x170]
0099f14c	str x0,[sp, #0x20]
0099f150	bl 0x00c30480
0099f154	movi v0.2D,#0x0
0099f158	stur q0,[x26, #0x48]
0099f15c	stur q0,[x26, #0x38]
0099f160	stur q0,[x26, #0x28]
0099f164	adrp x8,0xcb4000
0099f168	ldr x8,[x8, #0xa00]
0099f16c	orr w9,wzr,#0x18
0099f170	add x8,x8,#0x10
0099f174	str x8,[sp, #0x178]
0099f178	stur q0,[x26, #0x68]
0099f17c	stur q0,[x26, #0x58]
0099f180	str w9,[sp, #0x1d8]
0099f184	adrp x1,0x2ab000
0099f188	add x1,x1,#0xa2d
0099f18c	mov w2,#0x22
0099f190	mov x0,x24
0099f194	bl 0x00c30e90
0099f198	adrp x1,0x2ab000
0099f19c	add x1,x1,#0xa50
0099f1a0	mov w2,#0x16
0099f1a4	mov x0,x24
0099f1a8	bl 0x00c30e90
0099f1ac	mov x26,x0
0099f1b0	sub x0,x29,#0xc0
0099f1b4	stp xzr,xzr,[x29, #-0xe0]
0099f1b8	stur xzr,[x29, #-0xd0]
0099f1bc	bl 0x00c2ff50
0099f1c0	mov x27,x0
0099f1c4	cmn x0,#0x10
0099f1c8	b.cs 0x0099f938
0099f1cc	cmp x27,#0x17
0099f1d0	b.cs 0x0099f2c4
0099f1d4	sub x9,x29,#0xe0
0099f1d8	orr x22,x9,#0x1
0099f1dc	lsl w8,w27,#0x1
0099f1e0	mov x23,x22
0099f1e4	sturb w8,[x29, #-0xe0]
0099f1e8	cbnz x27,0x0099f2ec
0099f1ec	b 0x0099f2fc
0099f1f0	mov w22,#0x1
0099f1f4	ldurb w8,[x29, #-0xe0]
0099f1f8	tbz w8,#0x0,0x0099ec60
0099f1fc	b 0x0099ec58
0099f200	sub x8,x29,#0xe0
0099f204	mov x0,x24
0099f208	bl 0x00c30e20
0099f20c	adrp x2,0x2a9000
0099f210	add x2,x2,#0xad6
0099f214	sub x0,x29,#0xe0
0099f218	mov w3,#0x2c
0099f21c	mov x1,xzr
0099f220	bl 0x00c314c0
0099f224	ldr x8,[x0, #0x10]
0099f228	stur x8,[x29, #-0xb0]
0099f22c	ldr q0,[x0]
0099f230	stur q0,[x29, #-0xc0]
0099f234	stp xzr,xzr,[x0]
0099f238	str xzr,[x0, #0x10]
0099f23c	mov x8,x19
0099f240	adrp x19,0xcb4000
0099f244	ldr x19,[x19, #0xc90]
0099f248	mov w1,#0x190
0099f24c	sub x2,x29,#0xc0
0099f250	mov x0,x20
0099f254	bl 0x00c33ba0
0099f258	ldurb w8,[x29, #-0xc0]
0099f25c	tbz w8,#0x0,0x0099f268
0099f260	ldur x0,[x29, #-0xb0]
0099f264	bl 0x00c301d0
0099f268	ldurb w8,[x29, #-0xe0]
0099f26c	tbz w8,#0x0,0x0099f278
0099f270	ldur x0,[x29, #-0xd0]
0099f274	bl 0x00c301d0
0099f278	adrp x11,0xcb4000
0099f27c	add x8,x19,#0x18
0099f280	ldr x11,[x11, #0xa00]
0099f284	str x8,[sp, #0x160]
0099f288	ldrb w8,[sp, #0x1b8]
0099f28c	add x9,x19,#0x68
0099f290	add x10,x19,#0x40
0099f294	add x11,x11,#0x10
0099f298	str x9,[sp, #0x1e0]
0099f29c	stp x10,x11,[sp, #0x170]
0099f2a0	tbz w8,#0x0,0x0099f2ac
0099f2a4	ldr x0,[sp, #0x1c8]
0099f2a8	bl 0x00c301d0
0099f2ac	ldr x0,[sp, #0x8]
0099f2b0	add x8,x27,#0x10
0099f2b4	str x8,[sp, #0x178]
0099f2b8	bl 0x00c30090
0099f2bc	ldr x0,[sp, #0x10]
0099f2c0	b 0x0099f924
0099f2c4	add x8,x27,#0x10
0099f2c8	and x22,x8,#-0x10
0099f2cc	mov x0,x22
0099f2d0	bl 0x00c2fed0
0099f2d4	orr x8,x22,#0x1
0099f2d8	sub x9,x29,#0xe0
0099f2dc	mov x23,x0
0099f2e0	stp x27,x0,[x29, #-0xd8]
0099f2e4	stur x8,[x29, #-0xe0]
0099f2e8	orr x22,x9,#0x1
0099f2ec	sub x1,x29,#0xc0
0099f2f0	mov x0,x23
0099f2f4	mov x2,x27
0099f2f8	bl 0x00c2ffd0
0099f2fc	strb wzr,[x23, x27]
0099f300	ldurb w8,[x29, #-0xe0]
0099f304	ldp x10,x9,[x29, #-0xd8]
0099f308	tst w8,#0x1
0099f30c	lsr w11,w8,#0x1
0099f310	csel x1,x22,x9,eq
0099f314	csel x2,x11,x10,eq
0099f318	mov x0,x26
0099f31c	bl 0x00c30e90
0099f320	adrp x1,0x2b9000
0099f324	add x1,x1,#0x17a
0099f328	mov w2,#0x2
0099f32c	bl 0x00c30e90
0099f330	ldurb w8,[x29, #-0xe0]
0099f334	tbz w8,#0x0,0x0099f340
0099f338	ldur x0,[x29, #-0xd0]
0099f33c	bl 0x00c301d0
0099f340	adrp x1,0x2a5000
0099f344	add x1,x1,#0x7a1
0099f348	mov w2,#0x14
0099f34c	mov x0,x24
0099f350	bl 0x00c30e90
0099f354	adrp x1,0x2ab000
0099f358	add x1,x1,#0x9e7
0099f35c	mov w2,#0x15
0099f360	mov x0,x24
0099f364	bl 0x00c30e90
0099f368	adrp x1,0x2a7000
0099f36c	add x1,x1,#0x7d4
0099f370	mov w2,#0x8
0099f374	mov x0,x24
0099f378	bl 0x00c30e90
0099f37c	mov x26,x0
0099f380	sub x8,x29,#0xe0
0099f384	sub x22,x29,#0xe0
0099f388	bl 0x00c331c0
0099f38c	ldurb w8,[x29, #-0xe0]
0099f390	ldp x10,x9,[x29, #-0xd8]
0099f394	orr x11,x22,#0x1
0099f398	tst w8,#0x1
0099f39c	lsr w12,w8,#0x1
0099f3a0	csel x1,x11,x9,eq
0099f3a4	csel x2,x12,x10,eq
0099f3a8	mov x0,x26
0099f3ac	bl 0x00c30e90
0099f3b0	adrp x1,0x2b9000
0099f3b4	add x1,x1,#0x17a
0099f3b8	mov w2,#0x2
0099f3bc	bl 0x00c30e90
0099f3c0	ldurb w8,[x29, #-0xe0]
0099f3c4	tbz w8,#0x0,0x0099f3d0
0099f3c8	ldur x0,[x29, #-0xd0]
0099f3cc	bl 0x00c301d0
0099f3d0	stp xzr,xzr,[x29, #-0xe0]
0099f3d4	stur xzr,[x29, #-0xd0]
0099f3d8	mov w0,#0x20
0099f3dc	bl 0x00c2fed0
0099f3e0	adrp x9,0x2bf000
0099f3e4	adrp x8,0x29c000
0099f3e8	add x9,x9,#0x584
0099f3ec	ldr q0,[x8, #0x280]
0099f3f0	ldr x8,[x9, #0x10]
0099f3f4	ldr q1,[x9]
0099f3f8	sub x9,x29,#0xe0
0099f3fc	stur x0,[x29, #-0xd0]
0099f400	strb wzr,[x0, #0x18]
0099f404	stur q0,[x29, #-0xe0]
0099f408	str x8,[x0, #0x10]
0099f40c	str q1,[x0]
0099f410	str x9,[sp, #0x80]
0099f414	adrp x2,0x74a000
0099f418	add x2,x2,#0xba8
0099f41c	add x0,sp,#0xf0
0099f420	sub x1,x29,#0xe0
0099f424	add x3,sp,#0x80
0099f428	add x4,sp,#0x158
0099f42c	bl 0x00c32fb0
0099f430	stp xzr,xzr,[sp, #0xd8]
0099f434	str xzr,[sp, #0xd0]
0099f438	mov x8,x0
0099f43c	ldrb w9,[x8, #0x38]!
0099f440	tbnz w9,#0x0,0x0099f488
0099f444	ldr x9,[x8, #0x10]
0099f448	str x9,[sp, #0xe0]
0099f44c	ldr q0,[x8]
0099f450	str q0,[sp, #0xd0]
0099f454	ldurb w8,[x29, #-0xe0]
0099f458	tbz w8,#0x0,0x0099f464
0099f45c	ldur x0,[x29, #-0xd0]
0099f460	bl 0x00c301d0
0099f464	ldrb w8,[sp, #0xd0]
0099f468	stp xzr,xzr,[sp, #0xb0]
0099f46c	str xzr,[sp, #0xc0]
0099f470	tbnz w8,#0x0,0x0099f4b8
0099f474	ldr x8,[sp, #0xe0]
0099f478	ldr q0,[sp, #0xd0]
0099f47c	str x8,[sp, #0xc0]
0099f480	str q0,[sp, #0xb0]
0099f484	b 0x0099f55c
0099f488	ldr x26,[x0, #0x40]
0099f48c	cmn x26,#0x10
0099f490	b.cs 0x0099f940
0099f494	ldr x27,[x0, #0x48]
0099f498	cmp x26,#0x17
0099f49c	b.cs 0x0099f4e8
0099f4a0	add x9,sp,#0xd0
0099f4a4	lsl w8,w26,#0x1
0099f4a8	orr x23,x9,#0x1
0099f4ac	strb w8,[sp, #0xd0]
0099f4b0	cbnz x26,0x0099f508
0099f4b4	b 0x0099f518
0099f4b8	ldr x26,[sp, #0xd8]
0099f4bc	cmn x26,#0x10
0099f4c0	b.cs 0x0099f948
0099f4c4	ldr x27,[sp, #0xe0]
0099f4c8	cmp x26,#0x17
0099f4cc	b.cs 0x0099f528
0099f4d0	add x9,sp,#0xb0
0099f4d4	lsl w8,w26,#0x1
0099f4d8	orr x23,x9,#0x1
0099f4dc	strb w8,[sp, #0xb0]
0099f4e0	cbnz x26,0x0099f548
0099f4e4	b 0x0099f558
0099f4e8	add x8,x26,#0x10
0099f4ec	and x22,x8,#-0x10
0099f4f0	mov x0,x22
0099f4f4	bl 0x00c2fed0
0099f4f8	orr x8,x22,#0x1
0099f4fc	mov x23,x0
0099f500	stp x26,x0,[sp, #0xd8]
0099f504	str x8,[sp, #0xd0]
0099f508	mov x0,x23
0099f50c	mov x1,x27
0099f510	mov x2,x26
0099f514	bl 0x00c2ffd0
0099f518	strb wzr,[x23, x26]
0099f51c	ldurb w8,[x29, #-0xe0]
0099f520	tbz w8,#0x0,0x0099f464
0099f524	b 0x0099f45c
0099f528	add x8,x26,#0x10
0099f52c	and x22,x8,#-0x10
0099f530	mov x0,x22
0099f534	bl 0x00c2fed0
0099f538	orr x8,x22,#0x1
0099f53c	mov x23,x0
0099f540	stp x26,x0,[sp, #0xb8]
0099f544	str x8,[sp, #0xb0]
0099f548	mov x0,x23
0099f54c	mov x1,x27
0099f550	mov x2,x26
0099f554	bl 0x00c2ffd0
0099f558	strb wzr,[x23, x26]
0099f55c	add x0,sp,#0xc8
0099f560	add x1,sp,#0xb0
0099f564	bl 0x00c33d70
0099f568	ldrb w8,[sp, #0xb0]
0099f56c	tbz w8,#0x0,0x0099f578
0099f570	ldr x0,[sp, #0xc0]
0099f574	bl 0x00c301d0
0099f578	add x0,sp,#0xc8
0099f57c	bl 0x00c33db0
0099f580	and w8,w0,w21
0099f584	tbz w8,#0x0,0x0099f5ec
0099f588	ldr x8,[x20, #0x20]
0099f58c	mov w9,#0x1
0099f590	stlrb w9,[x8]
0099f594	ldr x8,[x20, #0x10]
0099f598	ldr x0,[x8]
0099f59c	add x1,sp,#0xc8
0099f5a0	bl 0x00c33c20
0099f5a4	tbz w0,#0x0,0x0099f820
0099f5a8	sub x8,x29,#0xe0
0099f5ac	add x0,sp,#0xc8
0099f5b0	sub x21,x29,#0xe0
0099f5b4	bl 0x00c33d60
0099f5b8	ldurb w8,[x29, #-0xe0]
0099f5bc	ldp x10,x9,[x29, #-0xd8]
0099f5c0	orr x11,x21,#0x1
0099f5c4	tst w8,#0x1
0099f5c8	lsr w12,w8,#0x1
0099f5cc	csel x1,x11,x9,eq
0099f5d0	csel x2,x12,x10,eq
0099f5d4	mov x0,x24
0099f5d8	bl 0x00c30e90
0099f5dc	ldurb w8,[x29, #-0xe0]
0099f5e0	tbz w8,#0x0,0x0099f5ec
0099f5e4	ldur x0,[x29, #-0xd0]
0099f5e8	bl 0x00c301d0
0099f5ec	adrp x1,0x2b9000
0099f5f0	add x1,x1,#0x17a
0099f5f4	mov w2,#0x2
0099f5f8	mov x0,x24
0099f5fc	bl 0x00c30e90
0099f600	ldr x8,[x20, #0x8]
0099f604	ldr x20,[x8]
0099f608	ldr x0,[sp, #0x18]
0099f60c	sub x8,x29,#0xe0
0099f610	bl 0x00c30e20
0099f614	adrp x22,0xcb4000
0099f618	ldr x22,[x22, #0xc90]
0099f61c	sub x1,x29,#0xe0
0099f620	sub x2,x29,#0xa0
0099f624	mov x0,x20
0099f628	bl 0x00c33180
0099f62c	adrp x21,0xcb4000
0099f630	ldurb w8,[x29, #-0xe0]
0099f634	ldr x21,[x21, #0xa08]
0099f638	mov w20,w0
0099f63c	tbz w8,#0x0,0x0099f648
0099f640	ldur x0,[x29, #-0xd0]
0099f644	bl 0x00c301d0
0099f648	tbz w20,#0x0,0x0099f790
0099f64c	ldr x22,[sp, #0xf0]
0099f650	add x8,sp,#0x50
0099f654	add x20,x8,#0x8
0099f658	stp xzr,xzr,[sp, #0x80]
0099f65c	cmp x22,x25
0099f660	str xzr,[sp, #0x90]
0099f664	stp xzr,xzr,[sp, #0x58]
0099f668	str x20,[sp, #0x50]
0099f66c	b.eq 0x0099f738
0099f670	add x24,x22,#0x20
0099f674	add x0,sp,#0x50
0099f678	add x2,sp,#0x158
0099f67c	add x3,sp,#0x150
0099f680	mov x1,x20
0099f684	mov x4,x24
0099f688	bl 0x00c32f90
0099f68c	ldr x8,[x0]
0099f690	mov x21,x0
0099f694	cbnz x8,0x0099f6e4
0099f698	sub x8,x29,#0xe0
0099f69c	add x0,sp,#0x50
0099f6a0	mov x1,x24
0099f6a4	bl 0x00c32fa0
0099f6a8	ldur x1,[x29, #-0xe0]
0099f6ac	ldr x8,[sp, #0x158]
0099f6b0	stp xzr,xzr,[x1]
0099f6b4	str x8,[x1, #0x10]
0099f6b8	str x1,[x21]
0099f6bc	ldr x8,[sp, #0x50]
0099f6c0	ldr x8,[x8]
0099f6c4	cbz x8,0x0099f6d0
0099f6c8	str x8,[sp, #0x50]
0099f6cc	ldr x1,[x21]
0099f6d0	ldr x0,[sp, #0x58]
0099f6d4	bl 0x00c30c90
0099f6d8	ldr x8,[sp, #0x60]
0099f6dc	add x8,x8,#0x1
0099f6e0	str x8,[sp, #0x60]
0099f6e4	ldr x8,[x22, #0x8]
0099f6e8	cbz x8,0x0099f6fc
0099f6ec	mov x22,x8
0099f6f0	ldr x8,[x8]
0099f6f4	cbnz x8,0x0099f6ec
0099f6f8	b 0x0099f730
0099f6fc	mov x8,x22
0099f700	ldr x9,[x8, #0x10]!
0099f704	ldr x10,[x9]
0099f708	cmp x10,x22
0099f70c	b.eq 0x0099f72c
0099f710	ldr x9,[x8]
0099f714	mov x8,x9
0099f718	ldr x22,[x8, #0x10]!
0099f71c	ldr x10,[x22]
0099f720	cmp x10,x9
0099f724	b.ne 0x0099f710
0099f728	b 0x0099f730
0099f72c	mov x22,x9
0099f730	cmp x22,x25
0099f734	b.ne 0x0099f670
0099f738	mov w1,#0x1
0099f73c	mov w2,#0xc8
0099f740	add x3,sp,#0x80
0099f744	add x4,sp,#0x50
0099f748	add x5,sp,#0x120
0099f74c	mov x0,x19
0099f750	bl 0x00c33bc0
0099f754	ldr x1,[sp, #0x58]
0099f758	add x0,sp,#0x50
0099f75c	bl 0x00c32fc0
0099f760	ldrb w8,[sp, #0x80]
0099f764	tbz w8,#0x0,0x0099f770
0099f768	ldr x0,[sp, #0x90]
0099f76c	bl 0x00c301d0
0099f770	adrp x21,0xcb4000
0099f774	adrp x22,0xcb4000
0099f778	ldr x21,[x21, #0xa08]
0099f77c	ldr x22,[x22, #0xc90]
0099f780	ldr x19,[sp, #0x30]
0099f784	ldrb w8,[sp, #0xd0]
0099f788	tbnz w8,#0x0,0x0099f8d4
0099f78c	b 0x0099f8dc
0099f790	stp xzr,xzr,[x29, #-0xe0]
0099f794	stur xzr,[x29, #-0xd0]
0099f798	orr w0,wzr,#0x30
0099f79c	bl 0x00c2fed0
0099f7a0	adrp x9,0x2d1000
0099f7a4	adrp x8,0x29c000
0099f7a8	add x9,x9,#0x2f8
0099f7ac	ldr q0,[x8, #0x5b0]
0099f7b0	ldur x8,[x9, #0x1d]
0099f7b4	ldp q1,q2,[x9]
0099f7b8	stur x0,[x29, #-0xd0]
0099f7bc	stur q0,[x29, #-0xe0]
0099f7c0	stur x8,[x0, #0x1d]
0099f7c4	add x8,sp,#0x68
0099f7c8	add x8,x8,#0x8
0099f7cc	stp q1,q2,[x0]
0099f7d0	strb wzr,[x0, #0x25]
0099f7d4	stp xzr,xzr,[sp, #0x70]
0099f7d8	stp xzr,xzr,[sp, #0x80]
0099f7dc	str x8,[sp, #0x68]
0099f7e0	str xzr,[sp, #0x90]
0099f7e4	sub x3,x29,#0xe0
0099f7e8	add x4,sp,#0x68
0099f7ec	add x5,sp,#0x80
0099f7f0	mov x0,x19
0099f7f4	mov w1,wzr
0099f7f8	mov w2,wzr
0099f7fc	bl 0x00c33bc0
0099f800	ldrb w8,[sp, #0x80]
0099f804	ldr x19,[sp, #0x30]
0099f808	tbz w8,#0x0,0x0099f814
0099f80c	ldr x0,[sp, #0x90]
0099f810	bl 0x00c301d0
0099f814	ldr x1,[sp, #0x70]
0099f818	add x0,sp,#0x68
0099f81c	b 0x0099f8b8
0099f820	stp xzr,xzr,[x29, #-0xe0]
0099f824	stur xzr,[x29, #-0xd0]
0099f828	adrp x21,0xcb4000
0099f82c	ldr x21,[x21, #0xa08]
0099f830	orr w0,wzr,#0x30
0099f834	bl 0x00c2fed0
0099f838	adrp x8,0x29c000
0099f83c	ldr q0,[x8, #0x1e0]
0099f840	adrp x8,0x2d3000
0099f844	add x8,x8,#0x3f5
0099f848	ldur q1,[x8, #0x1f]
0099f84c	ldp q2,q3,[x8]
0099f850	add x8,sp,#0x98
0099f854	add x8,x8,#0x8
0099f858	stur x0,[x29, #-0xd0]
0099f85c	stur q0,[x29, #-0xe0]
0099f860	stur q1,[x0, #0x1f]
0099f864	stp q2,q3,[x0]
0099f868	strb wzr,[x0, #0x2f]
0099f86c	stp xzr,xzr,[sp, #0xa0]
0099f870	stp xzr,xzr,[sp, #0x80]
0099f874	stp xzr,x8,[sp, #0x90]
0099f878	adrp x22,0xcb4000
0099f87c	ldr x22,[x22, #0xc90]
0099f880	sub x3,x29,#0xe0
0099f884	add x4,sp,#0x98
0099f888	add x5,sp,#0x80
0099f88c	mov x0,x19
0099f890	mov w1,wzr
0099f894	mov w2,wzr
0099f898	bl 0x00c33bc0
0099f89c	ldrb w8,[sp, #0x80]
0099f8a0	ldr x19,[sp, #0x30]
0099f8a4	tbz w8,#0x0,0x0099f8b0
0099f8a8	ldr x0,[sp, #0x90]
0099f8ac	bl 0x00c301d0
0099f8b0	ldr x1,[sp, #0xa0]
0099f8b4	add x0,sp,#0x98
0099f8b8	bl 0x00c32fc0
0099f8bc	ldurb w8,[x29, #-0xe0]
0099f8c0	tbz w8,#0x0,0x0099f8cc
0099f8c4	ldur x0,[x29, #-0xd0]
0099f8c8	bl 0x00c301d0
0099f8cc	ldrb w8,[sp, #0xd0]
0099f8d0	tbz w8,#0x0,0x0099f8dc
0099f8d4	ldr x0,[sp, #0xe0]
0099f8d8	bl 0x00c301d0
0099f8dc	adrp x11,0xcb4000
0099f8e0	add x8,x22,#0x18
0099f8e4	ldr x11,[x11, #0xa00]
0099f8e8	str x8,[sp, #0x160]
0099f8ec	ldrb w8,[sp, #0x1b8]
0099f8f0	add x9,x22,#0x68
0099f8f4	add x10,x22,#0x40
0099f8f8	add x11,x11,#0x10
0099f8fc	str x9,[sp, #0x1e0]
0099f900	stp x10,x11,[sp, #0x170]
0099f904	tbz w8,#0x0,0x0099f910
0099f908	ldr x0,[sp, #0x1c8]
0099f90c	bl 0x00c301d0
0099f910	ldr x0,[sp, #0x20]
0099f914	add x8,x21,#0x10
0099f918	str x8,[sp, #0x178]
0099f91c	bl 0x00c30090
0099f920	mov x0,x19
0099f924	bl 0x00c30ee0
0099f928	b 0x0099ed78
0099f92c	bl 0x00c2fec0
0099f930	sub x0,x29,#0xe0
0099f934	bl 0x00c30ce0
0099f938	sub x0,x29,#0xe0
0099f93c	bl 0x00c30ce0
0099f940	add x0,sp,#0xd0
0099f944	bl 0x00c30ce0
0099f948	add x0,sp,#0xb0
0099f94c	bl 0x00c30ce0
