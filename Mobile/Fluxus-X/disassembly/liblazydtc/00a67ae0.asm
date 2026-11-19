; EVP_DigestVerifyUpdate @ 00a67ae0
00a67ae0	stp x22,x21,[sp, #-0x30]!
00a67ae4	stp x20,x19,[sp, #0x10]
00a67ae8	stp x29,x30,[sp, #0x20]
00a67aec	ldr x22,[x0, #0x28]
00a67af0	mov x19,x2
00a67af4	mov x21,x0
00a67af8	mov x20,x1
00a67afc	add x29,sp,#0x20
00a67b00	cbz x22,0x00a67b6c
00a67b04	ldr w8,[x22]
00a67b08	cmp w8,#0x100
00a67b0c	b.ne 0x00a67b40
00a67b10	ldr x0,[x22, #0x30]
00a67b14	cbz x0,0x00a67b40
00a67b18	ldr x8,[x22, #0x28]
00a67b1c	cbz x8,0x00a67b40
00a67b20	ldr x3,[x8, #0x90]
00a67b24	cbz x3,0x00a67b88
00a67b28	mov x1,x20
00a67b2c	mov x2,x19
00a67b30	ldp x29,x30,[sp, #0x20]
00a67b34	ldp x20,x19,[sp, #0x10]
00a67b38	ldp x22,x21,[sp], #0x30
00a67b3c	br x3
00a67b40	ldrb w8,[x22, #0xa0]
00a67b44	tbz w8,#0x0,0x00a67b64
00a67b48	ldr x8,[x22, #0x78]
00a67b4c	mov x0,x22
00a67b50	mov x1,x21
00a67b54	ldr x8,[x8, #0xf8]
00a67b58	blr x8
00a67b5c	cbz w0,0x00a67bb8
00a67b60	ldrb w8,[x22, #0xa0]
00a67b64	and w8,w8,#0xfe
00a67b68	strb w8,[x22, #0xa0]
00a67b6c	mov x1,x20
00a67b70	mov x2,x19
00a67b74	ldp x29,x30,[sp, #0x20]
00a67b78	ldp x20,x19,[sp, #0x10]
00a67b7c	mov x0,x21
00a67b80	ldp x22,x21,[sp], #0x30
00a67b84	b 0x00c31f80
00a67b88	bl 0x00c342a0
00a67b8c	adrp x0,0x2c3000
00a67b90	adrp x2,0x2dc000
00a67b94	add x0,x0,#0xa2d
00a67b98	add x2,x2,#0x74
00a67b9c	orr w1,wzr,#0x1c0
00a67ba0	bl 0x00c342b0
00a67ba4	mov w1,#0x101
00a67ba8	orr w0,wzr,#0x6
00a67bac	movk w1,#0xc, LSL #16
00a67bb0	mov x2,xzr
00a67bb4	bl 0x00c342c0
00a67bb8	ldp x29,x30,[sp, #0x20]
00a67bbc	ldp x20,x19,[sp, #0x10]
00a67bc0	mov w0,wzr
00a67bc4	ldp x22,x21,[sp], #0x30
00a67bc8	ret
