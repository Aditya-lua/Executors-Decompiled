; tls_parse_stoc_npn @ 009d4c88
009d4c88	sub sp,sp,#0x30
009d4c8c	stp x20,x19,[sp, #0x10]
009d4c90	stp x29,x30,[sp, #0x20]
009d4c94	ldr x8,[x0, #0x240]
009d4c98	mov x19,x0
009d4c9c	add x29,sp,#0x20
009d4ca0	cbz x8,0x009d4cb4
009d4ca4	ldr x8,[x19, #0x2c8]
009d4ca8	cbz x8,0x009d4cb4
009d4cac	mov w0,#0x1
009d4cb0	b 0x009d4d80
009d4cb4	ldr x9,[x19, #0x9a8]
009d4cb8	ldr x8,[x9, #0x2c8]
009d4cbc	cbz x8,0x009d4d10
009d4cc0	ldp x3,x4,[x1]
009d4cc4	mov x10,x3
009d4cc8	mov x11,x4
009d4ccc	cbz x11,0x009d4d34
009d4cd0	ldrb w12,[x10]
009d4cd4	sub x11,x11,#0x1
009d4cd8	subs x11,x11,x12
009d4cdc	b.cc 0x009d4cec
009d4ce0	add x10,x10,x12
009d4ce4	add x10,x10,#0x1
009d4ce8	cbnz w12,0x009d4ccc
009d4cec	bl 0x00c342a0
009d4cf0	adrp x0,0x2bf000
009d4cf4	adrp x2,0x2d5000
009d4cf8	add x0,x0,#0x967
009d4cfc	add x2,x2,#0x97e
009d4d00	mov w1,#0x5e0
009d4d04	bl 0x00c342b0
009d4d08	mov w1,#0x32
009d4d0c	b 0x009d4d6c
009d4d10	bl 0x00c342a0
009d4d14	adrp x0,0x2bf000
009d4d18	adrp x2,0x2bd000
009d4d1c	add x0,x0,#0x967
009d4d20	add x2,x2,#0x6c9
009d4d24	mov w1,#0x5f5
009d4d28	bl 0x00c342b0
009d4d2c	mov w1,#0x6e
009d4d30	b 0x009d4d6c
009d4d34	ldr x5,[x9, #0x2d0]
009d4d38	add x1,sp,#0x8
009d4d3c	add x2,sp,#0x4
009d4d40	mov x0,x19
009d4d44	blr x8
009d4d48	cbz w0,0x009d4d90
009d4d4c	bl 0x00c342a0
009d4d50	adrp x0,0x2bf000
009d4d54	adrp x2,0x2bd000
009d4d58	add x0,x0,#0x967
009d4d5c	add x2,x2,#0x6c9
009d4d60	mov w1,#0x604
009d4d64	bl 0x00c342b0
009d4d68	mov w1,#0x28
009d4d6c	mov w2,#0x6e
009d4d70	mov x0,x19
009d4d74	mov x3,xzr
009d4d78	bl 0x00c34410
009d4d7c	mov w0,wzr
009d4d80	ldp x29,x30,[sp, #0x20]
009d4d84	ldp x20,x19,[sp, #0x10]
009d4d88	add sp,sp,#0x30
009d4d8c	ret
009d4d90	ldr x0,[x19, #0xb18]
009d4d94	adrp x20,0x2bf000
009d4d98	add x20,x20,#0x967
009d4d9c	mov w2,#0x60c
009d4da0	mov x1,x20
009d4da4	bl 0x00c32310
009d4da8	ldrb w0,[sp, #0x4]
009d4dac	mov w2,#0x60d
009d4db0	mov x1,x20
009d4db4	bl 0x00c32320
009d4db8	str x0,[x19, #0xb18]
009d4dbc	cbz x0,0x009d4de0
009d4dc0	ldr x1,[sp, #0x8]
009d4dc4	ldrb w2,[sp, #0x4]
009d4dc8	bl 0x00c2ffd0
009d4dcc	ldrb w8,[sp, #0x4]
009d4dd0	mov w0,#0x1
009d4dd4	str w0,[x19, #0x484]
009d4dd8	str x8,[x19, #0xb20]
009d4ddc	b 0x009d4d80
009d4de0	str xzr,[x19, #0xb20]
009d4de4	bl 0x00c342a0
009d4de8	adrp x0,0x2bf000
009d4dec	adrp x2,0x2bd000
009d4df0	add x0,x0,#0x967
009d4df4	add x2,x2,#0x6c9
009d4df8	mov w1,#0x610
009d4dfc	bl 0x00c342b0
009d4e00	mov w2,#0x103
009d4e04	mov w1,#0x50
009d4e08	movk w2,#0xc, LSL #16
009d4e0c	b 0x009d4d70
