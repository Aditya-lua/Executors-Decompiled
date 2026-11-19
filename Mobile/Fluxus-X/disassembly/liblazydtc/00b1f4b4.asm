; X509_get0_trust_objects @ 00b1f4b4
00b1f4b4	ldr x8,[x0, #0x150]
00b1f4b8	cbz x8,0x00b1f4c4
00b1f4bc	ldr x0,[x8]
00b1f4c0	ret
00b1f4c4	mov x0,xzr
00b1f4c8	ret
