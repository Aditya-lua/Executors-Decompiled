; OSSL_STORE_INFO_get0_data @ 00aea584
00aea584	ldr w8,[x1]
00aea588	cmp w8,w0
00aea58c	mov x0,xzr
00aea590	b.ne 0x00aea598
00aea594	ldr x0,[x1, #0x8]
00aea598	ret
