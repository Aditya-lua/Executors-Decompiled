; SSL_CTX_set0_ctlog_store @ 009b87e8
009b87e8	stp x20,x19,[sp, #-0x20]!
009b87ec	stp x29,x30,[sp, #0x10]
009b87f0	mov x19,x0
009b87f4	ldr x0,[x0, #0x1c8]
009b87f8	add x29,sp,#0x10
009b87fc	mov x20,x1
009b8800	bl 0x00c35730
009b8804	str x20,[x19, #0x1c8]
009b8808	ldp x29,x30,[sp, #0x10]
009b880c	ldp x20,x19,[sp], #0x20
009b8810	ret
