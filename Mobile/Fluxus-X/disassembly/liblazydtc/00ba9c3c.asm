; mbedtls_oid_get_ec_grp_algid @ 00ba9c3c
00ba9c3c	str x21,[sp, #-0x30]!
00ba9c40	stp x20,x19,[sp, #0x10]
00ba9c44	stp x29,x30,[sp, #0x20]
00ba9c48	add x29,sp,#0x20
00ba9c4c	mov x19,x1
00ba9c50	cbz x0,0x00ba9c9c
00ba9c54	ldr x8,[x0, #0x8]
00ba9c58	cmp x8,#0x3
00ba9c5c	b.ne 0x00ba9c9c
00ba9c60	ldr x20,[x0, #0x10]
00ba9c64	adrp x0,0x2b6000
00ba9c68	add x0,x0,#0xb02
00ba9c6c	orr w2,wzr,#0x3
00ba9c70	mov x1,x20
00ba9c74	bl 0x00c300b0
00ba9c78	adrp x21,0xcab000
00ba9c7c	add x21,x21,#0x910
00ba9c80	cbz w0,0x00ba9cb4
00ba9c84	adrp x0,0x2c2000
00ba9c88	add x0,x0,#0xc28
00ba9c8c	orr w2,wzr,#0x3
00ba9c90	mov x1,x20
00ba9c94	bl 0x00c300b0
00ba9c98	cbz w0,0x00ba9cb0
00ba9c9c	mov w0,#0xffffffd2
00ba9ca0	ldp x29,x30,[sp, #0x20]
00ba9ca4	ldp x20,x19,[sp, #0x10]
00ba9ca8	ldr x21,[sp], #0x30
00ba9cac	ret
00ba9cb0	add x21,x21,#0x28
00ba9cb4	ldr w8,[x21, #0x20]
00ba9cb8	mov w0,wzr
00ba9cbc	str w8,[x19]
00ba9cc0	b 0x00ba9ca0
