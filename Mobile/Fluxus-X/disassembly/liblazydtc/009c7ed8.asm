; tls_engine_load_ssl_client_cert @ 009c7ed8
009c7ed8	stp x22,x21,[sp, #-0x30]!
009c7edc	stp x20,x19,[sp, #0x10]
009c7ee0	stp x29,x30,[sp, #0x20]
009c7ee4	ldr x8,[x0, #0x9a8]
009c7ee8	add x29,sp,#0x20
009c7eec	mov x19,x2
009c7ef0	mov x20,x0
009c7ef4	ldr x21,[x8, #0x200]
009c7ef8	mov x22,x1
009c7efc	bl 0x00c34f10
009c7f00	mov x1,x20
009c7f04	mov x4,x19
009c7f08	ldp x29,x30,[sp, #0x20]
009c7f0c	ldp x20,x19,[sp, #0x10]
009c7f10	mov x2,x0
009c7f14	mov x0,x21
009c7f18	mov x3,x22
009c7f1c	mov x5,xzr
009c7f20	mov x6,xzr
009c7f24	mov x7,xzr
009c7f28	ldp x22,x21,[sp], #0x30
009c7f2c	b 0x00c368e0
