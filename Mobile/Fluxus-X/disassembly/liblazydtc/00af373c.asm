; X509_ocspid_print @ 00af373c
00af373c	sub sp,sp,#0x70
00af3740	stp x20,x19,[sp, #0x50]
00af3744	mov x19,x0
00af3748	mov w0,wzr
00af374c	str x25,[sp, #0x20]
00af3750	stp x24,x23,[sp, #0x30]
00af3754	stp x22,x21,[sp, #0x40]
00af3758	stp x29,x30,[sp, #0x60]
00af375c	add x29,sp,#0x60
00af3760	cbz x19,0x00af3924
00af3764	mov x21,x1
00af3768	cbz x1,0x00af3924
00af376c	adrp x1,0x2d4000
00af3770	add x1,x1,#0x49d
00af3774	mov x0,x19
00af3778	bl 0x00c32250
00af377c	cmp w0,#0x1
00af3780	b.lt 0x00af38fc
00af3784	mov x0,x21
00af3788	bl 0x00c32d20
00af378c	mov x1,xzr
00af3790	mov x20,x0
00af3794	bl 0x00c350f0
00af3798	cmp w0,#0x1
00af379c	b.lt 0x00af38fc
00af37a0	sxtw x23,w0
00af37a4	adrp x1,0x2d6000
00af37a8	add x1,x1,#0x609
00af37ac	mov w2,#0xf4
00af37b0	mov x0,x23
00af37b4	bl 0x00c32320
00af37b8	mov x22,x0
00af37bc	str x0,[sp, #0x28]
00af37c0	cbz x0,0x00af3900
00af37c4	add x1,sp,#0x28
00af37c8	mov x0,x20
00af37cc	bl 0x00c350f0
00af37d0	ldp x0,x2,[x21, #0x170]
00af37d4	adrp x1,0x2d1000
00af37d8	add x1,x1,#0x42e
00af37dc	bl 0x00c357f0
00af37e0	mov x20,x0
00af37e4	cbz x0,0x00af3904
00af37e8	add x2,sp,#0xc
00af37ec	mov x0,x22
00af37f0	mov x1,x23
00af37f4	mov x3,xzr
00af37f8	mov x4,x20
00af37fc	mov x5,xzr
00af3800	add x24,sp,#0xc
00af3804	bl 0x00c370c0
00af3808	cbz w0,0x00af3904
00af380c	adrp x23,0x2c7000
00af3810	mov x25,xzr
00af3814	add x23,x23,#0x74b
00af3818	ldrb w2,[x24, x25]
00af381c	mov x0,x19
00af3820	mov x1,x23
00af3824	bl 0x00c32250
00af3828	cmp w0,#0x1
00af382c	b.lt 0x00af3904
00af3830	add x25,x25,#0x1
00af3834	cmp x25,#0x13
00af3838	b.ls 0x00af3818
00af383c	adrp x1,0x2d6000
00af3840	add x1,x1,#0x609
00af3844	mov w2,#0x101
00af3848	mov x0,x22
00af384c	bl 0x00c32310
00af3850	adrp x1,0x2ce000
00af3854	add x1,x1,#0x3d7
00af3858	mov x0,x19
00af385c	bl 0x00c32250
00af3860	cmp w0,#0x1
00af3864	b.lt 0x00af3940
00af3868	mov x0,x21
00af386c	bl 0x00c3f050
00af3870	cbz x0,0x00af3940
00af3874	mov x21,x0
00af3878	bl 0x00c32130
00af387c	mov x22,x0
00af3880	mov x0,x21
00af3884	bl 0x00c32140
00af3888	sxtw x1,w0
00af388c	add x2,sp,#0xc
00af3890	mov x0,x22
00af3894	mov x3,xzr
00af3898	mov x4,x20
00af389c	mov x5,xzr
00af38a0	add x23,sp,#0xc
00af38a4	bl 0x00c370c0
00af38a8	mov x22,xzr
00af38ac	cbz w0,0x00af3904
00af38b0	adrp x21,0x2c7000
00af38b4	add x21,x21,#0x74b
00af38b8	ldrb w2,[x23, x22]
00af38bc	mov x0,x19
00af38c0	mov x1,x21
00af38c4	bl 0x00c32250
00af38c8	cmp w0,#0x1
00af38cc	b.lt 0x00af3940
00af38d0	add x22,x22,#0x1
00af38d4	cmp x22,#0x13
00af38d8	b.ls 0x00af38b8
00af38dc	adrp x1,0x2c4000
00af38e0	add x1,x1,#0xdae
00af38e4	mov x0,x19
00af38e8	bl 0x00c32250
00af38ec	mov x0,x20
00af38f0	bl 0x00c35800
00af38f4	mov w0,#0x1
00af38f8	b 0x00af3924
00af38fc	mov x22,xzr
00af3900	mov x20,xzr
00af3904	adrp x1,0x2d6000
00af3908	add x1,x1,#0x609
00af390c	mov w2,#0x11b
00af3910	mov x0,x22
00af3914	bl 0x00c32310
00af3918	mov x0,x20
00af391c	bl 0x00c35800
00af3920	mov w0,wzr
00af3924	ldp x29,x30,[sp, #0x60]
00af3928	ldp x20,x19,[sp, #0x50]
00af392c	ldp x22,x21,[sp, #0x40]
00af3930	ldp x24,x23,[sp, #0x30]
00af3934	ldr x25,[sp, #0x20]
00af3938	add sp,sp,#0x70
00af393c	ret
00af3940	mov x22,xzr
00af3944	b 0x00af3904
