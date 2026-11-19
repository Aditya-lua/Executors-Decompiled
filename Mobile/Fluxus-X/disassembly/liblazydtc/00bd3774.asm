; FUN_00bd3774 @ 00bd3774
00bd3774	paciasp
00bd3778	sub sp,sp,#0x40
00bd377c	stp x29,x30,[sp, #0x20]
00bd3780	stp x20,x19,[sp, #0x30]
00bd3784	add x29,sp,#0x20
00bd3788	mov x19,x0
00bd378c	mov x20,x1
00bd3790	sub x0,x29,#0x8
00bd3794	mov x1,x19
00bd3798	mov w2,wzr
00bd379c	stur wzr,[x29, #-0x4]
00bd37a0	bl 0x00c44060
00bd37a4	ldurb w8,[x29, #-0x8]
00bd37a8	cmp w8,#0x1
00bd37ac	b.ne 0x00bd3864
00bd37b0	ldr x8,[x19]
00bd37b4	ldur x9,[x8, #-0x18]
00bd37b8	add x8,sp,#0x8
00bd37bc	add x0,x19,x9
00bd37c0	bl 0x00c30070
00bd37c4	adrp x1,0xcb5000
00bd37c8	add x0,sp,#0x8
00bd37cc	ldr x1,[x1, #0xba0]
00bd37d0	bl 0x00c30080
00bd37d4	ldr x8,[x19]
00bd37d8	ldr x9,[x0]
00bd37dc	ldur x8,[x8, #-0x18]
00bd37e0	add x3,x19,x8
00bd37e4	ldr x8,[x9, #0x20]
00bd37e8	ldr x1,[x3, #0x28]
00bd37ec	sub x4,x29,#0x4
00bd37f0	add x5,sp,#0x10
00bd37f4	mov x2,xzr
00bd37f8	blr x8
00bd37fc	add x0,sp,#0x8
00bd3800	bl 0x00c30090
00bd3804	ldr x8,[sp, #0x10]
00bd3808	mov x9,#-0x80000001
00bd380c	cmp x8,x9
00bd3810	b.gt 0x00bd3820
00bd3814	ldur w8,[x29, #-0x4]
00bd3818	mov w9,#0x80000000
00bd381c	b 0x00bd3834
00bd3820	mov w9,#0x80000000
00bd3824	cmp x8,x9
00bd3828	b.lt 0x00bd3844
00bd382c	ldur w8,[x29, #-0x4]
00bd3830	mov w9,#0x7fffffff
00bd3834	orr w8,w8,#0x4
00bd3838	stur w8,[x29, #-0x4]
00bd383c	str w9,[x20]
00bd3840	b 0x00bd3848
00bd3844	str w8,[x20]
00bd3848	ldr x8,[x19]
00bd384c	ldur x8,[x8, #-0x18]
00bd3850	add x0,x19,x8
00bd3854	ldur w8,[x29, #-0x4]
00bd3858	ldr w9,[x0, #0x20]
00bd385c	orr w1,w9,w8
00bd3860	bl 0x00c30130
00bd3864	mov x0,x19
00bd3868	ldp x20,x19,[sp, #0x30]
00bd386c	ldp x29,x30,[sp, #0x20]
00bd3870	add sp,sp,#0x40
00bd3874	autiasp
00bd3878	ret
