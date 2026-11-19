; ossl_x448_int @ 00a48b50
00a48b50	stp x28,x27,[sp, #-0x60]!
00a48b54	stp x26,x25,[sp, #0x10]
00a48b58	stp x24,x23,[sp, #0x20]
00a48b5c	stp x22,x21,[sp, #0x30]
00a48b60	stp x20,x19,[sp, #0x40]
00a48b64	stp x29,x30,[sp, #0x50]
00a48b68	add x29,sp,#0x50
00a48b6c	sub sp,sp,#0x270
00a48b70	stp x0,x2,[sp]
00a48b74	add x0,sp,#0x1a0
00a48b78	mov w2,#0x1
00a48b7c	mov w3,wzr
00a48b80	mov w25,#0x1
00a48b84	bl 0x00c3a5a0
00a48b88	ldp q0,q1,[sp, #0x1a0]
00a48b8c	ldp q2,q3,[sp, #0x1c0]
00a48b90	adrp x1,0x760000
00a48b94	add x1,x1,#0xa00
00a48b98	stp q0,q1,[sp, #0xe0]
00a48b9c	ldp q0,q4,[x1]
00a48ba0	stp q2,q3,[sp, #0x100]
00a48ba4	ldp q1,q2,[x1, #0x20]
00a48ba8	mov x15,xzr
00a48bac	mov x0,xzr
00a48bb0	mov x18,xzr
00a48bb4	mov x17,xzr
00a48bb8	mov x9,xzr
00a48bbc	mov x10,xzr
00a48bc0	mov x11,xzr
00a48bc4	mov x12,xzr
00a48bc8	mov x13,xzr
00a48bcc	mov x14,xzr
00a48bd0	mov x16,xzr
00a48bd4	mov w22,#0x1bf
00a48bd8	orr x23,xzr,#0x1fffffffffffffe
00a48bdc	mov w1,#0x1
00a48be0	str xzr,[sp, #0x10]
00a48be4	stp xzr,xzr,[sp, #0x150]
00a48be8	stp xzr,xzr,[sp, #0x140]
00a48bec	stp xzr,xzr,[sp, #0x130]
00a48bf0	stp xzr,xzr,[sp, #0x120]
00a48bf4	stp q0,q4,[sp, #0x160]
00a48bf8	stp q1,q2,[sp, #0x180]
00a48bfc	stp q1,q2,[sp, #0xc0]
00a48c00	stp q0,q4,[sp, #0xa0]
00a48c04	b 0x00a48c30
00a48c08	ldp x9,x8,[sp, #0x190]
00a48c0c	ldp x1,x14,[sp, #0x160]
00a48c10	ldp x13,x12,[sp, #0x170]
00a48c14	ldp x11,x10,[sp, #0x180]
00a48c18	ldp x17,x18,[sp, #0x120]
00a48c1c	ldp x25,x0,[sp, #0xa0]
00a48c20	ldr x15,[sp, #0x130]
00a48c24	ldr x16,[sp, #0x18]
00a48c28	str x8,[sp, #0x10]
00a48c2c	sub w22,w22,#0x1
00a48c30	ldr x8,[sp, #0x8]
00a48c34	lsr w4,w22,#0x3
00a48c38	add w2,w22,#0x7
00a48c3c	cmp w22,#0x1bf
00a48c40	ldrb w4,[x8, w4, UXTW ]
00a48c44	and w3,w22,#0x7
00a48c48	ldr x5,[sp, #0xe0]
00a48c4c	eor x6,x25,x17
00a48c50	and w21,w4,#0xfc
00a48c54	csinv w4,w4,wzr,ne
00a48c58	cmp w2,#0xf
00a48c5c	csel w2,w21,w4,cc
00a48c60	and w2,w2,#0xff
00a48c64	lsr w2,w2,w3
00a48c68	and w2,w2,#0x1
00a48c6c	neg x8,x2
00a48c70	eor x7,x0,x18
00a48c74	eor x26,x5,x1
00a48c78	eor x16,x16,x8
00a48c7c	and x2,x16,x26
00a48c80	and x6,x6,x16
00a48c84	and x7,x7,x16
00a48c88	eor x4,x2,x1
00a48c8c	eor x3,x2,x5
00a48c90	eor x1,x6,x17
00a48c94	eor x2,x6,x25
00a48c98	eor x18,x7,x18
00a48c9c	eor x0,x7,x0
00a48ca0	ldr x6,[sp, #0xe8]
00a48ca4	ldp x7,x25,[sp, #0xb0]
00a48ca8	str x4,[sp, #0x160]
00a48cac	add x17,x1,x4
00a48cb0	add x4,x4,x23
00a48cb4	add x5,x3,x23
00a48cb8	str x3,[sp, #0xe0]
00a48cbc	stp x1,x18,[sp, #0x120]
00a48cc0	stp x2,x0,[sp, #0xa0]
00a48cc4	sub x3,x4,x1
00a48cc8	sub x1,x5,x2
00a48ccc	eor x2,x6,x14
00a48cd0	eor x4,x7,x15
00a48cd4	and x2,x2,x16
00a48cd8	and x4,x4,x16
00a48cdc	eor x14,x2,x14
00a48ce0	eor x2,x2,x6
00a48ce4	eor x15,x4,x15
00a48ce8	eor x4,x4,x7
00a48cec	ldr x6,[sp, #0xf0]
00a48cf0	ldp x7,x26,[sp, #0x138]
00a48cf4	str x14,[sp, #0x168]
00a48cf8	str x2,[sp, #0xe8]
00a48cfc	add x5,x18,x14
00a48d00	add x14,x14,x23
00a48d04	add x2,x2,x23
00a48d08	sub x18,x14,x18
00a48d0c	sub x14,x2,x0
00a48d10	eor x0,x6,x13
00a48d14	eor x2,x25,x7
00a48d18	and x0,x0,x16
00a48d1c	and x2,x2,x16
00a48d20	eor x13,x0,x13
00a48d24	eor x0,x0,x6
00a48d28	eor x6,x2,x7
00a48d2c	eor x2,x2,x25
00a48d30	ldr x25,[sp, #0xf8]
00a48d34	ldp x27,x19,[sp, #0xc0]
00a48d38	str x13,[sp, #0x170]
00a48d3c	add x7,x15,x13
00a48d40	add x13,x13,x23
00a48d44	stp x15,x6,[sp, #0x130]
00a48d48	sub x28,x13,x15
00a48d4c	eor x13,x25,x12
00a48d50	eor x15,x27,x26
00a48d54	and x13,x13,x16
00a48d58	and x15,x15,x16
00a48d5c	eor x12,x13,x12
00a48d60	eor x13,x13,x25
00a48d64	eor x25,x15,x27
00a48d68	ldr x27,[sp, #0x100]
00a48d6c	ldr x30,[sp, #0x148]
00a48d70	str x0,[sp, #0xf0]
00a48d74	add x0,x0,x23
00a48d78	stp x4,x2,[sp, #0xb0]
00a48d7c	sub x0,x0,x4
00a48d80	eor x4,x15,x26
00a48d84	str x12,[sp, #0x178]
00a48d88	add x15,x6,x12
00a48d8c	add x12,x12,x23
00a48d90	add x26,x13,x23
00a48d94	str x13,[sp, #0xf8]
00a48d98	sub x13,x12,x6
00a48d9c	sub x12,x26,x2
00a48da0	eor x2,x27,x11
00a48da4	eor x6,x19,x30
00a48da8	and x2,x2,x16
00a48dac	and x6,x6,x16
00a48db0	str x8,[sp, #0x18]
00a48db4	eor x11,x2,x11
00a48db8	eor x2,x2,x27
00a48dbc	eor x26,x6,x30
00a48dc0	ldr x27,[sp, #0x108]
00a48dc4	ldp x30,x24,[sp, #0x150]
00a48dc8	ldp x20,x8,[sp, #0xd0]
00a48dcc	orr x21,xzr,#0x1fffffffffffffc
00a48dd0	eor x6,x6,x19
00a48dd4	str x11,[sp, #0x180]
00a48dd8	str x2,[sp, #0x100]
00a48ddc	add x19,x4,x11
00a48de0	add x11,x11,x21
00a48de4	add x2,x2,x21
00a48de8	stp x4,x26,[sp, #0x140]
00a48dec	stp x25,x6,[sp, #0xc0]
00a48df0	sub x11,x11,x4
00a48df4	sub x2,x2,x25
00a48df8	eor x4,x27,x10
00a48dfc	eor x25,x20,x30
00a48e00	and x4,x4,x16
00a48e04	and x25,x25,x16
00a48e08	eor x10,x4,x10
00a48e0c	eor x4,x4,x27
00a48e10	eor x27,x25,x30
00a48e14	ldr x30,[sp, #0x110]
00a48e18	str x4,[sp, #0x108]
00a48e1c	add x4,x4,x23
00a48e20	eor x20,x25,x20
00a48e24	str x10,[sp, #0x188]
00a48e28	add x25,x26,x10
00a48e2c	add x10,x10,x23
00a48e30	sub x4,x4,x6
00a48e34	eor x6,x30,x9
00a48e38	sub x10,x10,x26
00a48e3c	eor x26,x8,x24
00a48e40	and x6,x6,x16
00a48e44	and x26,x26,x16
00a48e48	eor x9,x6,x9
00a48e4c	eor x24,x26,x24
00a48e50	eor x8,x26,x8
00a48e54	str x9,[sp, #0x190]
00a48e58	add x26,x27,x9
00a48e5c	add x9,x9,x23
00a48e60	str x27,[sp, #0x150]
00a48e64	eor x6,x6,x30
00a48e68	ldr x30,[sp, #0x118]
00a48e6c	sub x9,x9,x27
00a48e70	ldr x27,[sp, #0x10]
00a48e74	str x6,[sp, #0x110]
00a48e78	add x6,x6,x23
00a48e7c	str x20,[sp, #0xd0]
00a48e80	sub x6,x6,x20
00a48e84	eor x20,x30,x27
00a48e88	and x16,x20,x16
00a48e8c	eor x20,x16,x27
00a48e90	str x20,[sp, #0x198]
00a48e94	add x27,x24,x20
00a48e98	add x20,x20,x23
00a48e9c	str x24,[sp, #0x158]
00a48ea0	sub x20,x20,x24
00a48ea4	and x24,x15,#0xffffffffffffff
00a48ea8	eor x16,x16,x30
00a48eac	add x24,x24,x7, LSR #0x38
00a48eb0	and x7,x7,#0xffffffffffffff
00a48eb4	add x7,x7,x5, LSR #0x38
00a48eb8	and x5,x5,#0xffffffffffffff
00a48ebc	str x16,[sp, #0x118]
00a48ec0	add x16,x16,x23
00a48ec4	add x5,x5,x17, LSR #0x38
00a48ec8	and x17,x17,#0xffffffffffffff
00a48ecc	str x8,[sp, #0xd8]
00a48ed0	sub x8,x16,x8
00a48ed4	lsr x16,x27,#0x38
00a48ed8	add x19,x16,x19
00a48edc	add x16,x16,x17
00a48ee0	and x17,x13,#0xffffffffffffff
00a48ee4	and x27,x27,#0xffffffffffffff
00a48ee8	add x17,x17,x28, LSR #0x38
00a48eec	and x28,x28,#0xffffffffffffff
00a48ef0	add x27,x27,x26, LSR #0x38
00a48ef4	and x26,x26,#0xffffffffffffff
00a48ef8	add x28,x28,x18, LSR #0x38
00a48efc	and x18,x18,#0xffffffffffffff
00a48f00	add x26,x26,x25, LSR #0x38
00a48f04	add x18,x18,x3, LSR #0x38
00a48f08	and x3,x3,#0xffffffffffffff
00a48f0c	str x26,[sp, #0x90]
00a48f10	lsr x26,x20,#0x38
00a48f14	and x25,x25,#0xffffffffffffff
00a48f18	add x11,x26,x11
00a48f1c	add x3,x26,x3
00a48f20	lsr x26,x8,#0x38
00a48f24	add x25,x25,x19, LSR #0x38
00a48f28	and x19,x19,#0xffffffffffffff
00a48f2c	and x8,x8,#0xffffffffffffff
00a48f30	add x15,x19,x15, LSR #0x38
00a48f34	and x19,x20,#0xffffffffffffff
00a48f38	add x8,x8,x6, LSR #0x38
00a48f3c	str x27,[sp, #0x98]
00a48f40	and x27,x12,#0xffffffffffffff
00a48f44	add x19,x19,x9, LSR #0x38
00a48f48	and x9,x9,#0xffffffffffffff
00a48f4c	str x8,[sp, #0x158]
00a48f50	and x8,x6,#0xffffffffffffff
00a48f54	add x27,x27,x0, LSR #0x38
00a48f58	and x0,x0,#0xffffffffffffff
00a48f5c	add x9,x9,x10, LSR #0x38
00a48f60	add x8,x8,x4, LSR #0x38
00a48f64	add x0,x0,x14, LSR #0x38
00a48f68	and x14,x14,#0xffffffffffffff
00a48f6c	add x2,x26,x2
00a48f70	stp x9,x19,[sp, #0x50]
00a48f74	str x8,[sp, #0x150]
00a48f78	and x8,x10,#0xffffffffffffff
00a48f7c	and x9,x4,#0xffffffffffffff
00a48f80	add x14,x14,x1, LSR #0x38
00a48f84	and x1,x1,#0xffffffffffffff
00a48f88	add x8,x8,x11, LSR #0x38
00a48f8c	add x9,x9,x2, LSR #0x38
00a48f90	add x1,x26,x1
00a48f94	str x8,[sp, #0x48]
00a48f98	and x8,x11,#0xffffffffffffff
00a48f9c	str x9,[sp, #0x148]
00a48fa0	and x9,x2,#0xffffffffffffff
00a48fa4	add x8,x8,x13, LSR #0x38
00a48fa8	add x9,x9,x12, LSR #0x38
00a48fac	stp x14,x0,[sp, #0x128]
00a48fb0	str x1,[sp, #0x120]
00a48fb4	add x0,sp,#0x160
00a48fb8	add x1,sp,#0x60
00a48fbc	add x2,sp,#0x120
00a48fc0	stp x15,x25,[sp, #0x80]
00a48fc4	stp x7,x24,[sp, #0x70]
00a48fc8	stp x16,x5,[sp, #0x60]
00a48fcc	stp x17,x8,[sp, #0x38]
00a48fd0	stp x18,x28,[sp, #0x28]
00a48fd4	str x3,[sp, #0x20]
00a48fd8	stp x27,x9,[sp, #0x138]
00a48fdc	bl 0x00c3a4b0
00a48fe0	ldp x8,x10,[sp, #0xa0]
00a48fe4	ldp x9,x11,[sp, #0xe0]
00a48fe8	ldp x12,x14,[sp, #0xb0]
00a48fec	ldp x13,x15,[sp, #0xf0]
00a48ff0	ldp x16,x18,[sp, #0xc0]
00a48ff4	add x8,x9,x8
00a48ff8	add x10,x11,x10
00a48ffc	add x12,x13,x12
00a49000	ldp x9,x13,[sp, #0xd0]
00a49004	add x14,x15,x14
00a49008	ldp x11,x15,[sp, #0x110]
00a4900c	ldp x17,x0,[sp, #0x100]
00a49010	add x1,sp,#0x20
00a49014	add x2,sp,#0x120
00a49018	add x9,x11,x9
00a4901c	add x11,x15,x13
00a49020	and x15,x14,#0xffffffffffffff
00a49024	add x15,x15,x12, LSR #0x38
00a49028	and x12,x12,#0xffffffffffffff
00a4902c	lsr x13,x11,#0x38
00a49030	add x12,x12,x10, LSR #0x38
00a49034	and x10,x10,#0xffffffffffffff
00a49038	and x11,x11,#0xffffffffffffff
00a4903c	add x16,x17,x16
00a49040	add x17,x0,x18
00a49044	add x10,x10,x8, LSR #0x38
00a49048	and x8,x8,#0xffffffffffffff
00a4904c	add x11,x11,x9, LSR #0x38
00a49050	and x9,x9,#0xffffffffffffff
00a49054	add x16,x13,x16
00a49058	add x8,x13,x8
00a4905c	add x9,x9,x17, LSR #0x38
00a49060	and x13,x17,#0xffffffffffffff
00a49064	stp x9,x11,[sp, #0x150]
00a49068	add x9,x13,x16, LSR #0x38
00a4906c	and x11,x16,#0xffffffffffffff
00a49070	str x9,[sp, #0x148]
00a49074	add x9,x11,x14, LSR #0x38
00a49078	add x0,sp,#0xe0
00a4907c	stp x15,x9,[sp, #0x138]
00a49080	stp x10,x12,[sp, #0x128]
00a49084	str x8,[sp, #0x120]
00a49088	bl 0x00c3a4b0
00a4908c	ldp x8,x10,[sp, #0x160]
00a49090	ldp x9,x11,[sp, #0xe0]
00a49094	ldp x12,x14,[sp, #0x170]
00a49098	ldp x13,x15,[sp, #0xf0]
00a4909c	add x8,x8,x23
00a490a0	sub x8,x8,x9
00a490a4	ldp x16,x9,[sp, #0x180]
00a490a8	add x10,x10,x23
00a490ac	sub x10,x10,x11
00a490b0	ldp x17,x11,[sp, #0x100]
00a490b4	add x12,x12,x23
00a490b8	add x16,x16,x21
00a490bc	sub x12,x12,x13
00a490c0	add x14,x14,x23
00a490c4	sub x16,x16,x17
00a490c8	ldp x13,x17,[sp, #0x190]
00a490cc	add x9,x9,x23
00a490d0	sub x14,x14,x15
00a490d4	sub x9,x9,x11
00a490d8	ldp x15,x11,[sp, #0x110]
00a490dc	add x17,x17,x23
00a490e0	add x13,x13,x23
00a490e4	add x0,sp,#0x120
00a490e8	sub x11,x17,x11
00a490ec	sub x13,x13,x15
00a490f0	lsr x15,x11,#0x38
00a490f4	and x17,x14,#0xffffffffffffff
00a490f8	and x11,x11,#0xffffffffffffff
00a490fc	add x17,x17,x12, LSR #0x38
00a49100	and x12,x12,#0xffffffffffffff
00a49104	add x11,x11,x13, LSR #0x38
00a49108	and x13,x13,#0xffffffffffffff
00a4910c	add x12,x12,x10, LSR #0x38
00a49110	and x10,x10,#0xffffffffffffff
00a49114	add x16,x15,x16
00a49118	add x13,x13,x9, LSR #0x38
00a4911c	and x9,x9,#0xffffffffffffff
00a49120	add x10,x10,x8, LSR #0x38
00a49124	and x8,x8,#0xffffffffffffff
00a49128	stp x13,x11,[sp, #0xd0]
00a4912c	add x9,x9,x16, LSR #0x38
00a49130	and x11,x16,#0xffffffffffffff
00a49134	add x8,x15,x8
00a49138	str x9,[sp, #0xc8]
00a4913c	add x9,x11,x14, LSR #0x38
00a49140	add x1,sp,#0xa0
00a49144	stp x17,x9,[sp, #0xb8]
00a49148	stp x10,x12,[sp, #0xa8]
00a4914c	str x8,[sp, #0xa0]
00a49150	bl 0x00c3a4d0
00a49154	add x0,sp,#0xa0
00a49158	add x1,sp,#0x1a0
00a4915c	add x2,sp,#0x120
00a49160	bl 0x00c3a4b0
00a49164	ldp x8,x10,[sp, #0x160]
00a49168	ldp x9,x11,[sp, #0xe0]
00a4916c	ldp x12,x14,[sp, #0x170]
00a49170	ldp x13,x15,[sp, #0xf0]
00a49174	ldp x16,x18,[sp, #0x180]
00a49178	add x8,x9,x8
00a4917c	add x10,x11,x10
00a49180	add x12,x13,x12
00a49184	ldp x9,x13,[sp, #0x190]
00a49188	add x14,x15,x14
00a4918c	ldp x11,x15,[sp, #0x110]
00a49190	ldp x17,x0,[sp, #0x100]
00a49194	add x1,sp,#0x120
00a49198	add x9,x11,x9
00a4919c	add x11,x15,x13
00a491a0	and x15,x14,#0xffffffffffffff
00a491a4	add x15,x15,x12, LSR #0x38
00a491a8	and x12,x12,#0xffffffffffffff
00a491ac	lsr x13,x11,#0x38
00a491b0	add x12,x12,x10, LSR #0x38
00a491b4	and x10,x10,#0xffffffffffffff
00a491b8	and x11,x11,#0xffffffffffffff
00a491bc	add x16,x17,x16
00a491c0	add x17,x0,x18
00a491c4	add x10,x10,x8, LSR #0x38
00a491c8	and x8,x8,#0xffffffffffffff
00a491cc	add x11,x11,x9, LSR #0x38
00a491d0	and x9,x9,#0xffffffffffffff
00a491d4	add x16,x13,x16
00a491d8	add x8,x13,x8
00a491dc	add x9,x9,x17, LSR #0x38
00a491e0	and x13,x17,#0xffffffffffffff
00a491e4	stp x9,x11,[sp, #0x150]
00a491e8	add x9,x13,x16, LSR #0x38
00a491ec	and x11,x16,#0xffffffffffffff
00a491f0	str x9,[sp, #0x148]
00a491f4	add x9,x11,x14, LSR #0x38
00a491f8	add x0,sp,#0xe0
00a491fc	stp x15,x9,[sp, #0x138]
00a49200	stp x10,x12,[sp, #0x128]
00a49204	str x8,[sp, #0x120]
00a49208	bl 0x00c3a4d0
00a4920c	add x0,sp,#0x120
00a49210	add x1,sp,#0x60
00a49214	bl 0x00c3a4d0
00a49218	add x0,sp,#0x60
00a4921c	add x1,sp,#0x20
00a49220	bl 0x00c3a4d0
00a49224	add x0,sp,#0x160
00a49228	add x1,sp,#0x120
00a4922c	add x2,sp,#0x60
00a49230	bl 0x00c3a4b0
00a49234	ldp x8,x10,[sp, #0x120]
00a49238	ldp x9,x11,[sp, #0x60]
00a4923c	ldp x12,x14,[sp, #0x130]
00a49240	ldp x13,x15,[sp, #0x70]
00a49244	add x8,x8,x23
00a49248	sub x8,x8,x9
00a4924c	ldp x16,x9,[sp, #0x140]
00a49250	add x10,x10,x23
00a49254	sub x10,x10,x11
00a49258	ldp x17,x11,[sp, #0x80]
00a4925c	add x12,x12,x23
00a49260	add x16,x16,x21
00a49264	sub x12,x12,x13
00a49268	add x14,x14,x23
00a4926c	sub x16,x16,x17
00a49270	ldp x13,x17,[sp, #0x150]
00a49274	add x9,x9,x23
00a49278	sub x14,x14,x15
00a4927c	sub x9,x9,x11
00a49280	ldp x15,x11,[sp, #0x90]
00a49284	add x17,x17,x23
00a49288	add x13,x13,x23
00a4928c	add x0,sp,#0x60
00a49290	sub x11,x17,x11
00a49294	sub x13,x13,x15
00a49298	lsr x15,x11,#0x38
00a4929c	and x17,x14,#0xffffffffffffff
00a492a0	and x11,x11,#0xffffffffffffff
00a492a4	add x17,x17,x12, LSR #0x38
00a492a8	and x12,x12,#0xffffffffffffff
00a492ac	add x11,x11,x13, LSR #0x38
00a492b0	and x13,x13,#0xffffffffffffff
00a492b4	add x12,x12,x10, LSR #0x38
00a492b8	and x10,x10,#0xffffffffffffff
00a492bc	add x16,x15,x16
00a492c0	add x13,x13,x9, LSR #0x38
00a492c4	and x9,x9,#0xffffffffffffff
00a492c8	add x10,x10,x8, LSR #0x38
00a492cc	and x8,x8,#0xffffffffffffff
00a492d0	stp x13,x11,[sp, #0x50]
00a492d4	add x9,x9,x16, LSR #0x38
00a492d8	and x11,x16,#0xffffffffffffff
00a492dc	add x8,x15,x8
00a492e0	str x9,[sp, #0x48]
00a492e4	add x9,x11,x14, LSR #0x38
00a492e8	add x1,sp,#0x20
00a492ec	mov w2,#0x98a9
00a492f0	stp x17,x9,[sp, #0x38]
00a492f4	stp x10,x12,[sp, #0x28]
00a492f8	str x8,[sp, #0x20]
00a492fc	bl 0x00c3a4c0
00a49300	ldp x8,x10,[sp, #0x60]
00a49304	ldp x9,x11,[sp, #0x120]
00a49308	ldp x12,x14,[sp, #0x70]
00a4930c	ldp x13,x15,[sp, #0x130]
00a49310	ldp x16,x18,[sp, #0x80]
00a49314	add x8,x9,x8
00a49318	add x10,x11,x10
00a4931c	add x12,x13,x12
00a49320	ldp x9,x13,[sp, #0x90]
00a49324	add x14,x15,x14
00a49328	ldp x11,x15,[sp, #0x150]
00a4932c	ldp x17,x0,[sp, #0x140]
00a49330	add x1,sp,#0x20
00a49334	add x2,sp,#0x60
00a49338	add x9,x11,x9
00a4933c	add x11,x15,x13
00a49340	and x15,x14,#0xffffffffffffff
00a49344	add x15,x15,x12, LSR #0x38
00a49348	and x12,x12,#0xffffffffffffff
00a4934c	lsr x13,x11,#0x38
00a49350	add x12,x12,x10, LSR #0x38
00a49354	and x10,x10,#0xffffffffffffff
00a49358	and x11,x11,#0xffffffffffffff
00a4935c	add x16,x17,x16
00a49360	add x17,x0,x18
00a49364	add x10,x10,x8, LSR #0x38
00a49368	and x8,x8,#0xffffffffffffff
00a4936c	add x11,x11,x9, LSR #0x38
00a49370	and x9,x9,#0xffffffffffffff
00a49374	add x16,x13,x16
00a49378	add x8,x13,x8
00a4937c	add x9,x9,x17, LSR #0x38
00a49380	and x13,x17,#0xffffffffffffff
00a49384	stp x9,x11,[sp, #0x90]
00a49388	add x9,x13,x16, LSR #0x38
00a4938c	and x11,x16,#0xffffffffffffff
00a49390	str x9,[sp, #0x88]
00a49394	add x9,x11,x14, LSR #0x38
00a49398	add x0,sp,#0x120
00a4939c	stp x15,x9,[sp, #0x78]
00a493a0	stp x10,x12,[sp, #0x68]
00a493a4	str x8,[sp, #0x60]
00a493a8	bl 0x00c3a4b0
00a493ac	cbnz w22,0x00a48c08
00a493b0	ldr x8,[sp, #0x160]
00a493b4	ldr x9,[sp, #0xe0]
00a493b8	ldr x10,[sp, #0x120]
00a493bc	ldr x11,[sp, #0xa0]
00a493c0	ldr x14,[sp, #0x18]
00a493c4	eor x12,x9,x8
00a493c8	sub x0,x29,#0xa0
00a493cc	eor x13,x11,x10
00a493d0	and x12,x12,x14
00a493d4	and x13,x13,x14
00a493d8	eor x8,x12,x8
00a493dc	eor x9,x12,x9
00a493e0	eor x10,x13,x10
00a493e4	eor x11,x13,x11
00a493e8	str x8,[sp, #0x160]
00a493ec	str x9,[sp, #0xe0]
00a493f0	str x10,[sp, #0x120]
00a493f4	str x11,[sp, #0xa0]
00a493f8	ldr x8,[sp, #0x168]
00a493fc	ldr x9,[sp, #0xe8]
00a49400	ldr x10,[sp, #0x128]
00a49404	ldr x11,[sp, #0xa8]
00a49408	add x1,sp,#0x120
00a4940c	eor x12,x9,x8
00a49410	and x12,x12,x14
00a49414	eor x13,x11,x10
00a49418	and x13,x13,x14
00a4941c	eor x8,x12,x8
00a49420	eor x9,x12,x9
00a49424	eor x10,x13,x10
00a49428	eor x11,x13,x11
00a4942c	str x8,[sp, #0x168]
00a49430	str x9,[sp, #0xe8]
00a49434	str x10,[sp, #0x128]
00a49438	str x11,[sp, #0xa8]
00a4943c	ldr x8,[sp, #0x170]
00a49440	ldr x9,[sp, #0xf0]
00a49444	ldr x10,[sp, #0x130]
00a49448	ldr x11,[sp, #0xb0]
00a4944c	eor x12,x9,x8
00a49450	and x12,x12,x14
00a49454	eor x13,x11,x10
00a49458	and x13,x13,x14
00a4945c	eor x8,x12,x8
00a49460	eor x9,x12,x9
00a49464	eor x10,x13,x10
00a49468	eor x11,x13,x11
00a4946c	str x8,[sp, #0x170]
00a49470	str x9,[sp, #0xf0]
00a49474	str x10,[sp, #0x130]
00a49478	str x11,[sp, #0xb0]
00a4947c	ldr x8,[sp, #0x178]
00a49480	ldr x9,[sp, #0xf8]
00a49484	ldr x10,[sp, #0x138]
00a49488	ldr x11,[sp, #0xb8]
00a4948c	eor x12,x9,x8
00a49490	and x12,x12,x14
00a49494	eor x13,x11,x10
00a49498	and x13,x13,x14
00a4949c	eor x8,x12,x8
00a494a0	eor x9,x12,x9
00a494a4	eor x10,x13,x10
00a494a8	eor x11,x13,x11
00a494ac	str x8,[sp, #0x178]
00a494b0	str x9,[sp, #0xf8]
00a494b4	str x10,[sp, #0x138]
00a494b8	str x11,[sp, #0xb8]
00a494bc	ldr x8,[sp, #0x180]
00a494c0	ldr x9,[sp, #0x100]
00a494c4	ldr x10,[sp, #0x140]
00a494c8	ldr x11,[sp, #0xc0]
00a494cc	eor x12,x9,x8
00a494d0	and x12,x12,x14
00a494d4	eor x13,x11,x10
00a494d8	and x13,x13,x14
00a494dc	eor x8,x12,x8
00a494e0	eor x9,x12,x9
00a494e4	eor x10,x13,x10
00a494e8	eor x11,x13,x11
00a494ec	str x8,[sp, #0x180]
00a494f0	str x9,[sp, #0x100]
00a494f4	str x10,[sp, #0x140]
00a494f8	str x11,[sp, #0xc0]
00a494fc	ldr x8,[sp, #0x188]
00a49500	ldr x9,[sp, #0x108]
00a49504	ldr x10,[sp, #0x148]
00a49508	ldr x11,[sp, #0xc8]
00a4950c	eor x12,x9,x8
00a49510	and x12,x12,x14
00a49514	eor x13,x11,x10
00a49518	and x13,x13,x14
00a4951c	eor x8,x12,x8
00a49520	eor x9,x12,x9
00a49524	eor x10,x13,x10
00a49528	eor x11,x13,x11
00a4952c	str x8,[sp, #0x188]
00a49530	str x9,[sp, #0x108]
00a49534	str x10,[sp, #0x148]
00a49538	str x11,[sp, #0xc8]
00a4953c	ldr x8,[sp, #0x190]
00a49540	ldr x9,[sp, #0x110]
00a49544	ldr x10,[sp, #0x150]
00a49548	ldr x11,[sp, #0xd0]
00a4954c	eor x12,x9,x8
00a49550	and x12,x12,x14
00a49554	eor x13,x11,x10
00a49558	and x13,x13,x14
00a4955c	eor x8,x12,x8
00a49560	eor x9,x12,x9
00a49564	eor x10,x13,x10
00a49568	eor x11,x13,x11
00a4956c	str x8,[sp, #0x190]
00a49570	str x9,[sp, #0x110]
00a49574	str x10,[sp, #0x150]
00a49578	str x11,[sp, #0xd0]
00a4957c	ldr x8,[sp, #0x198]
00a49580	ldr x9,[sp, #0x118]
00a49584	ldr x10,[sp, #0x158]
00a49588	ldr x11,[sp, #0xd8]
00a4958c	eor x12,x9,x8
00a49590	and x12,x12,x14
00a49594	eor x13,x11,x10
00a49598	and x13,x13,x14
00a4959c	eor x8,x12,x8
00a495a0	eor x9,x12,x9
00a495a4	eor x10,x13,x10
00a495a8	eor x11,x13,x11
00a495ac	str x8,[sp, #0x198]
00a495b0	str x9,[sp, #0x118]
00a495b4	str x10,[sp, #0x158]
00a495b8	str x11,[sp, #0xd8]
00a495bc	bl 0x00c3a4d0
00a495c0	sub x0,x29,#0xe0
00a495c4	sub x1,x29,#0xa0
00a495c8	bl 0x00c3a5c0
00a495cc	sub x0,x29,#0xa0
00a495d0	sub x1,x29,#0xe0
00a495d4	bl 0x00c3a4d0
00a495d8	sub x0,x29,#0xe0
00a495dc	sub x1,x29,#0xa0
00a495e0	add x2,sp,#0x120
00a495e4	bl 0x00c3a4b0
00a495e8	ldp q1,q0,[x29, #-0xc0]
00a495ec	ldp q3,q2,[x29, #-0xe0]
00a495f0	add x0,sp,#0x1a0
00a495f4	add x1,sp,#0x160
00a495f8	add x2,sp,#0x120
00a495fc	stp q1,q0,[sp, #0x140]
00a49600	stp q3,q2,[sp, #0x120]
00a49604	bl 0x00c3a4b0
00a49608	ldr x0,[sp]
00a4960c	add x1,sp,#0x1a0
00a49610	mov w2,#0x1
00a49614	bl 0x00c3a5e0
00a49618	adrp x1,0x760000
00a4961c	add x1,x1,#0x980
00a49620	add x0,sp,#0x1a0
00a49624	bl 0x00c3a5b0
00a49628	mov x19,x0
00a4962c	add x0,sp,#0x1a0
00a49630	mov w1,#0x40
00a49634	bl 0x00c34750
00a49638	add x0,sp,#0x160
00a4963c	mov w1,#0x40
00a49640	bl 0x00c34750
00a49644	add x0,sp,#0x120
00a49648	mov w1,#0x40
00a4964c	bl 0x00c34750
00a49650	add x0,sp,#0xe0
00a49654	mov w1,#0x40
00a49658	bl 0x00c34750
00a4965c	add x0,sp,#0xa0
00a49660	mov w1,#0x40
00a49664	bl 0x00c34750
00a49668	add x0,sp,#0x60
00a4966c	mov w1,#0x40
00a49670	bl 0x00c34750
00a49674	add x0,sp,#0x20
00a49678	mov w1,#0x40
00a4967c	bl 0x00c34750
00a49680	mvn w0,w19
00a49684	add sp,sp,#0x270
00a49688	ldp x29,x30,[sp, #0x50]
00a4968c	ldp x20,x19,[sp, #0x40]
00a49690	ldp x22,x21,[sp, #0x30]
00a49694	ldp x24,x23,[sp, #0x20]
00a49698	ldp x26,x25,[sp, #0x10]
00a4969c	ldp x28,x27,[sp], #0x60
00a496a0	ret
