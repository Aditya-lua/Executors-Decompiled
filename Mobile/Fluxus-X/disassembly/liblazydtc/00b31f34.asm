; FUN_00b31f34 @ 00b31f34
00b31f34	stp x22,x21,[sp, #-0x30]!
00b31f38	stp x20,x19,[sp, #0x10]
00b31f3c	stp x29,x30,[sp, #0x20]
00b31f40	add x29,sp,#0x20
00b31f44	mov x22,x3
00b31f48	mov x19,x2
00b31f4c	mov x21,x1
00b31f50	mov x20,x0
00b31f54	bl 0x00c41000
00b31f58	mov w8,w0
00b31f5c	cmp x22,#0x1c
00b31f60	mov w0,wzr
00b31f64	b.cc 0x00b31f88
00b31f68	cbz w8,0x00b31f88
00b31f6c	mov x0,x21
00b31f70	mov x1,x20
00b31f74	bl 0x00c3d5a0
00b31f78	cbz w0,0x00b31f88
00b31f7c	orr w8,wzr,#0x1c
00b31f80	mov w0,#0x1
00b31f84	str x8,[x19]
00b31f88	ldp x29,x30,[sp, #0x20]
00b31f8c	ldp x20,x19,[sp, #0x10]
00b31f90	ldp x22,x21,[sp], #0x30
00b31f94	ret
