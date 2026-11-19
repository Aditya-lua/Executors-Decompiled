; HMAC_Init @ 00a7f838
00a7f838	stp x22,x21,[sp, #-0x30]!
00a7f83c	stp x20,x19,[sp, #0x10]
00a7f840	mov x19,x3
00a7f844	mov w20,w2
00a7f848	mov x21,x1
00a7f84c	mov x22,x0
00a7f850	stp x29,x30,[sp, #0x20]
00a7f854	add x29,sp,#0x20
00a7f858	cbz x1,0x00a7f868
00a7f85c	cbz x19,0x00a7f868
00a7f860	mov x0,x22
00a7f864	bl 0x00a7f88c
00a7f868	mov w2,w20
00a7f86c	mov x3,x19
00a7f870	ldp x29,x30,[sp, #0x20]
00a7f874	ldp x20,x19,[sp, #0x10]
00a7f878	mov x0,x22
00a7f87c	mov x1,x21
00a7f880	mov x4,xzr
00a7f884	ldp x22,x21,[sp], #0x30
00a7f888	b 0x00a7f43c
