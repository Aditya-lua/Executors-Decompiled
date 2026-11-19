; OPENSSL_sk_set_cmp_func @ 00ae86b4
00ae86b4	mov x8,x0
00ae86b8	ldr x0,[x0, #0x18]
00ae86bc	cmp x0,x1
00ae86c0	b.eq 0x00ae86c8
00ae86c4	str wzr,[x8, #0x10]
00ae86c8	str x1,[x8, #0x18]
00ae86cc	ret
