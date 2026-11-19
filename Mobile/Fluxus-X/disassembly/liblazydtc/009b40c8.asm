; SSL_get0_peer_certificate @ 009b40c8
009b40c8	cbz x0,0x009b40d8
009b40cc	ldr x8,[x0, #0x918]
009b40d0	cbz x8,0x009b40dc
009b40d4	ldr x0,[x8, #0x2b8]
009b40d8	ret
009b40dc	mov x0,xzr
009b40e0	ret
