; ECDSA_do_sign @ 00a36d48
00a36d48	ldr x8,[x2]
00a36d4c	ldr x5,[x8, #0x60]
00a36d50	cbz x5,0x00a36d64
00a36d54	mov x4,x2
00a36d58	mov x2,xzr
00a36d5c	mov x3,xzr
00a36d60	br x5
00a36d64	stp x29,x30,[sp, #-0x10]!
00a36d68	mov x29,sp
00a36d6c	bl 0x00c342a0
00a36d70	adrp x0,0x2aa000
00a36d74	adrp x2,0x2d1000
00a36d78	add x0,x0,#0xe3
00a36d7c	add x2,x2,#0x89d
00a36d80	orr w1,wzr,#0x1f
00a36d84	bl 0x00c342b0
00a36d88	mov w0,#0x10
00a36d8c	mov w1,#0x98
00a36d90	mov x2,xzr
00a36d94	bl 0x00c342c0
00a36d98	mov x0,xzr
00a36d9c	ldp x29,x30,[sp], #0x10
00a36da0	ret
