; SSL_renegotiate_pending @ 009b5404
009b5404	ldr w8,[x0, #0xba0]
009b5408	cmp w8,#0x0
009b540c	cset w0,ne
009b5410	ret
