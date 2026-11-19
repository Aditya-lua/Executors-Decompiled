; ossl_curve448_point_decode_like_eddsa_and_mul_by_ratio @ 00a487a8
00a487a8	sub sp,sp,#0x1b0
00a487ac	stp x28,x27,[sp, #0x150]
00a487b0	stp x26,x25,[sp, #0x160]
00a487b4	stp x24,x23,[sp, #0x170]
00a487b8	stp x22,x21,[sp, #0x180]
00a487bc	stp x20,x19,[sp, #0x190]
00a487c0	stp x29,x30,[sp, #0x1a0]
00a487c4	ldur q0,[x1, #0x29]
00a487c8	add x20,x0,#0x40
00a487cc	mov x19,x0
00a487d0	mov w2,#0x1
00a487d4	stur q0,[sp, #0xe9]
00a487d8	ldr q0,[x1, #0x20]
00a487dc	ldrb w8,[sp, #0xf8]
00a487e0	mov x0,x20
00a487e4	mov w3,wzr
00a487e8	str q0,[sp, #0xe0]
00a487ec	ldr q0,[x1, #0x10]
00a487f0	and x9,x8,#0x80
00a487f4	and w8,w8,#0x7f
00a487f8	add x29,sp,#0x1a0
00a487fc	str q0,[sp, #0xd0]
00a48800	ldr q0,[x1]
00a48804	add x1,sp,#0xc0
00a48808	sub x27,x9,#0x1
00a4880c	strb w8,[sp, #0xf8]
00a48810	str q0,[sp, #0xc0]
00a48814	bl 0x00c3a5a0
00a48818	ldrb w8,[sp, #0xf8]
00a4881c	mov x1,x20
00a48820	sub x8,x8,#0x1
00a48824	asr x8,x8,#0x3f
00a48828	and w22,w8,w0
00a4882c	mov x0,x19
00a48830	bl 0x00c3a4d0
00a48834	adrp x24,0x760000
00a48838	add x23,x19,#0x80
00a4883c	add x24,x24,#0xa00
00a48840	mov x0,x23
00a48844	mov x1,x24
00a48848	mov x2,x19
00a4884c	bl 0x00c3a5f0
00a48850	add x21,x19,#0xc0
00a48854	mov w2,#0x98a9
00a48858	mov x0,x21
00a4885c	mov x1,x19
00a48860	bl 0x00c3a4c0
00a48864	adrp x25,0x760000
00a48868	add x25,x25,#0x980
00a4886c	mov x0,x21
00a48870	mov x1,x25
00a48874	mov x2,x21
00a48878	bl 0x00c3a5f0
00a4887c	mov x0,x21
00a48880	mov x1,x24
00a48884	mov x2,x21
00a48888	bl 0x00c3a5f0
00a4888c	mov x0,x19
00a48890	mov x1,x23
00a48894	mov x2,x21
00a48898	bl 0x00c3a4b0
00a4889c	mov x0,x21
00a488a0	mov x1,x19
00a488a4	bl 0x00c3a5c0
00a488a8	and w22,w22,w0
00a488ac	mov x0,x19
00a488b0	mov x1,x21
00a488b4	mov x2,x23
00a488b8	bl 0x00c3a4b0
00a488bc	mov x0,x19
00a488c0	bl 0x00c3a5d0
00a488c4	eor x26,x0,x27, ASR #0x3f
00a488c8	eon x27,x0,x27, ASR #0x3f
00a488cc	sub x0,x29,#0xa0
00a488d0	mov x1,x25
00a488d4	mov x2,x19
00a488d8	bl 0x00c3a5f0
00a488dc	ldur x8,[x29, #-0xa0]
00a488e0	str x27,[sp, #0x80]
00a488e4	ldr x10,[sp, #0x80]
00a488e8	str x26,[sp, #0x80]
00a488ec	ldr x11,[sp, #0x80]
00a488f0	add x0,sp,#0x40
00a488f4	and x8,x10,x8
00a488f8	ldp x9,x10,[x19]
00a488fc	mov x1,x19
00a48900	and x9,x11,x9
00a48904	orr x8,x9,x8
00a48908	str x8,[x19]
00a4890c	ldur x8,[x29, #-0x98]
00a48910	str x27,[sp, #0x80]
00a48914	ldr x9,[sp, #0x80]
00a48918	str x26,[sp, #0x80]
00a4891c	ldr x11,[sp, #0x80]
00a48920	and x8,x9,x8
00a48924	and x10,x11,x10
00a48928	orr x8,x10,x8
00a4892c	str x8,[x19, #0x8]
00a48930	ldur x8,[x29, #-0x90]
00a48934	str x27,[sp, #0x80]
00a48938	ldr x10,[sp, #0x80]
00a4893c	str x26,[sp, #0x80]
00a48940	ldr x11,[sp, #0x80]
00a48944	and x8,x10,x8
00a48948	ldp x9,x10,[x19, #0x10]
00a4894c	and x9,x11,x9
00a48950	orr x8,x9,x8
00a48954	str x8,[x19, #0x10]
00a48958	ldur x8,[x29, #-0x88]
00a4895c	str x27,[sp, #0x80]
00a48960	ldr x9,[sp, #0x80]
00a48964	str x26,[sp, #0x80]
00a48968	ldr x11,[sp, #0x80]
00a4896c	and x8,x9,x8
00a48970	and x10,x11,x10
00a48974	orr x8,x10,x8
00a48978	str x8,[x19, #0x18]
00a4897c	ldur x8,[x29, #-0x80]
00a48980	str x27,[sp, #0x80]
00a48984	ldr x10,[sp, #0x80]
00a48988	str x26,[sp, #0x80]
00a4898c	ldr x11,[sp, #0x80]
00a48990	and x8,x10,x8
00a48994	ldp x9,x10,[x19, #0x20]
00a48998	and x9,x11,x9
00a4899c	orr x8,x9,x8
00a489a0	str x8,[x19, #0x20]
00a489a4	ldur x8,[x29, #-0x78]
00a489a8	str x27,[sp, #0x80]
00a489ac	ldr x9,[sp, #0x80]
00a489b0	str x26,[sp, #0x80]
00a489b4	ldr x11,[sp, #0x80]
00a489b8	and x8,x9,x8
00a489bc	ldr x9,[x19, #0x30]
00a489c0	and x10,x11,x10
00a489c4	orr x8,x10,x8
00a489c8	str x8,[x19, #0x28]
00a489cc	ldur x8,[x29, #-0x70]
00a489d0	str x27,[sp, #0x80]
00a489d4	ldr x10,[sp, #0x80]
00a489d8	str x26,[sp, #0x80]
00a489dc	ldr x11,[sp, #0x80]
00a489e0	ldp q0,q1,[x24, #0x20]
00a489e4	and x8,x10,x8
00a489e8	ldr x10,[x19, #0x38]
00a489ec	and x9,x11,x9
00a489f0	orr x8,x9,x8
00a489f4	str x8,[x19, #0x30]
00a489f8	ldur x8,[x29, #-0x68]
00a489fc	str x27,[sp, #0x80]
00a48a00	ldr x9,[sp, #0x80]
00a48a04	str x26,[sp, #0x80]
00a48a08	ldr x11,[sp, #0x80]
00a48a0c	stp q0,q1,[x19, #0xa0]
00a48a10	ldp q0,q1,[x24]
00a48a14	and x8,x9,x8
00a48a18	and x9,x11,x10
00a48a1c	orr x8,x9,x8
00a48a20	str x8,[x19, #0x38]
00a48a24	stp q0,q1,[x19, #0x80]
00a48a28	bl 0x00c3a4d0
00a48a2c	sub x0,x29,#0xa0
00a48a30	mov x1,x20
00a48a34	bl 0x00c3a4d0
00a48a38	mov x0,sp
00a48a3c	add x1,sp,#0x40
00a48a40	sub x2,x29,#0xa0
00a48a44	bl 0x00c3a590
00a48a48	mov x0,x21
00a48a4c	mov x1,x20
00a48a50	mov x2,x19
00a48a54	bl 0x00c3a590
00a48a58	add x0,sp,#0x80
00a48a5c	mov x1,x21
00a48a60	bl 0x00c3a4d0
00a48a64	add x0,sp,#0x80
00a48a68	add x1,sp,#0x80
00a48a6c	mov x2,sp
00a48a70	bl 0x00c3a5f0
00a48a74	sub x1,x29,#0xa0
00a48a78	add x2,sp,#0x40
00a48a7c	mov x0,x21
00a48a80	bl 0x00c3a5f0
00a48a84	mov x0,x19
00a48a88	mov x1,x23
00a48a8c	bl 0x00c3a4d0
00a48a90	mov x0,x23
00a48a94	mov x1,x19
00a48a98	mov x2,x19
00a48a9c	bl 0x00c3a590
00a48aa0	sub x0,x29,#0xa0
00a48aa4	mov x2,sp
00a48aa8	mov x1,x23
00a48aac	bl 0x00c3a5f0
00a48ab0	sub x1,x29,#0xa0
00a48ab4	add x2,sp,#0x80
00a48ab8	mov x0,x19
00a48abc	bl 0x00c3a4b0
00a48ac0	sub x2,x29,#0xa0
00a48ac4	mov x0,x23
00a48ac8	mov x1,x21
00a48acc	bl 0x00c3a4b0
00a48ad0	mov x2,sp
00a48ad4	mov x0,x20
00a48ad8	mov x1,x21
00a48adc	bl 0x00c3a4b0
00a48ae0	add x1,sp,#0x80
00a48ae4	mov x2,sp
00a48ae8	mov x0,x21
00a48aec	bl 0x00c3a4b0
00a48af0	sub x0,x29,#0xa0
00a48af4	mov w1,#0x40
00a48af8	bl 0x00c34750
00a48afc	add x0,sp,#0x80
00a48b00	mov w1,#0x40
00a48b04	bl 0x00c34750
00a48b08	add x0,sp,#0x40
00a48b0c	mov w1,#0x40
00a48b10	bl 0x00c34750
00a48b14	mov x0,sp
00a48b18	mov w1,#0x40
00a48b1c	bl 0x00c34750
00a48b20	add x0,sp,#0xc0
00a48b24	mov w1,#0x39
00a48b28	bl 0x00c34750
00a48b2c	mov w0,w22
00a48b30	ldp x29,x30,[sp, #0x1a0]
00a48b34	ldp x20,x19,[sp, #0x190]
00a48b38	ldp x22,x21,[sp, #0x180]
00a48b3c	ldp x24,x23,[sp, #0x170]
00a48b40	ldp x26,x25,[sp, #0x160]
00a48b44	ldp x28,x27,[sp, #0x150]
00a48b48	add sp,sp,#0x1b0
00a48b4c	ret
