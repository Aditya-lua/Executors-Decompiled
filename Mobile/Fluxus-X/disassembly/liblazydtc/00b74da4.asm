; mbedtls_des3_set2key_enc @ 00b74da4
00b74da4	sub sp,sp,#0x1d0
00b74da8	str x28,[sp, #0x190]
00b74dac	stp x22,x21,[sp, #0x1a0]
00b74db0	stp x20,x19,[sp, #0x1b0]
00b74db4	stp x29,x30,[sp, #0x1c0]
00b74db8	add x29,sp,#0x1c0
00b74dbc	mrs x21,tpidr_el0
00b74dc0	ldr x8,[x21, #0x28]
00b74dc4	mov x20,x1
00b74dc8	mov x19,x0
00b74dcc	stur x8,[x29, #-0x38]
00b74dd0	bl 0x00c424b0
00b74dd4	add x22,sp,#0x8
00b74dd8	add x0,x22,#0x80
00b74ddc	add x1,x20,#0x8
00b74de0	bl 0x00c424b0
00b74de4	mov x8,xzr
00b74de8	mov x9,xzr
00b74dec	mov w10,#0x100
00b74df0	add x11,x19,x8
00b74df4	ldp w12,w11,[x11, #0x78]
00b74df8	add x13,x22,x10
00b74dfc	add x14,x22,x8
00b74e00	add x15,x19,x10
00b74e04	stp w12,w11,[x13, #-0x100]
00b74e08	ldr x14,[x14, #0xf8]
00b74e0c	add x9,x9,#0x2
00b74e10	sub x8,x8,#0x8
00b74e14	cmp x9,#0x20
00b74e18	stur x14,[x15, #-0x80]
00b74e1c	ldur x14,[x15, #-0x100]
00b74e20	add x10,x10,#0x8
00b74e24	str x14,[x15]
00b74e28	stp w12,w11,[x13]
00b74e2c	b.cc 0x00b74df0
00b74e30	add x0,sp,#0x8
00b74e34	orr w1,wzr,#0x180
00b74e38	bl 0x00c42220
00b74e3c	ldr x8,[x21, #0x28]
00b74e40	ldur x9,[x29, #-0x38]
00b74e44	cmp x8,x9
00b74e48	b.ne 0x00b74e68
00b74e4c	ldp x29,x30,[sp, #0x1c0]
00b74e50	ldp x20,x19,[sp, #0x1b0]
00b74e54	ldp x22,x21,[sp, #0x1a0]
00b74e58	ldr x28,[sp, #0x190]
00b74e5c	mov w0,wzr
00b74e60	add sp,sp,#0x1d0
00b74e64	ret
00b74e68	bl 0x00c2fec0
