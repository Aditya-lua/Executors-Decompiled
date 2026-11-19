; FUN_00b68b58 @ 00b68b58
00b68b58	sub sp,sp,#0x130
00b68b5c	mov x8,x0
00b68b60	cmp x6,#0x40
00b68b64	mov w0,wzr
00b68b68	stp x28,x27,[sp, #0xd0]
00b68b6c	stp x26,x25,[sp, #0xe0]
00b68b70	stp x24,x23,[sp, #0xf0]
00b68b74	stp x22,x21,[sp, #0x100]
00b68b78	stp x20,x19,[sp, #0x110]
00b68b7c	stp x29,x30,[sp, #0x120]
00b68b80	add x29,sp,#0x120
00b68b84	b.hi 0x00b68da4
00b68b88	mov x19,x6
00b68b8c	mov x23,x1
00b68b90	cmp x1,x6
00b68b94	b.cc 0x00b68da4
00b68b98	mov x20,x7
00b68b9c	cbz x19,0x00b68bdc
00b68ba0	ldr x27,[x8]
00b68ba4	mov x24,x4
00b68ba8	mov x25,x3
00b68bac	mov x22,x2
00b68bb0	sub x26,x27,x19
00b68bb4	cmp x5,#0x1
00b68bb8	str x26,[x8]
00b68bbc	b.ne 0x00b68be8
00b68bc0	cbz x25,0x00b68bcc
00b68bc4	add x8,x22,x26
00b68bc8	str x8,[x25]
00b68bcc	cbz x24,0x00b68da0
00b68bd0	str wzr,[x24]
00b68bd4	mov w0,#0x1
00b68bd8	b 0x00b68da4
00b68bdc	cmp x20,#0x0
00b68be0	cset w0,ne
00b68be4	b 0x00b68da4
00b68be8	ldr x0,[x29, #0x10]
00b68bec	add x1,sp,#0x4
00b68bf0	mov x2,x19
00b68bf4	mov w3,wzr
00b68bf8	bl 0x00c347b0
00b68bfc	cmp w0,#0x1
00b68c00	b.lt 0x00b68d98
00b68c04	cbz x25,0x00b68d98
00b68c08	mov w0,wzr
00b68c0c	cbz x24,0x00b68da4
00b68c10	adrp x1,0x2dd000
00b68c14	add x1,x1,#0x72
00b68c18	mov w2,#0x104
00b68c1c	mov x0,x19
00b68c20	bl 0x00c32320
00b68c24	str x0,[x25]
00b68c28	cbz x0,0x00b68da4
00b68c2c	mov w8,#0x1
00b68c30	add x9,sp,#0x44
00b68c34	str w8,[x24]
00b68c38	neg w8,w9
00b68c3c	add x10,x19,#0x100
00b68c40	and x8,x8,#0x3c
00b68c44	cmp x10,x23
00b68c48	add x24,x9,x8
00b68c4c	mov x21,x0
00b68c50	csel x11,x23,x10,cc
00b68c54	mov x0,x24
00b68c58	mov w1,wzr
00b68c5c	mov x2,x19
00b68c60	sub x25,x11,x10
00b68c64	bl 0x00c301c0
00b68c68	cmp x25,x23
00b68c6c	mov x8,xzr
00b68c70	b.cs 0x00b68cf4
00b68c74	mov x9,xzr
00b68c78	mov x8,xzr
00b68c7c	mov x10,xzr
00b68c80	neg x11,x27
00b68c84	eor x12,x25,x26
00b68c88	add x14,x11,x25
00b68c8c	eor x13,x25,x27
00b68c90	add x15,x10,#0x1
00b68c94	sub x16,x12,#0x1
00b68c98	eor x14,x14,x27
00b68c9c	bic x12,x16,x12
00b68ca0	orr x13,x14,x13
00b68ca4	sub x14,x15,x19
00b68ca8	eor x16,x15,x19
00b68cac	eor x14,x14,x19
00b68cb0	asr x12,x12,#0x3f
00b68cb4	orr x14,x14,x16
00b68cb8	ldrb w16,[x22, x25]
00b68cbc	eor x13,x13,x25
00b68cc0	orr x9,x12,x9
00b68cc4	and x9,x9,x13, ASR #0x3f
00b68cc8	ldrb w13,[x24, x10]
00b68ccc	and x12,x12,x10
00b68cd0	orr x8,x12,x8
00b68cd4	and w12,w16,w9
00b68cd8	orr w12,w13,w12
00b68cdc	add x25,x25,#0x1
00b68ce0	eor x13,x14,x15
00b68ce4	cmp x25,x23
00b68ce8	strb w12,[x24, x10]
00b68cec	and x10,x15,x13, ASR #0x3f
00b68cf0	b.cc 0x00b68c84
00b68cf4	and w9,w20,#0xff
00b68cf8	mov x10,xzr
00b68cfc	mvn w11,w9
00b68d00	add x12,sp,#0x4
00b68d04	mov w0,#0x1
00b68d08	and w15,w8,#0x20
00b68d0c	sub w15,w15,#0x1
00b68d10	and x13,x8,#-0x21
00b68d14	orr x14,x8,#0x20
00b68d18	add x8,x8,#0x1
00b68d1c	asr w15,w15,#0x1f
00b68d20	sub x17,x8,x19
00b68d24	and w15,w15,#0xff
00b68d28	ldrb w13,[x24, x13]
00b68d2c	ldrb w14,[x24, x14]
00b68d30	eor x16,x8,x19
00b68d34	eor x17,x17,x19
00b68d38	stur w15,[x29, #-0x5c]
00b68d3c	mvn w15,w15
00b68d40	orr x16,x17,x16
00b68d44	ldur w17,[x29, #-0x5c]
00b68d48	stur w15,[x29, #-0x5c]
00b68d4c	ldur w15,[x29, #-0x5c]
00b68d50	ldrb w18,[x12, x10]
00b68d54	stur w9,[x29, #-0x5c]
00b68d58	and w13,w17,w13
00b68d5c	ldur w17,[x29, #-0x5c]
00b68d60	stur w11,[x29, #-0x5c]
00b68d64	and w14,w15,w14
00b68d68	ldur w15,[x29, #-0x5c]
00b68d6c	orr w13,w14,w13
00b68d70	and w13,w17,w13
00b68d74	eor x14,x16,x8
00b68d78	and w15,w15,w18
00b68d7c	orr w13,w15,w13
00b68d80	strb w13,[x21, x10]
00b68d84	add x10,x10,#0x1
00b68d88	and x8,x8,x14, ASR #0x3f
00b68d8c	cmp x19,x10
00b68d90	b.ne 0x00b68d08
00b68d94	b 0x00b68da4
00b68d98	mov w0,wzr
00b68d9c	b 0x00b68da4
00b68da0	mov w0,#0x1
00b68da4	ldp x29,x30,[sp, #0x120]
00b68da8	ldp x20,x19,[sp, #0x110]
00b68dac	ldp x22,x21,[sp, #0x100]
00b68db0	ldp x24,x23,[sp, #0xf0]
00b68db4	ldp x26,x25,[sp, #0xe0]
00b68db8	ldp x28,x27,[sp, #0xd0]
00b68dbc	add sp,sp,#0x130
00b68dc0	ret
