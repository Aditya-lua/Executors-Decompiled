; PEM_write_bio_X509_AUX @ 00aba080
00aba080	sub sp,sp,#0x20
00aba084	stp x29,x30,[sp, #0x10]
00aba088	mov x2,x0
00aba08c	adrp x0,0xcb5000
00aba090	ldr x0,[x0, #0x758]
00aba094	mov x3,x1
00aba098	adrp x1,0x2c6000
00aba09c	add x1,x1,#0xbc
00aba0a0	mov x4,xzr
00aba0a4	mov x5,xzr
00aba0a8	mov w6,wzr
00aba0ac	mov x7,xzr
00aba0b0	add x29,sp,#0x10
00aba0b4	str xzr,[sp]
00aba0b8	bl 0x00c36070
00aba0bc	ldp x29,x30,[sp, #0x10]
00aba0c0	add sp,sp,#0x20
00aba0c4	ret
