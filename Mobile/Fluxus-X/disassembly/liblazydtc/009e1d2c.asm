; dtls1_retransmit_message @ 009e1d2c
009e1d2c	str x27,[sp, #-0x60]!
009e1d30	lsr w8,w1,#0x8
009e1d34	stp x26,x25,[sp, #0x10]
009e1d38	stp x24,x23,[sp, #0x20]
009e1d3c	stp x22,x21,[sp, #0x30]
009e1d40	stp x20,x19,[sp, #0x40]
009e1d44	stp x29,x30,[sp, #0x50]
009e1d48	str xzr,[sp, #0x8]
009e1d4c	strb w8,[sp, #0xe]
009e1d50	strb w1,[sp, #0xf]
009e1d54	ldr x8,[x0, #0x4b8]
009e1d58	mov x19,x0
009e1d5c	add x1,sp,#0x8
009e1d60	add x29,sp,#0x50
009e1d64	ldr x0,[x8, #0x120]
009e1d68	mov x20,x2
009e1d6c	bl 0x00c34530
009e1d70	cbz x0,0x009e1e7c
009e1d74	mov w21,#0x1
009e1d78	str w21,[x20]
009e1d7c	ldr x23,[x0, #0x8]
009e1d80	ldr x8,[x19, #0x88]
009e1d84	ldr w9,[x23, #0x28]
009e1d88	ldr x0,[x8, #0x8]
009e1d8c	ldr x8,[x23, #0x8]
009e1d90	ldr x1,[x23, #0x58]
009e1d94	cmp w9,#0x0
009e1d98	orr w9,wzr,#0xc
009e1d9c	csinc x20,x9,xzr,eq
009e1da0	add x2,x8,x20
009e1da4	bl 0x00c2ffd0
009e1da8	ldr x8,[x23, #0x8]
009e1dac	ldr x9,[x19, #0x4b8]
009e1db0	add x22,x19,#0xc58
009e1db4	mov x0,x22
009e1db8	add x10,x8,x20
009e1dbc	str x10,[x19, #0x98]
009e1dc0	ldrb w10,[x23]
009e1dc4	ldrh w11,[x23, #0x10]
009e1dc8	ldr x12,[x23, #0x20]
009e1dcc	str x8,[x9, #0x140]
009e1dd0	strb w10,[x9, #0x138]
009e1dd4	strh w11,[x9, #0x148]
009e1dd8	stp xzr,x12,[x9, #0x150]
009e1ddc	ldr x8,[x19, #0x1d10]
009e1de0	ldr x24,[x19, #0x878]
009e1de4	ldr x25,[x19, #0x890]
009e1de8	ldr x26,[x19, #0x868]
009e1dec	ldr x27,[x19, #0x918]
009e1df0	ldrh w20,[x8, #0x2]
009e1df4	str w21,[x9, #0x204]
009e1df8	ldr x8,[x23, #0x30]
009e1dfc	str x8,[x19, #0x878]
009e1e00	ldr x8,[x23, #0x38]
009e1e04	str x8,[x19, #0x890]
009e1e08	ldr x8,[x23, #0x40]
009e1e0c	str x8,[x19, #0x868]
009e1e10	ldr x8,[x23, #0x48]
009e1e14	str x8,[x19, #0x918]
009e1e18	ldrh w1,[x23, #0x50]
009e1e1c	bl 0x00c36af0
009e1e20	ldr w8,[x23, #0x28]
009e1e24	mov w9,#0x14
009e1e28	mov x0,x19
009e1e2c	cmp w8,#0x0
009e1e30	mov w8,#0x16
009e1e34	csel w1,w8,w9,eq
009e1e38	bl 0x009e0ddc
009e1e3c	mov w21,w0
009e1e40	mov x0,x22
009e1e44	mov w1,w20
009e1e48	str x24,[x19, #0x878]
009e1e4c	str x25,[x19, #0x890]
009e1e50	str x26,[x19, #0x868]
009e1e54	str x27,[x19, #0x918]
009e1e58	bl 0x00c36af0
009e1e5c	ldr x8,[x19, #0x4b8]
009e1e60	mov w1,#0xb
009e1e64	mov x2,xzr
009e1e68	mov x3,xzr
009e1e6c	str wzr,[x8, #0x204]
009e1e70	ldr x0,[x19, #0x18]
009e1e74	bl 0x00c321a0
009e1e78	b 0x009e1eb8
009e1e7c	bl 0x00c342a0
009e1e80	adrp x0,0x2c3000
009e1e84	adrp x2,0x2bd000
009e1e88	add x0,x0,#0x656
009e1e8c	add x2,x2,#0x71a
009e1e90	mov w1,#0x4ac
009e1e94	bl 0x00c342b0
009e1e98	mov w2,#0x103
009e1e9c	mov w1,#0x50
009e1ea0	movk w2,#0xc, LSL #16
009e1ea4	mov x0,x19
009e1ea8	mov x3,xzr
009e1eac	bl 0x00c34410
009e1eb0	mov w21,wzr
009e1eb4	str wzr,[x20]
009e1eb8	mov w0,w21
009e1ebc	ldp x29,x30,[sp, #0x50]
009e1ec0	ldp x20,x19,[sp, #0x40]
009e1ec4	ldp x22,x21,[sp, #0x30]
009e1ec8	ldp x24,x23,[sp, #0x20]
009e1ecc	ldp x26,x25,[sp, #0x10]
009e1ed0	ldr x27,[sp], #0x60
009e1ed4	ret
