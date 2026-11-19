; ossl_x509_signing_allowed @ 00b02fb8
00b02fb8	ldrb w9,[x1, #0xe9]
00b02fbc	ldr w8,[x0, #0xe8]
00b02fc0	tbnz w9,#0x2,0x00b02fd8
00b02fc4	tbz w8,#0x1,0x00b02fec
00b02fc8	ldrb w8,[x0, #0xec]
00b02fcc	tbnz w8,#0x2,0x00b02fec
00b02fd0	mov w0,#0x20
00b02fd4	ret
00b02fd8	tbz w8,#0x1,0x00b02fec
00b02fdc	ldrb w8,[x0, #0xec]
00b02fe0	tbnz w8,#0x7,0x00b02fec
00b02fe4	mov w0,#0x27
00b02fe8	ret
00b02fec	mov w0,wzr
00b02ff0	ret
