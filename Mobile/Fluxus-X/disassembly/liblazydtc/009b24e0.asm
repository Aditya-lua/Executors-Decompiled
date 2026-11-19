; SSL_is_dtls @ 009b24e0
009b24e0	ldr x8,[x0, #0x8]
009b24e4	ldr x8,[x8, #0xc0]
009b24e8	ldr w8,[x8, #0x60]
009b24ec	ubfx w0,w8,#0x3,#0x1
009b24f0	ret
