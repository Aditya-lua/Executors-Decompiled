; FUN_009ba5a0 @ 009ba5a0
009ba5a0	stp x29,x30,[sp, #-0x10]!
009ba5a4	mov x8,x0
009ba5a8	ldr x0,[x0, #0x20]
009ba5ac	mov x3,x1
009ba5b0	mov x29,sp
009ba5b4	cbz x0,0x009ba5c8
009ba5b8	mov w1,#0x5c
009ba5bc	mov x2,xzr
009ba5c0	bl 0x00c328a0
009ba5c4	b 0x009ba5d8
009ba5c8	ldr x0,[x8, #0x18]
009ba5cc	mov w1,#0x5c
009ba5d0	mov x2,xzr
009ba5d4	bl 0x00c32710
009ba5d8	cmp w0,#0x0
009ba5dc	cset w0,gt
009ba5e0	ldp x29,x30,[sp], #0x10
009ba5e4	ret
