; tls_construct_ctos_status_request @ 009d2cc0
009d2cc0	str x23,[sp, #-0x40]!
009d2cc4	stp x22,x21,[sp, #0x10]
009d2cc8	stp x20,x19,[sp, #0x20]
009d2ccc	stp x29,x30,[sp, #0x30]
009d2cd0	add x29,sp,#0x30
009d2cd4	cbnz x3,0x009d2e28
009d2cd8	ldr w8,[x0, #0xa60]
009d2cdc	mov x19,x0
009d2ce0	cmp w8,#0x1
009d2ce4	b.ne 0x009d2e28
009d2ce8	mov x20,x1
009d2cec	mov w1,#0x5
009d2cf0	mov w2,#0x2
009d2cf4	mov x0,x20
009d2cf8	bl 0x00c343a0
009d2cfc	cbz w0,0x009d2e40
009d2d00	mov w1,#0x2
009d2d04	mov x0,x20
009d2d08	bl 0x00c343b0
009d2d0c	cbz w0,0x009d2e40
009d2d10	mov w1,#0x1
009d2d14	mov w2,#0x1
009d2d18	mov x0,x20
009d2d1c	bl 0x00c343a0
009d2d20	cbz w0,0x009d2e40
009d2d24	mov w1,#0x2
009d2d28	mov x0,x20
009d2d2c	bl 0x00c343b0
009d2d30	cbz w0,0x009d2e40
009d2d34	ldr x0,[x19, #0xa78]
009d2d38	bl 0x00c325e0
009d2d3c	cmp w0,#0x1
009d2d40	b.lt 0x009d2dac
009d2d44	mov w21,wzr
009d2d48	ldr x0,[x19, #0xa78]
009d2d4c	mov w1,w21
009d2d50	bl 0x00c32610
009d2d54	mov x1,xzr
009d2d58	mov x22,x0
009d2d5c	bl 0x00c36f80
009d2d60	mov w23,w0
009d2d64	cmp w0,#0x1
009d2d68	b.lt 0x009d2e7c
009d2d6c	sxtw x1,w23
009d2d70	add x2,sp,#0x8
009d2d74	mov w3,#0x2
009d2d78	mov x0,x20
009d2d7c	bl 0x00c36f60
009d2d80	cbz w0,0x009d2e7c
009d2d84	add x1,sp,#0x8
009d2d88	mov x0,x22
009d2d8c	bl 0x00c36f80
009d2d90	cmp w0,w23
009d2d94	b.ne 0x009d2e7c
009d2d98	ldr x0,[x19, #0xa78]
009d2d9c	add w21,w21,#0x1
009d2da0	bl 0x00c325e0
009d2da4	cmp w21,w0
009d2da8	b.lt 0x009d2d48
009d2dac	mov x0,x20
009d2db0	bl 0x00c34350
009d2db4	cbz w0,0x009d2e98
009d2db8	mov w1,#0x2
009d2dbc	mov x0,x20
009d2dc0	bl 0x00c343b0
009d2dc4	cbz w0,0x009d2e98
009d2dc8	ldr x0,[x19, #0xa80]
009d2dcc	cbz x0,0x009d2e08
009d2dd0	mov x1,xzr
009d2dd4	bl 0x00c36f90
009d2dd8	mov w21,w0
009d2ddc	tbnz w0,#0x1f,0x009d2eec
009d2de0	sxtw x1,w21
009d2de4	add x2,sp,#0x8
009d2de8	mov x0,x20
009d2dec	bl 0x00c36c40
009d2df0	cbz w0,0x009d2ed0
009d2df4	ldr x0,[x19, #0xa80]
009d2df8	add x1,sp,#0x8
009d2dfc	bl 0x00c36f90
009d2e00	cmp w0,w21
009d2e04	b.ne 0x009d2ed0
009d2e08	mov x0,x20
009d2e0c	bl 0x00c34350
009d2e10	cbz w0,0x009d2eb4
009d2e14	mov x0,x20
009d2e18	bl 0x00c34350
009d2e1c	cbz w0,0x009d2eb4
009d2e20	mov w0,#0x1
009d2e24	b 0x009d2e2c
009d2e28	mov w0,#0x2
009d2e2c	ldp x29,x30,[sp, #0x30]
009d2e30	ldp x20,x19,[sp, #0x20]
009d2e34	ldp x22,x21,[sp, #0x10]
009d2e38	ldr x23,[sp], #0x40
009d2e3c	ret
009d2e40	bl 0x00c342a0
009d2e44	adrp x0,0x2bf000
009d2e48	adrp x2,0x2cf000
009d2e4c	add x0,x0,#0x967
009d2e50	add x2,x2,#0x7f7
009d2e54	mov w1,#0x155
009d2e58	bl 0x00c342b0
009d2e5c	mov w2,#0x103
009d2e60	mov w1,#0x50
009d2e64	movk w2,#0xc, LSL #16
009d2e68	mov x0,x19
009d2e6c	mov x3,xzr
009d2e70	bl 0x00c34410
009d2e74	mov w0,wzr
009d2e78	b 0x009d2e2c
009d2e7c	bl 0x00c342a0
009d2e80	adrp x0,0x2bf000
009d2e84	adrp x2,0x2cf000
009d2e88	add x0,x0,#0x967
009d2e8c	add x2,x2,#0x7f7
009d2e90	mov w1,#0x161
009d2e94	b 0x009d2e58
009d2e98	bl 0x00c342a0
009d2e9c	adrp x0,0x2bf000
009d2ea0	adrp x2,0x2cf000
009d2ea4	add x0,x0,#0x967
009d2ea8	add x2,x2,#0x7f7
009d2eac	mov w1,#0x167
009d2eb0	b 0x009d2e58
009d2eb4	bl 0x00c342a0
009d2eb8	adrp x0,0x2bf000
009d2ebc	adrp x2,0x2cf000
009d2ec0	add x0,x0,#0x967
009d2ec4	add x2,x2,#0x7f7
009d2ec8	mov w1,#0x17a
009d2ecc	b 0x009d2e58
009d2ed0	bl 0x00c342a0
009d2ed4	adrp x0,0x2bf000
009d2ed8	adrp x2,0x2cf000
009d2edc	add x0,x0,#0x967
009d2ee0	add x2,x2,#0x7f7
009d2ee4	mov w1,#0x175
009d2ee8	b 0x009d2e58
009d2eec	bl 0x00c342a0
009d2ef0	adrp x0,0x2bf000
009d2ef4	adrp x2,0x2cf000
009d2ef8	add x0,x0,#0x967
009d2efc	add x2,x2,#0x7f7
009d2f00	mov w1,#0x16f
009d2f04	b 0x009d2e58
