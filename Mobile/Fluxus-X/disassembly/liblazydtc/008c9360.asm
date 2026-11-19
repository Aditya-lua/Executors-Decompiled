; FUN_008c9360 @ 008c9360
008c9360	sub sp,sp,#0x110
008c9364	stp x29,x30,[sp, #0xb0]
008c9368	stp x28,x27,[sp, #0xc0]
008c936c	stp x26,x25,[sp, #0xd0]
008c9370	stp x24,x23,[sp, #0xe0]
008c9374	stp x22,x21,[sp, #0xf0]
008c9378	stp x20,x19,[sp, #0x100]
008c937c	add x29,sp,#0xb0
008c9380	stur x7,[x29, #-0x50]
008c9384	ldr x20,[x29, #0x70]
008c9388	and w11,w2,#0xff
008c938c	str x6,[sp, #0x58]
008c9390	ldp x9,x21,[x29, #0x60]
008c9394	stur x0,[x29, #-0x30]
008c9398	mrs x26,tpidr_el0
008c939c	mov x27,x5
008c93a0	ldr x8,[x26, #0x28]
008c93a4	cmp w11,#0x4
008c93a8	stur x8,[x29, #-0x10]
008c93ac	ldr x8,[x20]
008c93b0	str x9,[sp, #0x30]
008c93b4	str w2,[sp, #0x14]
008c93b8	ldrb w9,[x21, x8]
008c93bc	add x10,x8,#0x1
008c93c0	stur x1,[x29, #-0x38]
008c93c4	str x10,[x20]
008c93c8	strb w9,[x1, #0x5]
008c93cc	ldrb w9,[x21, x10]
008c93d0	add x10,x8,#0x2
008c93d4	str x10,[x20]
008c93d8	strb w9,[x1, #0x7]
008c93dc	ldrb w9,[x21, x10]
008c93e0	add x10,x8,#0x3
008c93e4	str x10,[x20]
008c93e8	strb w9,[x1, #0x6]
008c93ec	add x9,x8,#0x4
008c93f0	ldrb w10,[x21, x10]
008c93f4	str x9,[x20]
008c93f8	strb w10,[x1, #0x3]
008c93fc	b.cc 0x008c9650
008c9400	and w25,w3,#0xff
008c9404	ldrb w9,[x21, x9]
008c9408	ldur x10,[x29, #-0x38]
008c940c	add x23,x8,#0x5
008c9410	cmp w25,#0x1
008c9414	str x23,[x20]
008c9418	strb w9,[x10, #0x4]
008c941c	b.ne 0x008c949c
008c9420	mov w8,wzr
008c9424	mov w22,wzr
008c9428	ldrb w9,[x21, x23]
008c942c	add x23,x23,#0x1
008c9430	str x23,[x20]
008c9434	and w10,w9,#0x7f
008c9438	lsl w10,w10,w8
008c943c	add w8,w8,#0x7
008c9440	orr w22,w10,w22
008c9444	tbnz w9,#0x7,0x008c9428
008c9448	cbz w22,0x008c960c
008c944c	ldp x25,x0,[x29, #-0x38]
008c9450	cmp w22,#0x7f
008c9454	mov w8,#0x3
008c9458	cinc w19,w8,hi
008c945c	ldrb w2,[x25, #0x1]
008c9460	add w24,w19,w22
008c9464	mov x1,x24
008c9468	bl 0x008b7610
008c946c	cmp w22,#0x80
008c9470	str x0,[x25, #0x40]
008c9474	str w24,[x25, #0xbc]
008c9478	b.cc 0x008c9614
008c947c	orr w8,w22,#0x80
008c9480	strb w8,[x0]
008c9484	lsr w8,w22,#0x7
008c9488	ldr x9,[x25, #0x40]
008c948c	strb w8,[x9, #0x1]
008c9490	mov w8,#0x3
008c9494	mov w9,#0x2
008c9498	b 0x008c9620
008c949c	and w9,w25,#0xfe
008c94a0	cmp w9,#0x2
008c94a4	b.ne 0x008c9650
008c94a8	mov w9,wzr
008c94ac	mov w22,wzr
008c94b0	add x24,x21,x23
008c94b4	add x8,x8,#0x6
008c94b8	ldrb w10,[x24], #0x1
008c94bc	str x8,[x20]
008c94c0	add x8,x8,#0x1
008c94c4	and w11,w10,#0x7f
008c94c8	lsl w11,w11,w9
008c94cc	add w9,w9,#0x7
008c94d0	orr w22,w11,w22
008c94d4	tbnz w10,#0x7,0x008c94b8
008c94d8	cbz w22,0x008c9650
008c94dc	ldp x23,x0,[x29, #-0x38]
008c94e0	mov x1,x22
008c94e4	mov x19,x4
008c94e8	ldrb w2,[x23, #0x1]
008c94ec	bl 0x008b7610
008c94f0	mov x1,x24
008c94f4	mov x2,x22
008c94f8	str w22,[x23, #0xbc]
008c94fc	str x0,[x23, #0x40]
008c9500	bl 0x00c2ffd0
008c9504	ldr x9,[x20]
008c9508	cmp w25,#0x3
008c950c	add x9,x9,x22
008c9510	str x9,[x20]
008c9514	b.ne 0x008c9650
008c9518	ldur x10,[x29, #-0x38]
008c951c	mov x8,x19
008c9520	mov x9,xzr
008c9524	mov w11,wzr
008c9528	mov w13,wzr
008c952c	ldr x10,[x10, #0x40]
008c9530	mov x14,x10
008c9534	ldrb w12,[x14], #0x1
008c9538	add x9,x9,#0x1
008c953c	and w15,w12,#0x7f
008c9540	lsl w15,w15,w11
008c9544	add w11,w11,#0x7
008c9548	orr w13,w15,w13
008c954c	tbnz w12,#0x7,0x008c9534
008c9550	mov w11,wzr
008c9554	mov w12,wzr
008c9558	ldrb w15,[x14], #0x1
008c955c	add x9,x9,#0x1
008c9560	and w16,w15,#0x7f
008c9564	lsl w16,w16,w11
008c9568	add w11,w11,#0x7
008c956c	orr w12,w16,w12
008c9570	tbnz w15,#0x7,0x008c9558
008c9574	mov w15,wzr
008c9578	mov w11,wzr
008c957c	ldrb w16,[x14], #0x1
008c9580	add x9,x9,#0x1
008c9584	and w17,w16,#0x7f
008c9588	lsl w17,w17,w15
008c958c	add w15,w15,#0x7
008c9590	orr w11,w17,w11
008c9594	tbnz w16,#0x7,0x008c957c
008c9598	cbz w13,0x008ca4dc
008c959c	cmp w13,#0x3
008c95a0	b.cc 0x008ca4d8
008c95a4	adrp x15,0xd1f000
008c95a8	add x16,x14,#0x2
008c95ac	sub x17,x13,#0x2
008c95b0	ldrb w0,[x15, #0xe58]
008c95b4	b 0x008c95d0
008c95b8	ldrb w1,[x8, w0, UXTW ]
008c95bc	strb w1,[x16]
008c95c0	ldrb w0,[x15, #0xe58]
008c95c4	subs x17,x17,#0x1
008c95c8	add x16,x16,#0x1
008c95cc	b.eq 0x008ca4d8
008c95d0	ldrb w1,[x16]
008c95d4	tbz w0,#0x0,0x008c95f8
008c95d8	and w0,w1,#0x7f
008c95dc	sub w0,w0,#0x40
008c95e0	cmp w0,#0x1f
008c95e4	b.hi 0x008c95bc
008c95e8	ldrb w0,[x8, w0, UXTW ]
008c95ec	and w1,w1,#0x80
008c95f0	orr w1,w0,w1
008c95f4	b 0x008c95bc
008c95f8	sub w0,w1,#0x40
008c95fc	cmp w0,#0x1f
008c9600	b.ls 0x008c95b8
008c9604	mov w0,wzr
008c9608	b 0x008c95c4
008c960c	mov x22,xzr
008c9610	b 0x008c9648
008c9614	mov w8,#0x2
008c9618	mov w9,#0x1
008c961c	strb w22,[x0]
008c9620	ldr x10,[x25, #0x40]
008c9624	add x1,x21,x23
008c9628	mov x2,x22
008c962c	strb wzr,[x10, x9]
008c9630	ldr x9,[x25, #0x40]
008c9634	strb wzr,[x9, x8]
008c9638	ldr x8,[x25, #0x40]
008c963c	add x0,x8,w19, UXTW 
008c9640	bl 0x00c2ffd0
008c9644	ldr x23,[x20]
008c9648	add x8,x23,x22
008c964c	str x8,[x20]
008c9650	ldr x9,[x20]
008c9654	mov w8,wzr
008c9658	mov w19,wzr
008c965c	ldrb w10,[x21, x9]
008c9660	add x9,x9,#0x1
008c9664	str x9,[x20]
008c9668	and w11,w10,#0x7f
008c966c	lsl w11,w11,w8
008c9670	add w8,w8,#0x7
008c9674	orr w19,w11,w19
008c9678	tbnz w10,#0x7,0x008c965c
008c967c	ldp x23,x25,[x29, #-0x38]
008c9680	tbnz w19,#0x1f,0x008ca5d8
008c9684	ubfiz x1,x19,#0x2,#0x20
008c9688	ldrb w2,[x23, #0x1]
008c968c	mov x0,x25
008c9690	bl 0x008b7610
008c9694	str w19,[x23, #0xb8]
008c9698	str x0,[x23, #0x30]
008c969c	ldr x8,[x20]
008c96a0	cbz w19,0x008c96c8
008c96a4	mov x9,xzr
008c96a8	ldr w10,[x21, x8#0x0]
008c96ac	add x8,x8,#0x4
008c96b0	str x8,[x20]
008c96b4	str w10,[x0, x9, LSL #0x2]
008c96b8	add x9,x9,#0x1
008c96bc	ldrsw x10,[x23, #0xb8]
008c96c0	cmp x9,x10
008c96c4	b.lt 0x008c96a8
008c96c8	mov w9,wzr
008c96cc	mov w22,wzr
008c96d0	str x0,[x23, #0x18]
008c96d4	ldrb w10,[x21, x8]
008c96d8	add x8,x8,#0x1
008c96dc	str x8,[x20]
008c96e0	and w11,w10,#0x7f
008c96e4	lsl w11,w11,w9
008c96e8	add w9,w9,#0x7
008c96ec	orr w22,w11,w22
008c96f0	tbnz w10,#0x7,0x008c96d4
008c96f4	str x27,[sp, #0x50]
008c96f8	str x26,[sp, #0x18]
008c96fc	tbnz w22,#0x1f,0x008ca5e0
008c9700	ubfiz x1,x22,#0x4,#0x20
008c9704	ldrb w2,[x23, #0x1]
008c9708	mov x0,x25
008c970c	bl 0x008b7610
008c9710	str w22,[x23, #0x9c]
008c9714	str x0,[x23, #0x28]
008c9718	cbz w22,0x008c9eb8
008c971c	cmp w22,#0x1
008c9720	b.ne 0x008c972c
008c9724	mov x8,xzr
008c9728	b 0x008c9750
008c972c	and x8,x22,#0x7ffffffe
008c9730	add x9,x0,#0x1c
008c9734	mov x10,x8
008c9738	subs x10,x10,#0x2
008c973c	stur wzr,[x9, #-0x10]
008c9740	str wzr,[x9], #0x20
008c9744	b.ne 0x008c9738
008c9748	cmp x8,x22
008c974c	b.eq 0x008c9768
008c9750	add x9,x0,x8, LSL #0x4
008c9754	sub x8,x22,x8
008c9758	add x9,x9,#0xc
008c975c	subs x8,x8,#0x1
008c9760	str wzr,[x9], #0x10
008c9764	b.ne 0x008c975c
008c9768	mov x28,xzr
008c976c	add x27,x21,#0x1
008c9770	add x8,x21,#0x5
008c9774	str x8,[sp, #0x20]
008c9778	b 0x008c97ac
008c977c	add x8,x8,#0x2
008c9780	ldrb w9,[x21, x9]
008c9784	str x8,[x20]
008c9788	ldr x8,[x23, #0x28]
008c978c	add x8,x8,x28, LSL #0x4
008c9790	str w9,[x8]
008c9794	mov w9,#0x1
008c9798	str w9,[x8, #0xc]
008c979c	ldrsw x8,[x23, #0x9c]
008c97a0	add x28,x28,#0x1
008c97a4	cmp x28,x8
008c97a8	b.ge 0x008c9eb8
008c97ac	ldr x8,[x20]
008c97b0	ldrb w10,[x21, x8]
008c97b4	add x9,x8,#0x1
008c97b8	str x9,[x20]
008c97bc	cmp w10,#0x5
008c97c0	b.gt 0x008c989c
008c97c4	cmp w10,#0x2
008c97c8	b.le 0x008c98f4
008c97cc	cmp w10,#0x3
008c97d0	b.eq 0x008c99d4
008c97d4	cmp w10,#0x4
008c97d8	b.eq 0x008c9b34
008c97dc	cmp w10,#0x5
008c97e0	b.ne 0x008c979c
008c97e4	mov w9,wzr
008c97e8	mov w22,wzr
008c97ec	ldrb w10,[x27, x8]
008c97f0	add x12,x8,#0x2
008c97f4	add x8,x8,#0x1
008c97f8	str x12,[x20]
008c97fc	and w11,w10,#0x7f
008c9800	lsl w11,w11,w9
008c9804	add w9,w9,#0x7
008c9808	orr w22,w11,w22
008c980c	tbnz w10,#0x7,0x008c97ec
008c9810	mov x0,x25
008c9814	mov w1,wzr
008c9818	mov w2,w22
008c981c	bl 0x008bae54
008c9820	cmp w22,#0x1
008c9824	mov x24,x0
008c9828	b.lt 0x008c9888
008c982c	mov w19,wzr
008c9830	ldr x9,[x20]
008c9834	mov w8,wzr
008c9838	mov w10,wzr
008c983c	ldrb w11,[x21, x9]
008c9840	add x9,x9,#0x1
008c9844	str x9,[x20]
008c9848	and w12,w11,#0x7f
008c984c	lsl w12,w12,w8
008c9850	add w8,w8,#0x7
008c9854	orr w10,w12,w10
008c9858	tbnz w11,#0x7,0x008c983c
008c985c	ldr x8,[x23, #0x28]
008c9860	mov x0,x25
008c9864	mov x1,x24
008c9868	add x2,x8,w10, SXTW  #0x4
008c986c	bl 0x008bbce8
008c9870	add w19,w19,#0x1
008c9874	mov w8,#0x3
008c9878	str xzr,[x0]
008c987c	cmp w19,w22
008c9880	str w8,[x0, #0xc]
008c9884	b.ne 0x008c9830
008c9888	ldr x8,[x23, #0x28]
008c988c	mov w9,#0x6
008c9890	add x8,x8,x28, LSL #0x4
008c9894	str x24,[x8]
008c9898	b 0x008c9798
008c989c	cmp w10,#0x7
008c98a0	b.le 0x008c9924
008c98a4	cmp w10,#0x8
008c98a8	b.eq 0x008c99f0
008c98ac	cmp w10,#0xa
008c98b0	b.eq 0x008c9b94
008c98b4	cmp w10,#0xb
008c98b8	b.ne 0x008c979c
008c98bc	add x10,x8,#0x9
008c98c0	ldr d0,[x21,x9]
008c98c4	add x9,x8,#0x11
008c98c8	str x10,[x20]
008c98cc	add x8,x8,#0x21
008c98d0	ldr d1,[x21,x10]
008c98d4	str x9,[x20]
008c98d8	fcvt s0,d0
008c98dc	ldr d2,[x21,x9]
008c98e0	str x8,[x20]
008c98e4	ldr x8,[x23, #0x28]
008c98e8	fcvt s1,d1
008c98ec	fcvt s2,d2
008c98f0	b 0x008c995c
008c98f4	cmp w10,#0x1
008c98f8	b.eq 0x008c977c
008c98fc	cmp w10,#0x2
008c9900	b.ne 0x008c979c
008c9904	add x8,x8,#0x9
008c9908	ldr d0,[x21,x9]
008c990c	mov w9,#0x3
008c9910	str x8,[x20]
008c9914	ldr x8,[x23, #0x28]
008c9918	add x8,x8,x28, LSL #0x4
008c991c	str d0,[x8]
008c9920	b 0x008c9798
008c9924	cmp w10,#0x6
008c9928	b.eq 0x008c9970
008c992c	cmp w10,#0x7
008c9930	b.ne 0x008c979c
008c9934	add x10,x8,#0x5
008c9938	ldr s0,[x21,x9]
008c993c	add x9,x8,#0x9
008c9940	str x10,[x20]
008c9944	add x8,x8,#0x11
008c9948	ldr s1,[x21,x10]
008c994c	str x9,[x20]
008c9950	ldr s2,[x21,x9]
008c9954	str x8,[x20]
008c9958	ldr x8,[x23, #0x28]
008c995c	add x8,x8,x28, LSL #0x4
008c9960	mov w9,#0x4
008c9964	stp s0,s1,[x8]
008c9968	str s2,[x8, #0x8]
008c996c	b 0x008c9798
008c9970	mov w9,wzr
008c9974	mov w2,wzr
008c9978	ldrb w10,[x27, x8]
008c997c	add x12,x8,#0x2
008c9980	add x8,x8,#0x1
008c9984	str x12,[x20]
008c9988	and w11,w10,#0x7f
008c998c	lsl w11,w11,w9
008c9990	add w9,w9,#0x7
008c9994	orr w2,w11,w2
008c9998	tbnz w10,#0x7,0x008c9978
008c999c	ldr x0,[sp, #0x58]
008c99a0	mov x1,x25
008c99a4	bl 0x008ca754
008c99a8	ldrb w1,[x0, #0x6]
008c99ac	ldur x2,[x29, #-0x50]
008c99b0	mov x3,x0
008c99b4	mov x0,x25
008c99b8	bl 0x008b4d5c
008c99bc	ldrb w8,[x0, #0x5]
008c99c0	mov w9,#0x7
008c99c4	cmp w8,#0x0
008c99c8	cset w8,ne
008c99cc	strb w8,[x0, #0x3]
008c99d0	b 0x008c9df4
008c99d4	ldr x0,[sp, #0x50]
008c99d8	mov x1,x21
008c99dc	mov x2,x20
008c99e0	bl 0x008ca668
008c99e4	ldr x8,[x23, #0x28]
008c99e8	mov w9,#0x5
008c99ec	b 0x008c9df8
008c99f0	stur x28,[x29, #-0x40]
008c99f4	mov w9,wzr
008c99f8	mov w28,wzr
008c99fc	ldrb w10,[x27, x8]
008c9a00	add x12,x8,#0x2
008c9a04	add x8,x8,#0x1
008c9a08	str x12,[x20]
008c9a0c	and w11,w10,#0x7f
008c9a10	lsl w11,w11,w9
008c9a14	add w9,w9,#0x7
008c9a18	orr w28,w11,w28
008c9a1c	tbnz w10,#0x7,0x008c99fc
008c9a20	mov x0,x25
008c9a24	mov w1,wzr
008c9a28	mov w2,w28
008c9a2c	bl 0x008bae54
008c9a30	ubfiz x22,x28,#0x2,#0x20
008c9a34	mov x26,x0
008c9a38	sub x8,x29,#0x28
008c9a3c	stp xzr,xzr,[x8, #0x8]
008c9a40	stur x25,[x29, #-0x28]
008c9a44	mov x0,x25
008c9a48	mov x1,x22
008c9a4c	mov w2,wzr
008c9a50	bl 0x008b7610
008c9a54	mov x24,x0
008c9a58	stp x0,x28,[x29, #-0x20]
008c9a5c	cbz w28,0x008c9e54
008c9a60	stur x22,[x29, #-0x48]
008c9a64	mov x25,xzr
008c9a68	mov w22,wzr
008c9a6c	b 0x008c9a94
008c9a70	add x8,x25,#0x1
008c9a74	str w19,[x24, x25, LSL #0x2]
008c9a78	mov x25,x8
008c9a7c	mov w8,#0x3
008c9a80	str xzr,[x0]
008c9a84	str w8,[x0, #0xc]
008c9a88	add w22,w22,#0x1
008c9a8c	cmp w22,w28
008c9a90	b.eq 0x008c9e04
008c9a94	ldr x9,[x20]
008c9a98	mov w8,wzr
008c9a9c	mov w19,wzr
008c9aa0	ldrb w10,[x21, x9]
008c9aa4	add x9,x9,#0x1
008c9aa8	str x9,[x20]
008c9aac	and w11,w10,#0x7f
008c9ab0	lsl w11,w11,w8
008c9ab4	add w8,w8,#0x7
008c9ab8	orr w19,w11,w19
008c9abc	tbnz w10,#0x7,0x008c9aa0
008c9ac0	ldr x8,[x23, #0x28]
008c9ac4	add x2,x8,w19, SXTW  #0x4
008c9ac8	ldur x0,[x29, #-0x30]
008c9acc	mov x1,x26
008c9ad0	bl 0x008bbce8
008c9ad4	ldr x9,[x20]
008c9ad8	ldr w8,[x21, x9#0x0]
008c9adc	add x9,x9,#0x4
008c9ae0	str x9,[x20]
008c9ae4	tbnz w8,#0x1f,0x008c9a7c
008c9ae8	ldr x9,[x23, #0x28]
008c9aec	add x8,x9,x8, LSL #0x4
008c9af0	ldr w9,[x8, #0xc]
008c9af4	cbz w9,0x008c9a70
008c9af8	ldr q0,[x8]
008c9afc	str q0,[x0]
008c9b00	ldr w9,[x8, #0xc]
008c9b04	cmp w9,#0x5
008c9b08	b.lt 0x008c9a88
008c9b0c	ldrb w9,[x26, #0x2]
008c9b10	tbz w9,#0x2,0x008c9a88
008c9b14	ldr x2,[x8]
008c9b18	ldrb w8,[x2, #0x2]
008c9b1c	tst w8,#0x3
008c9b20	b.eq 0x008c9a88
008c9b24	ldur x0,[x29, #-0x30]
008c9b28	mov x1,x26
008c9b2c	bl 0x008b6370
008c9b30	b 0x008c9a88
008c9b34	add x8,x8,#0x5
008c9b38	ldr x11,[sp, #0x30]
008c9b3c	ldr w9,[x21, x9#0x0]
008c9b40	str x8,[x20]
008c9b44	ldr x8,[x23, #0x28]
008c9b48	ldrb w10,[x11, #0x3]
008c9b4c	stur w9,[x29, #-0x18]
008c9b50	stp x11,x8,[x29, #-0x28]
008c9b54	cbz w10,0x008c9e8c
008c9b58	mov x0,x25
008c9b5c	bl 0x008aa984
008c9b60	ldr x8,[x25, #0x68]
008c9b64	ldr x9,[x25, #0x58]
008c9b68	sub x2,x29,#0x28
008c9b6c	mov x0,x25
008c9b70	nop
008c9b74	adr x1,0x8caa20
008c9b78	sub x3,x8,x9
008c9b7c	mov x4,xzr
008c9b80	bl 0x008b47f0
008c9b84	ldr x8,[x25, #0x68]
008c9b88	cbz w0,0x008c9e9c
008c9b8c	stur wzr,[x8, #-0x4]
008c9b90	b 0x008c9e9c
008c9b94	ldr x9,[sp, #0x20]
008c9b98	mov w11,wzr
008c9b9c	mov w22,wzr
008c9ba0	add x12,x8,#0x6
008c9ba4	stur x28,[x29, #-0x40]
008c9ba8	add x13,x9,x8
008c9bac	add x9,x21,x8
008c9bb0	mov x10,x13
008c9bb4	add x13,x13,#0x1
008c9bb8	ldrb w14,[x9, #0x1]
008c9bbc	and w9,w14,#0x7f
008c9bc0	lsl w15,w9,w11
008c9bc4	mov x9,x12
008c9bc8	add x12,x8,#0x2
008c9bcc	str x12,[x20]
008c9bd0	add w11,w11,#0x7
008c9bd4	add x8,x8,#0x1
008c9bd8	orr w22,w15,w22
008c9bdc	add x12,x9,#0x1
008c9be0	tbnz w14,#0x7,0x008c9bac
008c9be4	ldr x14,[x23, #0x28]
008c9be8	add x12,x21,x8
008c9bec	add x13,x8,#0x2
008c9bf0	mov w11,wzr
008c9bf4	mov w28,wzr
008c9bf8	str x14,[sp, #0x40]
008c9bfc	ldrb w14,[x12, #0x1]
008c9c00	str x13,[x20]
008c9c04	add x13,x8,#0x3
008c9c08	ldrb w16,[x12, #0x2]
008c9c0c	stur w14,[x29, #-0x48]
008c9c10	str x13,[x20]
008c9c14	ldrb w14,[x21, x13]
008c9c18	add x13,x13,#0x1
008c9c1c	mov x12,x10
008c9c20	add x10,x10,#0x1
008c9c24	str x13,[x20]
008c9c28	and w8,w14,#0x7f
008c9c2c	lsl w15,w8,w11
008c9c30	mov x8,x9
008c9c34	add w11,w11,#0x7
008c9c38	add x9,x9,#0x1
008c9c3c	orr w28,w15,w28
008c9c40	tbnz w14,#0x7,0x008c9c14
008c9c44	mov w9,wzr
008c9c48	mov w26,wzr
008c9c4c	ldrb w10,[x12], #0x1
008c9c50	str x8,[x20]
008c9c54	add x8,x8,#0x1
008c9c58	and w11,w10,#0x7f
008c9c5c	lsl w11,w11,w9
008c9c60	add w9,w9,#0x7
008c9c64	orr w26,w11,w26
008c9c68	tbnz w10,#0x7,0x008c9c4c
008c9c6c	sub w8,w28,w16
008c9c70	ldrb w2,[x25, #0x4]
008c9c74	mov x0,x25
008c9c78	add w23,w8,w26
008c9c7c	str w16,[sp, #0x4c]
008c9c80	ubfiz x24,x23,#0x3,#0x20
008c9c84	str w8,[sp, #0x2c]
008c9c88	mov x1,x24
008c9c8c	bl 0x008b7610
008c9c90	mov w1,wzr
008c9c94	mov x2,x24
008c9c98	mov x19,x25
008c9c9c	mov x25,x0
008c9ca0	bl 0x00c301c0
008c9ca4	ldur w24,[x29, #-0x48]
008c9ca8	mov x0,x19
008c9cac	mov w1,wzr
008c9cb0	str x23,[sp, #0x38]
008c9cb4	sub w2,w23,w24
008c9cb8	bl 0x008bae54
008c9cbc	subs w23,w28,w24
008c9cc0	mov x24,x0
008c9cc4	b.eq 0x008c9d30
008c9cc8	mov x19,xzr
008c9ccc	ldr x9,[x20]
008c9cd0	mov w8,wzr
008c9cd4	mov w10,wzr
008c9cd8	ldrb w11,[x21, x9]
008c9cdc	add x9,x9,#0x1
008c9ce0	str x9,[x20]
008c9ce4	and w12,w11,#0x7f
008c9ce8	lsl w12,w12,w8
008c9cec	add w8,w8,#0x7
008c9cf0	orr w10,w12,w10
008c9cf4	tbnz w11,#0x7,0x008c9cd8
008c9cf8	ldp x8,x0,[x29, #-0x38]
008c9cfc	ubfiz x9,x10,#0x4,#0x20
008c9d00	mov x1,x24
008c9d04	ldr x8,[x8, #0x28]
008c9d08	ldr x2,[x8, x9#0x0]
008c9d0c	str x2,[x25, x19, LSL #0x3]
008c9d10	bl 0x008bce4c
008c9d14	ucvtf d0,w19
008c9d18	add x19,x19,#0x1
008c9d1c	mov w8,#0x3
008c9d20	cmp x19,x23
008c9d24	str w8,[x0, #0xc]
008c9d28	str d0,[x0]
008c9d2c	b.ne 0x008c9ccc
008c9d30	ldr x8,[sp, #0x38]
008c9d34	cmp w28,w8
008c9d38	b.cs 0x008c9dac
008c9d3c	ldr w8,[sp, #0x2c]
008c9d40	mov x19,x28
008c9d44	add w23,w8,w26
008c9d48	ldr x9,[x20]
008c9d4c	mov w8,wzr
008c9d50	mov w10,wzr
008c9d54	ldrb w11,[x21, x9]
008c9d58	add x9,x9,#0x1
008c9d5c	str x9,[x20]
008c9d60	and w12,w11,#0x7f
008c9d64	lsl w12,w12,w8
008c9d68	add w8,w8,#0x7
008c9d6c	orr w10,w12,w10
008c9d70	tbnz w11,#0x7,0x008c9d54
008c9d74	ldp x8,x0,[x29, #-0x38]
008c9d78	ubfiz x9,x10,#0x4,#0x20
008c9d7c	mov x1,x24
008c9d80	ldr x8,[x8, #0x28]
008c9d84	ldr x2,[x8, x9#0x0]
008c9d88	str x2,[x25, x19, LSL #0x3]
008c9d8c	bl 0x008bce4c
008c9d90	ucvtf d0,w19
008c9d94	add x19,x19,#0x1
008c9d98	mov w8,#0x3
008c9d9c	cmp x19,x23
008c9da0	str w8,[x0, #0xc]
008c9da4	str d0,[x0]
008c9da8	b.ne 0x008c9d48
008c9dac	ldr x8,[sp, #0x40]
008c9db0	mov w9,#0x1
008c9db4	ldur x0,[x29, #-0x30]
008c9db8	strb w9,[x24, #0x7]
008c9dbc	ldur w6,[x29, #-0x48]
008c9dc0	mov x2,x24
008c9dc4	add x8,x8,x22, LSL #0x4
008c9dc8	ldr w7,[sp, #0x4c]
008c9dcc	mov x3,x25
008c9dd0	mov w4,w28
008c9dd4	mov w5,w26
008c9dd8	mov x25,x0
008c9ddc	ldr x1,[x8]
008c9de0	ldur x8,[x29, #-0x50]
008c9de4	str x8,[sp]
008c9de8	bl 0x008b2358
008c9dec	ldp x28,x23,[x29, #-0x40]
008c9df0	mov w9,#0xb
008c9df4	ldr x8,[x23, #0x28]
008c9df8	add x8,x8,x28, LSL #0x4
008c9dfc	str x0,[x8]
008c9e00	b 0x008c9798
008c9e04	ldur x22,[x29, #-0x48]
008c9e08	mov x19,x24
008c9e0c	cbz x25,0x008c9e54
008c9e10	ldrsw x8,[x19], #0x4
008c9e14	ldr x9,[x23, #0x28]
008c9e18	add x2,x9,x8, LSL #0x4
008c9e1c	ldur x0,[x29, #-0x30]
008c9e20	mov x1,x26
008c9e24	bl 0x008bbce8
008c9e28	subs x25,x25,#0x1
008c9e2c	str wzr,[x0, #0xc]
008c9e30	b.ne 0x008c9e10
008c9e34	ldr x8,[x23, #0x28]
008c9e38	ldur x28,[x29, #-0x40]
008c9e3c	mov w9,#0x6
008c9e40	ldur x25,[x29, #-0x30]
008c9e44	add x8,x8,x28, LSL #0x4
008c9e48	str x26,[x8]
008c9e4c	str w9,[x8, #0xc]
008c9e50	b 0x008c9e74
008c9e54	ldr x8,[x23, #0x28]
008c9e58	ldur x28,[x29, #-0x40]
008c9e5c	mov w9,#0x6
008c9e60	ldur x25,[x29, #-0x30]
008c9e64	add x8,x8,x28, LSL #0x4
008c9e68	str x26,[x8]
008c9e6c	str w9,[x8, #0xc]
008c9e70	cbz x24,0x008c979c
008c9e74	mov x0,x25
008c9e78	mov x1,x24
008c9e7c	mov x2,x22
008c9e80	mov w3,wzr
008c9e84	bl 0x008b7a9c
008c9e88	b 0x008c979c
008c9e8c	ldr x8,[x25, #0x68]
008c9e90	str wzr,[x8, #0xc]
008c9e94	add x8,x8,#0x10
008c9e98	str x8,[x25, #0x68]
008c9e9c	ldr x9,[x23, #0x28]
008c9ea0	ldur q0,[x8, #-0x10]
008c9ea4	str q0,[x9,x28, lsl #4]
008c9ea8	ldr x8,[x25, #0x68]
008c9eac	sub x8,x8,#0x10
008c9eb0	str x8,[x25, #0x68]
008c9eb4	b 0x008c979c
008c9eb8	ldr w8,[x23, #0xb8]
008c9ebc	ldp x26,x27,[sp, #0x50]
008c9ec0	ldr x24,[sp, #0x18]
008c9ec4	cmp w8,#0x1
008c9ec8	b.lt 0x008c9f94
008c9ecc	ldr x22,[x23, #0x30]
008c9ed0	b 0x008c9ef8
008c9ed4	ldur x23,[x29, #-0x38]
008c9ed8	and w0,w8,#0xff
008c9edc	bl 0x007feb1c
008c9ee0	ldr x8,[x23, #0x30]
008c9ee4	ldrsw x9,[x23, #0xb8]
008c9ee8	add x22,x22,w0, SXTW  #0x2
008c9eec	add x8,x8,x9, LSL #0x2
008c9ef0	cmp x22,x8
008c9ef4	b.cs 0x008c9f94
008c9ef8	ldr w8,[x22]
008c9efc	and w9,w8,#0xff
008c9f00	cmp w9,#0xf
008c9f04	b.eq 0x008c9f28
008c9f08	cmp w9,#0x14
008c9f0c	b.eq 0x008c9f20
008c9f10	cmp w9,#0x10
008c9f14	b.ne 0x008c9ed8
008c9f18	mov w23,#0x54
008c9f1c	b 0x008c9f2c
008c9f20	mov w23,#0x55
008c9f24	b 0x008c9f2c
008c9f28	mov w23,#0x53
008c9f2c	ldr w9,[x22, #0x4]
008c9f30	lsr w10,w9,#0x10
008c9f34	cbnz w10,0x008c9ed4
008c9f38	ldur x10,[x29, #-0x38]
008c9f3c	lsl x9,x9,#0x4
008c9f40	ldr x10,[x10, #0x28]
008c9f44	ldr x19,[x10, x9#0x0]
008c9f48	ldrh w0,[x19, #0x6]
008c9f4c	cmp w0,#0x8, LSL #12
008c9f50	b.ne 0x008c9f80
008c9f54	ldr x9,[x25, #0x60]
008c9f58	ldr x9,[x9, #0x6a8]
008c9f5c	cbz x9,0x008c9f78
008c9f60	ldr w2,[x19, #0x14]
008c9f64	add x1,x19,#0x18
008c9f68	mov x0,x25
008c9f6c	blr x9
008c9f70	ldr w8,[x22]
008c9f74	b 0x008c9f7c
008c9f78	mov w0,#0xffff
008c9f7c	strh w0,[x19, #0x6]
008c9f80	tbnz w0,#0xf,0x008c9ed4
008c9f84	and w8,w8,#0xffffff00
008c9f88	orr w8,w8,w23
008c9f8c	str w8,[x22]
008c9f90	b 0x008c9ed4
008c9f94	ldr x9,[x20]
008c9f98	mov w8,wzr
008c9f9c	mov w19,wzr
008c9fa0	ldrb w10,[x21, x9]
008c9fa4	add x9,x9,#0x1
008c9fa8	str x9,[x20]
008c9fac	and w11,w10,#0x7f
008c9fb0	lsl w11,w11,w8
008c9fb4	add w8,w8,#0x7
008c9fb8	orr w19,w11,w19
008c9fbc	tbnz w10,#0x7,0x008c9fa0
008c9fc0	tbnz w19,#0x1f,0x008ca5d0
008c9fc4	ubfiz x22,x19,#0x3,#0x20
008c9fc8	ldrb w2,[x23, #0x1]
008c9fcc	mov x0,x25
008c9fd0	mov x1,x22
008c9fd4	bl 0x008b7610
008c9fd8	str w19,[x23, #0xac]
008c9fdc	str x0,[x23, #0x38]
008c9fe0	cbz w19,0x008ca044
008c9fe4	mov w1,wzr
008c9fe8	mov x2,x22
008c9fec	bl 0x00c301c0
008c9ff0	mov x19,xzr
008c9ff4	ldr x9,[x20]
008c9ff8	mov w8,wzr
008c9ffc	mov w2,wzr
008ca000	ldrb w10,[x21, x9]
008ca004	add x9,x9,#0x1
008ca008	str x9,[x20]
008ca00c	and w11,w10,#0x7f
008ca010	lsl w11,w11,w8
008ca014	add w8,w8,#0x7
008ca018	orr w2,w11,w2
008ca01c	tbnz w10,#0x7,0x008ca000
008ca020	mov x0,x27
008ca024	mov x1,x25
008ca028	bl 0x008ca8f8
008ca02c	ldr x8,[x23, #0x38]
008ca030	str x0,[x8, x19, LSL #0x3]
008ca034	add x19,x19,#0x1
008ca038	ldrsw x8,[x23, #0xac]
008ca03c	cmp x19,x8
008ca040	b.lt 0x008c9ff4
008ca044	ldr x9,[x20]
008ca048	mov w8,wzr
008ca04c	mov w10,wzr
008ca050	ldrb w11,[x21, x9]
008ca054	add x9,x9,#0x1
008ca058	str x9,[x20]
008ca05c	and w12,w11,#0x7f
008ca060	lsl w12,w12,w8
008ca064	add w8,w8,#0x7
008ca068	orr w10,w12,w10
008ca06c	tbnz w11,#0x7,0x008ca050
008ca070	mov x0,x26
008ca074	mov x1,x21
008ca078	mov x2,x20
008ca07c	str w10,[x23, #0xa0]
008ca080	bl 0x008ca668
008ca084	str x0,[x23, #0x88]
008ca088	ldr x8,[x20]
008ca08c	ldrb w10,[x21, x8]
008ca090	add x9,x8,#0x1
008ca094	str x9,[x20]
008ca098	cbz w10,0x008ca170
008ca09c	add x8,x8,#0x2
008ca0a0	ldrb w9,[x21, x9]
008ca0a4	mov x0,x25
008ca0a8	str x8,[x20]
008ca0ac	ldrsw x8,[x23, #0xb8]
008ca0b0	sub w10,w8,#0x1
008ca0b4	add x8,x8,#0x3
008ca0b8	asr w22,w10,w9
008ca0bc	and x19,x8,#-0x4
008ca0c0	add w8,w19,w22, LSL #0x2
008ca0c4	add w23,w8,#0x4
008ca0c8	ldur x8,[x29, #-0x38]
008ca0cc	sxtw x1,w23
008ca0d0	ldrb w2,[x8, #0x1]
008ca0d4	ldur x8,[x29, #-0x38]
008ca0d8	str w9,[x8, #0xa8]
008ca0dc	bl 0x008b7610
008ca0e0	ldur x9,[x29, #-0x38]
008ca0e4	ldur x8,[x29, #-0x38]
008ca0e8	str x0,[x9, #0x90]
008ca0ec	ldur x9,[x29, #-0x38]
008ca0f0	ldr w8,[x8, #0xb8]
008ca0f4	str w23,[x9, #0xb0]
008ca0f8	ldur x23,[x29, #-0x38]
008ca0fc	add x9,x0,x19
008ca100	cmp w8,#0x1
008ca104	str x9,[x23, #0x8]
008ca108	b.lt 0x008ca140
008ca10c	mov x8,xzr
008ca110	mov w9,wzr
008ca114	ldr x10,[x20]
008ca118	add x11,x10,#0x1
008ca11c	ldrb w10,[x21, x10]
008ca120	str x11,[x20]
008ca124	ldr x11,[x23, #0x90]
008ca128	add w9,w9,w10
008ca12c	strb w9,[x11, x8]
008ca130	add x8,x8,#0x1
008ca134	ldrsw x10,[x23, #0xb8]
008ca138	cmp x8,x10
008ca13c	b.lt 0x008ca114
008ca140	tbnz w22,#0x1f,0x008ca170
008ca144	ldr x9,[x20]
008ca148	ldr x10,[x23, #0x8]
008ca14c	mov w8,wzr
008ca150	add w11,w22,#0x1
008ca154	ldr w12,[x21, x9#0x0]
008ca158	add x9,x9,#0x4
008ca15c	subs x11,x11,#0x1
008ca160	str x9,[x20]
008ca164	add w8,w12,w8
008ca168	str w8,[x10], #0x4
008ca16c	b.ne 0x008ca154
008ca170	ldr x8,[x20]
008ca174	ldrb w9,[x21, x8]
008ca178	add x8,x8,#0x1
008ca17c	str x8,[x20]
008ca180	cbz w9,0x008ca35c
008ca184	mov w9,wzr
008ca188	mov w22,wzr
008ca18c	ldrb w10,[x21, x8]
008ca190	add x8,x8,#0x1
008ca194	str x8,[x20]
008ca198	and w11,w10,#0x7f
008ca19c	lsl w11,w11,w9
008ca1a0	add w9,w9,#0x7
008ca1a4	orr w22,w11,w22
008ca1a8	tbnz w10,#0x7,0x008ca18c
008ca1ac	tbnz w22,#0x1f,0x008ca5d0
008ca1b0	add x8,x22,w22, UXTW  #0x1
008ca1b4	ldrb w2,[x23, #0x1]
008ca1b8	mov x0,x25
008ca1bc	lsl x1,x8,#0x3
008ca1c0	bl 0x008b7610
008ca1c4	str w22,[x23, #0xa4]
008ca1c8	str x0,[x23, #0x80]
008ca1cc	cbz w22,0x008ca2d0
008ca1d0	cmp w22,#0x1
008ca1d4	b.ne 0x008ca1e0
008ca1d8	mov x8,xzr
008ca1dc	b 0x008ca208
008ca1e0	and x8,x22,#0x7ffffffe
008ca1e4	mov x10,x0
008ca1e8	mov x9,x8
008ca1ec	str xzr,[x10]
008ca1f0	subs x9,x9,#0x2
008ca1f4	str xzr,[x10, #0x18]
008ca1f8	add x10,x10,#0x30
008ca1fc	b.ne 0x008ca1ec
008ca200	cmp x8,x22
008ca204	b.eq 0x008ca220
008ca208	mov w9,#0x18
008ca20c	umaddl x9,w8,w9,x0
008ca210	sub x8,x22,x8
008ca214	subs x8,x8,#0x1
008ca218	str xzr,[x9], #0x18
008ca21c	b.ne 0x008ca214
008ca220	ldur x19,[x29, #-0x38]
008ca224	mov x22,xzr
008ca228	mov w23,#0x18
008ca22c	mov x0,x26
008ca230	mov x1,x21
008ca234	mov x2,x20
008ca238	bl 0x008ca668
008ca23c	mul x8,x22,x23
008ca240	ldr x9,[x19, #0x80]
008ca244	mov w10,wzr
008ca248	mov w12,wzr
008ca24c	str x0,[x9, x8#0x0]
008ca250	ldr x8,[x20]
008ca254	ldrb w11,[x21, x8]
008ca258	add x8,x8,#0x1
008ca25c	str x8,[x20]
008ca260	and w13,w11,#0x7f
008ca264	lsl w13,w13,w10
008ca268	add w10,w10,#0x7
008ca26c	orr w12,w13,w12
008ca270	tbnz w11,#0x7,0x008ca254
008ca274	madd x13,x22,x23,x9
008ca278	mov w11,wzr
008ca27c	mov w10,wzr
008ca280	str w12,[x13, #0x8]
008ca284	ldrb w12,[x21, x8]
008ca288	add x8,x8,#0x1
008ca28c	str x8,[x20]
008ca290	and w13,w12,#0x7f
008ca294	lsl w13,w13,w11
008ca298	add w11,w11,#0x7
008ca29c	orr w10,w13,w10
008ca2a0	tbnz w12,#0x7,0x008ca284
008ca2a4	madd x9,x22,x23,x9
008ca2a8	ldur x19,[x29, #-0x38]
008ca2ac	add x22,x22,#0x1
008ca2b0	str w10,[x9, #0xc]
008ca2b4	ldrb w10,[x21, x8]
008ca2b8	add x8,x8,#0x1
008ca2bc	str x8,[x20]
008ca2c0	strb w10,[x9, #0x10]
008ca2c4	ldrsw x8,[x19, #0xa4]
008ca2c8	cmp x22,x8
008ca2cc	b.lt 0x008ca22c
008ca2d0	ldr x9,[x20]
008ca2d4	mov w8,wzr
008ca2d8	mov w19,wzr
008ca2dc	ldrb w10,[x21, x9]
008ca2e0	add x9,x9,#0x1
008ca2e4	str x9,[x20]
008ca2e8	and w11,w10,#0x7f
008ca2ec	lsl w11,w11,w8
008ca2f0	add w8,w8,#0x7
008ca2f4	orr w19,w11,w19
008ca2f8	tbnz w10,#0x7,0x008ca2dc
008ca2fc	ldur x23,[x29, #-0x38]
008ca300	tbnz w19,#0x1f,0x008ca5d0
008ca304	ubfiz x22,x19,#0x3,#0x20
008ca308	ldrb w2,[x23, #0x1]
008ca30c	mov x0,x25
008ca310	mov x1,x22
008ca314	bl 0x008b7610
008ca318	str w19,[x23, #0xb4]
008ca31c	str x0,[x23, #0x10]
008ca320	cbz w19,0x008ca35c
008ca324	mov w1,wzr
008ca328	mov x2,x22
008ca32c	bl 0x00c301c0
008ca330	mov x19,xzr
008ca334	mov x0,x26
008ca338	mov x1,x21
008ca33c	mov x2,x20
008ca340	bl 0x008ca668
008ca344	ldr x8,[x23, #0x10]
008ca348	str x0,[x8, x19, LSL #0x3]
008ca34c	add x19,x19,#0x1
008ca350	ldrsw x8,[x23, #0xb4]
008ca354	cmp x19,x8
008ca358	b.lt 0x008ca334
008ca35c	ldr w19,[sp, #0x14]
008ca360	and w8,w19,#0xff
008ca364	cmp w8,#0xb
008ca368	b.cc 0x008ca4a8
008ca36c	ldr x10,[x20]
008ca370	mov w8,wzr
008ca374	mov w9,wzr
008ca378	ldrb w11,[x21, x10]
008ca37c	add x10,x10,#0x1
008ca380	str x10,[x20]
008ca384	and w12,w11,#0x7f
008ca388	lsl w12,w12,w8
008ca38c	add w8,w8,#0x7
008ca390	orr w9,w12,w9
008ca394	tbnz w11,#0x7,0x008ca378
008ca398	str w9,[x23, #0xc8]
008ca39c	cbz w9,0x008ca464
008ca3a0	ubfiz x1,x9,#0x4,#0x20
008ca3a4	ldrb w2,[x23, #0x1]
008ca3a8	mov x0,x25
008ca3ac	bl 0x008b7610
008ca3b0	ldr w8,[x23, #0xc8]
008ca3b4	str x0,[x23, #0xc0]
008ca3b8	cbz w8,0x008ca464
008ca3bc	mov x8,xzr
008ca3c0	add x9,x21,#0x1
008ca3c4	b 0x008ca3e0
008ca3c8	str xzr,[x10, #0x8]
008ca3cc	str w12,[x10, #0x4]
008ca3d0	ldr w10,[x23, #0xc8]
008ca3d4	add x8,x8,#0x1
008ca3d8	cmp x8,x10
008ca3dc	b.cs 0x008ca464
008ca3e0	ldr x11,[x20]
008ca3e4	add x10,x11,#0x1
008ca3e8	ldrb w12,[x21, x11]
008ca3ec	str x10,[x20]
008ca3f0	ldr x10,[x23, #0xc0]
008ca3f4	add x10,x10,x8, LSL #0x4
008ca3f8	str w12,[x10]
008ca3fc	cbz w12,0x008ca438
008ca400	cmp w12,#0x1
008ca404	b.ne 0x008ca3d0
008ca408	mov w13,wzr
008ca40c	mov w12,wzr
008ca410	ldrb w14,[x9, x11]
008ca414	add x16,x11,#0x2
008ca418	add x11,x11,#0x1
008ca41c	str x16,[x20]
008ca420	and w15,w14,#0x7f
008ca424	lsl w15,w15,w13
008ca428	add w13,w13,#0x7
008ca42c	orr w12,w15,w12
008ca430	tbnz w14,#0x7,0x008ca410
008ca434	b 0x008ca3c8
008ca438	mov w13,wzr
008ca43c	ldrb w14,[x9, x11]
008ca440	add x16,x11,#0x2
008ca444	add x11,x11,#0x1
008ca448	str x16,[x20]
008ca44c	and w15,w14,#0x7f
008ca450	lsl w15,w15,w13
008ca454	add w13,w13,#0x7
008ca458	orr w12,w15,w12
008ca45c	tbnz w14,#0x7,0x008ca43c
008ca460	b 0x008ca3c8
008ca464	and w8,w19,#0xff
008ca468	cmp w8,#0xb
008ca46c	b.eq 0x008ca4a8
008ca470	ldrb w8,[x23, #0x4]
008ca474	tbz w8,#0x3,0x008ca4a8
008ca478	ldr x9,[x20]
008ca47c	mov w8,wzr
008ca480	mov x10,xzr
008ca484	ldrb w11,[x21, x9]
008ca488	add x9,x9,#0x1
008ca48c	str x9,[x20]
008ca490	and x12,x11,#0x7f
008ca494	lsl x12,x12,x8
008ca498	add w8,w8,#0x7
008ca49c	orr x10,x12,x10
008ca4a0	tbnz w11,#0x7,0x008ca484
008ca4a4	str x10,[x23, #0xe0]
008ca4a8	ldr x8,[x24, #0x28]
008ca4ac	ldur x9,[x29, #-0x10]
008ca4b0	cmp x8,x9
008ca4b4	b.ne 0x008ca634
008ca4b8	ldp x20,x19,[sp, #0x100]
008ca4bc	ldp x22,x21,[sp, #0xf0]
008ca4c0	ldp x24,x23,[sp, #0xe0]
008ca4c4	ldp x26,x25,[sp, #0xd0]
008ca4c8	ldp x28,x27,[sp, #0xc0]
008ca4cc	ldp x29,x30,[sp, #0xb0]
008ca4d0	add sp,sp,#0x110
008ca4d4	ret
008ca4d8	add x9,x13,x9
008ca4dc	cbz w12,0x008ca54c
008ca4e0	adrp x15,0xd1f000
008ca4e4	add x13,x14,x13
008ca4e8	mov x14,x12
008ca4ec	ldrb w16,[x15, #0xe58]
008ca4f0	b 0x008ca50c
008ca4f4	ldrb w17,[x8, w16, UXTW ]
008ca4f8	strb w17,[x13]
008ca4fc	ldrb w16,[x15, #0xe58]
008ca500	subs x14,x14,#0x1
008ca504	add x13,x13,#0x1
008ca508	b.eq 0x008ca548
008ca50c	ldrb w17,[x13]
008ca510	tbz w16,#0x0,0x008ca534
008ca514	and w16,w17,#0x7f
008ca518	sub w16,w16,#0x40
008ca51c	cmp w16,#0x1f
008ca520	b.hi 0x008ca4f8
008ca524	ldrb w16,[x8, w16, UXTW ]
008ca528	and w17,w17,#0x80
008ca52c	orr w17,w16,w17
008ca530	b 0x008ca4f8
008ca534	sub w16,w17,#0x40
008ca538	cmp w16,#0x1f
008ca53c	b.ls 0x008ca4f4
008ca540	mov w16,wzr
008ca544	b 0x008ca500
008ca548	add x9,x9,x12
008ca54c	cbz w11,0x008c9650
008ca550	adrp x12,0xd1f000
008ca554	mov w13,wzr
008ca558	ldrb w14,[x12, #0xe58]
008ca55c	ldrb w15,[x10, x9]
008ca560	tbz w14,#0x0,0x008ca584
008ca564	and w14,w15,#0x7f
008ca568	sub w14,w14,#0x40
008ca56c	cmp w14,#0x1f
008ca570	b.hi 0x008ca594
008ca574	ldrb w14,[x8, w14, UXTW ]
008ca578	and w15,w15,#0x80
008ca57c	orr w15,w14,w15
008ca580	b 0x008ca594
008ca584	sub w14,w15,#0x40
008ca588	cmp w14,#0x1f
008ca58c	b.hi 0x008ca5a0
008ca590	ldrb w15,[x8, w14, UXTW ]
008ca594	strb w15,[x10, x9]
008ca598	ldrb w14,[x12, #0xe58]
008ca59c	b 0x008ca5a4
008ca5a0	mov w14,wzr
008ca5a4	add x9,x9,#0x2
008ca5a8	ldrsb w15,[x10, x9]
008ca5ac	add x9,x9,#0x1
008ca5b0	tbnz w15,#0x1f,0x008ca5a8
008ca5b4	ldrsb w15,[x10, x9]
008ca5b8	add x9,x9,#0x1
008ca5bc	tbnz w15,#0x1f,0x008ca5b4
008ca5c0	add w13,w13,#0x1
008ca5c4	cmp w13,w11
008ca5c8	b.ne 0x008ca55c
008ca5cc	b 0x008c9650
008ca5d0	ldr x8,[x24, #0x28]
008ca5d4	b 0x008ca5e8
008ca5d8	ldr x8,[x26, #0x28]
008ca5dc	b 0x008ca5e8
008ca5e0	ldr x8,[sp, #0x18]
008ca5e4	ldr x8,[x8, #0x28]
008ca5e8	ldur x9,[x29, #-0x10]
008ca5ec	cmp x8,x9
008ca5f0	b.ne 0x008ca634
008ca5f4	ldur x0,[x29, #-0x30]
008ca5f8	bl 0x008b75fc
008ca634	bl 0x00c2fec0
