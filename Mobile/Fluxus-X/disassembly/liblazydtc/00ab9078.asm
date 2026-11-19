; PEM_write_bio_PKCS8PrivateKey @ 00ab9078
00ab9078	sub sp,sp,#0x20
00ab907c	mov w8,w4
00ab9080	mov x7,x5
00ab9084	mov x5,x3
00ab9088	mov x4,x2
00ab908c	mov w3,#0xffffffff
00ab9090	str x6,[sp]
00ab9094	mov w2,wzr
00ab9098	mov w6,w8
00ab909c	stp x29,x30,[sp, #0x10]
00ab90a0	add x29,sp,#0x10
00ab90a4	bl 0x00ab8d5c
00ab90a8	ldp x29,x30,[sp, #0x10]
00ab90ac	add sp,sp,#0x20
00ab90b0	ret
