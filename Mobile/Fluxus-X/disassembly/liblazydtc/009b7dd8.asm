; SSL_set_block_padding @ 009b7dd8
009b7dd8	cmp x1,#0x1
009b7ddc	mov x9,xzr
009b7de0	b.eq 0x009b7df4
009b7de4	mov w8,wzr
009b7de8	cmp x1,#0x4, LSL #12
009b7dec	mov x9,x1
009b7df0	b.hi 0x009b7dfc
009b7df4	mov w8,#0x1
009b7df8	str x9,[x0, #0x1d60]
009b7dfc	mov w0,w8
009b7e00	ret
