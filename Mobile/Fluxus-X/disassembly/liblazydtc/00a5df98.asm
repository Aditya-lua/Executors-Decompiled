; FUN_00a5df98 @ 00a5df98
00a5df98	cbnz x0,0x00a5dfc0
00a5df9c	stp x29,x30,[sp, #-0x10]!
00a5dfa0	ldr x0,[x1]
00a5dfa4	adrp x2,0xc5d000
00a5dfa8	add x2,x2,#0x6b8
00a5dfac	mov w1,wzr
00a5dfb0	mov x29,sp
00a5dfb4	bl 0x00c3b520
00a5dfb8	ldp x29,x30,[sp], #0x10
00a5dfbc	cbz x0,0x00a5dfc4
00a5dfc0	b 0x00c3b550
00a5dfc4	ret
