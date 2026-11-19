; BN_set_word @ 00a01e2c
00a01e2c	stp x20,x19,[sp, #-0x20]!
00a01e30	stp x29,x30,[sp, #0x10]
00a01e34	ldr w8,[x0, #0xc]
00a01e38	mov x19,x0
00a01e3c	mov x20,x1
00a01e40	add x29,sp,#0x10
00a01e44	cmp w8,#0x0
00a01e48	b.gt 0x00a01e5c
00a01e4c	mov w1,#0x1
00a01e50	mov x0,x19
00a01e54	bl 0x00a01a04
00a01e58	cbz x0,0x00a01e78
00a01e5c	ldr x8,[x19]
00a01e60	cmp x20,#0x0
00a01e64	cset w9,ne
00a01e68	mov w0,#0x1
00a01e6c	str wzr,[x19, #0x10]
00a01e70	str x20,[x8]
00a01e74	str w9,[x19, #0x8]
00a01e78	ldp x29,x30,[sp, #0x10]
00a01e7c	ldp x20,x19,[sp], #0x20
00a01e80	ret
