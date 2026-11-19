; FUN_00932de0 @ 00932de0
00932de0	ldrb w9,[x0, #0x1b3]
00932de4	mov w8,wzr
00932de8	tbz w9,#0x1,0x00932e04
00932dec	stp x29,x30,[sp, #-0x10]!
00932df0	mov x29,sp
00932df4	add x0,x0,#0x140
00932df8	bl 0x00924378
00932dfc	eor w8,w0,#0x1
00932e00	ldp x29,x30,[sp], #0x10
00932e04	and w0,w8,#0x1
00932e08	ret
