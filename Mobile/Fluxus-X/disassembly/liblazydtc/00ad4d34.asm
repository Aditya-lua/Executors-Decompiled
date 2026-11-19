; RSA_padding_add_none @ 00ad4d34
00ad4d34	stp x29,x30,[sp, #-0x10]!
00ad4d38	cmp w3,w1
00ad4d3c	mov x29,sp
00ad4d40	b.le 0x00ad4d6c
00ad4d44	bl 0x00c342a0
00ad4d48	adrp x0,0x2d2000
00ad4d4c	adrp x2,0x2d0000
00ad4d50	add x0,x0,#0x2f3
00ad4d54	add x2,x2,#0x38f
00ad4d58	orr w1,wzr,#0x18
00ad4d5c	bl 0x00c342b0
00ad4d60	mov w0,#0x4
00ad4d64	mov w1,#0x6e
00ad4d68	b 0x00ad4d94
00ad4d6c	b.ge 0x00ad4da8
00ad4d70	bl 0x00c342a0
00ad4d74	adrp x0,0x2d2000
00ad4d78	adrp x2,0x2d0000
00ad4d7c	add x0,x0,#0x2f3
00ad4d80	add x2,x2,#0x38f
00ad4d84	mov w1,#0x1d
00ad4d88	bl 0x00c342b0
00ad4d8c	mov w0,#0x4
00ad4d90	mov w1,#0x7a
00ad4d94	mov x2,xzr
00ad4d98	bl 0x00c342c0
00ad4d9c	mov w0,wzr
00ad4da0	ldp x29,x30,[sp], #0x10
00ad4da4	ret
00ad4da8	mov w8,w3
00ad4dac	mov x1,x2
00ad4db0	mov x2,x8
00ad4db4	bl 0x00c2ffd0
00ad4db8	mov w0,#0x1
00ad4dbc	ldp x29,x30,[sp], #0x10
00ad4dc0	ret
