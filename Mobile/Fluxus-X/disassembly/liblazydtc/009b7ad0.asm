; SSL_CTX_set_cert_store @ 009b7ad0
009b7ad0	stp x20,x19,[sp, #-0x20]!
009b7ad4	stp x29,x30,[sp, #0x10]
009b7ad8	mov x19,x0
009b7adc	ldr x0,[x0, #0x28]
009b7ae0	add x29,sp,#0x10
009b7ae4	mov x20,x1
009b7ae8	bl 0x00c32c10
009b7aec	str x20,[x19, #0x28]
009b7af0	ldp x29,x30,[sp, #0x10]
009b7af4	ldp x20,x19,[sp], #0x20
009b7af8	ret
