; LZ4_createStream @ 008d24dc
008d24dc	stp x29,x30,[sp, #-0x10]!
008d24e0	mov x29,sp
008d24e4	mov w0,#0x4020
008d24e8	bl 0x00c308d0
008d24ec	cbz x0,0x008d2508
008d24f0	and x8,x0,#0x7
008d24f4	cbnz x8,0x008d2508
008d24f8	mov w1,wzr
008d24fc	mov w2,#0x4020
008d2500	ldp x29,x30,[sp], #0x10
008d2504	b 0x00c301c0
008d2508	ldp x29,x30,[sp], #0x10
008d250c	ret
