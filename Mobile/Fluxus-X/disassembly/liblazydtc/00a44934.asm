; ossl_x25519_public_from_private @ 00a44934
00a44934	sub sp,sp,#0x170
00a44938	stp x28,x21,[sp, #0x140]
00a4493c	stp x20,x19,[sp, #0x150]
00a44940	stp x29,x30,[sp, #0x160]
00a44944	ldr q0,[x1]
00a44948	add x29,sp,#0x160
00a4494c	sub x8,x29,#0x40
00a44950	mov x19,x0
00a44954	str q0,[x8]
00a44958	ldr q0,[x1, #0x10]
00a4495c	ldurb w9,[x29, #-0x40]
00a44960	add x0,sp,#0x80
00a44964	sub x1,x29,#0x40
00a44968	str q0,[x8, #0x10]
00a4496c	and w8,w9,#0xf8
00a44970	sturb w8,[x29, #-0x40]
00a44974	ldurb w8,[x29, #-0x21]
00a44978	mov w9,#0x40
00a4497c	bfxil w9,w8,#0x0,#0x6
00a44980	sturb w9,[x29, #-0x21]
00a44984	bl 0x00a3fd34
00a44988	ldp w8,w10,[sp, #0xd0]
00a4498c	ldp w9,w11,[sp, #0xa8]
00a44990	ldp w12,w14,[sp, #0xd8]
00a44994	ldp w13,w15,[sp, #0xb0]
00a44998	ldp w16,w18,[sp, #0xe0]
00a4499c	ldp w17,w0,[sp, #0xb8]
00a449a0	ldp w1,w3,[sp, #0xe8]
00a449a4	ldp w2,w4,[sp, #0xc0]
00a449a8	ldp w5,w7,[sp, #0xf0]
00a449ac	ldp w6,w20,[sp, #0xc8]
00a449b0	add w21,w9,w8
00a449b4	sub w8,w8,w9
00a449b8	add w9,w11,w10
00a449bc	sub w10,w10,w11
00a449c0	add w11,w13,w12
00a449c4	sub w12,w12,w13
00a449c8	add w13,w15,w14
00a449cc	sub w14,w14,w15
00a449d0	add w15,w17,w16
00a449d4	sub w16,w16,w17
00a449d8	add w17,w0,w18
00a449dc	sub w18,w18,w0
00a449e0	add w0,w2,w1
00a449e4	sub w1,w1,w2
00a449e8	add w2,w4,w3
00a449ec	sub w3,w3,w4
00a449f0	add w4,w6,w5
00a449f4	sub w5,w5,w6
00a449f8	add w6,w20,w7
00a449fc	sub w7,w7,w20
00a44a00	stp w0,w2,[sp, #0x70]
00a44a04	stp w1,w3,[sp, #0x48]
00a44a08	add x0,sp,#0x8
00a44a0c	add x1,sp,#0x30
00a44a10	stp w21,w9,[sp, #0x58]
00a44a14	stp w11,w13,[sp, #0x60]
00a44a18	stp w15,w17,[sp, #0x68]
00a44a1c	stp w4,w6,[sp, #0x78]
00a44a20	stp w8,w10,[sp, #0x30]
00a44a24	stp w12,w14,[sp, #0x38]
00a44a28	stp w16,w18,[sp, #0x40]
00a44a2c	stp w5,w7,[sp, #0x50]
00a44a30	bl 0x00a44a70
00a44a34	add x0,sp,#0x58
00a44a38	add x1,sp,#0x58
00a44a3c	add x2,sp,#0x8
00a44a40	bl 0x00a44e38
00a44a44	add x1,sp,#0x58
00a44a48	mov x0,x19
00a44a4c	bl 0x00a45158
00a44a50	sub x0,x29,#0x40
00a44a54	mov w1,#0x20
00a44a58	bl 0x00c34750
00a44a5c	ldp x29,x30,[sp, #0x160]
00a44a60	ldp x20,x19,[sp, #0x150]
00a44a64	ldp x28,x21,[sp, #0x140]
00a44a68	add sp,sp,#0x170
00a44a6c	ret
