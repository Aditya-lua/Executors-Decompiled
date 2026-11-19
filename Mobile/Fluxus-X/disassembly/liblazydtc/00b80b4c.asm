; mbedtls_mpi_gcd @ 00b80b4c
00b80b4c	sub sp,sp,#0x80
00b80b50	str x25,[sp, #0x30]
00b80b54	stp x24,x23,[sp, #0x40]
00b80b58	stp x22,x21,[sp, #0x50]
00b80b5c	stp x20,x19,[sp, #0x60]
00b80b60	stp x29,x30,[sp, #0x70]
00b80b64	add x29,sp,#0x70
00b80b68	mrs x25,tpidr_el0
00b80b6c	ldr x8,[x25, #0x28]
00b80b70	mov x19,x0
00b80b74	mov w9,#0x1
00b80b78	add x0,sp,#0x18
00b80b7c	mov x22,x2
00b80b80	mov x20,x1
00b80b84	str x8,[sp, #0x28]
00b80b88	str w9,[sp, #0x20]
00b80b8c	str xzr,[sp, #0x18]
00b80b90	str w9,[sp, #0x10]
00b80b94	str xzr,[sp, #0x8]
00b80b98	bl 0x00c41b60
00b80b9c	mov w21,w0
00b80ba0	cbnz w0,0x00b80f10
00b80ba4	add x0,sp,#0x8
00b80ba8	mov x1,x22
00b80bac	bl 0x00c41b60
00b80bb0	mov w21,w0
00b80bb4	cbnz w0,0x00b80f10
00b80bb8	ldrh w8,[sp, #0x22]
00b80bbc	cbz x8,0x00b80be4
00b80bc0	ldr x10,[sp, #0x18]
00b80bc4	mov x9,xzr
00b80bc8	mov x11,xzr
00b80bcc	ldr x12,[x10, x11, LSL #0x3]
00b80bd0	cbnz x12,0x00b80bf4
00b80bd4	add x11,x11,#0x1
00b80bd8	cmp x11,x8
00b80bdc	add x9,x9,#0x40
00b80be0	b.cc 0x00b80bcc
00b80be4	mov x9,xzr
00b80be8	ldrh w11,[sp, #0x12]
00b80bec	cbnz x11,0x00b80c08
00b80bf0	b 0x00b80c4c
00b80bf4	rbit x10,x12
00b80bf8	clz x10,x10
00b80bfc	add x9,x10,x9
00b80c00	ldrh w11,[sp, #0x12]
00b80c04	cbz x11,0x00b80c4c
00b80c08	ldr x10,[sp, #0x8]
00b80c0c	mov x12,xzr
00b80c10	mov x13,xzr
00b80c14	ldr x14,[x10, x13, LSL #0x3]
00b80c18	cbnz x14,0x00b80c30
00b80c1c	add x13,x13,#0x1
00b80c20	cmp x13,x11
00b80c24	sub x12,x12,#0x40
00b80c28	b.cc 0x00b80c14
00b80c2c	b 0x00b80c40
00b80c30	rbit x11,x14
00b80c34	clz x11,x11
00b80c38	subs x11,x11,x12
00b80c3c	b.ne 0x00b80c58
00b80c40	ldrb w10,[x10]
00b80c44	mov x11,xzr
00b80c48	tbnz w10,#0x0,0x00b80c58
00b80c4c	mov x0,x19
00b80c50	mov x1,x20
00b80c54	b 0x00b80f08
00b80c58	cmp x11,x9
00b80c5c	mov w10,#0x1
00b80c60	csel x20,x11,x9,cc
00b80c64	strh w10,[sp, #0x10]
00b80c68	strh w10,[sp, #0x20]
00b80c6c	b 0x00b80c74
00b80c70	ldrh w8,[sp, #0x22]
00b80c74	ldr x0,[sp, #0x18]
00b80c78	and x1,x8,#0xffff
00b80c7c	mov x8,x1
00b80c80	cbz x8,0x00b80e58
00b80c84	add x9,x0,x8, LSL #0x3
00b80c88	ldur x9,[x9, #-0x8]
00b80c8c	sub x8,x8,#0x1
00b80c90	cbz x9,0x00b80c80
00b80c94	ldrh w8,[sp, #0x20]
00b80c98	cbz w8,0x00b80e58
00b80c9c	cbz w1,0x00b80cd8
00b80ca0	mov x8,xzr
00b80ca4	mov x9,xzr
00b80ca8	ldr x10,[x0, x9, LSL #0x3]
00b80cac	cbnz x10,0x00b80cc8
00b80cb0	add x9,x9,#0x1
00b80cb4	cmp x9,x1
00b80cb8	add x8,x8,#0x40
00b80cbc	b.cc 0x00b80ca8
00b80cc0	mov x2,xzr
00b80cc4	b 0x00b80cd4
00b80cc8	rbit x9,x10
00b80ccc	clz x9,x9
00b80cd0	add x2,x9,x8
00b80cd4	bl 0x00c41ef0
00b80cd8	ldrh w1,[sp, #0x12]
00b80cdc	cbz x1,0x00b80d1c
00b80ce0	ldr x0,[sp, #0x8]
00b80ce4	mov x8,xzr
00b80ce8	mov x9,xzr
00b80cec	ldr x10,[x0, x9, LSL #0x3]
00b80cf0	cbnz x10,0x00b80d0c
00b80cf4	add x9,x9,#0x1
00b80cf8	cmp x9,x1
00b80cfc	add x8,x8,#0x40
00b80d00	b.cc 0x00b80cec
00b80d04	mov x2,xzr
00b80d08	b 0x00b80d18
00b80d0c	rbit x9,x10
00b80d10	clz x9,x9
00b80d14	add x2,x9,x8
00b80d18	bl 0x00c41ef0
00b80d1c	ldrh w9,[sp, #0x22]
00b80d20	ldr x8,[sp, #0x18]
00b80d24	sub x9,x9,#0x1
00b80d28	cmn x9,#0x1
00b80d2c	b.eq 0x00b80d44
00b80d30	ldr x10,[x8, x9, LSL #0x3]
00b80d34	sub x9,x9,#0x1
00b80d38	cbz x10,0x00b80d28
00b80d3c	add x9,x9,#0x2
00b80d40	b 0x00b80d48
00b80d44	mov x9,xzr
00b80d48	ldrh w11,[sp, #0x12]
00b80d4c	ldr x10,[sp, #0x8]
00b80d50	sub x11,x11,#0x1
00b80d54	cmn x11,#0x1
00b80d58	b.eq 0x00b80d78
00b80d5c	ldr x12,[x10, x11, LSL #0x3]
00b80d60	sub x11,x11,#0x1
00b80d64	cbz x12,0x00b80d54
00b80d68	add x11,x11,#0x2
00b80d6c	orr x12,x11,x9
00b80d70	cbnz x12,0x00b80d84
00b80d74	b 0x00b80dac
00b80d78	mov x11,xzr
00b80d7c	orr x12,x11,x9
00b80d80	cbz x12,0x00b80dac
00b80d84	cmp x9,x11
00b80d88	b.ls 0x00b80d98
00b80d8c	ldrsh w11,[sp, #0x20]
00b80d90	tbz w11,#0x1f,0x00b80dac
00b80d94	b 0x00b80e28
00b80d98	cmp x11,x9
00b80d9c	b.ls 0x00b80dd4
00b80da0	ldrsh w8,[sp, #0x10]
00b80da4	neg w11,w8
00b80da8	tbnz w11,#0x1f,0x00b80e28
00b80dac	add x0,sp,#0x18
00b80db0	add x1,sp,#0x18
00b80db4	add x2,sp,#0x8
00b80db8	bl 0x00c41d40
00b80dbc	mov w21,w0
00b80dc0	cbnz w0,0x00b80f10
00b80dc4	ldrh w1,[sp, #0x22]
00b80dc8	cbz x1,0x00b80c70
00b80dcc	ldr x0,[sp, #0x18]
00b80dd0	b 0x00b80e4c
00b80dd4	ldrsh w11,[sp, #0x20]
00b80dd8	ldrsh w12,[sp, #0x10]
00b80ddc	cmp w11,#0x1
00b80de0	b.lt 0x00b80e1c
00b80de4	tbnz w12,#0x1f,0x00b80dac
00b80de8	cbz x9,0x00b80dac
00b80dec	lsl x12,x9,#0x3
00b80df0	add x13,x8,x12
00b80df4	add x12,x10,x12
00b80df8	ldur x13,[x13, #-0x8]
00b80dfc	ldur x12,[x12, #-0x8]
00b80e00	sub x9,x9,#0x1
00b80e04	cmp x13,x12
00b80e08	b.hi 0x00b80da8
00b80e0c	b.cs 0x00b80de8
00b80e10	neg w11,w11
00b80e14	tbz w11,#0x1f,0x00b80dac
00b80e18	b 0x00b80e28
00b80e1c	cbz w11,0x00b80de8
00b80e20	cmp w12,#0x0
00b80e24	b.le 0x00b80de8
00b80e28	add x0,sp,#0x8
00b80e2c	add x1,sp,#0x8
00b80e30	add x2,sp,#0x18
00b80e34	bl 0x00c41d40
00b80e38	mov w21,w0
00b80e3c	cbnz w0,0x00b80f10
00b80e40	ldrh w1,[sp, #0x12]
00b80e44	cbz x1,0x00b80c70
00b80e48	ldr x0,[sp, #0x8]
00b80e4c	mov w2,#0x1
00b80e50	bl 0x00c41ef0
00b80e54	b 0x00b80c70
00b80e58	ldr x0,[sp, #0x8]
00b80e5c	ldrh w1,[sp, #0x12]
00b80e60	bl 0x00c41dc0
00b80e64	ldrh w21,[sp, #0x12]
00b80e68	add x8,x0,x20
00b80e6c	lsl x9,x21,#0x6
00b80e70	cmp x9,x8
00b80e74	b.cs 0x00b80ef0
00b80e78	lsr x9,x8,#0x6
00b80e7c	tst x8,#0x3f
00b80e80	cinc x22,x9,ne
00b80e84	mov w8,#0x2710
00b80e88	cmp x22,x8
00b80e8c	b.ls 0x00b80ea0
00b80e90	orr w21,wzr,#0xfffffff0
00b80e94	ldr x0,[sp, #0x18]
00b80e98	cbnz x0,0x00b80f18
00b80e9c	b 0x00b80f24
00b80ea0	cmp x22,x21
00b80ea4	b.ls 0x00b80ef0
00b80ea8	mov w1,#0x8
00b80eac	mov x0,x22
00b80eb0	bl 0x00c30a30
00b80eb4	mov x23,x0
00b80eb8	cbz x0,0x00b80e90
00b80ebc	ldr x24,[sp, #0x8]
00b80ec0	cbz x24,0x00b80ee4
00b80ec4	lsl x21,x21,#0x3
00b80ec8	mov x0,x23
00b80ecc	mov x1,x24
00b80ed0	mov x2,x21
00b80ed4	bl 0x00c2ffd0
00b80ed8	mov x0,x24
00b80edc	mov x1,x21
00b80ee0	bl 0x00c42230
00b80ee4	and x21,x22,#0xffff
00b80ee8	strh w22,[sp, #0x12]
00b80eec	str x23,[sp, #0x8]
00b80ef0	ldr x0,[sp, #0x8]
00b80ef4	mov x1,x21
00b80ef8	mov x2,x20
00b80efc	bl 0x00c41ee0
00b80f00	add x1,sp,#0x8
00b80f04	mov x0,x19
00b80f08	bl 0x00c41b60
00b80f0c	mov w21,w0
00b80f10	ldr x0,[sp, #0x18]
00b80f14	cbz x0,0x00b80f24
00b80f18	ldrh w8,[sp, #0x22]
00b80f1c	lsl x1,x8,#0x3
00b80f20	bl 0x00c42230
00b80f24	ldr x0,[sp, #0x8]
00b80f28	mov w8,#0x1
00b80f2c	str w8,[sp, #0x20]
00b80f30	str xzr,[sp, #0x18]
00b80f34	cbz x0,0x00b80f44
00b80f38	ldrh w8,[sp, #0x12]
00b80f3c	lsl x1,x8,#0x3
00b80f40	bl 0x00c42230
00b80f44	ldr x8,[x25, #0x28]
00b80f48	ldr x9,[sp, #0x28]
00b80f4c	cmp x8,x9
00b80f50	b.ne 0x00b80f74
00b80f54	mov w0,w21
00b80f58	ldp x29,x30,[sp, #0x70]
00b80f5c	ldp x20,x19,[sp, #0x60]
00b80f60	ldp x22,x21,[sp, #0x50]
00b80f64	ldp x24,x23,[sp, #0x40]
00b80f68	ldr x25,[sp, #0x30]
00b80f6c	add sp,sp,#0x80
00b80f70	ret
00b80f74	bl 0x00c2fec0
