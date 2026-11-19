; OSSL_STORE_error @ 00aea150
00aea150	ldr x8,[x0, #0x8]
00aea154	cbz x8,0x00aea160
00aea158	ldr w0,[x0, #0x3c]
00aea15c	ret
00aea160	ldr x8,[x0]
00aea164	ldr x0,[x0, #0x10]
00aea168	ldr x1,[x8, #0x48]
00aea16c	br x1
