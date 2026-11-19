; ECDSA_verify @ 00a36f40
00a36f40	ldr x8,[x5]
00a36f44	ldr x6,[x8, #0x68]
00a36f48	cbz x6,0x00a36f50
00a36f4c	br x6
00a36f50	stp x29,x30,[sp, #-0x10]!
00a36f54	mov x29,sp
00a36f58	bl 0x00c342a0
00a36f5c	adrp x0,0x2bf000
00a36f60	adrp x2,0x2c1000
00a36f64	add x0,x0,#0xb8e
00a36f68	add x2,x2,#0xb66
00a36f6c	mov w1,#0x2f
00a36f70	bl 0x00c342b0
00a36f74	mov w0,#0x10
00a36f78	mov w1,#0x98
00a36f7c	mov x2,xzr
00a36f80	bl 0x00c342c0
00a36f84	mov w0,#0xffffffff
00a36f88	ldp x29,x30,[sp], #0x10
00a36f8c	ret
