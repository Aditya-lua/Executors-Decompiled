; SSL_client_hello_get0_random @ 009b8858
009b8858	ldr x8,[x0, #0xb58]
009b885c	cbz x8,0x009b8874
009b8860	cbz x1,0x009b886c
009b8864	add x8,x8,#0x8
009b8868	str x8,[x1]
009b886c	mov w0,#0x20
009b8870	ret
009b8874	mov x0,xzr
009b8878	ret
