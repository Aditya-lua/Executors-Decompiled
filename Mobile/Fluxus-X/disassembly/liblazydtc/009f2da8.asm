; ossl_c2i_ASN1_INTEGER @ 009f2da8
009f2da8	str x23,[sp, #-0x40]!
009f2dac	stp x22,x21,[sp, #0x10]
009f2db0	stp x20,x19,[sp, #0x20]
009f2db4	stp x29,x30,[sp, #0x30]
009f2db8	mov x22,x2
009f2dbc	ldr x2,[x1]
009f2dc0	mov x21,x1
009f2dc4	mov x20,x0
009f2dc8	mov x0,xzr
009f2dcc	mov x1,xzr
009f2dd0	mov x3,x22
009f2dd4	add x29,sp,#0x30
009f2dd8	bl 0x009f2ec4
009f2ddc	cbz x0,0x009f2ea8
009f2de0	mov x23,x0
009f2de4	cbz x20,0x009f2df0
009f2de8	ldr x19,[x20]
009f2dec	cbnz x19,0x009f2e04
009f2df0	bl 0x00c37f30
009f2df4	mov x19,x0
009f2df8	cbz x0,0x009f2eac
009f2dfc	mov w8,#0x2
009f2e00	str w8,[x19, #0x4]
009f2e04	mov x0,x19
009f2e08	mov x1,xzr
009f2e0c	mov w2,w23
009f2e10	bl 0x00c378a0
009f2e14	cbz w0,0x009f2e60
009f2e18	ldr x0,[x19, #0x8]
009f2e1c	ldr x2,[x21]
009f2e20	add x1,sp,#0xc
009f2e24	mov x3,x22
009f2e28	bl 0x009f2ec4
009f2e2c	ldr w8,[x19, #0x4]
009f2e30	ldr w9,[sp, #0xc]
009f2e34	and w10,w8,#0xfffffeff
009f2e38	orr w8,w8,#0x100
009f2e3c	cmp w9,#0x0
009f2e40	csel w8,w10,w8,eq
009f2e44	str w8,[x19, #0x4]
009f2e48	ldr x8,[x21]
009f2e4c	add x8,x8,x22
009f2e50	str x8,[x21]
009f2e54	cbz x20,0x009f2eac
009f2e58	str x19,[x20]
009f2e5c	b 0x009f2eac
009f2e60	bl 0x00c342a0
009f2e64	adrp x0,0x2b9000
009f2e68	adrp x2,0x2bb000
009f2e6c	add x0,x0,#0xb0a
009f2e70	add x2,x2,#0x98c
009f2e74	mov w1,#0x141
009f2e78	bl 0x00c342b0
009f2e7c	mov w1,#0x100
009f2e80	mov w0,#0xd
009f2e84	movk w1,#0xc, LSL #16
009f2e88	mov x2,xzr
009f2e8c	bl 0x00c342c0
009f2e90	cbz x20,0x009f2ea0
009f2e94	ldr x8,[x20]
009f2e98	cmp x8,x19
009f2e9c	b.eq 0x009f2ea8
009f2ea0	mov x0,x19
009f2ea4	bl 0x00c37c30
009f2ea8	mov x19,xzr
009f2eac	mov x0,x19
009f2eb0	ldp x29,x30,[sp, #0x30]
009f2eb4	ldp x20,x19,[sp, #0x20]
009f2eb8	ldp x22,x21,[sp, #0x10]
009f2ebc	ldr x23,[sp], #0x40
009f2ec0	ret
