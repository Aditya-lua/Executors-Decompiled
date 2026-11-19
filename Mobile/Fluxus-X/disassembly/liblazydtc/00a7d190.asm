; ossl_ffc_params_enable_flags @ 00a7d190
00a7d190	cbz w2,0x00a7d1a4
00a7d194	ldr w8,[x0, #0x40]
00a7d198	orr w8,w8,w1
00a7d19c	str w8,[x0, #0x40]
00a7d1a0	ret
00a7d1a4	ldr w8,[x0, #0x40]
00a7d1a8	bic w8,w8,w1
00a7d1ac	str w8,[x0, #0x40]
00a7d1b0	ret
