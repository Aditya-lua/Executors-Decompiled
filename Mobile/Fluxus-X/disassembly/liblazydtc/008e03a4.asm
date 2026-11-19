; blake3_hasher_update @ 008e03a4
008e03a4	stp x29,x30,[sp, #-0x60]!
008e03a8	stp x28,x27,[sp, #0x10]
008e03ac	stp x26,x25,[sp, #0x20]
008e03b0	stp x24,x23,[sp, #0x30]
008e03b4	stp x22,x21,[sp, #0x40]
008e03b8	stp x20,x19,[sp, #0x50]
008e03bc	mov x29,sp
008e03c0	sub sp,sp,#0x1d0
008e03c4	mrs x26,tpidr_el0
008e03c8	ldr x8,[x26, #0x28]
008e03cc	stur x8,[x29, #-0x18]
008e03d0	str x2,[sp, #0x28]
008e03d4	cbz x2,0x008e0eb8
008e03d8	ldrb w9,[x0, #0x89]
008e03dc	ldrb w8,[x0, #0x88]
008e03e0	mov x21,x1
008e03e4	mov x19,x0
008e03e8	add x27,sp,#0xb0
008e03ec	adds x9,x8,x9, LSL #0x6
008e03f0	b.eq 0x008e04e0
008e03f4	mov w10,#0x400
008e03f8	sub x9,x10,x9
008e03fc	ldr x10,[sp, #0x28]
008e0400	cmp x9,x10
008e0404	csel x25,x9,x10,cc
008e0408	cbz w8,0x008e04ec
008e040c	mov w9,#0x40
008e0410	add x23,x19,#0x48
008e0414	mov x1,x21
008e0418	sub x9,x9,x8
008e041c	add x0,x23,x8
008e0420	cmp x9,x25
008e0424	csel x22,x9,x25,cc
008e0428	mov x2,x22
008e042c	bl 0x00c2ffd0
008e0430	ldrb w8,[x19, #0x88]
008e0434	subs x20,x25,x22
008e0438	add w8,w8,w22
008e043c	add x22,x21,x22
008e0440	strb w8,[x19, #0x88]
008e0444	b.eq 0x008e0500
008e0448	ldrb w8,[x19, #0x89]
008e044c	ldrb w9,[x19, #0x8a]
008e0450	add x0,x19,#0x20
008e0454	ldr x3,[x19, #0x40]
008e0458	mov x1,x23
008e045c	mov w2,#0x40
008e0460	cmp w8,#0x0
008e0464	cset w8,eq
008e0468	orr w4,w9,w8
008e046c	bl 0x00c30ac0
008e0470	movi v0.2D,#0x0
008e0474	ldrb w8,[x19, #0x89]
008e0478	strb wzr,[x19, #0x88]
008e047c	add w8,w8,#0x1
008e0480	strb w8,[x19, #0x89]
008e0484	stp q0,q0,[x23]
008e0488	stp q0,q0,[x23, #0x20]
008e048c	cmp x20,#0x41
008e0490	b.cc 0x008e04fc
008e0494	ldrb w8,[x19, #0x89]
008e0498	ldrb w9,[x19, #0x8a]
008e049c	tst w8,#0xff
008e04a0	ldr x3,[x19, #0x40]
008e04a4	cset w8,eq
008e04a8	add x0,x19,#0x20
008e04ac	mov x1,x22
008e04b0	orr w4,w9,w8
008e04b4	mov w2,#0x40
008e04b8	bl 0x00c30ac0
008e04bc	ldrb w8,[x19, #0x89]
008e04c0	sub x20,x20,#0x40
008e04c4	add x22,x22,#0x40
008e04c8	cmp x20,#0x40
008e04cc	add w8,w8,#0x1
008e04d0	strb w8,[x19, #0x89]
008e04d4	b.hi 0x008e0498
008e04d8	ldrb w8,[x19, #0x88]
008e04dc	b 0x008e0500
008e04e0	str x26,[sp, #0x8]
008e04e4	mov x25,x21
008e04e8	b 0x008e07a4
008e04ec	mov x20,x25
008e04f0	mov x22,x21
008e04f4	cmp x20,#0x41
008e04f8	b.cs 0x008e0494
008e04fc	mov w8,wzr
008e0500	and x8,x8,#0xff
008e0504	mov w9,#0x40
008e0508	add x24,x19,#0x48
008e050c	sub x9,x9,x8
008e0510	add x0,x24,x8
008e0514	mov x1,x22
008e0518	cmp x9,x20
008e051c	csel x23,x9,x20,cc
008e0520	mov x2,x23
008e0524	bl 0x00c2ffd0
008e0528	ldrb w8,[x19, #0x88]
008e052c	add w2,w8,w23
008e0530	ldr x8,[sp, #0x28]
008e0534	strb w2,[x19, #0x88]
008e0538	subs x8,x8,x25
008e053c	str x8,[sp, #0x28]
008e0540	b.eq 0x008e0eb8
008e0544	ldp q0,q1,[x19, #0x20]
008e0548	sub x0,x29,#0x90
008e054c	ldrb w8,[x19, #0x89]
008e0550	ldr x3,[x19, #0x40]
008e0554	add x25,x21,x25
008e0558	str x26,[sp, #0x8]
008e055c	sub x22,x29,#0x90
008e0560	stp q0,q1,[sp, #0xb0]
008e0564	ldp q2,q0,[x24]
008e0568	cmp w8,#0x0
008e056c	ldrb w8,[x19, #0x8a]
008e0570	strb w2,[sp, #0x118]
008e0574	cset w9,eq
008e0578	str x3,[sp, #0xd0]
008e057c	stur q0,[x27, #0x38]
008e0580	ldp q1,q0,[x24, #0x20]
008e0584	orr w8,w8,w9
008e0588	stur q2,[x27, #0x28]
008e058c	orr w4,w8,#0x2
008e0590	add x8,sp,#0xb0
008e0594	stur q0,[x27, #0x58]
008e0598	ldp q3,q0,[x19, #0x20]
008e059c	add x1,x8,#0x28
008e05a0	stur q1,[x27, #0x48]
008e05a4	strb w4,[sp, #0x119]
008e05a8	stp q3,q0,[x29, #-0x90]
008e05ac	bl 0x00c30ac0
008e05b0	ldr d0,[x19, #0x40]
008e05b4	ldrb w8,[x19, #0x90]
008e05b8	ldp w28,w21,[x29, #-0x90]
008e05bc	cnt v0.8B,v0.8B
008e05c0	ldp w20,w16,[x29, #-0x88]
008e05c4	ldp w15,w14,[x29, #-0x80]
008e05c8	ldp w13,w12,[x29, #-0x78]
008e05cc	addv b0,v0.8B
008e05d0	fmov x23,d0
008e05d4	cmp w23,w8
008e05d8	b.cs 0x008e0690
008e05dc	str x25,[sp, #0x38]
008e05e0	add x25,x19,#0x91
008e05e4	mov w26,#0x40
008e05e8	mov w9,w8
008e05ec	stp w16,w15,[sp, #0x18]
008e05f0	stp w14,w13,[sp, #0x20]
008e05f4	str w12,[sp, #0x30]
008e05f8	sxtw x8,w9
008e05fc	ldp q0,q1,[x19]
008e0600	add x0,sp,#0x40
008e0604	add x1,x22,#0x28
008e0608	mov w2,#0x40
008e060c	add x27,x25,x8, LSL #0x5
008e0610	ldrb w8,[x19, #0x8a]
008e0614	mov x3,xzr
008e0618	stp q0,q1,[x29, #-0x90]
008e061c	ldp q3,q0,[x27, #-0x40]
008e0620	orr w4,w8,#0x4
008e0624	sturb w26,[x29, #-0x28]
008e0628	stur xzr,[x29, #-0x70]
008e062c	stur q0,[x22, #0x38]
008e0630	ldp q1,q0,[x27, #-0x20]
008e0634	stur q3,[x22, #0x28]
008e0638	sturb w4,[x29, #-0x27]
008e063c	stur q0,[x22, #0x58]
008e0640	ldp q2,q0,[x19]
008e0644	stur q1,[x22, #0x48]
008e0648	stp q2,q0,[sp, #0x40]
008e064c	bl 0x00c30ac0
008e0650	ldp w9,w8,[sp, #0x58]
008e0654	ldur q0,[sp, #0x48]
008e0658	stp w9,w8,[x27, #-0x28]
008e065c	ldrb w8,[x19, #0x90]
008e0660	stur q0,[x27, #-0x38]
008e0664	ldp w10,w9,[sp, #0x40]
008e0668	sub w8,w8,#0x1
008e066c	strb w8,[x19, #0x90]
008e0670	stp w10,w9,[x27, #-0x40]
008e0674	and w9,w8,#0xff
008e0678	cmp w23,w9
008e067c	b.cc 0x008e05f8
008e0680	ldp w14,w13,[sp, #0x20]
008e0684	ldp w16,w15,[sp, #0x18]
008e0688	ldr x25,[sp, #0x38]
008e068c	ldr w12,[sp, #0x30]
008e0690	and x9,x8,#0xff
008e0694	lsr w10,w28,#0x8
008e0698	lsr w11,w28,#0x18
008e069c	add x9,x19,x9, LSL #0x5
008e06a0	movi v0.2D,#0x0
008e06a4	add w8,w8,#0x1
008e06a8	strb w8,[x19, #0x90]
008e06ac	strb w10,[x9, #0x92]
008e06b0	lsr w10,w28,#0x10
008e06b4	strb w11,[x9, #0x94]
008e06b8	lsr w11,w21,#0x18
008e06bc	strb w10,[x9, #0x93]
008e06c0	lsr w10,w21,#0x8
008e06c4	strb w11,[x9, #0x98]
008e06c8	lsr w11,w20,#0x18
008e06cc	strb w10,[x9, #0x96]
008e06d0	lsr w10,w21,#0x10
008e06d4	strb w11,[x9, #0x9c]
008e06d8	lsr w11,w16,#0x18
008e06dc	strb w10,[x9, #0x97]
008e06e0	lsr w10,w20,#0x8
008e06e4	strb w11,[x9, #0xa0]
008e06e8	lsr w11,w15,#0x18
008e06ec	strb w10,[x9, #0x9a]
008e06f0	lsr w10,w20,#0x10
008e06f4	strb w11,[x9, #0xa4]
008e06f8	lsr w11,w14,#0x18
008e06fc	strb w10,[x9, #0x9b]
008e0700	lsr w10,w16,#0x8
008e0704	strb w11,[x9, #0xa8]
008e0708	lsr w11,w13,#0x18
008e070c	strb w10,[x9, #0x9e]
008e0710	lsr w10,w16,#0x10
008e0714	stp q0,q0,[x24]
008e0718	strb w10,[x9, #0x9f]
008e071c	lsr w10,w15,#0x8
008e0720	stp q0,q0,[x24, #0x20]
008e0724	ldp q1,q0,[x19]
008e0728	strb w10,[x9, #0xa2]
008e072c	lsr w10,w15,#0x10
008e0730	strb w11,[x9, #0xac]
008e0734	lsr w11,w12,#0x18
008e0738	strb w10,[x9, #0xa3]
008e073c	lsr w10,w14,#0x8
008e0740	strb w28,[x9, #0x91]
008e0744	strb w10,[x9, #0xa6]
008e0748	lsr w10,w14,#0x10
008e074c	strb w21,[x9, #0x95]
008e0750	strb w10,[x9, #0xa7]
008e0754	lsr w10,w13,#0x8
008e0758	strb w20,[x9, #0x99]
008e075c	strb w10,[x9, #0xaa]
008e0760	lsr w10,w13,#0x10
008e0764	strb w16,[x9, #0x9d]
008e0768	strb w10,[x9, #0xab]
008e076c	lsr w10,w12,#0x8
008e0770	strb w15,[x9, #0xa1]
008e0774	strb w10,[x9, #0xae]
008e0778	lsr w10,w12,#0x10
008e077c	strb w14,[x9, #0xa5]
008e0780	strb w10,[x9, #0xaf]
008e0784	ldr x10,[x19, #0x40]
008e0788	strb w13,[x9, #0xa9]
008e078c	add x8,x10,#0x1
008e0790	strb w12,[x9, #0xad]
008e0794	strb w11,[x9, #0xb0]
008e0798	str x8,[x19, #0x40]
008e079c	stp q1,q0,[x19, #0x20]
008e07a0	strh wzr,[x19, #0x88]
008e07a4	ldr x21,[sp, #0x28]
008e07a8	cmp x21,#0x401
008e07ac	b.cc 0x008e0cdc
008e07b0	add x8,sp,#0xb0
008e07b4	ldr x23,[x19, #0x40]
008e07b8	add x28,x19,#0x91
008e07bc	sub x26,x29,#0x90
008e07c0	add x8,x8,#0x28
008e07c4	mov w24,#0x1
008e07c8	mov w27,#0x40
008e07cc	str x8,[sp, #0x30]
008e07d0	b 0x008e0814
008e07d4	mov x21,x23
008e07d8	add x10,sp,#0xb0
008e07dc	and x9,x8,#0xff
008e07e0	add w8,w8,#0x1
008e07e4	ldp q0,q1,[x10, #0x20]
008e07e8	add x9,x28,x9, LSL #0x5
008e07ec	strb w8,[x19, #0x90]
008e07f0	stp q0,q1,[x9]
008e07f4	lsr x8,x22,#0xa
008e07f8	ldr x9,[x19, #0x40]
008e07fc	sub x21,x21,x22
008e0800	cmp x21,#0x400
008e0804	add x25,x25,x22
008e0808	add x23,x9,x8
008e080c	str x23,[x19, #0x40]
008e0810	b.ls 0x008e0cdc
008e0814	orr x8,x21,#0x1
008e0818	clz x8,x8
008e081c	eor x8,x8,#0x3f
008e0820	lsl x9,x24,x8
008e0824	lsl x8,x23,#0xa
008e0828	mov x22,x9
008e082c	sub x9,x9,#0x1
008e0830	tst x9,x8
008e0834	lsr x9,x22,#0x1
008e0838	b.ne 0x008e0828
008e083c	cmp x22,#0x400
008e0840	b.hi 0x008e08d0
008e0844	ldp q0,q1,[x19]
008e0848	cmp x22,#0x41
008e084c	ldr x9,[sp, #0x30]
008e0850	ldrb w8,[x19, #0x8a]
008e0854	str x23,[sp, #0xd0]
008e0858	str x25,[sp, #0x38]
008e085c	stp q0,q1,[sp, #0xb0]
008e0860	movi v0.2D,#0x0
008e0864	strh wzr,[x9, #0x40]
008e0868	strb w8,[sp, #0x11a]
008e086c	stp q0,q0,[x9]
008e0870	stp q0,q0,[x9, #0x20]
008e0874	b.cc 0x008e0a6c
008e0878	mov w8,wzr
008e087c	mov x24,x25
008e0880	mov x20,x22
008e0884	ldrb w9,[sp, #0x11a]
008e0888	tst w8,#0xff
008e088c	ldr x3,[sp, #0xd0]
008e0890	cset w8,eq
008e0894	add x0,sp,#0xb0
008e0898	mov x1,x24
008e089c	orr w4,w9,w8
008e08a0	mov w2,#0x40
008e08a4	bl 0x00c30ac0
008e08a8	ldrb w8,[sp, #0x119]
008e08ac	sub x20,x20,#0x40
008e08b0	add x24,x24,#0x40
008e08b4	cmp x20,#0x40
008e08b8	add w8,w8,#0x1
008e08bc	strb w8,[sp, #0x119]
008e08c0	b.hi 0x008e0884
008e08c4	ldrb w8,[sp, #0x118]
008e08c8	ldr x23,[sp, #0xd0]
008e08cc	b 0x008e0a78
008e08d0	ldrb w4,[x19, #0x8a]
008e08d4	add x5,sp,#0xb0
008e08d8	mov x0,x25
008e08dc	mov x1,x22
008e08e0	mov x2,x19
008e08e4	mov x3,x23
008e08e8	mov w6,wzr
008e08ec	bl 0x008dfe70
008e08f0	ldr d0,[x19, #0x40]
008e08f4	ldrb w8,[x19, #0x90]
008e08f8	cnt v0.8B,v0.8B
008e08fc	addv b0,v0.8B
008e0900	fmov x20,d0
008e0904	cmp w20,w8
008e0908	b.cs 0x008e09a0
008e090c	mov x23,x21
008e0910	mov w9,w8
008e0914	sxtw x8,w9
008e0918	ldp q0,q1,[x19]
008e091c	add x0,sp,#0x40
008e0920	add x1,x26,#0x28
008e0924	mov w2,#0x40
008e0928	add x21,x28,x8, LSL #0x5
008e092c	ldrb w8,[x19, #0x8a]
008e0930	mov x3,xzr
008e0934	stp q0,q1,[x29, #-0x90]
008e0938	ldp q3,q0,[x21, #-0x40]
008e093c	orr w4,w8,#0x4
008e0940	sturb w27,[x29, #-0x28]
008e0944	stur xzr,[x29, #-0x70]
008e0948	stur q0,[x26, #0x38]
008e094c	ldp q1,q0,[x21, #-0x20]
008e0950	stur q3,[x26, #0x28]
008e0954	sturb w4,[x29, #-0x27]
008e0958	stur q0,[x26, #0x58]
008e095c	ldp q2,q0,[x19]
008e0960	stur q1,[x26, #0x48]
008e0964	stp q2,q0,[sp, #0x40]
008e0968	bl 0x00c30ac0
008e096c	ldp w9,w8,[sp, #0x58]
008e0970	ldur q0,[sp, #0x48]
008e0974	stp w9,w8,[x21, #-0x28]
008e0978	ldrb w8,[x19, #0x90]
008e097c	stur q0,[x21, #-0x38]
008e0980	ldp w10,w9,[sp, #0x40]
008e0984	sub w8,w8,#0x1
008e0988	strb w8,[x19, #0x90]
008e098c	stp w10,w9,[x21, #-0x40]
008e0990	and w9,w8,#0xff
008e0994	cmp w20,w9
008e0998	b.cc 0x008e0914
008e099c	mov x21,x23
008e09a0	ldr x9,[x19, #0x40]
008e09a4	ldp q1,q2,[sp, #0xb0]
008e09a8	add x9,x9,x22, LSR #0xb
008e09ac	fmov d0,x9
008e09b0	and x9,x8,#0xff
008e09b4	add w8,w8,#0x1
008e09b8	add x10,x28,x9, LSL #0x5
008e09bc	and w9,w8,#0xff
008e09c0	strb w8,[x19, #0x90]
008e09c4	cnt v0.8B,v0.8B
008e09c8	stp q1,q2,[x10]
008e09cc	addv b0,v0.8B
008e09d0	fmov x20,d0
008e09d4	cmp w20,w9
008e09d8	b.cs 0x008e07d8
008e09dc	mov x23,x21
008e09e0	sxtw x8,w9
008e09e4	ldp q0,q1,[x19]
008e09e8	add x0,sp,#0x40
008e09ec	add x1,x26,#0x28
008e09f0	mov w2,#0x40
008e09f4	add x21,x28,x8, LSL #0x5
008e09f8	ldrb w8,[x19, #0x8a]
008e09fc	mov x3,xzr
008e0a00	stp q0,q1,[x29, #-0x90]
008e0a04	ldp q3,q0,[x21, #-0x40]
008e0a08	orr w4,w8,#0x4
008e0a0c	sturb w27,[x29, #-0x28]
008e0a10	stur xzr,[x29, #-0x70]
008e0a14	stur q0,[x26, #0x38]
008e0a18	ldp q1,q0,[x21, #-0x20]
008e0a1c	stur q3,[x26, #0x28]
008e0a20	sturb w4,[x29, #-0x27]
008e0a24	stur q0,[x26, #0x58]
008e0a28	ldp q2,q0,[x19]
008e0a2c	stur q1,[x26, #0x48]
008e0a30	stp q2,q0,[sp, #0x40]
008e0a34	bl 0x00c30ac0
008e0a38	ldp w9,w8,[sp, #0x58]
008e0a3c	ldur q0,[sp, #0x48]
008e0a40	stp w9,w8,[x21, #-0x28]
008e0a44	ldrb w8,[x19, #0x90]
008e0a48	stur q0,[x21, #-0x38]
008e0a4c	ldp w10,w9,[sp, #0x40]
008e0a50	sub w8,w8,#0x1
008e0a54	strb w8,[x19, #0x90]
008e0a58	stp w10,w9,[x21, #-0x40]
008e0a5c	and w9,w8,#0xff
008e0a60	cmp w20,w9
008e0a64	b.cc 0x008e09e0
008e0a68	b 0x008e07d4
008e0a6c	mov x8,xzr
008e0a70	mov x20,x22
008e0a74	mov x24,x25
008e0a78	sub x9,x27,x8
008e0a7c	mov x1,x24
008e0a80	cmp x9,x20
008e0a84	csel x25,x9,x20,cc
008e0a88	ldr x20,[sp, #0x30]
008e0a8c	mov x2,x25
008e0a90	add x0,x20,x8
008e0a94	bl 0x00c2ffd0
008e0a98	ldp q0,q1,[sp, #0xb0]
008e0a9c	add x10,sp,#0x40
008e0aa0	ldrb w8,[sp, #0x118]
008e0aa4	ldrb w9,[sp, #0x119]
008e0aa8	sub x0,x29,#0x90
008e0aac	ldp q3,q4,[sp, #0xb0]
008e0ab0	add x1,x10,#0x28
008e0ab4	stp q0,q1,[sp, #0x40]
008e0ab8	ldp q2,q0,[x20]
008e0abc	add w2,w8,w25
008e0ac0	cmp w9,#0x0
008e0ac4	ldrb w8,[sp, #0x11a]
008e0ac8	cset w9,eq
008e0acc	mov x3,x23
008e0ad0	strb w2,[sp, #0x118]
008e0ad4	stur q0,[x10, #0x38]
008e0ad8	ldp q1,q0,[x20, #0x20]
008e0adc	orr w8,w8,w9
008e0ae0	stur q2,[x10, #0x28]
008e0ae4	orr w4,w8,#0x2
008e0ae8	strb w2,[sp, #0xa8]
008e0aec	stur q1,[x10, #0x48]
008e0af0	stur q0,[x10, #0x58]
008e0af4	str x23,[sp, #0x60]
008e0af8	strb w4,[sp, #0xa9]
008e0afc	stp q3,q4,[x29, #-0x90]
008e0b00	bl 0x00c30ac0
008e0b04	ldr d0,[sp, #0xd0]
008e0b08	ldrb w8,[x19, #0x90]
008e0b0c	ldp w25,w24,[x29, #-0x90]
008e0b10	cnt v0.8B,v0.8B
008e0b14	ldp w17,w16,[x29, #-0x88]
008e0b18	ldp w15,w14,[x29, #-0x80]
008e0b1c	ldp w13,w12,[x29, #-0x78]
008e0b20	addv b0,v0.8B
008e0b24	fmov x20,d0
008e0b28	cmp w20,w8
008e0b2c	b.cs 0x008e0be0
008e0b30	mov w9,w8
008e0b34	add x23,sp,#0xb0
008e0b38	stp w17,w16,[sp, #0x10]
008e0b3c	stp w15,w14,[sp, #0x18]
008e0b40	stp w13,w12,[sp, #0x20]
008e0b44	str x21,[sp, #0x28]
008e0b48	sxtw x8,w9
008e0b4c	ldp q0,q1,[x19]
008e0b50	sub x0,x29,#0xb0
008e0b54	add x1,x26,#0x28
008e0b58	mov w2,#0x40
008e0b5c	add x21,x28,x8, LSL #0x5
008e0b60	ldrb w8,[x19, #0x8a]
008e0b64	mov x3,xzr
008e0b68	stp q0,q1,[x29, #-0x90]
008e0b6c	ldp q3,q0,[x21, #-0x40]
008e0b70	orr w4,w8,#0x4
008e0b74	sturb w27,[x29, #-0x28]
008e0b78	stur xzr,[x29, #-0x70]
008e0b7c	stur q0,[x26, #0x38]
008e0b80	ldp q1,q0,[x21, #-0x20]
008e0b84	stur q3,[x26, #0x28]
008e0b88	sturb w4,[x29, #-0x27]
008e0b8c	stur q0,[x26, #0x58]
008e0b90	ldp q2,q0,[x19]
008e0b94	stur q1,[x26, #0x48]
008e0b98	stp q2,q0,[x29, #-0xb0]
008e0b9c	bl 0x00c30ac0
008e0ba0	ldp w9,w8,[x29, #-0x98]
008e0ba4	ldur q0,[x23, #0x78]
008e0ba8	stp w9,w8,[x21, #-0x28]
008e0bac	ldrb w8,[x19, #0x90]
008e0bb0	stur q0,[x21, #-0x38]
008e0bb4	ldp w10,w9,[x29, #-0xb0]
008e0bb8	sub w8,w8,#0x1
008e0bbc	strb w8,[x19, #0x90]
008e0bc0	stp w10,w9,[x21, #-0x40]
008e0bc4	and w9,w8,#0xff
008e0bc8	cmp w20,w9
008e0bcc	b.cc 0x008e0b48
008e0bd0	ldp w13,w12,[sp, #0x20]
008e0bd4	ldp w15,w14,[sp, #0x18]
008e0bd8	ldp w17,w16,[sp, #0x10]
008e0bdc	ldr x21,[sp, #0x28]
008e0be0	and x9,x8,#0xff
008e0be4	lsr w10,w25,#0x8
008e0be8	lsr w11,w25,#0x18
008e0bec	add x9,x28,x9, LSL #0x5
008e0bf0	add w8,w8,#0x1
008e0bf4	strb w8,[x19, #0x90]
008e0bf8	strb w10,[x9, #0x1]
008e0bfc	lsr w10,w25,#0x10
008e0c00	strb w11,[x9, #0x3]
008e0c04	lsr w11,w24,#0x18
008e0c08	strb w10,[x9, #0x2]
008e0c0c	lsr w10,w24,#0x8
008e0c10	strb w11,[x9, #0x7]
008e0c14	lsr w11,w17,#0x18
008e0c18	strb w10,[x9, #0x5]
008e0c1c	lsr w10,w24,#0x10
008e0c20	strb w11,[x9, #0xb]
008e0c24	lsr w11,w16,#0x18
008e0c28	strb w10,[x9, #0x6]
008e0c2c	lsr w10,w17,#0x8
008e0c30	strb w11,[x9, #0xf]
008e0c34	lsr w11,w15,#0x18
008e0c38	strb w10,[x9, #0x9]
008e0c3c	lsr w10,w17,#0x10
008e0c40	strb w11,[x9, #0x13]
008e0c44	lsr w11,w14,#0x18
008e0c48	strb w10,[x9, #0xa]
008e0c4c	lsr w10,w16,#0x8
008e0c50	strb w11,[x9, #0x17]
008e0c54	lsr w11,w13,#0x18
008e0c58	strb w10,[x9, #0xd]
008e0c5c	lsr w10,w16,#0x10
008e0c60	strb w11,[x9, #0x1b]
008e0c64	lsr w11,w12,#0x18
008e0c68	strb w10,[x9, #0xe]
008e0c6c	lsr w10,w15,#0x8
008e0c70	strb w25,[x9]
008e0c74	ldr x25,[sp, #0x38]
008e0c78	strb w10,[x9, #0x11]
008e0c7c	lsr w10,w15,#0x10
008e0c80	strb w24,[x9, #0x4]
008e0c84	mov w24,#0x1
008e0c88	strb w10,[x9, #0x12]
008e0c8c	lsr w10,w14,#0x8
008e0c90	strb w17,[x9, #0x8]
008e0c94	strb w10,[x9, #0x15]
008e0c98	lsr w10,w14,#0x10
008e0c9c	strb w16,[x9, #0xc]
008e0ca0	strb w10,[x9, #0x16]
008e0ca4	lsr w10,w13,#0x8
008e0ca8	strb w15,[x9, #0x10]
008e0cac	strb w10,[x9, #0x19]
008e0cb0	lsr w10,w13,#0x10
008e0cb4	strb w14,[x9, #0x14]
008e0cb8	strb w10,[x9, #0x1a]
008e0cbc	lsr w10,w12,#0x8
008e0cc0	strb w13,[x9, #0x18]
008e0cc4	strb w10,[x9, #0x1d]
008e0cc8	lsr w10,w12,#0x10
008e0ccc	strb w12,[x9, #0x1c]
008e0cd0	strb w10,[x9, #0x1e]
008e0cd4	strb w11,[x9, #0x1f]
008e0cd8	b 0x008e07f4
008e0cdc	ldr x26,[sp, #0x8]
008e0ce0	cbz x21,0x008e0eb8
008e0ce4	ldrb w8,[x19, #0x88]
008e0ce8	mov x10,x21
008e0cec	cbz x8,0x008e0dc8
008e0cf0	mov w9,#0x40
008e0cf4	add x22,x19,#0x48
008e0cf8	mov x1,x25
008e0cfc	sub x9,x9,x8
008e0d00	add x0,x22,x8
008e0d04	mov x21,x10
008e0d08	cmp x9,x10
008e0d0c	csel x23,x9,x10,cc
008e0d10	mov x2,x23
008e0d14	bl 0x00c2ffd0
008e0d18	ldrb w8,[x19, #0x88]
008e0d1c	subs x21,x21,x23
008e0d20	add x25,x25,x23
008e0d24	add w8,w8,w23
008e0d28	strb w8,[x19, #0x88]
008e0d2c	b.eq 0x008e0dd8
008e0d30	ldrb w8,[x19, #0x89]
008e0d34	ldrb w9,[x19, #0x8a]
008e0d38	add x0,x19,#0x20
008e0d3c	ldr x3,[x19, #0x40]
008e0d40	mov x1,x22
008e0d44	mov w2,#0x40
008e0d48	cmp w8,#0x0
008e0d4c	cset w8,eq
008e0d50	orr w4,w9,w8
008e0d54	bl 0x00c30ac0
008e0d58	movi v0.2D,#0x0
008e0d5c	ldrb w8,[x19, #0x89]
008e0d60	strb wzr,[x19, #0x88]
008e0d64	add w8,w8,#0x1
008e0d68	strb w8,[x19, #0x89]
008e0d6c	stp q0,q0,[x22]
008e0d70	stp q0,q0,[x22, #0x20]
008e0d74	cmp x21,#0x41
008e0d78	b.cc 0x008e0dd4
008e0d7c	ldrb w8,[x19, #0x89]
008e0d80	ldrb w9,[x19, #0x8a]
008e0d84	tst w8,#0xff
008e0d88	ldr x3,[x19, #0x40]
008e0d8c	cset w8,eq
008e0d90	add x0,x19,#0x20
008e0d94	mov x1,x25
008e0d98	orr w4,w9,w8
008e0d9c	mov w2,#0x40
008e0da0	bl 0x00c30ac0
008e0da4	ldrb w8,[x19, #0x89]
008e0da8	sub x21,x21,#0x40
008e0dac	add x25,x25,#0x40
008e0db0	cmp x21,#0x40
008e0db4	add w8,w8,#0x1
008e0db8	strb w8,[x19, #0x89]
008e0dbc	b.hi 0x008e0d80
008e0dc0	ldrb w8,[x19, #0x88]
008e0dc4	b 0x008e0dd8
008e0dc8	mov x21,x10
008e0dcc	cmp x21,#0x41
008e0dd0	b.cs 0x008e0d7c
008e0dd4	mov w8,wzr
008e0dd8	and x8,x8,#0xff
008e0ddc	mov w20,#0x40
008e0de0	mov x1,x25
008e0de4	sub x9,x20,x8
008e0de8	add x8,x19,x8
008e0dec	cmp x9,x21
008e0df0	add x0,x8,#0x48
008e0df4	csel x21,x9,x21,cc
008e0df8	mov x2,x21
008e0dfc	bl 0x00c2ffd0
008e0e00	ldr d0,[x19, #0x40]
008e0e04	ldrb w9,[x19, #0x88]
008e0e08	ldrb w8,[x19, #0x90]
008e0e0c	cnt v0.8B,v0.8B
008e0e10	add w9,w9,w21
008e0e14	strb w9,[x19, #0x88]
008e0e18	addv b0,v0.8B
008e0e1c	fmov x22,d0
008e0e20	cmp w22,w8
008e0e24	b.cs 0x008e0eb8
008e0e28	add x21,x19,#0x91
008e0e2c	sub x23,x29,#0x90
008e0e30	sxtw x8,w8
008e0e34	ldp q0,q1,[x19]
008e0e38	add x0,sp,#0xb0
008e0e3c	add x1,x23,#0x28
008e0e40	mov w2,#0x40
008e0e44	add x24,x21,x8, LSL #0x5
008e0e48	ldrb w8,[x19, #0x8a]
008e0e4c	mov x3,xzr
008e0e50	stp q0,q1,[x29, #-0x90]
008e0e54	ldp q3,q0,[x24, #-0x40]
008e0e58	orr w4,w8,#0x4
008e0e5c	sturb w20,[x29, #-0x28]
008e0e60	stur xzr,[x29, #-0x70]
008e0e64	stur q0,[x23, #0x38]
008e0e68	ldp q1,q0,[x24, #-0x20]
008e0e6c	stur q3,[x23, #0x28]
008e0e70	sturb w4,[x29, #-0x27]
008e0e74	stur q0,[x23, #0x58]
008e0e78	ldp q2,q0,[x19]
008e0e7c	stur q1,[x23, #0x48]
008e0e80	stp q2,q0,[sp, #0xb0]
008e0e84	bl 0x00c30ac0
008e0e88	ldp w9,w8,[sp, #0xc8]
008e0e8c	ldur q0,[sp, #0xb8]
008e0e90	stp w9,w8,[x24, #-0x28]
008e0e94	ldrb w8,[x19, #0x90]
008e0e98	stur q0,[x24, #-0x38]
008e0e9c	ldp w10,w9,[sp, #0xb0]
008e0ea0	sub w11,w8,#0x1
008e0ea4	and w8,w11,#0xff
008e0ea8	strb w11,[x19, #0x90]
008e0eac	cmp w22,w8
008e0eb0	stp w10,w9,[x24, #-0x40]
008e0eb4	b.cc 0x008e0e30
008e0eb8	ldr x8,[x26, #0x28]
008e0ebc	ldur x9,[x29, #-0x18]
008e0ec0	cmp x8,x9
008e0ec4	b.ne 0x008e0ee8
008e0ec8	add sp,sp,#0x1d0
008e0ecc	ldp x20,x19,[sp, #0x50]
008e0ed0	ldp x22,x21,[sp, #0x40]
008e0ed4	ldp x24,x23,[sp, #0x30]
008e0ed8	ldp x26,x25,[sp, #0x20]
008e0edc	ldp x28,x27,[sp, #0x10]
008e0ee0	ldp x29,x30,[sp], #0x60
008e0ee4	ret
008e0ee8	bl 0x00c2fec0
