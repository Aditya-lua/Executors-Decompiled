; bn_mul_comba4 @ 00a067ac
00a067ac	stp x22,x21,[sp, #-0x20]!
00a067b0	stp x20,x19,[sp, #0x10]
00a067b4	ldr x9,[x1]
00a067b8	ldr x10,[x2]
00a067bc	mov w8,#0x2
00a067c0	and x11,x9,#0xffffffff
00a067c4	lsr x9,x9,#0x20
00a067c8	and x12,x10,#0xffffffff
00a067cc	lsr x10,x10,#0x20
00a067d0	mul x13,x10,x11
00a067d4	mul x11,x12,x11
00a067d8	mul x12,x12,x9
00a067dc	mul x9,x10,x9
00a067e0	adds x10,x13,x12
00a067e4	cset w12,cs
00a067e8	adds x11,x11,x10, LSL #0x20
00a067ec	add x9,x9,x10, LSR #0x20
00a067f0	str x11,[x0]
00a067f4	add x9,x9,x12, LSL #0x20
00a067f8	ldp x10,x13,[x1]
00a067fc	ldp x11,x12,[x2]
00a06800	cinc x9,x9,cs
00a06804	and x14,x10,#0xffffffff
00a06808	lsr x10,x10,#0x20
00a0680c	and x15,x12,#0xffffffff
00a06810	lsr x12,x12,#0x20
00a06814	and x16,x13,#0xffffffff
00a06818	lsr x13,x13,#0x20
00a0681c	and x17,x11,#0xffffffff
00a06820	lsr x11,x11,#0x20
00a06824	mul x18,x12,x14
00a06828	mul x14,x15,x14
00a0682c	mul x15,x15,x10
00a06830	mul x10,x12,x10
00a06834	mul x12,x11,x16
00a06838	mul x16,x17,x16
00a0683c	mul x17,x17,x13
00a06840	mul x11,x11,x13
00a06844	adds x13,x18,x15
00a06848	cset w15,cs
00a0684c	adds x12,x12,x17
00a06850	cset w17,cs
00a06854	add x11,x11,x12, LSR #0x20
00a06858	add x10,x10,x13, LSR #0x20
00a0685c	adds x16,x16,x12, LSL #0x20
00a06860	add x11,x11,x17, LSL #0x20
00a06864	add x10,x10,x15, LSL #0x20
00a06868	cinc x11,x11,cs
00a0686c	adds x12,x14,x13, LSL #0x20
00a06870	cinc x10,x10,cs
00a06874	adds x9,x9,x12
00a06878	cinc x10,x10,cs
00a0687c	adds x9,x9,x16
00a06880	cinc x11,x11,cs
00a06884	str x9,[x0, #0x8]
00a06888	adds x9,x10,x11
00a0688c	ldp x12,x10,[x1, #0x8]
00a06890	ldp x13,x14,[x2]
00a06894	ldr x11,[x1]
00a06898	ldr x15,[x2, #0x10]
00a0689c	and x17,x10,#0xffffffff
00a068a0	lsr x10,x10,#0x20
00a068a4	and x18,x13,#0xffffffff
00a068a8	lsr x13,x13,#0x20
00a068ac	and x3,x12,#0xffffffff
00a068b0	lsr x12,x12,#0x20
00a068b4	and x4,x14,#0xffffffff
00a068b8	lsr x14,x14,#0x20
00a068bc	and x5,x11,#0xffffffff
00a068c0	lsr x11,x11,#0x20
00a068c4	and x6,x15,#0xffffffff
00a068c8	lsr x15,x15,#0x20
00a068cc	mul x7,x13,x17
00a068d0	mul x17,x18,x17
00a068d4	mul x18,x18,x10
00a068d8	cset w16,cs
00a068dc	mul x10,x13,x10
00a068e0	mul x13,x14,x3
00a068e4	mul x3,x4,x3
00a068e8	mul x4,x4,x12
00a068ec	mul x12,x14,x12
00a068f0	mul x14,x15,x5
00a068f4	mul x5,x6,x5
00a068f8	mul x6,x6,x11
00a068fc	mul x11,x15,x11
00a06900	adds x15,x7,x18
00a06904	cset w18,cs
00a06908	add x10,x10,x15, LSR #0x20
00a0690c	adds x17,x17,x15, LSL #0x20
00a06910	add x10,x10,x18, LSL #0x20
00a06914	cinc x10,x10,cs
00a06918	adds x9,x9,x17
00a0691c	cinc x10,x10,cs
00a06920	adds x13,x13,x4
00a06924	cset w15,cs
00a06928	add x12,x12,x13, LSR #0x20
00a0692c	adds x17,x3,x13, LSL #0x20
00a06930	add x12,x12,x15, LSL #0x20
00a06934	cinc x12,x12,cs
00a06938	adds x9,x9,x17
00a0693c	cinc x12,x12,cs
00a06940	adds x10,x10,x16
00a06944	cset w13,cs
00a06948	csinc x15,x8,xzr,cs
00a0694c	adds x10,x10,x12
00a06950	csel x12,x13,x15,cc
00a06954	adds x13,x14,x6
00a06958	cset w14,cs
00a0695c	add x11,x11,x13, LSR #0x20
00a06960	adds x15,x5,x13, LSL #0x20
00a06964	add x11,x11,x14, LSL #0x20
00a06968	cinc x11,x11,cs
00a0696c	adds x9,x9,x15
00a06970	cinc x11,x11,cs
00a06974	str x9,[x0, #0x10]
00a06978	adds x9,x10,x11
00a0697c	ldp x10,x11,[x2, #0x10]
00a06980	ldp x13,x14,[x1]
00a06984	ldp x15,x16,[x2]
00a06988	ldp x17,x18,[x1, #0x10]
00a0698c	and x4,x11,#0xffffffff
00a06990	and x3,x13,#0xffffffff
00a06994	lsr x13,x13,#0x20
00a06998	lsr x11,x11,#0x20
00a0699c	and x5,x14,#0xffffffff
00a069a0	lsr x14,x14,#0x20
00a069a4	and x6,x10,#0xffffffff
00a069a8	lsr x10,x10,#0x20
00a069ac	and x7,x17,#0xffffffff
00a069b0	lsr x17,x17,#0x20
00a069b4	and x19,x16,#0xffffffff
00a069b8	lsr x16,x16,#0x20
00a069bc	and x20,x18,#0xffffffff
00a069c0	lsr x18,x18,#0x20
00a069c4	and x21,x15,#0xffffffff
00a069c8	lsr x15,x15,#0x20
00a069cc	mul x22,x11,x3
00a069d0	mul x3,x4,x3
00a069d4	mul x4,x4,x13
00a069d8	mul x11,x11,x13
00a069dc	mul x13,x10,x5
00a069e0	mul x5,x6,x5
00a069e4	mul x6,x6,x14
00a069e8	mul x10,x10,x14
00a069ec	mul x14,x16,x7
00a069f0	mul x7,x19,x7
00a069f4	mul x19,x19,x17
00a069f8	mul x16,x16,x17
00a069fc	mul x17,x15,x20
00a06a00	mul x20,x21,x20
00a06a04	mul x21,x21,x18
00a06a08	mul x15,x15,x18
00a06a0c	cinc x12,x12,cs
00a06a10	adds x18,x22,x4
00a06a14	cset w4,cs
00a06a18	add x11,x11,x18, LSR #0x20
00a06a1c	adds x3,x3,x18, LSL #0x20
00a06a20	add x11,x11,x4, LSL #0x20
00a06a24	cinc x11,x11,cs
00a06a28	adds x9,x9,x3
00a06a2c	cinc x11,x11,cs
00a06a30	adds x13,x13,x6
00a06a34	cset w18,cs
00a06a38	add x10,x10,x13, LSR #0x20
00a06a3c	adds x3,x5,x13, LSL #0x20
00a06a40	add x10,x10,x18, LSL #0x20
00a06a44	cinc x10,x10,cs
00a06a48	adds x9,x9,x3
00a06a4c	cinc x10,x10,cs
00a06a50	adds x11,x12,x11
00a06a54	cset w12,cs
00a06a58	csinc x13,x8,xzr,cs
00a06a5c	adds x10,x11,x10
00a06a60	csel x11,x12,x13,cc
00a06a64	adds x12,x14,x19
00a06a68	cset w13,cs
00a06a6c	adds x14,x7,x12, LSL #0x20
00a06a70	add x12,x16,x12, LSR #0x20
00a06a74	add x12,x12,x13, LSL #0x20
00a06a78	cinc x12,x12,cs
00a06a7c	adds x9,x9,x14
00a06a80	cinc x12,x12,cs
00a06a84	adds x10,x10,x12
00a06a88	cinc x11,x11,cs
00a06a8c	adds x12,x17,x21
00a06a90	cset w13,cs
00a06a94	adds x14,x20,x12, LSL #0x20
00a06a98	add x12,x15,x12, LSR #0x20
00a06a9c	add x12,x12,x13, LSL #0x20
00a06aa0	cinc x12,x12,cs
00a06aa4	adds x9,x9,x14
00a06aa8	cinc x12,x12,cs
00a06aac	str x9,[x0, #0x18]
00a06ab0	adds x9,x12,x10
00a06ab4	ldp x13,x10,[x1, #0x10]
00a06ab8	ldp x14,x15,[x2, #0x8]
00a06abc	ldr x12,[x1, #0x8]
00a06ac0	ldr x16,[x2, #0x18]
00a06ac4	and x17,x10,#0xffffffff
00a06ac8	lsr x10,x10,#0x20
00a06acc	and x18,x14,#0xffffffff
00a06ad0	lsr x14,x14,#0x20
00a06ad4	and x3,x13,#0xffffffff
00a06ad8	lsr x13,x13,#0x20
00a06adc	and x4,x15,#0xffffffff
00a06ae0	lsr x15,x15,#0x20
00a06ae4	and x5,x12,#0xffffffff
00a06ae8	lsr x12,x12,#0x20
00a06aec	and x6,x16,#0xffffffff
00a06af0	lsr x16,x16,#0x20
00a06af4	mul x7,x14,x17
00a06af8	mul x17,x18,x17
00a06afc	mul x18,x18,x10
00a06b00	mul x10,x14,x10
00a06b04	mul x14,x15,x3
00a06b08	mul x3,x4,x3
00a06b0c	mul x4,x4,x13
00a06b10	mul x13,x15,x13
00a06b14	mul x15,x16,x5
00a06b18	mul x5,x6,x5
00a06b1c	mul x6,x6,x12
00a06b20	mul x12,x16,x12
00a06b24	cinc x11,x11,cs
00a06b28	adds x16,x7,x18
00a06b2c	cset w18,cs
00a06b30	add x10,x10,x16, LSR #0x20
00a06b34	adds x17,x17,x16, LSL #0x20
00a06b38	add x10,x10,x18, LSL #0x20
00a06b3c	cinc x10,x10,cs
00a06b40	adds x9,x9,x17
00a06b44	cinc x10,x10,cs
00a06b48	adds x14,x14,x4
00a06b4c	cset w16,cs
00a06b50	add x13,x13,x14, LSR #0x20
00a06b54	adds x17,x3,x14, LSL #0x20
00a06b58	add x13,x13,x16, LSL #0x20
00a06b5c	cinc x13,x13,cs
00a06b60	adds x9,x9,x17
00a06b64	cinc x13,x13,cs
00a06b68	adds x10,x11,x10
00a06b6c	cset w11,cs
00a06b70	csinc x8,x8,xzr,cs
00a06b74	adds x10,x10,x13
00a06b78	csel x8,x11,x8,cc
00a06b7c	adds x11,x15,x6
00a06b80	cset w13,cs
00a06b84	adds x14,x5,x11, LSL #0x20
00a06b88	add x11,x12,x11, LSR #0x20
00a06b8c	add x11,x11,x13, LSL #0x20
00a06b90	cinc x11,x11,cs
00a06b94	adds x9,x9,x14
00a06b98	cinc x11,x11,cs
00a06b9c	str x9,[x0, #0x20]
00a06ba0	adds x9,x10,x11
00a06ba4	ldp x10,x13,[x1, #0x10]
00a06ba8	ldp x11,x12,[x2, #0x10]
00a06bac	cinc x8,x8,cs
00a06bb0	and x14,x10,#0xffffffff
00a06bb4	lsr x10,x10,#0x20
00a06bb8	and x15,x12,#0xffffffff
00a06bbc	lsr x12,x12,#0x20
00a06bc0	and x16,x13,#0xffffffff
00a06bc4	lsr x13,x13,#0x20
00a06bc8	and x17,x11,#0xffffffff
00a06bcc	lsr x11,x11,#0x20
00a06bd0	mul x18,x12,x14
00a06bd4	mul x14,x15,x14
00a06bd8	mul x15,x15,x10
00a06bdc	mul x10,x12,x10
00a06be0	mul x12,x11,x16
00a06be4	mul x16,x17,x16
00a06be8	mul x17,x17,x13
00a06bec	mul x11,x11,x13
00a06bf0	adds x13,x18,x15
00a06bf4	cset w15,cs
00a06bf8	add x10,x10,x13, LSR #0x20
00a06bfc	adds x14,x14,x13, LSL #0x20
00a06c00	add x10,x10,x15, LSL #0x20
00a06c04	cinc x10,x10,cs
00a06c08	adds x9,x9,x14
00a06c0c	cinc x10,x10,cs
00a06c10	adds x12,x12,x17
00a06c14	cset w13,cs
00a06c18	add x11,x11,x12, LSR #0x20
00a06c1c	adds x14,x16,x12, LSL #0x20
00a06c20	add x11,x11,x13, LSL #0x20
00a06c24	cinc x11,x11,cs
00a06c28	adds x9,x9,x14
00a06c2c	str x9,[x0, #0x28]
00a06c30	ldr x9,[x1, #0x18]
00a06c34	ldr x12,[x2, #0x18]
00a06c38	cinc x11,x11,cs
00a06c3c	and x13,x9,#0xffffffff
00a06c40	lsr x9,x9,#0x20
00a06c44	and x14,x12,#0xffffffff
00a06c48	lsr x12,x12,#0x20
00a06c4c	mul x15,x12,x13
00a06c50	mul x13,x14,x13
00a06c54	mul x14,x14,x9
00a06c58	mul x9,x12,x9
00a06c5c	adds x12,x15,x14
00a06c60	cset w14,cs
00a06c64	add x9,x9,x12, LSR #0x20
00a06c68	adds x13,x13,x12, LSL #0x20
00a06c6c	add x9,x9,x14, LSL #0x20
00a06c70	cinc x9,x9,cs
00a06c74	adds x8,x8,x10
00a06c78	cinc x9,x9,cs
00a06c7c	adds x8,x8,x11
00a06c80	cinc x9,x9,cs
00a06c84	adds x8,x8,x13
00a06c88	cinc x9,x9,cs
00a06c8c	stp x8,x9,[x0, #0x30]
00a06c90	ldp x20,x19,[sp, #0x10]
00a06c94	ldp x22,x21,[sp], #0x20
00a06c98	ret
