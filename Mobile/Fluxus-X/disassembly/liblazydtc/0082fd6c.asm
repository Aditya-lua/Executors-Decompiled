; FUN_0082fd6c @ 0082fd6c
0082fd6c	stp x29,x30,[sp, #-0x20]!
0082fd70	str x19,[sp, #0x10]
0082fd74	mov x29,sp
0082fd78	mov w1,#0x1
0082fd7c	mov x19,x0
0082fd80	bl 0x008af0d0
0082fd84	mov x0,x19
0082fd88	mov w1,#0x1
0082fd8c	bl 0x008ad4b0
0082fd90	cbnz w0,0x0082fd9c
0082fd94	mov x0,x19
0082fd98	bl 0x008ac024
0082fd9c	mov w0,#0x1
0082fda0	ldr x19,[sp, #0x10]
0082fda4	ldp x29,x30,[sp], #0x20
0082fda8	ret
