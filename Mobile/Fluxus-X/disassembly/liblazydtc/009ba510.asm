; FUN_009ba510 @ 009ba510
009ba510	stp x29,x30,[sp, #-0x10]!
009ba514	mov x8,x0
009ba518	ldr x0,[x0, #0x20]
009ba51c	mov x3,x1
009ba520	mov x29,sp
009ba524	cbz x0,0x009ba538
009ba528	mov w1,#0x62
009ba52c	mov x2,xzr
009ba530	bl 0x00c328a0
009ba534	b 0x009ba548
009ba538	ldr x0,[x8, #0x18]
009ba53c	mov w1,#0x62
009ba540	mov x2,xzr
009ba544	bl 0x00c32710
009ba548	cmp w0,#0x0
009ba54c	cset w0,gt
009ba550	ldp x29,x30,[sp], #0x10
009ba554	ret
