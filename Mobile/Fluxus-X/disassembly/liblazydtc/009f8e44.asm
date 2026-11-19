; X509_PKEY_free @ 009f8e44
009f8e44	cbz x0,0x009f8ea8
009f8e48	str x19,[sp, #-0x20]!
009f8e4c	stp x29,x30,[sp, #0x10]
009f8e50	mov x19,x0
009f8e54	ldr x0,[x0, #0x8]
009f8e58	add x29,sp,#0x10
009f8e5c	bl 0x00c38240
009f8e60	ldr x0,[x19, #0x10]
009f8e64	bl 0x00c35530
009f8e68	ldr x0,[x19, #0x18]
009f8e6c	bl 0x00c32450
009f8e70	ldr w8,[x19, #0x30]
009f8e74	cbz w8,0x009f8e8c
009f8e78	ldr x0,[x19, #0x28]
009f8e7c	adrp x1,0x2ab000
009f8e80	add x1,x1,#0xe2e
009f8e84	mov w2,#0x2d
009f8e88	bl 0x00c32310
009f8e8c	ldp x29,x30,[sp, #0x10]
009f8e90	adrp x1,0x2ab000
009f8e94	add x1,x1,#0xe2e
009f8e98	mov w2,#0x2e
009f8e9c	mov x0,x19
009f8ea0	ldr x19,[sp], #0x20
009f8ea4	b 0x00c32310
009f8ea8	ret
