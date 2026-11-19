; FUN_00b05c0c @ 00b05c0c
00b05c0c	str x21,[sp, #-0x30]!
00b05c10	stp x20,x19,[sp, #0x10]
00b05c14	stp x29,x30,[sp, #0x20]
00b05c18	add x29,sp,#0x20
00b05c1c	mov x19,x0
00b05c20	bl 0x00c322f0
00b05c24	cmp w0,#0x7f
00b05c28	b.gt 0x00b05c40
00b05c2c	mov x0,x19
00b05c30	ldp x29,x30,[sp, #0x20]
00b05c34	ldp x20,x19,[sp, #0x10]
00b05c38	ldr x21,[sp], #0x30
00b05c3c	b 0x00c389e0
00b05c40	mov x0,x19
00b05c44	bl 0x00c389f0
00b05c48	cbz x0,0x00b05ca0
00b05c4c	mov x19,x0
00b05c50	bl 0x00c2ff50
00b05c54	add x21,x0,#0x3
00b05c58	adrp x1,0x2c2000
00b05c5c	add x1,x1,#0x5ca
00b05c60	mov w2,#0x93
00b05c64	mov x0,x21
00b05c68	bl 0x00c32320
00b05c6c	cbz x0,0x00b05ca8
00b05c70	ldrb w8,[x19]
00b05c74	mov x20,x0
00b05c78	cmp w8,#0x2d
00b05c7c	b.ne 0x00b05cf4
00b05c80	adrp x1,0x2aa000
00b05c84	add x1,x1,#0xb2c
00b05c88	mov x0,x20
00b05c8c	mov x2,x21
00b05c90	bl 0x00c387f0
00b05c94	add x1,x19,#0x1
00b05c98	mov x0,x20
00b05c9c	b 0x00b05d10
00b05ca0	mov x20,xzr
00b05ca4	b 0x00b05d2c
00b05ca8	bl 0x00c342a0
00b05cac	adrp x20,0x2c2000
00b05cb0	add x20,x20,#0x5ca
00b05cb4	adrp x2,0x2d0000
00b05cb8	add x2,x2,#0x51e
00b05cbc	mov w1,#0x95
00b05cc0	mov x0,x20
00b05cc4	bl 0x00c342b0
00b05cc8	mov w1,#0x100
00b05ccc	mov w0,#0x22
00b05cd0	movk w1,#0xc, LSL #16
00b05cd4	mov x2,xzr
00b05cd8	bl 0x00c342c0
00b05cdc	mov w2,#0x96
00b05ce0	mov x0,x19
00b05ce4	mov x1,x20
00b05ce8	bl 0x00c32310
00b05cec	mov x20,xzr
00b05cf0	b 0x00b05d2c
00b05cf4	adrp x1,0x2b9000
00b05cf8	add x1,x1,#0xb6c
00b05cfc	mov x0,x20
00b05d00	mov x2,x21
00b05d04	bl 0x00c387f0
00b05d08	mov x0,x20
00b05d0c	mov x1,x19
00b05d10	mov x2,x21
00b05d14	bl 0x00c395d0
00b05d18	adrp x1,0x2c2000
00b05d1c	add x1,x1,#0x5ca
00b05d20	mov w2,#0xa2
00b05d24	mov x0,x19
00b05d28	bl 0x00c32310
00b05d2c	mov x0,x20
00b05d30	ldp x29,x30,[sp, #0x20]
00b05d34	ldp x20,x19,[sp, #0x10]
00b05d38	ldr x21,[sp], #0x30
00b05d3c	ret
