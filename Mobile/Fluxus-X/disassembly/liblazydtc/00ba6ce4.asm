; mbedtls_rsa_check_pub_priv @ 00ba6ce4
00ba6ce4	str x25,[sp, #-0x50]!
00ba6ce8	stp x24,x23,[sp, #0x10]
00ba6cec	stp x22,x21,[sp, #0x20]
00ba6cf0	stp x20,x19,[sp, #0x30]
00ba6cf4	stp x29,x30,[sp, #0x40]
00ba6cf8	add x29,sp,#0x40
00ba6cfc	mov x20,x1
00ba6d00	mov x19,x0
00ba6d04	bl 0x00c43400
00ba6d08	cbnz w0,0x00ba6d90
00ba6d0c	mov x0,x20
00ba6d10	bl 0x00c43400
00ba6d14	cbnz w0,0x00ba6d90
00ba6d18	mov w1,#0x1
00ba6d1c	mov x0,x20
00ba6d20	bl 0x00ba6554
00ba6d24	cbnz w0,0x00ba6d90
00ba6d28	add x22,x20,#0x10
00ba6d2c	add x23,x20,#0x40
00ba6d30	add x24,x20,#0x50
00ba6d34	add x25,x20,#0x30
00ba6d38	add x21,x20,#0x20
00ba6d3c	mov x0,x22
00ba6d40	mov x1,x23
00ba6d44	mov x2,x24
00ba6d48	mov x3,x25
00ba6d4c	mov x4,x21
00ba6d50	mov x5,xzr
00ba6d54	mov x6,xzr
00ba6d58	bl 0x00c434c0
00ba6d5c	cbnz w0,0x00ba6d90
00ba6d60	add x3,x20,#0x60
00ba6d64	add x4,x20,#0x70
00ba6d68	add x5,x20,#0x80
00ba6d6c	mov x0,x23
00ba6d70	mov x1,x24
00ba6d74	mov x2,x25
00ba6d78	bl 0x00c434b0
00ba6d7c	cbnz w0,0x00ba6d90
00ba6d80	add x0,x19,#0x10
00ba6d84	mov x1,x22
00ba6d88	bl 0x00c41b50
00ba6d8c	cbz w0,0x00ba6dac
00ba6d90	mov w0,#0xffffbe00
00ba6d94	ldp x29,x30,[sp, #0x40]
00ba6d98	ldp x20,x19,[sp, #0x30]
00ba6d9c	ldp x22,x21,[sp, #0x20]
00ba6da0	ldp x24,x23,[sp, #0x10]
00ba6da4	ldr x25,[sp], #0x50
00ba6da8	ret
00ba6dac	add x0,x19,#0x20
00ba6db0	mov x1,x21
00ba6db4	bl 0x00c41b50
00ba6db8	cmp w0,#0x0
00ba6dbc	mov w8,#0xffffbe00
00ba6dc0	csel w0,wzr,w8,eq
00ba6dc4	b 0x00ba6d94
