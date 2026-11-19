; FUN_009bab70 @ 009bab70
009bab70	stp x22,x21,[sp, #-0x30]!
009bab74	stp x20,x19,[sp, #0x10]
009bab78	stp x29,x30,[sp, #0x20]
009bab7c	ldr x8,[x0, #0x18]
009bab80	mov x19,x1
009bab84	add x29,sp,#0x20
009bab88	cbz x8,0x009babb0
009bab8c	ldr x22,[x8, #0x158]
009bab90	ldr x20,[x8]
009bab94	ldr x21,[x8, #0x440]
009bab98	ldr x0,[x22, #0x1d0]
009bab9c	cbnz x0,0x009babd4
009baba0	bl 0x00c35030
009baba4	str x0,[x22, #0x1d0]
009baba8	cbnz x0,0x009babd4
009babac	b 0x009babf0
009babb0	ldr x9,[x0, #0x20]
009babb4	cbz x9,0x009babec
009babb8	ldr x8,[x9, #0x9a8]
009babbc	ldr x22,[x9, #0x898]
009babc0	cbnz x8,0x009bab90
009babc4	mov x20,xzr
009babc8	mov x21,xzr
009babcc	ldr x0,[x22, #0x1d0]
009babd0	cbz x0,0x009baba0
009babd4	cbz x19,0x009babec
009babd8	mov x1,x19
009babdc	mov x2,x20
009babe0	mov x3,x21
009babe4	bl 0x00c35b50
009babe8	cbz w0,0x009babf0
009babec	mov w0,#0x1
009babf0	ldp x29,x30,[sp, #0x20]
009babf4	ldp x20,x19,[sp, #0x10]
009babf8	ldp x22,x21,[sp], #0x30
009babfc	ret
