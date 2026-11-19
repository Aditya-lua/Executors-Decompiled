; DH_check_ex @ 00a19c54
00a19c54	sub sp,sp,#0x20
00a19c58	stp x29,x30,[sp, #0x10]
00a19c5c	add x29,sp,#0x10
00a19c60	sub x1,x29,#0x4
00a19c64	stur wzr,[x29, #-0x4]
00a19c68	bl 0x00a19e80
00a19c6c	cbz w0,0x00a19cd0
00a19c70	ldur w8,[x29, #-0x4]
00a19c74	tbnz w8,#0x3,0x00a19cdc
00a19c78	tbnz w8,#0x4,0x00a19d10
00a19c7c	tbnz w8,#0x5,0x00a19d44
00a19c80	tbnz w8,#0x6,0x00a19d78
00a19c84	tbnz w8,#0x2,0x00a19dac
00a19c88	tbnz w8,#0x0,0x00a19de0
00a19c8c	tbnz w8,#0x1,0x00a19e14
00a19c90	tbnz w8,#0x7,0x00a19e48
00a19c94	tbz w8,#0x8,0x00a19cc8
00a19c98	bl 0x00c342a0
00a19c9c	adrp x0,0x2d9000
00a19ca0	adrp x2,0x2b9000
00a19ca4	add x0,x0,#0xa63
00a19ca8	add x2,x2,#0xbb0
00a19cac	mov w1,#0x87
00a19cb0	bl 0x00c342b0
00a19cb4	mov w0,#0x5
00a19cb8	mov w1,#0x67
00a19cbc	mov x2,xzr
00a19cc0	bl 0x00c342c0
00a19cc4	ldur w8,[x29, #-0x4]
00a19cc8	cmp w8,#0x0
00a19ccc	cset w0,eq
00a19cd0	ldp x29,x30,[sp, #0x10]
00a19cd4	add sp,sp,#0x20
00a19cd8	ret
00a19cdc	bl 0x00c342a0
00a19ce0	adrp x0,0x2d9000
00a19ce4	adrp x2,0x2b9000
00a19ce8	add x0,x0,#0xa63
00a19cec	add x2,x2,#0xbb0
00a19cf0	mov w1,#0x77
00a19cf4	bl 0x00c342b0
00a19cf8	mov w0,#0x5
00a19cfc	orr w1,wzr,#0x78
00a19d00	mov x2,xzr
00a19d04	bl 0x00c342c0
00a19d08	ldur w8,[x29, #-0x4]
00a19d0c	tbz w8,#0x4,0x00a19c7c
00a19d10	bl 0x00c342a0
00a19d14	adrp x0,0x2d9000
00a19d18	adrp x2,0x2b9000
00a19d1c	add x0,x0,#0xa63
00a19d20	add x2,x2,#0xbb0
00a19d24	mov w1,#0x79
00a19d28	bl 0x00c342b0
00a19d2c	mov w0,#0x5
00a19d30	mov w1,#0x77
00a19d34	mov x2,xzr
00a19d38	bl 0x00c342c0
00a19d3c	ldur w8,[x29, #-0x4]
00a19d40	tbz w8,#0x5,0x00a19c80
00a19d44	bl 0x00c342a0
00a19d48	adrp x0,0x2d9000
00a19d4c	adrp x2,0x2b9000
00a19d50	add x0,x0,#0xa63
00a19d54	add x2,x2,#0xbb0
00a19d58	mov w1,#0x7b
00a19d5c	bl 0x00c342b0
00a19d60	mov w0,#0x5
00a19d64	mov w1,#0x74
00a19d68	mov x2,xzr
00a19d6c	bl 0x00c342c0
00a19d70	ldur w8,[x29, #-0x4]
00a19d74	tbz w8,#0x6,0x00a19c84
00a19d78	bl 0x00c342a0
00a19d7c	adrp x0,0x2d9000
00a19d80	adrp x2,0x2b9000
00a19d84	add x0,x0,#0xa63
00a19d88	add x2,x2,#0xbb0
00a19d8c	mov w1,#0x7d
00a19d90	bl 0x00c342b0
00a19d94	mov w0,#0x5
00a19d98	mov w1,#0x73
00a19d9c	mov x2,xzr
00a19da0	bl 0x00c342c0
00a19da4	ldur w8,[x29, #-0x4]
00a19da8	tbz w8,#0x2,0x00a19c88
00a19dac	bl 0x00c342a0
00a19db0	adrp x0,0x2d9000
00a19db4	adrp x2,0x2b9000
00a19db8	add x0,x0,#0xa63
00a19dbc	add x2,x2,#0xbb0
00a19dc0	orr w1,wzr,#0x7f
00a19dc4	bl 0x00c342b0
00a19dc8	mov w0,#0x5
00a19dcc	mov w1,#0x79
00a19dd0	mov x2,xzr
00a19dd4	bl 0x00c342c0
00a19dd8	ldur w8,[x29, #-0x4]
00a19ddc	tbz w8,#0x0,0x00a19c8c
00a19de0	bl 0x00c342a0
00a19de4	adrp x0,0x2d9000
00a19de8	adrp x2,0x2b9000
00a19dec	add x0,x0,#0xa63
00a19df0	add x2,x2,#0xbb0
00a19df4	mov w1,#0x81
00a19df8	bl 0x00c342b0
00a19dfc	mov w0,#0x5
00a19e00	mov w1,#0x75
00a19e04	mov x2,xzr
00a19e08	bl 0x00c342c0
00a19e0c	ldur w8,[x29, #-0x4]
00a19e10	tbz w8,#0x1,0x00a19c90
00a19e14	bl 0x00c342a0
00a19e18	adrp x0,0x2d9000
00a19e1c	adrp x2,0x2b9000
00a19e20	add x0,x0,#0xa63
00a19e24	add x2,x2,#0xbb0
00a19e28	mov w1,#0x83
00a19e2c	bl 0x00c342b0
00a19e30	mov w0,#0x5
00a19e34	mov w1,#0x76
00a19e38	mov x2,xzr
00a19e3c	bl 0x00c342c0
00a19e40	ldur w8,[x29, #-0x4]
00a19e44	tbz w8,#0x7,0x00a19c94
00a19e48	bl 0x00c342a0
00a19e4c	adrp x0,0x2d9000
00a19e50	adrp x2,0x2b9000
00a19e54	add x0,x0,#0xa63
00a19e58	add x2,x2,#0xbb0
00a19e5c	mov w1,#0x85
00a19e60	bl 0x00c342b0
00a19e64	mov w0,#0x5
00a19e68	orr w1,wzr,#0x7e
00a19e6c	mov x2,xzr
00a19e70	bl 0x00c342c0
00a19e74	ldur w8,[x29, #-0x4]
00a19e78	tbnz w8,#0x8,0x00a19c98
00a19e7c	b 0x00a19cc8
