; tls_get_cipher_from_engine @ 009c7e58
009c7e58	stp x20,x19,[sp, #-0x20]!
009c7e5c	stp x29,x30,[sp, #0x10]
009c7e60	add x29,sp,#0x10
009c7e64	mov w20,w0
009c7e68	bl 0x00c368a0
009c7e6c	cbz x0,0x009c7e8c
009c7e70	mov w1,w20
009c7e74	mov x19,x0
009c7e78	bl 0x00c36890
009c7e7c	mov x20,x0
009c7e80	mov x0,x19
009c7e84	bl 0x00c32360
009c7e88	mov x0,x20
009c7e8c	ldp x29,x30,[sp, #0x10]
009c7e90	ldp x20,x19,[sp], #0x20
009c7e94	ret
