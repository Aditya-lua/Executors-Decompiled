; FUN_00b2552c @ 00b2552c
00b2552c	stp x29,x30,[sp, #-0x10]!
00b25530	mov x2,x3
00b25534	add x0,x0,#0x2b0
00b25538	mov x29,sp
00b2553c	bl 0x00c3e3c0
00b25540	cmp w0,#0x1
00b25544	cset w0,eq
00b25548	ldp x29,x30,[sp], #0x10
00b2554c	ret
