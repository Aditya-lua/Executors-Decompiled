; tls_parse_ctos_maxfragmentlen @ 009d6b9c
009d6b9c	str x19,[sp, #-0x20]!
009d6ba0	stp x29,x30,[sp, #0x10]
009d6ba4	ldr x8,[x1, #0x8]
009d6ba8	mov x19,x0
009d6bac	add x29,sp,#0x10
009d6bb0	cmp x8,#0x1
009d6bb4	b.ne 0x009d6bf4
009d6bb8	ldr x9,[x1]
009d6bbc	ldrb w8,[x9], #0x1
009d6bc0	sub w10,w8,#0x1
009d6bc4	cmp w10,#0x4
009d6bc8	stp x9,xzr,[x1]
009d6bcc	b.cs 0x009d6c1c
009d6bd0	ldr w10,[x19, #0x4d0]
009d6bd4	ldr x9,[x19, #0x918]
009d6bd8	cbz w10,0x009d6be8
009d6bdc	ldrb w10,[x9, #0x368]
009d6be0	cmp w8,w10
009d6be4	b.ne 0x009d6c38
009d6be8	mov w0,#0x1
009d6bec	strb w8,[x9, #0x368]
009d6bf0	b 0x009d6c6c
009d6bf4	bl 0x00c342a0
009d6bf8	adrp x0,0x2d7000
009d6bfc	adrp x2,0x2b3000
009d6c00	add x0,x0,#0xae0
009d6c04	add x2,x2,#0xf48
009d6c08	mov w1,#0xac
009d6c0c	bl 0x00c342b0
009d6c10	mov w1,#0x32
009d6c14	mov w2,#0x6e
009d6c18	b 0x009d6c5c
009d6c1c	bl 0x00c342a0
009d6c20	adrp x0,0x2d7000
009d6c24	adrp x2,0x2b3000
009d6c28	add x0,x0,#0xae0
009d6c2c	add x2,x2,#0xf48
009d6c30	mov w1,#0xb3
009d6c34	b 0x009d6c50
009d6c38	bl 0x00c342a0
009d6c3c	adrp x0,0x2d7000
009d6c40	adrp x2,0x2b3000
009d6c44	add x0,x0,#0xae0
009d6c48	add x2,x2,#0xf48
009d6c4c	mov w1,#0xbe
009d6c50	bl 0x00c342b0
009d6c54	mov w1,#0x2f
009d6c58	mov w2,#0xe8
009d6c5c	mov x0,x19
009d6c60	mov x3,xzr
009d6c64	bl 0x00c34410
009d6c68	mov w0,wzr
009d6c6c	ldp x29,x30,[sp, #0x10]
009d6c70	ldr x19,[sp], #0x20
009d6c74	ret
