; X509_CRL_verify @ 00b1b33c
00b1b33c	ldr x8,[x0, #0xd0]
00b1b340	ldr x2,[x8, #0x20]
00b1b344	cbz x2,0x00b1b34c
00b1b348	br x2
00b1b34c	mov w0,wzr
00b1b350	ret
