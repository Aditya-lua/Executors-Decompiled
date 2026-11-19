; std::__ndk1::to_string @ 00bc918c
00bc918c	paciasp
00bc9190	sub sp,sp,#0x50
00bc9194	stp x29,x30,[sp, #0x20]
00bc9198	stp x22,x21,[sp, #0x30]
00bc919c	stp x20,x19,[sp, #0x40]
00bc91a0	add x29,sp,#0x20
00bc91a4	lsr x9,x0,#0x20
00bc91a8	mov x20,x0
00bc91ac	mov x19,x8
00bc91b0	cbnz x9,0x00bc91c8
00bc91b4	add x0,sp,#0xb
00bc91b8	mov w1,w20
00bc91bc	bl 0x00bcac54
00bc91c0	mov x21,x0
00bc91c4	b 0x00bc92bc
00bc91c8	mov x22,#0xe3ff
00bc91cc	movk x22,#0x540b, LSL #16
00bc91d0	movk x22,#0x2, LSL #32
00bc91d4	cmp x20,x22
00bc91d8	b.ls 0x00bc920c
00bc91dc	mov x8,#0xd5bf
00bc91e0	add x0,sp,#0xb
00bc91e4	movk x8,#0xbded, LSL #16
00bc91e8	movk x8,#0xfece, LSL #32
00bc91ec	movk x8,#0xdbe6, LSL #48
00bc91f0	umulh x8,x20,x8
00bc91f4	lsr x21,x8,#0x21
00bc91f8	mov w1,w21
00bc91fc	bl 0x00bcac54
00bc9200	madd x8,x21,x22,x21
00bc9204	sub x20,x20,x8
00bc9208	b 0x00bc9210
00bc920c	add x0,sp,#0xb
00bc9210	mov x8,#0xcefd
00bc9214	mov w9,#0xe100
00bc9218	mov w11,#0xde83
00bc921c	movk x8,#0x8461, LSL #16
00bc9220	movk w9,#0x5f5, LSL #16
00bc9224	movk w11,#0x431b, LSL #16
00bc9228	movk x8,#0x7711, LSL #32
00bc922c	mov w12,#0x2710
00bc9230	add x21,x0,#0xa
00bc9234	movk x8,#0xabcc, LSL #48
00bc9238	umulh x8,x20,x8
00bc923c	lsr x8,x8,#0x1a
00bc9240	msub x9,x8,x9,x20
00bc9244	mov w10,w9
00bc9248	umull x10,w10,w11
00bc924c	mov w11,#0x4240
00bc9250	movk w11,#0xf, LSL #16
00bc9254	lsr x10,x10,#0x32
00bc9258	msub w9,w10,w11,w9
00bc925c	mov w11,#0x1759
00bc9260	movk w11,#0xd1b7, LSL #16
00bc9264	umull x11,w9,w11
00bc9268	lsr x11,x11,#0x2d
00bc926c	msub w9,w11,w12,w9
00bc9270	adrp x12,0x78a000
00bc9274	add x12,x12,#0x180
00bc9278	ldrh w8,[x12, x8, LSL #0x1]
00bc927c	ubfx w13,w9,#0x2,#0xe
00bc9280	strh w8,[x0]
00bc9284	mov w8,#0x147b
00bc9288	ldrh w10,[x12, x10, LSL #0x1]
00bc928c	mul w8,w13,w8
00bc9290	strh w10,[x0, #0x2]
00bc9294	ldrh w10,[x12, x11, LSL #0x1]
00bc9298	mov w11,#0x64
00bc929c	lsr w8,w8,#0x11
00bc92a0	strh w10,[x0, #0x4]
00bc92a4	msub w9,w8,w11,w9
00bc92a8	ldrh w8,[x12, w8, UXTW #0x1]
00bc92ac	strh w8,[x0, #0x6]
00bc92b0	and x8,x9,#0xffff
00bc92b4	ldrh w8,[x12, x8, LSL #0x1]
00bc92b8	strh w8,[x0, #0x8]
00bc92bc	add x8,sp,#0xb
00bc92c0	sub x20,x21,x8
00bc92c4	cmn x20,#0x8
00bc92c8	b.cs 0x00bc9340
00bc92cc	cmp x20,#0x16
00bc92d0	b.hi 0x00bc92e0
00bc92d4	lsl w8,w20,#0x1
00bc92d8	strb w8,[x19], #0x1
00bc92dc	b 0x00bc9308
00bc92e0	orr x8,x20,#0x7
00bc92e4	mov w9,#0x1a
00bc92e8	cmp x8,#0x17
00bc92ec	csinc x22,x9,x8,eq
00bc92f0	mov x0,x22
00bc92f4	bl 0x00c2fed0
00bc92f8	orr x8,x22,#0x1
00bc92fc	stp x20,x0,[x19, #0x8]
00bc9300	str x8,[x19]
00bc9304	mov x19,x0
00bc9308	add x8,sp,#0xb
00bc930c	cmp x21,x8
00bc9310	b.eq 0x00bc9324
00bc9314	add x1,sp,#0xb
00bc9318	mov x0,x19
00bc931c	mov x2,x20
00bc9320	bl 0x00c2ffd0
00bc9324	strb wzr,[x19, x20]
00bc9328	ldp x20,x19,[sp, #0x40]
00bc932c	ldp x22,x21,[sp, #0x30]
00bc9330	ldp x29,x30,[sp, #0x20]
00bc9334	add sp,sp,#0x50
00bc9338	autiasp
00bc933c	ret
00bc9340	bl 0x007fe124
