; BN_kronecker @ 00a38ad0
00a38ad0	str x25,[sp, #-0x50]!
00a38ad4	stp x24,x23,[sp, #0x10]
00a38ad8	mov x23,x0
00a38adc	mov x0,x2
00a38ae0	stp x22,x21,[sp, #0x20]
00a38ae4	stp x20,x19,[sp, #0x30]
00a38ae8	stp x29,x30,[sp, #0x40]
00a38aec	add x29,sp,#0x40
00a38af0	mov x19,x2
00a38af4	mov x21,x1
00a38af8	bl 0x00c38a90
00a38afc	mov x0,x19
00a38b00	bl 0x00c38a40
00a38b04	mov x20,x0
00a38b08	mov x0,x19
00a38b0c	bl 0x00c38a40
00a38b10	cbz x0,0x00a38b58
00a38b14	mov x22,x0
00a38b18	mov x0,x20
00a38b1c	mov x1,x23
00a38b20	bl 0x00c36990
00a38b24	cbz x0,0x00a38d3c
00a38b28	mov x0,x22
00a38b2c	mov x1,x21
00a38b30	bl 0x00c36990
00a38b34	cbz x0,0x00a38d3c
00a38b38	mov x0,x22
00a38b3c	bl 0x00c369b0
00a38b40	cbz w0,0x00a38b68
00a38b44	mov w1,#0x1
00a38b48	mov x0,x20
00a38b4c	bl 0x00c38c60
00a38b50	mov w20,w0
00a38b54	b 0x00a38b5c
00a38b58	orr w20,wzr,#0xfffffffe
00a38b5c	mov x0,x19
00a38b60	bl 0x00c38a20
00a38b64	b 0x00a38d48
00a38b68	mov x0,x20
00a38b6c	bl 0x00c38d10
00a38b70	cbnz w0,0x00a38b80
00a38b74	mov x0,x22
00a38b78	bl 0x00c38d10
00a38b7c	cbz w0,0x00a38bd8
00a38b80	mov w21,#0xffffffff
00a38b84	add w21,w21,#0x1
00a38b88	mov x0,x22
00a38b8c	mov w1,w21
00a38b90	bl 0x00c38d00
00a38b94	cbz w0,0x00a38b84
00a38b98	mov x0,x22
00a38b9c	mov x1,x22
00a38ba0	mov w2,w21
00a38ba4	bl 0x00c39070
00a38ba8	cbz w0,0x00a38d3c
00a38bac	tbnz w21,#0x0,0x00a38bc0
00a38bb0	mov w23,#0x1
00a38bb4	ldr w8,[x22, #0x10]
00a38bb8	cbnz w8,0x00a38bf8
00a38bbc	b 0x00a38c08
00a38bc0	ldr w8,[x20, #0x8]
00a38bc4	cbz w8,0x00a38be0
00a38bc8	ldr x8,[x20]
00a38bcc	ldr x8,[x8]
00a38bd0	and x8,x8,#0x7
00a38bd4	b 0x00a38be4
00a38bd8	mov w20,wzr
00a38bdc	b 0x00a38b5c
00a38be0	mov x8,xzr
00a38be4	adrp x9,0x364000
00a38be8	add x9,x9,#0xcd0
00a38bec	ldr w23,[x9, x8, LSL #0x2]
00a38bf0	ldr w8,[x22, #0x10]
00a38bf4	cbz w8,0x00a38c08
00a38bf8	str wzr,[x22, #0x10]
00a38bfc	ldr w8,[x20, #0x10]
00a38c00	cmp w8,#0x0
00a38c04	cneg w23,w23,ne
00a38c08	mov x0,x20
00a38c0c	bl 0x00c369b0
00a38c10	cbz w0,0x00a38c2c
00a38c14	mov x21,x22
00a38c18	mov x0,x21
00a38c1c	bl 0x00c38d20
00a38c20	cmp w0,#0x0
00a38c24	csel w20,wzr,w23,eq
00a38c28	b 0x00a38b5c
00a38c2c	adrp x24,0x364000
00a38c30	add x24,x24,#0xcd0
00a38c34	b 0x00a38c5c
00a38c38	mov x8,xzr
00a38c3c	mvn x22,xzr
00a38c40	ldr w8,[x20, #0x8]
00a38c44	cbnz w8,0x00a38cdc
00a38c48	b 0x00a38cfc
00a38c4c	mov x22,xzr
00a38c50	ldr w8,[x20, #0x8]
00a38c54	cbnz w8,0x00a38cdc
00a38c58	b 0x00a38cfc
00a38c5c	mov x21,x20
00a38c60	mov x20,x22
00a38c64	mov w22,#0xffffffff
00a38c68	add w22,w22,#0x1
00a38c6c	mov x0,x21
00a38c70	mov w1,w22
00a38c74	bl 0x00c38d00
00a38c78	cbz w0,0x00a38c68
00a38c7c	mov x0,x21
00a38c80	mov x1,x21
00a38c84	mov w2,w22
00a38c88	bl 0x00c39070
00a38c8c	cbz w0,0x00a38d3c
00a38c90	tbz w22,#0x0,0x00a38cb8
00a38c94	ldr w8,[x20, #0x8]
00a38c98	cbz w8,0x00a38ca8
00a38c9c	ldr x8,[x20]
00a38ca0	ldr x8,[x8]
00a38ca4	b 0x00a38cac
00a38ca8	mov x8,xzr
00a38cac	and x8,x8,#0x7
00a38cb0	ldr w8,[x24, x8, LSL #0x2]
00a38cb4	mul w23,w8,w23
00a38cb8	ldr w9,[x21, #0x10]
00a38cbc	ldr w8,[x21, #0x8]
00a38cc0	cbz w9,0x00a38ce8
00a38cc4	cbz w8,0x00a38c38
00a38cc8	ldr x8,[x21]
00a38ccc	ldr x8,[x8]
00a38cd0	mvn x22,x8
00a38cd4	ldr w8,[x20, #0x8]
00a38cd8	cbz w8,0x00a38cfc
00a38cdc	ldr x8,[x20]
00a38ce0	ldr x25,[x8]
00a38ce4	b 0x00a38d00
00a38ce8	cbz w8,0x00a38c4c
00a38cec	ldr x8,[x21]
00a38cf0	ldr x22,[x8]
00a38cf4	ldr w8,[x20, #0x8]
00a38cf8	cbnz w8,0x00a38cdc
00a38cfc	mov x25,xzr
00a38d00	mov x0,x20
00a38d04	mov x1,x20
00a38d08	mov x2,x21
00a38d0c	mov x3,x19
00a38d10	bl 0x00c38f30
00a38d14	cbz w0,0x00a38d3c
00a38d18	and w8,w22,w25
00a38d1c	tst x8,#0x2
00a38d20	mov x0,x20
00a38d24	cneg w23,w23,ne
00a38d28	str wzr,[x21, #0x10]
00a38d2c	bl 0x00c369b0
00a38d30	mov x22,x21
00a38d34	cbz w0,0x00a38c5c
00a38d38	b 0x00a38c18
00a38d3c	mov x0,x19
00a38d40	bl 0x00c38a20
00a38d44	orr w20,wzr,#0xfffffffe
00a38d48	mov w0,w20
00a38d4c	ldp x29,x30,[sp, #0x40]
00a38d50	ldp x20,x19,[sp, #0x30]
00a38d54	ldp x22,x21,[sp, #0x20]
00a38d58	ldp x24,x23,[sp, #0x10]
00a38d5c	ldr x25,[sp], #0x50
00a38d60	ret
