; FUN_00ad3630 @ 00ad3630
00ad3630	stp x28,x27,[sp, #-0x60]!
00ad3634	stp x26,x25,[sp, #0x10]
00ad3638	stp x24,x23,[sp, #0x20]
00ad363c	stp x22,x21,[sp, #0x30]
00ad3640	stp x20,x19,[sp, #0x40]
00ad3644	stp x29,x30,[sp, #0x50]
00ad3648	ldr x8,[x3, #0x28]
00ad364c	mov w27,w0
00ad3650	add x29,sp,#0x50
00ad3654	mov w23,w4
00ad3658	mov x0,x8
00ad365c	mov x24,x3
00ad3660	mov x22,x2
00ad3664	mov x26,x1
00ad3668	bl 0x00c322f0
00ad366c	cmp w0,#0x4, LSL #12
00ad3670	b.le 0x00ad369c
00ad3674	bl 0x00c342a0
00ad3678	adrp x0,0x2b8000
00ad367c	adrp x2,0x2b0000
00ad3680	add x0,x0,#0x60f
00ad3684	add x2,x2,#0x877
00ad3688	mov w1,#0x208
00ad368c	bl 0x00c342b0
00ad3690	mov w0,#0x4
00ad3694	mov w1,#0x69
00ad3698	b 0x00ad37ac
00ad369c	ldp x0,x1,[x24, #0x28]
00ad36a0	bl 0x00c369c0
00ad36a4	cmp w0,#0x0
00ad36a8	b.le 0x00ad3788
00ad36ac	ldr x0,[x24, #0x28]
00ad36b0	bl 0x00c322f0
00ad36b4	cmp w0,#0xc01
00ad36b8	b.lt 0x00ad36e8
00ad36bc	ldr x0,[x24, #0x30]
00ad36c0	bl 0x00c322f0
00ad36c4	cmp w0,#0x41
00ad36c8	b.lt 0x00ad36e8
00ad36cc	bl 0x00c342a0
00ad36d0	adrp x0,0x2b8000
00ad36d4	adrp x2,0x2b0000
00ad36d8	add x0,x0,#0x60f
00ad36dc	add x2,x2,#0x877
00ad36e0	mov w1,#0x214
00ad36e4	b 0x00ad37a0
00ad36e8	ldr x0,[x24, #0x8]
00ad36ec	bl 0x00c38a60
00ad36f0	mov x19,x0
00ad36f4	cbz x0,0x00ad37bc
00ad36f8	mov x0,x19
00ad36fc	bl 0x00c38a90
00ad3700	mov x0,x19
00ad3704	bl 0x00c38a40
00ad3708	mov x28,x0
00ad370c	mov x0,x19
00ad3710	bl 0x00c38a40
00ad3714	ldr x8,[x24, #0x28]
00ad3718	mov x25,x0
00ad371c	mov x0,x8
00ad3720	bl 0x00c322f0
00ad3724	add w8,w0,#0x7
00ad3728	add w9,w0,#0xe
00ad372c	cmp w8,#0x0
00ad3730	csel w8,w9,w8,lt
00ad3734	adrp x1,0x2b8000
00ad3738	sbfx x0,x8,#0x3,#0x1d
00ad373c	add x1,x1,#0x60f
00ad3740	mov w2,#0x21f
00ad3744	asr w20,w8,#0x3
00ad3748	bl 0x00c32320
00ad374c	mov x21,x0
00ad3750	cbz x25,0x00ad37c8
00ad3754	cbz x21,0x00ad37c8
00ad3758	cmp w20,w27
00ad375c	b.ge 0x00ad3844
00ad3760	bl 0x00c342a0
00ad3764	adrp x0,0x2b8000
00ad3768	adrp x2,0x2b0000
00ad376c	add x0,x0,#0x60f
00ad3770	add x2,x2,#0x877
00ad3774	mov w1,#0x22a
00ad3778	bl 0x00c342b0
00ad377c	mov w0,#0x4
00ad3780	mov w1,#0x6c
00ad3784	b 0x00ad37f0
00ad3788	bl 0x00c342a0
00ad378c	adrp x0,0x2b8000
00ad3790	adrp x2,0x2b0000
00ad3794	add x0,x0,#0x60f
00ad3798	add x2,x2,#0x877
00ad379c	mov w1,#0x20d
00ad37a0	bl 0x00c342b0
00ad37a4	mov w0,#0x4
00ad37a8	mov w1,#0x65
00ad37ac	mov x2,xzr
00ad37b0	bl 0x00c342c0
00ad37b4	mov w24,#0xffffffff
00ad37b8	b 0x00ad3824
00ad37bc	mov w20,wzr
00ad37c0	mov x21,xzr
00ad37c4	b 0x00ad37f8
00ad37c8	bl 0x00c342a0
00ad37cc	adrp x0,0x2b8000
00ad37d0	adrp x2,0x2b0000
00ad37d4	add x0,x0,#0x60f
00ad37d8	add x2,x2,#0x877
00ad37dc	mov w1,#0x221
00ad37e0	bl 0x00c342b0
00ad37e4	mov w1,#0x100
00ad37e8	mov w0,#0x4
00ad37ec	movk w1,#0xc, LSL #16
00ad37f0	mov x2,xzr
00ad37f4	bl 0x00c342c0
00ad37f8	mov w24,#0xffffffff
00ad37fc	mov x0,x19
00ad3800	bl 0x00c38a20
00ad3804	mov x0,x19
00ad3808	bl 0x00c38a30
00ad380c	adrp x2,0x2b8000
00ad3810	sxtw x1,w20
00ad3814	add x2,x2,#0x60f
00ad3818	mov w3,#0x25b
00ad381c	mov x0,x21
00ad3820	bl 0x00c345e0
00ad3824	mov w0,w24
00ad3828	ldp x29,x30,[sp, #0x50]
00ad382c	ldp x20,x19,[sp, #0x40]
00ad3830	ldp x22,x21,[sp, #0x30]
00ad3834	ldp x24,x23,[sp, #0x20]
00ad3838	ldp x26,x25,[sp, #0x10]
00ad383c	ldp x28,x27,[sp], #0x60
00ad3840	ret
00ad3844	mov x0,x26
00ad3848	mov w1,w27
00ad384c	mov x2,x28
00ad3850	bl 0x00c36970
00ad3854	cbz x0,0x00ad37f8
00ad3858	ldr x1,[x24, #0x28]
00ad385c	mov x0,x28
00ad3860	bl 0x00c369c0
00ad3864	tbnz w0,#0x1f,0x00ad3890
00ad3868	bl 0x00c342a0
00ad386c	adrp x0,0x2b8000
00ad3870	adrp x2,0x2b0000
00ad3874	add x0,x0,#0x60f
00ad3878	add x2,x2,#0x877
00ad387c	mov w1,#0x232
00ad3880	bl 0x00c342b0
00ad3884	mov w0,#0x4
00ad3888	mov w1,#0x84
00ad388c	b 0x00ad37f0
00ad3890	ldrb w8,[x24, #0xa4]
00ad3894	tbz w8,#0x1,0x00ad38b0
00ad3898	ldr x1,[x24, #0xd0]
00ad389c	ldr x2,[x24, #0x28]
00ad38a0	add x0,x24,#0xa8
00ad38a4	mov x3,x19
00ad38a8	bl 0x00c38fa0
00ad38ac	cbz x0,0x00ad37f8
00ad38b0	ldr x8,[x24, #0x18]
00ad38b4	ldp x3,x2,[x24, #0x28]
00ad38b8	ldr x5,[x24, #0xa8]
00ad38bc	mov x0,x25
00ad38c0	ldr x8,[x8, #0x30]
00ad38c4	mov x1,x28
00ad38c8	mov x4,x19
00ad38cc	blr x8
00ad38d0	cbz w0,0x00ad37f8
00ad38d4	cmp w23,#0x5
00ad38d8	b.ne 0x00ad3908
00ad38dc	mov x0,x25
00ad38e0	bl 0x00c38bf0
00ad38e4	ldr x8,[x0]
00ad38e8	and x8,x8,#0xf
00ad38ec	cmp x8,#0xc
00ad38f0	b.eq 0x00ad3908
00ad38f4	ldr x1,[x24, #0x28]
00ad38f8	mov x0,x25
00ad38fc	mov x2,x25
00ad3900	bl 0x00c38880
00ad3904	cbz w0,0x00ad37f8
00ad3908	mov x0,x25
00ad390c	mov x1,x21
00ad3910	mov w2,w20
00ad3914	bl 0x00c38c70
00ad3918	mov w24,w0
00ad391c	tbnz w0,#0x1f,0x00ad37f8
00ad3920	cmp w23,#0x5
00ad3924	b.eq 0x00ad395c
00ad3928	cmp w23,#0x3
00ad392c	b.eq 0x00ad39ac
00ad3930	cmp w23,#0x1
00ad3934	b.ne 0x00ad39c0
00ad3938	mov x0,x22
00ad393c	mov w1,w20
00ad3940	mov x2,x21
00ad3944	mov w3,w24
00ad3948	mov w4,w20
00ad394c	bl 0x00c3ff80
00ad3950	mov w24,w0
00ad3954	tbz w0,#0x1f,0x00ad37fc
00ad3958	b 0x00ad397c
00ad395c	mov x0,x22
00ad3960	mov w1,w20
00ad3964	mov x2,x21
00ad3968	mov w3,w24
00ad396c	mov w4,w20
00ad3970	bl 0x00c3ffa0
00ad3974	mov w24,w0
00ad3978	tbz w0,#0x1f,0x00ad37fc
00ad397c	bl 0x00c342a0
00ad3980	adrp x0,0x2b8000
00ad3984	adrp x2,0x2b0000
00ad3988	add x0,x0,#0x60f
00ad398c	add x2,x2,#0x877
00ad3990	mov w1,#0x256
00ad3994	bl 0x00c342b0
00ad3998	mov w0,#0x4
00ad399c	mov w1,#0x72
00ad39a0	mov x2,xzr
00ad39a4	bl 0x00c342c0
00ad39a8	b 0x00ad37fc
00ad39ac	sxtw x2,w24
00ad39b0	mov x0,x22
00ad39b4	mov x1,x21
00ad39b8	bl 0x00c2ffd0
00ad39bc	b 0x00ad37fc
00ad39c0	bl 0x00c342a0
00ad39c4	adrp x0,0x2b8000
00ad39c8	adrp x2,0x2b0000
00ad39cc	add x0,x0,#0x60f
00ad39d0	add x2,x2,#0x877
00ad39d4	mov w1,#0x252
00ad39d8	bl 0x00c342b0
00ad39dc	mov w0,#0x4
00ad39e0	mov w1,#0x76
00ad39e4	b 0x00ad37f0
