; SSL_CTX_has_client_custom_ext @ 009d6480
009d6480	ldr x8,[x0, #0x158]
009d6484	ldr x9,[x8, #0x1e0]
009d6488	cbz x9,0x009d64c0
009d648c	ldr x8,[x8, #0x1d8]
009d6490	mov x10,xzr
009d6494	ldrh w11,[x8]
009d6498	cmp w11,w1
009d649c	b.ne 0x009d64b0
009d64a0	ldr w11,[x8, #0x4]
009d64a4	orr w11,w11,#0x2
009d64a8	cmp w11,#0x2
009d64ac	b.eq 0x009d64c4
009d64b0	add x10,x10,#0x1
009d64b4	cmp x10,x9
009d64b8	add x8,x8,#0x38
009d64bc	b.cc 0x009d6494
009d64c0	mov x8,xzr
009d64c4	cmp x8,#0x0
009d64c8	cset w0,ne
009d64cc	ret
