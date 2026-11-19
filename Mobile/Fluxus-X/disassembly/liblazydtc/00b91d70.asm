; mbedtls_ecp_point_write_binary @ 00b91d70
00b91d70	stp x26,x25,[sp, #-0x50]!
00b91d74	stp x24,x23,[sp, #0x10]
00b91d78	stp x22,x21,[sp, #0x20]
00b91d7c	stp x20,x19,[sp, #0x30]
00b91d80	stp x29,x30,[sp, #0x40]
00b91d84	add x29,sp,#0x40
00b91d88	mov x23,x5
00b91d8c	mov x19,x4
00b91d90	mov x22,x3
00b91d94	mov w24,w2
00b91d98	mov x20,x1
00b91d9c	cmp w2,#0x1
00b91da0	mov x25,x0
00b91da4	b.ls 0x00b91db0
00b91da8	mov w0,#0xffffb080
00b91dac	b 0x00b91e9c
00b91db0	add x0,x25,#0x8
00b91db4	bl 0x00c41d30
00b91db8	ldr x8,[x25, #0x38]
00b91dbc	mov x21,x0
00b91dc0	cbz x8,0x00b91e2c
00b91dc4	ldr x8,[x25, #0x48]
00b91dc8	cbz x8,0x00b91e34
00b91dcc	mov w26,#0xffffb180
00b91dd0	add x0,x20,#0x20
00b91dd4	mov x1,xzr
00b91dd8	bl 0x00c41b40
00b91ddc	cbz w0,0x00b91e70
00b91de0	cmp w24,#0x1
00b91de4	b.eq 0x00b91e88
00b91de8	mov w0,w26
00b91dec	cbnz w24,0x00b91e9c
00b91df0	mov w8,#0x1
00b91df4	bfm x8,x21,#0x3f,#0x3e
00b91df8	cmp x8,x23
00b91dfc	str x8,[x22]
00b91e00	b.hi 0x00b91e98
00b91e04	mov w8,#0x4
00b91e08	strb w8,[x19], #0x1
00b91e0c	mov x0,x20
00b91e10	mov x1,x19
00b91e14	mov x2,x21
00b91e18	bl 0x00c41d80
00b91e1c	cbnz w0,0x00b91e9c
00b91e20	add x0,x20,#0x10
00b91e24	add x1,x19,x21
00b91e28	b 0x00b91ed0
00b91e2c	mov w0,#0xffffb180
00b91e30	b 0x00b91e9c
00b91e34	cmp x21,x23
00b91e38	str x21,[x22]
00b91e3c	b.hi 0x00b91e98
00b91e40	mov x0,x20
00b91e44	mov x1,x19
00b91e48	mov x2,x21
00b91e4c	bl 0x00c41d90
00b91e50	cbnz w0,0x00b91e9c
00b91e54	ldr x8,[x25, #0x38]
00b91e58	cbz x8,0x00b91eec
00b91e5c	ldr x8,[x25, #0x48]
00b91e60	mov w26,wzr
00b91e64	mov w0,wzr
00b91e68	cbnz x8,0x00b91dd0
00b91e6c	b 0x00b91e9c
00b91e70	cbz x23,0x00b91e98
00b91e74	mov w0,wzr
00b91e78	mov w8,#0x1
00b91e7c	strb wzr,[x19]
00b91e80	str x8,[x22]
00b91e84	b 0x00b91e9c
00b91e88	add x8,x21,#0x1
00b91e8c	cmp x8,x23
00b91e90	str x8,[x22]
00b91e94	b.ls 0x00b91eb4
00b91e98	mov w0,#0xffffb100
00b91e9c	ldp x29,x30,[sp, #0x40]
00b91ea0	ldp x20,x19,[sp, #0x30]
00b91ea4	ldp x22,x21,[sp, #0x20]
00b91ea8	ldp x24,x23,[sp, #0x10]
00b91eac	ldp x26,x25,[sp], #0x50
00b91eb0	ret
00b91eb4	add x0,x20,#0x10
00b91eb8	mov x1,xzr
00b91ebc	bl 0x00c41be0
00b91ec0	add w8,w0,#0x2
00b91ec4	strb w8,[x19], #0x1
00b91ec8	mov x0,x20
00b91ecc	mov x1,x19
00b91ed0	mov x2,x21
00b91ed4	ldp x29,x30,[sp, #0x40]
00b91ed8	ldp x20,x19,[sp, #0x30]
00b91edc	ldp x22,x21,[sp, #0x20]
00b91ee0	ldp x24,x23,[sp, #0x10]
00b91ee4	ldp x26,x25,[sp], #0x50
00b91ee8	b 0x00c41d80
00b91eec	mov w0,wzr
00b91ef0	b 0x00b91e9c
