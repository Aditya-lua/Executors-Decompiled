; X509v3_get_ext_count @ 00b0d25c
00b0d25c	cbz x0,0x00b0d274
00b0d260	stp x29,x30,[sp, #-0x10]!
00b0d264	mov x29,sp
00b0d268	bl 0x00c325e0
00b0d26c	bic w0,w0,w0, ASR #0x1f
00b0d270	ldp x29,x30,[sp], #0x10
00b0d274	ret
