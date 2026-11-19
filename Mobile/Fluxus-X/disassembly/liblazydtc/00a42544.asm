; ossl_x25519 @ 00a42544
00a42544	stp x28,x27,[sp, #-0x60]!
00a42548	stp x26,x25,[sp, #0x10]
00a4254c	stp x24,x23,[sp, #0x20]
00a42550	stp x22,x21,[sp, #0x30]
00a42554	stp x20,x19,[sp, #0x40]
00a42558	stp x29,x30,[sp, #0x50]
00a4255c	add x29,sp,#0x50
00a42560	sub sp,sp,#0x230
00a42564	stp xzr,xzr,[sp, #0x48]
00a42568	stp xzr,xzr,[sp, #0x58]
00a4256c	ldr q0,[x1]
00a42570	mov x8,xzr
00a42574	str x0,[sp, #0x8]
00a42578	mov x18,xzr
00a4257c	str q0,[sp, #0x70]
00a42580	ldr q0,[x1, #0x10]
00a42584	ldrb w5,[sp, #0x70]
00a42588	mov w1,#0x40
00a4258c	mov x14,xzr
00a42590	str q0,[sp, #0x80]
00a42594	and w5,w5,#0xf8
00a42598	strb w5,[sp, #0x70]
00a4259c	ldrb w5,[sp, #0x8f]
00a425a0	mov x30,xzr
00a425a4	mov x28,xzr
00a425a8	mov x6,xzr
00a425ac	bfxil w1,w5,#0x0,#0x6
00a425b0	strb w1,[sp, #0x8f]
00a425b4	ldrb w1,[x2]
00a425b8	ldrb w5,[x2, #0x1]
00a425bc	ldrb w7,[x2, #0x7]
00a425c0	ldrb w19,[x2, #0x8]
00a425c4	ldrb w20,[x2, #0xd]
00a425c8	ldrb w21,[x2, #0xe]
00a425cc	bfm x1,x5,#0x38,#0x7
00a425d0	ldrb w5,[x2, #0x1a]
00a425d4	bfm x7,x19,#0x38,#0x7
00a425d8	ldrb w19,[x2, #0x1b]
00a425dc	bfm x20,x21,#0x38,#0x7
00a425e0	ldrb w21,[x2, #0x2]
00a425e4	ldrb w22,[x2, #0x14]
00a425e8	ldrb w23,[x2, #0x15]
00a425ec	bfm x5,x19,#0x38,#0x7
00a425f0	ldrb w19,[x2, #0xf]
00a425f4	bfm x1,x21,#0x30,#0x7
00a425f8	ldrb w21,[x2, #0x16]
00a425fc	bfm x22,x23,#0x38,#0x7
00a42600	ldrb w23,[x2, #0x9]
00a42604	bfm x20,x19,#0x30,#0x7
00a42608	ldrb w19,[x2, #0x3]
00a4260c	bfm x22,x21,#0x30,#0x7
00a42610	ldrb w21,[x2, #0xa]
00a42614	bfm x7,x23,#0x30,#0x7
00a42618	ldrb w23,[x2, #0x1c]
00a4261c	bfm x1,x19,#0x28,#0x7
00a42620	ldrb w19,[x2, #0x17]
00a42624	bfm x7,x21,#0x28,#0x7
00a42628	ldrb w21,[x2, #0x1d]
00a4262c	bfm x5,x23,#0x30,#0x7
00a42630	ldrb w23,[x2, #0x10]
00a42634	bfm x22,x19,#0x28,#0x7
00a42638	ldrb w19,[x2, #0xb]
00a4263c	bfm x5,x21,#0x28,#0x7
00a42640	ldrb w21,[x2, #0x11]
00a42644	bfm x20,x23,#0x28,#0x7
00a42648	ldrb w23,[x2, #0x4]
00a4264c	bfm x7,x19,#0x20,#0x7
00a42650	ldrb w19,[x2, #0x1e]
00a42654	bfm x20,x21,#0x20,#0x7
00a42658	ldrb w21,[x2, #0x5]
00a4265c	bfm x1,x23,#0x20,#0x7
00a42660	ldrb w23,[x2, #0x18]
00a42664	bfm x5,x19,#0x20,#0x7
00a42668	ldrb w19,[x2, #0x12]
00a4266c	bfm x1,x21,#0x18,#0x7
00a42670	ldrb w21,[x2, #0x19]
00a42674	bfm x22,x23,#0x20,#0x7
00a42678	bfm x20,x19,#0x18,#0x7
00a4267c	ldrb w19,[x2, #0x1f]
00a42680	ldrb w23,[x2, #0xc]
00a42684	bfm x22,x21,#0x18,#0x7
00a42688	ldrb w21,[x2, #0x6]
00a4268c	ldrb w2,[x2, #0x13]
00a42690	bfm x5,x19,#0x18,#0x17
00a42694	bfm x7,x23,#0x18,#0x7
00a42698	orr x19,x1,x21, LSL #0x30
00a4269c	orr x21,x20,x2, LSL #0x30
00a426a0	ubfiz x1,x5,#0x4,#0x2f
00a426a4	ubfx x5,x22,#0x2c,#0xd
00a426a8	ubfx x2,x7,#0x2e,#0xd
00a426ac	orr x10,x1,x5
00a426b0	ubfiz x5,x21,#0x2,#0x31
00a426b4	orr x8,x5,x2
00a426b8	ubfiz x5,x7,#0x5,#0x2e
00a426bc	ubfiz x22,x22,#0x7,#0x2c
00a426c0	orr x2,x5,x19, LSR #0x33
00a426c4	ubfx x5,x21,#0x31,#0xd
00a426c8	mov x9,xzr
00a426cc	mov x12,xzr
00a426d0	mov x13,xzr
00a426d4	mov w4,wzr
00a426d8	mov w15,#0x1
00a426dc	orr w26,wzr,#0xfe
00a426e0	mov x20,xzr
00a426e4	and x0,x19,#0x7ffffffffffff
00a426e8	orr x16,x22,x5
00a426ec	mov w3,#0x1
00a426f0	stp x15,xzr,[sp, #0x138]
00a426f4	stp xzr,xzr,[sp, #0x150]
00a426f8	str xzr,[sp, #0x148]
00a426fc	stp xzr,xzr,[sp, #0x128]
00a42700	stp xzr,xzr,[sp, #0x118]
00a42704	stp xzr,xzr,[sp, #0x108]
00a42708	stp x15,xzr,[sp, #0xe8]
00a4270c	stp xzr,xzr,[sp, #0xf8]
00a42710	stp x0,x2,[sp, #0x160]
00a42714	stp x8,x16,[sp, #0x170]
00a42718	str x10,[sp, #0x180]
00a4271c	b 0x00a42794
00a42720	ldr x10,[sp, #0x120]
00a42724	and x8,x20,#0x7ffffffffffff
00a42728	extr x17,x24,x23,#0x33
00a4272c	and x4,x19,#0x7ffffffffffff
00a42730	str x10,[sp, #0x60]
00a42734	ldr x10,[sp, #0x128]
00a42738	add x8,x8,x17
00a4273c	ldp x3,x13,[sp, #0x138]
00a42740	ldp x12,x9,[sp, #0x148]
00a42744	str x10,[sp, #0x58]
00a42748	ldr x10,[sp, #0x130]
00a4274c	ldr x6,[sp, #0x158]
00a42750	ldp x28,x30,[sp, #0x110]
00a42754	ldp x15,x14,[sp, #0xe8]
00a42758	str x10,[sp, #0x50]
00a4275c	ldr x10,[sp, #0x108]
00a42760	ldp x20,x18,[sp, #0xf8]
00a42764	add x16,x4,x8, LSR #0x33
00a42768	ldr w4,[sp, #0x14]
00a4276c	and x0,x22,#0x7ffffffffffff
00a42770	extr x1,x25,x21,#0x33
00a42774	and x2,x23,#0x7ffffffffffff
00a42778	madd x1,x1,x27,x0
00a4277c	sub w26,w26,#0x1
00a42780	str x10,[sp, #0x48]
00a42784	add x2,x2,x1, LSR #0x33
00a42788	and x0,x1,#0x7ffffffffffff
00a4278c	and x8,x8,#0x7ffffffffffff
00a42790	and x10,x21,#0x7ffffffffffff
00a42794	lsr w21,w26,#0x3
00a42798	eor x25,x8,x12
00a4279c	mov x19,x8
00a427a0	add x8,sp,#0x70
00a427a4	ldrb w21,[x8, w21, UXTW ]
00a427a8	and w22,w26,#0x7
00a427ac	str x10,[sp, #0x30]
00a427b0	eor x27,x10,x6
00a427b4	mov x10,x28
00a427b8	eor x28,x28,x15
00a427bc	mov x11,x30
00a427c0	eor x30,x30,x14
00a427c4	lsr w21,w21,w22
00a427c8	mov x1,x15
00a427cc	mov x15,x14
00a427d0	ldp x17,x14,[sp, #0x58]
00a427d4	and w8,w21,#0x1
00a427d8	eor w4,w8,w4
00a427dc	str w26,[sp, #0x6c]
00a427e0	eor x23,x0,x3
00a427e4	eor x24,x2,x13
00a427e8	eor x26,x16,x9
00a427ec	neg x4,x4
00a427f0	mov x7,x13
00a427f4	eor x22,x14,x20
00a427f8	and x21,x23,x4
00a427fc	and x23,x24,x4
00a42800	and x24,x25,x4
00a42804	and x25,x26,x4
00a42808	and x26,x27,x4
00a4280c	and x27,x28,x4
00a42810	and x28,x30,x4
00a42814	eor x30,x17,x18
00a42818	mov x5,x0
00a4281c	mov x13,x18
00a42820	mov x18,x20
00a42824	ldp x20,x0,[sp, #0x48]
00a42828	str w8,[sp, #0x14]
00a4282c	and x22,x22,x4
00a42830	and x30,x30,x4
00a42834	eor x8,x0,x20
00a42838	and x8,x8,x4
00a4283c	eor x4,x23,x7
00a42840	eor x12,x24,x12
00a42844	stp x4,x12,[sp, #0x38]
00a42848	ldr x12,[sp, #0x30]
00a4284c	eor x7,x23,x2
00a42850	eor x2,x24,x19
00a42854	orr x24,xzr,#0xffffffffffffe
00a42858	eor x3,x21,x3
00a4285c	eor x5,x21,x5
00a42860	eor x4,x25,x9
00a42864	eor x19,x25,x16
00a42868	eor x9,x26,x6
00a4286c	eor x16,x26,x12
00a42870	eor x21,x27,x10
00a42874	eor x6,x27,x1
00a42878	eor x10,x28,x11
00a4287c	eor x12,x28,x15
00a42880	eor x11,x22,x14
00a42884	eor x14,x30,x17
00a42888	eor x17,x8,x0
00a4288c	eor x8,x8,x20
00a42890	add x20,x7,x24
00a42894	eor x15,x22,x18
00a42898	eor x18,x30,x13
00a4289c	stp x6,x12,[sp, #0xe8]
00a428a0	add x7,x12,x7
00a428a4	sub x12,x20,x12
00a428a8	ldp x13,x20,[sp, #0x38]
00a428ac	mov x0,#-0x26
00a428b0	movk x0,#0xf, LSL #48
00a428b4	mov x25,#-0x26
00a428b8	add x0,x5,x0
00a428bc	movk x25,#0xf, LSL #48
00a428c0	add x22,x2,x24
00a428c4	add x23,x19,x24
00a428c8	add x24,x16,x24
00a428cc	orr x27,xzr,#0xffffffffffffe
00a428d0	stp x15,x18,[sp, #0xf8]
00a428d4	str x8,[sp, #0x108]
00a428d8	add x5,x6,x5
00a428dc	sub x0,x0,x6
00a428e0	add x6,x3,x25
00a428e4	add x25,x13,x27
00a428e8	add x2,x15,x2
00a428ec	sub x15,x22,x15
00a428f0	add x22,x20,x27
00a428f4	add x26,x18,x19
00a428f8	sub x18,x23,x18
00a428fc	add x23,x4,x27
00a42900	add x1,x8,x16
00a42904	sub x8,x24,x8
00a42908	add x24,x9,x27
00a4290c	add x27,x21,x3
00a42910	add x16,x10,x13
00a42914	add x28,x11,x20
00a42918	add x20,x14,x4
00a4291c	add x9,x17,x9
00a42920	sub x21,x6,x21
00a42924	sub x19,x25,x10
00a42928	sub x25,x22,x11
00a4292c	sub x23,x23,x14
00a42930	sub x22,x24,x17
00a42934	stp x2,x26,[sp, #0x120]
00a42938	stp x0,x12,[sp, #0xc0]
00a4293c	str x1,[sp, #0x130]
00a42940	add x0,sp,#0xe8
00a42944	add x1,sp,#0xc0
00a42948	add x2,sp,#0x138
00a4294c	str x16,[sp, #0x58]
00a42950	stp x27,x9,[sp, #0x48]
00a42954	stp x27,x16,[sp, #0x138]
00a42958	stp x28,x20,[sp, #0x148]
00a4295c	str x9,[sp, #0x158]
00a42960	stp x5,x7,[sp, #0x110]
00a42964	stp x15,x18,[sp, #0xd0]
00a42968	str x8,[sp, #0xe0]
00a4296c	stp x21,x19,[sp, #0x98]
00a42970	stp x25,x23,[sp, #0xa8]
00a42974	str x22,[sp, #0x20]
00a42978	str x22,[sp, #0xb8]
00a4297c	bl 0x00a46a4c
00a42980	add x0,sp,#0x110
00a42984	add x1,sp,#0x110
00a42988	add x2,sp,#0x98
00a4298c	bl 0x00a46a4c
00a42990	lsl x8,x21,#0x1
00a42994	mov w13,#0x13
00a42998	mul x9,x22,x13
00a4299c	mul x15,x19,x19
00a429a0	ldp x17,x0,[sp, #0xe8]
00a429a4	ldp x18,x1,[sp, #0x110]
00a429a8	mul x22,x8,x25
00a429ac	umulh x14,x19,x19
00a429b0	mul x13,x23,x13
00a429b4	adds x15,x22,x15
00a429b8	umulh x22,x8,x25
00a429bc	umulh x10,x21,x21
00a429c0	mul x12,x21,x21
00a429c4	lsl x11,x19,#0x1
00a429c8	umulh x21,x8,x19
00a429cc	mul x19,x8,x19
00a429d0	adcs x14,x22,x14
00a429d4	mul x22,x13,x23
00a429d8	adds x30,x22,x19
00a429dc	umulh x19,x13,x23
00a429e0	adcs x19,x19,x21
00a429e4	add x21,x18,x17
00a429e8	str x21,[sp, #0x28]
00a429ec	mov x21,#-0x26
00a429f0	ldp x2,x4,[sp, #0xf8]
00a429f4	ldp x3,x5,[sp, #0x120]
00a429f8	movk x21,#0xf, LSL #48
00a429fc	add x17,x17,x21
00a42a00	sub x22,x17,x18
00a42a04	add x17,x1,x0
00a42a08	orr x18,xzr,#0xffffffffffffe
00a42a0c	str x17,[sp, #0x30]
00a42a10	add x17,x0,x18
00a42a14	ldr x6,[sp, #0x108]
00a42a18	ldr x7,[sp, #0x130]
00a42a1c	sub x27,x17,x1
00a42a20	add x17,x3,x2
00a42a24	str x17,[sp, #0x40]
00a42a28	add x17,x2,x18
00a42a2c	sub x26,x17,x3
00a42a30	add x17,x5,x4
00a42a34	str x17,[sp, #0x38]
00a42a38	add x17,x4,x18
00a42a3c	sub x21,x17,x5
00a42a40	add x17,x7,x6
00a42a44	lsl x16,x23,#0x1
00a42a48	str x17,[sp, #0x60]
00a42a4c	add x17,x6,x18
00a42a50	sub x24,x17,x7
00a42a54	mul x17,x9,x16
00a42a58	adds x15,x15,x17
00a42a5c	lsl x17,x25,#0x1
00a42a60	umulh x16,x9,x16
00a42a64	adcs x14,x14,x16
00a42a68	mul x16,x13,x17
00a42a6c	adds x12,x16,x12
00a42a70	umulh x13,x13,x17
00a42a74	adcs x10,x13,x10
00a42a78	mul x13,x9,x11
00a42a7c	adds x12,x12,x13
00a42a80	umulh x13,x9,x11
00a42a84	ldr x1,[sp, #0x20]
00a42a88	adcs x10,x10,x13
00a42a8c	mul x13,x9,x17
00a42a90	adds x13,x30,x13
00a42a94	umulh x17,x9,x17
00a42a98	mul x16,x8,x23
00a42a9c	adcs x17,x19,x17
00a42aa0	mul x0,x11,x25
00a42aa4	umulh x18,x8,x1
00a42aa8	adds x16,x16,x0
00a42aac	umulh x0,x9,x1
00a42ab0	mul x9,x9,x1
00a42ab4	mul x1,x8,x1
00a42ab8	umulh x8,x8,x23
00a42abc	umulh x2,x11,x23
00a42ac0	mul x3,x11,x23
00a42ac4	umulh x11,x11,x25
00a42ac8	adcs x8,x8,x11
00a42acc	adds x9,x16,x9
00a42ad0	adcs x8,x8,x0
00a42ad4	extr x14,x14,x15,#0x33
00a42ad8	adds x9,x9,x14
00a42adc	extr x10,x10,x12,#0x33
00a42ae0	adcs x8,x8,xzr
00a42ae4	adds x10,x13,x10
00a42ae8	mul x16,x25,x25
00a42aec	adcs x17,x17,xzr
00a42af0	umulh x11,x25,x25
00a42af4	adds x16,x3,x16
00a42af8	ldp x4,x7,[sp, #0x48]
00a42afc	adcs x11,x2,x11
00a42b00	ldr x5,[sp, #0x58]
00a42b04	adds x16,x16,x1
00a42b08	adcs x11,x11,x18
00a42b0c	extr x8,x8,x9,#0x33
00a42b10	adds x8,x16,x8
00a42b14	umulh x0,x4,x4
00a42b18	mul x14,x4,x4
00a42b1c	lsl x4,x4,#0x1
00a42b20	adcs x11,x11,xzr
00a42b24	mov w6,#0x13
00a42b28	mul x2,x5,x5
00a42b2c	mul x16,x4,x28
00a42b30	and x12,x12,#0x7ffffffffffff
00a42b34	extr x11,x11,x8,#0x33
00a42b38	umulh x3,x5,x5
00a42b3c	and x15,x15,#0x7ffffffffffff
00a42b40	extr x17,x17,x10,#0x33
00a42b44	mul x1,x20,x6
00a42b48	adds x16,x16,x2
00a42b4c	madd x11,x11,x6,x12
00a42b50	umulh x12,x4,x28
00a42b54	add x15,x15,x17
00a42b58	lsl x17,x5,#0x1
00a42b5c	umulh x2,x4,x5
00a42b60	mul x5,x4,x5
00a42b64	adcs x12,x12,x3
00a42b68	mul x3,x1,x20
00a42b6c	mul x13,x7,x6
00a42b70	lsl x18,x20,#0x1
00a42b74	adds x3,x3,x5
00a42b78	umulh x5,x1,x20
00a42b7c	adcs x2,x5,x2
00a42b80	mul x5,x13,x18
00a42b84	adds x16,x16,x5
00a42b88	lsl x5,x28,#0x1
00a42b8c	umulh x18,x13,x18
00a42b90	adcs x12,x12,x18
00a42b94	mul x18,x1,x5
00a42b98	adds x14,x18,x14
00a42b9c	umulh x1,x1,x5
00a42ba0	adcs x0,x1,x0
00a42ba4	mul x1,x13,x17
00a42ba8	adds x14,x14,x1
00a42bac	umulh x1,x13,x17
00a42bb0	adcs x0,x0,x1
00a42bb4	mul x1,x13,x5
00a42bb8	adds x1,x3,x1
00a42bbc	umulh x5,x13,x5
00a42bc0	mul x18,x4,x20
00a42bc4	adcs x2,x2,x5
00a42bc8	mul x5,x17,x28
00a42bcc	umulh x3,x4,x7
00a42bd0	adds x18,x18,x5
00a42bd4	umulh x5,x13,x7
00a42bd8	mul x13,x13,x7
00a42bdc	mul x6,x4,x7
00a42be0	umulh x4,x4,x20
00a42be4	umulh x7,x17,x20
00a42be8	mul x19,x17,x20
00a42bec	umulh x17,x17,x28
00a42bf0	adcs x17,x4,x17
00a42bf4	adds x13,x18,x13
00a42bf8	adcs x17,x17,x5
00a42bfc	extr x12,x12,x16,#0x33
00a42c00	adds x12,x13,x12
00a42c04	extr x13,x0,x14,#0x33
00a42c08	adcs x17,x17,xzr
00a42c0c	adds x13,x1,x13
00a42c10	mul x18,x28,x28
00a42c14	adcs x0,x2,xzr
00a42c18	adds x18,x19,x18
00a42c1c	umulh x1,x28,x28
00a42c20	adcs x1,x7,x1
00a42c24	and x16,x16,#0x7ffffffffffff
00a42c28	extr x0,x0,x13,#0x33
00a42c2c	adds x18,x18,x6
00a42c30	add x16,x16,x0
00a42c34	adcs x0,x1,x3
00a42c38	extr x17,x17,x12,#0x33
00a42c3c	adds x17,x18,x17
00a42c40	adcs x18,x0,xzr
00a42c44	mov w23,#0x13
00a42c48	and x14,x14,#0x7ffffffffffff
00a42c4c	extr x18,x18,x17,#0x33
00a42c50	and x9,x9,#0x7ffffffffffff
00a42c54	and x10,x10,#0x7ffffffffffff
00a42c58	madd x14,x18,x23,x14
00a42c5c	add x18,x9,x15, LSR #0x33
00a42c60	and x0,x15,#0x7ffffffffffff
00a42c64	and x15,x8,#0x7ffffffffffff
00a42c68	add x9,x10,x11, LSR #0x33
00a42c6c	and x19,x11,#0x7ffffffffffff
00a42c70	and x8,x12,#0x7ffffffffffff
00a42c74	stp x18,x9,[sp, #0x18]
00a42c78	stp x19,x9,[sp, #0xc0]
00a42c7c	and x9,x13,#0x7ffffffffffff
00a42c80	add x25,x8,x16, LSR #0x33
00a42c84	and x8,x17,#0x7ffffffffffff
00a42c88	stp x0,x18,[sp, #0xd0]
00a42c8c	and x23,x16,#0x7ffffffffffff
00a42c90	stp x0,x8,[sp, #0x48]
00a42c94	add x28,x9,x14, LSR #0x33
00a42c98	and x20,x14,#0x7ffffffffffff
00a42c9c	add x0,sp,#0x138
00a42ca0	add x1,sp,#0x98
00a42ca4	add x2,sp,#0xc0
00a42ca8	str x22,[sp, #0x110]
00a42cac	str x15,[sp, #0x58]
00a42cb0	str x15,[sp, #0xe0]
00a42cb4	stp x20,x28,[sp, #0x98]
00a42cb8	stp x23,x25,[sp, #0xa8]
00a42cbc	str x8,[sp, #0xb8]
00a42cc0	str x27,[sp, #0x118]
00a42cc4	bl 0x00a46a4c
00a42cc8	lsl x10,x22,#0x1
00a42ccc	mov w15,#0x13
00a42cd0	mul x13,x27,x27
00a42cd4	mul x0,x26,x10
00a42cd8	mul x11,x24,x15
00a42cdc	umulh x12,x27,x27
00a42ce0	mul x15,x21,x15
00a42ce4	adds x13,x0,x13
00a42ce8	umulh x0,x26,x10
00a42cec	mul x18,x27,x10
00a42cf0	adcs x12,x0,x12
00a42cf4	mul x0,x15,x21
00a42cf8	lsl x16,x21,#0x1
00a42cfc	umulh x17,x27,x10
00a42d00	adds x18,x0,x18
00a42d04	umulh x0,x15,x21
00a42d08	adcs x17,x0,x17
00a42d0c	mul x0,x11,x16
00a42d10	adds x13,x13,x0
00a42d14	lsl x0,x26,#0x1
00a42d18	umulh x16,x11,x16
00a42d1c	mul x9,x22,x22
00a42d20	adcs x12,x12,x16
00a42d24	mul x16,x15,x0
00a42d28	umulh x8,x22,x22
00a42d2c	lsl x14,x27,#0x1
00a42d30	adds x9,x16,x9
00a42d34	umulh x15,x15,x0
00a42d38	adcs x8,x15,x8
00a42d3c	mul x15,x11,x14
00a42d40	adds x9,x9,x15
00a42d44	umulh x15,x11,x14
00a42d48	adcs x8,x8,x15
00a42d4c	mul x15,x11,x0
00a42d50	adds x15,x18,x15
00a42d54	umulh x0,x11,x0
00a42d58	mul x16,x21,x10
00a42d5c	adcs x17,x17,x0
00a42d60	mul x0,x26,x14
00a42d64	umulh x18,x24,x10
00a42d68	adds x16,x16,x0
00a42d6c	mul x1,x24,x10
00a42d70	umulh x10,x21,x10
00a42d74	umulh x2,x21,x14
00a42d78	mul x3,x21,x14
00a42d7c	umulh x14,x26,x14
00a42d80	umulh x0,x11,x24
00a42d84	mul x11,x11,x24
00a42d88	adcs x10,x10,x14
00a42d8c	adds x11,x16,x11
00a42d90	adcs x10,x10,x0
00a42d94	extr x12,x12,x13,#0x33
00a42d98	adds x11,x11,x12
00a42d9c	extr x8,x8,x9,#0x33
00a42da0	adcs x10,x10,xzr
00a42da4	adds x8,x15,x8
00a42da8	mul x12,x26,x26
00a42dac	adcs x14,x17,xzr
00a42db0	adds x12,x3,x12
00a42db4	umulh x15,x26,x26
00a42db8	and x13,x13,#0x7ffffffffffff
00a42dbc	extr x14,x14,x8,#0x33
00a42dc0	adcs x15,x2,x15
00a42dc4	add x13,x13,x14
00a42dc8	mov x14,#-0x26
00a42dcc	movk x14,#0xf, LSL #48
00a42dd0	adds x12,x12,x1
00a42dd4	add x14,x20,x14
00a42dd8	ldp x21,x20,[sp, #0x18]
00a42ddc	ldr x22,[sp, #0x48]
00a42de0	adcs x15,x15,x18
00a42de4	extr x10,x10,x11,#0x33
00a42de8	adds x10,x12,x10
00a42dec	orr x0,xzr,#0xffffffffffffe
00a42df0	adcs x15,x15,xzr
00a42df4	mov w4,#0x13
00a42df8	add x16,x28,x0
00a42dfc	add x17,x23,x0
00a42e00	add x0,x25,x0
00a42e04	mov w2,#0xdb42
00a42e08	and x9,x9,#0x7ffffffffffff
00a42e0c	extr x15,x15,x10,#0x33
00a42e10	sub x17,x17,x22
00a42e14	sub x0,x0,x21
00a42e18	movk w2,#0x1, LSL #16
00a42e1c	madd x9,x15,x4,x9
00a42e20	and x8,x8,#0x7ffffffffffff
00a42e24	stp x17,x0,[sp, #0xa8]
00a42e28	mul x1,x17,x2
00a42e2c	umulh x17,x17,x2
00a42e30	add x8,x8,x9, LSR #0x33
00a42e34	and x9,x9,#0x7ffffffffffff
00a42e38	sub x14,x14,x19
00a42e3c	sub x16,x16,x20
00a42e40	mul x18,x0,x2
00a42e44	extr x12,x17,x1,#0x33
00a42e48	stp x9,x8,[sp, #0x110]
00a42e4c	ldp x8,x4,[sp, #0x50]
00a42e50	stp x14,x16,[sp, #0x98]
00a42e54	adds x12,x18,x12
00a42e58	mul x18,x14,x2
00a42e5c	umulh x14,x14,x2
00a42e60	umulh x0,x0,x2
00a42e64	lsr x17,x17,#0x33
00a42e68	mul x15,x16,x2
00a42e6c	adcs x17,x0,x17
00a42e70	extr x0,x14,x18,#0x33
00a42e74	orr x3,xzr,#0xffffffffffffe
00a42e78	adds x15,x15,x0
00a42e7c	ldp x5,x0,[sp, #0x28]
00a42e80	add x9,x8,x3
00a42e84	and x8,x11,#0x7ffffffffffff
00a42e88	add x11,x8,x13, LSR #0x33
00a42e8c	and x8,x13,#0x7ffffffffffff
00a42e90	sub x9,x9,x4
00a42e94	umulh x13,x16,x2
00a42e98	and x10,x10,#0x7ffffffffffff
00a42e9c	lsr x14,x14,#0x33
00a42ea0	str x10,[sp, #0x130]
00a42ea4	mul x10,x9,x2
00a42ea8	adcs x13,x13,x14
00a42eac	extr x14,x17,x12,#0x33
00a42eb0	stp x8,x11,[sp, #0x120]
00a42eb4	umulh x11,x0,x0
00a42eb8	adds x10,x14,x10
00a42ebc	mul x14,x0,x0
00a42ec0	mov x7,x0
00a42ec4	ldp x6,x0,[sp, #0x38]
00a42ec8	str x9,[sp, #0xb8]
00a42ecc	umulh x9,x9,x2
00a42ed0	lsr x16,x17,#0x33
00a42ed4	adcs x9,x16,x9
00a42ed8	lsl x8,x5,#0x1
00a42edc	mov w2,#0x13
00a42ee0	and x17,x1,#0x7fffffffffffe
00a42ee4	extr x13,x13,x15,#0x33
00a42ee8	and x18,x18,#0x7fffffffffffe
00a42eec	extr x9,x9,x10,#0x33
00a42ef0	and x10,x10,#0x7ffffffffffff
00a42ef4	add x13,x17,x13
00a42ef8	mul x17,x0,x8
00a42efc	madd x9,x9,x2,x18
00a42f00	umulh x18,x0,x8
00a42f04	mov x3,x0
00a42f08	add x0,x10,x4
00a42f0c	ldr x4,[sp, #0x60]
00a42f10	mul x16,x6,x2
00a42f14	adds x14,x17,x14
00a42f18	and x12,x12,#0x7ffffffffffff
00a42f1c	mul x17,x7,x8
00a42f20	adcs x11,x18,x11
00a42f24	mul x18,x16,x6
00a42f28	add x12,x12,x13, LSR #0x33
00a42f2c	and x13,x13,#0x7ffffffffffff
00a42f30	mov w1,#0x13
00a42f34	adds x17,x18,x17
00a42f38	add x18,x13,x22
00a42f3c	stp x13,x12,[sp, #0xf8]
00a42f40	add x13,x12,x21
00a42f44	umulh x12,x7,x8
00a42f48	str x10,[sp, #0x108]
00a42f4c	umulh x10,x16,x6
00a42f50	and x15,x15,#0x7ffffffffffff
00a42f54	adcs x10,x10,x12
00a42f58	mul x12,x4,x1
00a42f5c	lsl x1,x6,#0x1
00a42f60	add x15,x15,x9, LSR #0x33
00a42f64	and x9,x9,#0x7ffffffffffff
00a42f68	mul x2,x12,x1
00a42f6c	stp x9,x15,[sp, #0xe8]
00a42f70	add x15,x15,x20
00a42f74	adds x20,x14,x2
00a42f78	stp x18,x13,[sp, #0xd0]
00a42f7c	lsl x18,x3,#0x1
00a42f80	umulh x1,x12,x1
00a42f84	add x9,x9,x19
00a42f88	mul x14,x5,x5
00a42f8c	adcs x11,x11,x1
00a42f90	mul x1,x16,x18
00a42f94	stp x9,x15,[sp, #0xc0]
00a42f98	umulh x9,x5,x5
00a42f9c	lsl x15,x7,#0x1
00a42fa0	adds x14,x1,x14
00a42fa4	umulh x16,x16,x18
00a42fa8	adcs x9,x16,x9
00a42fac	mul x16,x12,x15
00a42fb0	adds x22,x14,x16
00a42fb4	umulh x14,x12,x15
00a42fb8	adcs x9,x9,x14
00a42fbc	mul x14,x12,x18
00a42fc0	adds x14,x17,x14
00a42fc4	umulh x17,x12,x18
00a42fc8	umulh x13,x6,x8
00a42fcc	umulh x1,x4,x8
00a42fd0	mul x18,x4,x8
00a42fd4	mul x8,x6,x8
00a42fd8	adcs x10,x10,x17
00a42fdc	mul x17,x3,x15
00a42fe0	adds x8,x8,x17
00a42fe4	umulh x17,x6,x15
00a42fe8	mul x2,x6,x15
00a42fec	umulh x15,x3,x15
00a42ff0	umulh x16,x12,x4
00a42ff4	mul x12,x12,x4
00a42ff8	adcs x13,x13,x15
00a42ffc	adds x8,x8,x12
00a43000	adcs x12,x13,x16
00a43004	extr x11,x11,x20,#0x33
00a43008	adds x19,x8,x11
00a4300c	extr x8,x9,x22,#0x33
00a43010	adcs x9,x12,xzr
00a43014	adds x23,x14,x8
00a43018	mul x8,x3,x3
00a4301c	adcs x24,x10,xzr
00a43020	adds x8,x2,x8
00a43024	umulh x10,x3,x3
00a43028	adcs x10,x17,x10
00a4302c	ldr w26,[sp, #0x6c]
00a43030	adds x8,x8,x18
00a43034	adcs x10,x10,x1
00a43038	extr x9,x9,x19,#0x33
00a4303c	adds x21,x8,x9
00a43040	str x0,[sp, #0xe0]
00a43044	add x0,sp,#0xe8
00a43048	add x1,sp,#0x160
00a4304c	add x2,sp,#0x110
00a43050	mov w27,#0x13
00a43054	adcs x25,x10,xzr
00a43058	bl 0x00a46a4c
00a4305c	add x0,sp,#0x110
00a43060	add x1,sp,#0x98
00a43064	add x2,sp,#0xc0
00a43068	bl 0x00a46a4c
00a4306c	cbnz w26,0x00a42720
00a43070	ldp x8,x9,[sp, #0x110]
00a43074	ldp x10,x11,[sp, #0x120]
00a43078	ldr x12,[sp, #0x130]
00a4307c	mov w20,#0x13
00a43080	umulh x13,x8,x8
00a43084	mul x14,x8,x8
00a43088	lsl x8,x8,#0x1
00a4308c	mul x17,x9,x9
00a43090	mul x6,x10,x8
00a43094	umulh x16,x9,x9
00a43098	lsl x18,x9,#0x1
00a4309c	mul x0,x11,x20
00a430a0	umulh x5,x10,x8
00a430a4	adds x17,x6,x17
00a430a8	lsl x1,x11,#0x1
00a430ac	umulh x4,x8,x9
00a430b0	mul x9,x8,x9
00a430b4	umulh x7,x11,x8
00a430b8	mul x19,x11,x8
00a430bc	umulh x24,x11,x18
00a430c0	mul x25,x11,x18
00a430c4	umulh x27,x0,x11
00a430c8	mul x11,x0,x11
00a430cc	adcs x16,x5,x16
00a430d0	mul x15,x12,x20
00a430d4	adds x9,x11,x9
00a430d8	umulh x6,x15,x1
00a430dc	mul x1,x15,x1
00a430e0	adcs x4,x27,x4
00a430e4	lsl x3,x10,#0x1
00a430e8	adds x17,x17,x1
00a430ec	umulh x5,x0,x3
00a430f0	mul x0,x0,x3
00a430f4	adcs x16,x16,x6
00a430f8	adds x14,x0,x14
00a430fc	umulh x21,x12,x8
00a43100	mul x8,x12,x8
00a43104	umulh x22,x15,x12
00a43108	mul x12,x15,x12
00a4310c	umulh x26,x15,x18
00a43110	umulh x11,x15,x3
00a43114	mul x3,x15,x3
00a43118	mul x15,x15,x18
00a4311c	adcs x13,x5,x13
00a43120	adds x14,x14,x15
00a43124	adcs x13,x13,x26
00a43128	adds x9,x9,x3
00a4312c	umulh x23,x18,x10
00a43130	mul x18,x18,x10
00a43134	adcs x11,x4,x11
00a43138	and x15,x14,#0x7ffffffffffff
00a4313c	extr x13,x13,x14,#0x33
00a43140	adds x14,x19,x18
00a43144	and x1,x17,#0x7ffffffffffff
00a43148	extr x16,x16,x17,#0x33
00a4314c	adcs x17,x7,x23
00a43150	adds x12,x14,x12
00a43154	adcs x14,x17,x22
00a43158	adds x12,x12,x16
00a4315c	adcs x14,x14,xzr
00a43160	adds x9,x9,x13
00a43164	umulh x2,x10,x10
00a43168	mul x10,x10,x10
00a4316c	adcs x11,x11,xzr
00a43170	adds x10,x25,x10
00a43174	and x13,x9,#0x7ffffffffffff
00a43178	extr x9,x11,x9,#0x33
00a4317c	adcs x11,x24,x2
00a43180	adds x8,x10,x8
00a43184	and x16,x12,#0x7ffffffffffff
00a43188	extr x12,x14,x12,#0x33
00a4318c	adcs x11,x11,x21
00a43190	adds x8,x8,x12
00a43194	adcs x11,x11,xzr
00a43198	add x9,x1,x9
00a4319c	and x2,x8,#0x7ffffffffffff
00a431a0	extr x8,x11,x8,#0x33
00a431a4	add x10,x16,x9, LSR #0x33
00a431a8	madd x8,x8,x20,x15
00a431ac	lsl x16,x10,#0x1
00a431b0	mul x11,x2,x20
00a431b4	add x13,x13,x8, LSR #0x33
00a431b8	umulh x4,x11,x16
00a431bc	mul x16,x11,x16
00a431c0	and x8,x8,#0x7ffffffffffff
00a431c4	mul x19,x13,x13
00a431c8	and x9,x9,#0x7ffffffffffff
00a431cc	lsl x6,x8,#0x1
00a431d0	umulh x7,x13,x13
00a431d4	adds x16,x19,x16
00a431d8	mul x24,x6,x9
00a431dc	adcs x4,x7,x4
00a431e0	mul x14,x10,x20
00a431e4	lsl x18,x9,#0x1
00a431e8	umulh x23,x6,x9
00a431ec	adds x16,x16,x24
00a431f0	umulh x12,x14,x10
00a431f4	mul x0,x14,x10
00a431f8	umulh x1,x14,x18
00a431fc	mul x14,x14,x18
00a43200	stp x8,x13,[x29, #-0x80]
00a43204	umulh x24,x8,x8
00a43208	mul x8,x8,x8
00a4320c	adcs x4,x4,x23
00a43210	lsl x21,x13,#0x1
00a43214	adds x8,x8,x14
00a43218	umulh x15,x11,x2
00a4321c	mul x3,x11,x2
00a43220	umulh x5,x11,x18
00a43224	mul x18,x11,x18
00a43228	umulh x7,x21,x11
00a4322c	mul x11,x21,x11
00a43230	and x23,x16,#0x7ffffffffffff
00a43234	extr x14,x4,x16,#0x33
00a43238	adcs x16,x24,x1
00a4323c	adds x8,x8,x11
00a43240	mul x26,x6,x10
00a43244	adcs x11,x16,x7
00a43248	umulh x25,x6,x10
00a4324c	adds x1,x26,x3
00a43250	stp x9,x10,[x29, #-0x70]
00a43254	stur x2,[x29, #-0x60]
00a43258	umulh x22,x6,x13
00a4325c	mul x13,x6,x13
00a43260	umulh x27,x6,x2
00a43264	mul x2,x6,x2
00a43268	umulh x6,x21,x9
00a4326c	umulh x19,x21,x10
00a43270	mul x10,x21,x10
00a43274	mul x21,x21,x9
00a43278	and x16,x8,#0x7ffffffffffff
00a4327c	extr x8,x11,x8,#0x33
00a43280	adcs x11,x25,x15
00a43284	adds x15,x1,x21
00a43288	adcs x11,x11,x6
00a4328c	adds x14,x15,x14
00a43290	adcs x11,x11,xzr
00a43294	adds x18,x18,x0
00a43298	adcs x12,x5,x12
00a4329c	adds x13,x18,x13
00a432a0	adcs x12,x12,x22
00a432a4	adds x8,x13,x8
00a432a8	umulh x17,x9,x9
00a432ac	mul x9,x9,x9
00a432b0	adcs x12,x12,xzr
00a432b4	adds x9,x2,x9
00a432b8	and x13,x8,#0x7ffffffffffff
00a432bc	extr x8,x12,x8,#0x33
00a432c0	adcs x12,x27,x17
00a432c4	adds x9,x9,x10
00a432c8	extr x11,x11,x14,#0x33
00a432cc	adcs x12,x12,x19
00a432d0	adds x9,x9,x11
00a432d4	adcs x12,x12,xzr
00a432d8	and x15,x14,#0x7ffffffffffff
00a432dc	add x8,x23,x8
00a432e0	and x2,x9,#0x7ffffffffffff
00a432e4	extr x9,x12,x9,#0x33
00a432e8	add x10,x15,x8, LSR #0x33
00a432ec	madd x9,x9,x20,x16
00a432f0	lsl x15,x10,#0x1
00a432f4	mul x12,x2,x20
00a432f8	add x13,x13,x9, LSR #0x33
00a432fc	umulh x4,x12,x15
00a43300	mul x15,x12,x15
00a43304	and x9,x9,#0x7ffffffffffff
00a43308	mul x19,x13,x13
00a4330c	and x8,x8,#0x7ffffffffffff
00a43310	lsl x6,x9,#0x1
00a43314	umulh x7,x13,x13
00a43318	adds x15,x19,x15
00a4331c	mul x24,x6,x8
00a43320	adcs x4,x7,x4
00a43324	mul x14,x10,x20
00a43328	lsl x18,x8,#0x1
00a4332c	umulh x23,x6,x8
00a43330	adds x15,x15,x24
00a43334	umulh x11,x14,x10
00a43338	mul x0,x14,x10
00a4333c	umulh x1,x14,x18
00a43340	mul x14,x14,x18
00a43344	umulh x24,x9,x9
00a43348	mul x9,x9,x9
00a4334c	adcs x4,x4,x23
00a43350	lsl x21,x13,#0x1
00a43354	adds x9,x9,x14
00a43358	umulh x16,x12,x2
00a4335c	mul x3,x12,x2
00a43360	umulh x5,x12,x18
00a43364	mul x18,x12,x18
00a43368	umulh x7,x21,x12
00a4336c	mul x12,x21,x12
00a43370	and x23,x15,#0x7ffffffffffff
00a43374	extr x14,x4,x15,#0x33
00a43378	adcs x15,x24,x1
00a4337c	adds x9,x9,x12
00a43380	mul x26,x6,x10
00a43384	adcs x12,x15,x7
00a43388	umulh x25,x6,x10
00a4338c	adds x1,x26,x3
00a43390	umulh x22,x6,x13
00a43394	mul x13,x6,x13
00a43398	umulh x27,x6,x2
00a4339c	mul x2,x6,x2
00a433a0	umulh x6,x21,x8
00a433a4	umulh x19,x21,x10
00a433a8	mul x10,x21,x10
00a433ac	mul x21,x21,x8
00a433b0	and x15,x9,#0x7ffffffffffff
00a433b4	extr x9,x12,x9,#0x33
00a433b8	adcs x12,x25,x16
00a433bc	adds x16,x1,x21
00a433c0	adcs x12,x12,x6
00a433c4	adds x14,x16,x14
00a433c8	adcs x12,x12,xzr
00a433cc	adds x18,x18,x0
00a433d0	adcs x11,x5,x11
00a433d4	adds x13,x18,x13
00a433d8	adcs x11,x11,x22
00a433dc	adds x9,x13,x9
00a433e0	umulh x17,x8,x8
00a433e4	mul x8,x8,x8
00a433e8	adcs x11,x11,xzr
00a433ec	adds x8,x2,x8
00a433f0	and x13,x9,#0x7ffffffffffff
00a433f4	extr x9,x11,x9,#0x33
00a433f8	adcs x11,x27,x17
00a433fc	adds x8,x8,x10
00a43400	extr x12,x12,x14,#0x33
00a43404	adcs x11,x11,x19
00a43408	adds x8,x8,x12
00a4340c	adcs x11,x11,xzr
00a43410	and x12,x8,#0x7ffffffffffff
00a43414	extr x8,x11,x8,#0x33
00a43418	and x16,x14,#0x7ffffffffffff
00a4341c	add x9,x23,x9
00a43420	madd x8,x8,x20,x15
00a43424	add x10,x16,x9, LSR #0x33
00a43428	and x9,x9,#0x7ffffffffffff
00a4342c	add x11,x13,x8, LSR #0x33
00a43430	and x8,x8,#0x7ffffffffffff
00a43434	sub x0,x29,#0xa8
00a43438	add x1,sp,#0x110
00a4343c	sub x2,x29,#0xa8
00a43440	stp x8,x11,[x29, #-0xa8]
00a43444	stp x9,x10,[x29, #-0x98]
00a43448	stur x12,[x29, #-0x88]
00a4344c	bl 0x00a46a4c
00a43450	sub x0,x29,#0x80
00a43454	sub x1,x29,#0x80
00a43458	sub x2,x29,#0xa8
00a4345c	bl 0x00a46a4c
00a43460	ldp x8,x9,[x29, #-0x80]
00a43464	ldp x10,x11,[x29, #-0x70]
00a43468	ldur x12,[x29, #-0x60]
00a4346c	umulh x13,x8,x8
00a43470	mul x14,x8,x8
00a43474	lsl x8,x8,#0x1
00a43478	mul x17,x9,x9
00a4347c	mul x6,x10,x8
00a43480	umulh x16,x9,x9
00a43484	mul x0,x11,x20
00a43488	umulh x5,x10,x8
00a4348c	adds x17,x6,x17
00a43490	lsl x18,x9,#0x1
00a43494	umulh x4,x8,x9
00a43498	mul x9,x8,x9
00a4349c	adcs x16,x5,x16
00a434a0	mul x5,x0,x11
00a434a4	mul x15,x12,x20
00a434a8	lsl x1,x11,#0x1
00a434ac	umulh x7,x11,x8
00a434b0	mul x19,x11,x8
00a434b4	umulh x24,x11,x18
00a434b8	mul x6,x11,x18
00a434bc	adds x9,x5,x9
00a434c0	umulh x11,x0,x11
00a434c4	adcs x11,x11,x4
00a434c8	umulh x4,x15,x1
00a434cc	mul x1,x15,x1
00a434d0	lsl x3,x10,#0x1
00a434d4	adds x17,x17,x1
00a434d8	umulh x1,x0,x3
00a434dc	mul x0,x0,x3
00a434e0	adcs x16,x16,x4
00a434e4	adds x14,x0,x14
00a434e8	umulh x21,x12,x8
00a434ec	mul x8,x12,x8
00a434f0	umulh x22,x15,x12
00a434f4	mul x12,x15,x12
00a434f8	umulh x5,x15,x18
00a434fc	umulh x4,x15,x3
00a43500	mul x3,x15,x3
00a43504	mul x15,x15,x18
00a43508	adcs x13,x1,x13
00a4350c	adds x14,x14,x15
00a43510	adcs x13,x13,x5
00a43514	adds x9,x9,x3
00a43518	umulh x23,x18,x10
00a4351c	mul x18,x18,x10
00a43520	adcs x11,x11,x4
00a43524	and x15,x14,#0x7ffffffffffff
00a43528	extr x13,x13,x14,#0x33
00a4352c	adds x14,x19,x18
00a43530	and x0,x17,#0x7ffffffffffff
00a43534	extr x16,x16,x17,#0x33
00a43538	adcs x17,x7,x23
00a4353c	adds x12,x14,x12
00a43540	adcs x14,x17,x22
00a43544	adds x12,x12,x16
00a43548	adcs x14,x14,xzr
00a4354c	adds x9,x9,x13
00a43550	umulh x2,x10,x10
00a43554	mul x10,x10,x10
00a43558	adcs x11,x11,xzr
00a4355c	adds x10,x6,x10
00a43560	and x13,x9,#0x7ffffffffffff
00a43564	extr x9,x11,x9,#0x33
00a43568	adcs x11,x24,x2
00a4356c	adds x8,x10,x8
00a43570	and x16,x12,#0x7ffffffffffff
00a43574	extr x12,x14,x12,#0x33
00a43578	adcs x11,x11,x21
00a4357c	adds x8,x8,x12
00a43580	adcs x11,x11,xzr
00a43584	and x12,x8,#0x7ffffffffffff
00a43588	extr x8,x11,x8,#0x33
00a4358c	add x9,x0,x9
00a43590	madd x8,x8,x20,x15
00a43594	add x10,x16,x9, LSR #0x33
00a43598	and x9,x9,#0x7ffffffffffff
00a4359c	add x11,x13,x8, LSR #0x33
00a435a0	and x8,x8,#0x7ffffffffffff
00a435a4	sub x0,x29,#0xa8
00a435a8	sub x1,x29,#0xa8
00a435ac	sub x2,x29,#0xd0
00a435b0	stp x8,x11,[x29, #-0xd0]
00a435b4	stp x9,x10,[x29, #-0xc0]
00a435b8	stur x12,[x29, #-0xb0]
00a435bc	bl 0x00a46a4c
00a435c0	ldp x8,x9,[x29, #-0xa8]
00a435c4	ldp x10,x11,[x29, #-0x98]
00a435c8	ldur x12,[x29, #-0x88]
00a435cc	umulh x13,x8,x8
00a435d0	mul x14,x8,x8
00a435d4	lsl x8,x8,#0x1
00a435d8	mul x17,x9,x9
00a435dc	mul x6,x10,x8
00a435e0	umulh x16,x9,x9
00a435e4	mul x0,x11,x20
00a435e8	umulh x5,x10,x8
00a435ec	adds x17,x6,x17
00a435f0	lsl x18,x9,#0x1
00a435f4	umulh x4,x8,x9
00a435f8	mul x9,x8,x9
00a435fc	adcs x16,x5,x16
00a43600	mul x5,x0,x11
00a43604	mul x15,x12,x20
00a43608	lsl x1,x11,#0x1
00a4360c	umulh x7,x11,x8
00a43610	mul x19,x11,x8
00a43614	umulh x24,x11,x18
00a43618	mul x6,x11,x18
00a4361c	adds x9,x5,x9
00a43620	umulh x11,x0,x11
00a43624	adcs x11,x11,x4
00a43628	umulh x4,x15,x1
00a4362c	mul x1,x15,x1
00a43630	lsl x3,x10,#0x1
00a43634	adds x17,x17,x1
00a43638	umulh x1,x0,x3
00a4363c	mul x0,x0,x3
00a43640	adcs x16,x16,x4
00a43644	adds x14,x0,x14
00a43648	umulh x21,x12,x8
00a4364c	mul x8,x12,x8
00a43650	umulh x22,x15,x12
00a43654	mul x12,x15,x12
00a43658	umulh x5,x15,x18
00a4365c	umulh x4,x15,x3
00a43660	mul x3,x15,x3
00a43664	mul x15,x15,x18
00a43668	adcs x13,x1,x13
00a4366c	adds x14,x14,x15
00a43670	adcs x13,x13,x5
00a43674	adds x9,x9,x3
00a43678	umulh x23,x18,x10
00a4367c	mul x18,x18,x10
00a43680	adcs x11,x11,x4
00a43684	and x15,x14,#0x7ffffffffffff
00a43688	extr x13,x13,x14,#0x33
00a4368c	adds x14,x19,x18
00a43690	and x0,x17,#0x7ffffffffffff
00a43694	extr x16,x16,x17,#0x33
00a43698	adcs x17,x7,x23
00a4369c	adds x12,x14,x12
00a436a0	adcs x14,x17,x22
00a436a4	adds x12,x12,x16
00a436a8	adcs x14,x14,xzr
00a436ac	adds x9,x9,x13
00a436b0	umulh x2,x10,x10
00a436b4	mul x10,x10,x10
00a436b8	adcs x11,x11,xzr
00a436bc	adds x10,x6,x10
00a436c0	and x13,x9,#0x7ffffffffffff
00a436c4	extr x9,x11,x9,#0x33
00a436c8	adcs x11,x24,x2
00a436cc	adds x8,x10,x8
00a436d0	and x16,x12,#0x7ffffffffffff
00a436d4	extr x12,x14,x12,#0x33
00a436d8	adcs x11,x11,x21
00a436dc	adds x8,x8,x12
00a436e0	adcs x12,x11,xzr
00a436e4	and x11,x8,#0x7ffffffffffff
00a436e8	extr x8,x12,x8,#0x33
00a436ec	add x9,x0,x9
00a436f0	madd x8,x8,x20,x15
00a436f4	add x10,x16,x9, LSR #0x33
00a436f8	and x9,x9,#0x7ffffffffffff
00a436fc	add x12,x13,x8, LSR #0x33
00a43700	and x13,x8,#0x7ffffffffffff
00a43704	mov w8,#0x4
00a43708	stp x13,x12,[x29, #-0xd0]
00a4370c	stp x9,x10,[x29, #-0xc0]
00a43710	stur x11,[x29, #-0xb0]
00a43714	mul x16,x11,x20
00a43718	lsl x2,x10,#0x1
00a4371c	mul x18,x12,x12
00a43720	mul x28,x2,x16
00a43724	umulh x14,x13,x13
00a43728	mul x15,x13,x13
00a4372c	lsl x13,x13,#0x1
00a43730	umulh x17,x12,x12
00a43734	adds x18,x18,x28
00a43738	umulh x2,x2,x16
00a4373c	mul x7,x13,x9
00a43740	adcs x17,x17,x2
00a43744	lsl x0,x12,#0x1
00a43748	mul x1,x10,x20
00a4374c	lsl x4,x9,#0x1
00a43750	umulh x6,x13,x9
00a43754	adds x18,x18,x7
00a43758	umulh x19,x13,x10
00a4375c	mul x21,x13,x10
00a43760	umulh x25,x0,x10
00a43764	mul x26,x0,x10
00a43768	umulh x28,x1,x10
00a4376c	mul x10,x1,x10
00a43770	umulh x2,x4,x1
00a43774	mul x1,x4,x1
00a43778	adcs x17,x17,x6
00a4377c	adds x15,x15,x1
00a43780	umulh x5,x13,x12
00a43784	mul x12,x13,x12
00a43788	umulh x22,x13,x11
00a4378c	mul x13,x13,x11
00a43790	umulh x23,x16,x11
00a43794	mul x11,x16,x11
00a43798	umulh x27,x0,x16
00a4379c	umulh x7,x4,x16
00a437a0	mul x4,x4,x16
00a437a4	mul x16,x0,x16
00a437a8	adcs x14,x14,x2
00a437ac	adds x15,x15,x16
00a437b0	umulh x24,x0,x9
00a437b4	mul x0,x0,x9
00a437b8	adcs x14,x14,x27
00a437bc	adds x11,x0,x11
00a437c0	and x16,x15,#0x7ffffffffffff
00a437c4	extr x14,x14,x15,#0x33
00a437c8	adcs x15,x24,x23
00a437cc	adds x11,x11,x21
00a437d0	extr x17,x17,x18,#0x33
00a437d4	adcs x15,x15,x19
00a437d8	adds x11,x11,x17
00a437dc	adcs x15,x15,xzr
00a437e0	adds x10,x4,x10
00a437e4	and x17,x11,#0x7ffffffffffff
00a437e8	extr x11,x15,x11,#0x33
00a437ec	adcs x15,x7,x28
00a437f0	adds x10,x10,x12
00a437f4	adcs x12,x15,x5
00a437f8	adds x10,x10,x14
00a437fc	umulh x3,x9,x9
00a43800	mul x9,x9,x9
00a43804	adcs x12,x12,xzr
00a43808	adds x9,x26,x9
00a4380c	and x14,x10,#0x7ffffffffffff
00a43810	extr x10,x12,x10,#0x33
00a43814	adcs x12,x25,x3
00a43818	adds x13,x9,x13
00a4381c	adcs x12,x12,x22
00a43820	adds x13,x13,x11
00a43824	adcs x12,x12,xzr
00a43828	and x6,x18,#0x7ffffffffffff
00a4382c	extr x12,x12,x13,#0x33
00a43830	add x15,x6,x10
00a43834	and x11,x13,#0x7ffffffffffff
00a43838	madd x13,x12,x20,x16
00a4383c	add x10,x17,x15, LSR #0x33
00a43840	and x9,x15,#0x7ffffffffffff
00a43844	subs w8,w8,#0x1
00a43848	add x12,x14,x13, LSR #0x33
00a4384c	and x13,x13,#0x7ffffffffffff
00a43850	b.ne 0x00a43714
00a43854	sub x0,x29,#0xa8
00a43858	sub x1,x29,#0xd0
00a4385c	sub x2,x29,#0xa8
00a43860	stp x13,x12,[x29, #-0xd0]
00a43864	stp x9,x10,[x29, #-0xc0]
00a43868	stur x11,[x29, #-0xb0]
00a4386c	bl 0x00a46a4c
00a43870	ldp x9,x10,[x29, #-0xa8]
00a43874	ldp x11,x12,[x29, #-0x98]
00a43878	ldur x13,[x29, #-0x88]
00a4387c	mov w8,#0x13
00a43880	umulh x14,x9,x9
00a43884	mul x15,x9,x9
00a43888	lsl x9,x9,#0x1
00a4388c	mul x18,x10,x10
00a43890	mul x7,x11,x9
00a43894	umulh x17,x10,x10
00a43898	mul x1,x12,x8
00a4389c	umulh x6,x11,x9
00a438a0	adds x18,x7,x18
00a438a4	lsl x0,x10,#0x1
00a438a8	umulh x5,x9,x10
00a438ac	mul x10,x9,x10
00a438b0	adcs x17,x6,x17
00a438b4	mul x6,x1,x12
00a438b8	mul x16,x13,x8
00a438bc	lsl x2,x12,#0x1
00a438c0	umulh x19,x12,x9
00a438c4	mul x20,x12,x9
00a438c8	umulh x24,x12,x0
00a438cc	mul x7,x12,x0
00a438d0	adds x10,x6,x10
00a438d4	umulh x12,x1,x12
00a438d8	adcs x12,x12,x5
00a438dc	umulh x5,x16,x2
00a438e0	mul x2,x16,x2
00a438e4	lsl x4,x11,#0x1
00a438e8	adds x18,x18,x2
00a438ec	umulh x2,x1,x4
00a438f0	mul x1,x1,x4
00a438f4	adcs x17,x17,x5
00a438f8	adds x15,x1,x15
00a438fc	umulh x21,x13,x9
00a43900	mul x9,x13,x9
00a43904	umulh x22,x16,x13
00a43908	mul x13,x16,x13
00a4390c	umulh x6,x16,x0
00a43910	umulh x5,x16,x4
00a43914	mul x4,x16,x4
00a43918	mul x16,x16,x0
00a4391c	adcs x14,x2,x14
00a43920	adds x15,x15,x16
00a43924	adcs x14,x14,x6
00a43928	adds x10,x10,x4
00a4392c	umulh x23,x0,x11
00a43930	mul x0,x0,x11
00a43934	adcs x12,x12,x5
00a43938	and x16,x15,#0x7ffffffffffff
00a4393c	extr x14,x14,x15,#0x33
00a43940	adds x15,x20,x0
00a43944	and x1,x18,#0x7ffffffffffff
00a43948	extr x17,x17,x18,#0x33
00a4394c	adcs x18,x19,x23
00a43950	adds x13,x15,x13
00a43954	adcs x15,x18,x22
00a43958	adds x13,x13,x17
00a4395c	adcs x15,x15,xzr
00a43960	adds x10,x10,x14
00a43964	umulh x3,x11,x11
00a43968	mul x11,x11,x11
00a4396c	adcs x12,x12,xzr
00a43970	adds x11,x7,x11
00a43974	and x14,x10,#0x7ffffffffffff
00a43978	extr x10,x12,x10,#0x33
00a4397c	adcs x12,x24,x3
00a43980	adds x9,x11,x9
00a43984	and x17,x13,#0x7ffffffffffff
00a43988	extr x13,x15,x13,#0x33
00a4398c	adcs x12,x12,x21
00a43990	adds x9,x9,x13
00a43994	adcs x13,x12,xzr
00a43998	and x12,x9,#0x7ffffffffffff
00a4399c	extr x9,x13,x9,#0x33
00a439a0	add x10,x1,x10
00a439a4	madd x9,x9,x8,x16
00a439a8	add x11,x17,x10, LSR #0x33
00a439ac	and x10,x10,#0x7ffffffffffff
00a439b0	add x13,x14,x9, LSR #0x33
00a439b4	and x14,x9,#0x7ffffffffffff
00a439b8	mov w9,#0x9
00a439bc	stp x14,x13,[x29, #-0xd0]
00a439c0	stp x10,x11,[x29, #-0xc0]
00a439c4	stur x12,[x29, #-0xb0]
00a439c8	mul x17,x12,x8
00a439cc	lsl x3,x11,#0x1
00a439d0	mul x0,x13,x13
00a439d4	mul x28,x3,x17
00a439d8	umulh x15,x14,x14
00a439dc	mul x16,x14,x14
00a439e0	lsl x14,x14,#0x1
00a439e4	umulh x18,x13,x13
00a439e8	adds x0,x0,x28
00a439ec	umulh x3,x3,x17
00a439f0	mul x19,x14,x10
00a439f4	adcs x18,x18,x3
00a439f8	lsl x1,x13,#0x1
00a439fc	mul x2,x11,x8
00a43a00	lsl x5,x10,#0x1
00a43a04	umulh x7,x14,x10
00a43a08	adds x0,x0,x19
00a43a0c	umulh x20,x14,x11
00a43a10	mul x21,x14,x11
00a43a14	umulh x25,x1,x11
00a43a18	mul x26,x1,x11
00a43a1c	umulh x28,x2,x11
00a43a20	mul x11,x2,x11
00a43a24	umulh x3,x5,x2
00a43a28	mul x2,x5,x2
00a43a2c	adcs x18,x18,x7
00a43a30	adds x16,x16,x2
00a43a34	umulh x6,x14,x13
00a43a38	mul x13,x14,x13
00a43a3c	umulh x22,x14,x12
00a43a40	mul x14,x14,x12
00a43a44	umulh x23,x17,x12
00a43a48	mul x12,x17,x12
00a43a4c	umulh x27,x1,x17
00a43a50	umulh x19,x5,x17
00a43a54	mul x5,x5,x17
00a43a58	mul x17,x1,x17
00a43a5c	adcs x15,x15,x3
00a43a60	adds x16,x16,x17
00a43a64	umulh x24,x1,x10
00a43a68	mul x1,x1,x10
00a43a6c	adcs x15,x15,x27
00a43a70	adds x12,x1,x12
00a43a74	and x17,x16,#0x7ffffffffffff
00a43a78	extr x15,x15,x16,#0x33
00a43a7c	adcs x16,x24,x23
00a43a80	adds x12,x12,x21
00a43a84	extr x18,x18,x0,#0x33
00a43a88	adcs x16,x16,x20
00a43a8c	adds x12,x12,x18
00a43a90	adcs x16,x16,xzr
00a43a94	adds x11,x5,x11
00a43a98	and x18,x12,#0x7ffffffffffff
00a43a9c	extr x12,x16,x12,#0x33
00a43aa0	adcs x16,x19,x28
00a43aa4	adds x11,x11,x13
00a43aa8	adcs x13,x16,x6
00a43aac	adds x11,x11,x15
00a43ab0	umulh x4,x10,x10
00a43ab4	mul x10,x10,x10
00a43ab8	adcs x13,x13,xzr
00a43abc	adds x10,x26,x10
00a43ac0	and x15,x11,#0x7ffffffffffff
00a43ac4	extr x11,x13,x11,#0x33
00a43ac8	adcs x13,x25,x4
00a43acc	adds x14,x10,x14
00a43ad0	adcs x13,x13,x22
00a43ad4	adds x14,x14,x12
00a43ad8	adcs x13,x13,xzr
00a43adc	and x7,x0,#0x7ffffffffffff
00a43ae0	extr x13,x13,x14,#0x33
00a43ae4	add x16,x7,x11
00a43ae8	and x12,x14,#0x7ffffffffffff
00a43aec	madd x14,x13,x8,x17
00a43af0	add x11,x18,x16, LSR #0x33
00a43af4	and x10,x16,#0x7ffffffffffff
00a43af8	subs w9,w9,#0x1
00a43afc	add x13,x15,x14, LSR #0x33
00a43b00	and x14,x14,#0x7ffffffffffff
00a43b04	b.ne 0x00a439c8
00a43b08	sub x0,x29,#0xd0
00a43b0c	sub x1,x29,#0xd0
00a43b10	sub x2,x29,#0xa8
00a43b14	stp x14,x13,[x29, #-0xd0]
00a43b18	stp x10,x11,[x29, #-0xc0]
00a43b1c	stur x12,[x29, #-0xb0]
00a43b20	bl 0x00a46a4c
00a43b24	ldp x9,x10,[x29, #-0xd0]
00a43b28	ldp x11,x12,[x29, #-0xc0]
00a43b2c	ldur x13,[x29, #-0xb0]
00a43b30	mov w8,#0x13
00a43b34	umulh x14,x9,x9
00a43b38	mul x15,x9,x9
00a43b3c	lsl x9,x9,#0x1
00a43b40	mul x18,x10,x10
00a43b44	mul x7,x11,x9
00a43b48	umulh x17,x10,x10
00a43b4c	mul x1,x12,x8
00a43b50	umulh x6,x11,x9
00a43b54	adds x18,x7,x18
00a43b58	lsl x0,x10,#0x1
00a43b5c	umulh x5,x9,x10
00a43b60	mul x10,x9,x10
00a43b64	adcs x17,x6,x17
00a43b68	mul x6,x1,x12
00a43b6c	mul x16,x13,x8
00a43b70	lsl x2,x12,#0x1
00a43b74	umulh x19,x12,x9
00a43b78	mul x20,x12,x9
00a43b7c	umulh x24,x12,x0
00a43b80	mul x7,x12,x0
00a43b84	adds x10,x6,x10
00a43b88	umulh x12,x1,x12
00a43b8c	adcs x12,x12,x5
00a43b90	umulh x5,x16,x2
00a43b94	mul x2,x16,x2
00a43b98	lsl x4,x11,#0x1
00a43b9c	adds x18,x18,x2
00a43ba0	umulh x2,x1,x4
00a43ba4	mul x1,x1,x4
00a43ba8	adcs x17,x17,x5
00a43bac	adds x15,x1,x15
00a43bb0	umulh x21,x13,x9
00a43bb4	mul x9,x13,x9
00a43bb8	umulh x22,x16,x13
00a43bbc	mul x13,x16,x13
00a43bc0	umulh x6,x16,x0
00a43bc4	umulh x5,x16,x4
00a43bc8	mul x4,x16,x4
00a43bcc	mul x16,x16,x0
00a43bd0	adcs x14,x2,x14
00a43bd4	adds x15,x15,x16
00a43bd8	adcs x14,x14,x6
00a43bdc	adds x10,x10,x4
00a43be0	umulh x23,x0,x11
00a43be4	mul x0,x0,x11
00a43be8	adcs x12,x12,x5
00a43bec	and x16,x15,#0x7ffffffffffff
00a43bf0	extr x14,x14,x15,#0x33
00a43bf4	adds x15,x20,x0
00a43bf8	and x1,x18,#0x7ffffffffffff
00a43bfc	extr x17,x17,x18,#0x33
00a43c00	adcs x18,x19,x23
00a43c04	adds x13,x15,x13
00a43c08	adcs x15,x18,x22
00a43c0c	adds x13,x13,x17
00a43c10	adcs x15,x15,xzr
00a43c14	adds x10,x10,x14
00a43c18	umulh x3,x11,x11
00a43c1c	mul x11,x11,x11
00a43c20	adcs x12,x12,xzr
00a43c24	adds x11,x7,x11
00a43c28	and x14,x10,#0x7ffffffffffff
00a43c2c	extr x10,x12,x10,#0x33
00a43c30	adcs x12,x24,x3
00a43c34	adds x9,x11,x9
00a43c38	and x17,x13,#0x7ffffffffffff
00a43c3c	extr x13,x15,x13,#0x33
00a43c40	adcs x12,x12,x21
00a43c44	adds x9,x9,x13
00a43c48	adcs x13,x12,xzr
00a43c4c	and x12,x9,#0x7ffffffffffff
00a43c50	extr x9,x13,x9,#0x33
00a43c54	add x10,x1,x10
00a43c58	madd x9,x9,x8,x16
00a43c5c	add x11,x17,x10, LSR #0x33
00a43c60	and x10,x10,#0x7ffffffffffff
00a43c64	add x13,x14,x9, LSR #0x33
00a43c68	and x14,x9,#0x7ffffffffffff
00a43c6c	mov w9,#0x13
00a43c70	stp x14,x13,[x29, #-0xf8]
00a43c74	stp x10,x11,[x29, #-0xe8]
00a43c78	stur x12,[x29, #-0xd8]
00a43c7c	mul x17,x12,x8
00a43c80	lsl x3,x11,#0x1
00a43c84	mul x0,x13,x13
00a43c88	mul x28,x3,x17
00a43c8c	umulh x15,x14,x14
00a43c90	mul x16,x14,x14
00a43c94	lsl x14,x14,#0x1
00a43c98	umulh x18,x13,x13
00a43c9c	adds x0,x0,x28
00a43ca0	umulh x3,x3,x17
00a43ca4	mul x19,x14,x10
00a43ca8	adcs x18,x18,x3
00a43cac	lsl x1,x13,#0x1
00a43cb0	mul x2,x11,x8
00a43cb4	lsl x5,x10,#0x1
00a43cb8	umulh x7,x14,x10
00a43cbc	adds x0,x0,x19
00a43cc0	umulh x20,x14,x11
00a43cc4	mul x21,x14,x11
00a43cc8	umulh x25,x1,x11
00a43ccc	mul x26,x1,x11
00a43cd0	umulh x28,x2,x11
00a43cd4	mul x11,x2,x11
00a43cd8	umulh x3,x5,x2
00a43cdc	mul x2,x5,x2
00a43ce0	adcs x18,x18,x7
00a43ce4	adds x16,x16,x2
00a43ce8	umulh x6,x14,x13
00a43cec	mul x13,x14,x13
00a43cf0	umulh x22,x14,x12
00a43cf4	mul x14,x14,x12
00a43cf8	umulh x23,x17,x12
00a43cfc	mul x12,x17,x12
00a43d00	umulh x27,x1,x17
00a43d04	umulh x19,x5,x17
00a43d08	mul x5,x5,x17
00a43d0c	mul x17,x1,x17
00a43d10	adcs x15,x15,x3
00a43d14	adds x16,x16,x17
00a43d18	umulh x24,x1,x10
00a43d1c	mul x1,x1,x10
00a43d20	adcs x15,x15,x27
00a43d24	adds x12,x1,x12
00a43d28	and x17,x16,#0x7ffffffffffff
00a43d2c	extr x15,x15,x16,#0x33
00a43d30	adcs x16,x24,x23
00a43d34	adds x12,x12,x21
00a43d38	extr x18,x18,x0,#0x33
00a43d3c	adcs x16,x16,x20
00a43d40	adds x12,x12,x18
00a43d44	adcs x16,x16,xzr
00a43d48	adds x11,x5,x11
00a43d4c	and x18,x12,#0x7ffffffffffff
00a43d50	extr x12,x16,x12,#0x33
00a43d54	adcs x16,x19,x28
00a43d58	adds x11,x11,x13
00a43d5c	adcs x13,x16,x6
00a43d60	adds x11,x11,x15
00a43d64	umulh x4,x10,x10
00a43d68	mul x10,x10,x10
00a43d6c	adcs x13,x13,xzr
00a43d70	adds x10,x26,x10
00a43d74	and x15,x11,#0x7ffffffffffff
00a43d78	extr x11,x13,x11,#0x33
00a43d7c	adcs x13,x25,x4
00a43d80	adds x14,x10,x14
00a43d84	adcs x13,x13,x22
00a43d88	adds x14,x14,x12
00a43d8c	adcs x13,x13,xzr
00a43d90	and x7,x0,#0x7ffffffffffff
00a43d94	extr x13,x13,x14,#0x33
00a43d98	add x16,x7,x11
00a43d9c	and x12,x14,#0x7ffffffffffff
00a43da0	madd x14,x13,x8,x17
00a43da4	add x11,x18,x16, LSR #0x33
00a43da8	and x10,x16,#0x7ffffffffffff
00a43dac	subs w9,w9,#0x1
00a43db0	add x13,x15,x14, LSR #0x33
00a43db4	and x14,x14,#0x7ffffffffffff
00a43db8	b.ne 0x00a43c7c
00a43dbc	sub x0,x29,#0xd0
00a43dc0	sub x1,x29,#0xf8
00a43dc4	sub x2,x29,#0xd0
00a43dc8	stp x14,x13,[x29, #-0xf8]
00a43dcc	stp x10,x11,[x29, #-0xe8]
00a43dd0	stur x12,[x29, #-0xd8]
00a43dd4	bl 0x00a46a4c
00a43dd8	ldp x14,x13,[x29, #-0xd0]
00a43ddc	ldp x10,x11,[x29, #-0xc0]
00a43de0	ldur x12,[x29, #-0xb0]
00a43de4	mov w8,#0xa
00a43de8	mov w9,#0x13
00a43dec	mul x17,x12,x9
00a43df0	lsl x3,x11,#0x1
00a43df4	mul x0,x13,x13
00a43df8	mul x28,x3,x17
00a43dfc	umulh x15,x14,x14
00a43e00	mul x16,x14,x14
00a43e04	lsl x14,x14,#0x1
00a43e08	umulh x18,x13,x13
00a43e0c	adds x0,x0,x28
00a43e10	umulh x3,x3,x17
00a43e14	mul x19,x14,x10
00a43e18	adcs x18,x18,x3
00a43e1c	lsl x1,x13,#0x1
00a43e20	mul x2,x11,x9
00a43e24	lsl x5,x10,#0x1
00a43e28	umulh x7,x14,x10
00a43e2c	adds x0,x0,x19
00a43e30	umulh x20,x14,x11
00a43e34	mul x21,x14,x11
00a43e38	umulh x25,x1,x11
00a43e3c	mul x26,x1,x11
00a43e40	umulh x28,x2,x11
00a43e44	mul x11,x2,x11
00a43e48	umulh x3,x5,x2
00a43e4c	mul x2,x5,x2
00a43e50	adcs x18,x18,x7
00a43e54	adds x16,x16,x2
00a43e58	umulh x6,x14,x13
00a43e5c	mul x13,x14,x13
00a43e60	umulh x22,x14,x12
00a43e64	mul x14,x14,x12
00a43e68	umulh x23,x17,x12
00a43e6c	mul x12,x17,x12
00a43e70	umulh x27,x1,x17
00a43e74	umulh x19,x5,x17
00a43e78	mul x5,x5,x17
00a43e7c	mul x17,x1,x17
00a43e80	adcs x15,x15,x3
00a43e84	adds x16,x16,x17
00a43e88	umulh x24,x1,x10
00a43e8c	mul x1,x1,x10
00a43e90	adcs x15,x15,x27
00a43e94	adds x12,x1,x12
00a43e98	and x17,x16,#0x7ffffffffffff
00a43e9c	extr x15,x15,x16,#0x33
00a43ea0	adcs x16,x24,x23
00a43ea4	adds x12,x12,x21
00a43ea8	extr x18,x18,x0,#0x33
00a43eac	adcs x16,x16,x20
00a43eb0	adds x12,x12,x18
00a43eb4	adcs x16,x16,xzr
00a43eb8	adds x11,x5,x11
00a43ebc	and x18,x12,#0x7ffffffffffff
00a43ec0	extr x12,x16,x12,#0x33
00a43ec4	adcs x16,x19,x28
00a43ec8	adds x11,x11,x13
00a43ecc	adcs x13,x16,x6
00a43ed0	adds x11,x11,x15
00a43ed4	umulh x4,x10,x10
00a43ed8	mul x10,x10,x10
00a43edc	adcs x13,x13,xzr
00a43ee0	adds x10,x26,x10
00a43ee4	and x15,x11,#0x7ffffffffffff
00a43ee8	extr x11,x13,x11,#0x33
00a43eec	adcs x13,x25,x4
00a43ef0	adds x14,x10,x14
00a43ef4	adcs x13,x13,x22
00a43ef8	adds x14,x14,x12
00a43efc	adcs x13,x13,xzr
00a43f00	and x7,x0,#0x7ffffffffffff
00a43f04	extr x13,x13,x14,#0x33
00a43f08	add x16,x7,x11
00a43f0c	and x12,x14,#0x7ffffffffffff
00a43f10	madd x14,x13,x9,x17
00a43f14	add x11,x18,x16, LSR #0x33
00a43f18	and x10,x16,#0x7ffffffffffff
00a43f1c	subs w8,w8,#0x1
00a43f20	add x13,x15,x14, LSR #0x33
00a43f24	and x14,x14,#0x7ffffffffffff
00a43f28	b.ne 0x00a43dec
00a43f2c	sub x0,x29,#0xa8
00a43f30	sub x1,x29,#0xd0
00a43f34	sub x2,x29,#0xa8
00a43f38	stp x14,x13,[x29, #-0xd0]
00a43f3c	stp x10,x11,[x29, #-0xc0]
00a43f40	stur x12,[x29, #-0xb0]
00a43f44	bl 0x00a46a4c
00a43f48	ldp x9,x10,[x29, #-0xa8]
00a43f4c	ldp x11,x12,[x29, #-0x98]
00a43f50	ldur x13,[x29, #-0x88]
00a43f54	mov w8,#0x13
00a43f58	umulh x14,x9,x9
00a43f5c	mul x15,x9,x9
00a43f60	lsl x9,x9,#0x1
00a43f64	mul x18,x10,x10
00a43f68	mul x7,x11,x9
00a43f6c	umulh x17,x10,x10
00a43f70	mul x1,x12,x8
00a43f74	umulh x6,x11,x9
00a43f78	adds x18,x7,x18
00a43f7c	lsl x0,x10,#0x1
00a43f80	umulh x5,x9,x10
00a43f84	mul x10,x9,x10
00a43f88	adcs x17,x6,x17
00a43f8c	mul x6,x1,x12
00a43f90	mul x16,x13,x8
00a43f94	lsl x2,x12,#0x1
00a43f98	umulh x19,x12,x9
00a43f9c	mul x20,x12,x9
00a43fa0	umulh x24,x12,x0
00a43fa4	mul x7,x12,x0
00a43fa8	adds x10,x6,x10
00a43fac	umulh x12,x1,x12
00a43fb0	adcs x12,x12,x5
00a43fb4	umulh x5,x16,x2
00a43fb8	mul x2,x16,x2
00a43fbc	lsl x4,x11,#0x1
00a43fc0	adds x18,x18,x2
00a43fc4	umulh x2,x1,x4
00a43fc8	mul x1,x1,x4
00a43fcc	adcs x17,x17,x5
00a43fd0	adds x15,x1,x15
00a43fd4	umulh x21,x13,x9
00a43fd8	mul x9,x13,x9
00a43fdc	umulh x22,x16,x13
00a43fe0	mul x13,x16,x13
00a43fe4	umulh x6,x16,x0
00a43fe8	umulh x5,x16,x4
00a43fec	mul x4,x16,x4
00a43ff0	mul x16,x16,x0
00a43ff4	adcs x14,x2,x14
00a43ff8	adds x15,x15,x16
00a43ffc	adcs x14,x14,x6
00a44000	adds x10,x10,x4
00a44004	umulh x23,x0,x11
00a44008	mul x0,x0,x11
00a4400c	adcs x12,x12,x5
00a44010	and x16,x15,#0x7ffffffffffff
00a44014	extr x14,x14,x15,#0x33
00a44018	adds x15,x20,x0
00a4401c	and x1,x18,#0x7ffffffffffff
00a44020	extr x17,x17,x18,#0x33
00a44024	adcs x18,x19,x23
00a44028	adds x13,x15,x13
00a4402c	adcs x15,x18,x22
00a44030	adds x13,x13,x17
00a44034	adcs x15,x15,xzr
00a44038	adds x10,x10,x14
00a4403c	umulh x3,x11,x11
00a44040	mul x11,x11,x11
00a44044	adcs x12,x12,xzr
00a44048	adds x11,x7,x11
00a4404c	and x14,x10,#0x7ffffffffffff
00a44050	extr x10,x12,x10,#0x33
00a44054	adcs x12,x24,x3
00a44058	adds x9,x11,x9
00a4405c	and x17,x13,#0x7ffffffffffff
00a44060	extr x13,x15,x13,#0x33
00a44064	adcs x12,x12,x21
00a44068	adds x9,x9,x13
00a4406c	adcs x13,x12,xzr
00a44070	and x12,x9,#0x7ffffffffffff
00a44074	extr x9,x13,x9,#0x33
00a44078	add x10,x1,x10
00a4407c	madd x9,x9,x8,x16
00a44080	add x11,x17,x10, LSR #0x33
00a44084	and x10,x10,#0x7ffffffffffff
00a44088	add x13,x14,x9, LSR #0x33
00a4408c	and x14,x9,#0x7ffffffffffff
00a44090	mov w9,#0x31
00a44094	stp x14,x13,[x29, #-0xd0]
00a44098	stp x10,x11,[x29, #-0xc0]
00a4409c	stur x12,[x29, #-0xb0]
00a440a0	mul x17,x12,x8
00a440a4	lsl x3,x11,#0x1
00a440a8	mul x0,x13,x13
00a440ac	mul x28,x3,x17
00a440b0	umulh x15,x14,x14
00a440b4	mul x16,x14,x14
00a440b8	lsl x14,x14,#0x1
00a440bc	umulh x18,x13,x13
00a440c0	adds x0,x0,x28
00a440c4	umulh x3,x3,x17
00a440c8	mul x19,x14,x10
00a440cc	adcs x18,x18,x3
00a440d0	lsl x1,x13,#0x1
00a440d4	mul x2,x11,x8
00a440d8	lsl x5,x10,#0x1
00a440dc	umulh x7,x14,x10
00a440e0	adds x0,x0,x19
00a440e4	umulh x20,x14,x11
00a440e8	mul x21,x14,x11
00a440ec	umulh x25,x1,x11
00a440f0	mul x26,x1,x11
00a440f4	umulh x28,x2,x11
00a440f8	mul x11,x2,x11
00a440fc	umulh x3,x5,x2
00a44100	mul x2,x5,x2
00a44104	adcs x18,x18,x7
00a44108	adds x16,x16,x2
00a4410c	umulh x6,x14,x13
00a44110	mul x13,x14,x13
00a44114	umulh x22,x14,x12
00a44118	mul x14,x14,x12
00a4411c	umulh x23,x17,x12
00a44120	mul x12,x17,x12
00a44124	umulh x27,x1,x17
00a44128	umulh x19,x5,x17
00a4412c	mul x5,x5,x17
00a44130	mul x17,x1,x17
00a44134	adcs x15,x15,x3
00a44138	adds x16,x16,x17
00a4413c	umulh x24,x1,x10
00a44140	mul x1,x1,x10
00a44144	adcs x15,x15,x27
00a44148	adds x12,x1,x12
00a4414c	and x17,x16,#0x7ffffffffffff
00a44150	extr x15,x15,x16,#0x33
00a44154	adcs x16,x24,x23
00a44158	adds x12,x12,x21
00a4415c	extr x18,x18,x0,#0x33
00a44160	adcs x16,x16,x20
00a44164	adds x12,x12,x18
00a44168	adcs x16,x16,xzr
00a4416c	adds x11,x5,x11
00a44170	and x18,x12,#0x7ffffffffffff
00a44174	extr x12,x16,x12,#0x33
00a44178	adcs x16,x19,x28
00a4417c	adds x11,x11,x13
00a44180	adcs x13,x16,x6
00a44184	adds x11,x11,x15
00a44188	umulh x4,x10,x10
00a4418c	mul x10,x10,x10
00a44190	adcs x13,x13,xzr
00a44194	adds x10,x26,x10
00a44198	and x15,x11,#0x7ffffffffffff
00a4419c	extr x11,x13,x11,#0x33
00a441a0	adcs x13,x25,x4
00a441a4	adds x14,x10,x14
00a441a8	adcs x13,x13,x22
00a441ac	adds x14,x14,x12
00a441b0	adcs x13,x13,xzr
00a441b4	and x7,x0,#0x7ffffffffffff
00a441b8	extr x13,x13,x14,#0x33
00a441bc	add x16,x7,x11
00a441c0	and x12,x14,#0x7ffffffffffff
00a441c4	madd x14,x13,x8,x17
00a441c8	add x11,x18,x16, LSR #0x33
00a441cc	and x10,x16,#0x7ffffffffffff
00a441d0	subs w9,w9,#0x1
00a441d4	add x13,x15,x14, LSR #0x33
00a441d8	and x14,x14,#0x7ffffffffffff
00a441dc	b.ne 0x00a440a0
00a441e0	sub x0,x29,#0xd0
00a441e4	sub x1,x29,#0xd0
00a441e8	sub x2,x29,#0xa8
00a441ec	stp x14,x13,[x29, #-0xd0]
00a441f0	stp x10,x11,[x29, #-0xc0]
00a441f4	stur x12,[x29, #-0xb0]
00a441f8	bl 0x00a46a4c
00a441fc	ldp x9,x10,[x29, #-0xd0]
00a44200	ldp x11,x12,[x29, #-0xc0]
00a44204	ldur x13,[x29, #-0xb0]
00a44208	mov w8,#0x13
00a4420c	umulh x14,x9,x9
00a44210	mul x15,x9,x9
00a44214	lsl x9,x9,#0x1
00a44218	mul x18,x10,x10
00a4421c	mul x7,x11,x9
00a44220	umulh x17,x10,x10
00a44224	mul x1,x12,x8
00a44228	umulh x6,x11,x9
00a4422c	adds x18,x7,x18
00a44230	lsl x0,x10,#0x1
00a44234	umulh x5,x9,x10
00a44238	mul x10,x9,x10
00a4423c	adcs x17,x6,x17
00a44240	mul x6,x1,x12
00a44244	mul x16,x13,x8
00a44248	lsl x2,x12,#0x1
00a4424c	umulh x19,x12,x9
00a44250	mul x20,x12,x9
00a44254	umulh x24,x12,x0
00a44258	mul x7,x12,x0
00a4425c	adds x10,x6,x10
00a44260	umulh x12,x1,x12
00a44264	adcs x12,x12,x5
00a44268	umulh x5,x16,x2
00a4426c	mul x2,x16,x2
00a44270	lsl x4,x11,#0x1
00a44274	adds x18,x18,x2
00a44278	umulh x2,x1,x4
00a4427c	mul x1,x1,x4
00a44280	adcs x17,x17,x5
00a44284	adds x15,x1,x15
00a44288	umulh x21,x13,x9
00a4428c	mul x9,x13,x9
00a44290	umulh x22,x16,x13
00a44294	mul x13,x16,x13
00a44298	umulh x6,x16,x0
00a4429c	umulh x5,x16,x4
00a442a0	mul x4,x16,x4
00a442a4	mul x16,x16,x0
00a442a8	adcs x14,x2,x14
00a442ac	adds x15,x15,x16
00a442b0	adcs x14,x14,x6
00a442b4	adds x10,x10,x4
00a442b8	umulh x23,x0,x11
00a442bc	mul x0,x0,x11
00a442c0	adcs x12,x12,x5
00a442c4	and x16,x15,#0x7ffffffffffff
00a442c8	extr x14,x14,x15,#0x33
00a442cc	adds x15,x20,x0
00a442d0	and x1,x18,#0x7ffffffffffff
00a442d4	extr x17,x17,x18,#0x33
00a442d8	adcs x18,x19,x23
00a442dc	adds x13,x15,x13
00a442e0	adcs x15,x18,x22
00a442e4	adds x13,x13,x17
00a442e8	adcs x15,x15,xzr
00a442ec	adds x10,x10,x14
00a442f0	umulh x3,x11,x11
00a442f4	mul x11,x11,x11
00a442f8	adcs x12,x12,xzr
00a442fc	adds x11,x7,x11
00a44300	and x14,x10,#0x7ffffffffffff
00a44304	extr x10,x12,x10,#0x33
00a44308	adcs x12,x24,x3
00a4430c	adds x9,x11,x9
00a44310	and x17,x13,#0x7ffffffffffff
00a44314	extr x13,x15,x13,#0x33
00a44318	adcs x12,x12,x21
00a4431c	adds x9,x9,x13
00a44320	adcs x13,x12,xzr
00a44324	and x12,x9,#0x7ffffffffffff
00a44328	extr x9,x13,x9,#0x33
00a4432c	add x10,x1,x10
00a44330	madd x9,x9,x8,x16
00a44334	add x11,x17,x10, LSR #0x33
00a44338	and x10,x10,#0x7ffffffffffff
00a4433c	add x13,x14,x9, LSR #0x33
00a44340	and x14,x9,#0x7ffffffffffff
00a44344	mov w9,#0x63
00a44348	stp x14,x13,[x29, #-0xf8]
00a4434c	stp x10,x11,[x29, #-0xe8]
00a44350	stur x12,[x29, #-0xd8]
00a44354	mul x17,x12,x8
00a44358	lsl x3,x11,#0x1
00a4435c	mul x0,x13,x13
00a44360	mul x28,x3,x17
00a44364	umulh x15,x14,x14
00a44368	mul x16,x14,x14
00a4436c	lsl x14,x14,#0x1
00a44370	umulh x18,x13,x13
00a44374	adds x0,x0,x28
00a44378	umulh x3,x3,x17
00a4437c	mul x19,x14,x10
00a44380	adcs x18,x18,x3
00a44384	lsl x1,x13,#0x1
00a44388	mul x2,x11,x8
00a4438c	lsl x5,x10,#0x1
00a44390	umulh x7,x14,x10
00a44394	adds x0,x0,x19
00a44398	umulh x20,x14,x11
00a4439c	mul x21,x14,x11
00a443a0	umulh x25,x1,x11
00a443a4	mul x26,x1,x11
00a443a8	umulh x28,x2,x11
00a443ac	mul x11,x2,x11
00a443b0	umulh x3,x5,x2
00a443b4	mul x2,x5,x2
00a443b8	adcs x18,x18,x7
00a443bc	adds x16,x16,x2
00a443c0	umulh x6,x14,x13
00a443c4	mul x13,x14,x13
00a443c8	umulh x22,x14,x12
00a443cc	mul x14,x14,x12
00a443d0	umulh x23,x17,x12
00a443d4	mul x12,x17,x12
00a443d8	umulh x27,x1,x17
00a443dc	umulh x19,x5,x17
00a443e0	mul x5,x5,x17
00a443e4	mul x17,x1,x17
00a443e8	adcs x15,x15,x3
00a443ec	adds x16,x16,x17
00a443f0	umulh x24,x1,x10
00a443f4	mul x1,x1,x10
00a443f8	adcs x15,x15,x27
00a443fc	adds x12,x1,x12
00a44400	and x17,x16,#0x7ffffffffffff
00a44404	extr x15,x15,x16,#0x33
00a44408	adcs x16,x24,x23
00a4440c	adds x12,x12,x21
00a44410	extr x18,x18,x0,#0x33
00a44414	adcs x16,x16,x20
00a44418	adds x12,x12,x18
00a4441c	adcs x16,x16,xzr
00a44420	adds x11,x5,x11
00a44424	and x18,x12,#0x7ffffffffffff
00a44428	extr x12,x16,x12,#0x33
00a4442c	adcs x16,x19,x28
00a44430	adds x11,x11,x13
00a44434	adcs x13,x16,x6
00a44438	adds x11,x11,x15
00a4443c	umulh x4,x10,x10
00a44440	mul x10,x10,x10
00a44444	adcs x13,x13,xzr
00a44448	adds x10,x26,x10
00a4444c	and x15,x11,#0x7ffffffffffff
00a44450	extr x11,x13,x11,#0x33
00a44454	adcs x13,x25,x4
00a44458	adds x14,x10,x14
00a4445c	adcs x13,x13,x22
00a44460	adds x14,x14,x12
00a44464	adcs x13,x13,xzr
00a44468	and x7,x0,#0x7ffffffffffff
00a4446c	extr x13,x13,x14,#0x33
00a44470	add x16,x7,x11
00a44474	and x12,x14,#0x7ffffffffffff
00a44478	madd x14,x13,x8,x17
00a4447c	add x11,x18,x16, LSR #0x33
00a44480	and x10,x16,#0x7ffffffffffff
00a44484	subs w9,w9,#0x1
00a44488	add x13,x15,x14, LSR #0x33
00a4448c	and x14,x14,#0x7ffffffffffff
00a44490	b.ne 0x00a44354
00a44494	sub x0,x29,#0xd0
00a44498	sub x1,x29,#0xf8
00a4449c	sub x2,x29,#0xd0
00a444a0	stp x14,x13,[x29, #-0xf8]
00a444a4	stp x10,x11,[x29, #-0xe8]
00a444a8	stur x12,[x29, #-0xd8]
00a444ac	bl 0x00a46a4c
00a444b0	ldp x14,x13,[x29, #-0xd0]
00a444b4	ldp x10,x11,[x29, #-0xc0]
00a444b8	ldur x12,[x29, #-0xb0]
00a444bc	mov w8,#0x32
00a444c0	mov w9,#0x13
00a444c4	mul x17,x12,x9
00a444c8	lsl x3,x11,#0x1
00a444cc	mul x0,x13,x13
00a444d0	mul x28,x3,x17
00a444d4	umulh x15,x14,x14
00a444d8	mul x16,x14,x14
00a444dc	lsl x14,x14,#0x1
00a444e0	umulh x18,x13,x13
00a444e4	adds x0,x0,x28
00a444e8	umulh x3,x3,x17
00a444ec	mul x19,x14,x10
00a444f0	adcs x18,x18,x3
00a444f4	lsl x1,x13,#0x1
00a444f8	mul x2,x11,x9
00a444fc	lsl x5,x10,#0x1
00a44500	umulh x7,x14,x10
00a44504	adds x0,x0,x19
00a44508	umulh x20,x14,x11
00a4450c	mul x21,x14,x11
00a44510	umulh x25,x1,x11
00a44514	mul x26,x1,x11
00a44518	umulh x28,x2,x11
00a4451c	mul x11,x2,x11
00a44520	umulh x3,x5,x2
00a44524	mul x2,x5,x2
00a44528	adcs x18,x18,x7
00a4452c	adds x16,x16,x2
00a44530	umulh x6,x14,x13
00a44534	mul x13,x14,x13
00a44538	umulh x22,x14,x12
00a4453c	mul x14,x14,x12
00a44540	umulh x23,x17,x12
00a44544	mul x12,x17,x12
00a44548	umulh x27,x1,x17
00a4454c	umulh x19,x5,x17
00a44550	mul x5,x5,x17
00a44554	mul x17,x1,x17
00a44558	adcs x15,x15,x3
00a4455c	adds x16,x16,x17
00a44560	umulh x24,x1,x10
00a44564	mul x1,x1,x10
00a44568	adcs x15,x15,x27
00a4456c	adds x12,x1,x12
00a44570	and x17,x16,#0x7ffffffffffff
00a44574	extr x15,x15,x16,#0x33
00a44578	adcs x16,x24,x23
00a4457c	adds x12,x12,x21
00a44580	extr x18,x18,x0,#0x33
00a44584	adcs x16,x16,x20
00a44588	adds x12,x12,x18
00a4458c	adcs x16,x16,xzr
00a44590	adds x11,x5,x11
00a44594	and x18,x12,#0x7ffffffffffff
00a44598	extr x12,x16,x12,#0x33
00a4459c	adcs x16,x19,x28
00a445a0	adds x11,x11,x13
00a445a4	adcs x13,x16,x6
00a445a8	adds x11,x11,x15
00a445ac	umulh x4,x10,x10
00a445b0	mul x10,x10,x10
00a445b4	adcs x13,x13,xzr
00a445b8	adds x10,x26,x10
00a445bc	and x15,x11,#0x7ffffffffffff
00a445c0	extr x11,x13,x11,#0x33
00a445c4	adcs x13,x25,x4
00a445c8	adds x14,x10,x14
00a445cc	adcs x13,x13,x22
00a445d0	adds x14,x14,x12
00a445d4	adcs x13,x13,xzr
00a445d8	and x7,x0,#0x7ffffffffffff
00a445dc	extr x13,x13,x14,#0x33
00a445e0	add x16,x7,x11
00a445e4	and x12,x14,#0x7ffffffffffff
00a445e8	madd x14,x13,x9,x17
00a445ec	add x11,x18,x16, LSR #0x33
00a445f0	and x10,x16,#0x7ffffffffffff
00a445f4	subs w8,w8,#0x1
00a445f8	add x13,x15,x14, LSR #0x33
00a445fc	and x14,x14,#0x7ffffffffffff
00a44600	b.ne 0x00a444c4
00a44604	sub x0,x29,#0xa8
00a44608	sub x1,x29,#0xd0
00a4460c	sub x2,x29,#0xa8
00a44610	stp x14,x13,[x29, #-0xd0]
00a44614	stp x10,x11,[x29, #-0xc0]
00a44618	stur x12,[x29, #-0xb0]
00a4461c	bl 0x00a46a4c
00a44620	ldp x14,x13,[x29, #-0xa8]
00a44624	ldp x10,x11,[x29, #-0x98]
00a44628	ldur x12,[x29, #-0x88]
00a4462c	mov w8,#0x5
00a44630	mov w9,#0x13
00a44634	mul x17,x12,x9
00a44638	lsl x3,x11,#0x1
00a4463c	mul x0,x13,x13
00a44640	mul x28,x3,x17
00a44644	umulh x15,x14,x14
00a44648	mul x16,x14,x14
00a4464c	lsl x14,x14,#0x1
00a44650	umulh x18,x13,x13
00a44654	adds x0,x0,x28
00a44658	umulh x3,x3,x17
00a4465c	mul x19,x14,x10
00a44660	adcs x18,x18,x3
00a44664	lsl x1,x13,#0x1
00a44668	mul x2,x11,x9
00a4466c	lsl x5,x10,#0x1
00a44670	umulh x7,x14,x10
00a44674	adds x0,x0,x19
00a44678	umulh x20,x14,x11
00a4467c	mul x21,x14,x11
00a44680	umulh x25,x1,x11
00a44684	mul x26,x1,x11
00a44688	umulh x28,x2,x11
00a4468c	mul x11,x2,x11
00a44690	umulh x3,x5,x2
00a44694	mul x2,x5,x2
00a44698	adcs x18,x18,x7
00a4469c	adds x16,x16,x2
00a446a0	umulh x6,x14,x13
00a446a4	mul x13,x14,x13
00a446a8	umulh x22,x14,x12
00a446ac	mul x14,x14,x12
00a446b0	umulh x23,x17,x12
00a446b4	mul x12,x17,x12
00a446b8	umulh x27,x1,x17
00a446bc	umulh x19,x5,x17
00a446c0	mul x5,x5,x17
00a446c4	mul x17,x1,x17
00a446c8	adcs x15,x15,x3
00a446cc	adds x16,x16,x17
00a446d0	umulh x24,x1,x10
00a446d4	mul x1,x1,x10
00a446d8	adcs x15,x15,x27
00a446dc	adds x12,x1,x12
00a446e0	and x17,x16,#0x7ffffffffffff
00a446e4	extr x15,x15,x16,#0x33
00a446e8	adcs x16,x24,x23
00a446ec	adds x12,x12,x21
00a446f0	extr x18,x18,x0,#0x33
00a446f4	adcs x16,x16,x20
00a446f8	adds x12,x12,x18
00a446fc	adcs x16,x16,xzr
00a44700	adds x11,x5,x11
00a44704	and x18,x12,#0x7ffffffffffff
00a44708	extr x12,x16,x12,#0x33
00a4470c	adcs x16,x19,x28
00a44710	adds x11,x11,x13
00a44714	adcs x13,x16,x6
00a44718	adds x11,x11,x15
00a4471c	umulh x4,x10,x10
00a44720	mul x10,x10,x10
00a44724	adcs x13,x13,xzr
00a44728	adds x10,x26,x10
00a4472c	and x15,x11,#0x7ffffffffffff
00a44730	extr x11,x13,x11,#0x33
00a44734	adcs x13,x25,x4
00a44738	adds x14,x10,x14
00a4473c	adcs x13,x13,x22
00a44740	adds x14,x14,x12
00a44744	adcs x13,x13,xzr
00a44748	and x7,x0,#0x7ffffffffffff
00a4474c	extr x13,x13,x14,#0x33
00a44750	add x16,x7,x11
00a44754	and x12,x14,#0x7ffffffffffff
00a44758	madd x14,x13,x9,x17
00a4475c	add x11,x18,x16, LSR #0x33
00a44760	and x10,x16,#0x7ffffffffffff
00a44764	subs w8,w8,#0x1
00a44768	add x13,x15,x14, LSR #0x33
00a4476c	and x14,x14,#0x7ffffffffffff
00a44770	b.ne 0x00a44634
00a44774	add x0,sp,#0x110
00a44778	sub x1,x29,#0xa8
00a4477c	sub x2,x29,#0x80
00a44780	stp x14,x13,[x29, #-0xa8]
00a44784	stp x10,x11,[x29, #-0x98]
00a44788	stur x12,[x29, #-0x88]
00a4478c	bl 0x00a46a4c
00a44790	add x0,sp,#0x138
00a44794	add x1,sp,#0x138
00a44798	add x2,sp,#0x110
00a4479c	bl 0x00a46a4c
00a447a0	ldp x9,x10,[sp, #0x138]
00a447a4	ldp x11,x12,[sp, #0x148]
00a447a8	ldr x8,[sp, #0x158]
00a447ac	ldr x19,[sp, #0x8]
00a447b0	add x14,x9,#0x13
00a447b4	add x14,x10,x14, LSR #0x33
00a447b8	add x14,x11,x14, LSR #0x33
00a447bc	add x14,x12,x14, LSR #0x33
00a447c0	add x14,x8,x14, LSR #0x33
00a447c4	mov w13,#0x13
00a447c8	lsr x14,x14,#0x33
00a447cc	madd x9,x14,x13,x9
00a447d0	lsr x13,x9,#0x8
00a447d4	lsr x14,x9,#0x10
00a447d8	strb w13,[x19, #0x1]
00a447dc	lsr x13,x9,#0x18
00a447e0	add x10,x10,x9, LSR #0x33
00a447e4	strb w9,[x19]
00a447e8	strb w14,[x19, #0x2]
00a447ec	lsr x14,x9,#0x20
00a447f0	strb w13,[x19, #0x3]
00a447f4	lsr x13,x9,#0x28
00a447f8	lsr x9,x9,#0x30
00a447fc	strb w14,[x19, #0x4]
00a44800	strb w13,[x19, #0x5]
00a44804	bfm w9,w10,#0x1d,#0x1c
00a44808	lsr x13,x10,#0x5
00a4480c	lsr x14,x10,#0xd
00a44810	add x11,x11,x10, LSR #0x33
00a44814	strb w9,[x19, #0x6]
00a44818	lsr x9,x10,#0x15
00a4481c	strb w13,[x19, #0x7]
00a44820	lsr x13,x10,#0x1d
00a44824	strb w14,[x19, #0x8]
00a44828	lsr x14,x10,#0x25
00a4482c	lsr x10,x10,#0x2d
00a44830	strb w9,[x19, #0x9]
00a44834	strb w13,[x19, #0xa]
00a44838	bfm w10,w11,#0x1a,#0x19
00a4483c	lsr x9,x11,#0x2
00a44840	lsr x13,x11,#0xa
00a44844	add x12,x12,x11, LSR #0x33
00a44848	strb w14,[x19, #0xb]
00a4484c	lsr x14,x11,#0x12
00a44850	strb w10,[x19, #0xc]
00a44854	lsr x10,x11,#0x1a
00a44858	strb w9,[x19, #0xd]
00a4485c	lsr x9,x11,#0x22
00a44860	strb w13,[x19, #0xe]
00a44864	lsr x13,x11,#0x2a
00a44868	lsr x11,x11,#0x32
00a4486c	bfm w11,w12,#0x1f,#0x1e
00a44870	add x8,x8,x12, LSR #0x33
00a44874	strb w14,[x19, #0xf]
00a44878	strb w10,[x19, #0x10]
00a4487c	strb w9,[x19, #0x11]
00a44880	strb w13,[x19, #0x12]
00a44884	lsr x9,x12,#0x7
00a44888	lsr x10,x12,#0xf
00a4488c	lsr x13,x12,#0x17
00a44890	lsr x14,x12,#0x1f
00a44894	strb w11,[x19, #0x13]
00a44898	lsr x11,x12,#0x27
00a4489c	lsr x12,x12,#0x2f
00a448a0	strb w9,[x19, #0x14]
00a448a4	strb w10,[x19, #0x15]
00a448a8	strb w13,[x19, #0x16]
00a448ac	strb w14,[x19, #0x17]
00a448b0	strb w11,[x19, #0x18]
00a448b4	bfm w12,w8,#0x1c,#0x1b
00a448b8	lsr x9,x8,#0x4
00a448bc	lsr x10,x8,#0xc
00a448c0	lsr x11,x8,#0x14
00a448c4	lsr x13,x8,#0x1c
00a448c8	lsr x14,x8,#0x24
00a448cc	ubfx x8,x8,#0x2c,#0x7
00a448d0	add x0,sp,#0x70
00a448d4	mov w1,#0x20
00a448d8	strb w12,[x19, #0x19]
00a448dc	strb w9,[x19, #0x1a]
00a448e0	strb w10,[x19, #0x1b]
00a448e4	strb w11,[x19, #0x1c]
00a448e8	strb w13,[x19, #0x1d]
00a448ec	strb w14,[x19, #0x1e]
00a448f0	strb w8,[x19, #0x1f]
00a448f4	bl 0x00c34750
00a448f8	adrp x0,0x758000
00a448fc	add x0,x0,#0xc07
00a44900	mov w2,#0x20
00a44904	mov x1,x19
00a44908	bl 0x00c362f0
00a4490c	cmp w0,#0x0
00a44910	cset w0,ne
00a44914	add sp,sp,#0x230
00a44918	ldp x29,x30,[sp, #0x50]
00a4491c	ldp x20,x19,[sp, #0x40]
00a44920	ldp x22,x21,[sp, #0x30]
00a44924	ldp x24,x23,[sp, #0x20]
00a44928	ldp x26,x25,[sp, #0x10]
00a4492c	ldp x28,x27,[sp], #0x60
00a44930	ret
