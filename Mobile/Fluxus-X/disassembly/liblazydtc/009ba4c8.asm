; SSL_CONF_CTX_set_ssl_ctx @ 009ba4c8
009ba4c8	stp x1,xzr,[x0, #0x18]
009ba4cc	cbz x1,0x009ba4ec
009ba4d0	ldr x11,[x1, #0x158]
009ba4d4	add x8,x1,#0x138
009ba4d8	add x9,x1,#0x144
009ba4dc	add x10,x1,#0x148
009ba4e0	add x11,x11,#0x1c
009ba4e4	add x12,x1,#0x178
009ba4e8	b 0x009ba500
009ba4ec	mov x8,xzr
009ba4f0	mov x9,xzr
009ba4f4	mov x10,xzr
009ba4f8	mov x11,xzr
009ba4fc	mov x12,xzr
009ba500	str x8,[x0, #0x28]
009ba504	stp x9,x10,[x0, #0x88]
009ba508	stp x11,x12,[x0, #0x78]
009ba50c	ret
