; tls_parse_ctos_srp @ 009d6c78
009d6c78	stp x22,x21,[sp, #-0x30]!
009d6c7c	stp x20,x19,[sp, #0x10]
009d6c80	stp x29,x30,[sp, #0x20]
009d6c84	ldr x8,[x1, #0x8]
009d6c88	mov x19,x0
009d6c8c	add x29,sp,#0x20
009d6c90	cbz x8,0x009d6cc8
009d6c94	ldr x9,[x1]
009d6c98	sub x21,x8,#0x1
009d6c9c	mov x20,x9
009d6ca0	ldrb w10,[x20], #0x1
009d6ca4	cmp x21,x10
009d6ca8	b.ne 0x009d6cc8
009d6cac	add x8,x9,x8
009d6cb0	stp x8,xzr,[x1]
009d6cb4	mov x0,x20
009d6cb8	mov w1,wzr
009d6cbc	mov x2,x21
009d6cc0	bl 0x00c300a0
009d6cc4	cbz x0,0x009d6d0c
009d6cc8	bl 0x00c342a0
009d6ccc	adrp x0,0x2d7000
009d6cd0	adrp x2,0x2bf000
009d6cd4	add x0,x0,#0xae0
009d6cd8	add x2,x2,#0x9bd
009d6cdc	mov w1,#0xd2
009d6ce0	bl 0x00c342b0
009d6ce4	mov w1,#0x32
009d6ce8	mov w2,#0x6e
009d6cec	mov x0,x19
009d6cf0	mov x3,xzr
009d6cf4	bl 0x00c34410
009d6cf8	mov w0,wzr
009d6cfc	ldp x29,x30,[sp, #0x20]
009d6d00	ldp x20,x19,[sp, #0x10]
009d6d04	ldp x22,x21,[sp], #0x30
009d6d08	ret
009d6d0c	ldr x0,[x19, #0xbf0]
009d6d10	adrp x22,0x2d1000
009d6d14	add x22,x22,#0x573
009d6d18	mov w2,#0x1e3
009d6d1c	mov x1,x22
009d6d20	bl 0x00c32310
009d6d24	mov w3,#0x1e6
009d6d28	mov x0,x20
009d6d2c	mov x1,x21
009d6d30	mov x2,x22
009d6d34	bl 0x00c36180
009d6d38	str x0,[x19, #0xbf0]
009d6d3c	cbz x0,0x009d6d48
009d6d40	mov w0,#0x1
009d6d44	b 0x009d6cfc
009d6d48	bl 0x00c342a0
009d6d4c	adrp x0,0x2d7000
009d6d50	adrp x2,0x2bf000
009d6d54	add x0,x0,#0xae0
009d6d58	add x2,x2,#0x9bd
009d6d5c	mov w1,#0xd7
009d6d60	bl 0x00c342b0
009d6d64	mov w2,#0x103
009d6d68	mov w1,#0x50
009d6d6c	movk w2,#0xc, LSL #16
009d6d70	b 0x009d6cec
