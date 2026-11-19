; ossl_dh_is_named_safe_prime_group @ 00a1e32c
00a1e32c	cbz x0,0x00a1e33c
00a1e330	ldr w8,[x0, #0x3c]
00a1e334	cmp w8,#0x3
00a1e338	cset w0,gt
00a1e33c	ret
