; FUN_008b8cac @ 008b8cac
008b8cac	sub sp,sp,#0x40
008b8cb0	stp x29,x30,[sp, #0x30]
008b8cb4	add x29,sp,#0x30
008b8cb8	fmov x9,d0
008b8cbc	mrs x8,tpidr_el0
008b8cc0	ldr x11,[x8, #0x28]
008b8cc4	ubfx x12,x9,#0x34,#0xb
008b8cc8	lsr x10,x9,#0x3f
008b8ccc	stur x11,[x29, #-0x8]
008b8cd0	and x11,x9,#0xfffffffffffff
008b8cd4	cmp w12,#0x7ff
008b8cd8	b.eq 0x008b91a4
008b8cdc	mov w9,#0x2d
008b8ce0	strb w9,[x0]
008b8ce4	add x9,x0,x10
008b8ce8	cbnz x11,0x008b8d00
008b8cec	cbnz w12,0x008b8d00
008b8cf0	mov w10,#0x30
008b8cf4	strb w10,[x9], #0x1
008b8cf8	mov x0,x9
008b8cfc	b 0x008b9188
008b8d00	sub w13,w12,#0x433
008b8d04	cmp w12,#0x0
008b8d08	mov w12,#0xfffffbce
008b8d0c	csel w13,w12,w13,eq
008b8d10	orr x12,x11,#0x10000000000000
008b8d14	neg w14,w13
008b8d18	csel x12,x11,x12,eq
008b8d1c	cmp w14,#0x34
008b8d20	b.hi 0x008b8d38
008b8d24	mov w11,w14
008b8d28	mov x15,#-0x1
008b8d2c	lsl x11,x15,x11
008b8d30	bics xzr,x12,x11
008b8d34	b.eq 0x008b8f18
008b8d38	mov x11,#0x10000000000000
008b8d3c	mov w16,#0x40
008b8d40	mov w15,#0xd104
008b8d44	cmp x12,x11
008b8d48	movk w16,#0xfffe, LSL #16
008b8d4c	movk w15,#0x4, LSL #16
008b8d50	cset w11,eq
008b8d54	cmn w13,#0x432
008b8d58	mov w17,#0x18
008b8d5c	cset w14,ne
008b8d60	adrp x1,0x364000
008b8d64	add x1,x1,#0x6a8
008b8d68	ands w14,w14,w11
008b8d6c	mov w4,#0xd962
008b8d70	csel w11,w16,wzr,ne
008b8d74	movk w4,#0xffca, LSL #16
008b8d78	madd w11,w13,w15,w11
008b8d7c	mov w15,#0x124
008b8d80	asr w11,w11,#0x14
008b8d84	sub w15,w15,w11
008b8d88	mul w4,w11,w4
008b8d8c	lsr w16,w15,#0x4
008b8d90	and w15,w15,#0xf
008b8d94	umaddl x16,w16,w17,x1
008b8d98	adrp x17,0x364000
008b8d9c	add x17,x17,#0xa50
008b8da0	ldr x17,[x17, w15, UXTW #0x3]
008b8da4	lsl w15,w15,#0x2
008b8da8	add w13,w13,w4, ASR #0x14
008b8dac	ldp x1,x2,[x16]
008b8db0	ldr x16,[x16, #0x10]
008b8db4	add w13,w13,#0x1
008b8db8	lsr x15,x16,x15
008b8dbc	lsl x16,x12,#0x2
008b8dc0	mul x3,x17,x1
008b8dc4	lsr x4,x15,#0x3
008b8dc8	orr x14,x16,x14
008b8dcc	lsl x16,x16,x13
008b8dd0	umulh x2,x17,x2
008b8dd4	sub x14,x14,#0x2
008b8dd8	lsl x14,x14,x13
008b8ddc	umulh x17,x17,x1
008b8de0	ubfx x1,x15,#0x3,#0x1
008b8de4	and x15,x15,#0x7
008b8de8	adds x2,x2,x3
008b8dec	lsl x3,x2,x1
008b8df0	and x2,x4,x2, LSR #0x3f
008b8df4	mov w4,#0x2
008b8df8	cinc x17,x17,cs
008b8dfc	bfm x4,x12,#0x3e,#0x34
008b8e00	lsl x17,x17,x1
008b8e04	sub x15,x3,x15
008b8e08	add x15,x15,#0x4
008b8e0c	lsl x13,x4,x13
008b8e10	add x17,x17,x2
008b8e14	umulh x1,x15,x14
008b8e18	mul x2,x17,x14
008b8e1c	umulh x14,x17,x14
008b8e20	umulh x3,x15,x16
008b8e24	adds x1,x2,x1
008b8e28	mul x5,x17,x16
008b8e2c	cinc x2,x14,cs
008b8e30	cmp x1,#0x1
008b8e34	umulh x16,x17,x16
008b8e38	cset w1,hi
008b8e3c	umulh x15,x15,x13
008b8e40	adds x14,x5,x3
008b8e44	mul x4,x17,x13
008b8e48	umulh x17,x17,x13
008b8e4c	cinc x13,x16,cs
008b8e50	cmp x14,#0x1
008b8e54	cset w14,hi
008b8e58	and x16,x12,#0x1
008b8e5c	adds x15,x4,x15
008b8e60	cinc x17,x17,cs
008b8e64	cmp x15,#0x1
008b8e68	orr x15,x2,x1
008b8e6c	cset w3,hi
008b8e70	cmp x13,#0x27
008b8e74	orr x12,x17,x3
008b8e78	b.ls 0x008b8ec8
008b8e7c	orr x17,xzr,#-0x3333333333333334
008b8e80	mov x2,x16
008b8e84	movk x17,#0xcccd
008b8e88	umulh x17,x13,x17
008b8e8c	lsr x1,x17,#0x5
008b8e90	add x17,x1,x1, LSL #0x2
008b8e94	lsl x3,x17,#0x3
008b8e98	bfm x2,x17,#0x3d,#0x3c
008b8e9c	add x17,x15,x16
008b8ea0	add x15,x2,#0x28
008b8ea4	cmp x17,x3
008b8ea8	cset w2,hi
008b8eac	cmp x12,x15
008b8eb0	cset w3,cs
008b8eb4	cinc x15,x1,cs
008b8eb8	cmp w2,w3
008b8ebc	b.ne 0x008b8ecc
008b8ec0	add w11,w11,#0x1
008b8ec4	b 0x008b8f20
008b8ec8	add x17,x15,x16
008b8ecc	and x15,x13,#-0x4
008b8ed0	ubfx x1,x13,#0x2,#0x1
008b8ed4	orr x2,x13,#0x3
008b8ed8	orr x16,x15,x16
008b8edc	add x16,x16,#0x4
008b8ee0	cmp x16,x12
008b8ee4	orr x12,x13,x14
008b8ee8	sub x14,x2,x1
008b8eec	cset w16,ls
008b8ef0	cmp x12,x14
008b8ef4	lsr x13,x13,#0x2
008b8ef8	cset w12,cs
008b8efc	cmp x17,x15
008b8f00	cset w14,hi
008b8f04	eor w14,w16,w14
008b8f08	cmp w14,#0x0
008b8f0c	csel w12,w12,w16,ne
008b8f10	add x15,x13,x12
008b8f14	b 0x008b8f20
008b8f18	lsr x15,x12,x14
008b8f1c	mov w11,wzr
008b8f20	lsr x12,x15,#0x4
008b8f24	mov x13,sp
008b8f28	add x14,x13,#0x14
008b8f2c	cmp x12,#0x271
008b8f30	adrp x12,0x364000
008b8f34	add x12,x12,#0xad0
008b8f38	b.cc 0x008b9024
008b8f3c	mov x17,#0x594b
008b8f40	mov w4,#0xe0ff
008b8f44	mov w1,#0x2710
008b8f48	movk x17,#0x3886, LSL #16
008b8f4c	mov w2,#0x147b
008b8f50	mov w3,#0x64
008b8f54	movk x17,#0xc5d6, LSL #32
008b8f58	movk w4,#0x5f5, LSL #16
008b8f5c	mov x13,x14
008b8f60	movk x17,#0x346d, LSL #48
008b8f64	umulh x16,x15,x17
008b8f68	cmp x15,x4
008b8f6c	lsr x16,x16,#0xb
008b8f70	msub w5,w16,w1,w15
008b8f74	mov x15,x16
008b8f78	ubfx w6,w5,#0x2,#0xe
008b8f7c	mul w6,w6,w2
008b8f80	lsr w6,w6,#0x11
008b8f84	msub w5,w6,w3,w5
008b8f88	ldrh w6,[x12, w6, UXTW #0x1]
008b8f8c	strh w6,[x13, #-0x4]!
008b8f90	and x5,x5,#0xffff
008b8f94	ldrh w5,[x12, x5, LSL #0x1]
008b8f98	strh w5,[x13, #0x2]
008b8f9c	b.hi 0x008b8f64
008b8fa0	cmp x16,#0xa
008b8fa4	b.cc 0x008b9034
008b8fa8	mov w15,#0x851f
008b8fac	mov w1,#0x64
008b8fb0	movk w15,#0x51eb, LSL #16
008b8fb4	umull x17,w16,w15
008b8fb8	cmp w16,#0x3e7
008b8fbc	lsr x17,x17,#0x25
008b8fc0	msub w2,w17,w1,w16
008b8fc4	mov w16,w17
008b8fc8	ldrh w2,[x12, w2, UXTW #0x1]
008b8fcc	strh w2,[x13, #-0x2]!
008b8fd0	b.hi 0x008b8fb4
008b8fd4	cbz w17,0x008b8fe0
008b8fd8	orr w15,w17,#0x30
008b8fdc	strb w15,[x13, #-0x1]!
008b8fe0	sub x15,x14,x13
008b8fe4	add w14,w11,w15
008b8fe8	add w16,w14,#0x5
008b8fec	cmp w16,#0x1a
008b8ff0	b.hi 0x008b9040
008b8ff4	cmp w14,#0x0
008b8ff8	b.le 0x008b90e0
008b8ffc	cbz w11,0x008b9138
008b9000	tbnz w11,#0x1f,0x008b9150
008b9004	ldrb w10,[x13, #0x10]
008b9008	ldr q0,[x13]
008b900c	add x0,x9,w14, UXTW 
008b9010	strb w10,[x9, #0x10]
008b9014	orr x10,xzr,#0x3030303030303030
008b9018	str q0,[x9]
008b901c	str x10,[x9, w15, SXTW #0x0]
008b9020	b 0x008b9188
008b9024	mov x16,x15
008b9028	mov x13,x14
008b902c	cmp x16,#0xa
008b9030	b.cs 0x008b8fa8
008b9034	mov w17,w16
008b9038	cbnz w17,0x008b8fd8
008b903c	b 0x008b8fe0
008b9040	ldrb w10,[x13]
008b9044	mov w11,#0x2e
008b9048	mov x16,x9
008b904c	strb w11,[x16, #0x1]!
008b9050	strb w10,[x9]
008b9054	add x10,x16,w15, SXTW 
008b9058	ldur q0,[x13, #0x1]
008b905c	stur q0,[x9, #0x2]
008b9060	ldrb w9,[x10, #-0x1]!
008b9064	cmp w9,#0x30
008b9068	b.eq 0x008b9060
008b906c	cmp w9,#0x2e
008b9070	mov w11,#0x1
008b9074	sub w9,w14,#0x1
008b9078	cinc x10,x10,ne
008b907c	subs w11,w11,w14
008b9080	mov w13,#0x2b
008b9084	mov w14,#0x2d
008b9088	csel w13,w14,w13,gt
008b908c	cmp w9,#0x0
008b9090	mov w14,#0x65
008b9094	csel w9,w9,w11,pl
008b9098	strb w14,[x10]
008b909c	cmp w9,#0x64
008b90a0	strb w13,[x10, #0x1]
008b90a4	b.cc 0x008b90d0
008b90a8	mov w11,#0x851f
008b90ac	mov w13,#0x64
008b90b0	add x0,x10,#0x3
008b90b4	movk w11,#0x51eb, LSL #16
008b90b8	umull x11,w9,w11
008b90bc	lsr x11,x11,#0x25
008b90c0	msub w9,w11,w13,w9
008b90c4	add w11,w11,#0x30
008b90c8	strb w11,[x10, #0x2]
008b90cc	b 0x008b90d4
008b90d0	add x0,x10,#0x2
008b90d4	ldrh w9,[x12, w9, UXTW #0x1]
008b90d8	strh w9,[x0], #0x2
008b90dc	b 0x008b9188
008b90e0	mov w11,#0x30
008b90e4	strb w11,[x0, x10]
008b90e8	add x10,x10,w15, SXTW 
008b90ec	orr w11,wzr,#0x30303030
008b90f0	mov w12,#0x2e
008b90f4	str w11,[x9, #0x2]!
008b90f8	add x10,x10,x0
008b90fc	sturb w12,[x9, #-0x1]
008b9100	strb w11,[x9, #0x4]
008b9104	neg w11,w14
008b9108	ldrb w12,[x13, #0x10]
008b910c	ldr q0,[x13]
008b9110	add x10,x10,x11
008b9114	add x9,x9,x11
008b9118	add x0,x10,#0x3
008b911c	strb w12,[x9, #0x10]
008b9120	str q0,[x9]
008b9124	ldurb w9,[x0, #-0x2]
008b9128	sub x0,x0,#0x1
008b912c	cmp w9,#0x30
008b9130	b.eq 0x008b9124
008b9134	b 0x008b9188
008b9138	ldrb w10,[x13, #0x10]
008b913c	ldr q0,[x13]
008b9140	add x0,x9,w14, UXTW 
008b9144	strb w10,[x9, #0x10]
008b9148	str q0,[x9]
008b914c	b 0x008b9188
008b9150	ldr q0,[x13]
008b9154	add x11,x9,x14
008b9158	mov w12,#0x2e
008b915c	str q0,[x9]
008b9160	add x9,x10,w15, UXTW 
008b9164	strb w12,[x11]
008b9168	ldr q0,[x13,x14]
008b916c	add x9,x9,x0
008b9170	add x0,x9,#0x2
008b9174	stur q0,[x11, #0x1]
008b9178	ldurb w9,[x0, #-0x2]
008b917c	sub x0,x0,#0x1
008b9180	cmp w9,#0x30
008b9184	b.eq 0x008b9178
008b9188	ldr x8,[x8, #0x28]
008b918c	ldur x9,[x29, #-0x8]
008b9190	cmp x8,x9
008b9194	b.ne 0x008b91d8
008b9198	ldp x29,x30,[sp, #0x30]
008b919c	add sp,sp,#0x40
008b91a0	ret
008b91a4	cbz x11,0x008b91b8
008b91a8	mov w9,#0x616e
008b91ac	movk w9,#0x6e, LSL #16
008b91b0	str w9,[x0], #0x3
008b91b4	b 0x008b9188
008b91b8	eor x9,x10,#0x1
008b91bc	adrp x11,0x2c6000
008b91c0	add x11,x11,#0xc1a
008b91c4	ldr w9,[x11, x9#0x0]
008b91c8	add x10,x0,x10
008b91cc	str w9,[x0]
008b91d0	add x0,x10,#0x3
008b91d4	b 0x008b9188
008b91d8	bl 0x00c2fec0
