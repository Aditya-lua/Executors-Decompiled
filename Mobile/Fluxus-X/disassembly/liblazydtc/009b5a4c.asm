; ssl_get_ciphers_by_id @ 009b5a4c
009b5a4c	cbz x0,0x009b5a70
009b5a50	mov x8,x0
009b5a54	ldr x0,[x0, #0x530]
009b5a58	cbnz x0,0x009b5a6c
009b5a5c	ldr x8,[x8, #0x9a8]
009b5a60	cbz x8,0x009b5a70
009b5a64	ldr x0,[x8, #0x18]
009b5a68	cbz x0,0x009b5a70
009b5a6c	ret
009b5a70	mov x0,xzr
009b5a74	ret
