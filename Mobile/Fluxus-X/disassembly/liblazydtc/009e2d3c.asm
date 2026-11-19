; ssl_get_min_max_version @ 009e2d3c
009e2d3c	str x27,[sp, #-0x60]!
009e2d40	stp x26,x25,[sp, #0x10]
009e2d44	stp x24,x23,[sp, #0x20]
009e2d48	stp x22,x21,[sp, #0x30]
009e2d4c	stp x20,x19,[sp, #0x40]
009e2d50	stp x29,x30,[sp, #0x50]
009e2d54	ldr x8,[x0, #0x8]
009e2d58	mov x20,x3
009e2d5c	mov x19,x2
009e2d60	mov x22,x0
009e2d64	ldr w8,[x8]
009e2d68	mov x21,x1
009e2d6c	add x29,sp,#0x50
009e2d70	cmp w8,#0x10, LSL #12
009e2d74	b.eq 0x009e2d98
009e2d78	orr w9,wzr,#0x1ffff
009e2d7c	cmp w8,w9
009e2d80	b.ne 0x009e2e5c
009e2d84	adrp x24,0xc58000
009e2d88	add x24,x24,#0x828
009e2d8c	str wzr,[x21]
009e2d90	cbnz x20,0x009e2da8
009e2d94	b 0x009e2dac
009e2d98	adrp x24,0xc58000
009e2d9c	add x24,x24,#0x798
009e2da0	str wzr,[x21]
009e2da4	cbz x20,0x009e2dac
009e2da8	str wzr,[x20]
009e2dac	ldr w8,[x24]
009e2db0	cbz w8,0x009e2e7c
009e2db4	mov w25,wzr
009e2db8	mov w26,wzr
009e2dbc	mov w27,#0x1
009e2dc0	ldr x8,[x24, #0x8]
009e2dc4	cbz x8,0x009e2e00
009e2dc8	blr x8
009e2dcc	mov x23,x0
009e2dd0	cbnz w25,0x009e2de0
009e2dd4	cmp w27,#0x1
009e2dd8	b.ne 0x009e2de0
009e2ddc	ldr w25,[x24]
009e2de0	mov x0,x22
009e2de4	mov x1,x23
009e2de8	bl 0x009e4f38
009e2dec	cbz w0,0x009e2e14
009e2df0	mov w27,#0x1
009e2df4	ldr w8,[x24, #0x18]!
009e2df8	cbnz w8,0x009e2dc0
009e2dfc	b 0x009e2e4c
009e2e00	mov w25,wzr
009e2e04	mov w27,#0x1
009e2e08	ldr w8,[x24, #0x18]!
009e2e0c	cbnz w8,0x009e2dc0
009e2e10	b 0x009e2e4c
009e2e14	cbz w27,0x009e2e3c
009e2e18	cbz x20,0x009e2e24
009e2e1c	cbz w25,0x009e2e24
009e2e20	str w25,[x20]
009e2e24	ldr w26,[x23]
009e2e28	mov w27,wzr
009e2e2c	str w26,[x21]
009e2e30	ldr w8,[x24, #0x18]!
009e2e34	cbnz w8,0x009e2dc0
009e2e38	b 0x009e2e4c
009e2e3c	ldr w8,[x23]
009e2e40	str w8,[x21]
009e2e44	ldr w8,[x24, #0x18]!
009e2e48	cbnz w8,0x009e2dc0
009e2e4c	mov w0,wzr
009e2e50	str w26,[x19]
009e2e54	cbnz w26,0x009e2e84
009e2e58	b 0x009e2e80
009e2e5c	ldr w8,[x22]
009e2e60	mov w9,#0x103
009e2e64	cmp x20,#0x0
009e2e68	movk w9,#0xc, LSL #16
009e2e6c	str w8,[x19]
009e2e70	str w8,[x21]
009e2e74	csel w0,wzr,w9,eq
009e2e78	b 0x009e2e84
009e2e7c	str wzr,[x19]
009e2e80	mov w0,#0xbf
009e2e84	ldp x29,x30,[sp, #0x50]
009e2e88	ldp x20,x19,[sp, #0x40]
009e2e8c	ldp x22,x21,[sp, #0x30]
009e2e90	ldp x24,x23,[sp, #0x20]
009e2e94	ldp x26,x25,[sp, #0x10]
009e2e98	ldr x27,[sp], #0x60
009e2e9c	ret
