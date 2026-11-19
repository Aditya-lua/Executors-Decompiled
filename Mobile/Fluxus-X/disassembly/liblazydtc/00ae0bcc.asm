; ossl_sha3_update @ 00ae0bcc
00ae0bcc	stp x24,x23,[sp, #-0x40]!
00ae0bd0	stp x22,x21,[sp, #0x10]
00ae0bd4	stp x20,x19,[sp, #0x20]
00ae0bd8	stp x29,x30,[sp, #0x30]
00ae0bdc	add x29,sp,#0x30
00ae0be0	cbz x2,0x00ae0c9c
00ae0be4	ldr x8,[x0, #0xd8]
00ae0be8	ldr x22,[x0, #0xc8]
00ae0bec	mov x20,x2
00ae0bf0	mov x21,x1
00ae0bf4	mov x19,x0
00ae0bf8	cbz x8,0x00ae0c5c
00ae0bfc	sub x23,x22,x8
00ae0c00	add x8,x19,x8
00ae0c04	cmp x23,x20
00ae0c08	add x0,x8,#0xe0
00ae0c0c	b.ls 0x00ae0c2c
00ae0c10	mov x1,x21
00ae0c14	mov x2,x20
00ae0c18	bl 0x00c2ffd0
00ae0c1c	ldr x8,[x19, #0xd8]
00ae0c20	add x8,x8,x20
00ae0c24	str x8,[x19, #0xd8]
00ae0c28	b 0x00ae0c9c
00ae0c2c	mov x1,x21
00ae0c30	mov x2,x23
00ae0c34	add x24,x19,#0xe0
00ae0c38	bl 0x00c2ffd0
00ae0c3c	mov x0,x19
00ae0c40	mov x1,x24
00ae0c44	mov x2,x22
00ae0c48	mov x3,x22
00ae0c4c	add x21,x21,x23
00ae0c50	sub x20,x20,x23
00ae0c54	bl 0x00c400c0
00ae0c58	str xzr,[x19, #0xd8]
00ae0c5c	cmp x20,x22
00ae0c60	mov x23,x20
00ae0c64	b.cc 0x00ae0c80
00ae0c68	mov x0,x19
00ae0c6c	mov x1,x21
00ae0c70	mov x2,x20
00ae0c74	mov x3,x22
00ae0c78	bl 0x00c400c0
00ae0c7c	mov x23,x0
00ae0c80	cbz x23,0x00ae0c9c
00ae0c84	add x8,x21,x20
00ae0c88	add x0,x19,#0xe0
00ae0c8c	sub x1,x8,x23
00ae0c90	mov x2,x23
00ae0c94	bl 0x00c2ffd0
00ae0c98	str x23,[x19, #0xd8]
00ae0c9c	ldp x29,x30,[sp, #0x30]
00ae0ca0	ldp x20,x19,[sp, #0x20]
00ae0ca4	ldp x22,x21,[sp, #0x10]
00ae0ca8	mov w0,#0x1
00ae0cac	ldp x24,x23,[sp], #0x40
00ae0cb0	ret
