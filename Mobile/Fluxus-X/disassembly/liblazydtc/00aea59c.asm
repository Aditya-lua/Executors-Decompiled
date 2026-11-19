; OSSL_STORE_INFO_get0_NAME @ 00aea59c
00aea59c	ldr w8,[x0]
00aea5a0	cmp w8,#0x1
00aea5a4	mov x8,xzr
00aea5a8	b.ne 0x00aea5b0
00aea5ac	ldr x8,[x0, #0x8]
00aea5b0	mov x0,x8
00aea5b4	ret
