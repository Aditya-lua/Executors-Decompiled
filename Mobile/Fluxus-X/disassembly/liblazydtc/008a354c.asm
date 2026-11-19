; FUN_008a354c @ 008a354c
008a354c	ldp x9,x8,[x0, #0x20]
008a3550	add x10,x9,x9, LSL #0x1
008a3554	cmp x8,x10, LSR #0x2
008a3558	b.cs 0x008a3560
008a355c	ret
008a3560	cbz x8,0x008a35fc
008a3564	ldr x8,[x1]
008a3568	mov x12,#0x2d69
008a356c	movk x12,#0xeb38, LSL #16
008a3570	lsl w10,w8,#0x3
008a3574	lsr x11,x8,#0x20
008a3578	movk x12,#0xea08, LSL #32
008a357c	movk x12,#0x9ddf, LSL #48
008a3580	add x10,x10,#0x8
008a3584	eor x10,x10,x11
008a3588	mul x10,x10,x12
008a358c	eor x11,x11,x10, LSR #0x2f
008a3590	eor x10,x11,x10
008a3594	mov x11,#0x959d
008a3598	mul x10,x10,x12
008a359c	movk x11,#0xb8f4, LSL #16
008a35a0	movk x11,#0xd34f, LSL #32
008a35a4	movk x11,#0x949d, LSL #48
008a35a8	eor x10,x10,x10, LSR #0x2f
008a35ac	mul x10,x10,x11
008a35b0	ldrb w11,[x0, #0x30]
008a35b4	lsr x11,x10,x11
008a35b8	ldr x10,[x0, #0x18]
008a35bc	lsr x12,x11,#0x6
008a35c0	ldr x12,[x10, x12, LSL #0x3]
008a35c4	lsr x12,x12,x11
008a35c8	tbz w12,#0x0,0x008a35fc
008a35cc	ldr x12,[x0]
008a35d0	sub x9,x9,#0x1
008a35d4	lsl x13,x11,#0x4
008a35d8	ldr x13,[x12, x13#0x0]
008a35dc	cmp x13,x8
008a35e0	b.eq 0x008a355c
008a35e4	add x11,x11,#0x1
008a35e8	and x11,x11,x9
008a35ec	lsr x13,x11,#0x6
008a35f0	ldr x13,[x10, x13, LSL #0x3]
008a35f4	lsr x13,x13,x11
008a35f8	tbnz w13,#0x0,0x008a35d4
008a35fc	b 0x008a3600
008a3600	stp x29,x30,[sp, #-0x50]!
008a3604	str x25,[sp, #0x10]
008a3608	stp x24,x23,[sp, #0x20]
008a360c	stp x22,x21,[sp, #0x30]
008a3610	stp x20,x19,[sp, #0x40]
008a3614	mov x29,sp
008a3618	ldr x9,[x0, #0x20]
008a361c	mov w8,#0x10
008a3620	mov x19,x0
008a3624	lsl x10,x9,#0x1
008a3628	cmp x9,#0x0
008a362c	csel x23,x8,x10,eq
008a3630	cbz x23,0x008a3680
008a3634	cmp x23,#0x40
008a3638	mov w22,#0x40
008a363c	csel x8,x23,x22,hi
008a3640	lsr x24,x8,#0x6
008a3644	lsl x21,x24,#0x3
008a3648	mov x0,x21
008a364c	bl 0x00c2fed0
008a3650	mov w1,wzr
008a3654	mov x2,x21
008a3658	mov x20,x0
008a365c	bl 0x00c301c0
008a3660	lsl x0,x23,#0x4
008a3664	bl 0x00c2fed0
008a3668	rbit x8,x23
008a366c	clz x8,x8
008a3670	sub w25,w22,w8
008a3674	ldp x8,x21,[x19, #0x10]
008a3678	cbnz x8,0x008a3698
008a367c	b 0x008a37fc
008a3680	mov x24,xzr
008a3684	mov x20,xzr
008a3688	mov x0,xzr
008a368c	mov w25,#0x40
008a3690	ldp x8,x21,[x19, #0x10]
008a3694	cbz x8,0x008a37fc
008a3698	ldr x10,[x21]
008a369c	cbz x10,0x008a36a8
008a36a0	mov x9,xzr
008a36a4	b 0x008a36c8
008a36a8	mov x9,xzr
008a36ac	add x11,x21,#0x8
008a36b0	sub x12,x8,#0x1
008a36b4	cmp x12,x9
008a36b8	b.eq 0x008a37fc
008a36bc	ldr x10,[x11, x9, LSL #0x3]
008a36c0	add x9,x9,#0x1
008a36c4	cbz x10,0x008a36b4
008a36c8	rbit x12,x10
008a36cc	mov x11,#0x2d69
008a36d0	mov x15,#0x959d
008a36d4	movk x11,#0xeb38, LSL #16
008a36d8	movk x15,#0xb8f4, LSL #16
008a36dc	ldr x22,[x19]
008a36e0	clz x12,x12
008a36e4	movk x11,#0xea08, LSL #32
008a36e8	movk x15,#0xd34f, LSL #32
008a36ec	orr x17,x12,x9, LSL #0x6
008a36f0	movk x11,#0x9ddf, LSL #48
008a36f4	sub x12,x23,#0x1
008a36f8	and x13,x25,#0xff
008a36fc	add x14,x21,#0x8
008a3700	movk x15,#0x949d, LSL #48
008a3704	mov w16,#0x1
008a3708	add x1,x22,x17, LSL #0x4
008a370c	ldr x5,[x1]
008a3710	lsl w2,w5,#0x3
008a3714	lsr x3,x5,#0x20
008a3718	add x2,x2,#0x8
008a371c	eor x2,x2,x3
008a3720	mul x2,x2,x11
008a3724	eor x3,x3,x2, LSR #0x2f
008a3728	eor x2,x3,x2
008a372c	mul x2,x2,x11
008a3730	eor x2,x2,x2, LSR #0x2f
008a3734	mul x2,x2,x15
008a3738	lsr x2,x2,x13
008a373c	lsr x3,x2,#0x6
008a3740	lsl x4,x16,x2
008a3744	ldr x6,[x20, x3, LSL #0x3]
008a3748	tst x4,x6
008a374c	b.eq 0x008a378c
008a3750	lsl x3,x2,#0x4
008a3754	ldr x3,[x0, x3#0x0]
008a3758	cmp x3,x5
008a375c	b.eq 0x008a3780
008a3760	add x2,x2,#0x1
008a3764	and x2,x2,x12
008a3768	lsr x3,x2,#0x6
008a376c	lsl x4,x16,x2
008a3770	ldr x6,[x20, x3, LSL #0x3]
008a3774	tst x6,x4
008a3778	b.ne 0x008a3750
008a377c	b 0x008a3788
008a3780	lsr x3,x2,#0x6
008a3784	lsl x4,x16,x2
008a3788	ldr x6,[x20, x3, LSL #0x3]
008a378c	orr x4,x6,x4
008a3790	str x4,[x20, x3, LSL #0x3]
008a3794	sub x3,x10,#0x1
008a3798	ldr q0,[x1]
008a379c	ands x10,x3,x10
008a37a0	str q0,[x0,x2, lsl #4]
008a37a4	b.ne 0x008a37d0
008a37a8	add x10,x9,#0x1
008a37ac	cmp x8,x10
008a37b0	csinc x1,x8,x9,hi
008a37b4	add x2,x9,#0x1
008a37b8	cmp x2,x8
008a37bc	b.cs 0x008a37ec
008a37c0	ldr x10,[x14, x9, LSL #0x3]
008a37c4	mov x9,x2
008a37c8	cbz x10,0x008a37b4
008a37cc	mov x9,x2
008a37d0	rbit x17,x10
008a37d4	clz x17,x17
008a37d8	orr x17,x17,x9, LSL #0x6
008a37dc	cbnz x10,0x008a3708
008a37e0	cmp x9,x8
008a37e4	b.ne 0x008a3708
008a37e8	b 0x008a3800
008a37ec	mov x10,xzr
008a37f0	mov x9,x1
008a37f4	cbz x10,0x008a37e0
008a37f8	b 0x008a3708
008a37fc	ldr x22,[x19]
008a3800	stp x0,xzr,[x19]
008a3804	mov x0,xzr
008a3808	stp xzr,xzr,[x19, #0x10]
008a380c	bl 0x00c301d0
008a3810	mov x0,xzr
008a3814	stp x24,x20,[x19, #0x10]
008a3818	str x23,[x19, #0x8]
008a381c	bl 0x00c301d0
008a3820	mov x0,xzr
008a3824	bl 0x00c301d0
008a3828	str x23,[x19, #0x20]
008a382c	strb w25,[x19, #0x30]
008a3830	cbz x22,0x008a3850
008a3834	mov x0,x22
008a3838	bl 0x00c301d0
008a383c	mov x0,x21
008a3840	bl 0x00c301d0
008a3844	mov x0,xzr
008a3848	bl 0x00c301d0
008a384c	mov x21,xzr
008a3850	mov x0,x21
008a3854	ldp x20,x19,[sp, #0x40]
008a3858	ldr x25,[sp, #0x10]
008a385c	ldp x22,x21,[sp, #0x30]
008a3860	ldp x24,x23,[sp, #0x20]
008a3864	ldp x29,x30,[sp], #0x50
008a3868	b 0x00c301d0
