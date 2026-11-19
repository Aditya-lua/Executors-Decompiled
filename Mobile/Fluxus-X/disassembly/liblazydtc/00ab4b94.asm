; PEM_write_bio_RSAPublicKey @ 00ab4b94
00ab4b94	sub sp,sp,#0x20
00ab4b98	stp x29,x30,[sp, #0x10]
00ab4b9c	mov x2,x0
00ab4ba0	adrp x0,0xcb5000
00ab4ba4	ldr x0,[x0, #0x730]
00ab4ba8	mov x3,x1
00ab4bac	adrp x1,0x2d2000
00ab4bb0	add x1,x1,#0x1f2
00ab4bb4	mov x4,xzr
00ab4bb8	mov x5,xzr
00ab4bbc	mov w6,wzr
00ab4bc0	mov x7,xzr
00ab4bc4	add x29,sp,#0x10
00ab4bc8	str xzr,[sp]
00ab4bcc	bl 0x00c36070
00ab4bd0	ldp x29,x30,[sp, #0x10]
00ab4bd4	add sp,sp,#0x20
00ab4bd8	ret
