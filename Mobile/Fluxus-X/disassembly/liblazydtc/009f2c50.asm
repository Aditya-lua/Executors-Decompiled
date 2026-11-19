; ossl_i2c_ASN1_INTEGER @ 009f2c50
009f2c50	ldr x9,[x0, #0x8]
009f2c54	mov x8,x0
009f2c58	mov w11,wzr
009f2c5c	mov w12,wzr
009f2c60	mov x10,xzr
009f2c64	mov w0,#0x1
009f2c68	cbz x9,0x009f2d54
009f2c6c	ldr w13,[x8]
009f2c70	cbz w13,0x009f2d54
009f2c74	ldr w11,[x8, #0x4]
009f2c78	ldrsb w8,[x9]
009f2c7c	sxtw x10,w13
009f2c80	tst w11,#0x100
009f2c84	cset w12,eq
009f2c88	cmp w8,#0x0
009f2c8c	cset w13,lt
009f2c90	tbnz w11,#0x8,0x009f2ca0
009f2c94	mov w11,wzr
009f2c98	and w12,w12,w13
009f2c9c	b 0x009f2d50
009f2ca0	and w8,w8,#0xff
009f2ca4	cmp w8,#0x80
009f2ca8	b.ls 0x009f2cb8
009f2cac	orr w11,wzr,#0xff
009f2cb0	mov w12,#0x1
009f2cb4	b 0x009f2d50
009f2cb8	cmp w8,#0x80
009f2cbc	b.ne 0x009f2ce4
009f2cc0	cmp w10,#0x2
009f2cc4	mov w11,wzr
009f2cc8	b.cc 0x009f2d4c
009f2ccc	sub x11,x10,#0x1
009f2cd0	cmp x11,#0x2
009f2cd4	b.cs 0x009f2cf0
009f2cd8	mov w11,wzr
009f2cdc	mov w8,#0x1
009f2ce0	b 0x009f2d2c
009f2ce4	mov w12,wzr
009f2ce8	orr w11,wzr,#0xff
009f2cec	b 0x009f2d50
009f2cf0	and x14,x11,#-0x2
009f2cf4	mov w12,wzr
009f2cf8	mov w13,wzr
009f2cfc	orr x8,x11,#0x1
009f2d00	add x15,x9,#0x2
009f2d04	mov x16,x14
009f2d08	ldurb w17,[x15, #-0x1]
009f2d0c	ldrb w18,[x15], #0x2
009f2d10	subs x16,x16,#0x2
009f2d14	orr w12,w12,w17
009f2d18	orr w13,w13,w18
009f2d1c	b.ne 0x009f2d08
009f2d20	cmp x11,x14
009f2d24	orr w11,w13,w12
009f2d28	b.eq 0x009f2d44
009f2d2c	sub x12,x10,x8
009f2d30	add x8,x9,x8
009f2d34	ldrb w13,[x8], #0x1
009f2d38	subs x12,x12,#0x1
009f2d3c	orr w11,w11,w13
009f2d40	b.ne 0x009f2d34
009f2d44	cmp w11,#0x0
009f2d48	csetm w11,ne
009f2d4c	and w12,w11,#0x1
009f2d50	add x0,x12,x10
009f2d54	cbz x1,0x009f2da4
009f2d58	ldr x8,[x1]
009f2d5c	cbz x8,0x009f2da4
009f2d60	strb w11,[x8]
009f2d64	cbz x10,0x009f2d98
009f2d68	add x8,x8,x12
009f2d6c	and w12,w11,#0x1
009f2d70	add x13,x9,x10
009f2d74	ldurb w13,[x13, #-0x1]
009f2d78	and w15,w11,#0xff
009f2d7c	add x14,x8,x10
009f2d80	subs x10,x10,#0x1
009f2d84	eor w13,w13,w15
009f2d88	add w12,w12,w13
009f2d8c	sturb w12,[x14, #-0x1]
009f2d90	lsr w12,w12,#0x8
009f2d94	b.ne 0x009f2d70
009f2d98	ldr x8,[x1]
009f2d9c	add x8,x8,x0
009f2da0	str x8,[x1]
009f2da4	ret
