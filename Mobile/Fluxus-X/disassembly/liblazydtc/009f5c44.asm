; ossl_c2i_ASN1_BIT_STRING @ 009f5c44
009f5c44	stp x28,x27,[sp, #-0x60]!
009f5c48	stp x26,x25,[sp, #0x10]
009f5c4c	stp x20,x19,[sp, #0x40]
009f5c50	subs x26,x2,#0x1
009f5c54	mov x20,x0
009f5c58	stp x24,x23,[sp, #0x20]
009f5c5c	stp x22,x21,[sp, #0x30]
009f5c60	stp x29,x30,[sp, #0x50]
009f5c64	add x29,sp,#0x50
009f5c68	b.lt 0x009f5c88
009f5c6c	orr w8,wzr,#0x7fffffff
009f5c70	mov x22,x2
009f5c74	cmp x2,x8
009f5c78	b.le 0x009f5c94
009f5c7c	mov x19,xzr
009f5c80	mov w21,#0x97
009f5c84	b 0x009f5cc8
009f5c88	mov x19,xzr
009f5c8c	mov w21,#0x98
009f5c90	b 0x009f5cc8
009f5c94	mov x21,x1
009f5c98	cbz x20,0x009f5ca4
009f5c9c	ldr x19,[x20]
009f5ca0	cbnz x19,0x009f5cb0
009f5ca4	bl 0x00c38040
009f5ca8	mov x19,x0
009f5cac	cbz x0,0x009f5d10
009f5cb0	ldr x27,[x21]
009f5cb4	mov x23,x27
009f5cb8	ldrb w28,[x23], #0x1
009f5cbc	cmp w28,#0x7
009f5cc0	b.ls 0x009f5d30
009f5cc4	mov w21,#0xdc
009f5cc8	bl 0x00c342a0
009f5ccc	adrp x0,0x2bd000
009f5cd0	adrp x2,0x2a5000
009f5cd4	add x0,x0,#0x7e3
009f5cd8	add x2,x2,#0xc4a
009f5cdc	mov w1,#0x89
009f5ce0	bl 0x00c342b0
009f5ce4	mov w0,#0xd
009f5ce8	mov w1,w21
009f5cec	mov x2,xzr
009f5cf0	bl 0x00c342c0
009f5cf4	cbz x20,0x009f5d04
009f5cf8	ldr x8,[x20]
009f5cfc	cmp x8,x19
009f5d00	b.eq 0x009f5d0c
009f5d04	mov x0,x19
009f5d08	bl 0x00c38030
009f5d0c	mov x19,xzr
009f5d10	mov x0,x19
009f5d14	ldp x29,x30,[sp, #0x50]
009f5d18	ldp x20,x19,[sp, #0x40]
009f5d1c	ldp x22,x21,[sp, #0x30]
009f5d20	ldp x24,x23,[sp, #0x20]
009f5d24	ldp x26,x25,[sp, #0x10]
009f5d28	ldp x28,x27,[sp], #0x60
009f5d2c	ret
009f5d30	ldr x8,[x19, #0x10]
009f5d34	orr w9,w28,#0x8
009f5d38	cmp x22,#0x2
009f5d3c	and x8,x8,#-0x10
009f5d40	orr x8,x8,x9
009f5d44	str x8,[x19, #0x10]
009f5d48	b.lt 0x009f5d98
009f5d4c	sxtw x25,w26
009f5d50	adrp x1,0x2bd000
009f5d54	add x1,x1,#0x7e3
009f5d58	mov w2,#0x75
009f5d5c	mov x0,x25
009f5d60	bl 0x00c32320
009f5d64	cbz x0,0x009f5dd0
009f5d68	mov x1,x23
009f5d6c	mov x2,x25
009f5d70	mov x24,x0
009f5d74	bl 0x00c2ffd0
009f5d78	add x8,x24,x22
009f5d7c	ldurb w9,[x8, #-0x2]
009f5d80	orr w10,wzr,#0xff
009f5d84	lsl w10,w10,w28
009f5d88	add x23,x27,x22
009f5d8c	and w9,w9,w10
009f5d90	sturb w9,[x8, #-0x2]
009f5d94	b 0x009f5d9c
009f5d98	mov x24,xzr
009f5d9c	ldr x0,[x19, #0x8]
009f5da0	adrp x1,0x2bd000
009f5da4	add x1,x1,#0x7e3
009f5da8	mov w2,#0x81
009f5dac	str w26,[x19]
009f5db0	bl 0x00c32310
009f5db4	orr w8,wzr,#0x3
009f5db8	str x24,[x19, #0x8]
009f5dbc	str w8,[x19, #0x4]
009f5dc0	cbz x20,0x009f5dc8
009f5dc4	str x19,[x20]
009f5dc8	str x23,[x21]
009f5dcc	b 0x009f5d10
009f5dd0	mov w21,#0x100
009f5dd4	movk w21,#0xc, LSL #16
009f5dd8	b 0x009f5cc8
