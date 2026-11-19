; SSL_get_psk_identity @ 009b7cbc
009b7cbc	cbz x0,0x009b7ccc
009b7cc0	ldr x8,[x0, #0x918]
009b7cc4	cbz x8,0x009b7cd0
009b7cc8	ldr x0,[x8, #0x2a8]
009b7ccc	ret
009b7cd0	mov x0,xzr
009b7cd4	ret
