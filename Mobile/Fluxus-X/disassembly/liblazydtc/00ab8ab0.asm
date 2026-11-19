; PEM_read_PrivateKey_ex @ 00ab8ab0
00ab8ab0	str x25,[sp, #-0x50]!
00ab8ab4	stp x24,x23,[sp, #0x10]
00ab8ab8	stp x22,x21,[sp, #0x20]
00ab8abc	stp x20,x19,[sp, #0x30]
00ab8ac0	stp x29,x30,[sp, #0x40]
00ab8ac4	add x29,sp,#0x40
00ab8ac8	mov x19,x5
00ab8acc	mov x20,x4
00ab8ad0	mov x21,x3
00ab8ad4	mov x22,x2
00ab8ad8	mov x23,x1
00ab8adc	mov x25,x0
00ab8ae0	bl 0x00c32270
00ab8ae4	bl 0x00c32240
00ab8ae8	cbz x0,0x00ab8b34
00ab8aec	mov w1,#0x6a
00ab8af0	mov x2,xzr
00ab8af4	mov x3,x25
00ab8af8	mov x24,x0
00ab8afc	bl 0x00c321a0
00ab8b00	mov w6,#0x87
00ab8b04	mov x0,x24
00ab8b08	mov x1,x23
00ab8b0c	mov x2,x22
00ab8b10	mov x3,x21
00ab8b14	mov x4,x20
00ab8b18	mov x5,x19
00ab8b1c	bl 0x00ab7f64
00ab8b20	mov x19,x0
00ab8b24	mov x0,x24
00ab8b28	bl 0x00c31a40
00ab8b2c	mov x0,x19
00ab8b30	b 0x00ab8b68
00ab8b34	bl 0x00c342a0
00ab8b38	adrp x0,0x2d6000
00ab8b3c	adrp x2,0x2ce000
00ab8b40	add x0,x0,#0x444
00ab8b44	add x2,x2,#0x181
00ab8b48	mov w1,#0x19f
00ab8b4c	bl 0x00c342b0
00ab8b50	mov w1,#0x7
00ab8b54	mov w0,#0x9
00ab8b58	movk w1,#0x8, LSL #16
00ab8b5c	mov x2,xzr
00ab8b60	bl 0x00c342c0
00ab8b64	mov x0,xzr
00ab8b68	ldp x29,x30,[sp, #0x40]
00ab8b6c	ldp x20,x19,[sp, #0x30]
00ab8b70	ldp x22,x21,[sp, #0x20]
00ab8b74	ldp x24,x23,[sp, #0x10]
00ab8b78	ldr x25,[sp], #0x50
00ab8b7c	ret
