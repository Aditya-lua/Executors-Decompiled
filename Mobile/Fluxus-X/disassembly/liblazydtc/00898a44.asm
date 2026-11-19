; FUN_00898a44 @ 00898a44
00898a44	stp x29,x30,[sp, #-0x40]!
00898a48	stp x24,x23,[sp, #0x10]
00898a4c	stp x22,x21,[sp, #0x20]
00898a50	stp x20,x19,[sp, #0x30]
00898a54	mov x29,sp
00898a58	ldp x10,x8,[x0]
00898a5c	mov x11,#0x6db7
00898a60	movk x11,#0xb6db, LSL #16
00898a64	mov x9,#0x1
00898a68	movk x11,#0xdb6d, LSL #32
00898a6c	sub x22,x8,x10
00898a70	movk x11,#0x6db6, LSL #48
00898a74	asr x8,x22,#0x3
00898a78	madd x9,x8,x11,x9
00898a7c	mov x8,#0x2492
00898a80	movk x8,#0x9249, LSL #16
00898a84	movk x8,#0x4924, LSL #32
00898a88	movk x8,#0x492, LSL #48
00898a8c	cmp x9,x8
00898a90	b.hi 0x00898bc4
00898a94	ldr x12,[x0, #0x10]
00898a98	mov x19,x0
00898a9c	sub x10,x12,x10
00898aa0	mov x12,#0x9249
00898aa4	asr x10,x10,#0x3
00898aa8	movk x12,#0x4924, LSL #16
00898aac	movk x12,#0x2492, LSL #32
00898ab0	mul x10,x10,x11
00898ab4	movk x12,#0x249, LSL #48
00898ab8	lsl x11,x10,#0x1
00898abc	cmp x11,x9
00898ac0	csel x9,x11,x9,hi
00898ac4	cmp x10,x12
00898ac8	csel x9,x9,x8,cc
00898acc	cmp x9,x8
00898ad0	b.hi 0x00898bc8
00898ad4	lsl x8,x9,#0x6
00898ad8	mov x20,x1
00898adc	sub x21,x8,x9, LSL #0x3
00898ae0	mov x0,x21
00898ae4	bl 0x00c2fed0
00898ae8	ldp q2,q0,[x20, #0x10]
00898aec	add x8,x0,x22
00898af0	stp xzr,xzr,[x20, #0x20]
00898af4	ldr x9,[x20, #0x30]
00898af8	add x22,x0,x21
00898afc	str xzr,[x20, #0x30]
00898b00	ldr q1,[x20]
00898b04	add x21,x8,#0x38
00898b08	ldp x20,x24,[x19]
00898b0c	str x9,[x8, #0x30]
00898b10	stp q1,q2,[x8]
00898b14	str q0,[x8, #0x20]
00898b18	subs x10,x20,x24
00898b1c	add x23,x8,x10
00898b20	b.eq 0x00898b90
00898b24	mov x8,x20
00898b28	mov x9,x23
00898b2c	ldp q1,q0,[x8]
00898b30	stp xzr,xzr,[x9, #0x28]
00898b34	stp q1,q0,[x9]
00898b38	ldr q0,[x8, #0x20]
00898b3c	str q0,[x9, #0x20]
00898b40	ldr x10,[x8, #0x30]
00898b44	str x10,[x9, #0x30]
00898b48	add x9,x9,#0x38
00898b4c	stp xzr,xzr,[x8, #0x20]
00898b50	str xzr,[x8, #0x30]
00898b54	add x8,x8,#0x38
00898b58	cmp x8,x24
00898b5c	b.ne 0x00898b2c
00898b60	b 0x00898b70
00898b64	add x20,x20,#0x38
00898b68	cmp x20,x24
00898b6c	b.eq 0x00898b8c
00898b70	ldr x0,[x20, #0x20]
00898b74	cbz x0,0x00898b64
00898b78	ldr x8,[x20, #0x30]
00898b7c	str x0,[x20, #0x28]
00898b80	sub x1,x8,x0
00898b84	bl 0x00c2fe80
00898b88	b 0x00898b64
00898b8c	ldr x20,[x19]
00898b90	ldr x8,[x19, #0x10]
00898b94	stp x23,x21,[x19]
00898b98	str x22,[x19, #0x10]
00898b9c	cbz x20,0x00898bac
00898ba0	sub x1,x8,x20
00898ba4	mov x0,x20
00898ba8	bl 0x00c2fe80
00898bac	mov x0,x21
00898bb0	ldp x20,x19,[sp, #0x30]
00898bb4	ldp x22,x21,[sp, #0x20]
00898bb8	ldp x24,x23,[sp, #0x10]
00898bbc	ldp x29,x30,[sp], #0x40
00898bc0	ret
00898bc4	bl 0x00898bcc
00898bc8	bl 0x007fe1b8
