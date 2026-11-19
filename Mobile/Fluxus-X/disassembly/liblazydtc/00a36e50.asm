; ECDSA_sign_ex @ 00a36e50
00a36e50	ldr x8,[x7]
00a36e54	ldr x8,[x8, #0x50]
00a36e58	cbz x8,0x00a36e60
00a36e5c	br x8
00a36e60	stp x29,x30,[sp, #-0x10]!
00a36e64	mov x29,sp
00a36e68	bl 0x00c342a0
00a36e6c	adrp x0,0x2aa000
00a36e70	adrp x2,0x2ad000
00a36e74	add x0,x0,#0xe3
00a36e78	add x2,x2,#0xb58
00a36e7c	mov w1,#0x2f
00a36e80	bl 0x00c342b0
00a36e84	mov w0,#0x10
00a36e88	mov w1,#0x98
00a36e8c	mov x2,xzr
00a36e90	bl 0x00c342c0
00a36e94	mov w0,wzr
00a36e98	ldp x29,x30,[sp], #0x10
00a36e9c	ret
