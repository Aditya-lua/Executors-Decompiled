; FUN_00931d94 @ 00931d94
00931d94	stp x22,x21,[sp, #-0x30]!
00931d98	stp x20,x19,[sp, #0x10]
00931d9c	stp x29,x30,[sp, #0x20]
00931da0	add x29,sp,#0x20
00931da4	mov w19,w1
00931da8	mov x20,x0
00931dac	bl 0x00941cb8
00931db0	mov x21,x0
00931db4	mov x22,x1
00931db8	mov x0,x20
00931dbc	mov w1,w19
00931dc0	mov x2,x21
00931dc4	mov x3,x22
00931dc8	bl 0x00931c7c
00931dcc	ldp x29,x30,[sp, #0x20]
00931dd0	ldp x20,x19,[sp, #0x10]
00931dd4	mov x0,x21
00931dd8	mov x1,x22
00931ddc	ldp x22,x21,[sp], #0x30
00931de0	ret
