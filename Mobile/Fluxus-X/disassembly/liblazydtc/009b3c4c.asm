; SSL_get_wfd @ 009b3c4c
009b3c4c	sub sp,sp,#0x20
009b3c50	stp x29,x30,[sp, #0x10]
009b3c54	add x29,sp,#0x10
009b3c58	mov w8,#0xffffffff
009b3c5c	stur w8,[x29, #-0x4]
009b3c60	ldr x8,[x0, #0x20]
009b3c64	cbz x8,0x009b3c74
009b3c68	mov x0,x8
009b3c6c	bl 0x00c35620
009b3c70	b 0x009b3c78
009b3c74	ldr x0,[x0, #0x18]
009b3c78	mov w1,#0x100
009b3c7c	bl 0x00c355d0
009b3c80	cbz x0,0x009b3c9c
009b3c84	mov w1,#0x69
009b3c88	sub x3,x29,#0x4
009b3c8c	mov x2,xzr
009b3c90	bl 0x00c321a0
009b3c94	ldur w0,[x29, #-0x4]
009b3c98	b 0x009b3ca0
009b3c9c	mov w0,#0xffffffff
009b3ca0	ldp x29,x30,[sp, #0x10]
009b3ca4	add sp,sp,#0x20
009b3ca8	ret
