; tls_construct_stoc_ec_pt_formats @ 009d8d68
009d8d68	sub sp,sp,#0x30
009d8d6c	stp x20,x19,[sp, #0x10]
009d8d70	stp x29,x30,[sp, #0x20]
009d8d74	ldr x8,[x0, #0x2e0]
009d8d78	mov x19,x0
009d8d7c	mov x20,x1
009d8d80	add x29,sp,#0x20
009d8d84	ldrb w9,[x8, #0x1c]
009d8d88	tbnz w9,#0x2,0x009d8d94
009d8d8c	ldrb w8,[x8, #0x20]
009d8d90	tbz w8,#0x3,0x009d8df8
009d8d94	ldr x8,[x19, #0xab8]
009d8d98	cbz x8,0x009d8df8
009d8d9c	add x1,sp,#0x8
009d8da0	mov x2,sp
009d8da4	mov x0,x19
009d8da8	bl 0x00c36730
009d8dac	mov w1,#0xb
009d8db0	mov w2,#0x2
009d8db4	mov x0,x20
009d8db8	bl 0x00c343a0
009d8dbc	cbz w0,0x009d8e00
009d8dc0	mov w1,#0x2
009d8dc4	mov x0,x20
009d8dc8	bl 0x00c343b0
009d8dcc	cbz w0,0x009d8e00
009d8dd0	ldp x2,x1,[sp]
009d8dd4	mov w3,#0x1
009d8dd8	mov x0,x20
009d8ddc	bl 0x00c36f70
009d8de0	cbz w0,0x009d8e00
009d8de4	mov x0,x20
009d8de8	bl 0x00c34350
009d8dec	cbz w0,0x009d8e00
009d8df0	mov w0,#0x1
009d8df4	b 0x009d8e38
009d8df8	mov w0,#0x2
009d8dfc	b 0x009d8e38
009d8e00	bl 0x00c342a0
009d8e04	adrp x0,0x2d7000
009d8e08	adrp x2,0x2cf000
009d8e0c	add x0,x0,#0xae0
009d8e10	add x2,x2,#0x852
009d8e14	mov w1,#0x52f
009d8e18	bl 0x00c342b0
009d8e1c	mov w2,#0x103
009d8e20	mov w1,#0x50
009d8e24	movk w2,#0xc, LSL #16
009d8e28	mov x0,x19
009d8e2c	mov x3,xzr
009d8e30	bl 0x00c34410
009d8e34	mov w0,wzr
009d8e38	ldp x29,x30,[sp, #0x20]
009d8e3c	ldp x20,x19,[sp, #0x10]
009d8e40	add sp,sp,#0x30
009d8e44	ret
