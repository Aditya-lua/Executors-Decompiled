; PEM_write_bio_X509_REQ_NEW @ 00ab45d4
00ab45d4	sub sp,sp,#0x20
00ab45d8	stp x29,x30,[sp, #0x10]
00ab45dc	mov x2,x0
00ab45e0	adrp x0,0xcb5000
00ab45e4	ldr x0,[x0, #0x748]
00ab45e8	mov x3,x1
00ab45ec	adrp x1,0x2d6000
00ab45f0	add x1,x1,#0x403
00ab45f4	mov x4,xzr
00ab45f8	mov x5,xzr
00ab45fc	mov w6,wzr
00ab4600	mov x7,xzr
00ab4604	add x29,sp,#0x10
00ab4608	str xzr,[sp]
00ab460c	bl 0x00c36070
00ab4610	ldp x29,x30,[sp, #0x10]
00ab4614	add sp,sp,#0x20
00ab4618	ret
