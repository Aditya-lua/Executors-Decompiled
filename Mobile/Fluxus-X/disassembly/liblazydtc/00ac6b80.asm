; ossl_property_list_to_string @ 00ac6b80
00ac6b80	sub sp,sp,#0x80
00ac6b84	stp x28,x27,[sp, #0x20]
00ac6b88	stp x26,x25,[sp, #0x30]
00ac6b8c	stp x24,x23,[sp, #0x40]
00ac6b90	stp x22,x21,[sp, #0x50]
00ac6b94	stp x20,x19,[sp, #0x60]
00ac6b98	stp x29,x30,[sp, #0x70]
00ac6b9c	add x29,sp,#0x70
00ac6ba0	stp x3,x2,[sp, #0x10]
00ac6ba4	str xzr,[sp, #0x8]
00ac6ba8	cbz x1,0x00ac6e88
00ac6bac	ldr w8,[x1]
00ac6bb0	mov x19,x1
00ac6bb4	subs w8,w8,#0x1
00ac6bb8	b.lt 0x00ac6e5c
00ac6bbc	orr w9,wzr,#0x18
00ac6bc0	orr x27,xzr,#-0x3333333333333334
00ac6bc4	adrp x21,0x2a4000
00ac6bc8	smaddl x8,w8,w9,x19
00ac6bcc	mov x20,x0
00ac6bd0	mov w24,wzr
00ac6bd4	movk x27,#0xcccd
00ac6bd8	add x21,x21,#0x869
00ac6bdc	add x28,x8,#0x8
00ac6be0	mov w25,#0x2c
00ac6be4	ldr w8,[x28]
00ac6be8	cbz w8,0x00ac6e44
00ac6bec	ldr x8,[sp, #0x8]
00ac6bf0	cbz x8,0x00ac6c0c
00ac6bf4	ldr x9,[sp, #0x10]
00ac6bf8	cmp x9,#0x1
00ac6bfc	b.eq 0x00ac6c3c
00ac6c00	cbnz x9,0x00ac6c48
00ac6c04	add x8,x8,#0x1
00ac6c08	str x8,[sp, #0x8]
00ac6c0c	ldrb w9,[x28, #0xc]
00ac6c10	tbnz w9,#0x0,0x00ac6c74
00ac6c14	ldr w9,[x28, #0x8]
00ac6c18	cmp w9,#0x2
00ac6c1c	b.ne 0x00ac6cc4
00ac6c20	ldr x9,[sp, #0x10]
00ac6c24	cmp x9,#0x1
00ac6c28	b.eq 0x00ac6c90
00ac6c2c	cbz x9,0x00ac6c84
00ac6c30	ldr x8,[sp, #0x18]
00ac6c34	mov w9,#0x2d
00ac6c38	b 0x00ac6ca4
00ac6c3c	ldr x8,[sp, #0x18]
00ac6c40	strb wzr,[x8]
00ac6c44	b 0x00ac6c50
00ac6c48	ldr x8,[sp, #0x18]
00ac6c4c	strb w25,[x8]
00ac6c50	ldp x10,x8,[sp, #0x10]
00ac6c54	ldr x9,[sp, #0x8]
00ac6c58	add x11,x8,#0x1
00ac6c5c	add x8,x9,#0x1
00ac6c60	sub x9,x10,#0x1
00ac6c64	stp x9,x11,[sp, #0x10]
00ac6c68	str x8,[sp, #0x8]
00ac6c6c	ldrb w9,[x28, #0xc]
00ac6c70	tbz w9,#0x0,0x00ac6c14
00ac6c74	ldr x9,[sp, #0x10]
00ac6c78	cmp x9,#0x1
00ac6c7c	b.eq 0x00ac6c90
00ac6c80	cbnz x9,0x00ac6c9c
00ac6c84	add x8,x8,#0x1
00ac6c88	str x8,[sp, #0x8]
00ac6c8c	b 0x00ac6cc4
00ac6c90	ldr x8,[sp, #0x18]
00ac6c94	strb wzr,[x8]
00ac6c98	b 0x00ac6ca8
00ac6c9c	ldr x8,[sp, #0x18]
00ac6ca0	orr w9,wzr,#0x3f
00ac6ca4	strb w9,[x8]
00ac6ca8	ldp x10,x8,[sp, #0x10]
00ac6cac	ldr x9,[sp, #0x8]
00ac6cb0	add x8,x8,#0x1
00ac6cb4	add x9,x9,#0x1
00ac6cb8	sub x10,x10,#0x1
00ac6cbc	stp x10,x8,[sp, #0x10]
00ac6cc0	str x9,[sp, #0x8]
00ac6cc4	ldr w1,[x28]
00ac6cc8	mov x0,x20
00ac6ccc	bl 0x00c3f880
00ac6cd0	cbz x0,0x00ac6eb4
00ac6cd4	add x1,sp,#0x18
00ac6cd8	add x2,sp,#0x10
00ac6cdc	add x3,sp,#0x8
00ac6ce0	bl 0x00ac6ed4
00ac6ce4	ldr w8,[x28, #0x8]
00ac6ce8	cbz w8,0x00ac6d14
00ac6cec	cmp w8,#0x1
00ac6cf0	b.ne 0x00ac6e44
00ac6cf4	ldr x8,[sp, #0x10]
00ac6cf8	cmp x8,#0x1
00ac6cfc	b.eq 0x00ac6d44
00ac6d00	cbnz x8,0x00ac6d50
00ac6d04	ldr x8,[sp, #0x8]
00ac6d08	add x8,x8,#0x1
00ac6d0c	str x8,[sp, #0x8]
00ac6d10	b 0x00ac6d28
00ac6d14	ldr x8,[sp, #0x10]
00ac6d18	cmp x8,#0x1
00ac6d1c	b.eq 0x00ac6d80
00ac6d20	cbnz x8,0x00ac6d34
00ac6d24	ldr x8,[sp, #0x8]
00ac6d28	add x8,x8,#0x1
00ac6d2c	mov x22,xzr
00ac6d30	b 0x00ac6da0
00ac6d34	ldr x8,[sp, #0x18]
00ac6d38	mov w9,#0x3d
00ac6d3c	strb w9,[x8]
00ac6d40	b 0x00ac6d88
00ac6d44	ldr x8,[sp, #0x18]
00ac6d48	strb wzr,[x8]
00ac6d4c	b 0x00ac6d5c
00ac6d50	ldr x8,[sp, #0x18]
00ac6d54	mov w9,#0x21
00ac6d58	strb w9,[x8]
00ac6d5c	ldp x10,x8,[sp, #0x10]
00ac6d60	ldr x9,[sp, #0x8]
00ac6d64	add x11,x8,#0x1
00ac6d68	add x9,x9,#0x1
00ac6d6c	sub x8,x10,#0x1
00ac6d70	stp x8,x11,[sp, #0x10]
00ac6d74	str x9,[sp, #0x8]
00ac6d78	cmp x8,#0x1
00ac6d7c	b.ne 0x00ac6d20
00ac6d80	ldr x8,[sp, #0x18]
00ac6d84	strb wzr,[x8]
00ac6d88	ldp x10,x8,[sp, #0x10]
00ac6d8c	ldr x9,[sp, #0x8]
00ac6d90	add x11,x8,#0x1
00ac6d94	add x8,x9,#0x1
00ac6d98	sub x22,x10,#0x1
00ac6d9c	stp x22,x11,[sp, #0x10]
00ac6da0	str x8,[sp, #0x8]
00ac6da4	ldr w9,[x28, #0x4]
00ac6da8	cmp w9,#0x1
00ac6dac	b.eq 0x00ac6dd8
00ac6db0	cbnz w9,0x00ac6eb0
00ac6db4	ldr w1,[x28, #0x10]
00ac6db8	mov x0,x20
00ac6dbc	bl 0x00c3f8a0
00ac6dc0	cbz x0,0x00ac6eb4
00ac6dc4	add x1,sp,#0x18
00ac6dc8	add x2,sp,#0x10
00ac6dcc	add x3,sp,#0x8
00ac6dd0	bl 0x00ac6ed4
00ac6dd4	b 0x00ac6e44
00ac6dd8	ldr x3,[x28, #0x10]
00ac6ddc	cmp x3,#0x0
00ac6de0	cneg x9,x3,mi
00ac6de4	lsr x10,x3,#0x3f
00ac6de8	cmp x9,#0xa
00ac6dec	add x26,x10,#0x1
00ac6df0	b.lt 0x00ac6e08
00ac6df4	umulh x10,x9,x27
00ac6df8	cmp x9,#0x63
00ac6dfc	lsr x9,x10,#0x3
00ac6e00	add x26,x26,#0x1
00ac6e04	b.hi 0x00ac6df4
00ac6e08	add x8,x8,x26
00ac6e0c	str x8,[sp, #0x8]
00ac6e10	cbz x22,0x00ac6e44
00ac6e14	ldr x23,[sp, #0x18]
00ac6e18	mov x1,x22
00ac6e1c	mov x2,x21
00ac6e20	mov x0,x23
00ac6e24	bl 0x00c34d30
00ac6e28	subs x8,x22,x26
00ac6e2c	b.cs 0x00ac6e3c
00ac6e30	mov x8,xzr
00ac6e34	add x9,x23,x22
00ac6e38	b 0x00ac6e40
00ac6e3c	add x9,x23,x26
00ac6e40	stp x8,x9,[sp, #0x10]
00ac6e44	ldr w8,[x19]
00ac6e48	add w24,w24,#0x1
00ac6e4c	sub x28,x28,#0x18
00ac6e50	cmp w24,w8
00ac6e54	b.lt 0x00ac6be4
00ac6e58	ldr x3,[sp, #0x10]
00ac6e5c	cbz x3,0x00ac6e98
00ac6e60	ldr x8,[sp, #0x18]
00ac6e64	strb wzr,[x8]
00ac6e68	ldp x10,x8,[sp, #0x10]
00ac6e6c	ldr x9,[sp, #0x8]
00ac6e70	add x8,x8,#0x1
00ac6e74	add x0,x9,#0x1
00ac6e78	sub x9,x10,#0x1
00ac6e7c	stp x9,x8,[sp, #0x10]
00ac6e80	str x0,[sp, #0x8]
00ac6e84	b 0x00ac6eb4
00ac6e88	cbz x3,0x00ac6ea8
00ac6e8c	strb wzr,[x2]
00ac6e90	mov w0,#0x1
00ac6e94	b 0x00ac6eb4
00ac6e98	ldr x8,[sp, #0x8]
00ac6e9c	add x0,x8,#0x1
00ac6ea0	str x0,[sp, #0x8]
00ac6ea4	b 0x00ac6eb4
00ac6ea8	mov w0,#0x1
00ac6eac	b 0x00ac6eb4
00ac6eb0	mov x0,xzr
00ac6eb4	ldp x29,x30,[sp, #0x70]
00ac6eb8	ldp x20,x19,[sp, #0x60]
00ac6ebc	ldp x22,x21,[sp, #0x50]
00ac6ec0	ldp x24,x23,[sp, #0x40]
00ac6ec4	ldp x26,x25,[sp, #0x30]
00ac6ec8	ldp x28,x27,[sp, #0x20]
00ac6ecc	add sp,sp,#0x80
00ac6ed0	ret
