; ssl_fill_hello_random @ 009a9c00
009a9c00	str x23,[sp, #-0x40]!
009a9c04	stp x22,x21,[sp, #0x10]
009a9c08	stp x20,x19,[sp, #0x20]
009a9c0c	mov x20,x2
009a9c10	subs x22,x3,#0x4
009a9c14	mov w2,wzr
009a9c18	stp x29,x30,[sp, #0x30]
009a9c1c	add x29,sp,#0x30
009a9c20	b.cc 0x009a9cf0
009a9c24	ldr w8,[x0, #0x9f0]
009a9c28	cmp w1,#0x0
009a9c2c	mov w9,#0x40
009a9c30	mov w10,#0x20
009a9c34	csel w9,w10,w9,eq
009a9c38	mov w21,w4
009a9c3c	mov x19,x3
009a9c40	mov x23,x0
009a9c44	tst w8,w9
009a9c48	b.eq 0x009a9c80
009a9c4c	mov x0,xzr
009a9c50	bl 0x00c30970
009a9c54	lsr x8,x0,#0x18
009a9c58	lsr x9,x0,#0x10
009a9c5c	lsr x10,x0,#0x8
009a9c60	strb w8,[x20]
009a9c64	strb w9,[x20, #0x1]
009a9c68	strb w10,[x20, #0x2]
009a9c6c	strb w0,[x20, #0x3]
009a9c70	ldr x8,[x23, #0x9a8]
009a9c74	add x1,x20,#0x4
009a9c78	mov x2,x22
009a9c7c	b 0x009a9c8c
009a9c80	ldr x8,[x23, #0x9a8]
009a9c84	mov x1,x20
009a9c88	mov x2,x19
009a9c8c	ldr x0,[x8]
009a9c90	mov w3,wzr
009a9c94	bl 0x00c347b0
009a9c98	cmp w0,#0x1
009a9c9c	b.lt 0x009a9cec
009a9ca0	cmp x19,#0x9
009a9ca4	mov w2,wzr
009a9ca8	b.cc 0x009a9cf0
009a9cac	cmp w21,#0x2
009a9cb0	b.eq 0x009a9cd4
009a9cb4	cmp w21,#0x1
009a9cb8	b.ne 0x009a9cec
009a9cbc	mov x9,#0x4f44
009a9cc0	movk x9,#0x4e57, LSL #16
009a9cc4	movk x9,#0x5247, LSL #32
009a9cc8	add x8,x20,x19
009a9ccc	movk x9,#0x144, LSL #48
009a9cd0	b 0x009a9ce8
009a9cd4	mov x9,#0x4f44
009a9cd8	movk x9,#0x4e57, LSL #16
009a9cdc	movk x9,#0x5247, LSL #32
009a9ce0	add x8,x20,x19
009a9ce4	movk x9,#0x44, LSL #48
009a9ce8	stur x9,[x8, #-0x8]
009a9cec	mov w2,w0
009a9cf0	ldp x29,x30,[sp, #0x30]
009a9cf4	ldp x20,x19,[sp, #0x20]
009a9cf8	ldp x22,x21,[sp, #0x10]
009a9cfc	mov w0,w2
009a9d00	ldr x23,[sp], #0x40
009a9d04	ret
