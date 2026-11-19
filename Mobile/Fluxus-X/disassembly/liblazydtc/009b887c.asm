; SSL_client_hello_get0_session_id @ 009b887c
009b887c	ldr x8,[x0, #0xb58]
009b8880	cbz x8,0x009b889c
009b8884	cbz x1,0x009b8894
009b8888	add x8,x8,#0x30
009b888c	str x8,[x1]
009b8890	ldr x8,[x0, #0xb58]
009b8894	ldr x0,[x8, #0x28]
009b8898	ret
009b889c	mov x0,xzr
009b88a0	ret
