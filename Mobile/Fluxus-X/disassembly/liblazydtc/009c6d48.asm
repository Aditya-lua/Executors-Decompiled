; tls13_generate_master_secret @ 009c6d48
009c6d48	str x23,[sp, #-0x40]!
009c6d4c	stp x22,x21,[sp, #0x10]
009c6d50	stp x20,x19,[sp, #0x20]
009c6d54	stp x29,x30,[sp, #0x30]
009c6d58	add x29,sp,#0x30
009c6d5c	mov x19,x4
009c6d60	mov x20,x2
009c6d64	mov x21,x1
009c6d68	mov x22,x0
009c6d6c	bl 0x00c34a10
009c6d70	mov x23,x0
009c6d74	bl 0x00c34c20
009c6d78	sxtw x8,w0
009c6d7c	str x8,[x19]
009c6d80	mov x0,x22
009c6d84	mov x2,x20
009c6d88	mov x5,x21
009c6d8c	ldp x29,x30,[sp, #0x30]
009c6d90	ldp x20,x19,[sp, #0x20]
009c6d94	ldp x22,x21,[sp, #0x10]
009c6d98	mov x1,x23
009c6d9c	mov x3,xzr
009c6da0	mov x4,xzr
009c6da4	ldr x23,[sp], #0x40
009c6da8	b 0x009c6a38
