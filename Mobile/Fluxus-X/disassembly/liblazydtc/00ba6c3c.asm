; mbedtls_rsa_check_privkey @ 00ba6c3c
00ba6c3c	str x23,[sp, #-0x40]!
00ba6c40	stp x22,x21,[sp, #0x10]
00ba6c44	stp x20,x19,[sp, #0x20]
00ba6c48	stp x29,x30,[sp, #0x30]
00ba6c4c	add x29,sp,#0x30
00ba6c50	mov x19,x0
00ba6c54	bl 0x00c43400
00ba6c58	cbnz w0,0x00ba6c6c
00ba6c5c	mov w1,#0x1
00ba6c60	mov x0,x19
00ba6c64	bl 0x00ba6554
00ba6c68	cbz w0,0x00ba6c88
00ba6c6c	mov w20,#0xffffbe00
00ba6c70	mov w0,w20
00ba6c74	ldp x29,x30,[sp, #0x30]
00ba6c78	ldp x20,x19,[sp, #0x20]
00ba6c7c	ldp x22,x21,[sp, #0x10]
00ba6c80	ldr x23,[sp], #0x40
00ba6c84	ret
00ba6c88	add x21,x19,#0x40
00ba6c8c	add x22,x19,#0x50
00ba6c90	add x23,x19,#0x30
00ba6c94	add x0,x19,#0x10
00ba6c98	add x4,x19,#0x20
00ba6c9c	mov x1,x21
00ba6ca0	mov x2,x22
00ba6ca4	mov x3,x23
00ba6ca8	mov x5,xzr
00ba6cac	mov x6,xzr
00ba6cb0	bl 0x00c434c0
00ba6cb4	mov w20,#0xffffbe00
00ba6cb8	cbnz w0,0x00ba6c70
00ba6cbc	add x3,x19,#0x60
00ba6cc0	add x4,x19,#0x70
00ba6cc4	add x5,x19,#0x80
00ba6cc8	mov x0,x21
00ba6ccc	mov x1,x22
00ba6cd0	mov x2,x23
00ba6cd4	bl 0x00c434b0
00ba6cd8	cmp w0,#0x0
00ba6cdc	csel w20,wzr,w20,eq
00ba6ce0	b 0x00ba6c70
