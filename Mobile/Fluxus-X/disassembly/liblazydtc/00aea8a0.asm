; OSSL_STORE_INFO_get0_CERT @ 00aea8a0
00aea8a0	ldr w8,[x0]
00aea8a4	cmp w8,#0x5
00aea8a8	mov x8,xzr
00aea8ac	b.ne 0x00aea8b4
00aea8b0	ldr x8,[x0, #0x8]
00aea8b4	mov x0,x8
00aea8b8	ret
