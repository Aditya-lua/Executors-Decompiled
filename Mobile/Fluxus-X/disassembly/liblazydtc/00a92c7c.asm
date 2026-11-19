; FUN_00a92c7c @ 00a92c7c
00a92c7c	stp x20,x19,[sp, #-0x20]!
00a92c80	stp x29,x30,[sp, #0x10]
00a92c84	add x29,sp,#0x10
00a92c88	mov x19,x1
00a92c8c	mov x20,x0
00a92c90	bl 0x00c3cea0
00a92c94	str xzr,[x0, #0x80]
00a92c98	mov x0,x20
00a92c9c	bl 0x00c3cea0
00a92ca0	mov x1,x0
00a92ca4	mov x0,x19
00a92ca8	bl 0x00c32090
00a92cac	ldp x29,x30,[sp, #0x10]
00a92cb0	mov w0,#0x1
00a92cb4	ldp x20,x19,[sp], #0x20
00a92cb8	ret
