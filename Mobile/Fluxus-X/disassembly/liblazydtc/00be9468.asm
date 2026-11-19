; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get @ 00be9468
00be9468	paciasp
00be946c	sub sp,sp,#0x80
00be9470	stp x29,x30,[sp, #0x30]
00be9474	stp x26,x25,[sp, #0x40]
00be9478	stp x24,x23,[sp, #0x50]
00be947c	stp x22,x21,[sp, #0x60]
00be9480	stp x20,x19,[sp, #0x70]
00be9484	add x29,sp,#0x30
00be9488	mov x23,x0
00be948c	add x8,sp,#0x10
00be9490	mov x0,x3
00be9494	mov w25,w6
00be9498	mov x19,x5
00be949c	mov x20,x4
00be94a0	mov x22,x3
00be94a4	mov x21,x2
00be94a8	str x1,[sp, #0x18]
00be94ac	str wzr,[x4]
00be94b0	bl 0x00c30070
00be94b4	adrp x26,0xcb4000
00be94b8	ldr x26,[x26, #0x998]
00be94bc	ldr x24,[sp, #0x10]
00be94c0	stur x26,[x29, #-0x10]
00be94c4	ldar x8,[x26]
00be94c8	cmn x8,#0x1
00be94cc	b.eq 0x00be94f8
00be94d0	sub x8,x29,#0x10
00be94d4	mov x9,sp
00be94d8	str x8,[sp]
00be94dc	stur x9,[x29, #-0x8]
00be94e0	adrp x0,0xcb4000
00be94e4	nop
00be94e8	adr x2,0xc0bab0
00be94ec	ldr x0,[x0, #0x998]
00be94f0	sub x1,x29,#0x8
00be94f4	bl 0x00c305d0
00be94f8	ldp x8,x10,[x24, #0x10]
00be94fc	ldrsw x9,[x26, #0x8]
00be9500	sub x9,x9,#0x1
00be9504	sub x10,x10,x8
00be9508	cmp x9,x10, ASR #0x3
00be950c	b.cs 0x00be9acc
00be9510	ldr x24,[x8, x9, LSL #0x3]
00be9514	cbz x24,0x00be9acc
00be9518	add x0,sp,#0x10
00be951c	bl 0x00c30090
00be9520	and w8,w25,#0xff
00be9524	sub w8,w8,#0x25
00be9528	cmp w8,#0x54
00be952c	b.hi 0x00be9a00
00be9530	adrp x9,0x78a000
00be9534	add x9,x9,#0x696
00be9538	adr x10,0xbe9548
00be953c	ldrh w11,[x9, x8, LSL #0x1]
00be9540	add x10,x10,x11, LSL #0x2
00be9544	br x10
00be9548	bti j
00be954c	ldr x8,[x23, #0x10]!
00be9550	mov x0,x23
00be9554	ldr x8,[x8, #0x8]
00be9558	blr x8
00be955c	mov x22,x0
00be9560	add x0,sp,#0x18
00be9564	mov x1,x21
00be9568	add x3,x22,#0x240
00be956c	mov x2,x22
00be9570	mov x4,x24
00be9574	mov x5,x20
00be9578	mov w6,wzr
00be957c	bl 0x00bda608
00be9580	sub x8,x0,x22
00be9584	cmp x8,#0x23f
00be9588	b.gt 0x00be9a10
00be958c	asr x8,x8,#0x3
00be9590	orr x9,xzr,#-0x5555555555555556
00be9594	movk x9,#0xaaab
00be9598	mul x8,x8,x9
00be959c	orr x9,xzr,#-0x5555555555555556
00be95a0	eor x9,x9,#-0x7fffffffffffffff
00be95a4	smulh x9,x8,x9
00be95a8	lsr x10,x9,#0x3f
00be95ac	add w9,w10,w9, LSR #0x1
00be95b0	mov w10,#0xc
00be95b4	msub w8,w9,w10,w8
00be95b8	str w8,[x19, #0x10]
00be95bc	b 0x00be9a10
00be95c0	bti j
00be95c4	add x0,sp,#0x18
00be95c8	mov x1,x21
00be95cc	mov x2,x20
00be95d0	mov x3,x24
00be95d4	mov w4,#0x2
00be95d8	bl 0x00bea2fc
00be95dc	ldr w8,[x20]
00be95e0	sub w9,w0,#0x1
00be95e4	cmp w9,#0x1e
00be95e8	b.hi 0x00be9a08
00be95ec	tbnz w8,#0x2,0x00be9a08
00be95f0	str w0,[x19, #0xc]
00be95f4	b 0x00be9a10
00be95f8	bti j
00be95fc	ldr x8,[x23, #0x10]!
00be9600	mov x0,x23
00be9604	ldr x8,[x8]
00be9608	blr x8
00be960c	mov x22,x0
00be9610	add x0,sp,#0x18
00be9614	mov x1,x21
00be9618	add x3,x22,#0x150
00be961c	mov x2,x22
00be9620	mov x4,x24
00be9624	mov x5,x20
00be9628	mov w6,wzr
00be962c	bl 0x00bda608
00be9630	sub x8,x0,x22
00be9634	cmp x8,#0x14f
00be9638	b.gt 0x00be9a10
00be963c	asr x8,x8,#0x3
00be9640	orr x9,xzr,#-0x5555555555555556
00be9644	movk x9,#0xaaab
00be9648	mul x8,x8,x9
00be964c	mov x9,#0x4925
00be9650	movk x9,#0x2492, LSL #16
00be9654	movk x9,#0x9249, LSL #32
00be9658	movk x9,#0x4924, LSL #48
00be965c	smulh x9,x8,x9
00be9660	lsr x10,x9,#0x3f
00be9664	lsr x9,x9,#0x1
00be9668	add w9,w9,w10
00be966c	sub w9,w9,w9, LSL #0x3
00be9670	add w8,w8,w9
00be9674	str w8,[x19, #0x18]
00be9678	b 0x00be9a10
00be967c	bti j
00be9680	add x1,sp,#0x18
00be9684	mov x0,x23
00be9688	mov x2,x21
00be968c	mov x3,x20
00be9690	mov x4,x24
00be9694	bl 0x00c441a0
00be9698	b 0x00be9a10
00be969c	bti j
00be96a0	mov w8,#0x2053
00be96a4	adrp x9,0x78a000
00be96a8	add x9,x9,#0x80b
00be96ac	movk w8,#0x7025, LSL #16
00be96b0	ldr x9,[x9]
00be96b4	ldr x1,[sp, #0x18]
00be96b8	stur w8,[sp, #0x7]
00be96bc	mov x8,sp
00be96c0	mov x6,sp
00be96c4	str x9,[sp]
00be96c8	add x7,x8,#0xb
00be96cc	b 0x00be98f4
00be96d0	bti j
00be96d4	mov x0,x23
00be96d8	ldr x8,[x0, #0x10]!
00be96dc	ldr x8,[x8, #0x30]
00be96e0	b 0x00be9758
00be96e4	bti j
00be96e8	add x0,sp,#0x18
00be96ec	mov x1,x21
00be96f0	mov x2,x20
00be96f4	mov x3,x24
00be96f8	mov w4,#0x4
00be96fc	bl 0x00bea2fc
00be9700	ldrb w8,[x20]
00be9704	tbnz w8,#0x2,0x00be9a10
00be9708	sub w8,w0,#0x76c
00be970c	str w8,[x19, #0x14]
00be9710	b 0x00be9a10
00be9714	bti j
00be9718	add x0,sp,#0x18
00be971c	mov x1,x21
00be9720	mov x2,x20
00be9724	mov x3,x24
00be9728	mov w4,#0x2
00be972c	bl 0x00bea2fc
00be9730	ldr w8,[x20]
00be9734	cmp w0,#0x3b
00be9738	b.gt 0x00be9a08
00be973c	tbnz w8,#0x2,0x00be9a08
00be9740	str w0,[x19, #0x4]
00be9744	b 0x00be9a10
00be9748	bti j
00be974c	mov x0,x23
00be9750	ldr x8,[x0, #0x10]!
00be9754	ldr x8,[x8, #0x18]
00be9758	blr x8
00be975c	ldrb w8,[x0]
00be9760	ldp x10,x9,[x0, #0x8]
00be9764	ldr x1,[sp, #0x18]
00be9768	lsr x11,x8,#0x1
00be976c	tst w8,#0x1
00be9770	csinc x6,x9,x0,ne
00be9774	csel x8,x11,x10,eq
00be9778	add x7,x6,x8
00be977c	b 0x00be98f4
00be9780	bti j
00be9784	mov x8,#0x6d25
00be9788	movk x8,#0x252f, LSL #16
00be978c	movk x8,#0x2f64, LSL #32
00be9790	movk x8,#0x7925, LSL #48
00be9794	b 0x00be98e0
00be9798	bti j
00be979c	add x0,sp,#0x18
00be97a0	mov x1,x21
00be97a4	mov x2,x20
00be97a8	mov x3,x24
00be97ac	mov w4,#0x2
00be97b0	bl 0x00bea2fc
00be97b4	ldr w9,[x20]
00be97b8	sub w8,w0,#0x1
00be97bc	cmp w8,#0xb
00be97c0	b.hi 0x00be9a68
00be97c4	tbnz w9,#0x2,0x00be9a68
00be97c8	str w8,[x19, #0x10]
00be97cc	b 0x00be9a10
00be97d0	bti j
00be97d4	mov x8,#0x4825
00be97d8	movk x8,#0x253a, LSL #16
00be97dc	movk x8,#0x3a4d, LSL #32
00be97e0	movk x8,#0x5325, LSL #48
00be97e4	b 0x00be98e0
00be97e8	bti j
00be97ec	add x0,sp,#0x18
00be97f0	mov x1,x21
00be97f4	mov x2,x20
00be97f8	mov x3,x24
00be97fc	mov w4,#0x2
00be9800	bl 0x00bea2fc
00be9804	ldr w8,[x20]
00be9808	cmp w0,#0x17
00be980c	b.le 0x00be986c
00be9810	b 0x00be9a08
00be9814	bti j
00be9818	mov w8,#0x4d
00be981c	mov w9,#0x4825
00be9820	ldr x1,[sp, #0x18]
00be9824	movk w9,#0x253a, LSL #16
00be9828	strb w8,[sp, #0x4]
00be982c	mov x8,sp
00be9830	str w9,[sp]
00be9834	mov x6,sp
00be9838	add x7,x8,#0x5
00be983c	b 0x00be98f4
00be9840	bti j
00be9844	add x0,sp,#0x18
00be9848	mov x1,x21
00be984c	mov x2,x20
00be9850	mov x3,x24
00be9854	mov w4,#0x2
00be9858	bl 0x00bea2fc
00be985c	ldr w8,[x20]
00be9860	sub w9,w0,#0x1
00be9864	cmp w9,#0xb
00be9868	b.hi 0x00be9a08
00be986c	tbnz w8,#0x2,0x00be9a08
00be9870	str w0,[x19, #0x8]
00be9874	b 0x00be9a10
00be9878	bti j
00be987c	add x1,sp,#0x18
00be9880	mov x0,x23
00be9884	mov x2,x21
00be9888	mov x3,x20
00be988c	mov x4,x24
00be9890	bl 0x00c441b0
00be9894	b 0x00be9a10
00be9898	bti j
00be989c	add x0,sp,#0x18
00be98a0	mov x1,x21
00be98a4	mov x2,x20
00be98a8	mov x3,x24
00be98ac	mov w4,#0x2
00be98b0	bl 0x00bea2fc
00be98b4	ldr w8,[x20]
00be98b8	cmp w0,#0x3c
00be98bc	b.gt 0x00be9a08
00be98c0	tbnz w8,#0x2,0x00be9a08
00be98c4	str w0,[x19]
00be98c8	b 0x00be9a10
00be98cc	bti j
00be98d0	mov x8,#0x5925
00be98d4	movk x8,#0x252d, LSL #16
00be98d8	movk x8,#0x2d6d, LSL #32
00be98dc	movk x8,#0x6425, LSL #48
00be98e0	ldr x1,[sp, #0x18]
00be98e4	str x8,[sp]
00be98e8	mov x8,sp
00be98ec	mov x6,sp
00be98f0	add x7,x8,#0x8
00be98f4	mov x0,x23
00be98f8	mov x2,x21
00be98fc	mov x3,x22
00be9900	mov x4,x20
00be9904	mov x5,x19
00be9908	bl 0x00c44190
00be990c	str x0,[sp, #0x18]
00be9910	b 0x00be9a10
00be9914	bti j
00be9918	add x0,sp,#0x18
00be991c	mov x1,x21
00be9920	mov x2,x20
00be9924	mov x3,x24
00be9928	mov w4,#0x4
00be992c	bl 0x00bea2fc
00be9930	ldrb w8,[x20]
00be9934	tbnz w8,#0x2,0x00be9a10
00be9938	add w8,w0,#0x76c
00be993c	cmp w0,#0x64
00be9940	add w9,w0,#0x7d0
00be9944	csel w8,w8,w0,cc
00be9948	cmp w0,#0x45
00be994c	csel w8,w9,w8,lt
00be9950	sub w8,w8,#0x76c
00be9954	str w8,[x19, #0x14]
00be9958	b 0x00be9a10
00be995c	bti j
00be9960	ldr x8,[x23]
00be9964	ldr x1,[sp, #0x18]
00be9968	mov x0,x23
00be996c	mov x2,x21
00be9970	mov x3,x22
00be9974	mov x4,x20
00be9978	ldr x8,[x8, #0x28]
00be997c	mov x5,x19
00be9980	blr x8
00be9984	b 0x00be9a14
00be9988	bti j
00be998c	add x0,sp,#0x18
00be9990	mov x1,x21
00be9994	mov x2,x20
00be9998	mov x3,x24
00be999c	mov w4,#0x3
00be99a0	bl 0x00bea2fc
00be99a4	ldr w8,[x20]
00be99a8	cmp w0,#0x16d
00be99ac	b.gt 0x00be9a08
00be99b0	tbnz w8,#0x2,0x00be9a08
00be99b4	str w0,[x19, #0x1c]
00be99b8	b 0x00be9a10
00be99bc	bti j
00be99c0	ldr x8,[x23, #0x10]!
00be99c4	mov x0,x23
00be99c8	ldr x8,[x8, #0x10]
00be99cc	blr x8
00be99d0	ldrb w8,[x0]
00be99d4	ldrb w9,[x0, #0x18]
00be99d8	ldr x10,[x0, #0x8]
00be99dc	lsr x11,x8,#0x1
00be99e0	tst w8,#0x1
00be99e4	ldr x8,[x0, #0x20]
00be99e8	lsr x12,x9,#0x1
00be99ec	csel x10,x11,x10,eq
00be99f0	tst w9,#0x1
00be99f4	csel x8,x12,x8,eq
00be99f8	cmn x10,x8
00be99fc	b.ne 0x00be9a70
00be9a00	bti j
00be9a04	ldr w8,[x20]
00be9a08	orr w8,w8,#0x4
00be9a0c	str w8,[x20]
00be9a10	ldr x0,[sp, #0x18]
00be9a14	ldp x20,x19,[sp, #0x70]
00be9a18	ldp x22,x21,[sp, #0x60]
00be9a1c	ldp x24,x23,[sp, #0x50]
00be9a20	ldp x26,x25,[sp, #0x40]
00be9a24	ldp x29,x30,[sp, #0x30]
00be9a28	add sp,sp,#0x80
00be9a2c	autiasp
00be9a30	ret
00be9a34	bti j
00be9a38	add x0,sp,#0x18
00be9a3c	mov x1,x21
00be9a40	mov x2,x20
00be9a44	mov x3,x24
00be9a48	mov w4,#0x1
00be9a4c	bl 0x00bea2fc
00be9a50	ldr w8,[x20]
00be9a54	cmp w0,#0x6
00be9a58	b.gt 0x00be9a08
00be9a5c	tbnz w8,#0x2,0x00be9a08
00be9a60	str w0,[x19, #0x18]
00be9a64	b 0x00be9a10
00be9a68	orr w8,w9,#0x4
00be9a6c	b 0x00be9a0c
00be9a70	mov x22,x0
00be9a74	add x0,sp,#0x18
00be9a78	mov x1,x21
00be9a7c	add x3,x22,#0x30
00be9a80	mov x2,x22
00be9a84	mov x4,x24
00be9a88	mov x5,x20
00be9a8c	mov w6,wzr
00be9a90	bl 0x00bda608
00be9a94	ldr w8,[x19, #0x8]
00be9a98	subs x9,x0,x22
00be9a9c	b.ne 0x00be9ab0
00be9aa0	cmp w8,#0xc
00be9aa4	b.ne 0x00be9ab0
00be9aa8	str wzr,[x19, #0x8]
00be9aac	b 0x00be9a10
00be9ab0	cmp x9,#0x18
00be9ab4	b.ne 0x00be9a10
00be9ab8	cmp w8,#0xb
00be9abc	b.gt 0x00be9a10
00be9ac0	add w8,w8,#0xc
00be9ac4	str w8,[x19, #0x8]
00be9ac8	b 0x00be9a10
00be9acc	bl 0x00bd8968
