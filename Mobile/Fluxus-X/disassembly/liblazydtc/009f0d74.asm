; ASN1_put_object @ 009f0d74
009f0d74	ldr x8,[x0]
009f0d78	cmp w1,#0x0
009f0d7c	mov w9,#0x20
009f0d80	csel w9,wzr,w9,eq
009f0d84	and w10,w4,#0xc0
009f0d88	cmp w3,#0x1e
009f0d8c	orr w10,w10,w9
009f0d90	b.gt 0x009f0dbc
009f0d94	and w9,w3,#0x1f
009f0d98	orr w9,w10,w9
009f0d9c	strb w9,[x8], #0x1
009f0da0	cmp w1,#0x2
009f0da4	b.eq 0x009f0e18
009f0da8	cmp w2,#0x80
009f0dac	b.ge 0x009f0e28
009f0db0	strb w2,[x8], #0x1
009f0db4	str x8,[x0]
009f0db8	ret
009f0dbc	orr w10,w10,#0x1f
009f0dc0	mov x9,xzr
009f0dc4	strb w10,[x8]
009f0dc8	mov w10,w3
009f0dcc	lsr w10,w10,#0x7
009f0dd0	add x9,x9,#0x1
009f0dd4	cbnz w10,0x009f0dcc
009f0dd8	mov w11,wzr
009f0ddc	add x10,x8,#0x1
009f0de0	mov x12,x9
009f0de4	and w13,w3,#0x7f
009f0de8	orr w14,w3,#0x80
009f0dec	cmp w11,#0x0
009f0df0	csel w13,w13,w14,eq
009f0df4	strb w13,[x8, x12]
009f0df8	sub x12,x12,#0x1
009f0dfc	asr w3,w3,#0x7
009f0e00	cmp x12,#0x0
009f0e04	add w11,w11,#0x1
009f0e08	b.gt 0x009f0de4
009f0e0c	add x8,x10,x9
009f0e10	cmp w1,#0x2
009f0e14	b.ne 0x009f0da8
009f0e18	mov w9,#0x80
009f0e1c	strb w9,[x8], #0x1
009f0e20	str x8,[x0]
009f0e24	ret
009f0e28	mov x9,xzr
009f0e2c	mov w10,w2
009f0e30	lsr w10,w10,#0x8
009f0e34	add x9,x9,#0x1
009f0e38	cbnz w10,0x009f0e30
009f0e3c	orr w10,w9,#0x80
009f0e40	strb w10,[x8]
009f0e44	mov x10,x9
009f0e48	strb w2,[x8, x10]
009f0e4c	sub x10,x10,#0x1
009f0e50	cmp x10,#0x0
009f0e54	asr w2,w2,#0x8
009f0e58	b.gt 0x009f0e48
009f0e5c	add x8,x8,x9
009f0e60	add x8,x8,#0x1
009f0e64	str x8,[x0]
009f0e68	ret
