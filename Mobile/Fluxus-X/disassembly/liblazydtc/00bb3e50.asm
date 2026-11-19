; HUF_readDTableX1_wksp @ 00bb3e50
00bb3e50	sub sp,sp,#0xe0
00bb3e54	stp x29,x30,[sp, #0x80]
00bb3e58	stp x28,x27,[sp, #0x90]
00bb3e5c	stp x26,x25,[sp, #0xa0]
00bb3e60	stp x24,x23,[sp, #0xb0]
00bb3e64	stp x22,x21,[sp, #0xc0]
00bb3e68	stp x20,x19,[sp, #0xd0]
00bb3e6c	add x29,sp,#0x80
00bb3e70	mrs x20,tpidr_el0
00bb3e74	ldr x9,[x20, #0x28]
00bb3e78	cmp x4,#0x5d4
00bb3e7c	stur x9,[x29, #-0x8]
00bb3e80	stur xzr,[x29, #-0x10]
00bb3e84	b.cs 0x00bb3e90
00bb3e88	mov x0,#-0x2c
00bb3e8c	b 0x00bb4b38
00bb3e90	mov x19,x3
00bb3e94	mov x8,x1
00bb3e98	add x21,x3,#0x4d4
00bb3e9c	mov x6,x2
00bb3ea0	mov x22,x0
00bb3ea4	str w5,[sp, #0x8]
00bb3ea8	mov w9,#0x36c
00bb3eac	sub x3,x29,#0x10
00bb3eb0	sub x4,x29,#0xc
00bb3eb4	add x7,x19,#0x68
00bb3eb8	mov x0,x21
00bb3ebc	mov w1,#0x100
00bb3ec0	mov x2,x19
00bb3ec4	mov x5,x8
00bb3ec8	str x9,[sp]
00bb3ecc	bl 0x00c43730
00bb3ed0	cmn x0,#0x78
00bb3ed4	b.hi 0x00bb4b38
00bb3ed8	ldr w25,[x22]
00bb3edc	mov w11,#0xb
00bb3ee0	ldp w23,w8,[x29, #-0x10]
00bb3ee4	and w9,w25,#0xff
00bb3ee8	add w10,w9,#0x1
00bb3eec	cmp w10,#0xb
00bb3ef0	csinc w24,w11,w9,cs
00bb3ef4	subs w9,w24,w8
00bb3ef8	b.cs 0x00bb3f0c
00bb3efc	cmp w8,w10
00bb3f00	mov w24,w8
00bb3f04	b.hi 0x00bb3e88
00bb3f08	b 0x00bb4034
00bb3f0c	b.ls 0x00bb4034
00bb3f10	cbz w23,0x00bb3fe0
00bb3f14	cmp w23,#0x7
00bb3f18	b.hi 0x00bb3f24
00bb3f1c	mov x10,xzr
00bb3f20	b 0x00bb3fb8
00bb3f24	cmp w23,#0x20
00bb3f28	b.cs 0x00bb3f34
00bb3f2c	mov x10,xzr
00bb3f30	b 0x00bb3f7c
00bb3f34	dup v0.16B,w9
00bb3f38	and x10,x23,#0xffffffe0
00bb3f3c	mov x12,x21
00bb3f40	mov x11,x10
00bb3f44	ldp q1,q2,[x12]
00bb3f48	subs x11,x11,#0x20
00bb3f4c	cmeq v3.16B,v1.16B,#0
00bb3f50	cmeq v4.16B,v2.16B,#0
00bb3f54	bic v3.16B,v0.16B,v3.16B
00bb3f58	bic v4.16B,v0.16B,v4.16B
00bb3f5c	add v1.16B,v3.16B,v1.16B
00bb3f60	add v2.16B,v4.16B,v2.16B
00bb3f64	stp q1,q2,[x12], #0x20
00bb3f68	b.ne 0x00bb3f44
00bb3f6c	cmp x10,x23
00bb3f70	b.eq 0x00bb3fe0
00bb3f74	tst x23,#0x18
00bb3f78	b.eq 0x00bb3fb8
00bb3f7c	dup v0.8B,w9
00bb3f80	mov x12,x10
00bb3f84	and x10,x23,#0xfffffff8
00bb3f88	add x11,x12,x19
00bb3f8c	sub x12,x12,x10
00bb3f90	add x11,x11,#0x4d4
00bb3f94	ldr d1,[x11]
00bb3f98	adds x12,x12,#0x8
00bb3f9c	cmeq v2.8B,v1.8B,#0
00bb3fa0	bic v2.8B,v0.8B,v2.8B
00bb3fa4	add v1.8B,v2.8B,v1.8B
00bb3fa8	str d1,[x11], #0x8
00bb3fac	b.ne 0x00bb3f94
00bb3fb0	cmp x10,x23
00bb3fb4	b.eq 0x00bb3fe0
00bb3fb8	add x11,x10,x19
00bb3fbc	sub x10,x23,x10
00bb3fc0	add x11,x11,#0x4d4
00bb3fc4	ldrb w12,[x11]
00bb3fc8	cmp w12,#0x0
00bb3fcc	csel w13,wzr,w9,eq
00bb3fd0	subs x10,x10,#0x1
00bb3fd4	add w12,w13,w12
00bb3fd8	strb w12,[x11], #0x1
00bb3fdc	b.ne 0x00bb3fc4
00bb3fe0	mov x26,x0
00bb3fe4	cbz w8,0x00bb400c
00bb3fe8	mov x11,xzr
00bb3fec	add x10,x19,w24, UXTW  #0x2
00bb3ff0	mov w12,w24
00bb3ff4	sub x11,x11,w9, UXTW  #0x2
00bb3ff8	ldr w13,[x10, x11#0x0]
00bb3ffc	sub w12,w12,#0x1
00bb4000	cmp w9,w12
00bb4004	str w13,[x10], #-0x4
00bb4008	b.cc 0x00bb3ff8
00bb400c	mvn w8,w8
00bb4010	lsl w9,w9,#0x2
00bb4014	mov w1,wzr
00bb4018	add w8,w24,w8
00bb401c	ubfiz x8,x8,#0x2,#0x20
00bb4020	sub x10,x19,x8
00bb4024	add x2,x8,#0x4
00bb4028	add x0,x10,x9
00bb402c	bl 0x00c301c0
00bb4030	mov x0,x26
00bb4034	lsr w12,w25,#0x18
00bb4038	add x9,x22,#0x4
00bb403c	mov w8,wzr
00bb4040	stur x9,[x29, #-0x38]
00bb4044	sub w9,w23,#0x3
00bb4048	add w10,w24,#0x1
00bb404c	mov x11,x19
00bb4050	strb w25,[x22]
00bb4054	strb wzr,[x22, #0x1]
00bb4058	strb w24,[x22, #0x2]
00bb405c	strb w12,[x22, #0x3]
00bb4060	ldr w12,[x11]
00bb4064	subs x10,x10,#0x1
00bb4068	str w8,[x11, #0x34]
00bb406c	add x11,x11,#0x4
00bb4070	add w12,w12,w8
00bb4074	mov w8,w12
00bb4078	b.ne 0x00bb4060
00bb407c	cmp w23,#0x4
00bb4080	b.lt 0x00bb4108
00bb4084	mov x10,xzr
00bb4088	add x8,x19,#0x3d4
00bb408c	add x11,x19,#0x34
00bb4090	add x12,x19,x10
00bb4094	ldrb w13,[x12, #0x4d4]
00bb4098	ldr w14,[x11, x13, LSL #0x2]
00bb409c	add w15,w14,#0x1
00bb40a0	str w15,[x11, x13, LSL #0x2]
00bb40a4	strb w10,[x8, x14]
00bb40a8	ldrb w13,[x12, #0x4d5]
00bb40ac	ldr w14,[x11, x13, LSL #0x2]
00bb40b0	add w15,w14,#0x1
00bb40b4	str w15,[x11, x13, LSL #0x2]
00bb40b8	add w13,w10,#0x1
00bb40bc	strb w13,[x8, x14]
00bb40c0	ldrb w13,[x12, #0x4d6]
00bb40c4	ldr w14,[x11, x13, LSL #0x2]
00bb40c8	add w15,w14,#0x1
00bb40cc	str w15,[x11, x13, LSL #0x2]
00bb40d0	add w13,w10,#0x2
00bb40d4	strb w13,[x8, x14]
00bb40d8	add w14,w10,#0x3
00bb40dc	add x10,x10,#0x4
00bb40e0	ldrb w12,[x12, #0x4d7]
00bb40e4	cmp x10,x9
00bb40e8	ldr w13,[x11, x12, LSL #0x2]
00bb40ec	add w15,w13,#0x1
00bb40f0	str w15,[x11, x12, LSL #0x2]
00bb40f4	strb w14,[x8, x13]
00bb40f8	b.cc 0x00bb4090
00bb40fc	cmp w10,w23
00bb4100	b.lt 0x00bb4114
00bb4104	b 0x00bb4140
00bb4108	mov w10,wzr
00bb410c	cmp w10,w23
00bb4110	b.ge 0x00bb4140
00bb4114	add x8,x19,#0x3d4
00bb4118	add x9,x19,#0x34
00bb411c	mov w10,w10
00bb4120	ldrb w11,[x21, x10]
00bb4124	ldr w12,[x9, x11, LSL #0x2]
00bb4128	add w13,w12,#0x1
00bb412c	str w13,[x9, x11, LSL #0x2]
00bb4130	strb w10,[x8, x12]
00bb4134	add x10,x10,#0x1
00bb4138	cmp x23,x10
00bb413c	b.ne 0x00bb4120
00bb4140	add w2,w24,#0x1
00bb4144	cmp w2,#0x2
00bb4148	b.cc 0x00bb4b38
00bb414c	movi v0.2D,#0xff
00bb4150	add x9,x22,#0xc
00bb4154	add x8,x22,#0x44
00bb4158	stp x9,x8,[x29, #-0x20]
00bb415c	add x8,x22,#0x7
00bb4160	ldr w11,[x19]
00bb4164	stur x8,[x29, #-0x28]
00bb4168	add x8,x22,#0x24
00bb416c	mov w10,wzr
00bb4170	str x0,[sp, #0x28]
00bb4174	add x12,x19,#0x3d4
00bb4178	add x0,x22,#0x4
00bb417c	str x8,[sp, #0x18]
00bb4180	add x8,x22,#0x5
00bb4184	mov w15,#0x1
00bb4188	orr x3,xzr,#0x1000100010001
00bb418c	mov w4,#0x1
00bb4190	stur x8,[x29, #-0x30]
00bb4194	stp x20,x0,[sp, #0x38]
00bb4198	str x22,[sp, #0x30]
00bb419c	str x2,[sp, #0x20]
00bb41a0	b 0x00bb41bc
00bb41a4	mul w8,w5,w6
00bb41a8	add x4,x4,#0x1
00bb41ac	add w11,w5,w11
00bb41b0	cmp x4,x2
00bb41b4	add w10,w8,w10
00bb41b8	b.eq 0x00bb4b34
00bb41bc	lsl w8,w15,w4
00bb41c0	ldr w5,[x19, x4, LSL #0x2]
00bb41c4	sub w7,w2,w4
00bb41c8	asr w6,w8,#0x1
00bb41cc	cmp w6,#0x3
00bb41d0	b.gt 0x00bb4264
00bb41d4	cmp w6,#0x1
00bb41d8	b.eq 0x00bb43dc
00bb41dc	cmp w6,#0x2
00bb41e0	b.ne 0x00bb42f0
00bb41e4	cmp w5,#0x1
00bb41e8	b.lt 0x00bb41a4
00bb41ec	mov w8,w11
00bb41f0	mov w9,w10
00bb41f4	cmp w5,#0x7
00bb41f8	sxtw x21,w8
00bb41fc	sxtw x24,w9
00bb4200	b.ls 0x00bb422c
00bb4204	lsl x8,x24,#0x1
00bb4208	add x14,x12,x21
00bb420c	add x13,x14,x5
00bb4210	add x9,x0,x8
00bb4214	cmp x9,x13
00bb4218	b.cs 0x00bb44b0
00bb421c	add x9,x0,x5, LSL #0x2
00bb4220	add x8,x9,x8
00bb4224	cmp x14,x8
00bb4228	b.cs 0x00bb44b0
00bb422c	mov x23,xzr
00bb4230	ldur x8,[x29, #-0x28]
00bb4234	add x9,x23,x21
00bb4238	sub x14,x5,x23
00bb423c	add x16,x12,x9
00bb4240	add x8,x8,x24, LSL #0x1
00bb4244	ldrb w9,[x16], #0x1
00bb4248	subs x14,x14,#0x1
00bb424c	sturb w7,[x8, #-0x3]
00bb4250	sturb w7,[x8, #-0x1]
00bb4254	sturb w9,[x8, #-0x2]
00bb4258	strb w9,[x8], #0x4
00bb425c	b.ne 0x00bb4244
00bb4260	b 0x00bb41a4
00bb4264	cmp w6,#0x4
00bb4268	b.eq 0x00bb4450
00bb426c	cmp w6,#0x8
00bb4270	b.ne 0x00bb42f0
00bb4274	cmp w5,#0x1
00bb4278	b.lt 0x00bb41a4
00bb427c	sxtw x21,w11
00bb4280	sxtw x24,w10
00bb4284	cmp w5,#0x3
00bb4288	and w7,w7,#0xff
00bb428c	b.ls 0x00bb42b8
00bb4290	lsl x8,x24,#0x1
00bb4294	add x14,x12,x21
00bb4298	add x17,x14,x5
00bb429c	add x16,x0,x8
00bb42a0	cmp x16,x17
00bb42a4	b.cs 0x00bb44c0
00bb42a8	add x16,x0,x5, LSL #0x4
00bb42ac	add x8,x16,x8
00bb42b0	cmp x14,x8
00bb42b4	b.cs 0x00bb44c0
00bb42b8	mov x9,xzr
00bb42bc	ldur x8,[x29, #-0x20]
00bb42c0	add x14,x12,x9
00bb42c4	sub x16,x5,x9
00bb42c8	add x14,x14,x21
00bb42cc	add x8,x8,x24, LSL #0x1
00bb42d0	ldrb w9,[x14], #0x1
00bb42d4	subs x16,x16,#0x1
00bb42d8	orr x9,x7,x9, LSL #0x8
00bb42dc	mul x9,x9,x3
00bb42e0	stp x9,x9,[x8, #-0x8]
00bb42e4	add x8,x8,#0x10
00bb42e8	b.ne 0x00bb42d0
00bb42ec	b 0x00bb41a4
00bb42f0	cmp w5,#0x1
00bb42f4	b.lt 0x00bb41a4
00bb42f8	sxtw x23,w6
00bb42fc	mov w9,w11
00bb4300	sbfiz x28,x6,#0x1,#0x20
00bb4304	sxtw x26,w9
00bb4308	ldur x9,[x29, #-0x18]
00bb430c	mov x21,xzr
00bb4310	sub x8,x23,#0x1
00bb4314	and w7,w7,#0xff
00bb4318	lsr x8,x8,#0x4
00bb431c	add x24,x8,#0x1
00bb4320	mov w8,w10
00bb4324	and x25,x24,#0x1ffffffffffffffc
00bb4328	sbfiz x8,x8,#0x1,#0x20
00bb432c	lsl x27,x25,#0x4
00bb4330	add x30,x9,x8
00bb4334	add x1,x22,x8
00bb4338	b 0x00bb4350
00bb433c	add x21,x21,#0x1
00bb4340	add x30,x30,x28
00bb4344	add x1,x1,x28
00bb4348	cmp x21,x5
00bb434c	b.eq 0x00bb41a4
00bb4350	cmp w6,#0x1
00bb4354	b.lt 0x00bb433c
00bb4358	add x8,x21,x26
00bb435c	cmp w6,#0x31
00bb4360	ldrb w8,[x12, x8]
00bb4364	orr x8,x7,x8, LSL #0x8
00bb4368	mul x8,x8,x3
00bb436c	b.cs 0x00bb4378
00bb4370	mov x14,xzr
00bb4374	b 0x00bb43ac
00bb4378	dup v1.2D,x8
00bb437c	mov x14,x25
00bb4380	mov x16,x30
00bb4384	stp q1,q1,[x16, #-0x40]
00bb4388	subs x14,x14,#0x4
00bb438c	stp q1,q1,[x16, #-0x20]
00bb4390	stp q1,q1,[x16]
00bb4394	stp q1,q1,[x16, #0x20]
00bb4398	add x16,x16,#0x80
00bb439c	b.ne 0x00bb4384
00bb43a0	cmp x24,x25
00bb43a4	mov x14,x27
00bb43a8	b.eq 0x00bb433c
00bb43ac	lsl x16,x14,#0x1
00bb43b0	mov x17,x1
00bb43b4	add x14,x14,#0x10
00bb43b8	add x9,x17,x16
00bb43bc	add x17,x17,#0x20
00bb43c0	cmp x14,x23
00bb43c4	stur x8,[x9, #0x4]
00bb43c8	stur x8,[x9, #0xc]
00bb43cc	stur x8,[x9, #0x14]
00bb43d0	stur x8,[x9, #0x1c]
00bb43d4	b.lt 0x00bb43b4
00bb43d8	b 0x00bb433c
00bb43dc	cmp w5,#0x1
00bb43e0	b.lt 0x00bb41a4
00bb43e4	mov w8,w11
00bb43e8	mov w9,w10
00bb43ec	cmp w5,#0x7
00bb43f0	sxtw x21,w8
00bb43f4	sxtw x17,w9
00bb43f8	b.ls 0x00bb4420
00bb43fc	add x9,x0,x17, LSL #0x1
00bb4400	add x8,x12,x21
00bb4404	add x13,x8,x5
00bb4408	cmp x9,x13
00bb440c	b.cs 0x00bb44d4
00bb4410	add x9,x17,x5
00bb4414	add x9,x0,x9, LSL #0x1
00bb4418	cmp x8,x9
00bb441c	b.cs 0x00bb44d4
00bb4420	mov x23,xzr
00bb4424	ldur x8,[x29, #-0x30]
00bb4428	add x9,x23,x21
00bb442c	sub x16,x5,x23
00bb4430	add x14,x12,x9
00bb4434	add x8,x8,x17, LSL #0x1
00bb4438	ldrb w9,[x14], #0x1
00bb443c	subs x16,x16,#0x1
00bb4440	sturb w7,[x8, #-0x1]
00bb4444	strb w9,[x8], #0x2
00bb4448	b.ne 0x00bb4438
00bb444c	b 0x00bb41a4
00bb4450	cmp w5,#0x1
00bb4454	b.lt 0x00bb41a4
00bb4458	mov w8,w11
00bb445c	mov w13,w10
00bb4460	cmp w5,#0x3
00bb4464	sxtw x1,w8
00bb4468	sxtw x24,w13
00bb446c	and w7,w7,#0xff
00bb4470	b.hi 0x00bb447c
00bb4474	mov x23,xzr
00bb4478	b 0x00bb4b08
00bb447c	lsl x8,x24,#0x1
00bb4480	add x14,x12,x1
00bb4484	add x15,x14,x5
00bb4488	add x13,x0,x8
00bb448c	cmp x13,x15
00bb4490	b.cs 0x00bb44e4
00bb4494	add x13,x0,x5, LSL #0x3
00bb4498	add x8,x13,x8
00bb449c	cmp x14,x8
00bb44a0	b.cs 0x00bb44e4
00bb44a4	mov x23,xzr
00bb44a8	mov w15,#0x1
00bb44ac	b 0x00bb4b08
00bb44b0	cmp w5,#0x20
00bb44b4	b.cs 0x00bb44f8
00bb44b8	mov x23,xzr
00bb44bc	b 0x00bb4550
00bb44c0	dup v1.2D,x7
00bb44c4	cmp w5,#0x10
00bb44c8	b.cs 0x00bb45a0
00bb44cc	mov x9,xzr
00bb44d0	b 0x00bb47a0
00bb44d4	cmp w5,#0x20
00bb44d8	b.cs 0x00bb4854
00bb44dc	mov x23,xzr
00bb44e0	b 0x00bb489c
00bb44e4	dup v1.2D,x7
00bb44e8	cmp w5,#0x10
00bb44ec	b.cs 0x00bb48e0
00bb44f0	mov x23,xzr
00bb44f4	b 0x00bb4a50
00bb44f8	ldur x8,[x29, #-0x18]
00bb44fc	dup v1.16B,w7
00bb4500	and x23,x5,#0x7fffffe0
00bb4504	add x14,x12,x21
00bb4508	mov x16,x23
00bb450c	add x8,x8,x24, LSL #0x1
00bb4510	ldp q17,q2,[x14], #0x20
00bb4514	mov v3.16B,v1.16B
00bb4518	sub x9,x8,#0x40
00bb451c	subs x16,x16,#0x20
00bb4520	mov v4.16B,v2.16B
00bb4524	mov v16.16B,v1.16B
00bb4528	mov v18.16B,v1.16B
00bb452c	mov v19.16B,v17.16B
00bb4530	st4 {v1.16B,v2.16B,v3.16B,v4.16B},[x8]
00bb4534	add x8,x8,#0x80
00bb4538	st4 {v16.16B,v17.16B,v18.16B,v19.16B},[x9]
00bb453c	b.ne 0x00bb4510
00bb4540	cmp x23,x5
00bb4544	b.eq 0x00bb41a4
00bb4548	tst x5,#0x18
00bb454c	b.eq 0x00bb4aec
00bb4550	fmov s1,w7
00bb4554	lsl x8,x23,#0x2
00bb4558	mov x9,x23
00bb455c	and x23,x5,#0x7ffffff8
00bb4560	add x13,x9,x21
00bb4564	add x8,x8,x24, LSL #0x1
00bb4568	add x24,x24,x23, LSL #0x1
00bb456c	add x14,x12,x13
00bb4570	dup v1.8B,v1.B[0x0]
00bb4574	sub x16,x9,x23
00bb4578	add x8,x0,x8
00bb457c	ldr d2,[x14], #0x8
00bb4580	adds x16,x16,#0x8
00bb4584	fmov d3,d1
00bb4588	fmov d4,d2
00bb458c	st4 {v1.8B,v2.8B,v3.8B,v4.8B},[x8], #0x20
00bb4590	b.ne 0x00bb457c
00bb4594	cmp x23,x5
00bb4598	b.eq 0x00bb41a4
00bb459c	b 0x00bb4230
00bb45a0	ldur x8,[x29, #-0x38]
00bb45a4	and x27,x5,#0x7ffffff0
00bb45a8	add x26,x12,x21
00bb45ac	mov x9,x27
00bb45b0	str x21,[sp, #0x10]
00bb45b4	add x25,x8,x24, LSL #0x1
00bb45b8	ldr q3,[x26], #0x10
00bb45bc	subs x27,x27,#0x10
00bb45c0	uxtl v2.8H,v3.8B
00bb45c4	uxtl2 v4.4S,v2.8H
00bb45c8	uxtl v5.4S,v2.4H
00bb45cc	ushll2 v6.2D,v4.4S,0x8
00bb45d0	ushll v7.2D,v4.2S,0x8
00bb45d4	uxtl2 v4.8H,v3.16B
00bb45d8	orr v2.16B,v6.16B,v1.16B
00bb45dc	ushll2 v6.2D,v5.4S,0x8
00bb45e0	ushll v5.2D,v5.2S,0x8
00bb45e4	orr v3.16B,v7.16B,v1.16B
00bb45e8	uxtl2 v7.4S,v4.8H
00bb45ec	uxtl v4.4S,v4.4H
00bb45f0	orr v6.16B,v6.16B,v1.16B
00bb45f4	orr v17.16B,v5.16B,v1.16B
00bb45f8	fmov x28,d2
00bb45fc	fmov x14,d3
00bb4600	mov x0,v3.D[0x1]
00bb4604	ushll2 v16.2D,v7.4S,0x8
00bb4608	mov x23,v2.D[0x1]
00bb460c	ushll v7.2D,v7.2S,0x8
00bb4610	fmov x16,d6
00bb4614	mov x13,v17.D[0x1]
00bb4618	mov x20,v6.D[0x1]
00bb461c	mul x8,x14,x3
00bb4620	orr v5.16B,v16.16B,v1.16B
00bb4624	ushll2 v16.2D,v4.4S,0x8
00bb4628	ushll v4.2D,v4.2S,0x8
00bb462c	orr v7.16B,v7.16B,v1.16B
00bb4630	mul x1,x16,x3
00bb4634	orr v16.16B,v16.16B,v1.16B
00bb4638	mov x30,v5.D[0x1]
00bb463c	mul x15,x16,x3
00bb4640	fmov x16,d17
00bb4644	orr v4.16B,v4.16B,v1.16B
00bb4648	mul x13,x13,x3
00bb464c	mov x21,v16.D[0x1]
00bb4650	fmov d2,x1
00bb4654	mul x2,x16,x3
00bb4658	mul x22,x16,x3
00bb465c	mov x16,v7.D[0x1]
00bb4660	mul x20,x20,x3
00bb4664	fmov d17,x2
00bb4668	mov x2,v4.D[0x1]
00bb466c	mul x14,x14,x3
00bb4670	mov v17.D[0x1],x13
00bb4674	mul x17,x28,x3
00bb4678	fmov d18,x22
00bb467c	mov v2.D[0x1],x20
00bb4680	fmov d3,x15
00bb4684	mul x1,x23,x3
00bb4688	mov v18.D[0x1],x13
00bb468c	mul x13,x0,x3
00bb4690	mov x0,x25
00bb4694	mov v3.D[0x1],x20
00bb4698	mul x15,x2,x3
00bb469c	st2 {v17.2D,v18.2D},[x0], #0x20
00bb46a0	fmov d17,x8
00bb46a4	mul x8,x28,x3
00bb46a8	mov v17.D[0x1],x13
00bb46ac	mul x21,x21,x3
00bb46b0	fmov d18,x14
00bb46b4	fmov x14,d4
00bb46b8	st2 {v2.2D,v3.2D},[x0]
00bb46bc	fmov d2,x17
00bb46c0	fmov x17,d16
00bb46c4	mul x16,x16,x3
00bb46c8	mov v18.D[0x1],x13
00bb46cc	mul x13,x14,x3
00bb46d0	mov v2.D[0x1],x1
00bb46d4	fmov d3,x8
00bb46d8	mul x14,x14,x3
00bb46dc	add x8,x25,#0x40
00bb46e0	st2 {v17.2D,v18.2D},[x8]
00bb46e4	mul x8,x17,x3
00bb46e8	fmov d16,x13
00bb46ec	mov v3.D[0x1],x1
00bb46f0	mul x13,x17,x3
00bb46f4	fmov x17,d7
00bb46f8	mov v16.D[0x1],x15
00bb46fc	mul x30,x30,x3
00bb4700	fmov d17,x14
00bb4704	add x14,x25,#0x60
00bb4708	st2 {v2.2D,v3.2D},[x14]
00bb470c	fmov d2,x8
00bb4710	mul x14,x17,x3
00bb4714	mov v17.D[0x1],x15
00bb4718	fmov x15,d5
00bb471c	mul x8,x17,x3
00bb4720	mov v2.D[0x1],x21
00bb4724	fmov d3,x13
00bb4728	add x13,x25,#0x80
00bb472c	fmov d4,x14
00bb4730	mul x14,x15,x3
00bb4734	st2 {v16.2D,v17.2D},[x13]
00bb4738	mul x13,x15,x3
00bb473c	mov v3.D[0x1],x21
00bb4740	mov v4.D[0x1],x16
00bb4744	fmov d5,x8
00bb4748	add x8,x25,#0xa0
00bb474c	st2 {v2.2D,v3.2D},[x8]
00bb4750	add x8,x25,#0xc0
00bb4754	fmov d2,x13
00bb4758	mov v5.D[0x1],x16
00bb475c	mov v2.D[0x1],x30
00bb4760	fmov d3,x14
00bb4764	st2 {v4.2D,v5.2D},[x8]
00bb4768	add x8,x25,#0xe0
00bb476c	add x25,x25,#0x100
00bb4770	mov v3.D[0x1],x30
00bb4774	st2 {v2.2D,v3.2D},[x8]
00bb4778	b.ne 0x00bb45b8
00bb477c	ldp x22,x20,[sp, #0x30]
00bb4780	cmp x9,x5
00bb4784	ldr x2,[sp, #0x20]
00bb4788	ldr x0,[sp, #0x40]
00bb478c	mov w15,#0x1
00bb4790	ldr x21,[sp, #0x10]
00bb4794	b.eq 0x00bb41a4
00bb4798	tst x5,#0xc
00bb479c	b.eq 0x00bb4af4
00bb47a0	mov x13,x9
00bb47a4	and x9,x5,#0x7ffffffc
00bb47a8	lsl x8,x13,#0x4
00bb47ac	add x14,x12,x13
00bb47b0	sub x25,x13,x9
00bb47b4	add x17,x14,x21
00bb47b8	add x8,x8,x24, LSL #0x1
00bb47bc	add x24,x24,x9, LSL #0x3
00bb47c0	add x8,x0,x8
00bb47c4	ldr s2,[x17], #0x4
00bb47c8	adds x25,x25,#0x4
00bb47cc	uxtl v2.8H,v2.8B
00bb47d0	uxtl v2.4S,v2.4H
00bb47d4	ushll2 v3.2D,v2.4S,0x8
00bb47d8	ushll v2.2D,v2.2S,0x8
00bb47dc	orr v2.16B,v2.16B,v1.16B
00bb47e0	orr v3.16B,v3.16B,v1.16B
00bb47e4	fmov x16,d2
00bb47e8	fmov x13,d3
00bb47ec	mov x14,v2.D[0x1]
00bb47f0	mov x1,v3.D[0x1]
00bb47f4	mul x0,x16,x3
00bb47f8	mul x15,x13,x3
00bb47fc	mul x14,x14,x3
00bb4800	fmov d3,x0
00bb4804	mul x16,x16,x3
00bb4808	fmov d5,x15
00bb480c	mul x1,x1,x3
00bb4810	mov v3.D[0x1],x14
00bb4814	mul x13,x13,x3
00bb4818	fmov d2,x16
00bb481c	mov v5.D[0x1],x1
00bb4820	mov v2.D[0x1],x14
00bb4824	add x14,x8,#0x40
00bb4828	fmov d4,x13
00bb482c	mov v4.D[0x1],x1
00bb4830	st2 {v2.2D,v3.2D},[x8], #0x20
00bb4834	st2 {v4.2D,v5.2D},[x8]
00bb4838	mov x8,x14
00bb483c	b.ne 0x00bb47c4
00bb4840	ldr x0,[sp, #0x40]
00bb4844	cmp x9,x5
00bb4848	mov w15,#0x1
00bb484c	b.eq 0x00bb41a4
00bb4850	b 0x00bb42bc
00bb4854	ldr x8,[sp, #0x18]
00bb4858	dup v1.16B,w7
00bb485c	and x23,x5,#0x7fffffe0
00bb4860	add x14,x12,x21
00bb4864	mov x16,x23
00bb4868	add x8,x8,x17, LSL #0x1
00bb486c	ldp q4,q2,[x14], #0x20
00bb4870	mov v3.16B,v1.16B
00bb4874	sub x9,x8,#0x20
00bb4878	subs x16,x16,#0x20
00bb487c	st2 {v1.16B,v2.16B},[x8]
00bb4880	add x8,x8,#0x40
00bb4884	st2 {v3.16B,v4.16B},[x9]
00bb4888	b.ne 0x00bb486c
00bb488c	cmp x23,x5
00bb4890	b.eq 0x00bb41a4
00bb4894	tst x5,#0x18
00bb4898	b.eq 0x00bb4afc
00bb489c	lsl x8,x23,#0x1
00bb48a0	dup v1.8B,w7
00bb48a4	mov x9,x23
00bb48a8	and x23,x5,#0x7ffffff8
00bb48ac	add x13,x9,x21
00bb48b0	add x8,x8,x17, LSL #0x1
00bb48b4	add x17,x23,x17
00bb48b8	add x14,x12,x13
00bb48bc	sub x16,x9,x23
00bb48c0	add x8,x0,x8
00bb48c4	ldr d2,[x14], #0x8
00bb48c8	adds x16,x16,#0x8
00bb48cc	st2 {v1.8B,v2.8B},[x8], #0x10
00bb48d0	b.ne 0x00bb48c4
00bb48d4	cmp x23,x5
00bb48d8	b.eq 0x00bb41a4
00bb48dc	b 0x00bb4424
00bb48e0	ldur x8,[x29, #-0x38]
00bb48e4	and x23,x5,#0x7ffffff0
00bb48e8	add x26,x12,x1
00bb48ec	mov x27,x23
00bb48f0	str x1,[sp, #0x10]
00bb48f4	add x25,x8,x24, LSL #0x1
00bb48f8	ldr q2,[x26], #0x10
00bb48fc	subs x27,x27,#0x10
00bb4900	uxtl v3.8H,v2.8B
00bb4904	uxtl2 v2.8H,v2.16B
00bb4908	uxtl v4.4S,v3.4H
00bb490c	uxtl2 v5.4S,v2.8H
00bb4910	uxtl2 v7.4S,v3.8H
00bb4914	uxtl v16.4S,v2.4H
00bb4918	ushll v6.2D,v4.2S,0x8
00bb491c	ushll2 v3.2D,v5.4S,0x8
00bb4920	ushll2 v4.2D,v4.4S,0x8
00bb4924	orr v2.16B,v6.16B,v1.16B
00bb4928	ushll v6.2D,v7.2S,0x8
00bb492c	orr v17.16B,v3.16B,v1.16B
00bb4930	ushll v3.2D,v16.2S,0x8
00bb4934	fmov x8,d2
00bb4938	orr v6.16B,v6.16B,v1.16B
00bb493c	mov x9,v2.D[0x1]
00bb4940	orr v18.16B,v3.16B,v1.16B
00bb4944	orr v3.16B,v4.16B,v1.16B
00bb4948	ushll v4.2D,v5.2S,0x8
00bb494c	ushll2 v5.2D,v7.4S,0x8
00bb4950	mov x13,v17.D[0x1]
00bb4954	mul x17,x8,x3
00bb4958	fmov x8,d17
00bb495c	mov x16,v6.D[0x1]
00bb4960	fmov x14,d18
00bb4964	mov x0,v18.D[0x1]
00bb4968	orr v4.16B,v4.16B,v1.16B
00bb496c	orr v5.16B,v5.16B,v1.16B
00bb4970	mov x15,v3.D[0x1]
00bb4974	mul x28,x8,x3
00bb4978	fmov x8,d6
00bb497c	ushll2 v6.2D,v16.4S,0x8
00bb4980	fmov x21,d4
00bb4984	mov x1,v4.D[0x1]
00bb4988	mul x14,x14,x3
00bb498c	fmov x30,d5
00bb4990	mov x2,v5.D[0x1]
00bb4994	orr v6.16B,v6.16B,v1.16B
00bb4998	mul x0,x0,x3
00bb499c	fmov d7,x28
00bb49a0	fmov x22,d6
00bb49a4	mov x20,v6.D[0x1]
00bb49a8	mul x8,x8,x3
00bb49ac	mul x30,x30,x3
00bb49b0	mul x22,x22,x3
00bb49b4	fmov d5,x8
00bb49b8	mul x20,x20,x3
00bb49bc	fmov d4,x30
00bb49c0	mul x21,x21,x3
00bb49c4	fmov d2,x22
00bb49c8	fmov x22,d3
00bb49cc	fmov d3,x14
00bb49d0	mul x13,x13,x3
00bb49d4	mul x14,x22,x3
00bb49d8	mov v2.D[0x1],x20
00bb49dc	mov v3.D[0x1],x0
00bb49e0	fmov d6,x21
00bb49e4	mul x15,x15,x3
00bb49e8	mov v7.D[0x1],x13
00bb49ec	mul x16,x16,x3
00bb49f0	stp q3,q2,[x25, #0x40]
00bb49f4	fmov d3,x17
00bb49f8	fmov d2,x14
00bb49fc	mul x1,x1,x3
00bb4a00	mul x2,x2,x3
00bb4a04	mov v2.D[0x1],x15
00bb4a08	mov v5.D[0x1],x16
00bb4a0c	mul x8,x9,x3
00bb4a10	mov v6.D[0x1],x1
00bb4a14	mov v4.D[0x1],x2
00bb4a18	mov v3.D[0x1],x8
00bb4a1c	stp q6,q7,[x25, #0x60]
00bb4a20	stp q5,q4,[x25, #0x20]
00bb4a24	stp q3,q2,[x25], #0x80
00bb4a28	b.ne 0x00bb48f8
00bb4a2c	ldp x22,x20,[sp, #0x30]
00bb4a30	cmp x23,x5
00bb4a34	ldr x2,[sp, #0x20]
00bb4a38	ldr x0,[sp, #0x40]
00bb4a3c	mov w15,#0x1
00bb4a40	ldr x1,[sp, #0x10]
00bb4a44	b.eq 0x00bb41a4
00bb4a48	tst x5,#0xc
00bb4a4c	b.eq 0x00bb4b04
00bb4a50	mov x9,x23
00bb4a54	and x23,x5,#0x7ffffffc
00bb4a58	lsl x8,x9,#0x3
00bb4a5c	add x13,x12,x9
00bb4a60	sub x16,x9,x23
00bb4a64	add x14,x13,x1
00bb4a68	add x8,x8,x24, LSL #0x1
00bb4a6c	add x24,x24,x23, LSL #0x2
00bb4a70	add x8,x0,x8
00bb4a74	ldr s2,[x14], #0x4
00bb4a78	adds x16,x16,#0x4
00bb4a7c	uxtl v2.8H,v2.8B
00bb4a80	uxtl v2.4S,v2.4H
00bb4a84	uxtl v3.2D,v2.2S
00bb4a88	uxtl2 v2.2D,v2.4S
00bb4a8c	and v3.16B,v3.16B,v0.16B
00bb4a90	and v2.16B,v2.16B,v0.16B
00bb4a94	shl v3.2D,v3.2D,0x8
00bb4a98	shl v2.2D,v2.2D,0x8
00bb4a9c	orr v3.16B,v3.16B,v1.16B
00bb4aa0	orr v2.16B,v2.16B,v1.16B
00bb4aa4	fmov x9,d3
00bb4aa8	fmov x15,d2
00bb4aac	mov x13,v2.D[0x1]
00bb4ab0	mov x17,v3.D[0x1]
00bb4ab4	mul x9,x9,x3
00bb4ab8	mul x15,x15,x3
00bb4abc	mul x13,x13,x3
00bb4ac0	fmov d3,x9
00bb4ac4	mul x17,x17,x3
00bb4ac8	fmov d2,x15
00bb4acc	mov v2.D[0x1],x13
00bb4ad0	mov v3.D[0x1],x17
00bb4ad4	stp q3,q2,[x8], #0x20
00bb4ad8	b.ne 0x00bb4a74
00bb4adc	cmp x23,x5
00bb4ae0	mov w15,#0x1
00bb4ae4	b.eq 0x00bb41a4
00bb4ae8	b 0x00bb4b08
00bb4aec	add x24,x24,x23, LSL #0x1
00bb4af0	b 0x00bb4230
00bb4af4	add x24,x24,x9, LSL #0x3
00bb4af8	b 0x00bb42bc
00bb4afc	add x17,x23,x17
00bb4b00	b 0x00bb4424
00bb4b04	add x24,x24,x23, LSL #0x2
00bb4b08	add x8,x0,x24, LSL #0x1
00bb4b0c	add x13,x12,x23
00bb4b10	sub x16,x5,x23
00bb4b14	add x14,x13,x1
00bb4b18	ldrb w9,[x14], #0x1
00bb4b1c	subs x16,x16,#0x1
00bb4b20	orr x9,x7,x9, LSL #0x8
00bb4b24	mul x9,x9,x3
00bb4b28	str x9,[x8], #0x8
00bb4b2c	b.ne 0x00bb4b18
00bb4b30	b 0x00bb41a4
00bb4b34	ldr x0,[sp, #0x28]
00bb4b38	ldr x8,[x20, #0x28]
00bb4b3c	ldur x9,[x29, #-0x8]
00bb4b40	cmp x8,x9
00bb4b44	b.ne 0x00bb4b68
00bb4b48	ldp x20,x19,[sp, #0xd0]
00bb4b4c	ldp x22,x21,[sp, #0xc0]
00bb4b50	ldp x24,x23,[sp, #0xb0]
00bb4b54	ldp x26,x25,[sp, #0xa0]
00bb4b58	ldp x28,x27,[sp, #0x90]
00bb4b5c	ldp x29,x30,[sp, #0x80]
00bb4b60	add sp,sp,#0xe0
00bb4b64	ret
00bb4b68	bl 0x00c2fec0
