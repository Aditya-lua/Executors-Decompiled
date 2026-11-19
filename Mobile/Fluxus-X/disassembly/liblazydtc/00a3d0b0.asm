; FUN_00a3d0b0 @ 00a3d0b0
00a3d0b0	stp x20,x19,[sp, #-0x20]!
00a3d0b4	mov w0,#0x43f
00a3d0b8	stp x29,x30,[sp, #0x10]
00a3d0bc	add x29,sp,#0x10
00a3d0c0	mov x19,x4
00a3d0c4	mov x20,x3
00a3d0c8	bl 0x00c37740
00a3d0cc	mov x1,x0
00a3d0d0	mov w2,#0xffffffff
00a3d0d4	mov x0,x20
00a3d0d8	mov x3,xzr
00a3d0dc	bl 0x00c37ee0
00a3d0e0	cbz x19,0x00a3d100
00a3d0e4	mov w0,#0x43f
00a3d0e8	bl 0x00c37740
00a3d0ec	mov x1,x0
00a3d0f0	mov w2,#0xffffffff
00a3d0f4	mov x0,x19
00a3d0f8	mov x3,xzr
00a3d0fc	bl 0x00c37ee0
00a3d100	ldp x29,x30,[sp, #0x10]
00a3d104	orr w0,wzr,#0x3
00a3d108	ldp x20,x19,[sp], #0x20
00a3d10c	ret
