; IDEA_cfb64_encrypt @ 00a96bb8
00a96bb8	sub sp,sp,#0x60
00a96bbc	stp x24,x23,[sp, #0x20]
00a96bc0	stp x22,x21,[sp, #0x30]
00a96bc4	stp x20,x19,[sp, #0x40]
00a96bc8	stp x29,x30,[sp, #0x50]
00a96bcc	str x25,[sp, #0x10]
00a96bd0	ldr w25,[x5]
00a96bd4	mov x19,x5
00a96bd8	add x29,sp,#0x50
00a96bdc	tbnz w25,#0x1f,0x00a96cc0
00a96be0	mov x20,x4
00a96be4	mov x21,x3
00a96be8	mov x22,x2
00a96bec	mov x23,x1
00a96bf0	mov x24,x0
00a96bf4	cbz w6,0x00a96cc8
00a96bf8	cbz x22,0x00a96d8c
00a96bfc	cbnz w25,0x00a96c94
00a96c00	ldrb w8,[x20]
00a96c04	ldrb w9,[x20, #0x1]
00a96c08	ldrb w10,[x20, #0x2]
00a96c0c	ldrb w11,[x20, #0x3]
00a96c10	lsl x8,x8,#0x18
00a96c14	bfm x8,x9,#0x30,#0x7
00a96c18	bfm x8,x10,#0x38,#0x7
00a96c1c	orr x8,x8,x11
00a96c20	str x8,[sp]
00a96c24	ldrb w8,[x20, #0x4]
00a96c28	ldrb w9,[x20, #0x5]
00a96c2c	ldrb w10,[x20, #0x6]
00a96c30	ldrb w11,[x20, #0x7]
00a96c34	lsl x8,x8,#0x18
00a96c38	bfm x8,x9,#0x30,#0x7
00a96c3c	bfm x8,x10,#0x38,#0x7
00a96c40	orr x8,x8,x11
00a96c44	mov x0,sp
00a96c48	mov x1,x21
00a96c4c	str x8,[sp, #0x8]
00a96c50	bl 0x00c3ddb0
00a96c54	ldr x8,[sp]
00a96c58	lsr x9,x8,#0x18
00a96c5c	strb w9,[x20]
00a96c60	lsr x9,x8,#0x10
00a96c64	strb w8,[x20, #0x3]
00a96c68	lsr x8,x8,#0x8
00a96c6c	strb w9,[x20, #0x1]
00a96c70	strb w8,[x20, #0x2]
00a96c74	ldr x8,[sp, #0x8]
00a96c78	lsr x9,x8,#0x18
00a96c7c	strb w9,[x20, #0x4]
00a96c80	lsr x9,x8,#0x10
00a96c84	strb w9,[x20, #0x5]
00a96c88	lsr x9,x8,#0x8
00a96c8c	strb w9,[x20, #0x6]
00a96c90	strb w8,[x20, #0x7]
00a96c94	sxtw x9,w25
00a96c98	ldrb w8,[x24], #0x1
00a96c9c	ldrb w10,[x20, x9]
00a96ca0	add w11,w25,#0x1
00a96ca4	subs x22,x22,#0x1
00a96ca8	and w25,w11,#0x7
00a96cac	eor w8,w10,w8
00a96cb0	strb w8,[x23], #0x1
00a96cb4	strb w8,[x20, x9]
00a96cb8	b.ne 0x00a96bfc
00a96cbc	b 0x00a96d8c
00a96cc0	mov w25,#0xffffffff
00a96cc4	b 0x00a96d90
00a96cc8	cbz x22,0x00a96d8c
00a96ccc	cbnz w25,0x00a96d64
00a96cd0	ldrb w8,[x20]
00a96cd4	ldrb w9,[x20, #0x1]
00a96cd8	ldrb w10,[x20, #0x2]
00a96cdc	ldrb w11,[x20, #0x3]
00a96ce0	lsl x8,x8,#0x18
00a96ce4	bfm x8,x9,#0x30,#0x7
00a96ce8	bfm x8,x10,#0x38,#0x7
00a96cec	orr x8,x8,x11
00a96cf0	str x8,[sp]
00a96cf4	ldrb w8,[x20, #0x4]
00a96cf8	ldrb w9,[x20, #0x5]
00a96cfc	ldrb w10,[x20, #0x6]
00a96d00	ldrb w11,[x20, #0x7]
00a96d04	lsl x8,x8,#0x18
00a96d08	bfm x8,x9,#0x30,#0x7
00a96d0c	bfm x8,x10,#0x38,#0x7
00a96d10	orr x8,x8,x11
00a96d14	mov x0,sp
00a96d18	mov x1,x21
00a96d1c	str x8,[sp, #0x8]
00a96d20	bl 0x00c3ddb0
00a96d24	ldr x8,[sp]
00a96d28	lsr x9,x8,#0x18
00a96d2c	strb w9,[x20]
00a96d30	lsr x9,x8,#0x10
00a96d34	strb w8,[x20, #0x3]
00a96d38	lsr x8,x8,#0x8
00a96d3c	strb w9,[x20, #0x1]
00a96d40	strb w8,[x20, #0x2]
00a96d44	ldr x8,[sp, #0x8]
00a96d48	lsr x9,x8,#0x18
00a96d4c	strb w9,[x20, #0x4]
00a96d50	lsr x9,x8,#0x10
00a96d54	strb w9,[x20, #0x5]
00a96d58	lsr x9,x8,#0x8
00a96d5c	strb w9,[x20, #0x6]
00a96d60	strb w8,[x20, #0x7]
00a96d64	sxtw x9,w25
00a96d68	ldrb w8,[x24], #0x1
00a96d6c	ldrb w10,[x20, x9]
00a96d70	add w11,w25,#0x1
00a96d74	subs x22,x22,#0x1
00a96d78	strb w8,[x20, x9]
00a96d7c	eor w8,w10,w8
00a96d80	strb w8,[x23], #0x1
00a96d84	and w25,w11,#0x7
00a96d88	b.ne 0x00a96ccc
00a96d8c	stp xzr,xzr,[sp]
00a96d90	str w25,[x19]
00a96d94	ldp x29,x30,[sp, #0x50]
00a96d98	ldp x20,x19,[sp, #0x40]
00a96d9c	ldp x22,x21,[sp, #0x30]
00a96da0	ldp x24,x23,[sp, #0x20]
00a96da4	ldr x25,[sp, #0x10]
00a96da8	add sp,sp,#0x60
00a96dac	ret
