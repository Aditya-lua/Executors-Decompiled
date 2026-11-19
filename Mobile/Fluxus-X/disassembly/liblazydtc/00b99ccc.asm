; mbedtls_psa_rsa_verify_hash @ 00b99ccc
00b99ccc	sub sp,sp,#0x60
00b99cd0	stp x26,x25,[sp, #0x10]
00b99cd4	stp x24,x23,[sp, #0x20]
00b99cd8	stp x22,x21,[sp, #0x30]
00b99cdc	stp x20,x19,[sp, #0x40]
00b99ce0	stp x29,x30,[sp, #0x50]
00b99ce4	add x29,sp,#0x50
00b99ce8	mrs x25,tpidr_el0
00b99cec	ldr x8,[x25, #0x28]
00b99cf0	mov w24,w3
00b99cf4	mov x3,sp
00b99cf8	mov x23,x7
00b99cfc	str x8,[sp, #0x8]
00b99d00	str xzr,[sp]
00b99d04	ldrh w0,[x0]
00b99d08	mov x19,x6
00b99d0c	mov x21,x5
00b99d10	mov x20,x4
00b99d14	bl 0x00c43150
00b99d18	mov w22,w0
00b99d1c	cbnz w0,0x00b99ed0
00b99d20	mov w8,#0x8ff
00b99d24	and w26,w24,#0xffffff00
00b99d28	movk w8,#0x600, LSL #16
00b99d2c	cmp w26,w8
00b99d30	b.gt 0x00b99d4c
00b99d34	mov w8,#0x200
00b99d38	movk w8,#0x600, LSL #16
00b99d3c	cmp w26,w8
00b99d40	b.eq 0x00b99d80
00b99d44	mov w8,#0x300
00b99d48	b 0x00b99d60
00b99d4c	mov w8,#0x900
00b99d50	movk w8,#0x600, LSL #16
00b99d54	cmp w26,w8
00b99d58	b.eq 0x00b99d80
00b99d5c	mov w8,#0x1300
00b99d60	movk w8,#0x600, LSL #16
00b99d64	cmp w26,w8
00b99d68	b.eq 0x00b99d80
00b99d6c	lsr w8,w24,#0x9
00b99d70	orr w8,w8,#0x1
00b99d74	orr w9,wzr,#0x30003
00b99d78	cmp w8,w9
00b99d7c	b.ne 0x00b99d94
00b99d80	and w22,w24,#0xff
00b99d84	lsr x8,x21,#0x20
00b99d88	cbz x8,0x00b99da0
00b99d8c	mov w22,#0xffffff79
00b99d90	b 0x00b99ed0
00b99d94	mov w22,wzr
00b99d98	lsr x8,x21,#0x20
00b99d9c	cbnz x8,0x00b99d8c
00b99da0	mov w8,#0x200
00b99da4	movk w8,#0x600, LSL #16
00b99da8	cmp w24,w8
00b99dac	b.eq 0x00b99dcc
00b99db0	cbz w22,0x00b99e40
00b99db4	mov w0,w22
00b99db8	bl 0x00c30210
00b99dbc	bl 0x00c302d0
00b99dc0	and x8,x0,#0xff
00b99dc4	cmp x8,x21
00b99dc8	b.ne 0x00b99d8c
00b99dcc	ldr x24,[sp]
00b99dd0	mov x0,x24
00b99dd4	bl 0x00c432f0
00b99dd8	cmp x0,x23
00b99ddc	b.ne 0x00b99ec0
00b99de0	mov w8,#0x1300
00b99de4	movk w8,#0x600, LSL #16
00b99de8	cmp w26,w8
00b99dec	b.eq 0x00b99e48
00b99df0	mov w8,#0x300
00b99df4	movk w8,#0x600, LSL #16
00b99df8	cmp w26,w8
00b99dfc	b.eq 0x00b99e48
00b99e00	mov w8,#0x200
00b99e04	movk w8,#0x600, LSL #16
00b99e08	cmp w26,w8
00b99e0c	b.ne 0x00b99d8c
00b99e10	mov x0,x24
00b99e14	mov w1,wzr
00b99e18	mov w2,wzr
00b99e1c	bl 0x00c433b0
00b99e20	cbnz w0,0x00b99eb4
00b99e24	mov x0,x24
00b99e28	mov w1,w22
00b99e2c	mov w2,w21
00b99e30	mov x3,x20
00b99e34	mov x4,x19
00b99e38	bl 0x00c43360
00b99e3c	b 0x00b99eb4
00b99e40	mov w22,#0xffffff7a
00b99e44	b 0x00b99ed0
00b99e48	mov w1,#0x1
00b99e4c	mov x0,x24
00b99e50	mov w2,w22
00b99e54	bl 0x00c433b0
00b99e58	cbnz w0,0x00b99eb4
00b99e5c	mov w8,#0x1300
00b99e60	movk w8,#0x600, LSL #16
00b99e64	cmp w26,w8
00b99e68	b.ne 0x00b99e74
00b99e6c	mov w5,#0xffffffff
00b99e70	b 0x00b99e98
00b99e74	mov x0,x24
00b99e78	bl 0x00c432f0
00b99e7c	orr w8,wzr,#0xfffffffe
00b99e80	sub w8,w8,w21
00b99e84	add w8,w8,w0
00b99e88	cmp w8,w21
00b99e8c	csel w9,w21,w8,gt
00b99e90	cmp w8,#0x0
00b99e94	csel w5,wzr,w9,lt
00b99e98	mov x0,x24
00b99e9c	mov w1,w22
00b99ea0	mov w2,w21
00b99ea4	mov x3,x20
00b99ea8	mov w4,w22
00b99eac	mov x6,x19
00b99eb0	bl 0x00c433a0
00b99eb4	mov w8,#0xffffbf00
00b99eb8	cmp w0,w8
00b99ebc	b.ne 0x00b99ec8
00b99ec0	mov w22,#0xffffff6b
00b99ec4	b 0x00b99ed0
00b99ec8	bl 0x00c42bf0
00b99ecc	mov w22,w0
00b99ed0	ldr x19,[sp]
00b99ed4	mov x0,x19
00b99ed8	bl 0x00c432d0
00b99edc	mov x0,x19
00b99ee0	bl 0x00c30960
00b99ee4	ldr x8,[x25, #0x28]
00b99ee8	ldr x9,[sp, #0x8]
00b99eec	cmp x8,x9
00b99ef0	b.ne 0x00b99f14
00b99ef4	mov w0,w22
00b99ef8	ldp x29,x30,[sp, #0x50]
00b99efc	ldp x20,x19,[sp, #0x40]
00b99f00	ldp x22,x21,[sp, #0x30]
00b99f04	ldp x24,x23,[sp, #0x20]
00b99f08	ldp x26,x25,[sp, #0x10]
00b99f0c	add sp,sp,#0x60
00b99f10	ret
00b99f14	bl 0x00c2fec0
