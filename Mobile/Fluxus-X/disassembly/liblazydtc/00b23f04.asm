; FUN_00b23f04 @ 00b23f04
00b23f04	stp x20,x19,[sp, #-0x20]!
00b23f08	mov x19,x5
00b23f0c	mov x5,xzr
00b23f10	stp x29,x30,[sp, #0x10]
00b23f14	add x29,sp,#0x10
00b23f18	mov x20,x0
00b23f1c	bl 0x00c41240
00b23f20	cbz w0,0x00b23f38
00b23f24	ldp x29,x30,[sp, #0x10]
00b23f28	mov x0,x20
00b23f2c	mov x1,x19
00b23f30	ldp x20,x19,[sp], #0x20
00b23f34	b 0x00b24000
00b23f38	ldp x29,x30,[sp, #0x10]
00b23f3c	ldp x20,x19,[sp], #0x20
00b23f40	ret
