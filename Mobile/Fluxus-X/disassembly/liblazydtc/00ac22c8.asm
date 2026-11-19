; FUN_00ac22c8 @ 00ac22c8
00ac22c8	stp x20,x19,[sp, #-0x20]!
00ac22cc	stp x29,x30,[sp, #0x10]
00ac22d0	add x29,sp,#0x10
00ac22d4	mov x19,x2
00ac22d8	mov w20,w1
00ac22dc	bl 0x00c35620
00ac22e0	cbz x0,0x00ac22f8
00ac22e4	ldp x29,x30,[sp, #0x10]
00ac22e8	mov w1,w20
00ac22ec	mov x2,x19
00ac22f0	ldp x20,x19,[sp], #0x20
00ac22f4	b 0x00c38450
00ac22f8	ldp x29,x30,[sp, #0x10]
00ac22fc	ldp x20,x19,[sp], #0x20
00ac2300	ret
