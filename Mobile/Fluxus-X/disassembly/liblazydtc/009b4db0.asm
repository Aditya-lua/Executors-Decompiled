; SSL_sendfile @ 009b4db0
009b4db0	stp x29,x30,[sp, #-0x10]!
009b4db4	ldr x8,[x0, #0x30]
009b4db8	mov x29,sp
009b4dbc	cbz x8,0x009b4de4
009b4dc0	ldrb w8,[x0, #0x44]
009b4dc4	tbnz w8,#0x0,0x009b4e0c
009b4dc8	bl 0x00c342a0
009b4dcc	adrp x0,0x2c5000
009b4dd0	adrp x2,0x2a7000
009b4dd4	add x0,x0,#0x652
009b4dd8	add x2,x2,#0xac5
009b4ddc	mov w1,#0x834
009b4de0	b 0x009b4dfc
009b4de4	bl 0x00c342a0
009b4de8	adrp x0,0x2c5000
009b4dec	adrp x2,0x2a7000
009b4df0	add x0,x0,#0x652
009b4df4	add x2,x2,#0xac5
009b4df8	mov w1,#0x829
009b4dfc	bl 0x00c342b0
009b4e00	mov w0,#0x14
009b4e04	mov w1,#0x114
009b4e08	b 0x009b4e38
009b4e0c	mov w8,#0x1
009b4e10	str w8,[x0, #0x28]
009b4e14	bl 0x00c342a0
009b4e18	adrp x0,0x2c5000
009b4e1c	adrp x2,0x2a7000
009b4e20	add x0,x0,#0x652
009b4e24	add x2,x2,#0xac5
009b4e28	mov w1,#0x82f
009b4e2c	bl 0x00c342b0
009b4e30	mov w0,#0x14
009b4e34	mov w1,#0xcf
009b4e38	mov x2,xzr
009b4e3c	bl 0x00c342c0
009b4e40	mov x0,#-0x1
009b4e44	ldp x29,x30,[sp], #0x10
009b4e48	ret
