; ssl_ctx_srp_ctx_init_intern @ 009c855c
009c855c	cbz x0,0x009c8594
009c8560	str x19,[sp, #-0x20]!
009c8564	mov x19,x0
009c8568	add x0,x0,#0x318
009c856c	mov w2,#0x80
009c8570	mov w1,wzr
009c8574	stp x29,x30,[sp, #0x10]
009c8578	add x29,sp,#0x10
009c857c	bl 0x00c301c0
009c8580	mov w8,#0x400
009c8584	str w8,[x19, #0x388]
009c8588	ldp x29,x30,[sp, #0x10]
009c858c	mov w0,#0x1
009c8590	ldr x19,[sp], #0x20
009c8594	ret
