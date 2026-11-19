; ASN1_i2d_fp @ 00ab9b64
00ab9b64	stp x22,x21,[sp, #-0x30]!
00ab9b68	stp x20,x19,[sp, #0x10]
00ab9b6c	stp x29,x30,[sp, #0x20]
00ab9b70	add x29,sp,#0x20
00ab9b74	mov x19,x2
00ab9b78	mov x22,x1
00ab9b7c	mov x20,x0
00ab9b80	bl 0x00c32270
00ab9b84	bl 0x00c32240
00ab9b88	cbz x0,0x00ab9bc4
00ab9b8c	mov w1,#0x6a
00ab9b90	mov x2,xzr
00ab9b94	mov x3,x22
00ab9b98	mov x21,x0
00ab9b9c	bl 0x00c321a0
00ab9ba0	mov x0,x20
00ab9ba4	mov x1,x21
00ab9ba8	mov x2,x19
00ab9bac	bl 0x00ab9c08
00ab9bb0	mov w19,w0
00ab9bb4	mov x0,x21
00ab9bb8	bl 0x00c31a40
00ab9bbc	mov w0,w19
00ab9bc0	b 0x00ab9bf8
00ab9bc4	bl 0x00c342a0
00ab9bc8	adrp x0,0x2d0000
00ab9bcc	adrp x2,0x2cb000
00ab9bd0	add x0,x0,#0x263
00ab9bd4	add x2,x2,#0xfa2
00ab9bd8	orr w1,wzr,#0x18
00ab9bdc	bl 0x00c342b0
00ab9be0	mov w1,#0x7
00ab9be4	mov w0,#0xd
00ab9be8	movk w1,#0x8, LSL #16
00ab9bec	mov x2,xzr
00ab9bf0	bl 0x00c342c0
00ab9bf4	mov w0,wzr
00ab9bf8	ldp x29,x30,[sp, #0x20]
00ab9bfc	ldp x20,x19,[sp, #0x10]
00ab9c00	ldp x22,x21,[sp], #0x30
00ab9c04	ret
