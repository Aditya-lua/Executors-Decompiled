; FUN_00aa3714 @ 00aa3714
00aa3714	sub sp,sp,#0x60
00aa3718	stp x26,x25,[sp, #0x10]
00aa371c	stp x24,x23,[sp, #0x20]
00aa3720	stp x22,x21,[sp, #0x30]
00aa3724	stp x20,x19,[sp, #0x40]
00aa3728	stp x29,x30,[sp, #0x50]
00aa372c	ldr x25,[x0, #0x58]
00aa3730	mov w20,w2
00aa3734	mov x19,x0
00aa3738	mov w21,w1
00aa373c	add x29,sp,#0x50
00aa3740	cbz x25,0x00aa380c
00aa3744	cbz w20,0x00aa3760
00aa3748	ldrb w8,[x19, #0xc8]
00aa374c	tbz w8,#0x0,0x00aa3760
00aa3750	mov w1,#0x1
00aa3754	mov x0,x19
00aa3758	bl 0x00c3eb90
00aa375c	cbz w0,0x00aa3aa8
00aa3760	cbz w21,0x00aa377c
00aa3764	ldr x0,[x25, #0x20]
00aa3768	bl 0x00c35680
00aa376c	cbz w0,0x00aa3940
00aa3770	ldr x0,[x19, #0x8]
00aa3774	bl 0x00c356a0
00aa3778	cbz w0,0x00aa3938
00aa377c	ldr w8,[x19, #0x20]
00aa3780	ldrb w9,[x19]
00aa3784	mov w24,#0x1
00aa3788	add w23,w8,#0x1
00aa378c	orr w9,w9,#0x2
00aa3790	str w23,[x19, #0x20]
00aa3794	strb w9,[x19]
00aa3798	cbz x25,0x00aa37ec
00aa379c	cbnz w8,0x00aa37ec
00aa37a0	ldr x26,[x19, #0x58]
00aa37a4	ldr x0,[x26, #0x10]
00aa37a8	bl 0x00c325e0
00aa37ac	cmp w0,#0x1
00aa37b0	b.lt 0x00aa3960
00aa37b4	mov w20,w0
00aa37b8	mov w22,wzr
00aa37bc	mov w24,#0x1
00aa37c0	ldr x0,[x26, #0x10]
00aa37c4	mov w1,w22
00aa37c8	bl 0x00c32610
00aa37cc	ldr x8,[x0, #0x8]
00aa37d0	ldr x1,[x0, #0x20]
00aa37d4	mov x0,x19
00aa37d8	blr x8
00aa37dc	add w22,w22,#0x1
00aa37e0	cmp w20,w22
00aa37e4	and w24,w0,w24
00aa37e8	b.ne 0x00aa37c0
00aa37ec	cbz w21,0x00aa3800
00aa37f0	ldr x0,[x19, #0x8]
00aa37f4	bl 0x00c35690
00aa37f8	ldr x0,[x25, #0x20]
00aa37fc	bl 0x00c35690
00aa3800	cmp w24,#0x0
00aa3804	csinv w0,w23,wzr,ne
00aa3808	b 0x00aa3aac
00aa380c	stp xzr,xzr,[sp]
00aa3810	ldrb w8,[x19]
00aa3814	tbnz w8,#0x0,0x00aa3904
00aa3818	ldr x8,[x19, #0x40]
00aa381c	cbnz x8,0x00aa3840
00aa3820	ldr x0,[x19, #0x38]
00aa3824	cbz x0,0x00aa39d8
00aa3828	adrp x1,0x2b5000
00aa382c	add x1,x1,#0xf58
00aa3830	bl 0x00c39550
00aa3834	mov x8,x0
00aa3838	str x0,[x19, #0x40]
00aa383c	cbz x0,0x00aa3a6c
00aa3840	adrp x1,0xc6d000
00aa3844	add x1,x1,#0x4e0
00aa3848	add x2,sp,#0x8
00aa384c	mov x3,sp
00aa3850	mov x0,x19
00aa3854	blr x8
00aa3858	cbz w0,0x00aa39a0
00aa385c	ldp x0,x9,[sp]
00aa3860	stp x0,x9,[x19, #0xd0]
00aa3864	cbz x9,0x00aa3b38
00aa3868	adrp x10,0x76e000
00aa386c	mov x8,xzr
00aa3870	add x9,x9,#0x10
00aa3874	add x10,x10,#0x978
00aa3878	b 0x00aa3884
00aa387c	str x9,[sp, #0x8]
00aa3880	add x9,x9,#0x10
00aa3884	ldur w11,[x9, #-0x10]
00aa3888	sub w12,w11,#0x400
00aa388c	cmp w12,#0x7
00aa3890	b.hi 0x00aa38ac
00aa3894	ldrsw x11,[x10, x12, LSL #0x2]
00aa3898	add x11,x11,x10
00aa389c	br x11
00aa38a0	ldur x11,[x9, #-0x8]
00aa38a4	str x11,[x19, #0x70]
00aa38a8	b 0x00aa387c
00aa38ac	cbnz w11,0x00aa387c
00aa38b0	b 0x00aa396c
00aa38b4	ldur x11,[x9, #-0x8]
00aa38b8	str x11,[x19, #0x78]
00aa38bc	b 0x00aa387c
00aa38c0	ldur x11,[x9, #-0x8]
00aa38c4	str x11,[x19, #0x80]
00aa38c8	b 0x00aa387c
00aa38cc	ldur x11,[x9, #-0x8]
00aa38d0	str x11,[x19, #0x98]
00aa38d4	b 0x00aa387c
00aa38d8	ldur x11,[x9, #-0x8]
00aa38dc	str x11,[x19, #0xa0]
00aa38e0	b 0x00aa387c
00aa38e4	ldur x8,[x9, #-0x8]
00aa38e8	b 0x00aa387c
00aa38ec	ldur x11,[x9, #-0x8]
00aa38f0	str x11,[x19, #0x88]
00aa38f4	b 0x00aa387c
00aa38f8	ldur x11,[x9, #-0x8]
00aa38fc	str x11,[x19, #0x90]
00aa3900	b 0x00aa387c
00aa3904	bl 0x00c342a0
00aa3908	adrp x0,0x2aa000
00aa390c	adrp x2,0x2c5000
00aa3910	add x0,x0,#0x4b5
00aa3914	add x2,x2,#0xd74
00aa3918	mov w1,#0x351
00aa391c	bl 0x00c342b0
00aa3920	mov w1,#0x103
00aa3924	orr w0,wzr,#0xf
00aa3928	movk w1,#0xc, LSL #16
00aa392c	mov x2,xzr
00aa3930	bl 0x00c342c0
00aa3934	b 0x00aa3aa8
00aa3938	ldr x0,[x25, #0x20]
00aa393c	bl 0x00c35690
00aa3940	mov w0,#0xffffffff
00aa3944	cbz w20,0x00aa3aac
00aa3948	ldrb w8,[x19, #0xc8]
00aa394c	tbz w8,#0x0,0x00aa3aac
00aa3950	mov w1,#0x1
00aa3954	mov x0,x19
00aa3958	bl 0x00c3eb50
00aa395c	b 0x00aa3aa8
00aa3960	mov w24,#0x1
00aa3964	cbnz w21,0x00aa37f0
00aa3968	b 0x00aa3800
00aa396c	cbz x8,0x00aa3b38
00aa3970	blr x8
00aa3974	ldr w9,[x0]
00aa3978	mov x21,x0
00aa397c	cbz w9,0x00aa3ac8
00aa3980	mov x22,xzr
00aa3984	add x8,x21,#0x10
00aa3988	lsr w9,w9,#0x17
00aa398c	cbnz w9,0x00aa3aa8
00aa3990	ldr w9,[x8], #0x10
00aa3994	add x22,x22,#0x1
00aa3998	cbnz w9,0x00aa3988
00aa399c	b 0x00aa3acc
00aa39a0	bl 0x00c342a0
00aa39a4	adrp x0,0x2aa000
00aa39a8	adrp x2,0x2c5000
00aa39ac	add x0,x0,#0x4b5
00aa39b0	add x2,x2,#0xd74
00aa39b4	mov w1,#0x3ab
00aa39b8	bl 0x00c342b0
00aa39bc	ldr x3,[x19, #0x28]
00aa39c0	mov w8,#0x103
00aa39c4	movk w8,#0xc, LSL #16
00aa39c8	adrp x2,0x2ad000
00aa39cc	add w1,w8,#0x2
00aa39d0	add x2,x2,#0x7ba
00aa39d4	b 0x00aa3aa0
00aa39d8	bl 0x00c3a460
00aa39dc	str x0,[x19, #0x38]
00aa39e0	cbz x0,0x00aa3aa8
00aa39e4	ldr x0,[x19, #0x50]
00aa39e8	adrp x2,0xc6d000
00aa39ec	add x2,x2,#0x4c8
00aa39f0	mov w1,#0x1
00aa39f4	bl 0x00c3b520
00aa39f8	cbz x0,0x00aa3b50
00aa39fc	mov x21,x0
00aa3a00	ldr x0,[x0, #0x18]
00aa3a04	bl 0x00c35680
00aa3a08	cbz w0,0x00aa3aa8
00aa3a0c	ldr x0,[x21, #0x28]
00aa3a10	cbz x0,0x00aa3b6c
00aa3a14	adrp x1,0x2aa000
00aa3a18	add x1,x1,#0x4b5
00aa3a1c	mov w2,#0x36f
00aa3a20	bl 0x00c34600
00aa3a24	ldr x8,[x21, #0x18]
00aa3a28	mov x21,x0
00aa3a2c	mov x0,x8
00aa3a30	bl 0x00c35690
00aa3a34	mov x23,x21
00aa3a38	cbnz x21,0x00aa3b94
00aa3a3c	bl 0x00c342a0
00aa3a40	adrp x0,0x2aa000
00aa3a44	adrp x2,0x2c5000
00aa3a48	add x0,x0,#0x4b5
00aa3a4c	add x2,x2,#0xd74
00aa3a50	mov w1,#0x372
00aa3a54	bl 0x00c342b0
00aa3a58	mov w8,#0x103
00aa3a5c	movk w8,#0xc, LSL #16
00aa3a60	sub w1,w8,#0x3
00aa3a64	orr w0,wzr,#0xf
00aa3a68	b 0x00aa392c
00aa3a6c	bl 0x00c342a0
00aa3a70	adrp x0,0x2aa000
00aa3a74	adrp x2,0x2c5000
00aa3a78	add x0,x0,#0x4b5
00aa3a7c	add x2,x2,#0xd74
00aa3a80	mov w1,#0x3a3
00aa3a84	bl 0x00c342b0
00aa3a88	ldr x3,[x19, #0x28]
00aa3a8c	mov w8,#0x25
00aa3a90	movk w8,#0x8, LSL #16
00aa3a94	adrp x2,0x29e000
00aa3a98	add w1,w8,#0xe7
00aa3a9c	add x2,x2,#0x455
00aa3aa0	orr w0,wzr,#0xf
00aa3aa4	bl 0x00c342c0
00aa3aa8	mov w0,#0xffffffff
00aa3aac	ldp x29,x30,[sp, #0x50]
00aa3ab0	ldp x20,x19,[sp, #0x40]
00aa3ab4	ldp x22,x21,[sp, #0x30]
00aa3ab8	ldp x24,x23,[sp, #0x20]
00aa3abc	ldp x26,x25,[sp, #0x10]
00aa3ac0	add sp,sp,#0x60
00aa3ac4	ret
00aa3ac8	mov x22,xzr
00aa3acc	lsl x8,x22,#0x4
00aa3ad0	adrp x1,0x2aa000
00aa3ad4	add x0,x8,#0x20
00aa3ad8	add x1,x1,#0x4b5
00aa3adc	mov w2,#0x3f4
00aa3ae0	bl 0x00c34250
00aa3ae4	str x0,[x19, #0x68]
00aa3ae8	cbz x0,0x00aa3aa8
00aa3aec	mov x1,x0
00aa3af0	ldr w0,[x19, #0x60]
00aa3af4	ubfiz w8,w0,#0x17,#0x8
00aa3af8	str x8,[x1]
00aa3afc	ldr x9,[x19, #0x28]
00aa3b00	add x8,x22,#0x1
00aa3b04	str x9,[x1, #0x8]
00aa3b08	cbz x8,0x00aa3b34
00aa3b0c	add x9,x1,#0x18
00aa3b10	add x10,x21,#0x8
00aa3b14	mov w11,#0x1
00aa3b18	ldursw x12,[x10, #-0x8]
00aa3b1c	add x11,x11,#0x1
00aa3b20	cmp x11,x8
00aa3b24	stur x12,[x9, #-0x8]
00aa3b28	ldr x12,[x10], #0x10
00aa3b2c	str x12,[x9], #0x10
00aa3b30	b.ls 0x00aa3b18
00aa3b34	bl 0x00c3be20
00aa3b38	ldrb w8,[x19]
00aa3b3c	mov w21,wzr
00aa3b40	orr w8,w8,#0x1
00aa3b44	strb w8,[x19]
00aa3b48	cbnz w20,0x00aa3748
00aa3b4c	b 0x00aa3760
00aa3b50	bl 0x00c342a0
00aa3b54	adrp x0,0x2aa000
00aa3b58	adrp x2,0x2bb000
00aa3b5c	add x0,x0,#0x4b5
00aa3b60	add x2,x2,#0xf7d
00aa3b64	mov w1,#0x156
00aa3b68	b 0x00aa391c
00aa3b6c	ldr x0,[x21, #0x18]
00aa3b70	bl 0x00c35690
00aa3b74	adrp x0,0x2a4000
00aa3b78	add x0,x0,#0x419
00aa3b7c	bl 0x00c395b0
00aa3b80	adrp x8,0x2ad000
00aa3b84	add x8,x8,#0xd2f
00aa3b88	cmp x0,#0x0
00aa3b8c	mov x21,xzr
00aa3b90	csel x23,x8,x0,eq
00aa3b94	ldr x0,[x19, #0x38]
00aa3b98	mov w1,#0x2
00aa3b9c	mov w2,#0x2
00aa3ba0	mov x3,xzr
00aa3ba4	bl 0x00c3a420
00aa3ba8	ldr x1,[x19, #0x30]
00aa3bac	cbz x1,0x00aa3bb8
00aa3bb0	mov x22,xzr
00aa3bb4	b 0x00aa3bd0
00aa3bb8	ldr x0,[x19, #0x38]
00aa3bbc	ldr x1,[x19, #0x28]
00aa3bc0	bl 0x00c3a410
00aa3bc4	mov x1,x0
00aa3bc8	mov x22,x0
00aa3bcc	cbz x0,0x00aa3c00
00aa3bd0	ldr x0,[x19, #0x38]
00aa3bd4	mov x2,x23
00aa3bd8	bl 0x00c3a450
00aa3bdc	mov x23,x0
00aa3be0	cbz x0,0x00aa3c04
00aa3be4	ldr x0,[x19, #0x38]
00aa3be8	mov x1,x23
00aa3bec	mov x2,xzr
00aa3bf0	mov w3,wzr
00aa3bf4	bl 0x00c39570
00aa3bf8	cbnz x0,0x00aa3c10
00aa3bfc	b 0x00aa3c04
00aa3c00	mov x23,xzr
00aa3c04	ldr x0,[x19, #0x38]
00aa3c08	bl 0x00c39560
00aa3c0c	str xzr,[x19, #0x38]
00aa3c10	adrp x24,0x2aa000
00aa3c14	add x24,x24,#0x4b5
00aa3c18	mov w2,#0x390
00aa3c1c	mov x0,x23
00aa3c20	mov x1,x24
00aa3c24	bl 0x00c32310
00aa3c28	mov w2,#0x391
00aa3c2c	mov x0,x22
00aa3c30	mov x1,x24
00aa3c34	bl 0x00c32310
00aa3c38	mov w2,#0x392
00aa3c3c	mov x0,x21
00aa3c40	mov x1,x24
00aa3c44	bl 0x00c32310
00aa3c48	ldr x0,[x19, #0x38]
00aa3c4c	cbnz x0,0x00aa3828
00aa3c50	bl 0x00c342a0
00aa3c54	adrp x0,0x2aa000
00aa3c58	adrp x2,0x2c5000
00aa3c5c	add x0,x0,#0x4b5
00aa3c60	add x2,x2,#0xd74
00aa3c64	mov w1,#0x397
00aa3c68	bl 0x00c342b0
00aa3c6c	ldr x3,[x19, #0x28]
00aa3c70	adrp x2,0x2ad000
00aa3c74	mov w1,#0x25
00aa3c78	add x2,x2,#0x7ba
00aa3c7c	orr w0,wzr,#0xf
00aa3c80	movk w1,#0x8, LSL #16
00aa3c84	b 0x00aa3aa4
