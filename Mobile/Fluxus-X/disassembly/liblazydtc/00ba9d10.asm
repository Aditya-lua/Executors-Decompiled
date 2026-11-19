; mbedtls_oid_get_cipher_alg @ 00ba9d10
00ba9d10	str x21,[sp, #-0x30]!
00ba9d14	stp x20,x19,[sp, #0x10]
00ba9d18	stp x29,x30,[sp, #0x20]
00ba9d1c	add x29,sp,#0x20
00ba9d20	mov x19,x1
00ba9d24	cbz x0,0x00ba9de4
00ba9d28	ldr x8,[x0, #0x8]
00ba9d2c	cmp x8,#0x9
00ba9d30	b.eq 0x00ba9d68
00ba9d34	cmp x8,#0x8
00ba9d38	b.eq 0x00ba9dc4
00ba9d3c	cmp x8,#0x5
00ba9d40	b.ne 0x00ba9de4
00ba9d44	ldr x1,[x0, #0x10]
00ba9d48	adrp x0,0x2ba000
00ba9d4c	add x0,x0,#0xc4a
00ba9d50	mov w2,#0x5
00ba9d54	bl 0x00c300b0
00ba9d58	cbnz w0,0x00ba9de4
00ba9d5c	adrp x8,0xcac000
00ba9d60	add x8,x8,#0x118
00ba9d64	b 0x00ba9e08
00ba9d68	ldr x20,[x0, #0x10]
00ba9d6c	adrp x0,0x2ae000
00ba9d70	add x0,x0,#0xd6e
00ba9d74	mov w2,#0x9
00ba9d78	mov x1,x20
00ba9d7c	bl 0x00c300b0
00ba9d80	adrp x21,0xcac000
00ba9d84	add x21,x21,#0x118
00ba9d88	cbz w0,0x00ba9dec
00ba9d8c	adrp x0,0x2cc000
00ba9d90	add x0,x0,#0x9d2
00ba9d94	mov w2,#0x9
00ba9d98	mov x1,x20
00ba9d9c	bl 0x00c300b0
00ba9da0	cbz w0,0x00ba9e04
00ba9da4	adrp x0,0x2a5000
00ba9da8	add x0,x0,#0x21
00ba9dac	mov w2,#0x9
00ba9db0	mov x1,x20
00ba9db4	bl 0x00c300b0
00ba9db8	cbnz w0,0x00ba9de4
00ba9dbc	add x8,x21,#0xa0
00ba9dc0	b 0x00ba9e08
00ba9dc4	ldr x8,[x0, #0x10]
00ba9dc8	mov x9,#0x862a
00ba9dcc	movk x9,#0x8648, LSL #16
00ba9dd0	movk x9,#0xdf7, LSL #32
00ba9dd4	ldr x8,[x8]
00ba9dd8	movk x9,#0x703, LSL #48
00ba9ddc	cmp x8,x9
00ba9de0	b.eq 0x00ba9df4
00ba9de4	mov w0,#0xffffffd2
00ba9de8	b 0x00ba9e14
00ba9dec	add x8,x21,#0x50
00ba9df0	b 0x00ba9e08
00ba9df4	adrp x8,0xcac000
00ba9df8	add x8,x8,#0x118
00ba9dfc	add x8,x8,#0x28
00ba9e00	b 0x00ba9e08
00ba9e04	add x8,x21,#0x78
00ba9e08	ldr w8,[x8, #0x20]
00ba9e0c	mov w0,wzr
00ba9e10	str w8,[x19]
00ba9e14	ldp x29,x30,[sp, #0x20]
00ba9e18	ldp x20,x19,[sp, #0x10]
00ba9e1c	ldr x21,[sp], #0x30
00ba9e20	ret
