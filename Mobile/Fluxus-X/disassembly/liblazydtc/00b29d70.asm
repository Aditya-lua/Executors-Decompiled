; FUN_00b29d70 @ 00b29d70
00b29d70	stp x20,x19,[sp, #-0x20]!
00b29d74	mov x19,x1
00b29d78	adrp x1,0x2bc000
00b29d7c	mov x20,x0
00b29d80	add x1,x1,#0x8b5
00b29d84	mov x0,x19
00b29d88	stp x29,x30,[sp, #0x10]
00b29d8c	add x29,sp,#0x10
00b29d90	bl 0x00c36530
00b29d94	cbz x0,0x00b29db4
00b29d98	ldr w8,[x0, #0x8]
00b29d9c	cmp w8,#0x4
00b29da0	b.ne 0x00b29dc8
00b29da4	ldr x0,[x0, #0x10]
00b29da8	bl 0x00c41230
00b29dac	tbnz w0,#0x1f,0x00b29dc8
00b29db0	str w0,[x20, #0x68]
00b29db4	ldp x29,x30,[sp, #0x10]
00b29db8	mov x0,x20
00b29dbc	mov x1,x19
00b29dc0	ldp x20,x19,[sp], #0x20
00b29dc4	b 0x00c412a0
00b29dc8	bl 0x00c342a0
00b29dcc	adrp x0,0x2a0000
00b29dd0	adrp x2,0x2ce000
00b29dd4	add x0,x0,#0xf3d
00b29dd8	add x2,x2,#0x7db
00b29ddc	mov w1,#0x55
00b29de0	bl 0x00c342b0
00b29de4	mov w0,#0x39
00b29de8	mov w1,#0x68
00b29dec	mov x2,xzr
00b29df0	bl 0x00c342c0
00b29df4	ldp x29,x30,[sp, #0x10]
00b29df8	mov w0,wzr
00b29dfc	ldp x20,x19,[sp], #0x20
00b29e00	ret
