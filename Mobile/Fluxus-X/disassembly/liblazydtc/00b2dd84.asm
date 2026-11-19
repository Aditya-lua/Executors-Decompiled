; ossl_blake2b_init_key @ 00b2dd84
00b2dd84	sub sp,sp,#0xb0
00b2dd88	stp x22,x21,[sp, #0x80]
00b2dd8c	stp x20,x19,[sp, #0x90]
00b2dd90	mov x20,x2
00b2dd94	mov x21,x1
00b2dd98	mov x19,x0
00b2dd9c	add x0,x0,#0x40
00b2dda0	mov w2,#0xa8
00b2dda4	mov w1,wzr
00b2dda8	stp x29,x30,[sp, #0xa0]
00b2ddac	add x29,sp,#0xa0
00b2ddb0	bl 0x00c301c0
00b2ddb4	adrp x8,0x77c000
00b2ddb8	add x8,x8,#0x110
00b2ddbc	ldp q1,q0,[x8, #0x20]
00b2ddc0	ldp q3,q2,[x8]
00b2ddc4	mov x9,#0xc908
00b2ddc8	movk x9,#0xf3bc, LSL #16
00b2ddcc	stp q1,q0,[x19, #0x20]
00b2ddd0	stp q3,q2,[x19]
00b2ddd4	ldrb w8,[x21]
00b2ddd8	movk x9,#0xe667, LSL #32
00b2dddc	movk x9,#0x6a09, LSL #48
00b2dde0	mov x0,sp
00b2dde4	str x8,[x19, #0xe8]
00b2dde8	ldr x8,[x21]
00b2ddec	mov w2,#0x80
00b2ddf0	mov w1,wzr
00b2ddf4	mov w22,#0x80
00b2ddf8	eor x8,x8,x9
00b2ddfc	str x8,[x19]
00b2de00	ldr x8,[x21, #0x8]
00b2de04	mov x9,#0xa73b
00b2de08	movk x9,#0x84ca, LSL #16
00b2de0c	movk x9,#0xae85, LSL #32
00b2de10	movk x9,#0xbb67, LSL #48
00b2de14	eor x8,x8,x9
00b2de18	str x8,[x19, #0x8]
00b2de1c	ldr x8,[x21, #0x10]
00b2de20	mov x9,#0xf82b
00b2de24	movk x9,#0xfe94, LSL #16
00b2de28	movk x9,#0xf372, LSL #32
00b2de2c	movk x9,#0x3c6e, LSL #48
00b2de30	eor x8,x8,x9
00b2de34	str x8,[x19, #0x10]
00b2de38	ldr x8,[x21, #0x18]
00b2de3c	mov x9,#0x36f1
00b2de40	movk x9,#0x5f1d, LSL #16
00b2de44	movk x9,#0xf53a, LSL #32
00b2de48	movk x9,#0xa54f, LSL #48
00b2de4c	eor x8,x8,x9
00b2de50	str x8,[x19, #0x18]
00b2de54	ldr x8,[x21, #0x20]
00b2de58	mov x9,#0x82d1
00b2de5c	movk x9,#0xade6, LSL #16
00b2de60	movk x9,#0x527f, LSL #32
00b2de64	movk x9,#0x510e, LSL #48
00b2de68	eor x8,x8,x9
00b2de6c	str x8,[x19, #0x20]
00b2de70	ldr x8,[x21, #0x28]
00b2de74	mov x9,#0x6c1f
00b2de78	movk x9,#0x2b3e, LSL #16
00b2de7c	movk x9,#0x688c, LSL #32
00b2de80	movk x9,#0x9b05, LSL #48
00b2de84	eor x8,x8,x9
00b2de88	str x8,[x19, #0x28]
00b2de8c	ldr x8,[x21, #0x30]
00b2de90	mov x9,#0xbd6b
00b2de94	movk x9,#0xfb41, LSL #16
00b2de98	movk x9,#0xd9ab, LSL #32
00b2de9c	movk x9,#0x1f83, LSL #48
00b2dea0	eor x8,x8,x9
00b2dea4	str x8,[x19, #0x30]
00b2dea8	ldr x8,[x21, #0x38]
00b2deac	mov x9,#0x2179
00b2deb0	movk x9,#0x137e, LSL #16
00b2deb4	movk x9,#0xcd19, LSL #32
00b2deb8	movk x9,#0x5be0, LSL #48
00b2debc	eor x8,x8,x9
00b2dec0	str x8,[x19, #0x38]
00b2dec4	bl 0x00c301c0
00b2dec8	ldrb w2,[x21, #0x1]
00b2decc	mov x0,sp
00b2ded0	mov x1,x20
00b2ded4	bl 0x00c2ffd0
00b2ded8	add x0,x19,#0x60
00b2dedc	mov x1,sp
00b2dee0	mov w2,#0x80
00b2dee4	bl 0x00c2ffd0
00b2dee8	mov x0,sp
00b2deec	mov w1,#0x80
00b2def0	str x22,[x19, #0xe0]
00b2def4	bl 0x00c34750
00b2def8	ldp x29,x30,[sp, #0xa0]
00b2defc	ldp x20,x19,[sp, #0x90]
00b2df00	ldp x22,x21,[sp, #0x80]
00b2df04	mov w0,#0x1
00b2df08	add sp,sp,#0xb0
00b2df0c	ret
