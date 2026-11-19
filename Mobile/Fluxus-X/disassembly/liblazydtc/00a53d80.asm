; ENGINE_register_all_RSA @ 00a53d80
00a53d80	stp x22,x21,[sp, #-0x30]!
00a53d84	stp x20,x19,[sp, #0x10]
00a53d88	stp x29,x30,[sp, #0x20]
00a53d8c	add x29,sp,#0x20
00a53d90	bl 0x00c32380
00a53d94	cbz x0,0x00a53de8
00a53d98	adrp x20,0xd21000
00a53d9c	adrp x21,0xa53000
00a53da0	adrp x22,0x766000
00a53da4	mov x19,x0
00a53da8	add x20,x20,#0xa10
00a53dac	add x21,x21,#0xd74
00a53db0	add x22,x22,#0x10
00a53db4	ldr x8,[x19, #0x10]
00a53db8	cbz x8,0x00a53dd8
00a53dbc	mov w4,#0x1
00a53dc0	mov x0,x20
00a53dc4	mov x1,x21
00a53dc8	mov x2,x19
00a53dcc	mov x3,x22
00a53dd0	mov w5,wzr
00a53dd4	bl 0x00c3bce0
00a53dd8	mov x0,x19
00a53ddc	bl 0x00c323a0
00a53de0	mov x19,x0
00a53de4	cbnz x0,0x00a53db4
00a53de8	ldp x29,x30,[sp, #0x20]
00a53dec	ldp x20,x19,[sp, #0x10]
00a53df0	ldp x22,x21,[sp], #0x30
00a53df4	ret
