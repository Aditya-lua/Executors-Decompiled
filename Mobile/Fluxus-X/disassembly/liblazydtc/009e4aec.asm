; tls_get_message_body @ 009e4aec
009e4aec	sub sp,sp,#0x40
009e4af0	stp x22,x21,[sp, #0x10]
009e4af4	stp x20,x19,[sp, #0x20]
009e4af8	stp x29,x30,[sp, #0x30]
009e4afc	ldr w8,[x0, #0x2d8]
009e4b00	mov x20,x0
009e4b04	mov x19,x1
009e4b08	add x29,sp,#0x30
009e4b0c	cmp w8,#0x101
009e4b10	b.ne 0x009e4b34
009e4b14	ldr x8,[x20, #0x98]
009e4b18	mov w0,#0x1
009e4b1c	str x8,[x19]
009e4b20	ldp x29,x30,[sp, #0x30]
009e4b24	ldp x20,x19,[sp, #0x20]
009e4b28	ldp x22,x21,[sp, #0x10]
009e4b2c	add sp,sp,#0x40
009e4b30	ret
009e4b34	ldr x9,[x20, #0x2d0]
009e4b38	ldr x8,[x20, #0x98]
009e4b3c	subs x21,x9,x8
009e4b40	b.eq 0x009e4b90
009e4b44	ldr x22,[x20, #0x90]
009e4b48	ldr x9,[x20, #0x8]
009e4b4c	add x3,x22,x8
009e4b50	mov w1,#0x16
009e4b54	add x6,sp,#0x8
009e4b58	ldr x9,[x9, #0x68]
009e4b5c	mov x0,x20
009e4b60	mov x2,xzr
009e4b64	mov x4,x21
009e4b68	mov w5,wzr
009e4b6c	blr x9
009e4b70	cmp w0,#0x0
009e4b74	b.le 0x009e4c38
009e4b78	ldr x9,[sp, #0x8]
009e4b7c	ldr x8,[x20, #0x98]
009e4b80	subs x21,x21,x9
009e4b84	add x8,x8,x9
009e4b88	str x8,[x20, #0x98]
009e4b8c	b.ne 0x009e4b48
009e4b90	ldr x8,[x20, #0x88]
009e4b94	ldr x8,[x8, #0x8]
009e4b98	ldrb w8,[x8]
009e4b9c	cmp w8,#0x14
009e4ba0	b.ne 0x009e4bec
009e4ba4	ldr x9,[x20, #0x8]
009e4ba8	ldr w8,[x20, #0x38]
009e4bac	orr w10,wzr,#0x30
009e4bb0	mov w11,#0x40
009e4bb4	ldr x9,[x9, #0xc0]
009e4bb8	orr w12,wzr,#0x38
009e4bbc	mov w13,#0x48
009e4bc0	cmp w8,#0x0
009e4bc4	csel x8,x11,x10,eq
009e4bc8	csel x10,x13,x12,eq
009e4bcc	ldr x2,[x9, x10#0x0]
009e4bd0	ldr x1,[x9, x8#0x0]
009e4bd4	ldr x8,[x9, #0x28]
009e4bd8	add x3,x20,#0x248
009e4bdc	mov x0,x20
009e4be0	blr x8
009e4be4	str x0,[x20, #0x2c8]
009e4be8	cbz x0,0x009e4d0c
009e4bec	add x0,x20,#0xc58
009e4bf0	bl 0x00c36c00
009e4bf4	cbz w0,0x009e4c4c
009e4bf8	ldr x8,[x20, #0x88]
009e4bfc	ldr x2,[x20, #0x98]
009e4c00	mov x0,x20
009e4c04	ldr x1,[x8, #0x8]
009e4c08	bl 0x00c345b0
009e4c0c	cbz w0,0x009e4d0c
009e4c10	ldr x8,[x20, #0x4c0]
009e4c14	cbz x8,0x009e4b14
009e4c18	ldr x9,[x20, #0x88]
009e4c1c	ldr x4,[x20, #0x98]
009e4c20	ldr x6,[x20, #0x4c8]
009e4c24	mov w1,#0x2
009e4c28	ldr x3,[x9, #0x8]
009e4c2c	mov w0,wzr
009e4c30	mov w2,wzr
009e4c34	b 0x009e4d00
009e4c38	orr w9,wzr,#0x3
009e4c3c	mov x8,xzr
009e4c40	mov w0,wzr
009e4c44	str w9,[x20, #0x28]
009e4c48	b 0x009e4b1c
009e4c4c	ldr x8,[x20, #0x8]
009e4c50	ldr x9,[x8, #0xc0]
009e4c54	ldrb w9,[x9, #0x60]
009e4c58	tbnz w9,#0x3,0x009e4c88
009e4c5c	ldr w8,[x8]
009e4c60	cmp w8,#0x304
009e4c64	b.lt 0x009e4c88
009e4c68	cmp w8,#0x10, LSL #12
009e4c6c	b.eq 0x009e4c88
009e4c70	ldr w8,[x20, #0x2d8]
009e4c74	cmp w8,#0x4
009e4c78	b.eq 0x009e4cd8
009e4c7c	cmp w8,#0x18
009e4c80	b.eq 0x009e4cd8
009e4c84	b 0x009e4c8c
009e4c88	ldr w8,[x20, #0x2d8]
009e4c8c	ldr x21,[x20, #0x98]
009e4c90	cmp w8,#0x2
009e4c94	b.ne 0x009e4cc0
009e4c98	cmp x21,#0x26
009e4c9c	b.cc 0x009e4cc0
009e4ca0	ldr x8,[x20, #0x88]
009e4ca4	adrp x0,0xcb5000
009e4ca8	mov w2,#0x20
009e4cac	ldr x8,[x8, #0x8]
009e4cb0	ldr x0,[x0, #0x1e0]
009e4cb4	add x1,x8,#0x6
009e4cb8	bl 0x00c300b0
009e4cbc	cbz w0,0x009e4cd8
009e4cc0	ldr x8,[x20, #0x88]
009e4cc4	add x2,x21,#0x4
009e4cc8	mov x0,x20
009e4ccc	ldr x1,[x8, #0x8]
009e4cd0	bl 0x00c345b0
009e4cd4	cbz w0,0x009e4d0c
009e4cd8	ldr x8,[x20, #0x4c0]
009e4cdc	cbz x8,0x009e4b14
009e4ce0	ldr x9,[x20, #0x88]
009e4ce4	ldr x10,[x20, #0x98]
009e4ce8	ldr w1,[x20]
009e4cec	ldr x6,[x20, #0x4c8]
009e4cf0	ldr x3,[x9, #0x8]
009e4cf4	add x4,x10,#0x4
009e4cf8	mov w2,#0x16
009e4cfc	mov w0,wzr
009e4d00	mov x5,x20
009e4d04	blr x8
009e4d08	b 0x009e4b14
009e4d0c	mov x8,xzr
009e4d10	b 0x009e4b1c
