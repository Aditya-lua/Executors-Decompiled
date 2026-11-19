; FUN_00a82e80 @ 00a82e80
00a82e80	stp x29,x30,[sp, #-0x10]!
00a82e84	mov x29,sp
00a82e88	bl 0x00a82d1c
00a82e8c	cbz x0,0x00a82e9c
00a82e90	ldrb w8,[x0]
00a82e94	orr w8,w8,#0x1
00a82e98	strb w8,[x0]
00a82e9c	ldp x29,x30,[sp], #0x10
00a82ea0	ret
