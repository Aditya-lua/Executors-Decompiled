; PEM_write_RSAPrivateKey @ 00ab4af8
00ab4af8	sub sp,sp,#0x20
00ab4afc	stp x29,x30,[sp, #0x10]
00ab4b00	mov w8,w4
00ab4b04	mov x4,x2
00ab4b08	mov x2,x0
00ab4b0c	adrp x0,0xcb5000
00ab4b10	ldr x0,[x0, #0x728]
00ab4b14	mov x7,x5
00ab4b18	mov x5,x3
00ab4b1c	mov x3,x1
00ab4b20	adrp x1,0x2b4000
00ab4b24	add x1,x1,#0x80d
00ab4b28	str x6,[sp]
00ab4b2c	mov w6,w8
00ab4b30	add x29,sp,#0x10
00ab4b34	bl 0x00c36060
00ab4b38	ldp x29,x30,[sp, #0x10]
00ab4b3c	add sp,sp,#0x20
00ab4b40	ret
