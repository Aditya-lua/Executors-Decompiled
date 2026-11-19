; FUN_00848aa8 @ 00848aa8
00848aa8	sub sp,sp,#0x90
00848aac	stp x29,x30,[sp, #0x40]
00848ab0	str x25,[sp, #0x50]
00848ab4	stp x24,x23,[sp, #0x60]
00848ab8	stp x22,x21,[sp, #0x70]
00848abc	stp x20,x19,[sp, #0x80]
00848ac0	add x29,sp,#0x40
00848ac4	mrs x25,tpidr_el0
00848ac8	mov x19,x8
00848acc	sub x21,x2,x1
00848ad0	ldr x8,[x25, #0x28]
00848ad4	cmn x21,#0x8
00848ad8	stur x8,[x29, #-0x8]
00848adc	b.cs 0x00848cfc
00848ae0	mov x22,x2
00848ae4	mov x20,x0
00848ae8	cmp x21,#0x16
00848aec	b.hi 0x00848b0c
00848af0	lsl w8,w21,#0x1
00848af4	add x9,sp,#0x20
00848af8	orr x23,x9,#0x1
00848afc	strb w8,[sp, #0x20]
00848b00	cmp x22,x1
00848b04	b.ne 0x00848b44
00848b08	b 0x00848b50
00848b0c	orr x8,x21,#0x7
00848b10	mov w9,#0x1a
00848b14	mov x23,x1
00848b18	cmp x8,#0x17
00848b1c	csinc x24,x9,x8,eq
00848b20	mov x0,x24
00848b24	bl 0x00c2fed0
00848b28	mov x1,x23
00848b2c	mov x23,x0
00848b30	orr x8,x24,#0x1
00848b34	stp x21,x0,[sp, #0x28]
00848b38	str x8,[sp, #0x20]
00848b3c	cmp x22,x1
00848b40	b.eq 0x00848b50
00848b44	mov x0,x23
00848b48	mov x2,x21
00848b4c	bl 0x00c2ffd0
00848b50	strb wzr,[x23, x21]
00848b54	ldrb w8,[sp, #0x20]
00848b58	ldr x9,[sp, #0x28]
00848b5c	stp xzr,xzr,[x19, #0x8]
00848b60	str xzr,[x19]
00848b64	lsr x10,x8,#0x1
00848b68	tst w8,#0x1
00848b6c	csel x9,x10,x9,eq
00848b70	cbz x9,0x00848cb8
00848b74	ldr x9,[sp, #0x30]
00848b78	add x21,sp,#0x20
00848b7c	tst w8,#0x1
00848b80	csinc x0,x9,x21,ne
00848b84	add x8,sp,#0x8
00848b88	bl 0x00c30680
00848b8c	ldur q0,[sp, #0x8]
00848b90	ldr x11,[sp, #0x18]
00848b94	str q0,[x19]
00848b98	ldrb w8,[x19]
00848b9c	ldr x9,[x19, #0x8]
00848ba0	str x11,[x19, #0x10]
00848ba4	lsr x10,x8,#0x1
00848ba8	tst w8,#0x1
00848bac	csel x8,x10,x9,eq
00848bb0	cbnz x8,0x00848cb8
00848bb4	ldrb w8,[sp, #0x20]
00848bb8	ldr x9,[sp, #0x28]
00848bbc	lsr x10,x8,#0x1
00848bc0	tst w8,#0x1
00848bc4	csel x9,x10,x9,eq
00848bc8	cmp x9,#0x2
00848bcc	b.hi 0x00848cb8
00848bd0	ldr x0,[x20, #0x10]
00848bd4	ldr x11,[sp, #0x30]
00848bd8	orr x20,x21,#0x1
00848bdc	tst w8,#0x1
00848be0	ldr x10,[x0]
00848be4	csel x1,x20,x11,eq
00848be8	ldr x10,[x10, #0x20]
00848bec	add x8,sp,#0x8
00848bf0	add x2,x1,x9
00848bf4	blr x10
00848bf8	ldrb w8,[x19]
00848bfc	tbz w8,#0x0,0x00848c10
00848c00	ldr x8,[x19]
00848c04	ldr x0,[x19, #0x10]
00848c08	and x1,x8,#-0x2
00848c0c	bl 0x00c2fe80
00848c10	ldur q0,[sp, #0x8]
00848c14	ldr x11,[sp, #0x18]
00848c18	str q0,[x19]
00848c1c	ldrb w8,[x19]
00848c20	ldr x9,[x19, #0x8]
00848c24	str x11,[x19, #0x10]
00848c28	lsr x10,x8,#0x1
00848c2c	tst w8,#0x1
00848c30	csel x9,x10,x9,eq
00848c34	cmp x9,#0xc
00848c38	b.eq 0x00848c44
00848c3c	cmp x9,#0x1
00848c40	b.ne 0x00848c70
00848c44	add x9,sp,#0x20
00848c48	cmp x19,x9
00848c4c	b.eq 0x00848cb8
00848c50	ldrb w9,[sp, #0x20]
00848c54	tbnz w8,#0x0,0x00848c7c
00848c58	tbnz w9,#0x0,0x00848cac
00848c5c	ldr q0,[sp, #0x20]
00848c60	ldr x8,[sp, #0x30]
00848c64	str q0,[x19]
00848c68	str x8,[x19, #0x10]
00848c6c	b 0x00848cb8
00848c70	tbnz w8,#0x0,0x00848c9c
00848c74	strh wzr,[x19]
00848c78	b 0x00848cb8
00848c7c	ldp x10,x8,[sp, #0x28]
00848c80	lsr x11,x9,#0x1
00848c84	tst w9,#0x1
00848c88	csel x1,x20,x8,eq
00848c8c	csel x2,x11,x10,eq
00848c90	mov x0,x19
00848c94	bl 0x007fe004
00848c98	b 0x00848cb8
00848c9c	ldr x8,[x19, #0x10]
00848ca0	strb wzr,[x8]
00848ca4	str xzr,[x19, #0x8]
00848ca8	b 0x00848cb8
00848cac	ldp x2,x1,[sp, #0x28]
00848cb0	mov x0,x19
00848cb4	bl 0x007fdf5c
00848cb8	ldrb w8,[sp, #0x20]
00848cbc	tbz w8,#0x0,0x00848cd0
00848cc0	ldr x8,[sp, #0x20]
00848cc4	ldr x0,[sp, #0x30]
00848cc8	and x1,x8,#-0x2
00848ccc	bl 0x00c2fe80
00848cd0	ldr x8,[x25, #0x28]
00848cd4	ldur x9,[x29, #-0x8]
00848cd8	cmp x8,x9
00848cdc	b.ne 0x00848d64
00848ce0	ldp x20,x19,[sp, #0x80]
00848ce4	ldr x25,[sp, #0x50]
00848ce8	ldp x22,x21,[sp, #0x70]
00848cec	ldp x24,x23,[sp, #0x60]
00848cf0	ldp x29,x30,[sp, #0x40]
00848cf4	add sp,sp,#0x90
00848cf8	ret
00848cfc	ldr x8,[x25, #0x28]
00848d00	ldur x9,[x29, #-0x8]
00848d04	cmp x8,x9
00848d08	b.ne 0x00848d64
00848d0c	bl 0x007fe124
00848d64	bl 0x00c2fec0
