; ossl_sm3_update @ 00ae2b48
00ae2b48	str x23,[sp, #-0x40]!
00ae2b4c	stp x22,x21,[sp, #0x10]
00ae2b50	stp x20,x19,[sp, #0x20]
00ae2b54	stp x29,x30,[sp, #0x30]
00ae2b58	add x29,sp,#0x30
00ae2b5c	cbz x2,0x00ae2c3c
00ae2b60	ldp w8,w9,[x0, #0x20]
00ae2b64	mov x19,x2
00ae2b68	mov x21,x1
00ae2b6c	mov x20,x0
00ae2b70	adds w8,w8,w19, LSL #0x3
00ae2b74	b.cc 0x00ae2b80
00ae2b78	add w9,w9,#0x1
00ae2b7c	str w9,[x20, #0x24]
00ae2b80	ldr w10,[x20, #0x68]
00ae2b84	lsr x11,x19,#0x1d
00ae2b88	add w9,w9,w11
00ae2b8c	stp w8,w9,[x20, #0x20]
00ae2b90	cbz w10,0x00ae2be8
00ae2b94	add x8,x10,x19
00ae2b98	add x22,x20,#0x28
00ae2b9c	orr x8,x8,x19
00ae2ba0	cmp x8,#0x40
00ae2ba4	add x0,x22,x10
00ae2ba8	b.cc 0x00ae2c24
00ae2bac	mov w8,#0x40
00ae2bb0	sub x23,x8,x10
00ae2bb4	mov x1,x21
00ae2bb8	mov x2,x23
00ae2bbc	bl 0x00c2ffd0
00ae2bc0	mov w2,#0x1
00ae2bc4	mov x0,x20
00ae2bc8	mov x1,x22
00ae2bcc	bl 0x00ae2c54
00ae2bd0	mov w2,#0x44
00ae2bd4	mov x0,x22
00ae2bd8	mov w1,wzr
00ae2bdc	add x21,x21,x23
00ae2be0	sub x19,x19,x23
00ae2be4	bl 0x00c301c0
00ae2be8	lsr x2,x19,#0x6
00ae2bec	cbz x2,0x00ae2c08
00ae2bf0	mov x0,x20
00ae2bf4	mov x1,x21
00ae2bf8	bl 0x00ae2c54
00ae2bfc	and x8,x19,#-0x40
00ae2c00	add x21,x21,x8
00ae2c04	sub x19,x19,x8
00ae2c08	cbz x19,0x00ae2c3c
00ae2c0c	add x0,x20,#0x28
00ae2c10	mov x1,x21
00ae2c14	mov x2,x19
00ae2c18	str w19,[x20, #0x68]
00ae2c1c	bl 0x00c2ffd0
00ae2c20	b 0x00ae2c3c
00ae2c24	mov x1,x21
00ae2c28	mov x2,x19
00ae2c2c	bl 0x00c2ffd0
00ae2c30	ldr w8,[x20, #0x68]
00ae2c34	add w8,w8,w19
00ae2c38	str w8,[x20, #0x68]
00ae2c3c	ldp x29,x30,[sp, #0x30]
00ae2c40	ldp x20,x19,[sp, #0x20]
00ae2c44	ldp x22,x21,[sp, #0x10]
00ae2c48	mov w0,#0x1
00ae2c4c	ldr x23,[sp], #0x40
00ae2c50	ret
