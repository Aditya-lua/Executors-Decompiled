; SSL_CTX_set_default_verify_store @ 009b789c
009b789c	stp x20,x19,[sp, #-0x20]!
009b78a0	stp x29,x30,[sp, #0x10]
009b78a4	ldr x20,[x0, #0x28]
009b78a8	add x29,sp,#0x10
009b78ac	mov x19,x0
009b78b0	bl 0x00c35b40
009b78b4	mov x1,x0
009b78b8	mov x0,x20
009b78bc	bl 0x00c32c00
009b78c0	cbz x0,0x009b78f4
009b78c4	mov x20,x0
009b78c8	bl 0x00c35250
009b78cc	ldr x5,[x19]
009b78d0	ldr x6,[x19, #0x440]
009b78d4	orr w1,wzr,#0x3
009b78d8	mov x0,x20
009b78dc	mov x2,xzr
009b78e0	mov x3,xzr
009b78e4	mov x4,xzr
009b78e8	bl 0x00c35b20
009b78ec	bl 0x00c35240
009b78f0	mov w0,#0x1
009b78f4	ldp x29,x30,[sp, #0x10]
009b78f8	ldp x20,x19,[sp], #0x20
009b78fc	ret
