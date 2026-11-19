; SSL_client_hello_get0_compression_methods @ 009b88cc
009b88cc	ldr x8,[x0, #0xb58]
009b88d0	cbz x8,0x009b88ec
009b88d4	cbz x1,0x009b88e4
009b88d8	add x8,x8,#0x170
009b88dc	str x8,[x1]
009b88e0	ldr x8,[x0, #0xb58]
009b88e4	ldr x0,[x8, #0x168]
009b88e8	ret
009b88ec	mov x0,xzr
009b88f0	ret
