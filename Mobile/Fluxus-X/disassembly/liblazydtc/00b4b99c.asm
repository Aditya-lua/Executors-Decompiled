; FUN_00b4b99c @ 00b4b99c
00b4b99c	stp x20,x19,[sp, #-0x20]!
00b4b9a0	adrp x1,0x2b6000
00b4b9a4	mov x20,x0
00b4b9a8	add x1,x1,#0x98e
00b4b9ac	orr w0,wzr,#0x18
00b4b9b0	mov w2,#0x55
00b4b9b4	stp x29,x30,[sp, #0x10]
00b4b9b8	add x29,sp,#0x10
00b4b9bc	bl 0x00c34250
00b4b9c0	mov x19,x0
00b4b9c4	cbz x0,0x00b4b9dc
00b4b9c8	mov x0,x20
00b4b9cc	bl 0x00c41210
00b4b9d0	mov w8,#0xffffffff
00b4b9d4	str x0,[x19]
00b4b9d8	str w8,[x19, #0x10]
00b4b9dc	ldp x29,x30,[sp, #0x10]
00b4b9e0	mov x0,x19
00b4b9e4	ldp x20,x19,[sp], #0x20
00b4b9e8	ret
