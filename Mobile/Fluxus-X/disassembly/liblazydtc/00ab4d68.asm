; PEM_write_bio_DSAPrivateKey @ 00ab4d68
00ab4d68	sub sp,sp,#0x20
00ab4d6c	stp x29,x30,[sp, #0x10]
00ab4d70	mov w8,w4
00ab4d74	mov x4,x2
00ab4d78	mov x2,x0
00ab4d7c	adrp x0,0xcb5000
00ab4d80	ldr x0,[x0, #0x500]
00ab4d84	mov x7,x5
00ab4d88	mov x5,x3
00ab4d8c	mov x3,x1
00ab4d90	adrp x1,0x2ba000
00ab4d94	add x1,x1,#0x5fc
00ab4d98	str x6,[sp]
00ab4d9c	mov w6,w8
00ab4da0	add x29,sp,#0x10
00ab4da4	bl 0x00c36070
00ab4da8	ldp x29,x30,[sp, #0x10]
00ab4dac	add sp,sp,#0x20
00ab4db0	ret
