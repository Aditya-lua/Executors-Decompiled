; FUN_00a3f5ac @ 00a3f5ac
00a3f5ac	sub sp,sp,#0x80
00a3f5b0	stp x28,x27,[sp, #0x20]
00a3f5b4	stp x26,x25,[sp, #0x30]
00a3f5b8	stp x24,x23,[sp, #0x40]
00a3f5bc	stp x22,x21,[sp, #0x50]
00a3f5c0	stp x20,x19,[sp, #0x60]
00a3f5c4	stp x29,x30,[sp, #0x70]
00a3f5c8	ldrb w15,[x0]
00a3f5cc	ldrb w30,[x0, #0x1]
00a3f5d0	ldrb w6,[x0, #0x2]
00a3f5d4	ldrb w22,[x0, #0x3]
00a3f5d8	ldrb w8,[x0, #0x10]
00a3f5dc	ldrb w17,[x0, #0x4]
00a3f5e0	ldrb w14,[x0, #0x12]
00a3f5e4	ldrb w21,[x0, #0x15]
00a3f5e8	ldrb w26,[x0, #0x16]
00a3f5ec	ldrb w16,[x0, #0x17]
00a3f5f0	ldrb w28,[x0, #0x18]
00a3f5f4	ldrb w25,[x0, #0x2c]
00a3f5f8	bfm x15,x30,#0x38,#0x7
00a3f5fc	lsl w30,w6,#0x10
00a3f600	bfm w6,w22,#0x18,#0x7
00a3f604	ldrb w22,[x0, #0x2d]
00a3f608	str w8,[sp, #0x1c]
00a3f60c	ldrb w8,[x0, #0x13]
00a3f610	ldrb w23,[x0, #0x27]
00a3f614	ldrb w27,[x0, #0x2a]
00a3f618	ldrb w19,[x0, #0x2b]
00a3f61c	bfm x21,x26,#0x38,#0x7
00a3f620	lsl w26,w16,#0x10
00a3f624	bfm w16,w28,#0x18,#0x7
00a3f628	ldrb w9,[x0, #0x2e]
00a3f62c	lsl w28,w25,#0x10
00a3f630	bfm w25,w22,#0x18,#0x7
00a3f634	ldrb w22,[x0, #0x3c]
00a3f638	bfm w6,w17,#0x10,#0x7
00a3f63c	and x17,x14,#0xf8
00a3f640	ldrb w29,[x0, #0x28]
00a3f644	bfm x17,x8,#0x38,#0x7
00a3f648	ldrb w8,[x0, #0x3d]
00a3f64c	ldrb w24,[x0, #0x19]
00a3f650	ldrb w20,[x0, #0x14]
00a3f654	bfm x27,x19,#0x38,#0x7
00a3f658	and x19,x23,#0xf8
00a3f65c	bfm w25,w9,#0x10,#0x7
00a3f660	and x9,x22,#0xf8
00a3f664	ldrb w10,[x0, #0x5]
00a3f668	str x23,[sp, #0x8]
00a3f66c	bfm x19,x29,#0x38,#0x7
00a3f670	ldrb w23,[x0, #0x1a]
00a3f674	bfm x9,x8,#0x38,#0x7
00a3f678	ldrb w29,[x0, #0x1b]
00a3f67c	and x8,x30,#0x1f0000
00a3f680	bfm w16,w24,#0x10,#0x7
00a3f684	orr x8,x15,x8
00a3f688	ldrb w24,[x0, #0x1c]
00a3f68c	ldrb w15,[x0, #0x1d]
00a3f690	bfm x17,x20,#0x30,#0x7
00a3f694	and x20,x26,#0x1f0000
00a3f698	ldrb w18,[x0, #0x6]
00a3f69c	str x8,[sp, #0x10]
00a3f6a0	orr x8,x21,x20
00a3f6a4	ldrb w20,[x0, #0x29]
00a3f6a8	and x21,x28,#0x1f0000
00a3f6ac	ldrb w5,[x0, #0x7]
00a3f6b0	ldrb w2,[x0, #0x8]
00a3f6b4	mov x30,x10
00a3f6b8	bfm w16,w23,#0x8,#0x7
00a3f6bc	bfm w23,w29,#0x18,#0x7
00a3f6c0	orr x10,x27,x21
00a3f6c4	ldrb w21,[x0, #0x3e]
00a3f6c8	bfm w23,w24,#0x10,#0x7
00a3f6cc	bfm w24,w15,#0x18,#0x7
00a3f6d0	ldrb w15,[x0, #0x3f]
00a3f6d4	bfm w6,w30,#0x8,#0x7
00a3f6d8	bfm w30,w18,#0x18,#0x7
00a3f6dc	ldrb w29,[x0, #0x2f]
00a3f6e0	bfm x19,x20,#0x30,#0x7
00a3f6e4	ldrb w20,[x0, #0x30]
00a3f6e8	bfm x9,x21,#0x30,#0x7
00a3f6ec	ldrb w21,[x0, #0x31]
00a3f6f0	bfm w30,w5,#0x10,#0x7
00a3f6f4	bfm w5,w2,#0x18,#0x7
00a3f6f8	ldrb w2,[x0, #0x32]
00a3f6fc	bfm x9,x15,#0x28,#0x7
00a3f700	ldrb w15,[x0, #0x33]
00a3f704	ldrb w1,[x0, #0x9]
00a3f708	bfm w25,w29,#0x8,#0x7
00a3f70c	bfm w29,w20,#0x18,#0x7
00a3f710	bfm w29,w21,#0x10,#0x7
00a3f714	bfm w21,w2,#0x18,#0x7
00a3f718	ldrb w18,[x0, #0x1e]
00a3f71c	bfm w21,w15,#0x10,#0x7
00a3f720	ldrb w28,[x0, #0x34]
00a3f724	ldrb w15,[x0, #0x35]
00a3f728	ldrb w20,[x0, #0x1f]
00a3f72c	ldrb w2,[x0, #0x20]
00a3f730	bfm w5,w1,#0x10,#0x7
00a3f734	ldrb w1,[x0, #0x21]
00a3f738	ldrb w12,[x0, #0xa]
00a3f73c	ldrb w4,[x0, #0xb]
00a3f740	ldrb w3,[x0, #0xc]
00a3f744	bfm w24,w18,#0x10,#0x7
00a3f748	bfm w21,w28,#0x8,#0x7
00a3f74c	bfm w28,w15,#0x18,#0x7
00a3f750	mov w15,#0x2d18
00a3f754	ldrb w7,[x0, #0xd]
00a3f758	ldrb w11,[x0, #0xe]
00a3f75c	bfm w24,w20,#0x8,#0x7
00a3f760	bfm w20,w2,#0x18,#0x7
00a3f764	movk w15,#0x7, LSL #16
00a3f768	ubfx x27,x29,#0x2,#0x15
00a3f76c	ldrb w2,[x0, #0x36]
00a3f770	bfm w20,w1,#0x10,#0x7
00a3f774	mul x1,x27,x15
00a3f778	str x8,[sp]
00a3f77c	bfm w5,w12,#0x8,#0x7
00a3f780	bfm w12,w4,#0x18,#0x7
00a3f784	add x29,x1,x17, LSR #0x3
00a3f788	ldrb w8,[x0, #0x37]
00a3f78c	ldrb w17,[x0, #0x38]
00a3f790	ldrb w26,[x0, #0x22]
00a3f794	ldrb w18,[x0, #0x23]
00a3f798	bfm w12,w3,#0x10,#0x7
00a3f79c	ldrb w13,[x0, #0xf]
00a3f7a0	bfm w12,w7,#0x8,#0x7
00a3f7a4	bfm w7,w11,#0x18,#0x7
00a3f7a8	ldr w11,[sp, #0x1c]
00a3f7ac	bfm w28,w2,#0x10,#0x7
00a3f7b0	bfm w28,w8,#0x8,#0x7
00a3f7b4	bfm w8,w17,#0x18,#0x7
00a3f7b8	mov x17,#-0x6f7d
00a3f7bc	ldrb w4,[x0, #0x24]
00a3f7c0	bfm w20,w26,#0x8,#0x7
00a3f7c4	bfm w26,w18,#0x18,#0x7
00a3f7c8	ldrb w18,[x0, #0x25]
00a3f7cc	ldrb w1,[x0, #0x39]
00a3f7d0	ldrb w2,[x0, #0x3a]
00a3f7d4	movk x17,#0xfff5, LSL #16
00a3f7d8	lsr x9,x9,#0x3
00a3f7dc	bfm w7,w13,#0x10,#0x7
00a3f7e0	bfm w13,w11,#0x18,#0x7
00a3f7e4	madd x11,x9,x17,x10
00a3f7e8	ldrb w10,[x0, #0x3b]
00a3f7ec	bfm w26,w4,#0x10,#0x7
00a3f7f0	bfm w4,w18,#0x18,#0x7
00a3f7f4	ubfx x18,x25,#0x5,#0x15
00a3f7f8	bfm w8,w1,#0x10,#0x7
00a3f7fc	bfm w1,w2,#0x18,#0x7
00a3f800	ldrb w25,[x0, #0x26]
00a3f804	add x2,x11,#0x100, LSL #12
00a3f808	bfm w1,w10,#0x10,#0x7
00a3f80c	ldr x10,[sp, #0x8]
00a3f810	add x3,x18,x2, ASR #0x15
00a3f814	and x18,x2,#-0x200000
00a3f818	ldrb w2,[x0, #0x11]
00a3f81c	bfm w4,w25,#0x10,#0x7
00a3f820	bfm w4,w10,#0x8,#0x7
00a3f824	ubfx x10,x16,#0x5,#0x15
00a3f828	ubfx x16,x23,#0x2,#0x15
00a3f82c	ldr x23,[sp]
00a3f830	bfm w13,w2,#0x10,#0x7
00a3f834	sub x11,x11,x18
00a3f838	bfm w13,w14,#0x8,#0x7
00a3f83c	mov w14,#0xfb67
00a3f840	mov x18,#-0x39ad
00a3f844	bfm w1,w22,#0x8,#0x7
00a3f848	mov w22,#0x15d1
00a3f84c	movk w14,#0x9, LSL #16
00a3f850	movk x18,#0xfff0, LSL #16
00a3f854	movk w22,#0x2, LSL #16
00a3f858	ubfx x24,x24,#0x7,#0x15
00a3f85c	mov w2,#0x2c13
00a3f860	madd x23,x27,x14,x23
00a3f864	madd x16,x27,x22,x16
00a3f868	madd x10,x27,x18,x10
00a3f86c	ubfx x21,x21,#0x7,#0x15
00a3f870	madd x24,x27,x17,x24
00a3f874	ubfx x20,x20,#0x4,#0x15
00a3f878	movk w2,#0xa, LSL #16
00a3f87c	madd x23,x21,x15,x23
00a3f880	madd x16,x21,x18,x16
00a3f884	madd x10,x21,x14,x10
00a3f888	ubfx x25,x28,#0x4,#0x15
00a3f88c	madd x24,x21,x22,x24
00a3f890	ubfx x26,x26,#0x1,#0x15
00a3f894	madd x20,x21,x17,x20
00a3f898	madd x23,x25,x2,x23
00a3f89c	madd x16,x25,x14,x16
00a3f8a0	madd x10,x25,x15,x10
00a3f8a4	madd x24,x25,x18,x24
00a3f8a8	madd x20,x25,x22,x20
00a3f8ac	madd x25,x25,x17,x26
00a3f8b0	ubfx x8,x8,#0x1,#0x15
00a3f8b4	ubfx x4,x4,#0x6,#0x15
00a3f8b8	madd x16,x8,x15,x16
00a3f8bc	madd x10,x8,x2,x10
00a3f8c0	madd x24,x8,x14,x24
00a3f8c4	madd x20,x8,x18,x20
00a3f8c8	madd x25,x8,x22,x25
00a3f8cc	madd x8,x8,x17,x4
00a3f8d0	add x4,x23,#0x100, LSL #12
00a3f8d4	ubfx x1,x1,#0x6,#0x15
00a3f8d8	add x10,x10,x4, LSR #0x15
00a3f8dc	madd x20,x1,x14,x20
00a3f8e0	madd x16,x1,x2,x16
00a3f8e4	madd x24,x1,x15,x24
00a3f8e8	madd x25,x1,x18,x25
00a3f8ec	madd x8,x1,x22,x8
00a3f8f0	mul x1,x1,x17
00a3f8f4	ubfx x13,x13,#0x6,#0x15
00a3f8f8	add x1,x1,x19, LSR #0x3
00a3f8fc	add x19,x10,#0x100, LSL #12
00a3f900	madd x13,x27,x2,x13
00a3f904	madd x20,x9,x15,x20
00a3f908	madd x24,x9,x2,x24
00a3f90c	madd x25,x9,x14,x25
00a3f910	madd x8,x9,x18,x8
00a3f914	madd x9,x9,x22,x1
00a3f918	and x1,x19,#-0x200000
00a3f91c	sub x10,x10,x1
00a3f920	add x1,x13,#0x100, LSL #12
00a3f924	add x26,x29,x1, LSR #0x15
00a3f928	and x1,x1,#0x7ffffe00000
00a3f92c	sub x13,x13,x1
00a3f930	add x1,x16,x19, ASR #0x15
00a3f934	add x16,x16,#0x100, LSL #12
00a3f938	add x19,x24,x16, ASR #0x15
00a3f93c	and x16,x16,#-0x200000
00a3f940	sub x16,x1,x16
00a3f944	add x1,x20,#0x100, LSL #12
00a3f948	add x24,x25,x1, ASR #0x15
00a3f94c	and x1,x1,#-0x200000
00a3f950	sub x1,x20,x1
00a3f954	add x20,x8,#0x100, LSL #12
00a3f958	add x9,x9,x20, ASR #0x15
00a3f95c	and x20,x20,#-0x200000
00a3f960	sub x8,x8,x20
00a3f964	add x20,x19,#0x100, LSL #12
00a3f968	madd x21,x21,x2,x26
00a3f96c	add x1,x1,x20, ASR #0x15
00a3f970	and x20,x20,#-0x200000
00a3f974	sub x19,x19,x20
00a3f978	add x20,x21,#0x100, LSL #12
00a3f97c	add x23,x23,x20, LSR #0x15
00a3f980	and x20,x20,#-0x200000
00a3f984	and x4,x4,#-0x200000
00a3f988	sub x20,x21,x20
00a3f98c	sub x4,x23,x4
00a3f990	ubfx x7,x7,#0x1,#0x15
00a3f994	madd x16,x3,x17,x16
00a3f998	add x23,x9,#0x100, LSL #12
00a3f99c	madd x7,x3,x2,x7
00a3f9a0	madd x10,x3,x22,x10
00a3f9a4	madd x13,x3,x15,x13
00a3f9a8	madd x20,x3,x14,x20
00a3f9ac	madd x3,x3,x18,x4
00a3f9b0	add x4,x16,#0x100, LSL #12
00a3f9b4	add x11,x11,x23, ASR #0x15
00a3f9b8	add x19,x19,x4, ASR #0x15
00a3f9bc	and x4,x4,#-0x200000
00a3f9c0	sub x16,x16,x4
00a3f9c4	madd x4,x11,x15,x7
00a3f9c8	madd x7,x11,x18,x20
00a3f9cc	ldr x20,[sp, #0x10]
00a3f9d0	add x21,x24,#0x100, LSL #12
00a3f9d4	ubfx x12,x12,#0x4,#0x15
00a3f9d8	add x8,x8,x21, ASR #0x15
00a3f9dc	and x21,x21,#-0x200000
00a3f9e0	and x23,x23,#-0x200000
00a3f9e4	madd x12,x11,x2,x12
00a3f9e8	madd x13,x11,x14,x13
00a3f9ec	madd x10,x11,x17,x10
00a3f9f0	madd x11,x11,x22,x3
00a3f9f4	ubfx x3,x6,#0x5,#0x15
00a3f9f8	sub x21,x24,x21
00a3f9fc	sub x9,x9,x23
00a3fa00	ubfx x5,x5,#0x7,#0x15
00a3fa04	madd x20,x1,x2,x20
00a3fa08	madd x3,x1,x15,x3
00a3fa0c	ubfx x6,x30,#0x2,#0x15
00a3fa10	madd x5,x9,x2,x5
00a3fa14	madd x12,x9,x15,x12
00a3fa18	madd x4,x9,x14,x4
00a3fa1c	madd x13,x9,x18,x13
00a3fa20	madd x7,x9,x22,x7
00a3fa24	madd x9,x9,x17,x11
00a3fa28	add x11,x20,#0x100, LSL #12
00a3fa2c	madd x3,x21,x2,x3
00a3fa30	madd x6,x1,x14,x6
00a3fa34	add x3,x3,x11, ASR #0x15
00a3fa38	and x11,x11,#-0x200000
00a3fa3c	madd x6,x8,x2,x6
00a3fa40	sub x11,x20,x11
00a3fa44	add x20,x19,#0x100, LSL #12
00a3fa48	madd x12,x1,x22,x12
00a3fa4c	madd x5,x1,x18,x5
00a3fa50	madd x1,x1,x17,x4
00a3fa54	madd x6,x21,x15,x6
00a3fa58	asr x4,x20,#0x15
00a3fa5c	and x20,x20,#-0x200000
00a3fa60	madd x13,x8,x22,x13
00a3fa64	madd x7,x8,x17,x7
00a3fa68	madd x12,x8,x14,x12
00a3fa6c	madd x5,x8,x15,x5
00a3fa70	madd x8,x8,x18,x1
00a3fa74	add x1,x3,#0x100, LSL #12
00a3fa78	sub x19,x19,x20
00a3fa7c	add x20,x6,#0x100, LSL #12
00a3fa80	madd x3,x4,x15,x3
00a3fa84	madd x13,x21,x17,x13
00a3fa88	madd x12,x21,x18,x12
00a3fa8c	madd x5,x21,x14,x5
00a3fa90	madd x8,x21,x22,x8
00a3fa94	and x21,x1,#-0x200000
00a3fa98	sub x3,x3,x21
00a3fa9c	and x21,x20,#-0x200000
00a3faa0	add x5,x5,x20, ASR #0x15
00a3faa4	add x20,x9,#0x100, LSL #12
00a3faa8	madd x6,x4,x14,x6
00a3faac	add x10,x10,x20, ASR #0x15
00a3fab0	and x20,x20,#-0x200000
00a3fab4	sub x6,x6,x21
00a3fab8	sub x9,x9,x20
00a3fabc	add x20,x13,#0x100, LSL #12
00a3fac0	add x1,x6,x1, ASR #0x15
00a3fac4	add x6,x12,#0x100, LSL #12
00a3fac8	add x7,x7,x20, ASR #0x15
00a3facc	and x20,x20,#-0x200000
00a3fad0	sub x13,x13,x20
00a3fad4	add x20,x10,#0x100, LSL #12
00a3fad8	madd x12,x4,x22,x12
00a3fadc	add x8,x8,x6, ASR #0x15
00a3fae0	and x6,x6,#-0x200000
00a3fae4	add x16,x16,x20, ASR #0x15
00a3fae8	and x20,x20,#-0x200000
00a3faec	sub x12,x12,x6
00a3faf0	add x6,x7,#0x100, LSL #12
00a3faf4	sub x20,x10,x20
00a3faf8	add x10,x5,#0x100, LSL #12
00a3fafc	add x9,x9,x6, ASR #0x15
00a3fb00	and x6,x6,#-0x200000
00a3fb04	madd x11,x4,x2,x11
00a3fb08	madd x5,x4,x18,x5
00a3fb0c	sub x6,x7,x6
00a3fb10	and x7,x10,#-0x200000
00a3fb14	add x3,x3,x11, ASR #0x15
00a3fb18	sub x5,x5,x7
00a3fb1c	and x7,x11,#0x1fffff
00a3fb20	add x1,x1,x3, ASR #0x15
00a3fb24	madd x11,x4,x17,x8
00a3fb28	add x8,x8,#0x100, LSL #12
00a3fb2c	add x10,x12,x10, ASR #0x15
00a3fb30	add x12,x13,x8, ASR #0x15
00a3fb34	and x8,x8,#-0x200000
00a3fb38	add x4,x5,x1, ASR #0x15
00a3fb3c	sub x8,x11,x8
00a3fb40	add x5,x10,x4, ASR #0x15
00a3fb44	add x21,x8,x5, ASR #0x15
00a3fb48	add x13,x12,x21, ASR #0x15
00a3fb4c	add x12,x6,x13, ASR #0x15
00a3fb50	add x10,x9,x12, ASR #0x15
00a3fb54	add x11,x20,x10, ASR #0x15
00a3fb58	add x9,x16,x11, ASR #0x15
00a3fb5c	add x8,x19,x9, ASR #0x15
00a3fb60	asr x16,x8,#0x15
00a3fb64	and x1,x1,#0x1fffff
00a3fb68	and x3,x3,#0x1fffff
00a3fb6c	madd x14,x16,x14,x1
00a3fb70	and x1,x4,#0x1fffff
00a3fb74	madd x2,x16,x2,x7
00a3fb78	madd x15,x16,x15,x3
00a3fb7c	madd x18,x16,x18,x1
00a3fb80	and x1,x5,#0x1fffff
00a3fb84	and x3,x21,#0x1fffff
00a3fb88	madd x1,x16,x22,x1
00a3fb8c	madd x16,x16,x17,x3
00a3fb90	add x15,x15,x2, ASR #0x15
00a3fb94	lsr x17,x2,#0x8
00a3fb98	strb w2,[x0]
00a3fb9c	ubfx w2,w2,#0x10,#0x5
00a3fba0	strb w17,[x0, #0x1]
00a3fba4	and w17,w15,#0x1fffff
00a3fba8	bfm w2,w17,#0x1b,#0x14
00a3fbac	lsr x17,x15,#0x3
00a3fbb0	strb w17,[x0, #0x3]
00a3fbb4	lsr x17,x15,#0xb
00a3fbb8	add x14,x14,x15, ASR #0x15
00a3fbbc	strb w17,[x0, #0x4]
00a3fbc0	ubfx w15,w15,#0x13,#0x2
00a3fbc4	and w17,w14,#0x1fffff
00a3fbc8	bfm w15,w17,#0x1e,#0x14
00a3fbcc	lsr x17,x14,#0x6
00a3fbd0	strb w17,[x0, #0x6]
00a3fbd4	add x17,x18,x14, ASR #0x15
00a3fbd8	ubfx w14,w14,#0xe,#0x7
00a3fbdc	strb w15,[x0, #0x5]
00a3fbe0	and w15,w17,#0x1fffff
00a3fbe4	bfm w14,w15,#0x19,#0x14
00a3fbe8	lsr x15,x17,#0x1
00a3fbec	strb w15,[x0, #0x8]
00a3fbf0	lsr x15,x17,#0x9
00a3fbf4	strb w15,[x0, #0x9]
00a3fbf8	add x15,x1,x17, ASR #0x15
00a3fbfc	ubfx w17,w17,#0x11,#0x4
00a3fc00	strb w14,[x0, #0x7]
00a3fc04	and w14,w15,#0x1fffff
00a3fc08	bfm w17,w14,#0x1c,#0x14
00a3fc0c	lsr x14,x15,#0x4
00a3fc10	strb w14,[x0, #0xb]
00a3fc14	lsr x14,x15,#0xc
00a3fc18	strb w14,[x0, #0xc]
00a3fc1c	add x14,x16,x15, ASR #0x15
00a3fc20	ubfx w15,w15,#0x14,#0x1
00a3fc24	and w16,w14,#0x1fffff
00a3fc28	and x13,x13,#0x1fffff
00a3fc2c	bfm w15,w16,#0x1f,#0x14
00a3fc30	add x13,x13,x14, ASR #0x15
00a3fc34	lsr x16,x14,#0x7
00a3fc38	ubfx w14,w14,#0xf,#0x6
00a3fc3c	strb w15,[x0, #0xd]
00a3fc40	and w15,w13,#0x1fffff
00a3fc44	bfm w14,w15,#0x1a,#0x14
00a3fc48	lsr x15,x13,#0x2
00a3fc4c	and x12,x12,#0x1fffff
00a3fc50	strb w15,[x0, #0x10]
00a3fc54	lsr x15,x13,#0xa
00a3fc58	add x12,x12,x13, ASR #0x15
00a3fc5c	ubfx w13,w13,#0x12,#0x3
00a3fc60	bfm w13,w12,#0x1d,#0x1c
00a3fc64	and x10,x10,#0x1fffff
00a3fc68	strb w13,[x0, #0x12]
00a3fc6c	lsr x13,x12,#0x5
00a3fc70	and x11,x11,#0x1fffff
00a3fc74	add x10,x10,x12, ASR #0x15
00a3fc78	lsr x12,x12,#0xd
00a3fc7c	add x11,x11,x10, ASR #0x15
00a3fc80	strb w12,[x0, #0x14]
00a3fc84	lsr x12,x10,#0x8
00a3fc88	strb w10,[x0, #0x15]
00a3fc8c	ubfx w10,w10,#0x10,#0x5
00a3fc90	strb w12,[x0, #0x16]
00a3fc94	and w12,w11,#0x1fffff
00a3fc98	and x9,x9,#0x1fffff
00a3fc9c	bfm w10,w12,#0x1b,#0x14
00a3fca0	lsr x12,x11,#0x3
00a3fca4	add x9,x9,x11, ASR #0x15
00a3fca8	strb w12,[x0, #0x18]
00a3fcac	lsr x12,x11,#0xb
00a3fcb0	ubfx w11,w11,#0x13,#0x2
00a3fcb4	strb w10,[x0, #0x17]
00a3fcb8	and w10,w9,#0x1fffff
00a3fcbc	and x8,x8,#0x1fffff
00a3fcc0	bfm w11,w10,#0x1e,#0x14
00a3fcc4	lsr x10,x9,#0x6
00a3fcc8	add x8,x8,x9, ASR #0x15
00a3fccc	ubfx w9,w9,#0xe,#0x7
00a3fcd0	bfm w9,w8,#0x19,#0x18
00a3fcd4	strb w9,[x0, #0x1c]
00a3fcd8	lsr x9,x8,#0x1
00a3fcdc	strb w9,[x0, #0x1d]
00a3fce0	lsr x9,x8,#0x9
00a3fce4	lsr x8,x8,#0x11
00a3fce8	strb w2,[x0, #0x2]
00a3fcec	strb w17,[x0, #0xa]
00a3fcf0	strb w16,[x0, #0xe]
00a3fcf4	strb w15,[x0, #0x11]
00a3fcf8	strb w14,[x0, #0xf]
00a3fcfc	strb w13,[x0, #0x13]
00a3fd00	strb w12,[x0, #0x19]
00a3fd04	strb w10,[x0, #0x1b]
00a3fd08	strb w11,[x0, #0x1a]
00a3fd0c	strb w9,[x0, #0x1e]
00a3fd10	strb w8,[x0, #0x1f]
00a3fd14	ldp x29,x30,[sp, #0x70]
00a3fd18	ldp x20,x19,[sp, #0x60]
00a3fd1c	ldp x22,x21,[sp, #0x50]
00a3fd20	ldp x24,x23,[sp, #0x40]
00a3fd24	ldp x26,x25,[sp, #0x30]
00a3fd28	ldp x28,x27,[sp, #0x20]
00a3fd2c	add sp,sp,#0x80
00a3fd30	ret
