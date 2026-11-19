; DES_ofb64_encrypt @ 00a93c8c
00a93c8c	sub sp,sp,#0x70
00a93c90	stp x26,x25,[sp, #0x20]
00a93c94	stp x24,x23,[sp, #0x30]
00a93c98	stp x22,x21,[sp, #0x40]
00a93c9c	stp x20,x19,[sp, #0x50]
00a93ca0	stp x29,x30,[sp, #0x60]
00a93ca4	ldrb w8,[x4]
00a93ca8	ldrb w9,[x4, #0x1]
00a93cac	ldrb w12,[x4, #0x4]
00a93cb0	ldrb w13,[x4, #0x5]
00a93cb4	ldrb w10,[x4, #0x2]
00a93cb8	ldrb w14,[x4, #0x6]
00a93cbc	ldrb w11,[x4, #0x3]
00a93cc0	ldrb w15,[x4, #0x7]
00a93cc4	ldr w25,[x5]
00a93cc8	strb w8,[sp, #0x18]
00a93ccc	strb w12,[sp, #0x1c]
00a93cd0	bfm w8,w9,#0x18,#0x7
00a93cd4	bfm w12,w13,#0x18,#0x7
00a93cd8	bfm w8,w10,#0x10,#0x7
00a93cdc	bfm w12,w14,#0x10,#0x7
00a93ce0	mov x19,x5
00a93ce4	bfm w8,w11,#0x8,#0x7
00a93ce8	bfm w12,w15,#0x8,#0x7
00a93cec	str x27,[sp, #0x10]
00a93cf0	add x29,sp,#0x60
00a93cf4	strb w9,[sp, #0x19]
00a93cf8	strb w10,[sp, #0x1a]
00a93cfc	strb w11,[sp, #0x1b]
00a93d00	strb w13,[sp, #0x1d]
00a93d04	strb w14,[sp, #0x1e]
00a93d08	stp w8,w12,[sp, #0x8]
00a93d0c	strb w15,[sp, #0x1f]
00a93d10	cbz x2,0x00a93de4
00a93d14	mov x20,x4
00a93d18	mov x21,x3
00a93d1c	mov x22,x2
00a93d20	mov x23,x1
00a93d24	mov x24,x0
00a93d28	mov w26,wzr
00a93d2c	add x27,sp,#0x18
00a93d30	sub x22,x22,#0x1
00a93d34	cbnz w25,0x00a93d88
00a93d38	add x0,sp,#0x8
00a93d3c	mov w2,#0x1
00a93d40	mov x1,x21
00a93d44	bl 0x00c39a00
00a93d48	ldp w8,w9,[sp, #0x8]
00a93d4c	add w26,w26,#0x1
00a93d50	lsr w10,w8,#0x8
00a93d54	strb w8,[sp, #0x18]
00a93d58	strb w10,[sp, #0x19]
00a93d5c	lsr w10,w8,#0x10
00a93d60	lsr w8,w8,#0x18
00a93d64	strb w8,[sp, #0x1b]
00a93d68	lsr w8,w9,#0x8
00a93d6c	strb w9,[sp, #0x1c]
00a93d70	strb w8,[sp, #0x1d]
00a93d74	lsr w8,w9,#0x10
00a93d78	lsr w9,w9,#0x18
00a93d7c	strb w10,[sp, #0x1a]
00a93d80	strb w8,[sp, #0x1e]
00a93d84	strb w9,[sp, #0x1f]
00a93d88	ldrb w8,[x24], #0x1
00a93d8c	ldrb w9,[x27, w25, SXTW ]
00a93d90	add w10,w25,#0x1
00a93d94	and w25,w10,#0x7
00a93d98	eor w8,w9,w8
00a93d9c	strb w8,[x23], #0x1
00a93da0	cbnz x22,0x00a93d30
00a93da4	cbz w26,0x00a93de4
00a93da8	ldp w8,w9,[sp, #0x8]
00a93dac	lsr w10,w8,#0x8
00a93db0	strb w8,[x20]
00a93db4	strb w10,[x20, #0x1]
00a93db8	lsr w10,w8,#0x10
00a93dbc	lsr w8,w8,#0x18
00a93dc0	strb w9,[x20, #0x4]
00a93dc4	strb w10,[x20, #0x2]
00a93dc8	lsr w10,w9,#0x8
00a93dcc	strb w8,[x20, #0x3]
00a93dd0	lsr w8,w9,#0x10
00a93dd4	lsr w9,w9,#0x18
00a93dd8	strb w10,[x20, #0x5]
00a93ddc	strb w8,[x20, #0x6]
00a93de0	strb w9,[x20, #0x7]
00a93de4	str w25,[x19]
00a93de8	ldp x29,x30,[sp, #0x60]
00a93dec	ldp x20,x19,[sp, #0x50]
00a93df0	ldp x22,x21,[sp, #0x40]
00a93df4	ldp x24,x23,[sp, #0x30]
00a93df8	ldp x26,x25,[sp, #0x20]
00a93dfc	ldr x27,[sp, #0x10]
00a93e00	add sp,sp,#0x70
00a93e04	ret
