; std::__ndk1::__num_get<char>::__stage2_int_prep @ 00be3688
00be3688	paciasp
00be368c	sub sp,sp,#0x60
00be3690	stp x29,x30,[sp, #0x20]
00be3694	str x23,[sp, #0x30]
00be3698	stp x22,x21,[sp, #0x40]
00be369c	stp x20,x19,[sp, #0x50]
00be36a0	add x29,sp,#0x20
00be36a4	mov x19,x8
00be36a8	add x8,sp,#0x8
00be36ac	mov x20,x2
00be36b0	mov x21,x1
00be36b4	bl 0x00c30070
00be36b8	adrp x23,0xcb4000
00be36bc	ldr x23,[x23, #0x998]
00be36c0	ldr x22,[sp, #0x8]
00be36c4	str x23,[sp, #0x10]
00be36c8	ldar x8,[x23]
00be36cc	cmn x8,#0x1
00be36d0	b.eq 0x00be36fc
00be36d4	add x8,sp,#0x10
00be36d8	add x9,x29,#0x18
00be36dc	str x8,[x29, #0x18]
00be36e0	stur x9,[x29, #-0x8]
00be36e4	adrp x0,0xcb4000
00be36e8	nop
00be36ec	adr x2,0xc0bab0
00be36f0	ldr x0,[x0, #0x998]
00be36f4	sub x1,x29,#0x8
00be36f8	bl 0x00c305d0
00be36fc	ldp x8,x10,[x22, #0x10]
00be3700	ldrsw x9,[x23, #0x8]
00be3704	sub x9,x9,#0x1
00be3708	sub x10,x10,x8
00be370c	cmp x9,x10, ASR #0x3
00be3710	b.cs 0x00be37e8
00be3714	ldr x0,[x8, x9, LSL #0x3]
00be3718	cbz x0,0x00be37e8
00be371c	ldr x8,[x0]
00be3720	ldr x8,[x8, #0x40]
00be3724	adrp x1,0xcb5000
00be3728	mov x3,x21
00be372c	ldr x1,[x1, #0xc08]
00be3730	add x2,x1,#0x1a
00be3734	blr x8
00be3738	adrp x22,0xcb5000
00be373c	ldr x22,[x22, #0xc00]
00be3740	ldr x21,[sp, #0x8]
00be3744	str x22,[sp, #0x10]
00be3748	ldar x8,[x22]
00be374c	cmn x8,#0x1
00be3750	b.eq 0x00be377c
00be3754	add x8,sp,#0x10
00be3758	add x9,x29,#0x18
00be375c	str x8,[x29, #0x18]
00be3760	stur x9,[x29, #-0x8]
00be3764	adrp x0,0xcb5000
00be3768	nop
00be376c	adr x2,0xc0bab0
00be3770	ldr x0,[x0, #0xc00]
00be3774	sub x1,x29,#0x8
00be3778	bl 0x00c305d0
00be377c	ldp x8,x10,[x21, #0x10]
00be3780	ldrsw x9,[x22, #0x8]
00be3784	sub x9,x9,#0x1
00be3788	sub x10,x10,x8
00be378c	cmp x9,x10, ASR #0x3
00be3790	b.cs 0x00be37ec
00be3794	ldr x21,[x8, x9, LSL #0x3]
00be3798	cbz x21,0x00be37ec
00be379c	ldr x8,[x21]
00be37a0	ldr x8,[x8, #0x20]
00be37a4	mov x0,x21
00be37a8	blr x8
00be37ac	strb w0,[x20]
00be37b0	ldr x8,[x21]
00be37b4	ldr x9,[x8, #0x28]
00be37b8	mov x8,x19
00be37bc	mov x0,x21
00be37c0	blr x9
00be37c4	add x0,sp,#0x8
00be37c8	bl 0x00c30090
00be37cc	ldp x20,x19,[sp, #0x50]
00be37d0	ldr x23,[sp, #0x30]
00be37d4	ldp x22,x21,[sp, #0x40]
00be37d8	ldp x29,x30,[sp, #0x20]
00be37dc	add sp,sp,#0x60
00be37e0	autiasp
00be37e4	ret
00be37e8	bl 0x00bd8968
00be37ec	bl 0x00bd8968
