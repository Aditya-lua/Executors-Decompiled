; mbedtls_rsa_parse_pubkey @ 00ba5d1c
00ba5d1c	sub sp,sp,#0x50
00ba5d20	stp x22,x21,[sp, #0x20]
00ba5d24	stp x20,x19,[sp, #0x30]
00ba5d28	stp x29,x30,[sp, #0x40]
00ba5d2c	add x29,sp,#0x40
00ba5d30	mrs x22,tpidr_el0
00ba5d34	ldr x8,[x22, #0x28]
00ba5d38	add x19,x1,x2
00ba5d3c	mov x20,x0
00ba5d40	add x0,sp,#0x10
00ba5d44	str x8,[sp, #0x18]
00ba5d48	str x1,[sp, #0x10]
00ba5d4c	add x2,sp,#0x8
00ba5d50	orr w3,wzr,#0x30
00ba5d54	mov x1,x19
00ba5d58	bl 0x00c41a70
00ba5d5c	cbnz w0,0x00ba5de8
00ba5d60	ldp x9,x8,[sp, #0x8]
00ba5d64	add x8,x8,x9
00ba5d68	cmp x19,x8
00ba5d6c	b.eq 0x00ba5d78
00ba5d70	mov w0,#0xffffbf80
00ba5d74	b 0x00ba5de8
00ba5d78	add x0,sp,#0x10
00ba5d7c	add x2,sp,#0x8
00ba5d80	mov w3,#0x2
00ba5d84	mov x1,x19
00ba5d88	bl 0x00c41a70
00ba5d8c	cbnz w0,0x00ba5de8
00ba5d90	ldr x1,[sp, #0x10]
00ba5d94	cbz x1,0x00ba5dc4
00ba5d98	ldr x2,[sp, #0x8]
00ba5d9c	add x21,x20,#0x10
00ba5da0	mov x0,x21
00ba5da4	bl 0x00c41ca0
00ba5da8	mov w8,#0x4080
00ba5dac	cmp w0,w8
00ba5db0	b.eq 0x00ba5dc4
00ba5db4	cbnz w0,0x00ba5d70
00ba5db8	mov x0,x21
00ba5dbc	bl 0x00c41d30
00ba5dc0	str x0,[x20, #0x8]
00ba5dc4	ldp x8,x9,[sp, #0x8]
00ba5dc8	add x0,sp,#0x10
00ba5dcc	add x2,sp,#0x8
00ba5dd0	mov w3,#0x2
00ba5dd4	add x8,x9,x8
00ba5dd8	mov x1,x19
00ba5ddc	str x8,[sp, #0x10]
00ba5de0	bl 0x00c41a70
00ba5de4	cbz w0,0x00ba5e0c
00ba5de8	ldr x8,[x22, #0x28]
00ba5dec	ldr x9,[sp, #0x18]
00ba5df0	cmp x8,x9
00ba5df4	b.ne 0x00ba5e68
00ba5df8	ldp x29,x30,[sp, #0x40]
00ba5dfc	ldp x20,x19,[sp, #0x30]
00ba5e00	ldp x22,x21,[sp, #0x20]
00ba5e04	add sp,sp,#0x50
00ba5e08	ret
00ba5e0c	ldr x1,[sp, #0x10]
00ba5e10	cbz x1,0x00ba5e30
00ba5e14	ldr x2,[sp, #0x8]
00ba5e18	add x0,x20,#0x20
00ba5e1c	bl 0x00c41ca0
00ba5e20	mov w8,#0x4080
00ba5e24	cmp w0,w8
00ba5e28	b.eq 0x00ba5e30
00ba5e2c	cbnz w0,0x00ba5d70
00ba5e30	ldp x8,x9,[sp, #0x8]
00ba5e34	mov x0,x20
00ba5e38	add x8,x9,x8
00ba5e3c	str x8,[sp, #0x10]
00ba5e40	bl 0x00c43410
00ba5e44	cbnz w0,0x00ba5d70
00ba5e48	mov x0,x20
00ba5e4c	bl 0x00c43400
00ba5e50	cbnz w0,0x00ba5d70
00ba5e54	ldr x8,[sp, #0x10]
00ba5e58	cmp x8,x19
00ba5e5c	mov w8,#0xffffff9a
00ba5e60	csel w0,wzr,w8,eq
00ba5e64	b 0x00ba5de8
00ba5e68	bl 0x00c2fec0
