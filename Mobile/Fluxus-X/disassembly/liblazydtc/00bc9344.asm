; std::__ndk1::to_string @ 00bc9344
00bc9344	paciasp
00bc9348	sub sp,sp,#0x50
00bc934c	stp x29,x30,[sp, #0x20]
00bc9350	stp x22,x21,[sp, #0x30]
00bc9354	stp x20,x19,[sp, #0x40]
00bc9358	add x29,sp,#0x20
00bc935c	lsr x9,x0,#0x20
00bc9360	mov x20,x0
00bc9364	mov x19,x8
00bc9368	cbnz x9,0x00bc9380
00bc936c	add x0,sp,#0xb
00bc9370	mov w1,w20
00bc9374	bl 0x00bcac54
00bc9378	mov x21,x0
00bc937c	b 0x00bc9474
00bc9380	mov x22,#0xe3ff
00bc9384	movk x22,#0x540b, LSL #16
00bc9388	movk x22,#0x2, LSL #32
00bc938c	cmp x20,x22
00bc9390	b.ls 0x00bc93c4
00bc9394	mov x8,#0xd5bf
00bc9398	add x0,sp,#0xb
00bc939c	movk x8,#0xbded, LSL #16
00bc93a0	movk x8,#0xfece, LSL #32
00bc93a4	movk x8,#0xdbe6, LSL #48
00bc93a8	umulh x8,x20,x8
00bc93ac	lsr x21,x8,#0x21
00bc93b0	mov w1,w21
00bc93b4	bl 0x00bcac54
00bc93b8	madd x8,x21,x22,x21
00bc93bc	sub x20,x20,x8
00bc93c0	b 0x00bc93c8
00bc93c4	add x0,sp,#0xb
00bc93c8	mov x8,#0xcefd
00bc93cc	mov w9,#0xe100
00bc93d0	mov w11,#0xde83
00bc93d4	movk x8,#0x8461, LSL #16
00bc93d8	movk w9,#0x5f5, LSL #16
00bc93dc	movk w11,#0x431b, LSL #16
00bc93e0	movk x8,#0x7711, LSL #32
00bc93e4	mov w12,#0x2710
00bc93e8	add x21,x0,#0xa
00bc93ec	movk x8,#0xabcc, LSL #48
00bc93f0	umulh x8,x20,x8
00bc93f4	lsr x8,x8,#0x1a
00bc93f8	msub x9,x8,x9,x20
00bc93fc	mov w10,w9
00bc9400	umull x10,w10,w11
00bc9404	mov w11,#0x4240
00bc9408	movk w11,#0xf, LSL #16
00bc940c	lsr x10,x10,#0x32
00bc9410	msub w9,w10,w11,w9
00bc9414	mov w11,#0x1759
00bc9418	movk w11,#0xd1b7, LSL #16
00bc941c	umull x11,w9,w11
00bc9420	lsr x11,x11,#0x2d
00bc9424	msub w9,w11,w12,w9
00bc9428	adrp x12,0x78a000
00bc942c	add x12,x12,#0x180
00bc9430	ldrh w8,[x12, x8, LSL #0x1]
00bc9434	ubfx w13,w9,#0x2,#0xe
00bc9438	strh w8,[x0]
00bc943c	mov w8,#0x147b
00bc9440	ldrh w10,[x12, x10, LSL #0x1]
00bc9444	mul w8,w13,w8
00bc9448	strh w10,[x0, #0x2]
00bc944c	ldrh w10,[x12, x11, LSL #0x1]
00bc9450	mov w11,#0x64
00bc9454	lsr w8,w8,#0x11
00bc9458	strh w10,[x0, #0x4]
00bc945c	msub w9,w8,w11,w9
00bc9460	ldrh w8,[x12, w8, UXTW #0x1]
00bc9464	strh w8,[x0, #0x6]
00bc9468	and x8,x9,#0xffff
00bc946c	ldrh w8,[x12, x8, LSL #0x1]
00bc9470	strh w8,[x0, #0x8]
00bc9474	add x8,sp,#0xb
00bc9478	sub x20,x21,x8
00bc947c	cmn x20,#0x8
00bc9480	b.cs 0x00bc94f8
00bc9484	cmp x20,#0x16
00bc9488	b.hi 0x00bc9498
00bc948c	lsl w8,w20,#0x1
00bc9490	strb w8,[x19], #0x1
00bc9494	b 0x00bc94c0
00bc9498	orr x8,x20,#0x7
00bc949c	mov w9,#0x1a
00bc94a0	cmp x8,#0x17
00bc94a4	csinc x22,x9,x8,eq
00bc94a8	mov x0,x22
00bc94ac	bl 0x00c2fed0
00bc94b0	orr x8,x22,#0x1
00bc94b4	stp x20,x0,[x19, #0x8]
00bc94b8	str x8,[x19]
00bc94bc	mov x19,x0
00bc94c0	add x8,sp,#0xb
00bc94c4	cmp x21,x8
00bc94c8	b.eq 0x00bc94dc
00bc94cc	add x1,sp,#0xb
00bc94d0	mov x0,x19
00bc94d4	mov x2,x20
00bc94d8	bl 0x00c2ffd0
00bc94dc	strb wzr,[x19, x20]
00bc94e0	ldp x20,x19,[sp, #0x40]
00bc94e4	ldp x22,x21,[sp, #0x30]
00bc94e8	ldp x29,x30,[sp, #0x20]
00bc94ec	add sp,sp,#0x50
00bc94f0	autiasp
00bc94f4	ret
00bc94f8	bl 0x007fe124
