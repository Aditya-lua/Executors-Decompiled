; ASN1_BIT_STRING_set_bit @ 009f5ddc
009f5ddc	str x25,[sp, #-0x50]!
009f5de0	stp x24,x23,[sp, #0x10]
009f5de4	stp x22,x21,[sp, #0x20]
009f5de8	stp x20,x19,[sp, #0x30]
009f5dec	stp x29,x30,[sp, #0x40]
009f5df0	add x29,sp,#0x40
009f5df4	tbnz w1,#0x1f,0x009f5f1c
009f5df8	mvn w9,w1
009f5dfc	mov w10,#0x1
009f5e00	and w9,w9,#0x7
009f5e04	lsl w21,w10,w9
009f5e08	cmp w2,#0x0
009f5e0c	mov w8,w1
009f5e10	mov x19,x0
009f5e14	csel w22,w21,wzr,ne
009f5e18	cbz x0,0x009f5f1c
009f5e1c	ldr x9,[x19, #0x10]
009f5e20	ldrsw x1,[x19]
009f5e24	lsr w23,w8,#0x3
009f5e28	and x8,x9,#-0x10
009f5e2c	cmp w1,w23
009f5e30	str x8,[x19, #0x10]
009f5e34	b.le 0x009f5e44
009f5e38	mov x24,x19
009f5e3c	ldr x20,[x24, #0x8]!
009f5e40	cbnz x20,0x009f5e98
009f5e44	cbz w2,0x009f5ee4
009f5e48	mov x24,x19
009f5e4c	ldr x0,[x24, #0x8]!
009f5e50	sxtw x8,w23
009f5e54	add x25,x8,#0x1
009f5e58	adrp x3,0x2bd000
009f5e5c	mov w2,w25
009f5e60	add x3,x3,#0x7e3
009f5e64	mov w4,#0xa8
009f5e68	bl 0x00c38050
009f5e6c	cbz x0,0x009f5eec
009f5e70	ldrsw x8,[x19]
009f5e74	mov x20,x0
009f5e78	sub x2,x25,x8
009f5e7c	cmp w2,#0x1
009f5e80	b.lt 0x009f5e90
009f5e84	add x0,x20,x8
009f5e88	mov w1,wzr
009f5e8c	bl 0x00c301c0
009f5e90	str x20,[x19, #0x8]
009f5e94	str w25,[x19]
009f5e98	mov w8,w23
009f5e9c	ldrb w9,[x20, x8]
009f5ea0	eor w10,w21,#0xff
009f5ea4	and w9,w10,w9
009f5ea8	orr w9,w9,w22
009f5eac	strb w9,[x20, x8]
009f5eb0	ldrsw x9,[x19]
009f5eb4	cmp w9,#0x1
009f5eb8	b.lt 0x009f5ee4
009f5ebc	ldr x8,[x24]
009f5ec0	sub x9,x9,#0x1
009f5ec4	ldrb w10,[x8, x9]
009f5ec8	cbnz w10,0x009f5ee4
009f5ecc	add x10,x9,#0x1
009f5ed0	sub x11,x9,#0x1
009f5ed4	cmp x10,#0x1
009f5ed8	str w9,[x19]
009f5edc	mov x9,x11
009f5ee0	b.gt 0x009f5ec4
009f5ee4	mov w0,#0x1
009f5ee8	b 0x009f5f20
009f5eec	bl 0x00c342a0
009f5ef0	adrp x0,0x2bd000
009f5ef4	adrp x2,0x2cf000
009f5ef8	add x0,x0,#0x7e3
009f5efc	add x2,x2,#0x8fc
009f5f00	mov w1,#0xaa
009f5f04	bl 0x00c342b0
009f5f08	mov w1,#0x100
009f5f0c	mov w0,#0xd
009f5f10	movk w1,#0xc, LSL #16
009f5f14	mov x2,xzr
009f5f18	bl 0x00c342c0
009f5f1c	mov w0,wzr
009f5f20	ldp x29,x30,[sp, #0x40]
009f5f24	ldp x20,x19,[sp, #0x30]
009f5f28	ldp x22,x21,[sp, #0x20]
009f5f2c	ldp x24,x23,[sp, #0x10]
009f5f30	ldr x25,[sp], #0x50
009f5f34	ret
