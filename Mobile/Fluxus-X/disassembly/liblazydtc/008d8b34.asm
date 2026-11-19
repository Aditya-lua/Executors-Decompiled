; LZ4_decompress_safe_forceExtDict @ 008d8b34
008d8b34	sub sp,sp,#0xe0
008d8b38	stp x29,x30,[sp, #0x80]
008d8b3c	stp x28,x27,[sp, #0x90]
008d8b40	stp x26,x25,[sp, #0xa0]
008d8b44	stp x24,x23,[sp, #0xb0]
008d8b48	stp x22,x21,[sp, #0xc0]
008d8b4c	stp x20,x19,[sp, #0xd0]
008d8b50	add x29,sp,#0x80
008d8b54	mov x22,x0
008d8b58	mov w0,#0xffffffff
008d8b5c	stur x5,[x29, #-0x8]
008d8b60	cbz x22,0x008d94c8
008d8b64	tbnz w3,#0x1f,0x008d94c8
008d8b68	ldur x8,[x29, #-0x8]
008d8b6c	cmp x4,#0x0
008d8b70	add x8,x4,x8
008d8b74	csel x8,xzr,x8,eq
008d8b78	stur x8,[x29, #-0x10]
008d8b7c	cbz w3,0x008d90f8
008d8b80	cbz w2,0x008d94c8
008d8b84	ldur x8,[x29, #-0x8]
008d8b88	mov x20,x1
008d8b8c	add x17,x22,w2, SXTW 
008d8b90	mov w10,w3
008d8b94	cmp w3,#0x40
008d8b98	mov x23,x20
008d8b9c	lsr x1,x8,#0x10
008d8ba0	add x0,x20,x10
008d8ba4	sub x21,x17,#0x10
008d8ba8	sub x28,x0,#0x20
008d8bac	str x10,[sp, #0x18]
008d8bb0	stp x22,x1,[x29, #-0x30]
008d8bb4	stp x0,x17,[x29, #-0x20]
008d8bb8	b.cc 0x008d950c
008d8bbc	ldur x22,[x29, #-0x30]
008d8bc0	cmp w2,#0x12
008d8bc4	mov x9,x22
008d8bc8	ldrb w8,[x9], #0x1
008d8bcc	lsr x25,x8,#0x4
008d8bd0	b.ge 0x008d8be8
008d8bd4	mov x23,x20
008d8bd8	cmp x25,#0xf
008d8bdc	mov x22,x9
008d8be0	b.eq 0x008d919c
008d8be4	b 0x008d91d0
008d8be8	sub x11,x17,#0xf
008d8bec	sub x10,x17,#0x40
008d8bf0	sub x14,x17,#0x11
008d8bf4	stur x11,[x29, #-0x38]
008d8bf8	sub x11,x17,#0x6
008d8bfc	sub x15,x0,#0x40
008d8c00	stp x10,x11,[sp, #0x38]
008d8c04	sub x11,x0,#0x5
008d8c08	add x10,x20,#0x1
008d8c0c	stp x14,x11,[sp, #0x28]
008d8c10	add x11,x20,#0x10
008d8c14	mov x23,x20
008d8c18	stp x11,x10,[sp, #0x8]
008d8c1c	str x15,[sp, #0x20]
008d8c20	b 0x008d8c50
008d8c24	ldr x8,[x19]
008d8c28	str x8,[x24]
008d8c2c	ldr x8,[x19, #0x8]
008d8c30	str x8,[x24, #0x8]
008d8c34	ldrh w8,[x19, #0x10]
008d8c38	strh w8,[x24, #0x10]
008d8c3c	mov x9,x22
008d8c40	ldrb w8,[x9], #0x1
008d8c44	cmp x9,x14
008d8c48	lsr x25,x8,#0x4
008d8c4c	b.hi 0x008d8bd8
008d8c50	cmp x25,#0xf
008d8c54	b.ne 0x008d8cb8
008d8c58	ldur x10,[x29, #-0x38]
008d8c5c	cmp x9,x10
008d8c60	b.cs 0x008d90f0
008d8c64	ldrb w9,[x9]
008d8c68	add x22,x22,#0x2
008d8c6c	cmp x9,#0xff
008d8c70	b.eq 0x008d8ed4
008d8c74	add x25,x9,#0xf
008d8c78	cmn x22,x25
008d8c7c	b.cs 0x008d9110
008d8c80	add x24,x23,x25
008d8c84	cmp x24,x15
008d8c88	b.hi 0x008d91d4
008d8c8c	ldr x10,[sp, #0x38]
008d8c90	add x9,x22,x25
008d8c94	cmp x9,x10
008d8c98	b.hi 0x008d91d4
008d8c9c	ldp q1,q0,[x22, #0x20]
008d8ca0	ldp q2,q3,[x22], #0x40
008d8ca4	stp q1,q0,[x23, #0x20]
008d8ca8	stp q2,q3,[x23], #0x40
008d8cac	cmp x23,x24
008d8cb0	b.cc 0x008d8c9c
008d8cb4	b 0x008d8cc8
008d8cb8	ldr q0,[x9]
008d8cbc	add x9,x9,x25
008d8cc0	add x24,x23,x25
008d8cc4	str q0,[x23]
008d8cc8	mov x22,x9
008d8ccc	and x8,x8,#0xf
008d8cd0	ldrh w26,[x22], #0x2
008d8cd4	cmp x8,#0xf
008d8cd8	sub x19,x24,x26
008d8cdc	b.ne 0x008d8d18
008d8ce0	ldr x8,[sp, #0x40]
008d8ce4	cmp x22,x8
008d8ce8	b.cs 0x008d9110
008d8cec	ldrb w8,[x9, #0x2]
008d8cf0	add x22,x9,#0x3
008d8cf4	cmp x8,#0xff
008d8cf8	b.eq 0x008d8efc
008d8cfc	add x25,x8,#0x13
008d8d00	cmn x24,x25
008d8d04	b.cs 0x008d9110
008d8d08	add x8,x24,x25
008d8d0c	cmp x8,x15
008d8d10	b.cc 0x008d8d38
008d8d14	b 0x008d92cc
008d8d18	add x25,x8,#0x4
008d8d1c	add x23,x24,x25
008d8d20	cmp x23,x15
008d8d24	b.cs 0x008d92cc
008d8d28	cmp x19,x20
008d8d2c	b.cc 0x008d8d38
008d8d30	cmp w26,#0x8
008d8d34	b.cs 0x008d8c24
008d8d38	cbnz x1,0x008d8d4c
008d8d3c	ldur x8,[x29, #-0x8]
008d8d40	add x8,x19,x8
008d8d44	cmp x8,x20
008d8d48	b.cc 0x008d9110
008d8d4c	cmp x19,x20
008d8d50	add x23,x24,x25
008d8d54	b.cs 0x008d8e18
008d8d58	ldr x8,[sp, #0x30]
008d8d5c	cmp x23,x8
008d8d60	b.hi 0x008d9110
008d8d64	sub x27,x20,x19
008d8d68	subs x19,x25,x27
008d8d6c	b.ls 0x008d8e4c
008d8d70	ldur x8,[x29, #-0x10]
008d8d74	mov x0,x24
008d8d78	mov x2,x27
008d8d7c	sub x1,x8,x27
008d8d80	bl 0x00c2ffd0
008d8d84	add x0,x24,x27
008d8d88	sub x8,x0,x20
008d8d8c	cmp x19,x8
008d8d90	b.ls 0x008d8e8c
008d8d94	ldr x8,[sp, #0x10]
008d8d98	add x9,x25,x24
008d8d9c	add x8,x8,x26
008d8da0	cmp x8,x9
008d8da4	csel x8,x8,x9,hi
008d8da8	add x9,x20,x26
008d8dac	sub x9,x8,x9
008d8db0	cmp x9,#0x20
008d8db4	b.cc 0x008d8ea8
008d8db8	ldp x15,x14,[sp, #0x20]
008d8dbc	cmp w26,#0x20
008d8dc0	ldur x17,[x29, #-0x18]
008d8dc4	ldur x1,[x29, #-0x28]
008d8dc8	mov x8,x20
008d8dcc	b.cc 0x008d8eb8
008d8dd0	ldr x13,[sp, #0x8]
008d8dd4	and x10,x9,#-0x20
008d8dd8	sub x12,x26,x24
008d8ddc	add x0,x0,x10
008d8de0	add x8,x20,x10
008d8de4	add x11,x24,x13
008d8de8	add x11,x11,x12
008d8dec	mov x12,x13
008d8df0	mov x13,x10
008d8df4	ldp q0,q1,[x12, #-0x10]
008d8df8	subs x13,x13,#0x20
008d8dfc	add x12,x12,#0x20
008d8e00	stp q0,q1,[x11, #-0x10]
008d8e04	add x11,x11,#0x20
008d8e08	b.ne 0x008d8df4
008d8e0c	cmp x9,x10
008d8e10	b.ne 0x008d8eb8
008d8e14	b 0x008d8ec8
008d8e18	cmp w26,#0xf
008d8e1c	b.ls 0x008d8f24
008d8e20	cmp w26,#0x3f
008d8e24	neg x8,x26
008d8e28	b.ls 0x008d8e64
008d8e2c	add x9,x24,x8
008d8e30	ldp q1,q0,[x9, #0x20]
008d8e34	ldp q2,q3,[x9]
008d8e38	stp q1,q0,[x24, #0x20]
008d8e3c	stp q2,q3,[x24], #0x40
008d8e40	cmp x24,x23
008d8e44	b.cc 0x008d8e2c
008d8e48	b 0x008d8c3c
008d8e4c	ldur x8,[x29, #-0x10]
008d8e50	mov x0,x24
008d8e54	mov x2,x25
008d8e58	sub x1,x8,x27
008d8e5c	bl 0x00c2ff60
008d8e60	b 0x008d8e98
008d8e64	add x8,x24,x8
008d8e68	add x8,x8,#0x10
008d8e6c	ldur q0,[x8, #-0x10]
008d8e70	str q0,[x24]
008d8e74	ldr q0,[x8], #0x20
008d8e78	str q0,[x24, #0x10]
008d8e7c	add x24,x24,#0x20
008d8e80	cmp x24,x23
008d8e84	b.cc 0x008d8e6c
008d8e88	b 0x008d8c3c
008d8e8c	mov x1,x20
008d8e90	mov x2,x19
008d8e94	bl 0x00c2ffd0
008d8e98	ldp x0,x17,[x29, #-0x20]
008d8e9c	ldur x1,[x29, #-0x28]
008d8ea0	ldp x15,x14,[sp, #0x20]
008d8ea4	b 0x008d8c3c
008d8ea8	ldp x15,x14,[sp, #0x20]
008d8eac	mov x8,x20
008d8eb0	ldur x17,[x29, #-0x18]
008d8eb4	ldur x1,[x29, #-0x28]
008d8eb8	ldrb w9,[x8], #0x1
008d8ebc	strb w9,[x0], #0x1
008d8ec0	cmp x0,x23
008d8ec4	b.cc 0x008d8eb8
008d8ec8	mov x23,x0
008d8ecc	ldur x0,[x29, #-0x20]
008d8ed0	b 0x008d8c3c
008d8ed4	ldur x10,[x29, #-0x38]
008d8ed8	cmp x22,x10
008d8edc	b.cs 0x008d9110
008d8ee0	ldrb w10,[x22], #0x1
008d8ee4	cmp x10,#0xff
008d8ee8	add x9,x9,x10
008d8eec	b.eq 0x008d8ed4
008d8ef0	cmn x9,#0x1
008d8ef4	b.ne 0x008d8c74
008d8ef8	b 0x008d9110
008d8efc	ldr x9,[sp, #0x40]
008d8f00	cmp x22,x9
008d8f04	b.cs 0x008d9110
008d8f08	ldrb w9,[x22], #0x1
008d8f0c	cmp x9,#0xff
008d8f10	add x8,x8,x9
008d8f14	b.eq 0x008d8efc
008d8f18	cmn x8,#0x1
008d8f1c	b.ne 0x008d8cfc
008d8f20	b 0x008d9110
008d8f24	cmp w26,#0x4
008d8f28	b.eq 0x008d8f60
008d8f2c	cmp w26,#0x2
008d8f30	b.eq 0x008d8f50
008d8f34	cmp w26,#0x1
008d8f38	b.ne 0x008d8ff4
008d8f3c	ldrb w9,[x19]
008d8f40	orr w10,wzr,#0x1010101
008d8f44	orr x8,x9,x9, LSL #0x8
008d8f48	mul w9,w9,w10
008d8f4c	b 0x008d8f58
008d8f50	ldrh w8,[x19]
008d8f54	orr w9,w8,w8, LSL #0x10
008d8f58	mov x10,x8
008d8f5c	b 0x008d8f70
008d8f60	ldr w9,[x19]
008d8f64	lsr w10,w9,#0x10
008d8f68	and x8,x9,#0xffff
008d8f6c	mov w10,w10
008d8f70	orr x8,x8,x10, LSL #0x10
008d8f74	cmp x25,#0x9
008d8f78	orr x8,x8,x9, LSL #0x20
008d8f7c	str x8,[x24]
008d8f80	b.cc 0x008d8c3c
008d8f84	add x9,x25,x24
008d8f88	add x10,x24,#0x10
008d8f8c	cmp x9,x10
008d8f90	csel x9,x9,x10,hi
008d8f94	sub x9,x9,x24
008d8f98	sub x10,x9,#0x9
008d8f9c	add x9,x24,#0x8
008d8fa0	cmp x10,#0x18
008d8fa4	b.cc 0x008d8fe4
008d8fa8	lsr x10,x10,#0x3
008d8fac	dup v0.2D,x8
008d8fb0	add x12,x24,#0x18
008d8fb4	add x10,x10,#0x1
008d8fb8	and x11,x10,#0x3ffffffffffffffc
008d8fbc	add x9,x9,x11, LSL #0x3
008d8fc0	mov x13,x11
008d8fc4	subs x13,x13,#0x4
008d8fc8	stp q0,q0,[x12, #-0x10]
008d8fcc	add x12,x12,#0x20
008d8fd0	b.ne 0x008d8fc4
008d8fd4	ldp x0,x17,[x29, #-0x20]
008d8fd8	cmp x10,x11
008d8fdc	ldur x1,[x29, #-0x28]
008d8fe0	b.eq 0x008d8c3c
008d8fe4	str x8,[x9], #0x8
008d8fe8	cmp x9,x23
008d8fec	b.cc 0x008d8fe4
008d8ff0	b 0x008d8c3c
008d8ff4	mov x16,x15
008d8ff8	mov x15,x14
008d8ffc	cmp w26,#0x7
008d9000	b.hi 0x008d9044
008d9004	str wzr,[x24]
008d9008	ldrh w8,[x19]
008d900c	strh w8,[x24]
008d9010	ldrh w8,[x19, #0x2]
008d9014	strh w8,[x24, #0x2]
008d9018	adrp x8,0x364000
008d901c	add x8,x8,#0xe30
008d9020	ldr w8,[x8, x26, LSL #0x2]
008d9024	add x8,x19,x8
008d9028	ldr w9,[x8]
008d902c	str w9,[x24, #0x4]
008d9030	adrp x9,0x364000
008d9034	add x9,x9,#0xdd0
008d9038	ldrsw x9,[x9, x26, LSL #0x2]
008d903c	sub x19,x8,x9
008d9040	b 0x008d904c
008d9044	ldr x8,[x19], #0x8
008d9048	str x8,[x24]
008d904c	add x8,x25,x24
008d9050	add x9,x24,#0x10
008d9054	cmp x8,x9
008d9058	csel x8,x8,x9,hi
008d905c	sub x8,x8,x24
008d9060	sub x9,x8,#0x9
008d9064	add x8,x24,#0x8
008d9068	cmp x9,#0x18
008d906c	b.cc 0x008d9080
008d9070	sub x10,x24,x19
008d9074	add x10,x10,#0x8
008d9078	cmp x10,#0x20
008d907c	b.cs 0x008d90a8
008d9080	mov x9,x19
008d9084	ldr x10,[x9], #0x8
008d9088	str x10,[x8], #0x8
008d908c	cmp x8,x23
008d9090	b.cc 0x008d9084
008d9094	ldp x0,x17,[x29, #-0x20]
008d9098	mov x14,x15
008d909c	ldur x1,[x29, #-0x28]
008d90a0	mov x15,x16
008d90a4	b 0x008d8c3c
008d90a8	lsr x9,x9,#0x3
008d90ac	add x13,x19,#0x10
008d90b0	add x10,x9,#0x1
008d90b4	and x11,x10,#0x3ffffffffffffffc
008d90b8	lsl x12,x11,#0x3
008d90bc	mov x14,x11
008d90c0	add x9,x19,x12
008d90c4	add x8,x8,x12
008d90c8	add x12,x24,#0x18
008d90cc	ldp q0,q1,[x13, #-0x10]
008d90d0	subs x14,x14,#0x4
008d90d4	add x13,x13,#0x20
008d90d8	stp q0,q1,[x12, #-0x10]
008d90dc	add x12,x12,#0x20
008d90e0	b.ne 0x008d90cc
008d90e4	cmp x10,x11
008d90e8	b.ne 0x008d9084
008d90ec	b 0x008d9094
008d90f0	mov x22,x9
008d90f4	b 0x008d9110
008d90f8	cmp w2,#0x1
008d90fc	b.ne 0x008d94c8
008d9100	ldrb w8,[x22]
008d9104	cmp w8,#0x0
008d9108	csetm w0,ne
008d910c	b 0x008d94c8
008d9110	ldur x9,[x29, #-0x30]
008d9114	mvn w8,w22
008d9118	add w0,w8,w9
008d911c	b 0x008d94c8
008d9120	cmp x22,x21
008d9124	b.cs 0x008d91d0
008d9128	cmp x23,x28
008d912c	b.hi 0x008d91d0
008d9130	ldr q0,[x22]
008d9134	add x9,x22,x25
008d9138	and x10,x8,#0xf
008d913c	mov x22,x9
008d9140	add x24,x23,x25
008d9144	cmp x10,#0xf
008d9148	str q0,[x23]
008d914c	ldrh w26,[x22], #0x2
008d9150	sub x19,x24,x26
008d9154	b.eq 0x008d9288
008d9158	cmp w26,#0x8
008d915c	b.cc 0x008d9288
008d9160	cmp x19,x20
008d9164	b.cc 0x008d9288
008d9168	ldr x8,[x19]
008d916c	add x10,x24,x10
008d9170	add x22,x9,#0x3
008d9174	add x23,x10,#0x4
008d9178	str x8,[x24]
008d917c	ldr x8,[x19, #0x8]
008d9180	str x8,[x24, #0x8]
008d9184	ldrh w8,[x19, #0x10]
008d9188	strh w8,[x24, #0x10]
008d918c	ldrb w8,[x9, #0x2]
008d9190	lsr x25,x8,#0x4
008d9194	cmp x25,#0xf
008d9198	b.ne 0x008d9120
008d919c	sub x10,x17,#0xf
008d91a0	cmp x22,x10
008d91a4	b.cs 0x008d9110
008d91a8	ldrb w9,[x22], #0x1
008d91ac	cmp x9,#0xff
008d91b0	b.eq 0x008d9520
008d91b4	add x25,x9,#0xf
008d91b8	cmn x23,x25
008d91bc	cset w10,cs
008d91c0	cmn x22,x25
008d91c4	cset w9,cs
008d91c8	tbnz w10,#0x0,0x008d9110
008d91cc	tbnz w9,#0x0,0x008d9110
008d91d0	add x24,x23,x25
008d91d4	sub x9,x0,#0xc
008d91d8	cmp x24,x9
008d91dc	b.hi 0x008d949c
008d91e0	add x9,x22,x25
008d91e4	sub x10,x17,#0x8
008d91e8	cmp x9,x10
008d91ec	b.hi 0x008d949c
008d91f0	add x10,x23,#0x8
008d91f4	mvn x11,x23
008d91f8	cmp x24,x10
008d91fc	csel x10,x24,x10,hi
008d9200	add x10,x10,x11
008d9204	cmp x10,#0x18
008d9208	b.cc 0x008d9260
008d920c	sub x11,x23,x22
008d9210	cmp x11,#0x20
008d9214	b.cc 0x008d9260
008d9218	lsr x10,x10,#0x3
008d921c	add x14,x23,#0x10
008d9220	add x15,x22,#0x10
008d9224	add x12,x10,#0x1
008d9228	and x13,x12,#0x3ffffffffffffffc
008d922c	lsl x11,x13,#0x3
008d9230	mov x16,x13
008d9234	add x10,x22,x11
008d9238	add x11,x23,x11
008d923c	ldp q0,q1,[x15, #-0x10]
008d9240	subs x16,x16,#0x4
008d9244	add x15,x15,#0x20
008d9248	stp q0,q1,[x14, #-0x10]
008d924c	add x14,x14,#0x20
008d9250	b.ne 0x008d923c
008d9254	cmp x12,x13
008d9258	b.ne 0x008d9268
008d925c	b 0x008d9278
008d9260	mov x10,x22
008d9264	mov x11,x23
008d9268	ldr x12,[x10], #0x8
008d926c	str x12,[x11], #0x8
008d9270	cmp x11,x24
008d9274	b.cc 0x008d9268
008d9278	ldrh w26,[x9], #0x2
008d927c	and x10,x8,#0xf
008d9280	mov x22,x9
008d9284	sub x19,x24,x26
008d9288	cmp x10,#0xf
008d928c	b.ne 0x008d92c8
008d9290	sub x9,x17,#0x6
008d9294	cmp x22,x9
008d9298	b.cs 0x008d9110
008d929c	ldrb w8,[x22], #0x1
008d92a0	cmp x8,#0xff
008d92a4	b.eq 0x008d9544
008d92a8	add x10,x8,#0xf
008d92ac	cmn x24,x10
008d92b0	cset w9,cs
008d92b4	cmn x8,#0x1
008d92b8	mov w8,#0xf
008d92bc	csel x10,x8,x10,eq
008d92c0	b.eq 0x008d9110
008d92c4	tbnz w9,#0x0,0x008d9110
008d92c8	add x25,x10,#0x4
008d92cc	cbnz x1,0x008d92e0
008d92d0	ldur x8,[x29, #-0x8]
008d92d4	add x8,x19,x8
008d92d8	cmp x8,x20
008d92dc	b.cc 0x008d9110
008d92e0	cmp x19,x20
008d92e4	add x23,x24,x25
008d92e8	b.cs 0x008d93a4
008d92ec	sub x8,x0,#0x5
008d92f0	cmp x23,x8
008d92f4	b.hi 0x008d9110
008d92f8	sub x27,x20,x19
008d92fc	subs x26,x25,x27
008d9300	b.ls 0x008d9424
008d9304	ldur x8,[x29, #-0x10]
008d9308	mov x0,x24
008d930c	mov x2,x27
008d9310	sub x1,x8,x27
008d9314	bl 0x00c2ffd0
008d9318	add x0,x24,x27
008d931c	sub x8,x0,x20
008d9320	cmp x26,x8
008d9324	b.ls 0x008d943c
008d9328	add x9,x24,x20
008d932c	add x12,x25,x24
008d9330	sub x10,x9,x19
008d9334	add x11,x10,#0x1
008d9338	cmp x11,x12
008d933c	csinc x10,x12,x10,ls
008d9340	add x10,x10,x19
008d9344	sub x9,x10,x9
008d9348	cmp x9,#0x20
008d934c	b.cc 0x008d94e8
008d9350	ldur x17,[x29, #-0x18]
008d9354	ldur x1,[x29, #-0x28]
008d9358	cmp x8,#0x20
008d935c	mov x8,x20
008d9360	b.cc 0x008d94f4
008d9364	add x11,x20,#0x10
008d9368	and x10,x9,#-0x20
008d936c	sub x12,x11,x19
008d9370	add x0,x0,x10
008d9374	add x8,x20,x10
008d9378	add x12,x24,x12
008d937c	mov x13,x10
008d9380	ldp q0,q1,[x11, #-0x10]
008d9384	subs x13,x13,#0x20
008d9388	add x11,x11,#0x20
008d938c	stp q0,q1,[x12, #-0x10]
008d9390	add x12,x12,#0x20
008d9394	b.ne 0x008d9380
008d9398	cmp x9,x10
008d939c	b.ne 0x008d94f4
008d93a0	b 0x008d9504
008d93a4	cmp x26,#0x7
008d93a8	sub x8,x0,#0xc
008d93ac	b.ls 0x008d9560
008d93b0	ldr x9,[x19], #0x8
008d93b4	str x9,[x24]
008d93b8	cmp x23,x8
008d93bc	add x9,x24,#0x8
008d93c0	b.hi 0x008d95b0
008d93c4	ldr x8,[x19]
008d93c8	cmp x25,#0x11
008d93cc	str x8,[x9]
008d93d0	b.cc 0x008d950c
008d93d4	add x8,x25,x24
008d93d8	add x9,x24,#0x18
008d93dc	cmp x8,x9
008d93e0	csel x8,x8,x9,hi
008d93e4	sub x8,x8,x24
008d93e8	sub x9,x8,#0x11
008d93ec	add x8,x24,#0x10
008d93f0	cmp x9,#0x28
008d93f4	b.cc 0x008d9408
008d93f8	sub x10,x24,x19
008d93fc	add x10,x10,#0x8
008d9400	cmp x10,#0x20
008d9404	b.cs 0x008d9454
008d9408	mov x9,x19
008d940c	add x9,x9,#0x8
008d9410	ldr x10,[x9], #0x8
008d9414	str x10,[x8], #0x8
008d9418	cmp x8,x23
008d941c	b.cc 0x008d9410
008d9420	b 0x008d950c
008d9424	ldur x8,[x29, #-0x10]
008d9428	mov x0,x24
008d942c	mov x2,x25
008d9430	sub x1,x8,x27
008d9434	bl 0x00c2ff60
008d9438	b 0x008d9448
008d943c	mov x1,x20
008d9440	mov x2,x26
008d9444	bl 0x00c2ffd0
008d9448	ldp x0,x17,[x29, #-0x20]
008d944c	ldur x1,[x29, #-0x28]
008d9450	b 0x008d950c
008d9454	lsr x9,x9,#0x3
008d9458	add x13,x19,#0x18
008d945c	add x10,x9,#0x1
008d9460	and x11,x10,#0x3ffffffffffffffc
008d9464	lsl x12,x11,#0x3
008d9468	mov x14,x11
008d946c	add x9,x19,x12
008d9470	add x8,x8,x12
008d9474	add x12,x24,#0x20
008d9478	ldp q0,q1,[x13, #-0x10]
008d947c	subs x14,x14,#0x4
008d9480	add x13,x13,#0x20
008d9484	stp q0,q1,[x12, #-0x10]
008d9488	add x12,x12,#0x20
008d948c	b.ne 0x008d9478
008d9490	cmp x10,x11
008d9494	b.eq 0x008d950c
008d9498	b 0x008d940c
008d949c	add x8,x22,x25
008d94a0	cmp x8,x17
008d94a4	b.ne 0x008d9110
008d94a8	cmp x24,x0
008d94ac	b.hi 0x008d9110
008d94b0	mov x0,x23
008d94b4	mov x1,x22
008d94b8	mov x2,x25
008d94bc	bl 0x00c2ff60
008d94c0	add w8,w23,w25
008d94c4	sub w0,w8,w20
008d94c8	ldp x20,x19,[sp, #0xd0]
008d94cc	ldp x22,x21,[sp, #0xc0]
008d94d0	ldp x24,x23,[sp, #0xb0]
008d94d4	ldp x26,x25,[sp, #0xa0]
008d94d8	ldp x28,x27,[sp, #0x90]
008d94dc	ldp x29,x30,[sp, #0x80]
008d94e0	add sp,sp,#0xe0
008d94e4	ret
008d94e8	ldur x17,[x29, #-0x18]
008d94ec	ldur x1,[x29, #-0x28]
008d94f0	mov x8,x20
008d94f4	ldrb w9,[x8], #0x1
008d94f8	strb w9,[x0], #0x1
008d94fc	cmp x0,x23
008d9500	b.cc 0x008d94f4
008d9504	mov x23,x0
008d9508	ldur x0,[x29, #-0x20]
008d950c	ldrb w8,[x22], #0x1
008d9510	lsr x25,x8,#0x4
008d9514	cmp x25,#0xf
008d9518	b.ne 0x008d9120
008d951c	b 0x008d919c
008d9520	cmp x22,x10
008d9524	b.cs 0x008d9110
008d9528	ldrb w11,[x22], #0x1
008d952c	cmp x11,#0xff
008d9530	add x9,x9,x11
008d9534	b.eq 0x008d9520
008d9538	cmn x9,#0x1
008d953c	b.ne 0x008d91b4
008d9540	b 0x008d9110
008d9544	cmp x22,x9
008d9548	b.cs 0x008d9110
008d954c	ldrb w10,[x22], #0x1
008d9550	cmp x10,#0xff
008d9554	add x8,x8,x10
008d9558	b.eq 0x008d9544
008d955c	b 0x008d92a8
008d9560	str wzr,[x24]
008d9564	ldrb w9,[x19]
008d9568	strb w9,[x24]
008d956c	ldrb w9,[x19, #0x1]
008d9570	strb w9,[x24, #0x1]
008d9574	ldrb w9,[x19, #0x2]
008d9578	strb w9,[x24, #0x2]
008d957c	ldrb w9,[x19, #0x3]
008d9580	strb w9,[x24, #0x3]
008d9584	adrp x9,0x364000
008d9588	add x9,x9,#0xe30
008d958c	ldr w9,[x9, x26, LSL #0x2]
008d9590	add x9,x19,x9
008d9594	ldr w10,[x9]
008d9598	str w10,[x24, #0x4]
008d959c	adrp x10,0x364000
008d95a0	add x10,x10,#0xdd0
008d95a4	ldrsw x10,[x10, x26, LSL #0x2]
008d95a8	sub x19,x9,x10
008d95ac	b 0x008d93b8
008d95b0	sub x8,x0,#0x5
008d95b4	cmp x23,x8
008d95b8	b.hi 0x008d9110
008d95bc	sub x8,x0,#0x7
008d95c0	cmp x9,x8
008d95c4	b.cs 0x008d95fc
008d95c8	ldr x10,[sp, #0x18]
008d95cc	add x11,x24,#0x10
008d95d0	add x10,x20,x10
008d95d4	sub x10,x10,#0x7
008d95d8	cmp x10,x11
008d95dc	csel x10,x10,x11,hi
008d95e0	sub x10,x10,x24
008d95e4	sub x12,x10,#0x9
008d95e8	cmp x12,#0x28
008d95ec	b.cs 0x008d9608
008d95f0	mov x10,x19
008d95f4	mov x11,x9
008d95f8	b 0x008d9664
008d95fc	mov x10,x19
008d9600	mov x8,x9
008d9604	b 0x008d967c
008d9608	sub x10,x24,x19
008d960c	mov x11,x9
008d9610	add x10,x10,#0x8
008d9614	cmp x10,#0x20
008d9618	mov x10,x19
008d961c	b.cc 0x008d9664
008d9620	lsr x10,x12,#0x3
008d9624	add x14,x24,#0x18
008d9628	add x15,x19,#0x10
008d962c	add x12,x10,#0x1
008d9630	and x13,x12,#0x3ffffffffffffffc
008d9634	lsl x11,x13,#0x3
008d9638	mov x16,x13
008d963c	add x10,x19,x11
008d9640	add x11,x9,x11
008d9644	ldp q0,q1,[x15, #-0x10]
008d9648	subs x16,x16,#0x4
008d964c	add x15,x15,#0x20
008d9650	stp q0,q1,[x14, #-0x10]
008d9654	add x14,x14,#0x20
008d9658	b.ne 0x008d9644
008d965c	cmp x12,x13
008d9660	b.eq 0x008d9674
008d9664	ldr x12,[x10], #0x8
008d9668	str x12,[x11], #0x8
008d966c	cmp x11,x8
008d9670	b.cc 0x008d9664
008d9674	sub x9,x8,x9
008d9678	add x10,x19,x9
008d967c	cmp x8,x23
008d9680	b.cs 0x008d950c
008d9684	ldr x9,[sp, #0x18]
008d9688	add x11,x24,#0x8
008d968c	add x12,x25,x24
008d9690	add x9,x20,x9
008d9694	sub x9,x9,#0x7
008d9698	cmp x9,x11
008d969c	csel x11,x9,x11,hi
008d96a0	sub x9,x12,x11
008d96a4	cmp x9,#0x8
008d96a8	b.cc 0x008d96bc
008d96ac	sub x12,x24,x19
008d96b0	add x12,x12,#0x8
008d96b4	cmp x12,#0x20
008d96b8	b.cs 0x008d96d8
008d96bc	mov x13,x8
008d96c0	mov x14,x10
008d96c4	ldrb w8,[x14], #0x1
008d96c8	strb w8,[x13], #0x1
008d96cc	cmp x13,x23
008d96d0	b.cc 0x008d96c4
008d96d4	b 0x008d950c
008d96d8	cmp x9,#0x20
008d96dc	mov x12,xzr
008d96e0	b.cc 0x008d9734
008d96e4	sub x13,x11,x24
008d96e8	and x12,x9,#-0x20
008d96ec	add x14,x8,#0x10
008d96f0	add x13,x13,x19
008d96f4	mov x15,x12
008d96f8	add x13,x13,#0x8
008d96fc	ldp q0,q1,[x13, #-0x10]
008d9700	subs x15,x15,#0x20
008d9704	add x13,x13,#0x20
008d9708	stp q0,q1,[x14, #-0x10]
008d970c	add x14,x14,#0x20
008d9710	b.ne 0x008d96fc
008d9714	cmp x9,x12
008d9718	b.eq 0x008d9448
008d971c	ldp x0,x17,[x29, #-0x20]
008d9720	tst x9,#0x18
008d9724	ldur x1,[x29, #-0x28]
008d9728	add x13,x8,x12
008d972c	add x14,x10,x12
008d9730	b.eq 0x008d96c4
008d9734	add x13,x12,x11
008d9738	and x11,x9,#-0x8
008d973c	sub x15,x13,x24
008d9740	add x14,x10,x11
008d9744	add x13,x8,x11
008d9748	add x10,x15,x19
008d974c	add x8,x8,x12
008d9750	sub x12,x12,x11
008d9754	sub x10,x10,#0x8
008d9758	ldr d0,[x10], #0x8
008d975c	adds x12,x12,#0x8
008d9760	str d0,[x8], #0x8
008d9764	b.ne 0x008d9758
008d9768	cmp x9,x11
008d976c	b.ne 0x008d96c4
008d9770	b 0x008d950c
