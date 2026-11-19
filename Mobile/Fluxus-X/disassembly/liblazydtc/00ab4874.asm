; PEM_write_bio_PKCS7 @ 00ab4874
00ab4874	sub sp,sp,#0x20
00ab4878	stp x29,x30,[sp, #0x10]
00ab487c	mov x2,x0
00ab4880	adrp x0,0xcb5000
00ab4884	ldr x0,[x0, #0x720]
00ab4888	mov x3,x1
00ab488c	adrp x1,0x2ba000
00ab4890	add x1,x1,#0x5f6
00ab4894	mov x4,xzr
00ab4898	mov x5,xzr
00ab489c	mov w6,wzr
00ab48a0	mov x7,xzr
00ab48a4	add x29,sp,#0x10
00ab48a8	str xzr,[sp]
00ab48ac	bl 0x00c36070
00ab48b0	ldp x29,x30,[sp, #0x10]
00ab48b4	add sp,sp,#0x20
00ab48b8	ret
