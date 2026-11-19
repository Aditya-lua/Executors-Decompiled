; mbedtls_des3_set2key_dec @ 00b74e6c
00b74e6c	sub sp,sp,#0x1d0
00b74e70	str x28,[sp, #0x190]
00b74e74	stp x22,x21,[sp, #0x1a0]
00b74e78	stp x20,x19,[sp, #0x1b0]
00b74e7c	stp x29,x30,[sp, #0x1c0]
00b74e80	add x29,sp,#0x1c0
00b74e84	mrs x21,tpidr_el0
00b74e88	ldr x8,[x21, #0x28]
00b74e8c	mov x19,x0
00b74e90	add x0,sp,#0x8
00b74e94	mov x20,x1
00b74e98	stur x8,[x29, #-0x38]
00b74e9c	add x22,sp,#0x8
00b74ea0	bl 0x00c424b0
00b74ea4	add x0,x19,#0x80
00b74ea8	add x1,x20,#0x8
00b74eac	bl 0x00c424b0
00b74eb0	mov x8,xzr
00b74eb4	mov x9,xzr
00b74eb8	mov w10,#0x100
00b74ebc	add x11,x22,x8
00b74ec0	ldp w12,w11,[x11, #0x78]
00b74ec4	add x13,x19,x10
00b74ec8	add x14,x19,x8
00b74ecc	add x15,x22,x10
00b74ed0	stp w12,w11,[x13, #-0x100]
00b74ed4	ldr x14,[x14, #0xf8]
00b74ed8	add x9,x9,#0x2
00b74edc	sub x8,x8,#0x8
00b74ee0	cmp x9,#0x20
00b74ee4	stur x14,[x15, #-0x80]
00b74ee8	ldur x14,[x15, #-0x100]
00b74eec	add x10,x10,#0x8
00b74ef0	str x14,[x15]
00b74ef4	stp w12,w11,[x13]
00b74ef8	b.cc 0x00b74ebc
00b74efc	add x0,sp,#0x8
00b74f00	orr w1,wzr,#0x180
00b74f04	bl 0x00c42220
00b74f08	ldr x8,[x21, #0x28]
00b74f0c	ldur x9,[x29, #-0x38]
00b74f10	cmp x8,x9
00b74f14	b.ne 0x00b74f34
00b74f18	ldp x29,x30,[sp, #0x1c0]
00b74f1c	ldp x20,x19,[sp, #0x1b0]
00b74f20	ldp x22,x21,[sp, #0x1a0]
00b74f24	ldr x28,[sp, #0x190]
00b74f28	mov w0,wzr
00b74f2c	add sp,sp,#0x1d0
00b74f30	ret
00b74f34	bl 0x00c2fec0
