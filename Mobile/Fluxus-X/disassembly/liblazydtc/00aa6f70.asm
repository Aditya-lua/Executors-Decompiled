; MDC2_Init @ 00aa6f70
00aa6f70	adrp x9,0x29c000
00aa6f74	ldr q0,[x9, #0x70]
00aa6f78	mov w9,#0x1
00aa6f7c	mov x8,x0
00aa6f80	str wzr,[x0]
00aa6f84	str w9,[x0, #0x1c]
00aa6f88	mov w0,#0x1
00aa6f8c	stur q0,[x8, #0xc]
00aa6f90	ret
