; FUN_00b76e84 @ 00b76e84
00b76e84	stp x20,x19,[sp, #-0x20]!
00b76e88	stp x29,x30,[sp, #0x10]
00b76e8c	add x29,sp,#0x10
00b76e90	mov x0,x1
00b76e94	mov w1,#0x2a
00b76e98	mov x19,x3
00b76e9c	mov x20,x2
00b76ea0	bl 0x00c301c0
00b76ea4	str x20,[x19]
00b76ea8	ldp x29,x30,[sp, #0x10]
00b76eac	mov w0,wzr
00b76eb0	ldp x20,x19,[sp], #0x20
00b76eb4	ret
