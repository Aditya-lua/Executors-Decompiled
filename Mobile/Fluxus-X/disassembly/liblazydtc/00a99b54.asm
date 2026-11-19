; CRYPTO_clear_realloc @ 00a99b54
00a99b54	str x23,[sp, #-0x40]!
00a99b58	stp x22,x21,[sp, #0x10]
00a99b5c	stp x20,x19,[sp, #0x20]
00a99b60	mov w20,w4
00a99b64	mov x21,x3
00a99b68	stp x29,x30,[sp, #0x30]
00a99b6c	add x29,sp,#0x30
00a99b70	cbz x0,0x00a99b94
00a99b74	mov x22,x1
00a99b78	mov x19,x0
00a99b7c	cbz x2,0x00a99bcc
00a99b80	subs x1,x22,x2
00a99b84	b.ls 0x00a99c0c
00a99b88	add x0,x19,x2
00a99b8c	bl 0x00c34750
00a99b90	b 0x00a99cfc
00a99b94	adrp x8,0xcc9000
00a99b98	ldr x3,[x8, #0x138]
00a99b9c	adrp x8,0xcb4000
00a99ba0	ldr x8,[x8, #0xe68]
00a99ba4	cmp x3,x8
00a99ba8	b.eq 0x00a99c40
00a99bac	mov x0,x2
00a99bb0	mov x1,x21
00a99bb4	mov w2,w20
00a99bb8	ldp x29,x30,[sp, #0x30]
00a99bbc	ldp x20,x19,[sp, #0x20]
00a99bc0	ldp x22,x21,[sp, #0x10]
00a99bc4	ldr x23,[sp], #0x40
00a99bc8	br x3
00a99bcc	cbz x22,0x00a99bdc
00a99bd0	mov x0,x19
00a99bd4	mov x1,x22
00a99bd8	bl 0x00c34750
00a99bdc	adrp x8,0xcc9000
00a99be0	adrp x9,0xcb4000
00a99be4	ldr x8,[x8, #0x148]
00a99be8	ldr x9,[x9, #0xe60]
00a99bec	mov x0,x19
00a99bf0	cmp x8,x9
00a99bf4	b.eq 0x00a99c70
00a99bf8	mov x1,x21
00a99bfc	mov w2,w20
00a99c00	blr x8
00a99c04	mov x19,xzr
00a99c08	b 0x00a99cfc
00a99c0c	adrp x8,0xcc9000
00a99c10	adrp x9,0xcb4000
00a99c14	ldr x8,[x8, #0x138]
00a99c18	ldr x9,[x9, #0xe68]
00a99c1c	cmp x8,x9
00a99c20	b.eq 0x00a99c7c
00a99c24	mov x0,x2
00a99c28	mov x1,x21
00a99c2c	mov w2,w20
00a99c30	blr x8
00a99c34	mov x23,x0
00a99c38	cbnz x0,0x00a99ca0
00a99c3c	b 0x00a99cec
00a99c40	cbz x2,0x00a99cec
00a99c44	adrp x8,0xd22000
00a99c48	ldrb w9,[x8, #0xe8]
00a99c4c	tbnz w9,#0x0,0x00a99c58
00a99c50	mov w9,#0x1
00a99c54	strb w9,[x8, #0xe8]
00a99c58	ldp x29,x30,[sp, #0x30]
00a99c5c	ldp x20,x19,[sp, #0x20]
00a99c60	ldp x22,x21,[sp, #0x10]
00a99c64	mov x0,x2
00a99c68	ldr x23,[sp], #0x40
00a99c6c	b 0x00c308d0
00a99c70	bl 0x00c30960
00a99c74	mov x19,xzr
00a99c78	b 0x00a99cfc
00a99c7c	adrp x8,0xd22000
00a99c80	ldrb w9,[x8, #0xe8]
00a99c84	tbnz w9,#0x0,0x00a99c90
00a99c88	mov w9,#0x1
00a99c8c	strb w9,[x8, #0xe8]
00a99c90	mov x0,x2
00a99c94	bl 0x00c308d0
00a99c98	mov x23,x0
00a99c9c	cbz x0,0x00a99cec
00a99ca0	mov x0,x23
00a99ca4	mov x1,x19
00a99ca8	mov x2,x22
00a99cac	bl 0x00c2ffd0
00a99cb0	cbz x22,0x00a99cc0
00a99cb4	mov x0,x19
00a99cb8	mov x1,x22
00a99cbc	bl 0x00c34750
00a99cc0	adrp x8,0xcc9000
00a99cc4	adrp x9,0xcb4000
00a99cc8	ldr x8,[x8, #0x148]
00a99ccc	ldr x9,[x9, #0xe60]
00a99cd0	mov x0,x19
00a99cd4	cmp x8,x9
00a99cd8	b.eq 0x00a99cf4
00a99cdc	mov x1,x21
00a99ce0	mov w2,w20
00a99ce4	blr x8
00a99ce8	b 0x00a99cf8
00a99cec	mov x19,xzr
00a99cf0	b 0x00a99cfc
00a99cf4	bl 0x00c30960
00a99cf8	mov x19,x23
00a99cfc	mov x0,x19
00a99d00	ldp x29,x30,[sp, #0x30]
00a99d04	ldp x20,x19,[sp, #0x20]
00a99d08	ldp x22,x21,[sp, #0x10]
00a99d0c	ldr x23,[sp], #0x40
00a99d10	ret
