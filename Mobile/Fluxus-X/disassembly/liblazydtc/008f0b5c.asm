; cpr::Session::DownloadAsync @ 008f0b5c
008f0b5c	sub sp,sp,#0x110
008f0b60	stp x28,x25,[sp, #0xc0]
008f0b64	stp x24,x23,[sp, #0xd0]
008f0b68	stp x22,x21,[sp, #0xe0]
008f0b6c	stp x20,x19,[sp, #0xf0]
008f0b70	stp x29,x30,[sp, #0x100]
008f0b74	add x29,sp,#0x100
008f0b78	mrs x24,tpidr_el0
008f0b7c	mov x20,x8
008f0b80	ldr x8,[x24, #0x28]
008f0b84	mov x19,x1
008f0b88	mov x21,sp
008f0b8c	stur x8,[x29, #-0x48]
008f0b90	mov x8,sp
008f0b94	bl 0x00c31300
008f0b98	ldr x8,[x19]
008f0b9c	str x8,[sp, #0x10]
008f0ba0	ldr x0,[x19, #0x30]
008f0ba4	cbz x0,0x008f0bc8
008f0ba8	add x8,x19,#0x10
008f0bac	cmp x8,x0
008f0bb0	b.eq 0x008f0bd0
008f0bb4	ldr x8,[x0]
008f0bb8	ldr x8,[x8, #0x10]
008f0bbc	blr x8
008f0bc0	str x0,[sp, #0x40]
008f0bc4	b 0x008f0be4
008f0bc8	str xzr,[sp, #0x40]
008f0bcc	b 0x008f0be4
008f0bd0	add x1,x21,#0x20
008f0bd4	str x1,[sp, #0x40]
008f0bd8	ldr x8,[x0]
008f0bdc	ldr x8,[x8, #0x18]
008f0be0	blr x8
008f0be4	bl 0x00c30d70
008f0be8	add x8,x0,#0x20
008f0bec	ldar w8,[x8]
008f0bf0	mov x21,x0
008f0bf4	cbnz w8,0x008f0c04
008f0bf8	mov x0,x21
008f0bfc	mov x1,xzr
008f0c00	bl 0x00c31330
008f0c04	add x8,x21,#0x30
008f0c08	ldar x8,[x8]
008f0c0c	cbnz x8,0x008f0c2c
008f0c10	add x8,x21,#0x28
008f0c14	ldar x8,[x8]
008f0c18	ldr x9,[x21, #0x10]
008f0c1c	cmp x8,x9
008f0c20	b.cs 0x008f0c2c
008f0c24	mov x0,x21
008f0c28	bl 0x00c31320
008f0c2c	ldr q0,[sp]
008f0c30	ldr x8,[sp, #0x10]
008f0c34	ldr x0,[sp, #0x40]
008f0c38	stp xzr,xzr,[sp]
008f0c3c	str q0,[sp, #0x50]
008f0c40	str x8,[sp, #0x60]
008f0c44	cbz x0,0x008f0c6c
008f0c48	mov x8,sp
008f0c4c	add x8,x8,#0x20
008f0c50	cmp x8,x0
008f0c54	b.eq 0x008f0c74
008f0c58	ldr x8,[x0]
008f0c5c	ldr x8,[x8, #0x10]
008f0c60	blr x8
008f0c64	str x0,[sp, #0x90]
008f0c68	b 0x008f0c8c
008f0c6c	str xzr,[sp, #0x90]
008f0c70	b 0x008f0c8c
008f0c74	add x8,sp,#0x50
008f0c78	add x1,x8,#0x20
008f0c7c	str x1,[sp, #0x90]
008f0c80	ldr x8,[x0]
008f0c84	ldr x8,[x8, #0x18]
008f0c88	blr x8
008f0c8c	orr w0,wzr,#0x60
008f0c90	bl 0x00c2fed0
008f0c94	str xzr,[x0, #0x10]
008f0c98	adrp x8,0xcb4000
008f0c9c	ldr x8,[x8, #0xd50]
008f0ca0	mov x25,x0
008f0ca4	mov x19,x0
008f0ca8	str xzr,[x25, #0x8]!
008f0cac	add x8,x8,#0x10
008f0cb0	str x8,[x0]
008f0cb4	str xzr,[x0, #0x40]
008f0cb8	orr w0,wzr,#0x70
008f0cbc	bl 0x00c2fed0
008f0cc0	mov x22,x0
008f0cc4	ldp x9,x10,[sp, #0x50]
008f0cc8	ldr x11,[sp, #0x60]
008f0ccc	ldr x0,[sp, #0x90]
008f0cd0	adrp x8,0xc4e000
008f0cd4	add x8,x8,#0x9d8
008f0cd8	add x8,x8,#0x10
008f0cdc	stp xzr,xzr,[sp, #0x50]
008f0ce0	str x8,[x22]
008f0ce4	stp x9,x10,[x22, #0x10]
008f0ce8	str x11,[x22, #0x20]
008f0cec	cbz x0,0x008f0d14
008f0cf0	add x8,sp,#0x50
008f0cf4	add x8,x8,#0x20
008f0cf8	cmp x8,x0
008f0cfc	b.eq 0x008f0d1c
008f0d00	ldr x8,[x0]
008f0d04	ldr x8,[x8, #0x10]
008f0d08	blr x8
008f0d0c	str x0,[x22, #0x50]
008f0d10	b 0x008f0d30
008f0d14	str xzr,[x22, #0x50]
008f0d18	b 0x008f0d30
008f0d1c	add x1,x22,#0x30
008f0d20	str x1,[x22, #0x50]
008f0d24	ldr x8,[x0]
008f0d28	ldr x8,[x8, #0x18]
008f0d2c	blr x8
008f0d30	str x22,[x19, #0x40]
008f0d34	mov w0,#0x188
008f0d38	bl 0x00c2fed0
008f0d3c	mov x23,x0
008f0d40	add x0,x0,#0x8
008f0d44	mov w2,#0x6c
008f0d48	mov w1,wzr
008f0d4c	bl 0x00c301c0
008f0d50	adrp x8,0xcb4000
008f0d54	ldr x8,[x8, #0xd40]
008f0d58	ldr x0,[sp, #0x90]
008f0d5c	str x23,[x19, #0x50]
008f0d60	add x8,x8,#0x10
008f0d64	str x8,[x23]
008f0d68	add x8,sp,#0x50
008f0d6c	add x8,x8,#0x20
008f0d70	cmp x8,x0
008f0d74	b.eq 0x008f0d88
008f0d78	cbz x0,0x008f0d94
008f0d7c	ldr x8,[x0]
008f0d80	ldr x8,[x8, #0x28]
008f0d84	b 0x008f0d90
008f0d88	ldr x8,[x0]
008f0d8c	ldr x8,[x8, #0x20]
008f0d90	blr x8
008f0d94	ldr x22,[sp, #0x58]
008f0d98	cbz x22,0x008f0dcc
008f0d9c	add x8,x22,#0x8
008f0da0	ldaxr x9,[x8]
008f0da4	sub x10,x9,#0x1
008f0da8	stlxr w11,x10,[x8]
008f0dac	cbnz w11,0x008f0da0
008f0db0	cbnz x9,0x008f0dcc
008f0db4	ldr x8,[x22]
008f0db8	mov x0,x22
008f0dbc	ldr x8,[x8, #0x10]
008f0dc0	blr x8
008f0dc4	mov x0,x22
008f0dc8	bl 0x00c2ff00
008f0dcc	ldr x1,[x19, #0x50]
008f0dd0	cbz x1,0x008f0f6c
008f0dd4	add x0,sp,#0x50
008f0dd8	bl 0x00c316e0
008f0ddc	add x22,x21,#0xa8
008f0de0	mov x0,x22
008f0de4	bl 0x00c2ff10
008f0de8	add x23,x19,#0x20
008f0dec	ldxr x8,[x25]
008f0df0	add x8,x8,#0x1
008f0df4	stxr w9,x8,[x25]
008f0df8	cbnz w9,0x008f0dec
008f0dfc	ldp x9,x10,[x21, #0x80]
008f0e00	ldp x12,x8,[x21, #0x98]
008f0e04	mov w11,#0x55
008f0e08	subs x13,x10,x9
008f0e0c	asr x13,x13,#0x3
008f0e10	mul x11,x13,x11
008f0e14	sub x11,x11,#0x1
008f0e18	csel x13,xzr,x11,eq
008f0e1c	add x11,x8,x12
008f0e20	cmp x13,x11
008f0e24	b.ne 0x008f0e3c
008f0e28	add x0,x21,#0x78
008f0e2c	bl 0x00c31620
008f0e30	ldp x11,x8,[x21, #0x98]
008f0e34	ldp x9,x10,[x21, #0x80]
008f0e38	add x11,x11,x8
008f0e3c	cmp x10,x9
008f0e40	b.eq 0x008f0e6c
008f0e44	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f0e48	movk x10,#0xc0c1
008f0e4c	umulh x10,x11,x10
008f0e50	lsr x10,x10,#0x6
008f0e54	ldr x9,[x9, x10, LSL #0x3]
008f0e58	mov w12,#0x55
008f0e5c	msub x10,x10,x12,x11
008f0e60	orr w11,wzr,#0x30
008f0e64	madd x9,x10,x11,x9
008f0e68	b 0x008f0e70
008f0e6c	mov x9,xzr
008f0e70	adrp x10,0xc4e000
008f0e74	add x10,x10,#0xa38
008f0e78	add x8,x8,#0x1
008f0e7c	add x10,x10,#0x10
008f0e80	mov x0,x22
008f0e84	stp x23,x19,[x9, #0x8]
008f0e88	str x9,[x9, #0x20]
008f0e8c	str x10,[x9]
008f0e90	str x8,[x21, #0xa0]
008f0e94	bl 0x00c2ff20
008f0e98	add x0,x21,#0xd0
008f0e9c	bl 0x00c315f0
008f0ea0	ldr x21,[sp, #0x50]
008f0ea4	ldaxr x8,[x25]
008f0ea8	sub x9,x8,#0x1
008f0eac	stlxr w10,x9,[x25]
008f0eb0	cbnz w10,0x008f0ea4
008f0eb4	cbnz x8,0x008f0ed0
008f0eb8	ldr x8,[x19]
008f0ebc	mov x0,x19
008f0ec0	ldr x8,[x8, #0x10]
008f0ec4	blr x8
008f0ec8	mov x0,x19
008f0ecc	bl 0x00c2ff00
008f0ed0	ldr x0,[sp, #0x40]
008f0ed4	mov x8,sp
008f0ed8	add x8,x8,#0x20
008f0edc	stp xzr,xzr,[x20, #0x8]
008f0ee0	cmp x8,x0
008f0ee4	str x21,[x20]
008f0ee8	b.eq 0x008f0efc
008f0eec	cbz x0,0x008f0f08
008f0ef0	ldr x8,[x0]
008f0ef4	ldr x8,[x8, #0x28]
008f0ef8	b 0x008f0f04
008f0efc	ldr x8,[x0]
008f0f00	ldr x8,[x8, #0x20]
008f0f04	blr x8
008f0f08	ldr x19,[sp, #0x8]
008f0f0c	cbz x19,0x008f0f40
008f0f10	add x8,x19,#0x8
008f0f14	ldaxr x9,[x8]
008f0f18	sub x10,x9,#0x1
008f0f1c	stlxr w11,x10,[x8]
008f0f20	cbnz w11,0x008f0f14
008f0f24	cbnz x9,0x008f0f40
008f0f28	ldr x8,[x19]
008f0f2c	mov x0,x19
008f0f30	ldr x8,[x8, #0x10]
008f0f34	blr x8
008f0f38	mov x0,x19
008f0f3c	bl 0x00c2ff00
008f0f40	ldr x8,[x24, #0x28]
008f0f44	ldur x9,[x29, #-0x48]
008f0f48	cmp x8,x9
008f0f4c	b.ne 0x008f0fa4
008f0f50	ldp x29,x30,[sp, #0x100]
008f0f54	ldp x20,x19,[sp, #0xf0]
008f0f58	ldp x22,x21,[sp, #0xe0]
008f0f5c	ldp x24,x23,[sp, #0xd0]
008f0f60	ldp x28,x25,[sp, #0xc0]
008f0f64	add sp,sp,#0x110
008f0f68	ret
008f0f6c	mov w0,#0x20
008f0f70	bl 0x00c30000
008f0f74	mov x21,x0
008f0f78	bl 0x00c315c0
008f0f7c	mov x2,x0
008f0f80	orr w1,wzr,#0x3
008f0f84	mov x0,x21
008f0f88	bl 0x00c314d0
008f0f8c	adrp x1,0xcb4000
008f0f90	adrp x2,0xcb4000
008f0f94	ldr x1,[x1, #0xd20]
008f0f98	ldr x2,[x2, #0xd08]
008f0f9c	mov x0,x21
008f0fa0	bl 0x00c30020
008f0fa4	bl 0x00c2fec0
