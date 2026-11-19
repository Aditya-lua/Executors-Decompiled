; FUN_00af7d64 @ 00af7d64
00af7d64	sub sp,sp,#0x80
00af7d68	stp x22,x21,[sp, #0x50]
00af7d6c	stp x20,x19,[sp, #0x60]
00af7d70	mov w19,w2
00af7d74	mov x21,x0
00af7d78	mov w0,#0x1
00af7d7c	stp x24,x23,[sp, #0x40]
00af7d80	stp x29,x30,[sp, #0x70]
00af7d84	add x29,sp,#0x70
00af7d88	cbz x1,0x00af7e64
00af7d8c	mov x20,x1
00af7d90	cmp x21,x1
00af7d94	b.eq 0x00af7e64
00af7d98	cbz x21,0x00af7e58
00af7d9c	mov x0,x20
00af7da0	bl 0x00c325e0
00af7da4	cmp w0,#0x1
00af7da8	b.lt 0x00af7e60
00af7dac	mov w22,wzr
00af7db0	mov w23,wzr
00af7db4	sxtw x24,w19
00af7db8	mov x0,x20
00af7dbc	mov w1,w22
00af7dc0	bl 0x00c32610
00af7dc4	add x1,sp,#0x10
00af7dc8	mov x2,sp
00af7dcc	mov w3,w19
00af7dd0	bl 0x00af66d8
00af7dd4	cbnz w0,0x00af7de0
00af7dd8	b 0x00af7e64
00af7ddc	add w23,w23,#0x1
00af7de0	mov x0,x21
00af7de4	bl 0x00c325e0
00af7de8	cmp w23,w0
00af7dec	b.ge 0x00af7e58
00af7df0	mov x0,x21
00af7df4	mov w1,w23
00af7df8	bl 0x00c32610
00af7dfc	add x1,sp,#0x30
00af7e00	add x2,sp,#0x20
00af7e04	mov w3,w19
00af7e08	bl 0x00af66d8
00af7e0c	cbz w0,0x00af7e64
00af7e10	add x0,sp,#0x20
00af7e14	mov x1,sp
00af7e18	mov x2,x24
00af7e1c	bl 0x00c300b0
00af7e20	tbnz w0,#0x1f,0x00af7ddc
00af7e24	add x0,sp,#0x30
00af7e28	add x1,sp,#0x10
00af7e2c	mov x2,x24
00af7e30	bl 0x00c300b0
00af7e34	cmp w0,#0x0
00af7e38	b.gt 0x00af7e58
00af7e3c	mov x0,x20
00af7e40	add w22,w22,#0x1
00af7e44	bl 0x00c325e0
00af7e48	cmp w22,w0
00af7e4c	mov w0,#0x1
00af7e50	b.lt 0x00af7db8
00af7e54	b 0x00af7e64
00af7e58	mov w0,wzr
00af7e5c	b 0x00af7e64
00af7e60	mov w0,#0x1
00af7e64	ldp x29,x30,[sp, #0x70]
00af7e68	ldp x20,x19,[sp, #0x60]
00af7e6c	ldp x22,x21,[sp, #0x50]
00af7e70	ldp x24,x23,[sp, #0x40]
00af7e74	add sp,sp,#0x80
00af7e78	ret
