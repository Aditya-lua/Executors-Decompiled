; FUN_00af6c48 @ 00af6c48
00af6c48	cmp w2,#0x1
00af6c4c	sxtw x9,w2
00af6c50	b.lt 0x00af6c78
00af6c54	mov x8,xzr
00af6c58	ldrb w10,[x0, x8]
00af6c5c	ldrb w11,[x1, x8]
00af6c60	cmp w10,w11
00af6c64	b.ne 0x00af6c7c
00af6c68	add x8,x8,#0x1
00af6c6c	cmp x8,x9
00af6c70	b.lt 0x00af6c58
00af6c74	b 0x00af6c7c
00af6c78	mov w8,wzr
00af6c7c	sub x9,x9,#0x1
00af6c80	add x10,x9,#0x1
00af6c84	cmp x10,#0x1
00af6c88	mov w10,w2
00af6c8c	b.lt 0x00af6cac
00af6c90	ldrb w11,[x0, x9]
00af6c94	cbnz w11,0x00af6cac
00af6c98	ldrb w11,[x1, x9]
00af6c9c	sub w2,w10,#0x1
00af6ca0	sub x9,x9,#0x1
00af6ca4	cmp w11,#0xff
00af6ca8	b.eq 0x00af6c80
00af6cac	sub w9,w10,#0x1
00af6cb0	cmp w8,w9
00af6cb4	b.ge 0x00af6cc0
00af6cb8	mov w0,#0xffffffff
00af6cbc	ret
00af6cc0	cmp w8,w10
00af6cc4	b.ge 0x00af6d08
00af6cc8	mov w9,w8
00af6ccc	ldrb w11,[x0, x9]
00af6cd0	ldrb w9,[x1, x9]
00af6cd4	mov w0,#0xffffffff
00af6cd8	eor w10,w9,w11
00af6cdc	sub w12,w10,#0x1
00af6ce0	cmp w12,#0x1e
00af6ce4	b.hi 0x00af6d10
00af6ce8	adrp x13,0x77b000
00af6cec	add x13,x13,#0x410
00af6cf0	ldrsw x12,[x13, x12, LSL #0x2]
00af6cf4	add x13,x12,x13
00af6cf8	orr w12,wzr,#0x7
00af6cfc	br x13
00af6d00	orr w12,wzr,#0x6
00af6d04	b 0x00af6d44
00af6d08	lsl w0,w8,#0x3
00af6d0c	ret
00af6d10	cmp w10,#0x3f
00af6d14	b.eq 0x00af6d40
00af6d18	cmp w10,#0x7f
00af6d1c	b.ne 0x00af6d60
00af6d20	mov w12,#0x1
00af6d24	b 0x00af6d44
00af6d28	mov w12,#0x5
00af6d2c	b 0x00af6d44
00af6d30	mov w12,#0x4
00af6d34	b 0x00af6d44
00af6d38	orr w12,wzr,#0x3
00af6d3c	b 0x00af6d44
00af6d40	mov w12,#0x2
00af6d44	tst w10,w11
00af6d48	mov w0,#0xffffffff
00af6d4c	b.ne 0x00af6d60
00af6d50	and w9,w10,w9
00af6d54	cmp w9,w10
00af6d58	b.ne 0x00af6d60
00af6d5c	orr w0,w12,w8, LSL #0x3
00af6d60	ret
