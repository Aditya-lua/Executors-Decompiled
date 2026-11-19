; FUN_00bc0bdc @ 00bc0bdc
00bc0bdc	stp x24,x23,[sp, #-0x30]!
00bc0be0	stp x22,x21,[sp, #0x10]
00bc0be4	stp x20,x19,[sp, #0x20]
00bc0be8	cmp w2,#0xff
00bc0bec	mov x8,#-0x2e
00bc0bf0	b.hi 0x00bc0e6c
00bc0bf4	mov w9,#0x1
00bc0bf8	add w12,w2,#0x1
00bc0bfc	lsl x10,x9,x3
00bc0c00	add x10,x10,w12, UXTW  #0x1
00bc0c04	add x10,x10,#0x8
00bc0c08	cmp x10,x5
00bc0c0c	b.hi 0x00bc0e6c
00bc0c10	cmp w3,#0xc
00bc0c14	b.ls 0x00bc0c20
00bc0c18	mov x8,#-0x2c
00bc0c1c	b 0x00bc0e6c
00bc0c20	mov w10,#0x8000
00bc0c24	lsl w8,w9,w3
00bc0c28	add x13,x4,w2, UXTW  #0x1
00bc0c2c	lsl w11,w10,w3
00bc0c30	mov x14,xzr
00bc0c34	add x9,x0,#0x4
00bc0c38	sub w10,w8,#0x1
00bc0c3c	mov w16,w2
00bc0c40	mov w15,#0x1
00bc0c44	lsr w17,w11,#0x10
00bc0c48	add x11,x13,#0x2
00bc0c4c	mov w13,w10
00bc0c50	b 0x00bc0c70
00bc0c54	cmp w17,w2
00bc0c58	and w2,w2,#0xffff
00bc0c5c	csel w15,w15,wzr,gt
00bc0c60	strh w2,[x4, x14, LSL #0x1]
00bc0c64	add x14,x14,#0x1
00bc0c68	cmp x12,x14
00bc0c6c	b.eq 0x00bc0c90
00bc0c70	ldrsh w2,[x1, x14, LSL #0x1]
00bc0c74	cmn w2,#0x1
00bc0c78	b.ne 0x00bc0c54
00bc0c7c	add x2,x9,w13, UXTW  #0x2
00bc0c80	sub w13,w13,#0x1
00bc0c84	strb w14,[x2, #0x2]
00bc0c88	mov w2,#0x1
00bc0c8c	b 0x00bc0c60
00bc0c90	lsr w17,w8,#0x1
00bc0c94	cmp w13,w10
00bc0c98	strh w3,[x0]
00bc0c9c	strh w15,[x0, #0x2]
00bc0ca0	b.ne 0x00bc0d70
00bc0ca4	add w2,w17,w8, LSR #0x3
00bc0ca8	add x16,x4,x16, LSL #0x1
00bc0cac	cmp w12,#0x1
00bc0cb0	mov x13,xzr
00bc0cb4	mov x14,xzr
00bc0cb8	mov x15,xzr
00bc0cbc	csinc w17,w12,wzr,hi
00bc0cc0	add w12,w2,#0x3
00bc0cc4	add x2,x16,#0x1a
00bc0cc8	add x5,x16,#0x2
00bc0ccc	mov w6,#0x10
00bc0cd0	orr x7,xzr,#0x101010101010101
00bc0cd4	b 0x00bc0cec
00bc0cd8	add x13,x13,#0x1
00bc0cdc	add x14,x14,x19
00bc0ce0	add x15,x15,x7
00bc0ce4	cmp x13,x17
00bc0ce8	b.eq 0x00bc0dd0
00bc0cec	ldrsh x19,[x1, x13, LSL #0x1]
00bc0cf0	str x15,[x11, x14#0x0]
00bc0cf4	cmp x19,#0x9
00bc0cf8	b.lt 0x00bc0cd8
00bc0cfc	cmp x19,#0x10
00bc0d00	csel x20,x19,x6,hi
00bc0d04	sub x20,x20,#0x9
00bc0d08	cmp x20,#0x18
00bc0d0c	b.cs 0x00bc0d18
00bc0d10	mov w20,#0x8
00bc0d14	b 0x00bc0d54
00bc0d18	lsr x20,x20,#0x3
00bc0d1c	dup v0.2D,x15
00bc0d20	add x21,x20,#0x1
00bc0d24	mov w20,#0x8
00bc0d28	and x22,x21,#0x3ffffffffffffffc
00bc0d2c	lsr x23,x22,#0x2
00bc0d30	mov x24,x22
00bc0d34	bfm x20,x23,#0x3b,#0x3a
00bc0d38	add x23,x2,x14
00bc0d3c	subs x24,x24,#0x4
00bc0d40	stp q0,q0,[x23, #-0x10]
00bc0d44	add x23,x23,#0x20
00bc0d48	b.ne 0x00bc0d3c
00bc0d4c	cmp x21,x22
00bc0d50	b.eq 0x00bc0cd8
00bc0d54	add x21,x20,x14
00bc0d58	add x21,x5,x21
00bc0d5c	add x20,x20,#0x8
00bc0d60	str x15,[x21], #0x8
00bc0d64	cmp x20,x19
00bc0d68	b.cc 0x00bc0d5c
00bc0d6c	b 0x00bc0cd8
00bc0d70	add w15,w17,w8, LSR #0x3
00bc0d74	cmp w12,#0x1
00bc0d78	mov x11,xzr
00bc0d7c	mov w14,wzr
00bc0d80	csinc w12,w12,wzr,hi
00bc0d84	add w15,w15,#0x3
00bc0d88	b 0x00bc0d98
00bc0d8c	add x11,x11,#0x1
00bc0d90	cmp x11,x12
00bc0d94	b.eq 0x00bc0e1c
00bc0d98	ldrsh w16,[x1, x11, LSL #0x1]
00bc0d9c	cmp w16,#0x1
00bc0da0	b.lt 0x00bc0d8c
00bc0da4	mov w17,wzr
00bc0da8	add x2,x9,w14, UXTW  #0x2
00bc0dac	strb w11,[x2, #0x2]
00bc0db0	add w14,w15,w14
00bc0db4	and w14,w14,w10
00bc0db8	cmp w14,w13
00bc0dbc	b.hi 0x00bc0db0
00bc0dc0	add w17,w17,#0x1
00bc0dc4	cmp w17,w16
00bc0dc8	b.ne 0x00bc0da8
00bc0dcc	b 0x00bc0d8c
00bc0dd0	lsl x13,x12,#0x1
00bc0dd4	mov x11,xzr
00bc0dd8	mov x15,xzr
00bc0ddc	add x14,x16,#0x3
00bc0de0	and x16,x15,x10
00bc0de4	ldurb w17,[x14, #-0x1]
00bc0de8	add w1,w15,w12
00bc0dec	add x16,x9,x16, LSL #0x2
00bc0df0	add x11,x11,#0x2
00bc0df4	add w15,w15,w13
00bc0df8	cmp x11,x8
00bc0dfc	and x15,x15,x10
00bc0e00	strb w17,[x16, #0x2]
00bc0e04	and x16,x1,x10
00bc0e08	ldrb w17,[x14], #0x2
00bc0e0c	add x16,x9,x16, LSL #0x2
00bc0e10	strb w17,[x16, #0x2]
00bc0e14	b.cc 0x00bc0de0
00bc0e18	b 0x00bc0e28
00bc0e1c	cbz w14,0x00bc0e28
00bc0e20	mov x8,#-0x1
00bc0e24	b 0x00bc0e6c
00bc0e28	sub w9,w3,#0x1f
00bc0e2c	add x10,x0,#0x7
00bc0e30	mov x11,x8
00bc0e34	ldurb w12,[x10, #-0x1]
00bc0e38	subs x11,x11,#0x1
00bc0e3c	ldrh w13,[x4, x12, LSL #0x1]
00bc0e40	clz w14,w13
00bc0e44	add w14,w9,w14
00bc0e48	lsl w15,w13,w14
00bc0e4c	add w13,w13,#0x1
00bc0e50	strh w13,[x4, x12, LSL #0x1]
00bc0e54	strb w14,[x10]
00bc0e58	sub w12,w15,w8
00bc0e5c	sturh w12,[x10, #-0x3]
00bc0e60	add x10,x10,#0x4
00bc0e64	b.ne 0x00bc0e34
00bc0e68	mov x8,xzr
00bc0e6c	ldp x20,x19,[sp, #0x20]
00bc0e70	mov x0,x8
00bc0e74	ldp x22,x21,[sp, #0x10]
00bc0e78	ldp x24,x23,[sp], #0x30
00bc0e7c	ret
