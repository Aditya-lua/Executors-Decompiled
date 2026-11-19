; FUN_009ba290 @ 009ba290
009ba290	stp x20,x19,[sp, #-0x20]!
009ba294	stp x29,x30,[sp, #0x10]
009ba298	mov x20,x0
009ba29c	ldr x0,[x0, #0x18]
009ba2a0	mov x19,x1
009ba2a4	add x29,sp,#0x10
009ba2a8	cbz x0,0x009ba2e4
009ba2ac	mov w2,#0x1
009ba2b0	mov x1,x19
009ba2b4	bl 0x00c32830
009ba2b8	ldr x8,[x20, #0x20]
009ba2bc	cbz x8,0x009ba2d0
009ba2c0	mov w2,#0x1
009ba2c4	mov x0,x8
009ba2c8	mov x1,x19
009ba2cc	bl 0x00c35f40
009ba2d0	ldp x29,x30,[sp, #0x10]
009ba2d4	cmp w0,#0x0
009ba2d8	cset w0,gt
009ba2dc	ldp x20,x19,[sp], #0x20
009ba2e0	ret
009ba2e4	mov w0,#0x1
009ba2e8	ldr x8,[x20, #0x20]
009ba2ec	cbnz x8,0x009ba2c0
009ba2f0	b 0x009ba2d0
