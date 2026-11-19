; FUN_00aeb704 @ 00aeb704
00aeb704	cbnz x0,0x00aeb72c
00aeb708	stp x29,x30,[sp, #-0x10]!
00aeb70c	ldr x0,[x1]
00aeb710	adrp x2,0xc7d000
00aeb714	add x2,x2,#0xeb8
00aeb718	orr w1,wzr,#0xf
00aeb71c	mov x29,sp
00aeb720	bl 0x00c3b520
00aeb724	ldp x29,x30,[sp], #0x10
00aeb728	cbz x0,0x00aeb730
00aeb72c	b 0x00c3b550
00aeb730	ret
