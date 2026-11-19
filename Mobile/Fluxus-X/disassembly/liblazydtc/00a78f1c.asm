; FUN_00a78f1c @ 00a78f1c
00a78f1c	stp x20,x19,[sp, #-0x20]!
00a78f20	mov x19,x1
00a78f24	adrp x1,0x2b7000
00a78f28	mov x20,x0
00a78f2c	add x1,x1,#0xd53
00a78f30	mov w0,#0x20
00a78f34	mov w2,#0x28
00a78f38	stp x29,x30,[sp, #0x10]
00a78f3c	add x29,sp,#0x10
00a78f40	bl 0x00c32320
00a78f44	cbz x0,0x00a78f90
00a78f48	adrp x8,0x29b000
00a78f4c	ldr d0,[x8, #0xd70]
00a78f50	add x8,x0,#0x10
00a78f54	str xzr,[x0, #0x8]
00a78f58	str xzr,[x0, #0x18]
00a78f5c	str d0,[x0]
00a78f60	str x8,[x20, #0x68]
00a78f64	mov w8,#0x2
00a78f68	str x0,[x20, #0x98]
00a78f6c	str w8,[x20, #0x70]
00a78f70	ldr x8,[x19, #0x98]
00a78f74	ldr x9,[x8]
00a78f78	str x9,[x0]
00a78f7c	ldr x9,[x8, #0x8]
00a78f80	str x9,[x0, #0x8]
00a78f84	ldr x8,[x8, #0x18]
00a78f88	str x8,[x0, #0x18]
00a78f8c	mov w0,#0x1
00a78f90	ldp x29,x30,[sp, #0x10]
00a78f94	ldp x20,x19,[sp], #0x20
00a78f98	ret
