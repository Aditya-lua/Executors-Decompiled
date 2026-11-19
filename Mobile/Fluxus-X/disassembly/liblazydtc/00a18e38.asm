; bn_set_all_zero @ 00a18e38
00a18e38	ldp w8,w9,[x0, #0x8]
00a18e3c	sxtw x8,w8
00a18e40	cmp w8,w9
00a18e44	b.ge 0x00a18e80
00a18e48	stp x29,x30,[sp, #-0x10]!
00a18e4c	ldr x10,[x0]
00a18e50	add w11,w8,#0x1
00a18e54	cmp w9,w11
00a18e58	csinc w9,w9,w8,gt
00a18e5c	sub w9,w9,#0x1
00a18e60	add x0,x10,x8, LSL #0x3
00a18e64	sub w8,w9,w8
00a18e68	lsl x8,x8,#0x3
00a18e6c	add x2,x8,#0x8
00a18e70	mov w1,wzr
00a18e74	mov x29,sp
00a18e78	bl 0x00c301c0
00a18e7c	ldp x29,x30,[sp], #0x10
00a18e80	ret
