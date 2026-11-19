; SSL_CONF_CTX_set_ssl @ 009ba480
009ba480	stp xzr,x1,[x0, #0x18]
009ba484	cbz x1,0x009ba4a4
009ba488	ldr x11,[x1, #0x898]
009ba48c	add x8,x1,#0x9e8
009ba490	add x9,x1,#0x9f4
009ba494	add x10,x1,#0x9f8
009ba498	add x11,x11,#0x1c
009ba49c	add x12,x1,#0x968
009ba4a0	b 0x009ba4b8
009ba4a4	mov x8,xzr
009ba4a8	mov x9,xzr
009ba4ac	mov x10,xzr
009ba4b0	mov x11,xzr
009ba4b4	mov x12,xzr
009ba4b8	str x8,[x0, #0x28]
009ba4bc	stp x9,x10,[x0, #0x88]
009ba4c0	stp x11,x12,[x0, #0x78]
009ba4c4	ret
