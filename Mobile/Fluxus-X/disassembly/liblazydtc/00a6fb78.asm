; FUN_00a6fb78 @ 00a6fb78
00a6fb78	stp x20,x19,[sp, #-0x20]!
00a6fb7c	stp x29,x30,[sp, #0x10]
00a6fb80	ldr w8,[x1]
00a6fb84	add x29,sp,#0x10
00a6fb88	cbnz w8,0x00a6fbac
00a6fb8c	mov x19,x1
00a6fb90	mov x20,x0
00a6fb94	bl 0x00c36490
00a6fb98	str w0,[x19]
00a6fb9c	cbnz w0,0x00a6fbac
00a6fba0	mov x0,x20
00a6fba4	bl 0x00c36480
00a6fba8	str w0,[x19]
00a6fbac	ldp x29,x30,[sp, #0x10]
00a6fbb0	ldp x20,x19,[sp], #0x20
00a6fbb4	ret
