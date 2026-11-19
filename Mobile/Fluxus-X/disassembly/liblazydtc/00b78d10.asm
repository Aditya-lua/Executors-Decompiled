; mbedtls_md @ 00b78d10
00b78d10	mov x8,x3
00b78d14	cbz x0,0x00b78d4c
00b78d18	ldr w9,[x0]
00b78d1c	sub w9,w9,#0x3
00b78d20	cmp w9,#0x10
00b78d24	b.hi 0x00b78d4c
00b78d28	adrp x10,0x77f000
00b78d2c	add x10,x10,#0xbc8
00b78d30	ldrsw x9,[x10, x9, LSL #0x2]
00b78d34	add x9,x9,x10
00b78d38	br x9
00b78d3c	mov x0,x1
00b78d40	mov x1,x2
00b78d44	mov x2,x8
00b78d48	b 0x00c428e0
00b78d4c	mov w0,#0xffffaf00
00b78d50	ret
00b78d54	mov x0,x1
00b78d58	mov x1,x2
00b78d5c	mov x2,x8
00b78d60	b 0x00c42990
00b78d64	mov x0,x1
00b78d68	mov x1,x2
00b78d6c	mov x2,x8
00b78d70	b 0x00c42a00
00b78d74	mov w3,#0x1
00b78d78	mov x0,x1
00b78d7c	mov x1,x2
00b78d80	mov x2,x8
00b78d84	b 0x00c42a70
00b78d88	mov x0,x1
00b78d8c	mov x1,x2
00b78d90	mov x2,x8
00b78d94	mov w3,wzr
00b78d98	b 0x00c42a70
00b78d9c	mov w3,#0x1
00b78da0	mov x0,x1
00b78da4	mov x1,x2
00b78da8	mov x2,x8
00b78dac	b 0x00c42b40
00b78db0	mov x0,x1
00b78db4	mov x1,x2
00b78db8	mov x2,x8
00b78dbc	mov w3,wzr
00b78dc0	b 0x00c42b40
00b78dc4	ldrb w4,[x0, #0x4]
00b78dc8	mov w0,#0x1
00b78dcc	mov x3,x8
00b78dd0	b 0x00c302e0
00b78dd4	ldrb w4,[x0, #0x4]
00b78dd8	mov w0,#0x2
00b78ddc	mov x3,x8
00b78de0	b 0x00c302e0
00b78de4	ldrb w4,[x0, #0x4]
00b78de8	orr w0,wzr,#0x3
00b78dec	mov x3,x8
00b78df0	b 0x00c302e0
00b78df4	ldrb w4,[x0, #0x4]
00b78df8	mov w0,#0x4
00b78dfc	mov x3,x8
00b78e00	b 0x00c302e0
