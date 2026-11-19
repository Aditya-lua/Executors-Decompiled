; FUN_008b7bd4 @ 008b7bd4
008b7bd4	stp x29,x30,[sp, #-0x40]!
008b7bd8	stp x24,x23,[sp, #0x10]
008b7bdc	stp x22,x21,[sp, #0x20]
008b7be0	stp x20,x19,[sp, #0x30]
008b7be4	mov x29,sp
008b7be8	ldr x23,[x0, #0x60]
008b7bec	mov w20,w3
008b7bf0	mov x19,x2
008b7bf4	ldr x8,[x23, #0x650]
008b7bf8	cbnz x8,0x008b7d54
008b7bfc	sub x8,x19,#0x1
008b7c00	cmp x8,#0x3ff
008b7c04	b.hi 0x008b7c84
008b7c08	adrp x8,0xd1f000
008b7c0c	add x8,x8,#0x638
008b7c10	add x8,x8,x19
008b7c14	ldrsb x10,[x8, #0xa0]
008b7c18	tbnz x10,#0x3f,0x008b7c84
008b7c1c	strb wzr,[x1]
008b7c20	adrp x8,0xd1f000
008b7c24	ldr x9,[x0, #0x60]
008b7c28	ldr x12,[x4, #0x28]
008b7c2c	ldrb w8,[x8, #0x618]
008b7c30	add x11,x9,#0x1f0
008b7c34	cbnz x12,0x008b7c54
008b7c38	ldr w13,[x4, #0x30]
008b7c3c	tbz w13,#0x1f,0x008b7c54
008b7c40	ldr x13,[x11, x10, LSL #0x3]
008b7c44	str x13,[x4, #0x18]
008b7c48	cbz x13,0x008b7c50
008b7c4c	str x4,[x13, #0x10]
008b7c50	str x4,[x11, x10, LSL #0x3]
008b7c54	ldr w13,[x4, #0x34]
008b7c58	str x12,[x1, #0x8]
008b7c5c	str x1,[x4, #0x28]
008b7c60	subs w12,w13,#0x1
008b7c64	str w12,[x4, #0x34]
008b7c68	b.ne 0x008b7cd0
008b7c6c	ldp x13,x12,[x4, #0x10]
008b7c70	cbz x12,0x008b7c78
008b7c74	str x13,[x12, #0x10]
008b7c78	cbz x13,0x008b7d00
008b7c7c	str x12,[x13, #0x18]
008b7c80	b 0x008b7d10
008b7c84	ldp x10,x9,[x4]
008b7c88	ldr x8,[x0, #0x60]
008b7c8c	cbz x9,0x008b7c94
008b7c90	str x10,[x9]
008b7c94	cbz x10,0x008b7ca0
008b7c98	str x9,[x10, #0x8]
008b7c9c	b 0x008b7cb0
008b7ca0	ldr x10,[x23, #0x330]
008b7ca4	cmp x10,x4
008b7ca8	b.ne 0x008b7cb0
008b7cac	str x9,[x23, #0x330]
008b7cb0	adrp x9,0xd1f000
008b7cb4	ldrb w9,[x9, #0x618]
008b7cb8	cmp w9,#0x1
008b7cbc	ldp x9,x0,[x8, #0x48]
008b7cc0	ldrsw x2,[x4, #0x20]
008b7cc4	mov x1,x4
008b7cc8	mov x3,xzr
008b7ccc	blr x9
008b7cd0	add x8,x23,w20, UXTB  #0x3
008b7cd4	ldr x9,[x23, #0x10]
008b7cd8	ldr x10,[x8, #0x3848]
008b7cdc	sub x9,x9,x19
008b7ce0	str x9,[x23, #0x10]
008b7ce4	sub x9,x10,x19
008b7ce8	str x9,[x8, #0x3848]
008b7cec	ldp x20,x19,[sp, #0x30]
008b7cf0	ldp x22,x21,[sp, #0x20]
008b7cf4	ldp x24,x23,[sp, #0x10]
008b7cf8	ldp x29,x30,[sp], #0x40
008b7cfc	ret
008b7d00	ldr x13,[x11, x10, LSL #0x3]
008b7d04	cmp x13,x4
008b7d08	b.ne 0x008b7d10
008b7d0c	str x12,[x11, x10, LSL #0x3]
008b7d10	ldp x12,x11,[x4]
008b7d14	ldr x10,[x0, #0x60]
008b7d18	cbz x11,0x008b7d20
008b7d1c	str x12,[x11]
008b7d20	cbz x12,0x008b7d2c
008b7d24	str x11,[x12, #0x8]
008b7d28	b 0x008b7d3c
008b7d2c	ldr x12,[x9, #0x330]
008b7d30	cmp x12,x4
008b7d34	b.ne 0x008b7d3c
008b7d38	str x11,[x9, #0x330]
008b7d3c	ldp x8,x0,[x10, #0x48]
008b7d40	ldrsw x2,[x4, #0x20]
008b7d44	mov x1,x4
008b7d48	mov x3,xzr
008b7d4c	blr x8
008b7d50	b 0x008b7cd0
008b7d54	mov x21,x0
008b7d58	mov x22,x1
008b7d5c	mov x24,x4
008b7d60	blr x8
008b7d64	mov x1,x22
008b7d68	mov x0,x21
008b7d6c	mov x4,x24
008b7d70	b 0x008b7bfc
