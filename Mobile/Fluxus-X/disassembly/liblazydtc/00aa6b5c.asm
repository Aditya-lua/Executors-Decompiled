; MD5_Final @ 00aa6b5c
00aa6b5c	str x21,[sp, #-0x30]!
00aa6b60	stp x20,x19,[sp, #0x10]
00aa6b64	stp x29,x30,[sp, #0x20]
00aa6b68	ldr w8,[x1, #0x58]
00aa6b6c	add x21,x1,#0x18
00aa6b70	mov w9,#0x80
00aa6b74	mov x20,x1
00aa6b78	mov x19,x0
00aa6b7c	strb w9,[x21, x8]
00aa6b80	cmp w8,#0x38
00aa6b84	add x9,x8,#0x1
00aa6b88	add x29,sp,#0x20
00aa6b8c	b.cc 0x00aa6bb8
00aa6b90	add x0,x21,x9
00aa6b94	orr w9,wzr,#0x3f
00aa6b98	sub x2,x9,x8
00aa6b9c	mov w1,wzr
00aa6ba0	bl 0x00c301c0
00aa6ba4	mov w2,#0x1
00aa6ba8	mov x0,x20
00aa6bac	mov x1,x21
00aa6bb0	bl 0x00aa6150
00aa6bb4	mov x9,xzr
00aa6bb8	orr w8,wzr,#0x38
00aa6bbc	add x0,x21,x9
00aa6bc0	sub x2,x8,x9
00aa6bc4	mov w1,wzr
00aa6bc8	bl 0x00c301c0
00aa6bcc	ldp w8,w9,[x20, #0x10]
00aa6bd0	mov w2,#0x1
00aa6bd4	mov x0,x20
00aa6bd8	mov x1,x21
00aa6bdc	lsr w10,w8,#0x8
00aa6be0	strb w10,[x20, #0x51]
00aa6be4	lsr w10,w8,#0x10
00aa6be8	strb w8,[x20, #0x50]
00aa6bec	lsr w8,w8,#0x18
00aa6bf0	strb w8,[x20, #0x53]
00aa6bf4	lsr w8,w9,#0x8
00aa6bf8	strb w9,[x20, #0x54]
00aa6bfc	strb w8,[x20, #0x55]
00aa6c00	lsr w8,w9,#0x10
00aa6c04	lsr w9,w9,#0x18
00aa6c08	strb w10,[x20, #0x52]
00aa6c0c	strb w8,[x20, #0x56]
00aa6c10	strb w9,[x20, #0x57]
00aa6c14	bl 0x00aa6150
00aa6c18	mov w1,#0x40
00aa6c1c	mov x0,x21
00aa6c20	str wzr,[x20, #0x58]
00aa6c24	bl 0x00c34750
00aa6c28	ldr w8,[x20]
00aa6c2c	mov w0,#0x1
00aa6c30	lsr w9,w8,#0x8
00aa6c34	strb w8,[x19]
00aa6c38	strb w9,[x19, #0x1]
00aa6c3c	lsr w9,w8,#0x10
00aa6c40	lsr w8,w8,#0x18
00aa6c44	strb w9,[x19, #0x2]
00aa6c48	strb w8,[x19, #0x3]
00aa6c4c	ldr w8,[x20, #0x4]
00aa6c50	lsr w9,w8,#0x8
00aa6c54	strb w8,[x19, #0x4]
00aa6c58	strb w9,[x19, #0x5]
00aa6c5c	lsr w9,w8,#0x10
00aa6c60	lsr w8,w8,#0x18
00aa6c64	strb w9,[x19, #0x6]
00aa6c68	strb w8,[x19, #0x7]
00aa6c6c	ldr w8,[x20, #0x8]
00aa6c70	lsr w9,w8,#0x8
00aa6c74	strb w8,[x19, #0x8]
00aa6c78	strb w9,[x19, #0x9]
00aa6c7c	lsr w9,w8,#0x10
00aa6c80	lsr w8,w8,#0x18
00aa6c84	strb w9,[x19, #0xa]
00aa6c88	strb w8,[x19, #0xb]
00aa6c8c	ldr w8,[x20, #0xc]
00aa6c90	lsr w9,w8,#0x8
00aa6c94	strb w8,[x19, #0xc]
00aa6c98	strb w9,[x19, #0xd]
00aa6c9c	lsr w9,w8,#0x10
00aa6ca0	lsr w8,w8,#0x18
00aa6ca4	strb w9,[x19, #0xe]
00aa6ca8	strb w8,[x19, #0xf]
00aa6cac	ldp x29,x30,[sp, #0x20]
00aa6cb0	ldp x20,x19,[sp, #0x10]
00aa6cb4	ldr x21,[sp], #0x30
00aa6cb8	ret
