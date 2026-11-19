; EC_POINT_make_affine @ 00a31d4c
00a31d4c	stp x29,x30,[sp, #-0x10]!
00a31d50	ldr x8,[x0]
00a31d54	mov x29,sp
00a31d58	ldr x3,[x8, #0xd0]
00a31d5c	cbz x3,0x00a31d94
00a31d60	ldr x9,[x1]
00a31d64	cmp x8,x9
00a31d68	b.eq 0x00a31dd0
00a31d6c	bl 0x00c342a0
00a31d70	adrp x0,0x29e000
00a31d74	adrp x2,0x2cf000
00a31d78	add x0,x0,#0xa7
00a31d7c	add x2,x2,#0xa8f
00a31d80	mov w1,#0x40b
00a31d84	bl 0x00c342b0
00a31d88	mov w0,#0x10
00a31d8c	mov w1,#0x65
00a31d90	b 0x00a31dbc
00a31d94	bl 0x00c342a0
00a31d98	adrp x0,0x29e000
00a31d9c	adrp x2,0x2cf000
00a31da0	add x0,x0,#0xa7
00a31da4	add x2,x2,#0xa8f
00a31da8	mov w1,#0x407
00a31dac	bl 0x00c342b0
00a31db0	mov w1,#0x101
00a31db4	mov w0,#0x10
00a31db8	movk w1,#0xc, LSL #16
00a31dbc	mov x2,xzr
00a31dc0	bl 0x00c342c0
00a31dc4	mov w0,wzr
00a31dc8	ldp x29,x30,[sp], #0x10
00a31dcc	ret
00a31dd0	ldr w8,[x0, #0x20]
00a31dd4	cbz w8,0x00a31de8
00a31dd8	ldr w9,[x1, #0x8]
00a31ddc	cbz w9,0x00a31de8
00a31de0	cmp w8,w9
00a31de4	b.ne 0x00a31d6c
00a31de8	ldp x29,x30,[sp], #0x10
00a31dec	br x3
