; FUN_00a4bc44 @ 00a4bc44
00a4bc44	sub sp,sp,#0xb0
00a4bc48	movi v0.2D,#0x0
00a4bc4c	stp x28,x27,[sp, #0x50]
00a4bc50	stp x26,x25,[sp, #0x60]
00a4bc54	stp x24,x23,[sp, #0x70]
00a4bc58	stp x22,x21,[sp, #0x80]
00a4bc5c	stp x20,x19,[sp, #0x90]
00a4bc60	stp x29,x30,[sp, #0xa0]
00a4bc64	str x0,[sp, #0x8]
00a4bc68	stp q0,q0,[sp, #0x30]
00a4bc6c	stp q0,q0,[sp, #0x10]
00a4bc70	mov x9,#0x8bc5
00a4bc74	mov x14,#0x2cd0
00a4bc78	ldp x16,x17,[x2]
00a4bc7c	ldp x18,x4,[x2, #0x10]
00a4bc80	ldp x5,x6,[x2, #0x20]
00a4bc84	ldr x2,[x2, #0x30]
00a4bc88	mov x7,#0x254d
00a4bc8c	mov x21,#0x743b
00a4bc90	movk x9,#0xae91, LSL #16
00a4bc94	movk x14,#0xa208, LSL #16
00a4bc98	movk x7,#0x7e06, LSL #16
00a4bc9c	movk x21,#0x516e, LSL #16
00a4bca0	movk x9,#0x440f, LSL #32
00a4bca4	movk x14,#0xd47c, LSL #32
00a4bca8	mov x15,#-0xdc17
00a4bcac	movk x7,#0xc9ea, LSL #32
00a4bcb0	movk x21,#0xbbf0, LSL #32
00a4bcb4	mov x8,xzr
00a4bcb8	mov x22,xzr
00a4bcbc	mov x23,xzr
00a4bcc0	mov x24,xzr
00a4bcc4	mov x25,xzr
00a4bcc8	mov x26,xzr
00a4bccc	mov x27,xzr
00a4bcd0	mov x28,xzr
00a4bcd4	mov x3,xzr
00a4bcd8	movk x9,#0x3bd, LSL #48
00a4bcdc	movk x14,#0x48ac, LSL #48
00a4bce0	movk x15,#0x7cca, LSL #16
00a4bce4	movk x7,#0xe5ed, LSL #48
00a4bce8	mov x19,#-0x1
00a4bcec	orr x20,xzr,#0x3fffffffffffffff
00a4bcf0	movk x21,#0x3c42, LSL #48
00a4bcf4	add x29,sp,#0xa0
00a4bcf8	ldr x10,[x1, x8#0x0]
00a4bcfc	add x8,x8,#0x8
00a4bd00	mul x30,x16,x10
00a4bd04	umulh x0,x16,x10
00a4bd08	adds x30,x30,x28
00a4bd0c	adcs x0,x0,xzr
00a4bd10	adds x0,x0,x27
00a4bd14	mul x12,x17,x10
00a4bd18	adcs x27,xzr,xzr
00a4bd1c	umulh x11,x17,x10
00a4bd20	adds x12,x0,x12
00a4bd24	adcs x11,x27,x11
00a4bd28	adds x11,x11,x26
00a4bd2c	mul x0,x18,x10
00a4bd30	adcs x26,xzr,xzr
00a4bd34	umulh x28,x18,x10
00a4bd38	adds x11,x11,x0
00a4bd3c	adcs x26,x26,x28
00a4bd40	adds x25,x26,x25
00a4bd44	mul x0,x4,x10
00a4bd48	adcs x26,xzr,xzr
00a4bd4c	umulh x27,x4,x10
00a4bd50	adds x0,x25,x0
00a4bd54	adcs x26,x26,x27
00a4bd58	adds x24,x26,x24
00a4bd5c	mul x25,x5,x10
00a4bd60	adcs x26,xzr,xzr
00a4bd64	umulh x28,x5,x10
00a4bd68	adds x24,x24,x25
00a4bd6c	adcs x26,x26,x28
00a4bd70	adds x23,x26,x23
00a4bd74	mul x25,x6,x10
00a4bd78	adcs x26,xzr,xzr
00a4bd7c	umulh x27,x6,x10
00a4bd80	adds x23,x23,x25
00a4bd84	adcs x25,x26,x27
00a4bd88	adds x22,x25,x22
00a4bd8c	umulh x28,x2,x10
00a4bd90	mul x10,x2,x10
00a4bd94	adcs x25,xzr,xzr
00a4bd98	adds x22,x22,x10
00a4bd9c	mov x10,#0x7369
00a4bda0	movk x10,#0x52ff, LSL #16
00a4bda4	movk x10,#0x636e, LSL #32
00a4bda8	movk x10,#0x5eeb, LSL #48
00a4bdac	neg x26,x30
00a4bdb0	mul x27,x30,x10
00a4bdb4	adcs x10,x25,x28
00a4bdb8	cmn x30,x26
00a4bdbc	mov x26,#0x44f3
00a4bdc0	movk x26,#0xab58, LSL #16
00a4bdc4	movk x26,#0xc292, LSL #32
00a4bdc8	mul x13,x30,x9
00a4bdcc	movk x26,#0x2378, LSL #48
00a4bdd0	umulh x26,x13,x26
00a4bdd4	adcs x26,x26,xzr
00a4bdd8	adds x12,x26,x12
00a4bddc	adcs x26,xzr,xzr
00a4bde0	adds x28,x12,x27
00a4bde4	mov x12,#0x8f55
00a4bde8	movk x12,#0x8dc5, LSL #16
00a4bdec	movk x12,#0xc272, LSL #32
00a4bdf0	movk x12,#0x216c, LSL #48
00a4bdf4	umulh x12,x13,x12
00a4bdf8	adcs x12,x26,x12
00a4bdfc	adds x11,x12,x11
00a4be00	mul x25,x30,x14
00a4be04	adcs x12,xzr,xzr
00a4be08	adds x27,x11,x25
00a4be0c	mov x11,#0x3690
00a4be10	movk x11,#0xaed6, LSL #16
00a4be14	movk x11,#0xdb49, LSL #32
00a4be18	movk x11,#0xc44e, LSL #48
00a4be1c	umulh x11,x13,x11
00a4be20	adcs x11,x12,x11
00a4be24	adds x11,x11,x0
00a4be28	mul x26,x30,x7
00a4be2c	adcs x0,xzr,xzr
00a4be30	adds x26,x11,x26
00a4be34	umulh x11,x13,x15
00a4be38	adcs x11,x0,x11
00a4be3c	adds x11,x11,x24
00a4be40	mneg x12,x30,x9
00a4be44	adcs x24,xzr,xzr
00a4be48	umulh x0,x13,x19
00a4be4c	adds x25,x11,x12
00a4be50	adcs x11,x24,x0
00a4be54	adds x11,x11,x23
00a4be58	adcs x23,xzr,xzr
00a4be5c	adds x24,x11,x12
00a4be60	adcs x11,x23,x0
00a4be64	adds x11,x11,x22
00a4be68	mul x12,x30,x21
00a4be6c	adcs x0,xzr,xzr
00a4be70	adds x23,x11,x12
00a4be74	umulh x11,x13,x20
00a4be78	adcs x11,x0,x11
00a4be7c	adds x11,x11,x3
00a4be80	adcs x12,xzr,xzr
00a4be84	adds x22,x11,x10
00a4be88	adcs x3,x12,xzr
00a4be8c	cmp x8,#0x38
00a4be90	b.ne 0x00a4bcf8
00a4be94	ldr x0,[sp, #0x8]
00a4be98	adrp x2,0x765000
00a4be9c	add x2,x2,#0xf28
00a4bea0	add x1,sp,#0x10
00a4bea4	stp x22,x10,[sp, #0x40]
00a4bea8	stp x28,x27,[sp, #0x10]
00a4beac	stp x26,x25,[sp, #0x20]
00a4beb0	stp x24,x23,[sp, #0x30]
00a4beb4	bl 0x00a4bee0
00a4beb8	ldp x29,x30,[sp, #0xa0]
00a4bebc	ldp x20,x19,[sp, #0x90]
00a4bec0	ldp x22,x21,[sp, #0x80]
00a4bec4	ldp x24,x23,[sp, #0x70]
00a4bec8	ldp x26,x25,[sp, #0x60]
00a4becc	ldp x28,x27,[sp, #0x50]
00a4bed0	add sp,sp,#0xb0
00a4bed4	ret
