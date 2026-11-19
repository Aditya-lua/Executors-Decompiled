; BN_CTX_start @ 00a03d78
00a03d78	stp x22,x21,[sp, #-0x30]!
00a03d7c	stp x20,x19,[sp, #0x10]
00a03d80	stp x29,x30,[sp, #0x20]
00a03d84	ldr w8,[x0, #0x34]
00a03d88	mov x19,x0
00a03d8c	add x29,sp,#0x20
00a03d90	cbnz w8,0x00a03d9c
00a03d94	ldr w9,[x19, #0x38]
00a03d98	cbz w9,0x00a03db4
00a03d9c	add w8,w8,#0x1
00a03da0	str w8,[x19, #0x34]
00a03da4	ldp x29,x30,[sp, #0x20]
00a03da8	ldp x20,x19,[sp, #0x10]
00a03dac	ldp x22,x21,[sp], #0x30
00a03db0	ret
00a03db4	ldp w8,w9,[x19, #0x28]
00a03db8	ldr w21,[x19, #0x30]
00a03dbc	cmp w8,w9
00a03dc0	b.ne 0x00a03e30
00a03dc4	add w9,w8,w8, LSL #0x1
00a03dc8	cmp w8,#0x0
00a03dcc	lsr w8,w9,#0x1
00a03dd0	mov w9,#0x20
00a03dd4	csel w22,w9,w8,eq
00a03dd8	adrp x1,0x2c7000
00a03ddc	lsl x0,x22,#0x2
00a03de0	add x1,x1,#0x763
00a03de4	mov w2,#0x10f
00a03de8	bl 0x00c32320
00a03dec	cbz x0,0x00a03e44
00a03df0	ldr w8,[x19, #0x28]
00a03df4	mov x20,x0
00a03df8	cbz w8,0x00a03e0c
00a03dfc	ldr x1,[x19, #0x20]
00a03e00	lsl x2,x8,#0x2
00a03e04	mov x0,x20
00a03e08	bl 0x00c2ffd0
00a03e0c	ldr x0,[x19, #0x20]
00a03e10	adrp x1,0x2c7000
00a03e14	add x1,x1,#0x763
00a03e18	mov w2,#0x115
00a03e1c	bl 0x00c32310
00a03e20	ldr w8,[x19, #0x28]
00a03e24	str x20,[x19, #0x20]
00a03e28	str w22,[x19, #0x2c]
00a03e2c	b 0x00a03e34
00a03e30	ldr x20,[x19, #0x20]
00a03e34	add w9,w8,#0x1
00a03e38	str w9,[x19, #0x28]
00a03e3c	str w21,[x20, w8, UXTW #0x2]
00a03e40	b 0x00a03da4
00a03e44	bl 0x00c342a0
00a03e48	adrp x20,0x2c7000
00a03e4c	add x20,x20,#0x763
00a03e50	adrp x2,0x2d5000
00a03e54	add x2,x2,#0xae7
00a03e58	mov w1,#0x110
00a03e5c	mov x0,x20
00a03e60	bl 0x00c342b0
00a03e64	mov w1,#0x100
00a03e68	orr w0,wzr,#0x3
00a03e6c	movk w1,#0xc, LSL #16
00a03e70	mov x2,xzr
00a03e74	bl 0x00c342c0
00a03e78	bl 0x00c342a0
00a03e7c	adrp x2,0x2a9000
00a03e80	add x2,x2,#0xfc0
00a03e84	mov w1,#0xbd
00a03e88	mov x0,x20
00a03e8c	bl 0x00c342b0
00a03e90	orr w0,wzr,#0x3
00a03e94	mov w1,#0x6d
00a03e98	mov x2,xzr
00a03e9c	bl 0x00c342c0
00a03ea0	ldr w8,[x19, #0x34]
00a03ea4	b 0x00a03d9c
