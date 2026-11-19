; FUN_00b11d6c @ 00b11d6c
00b11d6c	str x27,[sp, #-0x60]!
00b11d70	stp x22,x21,[sp, #0x30]
00b11d74	mov x21,x0
00b11d78	mov x0,x1
00b11d7c	stp x26,x25,[sp, #0x10]
00b11d80	stp x24,x23,[sp, #0x20]
00b11d84	stp x20,x19,[sp, #0x40]
00b11d88	stp x29,x30,[sp, #0x50]
00b11d8c	add x29,sp,#0x50
00b11d90	mov x19,x2
00b11d94	mov x20,x1
00b11d98	bl 0x00c325e0
00b11d9c	cmp w0,#0x1
00b11da0	b.lt 0x00b11e88
00b11da4	mov x22,xzr
00b11da8	mov w23,wzr
00b11dac	mov x0,x20
00b11db0	mov w1,w23
00b11db4	bl 0x00c32610
00b11db8	ldr x8,[x21, #0x48]
00b11dbc	mov x24,x0
00b11dc0	mov x0,x21
00b11dc4	mov x1,x19
00b11dc8	mov x2,x24
00b11dcc	blr x8
00b11dd0	cbz w0,0x00b11e70
00b11dd4	ldrb w8,[x19, #0xe8]
00b11dd8	tbz w8,#0x5,0x00b11dec
00b11ddc	ldr x0,[x21, #0x98]
00b11de0	bl 0x00c325e0
00b11de4	cmp w0,#0x1
00b11de8	b.eq 0x00b11e2c
00b11dec	ldr x25,[x21, #0x98]
00b11df0	mov x0,x25
00b11df4	bl 0x00c325e0
00b11df8	cmp w0,#0x1
00b11dfc	b.lt 0x00b11e2c
00b11e00	mov w26,w0
00b11e04	mov w27,wzr
00b11e08	mov x0,x25
00b11e0c	mov w1,w27
00b11e10	bl 0x00c32610
00b11e14	mov x1,x24
00b11e18	bl 0x00c35080
00b11e1c	cbz w0,0x00b11e70
00b11e20	add w27,w27,#0x1
00b11e24	cmp w27,w26
00b11e28	b.lt 0x00b11e08
00b11e2c	mov w2,#0xffffffff
00b11e30	mov x0,x21
00b11e34	mov x1,x24
00b11e38	bl 0x00b0e87c
00b11e3c	cbnz w0,0x00b11e90
00b11e40	cbz x22,0x00b11e6c
00b11e44	mov x0,x24
00b11e48	bl 0x00c32c90
00b11e4c	mov x25,x0
00b11e50	mov x0,x22
00b11e54	bl 0x00c32c90
00b11e58	mov x1,x0
00b11e5c	mov x0,x25
00b11e60	bl 0x00c37910
00b11e64	cmp w0,#0x1
00b11e68	b.lt 0x00b11e70
00b11e6c	mov x22,x24
00b11e70	mov x0,x20
00b11e74	add w23,w23,#0x1
00b11e78	bl 0x00c325e0
00b11e7c	cmp w23,w0
00b11e80	b.lt 0x00b11dac
00b11e84	b 0x00b11e94
00b11e88	mov x22,xzr
00b11e8c	b 0x00b11e94
00b11e90	mov x22,x24
00b11e94	mov x0,x22
00b11e98	ldp x29,x30,[sp, #0x50]
00b11e9c	ldp x20,x19,[sp, #0x40]
00b11ea0	ldp x22,x21,[sp, #0x30]
00b11ea4	ldp x24,x23,[sp, #0x20]
00b11ea8	ldp x26,x25,[sp, #0x10]
00b11eac	ldr x27,[sp], #0x60
00b11eb0	ret
