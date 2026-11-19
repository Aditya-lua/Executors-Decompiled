; RSA_set0_multi_prime_params @ 00ad1d10
00ad1d10	str x27,[sp, #-0x60]!
00ad1d14	stp x26,x25,[sp, #0x10]
00ad1d18	stp x20,x19,[sp, #0x40]
00ad1d1c	mov w25,w4
00ad1d20	mov x19,x0
00ad1d24	mov w0,wzr
00ad1d28	stp x24,x23,[sp, #0x20]
00ad1d2c	stp x22,x21,[sp, #0x30]
00ad1d30	stp x29,x30,[sp, #0x50]
00ad1d34	add x29,sp,#0x50
00ad1d38	cbz x1,0x00ad1e68
00ad1d3c	mov x22,x2
00ad1d40	cbz x2,0x00ad1e68
00ad1d44	mov x21,x3
00ad1d48	cbz x3,0x00ad1e68
00ad1d4c	cbz w25,0x00ad1e68
00ad1d50	mov x23,x1
00ad1d54	mov x0,xzr
00ad1d58	mov w1,w25
00ad1d5c	bl 0x00c34790
00ad1d60	cbz x0,0x00ad1e68
00ad1d64	ldr x24,[x19, #0x88]
00ad1d68	mov x20,x0
00ad1d6c	cmp w25,#0x1
00ad1d70	b.lt 0x00ad1e08
00ad1d74	mov x26,xzr
00ad1d78	sxtw x27,w25
00ad1d7c	bl 0x00c3fee0
00ad1d80	cbz x0,0x00ad1e54
00ad1d84	ldr x8,[x23]
00ad1d88	mov x25,x0
00ad1d8c	cbz x8,0x00ad1e44
00ad1d90	ldr x8,[x22]
00ad1d94	cbz x8,0x00ad1e44
00ad1d98	ldr x8,[x21]
00ad1d9c	cbz x8,0x00ad1e44
00ad1da0	ldr x0,[x25]
00ad1da4	bl 0x00c322e0
00ad1da8	ldr x0,[x25, #0x8]
00ad1dac	bl 0x00c322e0
00ad1db0	ldr x0,[x25, #0x10]
00ad1db4	bl 0x00c322e0
00ad1db8	ldr x0,[x23], #0x8
00ad1dbc	mov w1,#0x4
00ad1dc0	str x0,[x25]
00ad1dc4	ldr x8,[x22], #0x8
00ad1dc8	str x8,[x25, #0x8]
00ad1dcc	ldr x8,[x21], #0x8
00ad1dd0	str x8,[x25, #0x10]
00ad1dd4	bl 0x00c38dc0
00ad1dd8	ldr x0,[x25, #0x8]
00ad1ddc	mov w1,#0x4
00ad1de0	bl 0x00c38dc0
00ad1de4	ldr x0,[x25, #0x10]
00ad1de8	mov w1,#0x4
00ad1dec	bl 0x00c38dc0
00ad1df0	mov x0,x20
00ad1df4	mov x1,x25
00ad1df8	bl 0x00c347a0
00ad1dfc	add x26,x26,#0x1
00ad1e00	cmp x26,x27
00ad1e04	b.lt 0x00ad1d7c
00ad1e08	mov x0,x19
00ad1e0c	str x20,[x19, #0x88]
00ad1e10	bl 0x00c3fc60
00ad1e14	cbz w0,0x00ad1e50
00ad1e18	cbz x24,0x00ad1e2c
00ad1e1c	adrp x1,0xcb5000
00ad1e20	ldr x1,[x1, #0x7a0]
00ad1e24	mov x0,x24
00ad1e28	bl 0x00c32600
00ad1e2c	ldr w8,[x19, #0xd8]
00ad1e30	mov w0,#0x1
00ad1e34	str w0,[x19, #0x10]
00ad1e38	add w8,w8,#0x1
00ad1e3c	str w8,[x19, #0xd8]
00ad1e40	b 0x00ad1e68
00ad1e44	mov x0,x25
00ad1e48	bl 0x00c3fed0
00ad1e4c	b 0x00ad1e54
00ad1e50	str x24,[x19, #0x88]
00ad1e54	adrp x1,0xcb5000
00ad1e58	ldr x1,[x1, #0x7a8]
00ad1e5c	mov x0,x20
00ad1e60	bl 0x00c32600
00ad1e64	mov w0,wzr
00ad1e68	ldp x29,x30,[sp, #0x50]
00ad1e6c	ldp x20,x19,[sp, #0x40]
00ad1e70	ldp x22,x21,[sp, #0x30]
00ad1e74	ldp x24,x23,[sp, #0x20]
00ad1e78	ldp x26,x25,[sp, #0x10]
00ad1e7c	ldr x27,[sp], #0x60
00ad1e80	ret
