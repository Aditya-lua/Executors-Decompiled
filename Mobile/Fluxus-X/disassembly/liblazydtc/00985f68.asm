; ix::SelectInterruptPipe::getFd @ 00985f68
00985f68	stp x20,x19,[sp, #-0x20]!
00985f6c	stp x29,x30,[sp, #0x10]
00985f70	add x29,sp,#0x10
00985f74	add x20,x0,#0x10
00985f78	mov x19,x0
00985f7c	mov x0,x20
00985f80	bl 0x00c2ff10
00985f84	ldr w19,[x19, #0x8]
00985f88	mov x0,x20
00985f8c	bl 0x00c2ff20
00985f90	ldp x29,x30,[sp, #0x10]
00985f94	mov w0,w19
00985f98	ldp x20,x19,[sp], #0x20
00985f9c	ret
