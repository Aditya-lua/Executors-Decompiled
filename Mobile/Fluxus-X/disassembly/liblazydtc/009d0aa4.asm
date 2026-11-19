; tls_parse_all_extensions @ 009d0aa4
009d0aa4	stp x26,x25,[sp, #-0x50]!
009d0aa8	stp x24,x23,[sp, #0x10]
009d0aac	stp x22,x21,[sp, #0x20]
009d0ab0	stp x20,x19,[sp, #0x30]
009d0ab4	stp x29,x30,[sp, #0x40]
009d0ab8	ldr x8,[x0, #0x898]
009d0abc	mov w21,w5
009d0ac0	mov x22,x2
009d0ac4	mov x19,x0
009d0ac8	ldr x8,[x8, #0x1e0]
009d0acc	mov w20,w1
009d0ad0	add x29,sp,#0x40
009d0ad4	adds x26,x8,#0x1a
009d0ad8	b.eq 0x009d0b14
009d0adc	mov x23,x4
009d0ae0	mov x24,x3
009d0ae4	mov x25,xzr
009d0ae8	mov x0,x19
009d0aec	mov w1,w25
009d0af0	mov w2,w20
009d0af4	mov x3,x22
009d0af8	mov x4,x24
009d0afc	mov x5,x23
009d0b00	bl 0x009d0938
009d0b04	cbz w0,0x009d0b6c
009d0b08	add x25,x25,#0x1
009d0b0c	cmp x25,x26
009d0b10	b.cc 0x009d0ae8
009d0b14	cbz w21,0x009d0b68
009d0b18	adrp x8,0xc58000
009d0b1c	add x8,x8,#0x1e8
009d0b20	mov x21,xzr
009d0b24	add x22,x22,#0x10
009d0b28	add x23,x8,#0x30
009d0b2c	ldr x8,[x23]
009d0b30	cbz x8,0x009d0b54
009d0b34	ldur w9,[x23, #-0x2c]
009d0b38	tst w9,w20
009d0b3c	b.eq 0x009d0b54
009d0b40	ldr w2,[x22]
009d0b44	mov x0,x19
009d0b48	mov w1,w20
009d0b4c	blr x8
009d0b50	cbz w0,0x009d0b6c
009d0b54	add x21,x21,#0x1
009d0b58	add x23,x23,#0x38
009d0b5c	cmp x21,#0x1a
009d0b60	add x22,x22,#0x28
009d0b64	b.cc 0x009d0b2c
009d0b68	mov w0,#0x1
009d0b6c	ldp x29,x30,[sp, #0x40]
009d0b70	ldp x20,x19,[sp, #0x30]
009d0b74	ldp x22,x21,[sp, #0x20]
009d0b78	ldp x24,x23,[sp, #0x10]
009d0b7c	ldp x26,x25,[sp], #0x50
009d0b80	ret
