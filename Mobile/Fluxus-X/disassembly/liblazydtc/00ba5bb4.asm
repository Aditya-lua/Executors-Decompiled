; mbedtls_rsa_check_pubkey @ 00ba5bb4
00ba5bb4	str x21,[sp, #-0x30]!
00ba5bb8	stp x20,x19,[sp, #0x10]
00ba5bbc	stp x29,x30,[sp, #0x20]
00ba5bc0	add x29,sp,#0x20
00ba5bc4	ldr x21,[x0, #0x8]
00ba5bc8	add x19,x0,#0x10
00ba5bcc	mov x20,x0
00ba5bd0	mov x0,x19
00ba5bd4	bl 0x00c41d30
00ba5bd8	cmp x21,x0
00ba5bdc	b.ne 0x00ba5c58
00ba5be0	ldr x8,[x20, #0x8]
00ba5be4	cmp x8,#0x400
00ba5be8	b.hi 0x00ba5c58
00ba5bec	mov x0,x19
00ba5bf0	mov x1,xzr
00ba5bf4	bl 0x00c41b40
00ba5bf8	cmp w0,#0x1
00ba5bfc	b.lt 0x00ba5c58
00ba5c00	mov x0,x19
00ba5c04	mov x1,xzr
00ba5c08	bl 0x00c41be0
00ba5c0c	cbz w0,0x00ba5c58
00ba5c10	add x20,x20,#0x20
00ba5c14	mov x0,x20
00ba5c18	mov x1,xzr
00ba5c1c	bl 0x00c41b40
00ba5c20	cmp w0,#0x1
00ba5c24	b.lt 0x00ba5c58
00ba5c28	mov x0,x19
00ba5c2c	bl 0x00c41b30
00ba5c30	cmp x0,#0x80
00ba5c34	b.cc 0x00ba5c58
00ba5c38	mov x0,x20
00ba5c3c	mov x1,xzr
00ba5c40	bl 0x00c41be0
00ba5c44	cbz w0,0x00ba5c58
00ba5c48	mov x0,x20
00ba5c4c	bl 0x00c41b30
00ba5c50	cmp x0,#0x2
00ba5c54	b.cs 0x00ba5c6c
00ba5c58	mov w0,#0xffffbe00
00ba5c5c	ldp x29,x30,[sp, #0x20]
00ba5c60	ldp x20,x19,[sp, #0x10]
00ba5c64	ldr x21,[sp], #0x30
00ba5c68	ret
00ba5c6c	mov x0,x20
00ba5c70	mov x1,x19
00ba5c74	bl 0x00c41b50
00ba5c78	mov w8,#0x4200
00ba5c7c	and w8,w8,w0, ASR #0x1f
00ba5c80	mov w9,#0xffffbe00
00ba5c84	add w0,w8,w9
00ba5c88	b 0x00ba5c5c
