; PEM_write_DSAPrivateKey @ 00ab4db4
00ab4db4	sub sp,sp,#0x20
00ab4db8	stp x29,x30,[sp, #0x10]
00ab4dbc	mov w8,w4
00ab4dc0	mov x4,x2
00ab4dc4	mov x2,x0
00ab4dc8	adrp x0,0xcb5000
00ab4dcc	ldr x0,[x0, #0x500]
00ab4dd0	mov x7,x5
00ab4dd4	mov x5,x3
00ab4dd8	mov x3,x1
00ab4ddc	adrp x1,0x2ba000
00ab4de0	add x1,x1,#0x5fc
00ab4de4	str x6,[sp]
00ab4de8	mov w6,w8
00ab4dec	add x29,sp,#0x10
00ab4df0	bl 0x00c36060
00ab4df4	ldp x29,x30,[sp, #0x10]
00ab4df8	add sp,sp,#0x20
00ab4dfc	ret
