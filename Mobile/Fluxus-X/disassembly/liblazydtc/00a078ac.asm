; bn_sqr_comba4 @ 00a078ac
00a078ac	ldr x9,[x1]
00a078b0	mov w8,#0x2
00a078b4	and x10,x9,#0xffffffff
00a078b8	lsr x9,x9,#0x20
00a078bc	mul x11,x10,x9
00a078c0	mul x10,x10,x10
00a078c4	adds x10,x10,x11, LSL #0x21
00a078c8	str x10,[x0]
00a078cc	ldp x10,x12,[x1]
00a078d0	mul x9,x9,x9
00a078d4	add x9,x9,x11, LSR #0x1f
00a078d8	cinc x9,x9,cs
00a078dc	and x11,x12,#0xffffffff
00a078e0	lsr x12,x12,#0x20
00a078e4	and x13,x10,#0xffffffff
00a078e8	lsr x10,x10,#0x20
00a078ec	mul x14,x10,x11
00a078f0	mul x11,x13,x11
00a078f4	mul x13,x13,x12
00a078f8	mul x10,x10,x12
00a078fc	adds x12,x14,x13
00a07900	cset w13,cs
00a07904	add x10,x10,x12, LSR #0x20
00a07908	adds x11,x11,x12, LSL #0x20
00a0790c	add x10,x10,x13, LSL #0x20
00a07910	cinc x10,x10,cs
00a07914	adds x9,x9,x11
00a07918	cinc x12,x10,cs
00a0791c	adds x9,x9,x11
00a07920	str x9,[x0, #0x8]
00a07924	cinc x10,x10,cs
00a07928	ldp x9,x11,[x1]
00a0792c	adds x10,x12,x10
00a07930	ldr x12,[x1, #0x10]
00a07934	cset w13,cs
00a07938	and x14,x11,#0xffffffff
00a0793c	lsr x11,x11,#0x20
00a07940	and x15,x12,#0xffffffff
00a07944	lsr x12,x12,#0x20
00a07948	and x16,x9,#0xffffffff
00a0794c	lsr x9,x9,#0x20
00a07950	mul x17,x14,x11
00a07954	mul x14,x14,x14
00a07958	mul x11,x11,x11
00a0795c	mul x18,x9,x15
00a07960	mul x15,x16,x15
00a07964	mul x16,x16,x12
00a07968	mul x9,x9,x12
00a0796c	add x11,x11,x17, LSR #0x1f
00a07970	adds x12,x14,x17, LSL #0x21
00a07974	cinc x11,x11,cs
00a07978	adds x10,x10,x12
00a0797c	cinc x11,x11,cs
00a07980	adds x12,x18,x16
00a07984	cset w14,cs
00a07988	add x9,x9,x12, LSR #0x20
00a0798c	adds x15,x15,x12, LSL #0x20
00a07990	add x9,x9,x14, LSL #0x20
00a07994	cinc x9,x9,cs
00a07998	adds x10,x10,x15
00a0799c	cinc x12,x9,cs
00a079a0	adds x11,x11,x13
00a079a4	cset w13,cs
00a079a8	csinc x14,x8,xzr,cs
00a079ac	adds x11,x11,x12
00a079b0	csel x12,x13,x14,cc
00a079b4	adds x10,x10,x15
00a079b8	cinc x9,x9,cs
00a079bc	str x10,[x0, #0x10]
00a079c0	ldp x10,x13,[x1, #0x10]
00a079c4	adds x9,x11,x9
00a079c8	ldp x11,x14,[x1]
00a079cc	cinc x12,x12,cs
00a079d0	and x15,x13,#0xffffffff
00a079d4	lsr x13,x13,#0x20
00a079d8	and x16,x11,#0xffffffff
00a079dc	lsr x11,x11,#0x20
00a079e0	and x17,x10,#0xffffffff
00a079e4	lsr x10,x10,#0x20
00a079e8	and x18,x14,#0xffffffff
00a079ec	lsr x14,x14,#0x20
00a079f0	mul x2,x11,x15
00a079f4	mul x15,x16,x15
00a079f8	mul x16,x16,x13
00a079fc	mul x11,x11,x13
00a07a00	mul x13,x14,x17
00a07a04	mul x17,x18,x17
00a07a08	mul x18,x18,x10
00a07a0c	mul x10,x14,x10
00a07a10	adds x14,x2,x16
00a07a14	cset w16,cs
00a07a18	add x11,x11,x14, LSR #0x20
00a07a1c	adds x15,x15,x14, LSL #0x20
00a07a20	add x11,x11,x16, LSL #0x20
00a07a24	cinc x11,x11,cs
00a07a28	adds x9,x9,x15
00a07a2c	cinc x14,x11,cs
00a07a30	adds x9,x9,x15
00a07a34	cinc x11,x11,cs
00a07a38	adds x12,x12,x14
00a07a3c	cset w14,cs
00a07a40	csinc x15,x8,xzr,cs
00a07a44	adds x11,x12,x11
00a07a48	csel x12,x14,x15,cc
00a07a4c	adds x13,x13,x18
00a07a50	cset w14,cs
00a07a54	add x10,x10,x13, LSR #0x20
00a07a58	adds x15,x17,x13, LSL #0x20
00a07a5c	add x10,x10,x14, LSL #0x20
00a07a60	cinc x10,x10,cs
00a07a64	adds x9,x9,x15
00a07a68	cinc x13,x10,cs
00a07a6c	adds x11,x11,x13
00a07a70	cinc x12,x12,cs
00a07a74	adds x9,x9,x15
00a07a78	cinc x10,x10,cs
00a07a7c	str x9,[x0, #0x18]
00a07a80	ldp x9,x13,[x1, #0x8]
00a07a84	adds x10,x11,x10
00a07a88	ldr x11,[x1, #0x18]
00a07a8c	cinc x12,x12,cs
00a07a90	and x14,x13,#0xffffffff
00a07a94	lsr x13,x13,#0x20
00a07a98	and x15,x11,#0xffffffff
00a07a9c	lsr x11,x11,#0x20
00a07aa0	and x16,x9,#0xffffffff
00a07aa4	lsr x9,x9,#0x20
00a07aa8	mul x17,x9,x15
00a07aac	mul x15,x16,x15
00a07ab0	mul x16,x16,x11
00a07ab4	mul x9,x9,x11
00a07ab8	mul x11,x14,x13
00a07abc	mul x14,x14,x14
00a07ac0	mul x13,x13,x13
00a07ac4	add x13,x13,x11, LSR #0x1f
00a07ac8	adds x11,x14,x11, LSL #0x21
00a07acc	cinc x13,x13,cs
00a07ad0	adds x10,x10,x11
00a07ad4	cinc x11,x13,cs
00a07ad8	adds x13,x17,x16
00a07adc	cset w14,cs
00a07ae0	add x9,x9,x13, LSR #0x20
00a07ae4	adds x15,x15,x13, LSL #0x20
00a07ae8	add x9,x9,x14, LSL #0x20
00a07aec	cinc x9,x9,cs
00a07af0	adds x10,x10,x15
00a07af4	cinc x13,x9,cs
00a07af8	adds x11,x12,x11
00a07afc	cset w12,cs
00a07b00	csinc x8,x8,xzr,cs
00a07b04	adds x11,x11,x13
00a07b08	csel x8,x12,x8,cc
00a07b0c	adds x10,x10,x15
00a07b10	str x10,[x0, #0x20]
00a07b14	ldp x10,x12,[x1, #0x10]
00a07b18	cinc x9,x9,cs
00a07b1c	adds x9,x11,x9
00a07b20	cinc x8,x8,cs
00a07b24	and x11,x12,#0xffffffff
00a07b28	lsr x12,x12,#0x20
00a07b2c	and x13,x10,#0xffffffff
00a07b30	lsr x10,x10,#0x20
00a07b34	mul x14,x10,x11
00a07b38	mul x11,x13,x11
00a07b3c	mul x13,x13,x12
00a07b40	mul x10,x10,x12
00a07b44	adds x12,x14,x13
00a07b48	cset w13,cs
00a07b4c	add x10,x10,x12, LSR #0x20
00a07b50	adds x11,x11,x12, LSL #0x20
00a07b54	add x10,x10,x13, LSL #0x20
00a07b58	cinc x10,x10,cs
00a07b5c	adds x9,x9,x11
00a07b60	cinc x12,x10,cs
00a07b64	adds x9,x9,x11
00a07b68	str x9,[x0, #0x28]
00a07b6c	ldr x9,[x1, #0x18]
00a07b70	cinc x10,x10,cs
00a07b74	and x11,x9,#0xffffffff
00a07b78	lsr x9,x9,#0x20
00a07b7c	mul x13,x11,x9
00a07b80	mul x11,x11,x11
00a07b84	mul x9,x9,x9
00a07b88	add x9,x9,x13, LSR #0x1f
00a07b8c	adds x11,x11,x13, LSL #0x21
00a07b90	cinc x9,x9,cs
00a07b94	adds x8,x8,x12
00a07b98	cinc x9,x9,cs
00a07b9c	adds x8,x8,x10
00a07ba0	cinc x9,x9,cs
00a07ba4	adds x8,x8,x11
00a07ba8	cinc x9,x9,cs
00a07bac	stp x8,x9,[x0, #0x30]
00a07bb0	ret
