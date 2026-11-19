; X509_get0_uids @ 00b0c8b4
00b0c8b4	cbz x1,0x00b0c8c0
00b0c8b8	ldr x8,[x0, #0x58]
00b0c8bc	str x8,[x1]
00b0c8c0	cbz x2,0x00b0c8cc
00b0c8c4	ldr x8,[x0, #0x60]
00b0c8c8	str x8,[x2]
00b0c8cc	ret
