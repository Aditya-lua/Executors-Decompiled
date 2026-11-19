; SSL_get_error @ 009b6cdc
009b6cdc	stp x20,x19,[sp, #-0x20]!
009b6ce0	mov x19,x0
009b6ce4	cmp w1,#0x0
009b6ce8	mov w0,wzr
009b6cec	stp x29,x30,[sp, #0x10]
009b6cf0	add x29,sp,#0x10
009b6cf4	b.gt 0x009b6d18
009b6cf8	bl 0x00c32410
009b6cfc	cbz x0,0x009b6d24
009b6d00	and x8,x0,#0x7f800000
009b6d04	mov w9,#0x1000000
009b6d08	cmp x8,x9
009b6d0c	ccmp w0,#0x0,#0x8,ne
009b6d10	mov w8,#0x5
009b6d14	csinc w0,w8,wzr,lt
009b6d18	ldp x29,x30,[sp, #0x10]
009b6d1c	ldp x20,x19,[sp], #0x20
009b6d20	ret
009b6d24	ldr w8,[x19, #0x28]
009b6d28	cmp w8,#0x3
009b6d2c	b.ne 0x009b6d70
009b6d30	ldr x20,[x19, #0x10]
009b6d34	mov w1,#0x1
009b6d38	mov x0,x20
009b6d3c	bl 0x00c34230
009b6d40	cbz w0,0x009b6d4c
009b6d44	mov w0,#0x2
009b6d48	b 0x009b6d18
009b6d4c	mov w1,#0x2
009b6d50	mov x0,x20
009b6d54	bl 0x00c34230
009b6d58	cbnz w0,0x009b6d8c
009b6d5c	mov w1,#0x4
009b6d60	mov x0,x20
009b6d64	bl 0x00c34230
009b6d68	cbnz w0,0x009b6db4
009b6d6c	ldr w8,[x19, #0x28]
009b6d70	cmp w8,#0x2
009b6d74	b.ne 0x009b6de0
009b6d78	ldr x20,[x19, #0x18]
009b6d7c	mov w1,#0x2
009b6d80	mov x0,x20
009b6d84	bl 0x00c34230
009b6d88	cbz w0,0x009b6d94
009b6d8c	orr w0,wzr,#0x3
009b6d90	b 0x009b6d18
009b6d94	mov w1,#0x1
009b6d98	mov x0,x20
009b6d9c	bl 0x00c34230
009b6da0	cbnz w0,0x009b6d44
009b6da4	mov w1,#0x4
009b6da8	mov x0,x20
009b6dac	bl 0x00c34230
009b6db0	cbz w0,0x009b6ddc
009b6db4	mov x0,x20
009b6db8	bl 0x00c355f0
009b6dbc	cmp w0,#0x3
009b6dc0	mov w8,#0x5
009b6dc4	mov w9,#0x8
009b6dc8	csel w8,w9,w8,eq
009b6dcc	cmp w0,#0x2
009b6dd0	orr w9,wzr,#0x7
009b6dd4	csel w0,w9,w8,eq
009b6dd8	b 0x009b6d18
009b6ddc	ldr w8,[x19, #0x28]
009b6de0	sub w8,w8,#0x4
009b6de4	cmp w8,#0x5
009b6de8	b.cs 0x009b6dfc
009b6dec	adrp x9,0x74c000
009b6df0	add x9,x9,#0x4b0
009b6df4	ldr w0,[x9, w8, SXTW #0x2]
009b6df8	b 0x009b6d18
009b6dfc	ldrb w8,[x19, #0x44]
009b6e00	tbz w8,#0x1,0x009b6e0c
009b6e04	ldr w8,[x19, #0x19c]
009b6e08	cbz w8,0x009b6e14
009b6e0c	mov w0,#0x5
009b6e10	b 0x009b6d18
009b6e14	orr w0,wzr,#0x6
009b6e18	b 0x009b6d18
