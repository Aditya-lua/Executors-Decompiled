; X509V3_set_issuer_pkey @ 00af4af0
00af4af0	stp x29,x30,[sp, #-0x10]!
00af4af4	mov x29,sp
00af4af8	cbz x0,0x00af4b34
00af4afc	cbz x1,0x00af4b70
00af4b00	ldr x8,[x0, #0x10]
00af4b04	cbnz x8,0x00af4b70
00af4b08	bl 0x00c342a0
00af4b0c	adrp x0,0x2aa000
00af4b10	adrp x2,0x2aa000
00af4b14	add x0,x0,#0x9f7
00af4b18	add x2,x2,#0xa1f
00af4b1c	mov w1,#0x1d7
00af4b20	bl 0x00c342b0
00af4b24	mov w1,#0x106
00af4b28	mov w0,#0x22
00af4b2c	movk w1,#0x8, LSL #16
00af4b30	b 0x00af4b5c
00af4b34	bl 0x00c342a0
00af4b38	adrp x0,0x2aa000
00af4b3c	adrp x2,0x2aa000
00af4b40	add x0,x0,#0x9f7
00af4b44	add x2,x2,#0xa1f
00af4b48	mov w1,#0x1d3
00af4b4c	bl 0x00c342b0
00af4b50	mov w1,#0x102
00af4b54	mov w0,#0x22
00af4b58	movk w1,#0xc, LSL #16
00af4b5c	mov x2,xzr
00af4b60	bl 0x00c342c0
00af4b64	mov w0,wzr
00af4b68	ldp x29,x30,[sp], #0x10
00af4b6c	ret
00af4b70	str x1,[x0, #0x38]
00af4b74	mov w0,#0x1
00af4b78	ldp x29,x30,[sp], #0x10
00af4b7c	ret
