; tls_parse_ctos_ec_pt_formats @ 009d6d74
009d6d74	stp x22,x21,[sp, #-0x30]!
009d6d78	stp x20,x19,[sp, #0x10]
009d6d7c	stp x29,x30,[sp, #0x20]
009d6d80	ldr x8,[x1, #0x8]
009d6d84	mov x19,x0
009d6d88	add x29,sp,#0x20
009d6d8c	cbz x8,0x009d6dc4
009d6d90	ldr x10,[x1]
009d6d94	sub x20,x8,#0x1
009d6d98	mov x21,x10
009d6d9c	ldrb w9,[x21], #0x1
009d6da0	cmp x20,x9
009d6da4	b.ne 0x009d6dc4
009d6da8	add x8,x10,x8
009d6dac	stp x8,xzr,[x1]
009d6db0	cbz w9,0x009d6dc4
009d6db4	ldr w8,[x19, #0x4d0]
009d6db8	cbz w8,0x009d6e08
009d6dbc	mov w0,#0x1
009d6dc0	b 0x009d6df8
009d6dc4	bl 0x00c342a0
009d6dc8	adrp x0,0x2d7000
009d6dcc	adrp x2,0x2d7000
009d6dd0	add x0,x0,#0xae0
009d6dd4	add x2,x2,#0xafd
009d6dd8	mov w1,#0xe6
009d6ddc	bl 0x00c342b0
009d6de0	mov w1,#0x32
009d6de4	mov w2,#0x6e
009d6de8	mov x0,x19
009d6dec	mov x3,xzr
009d6df0	bl 0x00c34410
009d6df4	mov w0,wzr
009d6df8	ldp x29,x30,[sp, #0x20]
009d6dfc	ldp x20,x19,[sp, #0x10]
009d6e00	ldp x22,x21,[sp], #0x30
009d6e04	ret
009d6e08	ldr x0,[x19, #0xab8]
009d6e0c	adrp x22,0x2d1000
009d6e10	add x22,x22,#0x573
009d6e14	mov w2,#0x1c6
009d6e18	mov x1,x22
009d6e1c	bl 0x00c32310
009d6e20	mov w3,#0x1cf
009d6e24	mov x0,x21
009d6e28	mov x1,x20
009d6e2c	mov x2,x22
009d6e30	str xzr,[x19, #0xab8]
009d6e34	str xzr,[x19, #0xab0]
009d6e38	bl 0x00c345f0
009d6e3c	str x0,[x19, #0xab8]
009d6e40	cbz x0,0x009d6e54
009d6e44	add x8,x19,#0xab0
009d6e48	str x20,[x8]
009d6e4c	mov w0,#0x1
009d6e50	b 0x009d6df8
009d6e54	bl 0x00c342a0
009d6e58	adrp x0,0x2d7000
009d6e5c	adrp x2,0x2d7000
009d6e60	add x0,x0,#0xae0
009d6e64	add x2,x2,#0xafd
009d6e68	mov w1,#0xee
009d6e6c	bl 0x00c342b0
009d6e70	mov w2,#0x103
009d6e74	mov w1,#0x50
009d6e78	movk w2,#0xc, LSL #16
009d6e7c	b 0x009d6de8
