; ssl_get_server_cert_serverinfo @ 009b6a8c
009b6a8c	ldr x8,[x0, #0x388]
009b6a90	str xzr,[x2]
009b6a94	cbz x8,0x009b6ab4
009b6a98	ldr x9,[x8, #0x18]
009b6a9c	cbz x9,0x009b6abc
009b6aa0	str x9,[x1]
009b6aa4	ldr x8,[x8, #0x20]
009b6aa8	mov w0,#0x1
009b6aac	str x8,[x2]
009b6ab0	ret
009b6ab4	mov w0,wzr
009b6ab8	ret
009b6abc	mov w0,wzr
009b6ac0	ret
