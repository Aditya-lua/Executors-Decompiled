; FUN_009ba558 @ 009ba558
009ba558	stp x29,x30,[sp, #-0x10]!
009ba55c	mov x8,x0
009ba560	ldr x0,[x0, #0x20]
009ba564	mov x3,x1
009ba568	mov x29,sp
009ba56c	cbz x0,0x009ba580
009ba570	mov w1,#0x66
009ba574	mov x2,xzr
009ba578	bl 0x00c328a0
009ba57c	b 0x009ba590
009ba580	ldr x0,[x8, #0x18]
009ba584	mov w1,#0x66
009ba588	mov x2,xzr
009ba58c	bl 0x00c32710
009ba590	cmp w0,#0x0
009ba594	cset w0,gt
009ba598	ldp x29,x30,[sp], #0x10
009ba59c	ret
