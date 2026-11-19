; SSL_CTX_SRP_CTX_init @ 009c8598
009c8598	cbz x0,0x009c85d0
009c859c	str x19,[sp, #-0x20]!
009c85a0	mov x19,x0
009c85a4	add x0,x0,#0x318
009c85a8	mov w2,#0x80
009c85ac	mov w1,wzr
009c85b0	stp x29,x30,[sp, #0x10]
009c85b4	add x29,sp,#0x10
009c85b8	bl 0x00c301c0
009c85bc	mov w8,#0x400
009c85c0	str w8,[x19, #0x388]
009c85c4	ldp x29,x30,[sp, #0x10]
009c85c8	mov w0,#0x1
009c85cc	ldr x19,[sp], #0x20
009c85d0	ret
