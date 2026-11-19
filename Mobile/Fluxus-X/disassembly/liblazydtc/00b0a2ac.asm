; X509_LOOKUP_shutdown @ 00b0a2ac
00b0a2ac	ldr x8,[x0, #0x8]
00b0a2b0	cbz x8,0x00b0a2c0
00b0a2b4	ldr x1,[x8, #0x20]
00b0a2b8	cbz x1,0x00b0a2c8
00b0a2bc	br x1
00b0a2c0	mov w0,wzr
00b0a2c4	ret
00b0a2c8	mov w0,#0x1
00b0a2cc	ret
