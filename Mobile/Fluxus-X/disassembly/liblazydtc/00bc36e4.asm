; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::replace @ 00bc36e4
00bc36e4	paciasp
00bc36e8	stp x29,x30,[sp, #-0x60]!
00bc36ec	stp x28,x27,[sp, #0x10]
00bc36f0	stp x26,x25,[sp, #0x20]
00bc36f4	stp x24,x23,[sp, #0x30]
00bc36f8	stp x22,x21,[sp, #0x40]
00bc36fc	stp x20,x19,[sp, #0x50]
00bc3700	mov x29,sp
00bc3704	ldrb w9,[x0]
00bc3708	ldr x8,[x0, #0x8]
00bc370c	lsr x10,x9,#0x1
00bc3710	tst w9,#0x1
00bc3714	csel x20,x10,x8,eq
00bc3718	subs x8,x20,x1
00bc371c	b.cc 0x00bc38b0
00bc3720	ldr x10,[x0]
00bc3724	cmp x8,x2
00bc3728	mov x23,x1
00bc372c	csel x24,x8,x2,cc
00bc3730	tst w9,#0x1
00bc3734	mov w9,#0x16
00bc3738	and x11,x10,#-0x2
00bc373c	mov x21,x4
00bc3740	mov x22,x3
00bc3744	sub x11,x11,#0x1
00bc3748	mov x19,x0
00bc374c	csel x1,x9,x11,eq
00bc3750	sub x9,x24,x20
00bc3754	add x9,x9,x1
00bc3758	cmp x9,x4
00bc375c	b.cs 0x00bc378c
00bc3760	add x8,x20,x21
00bc3764	mov x0,x19
00bc3768	mov x3,x20
00bc376c	sub x8,x8,x1
00bc3770	mov x4,x23
00bc3774	mov x5,x24
00bc3778	sub x2,x8,x24
00bc377c	mov x6,x21
00bc3780	mov x7,x22
00bc3784	bl 0x00c30200
00bc3788	b 0x00bc388c
00bc378c	ldr x9,[x19, #0x10]
00bc3790	tst x10,#0x1
00bc3794	csinc x27,x9,x19,ne
00bc3798	cmp x21,x24
00bc379c	b.ne 0x00bc37a8
00bc37a0	mov x24,x21
00bc37a4	b 0x00bc385c
00bc37a8	cmp x8,x2
00bc37ac	b.ls 0x00bc385c
00bc37b0	subs x28,x21,x24
00bc37b4	sub x25,x8,x24
00bc37b8	add x26,x27,x23
00bc37bc	b.cs 0x00bc37f8
00bc37c0	cbz x21,0x00bc37d4
00bc37c4	mov x0,x26
00bc37c8	mov x1,x22
00bc37cc	mov x2,x21
00bc37d0	bl 0x00c2ff60
00bc37d4	add x0,x26,x21
00bc37d8	add x1,x26,x24
00bc37dc	mov x2,x25
00bc37e0	bl 0x00c2ff60
00bc37e4	ldrb w9,[x19]
00bc37e8	add x8,x28,x20
00bc37ec	tbz w9,#0x0,0x00bc3880
00bc37f0	str x8,[x19, #0x8]
00bc37f4	b 0x00bc3888
00bc37f8	add x8,x27,x20
00bc37fc	cmp x22,x8
00bc3800	b.cs 0x00bc3848
00bc3804	add x8,x26,#0x1
00bc3808	cmp x22,x8
00bc380c	b.cc 0x00bc3848
00bc3810	add x8,x26,x24
00bc3814	cmp x8,x22
00bc3818	b.ls 0x00bc3844
00bc381c	cbz x2,0x00bc3830
00bc3820	mov x0,x26
00bc3824	mov x1,x22
00bc3828	mov x2,x24
00bc382c	bl 0x00c2ff60
00bc3830	add x23,x24,x23
00bc3834	add x22,x22,x21
00bc3838	mov x21,x28
00bc383c	mov x24,xzr
00bc3840	b 0x00bc3848
00bc3844	add x22,x22,x28
00bc3848	add x8,x27,x23
00bc384c	mov x2,x25
00bc3850	add x0,x8,x21
00bc3854	add x1,x8,x24
00bc3858	bl 0x00c2ff60
00bc385c	cbz x21,0x00bc3870
00bc3860	add x0,x27,x23
00bc3864	mov x1,x22
00bc3868	mov x2,x21
00bc386c	bl 0x00c2ff60
00bc3870	ldrb w9,[x19]
00bc3874	sub x8,x21,x24
00bc3878	add x8,x8,x20
00bc387c	tbnz w9,#0x0,0x00bc37f0
00bc3880	lsl w9,w8,#0x1
00bc3884	strb w9,[x19]
00bc3888	strb wzr,[x27, x8]
00bc388c	mov x0,x19
00bc3890	ldp x20,x19,[sp, #0x50]
00bc3894	ldp x22,x21,[sp, #0x40]
00bc3898	ldp x24,x23,[sp, #0x30]
00bc389c	ldp x26,x25,[sp, #0x20]
00bc38a0	ldp x28,x27,[sp, #0x10]
00bc38a4	ldp x29,x30,[sp], #0x60
00bc38a8	autiasp
00bc38ac	ret
00bc38b0	bl 0x00814f80
