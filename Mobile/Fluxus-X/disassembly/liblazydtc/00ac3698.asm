; PKCS7_RECIP_INFO_set @ 00ac3698
00ac3698	str x21,[sp, #-0x30]!
00ac369c	stp x20,x19,[sp, #0x10]
00ac36a0	stp x29,x30,[sp, #0x20]
00ac36a4	mov x19,x0
00ac36a8	ldr x0,[x0]
00ac36ac	mov x20,x1
00ac36b0	mov x1,xzr
00ac36b4	add x29,sp,#0x20
00ac36b8	bl 0x00c375b0
00ac36bc	cbz w0,0x00ac37ec
00ac36c0	ldr x21,[x19, #0x8]
00ac36c4	mov x0,x20
00ac36c8	bl 0x00c32cf0
00ac36cc	mov x1,x0
00ac36d0	mov x0,x21
00ac36d4	bl 0x00c3ef30
00ac36d8	cbz w0,0x00ac37ec
00ac36dc	ldr x8,[x19, #0x8]
00ac36e0	ldr x0,[x8, #0x8]
00ac36e4	bl 0x00c37c30
00ac36e8	mov x0,x20
00ac36ec	bl 0x00c3f060
00ac36f0	bl 0x00c37570
00ac36f4	ldr x8,[x19, #0x8]
00ac36f8	str x0,[x8, #0x8]
00ac36fc	cbz x0,0x00ac37ec
00ac3700	mov x0,x20
00ac3704	bl 0x00c32cb0
00ac3708	cbz x0,0x00ac37ec
00ac370c	adrp x1,0x2b9000
00ac3710	add x1,x1,#0x9cf
00ac3714	mov x21,x0
00ac3718	bl 0x00c346e0
00ac371c	cbz w0,0x00ac3728
00ac3720	orr w0,wzr,#0xfffffffe
00ac3724	b 0x00ac37ec
00ac3728	adrp x1,0x2db000
00ac372c	add x1,x1,#0x996
00ac3730	mov x0,x21
00ac3734	bl 0x00c346e0
00ac3738	cbz w0,0x00ac3774
00ac373c	ldr x21,[x19, #0x10]
00ac3740	cbz x21,0x00ac3760
00ac3744	orr w0,wzr,#0x6
00ac3748	bl 0x00c37740
00ac374c	mov x1,x0
00ac3750	mov w2,#0x5
00ac3754	mov x0,x21
00ac3758	mov x3,xzr
00ac375c	bl 0x00c37ee0
00ac3760	mov x0,x20
00ac3764	bl 0x00c350b0
00ac3768	mov w0,#0x1
00ac376c	str x20,[x19, #0x20]
00ac3770	b 0x00ac37ec
00ac3774	ldr x8,[x21, #0x8]
00ac3778	cbz x8,0x00ac37bc
00ac377c	ldr x8,[x8, #0xb0]
00ac3780	cbz x8,0x00ac37bc
00ac3784	mov w1,#0x2
00ac3788	mov x0,x21
00ac378c	mov x2,xzr
00ac3790	mov x3,x19
00ac3794	blr x8
00ac3798	cmn w0,#0x2
00ac379c	b.ne 0x00ac37fc
00ac37a0	bl 0x00c342a0
00ac37a4	adrp x0,0x2ce000
00ac37a8	adrp x2,0x2b4000
00ac37ac	add x0,x0,#0x1ca
00ac37b0	add x2,x2,#0x8a8
00ac37b4	mov w1,#0x28d
00ac37b8	b 0x00ac37d4
00ac37bc	bl 0x00c342a0
00ac37c0	adrp x0,0x2ce000
00ac37c4	adrp x2,0x2b4000
00ac37c8	add x0,x0,#0x1ca
00ac37cc	add x2,x2,#0x8a8
00ac37d0	mov w1,#0x286
00ac37d4	bl 0x00c342b0
00ac37d8	mov w0,#0x21
00ac37dc	mov w1,#0x96
00ac37e0	mov x2,xzr
00ac37e4	bl 0x00c342c0
00ac37e8	mov w0,wzr
00ac37ec	ldp x29,x30,[sp, #0x20]
00ac37f0	ldp x20,x19,[sp, #0x10]
00ac37f4	ldr x21,[sp], #0x30
00ac37f8	ret
00ac37fc	cmp w0,#0x0
00ac3800	b.gt 0x00ac3760
00ac3804	bl 0x00c342a0
00ac3808	adrp x0,0x2ce000
00ac380c	adrp x2,0x2b4000
00ac3810	add x0,x0,#0x1ca
00ac3814	add x2,x2,#0x8a8
00ac3818	mov w1,#0x291
00ac381c	bl 0x00c342b0
00ac3820	mov w0,#0x21
00ac3824	mov w1,#0x95
00ac3828	b 0x00ac37e0
