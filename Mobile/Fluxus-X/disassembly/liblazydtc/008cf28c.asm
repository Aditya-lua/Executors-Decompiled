; LZ4_compress_fast_extState_fastReset @ 008cf28c
008cf28c	sub sp,sp,#0xe0
008cf290	stp x29,x30,[sp, #0x80]
008cf294	stp x28,x27,[sp, #0x90]
008cf298	stp x26,x25,[sp, #0xa0]
008cf29c	stp x24,x23,[sp, #0xb0]
008cf2a0	stp x22,x21,[sp, #0xc0]
008cf2a4	stp x20,x19,[sp, #0xd0]
008cf2a8	add x29,sp,#0x80
008cf2ac	cmp w5,#0x1
008cf2b0	orr w9,wzr,#0x10001
008cf2b4	mov w10,#0x7e000000
008cf2b8	csinc w8,w5,wzr,gt
008cf2bc	mov w23,w3
008cf2c0	mov x21,x0
008cf2c4	cmp w8,#0x10, LSL #12
008cf2c8	add x20,x0,#0x4, LSL #12
008cf2cc	stur x2,[x29, #-0x10]
008cf2d0	csel w26,w8,w9,le
008cf2d4	cmp w3,w10
008cf2d8	b.ls 0x008cf2e4
008cf2dc	mov w9,wzr
008cf2e0	b 0x008cf2fc
008cf2e4	mov w8,#0x8081
008cf2e8	movk w8,#0x8080, LSL #16
008cf2ec	umull x8,w23,w8
008cf2f0	lsr x8,x8,#0x27
008cf2f4	add w8,w23,w8
008cf2f8	add w9,w8,#0x10
008cf2fc	ldr w8,[x20, #0x14]
008cf300	cmp w4,w9
008cf304	mov w9,#0xa
008cf308	movk w9,#0x1, LSL #16
008cf30c	stur x1,[x29, #-0x8]
008cf310	b.ge 0x008cf334
008cf314	cmp w23,w9
008cf318	b.gt 0x008cf350
008cf31c	cmp w8,#0x3
008cf320	stur w26,[x29, #-0x18]
008cf324	b.eq 0x008cf98c
008cf328	cbnz w8,0x008cfa94
008cf32c	ldr w26,[x20, #0x10]
008cf330	b 0x008cf9a8
008cf334	cmp w23,w9
008cf338	b.gt 0x008cf380
008cf33c	cmp w8,#0x3
008cf340	b.eq 0x008cff7c
008cf344	cbnz w8,0x008d0058
008cf348	ldr w25,[x20, #0x10]
008cf34c	b 0x008cff98
008cf350	cbz w8,0x008cf3a8
008cf354	mov x0,x21
008cf358	mov w1,wzr
008cf35c	mov w2,#0x4000
008cf360	mov w19,w4
008cf364	bl 0x00c301c0
008cf368	movi v0.2D,#0x0
008cf36c	ldur x1,[x29, #-0x8]
008cf370	mov w4,w19
008cf374	mov w8,wzr
008cf378	str d0,[x21, #0x4010]
008cf37c	b 0x008cf3b8
008cf380	cbz w8,0x008cf978
008cf384	mov x0,x21
008cf388	mov w1,wzr
008cf38c	mov w2,#0x4000
008cf390	bl 0x00c301c0
008cf394	movi v0.2D,#0x0
008cf398	ldur x1,[x29, #-0x8]
008cf39c	mov w9,wzr
008cf3a0	str d0,[x21, #0x4010]
008cf3a4	b 0x008d0510
008cf3a8	ldr w8,[x20, #0x10]
008cf3ac	cbz w8,0x008cf3b8
008cf3b0	add w8,w8,#0x10, LSL #12
008cf3b4	str w8,[x20, #0x10]
008cf3b8	movi v0.2D,#0x0
008cf3bc	mov w9,#0x7e000000
008cf3c0	str wzr,[x20, #0x18]
008cf3c4	cmp w23,w9
008cf3c8	str q0,[x21, #0x4000]
008cf3cc	b.hi 0x008d0528
008cf3d0	mov x22,x1
008cf3d4	mov x16,#0xbb000000
008cf3d8	mov w13,#0x2
008cf3dc	movk x16,#0xbcdc, LSL #32
008cf3e0	ldr x9,[x22], #0x1
008cf3e4	movk x16,#0xcf1b, LSL #48
008cf3e8	mov w14,#0x1
008cf3ec	mov w15,w23
008cf3f0	mul x12,x9,x16
008cf3f4	ldur x0,[x29, #-0x10]
008cf3f8	add w11,w8,w23
008cf3fc	stp w13,w23,[x20, #0x14]
008cf400	orr w13,w14,w26, LSL #0x6
008cf404	mov w10,w8
008cf408	str x15,[sp, #0x18]
008cf40c	add x15,x1,x15
008cf410	add x27,x0,w4, SXTW 
008cf414	str w11,[x20, #0x10]
008cf418	mov w2,#0x8081
008cf41c	sub x19,x1,x10
008cf420	mvn x10,x10
008cf424	sub x14,x15,#0x5
008cf428	add x9,x1,#0x2
008cf42c	lsr x11,x12,#0x32
008cf430	mov w12,w13
008cf434	sub x13,x15,#0x8
008cf438	mov w17,#0xffff
008cf43c	movk w2,#0x8080, LSL #16
008cf440	mov x23,x0
008cf444	sub x3,x15,#0xb
008cf448	sub x20,x15,#0xc
008cf44c	stp x13,x14,[sp, #0x38]
008cf450	and x11,x11,#0x3ffc
008cf454	sub x13,x15,#0x6
008cf458	add x10,x10,x1
008cf45c	mov x25,x1
008cf460	stur x15,[x29, #-0x38]
008cf464	str x13,[sp, #0x30]
008cf468	str x10,[sp, #0x10]
008cf46c	str w8,[x21, x11#0x0]
008cf470	stur w26,[x29, #-0x18]
008cf474	stp x27,x21,[x29, #-0x28]
008cf478	stur w12,[x29, #-0x30]
008cf47c	b 0x008cf498
008cf480	add x9,x8,#0x6
008cf484	ldur w26,[x29, #-0x18]
008cf488	ldur w12,[x29, #-0x30]
008cf48c	cmp x9,x3
008cf490	add x22,x8,#0x5
008cf494	b.hi 0x008cf8e4
008cf498	ldr x11,[x22]
008cf49c	mov w8,w26
008cf4a0	mov w10,w12
008cf4a4	b 0x008cf4c0
008cf4a8	add x9,x13,w8, UXTW 
008cf4ac	lsr w8,w10,#0x6
008cf4b0	add w10,w10,#0x1
008cf4b4	mov x22,x13
008cf4b8	cmp x9,x3
008cf4bc	b.hi 0x008cf8e4
008cf4c0	mul x11,x11,x16
008cf4c4	mov x13,x9
008cf4c8	sub w9,w22,w19
008cf4cc	lsr x11,x11,#0x32
008cf4d0	and x14,x11,#0x3ffc
008cf4d4	ldr x11,[x13]
008cf4d8	ldr w12,[x21, x14#0x0]
008cf4dc	str w9,[x21, x14#0x0]
008cf4e0	add w15,w12,w17
008cf4e4	cmp w15,w9
008cf4e8	b.cc 0x008cf4a8
008cf4ec	ldr w9,[x19, x12#0x0]
008cf4f0	ldr w14,[x22]
008cf4f4	cmp w9,w14
008cf4f8	b.ne 0x008cf4a8
008cf4fc	add x26,x19,x12
008cf500	cmp x26,x1
008cf504	b.ls 0x008cf518
008cf508	ldurb w8,[x22, #-0x1]
008cf50c	ldurb w9,[x26, #-0x1]
008cf510	cmp w8,w9
008cf514	b.eq 0x008cf898
008cf518	mov x8,x22
008cf51c	sub x9,x8,x25
008cf520	add x0,x23,#0x1
008cf524	mov w28,w9
008cf528	umull x10,w28,w2
008cf52c	add x11,x0,x28
008cf530	add x10,x11,x10, LSR #0x27
008cf534	add x10,x10,#0x8
008cf538	cmp x10,x27
008cf53c	b.hi 0x008d0528
008cf540	subs w10,w9,#0xf
008cf544	b.cc 0x008cf5b8
008cf548	cmp w10,#0xff
008cf54c	mov w9,#0xf0
008cf550	strb w9,[x23]
008cf554	b.cc 0x008cf5b0
008cf558	sub w8,w8,w25
008cf55c	mov w1,#0xff
008cf560	str x3,[sp, #0x28]
008cf564	sub w8,w8,#0x10e
008cf568	str w8,[sp, #0x20]
008cf56c	umull x8,w8,w2
008cf570	lsr x24,x8,#0x27
008cf574	add x2,x24,#0x1
008cf578	bl 0x00c301c0
008cf57c	mov x16,#0xbb000000
008cf580	sub w8,w24,w24, LSL #0x8
008cf584	ldr w10,[sp, #0x20]
008cf588	ldr x3,[sp, #0x28]
008cf58c	mov w2,#0x8081
008cf590	movk x16,#0xbcdc, LSL #32
008cf594	ldur x1,[x29, #-0x8]
008cf598	add x9,x23,x24
008cf59c	movk w2,#0x8080, LSL #16
008cf5a0	mov w17,#0xffff
008cf5a4	movk x16,#0xcf1b, LSL #48
008cf5a8	add w10,w10,w8
008cf5ac	add x0,x9,#0x2
008cf5b0	strb w10,[x0], #0x1
008cf5b4	b 0x008cf5c0
008cf5b8	lsl w8,w9,#0x4
008cf5bc	strb w8,[x23]
008cf5c0	cmp x28,#0x8
008cf5c4	mov w8,#0x8
008cf5c8	csel x9,x28,x8,hi
008cf5cc	cmp x28,#0x19
008cf5d0	add x8,x0,x28
008cf5d4	b.cc 0x008cf630
008cf5d8	sub x10,x0,x25
008cf5dc	cmp x10,#0x20
008cf5e0	b.cc 0x008cf630
008cf5e4	sub x9,x9,#0x1
008cf5e8	add x13,x0,#0x10
008cf5ec	add x14,x25,#0x10
008cf5f0	lsr x9,x9,#0x3
008cf5f4	add x11,x9,#0x1
008cf5f8	and x12,x11,#0x3ffffffffffffffc
008cf5fc	lsl x10,x12,#0x3
008cf600	mov x15,x12
008cf604	add x9,x25,x10
008cf608	add x10,x0,x10
008cf60c	ldp q0,q1,[x14, #-0x10]
008cf610	subs x15,x15,#0x4
008cf614	add x14,x14,#0x20
008cf618	stp q0,q1,[x13, #-0x10]
008cf61c	add x13,x13,#0x20
008cf620	b.ne 0x008cf60c
008cf624	cmp x11,x12
008cf628	b.ne 0x008cf638
008cf62c	b 0x008cf648
008cf630	mov x9,x25
008cf634	mov x10,x0
008cf638	ldr x11,[x9], #0x8
008cf63c	str x11,[x10], #0x8
008cf640	cmp x10,x8
008cf644	b.cc 0x008cf638
008cf648	mov x9,x23
008cf64c	mov x25,x22
008cf650	add x10,x25,#0x4
008cf654	sub w11,w25,w26
008cf658	mov x23,x8
008cf65c	cmp x10,x20
008cf660	add x12,x26,#0x4
008cf664	strh w11,[x23], #0x2
008cf668	b.cs 0x008cf888
008cf66c	ldr x11,[x12]
008cf670	ldr x12,[x10]
008cf674	cmp x11,x12
008cf678	b.ne 0x008cf730
008cf67c	add x11,x25,#0xc
008cf680	add x12,x26,#0xc
008cf684	cmp x11,x20
008cf688	b.cs 0x008cf6b8
008cf68c	sub w13,w11,w25
008cf690	sub w13,w13,#0x4
008cf694	ldr x14,[x12]
008cf698	ldr x15,[x11]
008cf69c	cmp x14,x15
008cf6a0	b.ne 0x008cf744
008cf6a4	add x11,x11,#0x8
008cf6a8	add x12,x12,#0x8
008cf6ac	add w13,w13,#0x8
008cf6b0	cmp x11,x20
008cf6b4	b.cc 0x008cf694
008cf6b8	ldr x13,[sp, #0x38]
008cf6bc	cmp x11,x13
008cf6c0	b.cs 0x008cf6e0
008cf6c4	ldr w13,[x12]
008cf6c8	ldr w14,[x11]
008cf6cc	cmp w13,w14
008cf6d0	add x13,x11,#0x4
008cf6d4	add x14,x12,#0x4
008cf6d8	csel x12,x12,x14,ne
008cf6dc	csel x11,x11,x13,ne
008cf6e0	ldr x13,[sp, #0x30]
008cf6e4	cmp x11,x13
008cf6e8	b.cs 0x008cf708
008cf6ec	ldrh w13,[x12]
008cf6f0	ldrh w14,[x11]
008cf6f4	cmp w13,w14
008cf6f8	add x13,x11,#0x2
008cf6fc	add x14,x12,#0x2
008cf700	csel x12,x12,x14,ne
008cf704	csel x11,x11,x13,ne
008cf708	ldr x13,[sp, #0x40]
008cf70c	cmp x11,x13
008cf710	b.cs 0x008cf728
008cf714	mov x13,x11
008cf718	ldrb w12,[x12]
008cf71c	ldrb w14,[x13], #0x1
008cf720	cmp w12,w14
008cf724	csel x11,x11,x13,ne
008cf728	sub w22,w11,w10
008cf72c	b 0x008cf758
008cf730	eor x10,x12,x11
008cf734	rbit x10,x10
008cf738	clz x10,x10
008cf73c	lsr w22,w10,#0x3
008cf740	b 0x008cf758
008cf744	eor x10,x15,x14
008cf748	rbit x10,x10
008cf74c	clz x10,x10
008cf750	lsr x10,x10,#0x3
008cf754	add w22,w10,w13
008cf758	add w10,w22,#0xf0
008cf75c	umull x10,w10,w2
008cf760	add x10,x8,x10, LSR #0x27
008cf764	add x10,x10,#0x8
008cf768	cmp x10,x27
008cf76c	b.hi 0x008d0528
008cf770	ldrb w11,[x9]
008cf774	subs w10,w22,#0xf
008cf778	b.cc 0x008cf808
008cf77c	add w11,w11,#0xf
008cf780	cmp w10,#0x3fc
008cf784	strb w11,[x9]
008cf788	mov w9,#0xffffffff
008cf78c	str w9,[x23]
008cf790	b.cc 0x008cf7e8
008cf794	sub w26,w22,#0x40b
008cf798	add x23,x8,#0x6
008cf79c	mov w1,#0xff
008cf7a0	umull x9,w26,w2
008cf7a4	mov x0,x23
008cf7a8	mov x24,x16
008cf7ac	mov x21,x3
008cf7b0	lsr x28,x9,#0x29
008cf7b4	lsl w27,w28,#0x2
008cf7b8	add x2,x27,#0x4
008cf7bc	bl 0x00c301c0
008cf7c0	mov w8,#0x3fc
008cf7c4	mov x3,x21
008cf7c8	add x23,x23,x27
008cf7cc	msub w10,w28,w8,w26
008cf7d0	ldp x27,x21,[x29, #-0x28]
008cf7d4	mov w2,#0x8081
008cf7d8	ldur x1,[x29, #-0x8]
008cf7dc	mov w17,#0xffff
008cf7e0	movk w2,#0x8080, LSL #16
008cf7e4	mov x16,x24
008cf7e8	and w8,w10,#0xffff
008cf7ec	mov w9,#0x8081
008cf7f0	mul w8,w8,w9
008cf7f4	lsr w8,w8,#0x17
008cf7f8	add x23,x23,x8
008cf7fc	add w8,w10,w8
008cf800	strb w8,[x23], #0x1
008cf804	b 0x008cf810
008cf808	add w8,w11,w22
008cf80c	strb w8,[x9]
008cf810	add x8,x25,w22, UXTW 
008cf814	add x25,x8,#0x4
008cf818	cmp x25,x3
008cf81c	b.cs 0x008cf8e4
008cf820	mov x9,x8
008cf824	ldr x10,[x9, #0x2]!
008cf828	ldur x11,[x9, #0x2]
008cf82c	sub w9,w9,w19
008cf830	mul x10,x10,x16
008cf834	mul x11,x11,x16
008cf838	lsr x10,x10,#0x32
008cf83c	lsr x11,x11,#0x32
008cf840	and x10,x10,#0x3ffc
008cf844	str w9,[x21, x10#0x0]
008cf848	and x10,x11,#0x3ffc
008cf84c	sub w11,w25,w19
008cf850	ldr w9,[x21, x10#0x0]
008cf854	str w11,[x21, x10#0x0]
008cf858	add w12,w9,w17
008cf85c	cmp w12,w11
008cf860	b.cc 0x008cf480
008cf864	add x26,x19,x9
008cf868	ldr w10,[x25]
008cf86c	ldr w9,[x26]
008cf870	cmp w9,w10
008cf874	b.ne 0x008cf480
008cf878	mov x8,x23
008cf87c	mov x9,x23
008cf880	strb wzr,[x8], #0x1
008cf884	b 0x008cf650
008cf888	mov x11,x10
008cf88c	cmp x11,x20
008cf890	b.cc 0x008cf68c
008cf894	b 0x008cf6b8
008cf898	ldr x8,[sp, #0x10]
008cf89c	sub x11,x22,#0x1
008cf8a0	mov x9,x11
008cf8a4	add x10,x8,x12
008cf8a8	mov x26,x10
008cf8ac	cmp x10,x1
008cf8b0	mov x22,x9
008cf8b4	mov x8,x11
008cf8b8	b.ls 0x008cf51c
008cf8bc	cmp x22,x25
008cf8c0	b.ls 0x008cf51c
008cf8c4	mov x9,x22
008cf8c8	mov x10,x26
008cf8cc	ldrb w11,[x9, #-0x1]!
008cf8d0	ldrb w12,[x10, #-0x1]!
008cf8d4	cmp w11,w12
008cf8d8	sub x11,x8,#0x1
008cf8dc	b.eq 0x008cf8a8
008cf8e0	b 0x008cf51c
008cf8e4	ldur x8,[x29, #-0x38]
008cf8e8	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008cf8ec	movk x9,#0x8081
008cf8f0	sub x21,x8,x25
008cf8f4	add x8,x21,#0xf0
008cf8f8	umulh x8,x8,x9
008cf8fc	add x9,x23,x21
008cf900	add x8,x9,x8, LSR #0x7
008cf904	add x8,x8,#0x1
008cf908	cmp x8,x27
008cf90c	b.hi 0x008d0528
008cf910	subs x8,x21,#0xf
008cf914	b.cc 0x008d0a64
008cf918	ldur x22,[x29, #-0x10]
008cf91c	mov w9,#0xf0
008cf920	mov x0,x23
008cf924	cmp x8,#0xff
008cf928	strb w9,[x0], #0x1
008cf92c	b.cc 0x008cf96c
008cf930	ldr x8,[sp, #0x18]
008cf934	add x8,x1,x8
008cf938	mov w1,#0xff
008cf93c	sub x8,x8,x25
008cf940	sub x19,x8,#0x10e
008cf944	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cf948	movk x8,#0x8081
008cf94c	umulh x8,x19,x8
008cf950	lsr x20,x8,#0x7
008cf954	add x2,x20,#0x1
008cf958	bl 0x00c301c0
008cf95c	sub x8,x20,x20, LSL #0x8
008cf960	add x9,x23,x20
008cf964	add x0,x9,#0x2
008cf968	add x8,x8,x19
008cf96c	strb w8,[x0]
008cf970	mov x23,x0
008cf974	b 0x008d0a70
008cf978	ldr w8,[x20, #0x10]
008cf97c	cbz w8,0x008d050c
008cf980	add w9,w8,#0x10, LSL #12
008cf984	str w9,[x20, #0x10]
008cf988	b 0x008d0510
008cf98c	cmp w23,#0xfff
008cf990	b.gt 0x008cfa94
008cf994	ldr w26,[x20, #0x10]
008cf998	mov w9,#0xffff
008cf99c	add w8,w26,w23
008cf9a0	cmp w8,w9
008cf9a4	b.cs 0x008cfa94
008cf9a8	movi v0.2D,#0x0
008cf9ac	str wzr,[x20, #0x18]
008cf9b0	str q0,[x21, #0x4000]
008cf9b4	cbz w26,0x008cfac4
008cf9b8	mov w8,#0x7e000000
008cf9bc	cmp w23,w8
008cf9c0	b.hi 0x008d0528
008cf9c4	cbz w23,0x008d04f4
008cf9c8	ldur x11,[x29, #-0x10]
008cf9cc	mov w10,w23
008cf9d0	mov w9,#0x3
008cf9d4	add w8,w26,w23
008cf9d8	str x10,[sp, #0x38]
008cf9dc	add x10,x1,x10
008cf9e0	add x25,x11,w4, SXTW 
008cf9e4	cmp w23,#0xd
008cf9e8	stp w9,w23,[x20, #0x14]
008cf9ec	mov x23,x11
008cf9f0	mov x22,x1
008cf9f4	stur x10,[x29, #-0x38]
008cf9f8	str w8,[x20, #0x10]
008cf9fc	b.cs 0x008d0bc4
008cfa00	ldur x8,[x29, #-0x38]
008cfa04	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008cfa08	movk x9,#0x8081
008cfa0c	sub x21,x8,x22
008cfa10	add x8,x21,#0xf0
008cfa14	umulh x8,x8,x9
008cfa18	add x9,x23,x21
008cfa1c	add x8,x9,x8, LSR #0x7
008cfa20	add x8,x8,#0x1
008cfa24	cmp x8,x25
008cfa28	b.hi 0x008d0528
008cfa2c	subs x8,x21,#0xf
008cfa30	b.cc 0x008d1534
008cfa34	ldur x24,[x29, #-0x10]
008cfa38	mov w9,#0xf0
008cfa3c	mov x0,x23
008cfa40	cmp x8,#0xff
008cfa44	strb w9,[x0], #0x1
008cfa48	b.cc 0x008cfa88
008cfa4c	ldr x8,[sp, #0x38]
008cfa50	add x8,x1,x8
008cfa54	mov w1,#0xff
008cfa58	sub x8,x8,x22
008cfa5c	sub x19,x8,#0x10e
008cfa60	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cfa64	movk x8,#0x8081
008cfa68	umulh x8,x19,x8
008cfa6c	lsr x20,x8,#0x7
008cfa70	add x2,x20,#0x1
008cfa74	bl 0x00c301c0
008cfa78	sub x8,x20,x20, LSL #0x8
008cfa7c	add x9,x23,x20
008cfa80	add x0,x9,#0x2
008cfa84	add x8,x8,x19
008cfa88	strb w8,[x0]
008cfa8c	mov x23,x0
008cfa90	b 0x008d1540
008cfa94	mov x0,x21
008cfa98	mov w1,wzr
008cfa9c	mov w2,#0x4000
008cfaa0	mov w19,w4
008cfaa4	bl 0x00c301c0
008cfaa8	ldur x1,[x29, #-0x8]
008cfaac	mov w4,w19
008cfab0	add x8,x21,#0x4, LSL #12
008cfab4	str xzr,[x21, #0x4000]
008cfab8	str xzr,[x21, #0x4010]
008cfabc	str xzr,[x21, #0x4008]
008cfac0	str wzr,[x8, #0x18]
008cfac4	mov w8,#0x7e000000
008cfac8	cmp w23,w8
008cfacc	b.hi 0x008d0528
008cfad0	cbz w23,0x008d04f4
008cfad4	ldur x9,[x29, #-0x10]
008cfad8	mov w10,w23
008cfadc	mov w8,#0x3
008cfae0	cmp w23,#0xd
008cfae4	add x11,x1,x10
008cfae8	str w23,[x20, #0x10]
008cfaec	add x25,x9,w4, SXTW 
008cfaf0	stp w8,w23,[x20, #0x14]
008cfaf4	mov x20,x9
008cfaf8	mov x23,x1
008cfafc	b.cc 0x008d0b28
008cfb00	mov x9,x1
008cfb04	mov w24,#0x79b1
008cfb08	mov w16,#0x8081
008cfb0c	ldr w8,[x9], #-0x1
008cfb10	movk w24,#0x9e37, LSL #16
008cfb14	str x9,[sp, #0x30]
008cfb18	sub x9,x11,#0x5
008cfb1c	ldur x20,[x29, #-0x10]
008cfb20	mul w8,w8,w24
008cfb24	stur x9,[x29, #-0x38]
008cfb28	ldur w9,[x29, #-0x18]
008cfb2c	sub x26,x11,#0xb
008cfb30	sub x27,x11,#0xc
008cfb34	movk w16,#0x8080, LSL #16
008cfb38	lsl w15,w9,#0x6
008cfb3c	sub x9,x11,#0x8
008cfb40	mov w17,#0xffffffff
008cfb44	lsr w8,w8,#0x13
008cfb48	str x9,[sp, #0x40]
008cfb4c	sub x9,x11,#0x6
008cfb50	mov w2,#0x8081
008cfb54	mov x23,x1
008cfb58	stur x10,[x29, #-0x28]
008cfb5c	stur x11,[x29, #-0x18]
008cfb60	str x9,[sp, #0x38]
008cfb64	strh wzr,[x21, w8, UXTW #0x1]
008cfb68	stur w15,[x29, #-0x30]
008cfb6c	mov x8,x23
008cfb70	mov w12,#0x1
008cfb74	mov w9,w15
008cfb78	ldr w10,[x8, #0x1]!
008cfb7c	mov x22,x8
008cfb80	add x8,x8,w12, UXTW 
008cfb84	cmp x8,x26
008cfb88	b.hi 0x008d0b20
008cfb8c	mul w11,w10,w24
008cfb90	ldr w14,[x8]
008cfb94	lsr w13,w11,#0x13
008cfb98	ldrh w11,[x21, w13, UXTW #0x1]
008cfb9c	ldr w12,[x1, x11#0x0]
008cfba0	cmp w12,w10
008cfba4	lsr w12,w9,#0x6
008cfba8	sub w10,w22,w1
008cfbac	add w9,w9,#0x1
008cfbb0	strh w10,[x21, w13, UXTW #0x1]
008cfbb4	mov w10,w14
008cfbb8	b.ne 0x008cfb7c
008cfbbc	add x19,x1,x11
008cfbc0	cbz w11,0x008cfbd4
008cfbc4	ldurb w8,[x22, #-0x1]
008cfbc8	ldurb w9,[x19, #-0x1]
008cfbcc	cmp w8,w9
008cfbd0	b.eq 0x008cff30
008cfbd4	mov x8,x22
008cfbd8	sub x9,x8,x23
008cfbdc	add x0,x20,#0x1
008cfbe0	mov w28,w9
008cfbe4	umull x10,w28,w16
008cfbe8	add x11,x0,x28
008cfbec	add x10,x11,x10, LSR #0x27
008cfbf0	add x10,x10,#0x8
008cfbf4	cmp x10,x25
008cfbf8	b.hi 0x008d0528
008cfbfc	subs w10,w9,#0xf
008cfc00	b.cc 0x008cfc6c
008cfc04	cmp w10,#0xff
008cfc08	mov w9,#0xf0
008cfc0c	strb w9,[x20]
008cfc10	b.cc 0x008cfc64
008cfc14	sub w8,w8,w23
008cfc18	mov w1,#0xff
008cfc1c	sub w8,w8,#0x10e
008cfc20	str w8,[sp, #0x28]
008cfc24	umull x8,w8,w16
008cfc28	lsr x8,x8,#0x27
008cfc2c	add x2,x8,#0x1
008cfc30	str x8,[sp, #0x20]
008cfc34	bl 0x00c301c0
008cfc38	ldr x9,[sp, #0x20]
008cfc3c	ldr w10,[sp, #0x28]
008cfc40	mov w16,#0x8081
008cfc44	ldur x1,[x29, #-0x8]
008cfc48	mov w2,#0x8081
008cfc4c	mov w17,#0xffffffff
008cfc50	sub w8,w9,w9, LSL #0x8
008cfc54	add x9,x20,x9
008cfc58	movk w16,#0x8080, LSL #16
008cfc5c	add x0,x9,#0x2
008cfc60	add w10,w10,w8
008cfc64	strb w10,[x0], #0x1
008cfc68	b 0x008cfc74
008cfc6c	lsl w8,w9,#0x4
008cfc70	strb w8,[x20]
008cfc74	cmp x28,#0x8
008cfc78	mov w8,#0x8
008cfc7c	csel x9,x28,x8,hi
008cfc80	cmp x28,#0x19
008cfc84	add x8,x0,x28
008cfc88	b.cc 0x008cfce4
008cfc8c	sub x10,x0,x23
008cfc90	cmp x10,#0x20
008cfc94	b.cc 0x008cfce4
008cfc98	sub x9,x9,#0x1
008cfc9c	add x13,x0,#0x10
008cfca0	add x14,x23,#0x10
008cfca4	lsr x9,x9,#0x3
008cfca8	add x11,x9,#0x1
008cfcac	and x12,x11,#0x3ffffffffffffffc
008cfcb0	lsl x10,x12,#0x3
008cfcb4	mov x15,x12
008cfcb8	add x9,x23,x10
008cfcbc	add x10,x0,x10
008cfcc0	ldp q0,q1,[x14, #-0x10]
008cfcc4	subs x15,x15,#0x4
008cfcc8	add x14,x14,#0x20
008cfccc	stp q0,q1,[x13, #-0x10]
008cfcd0	add x13,x13,#0x20
008cfcd4	b.ne 0x008cfcc0
008cfcd8	cmp x11,x12
008cfcdc	b.eq 0x008cfcfc
008cfce0	b 0x008cfcec
008cfce4	mov x9,x23
008cfce8	mov x10,x0
008cfcec	ldr x11,[x9], #0x8
008cfcf0	str x11,[x10], #0x8
008cfcf4	cmp x10,x8
008cfcf8	b.cc 0x008cfcec
008cfcfc	add x10,x22,#0x4
008cfd00	sub w11,w22,w19
008cfd04	mov x9,x8
008cfd08	cmp x10,x27
008cfd0c	add x12,x19,#0x4
008cfd10	strh w11,[x9], #0x2
008cfd14	b.cs 0x008cff10
008cfd18	ldr x11,[x12]
008cfd1c	ldr x12,[x10]
008cfd20	cmp x11,x12
008cfd24	b.ne 0x008cfddc
008cfd28	add x11,x22,#0xc
008cfd2c	add x12,x19,#0xc
008cfd30	cmp x11,x27
008cfd34	b.cs 0x008cfd64
008cfd38	sub w13,w11,w22
008cfd3c	sub w13,w13,#0x4
008cfd40	ldr x14,[x12]
008cfd44	ldr x15,[x11]
008cfd48	cmp x14,x15
008cfd4c	b.ne 0x008cfdf0
008cfd50	add x11,x11,#0x8
008cfd54	add x12,x12,#0x8
008cfd58	add w13,w13,#0x8
008cfd5c	cmp x11,x27
008cfd60	b.cc 0x008cfd40
008cfd64	ldr x13,[sp, #0x40]
008cfd68	cmp x11,x13
008cfd6c	b.cs 0x008cfd8c
008cfd70	ldr w13,[x12]
008cfd74	ldr w14,[x11]
008cfd78	cmp w13,w14
008cfd7c	add x13,x11,#0x4
008cfd80	add x14,x12,#0x4
008cfd84	csel x12,x12,x14,ne
008cfd88	csel x11,x11,x13,ne
008cfd8c	ldr x13,[sp, #0x38]
008cfd90	cmp x11,x13
008cfd94	b.cs 0x008cfdb4
008cfd98	ldrh w13,[x12]
008cfd9c	ldrh w14,[x11]
008cfda0	cmp w13,w14
008cfda4	add x13,x11,#0x2
008cfda8	add x14,x12,#0x2
008cfdac	csel x12,x12,x14,ne
008cfdb0	csel x11,x11,x13,ne
008cfdb4	ldur x13,[x29, #-0x38]
008cfdb8	cmp x11,x13
008cfdbc	b.cs 0x008cfdd4
008cfdc0	mov x13,x11
008cfdc4	ldrb w12,[x12]
008cfdc8	ldrb w14,[x13], #0x1
008cfdcc	cmp w12,w14
008cfdd0	csel x11,x11,x13,ne
008cfdd4	sub w19,w11,w10
008cfdd8	b 0x008cfe04
008cfddc	eor x10,x12,x11
008cfde0	rbit x10,x10
008cfde4	clz x10,x10
008cfde8	lsr w19,w10,#0x3
008cfdec	b 0x008cfe04
008cfdf0	eor x10,x15,x14
008cfdf4	rbit x10,x10
008cfdf8	clz x10,x10
008cfdfc	lsr x10,x10,#0x3
008cfe00	add w19,w10,w13
008cfe04	add w10,w19,#0xf0
008cfe08	umull x10,w10,w16
008cfe0c	add x10,x8,x10, LSR #0x27
008cfe10	add x10,x10,#0x8
008cfe14	cmp x10,x25
008cfe18	b.hi 0x008d0528
008cfe1c	ldrb w11,[x20]
008cfe20	subs w10,w19,#0xf
008cfe24	b.cc 0x008cfeac
008cfe28	add w11,w11,#0xf
008cfe2c	cmp w10,#0x3fc
008cfe30	strb w11,[x20]
008cfe34	str w17,[x9]
008cfe38	b.cc 0x008cfe90
008cfe3c	sub w23,w19,#0x40b
008cfe40	mov x24,x25
008cfe44	add x20,x8,#0x6
008cfe48	umull x9,w23,w16
008cfe4c	mov x0,x20
008cfe50	mov w1,#0xff
008cfe54	lsr x28,x9,#0x29
008cfe58	lsl w25,w28,#0x2
008cfe5c	add x2,x25,#0x4
008cfe60	bl 0x00c301c0
008cfe64	mov w8,#0x3fc
008cfe68	mov w16,#0x8081
008cfe6c	ldur x1,[x29, #-0x8]
008cfe70	msub w10,w28,w8,w23
008cfe74	add x9,x20,x25
008cfe78	mov x25,x24
008cfe7c	mov w24,#0x79b1
008cfe80	mov w2,#0x8081
008cfe84	mov w17,#0xffffffff
008cfe88	movk w16,#0x8080, LSL #16
008cfe8c	movk w24,#0x9e37, LSL #16
008cfe90	and w8,w10,#0xffff
008cfe94	mul w8,w8,w2
008cfe98	lsr w8,w8,#0x17
008cfe9c	add x9,x9,x8
008cfea0	add w8,w10,w8
008cfea4	strb w8,[x9], #0x1
008cfea8	b 0x008cfeb4
008cfeac	add w8,w11,w19
008cfeb0	strb w8,[x20]
008cfeb4	add x8,x22,w19, UXTW 
008cfeb8	add x22,x8,#0x4
008cfebc	cmp x22,x26
008cfec0	b.cs 0x008d0b18
008cfec4	ldr w10,[x8, #0x2]!
008cfec8	ldur w11,[x8, #0x2]
008cfecc	sub w8,w8,w1
008cfed0	mul w10,w10,w24
008cfed4	mul w12,w11,w24
008cfed8	lsr w10,w10,#0x13
008cfedc	lsr w12,w12,#0x13
008cfee0	strh w8,[x21, w10, UXTW #0x1]
008cfee4	ldrh w8,[x21, w12, UXTW #0x1]
008cfee8	add x19,x1,x8
008cfeec	ldr w8,[x19]
008cfef0	cmp w8,w11
008cfef4	sub w8,w22,w1
008cfef8	strh w8,[x21, w12, UXTW #0x1]
008cfefc	b.ne 0x008cff20
008cff00	mov x8,x9
008cff04	mov x20,x9
008cff08	strb wzr,[x8], #0x1
008cff0c	b 0x008cfcfc
008cff10	mov x11,x10
008cff14	cmp x11,x27
008cff18	b.cc 0x008cfd38
008cff1c	b 0x008cfd64
008cff20	ldur w15,[x29, #-0x30]
008cff24	mov x20,x9
008cff28	mov x23,x22
008cff2c	b 0x008cfb6c
008cff30	ldr x8,[sp, #0x30]
008cff34	sub x12,x22,#0x1
008cff38	mov x9,x12
008cff3c	add x10,x8,x11
008cff40	mov x19,x10
008cff44	cmp x10,x1
008cff48	mov x22,x9
008cff4c	mov x8,x12
008cff50	b.ls 0x008cfbd8
008cff54	cmp x22,x23
008cff58	b.ls 0x008cfbd8
008cff5c	mov x9,x22
008cff60	mov x10,x19
008cff64	ldrb w11,[x9, #-0x1]!
008cff68	ldrb w12,[x10, #-0x1]!
008cff6c	cmp w11,w12
008cff70	sub x12,x8,#0x1
008cff74	b.eq 0x008cff40
008cff78	b 0x008cfbd8
008cff7c	cmp w23,#0xfff
008cff80	b.gt 0x008d0058
008cff84	ldr w25,[x20, #0x10]
008cff88	mov w9,#0xffff
008cff8c	add w8,w25,w23
008cff90	cmp w8,w9
008cff94	b.cs 0x008d0058
008cff98	movi v0.2D,#0x0
008cff9c	str wzr,[x20, #0x18]
008cffa0	str q0,[x21, #0x4000]
008cffa4	cbz w25,0x008d0080
008cffa8	mov w8,#0x7e000000
008cffac	cmp w23,w8
008cffb0	b.hi 0x008d0528
008cffb4	cbz w23,0x008d04fc
008cffb8	mov w9,#0x3
008cffbc	mov w10,w23
008cffc0	add w8,w25,w23
008cffc4	cmp w23,#0xd
008cffc8	stp w9,w23,[x20, #0x14]
008cffcc	ldur x23,[x29, #-0x10]
008cffd0	stur x10,[x29, #-0x38]
008cffd4	add x10,x1,x10
008cffd8	mov x27,x1
008cffdc	stur w26,[x29, #-0x18]
008cffe0	stur x10,[x29, #-0x28]
008cffe4	str w8,[x20, #0x10]
008cffe8	b.cs 0x008d1084
008cffec	ldur x8,[x29, #-0x28]
008cfff0	sub x21,x8,x27
008cfff4	subs x8,x21,#0xf
008cfff8	b.cc 0x008d14ec
008cfffc	mov w9,#0xf0
008d0000	mov x0,x23
008d0004	cmp x8,#0xff
008d0008	strb w9,[x0], #0x1
008d000c	b.cc 0x008d004c
008d0010	ldur x8,[x29, #-0x38]
008d0014	add x8,x1,x8
008d0018	mov w1,#0xff
008d001c	sub x8,x8,x27
008d0020	sub x19,x8,#0x10e
008d0024	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d0028	movk x8,#0x8081
008d002c	umulh x8,x19,x8
008d0030	lsr x20,x8,#0x7
008d0034	add x2,x20,#0x1
008d0038	bl 0x00c301c0
008d003c	sub x8,x20,x20, LSL #0x8
008d0040	add x9,x23,x20
008d0044	add x0,x9,#0x2
008d0048	add x8,x8,x19
008d004c	strb w8,[x0]
008d0050	mov x23,x0
008d0054	b 0x008d14f4
008d0058	mov x0,x21
008d005c	mov w1,wzr
008d0060	mov w2,#0x4000
008d0064	bl 0x00c301c0
008d0068	ldur x1,[x29, #-0x8]
008d006c	add x8,x21,#0x4, LSL #12
008d0070	str xzr,[x21, #0x4000]
008d0074	str xzr,[x21, #0x4010]
008d0078	str xzr,[x21, #0x4008]
008d007c	str wzr,[x8, #0x18]
008d0080	mov w8,#0x7e000000
008d0084	cmp w23,w8
008d0088	b.hi 0x008d0528
008d008c	cbz w23,0x008d04fc
008d0090	mov w8,#0x3
008d0094	mov w10,w23
008d0098	str w23,[x20, #0x18]
008d009c	cmp w23,#0xd
008d00a0	stp w23,w8,[x20, #0x10]
008d00a4	ldur x23,[x29, #-0x10]
008d00a8	add x9,x1,x10
008d00ac	mov x19,x1
008d00b0	b.cc 0x008d0aa0
008d00b4	stur x10,[x29, #-0x28]
008d00b8	mov x10,x1
008d00bc	mov w24,#0x79b1
008d00c0	ldr w8,[x10], #-0x1
008d00c4	movk w24,#0x9e37, LSL #16
008d00c8	str x10,[sp, #0x30]
008d00cc	sub x10,x9,#0x5
008d00d0	lsl w15,w26,#0x6
008d00d4	mul w8,w8,w24
008d00d8	ldur x23,[x29, #-0x10]
008d00dc	sub x25,x9,#0xb
008d00e0	stur x10,[x29, #-0x38]
008d00e4	sub x28,x9,#0xc
008d00e8	sub x10,x9,#0x8
008d00ec	stur x9,[x29, #-0x18]
008d00f0	sub x9,x9,#0x6
008d00f4	mov w16,#0xffffffff
008d00f8	lsr w8,w8,#0x13
008d00fc	mov w17,#0x8081
008d0100	mov x19,x1
008d0104	str x10,[sp, #0x40]
008d0108	str x9,[sp, #0x38]
008d010c	strh wzr,[x21, w8, UXTW #0x1]
008d0110	stur w15,[x29, #-0x30]
008d0114	mov x8,x19
008d0118	mov w12,#0x1
008d011c	mov w9,w15
008d0120	ldr w10,[x8, #0x1]!
008d0124	mov x22,x8
008d0128	add x8,x8,w12, UXTW 
008d012c	cmp x8,x25
008d0130	b.hi 0x008d0a98
008d0134	mul w11,w10,w24
008d0138	ldr w14,[x8]
008d013c	lsr w13,w11,#0x13
008d0140	ldrh w11,[x21, w13, UXTW #0x1]
008d0144	ldr w12,[x1, x11#0x0]
008d0148	cmp w12,w10
008d014c	lsr w12,w9,#0x6
008d0150	sub w10,w22,w1
008d0154	add w9,w9,#0x1
008d0158	strh w10,[x21, w13, UXTW #0x1]
008d015c	mov w10,w14
008d0160	b.ne 0x008d0124
008d0164	add x20,x1,x11
008d0168	cbz w11,0x008d017c
008d016c	ldurb w8,[x22, #-0x1]
008d0170	ldurb w9,[x20, #-0x1]
008d0174	cmp w8,w9
008d0178	b.eq 0x008d04a8
008d017c	mov x8,x22
008d0180	mov w11,#0x8081
008d0184	sub x27,x8,x19
008d0188	add x0,x23,#0x1
008d018c	movk w11,#0x8080, LSL #16
008d0190	subs w9,w27,#0xf
008d0194	b.cc 0x008d01f0
008d0198	cmp w9,#0xff
008d019c	mov w10,#0xf0
008d01a0	strb w10,[x23]
008d01a4	b.cc 0x008d01e8
008d01a8	sub w8,w8,w19
008d01ac	mov w1,#0xff
008d01b0	sub w8,w8,#0x10e
008d01b4	str w8,[sp, #0x28]
008d01b8	umull x8,w8,w11
008d01bc	lsr x26,x8,#0x27
008d01c0	add x2,x26,#0x1
008d01c4	bl 0x00c301c0
008d01c8	sub w8,w26,w26, LSL #0x8
008d01cc	ldr w9,[sp, #0x28]
008d01d0	ldur x1,[x29, #-0x8]
008d01d4	add x10,x23,x26
008d01d8	mov w17,#0x8081
008d01dc	mov w16,#0xffffffff
008d01e0	add w9,w9,w8
008d01e4	add x0,x10,#0x2
008d01e8	strb w9,[x0], #0x1
008d01ec	b 0x008d01f8
008d01f0	lsl w8,w27,#0x4
008d01f4	strb w8,[x23]
008d01f8	mov w8,w27
008d01fc	mov w9,#0x8
008d0200	cmp x8,#0x8
008d0204	csel x9,x8,x9,hi
008d0208	cmp x8,#0x19
008d020c	add x8,x0,x8
008d0210	b.cc 0x008d0280
008d0214	sub x10,x0,x19
008d0218	mov w27,#0x8081
008d021c	cmp x10,#0x20
008d0220	movk w27,#0x8080, LSL #16
008d0224	b.cc 0x008d0274
008d0228	sub x9,x9,#0x1
008d022c	add x13,x0,#0x10
008d0230	add x14,x19,#0x10
008d0234	lsr x9,x9,#0x3
008d0238	add x11,x9,#0x1
008d023c	and x12,x11,#0x3ffffffffffffffc
008d0240	lsl x10,x12,#0x3
008d0244	mov x15,x12
008d0248	add x9,x19,x10
008d024c	add x10,x0,x10
008d0250	ldp q0,q1,[x14, #-0x10]
008d0254	subs x15,x15,#0x4
008d0258	add x14,x14,#0x20
008d025c	stp q0,q1,[x13, #-0x10]
008d0260	add x13,x13,#0x20
008d0264	b.ne 0x008d0250
008d0268	cmp x11,x12
008d026c	b.eq 0x008d02a0
008d0270	b 0x008d0290
008d0274	mov x9,x19
008d0278	mov x10,x0
008d027c	b 0x008d0290
008d0280	mov w27,#0x8081
008d0284	mov x9,x19
008d0288	mov x10,x0
008d028c	movk w27,#0x8080, LSL #16
008d0290	ldr x11,[x9], #0x8
008d0294	str x11,[x10], #0x8
008d0298	cmp x10,x8
008d029c	b.cc 0x008d0290
008d02a0	add x10,x22,#0x4
008d02a4	sub w11,w22,w20
008d02a8	mov x9,x8
008d02ac	cmp x10,x28
008d02b0	add x12,x20,#0x4
008d02b4	strh w11,[x9], #0x2
008d02b8	b.cs 0x008d0488
008d02bc	ldr x11,[x12]
008d02c0	ldr x12,[x10]
008d02c4	cmp x11,x12
008d02c8	b.ne 0x008d0370
008d02cc	add x11,x22,#0xc
008d02d0	add x12,x20,#0xc
008d02d4	cmp x11,x28
008d02d8	b.cs 0x008d02fc
008d02dc	ldr x13,[x12]
008d02e0	ldr x14,[x11]
008d02e4	cmp x13,x14
008d02e8	b.ne 0x008d0390
008d02ec	add x11,x11,#0x8
008d02f0	add x12,x12,#0x8
008d02f4	cmp x11,x28
008d02f8	b.cc 0x008d02dc
008d02fc	ldr x13,[sp, #0x40]
008d0300	cmp x11,x13
008d0304	b.cs 0x008d0324
008d0308	ldr w13,[x12]
008d030c	ldr w14,[x11]
008d0310	cmp w13,w14
008d0314	add x13,x11,#0x4
008d0318	add x14,x12,#0x4
008d031c	csel x12,x12,x14,ne
008d0320	csel x11,x11,x13,ne
008d0324	ldr x13,[sp, #0x38]
008d0328	cmp x11,x13
008d032c	b.cs 0x008d034c
008d0330	ldrh w13,[x12]
008d0334	ldrh w14,[x11]
008d0338	cmp w13,w14
008d033c	add x13,x11,#0x2
008d0340	add x14,x12,#0x2
008d0344	csel x12,x12,x14,ne
008d0348	csel x11,x11,x13,ne
008d034c	ldur x13,[x29, #-0x38]
008d0350	cmp x11,x13
008d0354	b.cs 0x008d03a0
008d0358	mov x13,x11
008d035c	ldrb w12,[x12]
008d0360	ldrb w14,[x13], #0x1
008d0364	cmp w12,w14
008d0368	csel x11,x11,x13,ne
008d036c	b 0x008d03a0
008d0370	eor x8,x12,x11
008d0374	rbit x8,x8
008d0378	clz x8,x8
008d037c	lsr w10,w8,#0x3
008d0380	mov w8,w10
008d0384	add x8,x22,x8
008d0388	add x22,x8,#0x4
008d038c	b 0x008d0424
008d0390	eor x12,x14,x13
008d0394	rbit x12,x12
008d0398	clz x12,x12
008d039c	add x11,x11,x12, LSR #0x3
008d03a0	sub x10,x11,x10
008d03a4	add x12,x22,w10, UXTW 
008d03a8	subs w11,w10,#0xf
008d03ac	add x22,x12,#0x4
008d03b0	b.cc 0x008d0424
008d03b4	ldrb w12,[x23]
008d03b8	cmp w11,#0x3fc
008d03bc	add w12,w12,#0xf
008d03c0	strb w12,[x23]
008d03c4	str w16,[x9]
008d03c8	b.cc 0x008d0408
008d03cc	sub w20,w10,#0x40b
008d03d0	add x19,x8,#0x6
008d03d4	mov w1,#0xff
008d03d8	umull x9,w20,w27
008d03dc	mov x0,x19
008d03e0	lsr x23,x9,#0x29
008d03e4	lsl w26,w23,#0x2
008d03e8	add x2,x26,#0x4
008d03ec	bl 0x00c301c0
008d03f0	mov w8,#0x3fc
008d03f4	ldur x1,[x29, #-0x8]
008d03f8	mov w17,#0x8081
008d03fc	msub w11,w23,w8,w20
008d0400	mov w16,#0xffffffff
008d0404	add x9,x19,x26
008d0408	and w8,w11,#0xffff
008d040c	mul w8,w8,w17
008d0410	lsr w8,w8,#0x17
008d0414	add x9,x9,x8
008d0418	add w8,w11,w8
008d041c	strb w8,[x9], #0x1
008d0420	b 0x008d0430
008d0424	ldrb w8,[x23]
008d0428	add w8,w8,w10
008d042c	strb w8,[x23]
008d0430	cmp x22,x25
008d0434	b.cs 0x008d0a90
008d0438	mov x8,x22
008d043c	ldr w11,[x22]
008d0440	ldr w10,[x8, #-0x2]!
008d0444	mul w12,w11,w24
008d0448	sub w8,w8,w1
008d044c	mul w10,w10,w24
008d0450	lsr w12,w12,#0x13
008d0454	lsr w10,w10,#0x13
008d0458	strh w8,[x21, w10, UXTW #0x1]
008d045c	ldrh w8,[x21, w12, UXTW #0x1]
008d0460	add x20,x1,x8
008d0464	ldr w8,[x20]
008d0468	cmp w8,w11
008d046c	sub w8,w22,w1
008d0470	strh w8,[x21, w12, UXTW #0x1]
008d0474	b.ne 0x008d0498
008d0478	mov x8,x9
008d047c	mov x23,x9
008d0480	strb wzr,[x8], #0x1
008d0484	b 0x008d02a0
008d0488	mov x11,x10
008d048c	cmp x11,x28
008d0490	b.cc 0x008d02dc
008d0494	b 0x008d02fc
008d0498	ldur w15,[x29, #-0x30]
008d049c	mov x23,x9
008d04a0	mov x19,x22
008d04a4	b 0x008d0114
008d04a8	ldr x8,[sp, #0x30]
008d04ac	sub x12,x22,#0x1
008d04b0	mov x9,x12
008d04b4	add x10,x8,x11
008d04b8	mov x20,x10
008d04bc	cmp x10,x1
008d04c0	mov x22,x9
008d04c4	mov x8,x12
008d04c8	b.ls 0x008d0180
008d04cc	cmp x22,x19
008d04d0	b.ls 0x008d0180
008d04d4	mov x9,x22
008d04d8	mov x10,x20
008d04dc	ldrb w11,[x9, #-0x1]!
008d04e0	ldrb w12,[x10, #-0x1]!
008d04e4	cmp w11,w12
008d04e8	sub x12,x8,#0x1
008d04ec	b.eq 0x008d04b8
008d04f0	b 0x008d0180
008d04f4	cmp w4,#0x1
008d04f8	b.lt 0x008d0528
008d04fc	ldur x8,[x29, #-0x10]
008d0500	mov w0,#0x1
008d0504	strb wzr,[x8]
008d0508	b 0x008d1514
008d050c	mov w9,wzr
008d0510	movi v0.2D,#0x0
008d0514	mov w8,#0x7e000000
008d0518	str wzr,[x20, #0x18]
008d051c	cmp w23,w8
008d0520	str q0,[x21, #0x4000]
008d0524	b.ls 0x008d0530
008d0528	mov w0,wzr
008d052c	b 0x008d1514
008d0530	mov x8,x1
008d0534	mov x19,#0xbb000000
008d0538	mov w15,w23
008d053c	ldr x10,[x8], #0x2
008d0540	movk x19,#0xbcdc, LSL #32
008d0544	movk x19,#0xcf1b, LSL #48
008d0548	add w12,w9,w23
008d054c	str x15,[sp, #0x20]
008d0550	mul x10,x10,x19
008d0554	add x15,x1,x15
008d0558	mov w11,w9
008d055c	mov w13,#0x2
008d0560	mov w14,#0x1
008d0564	str w12,[x20, #0x10]
008d0568	sub x12,x15,#0x5
008d056c	sub x25,x1,x11
008d0570	stp w13,w23,[x20, #0x14]
008d0574	orr w17,w14,w26, LSL #0x6
008d0578	mvn x11,x11
008d057c	stur x12,[x29, #-0x38]
008d0580	sub x12,x15,#0x8
008d0584	ldur x23,[x29, #-0x10]
008d0588	mov w16,#0xffff
008d058c	lsr x10,x10,#0x32
008d0590	sub x27,x15,#0xb
008d0594	sub x28,x15,#0xc
008d0598	str x12,[sp, #0x40]
008d059c	sub x12,x15,#0x6
008d05a0	add x11,x11,x1
008d05a4	and x10,x10,#0x3ffc
008d05a8	stur x15,[x29, #-0x30]
008d05ac	str w9,[x21, x10#0x0]
008d05b0	mov w9,w26
008d05b4	mov x26,x1
008d05b8	str x12,[sp, #0x38]
008d05bc	str x11,[sp, #0x18]
008d05c0	stur w9,[x29, #-0x18]
008d05c4	stur w17,[x29, #-0x28]
008d05c8	b 0x008d05e0
008d05cc	add x8,x26,#0x2
008d05d0	ldur w9,[x29, #-0x18]
008d05d4	ldur w17,[x29, #-0x28]
008d05d8	cmp x8,x27
008d05dc	b.hi 0x008d09e4
008d05e0	mov x22,x26
008d05e4	mov w10,w17
008d05e8	ldr x11,[x22, #0x1]!
008d05ec	b 0x008d0608
008d05f0	add x8,x13,w9, UXTW 
008d05f4	lsr w9,w10,#0x6
008d05f8	add w10,w10,#0x1
008d05fc	mov x22,x13
008d0600	cmp x8,x27
008d0604	b.hi 0x008d09e4
008d0608	mul x11,x11,x19
008d060c	mov x13,x8
008d0610	sub w8,w22,w25
008d0614	lsr x11,x11,#0x32
008d0618	and x14,x11,#0x3ffc
008d061c	ldr x11,[x13]
008d0620	ldr w12,[x21, x14#0x0]
008d0624	str w8,[x21, x14#0x0]
008d0628	add w15,w12,w16
008d062c	cmp w15,w8
008d0630	b.cc 0x008d05f0
008d0634	ldr w8,[x25, x12#0x0]
008d0638	ldr w14,[x22]
008d063c	cmp w8,w14
008d0640	b.ne 0x008d05f0
008d0644	add x20,x25,x12
008d0648	cmp x20,x1
008d064c	b.ls 0x008d0660
008d0650	ldurb w8,[x22, #-0x1]
008d0654	ldurb w9,[x20, #-0x1]
008d0658	cmp w8,w9
008d065c	b.eq 0x008d0998
008d0660	mov x8,x22
008d0664	sub x11,x8,x26
008d0668	add x0,x23,#0x1
008d066c	subs w9,w11,#0xf
008d0670	b.cc 0x008d06d8
008d0674	cmp w9,#0xff
008d0678	mov w10,#0xf0
008d067c	strb w10,[x23]
008d0680	b.cc 0x008d06d0
008d0684	sub w8,w8,w26
008d0688	mov w1,#0xff
008d068c	str x11,[sp, #0x28]
008d0690	sub w9,w8,#0x10e
008d0694	mov w8,#0x8081
008d0698	movk w8,#0x8080, LSL #16
008d069c	str w9,[sp, #0x30]
008d06a0	umull x8,w9,w8
008d06a4	lsr x24,x8,#0x27
008d06a8	add x2,x24,#0x1
008d06ac	bl 0x00c301c0
008d06b0	sub w8,w24,w24, LSL #0x8
008d06b4	ldr w9,[sp, #0x30]
008d06b8	ldr x11,[sp, #0x28]
008d06bc	ldur x1,[x29, #-0x8]
008d06c0	add x10,x23,x24
008d06c4	mov w16,#0xffff
008d06c8	add w9,w9,w8
008d06cc	add x0,x10,#0x2
008d06d0	strb w9,[x0], #0x1
008d06d4	b 0x008d06e0
008d06d8	lsl w8,w11,#0x4
008d06dc	strb w8,[x23]
008d06e0	mov w8,w11
008d06e4	mov w9,#0x8
008d06e8	cmp x8,#0x8
008d06ec	csel x9,x8,x9,hi
008d06f0	cmp x8,#0x19
008d06f4	add x8,x0,x8
008d06f8	b.cc 0x008d0754
008d06fc	sub x10,x0,x26
008d0700	cmp x10,#0x20
008d0704	b.cc 0x008d0754
008d0708	sub x9,x9,#0x1
008d070c	add x13,x0,#0x10
008d0710	add x14,x26,#0x10
008d0714	lsr x9,x9,#0x3
008d0718	add x11,x9,#0x1
008d071c	and x12,x11,#0x3ffffffffffffffc
008d0720	lsl x10,x12,#0x3
008d0724	mov x15,x12
008d0728	add x9,x26,x10
008d072c	add x10,x0,x10
008d0730	ldp q0,q1,[x14, #-0x10]
008d0734	subs x15,x15,#0x4
008d0738	add x14,x14,#0x20
008d073c	stp q0,q1,[x13, #-0x10]
008d0740	add x13,x13,#0x20
008d0744	b.ne 0x008d0730
008d0748	cmp x11,x12
008d074c	b.ne 0x008d075c
008d0750	b 0x008d076c
008d0754	mov x9,x26
008d0758	mov x10,x0
008d075c	ldr x11,[x9], #0x8
008d0760	str x11,[x10], #0x8
008d0764	cmp x10,x8
008d0768	b.cc 0x008d075c
008d076c	mov x9,x23
008d0770	mov x26,x22
008d0774	add x10,x26,#0x4
008d0778	sub w11,w26,w20
008d077c	mov x23,x8
008d0780	cmp x10,x28
008d0784	add x12,x20,#0x4
008d0788	strh w11,[x23], #0x2
008d078c	b.cs 0x008d0988
008d0790	ldr x11,[x12]
008d0794	ldr x12,[x10]
008d0798	cmp x11,x12
008d079c	b.ne 0x008d0844
008d07a0	add x11,x26,#0xc
008d07a4	add x12,x20,#0xc
008d07a8	cmp x11,x28
008d07ac	b.cs 0x008d07d0
008d07b0	ldr x13,[x12]
008d07b4	ldr x14,[x11]
008d07b8	cmp x13,x14
008d07bc	b.ne 0x008d0864
008d07c0	add x11,x11,#0x8
008d07c4	add x12,x12,#0x8
008d07c8	cmp x11,x28
008d07cc	b.cc 0x008d07b0
008d07d0	ldr x13,[sp, #0x40]
008d07d4	cmp x11,x13
008d07d8	b.cs 0x008d07f8
008d07dc	ldr w13,[x12]
008d07e0	ldr w14,[x11]
008d07e4	cmp w13,w14
008d07e8	add x13,x11,#0x4
008d07ec	add x14,x12,#0x4
008d07f0	csel x12,x12,x14,ne
008d07f4	csel x11,x11,x13,ne
008d07f8	ldr x13,[sp, #0x38]
008d07fc	cmp x11,x13
008d0800	b.cs 0x008d0820
008d0804	ldrh w13,[x12]
008d0808	ldrh w14,[x11]
008d080c	cmp w13,w14
008d0810	add x13,x11,#0x2
008d0814	add x14,x12,#0x2
008d0818	csel x12,x12,x14,ne
008d081c	csel x11,x11,x13,ne
008d0820	ldur x13,[x29, #-0x38]
008d0824	cmp x11,x13
008d0828	b.cs 0x008d0874
008d082c	mov x13,x11
008d0830	ldrb w12,[x12]
008d0834	ldrb w14,[x13], #0x1
008d0838	cmp w12,w14
008d083c	csel x11,x11,x13,ne
008d0840	b 0x008d0874
008d0844	eor x8,x12,x11
008d0848	rbit x8,x8
008d084c	clz x8,x8
008d0850	lsr w10,w8,#0x3
008d0854	mov w8,w10
008d0858	add x8,x26,x8
008d085c	add x26,x8,#0x4
008d0860	b 0x008d090c
008d0864	eor x12,x14,x13
008d0868	rbit x12,x12
008d086c	clz x12,x12
008d0870	add x11,x11,x12, LSR #0x3
008d0874	sub x10,x11,x10
008d0878	add x12,x26,w10, UXTW 
008d087c	subs w11,w10,#0xf
008d0880	add x26,x12,#0x4
008d0884	b.cc 0x008d090c
008d0888	ldrb w12,[x9]
008d088c	cmp w11,#0x3fc
008d0890	add w12,w12,#0xf
008d0894	strb w12,[x9]
008d0898	mov w9,#0xffffffff
008d089c	str w9,[x23]
008d08a0	b.cc 0x008d08e4
008d08a4	mov w9,#0x8081
008d08a8	sub w20,w10,#0x40b
008d08ac	add x23,x8,#0x6
008d08b0	movk w9,#0x8080, LSL #16
008d08b4	mov x0,x23
008d08b8	mov w1,#0xff
008d08bc	umull x9,w20,w9
008d08c0	lsr x22,x9,#0x29
008d08c4	lsl w24,w22,#0x2
008d08c8	add x2,x24,#0x4
008d08cc	bl 0x00c301c0
008d08d0	mov w8,#0x3fc
008d08d4	ldur x1,[x29, #-0x8]
008d08d8	mov w16,#0xffff
008d08dc	msub w11,w22,w8,w20
008d08e0	add x23,x23,x24
008d08e4	and w8,w11,#0xffff
008d08e8	mov w9,#0x8081
008d08ec	mul w8,w8,w9
008d08f0	lsr w8,w8,#0x17
008d08f4	add x23,x23,x8
008d08f8	add w8,w11,w8
008d08fc	strb w8,[x23], #0x1
008d0900	cmp x26,x27
008d0904	b.cc 0x008d0920
008d0908	b 0x008d09e4
008d090c	ldrb w8,[x9]
008d0910	add w8,w8,w10
008d0914	strb w8,[x9]
008d0918	cmp x26,x27
008d091c	b.cs 0x008d09e4
008d0920	mov x8,x26
008d0924	ldr x10,[x26]
008d0928	ldr x9,[x8, #-0x2]!
008d092c	mul x10,x10,x19
008d0930	sub w8,w8,w25
008d0934	mul x9,x9,x19
008d0938	lsr x10,x10,#0x32
008d093c	lsr x9,x9,#0x32
008d0940	and x9,x9,#0x3ffc
008d0944	str w8,[x21, x9#0x0]
008d0948	and x9,x10,#0x3ffc
008d094c	sub w10,w26,w25
008d0950	ldr w8,[x21, x9#0x0]
008d0954	str w10,[x21, x9#0x0]
008d0958	add w11,w8,w16
008d095c	cmp w11,w10
008d0960	b.cc 0x008d05cc
008d0964	add x20,x25,x8
008d0968	ldr w9,[x26]
008d096c	ldr w8,[x20]
008d0970	cmp w8,w9
008d0974	b.ne 0x008d05cc
008d0978	mov x8,x23
008d097c	mov x9,x23
008d0980	strb wzr,[x8], #0x1
008d0984	b 0x008d0774
008d0988	mov x11,x10
008d098c	cmp x11,x28
008d0990	b.cc 0x008d07b0
008d0994	b 0x008d07d0
008d0998	ldr x8,[sp, #0x18]
008d099c	sub x11,x22,#0x1
008d09a0	mov x9,x11
008d09a4	add x10,x8,x12
008d09a8	mov x20,x10
008d09ac	cmp x10,x1
008d09b0	mov x22,x9
008d09b4	mov x8,x11
008d09b8	b.ls 0x008d0664
008d09bc	cmp x22,x26
008d09c0	b.ls 0x008d0664
008d09c4	mov x9,x22
008d09c8	mov x10,x20
008d09cc	ldrb w11,[x9, #-0x1]!
008d09d0	ldrb w12,[x10, #-0x1]!
008d09d4	cmp w11,w12
008d09d8	sub x11,x8,#0x1
008d09dc	b.eq 0x008d09a8
008d09e0	b 0x008d0664
008d09e4	ldur x8,[x29, #-0x30]
008d09e8	sub x21,x8,x26
008d09ec	subs x8,x21,#0xf
008d09f0	b.cc 0x008d0a50
008d09f4	mov w9,#0xf0
008d09f8	mov x0,x23
008d09fc	cmp x8,#0xff
008d0a00	strb w9,[x0], #0x1
008d0a04	b.cc 0x008d0a44
008d0a08	ldr x8,[sp, #0x20]
008d0a0c	add x8,x1,x8
008d0a10	mov w1,#0xff
008d0a14	sub x8,x8,x26
008d0a18	sub x19,x8,#0x10e
008d0a1c	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d0a20	movk x8,#0x8081
008d0a24	umulh x8,x19,x8
008d0a28	lsr x20,x8,#0x7
008d0a2c	add x2,x20,#0x1
008d0a30	bl 0x00c301c0
008d0a34	sub x8,x20,x20, LSL #0x8
008d0a38	add x9,x23,x20
008d0a3c	add x0,x9,#0x2
008d0a40	add x8,x8,x19
008d0a44	strb w8,[x0]
008d0a48	mov x23,x0
008d0a4c	b 0x008d0a58
008d0a50	lsl w8,w21,#0x4
008d0a54	strb w8,[x23]
008d0a58	add x20,x23,#0x1
008d0a5c	mov x1,x26
008d0a60	b 0x008d14fc
008d0a64	lsl w8,w21,#0x4
008d0a68	ldur x22,[x29, #-0x10]
008d0a6c	strb w8,[x23]
008d0a70	add x20,x23,#0x1
008d0a74	mov x1,x25
008d0a78	mov x2,x21
008d0a7c	mov x0,x20
008d0a80	bl 0x00c2ffd0
008d0a84	add w8,w20,w21
008d0a88	sub w0,w8,w22
008d0a8c	b 0x008d1514
008d0a90	mov x23,x9
008d0a94	mov x19,x22
008d0a98	ldur x10,[x29, #-0x28]
008d0a9c	ldur x9,[x29, #-0x18]
008d0aa0	sub x21,x9,x19
008d0aa4	subs x8,x21,#0xf
008d0aa8	b.cc 0x008d0b04
008d0aac	mov w9,#0xf0
008d0ab0	mov x0,x23
008d0ab4	cmp x8,#0xff
008d0ab8	strb w9,[x0], #0x1
008d0abc	b.cc 0x008d0af8
008d0ac0	add x8,x1,x10
008d0ac4	mov w1,#0xff
008d0ac8	sub x8,x8,x19
008d0acc	sub x20,x8,#0x10e
008d0ad0	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d0ad4	movk x8,#0x8081
008d0ad8	umulh x8,x20,x8
008d0adc	lsr x22,x8,#0x7
008d0ae0	add x2,x22,#0x1
008d0ae4	bl 0x00c301c0
008d0ae8	sub x8,x22,x22, LSL #0x8
008d0aec	add x9,x23,x22
008d0af0	add x0,x9,#0x2
008d0af4	add x8,x8,x20
008d0af8	strb w8,[x0]
008d0afc	mov x23,x0
008d0b00	b 0x008d0b0c
008d0b04	lsl w8,w21,#0x4
008d0b08	strb w8,[x23]
008d0b0c	add x20,x23,#0x1
008d0b10	mov x1,x19
008d0b14	b 0x008d14fc
008d0b18	mov x20,x9
008d0b1c	mov x23,x22
008d0b20	ldur x10,[x29, #-0x28]
008d0b24	ldur x11,[x29, #-0x18]
008d0b28	sub x21,x11,x23
008d0b2c	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d0b30	add x8,x21,#0xf0
008d0b34	movk x9,#0x8081
008d0b38	umulh x8,x8,x9
008d0b3c	add x9,x20,x21
008d0b40	add x8,x9,x8, LSR #0x7
008d0b44	add x8,x8,#0x1
008d0b48	cmp x8,x25
008d0b4c	b.hi 0x008d0528
008d0b50	subs x8,x21,#0xf
008d0b54	b.cc 0x008d0bb0
008d0b58	mov w9,#0xf0
008d0b5c	mov x0,x20
008d0b60	cmp x8,#0xff
008d0b64	strb w9,[x0], #0x1
008d0b68	b.cc 0x008d0ba4
008d0b6c	add x8,x1,x10
008d0b70	mov w1,#0xff
008d0b74	sub x8,x8,x23
008d0b78	sub x19,x8,#0x10e
008d0b7c	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d0b80	movk x8,#0x8081
008d0b84	umulh x8,x19,x8
008d0b88	lsr x22,x8,#0x7
008d0b8c	add x2,x22,#0x1
008d0b90	bl 0x00c301c0
008d0b94	sub x8,x22,x22, LSL #0x8
008d0b98	add x9,x20,x22
008d0b9c	add x0,x9,#0x2
008d0ba0	add x8,x8,x19
008d0ba4	strb w8,[x0]
008d0ba8	mov x20,x0
008d0bac	b 0x008d0bb8
008d0bb0	lsl w8,w21,#0x4
008d0bb4	strb w8,[x20]
008d0bb8	add x20,x20,#0x1
008d0bbc	mov x1,x23
008d0bc0	b 0x008d14fc
008d0bc4	mov x20,x1
008d0bc8	ldur x12,[x29, #-0x38]
008d0bcc	mov w17,#0x79b1
008d0bd0	ldr w8,[x20], #0x1
008d0bd4	movk w17,#0x9e37, LSL #16
008d0bd8	sub x16,x12,#0xb
008d0bdc	sub x10,x12,#0x5
008d0be0	sub x19,x12,#0xc
008d0be4	mul w11,w8,w17
008d0be8	sub x13,x12,#0x8
008d0bec	sub x12,x12,#0x6
008d0bf0	stp x12,x13,[sp, #0x20]
008d0bf4	ldur w12,[x29, #-0x18]
008d0bf8	mov w9,w26
008d0bfc	str x10,[sp, #0x30]
008d0c00	mov w10,#0x1
008d0c04	mov w2,#0x8081
008d0c08	lsr w11,w11,#0x13
008d0c0c	sub x24,x1,x9
008d0c10	mvn x9,x9
008d0c14	orr w15,w10,w12, LSL #0x6
008d0c18	ldur x23,[x29, #-0x10]
008d0c1c	add x8,x1,#0x2
008d0c20	movk w2,#0x8080, LSL #16
008d0c24	add x9,x9,x1
008d0c28	mov x22,x1
008d0c2c	str x9,[sp]
008d0c30	strh w26,[x21, w11, UXTW #0x1]
008d0c34	stur w26,[x29, #-0x28]
008d0c38	stur x25,[x29, #-0x30]
008d0c3c	str w15,[sp, #0x40]
008d0c40	b 0x008d0c58
008d0c44	add x8,x9,#0x6
008d0c48	ldr w15,[sp, #0x40]
008d0c4c	add x20,x9,#0x5
008d0c50	cmp x8,x16
008d0c54	b.hi 0x008cfa00
008d0c58	ldr w11,[x20]
008d0c5c	ldur w9,[x29, #-0x18]
008d0c60	mov w10,w15
008d0c64	b 0x008d0c80
008d0c68	add x8,x13,w9, UXTW 
008d0c6c	lsr w9,w10,#0x6
008d0c70	add w10,w10,#0x1
008d0c74	mov x20,x13
008d0c78	cmp x8,x16
008d0c7c	b.hi 0x008cfa00
008d0c80	mul w11,w11,w17
008d0c84	mov x13,x8
008d0c88	lsr w14,w11,#0x13
008d0c8c	ldr w11,[x8]
008d0c90	sub w8,w20,w24
008d0c94	ldrh w12,[x21, w14, UXTW #0x1]
008d0c98	strh w8,[x21, w14, UXTW #0x1]
008d0c9c	cmp w26,w12
008d0ca0	b.hi 0x008d0c68
008d0ca4	ldr w8,[x24, x12#0x0]
008d0ca8	ldr w14,[x20]
008d0cac	cmp w8,w14
008d0cb0	b.ne 0x008d0c68
008d0cb4	add x27,x24,x12
008d0cb8	cmp x27,x1
008d0cbc	b.ls 0x008d0cd0
008d0cc0	ldurb w8,[x20, #-0x1]
008d0cc4	ldurb w9,[x27, #-0x1]
008d0cc8	cmp w8,w9
008d0ccc	b.eq 0x008d1038
008d0cd0	mov x8,x20
008d0cd4	sub x9,x8,x22
008d0cd8	add x0,x23,#0x1
008d0cdc	mov w28,w9
008d0ce0	umull x10,w28,w2
008d0ce4	add x11,x0,x28
008d0ce8	add x10,x11,x10, LSR #0x27
008d0cec	add x10,x10,#0x8
008d0cf0	cmp x10,x25
008d0cf4	b.hi 0x008d0528
008d0cf8	subs w10,w9,#0xf
008d0cfc	b.cc 0x008d0d70
008d0d00	cmp w10,#0xff
008d0d04	mov w9,#0xf0
008d0d08	strb w9,[x23]
008d0d0c	b.cc 0x008d0d68
008d0d10	sub w8,w8,w22
008d0d14	mov w1,#0xff
008d0d18	str x16,[sp, #0x18]
008d0d1c	sub w8,w8,#0x10e
008d0d20	str w8,[sp, #0x10]
008d0d24	umull x8,w8,w2
008d0d28	lsr x8,x8,#0x27
008d0d2c	add x2,x8,#0x1
008d0d30	str x8,[sp, #0x8]
008d0d34	bl 0x00c301c0
008d0d38	ldr x9,[sp, #0x8]
008d0d3c	ldr w10,[sp, #0x10]
008d0d40	mov w2,#0x8081
008d0d44	mov w17,#0x79b1
008d0d48	ldr x16,[sp, #0x18]
008d0d4c	ldur x1,[x29, #-0x8]
008d0d50	sub w8,w9,w9, LSL #0x8
008d0d54	add x9,x23,x9
008d0d58	movk w2,#0x8080, LSL #16
008d0d5c	movk w17,#0x9e37, LSL #16
008d0d60	add x0,x9,#0x2
008d0d64	add w10,w10,w8
008d0d68	strb w10,[x0], #0x1
008d0d6c	b 0x008d0d78
008d0d70	lsl w8,w9,#0x4
008d0d74	strb w8,[x23]
008d0d78	cmp x28,#0x8
008d0d7c	mov w8,#0x8
008d0d80	csel x9,x28,x8,hi
008d0d84	cmp x28,#0x19
008d0d88	add x8,x0,x28
008d0d8c	b.cc 0x008d0de8
008d0d90	sub x10,x0,x22
008d0d94	cmp x10,#0x20
008d0d98	b.cc 0x008d0de8
008d0d9c	sub x9,x9,#0x1
008d0da0	add x13,x0,#0x10
008d0da4	add x14,x22,#0x10
008d0da8	lsr x9,x9,#0x3
008d0dac	add x11,x9,#0x1
008d0db0	and x12,x11,#0x3ffffffffffffffc
008d0db4	lsl x10,x12,#0x3
008d0db8	mov x15,x12
008d0dbc	add x9,x22,x10
008d0dc0	add x10,x0,x10
008d0dc4	ldp q0,q1,[x14, #-0x10]
008d0dc8	subs x15,x15,#0x4
008d0dcc	add x14,x14,#0x20
008d0dd0	stp q0,q1,[x13, #-0x10]
008d0dd4	add x13,x13,#0x20
008d0dd8	b.ne 0x008d0dc4
008d0ddc	cmp x11,x12
008d0de0	b.ne 0x008d0df0
008d0de4	b 0x008d0e00
008d0de8	mov x9,x22
008d0dec	mov x10,x0
008d0df0	ldr x11,[x9], #0x8
008d0df4	str x11,[x10], #0x8
008d0df8	cmp x10,x8
008d0dfc	b.cc 0x008d0df0
008d0e00	mov x9,x23
008d0e04	mov x22,x20
008d0e08	add x10,x22,#0x4
008d0e0c	sub w11,w22,w27
008d0e10	mov x23,x8
008d0e14	cmp x10,x19
008d0e18	add x12,x27,#0x4
008d0e1c	strh w11,[x23], #0x2
008d0e20	b.cs 0x008d1028
008d0e24	ldr x11,[x12]
008d0e28	ldr x12,[x10]
008d0e2c	cmp x11,x12
008d0e30	b.ne 0x008d0ee0
008d0e34	add x11,x22,#0xc
008d0e38	add x12,x27,#0xc
008d0e3c	cmp x11,x19
008d0e40	b.cs 0x008d0e70
008d0e44	sub w13,w11,w22
008d0e48	sub w13,w13,#0x4
008d0e4c	ldr x14,[x12]
008d0e50	ldr x15,[x11]
008d0e54	cmp x14,x15
008d0e58	b.ne 0x008d0ef4
008d0e5c	add x11,x11,#0x8
008d0e60	add x12,x12,#0x8
008d0e64	add w13,w13,#0x8
008d0e68	cmp x11,x19
008d0e6c	b.cc 0x008d0e4c
008d0e70	ldr x13,[sp, #0x28]
008d0e74	cmp x11,x13
008d0e78	b.cs 0x008d0e94
008d0e7c	ldr w13,[x12]
008d0e80	ldr w14,[x11]
008d0e84	cmp w13,w14
008d0e88	b.ne 0x008d0e94
008d0e8c	add x11,x11,#0x4
008d0e90	add x12,x12,#0x4
008d0e94	ldr x13,[sp, #0x20]
008d0e98	cmp x11,x13
008d0e9c	b.cs 0x008d0eb8
008d0ea0	ldrh w13,[x12]
008d0ea4	ldrh w14,[x11]
008d0ea8	cmp w13,w14
008d0eac	b.ne 0x008d0eb8
008d0eb0	add x11,x11,#0x2
008d0eb4	add x12,x12,#0x2
008d0eb8	ldr x13,[sp, #0x30]
008d0ebc	cmp x11,x13
008d0ec0	b.cs 0x008d0ed8
008d0ec4	mov x13,x11
008d0ec8	ldrb w12,[x12]
008d0ecc	ldrb w14,[x13], #0x1
008d0ed0	cmp w12,w14
008d0ed4	csel x11,x11,x13,ne
008d0ed8	sub w20,w11,w10
008d0edc	b 0x008d0f08
008d0ee0	eor x10,x12,x11
008d0ee4	rbit x10,x10
008d0ee8	clz x10,x10
008d0eec	lsr w20,w10,#0x3
008d0ef0	b 0x008d0f08
008d0ef4	eor x10,x15,x14
008d0ef8	rbit x10,x10
008d0efc	clz x10,x10
008d0f00	lsr x10,x10,#0x3
008d0f04	add w20,w10,w13
008d0f08	add w10,w20,#0xf0
008d0f0c	umull x10,w10,w2
008d0f10	add x10,x8,x10, LSR #0x27
008d0f14	add x10,x10,#0x8
008d0f18	cmp x10,x25
008d0f1c	b.hi 0x008d0528
008d0f20	ldrb w11,[x9]
008d0f24	subs w10,w20,#0xf
008d0f28	b.cc 0x008d0fb8
008d0f2c	add w11,w11,#0xf
008d0f30	cmp w10,#0x3fc
008d0f34	strb w11,[x9]
008d0f38	mov w9,#0xffffffff
008d0f3c	str w9,[x23]
008d0f40	b.cc 0x008d0f98
008d0f44	sub w27,w20,#0x40b
008d0f48	add x23,x8,#0x6
008d0f4c	mov w1,#0xff
008d0f50	umull x9,w27,w2
008d0f54	mov x0,x23
008d0f58	mov x26,x16
008d0f5c	lsr x28,x9,#0x29
008d0f60	lsl w25,w28,#0x2
008d0f64	add x2,x25,#0x4
008d0f68	bl 0x00c301c0
008d0f6c	mov w8,#0x3fc
008d0f70	mov w2,#0x8081
008d0f74	mov w17,#0x79b1
008d0f78	msub w10,w28,w8,w27
008d0f7c	mov x16,x26
008d0f80	ldur x1,[x29, #-0x8]
008d0f84	add x23,x23,x25
008d0f88	ldur x25,[x29, #-0x30]
008d0f8c	ldur w26,[x29, #-0x28]
008d0f90	movk w2,#0x8080, LSL #16
008d0f94	movk w17,#0x9e37, LSL #16
008d0f98	and w8,w10,#0xffff
008d0f9c	mov w9,#0x8081
008d0fa0	mul w8,w8,w9
008d0fa4	lsr w8,w8,#0x17
008d0fa8	add x23,x23,x8
008d0fac	add w8,w10,w8
008d0fb0	strb w8,[x23], #0x1
008d0fb4	b 0x008d0fc0
008d0fb8	add w8,w11,w20
008d0fbc	strb w8,[x9]
008d0fc0	add x9,x22,w20, UXTW 
008d0fc4	add x22,x9,#0x4
008d0fc8	cmp x22,x16
008d0fcc	b.cs 0x008cfa00
008d0fd0	mov x10,x9
008d0fd4	ldr w11,[x10, #0x2]!
008d0fd8	ldur w8,[x10, #0x2]
008d0fdc	sub w10,w10,w24
008d0fe0	mul w11,w11,w17
008d0fe4	mul w12,w8,w17
008d0fe8	lsr w11,w11,#0x13
008d0fec	lsr w12,w12,#0x13
008d0ff0	strh w10,[x21, w11, UXTW #0x1]
008d0ff4	sub w11,w22,w24
008d0ff8	ldrh w10,[x21, w12, UXTW #0x1]
008d0ffc	strh w11,[x21, w12, UXTW #0x1]
008d1000	cmp w26,w10
008d1004	b.hi 0x008d0c44
008d1008	add x27,x24,x10
008d100c	ldr w10,[x27]
008d1010	cmp w10,w8
008d1014	b.ne 0x008d0c44
008d1018	mov x8,x23
008d101c	mov x9,x23
008d1020	strb wzr,[x8], #0x1
008d1024	b 0x008d0e08
008d1028	mov x11,x10
008d102c	cmp x11,x19
008d1030	b.cc 0x008d0e44
008d1034	b 0x008d0e70
008d1038	ldr x8,[sp]
008d103c	sub x11,x20,#0x1
008d1040	mov x9,x11
008d1044	add x10,x8,x12
008d1048	mov x27,x10
008d104c	cmp x10,x1
008d1050	mov x20,x9
008d1054	mov x8,x11
008d1058	b.ls 0x008d0cd4
008d105c	cmp x20,x22
008d1060	b.ls 0x008d0cd4
008d1064	mov x9,x20
008d1068	mov x10,x27
008d106c	ldrb w11,[x9, #-0x1]!
008d1070	ldrb w12,[x10, #-0x1]!
008d1074	cmp w11,w12
008d1078	sub x11,x8,#0x1
008d107c	b.eq 0x008d1048
008d1080	b 0x008d0cd4
008d1084	mov x8,x1
008d1088	mov w19,#0x79b1
008d108c	ldur x12,[x29, #-0x28]
008d1090	ldr w9,[x8], #0x2
008d1094	movk w19,#0x9e37, LSL #16
008d1098	sub x20,x12,#0xb
008d109c	sub x11,x12,#0x5
008d10a0	sub x28,x12,#0xc
008d10a4	mul w9,w9,w19
008d10a8	sub x13,x12,#0x8
008d10ac	sub x12,x12,#0x6
008d10b0	stp x12,x13,[sp, #0x30]
008d10b4	ldur w12,[x29, #-0x18]
008d10b8	mov w10,w25
008d10bc	str x11,[sp, #0x40]
008d10c0	mov w11,#0x1
008d10c4	sub x26,x1,x10
008d10c8	lsr w9,w9,#0x13
008d10cc	mvn x10,x10
008d10d0	orr w11,w11,w12, LSL #0x6
008d10d4	ldur x23,[x29, #-0x10]
008d10d8	add x10,x10,x1
008d10dc	mov x27,x1
008d10e0	str x10,[sp, #0x10]
008d10e4	strh w25,[x21, w9, UXTW #0x1]
008d10e8	stur w11,[x29, #-0x30]
008d10ec	b 0x008d1100
008d10f0	add x8,x27,#0x2
008d10f4	ldur w11,[x29, #-0x30]
008d10f8	cmp x8,x20
008d10fc	b.hi 0x008cffec
008d1100	mov x22,x27
008d1104	ldur w9,[x29, #-0x18]
008d1108	ldr w10,[x22, #0x1]!
008d110c	b 0x008d1128
008d1110	add x8,x13,w9, UXTW 
008d1114	lsr w9,w11,#0x6
008d1118	add w11,w11,#0x1
008d111c	mov x22,x13
008d1120	cmp x8,x20
008d1124	b.hi 0x008cffec
008d1128	mul w10,w10,w19
008d112c	mov x13,x8
008d1130	lsr w14,w10,#0x13
008d1134	ldr w10,[x8]
008d1138	sub w8,w22,w26
008d113c	ldrh w12,[x21, w14, UXTW #0x1]
008d1140	strh w8,[x21, w14, UXTW #0x1]
008d1144	cmp w25,w12
008d1148	b.hi 0x008d1110
008d114c	ldr w8,[x26, x12#0x0]
008d1150	ldr w14,[x22]
008d1154	cmp w8,w14
008d1158	b.ne 0x008d1110
008d115c	add x24,x26,x12
008d1160	cmp x24,x1
008d1164	b.ls 0x008d1178
008d1168	ldurb w8,[x22, #-0x1]
008d116c	ldurb w9,[x24, #-0x1]
008d1170	cmp w8,w9
008d1174	b.eq 0x008d14a0
008d1178	mov x8,x22
008d117c	sub x11,x8,x27
008d1180	add x0,x23,#0x1
008d1184	subs w9,w11,#0xf
008d1188	b.cc 0x008d11f4
008d118c	cmp w9,#0xff
008d1190	mov w10,#0xf0
008d1194	strb w10,[x23]
008d1198	b.cc 0x008d11ec
008d119c	sub w8,w8,w27
008d11a0	mov w1,#0xff
008d11a4	str x11,[sp, #0x28]
008d11a8	sub w9,w8,#0x10e
008d11ac	mov w8,#0x8081
008d11b0	movk w8,#0x8080, LSL #16
008d11b4	str w9,[sp, #0x20]
008d11b8	umull x8,w9,w8
008d11bc	lsr x8,x8,#0x27
008d11c0	add x2,x8,#0x1
008d11c4	str x8,[sp, #0x18]
008d11c8	bl 0x00c301c0
008d11cc	ldr x9,[sp, #0x18]
008d11d0	ldr x11,[sp, #0x28]
008d11d4	ldur x1,[x29, #-0x8]
008d11d8	sub w8,w9,w9, LSL #0x8
008d11dc	add x10,x23,x9
008d11e0	ldr w9,[sp, #0x20]
008d11e4	add x0,x10,#0x2
008d11e8	add w9,w9,w8
008d11ec	strb w9,[x0], #0x1
008d11f0	b 0x008d11fc
008d11f4	lsl w8,w11,#0x4
008d11f8	strb w8,[x23]
008d11fc	mov w8,w11
008d1200	mov w9,#0x8
008d1204	cmp x8,#0x8
008d1208	csel x9,x8,x9,hi
008d120c	cmp x8,#0x19
008d1210	add x8,x0,x8
008d1214	b.cc 0x008d1270
008d1218	sub x10,x0,x27
008d121c	cmp x10,#0x20
008d1220	b.cc 0x008d1270
008d1224	sub x9,x9,#0x1
008d1228	add x13,x0,#0x10
008d122c	add x14,x27,#0x10
008d1230	lsr x9,x9,#0x3
008d1234	add x11,x9,#0x1
008d1238	and x12,x11,#0x3ffffffffffffffc
008d123c	lsl x10,x12,#0x3
008d1240	mov x15,x12
008d1244	add x9,x27,x10
008d1248	add x10,x0,x10
008d124c	ldp q0,q1,[x14, #-0x10]
008d1250	subs x15,x15,#0x4
008d1254	add x14,x14,#0x20
008d1258	stp q0,q1,[x13, #-0x10]
008d125c	add x13,x13,#0x20
008d1260	b.ne 0x008d124c
008d1264	cmp x11,x12
008d1268	b.ne 0x008d1278
008d126c	b 0x008d1288
008d1270	mov x9,x27
008d1274	mov x10,x0
008d1278	ldr x11,[x9], #0x8
008d127c	str x11,[x10], #0x8
008d1280	cmp x10,x8
008d1284	b.cc 0x008d1278
008d1288	mov x9,x23
008d128c	mov x27,x22
008d1290	add x10,x27,#0x4
008d1294	sub w11,w27,w24
008d1298	mov x23,x8
008d129c	cmp x10,x28
008d12a0	add x12,x24,#0x4
008d12a4	strh w11,[x23], #0x2
008d12a8	b.cs 0x008d1490
008d12ac	ldr x11,[x12]
008d12b0	ldr x12,[x10]
008d12b4	cmp x11,x12
008d12b8	b.ne 0x008d1360
008d12bc	add x11,x27,#0xc
008d12c0	add x12,x24,#0xc
008d12c4	cmp x11,x28
008d12c8	b.cs 0x008d12ec
008d12cc	ldr x13,[x12]
008d12d0	ldr x14,[x11]
008d12d4	cmp x13,x14
008d12d8	b.ne 0x008d1380
008d12dc	add x11,x11,#0x8
008d12e0	add x12,x12,#0x8
008d12e4	cmp x11,x28
008d12e8	b.cc 0x008d12cc
008d12ec	ldr x13,[sp, #0x38]
008d12f0	cmp x11,x13
008d12f4	b.cs 0x008d1314
008d12f8	ldr w13,[x12]
008d12fc	ldr w14,[x11]
008d1300	cmp w13,w14
008d1304	add x13,x11,#0x4
008d1308	add x14,x12,#0x4
008d130c	csel x12,x12,x14,ne
008d1310	csel x11,x11,x13,ne
008d1314	ldr x13,[sp, #0x30]
008d1318	cmp x11,x13
008d131c	b.cs 0x008d133c
008d1320	ldrh w13,[x12]
008d1324	ldrh w14,[x11]
008d1328	cmp w13,w14
008d132c	add x13,x11,#0x2
008d1330	add x14,x12,#0x2
008d1334	csel x12,x12,x14,ne
008d1338	csel x11,x11,x13,ne
008d133c	ldr x13,[sp, #0x40]
008d1340	cmp x11,x13
008d1344	b.cs 0x008d1390
008d1348	mov x13,x11
008d134c	ldrb w12,[x12]
008d1350	ldrb w14,[x13], #0x1
008d1354	cmp w12,w14
008d1358	csel x11,x11,x13,ne
008d135c	b 0x008d1390
008d1360	eor x8,x12,x11
008d1364	rbit x8,x8
008d1368	clz x8,x8
008d136c	lsr w10,w8,#0x3
008d1370	mov w8,w10
008d1374	add x8,x27,x8
008d1378	add x27,x8,#0x4
008d137c	b 0x008d1424
008d1380	eor x12,x14,x13
008d1384	rbit x12,x12
008d1388	clz x12,x12
008d138c	add x11,x11,x12, LSR #0x3
008d1390	sub x10,x11,x10
008d1394	add x12,x27,w10, UXTW 
008d1398	subs w11,w10,#0xf
008d139c	add x27,x12,#0x4
008d13a0	b.cc 0x008d1424
008d13a4	ldrb w12,[x9]
008d13a8	cmp w11,#0x3fc
008d13ac	add w12,w12,#0xf
008d13b0	strb w12,[x9]
008d13b4	mov w9,#0xffffffff
008d13b8	str w9,[x23]
008d13bc	b.cc 0x008d1404
008d13c0	mov w9,#0x8081
008d13c4	sub w22,w10,#0x40b
008d13c8	add x23,x8,#0x6
008d13cc	movk w9,#0x8080, LSL #16
008d13d0	mov x0,x23
008d13d4	mov w1,#0xff
008d13d8	umull x9,w22,w9
008d13dc	lsr x24,x9,#0x29
008d13e0	lsl w19,w24,#0x2
008d13e4	add x2,x19,#0x4
008d13e8	bl 0x00c301c0
008d13ec	mov w8,#0x3fc
008d13f0	ldur x1,[x29, #-0x8]
008d13f4	add x23,x23,x19
008d13f8	msub w11,w24,w8,w22
008d13fc	mov w19,#0x79b1
008d1400	movk w19,#0x9e37, LSL #16
008d1404	and w8,w11,#0xffff
008d1408	mov w9,#0x8081
008d140c	mul w8,w8,w9
008d1410	lsr w8,w8,#0x17
008d1414	add x23,x23,x8
008d1418	add w8,w11,w8
008d141c	strb w8,[x23], #0x1
008d1420	b 0x008d1430
008d1424	ldrb w8,[x9]
008d1428	add w8,w8,w10
008d142c	strb w8,[x9]
008d1430	cmp x27,x20
008d1434	b.cs 0x008cffec
008d1438	mov x9,x27
008d143c	ldr w8,[x27]
008d1440	ldr w10,[x9, #-0x2]!
008d1444	mul w11,w8,w19
008d1448	sub w9,w9,w26
008d144c	mul w10,w10,w19
008d1450	lsr w11,w11,#0x13
008d1454	lsr w10,w10,#0x13
008d1458	strh w9,[x21, w10, UXTW #0x1]
008d145c	sub w10,w27,w26
008d1460	ldrh w9,[x21, w11, UXTW #0x1]
008d1464	strh w10,[x21, w11, UXTW #0x1]
008d1468	cmp w25,w9
008d146c	b.hi 0x008d10f0
008d1470	add x24,x26,x9
008d1474	ldr w9,[x24]
008d1478	cmp w9,w8
008d147c	b.ne 0x008d10f0
008d1480	mov x8,x23
008d1484	mov x9,x23
008d1488	strb wzr,[x8], #0x1
008d148c	b 0x008d1290
008d1490	mov x11,x10
008d1494	cmp x11,x28
008d1498	b.cc 0x008d12cc
008d149c	b 0x008d12ec
008d14a0	ldr x8,[sp, #0x10]
008d14a4	sub x11,x22,#0x1
008d14a8	mov x9,x11
008d14ac	add x10,x8,x12
008d14b0	mov x24,x10
008d14b4	cmp x10,x1
008d14b8	mov x22,x9
008d14bc	mov x8,x11
008d14c0	b.ls 0x008d117c
008d14c4	cmp x22,x27
008d14c8	b.ls 0x008d117c
008d14cc	mov x9,x22
008d14d0	mov x10,x24
008d14d4	ldrb w11,[x9, #-0x1]!
008d14d8	ldrb w12,[x10, #-0x1]!
008d14dc	cmp w11,w12
008d14e0	sub x11,x8,#0x1
008d14e4	b.eq 0x008d14b0
008d14e8	b 0x008d117c
008d14ec	lsl w8,w21,#0x4
008d14f0	strb w8,[x23]
008d14f4	add x20,x23,#0x1
008d14f8	mov x1,x27
008d14fc	mov x0,x20
008d1500	mov x2,x21
008d1504	bl 0x00c2ffd0
008d1508	ldur x9,[x29, #-0x10]
008d150c	add w8,w20,w21
008d1510	sub w0,w8,w9
008d1514	ldp x20,x19,[sp, #0xd0]
008d1518	ldp x22,x21,[sp, #0xc0]
008d151c	ldp x24,x23,[sp, #0xb0]
008d1520	ldp x26,x25,[sp, #0xa0]
008d1524	ldp x28,x27,[sp, #0x90]
008d1528	ldp x29,x30,[sp, #0x80]
008d152c	add sp,sp,#0xe0
008d1530	ret
008d1534	lsl w8,w21,#0x4
008d1538	ldur x24,[x29, #-0x10]
008d153c	strb w8,[x23]
008d1540	add x20,x23,#0x1
008d1544	mov x1,x22
008d1548	mov x2,x21
008d154c	mov x0,x20
008d1550	bl 0x00c2ffd0
008d1554	add w8,w20,w21
008d1558	sub w0,w8,w24
008d155c	b 0x008d1514
