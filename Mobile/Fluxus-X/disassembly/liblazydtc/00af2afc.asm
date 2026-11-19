; X509_print_ex_fp @ 00af2afc
00af2afc	str x23,[sp, #-0x40]!
00af2b00	stp x22,x21,[sp, #0x10]
00af2b04	stp x20,x19,[sp, #0x20]
00af2b08	stp x29,x30,[sp, #0x30]
00af2b0c	add x29,sp,#0x30
00af2b10	mov x19,x3
00af2b14	mov x20,x2
00af2b18	mov x21,x1
00af2b1c	mov x23,x0
00af2b20	bl 0x00c32270
00af2b24	bl 0x00c32240
00af2b28	cbz x0,0x00af2b68
00af2b2c	mov w1,#0x6a
00af2b30	mov x2,xzr
00af2b34	mov x3,x23
00af2b38	mov x22,x0
00af2b3c	bl 0x00c321a0
00af2b40	mov x0,x22
00af2b44	mov x1,x21
00af2b48	mov x2,x20
00af2b4c	mov x3,x19
00af2b50	bl 0x00af2bb0
00af2b54	mov w19,w0
00af2b58	mov x0,x22
00af2b5c	bl 0x00c31a40
00af2b60	mov w0,w19
00af2b64	b 0x00af2b9c
00af2b68	bl 0x00c342a0
00af2b6c	adrp x0,0x2d6000
00af2b70	adrp x2,0x2d8000
00af2b74	add x0,x0,#0x609
00af2b78	add x2,x2,#0x7ea
00af2b7c	mov w1,#0x21
00af2b80	bl 0x00c342b0
00af2b84	mov w1,#0x7
00af2b88	mov w0,#0xb
00af2b8c	movk w1,#0x8, LSL #16
00af2b90	mov x2,xzr
00af2b94	bl 0x00c342c0
00af2b98	mov w0,wzr
00af2b9c	ldp x29,x30,[sp, #0x30]
00af2ba0	ldp x20,x19,[sp, #0x20]
00af2ba4	ldp x22,x21,[sp, #0x10]
00af2ba8	ldr x23,[sp], #0x40
00af2bac	ret
