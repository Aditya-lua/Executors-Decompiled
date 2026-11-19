; ossl_provider_free @ 00aa2c44
00aa2c44	stp x20,x19,[sp, #-0x20]!
00aa2c48	stp x29,x30,[sp, #0x10]
00aa2c4c	add x29,sp,#0x10
00aa2c50	cbz x0,0x00aa2d58
00aa2c54	mov x19,x0
00aa2c58	add x8,x0,#0x10
00aa2c5c	ldxr w9,[x8]
00aa2c60	subs w9,w9,#0x1
00aa2c64	stxr w10,w9,[x8]
00aa2c68	cbnz w10,0x00aa2c5c
00aa2c6c	b.ne 0x00aa2d50
00aa2c70	dmb ISHLD
00aa2c74	ldrb w8,[x19]
00aa2c78	tbz w8,#0x0,0x00aa2ce0
00aa2c7c	ldr x8,[x19, #0x70]
00aa2c80	cbz x8,0x00aa2c94
00aa2c84	ldrb w9,[x19, #0xc8]
00aa2c88	tbnz w9,#0x0,0x00aa2c94
00aa2c8c	ldr x0,[x19, #0xd0]
00aa2c90	blr x8
00aa2c94	ldr x1,[x19, #0x68]
00aa2c98	cbz x1,0x00aa2cbc
00aa2c9c	ldr w0,[x19, #0x60]
00aa2ca0	bl 0x00c3be40
00aa2ca4	ldr x0,[x19, #0x68]
00aa2ca8	adrp x1,0x2aa000
00aa2cac	add x1,x1,#0x4b5
00aa2cb0	mov w2,#0x2c4
00aa2cb4	bl 0x00c32310
00aa2cb8	str xzr,[x19, #0x68]
00aa2cbc	ldr x0,[x19, #0xa8]
00aa2cc0	adrp x1,0x2aa000
00aa2cc4	add x1,x1,#0x4b5
00aa2cc8	mov w2,#0x2c9
00aa2ccc	bl 0x00c32310
00aa2cd0	ldrb w8,[x19]
00aa2cd4	stp xzr,xzr,[x19, #0xa8]
00aa2cd8	and w8,w8,#0xfe
00aa2cdc	strb w8,[x19]
00aa2ce0	mov x0,x19
00aa2ce4	bl 0x00c3e7f0
00aa2ce8	ldr x0,[x19, #0x38]
00aa2cec	bl 0x00c39560
00aa2cf0	ldr x0,[x19, #0x28]
00aa2cf4	adrp x20,0x2aa000
00aa2cf8	add x20,x20,#0x4b5
00aa2cfc	mov w2,#0x2d8
00aa2d00	mov x1,x20
00aa2d04	bl 0x00c32310
00aa2d08	ldr x0,[x19, #0x30]
00aa2d0c	mov w2,#0x2d9
00aa2d10	mov x1,x20
00aa2d14	bl 0x00c32310
00aa2d18	ldr x0,[x19, #0x48]
00aa2d1c	adrp x1,0xaa2000
00aa2d20	add x1,x1,#0x7d0
00aa2d24	bl 0x00c32600
00aa2d28	ldr x0,[x19, #0xb8]
00aa2d2c	bl 0x00c34d40
00aa2d30	ldr x0,[x19, #0x8]
00aa2d34	bl 0x00c34d40
00aa2d38	ldp x29,x30,[sp, #0x10]
00aa2d3c	mov w2,#0x2e0
00aa2d40	mov x0,x19
00aa2d44	mov x1,x20
00aa2d48	ldp x20,x19,[sp], #0x20
00aa2d4c	b 0x00c32310
00aa2d50	ldrb w8,[x19, #0xc8]
00aa2d54	tbnz w8,#0x0,0x00aa2d64
00aa2d58	ldp x29,x30,[sp, #0x10]
00aa2d5c	ldp x20,x19,[sp], #0x20
00aa2d60	ret
00aa2d64	ldp x29,x30,[sp, #0x10]
00aa2d68	mov x0,x19
00aa2d6c	mov w1,wzr
00aa2d70	ldp x20,x19,[sp], #0x20
00aa2d74	b 0x00c3eb50
