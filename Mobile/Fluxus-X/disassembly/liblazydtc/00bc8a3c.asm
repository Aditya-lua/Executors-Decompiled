; std::__ndk1::stold @ 00bc8a3c
00bc8a3c	paciasp
00bc8a40	sub sp,sp,#0x80
00bc8a44	stp x29,x30,[sp, #0x50]
00bc8a48	stp x22,x21,[sp, #0x60]
00bc8a4c	stp x20,x19,[sp, #0x70]
00bc8a50	add x29,sp,#0x50
00bc8a54	mov w8,#0xa
00bc8a58	ldrb w9,[x0]
00bc8a5c	ldr x10,[x0, #0x10]
00bc8a60	strb w8,[sp, #0x18]
00bc8a64	mov w8,#0x7473
00bc8a68	mov x19,x1
00bc8a6c	movk w8,#0x6c6f, LSL #16
00bc8a70	tst w9,#0x1
00bc8a74	stur xzr,[x29, #-0x20]
00bc8a78	stur w8,[sp, #0x19]
00bc8a7c	mov w8,#0x64
00bc8a80	sturh w8,[sp, #0x1d]
00bc8a84	add x8,x0,#0x4
00bc8a88	csel x20,x8,x10,eq
00bc8a8c	bl 0x00c30710
00bc8a90	ldr w22,[x0]
00bc8a94	mov x21,x0
00bc8a98	str wzr,[x0]
00bc8a9c	sub x1,x29,#0x20
00bc8aa0	mov x0,x20
00bc8aa4	bl 0x00c43940
00bc8aa8	ldr w8,[x21]
00bc8aac	str w22,[x21]
00bc8ab0	cmp w8,#0x22
00bc8ab4	b.eq 0x00bc8af8
00bc8ab8	ldur x8,[x29, #-0x20]
00bc8abc	subs x8,x8,x20
00bc8ac0	b.eq 0x00bc8b3c
00bc8ac4	str q0,[sp]
00bc8ac8	cbz x19,0x00bc8ad4
00bc8acc	asr x8,x8,#0x2
00bc8ad0	str x8,[x19]
00bc8ad4	add x0,sp,#0x18
00bc8ad8	bl 0x00c43db0
00bc8adc	ldr q0,[sp]
00bc8ae0	ldp x20,x19,[sp, #0x70]
00bc8ae4	ldp x22,x21,[sp, #0x60]
00bc8ae8	ldp x29,x30,[sp, #0x50]
00bc8aec	add sp,sp,#0x80
00bc8af0	autiasp
00bc8af4	ret
00bc8af8	mov w9,#0x7473
00bc8afc	mov w8,#0x26
00bc8b00	stur xzr,[x29, #-0x8]
00bc8b04	movk w9,#0x6c6f, LSL #16
00bc8b08	sturb w8,[x29, #-0x18]
00bc8b0c	mov w8,#0x64
00bc8b10	stur w9,[x29, #-0x17]
00bc8b14	adrp x9,0x2ce000
00bc8b18	add x9,x9,#0xb11
00bc8b1c	ldr x10,[x9]
00bc8b20	sturb w8,[x29, #-0x13]
00bc8b24	ldur x8,[x9, #0x6]
00bc8b28	sub x9,x29,#0x18
00bc8b2c	stur x10,[x29, #-0x12]
00bc8b30	stur x8,[x29, #-0xc]
00bc8b34	orr x0,x9,#0x1
00bc8b38	bl 0x0080c8d0
00bc8b3c	mov w9,#0x7473
00bc8b40	mov w8,#0x28
00bc8b44	stur xzr,[x29, #-0x8]
00bc8b48	movk w9,#0x6c6f, LSL #16
00bc8b4c	sturb w8,[x29, #-0x18]
00bc8b50	mov w8,#0x64
00bc8b54	stur w9,[x29, #-0x17]
00bc8b58	adrp x9,0x2ac000
00bc8b5c	add x9,x9,#0xd16
00bc8b60	ldr x10,[x9]
00bc8b64	sturb w8,[x29, #-0x13]
00bc8b68	ldur x8,[x9, #0x7]
00bc8b6c	sub x9,x29,#0x18
00bc8b70	stur x10,[x29, #-0x12]
00bc8b74	stur x8,[x29, #-0xb]
00bc8b78	orr x0,x9,#0x1
00bc8b7c	bl 0x00bcab04
00bc8b80	b 0x00bc8b84
00bc8b84	mov x19,x0
00bc8b88	sub x0,x29,#0x18
00bc8b8c	bl 0x00c43db0
00bc8b90	b 0x00bc8b98
00bc8b98	add x0,sp,#0x18
00bc8b9c	bl 0x00c43db0
00bc8ba0	mov x0,x19
00bc8ba4	bl 0x00c2c090
