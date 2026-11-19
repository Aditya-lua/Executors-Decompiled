; tls_construct_stoc_maxfragmentlen @ 009d8ca4
009d8ca4	stp x20,x19,[sp, #-0x20]!
009d8ca8	stp x29,x30,[sp, #0x10]
009d8cac	ldr x8,[x0, #0x918]
009d8cb0	add x29,sp,#0x10
009d8cb4	ldrb w8,[x8, #0x368]
009d8cb8	sub w8,w8,#0x1
009d8cbc	cmp w8,#0x3
009d8cc0	b.hi 0x009d8d1c
009d8cc4	mov x20,x1
009d8cc8	mov x19,x0
009d8ccc	mov w1,#0x1
009d8cd0	mov w2,#0x2
009d8cd4	mov x0,x20
009d8cd8	bl 0x00c343a0
009d8cdc	cbz w0,0x009d8d24
009d8ce0	mov w1,#0x2
009d8ce4	mov x0,x20
009d8ce8	bl 0x00c343b0
009d8cec	cbz w0,0x009d8d24
009d8cf0	ldr x8,[x19, #0x918]
009d8cf4	mov w2,#0x1
009d8cf8	mov x0,x20
009d8cfc	ldrb w1,[x8, #0x368]
009d8d00	bl 0x00c343a0
009d8d04	cbz w0,0x009d8d24
009d8d08	mov x0,x20
009d8d0c	bl 0x00c34350
009d8d10	cbz w0,0x009d8d24
009d8d14	mov w0,#0x1
009d8d18	b 0x009d8d5c
009d8d1c	mov w0,#0x2
009d8d20	b 0x009d8d5c
009d8d24	bl 0x00c342a0
009d8d28	adrp x0,0x2d7000
009d8d2c	adrp x2,0x29f000
009d8d30	add x0,x0,#0xae0
009d8d34	add x2,x2,#0xec7
009d8d38	mov w1,#0x515
009d8d3c	bl 0x00c342b0
009d8d40	mov w2,#0x103
009d8d44	mov w1,#0x50
009d8d48	movk w2,#0xc, LSL #16
009d8d4c	mov x0,x19
009d8d50	mov x3,xzr
009d8d54	bl 0x00c34410
009d8d58	mov w0,wzr
009d8d5c	ldp x29,x30,[sp, #0x10]
009d8d60	ldp x20,x19,[sp], #0x20
009d8d64	ret
