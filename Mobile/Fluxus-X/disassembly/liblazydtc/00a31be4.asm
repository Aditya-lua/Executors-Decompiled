; EC_POINT_dbl @ 00a31be4
00a31be4	stp x29,x30,[sp, #-0x10]!
00a31be8	ldr x9,[x0]
00a31bec	mov x29,sp
00a31bf0	ldr x4,[x9, #0xa8]
00a31bf4	cbz x4,0x00a31c50
00a31bf8	ldr x8,[x1]
00a31bfc	cmp x9,x8
00a31c00	b.ne 0x00a31c28
00a31c04	ldr w8,[x0, #0x20]
00a31c08	cbz w8,0x00a31c1c
00a31c0c	ldr w10,[x1, #0x8]
00a31c10	cbz w10,0x00a31c1c
00a31c14	cmp w8,w10
00a31c18	b.ne 0x00a31c28
00a31c1c	ldr x10,[x2]
00a31c20	cmp x9,x10
00a31c24	b.eq 0x00a31c8c
00a31c28	bl 0x00c342a0
00a31c2c	adrp x0,0x29e000
00a31c30	adrp x2,0x2b4000
00a31c34	add x0,x0,#0xa7
00a31c38	add x2,x2,#0x171
00a31c3c	orr w1,wzr,#0x3c0
00a31c40	bl 0x00c342b0
00a31c44	mov w0,#0x10
00a31c48	mov w1,#0x65
00a31c4c	b 0x00a31c78
00a31c50	bl 0x00c342a0
00a31c54	adrp x0,0x29e000
00a31c58	adrp x2,0x2b4000
00a31c5c	add x0,x0,#0xa7
00a31c60	add x2,x2,#0x171
00a31c64	mov w1,#0x3bc
00a31c68	bl 0x00c342b0
00a31c6c	mov w1,#0x101
00a31c70	mov w0,#0x10
00a31c74	movk w1,#0xc, LSL #16
00a31c78	mov x2,xzr
00a31c7c	bl 0x00c342c0
00a31c80	mov w0,wzr
00a31c84	ldp x29,x30,[sp], #0x10
00a31c88	ret
00a31c8c	cbz w8,0x00a31ca0
00a31c90	ldr w9,[x2, #0x8]
00a31c94	cbz w9,0x00a31ca0
00a31c98	cmp w8,w9
00a31c9c	b.ne 0x00a31c28
00a31ca0	ldp x29,x30,[sp], #0x10
00a31ca4	br x4
