; SSL_get0_alpn_selected @ 009b61a8
009b61a8	ldr x8,[x0, #0x488]
009b61ac	str x8,[x1]
009b61b0	cbz x8,0x009b61b8
009b61b4	ldr w8,[x0, #0x490]
009b61b8	str w8,[x2]
009b61bc	ret
