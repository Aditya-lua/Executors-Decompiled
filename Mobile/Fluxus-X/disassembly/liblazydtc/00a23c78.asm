; FUN_00a23c78 @ 00a23c78
00a23c78	sub sp,sp,#0x60
00a23c7c	stp x26,x25,[sp, #0x10]
00a23c80	stp x24,x23,[sp, #0x20]
00a23c84	stp x22,x21,[sp, #0x30]
00a23c88	stp x20,x19,[sp, #0x40]
00a23c8c	stp x29,x30,[sp, #0x50]
00a23c90	add x29,sp,#0x50
00a23c94	stp xzr,xzr,[sp]
00a23c98	cbz x0,0x00a23d74
00a23c9c	ldr x23,[x0, #0x20]
00a23ca0	cbz x23,0x00a23d74
00a23ca4	mov x0,x23
00a23ca8	mov x25,x4
00a23cac	mov x26,x3
00a23cb0	mov x21,x2
00a23cb4	mov x22,x1
00a23cb8	bl 0x00c36880
00a23cbc	cbz x0,0x00a23d74
00a23cc0	mov x24,x0
00a23cc4	bl 0x00c364c0
00a23cc8	cbz x0,0x00a23d74
00a23ccc	mov x20,x0
00a23cd0	mov x0,x26
00a23cd4	bl 0x00c38a60
00a23cd8	mov x19,x0
00a23cdc	cbz x0,0x00a23e28
00a23ce0	mov x0,x19
00a23ce4	bl 0x00c38a90
00a23ce8	mov x6,sp
00a23cec	mov x0,x24
00a23cf0	mov x1,x20
00a23cf4	mov x2,xzr
00a23cf8	mov x3,x26
00a23cfc	mov x4,x25
00a23d00	mov x5,x19
00a23d04	bl 0x00c3a980
00a23d08	cbz w0,0x00a23e28
00a23d0c	mov x0,x23
00a23d10	bl 0x00c3a7d0
00a23d14	mov x25,x0
00a23d18	mov x0,x23
00a23d1c	bl 0x00c3a7e0
00a23d20	cbz x0,0x00a23d98
00a23d24	mov x26,x0
00a23d28	mov x0,x23
00a23d2c	bl 0x00c3a7f0
00a23d30	mov w2,w0
00a23d34	add x3,sp,#0x8
00a23d38	mov x0,x24
00a23d3c	mov x1,x26
00a23d40	mov x4,x19
00a23d44	bl 0x00c3a8a0
00a23d48	cbz x0,0x00a23e28
00a23d4c	ldr x2,[sp, #0x8]
00a23d50	adrp x1,0x2ad000
00a23d54	mov x3,x0
00a23d58	add x1,x1,#0x463
00a23d5c	mov x0,x20
00a23d60	bl 0x00c3a8f0
00a23d64	cbz w0,0x00a23e28
00a23d68	orr w26,wzr,#0x6
00a23d6c	cbnz x25,0x00a23da0
00a23d70	b 0x00a23e04
00a23d74	mov w21,wzr
00a23d78	mov w0,w21
00a23d7c	ldp x29,x30,[sp, #0x50]
00a23d80	ldp x20,x19,[sp, #0x40]
00a23d84	ldp x22,x21,[sp, #0x30]
00a23d88	ldp x24,x23,[sp, #0x20]
00a23d8c	ldp x26,x25,[sp, #0x10]
00a23d90	add sp,sp,#0x60
00a23d94	ret
00a23d98	mov w26,#0x4
00a23d9c	cbz x25,0x00a23e04
00a23da0	mov x0,x24
00a23da4	bl 0x00c3a790
00a23da8	cmp w0,#0x1
00a23dac	b.lt 0x00a23e28
00a23db0	add w8,w0,#0x7
00a23db4	add w9,w0,#0xe
00a23db8	cmp w8,#0x0
00a23dbc	csel w8,w9,w8,lt
00a23dc0	adrp x1,0x2a3000
00a23dc4	sbfx x3,x8,#0x3,#0x1d
00a23dc8	add x1,x1,#0xe83
00a23dcc	mov x0,x20
00a23dd0	mov x2,x25
00a23dd4	bl 0x00c3a8d0
00a23dd8	cbz w0,0x00a23e28
00a23ddc	mov x0,x23
00a23de0	bl 0x00c3a810
00a23de4	adrp x1,0x2ab000
00a23de8	ubfx w2,w0,#0xc,#0x1
00a23dec	add x1,x1,#0xf0e
00a23df0	mov x0,x20
00a23df4	bl 0x00c3a8e0
00a23df8	cbz w0,0x00a23e28
00a23dfc	mov w8,#0x81
00a23e00	orr w26,w26,w8
00a23e04	mov x0,x20
00a23e08	bl 0x00c364f0
00a23e0c	mov x23,x0
00a23e10	mov x0,x22
00a23e14	mov w1,w26
00a23e18	mov x2,x23
00a23e1c	blr x21
00a23e20	mov w21,w0
00a23e24	b 0x00a23e30
00a23e28	mov w21,wzr
00a23e2c	mov x23,xzr
00a23e30	mov x0,x20
00a23e34	bl 0x00c364b0
00a23e38	mov x0,x23
00a23e3c	bl 0x00c36500
00a23e40	ldr x0,[sp, #0x8]
00a23e44	adrp x20,0x2cb000
00a23e48	add x20,x20,#0x7a0
00a23e4c	mov w2,#0x25a
00a23e50	mov x1,x20
00a23e54	bl 0x00c32310
00a23e58	ldr x0,[sp]
00a23e5c	mov w2,#0x25b
00a23e60	mov x1,x20
00a23e64	bl 0x00c32310
00a23e68	mov x0,x19
00a23e6c	bl 0x00c38a20
00a23e70	mov x0,x19
00a23e74	bl 0x00c38a30
00a23e78	b 0x00a23d78
