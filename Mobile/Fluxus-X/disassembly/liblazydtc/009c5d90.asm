; SSL_CTX_set_tlsext_max_fragment_length @ 009c5d90
009c5d90	and w8,w1,#0xff
009c5d94	cmp w8,#0x5
009c5d98	b.cs 0x009c5da8
009c5d9c	strb w1,[x0, #0x264]
009c5da0	mov w0,#0x1
009c5da4	ret
009c5da8	stp x29,x30,[sp, #-0x10]!
009c5dac	mov x29,sp
009c5db0	bl 0x00c342a0
009c5db4	adrp x0,0x2c3000
009c5db8	adrp x2,0x2a5000
009c5dbc	add x0,x0,#0x5d8
009c5dc0	add x2,x2,#0xaf3
009c5dc4	mov w1,#0xd36
009c5dc8	bl 0x00c342b0
009c5dcc	mov w0,#0x14
009c5dd0	mov w1,#0xe8
009c5dd4	mov x2,xzr
009c5dd8	bl 0x00c342c0
009c5ddc	mov w0,wzr
009c5de0	ldp x29,x30,[sp], #0x10
009c5de4	ret
