; LZ4_freeStream @ 008d259c
008d259c	cbz x0,0x008d25b0
008d25a0	stp x29,x30,[sp, #-0x10]!
008d25a4	mov x29,sp
008d25a8	bl 0x00c30960
008d25ac	ldp x29,x30,[sp], #0x10
008d25b0	mov w0,wzr
008d25b4	ret
