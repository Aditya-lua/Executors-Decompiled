; EC_POINT_invert @ 00a31ca8
00a31ca8	stp x29,x30,[sp, #-0x10]!
00a31cac	ldr x8,[x0]
00a31cb0	mov x29,sp
00a31cb4	ldr x3,[x8, #0xb0]
00a31cb8	cbz x3,0x00a31cf0
00a31cbc	ldr x9,[x1]
00a31cc0	cmp x8,x9
00a31cc4	b.eq 0x00a31d2c
00a31cc8	bl 0x00c342a0
00a31ccc	adrp x0,0x29e000
00a31cd0	adrp x2,0x2b7000
00a31cd4	add x0,x0,#0xa7
00a31cd8	add x2,x2,#0xab8
00a31cdc	mov w1,#0x3cd
00a31ce0	bl 0x00c342b0
00a31ce4	mov w0,#0x10
00a31ce8	mov w1,#0x65
00a31cec	b 0x00a31d18
00a31cf0	bl 0x00c342a0
00a31cf4	adrp x0,0x29e000
00a31cf8	adrp x2,0x2b7000
00a31cfc	add x0,x0,#0xa7
00a31d00	add x2,x2,#0xab8
00a31d04	mov w1,#0x3c9
00a31d08	bl 0x00c342b0
00a31d0c	mov w1,#0x101
00a31d10	mov w0,#0x10
00a31d14	movk w1,#0xc, LSL #16
00a31d18	mov x2,xzr
00a31d1c	bl 0x00c342c0
00a31d20	mov w0,wzr
00a31d24	ldp x29,x30,[sp], #0x10
00a31d28	ret
00a31d2c	ldr w8,[x0, #0x20]
00a31d30	cbz w8,0x00a31d44
00a31d34	ldr w9,[x1, #0x8]
00a31d38	cbz w9,0x00a31d44
00a31d3c	cmp w8,w9
00a31d40	b.ne 0x00a31cc8
00a31d44	ldp x29,x30,[sp], #0x10
00a31d48	br x3
