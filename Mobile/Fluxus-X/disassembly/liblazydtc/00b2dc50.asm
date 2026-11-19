; ossl_blake2b_init @ 00b2dc50
00b2dc50	stp x20,x19,[sp, #-0x20]!
00b2dc54	mov x19,x1
00b2dc58	mov x20,x0
00b2dc5c	add x0,x0,#0x40
00b2dc60	mov w2,#0xa8
00b2dc64	mov w1,wzr
00b2dc68	stp x29,x30,[sp, #0x10]
00b2dc6c	add x29,sp,#0x10
00b2dc70	bl 0x00c301c0
00b2dc74	adrp x8,0x77c000
00b2dc78	add x8,x8,#0x110
00b2dc7c	ldp q1,q0,[x8, #0x20]
00b2dc80	ldp q3,q2,[x8]
00b2dc84	mov x9,#0xc908
00b2dc88	movk x9,#0xf3bc, LSL #16
00b2dc8c	stp q1,q0,[x20, #0x20]
00b2dc90	stp q3,q2,[x20]
00b2dc94	ldrb w8,[x19]
00b2dc98	movk x9,#0xe667, LSL #32
00b2dc9c	movk x9,#0x6a09, LSL #48
00b2dca0	mov w0,#0x1
00b2dca4	str x8,[x20, #0xe8]
00b2dca8	ldr x8,[x19]
00b2dcac	eor x8,x8,x9
00b2dcb0	str x8,[x20]
00b2dcb4	ldr x8,[x19, #0x8]
00b2dcb8	mov x9,#0xa73b
00b2dcbc	movk x9,#0x84ca, LSL #16
00b2dcc0	movk x9,#0xae85, LSL #32
00b2dcc4	movk x9,#0xbb67, LSL #48
00b2dcc8	eor x8,x8,x9
00b2dccc	str x8,[x20, #0x8]
00b2dcd0	ldr x8,[x19, #0x10]
00b2dcd4	mov x9,#0xf82b
00b2dcd8	movk x9,#0xfe94, LSL #16
00b2dcdc	movk x9,#0xf372, LSL #32
00b2dce0	movk x9,#0x3c6e, LSL #48
00b2dce4	eor x8,x8,x9
00b2dce8	str x8,[x20, #0x10]
00b2dcec	ldr x8,[x19, #0x18]
00b2dcf0	mov x9,#0x36f1
00b2dcf4	movk x9,#0x5f1d, LSL #16
00b2dcf8	movk x9,#0xf53a, LSL #32
00b2dcfc	movk x9,#0xa54f, LSL #48
00b2dd00	eor x8,x8,x9
00b2dd04	str x8,[x20, #0x18]
00b2dd08	ldr x8,[x19, #0x20]
00b2dd0c	mov x9,#0x82d1
00b2dd10	movk x9,#0xade6, LSL #16
00b2dd14	movk x9,#0x527f, LSL #32
00b2dd18	movk x9,#0x510e, LSL #48
00b2dd1c	eor x8,x8,x9
00b2dd20	str x8,[x20, #0x20]
00b2dd24	ldr x8,[x19, #0x28]
00b2dd28	mov x9,#0x6c1f
00b2dd2c	movk x9,#0x2b3e, LSL #16
00b2dd30	movk x9,#0x688c, LSL #32
00b2dd34	movk x9,#0x9b05, LSL #48
00b2dd38	eor x8,x8,x9
00b2dd3c	str x8,[x20, #0x28]
00b2dd40	ldr x8,[x19, #0x30]
00b2dd44	mov x9,#0xbd6b
00b2dd48	movk x9,#0xfb41, LSL #16
00b2dd4c	movk x9,#0xd9ab, LSL #32
00b2dd50	movk x9,#0x1f83, LSL #48
00b2dd54	eor x8,x8,x9
00b2dd58	str x8,[x20, #0x30]
00b2dd5c	ldr x8,[x19, #0x38]
00b2dd60	mov x9,#0x2179
00b2dd64	movk x9,#0x137e, LSL #16
00b2dd68	movk x9,#0xcd19, LSL #32
00b2dd6c	movk x9,#0x5be0, LSL #48
00b2dd70	eor x8,x8,x9
00b2dd74	str x8,[x20, #0x38]
00b2dd78	ldp x29,x30,[sp, #0x10]
00b2dd7c	ldp x20,x19,[sp], #0x20
00b2dd80	ret
