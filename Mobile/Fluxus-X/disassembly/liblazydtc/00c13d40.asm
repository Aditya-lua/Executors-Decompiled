; FUN_00c13d40 @ 00c13d40
00c13d40	paciasp
00c13d44	stp x29,x30,[sp, #-0x30]!
00c13d48	str x21,[sp, #0x10]
00c13d4c	stp x20,x19,[sp, #0x20]
00c13d50	mov x29,sp
00c13d54	ldr x21,[x0, #0x1330]
00c13d58	mov x19,x1
00c13d5c	ldr x8,[x21, #0x8]
00c13d60	sub x9,x8,#0xfc0
00c13d64	cmn x9,#0xff1
00c13d68	b.hi 0x00c13d8c
00c13d6c	mov x20,x0
00c13d70	mov w0,#0x1000
00c13d74	bl 0x00c308d0
00c13d78	cbz x0,0x00c13dec
00c13d7c	mov x8,xzr
00c13d80	stp x21,xzr,[x0]
00c13d84	mov x21,x0
00c13d88	str x0,[x20, #0x1330]
00c13d8c	add x9,x8,#0x30
00c13d90	add x0,x21,x8
00c13d94	adrp x8,0xcb1000
00c13d98	add x8,x8,#0x3c0
00c13d9c	str x9,[x21, #0x8]
00c13da0	mov w10,#0x540
00c13da4	str x8,[x0, #0x10]!
00c13da8	ldurh w9,[x0, #0x9]
00c13dac	mov w8,#0x15
00c13db0	mov w11,#0x18
00c13db4	strb w8,[x0, #0x8]
00c13db8	adrp x8,0x2dd000
00c13dbc	add x8,x8,#0x2f3
00c13dc0	and w9,w9,#0xf000
00c13dc4	str x8,[x0, #0x10]
00c13dc8	orr w8,w9,w10
00c13dcc	ldr x9,[x19]
00c13dd0	sturh w8,[x0, #0x9]
00c13dd4	stp x11,x9,[x0, #0x18]
00c13dd8	ldp x20,x19,[sp, #0x20]
00c13ddc	ldr x21,[sp, #0x10]
00c13de0	ldp x29,x30,[sp], #0x30
00c13de4	autiasp
00c13de8	ret
00c13dec	bl 0x00c2fff0
