; ASN1_item_verify_ctx @ 00ab3764
00ab3764	sub sp,sp,#0x50
00ab3768	stp x24,x23,[sp, #0x10]
00ab376c	mov x23,x0
00ab3770	mov x0,x4
00ab3774	stp x22,x21,[sp, #0x20]
00ab3778	stp x20,x19,[sp, #0x30]
00ab377c	stp x29,x30,[sp, #0x40]
00ab3780	add x29,sp,#0x40
00ab3784	mov x19,x4
00ab3788	mov x22,x3
00ab378c	mov x20,x2
00ab3790	mov x24,x1
00ab3794	str xzr,[sp, #0x8]
00ab3798	bl 0x00c36dc0
00ab379c	bl 0x00c39b60
00ab37a0	cbz x0,0x00ab3860
00ab37a4	ldr w8,[x20, #0x4]
00ab37a8	mov x21,x0
00ab37ac	cmp w8,#0x3
00ab37b0	b.ne 0x00ab37e8
00ab37b4	ldrb w8,[x20, #0x10]
00ab37b8	tst w8,#0x7
00ab37bc	b.eq 0x00ab37e8
00ab37c0	bl 0x00c342a0
00ab37c4	adrp x0,0x2c8000
00ab37c8	adrp x2,0x2da000
00ab37cc	add x0,x0,#0x6b
00ab37d0	add x2,x2,#0x4ed
00ab37d4	mov w1,#0x82
00ab37d8	bl 0x00c342b0
00ab37dc	mov w0,#0xd
00ab37e0	mov w1,#0xdc
00ab37e4	b 0x00ab388c
00ab37e8	ldr x0,[x24]
00ab37ec	bl 0x00c37750
00ab37f0	add x1,sp,#0x4
00ab37f4	mov x2,sp
00ab37f8	bl 0x00c3ebe0
00ab37fc	cbz w0,0x00ab389c
00ab3800	ldr w8,[sp, #0x4]
00ab3804	cbz w8,0x00ab38c4
00ab3808	ldr w0,[sp]
00ab380c	bl 0x00c324f0
00ab3810	mov x1,x0
00ab3814	mov x0,x21
00ab3818	bl 0x00c346e0
00ab381c	cbz w0,0x00ab3950
00ab3820	ldr w0,[sp, #0x4]
00ab3824	cbz w0,0x00ab39b8
00ab3828	bl 0x00c324f0
00ab382c	bl 0x00c35310
00ab3830	mov x2,x0
00ab3834	cbnz x0,0x00ab39bc
00ab3838	bl 0x00c342a0
00ab383c	adrp x0,0x2c8000
00ab3840	adrp x2,0x2da000
00ab3844	add x0,x0,#0x6b
00ab3848	add x2,x2,#0x4ed
00ab384c	mov w1,#0xba
00ab3850	bl 0x00c342b0
00ab3854	mov w0,#0xd
00ab3858	mov w1,#0xa1
00ab385c	b 0x00ab3974
00ab3860	bl 0x00c342a0
00ab3864	adrp x0,0x2c8000
00ab3868	adrp x2,0x2da000
00ab386c	add x0,x0,#0x6b
00ab3870	add x2,x2,#0x4ed
00ab3874	mov w1,#0x7d
00ab3878	bl 0x00c342b0
00ab387c	mov w8,#0x103
00ab3880	movk w8,#0xc, LSL #16
00ab3884	sub w1,w8,#0x1
00ab3888	mov w0,#0xd
00ab388c	mov x2,xzr
00ab3890	bl 0x00c342c0
00ab3894	mov w21,#0xffffffff
00ab3898	b 0x00ab399c
00ab389c	bl 0x00c342a0
00ab38a0	adrp x0,0x2c8000
00ab38a4	adrp x2,0x2da000
00ab38a8	add x0,x0,#0x6b
00ab38ac	add x2,x2,#0x4ed
00ab38b0	mov w1,#0x88
00ab38b4	bl 0x00c342b0
00ab38b8	mov w0,#0xd
00ab38bc	mov w1,#0xc7
00ab38c0	b 0x00ab3974
00ab38c4	ldr w8,[x21]
00ab38c8	cbz w8,0x00ab38d4
00ab38cc	ldr x8,[x21, #0x60]
00ab38d0	cbz x8,0x00ab3a88
00ab38d4	ldr w0,[sp]
00ab38d8	cmp w0,#0x390
00ab38dc	b.ne 0x00ab380c
00ab38e0	adrp x1,0x2db000
00ab38e4	add x1,x1,#0x996
00ab38e8	mov x0,x21
00ab38ec	bl 0x00c346e0
00ab38f0	cbnz w0,0x00ab3908
00ab38f4	adrp x1,0x2b9000
00ab38f8	add x1,x1,#0x9cf
00ab38fc	mov x0,x21
00ab3900	bl 0x00c346e0
00ab3904	cbz w0,0x00ab3b60
00ab3908	mov x0,x19
00ab390c	mov x1,xzr
00ab3910	mov x2,x24
00ab3914	mov x3,x21
00ab3918	bl 0x00c3f140
00ab391c	cmp w0,#0x0
00ab3920	b.gt 0x00ab39d4
00ab3924	bl 0x00c342a0
00ab3928	adrp x0,0x2c8000
00ab392c	adrp x2,0x2da000
00ab3930	add x0,x0,#0x6b
00ab3934	add x2,x2,#0x4ed
00ab3938	mov w1,#0xac
00ab393c	bl 0x00c342b0
00ab3940	mov w1,#0x103
00ab3944	mov w0,#0xd
00ab3948	movk w1,#0xc, LSL #16
00ab394c	b 0x00ab3974
00ab3950	bl 0x00c342a0
00ab3954	adrp x0,0x2c8000
00ab3958	adrp x2,0x2da000
00ab395c	add x0,x0,#0x6b
00ab3960	add x2,x2,#0x4ed
00ab3964	mov w1,#0xb2
00ab3968	bl 0x00c342b0
00ab396c	mov w0,#0xd
00ab3970	mov w1,#0xc8
00ab3974	mov x2,xzr
00ab3978	bl 0x00c342c0
00ab397c	mov x20,xzr
00ab3980	mov w21,#0xffffffff
00ab3984	ldr x0,[sp, #0x8]
00ab3988	adrp x2,0x2c8000
00ab398c	add x2,x2,#0x6b
00ab3990	mov w3,#0xde
00ab3994	mov x1,x20
00ab3998	bl 0x00c345e0
00ab399c	mov w0,w21
00ab39a0	ldp x29,x30,[sp, #0x40]
00ab39a4	ldp x20,x19,[sp, #0x30]
00ab39a8	ldp x22,x21,[sp, #0x20]
00ab39ac	ldp x24,x23,[sp, #0x10]
00ab39b0	add sp,sp,#0x50
00ab39b4	ret
00ab39b8	mov x2,xzr
00ab39bc	mov x0,x19
00ab39c0	mov x1,xzr
00ab39c4	mov x3,xzr
00ab39c8	mov x4,x21
00ab39cc	bl 0x00c3b2b0
00ab39d0	cbz w0,0x00ab3a20
00ab39d4	mov w21,#0xffffffff
00ab39d8	add x1,sp,#0x8
00ab39dc	mov x0,x22
00ab39e0	mov x2,x23
00ab39e4	bl 0x00c36170
00ab39e8	cmp w0,#0x0
00ab39ec	b.le 0x00ab3a5c
00ab39f0	ldr x3,[sp, #0x8]
00ab39f4	cbz x3,0x00ab3ad0
00ab39f8	ldr x1,[x20, #0x8]
00ab39fc	ldrsw x2,[x20]
00ab3a00	sxtw x20,w0
00ab3a04	mov x0,x19
00ab3a08	mov x4,x20
00ab3a0c	bl 0x00c370d0
00ab3a10	cmp w0,#0x0
00ab3a14	b.le 0x00ab3b28
00ab3a18	mov w21,#0x1
00ab3a1c	b 0x00ab3984
00ab3a20	bl 0x00c342a0
00ab3a24	adrp x0,0x2c8000
00ab3a28	adrp x2,0x2da000
00ab3a2c	add x0,x0,#0x6b
00ab3a30	add x2,x2,#0x4ed
00ab3a34	mov w1,#0xc4
00ab3a38	bl 0x00c342b0
00ab3a3c	mov w1,#0x6
00ab3a40	mov w0,#0xd
00ab3a44	movk w1,#0x8, LSL #16
00ab3a48	mov x2,xzr
00ab3a4c	bl 0x00c342c0
00ab3a50	mov w21,wzr
00ab3a54	mov x20,xzr
00ab3a58	b 0x00ab3984
00ab3a5c	bl 0x00c342a0
00ab3a60	adrp x0,0x2c8000
00ab3a64	adrp x2,0x2da000
00ab3a68	add x0,x0,#0x6b
00ab3a6c	add x2,x2,#0x4ed
00ab3a70	mov w1,#0xcd
00ab3a74	bl 0x00c342b0
00ab3a78	mov w1,#0x103
00ab3a7c	mov w0,#0xd
00ab3a80	movk w1,#0xc, LSL #16
00ab3a84	b 0x00ab3afc
00ab3a88	ldr x8,[x21, #0x8]
00ab3a8c	cbz x8,0x00ab3b0c
00ab3a90	ldr x8,[x8, #0xc8]
00ab3a94	cbz x8,0x00ab3b0c
00ab3a98	mov x0,x19
00ab3a9c	mov x1,x23
00ab3aa0	mov x2,x22
00ab3aa4	mov x3,x24
00ab3aa8	mov x4,x20
00ab3aac	mov x5,x21
00ab3ab0	blr x8
00ab3ab4	mov w21,w0
00ab3ab8	cmp w0,#0x0
00ab3abc	b.le 0x00ab3b7c
00ab3ac0	cmp w21,#0x1
00ab3ac4	b.ne 0x00ab39d8
00ab3ac8	mov x20,xzr
00ab3acc	b 0x00ab3984
00ab3ad0	bl 0x00c342a0
00ab3ad4	adrp x0,0x2c8000
00ab3ad8	adrp x2,0x2da000
00ab3adc	add x0,x0,#0x6b
00ab3ae0	add x2,x2,#0x4ed
00ab3ae4	mov w1,#0xd1
00ab3ae8	bl 0x00c342b0
00ab3aec	mov w8,#0x103
00ab3af0	movk w8,#0xc, LSL #16
00ab3af4	sub w1,w8,#0x3
00ab3af8	mov w0,#0xd
00ab3afc	mov x2,xzr
00ab3b00	bl 0x00c342c0
00ab3b04	mov x20,xzr
00ab3b08	b 0x00ab3984
00ab3b0c	bl 0x00c342a0
00ab3b10	adrp x0,0x2c8000
00ab3b14	adrp x2,0x2da000
00ab3b18	add x0,x0,#0x6b
00ab3b1c	add x2,x2,#0x4ed
00ab3b20	mov w1,#0x8e
00ab3b24	b 0x00ab38b4
00ab3b28	mov w21,w0
00ab3b2c	bl 0x00c342a0
00ab3b30	adrp x0,0x2c8000
00ab3b34	adrp x2,0x2da000
00ab3b38	add x0,x0,#0x6b
00ab3b3c	add x2,x2,#0x4ed
00ab3b40	mov w1,#0xd9
00ab3b44	bl 0x00c342b0
00ab3b48	mov w1,#0x6
00ab3b4c	mov w0,#0xd
00ab3b50	movk w1,#0x8, LSL #16
00ab3b54	mov x2,xzr
00ab3b58	bl 0x00c342c0
00ab3b5c	b 0x00ab3984
00ab3b60	bl 0x00c342a0
00ab3b64	adrp x0,0x2c8000
00ab3b68	adrp x2,0x2da000
00ab3b6c	add x0,x0,#0x6b
00ab3b70	add x2,x2,#0x4ed
00ab3b74	mov w1,#0xa7
00ab3b78	b 0x00ab3968
00ab3b7c	bl 0x00c342a0
00ab3b80	adrp x0,0x2c8000
00ab3b84	adrp x2,0x2da000
00ab3b88	add x0,x0,#0x6b
00ab3b8c	add x2,x2,#0x4ed
00ab3b90	mov w1,#0x99
00ab3b94	bl 0x00c342b0
00ab3b98	mov w1,#0x6
00ab3b9c	mov w0,#0xd
00ab3ba0	movk w1,#0x8, LSL #16
00ab3ba4	b 0x00ab3afc
