; OCSP_resp_count @ 00aafda4
00aafda4	cbz x0,0x00aafdb0
00aafda8	ldr x0,[x0, #0x20]
00aafdac	b 0x00c325e0
00aafdb0	mov w0,#0xffffffff
00aafdb4	ret
