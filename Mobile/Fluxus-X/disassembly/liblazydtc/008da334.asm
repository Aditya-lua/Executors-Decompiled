; LZ4_freeStreamDecode @ 008da334
008da334	cbz x0,0x008da348
008da338	stp x29,x30,[sp, #-0x10]!
008da33c	mov x29,sp
008da340	bl 0x00c30960
008da344	ldp x29,x30,[sp], #0x10
008da348	mov w0,wzr
008da34c	ret
