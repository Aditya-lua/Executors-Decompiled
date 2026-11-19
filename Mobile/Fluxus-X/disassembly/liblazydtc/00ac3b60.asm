; Poly1305_Update @ 00ac3b60
00ac3b60	str x23,[sp, #-0x40]!
00ac3b64	stp x22,x21,[sp, #0x10]
00ac3b68	stp x20,x19,[sp, #0x20]
00ac3b6c	stp x29,x30,[sp, #0x30]
00ac3b70	ldr x23,[x0, #0xe0]
00ac3b74	mov x21,x2
00ac3b78	mov x19,x0
00ac3b7c	mov x20,x1
00ac3b80	add x29,sp,#0x30
00ac3b84	cbz x23,0x00ac3be0
00ac3b88	mov w8,#0x10
00ac3b8c	sub x22,x8,x23
00ac3b90	add x8,x19,x23
00ac3b94	cmp x22,x21
00ac3b98	add x0,x8,#0xd0
00ac3b9c	b.ls 0x00ac3bb4
00ac3ba0	mov x1,x20
00ac3ba4	mov x2,x21
00ac3ba8	bl 0x00c2ffd0
00ac3bac	add x22,x23,x21
00ac3bb0	b 0x00ac3c1c
00ac3bb4	mov x1,x20
00ac3bb8	mov x2,x22
00ac3bbc	add x23,x19,#0xd0
00ac3bc0	bl 0x00c2ffd0
00ac3bc4	mov w2,#0x10
00ac3bc8	mov w3,#0x1
00ac3bcc	mov x0,x19
00ac3bd0	mov x1,x23
00ac3bd4	bl 0x00ac3c34
00ac3bd8	add x20,x20,x22
00ac3bdc	sub x21,x21,x22
00ac3be0	and x22,x21,#0xf
00ac3be4	sub x21,x21,x22
00ac3be8	cmp x21,#0x10
00ac3bec	b.cc 0x00ac3c08
00ac3bf0	mov w3,#0x1
00ac3bf4	mov x0,x19
00ac3bf8	mov x1,x20
00ac3bfc	mov x2,x21
00ac3c00	bl 0x00ac3c34
00ac3c04	add x20,x20,x21
00ac3c08	cbz x22,0x00ac3c1c
00ac3c0c	add x0,x19,#0xd0
00ac3c10	mov x1,x20
00ac3c14	mov x2,x22
00ac3c18	bl 0x00c2ffd0
00ac3c1c	str x22,[x19, #0xe0]
00ac3c20	ldp x29,x30,[sp, #0x30]
00ac3c24	ldp x20,x19,[sp, #0x20]
00ac3c28	ldp x22,x21,[sp, #0x10]
00ac3c2c	ldr x23,[sp], #0x40
00ac3c30	ret
