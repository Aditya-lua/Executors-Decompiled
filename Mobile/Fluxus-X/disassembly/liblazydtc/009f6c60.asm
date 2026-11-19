; FUN_009f6c60 @ 009f6c60
009f6c60	sub sp,sp,#0x30
009f6c64	stp x29,x30,[sp, #0x20]
009f6c68	add x29,sp,#0x20
009f6c6c	stur x1,[x29, #-0x8]
009f6c70	ldr x8,[x3, #0x20]
009f6c74	str x19,[sp, #0x10]
009f6c78	cbz x8,0x009f6c90
009f6c7c	ldr x8,[x8, #0x30]
009f6c80	cbz x8,0x009f6c90
009f6c84	blr x8
009f6c88	mov w8,w0
009f6c8c	b 0x009f6df8
009f6c90	ldrb w8,[x3]
009f6c94	cbnz w8,0x009f6ca4
009f6c98	ldr x9,[x3, #0x8]
009f6c9c	cmp x9,#0x1
009f6ca0	b.eq 0x009f6cdc
009f6ca4	ldr x9,[x0]
009f6ca8	cbz x9,0x009f6df4
009f6cac	cmp w8,#0x5
009f6cb0	b.ne 0x009f6cc0
009f6cb4	ldr w8,[x9, #0x4]
009f6cb8	str w8,[x2]
009f6cbc	b 0x009f6ce0
009f6cc0	ldr x8,[x3, #0x8]
009f6cc4	cmn x8,#0x4
009f6cc8	b.ne 0x009f6cdc
009f6ccc	ldr x0,[x0]
009f6cd0	ldr w8,[x0], #0x8
009f6cd4	str w8,[x2]
009f6cd8	b 0x009f6ce0
009f6cdc	ldr w8,[x2]
009f6ce0	sub w8,w8,#0x1
009f6ce4	cmp w8,#0x9
009f6ce8	b.hi 0x009f6d7c
009f6cec	adrp x9,0x74e000
009f6cf0	add x9,x9,#0x1dc
009f6cf4	ldrsw x8,[x9, x8, LSL #0x2]
009f6cf8	add x9,x8,x9
009f6cfc	mov w8,wzr
009f6d00	br x9
009f6d04	ldr x0,[x0]
009f6d08	cmp x1,#0x0
009f6d0c	sub x8,x29,#0x8
009f6d10	csel x1,xzr,x8,eq
009f6d14	bl 0x00c37620
009f6d18	mov w8,w0
009f6d1c	b 0x009f6df8
009f6d20	ldr w8,[x0]
009f6d24	cmn w8,#0x1
009f6d28	b.eq 0x009f6df8
009f6d2c	ldr x9,[x3, #0x8]
009f6d30	cmn x9,#0x4
009f6d34	b.ne 0x009f6dc8
009f6d38	strb w8,[sp, #0xc]
009f6d3c	mov w19,#0x1
009f6d40	add x9,sp,#0xc
009f6d44	cbz x1,0x009f6dc0
009f6d48	cbz w19,0x009f6dc0
009f6d4c	sxtw x2,w19
009f6d50	mov x0,x1
009f6d54	mov x1,x9
009f6d58	bl 0x00c2ffd0
009f6d5c	b 0x009f6dc0
009f6d60	ldr x0,[x0]
009f6d64	cmp x1,#0x0
009f6d68	sub x8,x29,#0x8
009f6d6c	csel x1,xzr,x8,eq
009f6d70	bl 0x00c373f0
009f6d74	mov w8,w0
009f6d78	b 0x009f6df8
009f6d7c	ldr x9,[x3, #0x28]
009f6d80	ldr x8,[x0]
009f6d84	cmp x9,#0x800
009f6d88	b.ne 0x009f6d94
009f6d8c	ldrb w9,[x8, #0x10]
009f6d90	tbnz w9,#0x4,0x009f6ddc
009f6d94	ldr x9,[x8, #0x8]
009f6d98	ldr w19,[x8]
009f6d9c	cbnz x1,0x009f6d48
009f6da0	b 0x009f6dc0
009f6da4	ldr x10,[x0]
009f6da8	mov w8,#0xffffffff
009f6dac	ldr x9,[x10, #0x18]
009f6db0	cbz x9,0x009f6df8
009f6db4	ldr w19,[x10, #0x14]
009f6db8	cbz w19,0x009f6df8
009f6dbc	cbnz x1,0x009f6d48
009f6dc0	mov w8,w19
009f6dc4	b 0x009f6df8
009f6dc8	ldr x9,[x3, #0x28]
009f6dcc	cbz w8,0x009f6df0
009f6dd0	cmp x9,#0x0
009f6dd4	b.gt 0x009f6df4
009f6dd8	b 0x009f6d38
009f6ddc	cbz x1,0x009f6e0c
009f6de0	str x1,[x8, #0x8]
009f6de4	str wzr,[x8]
009f6de8	orr w8,wzr,#0xfffffffe
009f6dec	b 0x009f6df8
009f6df0	cbnz x9,0x009f6d38
009f6df4	mov w8,#0xffffffff
009f6df8	ldp x29,x30,[sp, #0x20]
009f6dfc	ldr x19,[sp, #0x10]
009f6e00	mov w0,w8
009f6e04	add sp,sp,#0x30
009f6e08	ret
009f6e0c	orr w8,wzr,#0xfffffffe
009f6e10	b 0x009f6df8
