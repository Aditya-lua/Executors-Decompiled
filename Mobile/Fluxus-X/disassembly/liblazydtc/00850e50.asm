; FUN_00850e50 @ 00850e50
00850e50	stp x29,x30,[sp, #-0x20]!
00850e54	stp x20,x19,[sp, #0x10]
00850e58	mov x29,sp
00850e5c	ldr x8,[x1]
00850e60	mov x20,x0
00850e64	mov x19,x1
00850e68	mov x0,x1
00850e6c	mov x1,x20
00850e70	ldr x8,[x8, #0x1b0]
00850e74	blr x8
00850e78	tbz w0,#0x0,0x00850e98
00850e7c	ldr x0,[x20, #0x20]
00850e80	ldr x8,[x0]
00850e84	ldr x2,[x8]
00850e88	mov x1,x19
00850e8c	ldp x20,x19,[sp, #0x10]
00850e90	ldp x29,x30,[sp], #0x20
00850e94	br x2
00850e98	ldp x20,x19,[sp, #0x10]
00850e9c	ldp x29,x30,[sp], #0x20
00850ea0	ret
