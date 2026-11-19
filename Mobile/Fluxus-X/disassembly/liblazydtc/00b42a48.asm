; FUN_00b42a48 @ 00b42a48
00b42a48	stp x20,x19,[sp, #-0x20]!
00b42a4c	stp x29,x30,[sp, #0x10]
00b42a50	add x29,sp,#0x10
00b42a54	mov x19,x0
00b42a58	bl 0x00c41000
00b42a5c	cbz w0,0x00b42a90
00b42a60	adrp x1,0x2ce000
00b42a64	add x1,x1,#0x8d0
00b42a68	mov w0,#0x48
00b42a6c	mov w2,#0x58
00b42a70	bl 0x00c34250
00b42a74	mov x20,x0
00b42a78	cbz x0,0x00b42a94
00b42a7c	mov x0,x19
00b42a80	bl 0x00c41210
00b42a84	str x0,[x20]
00b42a88	str wzr,[x20, #0x1c]
00b42a8c	b 0x00b42a94
00b42a90	mov x20,xzr
00b42a94	ldp x29,x30,[sp, #0x10]
00b42a98	mov x0,x20
00b42a9c	ldp x20,x19,[sp], #0x20
00b42aa0	ret
