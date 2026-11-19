; OSSL_STORE_INFO_get0_CRL @ 00aea924
00aea924	ldr w8,[x0]
00aea928	cmp w8,#0x6
00aea92c	mov x8,xzr
00aea930	b.ne 0x00aea938
00aea934	ldr x8,[x0, #0x8]
00aea938	mov x0,x8
00aea93c	ret
