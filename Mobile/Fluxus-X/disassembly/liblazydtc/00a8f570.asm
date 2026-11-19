; Camellia_EncryptBlock_Rounds @ 00a8f570
00a8f570	ldp w8,w10,[x1]
00a8f574	ldp w11,w12,[x2]
00a8f578	ldp w13,w14,[x1, #0x8]
00a8f57c	lsl w9,w0,#0x4
00a8f580	rev w8,w8
00a8f584	eor w15,w8,w11
00a8f588	ldp w11,w18,[x2, #0x8]
00a8f58c	rev w8,w10
00a8f590	rev w10,w13
00a8f594	sbfiz x9,x9,#0x2,#0x20
00a8f598	eor w17,w10,w11
00a8f59c	rev w11,w14
00a8f5a0	sub x9,x9,#0x40
00a8f5a4	eor w18,w11,w18
00a8f5a8	adrp x11,0x76b000
00a8f5ac	eor w16,w8,w12
00a8f5b0	add x8,x2,#0x28
00a8f5b4	lsr x10,x9,#0x2
00a8f5b8	add x11,x11,#0x5a0
00a8f5bc	b 0x00a8f5f0
00a8f5c0	ldp w1,w17,[x8, #0x20]
00a8f5c4	ldr w0,[x8, #0x1c]
00a8f5c8	and w14,w12,w14
00a8f5cc	eor w16,w13,w14, ROR #0x1f
00a8f5d0	orr w13,w17,w18
00a8f5d4	orr w14,w0,w16
00a8f5d8	eor w17,w13,w15
00a8f5dc	eor w15,w14,w12
00a8f5e0	and w12,w17,w1
00a8f5e4	sub x9,x9,#0x40
00a8f5e8	eor w18,w18,w12, ROR #0x1f
00a8f5ec	add x8,x8,#0x40
00a8f5f0	ldp w0,w1,[x8, #-0x18]
00a8f5f4	add x13,x11,#0x400
00a8f5f8	add x12,x11,#0xc00
00a8f5fc	add x14,x11,#0x800
00a8f600	eor w0,w0,w15
00a8f604	and w4,w0,#0xff
00a8f608	ubfx w5,w0,#0x8,#0x8
00a8f60c	ldr w4,[x13, w4, UXTW #0x2]
00a8f610	ldr w5,[x12, w5, UXTW #0x2]
00a8f614	ubfx w7,w0,#0x10,#0x8
00a8f618	ldr w7,[x14, w7, UXTW #0x2]
00a8f61c	lsr w0,w0,#0x18
00a8f620	ldr w0,[x11, w0, UXTW #0x2]
00a8f624	eor w1,w1,w16
00a8f628	and w6,w1,#0xff
00a8f62c	eor w4,w5,w4
00a8f630	ubfx w5,w1,#0x8,#0x8
00a8f634	ldr w6,[x11, w6, UXTW #0x2]
00a8f638	ldr w5,[x13, w5, UXTW #0x2]
00a8f63c	eor w4,w4,w7
00a8f640	eor w0,w4,w0
00a8f644	ubfx w4,w1,#0x10,#0x8
00a8f648	lsr w1,w1,#0x18
00a8f64c	ldr w4,[x12, w4, UXTW #0x2]
00a8f650	ldr w1,[x14, w1, UXTW #0x2]
00a8f654	eor w5,w5,w6
00a8f658	ldp w6,w7,[x8, #-0x10]
00a8f65c	eor w5,w5,w0
00a8f660	eor w18,w18,w0, ROR #0x8
00a8f664	eor w0,w5,w4
00a8f668	eor w0,w0,w1
00a8f66c	eor w17,w0,w17
00a8f670	eor w18,w18,w0
00a8f674	eor w0,w17,w6
00a8f678	and w1,w0,#0xff
00a8f67c	ubfx w4,w0,#0x8,#0x8
00a8f680	ldr w1,[x13, w1, UXTW #0x2]
00a8f684	ldr w4,[x12, w4, UXTW #0x2]
00a8f688	eor w5,w18,w7
00a8f68c	ubfx w7,w0,#0x10,#0x8
00a8f690	ldr w7,[x14, w7, UXTW #0x2]
00a8f694	lsr w0,w0,#0x18
00a8f698	ldr w0,[x11, w0, UXTW #0x2]
00a8f69c	and w6,w5,#0xff
00a8f6a0	eor w1,w4,w1
00a8f6a4	ubfx w4,w5,#0x8,#0x8
00a8f6a8	ldr w6,[x11, w6, UXTW #0x2]
00a8f6ac	ldr w4,[x13, w4, UXTW #0x2]
00a8f6b0	eor w1,w1,w7
00a8f6b4	eor w0,w1,w0
00a8f6b8	ubfx w1,w5,#0x10,#0x8
00a8f6bc	lsr w5,w5,#0x18
00a8f6c0	ldr w1,[x12, w1, UXTW #0x2]
00a8f6c4	ldr w5,[x14, w5, UXTW #0x2]
00a8f6c8	eor w4,w4,w6
00a8f6cc	ldp w6,w7,[x8, #-0x8]
00a8f6d0	eor w4,w4,w0
00a8f6d4	eor w16,w16,w0, ROR #0x8
00a8f6d8	eor w0,w4,w1
00a8f6dc	eor w0,w0,w5
00a8f6e0	eor w15,w0,w15
00a8f6e4	eor w16,w16,w0
00a8f6e8	eor w0,w15,w6
00a8f6ec	and w1,w0,#0xff
00a8f6f0	ubfx w4,w0,#0x8,#0x8
00a8f6f4	ldr w1,[x13, w1, UXTW #0x2]
00a8f6f8	ldr w4,[x12, w4, UXTW #0x2]
00a8f6fc	eor w5,w16,w7
00a8f700	ubfx w7,w0,#0x10,#0x8
00a8f704	ldr w7,[x14, w7, UXTW #0x2]
00a8f708	lsr w0,w0,#0x18
00a8f70c	ldr w0,[x11, w0, UXTW #0x2]
00a8f710	and w6,w5,#0xff
00a8f714	eor w1,w4,w1
00a8f718	ubfx w4,w5,#0x8,#0x8
00a8f71c	ldr w6,[x11, w6, UXTW #0x2]
00a8f720	ldr w4,[x13, w4, UXTW #0x2]
00a8f724	eor w1,w1,w7
00a8f728	eor w0,w1,w0
00a8f72c	ubfx w1,w5,#0x10,#0x8
00a8f730	lsr w5,w5,#0x18
00a8f734	ldr w1,[x12, w1, UXTW #0x2]
00a8f738	ldr w5,[x14, w5, UXTW #0x2]
00a8f73c	eor w4,w4,w6
00a8f740	ldp w6,w7,[x8]
00a8f744	eor w4,w4,w0
00a8f748	eor w18,w18,w0, ROR #0x8
00a8f74c	eor w0,w4,w1
00a8f750	eor w0,w0,w5
00a8f754	eor w17,w0,w17
00a8f758	eor w18,w18,w0
00a8f75c	eor w0,w17,w6
00a8f760	and w1,w0,#0xff
00a8f764	ubfx w4,w0,#0x8,#0x8
00a8f768	ldr w1,[x13, w1, UXTW #0x2]
00a8f76c	ldr w4,[x12, w4, UXTW #0x2]
00a8f770	eor w5,w18,w7
00a8f774	ubfx w7,w0,#0x10,#0x8
00a8f778	ldr w7,[x14, w7, UXTW #0x2]
00a8f77c	lsr w0,w0,#0x18
00a8f780	ldr w0,[x11, w0, UXTW #0x2]
00a8f784	and w6,w5,#0xff
00a8f788	eor w1,w4,w1
00a8f78c	ubfx w4,w5,#0x8,#0x8
00a8f790	ldr w6,[x11, w6, UXTW #0x2]
00a8f794	ldr w4,[x13, w4, UXTW #0x2]
00a8f798	eor w1,w1,w7
00a8f79c	eor w0,w1,w0
00a8f7a0	ubfx w1,w5,#0x10,#0x8
00a8f7a4	lsr w5,w5,#0x18
00a8f7a8	ldr w1,[x12, w1, UXTW #0x2]
00a8f7ac	ldr w5,[x14, w5, UXTW #0x2]
00a8f7b0	eor w4,w4,w6
00a8f7b4	ldp w6,w7,[x8, #0x8]
00a8f7b8	eor w4,w4,w0
00a8f7bc	eor w16,w16,w0, ROR #0x8
00a8f7c0	eor w0,w4,w1
00a8f7c4	eor w0,w0,w5
00a8f7c8	eor w1,w0,w15
00a8f7cc	eor w15,w1,w6
00a8f7d0	eor w16,w16,w0
00a8f7d4	and w0,w15,#0xff
00a8f7d8	ubfx w4,w15,#0x8,#0x8
00a8f7dc	ldr w0,[x13, w0, UXTW #0x2]
00a8f7e0	ldr w4,[x12, w4, UXTW #0x2]
00a8f7e4	eor w5,w16,w7
00a8f7e8	ubfx w7,w15,#0x10,#0x8
00a8f7ec	ldr w7,[x14, w7, UXTW #0x2]
00a8f7f0	lsr w15,w15,#0x18
00a8f7f4	ldr w15,[x11, w15, UXTW #0x2]
00a8f7f8	and w6,w5,#0xff
00a8f7fc	eor w0,w4,w0
00a8f800	ubfx w4,w5,#0x8,#0x8
00a8f804	ldr w6,[x11, w6, UXTW #0x2]
00a8f808	ldr w4,[x13, w4, UXTW #0x2]
00a8f80c	eor w0,w0,w7
00a8f810	eor w15,w0,w15
00a8f814	ubfx w0,w5,#0x10,#0x8
00a8f818	lsr w5,w5,#0x18
00a8f81c	ldr w0,[x12, w0, UXTW #0x2]
00a8f820	ldr w5,[x14, w5, UXTW #0x2]
00a8f824	eor w4,w4,w6
00a8f828	ldp w6,w7,[x8, #0x10]
00a8f82c	eor w4,w4,w15
00a8f830	eor w18,w18,w15, ROR #0x8
00a8f834	eor w15,w4,w0
00a8f838	eor w0,w15,w5
00a8f83c	eor w15,w0,w17
00a8f840	eor w18,w18,w0
00a8f844	eor w17,w15,w6
00a8f848	eor w0,w18,w7
00a8f84c	and w4,w17,#0xff
00a8f850	ubfx w7,w0,#0x8,#0x8
00a8f854	ubfx w5,w17,#0x8,#0x8
00a8f858	ldr w4,[x13, w4, UXTW #0x2]
00a8f85c	ldr w13,[x13, w7, UXTW #0x2]
00a8f860	ubfx w7,w0,#0x10,#0x8
00a8f864	ubfx w6,w17,#0x10,#0x8
00a8f868	ldr w5,[x12, w5, UXTW #0x2]
00a8f86c	ldr w12,[x12, w7, UXTW #0x2]
00a8f870	lsr w7,w0,#0x18
00a8f874	ldr w6,[x14, w6, UXTW #0x2]
00a8f878	ldr w7,[x14, w7, UXTW #0x2]
00a8f87c	and w14,w0,#0xff
00a8f880	lsr w17,w17,#0x18
00a8f884	ldr w0,[x11, w14, UXTW #0x2]
00a8f888	ldr w17,[x11, w17, UXTW #0x2]
00a8f88c	eor w4,w5,w4
00a8f890	ldr w14,[x8, #0x18]
00a8f894	eor w13,w13,w0
00a8f898	eor w0,w4,w6
00a8f89c	eor w17,w0,w17
00a8f8a0	eor w13,w13,w17
00a8f8a4	eor w12,w13,w12
00a8f8a8	eor w16,w16,w17, ROR #0x8
00a8f8ac	eor w13,w12,w7
00a8f8b0	eor w12,w13,w1
00a8f8b4	eor w13,w16,w13
00a8f8b8	cbnz x9,0x00a8f5c0
00a8f8bc	add x8,x2,x10, LSL #0x2
00a8f8c0	ldp w10,w11,[x8, #0x44]
00a8f8c4	eor w9,w14,w15
00a8f8c8	ldr w8,[x8, #0x4c]
00a8f8cc	lsr w14,w9,#0x18
00a8f8d0	strb w14,[x3]
00a8f8d4	lsr w14,w9,#0x10
00a8f8d8	strb w9,[x3, #0x3]
00a8f8dc	lsr w9,w9,#0x8
00a8f8e0	strb w9,[x3, #0x2]
00a8f8e4	eor w9,w10,w18
00a8f8e8	eor w10,w11,w12
00a8f8ec	eor w8,w8,w13
00a8f8f0	lsr w11,w9,#0x18
00a8f8f4	lsr w12,w9,#0x10
00a8f8f8	lsr w13,w9,#0x8
00a8f8fc	strb w14,[x3, #0x1]
00a8f900	strb w9,[x3, #0x7]
00a8f904	lsr w9,w10,#0x18
00a8f908	lsr w14,w10,#0x10
00a8f90c	strb w10,[x3, #0xb]
00a8f910	lsr w10,w10,#0x8
00a8f914	strb w11,[x3, #0x4]
00a8f918	lsr w11,w8,#0x18
00a8f91c	strb w12,[x3, #0x5]
00a8f920	lsr w12,w8,#0x10
00a8f924	strb w13,[x3, #0x6]
00a8f928	lsr w13,w8,#0x8
00a8f92c	strb w9,[x3, #0x8]
00a8f930	strb w14,[x3, #0x9]
00a8f934	strb w10,[x3, #0xa]
00a8f938	strb w11,[x3, #0xc]
00a8f93c	strb w12,[x3, #0xd]
00a8f940	strb w13,[x3, #0xe]
00a8f944	strb w8,[x3, #0xf]
00a8f948	ret
