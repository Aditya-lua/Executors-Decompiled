; FUN_00b29c74 @ 00b29c74
00b29c74	stp x20,x19,[sp, #-0x20]!
00b29c78	mov x19,x5
00b29c7c	mov x5,xzr
00b29c80	stp x29,x30,[sp, #0x10]
00b29c84	add x29,sp,#0x10
00b29c88	mov x20,x0
00b29c8c	bl 0x00c41240
00b29c90	cbz w0,0x00b29ca8
00b29c94	ldp x29,x30,[sp, #0x10]
00b29c98	mov x0,x20
00b29c9c	mov x1,x19
00b29ca0	ldp x20,x19,[sp], #0x20
00b29ca4	b 0x00b29d70
00b29ca8	ldp x29,x30,[sp, #0x10]
00b29cac	ldp x20,x19,[sp], #0x20
00b29cb0	ret
