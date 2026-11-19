; SSL_get_peer_cert_chain @ 009b40e4
009b40e4	cbz x0,0x009b40f4
009b40e8	ldr x8,[x0, #0x918]
009b40ec	cbz x8,0x009b40f8
009b40f0	ldr x0,[x8, #0x2c0]
009b40f4	ret
009b40f8	mov x0,xzr
009b40fc	ret
