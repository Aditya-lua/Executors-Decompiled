; OCSP_resp_get0 @ 00aafdb8
00aafdb8	cbz x0,0x00aafdd0
00aafdbc	stp x29,x30,[sp, #-0x10]!
00aafdc0	ldr x0,[x0, #0x20]
00aafdc4	mov x29,sp
00aafdc8	bl 0x00c32610
00aafdcc	ldp x29,x30,[sp], #0x10
00aafdd0	ret
