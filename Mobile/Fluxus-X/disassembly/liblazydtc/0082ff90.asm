; FUN_0082ff90 @ 0082ff90
0082ff90	stp x29,x30,[sp, #-0x20]!
0082ff94	str x19,[sp, #0x10]
0082ff98	mov x29,sp
0082ff9c	mov w1,#0x1
0082ffa0	mov w2,#0x6
0082ffa4	mov x19,x0
0082ffa8	bl 0x008af088
0082ffac	mov x0,x19
0082ffb0	mov w1,#0x2
0082ffb4	bl 0x008ab7b0
0082ffb8	cmp w0,#0x0
0082ffbc	mov x0,x19
0082ffc0	mov w1,#0x1
0082ffc4	cset w2,ne
0082ffc8	bl 0x008ad20c
0082ffcc	mov w0,wzr
0082ffd0	ldr x19,[sp, #0x10]
0082ffd4	ldp x29,x30,[sp], #0x20
0082ffd8	ret
