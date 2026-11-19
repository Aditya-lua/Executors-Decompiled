; ssl_set_sig_mask @ 009c2bcc
009c2bcc	stp x26,x25,[sp, #-0x50]!
009c2bd0	stp x24,x23,[sp, #0x10]
009c2bd4	stp x22,x21,[sp, #0x20]
009c2bd8	stp x20,x19,[sp, #0x30]
009c2bdc	stp x29,x30,[sp, #0x40]
009c2be0	ldr x8,[x1, #0x898]
009c2be4	adrp x24,0x74c000
009c2be8	mov w20,w2
009c2bec	mov x21,x1
009c2bf0	ldr w9,[x8, #0x1c]
009c2bf4	mov x19,x0
009c2bf8	add x24,x24,#0xd8c
009c2bfc	add x29,sp,#0x40
009c2c00	and w9,w9,#0x30000
009c2c04	cmp w9,#0x30, LSL #12
009c2c08	b.eq 0x009c2c28
009c2c0c	cmp w9,#0x20, LSL #12
009c2c10	b.eq 0x009c2c30
009c2c14	cmp w9,#0x10, LSL #12
009c2c18	b.ne 0x009c2cb8
009c2c1c	adrp x24,0x74c000
009c2c20	add x24,x24,#0xd8c
009c2c24	b 0x009c2c34
009c2c28	mov w25,#0x2
009c2c2c	b 0x009c2c38
009c2c30	add x24,x24,#0x2
009c2c34	mov w25,#0x1
009c2c38	mov w26,#0xb
009c2c3c	ldrh w1,[x24]
009c2c40	mov x0,x21
009c2c44	bl 0x009c21e4
009c2c48	cbz x0,0x009c2c88
009c2c4c	mov x22,x0
009c2c50	ldrsw x0,[x0, #0x18]
009c2c54	bl 0x00c35130
009c2c58	cbz x0,0x009c2c88
009c2c5c	ldr w8,[x0, #0x4]
009c2c60	mov x23,x0
009c2c64	tst w8,w26
009c2c68	b.eq 0x009c2c88
009c2c6c	mov x0,x21
009c2c70	mov w1,w20
009c2c74	mov x2,x22
009c2c78	bl 0x009c3c60
009c2c7c	cbz w0,0x009c2c88
009c2c80	ldr w8,[x23, #0x4]
009c2c84	bic w26,w26,w8
009c2c88	subs x25,x25,#0x1
009c2c8c	add x24,x24,#0x2
009c2c90	b.ne 0x009c2c3c
009c2c94	ldr w8,[x19]
009c2c98	orr w8,w8,w26
009c2c9c	str w8,[x19]
009c2ca0	ldp x29,x30,[sp, #0x40]
009c2ca4	ldp x20,x19,[sp, #0x30]
009c2ca8	ldp x22,x21,[sp, #0x20]
009c2cac	ldp x24,x23,[sp, #0x10]
009c2cb0	ldp x26,x25,[sp], #0x50
009c2cb4	ret
009c2cb8	ldr w9,[x21, #0x38]
009c2cbc	cmp w9,#0x1
009c2cc0	b.ne 0x009c2cdc
009c2cc4	ldr x24,[x8, #0x1a8]
009c2cc8	cbz x24,0x009c2cdc
009c2ccc	add x8,x8,#0x1b0
009c2cd0	ldr x25,[x8]
009c2cd4	cbnz x25,0x009c2c38
009c2cd8	b 0x009c2cf0
009c2cdc	ldr x24,[x8, #0x198]
009c2ce0	cbz x24,0x009c2cf8
009c2ce4	add x8,x8,#0x1a0
009c2ce8	ldr x25,[x8]
009c2cec	cbnz x25,0x009c2c38
009c2cf0	mov w26,#0xb
009c2cf4	b 0x009c2c94
009c2cf8	adrp x24,0x74c000
009c2cfc	add x24,x24,#0xd90
009c2d00	orr w25,wzr,#0x1c
009c2d04	b 0x009c2c38
