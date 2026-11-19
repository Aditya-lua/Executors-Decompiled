; std::__ndk1::__num_get<wchar_t>::__stage2_float_prep @ 00be3808
00be3808	paciasp
00be380c	sub sp,sp,#0x60
00be3810	stp x29,x30,[sp, #0x20]
00be3814	stp x24,x23,[sp, #0x30]
00be3818	stp x22,x21,[sp, #0x40]
00be381c	stp x20,x19,[sp, #0x50]
00be3820	add x29,sp,#0x20
00be3824	mov x19,x8
00be3828	mov x8,sp
00be382c	mov x20,x3
00be3830	mov x21,x2
00be3834	mov x22,x1
00be3838	bl 0x00c30070
00be383c	adrp x24,0xcb5000
00be3840	ldr x24,[x24, #0xb98]
00be3844	ldr x23,[sp]
00be3848	str x24,[sp, #0x8]
00be384c	ldar x8,[x24]
00be3850	cmn x8,#0x1
00be3854	b.eq 0x00be3880
00be3858	add x8,sp,#0x8
00be385c	sub x9,x29,#0x8
00be3860	stur x8,[x29, #-0x8]
00be3864	str x9,[sp, #0x10]
00be3868	adrp x0,0xcb5000
00be386c	nop
00be3870	adr x2,0xc0bab0
00be3874	ldr x0,[x0, #0xb98]
00be3878	add x1,sp,#0x10
00be387c	bl 0x00c305d0
00be3880	ldp x8,x10,[x23, #0x10]
00be3884	ldrsw x9,[x24, #0x8]
00be3888	sub x9,x9,#0x1
00be388c	sub x10,x10,x8
00be3890	cmp x9,x10, ASR #0x3
00be3894	b.cs 0x00be3980
00be3898	ldr x0,[x8, x9, LSL #0x3]
00be389c	cbz x0,0x00be3980
00be38a0	ldr x8,[x0]
00be38a4	ldr x8,[x8, #0x60]
00be38a8	adrp x1,0xcb5000
00be38ac	mov x3,x22
00be38b0	ldr x1,[x1, #0xc08]
00be38b4	add x2,x1,#0x1c
00be38b8	blr x8
00be38bc	adrp x23,0xcb5000
00be38c0	ldr x23,[x23, #0xc10]
00be38c4	ldr x22,[sp]
00be38c8	str x23,[sp, #0x8]
00be38cc	ldar x8,[x23]
00be38d0	cmn x8,#0x1
00be38d4	b.eq 0x00be3900
00be38d8	add x8,sp,#0x8
00be38dc	sub x9,x29,#0x8
00be38e0	stur x8,[x29, #-0x8]
00be38e4	str x9,[sp, #0x10]
00be38e8	adrp x0,0xcb5000
00be38ec	nop
00be38f0	adr x2,0xc0bab0
00be38f4	ldr x0,[x0, #0xc10]
00be38f8	add x1,sp,#0x10
00be38fc	bl 0x00c305d0
00be3900	ldp x8,x10,[x22, #0x10]
00be3904	ldrsw x9,[x23, #0x8]
00be3908	sub x9,x9,#0x1
00be390c	sub x10,x10,x8
00be3910	cmp x9,x10, ASR #0x3
00be3914	b.cs 0x00be3984
00be3918	ldr x22,[x8, x9, LSL #0x3]
00be391c	cbz x22,0x00be3984
00be3920	ldr x8,[x22]
00be3924	ldr x8,[x8, #0x18]
00be3928	mov x0,x22
00be392c	blr x8
00be3930	str w0,[x21]
00be3934	ldr x8,[x22]
00be3938	ldr x8,[x8, #0x20]
00be393c	mov x0,x22
00be3940	blr x8
00be3944	str w0,[x20]
00be3948	ldr x8,[x22]
00be394c	ldr x9,[x8, #0x28]
00be3950	mov x8,x19
00be3954	mov x0,x22
00be3958	blr x9
00be395c	mov x0,sp
00be3960	bl 0x00c30090
00be3964	ldp x20,x19,[sp, #0x50]
00be3968	ldp x22,x21,[sp, #0x40]
00be396c	ldp x24,x23,[sp, #0x30]
00be3970	ldp x29,x30,[sp, #0x20]
00be3974	add sp,sp,#0x60
00be3978	autiasp
00be397c	ret
00be3980	bl 0x00bd8968
00be3984	bl 0x00bd8968
