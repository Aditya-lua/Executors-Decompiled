; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::replace @ 00bc4078
00bc4078	paciasp
00bc407c	sub sp,sp,#0x70
00bc4080	stp x29,x30,[sp, #0x10]
00bc4084	stp x28,x27,[sp, #0x20]
00bc4088	stp x26,x25,[sp, #0x30]
00bc408c	stp x24,x23,[sp, #0x40]
00bc4090	stp x22,x21,[sp, #0x50]
00bc4094	stp x20,x19,[sp, #0x60]
00bc4098	add x29,sp,#0x10
00bc409c	ldrb w9,[x0]
00bc40a0	ldr x8,[x0, #0x8]
00bc40a4	lsr x10,x9,#0x1
00bc40a8	tst w9,#0x1
00bc40ac	csel x26,x10,x8,eq
00bc40b0	subs x8,x26,x1
00bc40b4	b.cc 0x00bc426c
00bc40b8	ldr x10,[x0]
00bc40bc	cmp x8,x2
00bc40c0	mov x20,x3
00bc40c4	csel x27,x8,x2,cc
00bc40c8	tst w9,#0x1
00bc40cc	mov w9,#0x16
00bc40d0	and x11,x10,#-0x2
00bc40d4	mov x22,x1
00bc40d8	mov x19,x0
00bc40dc	sub x11,x11,#0x1
00bc40e0	csel x21,x9,x11,eq
00bc40e4	sub x9,x27,x26
00bc40e8	add x9,x9,x21
00bc40ec	cmp x9,x3
00bc40f0	and w9,w10,#0xff
00bc40f4	b.cs 0x00bc4164
00bc40f8	add x28,x26,x20
00bc40fc	mov x10,#-0x9
00bc4100	sub x8,x28,x21
00bc4104	sub x10,x10,x21
00bc4108	sub x8,x8,x27
00bc410c	cmp x8,x10
00bc4110	b.hi 0x00bc4270
00bc4114	ldr x10,[x19, #0x10]
00bc4118	tst w9,#0x1
00bc411c	mov x9,#-0xe
00bc4120	movk x9,#0x7fff, LSL #48
00bc4124	stur w4,[x29, #-0x4]
00bc4128	csinc x24,x10,x19,ne
00bc412c	cmp x21,x9
00bc4130	b.hi 0x00bc41a4
00bc4134	lsl x9,x21,#0x1
00bc4138	add x8,x8,x21
00bc413c	mov w10,#0x1a
00bc4140	cmp x8,x9
00bc4144	csel x8,x8,x9,hi
00bc4148	orr x9,x8,#0x7
00bc414c	cmp x9,#0x17
00bc4150	csinc x9,x10,x9,eq
00bc4154	cmp x8,#0x17
00bc4158	mov w8,#0x17
00bc415c	csel x25,x8,x9,cc
00bc4160	b 0x00bc41a8
00bc4164	ldr x10,[x19, #0x10]
00bc4168	tst w9,#0x1
00bc416c	csinc x23,x10,x19,ne
00bc4170	cmp x8,x2
00bc4174	b.ls 0x00bc419c
00bc4178	cmp x20,x27
00bc417c	b.eq 0x00bc419c
00bc4180	sub x2,x8,x27
00bc4184	add x8,x23,x22
00bc4188	mov w21,w4
00bc418c	add x0,x8,x20
00bc4190	add x1,x8,x27
00bc4194	bl 0x00c2ff60
00bc4198	mov w4,w21
00bc419c	cbnz x20,0x00bc4210
00bc41a0	b 0x00bc4220
00bc41a4	mov x25,#-0x9
00bc41a8	mov x0,x25
00bc41ac	bl 0x00c2fed0
00bc41b0	mov x23,x0
00bc41b4	cbz x22,0x00bc41c8
00bc41b8	mov x0,x23
00bc41bc	mov x1,x24
00bc41c0	mov x2,x22
00bc41c4	bl 0x00c2ff60
00bc41c8	add x8,x27,x22
00bc41cc	subs x2,x26,x8
00bc41d0	b.eq 0x00bc41e8
00bc41d4	add x8,x24,x22
00bc41d8	add x9,x23,x22
00bc41dc	add x0,x9,x20
00bc41e0	add x1,x8,x27
00bc41e4	bl 0x00c2ff60
00bc41e8	add x1,x21,#0x1
00bc41ec	cmp x1,#0x17
00bc41f0	b.eq 0x00bc41fc
00bc41f4	mov x0,x24
00bc41f8	bl 0x00c2fe80
00bc41fc	ldur w4,[x29, #-0x4]
00bc4200	orr x8,x25,#0x1
00bc4204	sub x9,x28,x27
00bc4208	str x8,[x19]
00bc420c	stp x9,x23,[x19, #0x8]
00bc4210	add x0,x23,x22
00bc4214	mov w1,w4
00bc4218	mov x2,x20
00bc421c	bl 0x00c301c0
00bc4220	ldrb w9,[x19]
00bc4224	sub x8,x20,x27
00bc4228	add x8,x8,x26
00bc422c	tbnz w9,#0x0,0x00bc423c
00bc4230	lsl w9,w8,#0x1
00bc4234	strb w9,[x19]
00bc4238	b 0x00bc4240
00bc423c	str x8,[x19, #0x8]
00bc4240	mov x0,x19
00bc4244	strb wzr,[x23, x8]
00bc4248	ldp x20,x19,[sp, #0x60]
00bc424c	ldp x22,x21,[sp, #0x50]
00bc4250	ldp x24,x23,[sp, #0x40]
00bc4254	ldp x26,x25,[sp, #0x30]
00bc4258	ldp x28,x27,[sp, #0x20]
00bc425c	ldp x29,x30,[sp, #0x10]
00bc4260	add sp,sp,#0x70
00bc4264	autiasp
00bc4268	ret
00bc426c	bl 0x00814f80
00bc4270	bl 0x007fe124
