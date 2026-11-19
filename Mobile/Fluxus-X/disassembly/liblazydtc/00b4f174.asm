; FUN_00b4f174 @ 00b4f174
00b4f174	stp x20,x19,[sp, #-0x20]!
00b4f178	stp x29,x30,[sp, #0x10]
00b4f17c	add x29,sp,#0x10
00b4f180	mov w19,w1
00b4f184	mov x20,x0
00b4f188	bl 0x00c41000
00b4f18c	cbz w0,0x00b4f1a0
00b4f190	mov x0,x20
00b4f194	mov w1,w19
00b4f198	bl 0x00c3ad10
00b4f19c	b 0x00b4f1a4
00b4f1a0	mov x0,xzr
00b4f1a4	ldp x29,x30,[sp, #0x10]
00b4f1a8	ldp x20,x19,[sp], #0x20
00b4f1ac	ret
