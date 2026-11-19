; FUN_009ba5e8 @ 009ba5e8
009ba5e8	stp x29,x30,[sp, #-0x10]!
009ba5ec	mov x8,x0
009ba5f0	ldr x0,[x0, #0x20]
009ba5f4	mov x3,x1
009ba5f8	mov x29,sp
009ba5fc	cbz x0,0x009ba610
009ba600	mov w1,#0x5c
009ba604	mov x2,xzr
009ba608	bl 0x00c328a0
009ba60c	b 0x009ba620
009ba610	ldr x0,[x8, #0x18]
009ba614	mov w1,#0x5c
009ba618	mov x2,xzr
009ba61c	bl 0x00c32710
009ba620	cmp w0,#0x0
009ba624	cset w0,gt
009ba628	ldp x29,x30,[sp], #0x10
009ba62c	ret
