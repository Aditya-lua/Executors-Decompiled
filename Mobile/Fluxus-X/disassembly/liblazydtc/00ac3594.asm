; PKCS7_SIGNER_INFO_get0_algs @ 00ac3594
00ac3594	cbz x1,0x00ac35a0
00ac3598	ldr x8,[x0, #0x38]
00ac359c	str x8,[x1]
00ac35a0	cbz x2,0x00ac35ac
00ac35a4	ldr x8,[x0, #0x10]
00ac35a8	str x8,[x2]
00ac35ac	cbz x3,0x00ac35b8
00ac35b0	ldr x8,[x0, #0x20]
00ac35b4	str x8,[x3]
00ac35b8	ret
