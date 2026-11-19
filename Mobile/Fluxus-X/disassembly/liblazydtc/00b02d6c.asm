; FUN_00b02d6c @ 00b02d6c
00b02d6c	str x19,[sp, #-0x20]!
00b02d70	stp x29,x30,[sp, #0x10]
00b02d74	add x29,sp,#0x10
00b02d78	cbz x0,0x00b02de0
00b02d7c	mov x19,x0
00b02d80	ldr x0,[x1, #0x20]
00b02d84	bl 0x00c37750
00b02d88	sub x2,x29,#0x4
00b02d8c	mov x1,xzr
00b02d90	bl 0x00c3ebe0
00b02d94	cbz w0,0x00b02de8
00b02d98	ldur w0,[x29, #-0x4]
00b02d9c	bl 0x00c324f0
00b02da0	mov x1,x0
00b02da4	mov x0,x19
00b02da8	bl 0x00c346e0
00b02dac	mov w8,w0
00b02db0	mov w0,wzr
00b02db4	cbnz w8,0x00b02dec
00b02db8	adrp x1,0x2db000
00b02dbc	add x1,x1,#0x996
00b02dc0	mov x0,x19
00b02dc4	bl 0x00c346e0
00b02dc8	ldur w8,[x29, #-0x4]
00b02dcc	cmp w8,#0x390
00b02dd0	ccmp w0,#0x0,#0x4,eq
00b02dd4	mov w8,#0x4d
00b02dd8	csel w0,wzr,w8,ne
00b02ddc	b 0x00b02dec
00b02de0	orr w0,wzr,#0x18
00b02de4	b 0x00b02dec
00b02de8	mov w0,#0x4c
00b02dec	ldp x29,x30,[sp, #0x10]
00b02df0	ldr x19,[sp], #0x20
00b02df4	ret
