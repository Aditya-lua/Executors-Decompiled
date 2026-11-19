; FUN_00a4e284 @ 00a4e284
00a4e284	cbz x0,0x00a4e2dc
00a4e288	stp x20,x19,[sp, #-0x20]!
00a4e28c	stp x29,x30,[sp, #0x10]
00a4e290	ldr x8,[x0, #0x40]
00a4e294	mov x19,x0
00a4e298	adrp x20,0x2b4000
00a4e29c	add x20,x20,#0x201
00a4e2a0	ldr x0,[x8, #0x8]
00a4e2a4	mov w2,#0x4f
00a4e2a8	mov x1,x20
00a4e2ac	add x29,sp,#0x10
00a4e2b0	bl 0x00c32310
00a4e2b4	ldr x0,[x19, #0x40]
00a4e2b8	mov w2,#0x50
00a4e2bc	mov x1,x20
00a4e2c0	bl 0x00c32310
00a4e2c4	str xzr,[x19, #0x40]
00a4e2c8	str wzr,[x19, #0x28]
00a4e2cc	str wzr,[x19, #0x30]
00a4e2d0	ldp x29,x30,[sp, #0x10]
00a4e2d4	mov w0,#0x1
00a4e2d8	ldp x20,x19,[sp], #0x20
00a4e2dc	ret
