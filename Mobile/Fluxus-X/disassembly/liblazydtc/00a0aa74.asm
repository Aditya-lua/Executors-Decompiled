; BN_options @ 00a0aa74
00a0aa74	adrp x8,0xd21000
00a0aa78	ldrb w9,[x8, #0x910]
00a0aa7c	tbnz w9,#0x0,0x00a0aab4
00a0aa80	stp x29,x30,[sp, #-0x10]!
00a0aa84	adrp x0,0xd21000
00a0aa88	adrp x2,0x2af000
00a0aa8c	mov w9,#0x1
00a0aa90	add x0,x0,#0x911
00a0aa94	add x2,x2,#0xd5d
00a0aa98	mov w1,#0x10
00a0aa9c	mov w3,#0x40
00a0aaa0	mov w4,#0x40
00a0aaa4	mov x29,sp
00a0aaa8	strb w9,[x8, #0x910]
00a0aaac	bl 0x00c34d30
00a0aab0	ldp x29,x30,[sp], #0x10
00a0aab4	adrp x0,0xd21000
00a0aab8	add x0,x0,#0x911
00a0aabc	ret
