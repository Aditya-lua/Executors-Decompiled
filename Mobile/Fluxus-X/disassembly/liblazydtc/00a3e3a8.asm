; ossl_ed25519_sign @ 00a3e3a8
00a3e3a8	stp x28,x27,[sp, #-0x60]!
00a3e3ac	stp x26,x25,[sp, #0x10]
00a3e3b0	stp x24,x23,[sp, #0x20]
00a3e3b4	stp x22,x21,[sp, #0x30]
00a3e3b8	stp x20,x19,[sp, #0x40]
00a3e3bc	stp x29,x30,[sp, #0x50]
00a3e3c0	add x29,sp,#0x50
00a3e3c4	sub sp,sp,#0x310
00a3e3c8	mov x23,x1
00a3e3cc	adrp x1,0x2b7000
00a3e3d0	mov x22,x2
00a3e3d4	mov x21,x0
00a3e3d8	add x1,x1,#0x998
00a3e3dc	mov x0,x5
00a3e3e0	mov x2,x6
00a3e3e4	mov x26,x4
00a3e3e8	mov x24,x3
00a3e3ec	bl 0x00c357f0
00a3e3f0	mov x19,x0
00a3e3f4	bl 0x00c31fa0
00a3e3f8	mov x20,x0
00a3e3fc	mov w25,wzr
00a3e400	cbz x19,0x00a3f560
00a3e404	cbz x20,0x00a3f560
00a3e408	mov x0,x20
00a3e40c	mov x1,x19
00a3e410	mov x2,xzr
00a3e414	bl 0x00c31f70
00a3e418	cbz w0,0x00a3f55c
00a3e41c	mov w2,#0x20
00a3e420	mov x0,x20
00a3e424	mov x1,x26
00a3e428	bl 0x00c31f80
00a3e42c	cbz w0,0x00a3f55c
00a3e430	add x1,sp,#0x258
00a3e434	add x2,sp,#0x134
00a3e438	mov x0,x20
00a3e43c	bl 0x00c31f60
00a3e440	cbz w0,0x00a3f55c
00a3e444	ldrb w8,[sp, #0x258]
00a3e448	mov w9,#0x40
00a3e44c	mov x0,x20
00a3e450	mov x1,x19
00a3e454	and w8,w8,#0xf8
00a3e458	strb w8,[sp, #0x258]
00a3e45c	ldrb w8,[sp, #0x277]
00a3e460	mov x2,xzr
00a3e464	bfxil w9,w8,#0x0,#0x6
00a3e468	strb w9,[sp, #0x277]
00a3e46c	bl 0x00c31f70
00a3e470	cbz w0,0x00a3f55c
00a3e474	add x8,sp,#0x258
00a3e478	add x1,x8,#0x20
00a3e47c	mov w2,#0x20
00a3e480	mov x0,x20
00a3e484	bl 0x00c31f80
00a3e488	cbz w0,0x00a3f55c
00a3e48c	mov x0,x20
00a3e490	mov x1,x23
00a3e494	mov x2,x22
00a3e498	bl 0x00c31f80
00a3e49c	cbz w0,0x00a3f55c
00a3e4a0	add x1,sp,#0x218
00a3e4a4	add x2,sp,#0x134
00a3e4a8	mov x0,x20
00a3e4ac	bl 0x00c31f60
00a3e4b0	cbz w0,0x00a3f55c
00a3e4b4	add x0,sp,#0x218
00a3e4b8	bl 0x00a3f5ac
00a3e4bc	add x0,sp,#0x178
00a3e4c0	add x1,sp,#0x218
00a3e4c4	add x25,sp,#0x178
00a3e4c8	bl 0x00a3fd34
00a3e4cc	add x1,x25,#0x50
00a3e4d0	add x0,sp,#0x138
00a3e4d4	bl 0x00a44a70
00a3e4d8	sub x0,x29,#0xa0
00a3e4dc	add x1,sp,#0x178
00a3e4e0	add x2,sp,#0x138
00a3e4e4	bl 0x00a44e38
00a3e4e8	add x1,x25,#0x28
00a3e4ec	sub x0,x29,#0xc8
00a3e4f0	add x2,sp,#0x138
00a3e4f4	bl 0x00a44e38
00a3e4f8	sub x1,x29,#0xc8
00a3e4fc	mov x0,x21
00a3e500	bl 0x00a45158
00a3e504	sub x0,x29,#0x78
00a3e508	sub x1,x29,#0xa0
00a3e50c	bl 0x00a45158
00a3e510	ldurb w8,[x29, #-0x78]
00a3e514	ldrb w9,[x21, #0x1f]
00a3e518	mov x0,x20
00a3e51c	mov x1,x19
00a3e520	mov x2,xzr
00a3e524	eor w8,w9,w8, LSL #0x7
00a3e528	strb w8,[x21, #0x1f]
00a3e52c	bl 0x00c31f70
00a3e530	cbz w0,0x00a3f55c
00a3e534	mov w2,#0x20
00a3e538	mov x0,x20
00a3e53c	mov x1,x21
00a3e540	bl 0x00c31f80
00a3e544	cbz w0,0x00a3f55c
00a3e548	mov w2,#0x20
00a3e54c	mov x0,x20
00a3e550	mov x1,x24
00a3e554	bl 0x00c31f80
00a3e558	cbz w0,0x00a3f55c
00a3e55c	mov x0,x20
00a3e560	mov x1,x23
00a3e564	mov x2,x22
00a3e568	bl 0x00c31f80
00a3e56c	cbz w0,0x00a3f55c
00a3e570	add x1,sp,#0x138
00a3e574	add x2,sp,#0x134
00a3e578	mov x0,x20
00a3e57c	bl 0x00c31f60
00a3e580	cbz w0,0x00a3f55c
00a3e584	add x0,sp,#0x138
00a3e588	bl 0x00a3f5ac
00a3e58c	ldrb w8,[sp, #0x13d]
00a3e590	ldrb w1,[sp, #0x138]
00a3e594	ldrb w11,[sp, #0x139]
00a3e598	ldrb w3,[sp, #0x13a]
00a3e59c	str x8,[sp, #0x118]
00a3e5a0	ldrb w8,[sp, #0x13e]
00a3e5a4	ldrb w10,[sp, #0x14d]
00a3e5a8	ldrb w18,[sp, #0x14e]
00a3e5ac	ldrb w7,[sp, #0x150]
00a3e5b0	str w8,[sp, #0x110]
00a3e5b4	ldrb w8,[sp, #0x13f]
00a3e5b8	ldrb w9,[sp, #0x151]
00a3e5bc	ldrb w12,[sp, #0x25a]
00a3e5c0	ldrb w6,[sp, #0x25b]
00a3e5c4	str x8,[sp, #0x120]
00a3e5c8	ldrb w8,[sp, #0x14b]
00a3e5cc	ldrb w25,[sp, #0x258]
00a3e5d0	ldrb w24,[sp, #0x259]
00a3e5d4	ldrb w22,[sp, #0x25c]
00a3e5d8	str x8,[sp, #0x128]
00a3e5dc	ldrb w8,[sp, #0x14f]
00a3e5e0	ldrb w23,[sp, #0x26f]
00a3e5e4	ldrb w14,[sp, #0x270]
00a3e5e8	ldrb w0,[sp, #0x218]
00a3e5ec	ldrb w15,[sp, #0x219]
00a3e5f0	bfm x1,x11,#0x38,#0x7
00a3e5f4	lsl w11,w3,#0x10
00a3e5f8	ldrb w5,[sp, #0x13b]
00a3e5fc	ldrb w26,[sp, #0x26d]
00a3e600	ldrb w27,[sp, #0x26e]
00a3e604	ldrb w28,[sp, #0x21a]
00a3e608	bfm x10,x18,#0x38,#0x7
00a3e60c	mov x18,x8
00a3e610	and x11,x11,#0x1f0000
00a3e614	ldrb w30,[sp, #0x13c]
00a3e618	ldrb w17,[sp, #0x14a]
00a3e61c	str w9,[sp, #0x108]
00a3e620	ldrb w16,[sp, #0x26a]
00a3e624	ldrb w9,[sp, #0x21b]
00a3e628	lsl w13,w18,#0x10
00a3e62c	bfm w18,w7,#0x18,#0x7
00a3e630	lsl w7,w12,#0x10
00a3e634	bfm w12,w6,#0x18,#0x7
00a3e638	orr x11,x1,x11
00a3e63c	bfm x25,x24,#0x38,#0x7
00a3e640	ldrb w6,[sp, #0x22f]
00a3e644	lsl w24,w23,#0x10
00a3e648	bfm w23,w14,#0x18,#0x7
00a3e64c	ldrb w14,[sp, #0x230]
00a3e650	bfm x0,x15,#0x38,#0x7
00a3e654	ldr x15,[sp, #0x128]
00a3e658	bfm w12,w22,#0x10,#0x7
00a3e65c	str x11,[sp, #0x128]
00a3e660	ldr x22,[sp, #0x118]
00a3e664	ldr w11,[sp, #0x110]
00a3e668	bfm w3,w5,#0x18,#0x7
00a3e66c	ldrb w2,[sp, #0x22d]
00a3e670	ldrb w5,[sp, #0x22e]
00a3e674	bfm x26,x27,#0x38,#0x7
00a3e678	mov x27,x28
00a3e67c	stp x16,x17,[sp, #0xc0]
00a3e680	lsl w28,w27,#0x10
00a3e684	bfm w27,w9,#0x18,#0x7
00a3e688	ldrb w9,[sp, #0x26b]
00a3e68c	bfm w3,w30,#0x10,#0x7
00a3e690	and x30,x17,#0xf8
00a3e694	ldr w17,[sp, #0x108]
00a3e698	lsl w8,w6,#0x10
00a3e69c	bfm w6,w14,#0x18,#0x7
00a3e6a0	ldrb w14,[sp, #0x271]
00a3e6a4	ldrb w1,[sp, #0x152]
00a3e6a8	bfm w3,w22,#0x8,#0x7
00a3e6ac	bfm w22,w11,#0x18,#0x7
00a3e6b0	ldrb w11,[sp, #0x153]
00a3e6b4	bfm x2,x5,#0x38,#0x7
00a3e6b8	bfm x30,x15,#0x38,#0x7
00a3e6bc	ldrb w15,[sp, #0x21c]
00a3e6c0	ldrb w5,[sp, #0x22a]
00a3e6c4	and x4,x16,#0xf8
00a3e6c8	bfm w18,w17,#0x10,#0x7
00a3e6cc	bfm x4,x9,#0x38,#0x7
00a3e6d0	ldrb w9,[sp, #0x22b]
00a3e6d4	bfm w23,w14,#0x10,#0x7
00a3e6d8	ldrb w14,[sp, #0x231]
00a3e6dc	and x13,x13,#0x1f0000
00a3e6e0	ldrb w17,[sp, #0x25d]
00a3e6e4	bfm w18,w1,#0x8,#0x7
00a3e6e8	bfm w1,w11,#0x18,#0x7
00a3e6ec	ldrb w11,[sp, #0x25e]
00a3e6f0	orr x10,x10,x13
00a3e6f4	and x13,x7,#0x1f0000
00a3e6f8	bfm w27,w15,#0x10,#0x7
00a3e6fc	and x15,x5,#0xf8
00a3e700	orr x25,x25,x13
00a3e704	ldrb w13,[sp, #0x26c]
00a3e708	bfm x15,x9,#0x38,#0x7
00a3e70c	str x5,[sp, #0xf0]
00a3e710	mov x5,x15
00a3e714	bfm w6,w14,#0x10,#0x7
00a3e718	ldrb w14,[sp, #0x14c]
00a3e71c	bfm w12,w17,#0x8,#0x7
00a3e720	bfm w17,w11,#0x18,#0x7
00a3e724	ldrb w15,[sp, #0x272]
00a3e728	ldrb w11,[sp, #0x273]
00a3e72c	bfm x4,x13,#0x30,#0x7
00a3e730	and x13,x24,#0x1f0000
00a3e734	str x10,[sp, #0xa8]
00a3e738	orr x10,x26,x13
00a3e73c	ldrb w9,[sp, #0x140]
00a3e740	bfm x30,x14,#0x30,#0x7
00a3e744	str x10,[sp, #0xb8]
00a3e748	ldrb w14,[sp, #0x21d]
00a3e74c	bfm w23,w15,#0x8,#0x7
00a3e750	bfm w15,w11,#0x18,#0x7
00a3e754	ldrb w11,[sp, #0x21e]
00a3e758	ldrb w10,[sp, #0x22c]
00a3e75c	ldr x7,[sp, #0x120]
00a3e760	and x8,x8,#0x1f0000
00a3e764	orr x8,x2,x8
00a3e768	ldrb w16,[sp, #0x154]
00a3e76c	bfm w27,w14,#0x8,#0x7
00a3e770	bfm w14,w11,#0x18,#0x7
00a3e774	ldrb w11,[sp, #0x232]
00a3e778	bfm x5,x10,#0x30,#0x7
00a3e77c	ldrb w10,[sp, #0x233]
00a3e780	str x8,[sp, #0x108]
00a3e784	ldrb w8,[sp, #0x155]
00a3e788	ldrb w26,[sp, #0x25f]
00a3e78c	bfm w22,w7,#0x10,#0x7
00a3e790	bfm w7,w9,#0x18,#0x7
00a3e794	ldrb w9,[sp, #0x260]
00a3e798	and x13,x28,#0x1f0000
00a3e79c	orr x24,x0,x13
00a3e7a0	bfm w6,w11,#0x8,#0x7
00a3e7a4	bfm w11,w10,#0x18,#0x7
00a3e7a8	bfm w1,w16,#0x10,#0x7
00a3e7ac	bfm x16,x8,#0x38,#0x7
00a3e7b0	ldrb w0,[sp, #0x274]
00a3e7b4	bfm w17,w26,#0x10,#0x7
00a3e7b8	bfm w26,w9,#0x18,#0x7
00a3e7bc	ldrb w8,[sp, #0x275]
00a3e7c0	ldrb w10,[sp, #0x21f]
00a3e7c4	ldrb w9,[sp, #0x220]
00a3e7c8	ldrb w13,[sp, #0x234]
00a3e7cc	bfm w15,w0,#0x10,#0x7
00a3e7d0	bfm x0,x8,#0x38,#0x7
00a3e7d4	bfm w14,w10,#0x10,#0x7
00a3e7d8	bfm w10,w9,#0x18,#0x7
00a3e7dc	ldrb w8,[sp, #0x235]
00a3e7e0	stp x6,x5,[sp, #0x110]
00a3e7e4	mov x6,x10
00a3e7e8	ldrb w9,[sp, #0x141]
00a3e7ec	ldrb w10,[sp, #0x156]
00a3e7f0	bfm w11,w13,#0x10,#0x7
00a3e7f4	str x11,[sp, #0x100]
00a3e7f8	ldrb w11,[sp, #0x236]
00a3e7fc	bfm x13,x8,#0x38,#0x7
00a3e800	ldrb w8,[sp, #0x261]
00a3e804	bfm w7,w9,#0x10,#0x7
00a3e808	bfm x16,x10,#0x30,#0x7
00a3e80c	ldrb w9,[sp, #0x276]
00a3e810	ldrb w10,[sp, #0x221]
00a3e814	bfm x13,x11,#0x30,#0x7
00a3e818	str x14,[sp, #0xd8]
00a3e81c	bfm w26,w8,#0x10,#0x7
00a3e820	mov x14,x13
00a3e824	ldrb w13,[sp, #0x142]
00a3e828	ldrb w8,[sp, #0x143]
00a3e82c	bfm x0,x9,#0x30,#0x7
00a3e830	bfm w6,w10,#0x10,#0x7
00a3e834	ldrb w9,[sp, #0x157]
00a3e838	ldrb w2,[sp, #0x222]
00a3e83c	ldrb w10,[sp, #0x223]
00a3e840	ldrb w5,[sp, #0x262]
00a3e844	bfm w7,w13,#0x8,#0x7
00a3e848	bfm w13,w8,#0x18,#0x7
00a3e84c	ldrb w8,[sp, #0x263]
00a3e850	bfm x16,x9,#0x28,#0x7
00a3e854	ldrb w9,[sp, #0x277]
00a3e858	bfm w6,w2,#0x8,#0x7
00a3e85c	bfm w2,w10,#0x18,#0x7
00a3e860	ldrb w10,[sp, #0x264]
00a3e864	bfm w26,w5,#0x8,#0x7
00a3e868	bfm w5,w8,#0x18,#0x7
00a3e86c	ldrb w8,[sp, #0x237]
00a3e870	ldrb w11,[sp, #0x224]
00a3e874	bfm x0,x9,#0x28,#0x7
00a3e878	ldrb w9,[sp, #0x144]
00a3e87c	bfm w5,w10,#0x10,#0x7
00a3e880	ldr x10,[sp, #0x128]
00a3e884	bfm x14,x8,#0x28,#0x7
00a3e888	bfm w2,w11,#0x10,#0x7
00a3e88c	ubfx x11,x3,#0x5,#0x15
00a3e890	str x14,[sp, #0xf8]
00a3e894	bfm w13,w9,#0x10,#0x7
00a3e898	ubfx x14,x12,#0x5,#0x15
00a3e89c	madd x8,x25,x10,x24
00a3e8a0	mul x9,x25,x11
00a3e8a4	mov x24,x11
00a3e8a8	madd x9,x14,x10,x9
00a3e8ac	add x11,x8,#0x100, LSL #12
00a3e8b0	add x9,x9,x11, LSR #0x15
00a3e8b4	str x9,[sp, #0x98]
00a3e8b8	and x9,x11,#0xfffffe00000
00a3e8bc	str x6,[sp, #0xd0]
00a3e8c0	mov x6,x2
00a3e8c4	sub x8,x8,x9
00a3e8c8	ldrb w2,[sp, #0x265]
00a3e8cc	ldrb w9,[sp, #0x266]
00a3e8d0	str x8,[sp, #0x120]
00a3e8d4	ldrb w10,[sp, #0x145]
00a3e8d8	ldrb w8,[sp, #0x146]
00a3e8dc	ldrb w12,[sp, #0x225]
00a3e8e0	bfm w5,w2,#0x8,#0x7
00a3e8e4	bfm w2,w9,#0x18,#0x7
00a3e8e8	ldrb w9,[sp, #0x226]
00a3e8ec	bfm w13,w10,#0x8,#0x7
00a3e8f0	bfm w10,w8,#0x18,#0x7
00a3e8f4	ldrb w8,[sp, #0x147]
00a3e8f8	ldrb w11,[sp, #0x148]
00a3e8fc	bfm w6,w12,#0x8,#0x7
00a3e900	str x6,[sp, #0xe8]
00a3e904	bfm w12,w9,#0x18,#0x7
00a3e908	ldrb w6,[sp, #0x267]
00a3e90c	ldrb w9,[sp, #0x268]
00a3e910	bfm w10,w8,#0x10,#0x7
00a3e914	bfm w8,w11,#0x18,#0x7
00a3e918	ldrb w11,[sp, #0x149]
00a3e91c	bfm w2,w6,#0x10,#0x7
00a3e920	bfm w6,w9,#0x18,#0x7
00a3e924	ldr x9,[sp, #0xc8]
00a3e928	str x12,[sp, #0x80]
00a3e92c	ldrb w12,[sp, #0x269]
00a3e930	bfm w8,w11,#0x10,#0x7
00a3e934	bfm w8,w9,#0x8,#0x7
00a3e938	ldr x9,[sp, #0xc0]
00a3e93c	bfm w6,w12,#0x10,#0x7
00a3e940	lsr x12,x30,#0x3
00a3e944	ubfx x3,x22,#0x2,#0x15
00a3e948	bfm w6,w9,#0x8,#0x7
00a3e94c	ubfx x9,x18,#0x5,#0x15
00a3e950	ubfx x18,x23,#0x5,#0x15
00a3e954	ldr x23,[sp, #0xa8]
00a3e958	str x27,[sp, #0xe0]
00a3e95c	lsr x30,x4,#0x3
00a3e960	ubfx x4,x1,#0x2,#0x15
00a3e964	mul x11,x25,x23
00a3e968	madd x11,x14,x12,x11
00a3e96c	str x11,[sp, #0xc0]
00a3e970	mul x11,x25,x9
00a3e974	madd x11,x14,x23,x11
00a3e978	mul x27,x25,x3
00a3e97c	ubfx x1,x17,#0x2,#0x15
00a3e980	ubfx x17,x15,#0x2,#0x15
00a3e984	str x11,[sp, #0xb0]
00a3e988	ubfx x15,x7,#0x7,#0x15
00a3e98c	madd x11,x14,x24,x27
00a3e990	mul x27,x25,x4
00a3e994	lsr x16,x16,#0x7
00a3e998	str x11,[sp, #0xa0]
00a3e99c	nop
00a3e9a0	madd x11,x14,x9,x27
00a3e9a4	mul x27,x25,x15
00a3e9a8	str x11,[sp, #0x90]
00a3e9ac	ubfx x13,x13,#0x4,#0x15
00a3e9b0	madd x11,x14,x3,x27
00a3e9b4	mul x27,x25,x16
00a3e9b8	str x11,[sp, #0x88]
00a3e9bc	nop
00a3e9c0	madd x11,x14,x4,x27
00a3e9c4	ubfx x27,x10,#0x1,#0x15
00a3e9c8	mul x10,x25,x13
00a3e9cc	madd x10,x14,x15,x10
00a3e9d0	mul x28,x25,x27
00a3e9d4	stp x10,x11,[sp, #0x68]
00a3e9d8	ubfx x11,x8,#0x6,#0x15
00a3e9dc	madd x8,x14,x13,x28
00a3e9e0	mul x10,x25,x12
00a3e9e4	ldr x22,[sp, #0xb8]
00a3e9e8	str x8,[sp, #0x60]
00a3e9ec	mul x25,x25,x11
00a3e9f0	madd x8,x14,x11,x10
00a3e9f4	str x8,[sp, #0x50]
00a3e9f8	nop
00a3e9fc	madd x8,x14,x27,x25
00a3ea00	mul x14,x14,x16
00a3ea04	str x8,[sp, #0x58]
00a3ea08	nop
00a3ea0c	madd x8,x1,x4,x14
00a3ea10	mul x28,x30,x16
00a3ea14	str x8,[sp, #0x48]
00a3ea18	nop
00a3ea1c	madd x8,x22,x4,x28
00a3ea20	mul x10,x18,x16
00a3ea24	lsr x0,x0,#0x7
00a3ea28	str x8,[sp, #0x40]
00a3ea2c	nop
00a3ea30	madd x8,x17,x4,x10
00a3ea34	mul x25,x17,x16
00a3ea38	ubfx x26,x26,#0x7,#0x15
00a3ea3c	str x8,[sp, #0x38]
00a3ea40	nop
00a3ea44	madd x8,x0,x4,x25
00a3ea48	mul x25,x1,x16
00a3ea4c	str x8,[sp, #0xc8]
00a3ea50	nop
00a3ea54	madd x8,x26,x4,x25
00a3ea58	mul x14,x22,x16
00a3ea5c	ubfx x5,x5,#0x4,#0x15
00a3ea60	str x8,[sp, #0x30]
00a3ea64	nop
00a3ea68	madd x8,x18,x4,x14
00a3ea6c	mul x28,x26,x16
00a3ea70	str x8,[sp, #0x28]
00a3ea74	ubfx x2,x2,#0x1,#0x15
00a3ea78	madd x8,x5,x4,x28
00a3ea7c	mul x10,x5,x16
00a3ea80	str x8,[sp, #0x20]
00a3ea84	nop
00a3ea88	madd x8,x2,x4,x10
00a3ea8c	str x8,[sp, #0x18]
00a3ea90	ubfx x8,x6,#0x6,#0x15
00a3ea94	mul x6,x2,x16
00a3ea98	mul x25,x8,x16
00a3ea9c	madd x6,x8,x4,x6
00a3eaa0	madd x10,x30,x4,x25
00a3eaa4	ldr x4,[sp, #0x70]
00a3eaa8	str x10,[sp, #0x10]
00a3eaac	ldr x10,[sp, #0xb0]
00a3eab0	ldr x7,[sp, #0x128]
00a3eab4	nop
00a3eab8	madd x25,x1,x9,x4
00a3eabc	ldr x4,[sp, #0x68]
00a3eac0	nop
00a3eac4	madd x10,x1,x12,x10
00a3eac8	str x10,[sp, #0xb0]
00a3eacc	ldr x10,[sp, #0xa0]
00a3ead0	nop
00a3ead4	madd x28,x1,x3,x4
00a3ead8	ldr x4,[sp, #0xc0]
00a3eadc	nop
00a3eae0	madd x10,x1,x7,x10
00a3eae4	str x10,[sp, #0x78]
00a3eae8	nop
00a3eaec	madd x4,x1,x11,x4
00a3eaf0	ldp x14,x10,[sp, #0x88]
00a3eaf4	str x4,[sp, #0x90]
00a3eaf8	ldr x4,[sp, #0x60]
00a3eafc	nop
00a3eb00	madd x10,x1,x23,x10
00a3eb04	madd x14,x1,x24,x14
00a3eb08	madd x4,x1,x15,x4
00a3eb0c	str x4,[sp, #0x8]
00a3eb10	ldr x4,[sp, #0x50]
00a3eb14	nop
00a3eb18	madd x4,x1,x27,x4
00a3eb1c	str x4,[sp, #0x50]
00a3eb20	ldr x4,[sp, #0x58]
00a3eb24	nop
00a3eb28	madd x1,x1,x13,x4
00a3eb2c	str x1,[sp, #0xa0]
00a3eb30	ldr x1,[sp, #0x48]
00a3eb34	mov x4,x7
00a3eb38	madd x1,x26,x9,x1
00a3eb3c	str x1,[sp, #0x68]
00a3eb40	ldr x1,[sp, #0x40]
00a3eb44	nop
00a3eb48	madd x1,x18,x9,x1
00a3eb4c	str x1,[sp, #0x60]
00a3eb50	ldr x1,[sp, #0x38]
00a3eb54	nop
00a3eb58	madd x1,x0,x9,x1
00a3eb5c	str x1,[sp, #0xc0]
00a3eb60	ldr x1,[sp, #0x30]
00a3eb64	nop
00a3eb68	madd x1,x5,x9,x1
00a3eb6c	str x1,[sp, #0x40]
00a3eb70	ldr x1,[sp, #0x28]
00a3eb74	nop
00a3eb78	madd x1,x17,x9,x1
00a3eb7c	str x1,[sp, #0x28]
00a3eb80	ldr x1,[sp, #0x20]
00a3eb84	nop
00a3eb88	madd x1,x2,x9,x1
00a3eb8c	str x1,[sp, #0x58]
00a3eb90	ldr x1,[sp, #0x18]
00a3eb94	nop
00a3eb98	madd x1,x8,x9,x1
00a3eb9c	str x1,[sp, #0x38]
00a3eba0	nop
00a3eba4	madd x1,x30,x9,x6
00a3eba8	str x1,[sp, #0x48]
00a3ebac	ldr x1,[sp, #0x10]
00a3ebb0	nop
00a3ebb4	madd x6,x26,x23,x25
00a3ebb8	madd x9,x22,x9,x1
00a3ebbc	str x9,[sp, #0x30]
00a3ebc0	nop
00a3ebc4	madd x9,x26,x12,x10
00a3ebc8	madd x10,x26,x24,x28
00a3ebcc	str x10,[sp, #0x20]
00a3ebd0	ldr x10,[sp, #0xb0]
00a3ebd4	mov x1,x24
00a3ebd8	str x9,[sp, #0x88]
00a3ebdc	nop
00a3ebe0	madd x9,x26,x7,x14
00a3ebe4	madd x24,x26,x11,x10
00a3ebe8	ldr x10,[sp, #0x90]
00a3ebec	ldr x14,[sp, #0x68]
00a3ebf0	str x9,[sp, #0x70]
00a3ebf4	mov x9,x23
00a3ebf8	madd x25,x26,x27,x10
00a3ebfc	ldr x10,[sp, #0x8]
00a3ec00	nop
00a3ec04	madd x14,x5,x23,x14
00a3ec08	madd x24,x5,x27,x24
00a3ec0c	madd x25,x5,x13,x25
00a3ec10	madd x28,x26,x3,x10
00a3ec14	ldr x10,[sp, #0x50]
00a3ec18	nop
00a3ec1c	madd x28,x5,x1,x28
00a3ec20	madd x28,x2,x4,x28
00a3ec24	madd x24,x2,x13,x24
00a3ec28	madd x10,x26,x13,x10
00a3ec2c	str x10,[sp, #0x50]
00a3ec30	ldr x10,[sp, #0xa0]
00a3ec34	str x14,[sp, #0xa0]
00a3ec38	ldr x14,[sp, #0x60]
00a3ec3c	nop
00a3ec40	madd x25,x2,x15,x25
00a3ec44	madd x10,x26,x15,x10
00a3ec48	madd x14,x17,x23,x14
00a3ec4c	str x14,[sp, #0x90]
00a3ec50	ldr x14,[sp, #0x40]
00a3ec54	nop
00a3ec58	madd x14,x2,x23,x14
00a3ec5c	str x14,[sp, #0x68]
00a3ec60	ldr x14,[sp, #0x28]
00a3ec64	nop
00a3ec68	madd x14,x0,x23,x14
00a3ec6c	str x14,[sp, #0xb0]
00a3ec70	ldr x14,[sp, #0x58]
00a3ec74	nop
00a3ec78	madd x7,x8,x23,x14
00a3ec7c	ldr x14,[sp, #0x38]
00a3ec80	nop
00a3ec84	madd x7,x30,x12,x7
00a3ec88	madd x14,x30,x23,x14
00a3ec8c	str x14,[sp, #0x58]
00a3ec90	ldr x14,[sp, #0x48]
00a3ec94	nop
00a3ec98	madd x14,x22,x23,x14
00a3ec9c	ldr x23,[sp, #0x30]
00a3eca0	nop
00a3eca4	madd x14,x18,x12,x14
00a3eca8	madd x14,x17,x11,x14
00a3ecac	madd x14,x0,x27,x14
00a3ecb0	madd x26,x18,x9,x23
00a3ecb4	madd x9,x5,x12,x6
00a3ecb8	str x9,[sp, #0x60]
00a3ecbc	ldp x9,x23,[sp, #0x88]
00a3ecc0	nop
00a3ecc4	madd x26,x17,x12,x26
00a3ecc8	str x28,[sp, #0x88]
00a3eccc	nop
00a3ecd0	madd x6,x5,x11,x9
00a3ecd4	ldr x9,[sp, #0x20]
00a3ecd8	nop
00a3ecdc	madd x23,x0,x12,x23
00a3ece0	str x23,[sp, #0x90]
00a3ece4	ldr x23,[sp, #0x68]
00a3ece8	nop
00a3ecec	madd x9,x5,x4,x9
00a3ecf0	str x9,[sp, #0xa8]
00a3ecf4	ldr x9,[sp, #0x50]
00a3ecf8	str x7,[sp, #0x68]
00a3ecfc	ldr x7,[sp, #0x58]
00a3ed00	nop
00a3ed04	madd x23,x8,x12,x23
00a3ed08	madd x9,x5,x15,x9
00a3ed0c	madd x5,x5,x3,x10
00a3ed10	ldr x10,[sp, #0xa0]
00a3ed14	nop
00a3ed18	madd x7,x22,x12,x7
00a3ed1c	str x7,[sp, #0xa0]
00a3ed20	nop
00a3ed24	madd x6,x2,x27,x6
00a3ed28	madd x10,x2,x12,x10
00a3ed2c	ldp x12,x7,[sp, #0x60]
00a3ed30	nop
00a3ed34	madd x9,x2,x3,x9
00a3ed38	madd x10,x8,x11,x10
00a3ed3c	madd x10,x30,x27,x10
00a3ed40	madd x12,x2,x11,x12
00a3ed44	madd x2,x2,x1,x5
00a3ed48	madd x28,x8,x27,x12
00a3ed4c	madd x5,x30,x11,x23
00a3ed50	madd x7,x22,x11,x7
00a3ed54	madd x28,x30,x13,x28
00a3ed58	madd x5,x22,x27,x5
00a3ed5c	madd x7,x18,x27,x7
00a3ed60	madd x6,x8,x13,x6
00a3ed64	madd x10,x22,x13,x10
00a3ed68	madd x23,x8,x15,x24
00a3ed6c	madd x24,x22,x15,x28
00a3ed70	madd x28,x18,x13,x5
00a3ed74	madd x5,x17,x13,x7
00a3ed78	madd x6,x30,x15,x6
00a3ed7c	madd x10,x18,x15,x10
00a3ed80	madd x7,x17,x15,x28
00a3ed84	madd x28,x0,x15,x5
00a3ed88	ldr x15,[sp, #0xa0]
00a3ed8c	mov x12,x22
00a3ed90	madd x6,x22,x3,x6
00a3ed94	madd x10,x17,x3,x10
00a3ed98	madd x22,x30,x3,x23
00a3ed9c	madd x15,x18,x11,x15
00a3eda0	madd x23,x0,x1,x10
00a3eda4	madd x10,x12,x1,x22
00a3eda8	madd x15,x17,x27,x15
00a3edac	madd x5,x8,x3,x25
00a3edb0	madd x9,x8,x1,x9
00a3edb4	mov x25,x12
00a3edb8	madd x12,x0,x3,x7
00a3edbc	madd x27,x8,x4,x2
00a3edc0	madd x8,x18,x4,x10
00a3edc4	ldr x10,[sp, #0xe0]
00a3edc8	str x12,[sp, #0xa0]
00a3edcc	ldr x12,[sp, #0x98]
00a3edd0	nop
00a3edd4	madd x24,x18,x3,x24
00a3edd8	madd x6,x18,x1,x6
00a3eddc	ubfx x10,x10,#0x5,#0x15
00a3ede0	madd x22,x17,x1,x24
00a3ede4	madd x24,x0,x13,x15
00a3ede8	madd x15,x17,x4,x6
00a3edec	madd x3,x30,x4,x9
00a3edf0	str x8,[sp, #0xb8]
00a3edf4	mul x9,x0,x16
00a3edf8	ldrb w8,[sp, #0x227]
00a3edfc	ldrb w16,[sp, #0x228]
00a3ee00	add x17,x12,x10
00a3ee04	ldp x13,x12,[sp, #0x78]
00a3ee08	ldrb w10,[sp, #0x229]
00a3ee0c	add x6,x9,#0x100, LSL #12
00a3ee10	madd x5,x30,x1,x5
00a3ee14	bfm w12,w8,#0x10,#0x7
00a3ee18	bfm w8,w16,#0x18,#0x7
00a3ee1c	bfm w8,w10,#0x10,#0x7
00a3ee20	ldr x10,[sp, #0xf0]
00a3ee24	ldr x16,[sp, #0xd8]
00a3ee28	add x1,x17,#0x100, LSL #12
00a3ee2c	madd x7,x0,x11,x26
00a3ee30	bfm w8,w10,#0x8,#0x7
00a3ee34	and x10,x6,#0x7fffffffffe00000
00a3ee38	sub x10,x9,x10
00a3ee3c	and x9,x1,#-0x200000
00a3ee40	sub x9,x17,x9
00a3ee44	ubfx x16,x16,#0x2,#0x15
00a3ee48	str x9,[sp, #0x128]
00a3ee4c	ldp x17,x9,[sp, #0xc8]
00a3ee50	add x16,x13,x16
00a3ee54	ldr x13,[sp, #0x70]
00a3ee58	nop
00a3ee5c	madd x11,x25,x4,x5
00a3ee60	madd x5,x0,x4,x22
00a3ee64	ubfx x9,x9,#0x7,#0x15
00a3ee68	ldr x0,[sp, #0xc0]
00a3ee6c	add x22,x13,x9
00a3ee70	add x9,x16,x1, LSR #0x15
00a3ee74	add x16,x16,#0x100, LSL #12
00a3ee78	and x18,x16,#-0x200000
00a3ee7c	sub x9,x9,x18
00a3ee80	str x9,[sp, #0xf0]
00a3ee84	add x9,x22,x16, LSR #0x15
00a3ee88	add x16,x0,#0x100, LSL #12
00a3ee8c	add x18,x17,x16, LSR #0x15
00a3ee90	ldr x17,[sp, #0xe8]
00a3ee94	and x16,x16,#0x7fffffffffe00000
00a3ee98	sub x16,x0,x16
00a3ee9c	ldr x1,[sp, #0x90]
00a3eea0	ubfx x0,x17,#0x4,#0x15
00a3eea4	ldr x17,[sp, #0xa8]
00a3eea8	ubfx x8,x8,#0x6,#0x15
00a3eeac	lsr x6,x6,#0x15
00a3eeb0	add x2,x17,x0
00a3eeb4	ldr x17,[sp, #0xb0]
00a3eeb8	add x0,x1,#0x100, LSL #12
00a3eebc	add x22,x17,x0, ASR #0x15
00a3eec0	and x0,x0,#-0x200000
00a3eec4	sub x25,x1,x0
00a3eec8	add x0,x18,#0x100, LSL #12
00a3eecc	add x26,x10,x0, LSR #0x15
00a3eed0	and x10,x0,#0x7fffffffffe00000
00a3eed4	sub x30,x18,x10
00a3eed8	add x10,x9,#0x100, LSL #12
00a3eedc	and x18,x10,#-0x200000
00a3eee0	sub x9,x9,x18
00a3eee4	str x9,[sp, #0xe8]
00a3eee8	ubfx x9,x12,#0x1,#0x15
00a3eeec	ldr x12,[sp, #0x88]
00a3eef0	add x18,x22,#0x100, LSL #12
00a3eef4	add x16,x16,x18, ASR #0x15
00a3eef8	and x18,x18,#-0x200000
00a3eefc	add x9,x12,x9
00a3ef00	add x12,x27,x8
00a3ef04	ldr x8,[sp, #0x108]
00a3ef08	sub x4,x22,x18
00a3ef0c	add x18,x2,#0x100, LSL #12
00a3ef10	add x10,x2,x10, ASR #0x15
00a3ef14	add x22,x11,x8
00a3ef18	ldr x8,[sp, #0x100]
00a3ef1c	add x13,x9,x18, ASR #0x15
00a3ef20	and x9,x18,#-0x200000
00a3ef24	sub x9,x10,x9
00a3ef28	str x9,[sp, #0xe0]
00a3ef2c	ubfx x9,x8,#0x2,#0x15
00a3ef30	ldr x8,[sp, #0x118]
00a3ef34	mov x17,#-0x6f7d
00a3ef38	movk x17,#0xfff5, LSL #16
00a3ef3c	add x27,x15,x9
00a3ef40	add x3,x3,x8, LSR #0x3
00a3ef44	ldr x8,[sp, #0x110]
00a3ef48	mov x9,#-0x39ad
00a3ef4c	movk x9,#0xfff0, LSL #16
00a3ef50	mov w18,#0x2d18
00a3ef54	ubfx x11,x8,#0x5,#0x15
00a3ef58	ldr x8,[sp, #0xf8]
00a3ef5c	movk w18,#0x7, LSL #16
00a3ef60	mov x0,#-0x39ad
00a3ef64	movk x0,#0xfff0, LSL #16
00a3ef68	add x5,x5,x8, LSR #0x7
00a3ef6c	add x8,x14,#0x100, LSL #12
00a3ef70	madd x14,x6,x17,x14
00a3ef74	add x15,x7,x8, ASR #0x15
00a3ef78	and x8,x8,#-0x200000
00a3ef7c	sub x10,x14,x8
00a3ef80	ldr x8,[sp, #0xa0]
00a3ef84	add x14,x28,#0x100, LSL #12
00a3ef88	madd x28,x6,x9,x28
00a3ef8c	add x7,x24,x14, ASR #0x15
00a3ef90	and x14,x14,#-0x200000
00a3ef94	ldr x9,[sp, #0xb8]
00a3ef98	sub x14,x28,x14
00a3ef9c	add x28,x23,#0x100, LSL #12
00a3efa0	madd x23,x6,x18,x23
00a3efa4	add x8,x8,x28, ASR #0x15
00a3efa8	and x28,x28,#-0x200000
00a3efac	sub x23,x23,x28
00a3efb0	add x28,x22,#0x100, LSL #12
00a3efb4	add x24,x9,x28, ASR #0x15
00a3efb8	add x24,x24,x11
00a3efbc	add x11,x15,#0x100, LSL #12
00a3efc0	add x25,x25,x11, ASR #0x15
00a3efc4	and x11,x11,#-0x200000
00a3efc8	sub x2,x15,x11
00a3efcc	mov w11,#0xfb67
00a3efd0	movk w11,#0x9, LSL #16
00a3efd4	add x15,x8,#0x100, LSL #12
00a3efd8	madd x8,x6,x11,x8
00a3efdc	add x9,x14,x15, ASR #0x15
00a3efe0	and x14,x15,#-0x200000
00a3efe4	sub x8,x8,x14
00a3efe8	mov w14,#0x15d1
00a3efec	movk w14,#0x2, LSL #16
00a3eff0	add x15,x7,#0x100, LSL #12
00a3eff4	madd x7,x6,x14,x7
00a3eff8	add x10,x10,x15, ASR #0x15
00a3effc	and x15,x15,#-0x200000
00a3f000	sub x7,x7,x15
00a3f004	mov w15,#0x2c13
00a3f008	movk w15,#0xa, LSL #16
00a3f00c	mul x1,x16,x15
00a3f010	madd x1,x4,x18,x1
00a3f014	madd x1,x25,x11,x1
00a3f018	mul x6,x6,x15
00a3f01c	add x1,x1,x22
00a3f020	madd x6,x26,x18,x6
00a3f024	madd x22,x26,x11,x23
00a3f028	mul x23,x26,x15
00a3f02c	madd x9,x26,x14,x9
00a3f030	madd x8,x26,x0,x8
00a3f034	madd x7,x26,x17,x7
00a3f038	madd x23,x30,x18,x23
00a3f03c	madd x6,x30,x11,x6
00a3f040	mul x26,x30,x15
00a3f044	madd x22,x30,x0,x22
00a3f048	madd x23,x16,x11,x23
00a3f04c	madd x26,x16,x18,x26
00a3f050	madd x6,x16,x0,x6
00a3f054	madd x22,x16,x14,x22
00a3f058	madd x23,x4,x0,x23
00a3f05c	madd x26,x4,x11,x26
00a3f060	madd x6,x4,x14,x6
00a3f064	madd x22,x4,x17,x22
00a3f068	mul x4,x4,x15
00a3f06c	madd x23,x25,x14,x23
00a3f070	madd x4,x25,x18,x4
00a3f074	madd x26,x25,x0,x26
00a3f078	madd x6,x25,x17,x6
00a3f07c	mul x25,x25,x15
00a3f080	add x0,x13,#0x100, LSL #12
00a3f084	add x25,x25,x0, ASR #0x15
00a3f088	add x25,x25,x12
00a3f08c	add x12,x12,#0x100, LSL #12
00a3f090	add x3,x3,x12, ASR #0x15
00a3f094	add x4,x4,x3
00a3f098	add x3,x3,#0x100, LSL #12
00a3f09c	add x1,x1,x3, ASR #0x15
00a3f0a0	and x3,x3,#-0x200000
00a3f0a4	sub x3,x4,x3
00a3f0a8	add x4,x23,x27
00a3f0ac	add x23,x27,#0x100, LSL #12
00a3f0b0	add x5,x5,x23, ASR #0x15
00a3f0b4	add x6,x6,x5
00a3f0b8	add x5,x5,#0x100, LSL #12
00a3f0bc	and x27,x5,#-0x200000
00a3f0c0	madd x9,x30,x17,x9
00a3f0c4	add x5,x22,x5, ASR #0x15
00a3f0c8	and x22,x28,#-0x200000
00a3f0cc	sub x1,x1,x22
00a3f0d0	add x22,x9,#0x100, LSL #12
00a3f0d4	and x12,x12,#-0x200000
00a3f0d8	add x7,x7,x22, ASR #0x15
00a3f0dc	and x22,x22,#-0x200000
00a3f0e0	sub x12,x25,x12
00a3f0e4	add x25,x26,x24
00a3f0e8	add x24,x24,#0x100, LSL #12
00a3f0ec	sub x9,x9,x22
00a3f0f0	add x22,x1,#0x100, LSL #12
00a3f0f4	sub x6,x6,x27
00a3f0f8	madd x8,x30,x14,x8
00a3f0fc	add x27,x10,#0x100, LSL #12
00a3f100	add x4,x4,x24, ASR #0x15
00a3f104	and x24,x24,#-0x200000
00a3f108	add x25,x25,x22, ASR #0x15
00a3f10c	add x2,x2,x27, ASR #0x15
00a3f110	and x27,x27,#-0x200000
00a3f114	madd x8,x16,x17,x8
00a3f118	sub x24,x25,x24
00a3f11c	add x25,x5,#0x100, LSL #12
00a3f120	sub x10,x10,x27
00a3f124	add x8,x8,x25, ASR #0x15
00a3f128	and x25,x25,#-0x200000
00a3f12c	ldr x27,[sp, #0xe0]
00a3f130	sub x5,x5,x25
00a3f134	add x25,x7,#0x100, LSL #12
00a3f138	mov x17,#-0x39ad
00a3f13c	and x23,x23,#-0x200000
00a3f140	add x10,x10,x25, ASR #0x15
00a3f144	and x25,x25,#-0x200000
00a3f148	movk x17,#0xfff0, LSL #16
00a3f14c	madd x26,x2,x15,x13
00a3f150	mov x13,#-0x6f7d
00a3f154	sub x4,x4,x23
00a3f158	mul x23,x2,x18
00a3f15c	mul x16,x2,x11
00a3f160	sub x7,x7,x25
00a3f164	mul x25,x2,x17
00a3f168	mul x28,x2,x14
00a3f16c	movk x13,#0xfff5, LSL #16
00a3f170	madd x25,x10,x14,x25
00a3f174	madd x23,x10,x11,x23
00a3f178	madd x27,x10,x15,x27
00a3f17c	madd x26,x10,x18,x26
00a3f180	madd x16,x10,x17,x16
00a3f184	madd x10,x10,x13,x28
00a3f188	ldr x28,[sp, #0xe8]
00a3f18c	mov x17,#-0x39ad
00a3f190	madd x2,x2,x13,x4
00a3f194	add x4,x4,#0x100, LSL #12
00a3f198	movk x17,#0xfff0, LSL #16
00a3f19c	add x6,x6,x4, ASR #0x15
00a3f1a0	madd x28,x7,x15,x28
00a3f1a4	madd x25,x7,x13,x25
00a3f1a8	madd x23,x7,x17,x23
00a3f1ac	madd x27,x7,x18,x27
00a3f1b0	madd x26,x7,x11,x26
00a3f1b4	madd x16,x7,x14,x16
00a3f1b8	add x7,x6,#0x100, LSL #12
00a3f1bc	add x5,x5,x7, ASR #0x15
00a3f1c0	and x7,x7,#-0x200000
00a3f1c4	sub x6,x6,x7
00a3f1c8	add x7,x8,#0x100, LSL #12
00a3f1cc	add x9,x9,x7, ASR #0x15
00a3f1d0	and x7,x7,#-0x200000
00a3f1d4	sub x8,x8,x7
00a3f1d8	add x7,x24,#0x100, LSL #12
00a3f1dc	and x4,x4,#-0x200000
00a3f1e0	add x2,x2,x7, ASR #0x15
00a3f1e4	sub x2,x2,x4
00a3f1e8	add x4,x23,x12
00a3f1ec	add x12,x12,#0x100, LSL #12
00a3f1f0	add x3,x3,x12, ASR #0x15
00a3f1f4	and x12,x12,#-0x200000
00a3f1f8	add x1,x25,x1
00a3f1fc	sub x12,x4,x12
00a3f200	ldp x4,x25,[sp, #0x120]
00a3f204	ldr x23,[sp, #0xf0]
00a3f208	mov x30,#-0x6f7d
00a3f20c	and x0,x0,#-0x200000
00a3f210	mov x13,#-0x39ad
00a3f214	movk x30,#0xfff5, LSL #16
00a3f218	sub x0,x26,x0
00a3f21c	movk x13,#0xfff0, LSL #16
00a3f220	add x16,x16,x3
00a3f224	add x3,x3,#0x100, LSL #12
00a3f228	add x10,x10,x24
00a3f22c	madd x4,x5,x15,x4
00a3f230	madd x23,x5,x11,x23
00a3f234	madd x24,x5,x14,x27
00a3f238	madd x25,x5,x18,x25
00a3f23c	madd x26,x5,x13,x28
00a3f240	madd x0,x5,x30,x0
00a3f244	and x5,x22,#-0x200000
00a3f248	add x1,x1,x3, ASR #0x15
00a3f24c	and x3,x3,#-0x200000
00a3f250	madd x22,x9,x15,x23
00a3f254	madd x23,x9,x11,x24
00a3f258	sub x16,x16,x3
00a3f25c	add x3,x4,#0x100, LSL #12
00a3f260	madd x24,x8,x15,x25
00a3f264	madd x25,x9,x18,x26
00a3f268	sub x1,x1,x5
00a3f26c	madd x12,x9,x14,x12
00a3f270	madd x0,x9,x13,x0
00a3f274	madd x5,x8,x18,x22
00a3f278	madd x22,x8,x13,x23
00a3f27c	add x23,x24,x3, ASR #0x15
00a3f280	madd x24,x8,x11,x25
00a3f284	madd x12,x8,x30,x12
00a3f288	madd x8,x8,x14,x0
00a3f28c	add x0,x1,#0x100, LSL #12
00a3f290	and x7,x7,#-0x200000
00a3f294	madd x9,x9,x30,x16
00a3f298	add x16,x2,#0x100, LSL #12
00a3f29c	add x10,x10,x0, ASR #0x15
00a3f2a0	add x6,x6,x16, ASR #0x15
00a3f2a4	sub x10,x10,x7
00a3f2a8	add x7,x12,#0x100, LSL #12
00a3f2ac	and x0,x0,#-0x200000
00a3f2b0	and x3,x3,#-0x200000
00a3f2b4	sub x0,x1,x0
00a3f2b8	add x1,x6,#0x100, LSL #12
00a3f2bc	add x9,x9,x7, ASR #0x15
00a3f2c0	and x7,x7,#-0x200000
00a3f2c4	sub x3,x4,x3
00a3f2c8	add x4,x5,#0x100, LSL #12
00a3f2cc	add x25,x23,#0x100, LSL #12
00a3f2d0	sub x12,x12,x7
00a3f2d4	and x7,x1,#-0x200000
00a3f2d8	asr x1,x1,#0x15
00a3f2dc	mov x17,#-0x39ad
00a3f2e0	add x24,x24,x4, ASR #0x15
00a3f2e4	sub x6,x6,x7
00a3f2e8	and x7,x25,#-0x200000
00a3f2ec	madd x23,x1,x18,x23
00a3f2f0	movk x17,#0xfff0, LSL #16
00a3f2f4	and x4,x4,#-0x200000
00a3f2f8	sub x7,x23,x7
00a3f2fc	add x23,x24,#0x100, LSL #12
00a3f300	madd x5,x1,x11,x5
00a3f304	sub x4,x5,x4
00a3f308	and x5,x23,#-0x200000
00a3f30c	madd x24,x1,x17,x24
00a3f310	sub x5,x24,x5
00a3f314	add x24,x22,#0x100, LSL #12
00a3f318	add x8,x8,x24, ASR #0x15
00a3f31c	madd x22,x1,x14,x22
00a3f320	madd x3,x1,x15,x3
00a3f324	madd x1,x1,x30,x8
00a3f328	add x8,x8,#0x100, LSL #12
00a3f32c	add x12,x12,x8, ASR #0x15
00a3f330	and x8,x8,#-0x200000
00a3f334	sub x8,x1,x8
00a3f338	add x1,x9,#0x100, LSL #12
00a3f33c	add x0,x0,x1, ASR #0x15
00a3f340	and x1,x1,#-0x200000
00a3f344	sub x9,x9,x1
00a3f348	add x1,x10,#0x100, LSL #12
00a3f34c	add x2,x2,x1, ASR #0x15
00a3f350	and x1,x1,#-0x200000
00a3f354	and x24,x24,#-0x200000
00a3f358	sub x10,x10,x1
00a3f35c	add x1,x4,x25, ASR #0x15
00a3f360	add x7,x7,x3, ASR #0x15
00a3f364	sub x22,x22,x24
00a3f368	add x1,x1,x7, ASR #0x15
00a3f36c	add x4,x22,x23, ASR #0x15
00a3f370	add x5,x5,x1, ASR #0x15
00a3f374	add x4,x4,x5, ASR #0x15
00a3f378	add x22,x8,x4, ASR #0x15
00a3f37c	add x23,x12,x22, ASR #0x15
00a3f380	and x16,x16,#-0x200000
00a3f384	add x12,x9,x23, ASR #0x15
00a3f388	sub x2,x2,x16
00a3f38c	add x16,x0,x12, ASR #0x15
00a3f390	add x9,x10,x16, ASR #0x15
00a3f394	add x10,x2,x9, ASR #0x15
00a3f398	add x8,x6,x10, ASR #0x15
00a3f39c	asr x0,x8,#0x15
00a3f3a0	and x1,x1,#0x1fffff
00a3f3a4	madd x11,x0,x11,x1
00a3f3a8	and x1,x5,#0x1fffff
00a3f3ac	and x3,x3,#0x1fffff
00a3f3b0	and x2,x7,#0x1fffff
00a3f3b4	madd x17,x0,x17,x1
00a3f3b8	and x1,x4,#0x1fffff
00a3f3bc	madd x15,x0,x15,x3
00a3f3c0	madd x13,x0,x18,x2
00a3f3c4	madd x14,x0,x14,x1
00a3f3c8	and x1,x22,#0x1fffff
00a3f3cc	madd x18,x0,x30,x1
00a3f3d0	add x13,x13,x15, ASR #0x15
00a3f3d4	lsr x0,x15,#0x8
00a3f3d8	strb w15,[x21, #0x20]
00a3f3dc	ubfx w15,w15,#0x10,#0x5
00a3f3e0	strb w0,[x21, #0x21]
00a3f3e4	and w0,w13,#0x1fffff
00a3f3e8	bfm w15,w0,#0x1b,#0x14
00a3f3ec	lsr x0,x13,#0x3
00a3f3f0	add x11,x11,x13, ASR #0x15
00a3f3f4	strb w0,[x21, #0x23]
00a3f3f8	lsr x0,x13,#0xb
00a3f3fc	ubfx w13,w13,#0x13,#0x2
00a3f400	strb w15,[x21, #0x22]
00a3f404	and w15,w11,#0x1fffff
00a3f408	bfm w13,w15,#0x1e,#0x14
00a3f40c	lsr x15,x11,#0x6
00a3f410	strb w15,[x21, #0x26]
00a3f414	add x15,x17,x11, ASR #0x15
00a3f418	ubfx w11,w11,#0xe,#0x7
00a3f41c	strb w13,[x21, #0x25]
00a3f420	and w13,w15,#0x1fffff
00a3f424	bfm w11,w13,#0x19,#0x14
00a3f428	lsr x13,x15,#0x1
00a3f42c	strb w13,[x21, #0x28]
00a3f430	lsr x13,x15,#0x9
00a3f434	strb w13,[x21, #0x29]
00a3f438	add x13,x14,x15, ASR #0x15
00a3f43c	ubfx w14,w15,#0x11,#0x4
00a3f440	strb w11,[x21, #0x27]
00a3f444	and w11,w13,#0x1fffff
00a3f448	bfm w14,w11,#0x1c,#0x14
00a3f44c	lsr x11,x13,#0x4
00a3f450	strb w11,[x21, #0x2b]
00a3f454	lsr x11,x13,#0xc
00a3f458	strb w11,[x21, #0x2c]
00a3f45c	add x11,x18,x13, ASR #0x15
00a3f460	ubfx w13,w13,#0x14,#0x1
00a3f464	strb w14,[x21, #0x2a]
00a3f468	and w14,w11,#0x1fffff
00a3f46c	bfm w13,w14,#0x1f,#0x14
00a3f470	lsr x14,x11,#0x7
00a3f474	strb w14,[x21, #0x2e]
00a3f478	and x14,x23,#0x1fffff
00a3f47c	add x14,x14,x11, ASR #0x15
00a3f480	ubfx w11,w11,#0xf,#0x6
00a3f484	strb w13,[x21, #0x2d]
00a3f488	and w13,w14,#0x1fffff
00a3f48c	bfm w11,w13,#0x1a,#0x14
00a3f490	strb w11,[x21, #0x2f]
00a3f494	and x11,x12,#0x1fffff
00a3f498	add x11,x11,x14, ASR #0x15
00a3f49c	ubfx w12,w14,#0x12,#0x3
00a3f4a0	bfm w12,w11,#0x1d,#0x1c
00a3f4a4	strb w12,[x21, #0x32]
00a3f4a8	lsr x12,x11,#0x5
00a3f4ac	strb w12,[x21, #0x33]
00a3f4b0	and x12,x16,#0x1fffff
00a3f4b4	and x9,x9,#0x1fffff
00a3f4b8	add x12,x12,x11, ASR #0x15
00a3f4bc	lsr x11,x11,#0xd
00a3f4c0	add x9,x9,x12, ASR #0x15
00a3f4c4	strb w11,[x21, #0x34]
00a3f4c8	lsr x11,x12,#0x8
00a3f4cc	strb w12,[x21, #0x35]
00a3f4d0	ubfx w12,w12,#0x10,#0x5
00a3f4d4	strb w11,[x21, #0x36]
00a3f4d8	and w11,w9,#0x1fffff
00a3f4dc	bfm w12,w11,#0x1b,#0x14
00a3f4e0	lsr x11,x9,#0x3
00a3f4e4	and x10,x10,#0x1fffff
00a3f4e8	strb w11,[x21, #0x38]
00a3f4ec	lsr x11,x9,#0xb
00a3f4f0	add x10,x10,x9, ASR #0x15
00a3f4f4	strb w11,[x21, #0x39]
00a3f4f8	ubfx w9,w9,#0x13,#0x2
00a3f4fc	and w11,w10,#0x1fffff
00a3f500	bfm w9,w11,#0x1e,#0x14
00a3f504	and x8,x8,#0x1fffff
00a3f508	strb w9,[x21, #0x3a]
00a3f50c	add x8,x8,x10, ASR #0x15
00a3f510	ubfx w9,w10,#0xe,#0x7
00a3f514	bfm w9,w8,#0x19,#0x18
00a3f518	lsr x13,x14,#0x2
00a3f51c	strb w9,[x21, #0x3c]
00a3f520	lsr x9,x8,#0x1
00a3f524	strb w13,[x21, #0x30]
00a3f528	lsr x13,x14,#0xa
00a3f52c	lsr x11,x10,#0x6
00a3f530	strb w9,[x21, #0x3d]
00a3f534	lsr x9,x8,#0x9
00a3f538	lsr x8,x8,#0x11
00a3f53c	mov w25,#0x1
00a3f540	strb w0,[x21, #0x24]
00a3f544	strb w13,[x21, #0x31]
00a3f548	strb w12,[x21, #0x37]
00a3f54c	strb w11,[x21, #0x3b]
00a3f550	strb w9,[x21, #0x3e]
00a3f554	strb w8,[x21, #0x3f]
00a3f558	b 0x00a3f560
00a3f55c	mov w25,wzr
00a3f560	add x0,sp,#0x218
00a3f564	mov w1,#0x40
00a3f568	bl 0x00c34750
00a3f56c	add x0,sp,#0x258
00a3f570	mov w1,#0x40
00a3f574	bl 0x00c34750
00a3f578	mov x0,x19
00a3f57c	bl 0x00c35800
00a3f580	mov x0,x20
00a3f584	bl 0x00c31f90
00a3f588	mov w0,w25
00a3f58c	add sp,sp,#0x310
00a3f590	ldp x29,x30,[sp, #0x50]
00a3f594	ldp x20,x19,[sp, #0x40]
00a3f598	ldp x22,x21,[sp, #0x30]
00a3f59c	ldp x24,x23,[sp, #0x20]
00a3f5a0	ldp x26,x25,[sp, #0x10]
00a3f5a4	ldp x28,x27,[sp], #0x60
00a3f5a8	ret
