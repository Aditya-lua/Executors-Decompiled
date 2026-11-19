; X509_LOOKUP_init @ 00b0a288
00b0a288	ldr x8,[x0, #0x8]
00b0a28c	cbz x8,0x00b0a29c
00b0a290	ldr x1,[x8, #0x18]
00b0a294	cbz x1,0x00b0a2a4
00b0a298	br x1
00b0a29c	mov w0,wzr
00b0a2a0	ret
00b0a2a4	mov w0,#0x1
00b0a2a8	ret
