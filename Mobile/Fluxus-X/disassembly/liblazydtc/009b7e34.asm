; ssl_replace_hash @ 009b7e34
009b7e34	stp x20,x19,[sp, #-0x20]!
009b7e38	stp x29,x30,[sp, #0x10]
009b7e3c	mov x19,x0
009b7e40	ldr x0,[x0]
009b7e44	add x29,sp,#0x10
009b7e48	mov x20,x1
009b7e4c	bl 0x00c31f90
009b7e50	str xzr,[x19]
009b7e54	bl 0x00c31fa0
009b7e58	mov x8,x0
009b7e5c	str x0,[x19]
009b7e60	cbz x0,0x009b7e84
009b7e64	cbz x20,0x009b7e94
009b7e68	mov x0,x8
009b7e6c	mov x1,x20
009b7e70	mov x2,xzr
009b7e74	bl 0x00c31f70
009b7e78	ldr x8,[x19]
009b7e7c	cmp w0,#0x0
009b7e80	b.gt 0x009b7e94
009b7e84	mov x0,x8
009b7e88	bl 0x00c31f90
009b7e8c	mov x8,xzr
009b7e90	str xzr,[x19]
009b7e94	ldp x29,x30,[sp, #0x10]
009b7e98	mov x0,x8
009b7e9c	ldp x20,x19,[sp], #0x20
009b7ea0	ret
