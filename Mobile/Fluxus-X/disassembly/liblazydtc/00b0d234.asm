; X509_verify_cert_error_string @ 00b0d234
00b0d234	cmp w0,#0x5e
00b0d238	b.hi 0x00b0d250
00b0d23c	adrp x9,0xc81000
00b0d240	sbfiz x8,x0,#0x3,#0x20
00b0d244	add x9,x9,#0x910
00b0d248	ldr x0,[x9, x8#0x0]
00b0d24c	ret
00b0d250	adrp x0,0x2a2000
00b0d254	add x0,x0,#0xe83
00b0d258	ret
