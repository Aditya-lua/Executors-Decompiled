; DH_check_params @ 00a19b20
00a19b20	stp x22,x21,[sp, #-0x30]!
00a19b24	stp x20,x19,[sp, #0x10]
00a19b28	stp x29,x30,[sp, #0x20]
00a19b2c	str wzr,[x1]
00a19b30	mov x21,x0
00a19b34	ldr x0,[x0, #0xb0]
00a19b38	add x29,sp,#0x20
00a19b3c	mov x20,x1
00a19b40	bl 0x00c38a60
00a19b44	mov x19,x0
00a19b48	cbz x0,0x00a19c2c
00a19b4c	mov x0,x19
00a19b50	bl 0x00c38a90
00a19b54	mov x0,x19
00a19b58	bl 0x00c38a40
00a19b5c	cbz x0,0x00a19c2c
00a19b60	mov x22,x0
00a19b64	ldr x0,[x21, #0x8]
00a19b68	bl 0x00c38d10
00a19b6c	cbnz w0,0x00a19b7c
00a19b70	ldr w8,[x20]
00a19b74	orr w8,w8,#0x1
00a19b78	str w8,[x20]
00a19b7c	ldr x0,[x21, #0x18]
00a19b80	bl 0x00c37f40
00a19b84	cbnz w0,0x00a19ba0
00a19b88	ldr x0,[x21, #0x18]
00a19b8c	bl 0x00c369b0
00a19b90	cbnz w0,0x00a19ba0
00a19b94	ldr x0,[x21, #0x18]
00a19b98	bl 0x00c38d20
00a19b9c	cbz w0,0x00a19bac
00a19ba0	ldr w8,[x20]
00a19ba4	orr w8,w8,#0x8
00a19ba8	str w8,[x20]
00a19bac	ldr x1,[x21, #0x8]
00a19bb0	mov x0,x22
00a19bb4	bl 0x00c36990
00a19bb8	cbz x0,0x00a19c2c
00a19bbc	mov w1,#0x1
00a19bc0	mov x0,x22
00a19bc4	bl 0x00c38fd0
00a19bc8	cbz w0,0x00a19c2c
00a19bcc	ldr x0,[x21, #0x18]
00a19bd0	mov x1,x22
00a19bd4	bl 0x00c38cc0
00a19bd8	tbnz w0,#0x1f,0x00a19be8
00a19bdc	ldr w8,[x20]
00a19be0	orr w8,w8,#0x8
00a19be4	str w8,[x20]
00a19be8	ldr x0,[x21, #0x8]
00a19bec	bl 0x00c322f0
00a19bf0	cmp w0,#0x1ff
00a19bf4	b.gt 0x00a19c04
00a19bf8	ldr w8,[x20]
00a19bfc	orr w8,w8,#0x80
00a19c00	str w8,[x20]
00a19c04	ldr x0,[x21, #0x8]
00a19c08	bl 0x00c322f0
00a19c0c	mov w8,#0x2711
00a19c10	cmp w0,w8
00a19c14	b.lt 0x00a19c24
00a19c18	ldr w8,[x20]
00a19c1c	orr w8,w8,#0x100
00a19c20	str w8,[x20]
00a19c24	mov w20,#0x1
00a19c28	b 0x00a19c30
00a19c2c	mov w20,wzr
00a19c30	mov x0,x19
00a19c34	bl 0x00c38a20
00a19c38	mov x0,x19
00a19c3c	bl 0x00c38a30
00a19c40	mov w0,w20
00a19c44	ldp x29,x30,[sp, #0x20]
00a19c48	ldp x20,x19,[sp, #0x10]
00a19c4c	ldp x22,x21,[sp], #0x30
00a19c50	ret
