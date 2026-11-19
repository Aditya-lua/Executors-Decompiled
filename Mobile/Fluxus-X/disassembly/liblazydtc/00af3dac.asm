; FUN_00af3dac @ 00af3dac
00af3dac	stp x22,x21,[sp, #-0x30]!
00af3db0	stp x20,x19,[sp, #0x10]
00af3db4	mov x19,x0
00af3db8	stp x29,x30,[sp, #0x20]
00af3dbc	add x29,sp,#0x20
00af3dc0	cbz x1,0x00af3e54
00af3dc4	mov x0,x1
00af3dc8	mov x20,x1
00af3dcc	bl 0x00c325e0
00af3dd0	cmp w0,#0x1
00af3dd4	b.lt 0x00af3e54
00af3dd8	mov x0,x20
00af3ddc	bl 0x00c325e0
00af3de0	cmp w0,#0x1
00af3de4	b.lt 0x00af3e4c
00af3de8	mov w21,wzr
00af3dec	mov x0,x20
00af3df0	mov w1,w21
00af3df4	bl 0x00c32610
00af3df8	cbz x0,0x00af3e38
00af3dfc	mov x22,x0
00af3e00	mov x0,x19
00af3e04	mov x1,x22
00af3e08	mov x2,xzr
00af3e0c	bl 0x00af3948
00af3e10	cbz w0,0x00af3e6c
00af3e14	mov x0,x22
00af3e18	bl 0x00c32c80
00af3e1c	mov x2,x0
00af3e20	mov w3,#0x2000
00af3e24	mov w4,#0x8
00af3e28	mov x0,x19
00af3e2c	mov x1,xzr
00af3e30	bl 0x00c3f080
00af3e34	cbz w0,0x00af3e6c
00af3e38	mov x0,x20
00af3e3c	add w21,w21,#0x1
00af3e40	bl 0x00c325e0
00af3e44	cmp w21,w0
00af3e48	b.lt 0x00af3dec
00af3e4c	mov w0,#0x1
00af3e50	b 0x00af3e6c
00af3e54	adrp x1,0x2c0000
00af3e58	add x1,x1,#0x5dc
00af3e5c	mov x0,x19
00af3e60	bl 0x00c32250
00af3e64	lsr w8,w0,#0x1f
00af3e68	eor w0,w8,#0x1
00af3e6c	ldp x29,x30,[sp, #0x20]
00af3e70	ldp x20,x19,[sp, #0x10]
00af3e74	ldp x22,x21,[sp], #0x30
00af3e78	ret
