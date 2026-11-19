; FUN_00b25e70 @ 00b25e70
00b25e70	stp x29,x30,[sp, #-0x10]!
00b25e74	mov x9,x0
00b25e78	add x0,x0,#0x18
00b25e7c	mov x29,sp
00b25e80	cbz x2,0x00b25ea4
00b25e84	mov x8,x1
00b25e88	cbz x1,0x00b25eb8
00b25e8c	ldrb w9,[x9, #0x4]
00b25e90	tbnz w9,#0x0,0x00b25ed4
00b25e94	mov x1,x2
00b25e98	mov x2,x8
00b25e9c	bl 0x00c3edb0
00b25ea0	b 0x00b25ee0
00b25ea4	bl 0x00c3edd0
00b25ea8	cmp w0,#0x0
00b25eac	cset w0,eq
00b25eb0	ldp x29,x30,[sp], #0x10
00b25eb4	ret
00b25eb8	mov x1,x2
00b25ebc	mov x2,x3
00b25ec0	bl 0x00c3ed80
00b25ec4	cmp w0,#0x1
00b25ec8	cset w0,eq
00b25ecc	ldp x29,x30,[sp], #0x10
00b25ed0	ret
00b25ed4	mov x1,x2
00b25ed8	mov x2,x8
00b25edc	bl 0x00c3edc0
00b25ee0	cmp w0,#0x0
00b25ee4	cset w0,gt
00b25ee8	ldp x29,x30,[sp], #0x10
00b25eec	ret
