; ssl_cert_add1_chain_cert @ 009ac72c
009ac72c	str x19,[sp, #-0x20]!
009ac730	stp x29,x30,[sp, #0x10]
009ac734	add x29,sp,#0x10
009ac738	mov x19,x2
009ac73c	bl 0x009ac67c
009ac740	cbz w0,0x009ac750
009ac744	mov x0,x19
009ac748	bl 0x00c350b0
009ac74c	mov w0,#0x1
009ac750	ldp x29,x30,[sp, #0x10]
009ac754	ldr x19,[sp], #0x20
009ac758	ret
