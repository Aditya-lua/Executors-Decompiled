; ossl_curve448_scalar_halve @ 00a4ca80
00a4ca80	ldr x8,[x1]
00a4ca84	mov x9,#0x44f3
00a4ca88	movk x9,#0xab58, LSL #16
00a4ca8c	movk x9,#0xc292, LSL #32
00a4ca90	and x10,x8,#0x1
00a4ca94	movk x9,#0x2378, LSL #48
00a4ca98	neg x10,x10
00a4ca9c	and x9,x10,x9
00a4caa0	adds x8,x8,x9
00a4caa4	str x8,[x0]
00a4caa8	ldr x9,[x1, #0x8]
00a4caac	mov x11,#0x8f55
00a4cab0	movk x11,#0x8dc5, LSL #16
00a4cab4	movk x11,#0xc272, LSL #32
00a4cab8	adcs x12,xzr,xzr
00a4cabc	movk x11,#0x216c, LSL #48
00a4cac0	adds x9,x12,x9
00a4cac4	and x11,x10,x11
00a4cac8	adcs x12,xzr,xzr
00a4cacc	adds x9,x9,x11
00a4cad0	str x9,[x0, #0x8]
00a4cad4	ldr x11,[x1, #0x10]
00a4cad8	mov x13,#0x3690
00a4cadc	movk x13,#0xaed6, LSL #16
00a4cae0	movk x13,#0xdb49, LSL #32
00a4cae4	adcs x12,x12,xzr
00a4cae8	movk x13,#0xc44e, LSL #48
00a4caec	adds x11,x12,x11
00a4caf0	and x13,x10,x13
00a4caf4	adcs x12,xzr,xzr
00a4caf8	adds x11,x11,x13
00a4cafc	str x11,[x0, #0x10]
00a4cb00	ldr x13,[x1, #0x18]
00a4cb04	mov x14,#-0xdc17
00a4cb08	adcs x12,x12,xzr
00a4cb0c	movk x14,#0x7cca, LSL #16
00a4cb10	adds x12,x12,x13
00a4cb14	and x14,x10,x14
00a4cb18	adcs x13,xzr,xzr
00a4cb1c	adds x12,x12,x14
00a4cb20	str x12,[x0, #0x18]
00a4cb24	ldr x14,[x1, #0x20]
00a4cb28	adcs x13,x13,xzr
00a4cb2c	extr x8,x9,x8,#0x1
00a4cb30	extr x9,x11,x9,#0x1
00a4cb34	adds x13,x13,x14
00a4cb38	adcs x14,xzr,xzr
00a4cb3c	adds x13,x13,x10
00a4cb40	str x13,[x0, #0x20]
00a4cb44	ldr x15,[x1, #0x28]
00a4cb48	adcs x14,x14,xzr
00a4cb4c	extr x11,x12,x11,#0x1
00a4cb50	extr x12,x13,x12,#0x1
00a4cb54	adds x14,x14,x15
00a4cb58	adcs x15,xzr,xzr
00a4cb5c	adds x14,x14,x10
00a4cb60	str x14,[x0, #0x28]
00a4cb64	ldr x16,[x1, #0x30]
00a4cb68	adcs x15,x15,xzr
00a4cb6c	stp x8,x9,[x0]
00a4cb70	and x10,x10,#0x3fffffffffffffff
00a4cb74	adds x8,x15,x16
00a4cb78	adcs x9,xzr,xzr
00a4cb7c	adds x8,x8,x10
00a4cb80	adcs x9,x9,xzr
00a4cb84	extr x13,x14,x13,#0x1
00a4cb88	extr x10,x8,x14,#0x1
00a4cb8c	extr x8,x9,x8,#0x1
00a4cb90	stp x11,x12,[x0, #0x10]
00a4cb94	stp x13,x10,[x0, #0x20]
00a4cb98	str x8,[x0, #0x30]
00a4cb9c	ret
