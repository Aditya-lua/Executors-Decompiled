; tls_parse_stoc_sct @ 009d4af0
009d4af0	str x23,[sp, #-0x40]!
009d4af4	cmp w2,#0x4, LSL #12
009d4af8	stp x22,x21,[sp, #0x10]
009d4afc	stp x20,x19,[sp, #0x20]
009d4b00	stp x29,x30,[sp, #0x30]
009d4b04	add x29,sp,#0x30
009d4b08	b.ne 0x009d4b14
009d4b0c	mov w0,#0x1
009d4b10	b 0x009d4c54
009d4b14	ldr x8,[x0, #0xb68]
009d4b18	mov x20,x1
009d4b1c	mov x19,x0
009d4b20	cbz x8,0x009d4ba0
009d4b24	ldr x0,[x19, #0xa68]
009d4b28	ldr x21,[x20, #0x8]
009d4b2c	adrp x1,0x2bf000
009d4b30	add x1,x1,#0x967
009d4b34	mov w2,#0x5a6
009d4b38	bl 0x00c32310
009d4b3c	str xzr,[x19, #0xa68]
009d4b40	strh w21,[x19, #0xa70]
009d4b44	cbz x21,0x009d4b0c
009d4b48	adrp x1,0x2bf000
009d4b4c	add x1,x1,#0x967
009d4b50	mov w2,#0x5ab
009d4b54	mov x0,x21
009d4b58	bl 0x00c32320
009d4b5c	str x0,[x19, #0xa68]
009d4b60	cbz x0,0x009d4bf0
009d4b64	ldr x8,[x20, #0x8]
009d4b68	cmp x8,x21
009d4b6c	b.cs 0x009d4c68
009d4b70	bl 0x00c342a0
009d4b74	adrp x0,0x2bf000
009d4b78	adrp x2,0x2c3000
009d4b7c	add x0,x0,#0x967
009d4b80	add x2,x2,#0x60d
009d4b84	mov w1,#0x5b2
009d4b88	bl 0x00c342b0
009d4b8c	mov w8,#0x100
009d4b90	movk w8,#0xc, LSL #16
009d4b94	add w2,w8,#0x3
009d4b98	mov w1,#0x50
009d4b9c	b 0x009d4c44
009d4ba0	ldr x8,[x19, #0x898]
009d4ba4	mov w9,#0x2
009d4ba8	mov x22,x3
009d4bac	mov w23,w2
009d4bb0	bic w1,w9,w2, LSR #0x7
009d4bb4	add x0,x8,#0x1d8
009d4bb8	mov w2,#0x12
009d4bbc	mov x3,xzr
009d4bc0	mov x21,x4
009d4bc4	bl 0x00c36ec0
009d4bc8	cbz x0,0x009d4c20
009d4bcc	ldp x3,x4,[x20]
009d4bd0	mov w2,#0x12
009d4bd4	mov x0,x19
009d4bd8	mov w1,w23
009d4bdc	mov x5,x22
009d4be0	mov x6,x21
009d4be4	bl 0x00c36ee0
009d4be8	cbnz w0,0x009d4b0c
009d4bec	b 0x009d4c54
009d4bf0	strh wzr,[x19, #0xa70]
009d4bf4	bl 0x00c342a0
009d4bf8	adrp x0,0x2bf000
009d4bfc	adrp x2,0x2c3000
009d4c00	add x0,x0,#0x967
009d4c04	add x2,x2,#0x60d
009d4c08	mov w1,#0x5ae
009d4c0c	bl 0x00c342b0
009d4c10	mov w2,#0x100
009d4c14	mov w1,#0x50
009d4c18	movk w2,#0xc, LSL #16
009d4c1c	b 0x009d4c44
009d4c20	bl 0x00c342a0
009d4c24	adrp x0,0x2bf000
009d4c28	adrp x2,0x2c3000
009d4c2c	add x0,x0,#0x967
009d4c30	add x2,x2,#0x60d
009d4c34	mov w1,#0x5c1
009d4c38	bl 0x00c342b0
009d4c3c	mov w1,#0x6e
009d4c40	mov w2,#0x6e
009d4c44	mov x0,x19
009d4c48	mov x3,xzr
009d4c4c	bl 0x00c34410
009d4c50	mov w0,wzr
009d4c54	ldp x29,x30,[sp, #0x30]
009d4c58	ldp x20,x19,[sp, #0x20]
009d4c5c	ldp x22,x21,[sp, #0x10]
009d4c60	ldr x23,[sp], #0x40
009d4c64	ret
009d4c68	ldr x1,[x20]
009d4c6c	mov x2,x21
009d4c70	bl 0x00c2ffd0
009d4c74	ldp x8,x9,[x20]
009d4c78	add x8,x8,x21
009d4c7c	sub x9,x9,x21
009d4c80	stp x8,x9,[x20]
009d4c84	b 0x009d4b0c
