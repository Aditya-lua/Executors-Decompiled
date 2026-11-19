; SSL_CTX_set1_cert_store @ 009b7afc
009b7afc	stp x20,x19,[sp, #-0x20]!
009b7b00	mov x19,x1
009b7b04	mov x20,x0
009b7b08	stp x29,x30,[sp, #0x10]
009b7b0c	add x29,sp,#0x10
009b7b10	cbz x1,0x009b7b1c
009b7b14	mov x0,x19
009b7b18	bl 0x00c32c60
009b7b1c	ldr x0,[x20, #0x28]
009b7b20	bl 0x00c32c10
009b7b24	str x19,[x20, #0x28]
009b7b28	ldp x29,x30,[sp, #0x10]
009b7b2c	ldp x20,x19,[sp], #0x20
009b7b30	ret
