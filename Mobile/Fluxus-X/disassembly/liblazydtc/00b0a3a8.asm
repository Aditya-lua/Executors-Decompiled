; X509_LOOKUP_by_issuer_serial @ 00b0a3a8
00b0a3a8	ldr x8,[x0, #0x8]
00b0a3ac	cbz x8,0x00b0a3bc
00b0a3b0	ldr x5,[x8, #0x38]
00b0a3b4	cbz x5,0x00b0a3bc
00b0a3b8	br x5
00b0a3bc	mov w0,wzr
00b0a3c0	ret
