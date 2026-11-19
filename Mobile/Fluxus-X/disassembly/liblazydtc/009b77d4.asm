; SSL_CTX_set_default_verify_dir @ 009b77d4
009b77d4	str x19,[sp, #-0x20]!
009b77d8	stp x29,x30,[sp, #0x10]
009b77dc	ldr x19,[x0, #0x28]
009b77e0	add x29,sp,#0x10
009b77e4	bl 0x00c35b30
009b77e8	mov x1,x0
009b77ec	mov x0,x19
009b77f0	bl 0x00c32c00
009b77f4	cbz x0,0x009b7820
009b77f8	mov x19,x0
009b77fc	bl 0x00c35250
009b7800	mov w1,#0x2
009b7804	orr w3,wzr,#0x3
009b7808	mov x0,x19
009b780c	mov x2,xzr
009b7810	mov x4,xzr
009b7814	bl 0x00c35b10
009b7818	bl 0x00c35240
009b781c	mov w0,#0x1
009b7820	ldp x29,x30,[sp, #0x10]
009b7824	ldr x19,[sp], #0x20
009b7828	ret
