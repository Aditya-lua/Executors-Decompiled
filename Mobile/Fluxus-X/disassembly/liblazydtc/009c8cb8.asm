; srp_verify_server_param @ 009c8cb8
009c8cb8	str x19,[sp, #-0x20]!
009c8cbc	stp x29,x30,[sp, #0x10]
009c8cc0	mov x19,x0
009c8cc4	ldr x0,[x0, #0xc00]
009c8cc8	ldr x1,[x19, #0xbf8]
009c8ccc	add x29,sp,#0x10
009c8cd0	bl 0x00c369c0
009c8cd4	tbz w0,#0x1f,0x009c8cf4
009c8cd8	ldr x0,[x19, #0xc10]
009c8cdc	ldr x1,[x19, #0xbf8]
009c8ce0	bl 0x00c369c0
009c8ce4	tbz w0,#0x1f,0x009c8cf4
009c8ce8	ldr x0,[x19, #0xc10]
009c8cec	bl 0x00c369b0
009c8cf0	cbz w0,0x009c8d34
009c8cf4	bl 0x00c342a0
009c8cf8	adrp x0,0x2af000
009c8cfc	adrp x2,0x2c3000
009c8d00	add x0,x0,#0xb86
009c8d04	add x2,x2,#0x5f5
009c8d08	mov w1,#0x188
009c8d0c	bl 0x00c342b0
009c8d10	mov w1,#0x2f
009c8d14	mov w2,#0x186
009c8d18	mov x0,x19
009c8d1c	mov x3,xzr
009c8d20	bl 0x00c34410
009c8d24	mov w0,wzr
009c8d28	ldp x29,x30,[sp, #0x10]
009c8d2c	ldr x19,[sp], #0x20
009c8d30	ret
009c8d34	ldr x0,[x19, #0xbf8]
009c8d38	bl 0x00c322f0
009c8d3c	ldr w8,[x19, #0xc40]
009c8d40	cmp w0,w8
009c8d44	b.ge 0x009c8d70
009c8d48	bl 0x00c342a0
009c8d4c	adrp x0,0x2af000
009c8d50	adrp x2,0x2c3000
009c8d54	add x0,x0,#0xb86
009c8d58	add x2,x2,#0x5f5
009c8d5c	mov w1,#0x18d
009c8d60	bl 0x00c342b0
009c8d64	mov w1,#0x47
009c8d68	mov w2,#0xf1
009c8d6c	b 0x009c8d18
009c8d70	ldr x8,[x19, #0xbe0]
009c8d74	cbz x8,0x009c8db4
009c8d78	ldr x1,[x19, #0xbd0]
009c8d7c	mov x0,x19
009c8d80	blr x8
009c8d84	cmp w0,#0x0
009c8d88	b.gt 0x009c8dc4
009c8d8c	bl 0x00c342a0
009c8d90	adrp x0,0x2af000
009c8d94	adrp x2,0x2c3000
009c8d98	add x0,x0,#0xb86
009c8d9c	add x2,x2,#0x5f5
009c8da0	mov w1,#0x193
009c8da4	bl 0x00c342b0
009c8da8	mov w1,#0x47
009c8dac	mov w2,#0xea
009c8db0	b 0x009c8d18
009c8db4	ldr x0,[x19, #0xc00]
009c8db8	ldr x1,[x19, #0xbf8]
009c8dbc	bl 0x00c36a50
009c8dc0	cbz x0,0x009c8dcc
009c8dc4	mov w0,#0x1
009c8dc8	b 0x009c8d28
009c8dcc	bl 0x00c342a0
009c8dd0	adrp x0,0x2af000
009c8dd4	adrp x2,0x2c3000
009c8dd8	add x0,x0,#0xb86
009c8ddc	add x2,x2,#0x5f5
009c8de0	mov w1,#0x198
009c8de4	b 0x009c8d60
