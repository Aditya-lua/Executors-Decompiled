; X509V3_EXT_REQ_add_conf @ 00af4de4
00af4de4	str x23,[sp, #-0x40]!
00af4de8	mov x23,x0
00af4dec	mov x0,xzr
00af4df0	stp x22,x21,[sp, #0x10]
00af4df4	stp x20,x19,[sp, #0x20]
00af4df8	stp x29,x30,[sp, #0x30]
00af4dfc	add x29,sp,#0x30
00af4e00	mov x20,x3
00af4e04	mov x21,x2
00af4e08	mov x22,x1
00af4e0c	bl 0x00c394e0
00af4e10	cbz x0,0x00af4e88
00af4e14	mov x1,x23
00af4e18	mov x19,x0
00af4e1c	bl 0x00c39470
00af4e20	add x3,sp,#0x8
00af4e24	mov x0,x19
00af4e28	mov x1,x22
00af4e2c	mov x2,x21
00af4e30	str xzr,[sp, #0x8]
00af4e34	bl 0x00af47a0
00af4e38	ldr x8,[sp, #0x8]
00af4e3c	mov w21,w0
00af4e40	cbz x20,0x00af4e60
00af4e44	cbz w21,0x00af4e60
00af4e48	cbz x8,0x00af4e60
00af4e4c	mov x0,x20
00af4e50	mov x1,x8
00af4e54	bl 0x00c407c0
00af4e58	ldr x8,[sp, #0x8]
00af4e5c	mov w21,w0
00af4e60	adrp x1,0xcb5000
00af4e64	ldr x1,[x1, #0x1a0]
00af4e68	mov x0,x8
00af4e6c	bl 0x00c32600
00af4e70	mov x0,x19
00af4e74	mov x1,xzr
00af4e78	bl 0x00c39470
00af4e7c	mov x0,x19
00af4e80	bl 0x00c39480
00af4e84	b 0x00af4e8c
00af4e88	mov w21,wzr
00af4e8c	mov w0,w21
00af4e90	ldp x29,x30,[sp, #0x30]
00af4e94	ldp x20,x19,[sp, #0x20]
00af4e98	ldp x22,x21,[sp, #0x10]
00af4e9c	ldr x23,[sp], #0x40
00af4ea0	ret
