; SSL_CTX_set_block_padding @ 009b7d68
009b7d68	cmp x1,#0x1
009b7d6c	mov x9,xzr
009b7d70	b.eq 0x009b7d84
009b7d74	mov w8,wzr
009b7d78	cmp x1,#0x4, LSL #12
009b7d7c	mov x9,x1
009b7d80	b.hi 0x009b7d8c
009b7d84	mov w8,#0x1
009b7d88	str x9,[x0, #0x3f0]
009b7d8c	mov w0,w8
009b7d90	ret
