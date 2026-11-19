; FUN_00a4f2f8 @ 00a4f2f8
00a4f2f8	cbnz x0,0x00a4f320
00a4f2fc	stp x29,x30,[sp, #-0x10]!
00a4f300	ldr x0,[x1]
00a4f304	adrp x2,0xc5d000
00a4f308	add x2,x2,#0x58
00a4f30c	mov w1,#0xb
00a4f310	mov x29,sp
00a4f314	bl 0x00c3b520
00a4f318	ldp x29,x30,[sp], #0x10
00a4f31c	cbz x0,0x00a4f324
00a4f320	b 0x00c3b5f0
00a4f324	ret
