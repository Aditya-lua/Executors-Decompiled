; FUN_00b31d18 @ 00b31d18
00b31d18	stp x22,x21,[sp, #-0x30]!
00b31d1c	stp x20,x19,[sp, #0x10]
00b31d20	stp x29,x30,[sp, #0x20]
00b31d24	add x29,sp,#0x20
00b31d28	mov x22,x3
00b31d2c	mov x19,x2
00b31d30	mov x21,x1
00b31d34	mov x20,x0
00b31d38	bl 0x00c41000
00b31d3c	mov w8,w0
00b31d40	cmp x22,#0x14
00b31d44	mov w0,wzr
00b31d48	b.cc 0x00b31d6c
00b31d4c	cbz w8,0x00b31d6c
00b31d50	mov x0,x21
00b31d54	mov x1,x20
00b31d58	bl 0x00c3d570
00b31d5c	cbz w0,0x00b31d6c
00b31d60	mov w8,#0x14
00b31d64	mov w0,#0x1
00b31d68	str x8,[x19]
00b31d6c	ldp x29,x30,[sp, #0x20]
00b31d70	ldp x20,x19,[sp, #0x10]
00b31d74	ldp x22,x21,[sp], #0x30
00b31d78	ret
