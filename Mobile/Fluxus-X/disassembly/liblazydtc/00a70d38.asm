; FUN_00a70d38 @ 00a70d38
00a70d38	stp x20,x19,[sp, #-0x20]!
00a70d3c	stp x29,x30,[sp, #0x10]
00a70d40	add x29,sp,#0x10
00a70d44	mov x19,x2
00a70d48	mov w20,w0
00a70d4c	bl 0x00a6fd84
00a70d50	cmp w0,#0x1
00a70d54	b.lt 0x00a70d88
00a70d58	cmp w20,#0x5
00a70d5c	b.eq 0x00a70d6c
00a70d60	cmp w20,#0x2
00a70d64	mov w0,wzr
00a70d68	b.ne 0x00a70d88
00a70d6c	ldr w8,[x19, #0x8]
00a70d70	mov w0,wzr
00a70d74	cmp w8,#0x1
00a70d78	b.ne 0x00a70d88
00a70d7c	ldp x8,x9,[x19, #0x20]
00a70d80	mov w0,#0x1
00a70d84	str x9,[x8]
00a70d88	ldp x29,x30,[sp, #0x10]
00a70d8c	ldp x20,x19,[sp], #0x20
00a70d90	ret
