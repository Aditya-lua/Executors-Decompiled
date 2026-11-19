; SSL_set_tlsext_max_fragment_length @ 009c5de8
009c5de8	and w8,w1,#0xff
009c5dec	cmp w8,#0x5
009c5df0	b.cs 0x009c5e00
009c5df4	strb w1,[x0, #0xb4c]
009c5df8	mov w0,#0x1
009c5dfc	ret
009c5e00	stp x29,x30,[sp, #-0x10]!
009c5e04	mov x29,sp
009c5e08	bl 0x00c342a0
009c5e0c	adrp x0,0x2c3000
009c5e10	adrp x2,0x2b5000
009c5e14	add x0,x0,#0x5d8
009c5e18	add x2,x2,#0x92d
009c5e1c	mov w1,#0xd42
009c5e20	bl 0x00c342b0
009c5e24	mov w0,#0x14
009c5e28	mov w1,#0xe8
009c5e2c	mov x2,xzr
009c5e30	bl 0x00c342c0
009c5e34	mov w0,wzr
009c5e38	ldp x29,x30,[sp], #0x10
009c5e3c	ret
