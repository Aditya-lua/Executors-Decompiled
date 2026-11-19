; FUN_0084f844 @ 0084f844
0084f844	stp x29,x30,[sp, #-0x30]!
0084f848	str x21,[sp, #0x10]
0084f84c	stp x20,x19,[sp, #0x20]
0084f850	mov x29,sp
0084f854	ldr x8,[x1]
0084f858	mov x20,x0
0084f85c	mov x19,x1
0084f860	mov x0,x1
0084f864	mov x1,x20
0084f868	ldr x8,[x8, #0xe0]
0084f86c	blr x8
0084f870	tbz w0,#0x0,0x0084f8a0
0084f874	ldr x8,[x20, #0x28]
0084f878	cbz x8,0x0084f8a0
0084f87c	ldr x20,[x20, #0x20]
0084f880	lsl x21,x8,#0x3
0084f884	ldr x0,[x20], #0x8
0084f888	mov x1,x19
0084f88c	ldr x8,[x0]
0084f890	ldr x8,[x8]
0084f894	blr x8
0084f898	subs x21,x21,#0x8
0084f89c	b.ne 0x0084f884
0084f8a0	ldp x20,x19,[sp, #0x20]
0084f8a4	ldr x21,[sp, #0x10]
0084f8a8	ldp x29,x30,[sp], #0x30
0084f8ac	ret
