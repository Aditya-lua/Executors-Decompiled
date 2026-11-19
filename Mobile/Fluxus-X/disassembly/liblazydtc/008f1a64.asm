; cpr::Session::OptionsAsync @ 008f1a64
008f1a64	sub sp,sp,#0x70
008f1a68	stp x26,x25,[sp, #0x20]
008f1a6c	stp x24,x23,[sp, #0x30]
008f1a70	stp x22,x21,[sp, #0x40]
008f1a74	stp x20,x19,[sp, #0x50]
008f1a78	stp x29,x30,[sp, #0x60]
008f1a7c	add x29,sp,#0x60
008f1a80	mrs x24,tpidr_el0
008f1a84	mov x20,x8
008f1a88	ldr x8,[x24, #0x28]
008f1a8c	str x8,[sp, #0x18]
008f1a90	mov x8,sp
008f1a94	bl 0x00c31300
008f1a98	bl 0x00c30d70
008f1a9c	add x8,x0,#0x20
008f1aa0	ldar w8,[x8]
008f1aa4	mov x21,x0
008f1aa8	cbnz w8,0x008f1ab8
008f1aac	mov x0,x21
008f1ab0	mov x1,xzr
008f1ab4	bl 0x00c31330
008f1ab8	add x8,x21,#0x30
008f1abc	ldar x8,[x8]
008f1ac0	cbnz x8,0x008f1ae0
008f1ac4	add x8,x21,#0x28
008f1ac8	ldar x8,[x8]
008f1acc	ldr x9,[x21, #0x10]
008f1ad0	cmp x8,x9
008f1ad4	b.cs 0x008f1ae0
008f1ad8	mov x0,x21
008f1adc	bl 0x00c31320
008f1ae0	ldp x23,x22,[sp]
008f1ae4	stp xzr,xzr,[sp]
008f1ae8	orr w0,wzr,#0x60
008f1aec	bl 0x00c2fed0
008f1af0	str xzr,[x0, #0x10]
008f1af4	adrp x8,0xcb4000
008f1af8	ldr x8,[x8, #0xd50]
008f1afc	adrp x9,0xc4e000
008f1b00	add x9,x9,#0xc78
008f1b04	mov x25,x0
008f1b08	mov x26,x0
008f1b0c	add x8,x8,#0x10
008f1b10	add x9,x9,#0x10
008f1b14	mov x19,x0
008f1b18	str xzr,[x25, #0x8]!
008f1b1c	str x8,[x0]
008f1b20	str x9,[x26, #0x20]!
008f1b24	str x26,[x0, #0x40]
008f1b28	stp x23,x22,[x0, #0x28]
008f1b2c	mov w0,#0x188
008f1b30	bl 0x00c2fed0
008f1b34	mov x23,x0
008f1b38	add x0,x0,#0x8
008f1b3c	mov w2,#0x6c
008f1b40	mov w1,wzr
008f1b44	bl 0x00c301c0
008f1b48	adrp x8,0xcb4000
008f1b4c	ldr x8,[x8, #0xd40]
008f1b50	str x23,[x19, #0x50]
008f1b54	add x8,x8,#0x10
008f1b58	str x8,[x23]
008f1b5c	add x0,sp,#0x10
008f1b60	mov x1,x23
008f1b64	bl 0x00c316e0
008f1b68	add x22,x21,#0xa8
008f1b6c	mov x0,x22
008f1b70	bl 0x00c2ff10
008f1b74	ldxr x8,[x25]
008f1b78	add x8,x8,#0x1
008f1b7c	stxr w9,x8,[x25]
008f1b80	cbnz w9,0x008f1b74
008f1b84	ldp x9,x10,[x21, #0x80]
008f1b88	ldp x12,x8,[x21, #0x98]
008f1b8c	mov w11,#0x55
008f1b90	subs x13,x10,x9
008f1b94	asr x13,x13,#0x3
008f1b98	mul x11,x13,x11
008f1b9c	sub x11,x11,#0x1
008f1ba0	csel x13,xzr,x11,eq
008f1ba4	add x11,x8,x12
008f1ba8	cmp x13,x11
008f1bac	b.ne 0x008f1bc4
008f1bb0	add x0,x21,#0x78
008f1bb4	bl 0x00c31620
008f1bb8	ldp x11,x8,[x21, #0x98]
008f1bbc	ldp x9,x10,[x21, #0x80]
008f1bc0	add x11,x11,x8
008f1bc4	cmp x10,x9
008f1bc8	b.eq 0x008f1bf4
008f1bcc	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f1bd0	movk x10,#0xc0c1
008f1bd4	umulh x10,x11,x10
008f1bd8	lsr x10,x10,#0x6
008f1bdc	ldr x9,[x9, x10, LSL #0x3]
008f1be0	mov w12,#0x55
008f1be4	msub x10,x10,x12,x11
008f1be8	orr w11,wzr,#0x30
008f1bec	madd x9,x10,x11,x9
008f1bf0	b 0x008f1bf8
008f1bf4	mov x9,xzr
008f1bf8	adrp x10,0xc4e000
008f1bfc	add x10,x10,#0xcd8
008f1c00	add x8,x8,#0x1
008f1c04	add x10,x10,#0x10
008f1c08	mov x0,x22
008f1c0c	stp x26,x19,[x9, #0x8]
008f1c10	str x9,[x9, #0x20]
008f1c14	str x10,[x9]
008f1c18	str x8,[x21, #0xa0]
008f1c1c	bl 0x00c2ff20
008f1c20	add x0,x21,#0xd0
008f1c24	bl 0x00c315f0
008f1c28	ldr x21,[sp, #0x10]
008f1c2c	ldaxr x8,[x25]
008f1c30	sub x9,x8,#0x1
008f1c34	stlxr w10,x9,[x25]
008f1c38	cbnz w10,0x008f1c2c
008f1c3c	cbnz x8,0x008f1c58
008f1c40	ldr x8,[x19]
008f1c44	mov x0,x19
008f1c48	ldr x8,[x8, #0x10]
008f1c4c	blr x8
008f1c50	mov x0,x19
008f1c54	bl 0x00c2ff00
008f1c58	ldr x19,[sp, #0x8]
008f1c5c	stp xzr,xzr,[x20, #0x8]
008f1c60	str x21,[x20]
008f1c64	cbz x19,0x008f1c98
008f1c68	add x8,x19,#0x8
008f1c6c	ldaxr x9,[x8]
008f1c70	sub x10,x9,#0x1
008f1c74	stlxr w11,x10,[x8]
008f1c78	cbnz w11,0x008f1c6c
008f1c7c	cbnz x9,0x008f1c98
008f1c80	ldr x8,[x19]
008f1c84	mov x0,x19
008f1c88	ldr x8,[x8, #0x10]
008f1c8c	blr x8
008f1c90	mov x0,x19
008f1c94	bl 0x00c2ff00
008f1c98	ldr x8,[x24, #0x28]
008f1c9c	ldr x9,[sp, #0x18]
008f1ca0	cmp x8,x9
008f1ca4	b.ne 0x008f1cc4
008f1ca8	ldp x29,x30,[sp, #0x60]
008f1cac	ldp x20,x19,[sp, #0x50]
008f1cb0	ldp x22,x21,[sp, #0x40]
008f1cb4	ldp x24,x23,[sp, #0x30]
008f1cb8	ldp x26,x25,[sp, #0x20]
008f1cbc	add sp,sp,#0x70
008f1cc0	ret
008f1cc4	bl 0x00c2fec0
