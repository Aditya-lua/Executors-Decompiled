; tls_construct_extensions @ 009d0c68
009d0c68	sub sp,sp,#0x60
009d0c6c	stp x22,x21,[sp, #0x30]
009d0c70	mov x21,x1
009d0c74	stp x20,x19,[sp, #0x40]
009d0c78	mov x19,x0
009d0c7c	mov w1,#0x2
009d0c80	mov x0,x21
009d0c84	stp x26,x25,[sp, #0x10]
009d0c88	stp x24,x23,[sp, #0x20]
009d0c8c	stp x29,x30,[sp, #0x50]
009d0c90	add x29,sp,#0x50
009d0c94	mov x20,x4
009d0c98	mov x22,x3
009d0c9c	mov w23,w2
009d0ca0	str wzr,[sp, #0x8]
009d0ca4	bl 0x00c343b0
009d0ca8	cbz w0,0x009d0d14
009d0cac	tst w23,#0x180
009d0cb0	b.eq 0x009d0cc4
009d0cb4	mov w1,#0x2
009d0cb8	mov x0,x21
009d0cbc	bl 0x00c36e80
009d0cc0	cbz w0,0x009d0d14
009d0cc4	mov w5,wzr
009d0cc8	tbz w23,#0x7,0x009d0d78
009d0ccc	add x1,sp,#0xc
009d0cd0	add x2,sp,#0x8
009d0cd4	mov x0,x19
009d0cd8	mov x3,xzr
009d0cdc	bl 0x00c365c0
009d0ce0	cbz w0,0x009d0d68
009d0ce4	mov w24,w0
009d0ce8	bl 0x00c342a0
009d0cec	adrp x0,0x2c1000
009d0cf0	adrp x2,0x2ad000
009d0cf4	add x0,x0,#0x800
009d0cf8	add x2,x2,#0x8ea
009d0cfc	mov w1,#0x33a
009d0d00	bl 0x00c342b0
009d0d04	mov w1,#0x50
009d0d08	mov x0,x19
009d0d0c	mov w2,w24
009d0d10	b 0x009d0d40
009d0d14	bl 0x00c342a0
009d0d18	adrp x0,0x2c1000
009d0d1c	adrp x2,0x2ad000
009d0d20	add x0,x0,#0x800
009d0d24	add x2,x2,#0x8ea
009d0d28	mov w1,#0x333
009d0d2c	bl 0x00c342b0
009d0d30	mov w2,#0x103
009d0d34	mov w1,#0x50
009d0d38	movk w2,#0xc, LSL #16
009d0d3c	mov x0,x19
009d0d40	mov x3,xzr
009d0d44	bl 0x00c34410
009d0d48	mov w0,wzr
009d0d4c	ldp x29,x30,[sp, #0x50]
009d0d50	ldp x20,x19,[sp, #0x40]
009d0d54	ldp x22,x21,[sp, #0x30]
009d0d58	ldp x24,x23,[sp, #0x20]
009d0d5c	ldp x26,x25,[sp, #0x10]
009d0d60	add sp,sp,#0x60
009d0d64	ret
009d0d68	ldr x8,[x19, #0x898]
009d0d6c	add x0,x8,#0x1d8
009d0d70	bl 0x00c36ed0
009d0d74	ldr w5,[sp, #0x8]
009d0d78	mov x0,x19
009d0d7c	mov w1,w23
009d0d80	mov x2,x21
009d0d84	mov x3,x22
009d0d88	mov x4,x20
009d0d8c	bl 0x00c36eb0
009d0d90	cbz w0,0x009d0d4c
009d0d94	adrp x9,0xc58000
009d0d98	mov w8,#0x6080
009d0d9c	add x9,x9,#0x1e8
009d0da0	mov x24,xzr
009d0da4	and w25,w23,w8
009d0da8	add x26,x9,#0x20
009d0dac	ldur w1,[x26, #-0x1c]
009d0db0	ldr w3,[sp, #0x8]
009d0db4	mov x0,x19
009d0db8	mov w2,w23
009d0dbc	bl 0x009d0b84
009d0dc0	cbz w0,0x009d0e14
009d0dc4	ldr w8,[x19, #0x38]
009d0dc8	cmp w8,#0x0
009d0dcc	cset w8,eq
009d0dd0	ldr x8,[x26, w8, UXTW #0x3]
009d0dd4	cbz x8,0x009d0e14
009d0dd8	mov x0,x19
009d0ddc	mov x1,x21
009d0de0	mov w2,w23
009d0de4	mov x3,x22
009d0de8	mov x4,x20
009d0dec	blr x8
009d0df0	cmp w0,#0x1
009d0df4	b.eq 0x009d0e00
009d0df8	cbnz w0,0x009d0e14
009d0dfc	b 0x009d0d4c
009d0e00	cbz w25,0x009d0e14
009d0e04	add x8,x19,x24
009d0e08	ldrb w9,[x8, #0xa28]
009d0e0c	orr w9,w9,#0x2
009d0e10	strb w9,[x8, #0xa28]
009d0e14	add x24,x24,#0x1
009d0e18	cmp x24,#0x1a
009d0e1c	add x26,x26,#0x38
009d0e20	b.cc 0x009d0dac
009d0e24	mov x0,x21
009d0e28	bl 0x00c34350
009d0e2c	cbz w0,0x009d0e38
009d0e30	mov w0,#0x1
009d0e34	b 0x009d0d4c
009d0e38	bl 0x00c342a0
009d0e3c	adrp x0,0x2c1000
009d0e40	adrp x2,0x2ad000
009d0e44	add x0,x0,#0x800
009d0e48	add x2,x2,#0x8ea
009d0e4c	mov w1,#0x365
009d0e50	b 0x009d0d2c
