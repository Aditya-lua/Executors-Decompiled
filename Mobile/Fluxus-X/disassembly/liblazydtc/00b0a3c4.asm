; X509_LOOKUP_by_fingerprint @ 00b0a3c4
00b0a3c4	ldr x8,[x0, #0x8]
00b0a3c8	cbz x8,0x00b0a3d8
00b0a3cc	ldr x5,[x8, #0x40]
00b0a3d0	cbz x5,0x00b0a3d8
00b0a3d4	br x5
00b0a3d8	mov w0,wzr
00b0a3dc	ret
