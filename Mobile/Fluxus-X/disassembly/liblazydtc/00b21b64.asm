; FUN_00b21b64 @ 00b21b64
00b21b64	stp x20,x19,[sp, #-0x20]!
00b21b68	adrp x1,0x2da000
00b21b6c	mov x19,x0
00b21b70	add x1,x1,#0xac5
00b21b74	mov w0,#0x28
00b21b78	mov w2,#0x32
00b21b7c	stp x29,x30,[sp, #0x10]
00b21b80	add x29,sp,#0x10
00b21b84	bl 0x00c34250
00b21b88	mov x20,x0
00b21b8c	cbz x0,0x00b21b9c
00b21b90	mov x0,x19
00b21b94	bl 0x00c41210
00b21b98	str x0,[x20]
00b21b9c	ldp x29,x30,[sp, #0x10]
00b21ba0	mov x0,x20
00b21ba4	ldp x20,x19,[sp], #0x20
00b21ba8	ret
