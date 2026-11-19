; FUN_008a2c38 @ 008a2c38
008a2c38	stp x29,x30,[sp, #-0x20]!
008a2c3c	str x19,[sp, #0x10]
008a2c40	mov x29,sp
008a2c44	mov x19,x0
008a2c48	ldr x0,[x0, #0x80]
008a2c4c	adrp x8,0xc4c000
008a2c50	add x8,x8,#0x280
008a2c54	str x8,[x19]
008a2c58	cbz x0,0x008a2c88
008a2c5c	bl 0x00c301d0
008a2c60	ldr x0,[x19, #0x98]
008a2c64	str xzr,[x19, #0x80]
008a2c68	bl 0x00c301d0
008a2c6c	mov x0,xzr
008a2c70	stp xzr,xzr,[x19, #0x88]
008a2c74	str xzr,[x19, #0x98]
008a2c78	bl 0x00c301d0
008a2c7c	mov w8,#0x40
008a2c80	str xzr,[x19, #0xa0]
008a2c84	strb w8,[x19, #0xb0]
008a2c88	ldr x0,[x19, #0x98]
008a2c8c	bl 0x00c301d0
008a2c90	ldr x0,[x19, #0x48]
008a2c94	cbz x0,0x008a2cc4
008a2c98	bl 0x00c301d0
008a2c9c	ldr x0,[x19, #0x60]
008a2ca0	str xzr,[x19, #0x48]
008a2ca4	bl 0x00c301d0
008a2ca8	mov x0,xzr
008a2cac	stp xzr,xzr,[x19, #0x50]
008a2cb0	str xzr,[x19, #0x60]
008a2cb4	bl 0x00c301d0
008a2cb8	mov w8,#0x40
008a2cbc	str xzr,[x19, #0x68]
008a2cc0	strb w8,[x19, #0x78]
008a2cc4	ldr x0,[x19, #0x60]
008a2cc8	bl 0x00c301d0
008a2ccc	ldr x0,[x19, #0x10]
008a2cd0	cbz x0,0x008a2d00
008a2cd4	bl 0x00c301d0
008a2cd8	ldr x0,[x19, #0x28]
008a2cdc	str xzr,[x19, #0x10]
008a2ce0	bl 0x00c301d0
008a2ce4	mov x0,xzr
008a2ce8	stp xzr,xzr,[x19, #0x18]
008a2cec	str xzr,[x19, #0x28]
008a2cf0	bl 0x00c301d0
008a2cf4	mov w8,#0x40
008a2cf8	str xzr,[x19, #0x30]
008a2cfc	strb w8,[x19, #0x40]
008a2d00	ldr x0,[x19, #0x28]
008a2d04	ldr x19,[sp, #0x10]
008a2d08	ldp x29,x30,[sp], #0x20
008a2d0c	b 0x00c301d0
