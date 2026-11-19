; OPENSSL_sk_insert @ 00ae8d7c
00ae8d7c	str x21,[sp, #-0x30]!
00ae8d80	mov w21,w2
00ae8d84	stp x20,x19,[sp, #0x10]
00ae8d88	stp x29,x30,[sp, #0x20]
00ae8d8c	add x29,sp,#0x20
00ae8d90	cbz x0,0x00ae8dd0
00ae8d94	ldr w8,[x0]
00ae8d98	orr w9,wzr,#0x7fffffff
00ae8d9c	mov x19,x0
00ae8da0	cmp w8,w9
00ae8da4	b.ne 0x00ae8e08
00ae8da8	bl 0x00c342a0
00ae8dac	adrp x0,0x2c6000
00ae8db0	adrp x2,0x2ae000
00ae8db4	add x0,x0,#0x275
00ae8db8	add x2,x2,#0x649
00ae8dbc	mov w1,#0x10b
00ae8dc0	bl 0x00c342b0
00ae8dc4	orr w0,wzr,#0xf
00ae8dc8	mov w1,#0x72
00ae8dcc	b 0x00ae8df8
00ae8dd0	bl 0x00c342a0
00ae8dd4	adrp x0,0x2c6000
00ae8dd8	adrp x2,0x2ae000
00ae8ddc	add x0,x0,#0x275
00ae8de0	add x2,x2,#0x649
00ae8de4	mov w1,#0x107
00ae8de8	bl 0x00c342b0
00ae8dec	mov w1,#0x102
00ae8df0	orr w0,wzr,#0xf
00ae8df4	movk w1,#0xc, LSL #16
00ae8df8	mov x2,xzr
00ae8dfc	bl 0x00c342c0
00ae8e00	mov w0,wzr
00ae8e04	b 0x00ae8e6c
00ae8e08	mov x20,x1
00ae8e0c	mov w1,#0x1
00ae8e10	mov x0,x19
00ae8e14	mov w2,wzr
00ae8e18	bl 0x00ae8ba0
00ae8e1c	cbz w0,0x00ae8e6c
00ae8e20	ldr w8,[x19]
00ae8e24	ldr x9,[x19, #0x8]
00ae8e28	tbnz w21,#0x1f,0x00ae8e58
00ae8e2c	subs w10,w8,w21
00ae8e30	b.le 0x00ae8e58
00ae8e34	sbfiz x21,x21,#0x3,#0x20
00ae8e38	add x1,x9,x21
00ae8e3c	add x0,x1,#0x8
00ae8e40	sbfiz x2,x10,#0x3,#0x20
00ae8e44	bl 0x00c2ff60
00ae8e48	ldr x8,[x19, #0x8]
00ae8e4c	str x20,[x8, x21#0x0]
00ae8e50	ldr w8,[x19]
00ae8e54	b 0x00ae8e60
00ae8e58	sxtw x10,w8
00ae8e5c	str x20,[x9, x10, LSL #0x3]
00ae8e60	add w0,w8,#0x1
00ae8e64	str w0,[x19]
00ae8e68	str wzr,[x19, #0x10]
00ae8e6c	ldp x29,x30,[sp, #0x20]
00ae8e70	ldp x20,x19,[sp, #0x10]
00ae8e74	ldr x21,[sp], #0x30
00ae8e78	ret
