; FUN_00bf34a8 @ 00bf34a8
00bf34a8	paciasp
00bf34ac	sub sp,sp,#0x70
00bf34b0	stp x29,x30,[sp, #0x10]
00bf34b4	str x27,[sp, #0x20]
00bf34b8	stp x26,x25,[sp, #0x30]
00bf34bc	stp x24,x23,[sp, #0x40]
00bf34c0	stp x22,x21,[sp, #0x50]
00bf34c4	stp x20,x19,[sp, #0x60]
00bf34c8	add x29,sp,#0x10
00bf34cc	movi v0.2D,#0x0
00bf34d0	sub x8,x1,#0x1
00bf34d4	adrp x9,0xcad000
00bf34d8	add x9,x9,#0x530
00bf34dc	mov x19,x0
00bf34e0	strb wzr,[x0, #0x122]
00bf34e4	stp x9,x8,[x0]
00bf34e8	mov w9,#0x1
00bf34ec	mov x8,x0
00bf34f0	str x9,[x0, #0x118]
00bf34f4	mov w9,#0x4302
00bf34f8	adrp x10,0xcb5000
00bf34fc	str q0,[x8, #0x28]!
00bf3500	adrp x21,0xcb4000
00bf3504	str x8,[x19, #0x10]!
00bf3508	adrp x22,0xd27000
00bf350c	add x22,x22,#0xbb0
00bf3510	stur q0,[x0, #0x38]
00bf3514	mov x20,x0
00bf3518	stur q0,[x0, #0x48]
00bf351c	stur q0,[x0, #0x58]
00bf3520	stur q0,[x0, #0x68]
00bf3524	stur q0,[x0, #0x78]
00bf3528	stur q0,[x0, #0x88]
00bf352c	stur q0,[x0, #0x98]
00bf3530	stur q0,[x0, #0xa8]
00bf3534	stur q0,[x0, #0xb8]
00bf3538	stur q0,[x0, #0xc8]
00bf353c	stur q0,[x0, #0xd8]
00bf3540	stur q0,[x0, #0xe8]
00bf3544	stur q0,[x0, #0xf8]
00bf3548	str q0,[x8, #0xe0]
00bf354c	strh w9,[x0, #0x120]
00bf3550	add x9,x0,#0x118
00bf3554	ldr x10,[x10, #0xc40]
00bf3558	stp x8,x9,[x0, #0x18]
00bf355c	ldr x21,[x21, #0xa38]
00bf3560	add x8,x10,#0x10
00bf3564	stp x8,xzr,[x22]
00bf3568	str x21,[sp]
00bf356c	ldar x8,[x21]
00bf3570	cmn x8,#0x1
00bf3574	b.eq 0x00bf35a0
00bf3578	mov x8,sp
00bf357c	add x9,x29,#0x18
00bf3580	str x8,[x29, #0x18]
00bf3584	str x9,[sp, #0x8]
00bf3588	adrp x0,0xcb4000
00bf358c	nop
00bf3590	adr x2,0xc0bab0
00bf3594	ldr x0,[x0, #0xa38]
00bf3598	add x1,sp,#0x8
00bf359c	bl 0x00c305d0
00bf35a0	ldrsw x8,[x21, #0x8]
00bf35a4	adrp x1,0xd27000
00bf35a8	add x1,x1,#0xbb8
00bf35ac	mov w0,#0x1
00bf35b0	sub x24,x8,#0x1
00bf35b4	bl 0x00c2bce0
00bf35b8	ldp x8,x9,[x20, #0x10]
00bf35bc	sub x9,x9,x8
00bf35c0	asr x10,x9,#0x3
00bf35c4	cmp x10,x24
00bf35c8	b.hi 0x00bf35f4
00bf35cc	add x9,x24,#0x1
00bf35d0	subs x1,x9,x10
00bf35d4	b.ls 0x00bf35e8
00bf35d8	mov x0,x19
00bf35dc	bl 0x00c0b6e4
00bf35e0	ldr x8,[x19]
00bf35e4	b 0x00bf35f4
00bf35e8	b.cs 0x00bf35f4
00bf35ec	add x9,x8,x9, LSL #0x3
00bf35f0	str x9,[x20, #0x18]
00bf35f4	ldr x21,[x8, x24, LSL #0x3]
00bf35f8	cbz x21,0x00bf361c
00bf35fc	add x1,x21,#0x8
00bf3600	mov x0,#-0x1
00bf3604	bl 0x00c2bd10
00bf3608	cbnz x0,0x00bf361c
00bf360c	ldr x8,[x21]
00bf3610	mov x0,x21
00bf3614	ldr x8,[x8, #0x10]
00bf3618	blr x8
00bf361c	adrp x9,0xcb5000
00bf3620	ldr x8,[x19]
00bf3624	adrp x21,0xcb5000
00bf3628	ldr x9,[x9, #0xc48]
00bf362c	ldr x21,[x21, #0xc50]
00bf3630	adrp x23,0xd27000
00bf3634	add x23,x23,#0xbc0
00bf3638	str x22,[x8, x24, LSL #0x3]
00bf363c	add x8,x9,#0x10
00bf3640	str x21,[sp]
00bf3644	stp x8,xzr,[x23]
00bf3648	ldar x8,[x21]
00bf364c	cmn x8,#0x1
00bf3650	b.eq 0x00bf367c
00bf3654	mov x8,sp
00bf3658	add x9,x29,#0x18
00bf365c	str x8,[x29, #0x18]
00bf3660	str x9,[sp, #0x8]
00bf3664	adrp x0,0xcb5000
00bf3668	nop
00bf366c	adr x2,0xc0bab0
00bf3670	ldr x0,[x0, #0xc50]
00bf3674	add x1,sp,#0x8
00bf3678	bl 0x00c305d0
00bf367c	ldrsw x8,[x21, #0x8]
00bf3680	adrp x1,0xd27000
00bf3684	add x1,x1,#0xbc8
00bf3688	mov w0,#0x1
00bf368c	sub x22,x8,#0x1
00bf3690	bl 0x00c2bce0
00bf3694	ldp x8,x9,[x20, #0x10]
00bf3698	sub x9,x9,x8
00bf369c	asr x10,x9,#0x3
00bf36a0	cmp x10,x22
00bf36a4	b.hi 0x00bf36d0
00bf36a8	add x9,x22,#0x1
00bf36ac	subs x1,x9,x10
00bf36b0	b.ls 0x00bf36c4
00bf36b4	mov x0,x19
00bf36b8	bl 0x00c0b6e4
00bf36bc	ldr x8,[x19]
00bf36c0	b 0x00bf36d0
00bf36c4	b.cs 0x00bf36d0
00bf36c8	add x9,x8,x9, LSL #0x3
00bf36cc	str x9,[x20, #0x18]
00bf36d0	ldr x21,[x8, x22, LSL #0x3]
00bf36d4	cbz x21,0x00bf36f8
00bf36d8	add x1,x21,#0x8
00bf36dc	mov x0,#-0x1
00bf36e0	bl 0x00c2bd10
00bf36e4	cbnz x0,0x00bf36f8
00bf36e8	ldr x8,[x21]
00bf36ec	mov x0,x21
00bf36f0	ldr x8,[x8, #0x10]
00bf36f4	blr x8
00bf36f8	ldr x8,[x19]
00bf36fc	str x23,[x8, x22, LSL #0x3]
00bf3700	adrp x22,0xd27000
00bf3704	add x22,x22,#0xbd0
00bf3708	mov x1,xzr
00bf370c	mov x0,x22
00bf3710	mov w2,wzr
00bf3714	mov w3,#0x1
00bf3718	bl 0x00c44340
00bf371c	adrp x21,0xcb4000
00bf3720	ldr x21,[x21, #0x998]
00bf3724	str x21,[sp]
00bf3728	ldar x8,[x21]
00bf372c	cmn x8,#0x1
00bf3730	b.eq 0x00bf375c
00bf3734	mov x8,sp
00bf3738	add x9,x29,#0x18
00bf373c	str x8,[x29, #0x18]
00bf3740	str x9,[sp, #0x8]
00bf3744	adrp x0,0xcb4000
00bf3748	nop
00bf374c	adr x2,0xc0bab0
00bf3750	ldr x0,[x0, #0x998]
00bf3754	add x1,sp,#0x8
00bf3758	bl 0x00c305d0
00bf375c	ldrsw x8,[x21, #0x8]
00bf3760	adrp x1,0xd27000
00bf3764	add x1,x1,#0xbd8
00bf3768	mov w0,#0x1
00bf376c	sub x24,x8,#0x1
00bf3770	bl 0x00c2bce0
00bf3774	ldp x8,x9,[x20, #0x10]
00bf3778	sub x9,x9,x8
00bf377c	asr x10,x9,#0x3
00bf3780	cmp x10,x24
00bf3784	b.hi 0x00bf37b0
00bf3788	add x9,x24,#0x1
00bf378c	subs x1,x9,x10
00bf3790	b.ls 0x00bf37a4
00bf3794	mov x0,x19
00bf3798	bl 0x00c0b6e4
00bf379c	ldr x8,[x19]
00bf37a0	b 0x00bf37b0
00bf37a4	b.cs 0x00bf37b0
00bf37a8	add x9,x8,x9, LSL #0x3
00bf37ac	str x9,[x20, #0x18]
00bf37b0	ldr x21,[x8, x24, LSL #0x3]
00bf37b4	cbz x21,0x00bf37d8
00bf37b8	add x1,x21,#0x8
00bf37bc	mov x0,#-0x1
00bf37c0	bl 0x00c2bd10
00bf37c4	cbnz x0,0x00bf37d8
00bf37c8	ldr x8,[x21]
00bf37cc	mov x0,x21
00bf37d0	ldr x8,[x8, #0x10]
00bf37d4	blr x8
00bf37d8	adrp x9,0xcb5000
00bf37dc	ldr x8,[x19]
00bf37e0	adrp x21,0xcb5000
00bf37e4	ldr x9,[x9, #0xc58]
00bf37e8	ldr x21,[x21, #0xb98]
00bf37ec	adrp x23,0xd27000
00bf37f0	add x23,x23,#0xbf0
00bf37f4	str x22,[x8, x24, LSL #0x3]
00bf37f8	add x8,x9,#0x10
00bf37fc	str x21,[sp]
00bf3800	stp x8,xzr,[x23]
00bf3804	ldar x8,[x21]
00bf3808	cmn x8,#0x1
00bf380c	b.eq 0x00bf3838
00bf3810	mov x8,sp
00bf3814	add x9,x29,#0x18
00bf3818	str x8,[x29, #0x18]
00bf381c	str x9,[sp, #0x8]
00bf3820	adrp x0,0xcb5000
00bf3824	nop
00bf3828	adr x2,0xc0bab0
00bf382c	ldr x0,[x0, #0xb98]
00bf3830	add x1,sp,#0x8
00bf3834	bl 0x00c305d0
00bf3838	ldrsw x8,[x21, #0x8]
00bf383c	adrp x1,0xd27000
00bf3840	add x1,x1,#0xbf8
00bf3844	mov w0,#0x1
00bf3848	sub x24,x8,#0x1
00bf384c	bl 0x00c2bce0
00bf3850	ldp x8,x9,[x20, #0x10]
00bf3854	sub x9,x9,x8
00bf3858	asr x10,x9,#0x3
00bf385c	cmp x10,x24
00bf3860	b.hi 0x00bf388c
00bf3864	add x9,x24,#0x1
00bf3868	subs x1,x9,x10
00bf386c	b.ls 0x00bf3880
00bf3870	mov x0,x19
00bf3874	bl 0x00c0b6e4
00bf3878	ldr x8,[x19]
00bf387c	b 0x00bf388c
00bf3880	b.cs 0x00bf388c
00bf3884	add x9,x8,x9, LSL #0x3
00bf3888	str x9,[x20, #0x18]
00bf388c	ldr x21,[x8, x24, LSL #0x3]
00bf3890	cbz x21,0x00bf38b4
00bf3894	add x1,x21,#0x8
00bf3898	mov x0,#-0x1
00bf389c	bl 0x00c2bd10
00bf38a0	cbnz x0,0x00bf38b4
00bf38a4	ldr x8,[x21]
00bf38a8	mov x0,x21
00bf38ac	ldr x8,[x8, #0x10]
00bf38b0	blr x8
00bf38b4	adrp x9,0xcb5000
00bf38b8	ldr x8,[x19]
00bf38bc	adrp x21,0xcb4000
00bf38c0	ldr x9,[x9, #0xc60]
00bf38c4	ldr x21,[x21, #0xf70]
00bf38c8	adrp x22,0xd27000
00bf38cc	add x22,x22,#0xc00
00bf38d0	str x23,[x8, x24, LSL #0x3]
00bf38d4	add x8,x9,#0x10
00bf38d8	str x21,[sp]
00bf38dc	stp x8,xzr,[x22]
00bf38e0	ldar x8,[x21]
00bf38e4	cmn x8,#0x1
00bf38e8	b.eq 0x00bf3914
00bf38ec	mov x8,sp
00bf38f0	add x9,x29,#0x18
00bf38f4	str x8,[x29, #0x18]
00bf38f8	str x9,[sp, #0x8]
00bf38fc	adrp x0,0xcb4000
00bf3900	nop
00bf3904	adr x2,0xc0bab0
00bf3908	ldr x0,[x0, #0xf70]
00bf390c	add x1,sp,#0x8
00bf3910	bl 0x00c305d0
00bf3914	ldrsw x8,[x21, #0x8]
00bf3918	adrp x1,0xd27000
00bf391c	add x1,x1,#0xc08
00bf3920	mov w0,#0x1
00bf3924	sub x23,x8,#0x1
00bf3928	bl 0x00c2bce0
00bf392c	ldp x8,x9,[x20, #0x10]
00bf3930	sub x9,x9,x8
00bf3934	asr x10,x9,#0x3
00bf3938	cmp x10,x23
00bf393c	b.hi 0x00bf3968
00bf3940	add x9,x23,#0x1
00bf3944	subs x1,x9,x10
00bf3948	b.ls 0x00bf395c
00bf394c	mov x0,x19
00bf3950	bl 0x00c0b6e4
00bf3954	ldr x8,[x19]
00bf3958	b 0x00bf3968
00bf395c	b.cs 0x00bf3968
00bf3960	add x9,x8,x9, LSL #0x3
00bf3964	str x9,[x20, #0x18]
00bf3968	ldr x21,[x8, x23, LSL #0x3]
00bf396c	cbz x21,0x00bf3990
00bf3970	add x1,x21,#0x8
00bf3974	mov x0,#-0x1
00bf3978	bl 0x00c2bd10
00bf397c	cbnz x0,0x00bf3990
00bf3980	ldr x8,[x21]
00bf3984	mov x0,x21
00bf3988	ldr x8,[x8, #0x10]
00bf398c	blr x8
00bf3990	ldr x8,[x19]
00bf3994	str x22,[x8, x23, LSL #0x3]
00bf3998	adrp x22,0xd27000
00bf399c	add x22,x22,#0xc10
00bf39a0	mov w1,#0x1
00bf39a4	mov x0,x22
00bf39a8	bl 0x00c44350
00bf39ac	adrp x21,0xcb5000
00bf39b0	ldr x21,[x21, #0xbf0]
00bf39b4	str x21,[sp]
00bf39b8	ldar x8,[x21]
00bf39bc	cmn x8,#0x1
00bf39c0	b.eq 0x00bf39ec
00bf39c4	mov x8,sp
00bf39c8	add x9,x29,#0x18
00bf39cc	str x8,[x29, #0x18]
00bf39d0	str x9,[sp, #0x8]
00bf39d4	adrp x0,0xcb5000
00bf39d8	nop
00bf39dc	adr x2,0xc0bab0
00bf39e0	ldr x0,[x0, #0xbf0]
00bf39e4	add x1,sp,#0x8
00bf39e8	bl 0x00c305d0
00bf39ec	ldrsw x8,[x21, #0x8]
00bf39f0	adrp x1,0xd27000
00bf39f4	add x1,x1,#0xc18
00bf39f8	mov w0,#0x1
00bf39fc	sub x24,x8,#0x1
00bf3a00	bl 0x00c2bce0
00bf3a04	ldp x8,x9,[x20, #0x10]
00bf3a08	sub x9,x9,x8
00bf3a0c	asr x10,x9,#0x3
00bf3a10	cmp x10,x24
00bf3a14	b.hi 0x00bf3a40
00bf3a18	add x9,x24,#0x1
00bf3a1c	subs x1,x9,x10
00bf3a20	b.ls 0x00bf3a34
00bf3a24	mov x0,x19
00bf3a28	bl 0x00c0b6e4
00bf3a2c	ldr x8,[x19]
00bf3a30	b 0x00bf3a40
00bf3a34	b.cs 0x00bf3a40
00bf3a38	add x9,x8,x9, LSL #0x3
00bf3a3c	str x9,[x20, #0x18]
00bf3a40	ldr x21,[x8, x24, LSL #0x3]
00bf3a44	cbz x21,0x00bf3a68
00bf3a48	add x1,x21,#0x8
00bf3a4c	mov x0,#-0x1
00bf3a50	bl 0x00c2bd10
00bf3a54	cbnz x0,0x00bf3a68
00bf3a58	ldr x8,[x21]
00bf3a5c	mov x0,x21
00bf3a60	ldr x8,[x8, #0x10]
00bf3a64	blr x8
00bf3a68	adrp x9,0xcb5000
00bf3a6c	ldr x8,[x19]
00bf3a70	adrp x21,0xcb5000
00bf3a74	ldr x9,[x9, #0xc68]
00bf3a78	ldr x21,[x21, #0xc70]
00bf3a7c	adrp x23,0xd27000
00bf3a80	add x23,x23,#0xc28
00bf3a84	str x22,[x8, x24, LSL #0x3]
00bf3a88	add x8,x9,#0x10
00bf3a8c	str x21,[sp]
00bf3a90	stp x8,xzr,[x23]
00bf3a94	ldar x8,[x21]
00bf3a98	cmn x8,#0x1
00bf3a9c	b.eq 0x00bf3ac8
00bf3aa0	mov x8,sp
00bf3aa4	add x9,x29,#0x18
00bf3aa8	str x8,[x29, #0x18]
00bf3aac	str x9,[sp, #0x8]
00bf3ab0	adrp x0,0xcb5000
00bf3ab4	nop
00bf3ab8	adr x2,0xc0bab0
00bf3abc	ldr x0,[x0, #0xc70]
00bf3ac0	add x1,sp,#0x8
00bf3ac4	bl 0x00c305d0
00bf3ac8	ldrsw x8,[x21, #0x8]
00bf3acc	adrp x1,0xd27000
00bf3ad0	add x1,x1,#0xc30
00bf3ad4	mov w0,#0x1
00bf3ad8	sub x24,x8,#0x1
00bf3adc	bl 0x00c2bce0
00bf3ae0	ldp x8,x9,[x20, #0x10]
00bf3ae4	sub x9,x9,x8
00bf3ae8	asr x10,x9,#0x3
00bf3aec	cmp x10,x24
00bf3af0	b.hi 0x00bf3b1c
00bf3af4	add x9,x24,#0x1
00bf3af8	subs x1,x9,x10
00bf3afc	b.ls 0x00bf3b10
00bf3b00	mov x0,x19
00bf3b04	bl 0x00c0b6e4
00bf3b08	ldr x8,[x19]
00bf3b0c	b 0x00bf3b1c
00bf3b10	b.cs 0x00bf3b1c
00bf3b14	add x9,x8,x9, LSL #0x3
00bf3b18	str x9,[x20, #0x18]
00bf3b1c	ldr x21,[x8, x24, LSL #0x3]
00bf3b20	cbz x21,0x00bf3b44
00bf3b24	add x1,x21,#0x8
00bf3b28	mov x0,#-0x1
00bf3b2c	bl 0x00c2bd10
00bf3b30	cbnz x0,0x00bf3b44
00bf3b34	ldr x8,[x21]
00bf3b38	mov x0,x21
00bf3b3c	ldr x8,[x8, #0x10]
00bf3b40	blr x8
00bf3b44	adrp x9,0xcb5000
00bf3b48	ldr x8,[x19]
00bf3b4c	adrp x21,0xcb5000
00bf3b50	ldr x9,[x9, #0xc78]
00bf3b54	ldr x21,[x21, #0xc80]
00bf3b58	adrp x22,0xd27000
00bf3b5c	add x22,x22,#0xc38
00bf3b60	str x23,[x8, x24, LSL #0x3]
00bf3b64	add x8,x9,#0x10
00bf3b68	str x21,[sp]
00bf3b6c	stp x8,xzr,[x22]
00bf3b70	ldar x8,[x21]
00bf3b74	cmn x8,#0x1
00bf3b78	b.eq 0x00bf3ba4
00bf3b7c	mov x8,sp
00bf3b80	add x9,x29,#0x18
00bf3b84	str x8,[x29, #0x18]
00bf3b88	str x9,[sp, #0x8]
00bf3b8c	adrp x0,0xcb5000
00bf3b90	nop
00bf3b94	adr x2,0xc0bab0
00bf3b98	ldr x0,[x0, #0xc80]
00bf3b9c	add x1,sp,#0x8
00bf3ba0	bl 0x00c305d0
00bf3ba4	ldrsw x8,[x21, #0x8]
00bf3ba8	adrp x1,0xd27000
00bf3bac	add x1,x1,#0xc40
00bf3bb0	mov w0,#0x1
00bf3bb4	sub x24,x8,#0x1
00bf3bb8	bl 0x00c2bce0
00bf3bbc	ldp x8,x9,[x20, #0x10]
00bf3bc0	sub x9,x9,x8
00bf3bc4	asr x10,x9,#0x3
00bf3bc8	cmp x10,x24
00bf3bcc	b.hi 0x00bf3bf8
00bf3bd0	add x9,x24,#0x1
00bf3bd4	subs x1,x9,x10
00bf3bd8	b.ls 0x00bf3bec
00bf3bdc	mov x0,x19
00bf3be0	bl 0x00c0b6e4
00bf3be4	ldr x8,[x19]
00bf3be8	b 0x00bf3bf8
00bf3bec	b.cs 0x00bf3bf8
00bf3bf0	add x9,x8,x9, LSL #0x3
00bf3bf4	str x9,[x20, #0x18]
00bf3bf8	ldr x21,[x8, x24, LSL #0x3]
00bf3bfc	cbz x21,0x00bf3c20
00bf3c00	add x1,x21,#0x8
00bf3c04	mov x0,#-0x1
00bf3c08	bl 0x00c2bd10
00bf3c0c	cbnz x0,0x00bf3c20
00bf3c10	ldr x8,[x21]
00bf3c14	mov x0,x21
00bf3c18	ldr x8,[x8, #0x10]
00bf3c1c	blr x8
00bf3c20	adrp x9,0xcb5000
00bf3c24	ldr x8,[x19]
00bf3c28	adrp x21,0xcb5000
00bf3c2c	ldr x9,[x9, #0xc88]
00bf3c30	ldr x21,[x21, #0xc90]
00bf3c34	adrp x23,0xd27000
00bf3c38	add x23,x23,#0xc48
00bf3c3c	str x22,[x8, x24, LSL #0x3]
00bf3c40	add x8,x9,#0x10
00bf3c44	str x21,[sp]
00bf3c48	stp x8,xzr,[x23]
00bf3c4c	ldar x8,[x21]
00bf3c50	cmn x8,#0x1
00bf3c54	b.eq 0x00bf3c80
00bf3c58	mov x8,sp
00bf3c5c	add x9,x29,#0x18
00bf3c60	str x8,[x29, #0x18]
00bf3c64	str x9,[sp, #0x8]
00bf3c68	adrp x0,0xcb5000
00bf3c6c	nop
00bf3c70	adr x2,0xc0bab0
00bf3c74	ldr x0,[x0, #0xc90]
00bf3c78	add x1,sp,#0x8
00bf3c7c	bl 0x00c305d0
00bf3c80	ldrsw x8,[x21, #0x8]
00bf3c84	adrp x1,0xd27000
00bf3c88	add x1,x1,#0xc50
00bf3c8c	mov w0,#0x1
00bf3c90	sub x24,x8,#0x1
00bf3c94	bl 0x00c2bce0
00bf3c98	ldp x8,x9,[x20, #0x10]
00bf3c9c	sub x9,x9,x8
00bf3ca0	asr x10,x9,#0x3
00bf3ca4	cmp x10,x24
00bf3ca8	b.hi 0x00bf3cd4
00bf3cac	add x9,x24,#0x1
00bf3cb0	subs x1,x9,x10
00bf3cb4	b.ls 0x00bf3cc8
00bf3cb8	mov x0,x19
00bf3cbc	bl 0x00c0b6e4
00bf3cc0	ldr x8,[x19]
00bf3cc4	b 0x00bf3cd4
00bf3cc8	b.cs 0x00bf3cd4
00bf3ccc	add x9,x8,x9, LSL #0x3
00bf3cd0	str x9,[x20, #0x18]
00bf3cd4	ldr x21,[x8, x24, LSL #0x3]
00bf3cd8	cbz x21,0x00bf3cfc
00bf3cdc	add x1,x21,#0x8
00bf3ce0	mov x0,#-0x1
00bf3ce4	bl 0x00c2bd10
00bf3ce8	cbnz x0,0x00bf3cfc
00bf3cec	ldr x8,[x21]
00bf3cf0	mov x0,x21
00bf3cf4	ldr x8,[x8, #0x10]
00bf3cf8	blr x8
00bf3cfc	adrp x9,0xcb5000
00bf3d00	ldr x8,[x19]
00bf3d04	adrp x21,0xcb5000
00bf3d08	ldr x9,[x9, #0xc98]
00bf3d0c	ldr x21,[x21, #0xca0]
00bf3d10	adrp x22,0xd27000
00bf3d14	add x22,x22,#0xc58
00bf3d18	str x23,[x8, x24, LSL #0x3]
00bf3d1c	add x8,x9,#0x10
00bf3d20	str x21,[sp]
00bf3d24	stp x8,xzr,[x22]
00bf3d28	ldar x8,[x21]
00bf3d2c	cmn x8,#0x1
00bf3d30	b.eq 0x00bf3d5c
00bf3d34	mov x8,sp
00bf3d38	add x9,x29,#0x18
00bf3d3c	str x8,[x29, #0x18]
00bf3d40	str x9,[sp, #0x8]
00bf3d44	adrp x0,0xcb5000
00bf3d48	nop
00bf3d4c	adr x2,0xc0bab0
00bf3d50	ldr x0,[x0, #0xca0]
00bf3d54	add x1,sp,#0x8
00bf3d58	bl 0x00c305d0
00bf3d5c	ldrsw x8,[x21, #0x8]
00bf3d60	adrp x1,0xd27000
00bf3d64	add x1,x1,#0xc60
00bf3d68	mov w0,#0x1
00bf3d6c	sub x23,x8,#0x1
00bf3d70	bl 0x00c2bce0
00bf3d74	ldp x8,x9,[x20, #0x10]
00bf3d78	sub x9,x9,x8
00bf3d7c	asr x10,x9,#0x3
00bf3d80	cmp x10,x23
00bf3d84	b.hi 0x00bf3db0
00bf3d88	add x9,x23,#0x1
00bf3d8c	subs x1,x9,x10
00bf3d90	b.ls 0x00bf3da4
00bf3d94	mov x0,x19
00bf3d98	bl 0x00c0b6e4
00bf3d9c	ldr x8,[x19]
00bf3da0	b 0x00bf3db0
00bf3da4	b.cs 0x00bf3db0
00bf3da8	add x9,x8,x9, LSL #0x3
00bf3dac	str x9,[x20, #0x18]
00bf3db0	ldr x21,[x8, x23, LSL #0x3]
00bf3db4	cbz x21,0x00bf3dd8
00bf3db8	add x1,x21,#0x8
00bf3dbc	mov x0,#-0x1
00bf3dc0	bl 0x00c2bd10
00bf3dc4	cbnz x0,0x00bf3dd8
00bf3dc8	ldr x8,[x21]
00bf3dcc	mov x0,x21
00bf3dd0	ldr x8,[x8, #0x10]
00bf3dd4	blr x8
00bf3dd8	ldr x8,[x19]
00bf3ddc	str x22,[x8, x23, LSL #0x3]
00bf3de0	adrp x22,0xd27000
00bf3de4	add x22,x22,#0xc68
00bf3de8	mov w1,#0x1
00bf3dec	mov x0,x22
00bf3df0	bl 0x00c44360
00bf3df4	adrp x21,0xcb5000
00bf3df8	ldr x21,[x21, #0xc00]
00bf3dfc	str x21,[sp]
00bf3e00	ldar x8,[x21]
00bf3e04	cmn x8,#0x1
00bf3e08	b.eq 0x00bf3e34
00bf3e0c	mov x8,sp
00bf3e10	add x9,x29,#0x18
00bf3e14	str x8,[x29, #0x18]
00bf3e18	str x9,[sp, #0x8]
00bf3e1c	adrp x0,0xcb5000
00bf3e20	nop
00bf3e24	adr x2,0xc0bab0
00bf3e28	ldr x0,[x0, #0xc00]
00bf3e2c	add x1,sp,#0x8
00bf3e30	bl 0x00c305d0
00bf3e34	ldrsw x8,[x21, #0x8]
00bf3e38	adrp x1,0xd27000
00bf3e3c	add x1,x1,#0xc70
00bf3e40	mov w0,#0x1
00bf3e44	sub x23,x8,#0x1
00bf3e48	bl 0x00c2bce0
00bf3e4c	ldp x8,x9,[x20, #0x10]
00bf3e50	sub x9,x9,x8
00bf3e54	asr x10,x9,#0x3
00bf3e58	cmp x10,x23
00bf3e5c	b.hi 0x00bf3e88
00bf3e60	add x9,x23,#0x1
00bf3e64	subs x1,x9,x10
00bf3e68	b.ls 0x00bf3e7c
00bf3e6c	mov x0,x19
00bf3e70	bl 0x00c0b6e4
00bf3e74	ldr x8,[x19]
00bf3e78	b 0x00bf3e88
00bf3e7c	b.cs 0x00bf3e88
00bf3e80	add x9,x8,x9, LSL #0x3
00bf3e84	str x9,[x20, #0x18]
00bf3e88	ldr x21,[x8, x23, LSL #0x3]
00bf3e8c	cbz x21,0x00bf3eb0
00bf3e90	add x1,x21,#0x8
00bf3e94	mov x0,#-0x1
00bf3e98	bl 0x00c2bd10
00bf3e9c	cbnz x0,0x00bf3eb0
00bf3ea0	ldr x8,[x21]
00bf3ea4	mov x0,x21
00bf3ea8	ldr x8,[x8, #0x10]
00bf3eac	blr x8
00bf3eb0	ldr x8,[x19]
00bf3eb4	str x22,[x8, x23, LSL #0x3]
00bf3eb8	adrp x22,0xd27000
00bf3ebc	add x22,x22,#0xc98
00bf3ec0	mov w1,#0x1
00bf3ec4	mov x0,x22
00bf3ec8	bl 0x00c44370
00bf3ecc	adrp x21,0xcb5000
00bf3ed0	ldr x21,[x21, #0xc10]
00bf3ed4	str x21,[sp]
00bf3ed8	ldar x8,[x21]
00bf3edc	cmn x8,#0x1
00bf3ee0	b.eq 0x00bf3f0c
00bf3ee4	mov x8,sp
00bf3ee8	add x9,x29,#0x18
00bf3eec	str x8,[x29, #0x18]
00bf3ef0	str x9,[sp, #0x8]
00bf3ef4	adrp x0,0xcb5000
00bf3ef8	nop
00bf3efc	adr x2,0xc0bab0
00bf3f00	ldr x0,[x0, #0xc10]
00bf3f04	add x1,sp,#0x8
00bf3f08	bl 0x00c305d0
00bf3f0c	ldrsw x8,[x21, #0x8]
00bf3f10	adrp x1,0xd27000
00bf3f14	add x1,x1,#0xca0
00bf3f18	mov w0,#0x1
00bf3f1c	sub x24,x8,#0x1
00bf3f20	bl 0x00c2bce0
00bf3f24	ldp x8,x9,[x20, #0x10]
00bf3f28	sub x9,x9,x8
00bf3f2c	asr x10,x9,#0x3
00bf3f30	cmp x10,x24
00bf3f34	b.hi 0x00bf3f60
00bf3f38	add x9,x24,#0x1
00bf3f3c	subs x1,x9,x10
00bf3f40	b.ls 0x00bf3f54
00bf3f44	mov x0,x19
00bf3f48	bl 0x00c0b6e4
00bf3f4c	ldr x8,[x19]
00bf3f50	b 0x00bf3f60
00bf3f54	b.cs 0x00bf3f60
00bf3f58	add x9,x8,x9, LSL #0x3
00bf3f5c	str x9,[x20, #0x18]
00bf3f60	ldr x21,[x8, x24, LSL #0x3]
00bf3f64	cbz x21,0x00bf3f88
00bf3f68	add x1,x21,#0x8
00bf3f6c	mov x0,#-0x1
00bf3f70	bl 0x00c2bd10
00bf3f74	cbnz x0,0x00bf3f88
00bf3f78	ldr x8,[x21]
00bf3f7c	mov x0,x21
00bf3f80	ldr x8,[x8, #0x10]
00bf3f84	blr x8
00bf3f88	adrp x9,0xcb5000
00bf3f8c	ldr x8,[x19]
00bf3f90	adrp x21,0xcb4000
00bf3f94	ldr x9,[x9, #0xca8]
00bf3f98	ldr x21,[x21, #0xf38]
00bf3f9c	adrp x23,0xd27000
00bf3fa0	add x23,x23,#0xcc8
00bf3fa4	str x22,[x8, x24, LSL #0x3]
00bf3fa8	add x8,x9,#0x10
00bf3fac	str x21,[sp]
00bf3fb0	stp x8,xzr,[x23]
00bf3fb4	ldar x8,[x21]
00bf3fb8	cmn x8,#0x1
00bf3fbc	b.eq 0x00bf3fe8
00bf3fc0	mov x8,sp
00bf3fc4	add x9,x29,#0x18
00bf3fc8	str x8,[x29, #0x18]
00bf3fcc	str x9,[sp, #0x8]
00bf3fd0	adrp x0,0xcb4000
00bf3fd4	nop
00bf3fd8	adr x2,0xc0bab0
00bf3fdc	ldr x0,[x0, #0xf38]
00bf3fe0	add x1,sp,#0x8
00bf3fe4	bl 0x00c305d0
00bf3fe8	ldrsw x8,[x21, #0x8]
00bf3fec	adrp x1,0xd27000
00bf3ff0	add x1,x1,#0xcd0
00bf3ff4	mov w0,#0x1
00bf3ff8	sub x24,x8,#0x1
00bf3ffc	bl 0x00c2bce0
00bf4000	ldp x8,x9,[x20, #0x10]
00bf4004	sub x9,x9,x8
00bf4008	asr x10,x9,#0x3
00bf400c	cmp x10,x24
00bf4010	b.hi 0x00bf403c
00bf4014	add x9,x24,#0x1
00bf4018	subs x1,x9,x10
00bf401c	b.ls 0x00bf4030
00bf4020	mov x0,x19
00bf4024	bl 0x00c0b6e4
00bf4028	ldr x8,[x19]
00bf402c	b 0x00bf403c
00bf4030	b.cs 0x00bf403c
00bf4034	add x9,x8,x9, LSL #0x3
00bf4038	str x9,[x20, #0x18]
00bf403c	ldr x21,[x8, x24, LSL #0x3]
00bf4040	cbz x21,0x00bf4064
00bf4044	add x1,x21,#0x8
00bf4048	mov x0,#-0x1
00bf404c	bl 0x00c2bd10
00bf4050	cbnz x0,0x00bf4064
00bf4054	ldr x8,[x21]
00bf4058	mov x0,x21
00bf405c	ldr x8,[x8, #0x10]
00bf4060	blr x8
00bf4064	adrp x9,0xcb5000
00bf4068	ldr x8,[x19]
00bf406c	adrp x21,0xcb5000
00bf4070	ldr x9,[x9, #0xcb0]
00bf4074	ldr x21,[x21, #0xba0]
00bf4078	adrp x22,0xd27000
00bf407c	add x22,x22,#0xcd8
00bf4080	str x23,[x8, x24, LSL #0x3]
00bf4084	add x8,x9,#0x10
00bf4088	str x21,[sp]
00bf408c	stp x8,xzr,[x22]
00bf4090	ldar x8,[x21]
00bf4094	cmn x8,#0x1
00bf4098	b.eq 0x00bf40c4
00bf409c	mov x8,sp
00bf40a0	add x9,x29,#0x18
00bf40a4	str x8,[x29, #0x18]
00bf40a8	str x9,[sp, #0x8]
00bf40ac	adrp x0,0xcb5000
00bf40b0	nop
00bf40b4	adr x2,0xc0bab0
00bf40b8	ldr x0,[x0, #0xba0]
00bf40bc	add x1,sp,#0x8
00bf40c0	bl 0x00c305d0
00bf40c4	ldrsw x8,[x21, #0x8]
00bf40c8	adrp x1,0xd27000
00bf40cc	add x1,x1,#0xce0
00bf40d0	mov w0,#0x1
00bf40d4	sub x24,x8,#0x1
00bf40d8	bl 0x00c2bce0
00bf40dc	ldp x8,x9,[x20, #0x10]
00bf40e0	sub x9,x9,x8
00bf40e4	asr x10,x9,#0x3
00bf40e8	cmp x10,x24
00bf40ec	b.hi 0x00bf4118
00bf40f0	add x9,x24,#0x1
00bf40f4	subs x1,x9,x10
00bf40f8	b.ls 0x00bf410c
00bf40fc	mov x0,x19
00bf4100	bl 0x00c0b6e4
00bf4104	ldr x8,[x19]
00bf4108	b 0x00bf4118
00bf410c	b.cs 0x00bf4118
00bf4110	add x9,x8,x9, LSL #0x3
00bf4114	str x9,[x20, #0x18]
00bf4118	ldr x21,[x8, x24, LSL #0x3]
00bf411c	cbz x21,0x00bf4140
00bf4120	add x1,x21,#0x8
00bf4124	mov x0,#-0x1
00bf4128	bl 0x00c2bd10
00bf412c	cbnz x0,0x00bf4140
00bf4130	ldr x8,[x21]
00bf4134	mov x0,x21
00bf4138	ldr x8,[x8, #0x10]
00bf413c	blr x8
00bf4140	adrp x9,0xcb5000
00bf4144	ldr x8,[x19]
00bf4148	adrp x21,0xcb4000
00bf414c	ldr x9,[x9, #0xcb8]
00bf4150	ldr x21,[x21, #0xf40]
00bf4154	adrp x23,0xd27000
00bf4158	add x23,x23,#0xce8
00bf415c	str x22,[x8, x24, LSL #0x3]
00bf4160	add x8,x9,#0x10
00bf4164	str x21,[sp]
00bf4168	stp x8,xzr,[x23]
00bf416c	ldar x8,[x21]
00bf4170	cmn x8,#0x1
00bf4174	b.eq 0x00bf41a0
00bf4178	mov x8,sp
00bf417c	add x9,x29,#0x18
00bf4180	str x8,[x29, #0x18]
00bf4184	str x9,[sp, #0x8]
00bf4188	adrp x0,0xcb4000
00bf418c	nop
00bf4190	adr x2,0xc0bab0
00bf4194	ldr x0,[x0, #0xf40]
00bf4198	add x1,sp,#0x8
00bf419c	bl 0x00c305d0
00bf41a0	ldrsw x8,[x21, #0x8]
00bf41a4	adrp x1,0xd27000
00bf41a8	add x1,x1,#0xcf0
00bf41ac	mov w0,#0x1
00bf41b0	sub x24,x8,#0x1
00bf41b4	bl 0x00c2bce0
00bf41b8	ldp x8,x9,[x20, #0x10]
00bf41bc	sub x9,x9,x8
00bf41c0	asr x10,x9,#0x3
00bf41c4	cmp x10,x24
00bf41c8	b.hi 0x00bf41f4
00bf41cc	add x9,x24,#0x1
00bf41d0	subs x1,x9,x10
00bf41d4	b.ls 0x00bf41e8
00bf41d8	mov x0,x19
00bf41dc	bl 0x00c0b6e4
00bf41e0	ldr x8,[x19]
00bf41e4	b 0x00bf41f4
00bf41e8	b.cs 0x00bf41f4
00bf41ec	add x9,x8,x9, LSL #0x3
00bf41f0	str x9,[x20, #0x18]
00bf41f4	ldr x21,[x8, x24, LSL #0x3]
00bf41f8	cbz x21,0x00bf421c
00bf41fc	add x1,x21,#0x8
00bf4200	mov x0,#-0x1
00bf4204	bl 0x00c2bd10
00bf4208	cbnz x0,0x00bf421c
00bf420c	ldr x8,[x21]
00bf4210	mov x0,x21
00bf4214	ldr x8,[x8, #0x10]
00bf4218	blr x8
00bf421c	adrp x9,0xcb5000
00bf4220	ldr x8,[x19]
00bf4224	adrp x21,0xcb5000
00bf4228	ldr x9,[x9, #0xcc0]
00bf422c	ldr x21,[x21, #0xbb0]
00bf4230	adrp x22,0xd27000
00bf4234	add x22,x22,#0xcf8
00bf4238	str x23,[x8, x24, LSL #0x3]
00bf423c	add x8,x9,#0x10
00bf4240	str x21,[sp]
00bf4244	stp x8,xzr,[x22]
00bf4248	ldar x8,[x21]
00bf424c	cmn x8,#0x1
00bf4250	b.eq 0x00bf427c
00bf4254	mov x8,sp
00bf4258	add x9,x29,#0x18
00bf425c	str x8,[x29, #0x18]
00bf4260	str x9,[sp, #0x8]
00bf4264	adrp x0,0xcb5000
00bf4268	nop
00bf426c	adr x2,0xc0bab0
00bf4270	ldr x0,[x0, #0xbb0]
00bf4274	add x1,sp,#0x8
00bf4278	bl 0x00c305d0
00bf427c	ldrsw x8,[x21, #0x8]
00bf4280	adrp x1,0xd27000
00bf4284	add x1,x1,#0xd00
00bf4288	mov w0,#0x1
00bf428c	sub x24,x8,#0x1
00bf4290	bl 0x00c2bce0
00bf4294	ldp x8,x9,[x20, #0x10]
00bf4298	sub x9,x9,x8
00bf429c	asr x10,x9,#0x3
00bf42a0	cmp x10,x24
00bf42a4	b.hi 0x00bf42d0
00bf42a8	add x9,x24,#0x1
00bf42ac	subs x1,x9,x10
00bf42b0	b.ls 0x00bf42c4
00bf42b4	mov x0,x19
00bf42b8	bl 0x00c0b6e4
00bf42bc	ldr x8,[x19]
00bf42c0	b 0x00bf42d0
00bf42c4	b.cs 0x00bf42d0
00bf42c8	add x9,x8,x9, LSL #0x3
00bf42cc	str x9,[x20, #0x18]
00bf42d0	ldr x21,[x8, x24, LSL #0x3]
00bf42d4	cbz x21,0x00bf42f8
00bf42d8	add x1,x21,#0x8
00bf42dc	mov x0,#-0x1
00bf42e0	bl 0x00c2bd10
00bf42e4	cbnz x0,0x00bf42f8
00bf42e8	ldr x8,[x21]
00bf42ec	mov x0,x21
00bf42f0	ldr x8,[x8, #0x10]
00bf42f4	blr x8
00bf42f8	adrp x9,0xcb5000
00bf42fc	ldr x8,[x19]
00bf4300	adrp x21,0xcb5000
00bf4304	ldr x9,[x9, #0xcc8]
00bf4308	ldr x21,[x21, #0xc28]
00bf430c	adrp x23,0xd27000
00bf4310	add x23,x23,#0xd08
00bf4314	str x22,[x8, x24, LSL #0x3]
00bf4318	add x8,x9,#0x10
00bf431c	str x21,[sp]
00bf4320	stp x8,xzr,[x23]
00bf4324	ldar x8,[x21]
00bf4328	cmn x8,#0x1
00bf432c	b.eq 0x00bf4358
00bf4330	mov x8,sp
00bf4334	add x9,x29,#0x18
00bf4338	str x8,[x29, #0x18]
00bf433c	str x9,[sp, #0x8]
00bf4340	adrp x0,0xcb5000
00bf4344	nop
00bf4348	adr x2,0xc0bab0
00bf434c	ldr x0,[x0, #0xc28]
00bf4350	add x1,sp,#0x8
00bf4354	bl 0x00c305d0
00bf4358	ldrsw x8,[x21, #0x8]
00bf435c	adrp x1,0xd27000
00bf4360	add x1,x1,#0xd10
00bf4364	mov w0,#0x1
00bf4368	sub x24,x8,#0x1
00bf436c	bl 0x00c2bce0
00bf4370	ldp x8,x9,[x20, #0x10]
00bf4374	sub x9,x9,x8
00bf4378	asr x10,x9,#0x3
00bf437c	cmp x10,x24
00bf4380	b.hi 0x00bf43ac
00bf4384	add x9,x24,#0x1
00bf4388	subs x1,x9,x10
00bf438c	b.ls 0x00bf43a0
00bf4390	mov x0,x19
00bf4394	bl 0x00c0b6e4
00bf4398	ldr x8,[x19]
00bf439c	b 0x00bf43ac
00bf43a0	b.cs 0x00bf43ac
00bf43a4	add x9,x8,x9, LSL #0x3
00bf43a8	str x9,[x20, #0x18]
00bf43ac	ldr x21,[x8, x24, LSL #0x3]
00bf43b0	cbz x21,0x00bf43d4
00bf43b4	add x1,x21,#0x8
00bf43b8	mov x0,#-0x1
00bf43bc	bl 0x00c2bd10
00bf43c0	cbnz x0,0x00bf43d4
00bf43c4	ldr x8,[x21]
00bf43c8	mov x0,x21
00bf43cc	ldr x8,[x8, #0x10]
00bf43d0	blr x8
00bf43d4	adrp x9,0xcb5000
00bf43d8	ldr x8,[x19]
00bf43dc	adrp x21,0xcb5000
00bf43e0	ldr x9,[x9, #0xcd0]
00bf43e4	ldr x21,[x21, #0xc20]
00bf43e8	adrp x22,0xd27000
00bf43ec	add x22,x22,#0xd18
00bf43f0	str x23,[x8, x24, LSL #0x3]
00bf43f4	add x8,x9,#0x10
00bf43f8	str x21,[sp]
00bf43fc	stp x8,xzr,[x22]
00bf4400	ldar x8,[x21]
00bf4404	cmn x8,#0x1
00bf4408	b.eq 0x00bf4434
00bf440c	mov x8,sp
00bf4410	add x9,x29,#0x18
00bf4414	str x8,[x29, #0x18]
00bf4418	str x9,[sp, #0x8]
00bf441c	adrp x0,0xcb5000
00bf4420	nop
00bf4424	adr x2,0xc0bab0
00bf4428	ldr x0,[x0, #0xc20]
00bf442c	add x1,sp,#0x8
00bf4430	bl 0x00c305d0
00bf4434	ldrsw x8,[x21, #0x8]
00bf4438	adrp x1,0xd27000
00bf443c	add x1,x1,#0xd20
00bf4440	mov w0,#0x1
00bf4444	sub x24,x8,#0x1
00bf4448	bl 0x00c2bce0
00bf444c	ldp x8,x9,[x20, #0x10]
00bf4450	sub x9,x9,x8
00bf4454	asr x10,x9,#0x3
00bf4458	cmp x10,x24
00bf445c	b.hi 0x00bf4488
00bf4460	add x9,x24,#0x1
00bf4464	subs x1,x9,x10
00bf4468	b.ls 0x00bf447c
00bf446c	mov x0,x19
00bf4470	bl 0x00c0b6e4
00bf4474	ldr x8,[x19]
00bf4478	b 0x00bf4488
00bf447c	b.cs 0x00bf4488
00bf4480	add x9,x8,x9, LSL #0x3
00bf4484	str x9,[x20, #0x18]
00bf4488	ldr x21,[x8, x24, LSL #0x3]
00bf448c	cbz x21,0x00bf44b0
00bf4490	add x1,x21,#0x8
00bf4494	mov x0,#-0x1
00bf4498	bl 0x00c2bd10
00bf449c	cbnz x0,0x00bf44b0
00bf44a0	ldr x8,[x21]
00bf44a4	mov x0,x21
00bf44a8	ldr x8,[x8, #0x10]
00bf44ac	blr x8
00bf44b0	adrp x9,0xcb5000
00bf44b4	ldr x8,[x19]
00bf44b8	adrp x21,0xcb5000
00bf44bc	ldr x9,[x9, #0xcd8]
00bf44c0	ldr x21,[x21, #0xc38]
00bf44c4	adrp x23,0xd27000
00bf44c8	add x23,x23,#0xd28
00bf44cc	str x22,[x8, x24, LSL #0x3]
00bf44d0	add x8,x9,#0x10
00bf44d4	str x21,[sp]
00bf44d8	stp x8,xzr,[x23]
00bf44dc	ldar x8,[x21]
00bf44e0	cmn x8,#0x1
00bf44e4	b.eq 0x00bf4510
00bf44e8	mov x8,sp
00bf44ec	add x9,x29,#0x18
00bf44f0	str x8,[x29, #0x18]
00bf44f4	str x9,[sp, #0x8]
00bf44f8	adrp x0,0xcb5000
00bf44fc	nop
00bf4500	adr x2,0xc0bab0
00bf4504	ldr x0,[x0, #0xc38]
00bf4508	add x1,sp,#0x8
00bf450c	bl 0x00c305d0
00bf4510	ldrsw x8,[x21, #0x8]
00bf4514	adrp x1,0xd27000
00bf4518	add x1,x1,#0xd30
00bf451c	mov w0,#0x1
00bf4520	sub x24,x8,#0x1
00bf4524	bl 0x00c2bce0
00bf4528	ldp x8,x9,[x20, #0x10]
00bf452c	sub x9,x9,x8
00bf4530	asr x10,x9,#0x3
00bf4534	cmp x10,x24
00bf4538	b.hi 0x00bf4564
00bf453c	add x9,x24,#0x1
00bf4540	subs x1,x9,x10
00bf4544	b.ls 0x00bf4558
00bf4548	mov x0,x19
00bf454c	bl 0x00c0b6e4
00bf4550	ldr x8,[x19]
00bf4554	b 0x00bf4564
00bf4558	b.cs 0x00bf4564
00bf455c	add x9,x8,x9, LSL #0x3
00bf4560	str x9,[x20, #0x18]
00bf4564	ldr x21,[x8, x24, LSL #0x3]
00bf4568	cbz x21,0x00bf458c
00bf456c	add x1,x21,#0x8
00bf4570	mov x0,#-0x1
00bf4574	bl 0x00c2bd10
00bf4578	cbnz x0,0x00bf458c
00bf457c	ldr x8,[x21]
00bf4580	mov x0,x21
00bf4584	ldr x8,[x8, #0x10]
00bf4588	blr x8
00bf458c	adrp x9,0xcb5000
00bf4590	ldr x8,[x19]
00bf4594	adrp x21,0xcb5000
00bf4598	ldr x9,[x9, #0xce0]
00bf459c	ldr x21,[x21, #0xc30]
00bf45a0	adrp x22,0xd27000
00bf45a4	add x22,x22,#0xd38
00bf45a8	str x23,[x8, x24, LSL #0x3]
00bf45ac	add x8,x9,#0x10
00bf45b0	str x21,[sp]
00bf45b4	stp x8,xzr,[x22]
00bf45b8	ldar x8,[x21]
00bf45bc	cmn x8,#0x1
00bf45c0	b.eq 0x00bf45ec
00bf45c4	mov x8,sp
00bf45c8	add x9,x29,#0x18
00bf45cc	str x8,[x29, #0x18]
00bf45d0	str x9,[sp, #0x8]
00bf45d4	adrp x0,0xcb5000
00bf45d8	nop
00bf45dc	adr x2,0xc0bab0
00bf45e0	ldr x0,[x0, #0xc30]
00bf45e4	add x1,sp,#0x8
00bf45e8	bl 0x00c305d0
00bf45ec	ldrsw x8,[x21, #0x8]
00bf45f0	adrp x1,0xd27000
00bf45f4	add x1,x1,#0xd40
00bf45f8	mov w0,#0x1
00bf45fc	sub x24,x8,#0x1
00bf4600	bl 0x00c2bce0
00bf4604	ldp x8,x9,[x20, #0x10]
00bf4608	sub x9,x9,x8
00bf460c	asr x10,x9,#0x3
00bf4610	cmp x10,x24
00bf4614	b.hi 0x00bf4640
00bf4618	add x9,x24,#0x1
00bf461c	subs x1,x9,x10
00bf4620	b.ls 0x00bf4634
00bf4624	mov x0,x19
00bf4628	bl 0x00c0b6e4
00bf462c	ldr x8,[x19]
00bf4630	b 0x00bf4640
00bf4634	b.cs 0x00bf4640
00bf4638	add x9,x8,x9, LSL #0x3
00bf463c	str x9,[x20, #0x18]
00bf4640	ldr x21,[x8, x24, LSL #0x3]
00bf4644	cbz x21,0x00bf4668
00bf4648	add x1,x21,#0x8
00bf464c	mov x0,#-0x1
00bf4650	bl 0x00c2bd10
00bf4654	cbnz x0,0x00bf4668
00bf4658	ldr x8,[x21]
00bf465c	mov x0,x21
00bf4660	ldr x8,[x8, #0x10]
00bf4664	blr x8
00bf4668	adrp x9,0xcb5000
00bf466c	ldr x8,[x19]
00bf4670	adrp x21,0xcb5000
00bf4674	ldr x9,[x9, #0xce8]
00bf4678	ldr x21,[x21, #0xcf0]
00bf467c	adrp x23,0xd27000
00bf4680	add x23,x23,#0xd48
00bf4684	str x22,[x8, x24, LSL #0x3]
00bf4688	add x8,x9,#0x10
00bf468c	str x21,[sp]
00bf4690	stp x8,xzr,[x23]
00bf4694	ldar x8,[x21]
00bf4698	cmn x8,#0x1
00bf469c	b.eq 0x00bf46c8
00bf46a0	mov x8,sp
00bf46a4	add x9,x29,#0x18
00bf46a8	str x8,[x29, #0x18]
00bf46ac	str x9,[sp, #0x8]
00bf46b0	adrp x0,0xcb5000
00bf46b4	nop
00bf46b8	adr x2,0xc0bab0
00bf46bc	ldr x0,[x0, #0xcf0]
00bf46c0	add x1,sp,#0x8
00bf46c4	bl 0x00c305d0
00bf46c8	ldrsw x8,[x21, #0x8]
00bf46cc	adrp x1,0xd27000
00bf46d0	add x1,x1,#0xd50
00bf46d4	mov w0,#0x1
00bf46d8	sub x24,x8,#0x1
00bf46dc	bl 0x00c2bce0
00bf46e0	ldp x8,x9,[x20, #0x10]
00bf46e4	sub x9,x9,x8
00bf46e8	asr x10,x9,#0x3
00bf46ec	cmp x10,x24
00bf46f0	b.hi 0x00bf471c
00bf46f4	add x9,x24,#0x1
00bf46f8	subs x1,x9,x10
00bf46fc	b.ls 0x00bf4710
00bf4700	mov x0,x19
00bf4704	bl 0x00c0b6e4
00bf4708	ldr x8,[x19]
00bf470c	b 0x00bf471c
00bf4710	b.cs 0x00bf471c
00bf4714	add x9,x8,x9, LSL #0x3
00bf4718	str x9,[x20, #0x18]
00bf471c	ldr x21,[x8, x24, LSL #0x3]
00bf4720	cbz x21,0x00bf4744
00bf4724	add x1,x21,#0x8
00bf4728	mov x0,#-0x1
00bf472c	bl 0x00c2bd10
00bf4730	cbnz x0,0x00bf4744
00bf4734	ldr x8,[x21]
00bf4738	mov x0,x21
00bf473c	ldr x8,[x8, #0x10]
00bf4740	blr x8
00bf4744	adrp x9,0xcb5000
00bf4748	ldr x8,[x19]
00bf474c	adrp x21,0xcb5000
00bf4750	ldr x9,[x9, #0xcf8]
00bf4754	ldr x21,[x21, #0xd00]
00bf4758	adrp x22,0xd27000
00bf475c	add x22,x22,#0xd58
00bf4760	str x23,[x8, x24, LSL #0x3]
00bf4764	add x8,x9,#0x10
00bf4768	str x21,[sp]
00bf476c	stp x8,xzr,[x22]
00bf4770	ldar x8,[x21]
00bf4774	cmn x8,#0x1
00bf4778	b.eq 0x00bf47a4
00bf477c	mov x8,sp
00bf4780	add x9,x29,#0x18
00bf4784	str x8,[x29, #0x18]
00bf4788	str x9,[sp, #0x8]
00bf478c	adrp x0,0xcb5000
00bf4790	nop
00bf4794	adr x2,0xc0bab0
00bf4798	ldr x0,[x0, #0xd00]
00bf479c	add x1,sp,#0x8
00bf47a0	bl 0x00c305d0
00bf47a4	ldrsw x8,[x21, #0x8]
00bf47a8	adrp x1,0xd27000
00bf47ac	add x1,x1,#0xd60
00bf47b0	mov w0,#0x1
00bf47b4	sub x23,x8,#0x1
00bf47b8	bl 0x00c2bce0
00bf47bc	ldp x8,x9,[x20, #0x10]
00bf47c0	sub x9,x9,x8
00bf47c4	asr x10,x9,#0x3
00bf47c8	cmp x10,x23
00bf47cc	b.hi 0x00bf47f8
00bf47d0	add x9,x23,#0x1
00bf47d4	subs x1,x9,x10
00bf47d8	b.ls 0x00bf47ec
00bf47dc	mov x0,x19
00bf47e0	bl 0x00c0b6e4
00bf47e4	ldr x8,[x19]
00bf47e8	b 0x00bf47f8
00bf47ec	b.cs 0x00bf47f8
00bf47f0	add x9,x8,x9, LSL #0x3
00bf47f4	str x9,[x20, #0x18]
00bf47f8	ldr x21,[x8, x23, LSL #0x3]
00bf47fc	cbz x21,0x00bf4820
00bf4800	add x1,x21,#0x8
00bf4804	mov x0,#-0x1
00bf4808	bl 0x00c2bd10
00bf480c	cbnz x0,0x00bf4820
00bf4810	ldr x8,[x21]
00bf4814	mov x0,x21
00bf4818	ldr x8,[x8, #0x10]
00bf481c	blr x8
00bf4820	adrp x9,0xcb5000
00bf4824	ldr x8,[x19]
00bf4828	adrp x21,0xcb5000
00bf482c	ldr x9,[x9, #0xd08]
00bf4830	ldr x21,[x21, #0xd10]
00bf4834	adrp x24,0xd27000
00bf4838	add x24,x24,#0xd68
00bf483c	str x22,[x8, x23, LSL #0x3]
00bf4840	add x8,x9,#0x10
00bf4844	str x21,[sp]
00bf4848	stp x8,xzr,[x24]
00bf484c	ldar x8,[x21]
00bf4850	cmn x8,#0x1
00bf4854	b.eq 0x00bf4880
00bf4858	mov x8,sp
00bf485c	add x9,x29,#0x18
00bf4860	str x8,[x29, #0x18]
00bf4864	str x9,[sp, #0x8]
00bf4868	adrp x0,0xcb5000
00bf486c	nop
00bf4870	adr x2,0xc0bab0
00bf4874	ldr x0,[x0, #0xd10]
00bf4878	add x1,sp,#0x8
00bf487c	bl 0x00c305d0
00bf4880	ldrsw x8,[x21, #0x8]
00bf4884	adrp x1,0xd27000
00bf4888	add x1,x1,#0xd70
00bf488c	mov w0,#0x1
00bf4890	sub x22,x8,#0x1
00bf4894	bl 0x00c2bce0
00bf4898	ldp x8,x9,[x20, #0x10]
00bf489c	sub x9,x9,x8
00bf48a0	asr x10,x9,#0x3
00bf48a4	cmp x10,x22
00bf48a8	b.hi 0x00bf48d4
00bf48ac	add x9,x22,#0x1
00bf48b0	subs x1,x9,x10
00bf48b4	b.ls 0x00bf48c8
00bf48b8	mov x0,x19
00bf48bc	bl 0x00c0b6e4
00bf48c0	ldr x8,[x19]
00bf48c4	b 0x00bf48d4
00bf48c8	b.cs 0x00bf48d4
00bf48cc	add x9,x8,x9, LSL #0x3
00bf48d0	str x9,[x20, #0x18]
00bf48d4	ldr x21,[x8, x22, LSL #0x3]
00bf48d8	cbz x21,0x00bf48fc
00bf48dc	add x1,x21,#0x8
00bf48e0	mov x0,#-0x1
00bf48e4	bl 0x00c2bd10
00bf48e8	cbnz x0,0x00bf48fc
00bf48ec	ldr x8,[x21]
00bf48f0	mov x0,x21
00bf48f4	ldr x8,[x8, #0x10]
00bf48f8	blr x8
00bf48fc	adrp x9,0xcb5000
00bf4900	ldr x8,[x19]
00bf4904	adrp x21,0xcb5000
00bf4908	ldr x9,[x9, #0xd18]
00bf490c	ldr x21,[x21, #0xd20]
00bf4910	adrp x23,0xd27000
00bf4914	add x23,x23,#0xd78
00bf4918	str x24,[x8, x22, LSL #0x3]
00bf491c	add x8,x9,#0x10
00bf4920	str x21,[sp]
00bf4924	stp x8,xzr,[x23]
00bf4928	ldar x8,[x21]
00bf492c	cmn x8,#0x1
00bf4930	b.eq 0x00bf495c
00bf4934	mov x8,sp
00bf4938	add x9,x29,#0x18
00bf493c	str x8,[x29, #0x18]
00bf4940	str x9,[sp, #0x8]
00bf4944	adrp x0,0xcb5000
00bf4948	nop
00bf494c	adr x2,0xc0bab0
00bf4950	ldr x0,[x0, #0xd20]
00bf4954	add x1,sp,#0x8
00bf4958	bl 0x00c305d0
00bf495c	ldrsw x8,[x21, #0x8]
00bf4960	adrp x1,0xd27000
00bf4964	add x1,x1,#0xd80
00bf4968	mov w0,#0x1
00bf496c	sub x24,x8,#0x1
00bf4970	bl 0x00c2bce0
00bf4974	ldp x8,x9,[x20, #0x10]
00bf4978	sub x9,x9,x8
00bf497c	asr x10,x9,#0x3
00bf4980	cmp x10,x24
00bf4984	b.hi 0x00bf49b0
00bf4988	add x9,x24,#0x1
00bf498c	subs x1,x9,x10
00bf4990	b.ls 0x00bf49a4
00bf4994	mov x0,x19
00bf4998	bl 0x00c0b6e4
00bf499c	ldr x8,[x19]
00bf49a0	b 0x00bf49b0
00bf49a4	b.cs 0x00bf49b0
00bf49a8	add x9,x8,x9, LSL #0x3
00bf49ac	str x9,[x20, #0x18]
00bf49b0	ldr x21,[x8, x24, LSL #0x3]
00bf49b4	cbz x21,0x00bf49d8
00bf49b8	add x1,x21,#0x8
00bf49bc	mov x0,#-0x1
00bf49c0	bl 0x00c2bd10
00bf49c4	cbnz x0,0x00bf49d8
00bf49c8	ldr x8,[x21]
00bf49cc	mov x0,x21
00bf49d0	ldr x8,[x8, #0x10]
00bf49d4	blr x8
00bf49d8	adrp x9,0xcb5000
00bf49dc	ldr x8,[x19]
00bf49e0	adrp x21,0xcb5000
00bf49e4	ldr x9,[x9, #0xd28]
00bf49e8	ldr x21,[x21, #0xd30]
00bf49ec	adrp x22,0xd27000
00bf49f0	add x22,x22,#0xd88
00bf49f4	str x23,[x8, x24, LSL #0x3]
00bf49f8	add x8,x9,#0x10
00bf49fc	add x9,x9,#0x70
00bf4a00	str x21,[sp]
00bf4a04	stp x8,xzr,[x22]
00bf4a08	str x9,[x22, #0x10]
00bf4a0c	ldar x8,[x21]
00bf4a10	cmn x8,#0x1
00bf4a14	b.eq 0x00bf4a40
00bf4a18	mov x8,sp
00bf4a1c	add x9,x29,#0x18
00bf4a20	str x8,[x29, #0x18]
00bf4a24	str x9,[sp, #0x8]
00bf4a28	adrp x0,0xcb5000
00bf4a2c	nop
00bf4a30	adr x2,0xc0bab0
00bf4a34	ldr x0,[x0, #0xd30]
00bf4a38	add x1,sp,#0x8
00bf4a3c	bl 0x00c305d0
00bf4a40	ldrsw x8,[x21, #0x8]
00bf4a44	adrp x1,0xd27000
00bf4a48	add x1,x1,#0xd90
00bf4a4c	mov w0,#0x1
00bf4a50	sub x23,x8,#0x1
00bf4a54	bl 0x00c2bce0
00bf4a58	ldp x8,x9,[x20, #0x10]
00bf4a5c	sub x9,x9,x8
00bf4a60	asr x10,x9,#0x3
00bf4a64	cmp x10,x23
00bf4a68	b.hi 0x00bf4a94
00bf4a6c	add x9,x23,#0x1
00bf4a70	subs x1,x9,x10
00bf4a74	b.ls 0x00bf4a88
00bf4a78	mov x0,x19
00bf4a7c	bl 0x00c0b6e4
00bf4a80	ldr x8,[x19]
00bf4a84	b 0x00bf4a94
00bf4a88	b.cs 0x00bf4a94
00bf4a8c	add x9,x8,x9, LSL #0x3
00bf4a90	str x9,[x20, #0x18]
00bf4a94	ldr x21,[x8, x23, LSL #0x3]
00bf4a98	cbz x21,0x00bf4abc
00bf4a9c	add x1,x21,#0x8
00bf4aa0	mov x0,#-0x1
00bf4aa4	bl 0x00c2bd10
00bf4aa8	cbnz x0,0x00bf4abc
00bf4aac	ldr x8,[x21]
00bf4ab0	mov x0,x21
00bf4ab4	ldr x8,[x8, #0x10]
00bf4ab8	blr x8
00bf4abc	adrp x9,0xcb5000
00bf4ac0	ldr x8,[x19]
00bf4ac4	adrp x21,0xcb5000
00bf4ac8	ldr x9,[x9, #0xd38]
00bf4acc	ldr x21,[x21, #0xd40]
00bf4ad0	adrp x24,0xd27000
00bf4ad4	add x24,x24,#0xda0
00bf4ad8	str x22,[x8, x23, LSL #0x3]
00bf4adc	add x8,x9,#0x10
00bf4ae0	add x9,x9,#0x70
00bf4ae4	str x21,[sp]
00bf4ae8	stp x8,xzr,[x24]
00bf4aec	str x9,[x24, #0x10]
00bf4af0	ldar x8,[x21]
00bf4af4	cmn x8,#0x1
00bf4af8	b.eq 0x00bf4b24
00bf4afc	mov x8,sp
00bf4b00	add x9,x29,#0x18
00bf4b04	str x8,[x29, #0x18]
00bf4b08	str x9,[sp, #0x8]
00bf4b0c	adrp x0,0xcb5000
00bf4b10	nop
00bf4b14	adr x2,0xc0bab0
00bf4b18	ldr x0,[x0, #0xd40]
00bf4b1c	add x1,sp,#0x8
00bf4b20	bl 0x00c305d0
00bf4b24	ldrsw x8,[x21, #0x8]
00bf4b28	adrp x1,0xd27000
00bf4b2c	add x1,x1,#0xda8
00bf4b30	mov w0,#0x1
00bf4b34	sub x22,x8,#0x1
00bf4b38	bl 0x00c2bce0
00bf4b3c	ldp x8,x9,[x20, #0x10]
00bf4b40	sub x9,x9,x8
00bf4b44	asr x10,x9,#0x3
00bf4b48	cmp x10,x22
00bf4b4c	b.hi 0x00bf4b78
00bf4b50	add x9,x22,#0x1
00bf4b54	subs x1,x9,x10
00bf4b58	b.ls 0x00bf4b6c
00bf4b5c	mov x0,x19
00bf4b60	bl 0x00c0b6e4
00bf4b64	ldr x8,[x19]
00bf4b68	b 0x00bf4b78
00bf4b6c	b.cs 0x00bf4b78
00bf4b70	add x9,x8,x9, LSL #0x3
00bf4b74	str x9,[x20, #0x18]
00bf4b78	ldr x21,[x8, x22, LSL #0x3]
00bf4b7c	cbz x21,0x00bf4ba0
00bf4b80	add x1,x21,#0x8
00bf4b84	mov x0,#-0x1
00bf4b88	bl 0x00c2bd10
00bf4b8c	cbnz x0,0x00bf4ba0
00bf4b90	ldr x8,[x21]
00bf4b94	mov x0,x21
00bf4b98	ldr x8,[x8, #0x10]
00bf4b9c	blr x8
00bf4ba0	adrp x25,0xcb5000
00bf4ba4	ldr x8,[x19]
00bf4ba8	adrp x23,0xd27000
00bf4bac	add x23,x23,#0xdb8
00bf4bb0	ldr x25,[x25, #0xd48]
00bf4bb4	adrp x26,0xd27000
00bf4bb8	add x26,x26,#0xf8
00bf4bbc	str x24,[x8, x22, LSL #0x3]
00bf4bc0	adrp x24,0xd27000
00bf4bc4	add x8,x25,#0x10
00bf4bc8	stp x8,xzr,[x23]
00bf4bcc	ldarb w8,[x26]
00bf4bd0	tbz w8,#0x0,0x00bf4f80
00bf4bd4	adrp x9,0xcb5000
00bf4bd8	ldr x8,[x24, #0xf0]
00bf4bdc	adrp x21,0xcb4000
00bf4be0	ldr x9,[x9, #0xd50]
00bf4be4	ldr x21,[x21, #0xc80]
00bf4be8	str x8,[x23, #0x10]
00bf4bec	add x8,x9,#0x10
00bf4bf0	str x21,[sp]
00bf4bf4	str x8,[x23]
00bf4bf8	ldar x8,[x21]
00bf4bfc	cmn x8,#0x1
00bf4c00	b.eq 0x00bf4c2c
00bf4c04	mov x8,sp
00bf4c08	add x9,x29,#0x18
00bf4c0c	str x8,[x29, #0x18]
00bf4c10	str x9,[sp, #0x8]
00bf4c14	adrp x0,0xcb4000
00bf4c18	nop
00bf4c1c	adr x2,0xc0bab0
00bf4c20	ldr x0,[x0, #0xc80]
00bf4c24	add x1,sp,#0x8
00bf4c28	bl 0x00c305d0
00bf4c2c	ldrsw x8,[x21, #0x8]
00bf4c30	adrp x1,0xd27000
00bf4c34	add x1,x1,#0xdc0
00bf4c38	mov w0,#0x1
00bf4c3c	sub x27,x8,#0x1
00bf4c40	bl 0x00c2bce0
00bf4c44	ldp x8,x9,[x20, #0x10]
00bf4c48	sub x9,x9,x8
00bf4c4c	asr x10,x9,#0x3
00bf4c50	cmp x10,x27
00bf4c54	b.hi 0x00bf4c80
00bf4c58	add x9,x27,#0x1
00bf4c5c	subs x1,x9,x10
00bf4c60	b.ls 0x00bf4c74
00bf4c64	mov x0,x19
00bf4c68	bl 0x00c0b6e4
00bf4c6c	ldr x8,[x19]
00bf4c70	b 0x00bf4c80
00bf4c74	b.cs 0x00bf4c80
00bf4c78	add x9,x8,x9, LSL #0x3
00bf4c7c	str x9,[x20, #0x18]
00bf4c80	ldr x21,[x8, x27, LSL #0x3]
00bf4c84	cbz x21,0x00bf4ca8
00bf4c88	add x1,x21,#0x8
00bf4c8c	mov x0,#-0x1
00bf4c90	bl 0x00c2bd10
00bf4c94	cbnz x0,0x00bf4ca8
00bf4c98	ldr x8,[x21]
00bf4c9c	mov x0,x21
00bf4ca0	ldr x8,[x8, #0x10]
00bf4ca4	blr x8
00bf4ca8	ldr x8,[x19]
00bf4cac	adrp x22,0xd27000
00bf4cb0	add x22,x22,#0xdd0
00bf4cb4	str x23,[x8, x27, LSL #0x3]
00bf4cb8	add x8,x25,#0x10
00bf4cbc	stp x8,xzr,[x22]
00bf4cc0	ldarb w8,[x26]
00bf4cc4	tbz w8,#0x0,0x00bf4fb8
00bf4cc8	adrp x9,0xcb5000
00bf4ccc	ldr x8,[x24, #0xf0]
00bf4cd0	adrp x21,0xcb5000
00bf4cd4	ldr x9,[x9, #0xd58]
00bf4cd8	ldr x21,[x21, #0xd60]
00bf4cdc	str x8,[x22, #0x10]
00bf4ce0	add x8,x9,#0x10
00bf4ce4	str x21,[sp]
00bf4ce8	str x8,[x22]
00bf4cec	ldar x8,[x21]
00bf4cf0	cmn x8,#0x1
00bf4cf4	b.eq 0x00bf4d20
00bf4cf8	mov x8,sp
00bf4cfc	add x9,x29,#0x18
00bf4d00	str x8,[x29, #0x18]
00bf4d04	str x9,[sp, #0x8]
00bf4d08	adrp x0,0xcb5000
00bf4d0c	nop
00bf4d10	adr x2,0xc0bab0
00bf4d14	ldr x0,[x0, #0xd60]
00bf4d18	add x1,sp,#0x8
00bf4d1c	bl 0x00c305d0
00bf4d20	ldrsw x8,[x21, #0x8]
00bf4d24	adrp x1,0xd27000
00bf4d28	add x1,x1,#0xdd8
00bf4d2c	mov w0,#0x1
00bf4d30	sub x24,x8,#0x1
00bf4d34	bl 0x00c2bce0
00bf4d38	ldp x8,x9,[x20, #0x10]
00bf4d3c	sub x9,x9,x8
00bf4d40	asr x10,x9,#0x3
00bf4d44	cmp x10,x24
00bf4d48	b.hi 0x00bf4d74
00bf4d4c	add x9,x24,#0x1
00bf4d50	subs x1,x9,x10
00bf4d54	b.ls 0x00bf4d68
00bf4d58	mov x0,x19
00bf4d5c	bl 0x00c0b6e4
00bf4d60	ldr x8,[x19]
00bf4d64	b 0x00bf4d74
00bf4d68	b.cs 0x00bf4d74
00bf4d6c	add x9,x8,x9, LSL #0x3
00bf4d70	str x9,[x20, #0x18]
00bf4d74	ldr x21,[x8, x24, LSL #0x3]
00bf4d78	cbz x21,0x00bf4d9c
00bf4d7c	add x1,x21,#0x8
00bf4d80	mov x0,#-0x1
00bf4d84	bl 0x00c2bd10
00bf4d88	cbnz x0,0x00bf4d9c
00bf4d8c	ldr x8,[x21]
00bf4d90	mov x0,x21
00bf4d94	ldr x8,[x8, #0x10]
00bf4d98	blr x8
00bf4d9c	adrp x9,0xcb5000
00bf4da0	ldr x8,[x19]
00bf4da4	adrp x21,0xcb5000
00bf4da8	ldr x9,[x9, #0xd68]
00bf4dac	ldr x21,[x21, #0xd70]
00bf4db0	adrp x23,0xd27000
00bf4db4	add x23,x23,#0xde8
00bf4db8	str x22,[x8, x24, LSL #0x3]
00bf4dbc	add x8,x9,#0x10
00bf4dc0	str x21,[sp]
00bf4dc4	stp x8,xzr,[x23]
00bf4dc8	ldar x8,[x21]
00bf4dcc	cmn x8,#0x1
00bf4dd0	b.eq 0x00bf4dfc
00bf4dd4	mov x8,sp
00bf4dd8	add x9,x29,#0x18
00bf4ddc	str x8,[x29, #0x18]
00bf4de0	str x9,[sp, #0x8]
00bf4de4	adrp x0,0xcb5000
00bf4de8	nop
00bf4dec	adr x2,0xc0bab0
00bf4df0	ldr x0,[x0, #0xd70]
00bf4df4	add x1,sp,#0x8
00bf4df8	bl 0x00c305d0
00bf4dfc	ldrsw x8,[x21, #0x8]
00bf4e00	adrp x1,0xd27000
00bf4e04	add x1,x1,#0xdf0
00bf4e08	mov w0,#0x1
00bf4e0c	sub x24,x8,#0x1
00bf4e10	bl 0x00c2bce0
00bf4e14	ldp x8,x9,[x20, #0x10]
00bf4e18	sub x9,x9,x8
00bf4e1c	asr x10,x9,#0x3
00bf4e20	cmp x10,x24
00bf4e24	b.hi 0x00bf4e50
00bf4e28	add x9,x24,#0x1
00bf4e2c	subs x1,x9,x10
00bf4e30	b.ls 0x00bf4e44
00bf4e34	mov x0,x19
00bf4e38	bl 0x00c0b6e4
00bf4e3c	ldr x8,[x19]
00bf4e40	b 0x00bf4e50
00bf4e44	b.cs 0x00bf4e50
00bf4e48	add x9,x8,x9, LSL #0x3
00bf4e4c	str x9,[x20, #0x18]
00bf4e50	ldr x21,[x8, x24, LSL #0x3]
00bf4e54	cbz x21,0x00bf4e78
00bf4e58	add x1,x21,#0x8
00bf4e5c	mov x0,#-0x1
00bf4e60	bl 0x00c2bd10
00bf4e64	cbnz x0,0x00bf4e78
00bf4e68	ldr x8,[x21]
00bf4e6c	mov x0,x21
00bf4e70	ldr x8,[x8, #0x10]
00bf4e74	blr x8
00bf4e78	adrp x9,0xcb5000
00bf4e7c	ldr x8,[x19]
00bf4e80	adrp x21,0xcb5000
00bf4e84	ldr x9,[x9, #0xd78]
00bf4e88	ldr x21,[x21, #0xd80]
00bf4e8c	adrp x22,0xd27000
00bf4e90	add x22,x22,#0xdf8
00bf4e94	str x23,[x8, x24, LSL #0x3]
00bf4e98	add x8,x9,#0x10
00bf4e9c	str x21,[sp]
00bf4ea0	stp x8,xzr,[x22]
00bf4ea4	ldar x8,[x21]
00bf4ea8	cmn x8,#0x1
00bf4eac	b.eq 0x00bf4ed8
00bf4eb0	mov x8,sp
00bf4eb4	add x9,x29,#0x18
00bf4eb8	str x8,[x29, #0x18]
00bf4ebc	str x9,[sp, #0x8]
00bf4ec0	adrp x0,0xcb5000
00bf4ec4	nop
00bf4ec8	adr x2,0xc0bab0
00bf4ecc	ldr x0,[x0, #0xd80]
00bf4ed0	add x1,sp,#0x8
00bf4ed4	bl 0x00c305d0
00bf4ed8	ldrsw x8,[x21, #0x8]
00bf4edc	adrp x1,0xd27000
00bf4ee0	add x1,x1,#0xe00
00bf4ee4	mov w0,#0x1
00bf4ee8	sub x21,x8,#0x1
00bf4eec	bl 0x00c2bce0
00bf4ef0	ldp x8,x9,[x20, #0x10]
00bf4ef4	sub x9,x9,x8
00bf4ef8	asr x10,x9,#0x3
00bf4efc	cmp x10,x21
00bf4f00	b.hi 0x00bf4f2c
00bf4f04	add x9,x21,#0x1
00bf4f08	subs x1,x9,x10
00bf4f0c	b.ls 0x00bf4f20
00bf4f10	mov x0,x19
00bf4f14	bl 0x00c0b6e4
00bf4f18	ldr x8,[x19]
00bf4f1c	b 0x00bf4f2c
00bf4f20	b.cs 0x00bf4f2c
00bf4f24	add x9,x8,x9, LSL #0x3
00bf4f28	str x9,[x20, #0x18]
00bf4f2c	ldr x20,[x8, x21, LSL #0x3]
00bf4f30	cbz x20,0x00bf4f54
00bf4f34	add x1,x20,#0x8
00bf4f38	mov x0,#-0x1
00bf4f3c	bl 0x00c2bd10
00bf4f40	cbnz x0,0x00bf4f54
00bf4f44	ldr x8,[x20]
00bf4f48	mov x0,x20
00bf4f4c	ldr x8,[x8, #0x10]
00bf4f50	blr x8
00bf4f54	ldr x8,[x19]
00bf4f58	str x22,[x8, x21, LSL #0x3]
00bf4f5c	ldp x20,x19,[sp, #0x60]
00bf4f60	ldr x27,[sp, #0x20]
00bf4f64	ldp x22,x21,[sp, #0x50]
00bf4f68	ldp x24,x23,[sp, #0x40]
00bf4f6c	ldp x26,x25,[sp, #0x30]
00bf4f70	ldp x29,x30,[sp, #0x10]
00bf4f74	add sp,sp,#0x70
00bf4f78	autiasp
00bf4f7c	ret
00bf4f80	adrp x0,0xd27000
00bf4f84	add x0,x0,#0xf8
00bf4f88	bl 0x00c2fe90
00bf4f8c	cbz w0,0x00bf4bd4
00bf4f90	adrp x1,0x2c6000
00bf4f94	add x1,x1,#0xbfc
00bf4f98	mov w0,#0x1fbf
00bf4f9c	mov x2,xzr
00bf4fa0	bl 0x00c43890
00bf4fa4	str x0,[x24, #0xf0]
00bf4fa8	adrp x0,0xd27000
00bf4fac	add x0,x0,#0xf8
00bf4fb0	bl 0x00c2fea0
00bf4fb4	b 0x00bf4bd4
00bf4fb8	adrp x0,0xd27000
00bf4fbc	add x0,x0,#0xf8
00bf4fc0	bl 0x00c2fe90
00bf4fc4	cbz w0,0x00bf4cc8
00bf4fc8	adrp x1,0x2c6000
00bf4fcc	add x1,x1,#0xbfc
00bf4fd0	mov w0,#0x1fbf
00bf4fd4	mov x2,xzr
00bf4fd8	bl 0x00c43890
00bf4fdc	str x0,[x24, #0xf0]
00bf4fe0	adrp x0,0xd27000
00bf4fe4	add x0,x0,#0xf8
00bf4fe8	bl 0x00c2fea0
00bf4fec	b 0x00bf4cc8
