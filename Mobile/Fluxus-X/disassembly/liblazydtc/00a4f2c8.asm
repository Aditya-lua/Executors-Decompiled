; FUN_00a4f2c8 @ 00a4f2c8
00a4f2c8	cbnz x0,0x00a4f2f0
00a4f2cc	stp x29,x30,[sp, #-0x10]!
00a4f2d0	ldr x0,[x1]
00a4f2d4	adrp x2,0xc5d000
00a4f2d8	add x2,x2,#0x58
00a4f2dc	mov w1,#0xb
00a4f2e0	mov x29,sp
00a4f2e4	bl 0x00c3b520
00a4f2e8	ldp x29,x30,[sp], #0x10
00a4f2ec	cbz x0,0x00a4f2f4
00a4f2f0	b 0x00c3b550
00a4f2f4	ret
