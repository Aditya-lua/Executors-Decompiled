; mbedtls_rsa_import_raw @ 00ba5e6c
00ba5e6c	str x25,[sp, #-0x50]!
00ba5e70	stp x24,x23,[sp, #0x10]
00ba5e74	stp x22,x21,[sp, #0x20]
00ba5e78	stp x20,x19,[sp, #0x30]
00ba5e7c	stp x29,x30,[sp, #0x40]
00ba5e80	add x29,sp,#0x40
00ba5e84	mov x20,x7
00ba5e88	mov x21,x6
00ba5e8c	mov x22,x5
00ba5e90	mov x23,x4
00ba5e94	mov x24,x3
00ba5e98	mov x19,x0
00ba5e9c	cbz x1,0x00ba5ebc
00ba5ea0	add x25,x19,#0x10
00ba5ea4	mov x0,x25
00ba5ea8	bl 0x00c41ca0
00ba5eac	cbnz w0,0x00ba5f28
00ba5eb0	mov x0,x25
00ba5eb4	bl 0x00c41d30
00ba5eb8	str x0,[x19, #0x8]
00ba5ebc	cbz x24,0x00ba5ed4
00ba5ec0	add x0,x19,#0x40
00ba5ec4	mov x1,x24
00ba5ec8	mov x2,x23
00ba5ecc	bl 0x00c41ca0
00ba5ed0	cbnz w0,0x00ba5f28
00ba5ed4	cbz x22,0x00ba5eec
00ba5ed8	add x0,x19,#0x50
00ba5edc	mov x1,x22
00ba5ee0	mov x2,x21
00ba5ee4	bl 0x00c41ca0
00ba5ee8	cbnz w0,0x00ba5f28
00ba5eec	ldr x21,[x29, #0x18]
00ba5ef0	cbz x20,0x00ba5f10
00ba5ef4	ldr x2,[x29, #0x10]
00ba5ef8	add x0,x19,#0x30
00ba5efc	mov x1,x20
00ba5f00	bl 0x00c41ca0
00ba5f04	cbz x21,0x00ba5f24
00ba5f08	cbz w0,0x00ba5f14
00ba5f0c	b 0x00ba5f24
00ba5f10	cbz x21,0x00ba5f48
00ba5f14	ldr x2,[x29, #0x20]
00ba5f18	add x0,x19,#0x20
00ba5f1c	mov x1,x21
00ba5f20	bl 0x00c41ca0
00ba5f24	cbz w0,0x00ba5f30
00ba5f28	mov w8,#0xffffbf80
00ba5f2c	add w0,w0,w8
00ba5f30	ldp x29,x30,[sp, #0x40]
00ba5f34	ldp x20,x19,[sp, #0x30]
00ba5f38	ldp x22,x21,[sp, #0x20]
00ba5f3c	ldp x24,x23,[sp, #0x10]
00ba5f40	ldr x25,[sp], #0x50
00ba5f44	ret
00ba5f48	mov w0,wzr
00ba5f4c	b 0x00ba5f30
