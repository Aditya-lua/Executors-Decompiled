; async_wait_ctx_reset_counts @ 009f9c5c
009f9c5c	stp x22,x21,[sp, #-0x30]!
009f9c60	stp x20,x19,[sp, #0x10]
009f9c64	stp x29,x30,[sp, #0x20]
009f9c68	ldr x8,[x0]
009f9c6c	add x29,sp,#0x20
009f9c70	stp xzr,xzr,[x0, #0x8]
009f9c74	cbz x8,0x009f9cf0
009f9c78	adrp x20,0x2bb000
009f9c7c	mov x19,x0
009f9c80	mov x0,xzr
009f9c84	add x20,x20,#0x9b2
009f9c88	mov x21,x0
009f9c8c	add x22,x0,#0x28
009f9c90	mov x0,x8
009f9c94	ldr w8,[x0, #0x24]
009f9c98	cbz w8,0x009f9cdc
009f9c9c	ldr x8,[x0, #0x28]
009f9ca0	cbz x21,0x009f9cbc
009f9ca4	mov w2,#0xeb
009f9ca8	mov x1,x20
009f9cac	str x8,[x22]
009f9cb0	bl 0x00c32310
009f9cb4	mov x8,x22
009f9cb8	b 0x009f9cd0
009f9cbc	mov w2,#0xeb
009f9cc0	mov x1,x20
009f9cc4	str x8,[x19]
009f9cc8	bl 0x00c32310
009f9ccc	mov x8,x19
009f9cd0	ldr x0,[x8]
009f9cd4	cbnz x0,0x009f9c94
009f9cd8	b 0x009f9cf0
009f9cdc	ldr w8,[x0, #0x20]
009f9ce0	cbz w8,0x009f9ce8
009f9ce4	str wzr,[x0, #0x20]
009f9ce8	ldr x8,[x0, #0x28]
009f9cec	cbnz x8,0x009f9c88
009f9cf0	ldp x29,x30,[sp, #0x20]
009f9cf4	ldp x20,x19,[sp, #0x10]
009f9cf8	ldp x22,x21,[sp], #0x30
009f9cfc	ret
