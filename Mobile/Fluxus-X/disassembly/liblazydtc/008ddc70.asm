; FUN_008ddc70 @ 008ddc70
008ddc70	stp x29,x30,[sp, #-0x20]!
008ddc74	stp x20,x19,[sp, #0x10]
008ddc78	mov x29,sp
008ddc7c	mov x19,x0
008ddc80	mov w0,#0x888
008ddc84	bl 0x00c2fed0
008ddc88	mov w1,wzr
008ddc8c	mov w2,#0x888
008ddc90	mov x20,x0
008ddc94	bl 0x00c301c0
008ddc98	mov x0,x20
008ddc9c	bl 0x008df570
008ddca0	str x20,[x19]
008ddca4	ldp x20,x19,[sp, #0x10]
008ddca8	ldp x29,x30,[sp], #0x20
008ddcac	ret
