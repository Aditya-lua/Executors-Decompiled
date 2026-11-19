; FUN_00b55d98 @ 00b55d98
00b55d98	sub sp,sp,#0x30
00b55d9c	stp x20,x19,[sp, #0x10]
00b55da0	stp x29,x30,[sp, #0x20]
00b55da4	add x29,sp,#0x20
00b55da8	cbz x1,0x00b55ebc
00b55dac	mov x20,x1
00b55db0	adrp x1,0x2d7000
00b55db4	mov x19,x0
00b55db8	add x1,x1,#0xe7d
00b55dbc	mov x0,x20
00b55dc0	bl 0x00c36530
00b55dc4	cbz x0,0x00b55df4
00b55dc8	add x1,sp,#0x8
00b55dcc	bl 0x00c3e920
00b55dd0	cbz w0,0x00b55ec0
00b55dd4	ldr x1,[sp, #0x8]
00b55dd8	add x0,x19,#0x8
00b55ddc	bl 0x00c40140
00b55de0	cbz w0,0x00b55ec0
00b55de4	ldr x1,[sp, #0x8]
00b55de8	add x0,x19,#0x48
00b55dec	bl 0x00c40140
00b55df0	cbz w0,0x00b55ec0
00b55df4	adrp x1,0x2da000
00b55df8	add x1,x1,#0xc5f
00b55dfc	mov x0,x20
00b55e00	bl 0x00c36530
00b55e04	cbz x0,0x00b55e14
00b55e08	add x1,x19,#0x88
00b55e0c	bl 0x00c36520
00b55e10	cbz w0,0x00b55ec0
00b55e14	adrp x1,0x2ac000
00b55e18	add x1,x1,#0xb4f
00b55e1c	mov x0,x20
00b55e20	bl 0x00c36530
00b55e24	cbz x0,0x00b55e34
00b55e28	add x1,x19,#0x8c
00b55e2c	bl 0x00c36520
00b55e30	cbz w0,0x00b55ec0
00b55e34	adrp x1,0x2c5000
00b55e38	add x1,x1,#0x67e
00b55e3c	mov x0,x20
00b55e40	bl 0x00c36530
00b55e44	cbz x0,0x00b55ebc
00b55e48	ldr w9,[x0, #0x8]
00b55e4c	mov x8,x0
00b55e50	mov w0,wzr
00b55e54	cmp w9,#0x5
00b55e58	b.ne 0x00b55ec0
00b55e5c	ldr x9,[x8, #0x18]
00b55e60	mov w0,wzr
00b55e64	cmp x9,#0x10
00b55e68	b.ne 0x00b55ec0
00b55e6c	ldr x1,[x8, #0x10]
00b55e70	ldp w8,w9,[x19, #0x88]
00b55e74	mov w10,#0x2
00b55e78	add x20,x19,#0x8
00b55e7c	mov x0,x20
00b55e80	cmp w8,#0x0
00b55e84	csel w2,w10,w8,eq
00b55e88	cmp w9,#0x0
00b55e8c	mov w8,#0x4
00b55e90	csel w3,w8,w9,eq
00b55e94	bl 0x00c40110
00b55e98	cbz w0,0x00b55ec0
00b55e9c	ldr q0,[x20, #0x30]
00b55ea0	stur q0,[x19, #0x78]
00b55ea4	ldr q0,[x20, #0x20]
00b55ea8	stur q0,[x19, #0x68]
00b55eac	ldr q0,[x20, #0x10]
00b55eb0	stur q0,[x19, #0x58]
00b55eb4	ldr q0,[x20]
00b55eb8	stur q0,[x19, #0x48]
00b55ebc	mov w0,#0x1
00b55ec0	ldp x29,x30,[sp, #0x20]
00b55ec4	ldp x20,x19,[sp, #0x10]
00b55ec8	add sp,sp,#0x30
00b55ecc	ret
