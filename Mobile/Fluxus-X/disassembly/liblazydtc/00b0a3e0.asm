; X509_LOOKUP_by_alias @ 00b0a3e0
00b0a3e0	ldr x8,[x0, #0x8]
00b0a3e4	cbz x8,0x00b0a3f4
00b0a3e8	ldr x5,[x8, #0x48]
00b0a3ec	cbz x5,0x00b0a3f4
00b0a3f0	br x5
00b0a3f4	mov w0,wzr
00b0a3f8	ret
