; PEM_write_X509_CRL @ 00ab46fc
00ab46fc	sub sp,sp,#0x20
00ab4700	stp x29,x30,[sp, #0x10]
00ab4704	mov x2,x0
00ab4708	adrp x0,0xcb5000
00ab470c	ldr x0,[x0, #0x740]
00ab4710	mov x3,x1
00ab4714	adrp x1,0x2bc000
00ab4718	add x1,x1,#0x2e2
00ab471c	mov x4,xzr
00ab4720	mov x5,xzr
00ab4724	mov w6,wzr
00ab4728	mov x7,xzr
00ab472c	add x29,sp,#0x10
00ab4730	str xzr,[sp]
00ab4734	bl 0x00c36060
00ab4738	ldp x29,x30,[sp, #0x10]
00ab473c	add sp,sp,#0x20
00ab4740	ret
