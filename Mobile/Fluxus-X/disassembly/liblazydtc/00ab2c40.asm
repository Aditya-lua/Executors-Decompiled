; FUN_00ab2c40 @ 00ab2c40
00ab2c40	stp x22,x21,[sp, #-0x30]!
00ab2c44	stp x20,x19,[sp, #0x10]
00ab2c48	stp x29,x30,[sp, #0x20]
00ab2c4c	add x29,sp,#0x20
00ab2c50	tbnz w3,#0x2,0x00ab2c8c
00ab2c54	mov x22,x0
00ab2c58	mov x0,x2
00ab2c5c	mov x20,x2
00ab2c60	mov x21,x1
00ab2c64	bl 0x00c32cb0
00ab2c68	cbz x0,0x00ab2c94
00ab2c6c	mov x19,x0
00ab2c70	cbz x22,0x00ab2cc8
00ab2c74	bl 0x00c3ee90
00ab2c78	ldr x1,[x22, #0x20]
00ab2c7c	ldp x6,x7,[x20, #0x170]
00ab2c80	mov x3,x22
00ab2c84	ldr x2,[x1, #0x10]
00ab2c88	b 0x00ab2cdc
00ab2c8c	mov w19,#0x1
00ab2c90	b 0x00ab2d20
00ab2c94	bl 0x00c342a0
00ab2c98	adrp x0,0x2d2000
00ab2c9c	adrp x2,0x2a4000
00ab2ca0	add x0,x0,#0x1db
00ab2ca4	add x2,x2,#0x834
00ab2ca8	mov w1,#0x54
00ab2cac	bl 0x00c342b0
00ab2cb0	mov w0,#0x27
00ab2cb4	mov w1,#0x82
00ab2cb8	mov x2,xzr
00ab2cbc	bl 0x00c342c0
00ab2cc0	mov w19,#0xffffffff
00ab2cc4	b 0x00ab2d20
00ab2cc8	bl 0x00c3eea0
00ab2ccc	ldr x2,[x21, #0x40]
00ab2cd0	ldp x6,x7,[x20, #0x170]
00ab2cd4	add x1,x21,#0x30
00ab2cd8	mov x3,x21
00ab2cdc	mov x4,xzr
00ab2ce0	mov x5,x19
00ab2ce4	bl 0x00c37b10
00ab2ce8	mov w19,w0
00ab2cec	cmp w0,#0x0
00ab2cf0	b.gt 0x00ab2d20
00ab2cf4	bl 0x00c342a0
00ab2cf8	adrp x0,0x2d2000
00ab2cfc	adrp x2,0x2a4000
00ab2d00	add x0,x0,#0x1db
00ab2d04	add x2,x2,#0x834
00ab2d08	mov w1,#0x5c
00ab2d0c	bl 0x00c342b0
00ab2d10	mov w0,#0x27
00ab2d14	mov w1,#0x75
00ab2d18	mov x2,xzr
00ab2d1c	bl 0x00c342c0
00ab2d20	mov w0,w19
00ab2d24	ldp x29,x30,[sp, #0x20]
00ab2d28	ldp x20,x19,[sp, #0x10]
00ab2d2c	ldp x22,x21,[sp], #0x30
00ab2d30	ret
