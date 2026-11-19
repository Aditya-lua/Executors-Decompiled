; SSL_client_hello_isv2 @ 009b8828
009b8828	ldr x8,[x0, #0xb58]
009b882c	cbz x8,0x009b8838
009b8830	ldr w0,[x8]
009b8834	ret
009b8838	mov w0,wzr
009b883c	ret
