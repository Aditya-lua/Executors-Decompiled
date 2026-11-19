; EC_POINTs_make_affine @ 00a31df0
00a31df0	stp x29,x30,[sp, #-0x10]!
00a31df4	ldr x8,[x0]
00a31df8	mov x29,sp
00a31dfc	ldr x4,[x8, #0xd8]
00a31e00	cbz x4,0x00a31e48
00a31e04	cbz x1,0x00a31e40
00a31e08	mov x9,xzr
00a31e0c	ldr x10,[x2, x9, LSL #0x3]
00a31e10	ldr x11,[x10]
00a31e14	cmp x8,x11
00a31e18	b.ne 0x00a31e74
00a31e1c	ldr w11,[x0, #0x20]
00a31e20	cbz w11,0x00a31e34
00a31e24	ldr w10,[x10, #0x8]
00a31e28	cbz w10,0x00a31e34
00a31e2c	cmp w11,w10
00a31e30	b.ne 0x00a31e74
00a31e34	add x9,x9,#0x1
00a31e38	cmp x9,x1
00a31e3c	b.cc 0x00a31e0c
00a31e40	ldp x29,x30,[sp], #0x10
00a31e44	br x4
00a31e48	bl 0x00c342a0
00a31e4c	adrp x0,0x29e000
00a31e50	adrp x2,0x2b5000
00a31e54	add x0,x0,#0xa7
00a31e58	add x2,x2,#0xbb1
00a31e5c	mov w1,#0x417
00a31e60	bl 0x00c342b0
00a31e64	mov w1,#0x101
00a31e68	mov w0,#0x10
00a31e6c	movk w1,#0xc, LSL #16
00a31e70	b 0x00a31e98
00a31e74	bl 0x00c342a0
00a31e78	adrp x0,0x29e000
00a31e7c	adrp x2,0x2b5000
00a31e80	add x0,x0,#0xa7
00a31e84	add x2,x2,#0xbb1
00a31e88	mov w1,#0x41c
00a31e8c	bl 0x00c342b0
00a31e90	mov w0,#0x10
00a31e94	mov w1,#0x65
00a31e98	mov x2,xzr
00a31e9c	bl 0x00c342c0
00a31ea0	mov w0,wzr
00a31ea4	ldp x29,x30,[sp], #0x10
00a31ea8	ret
