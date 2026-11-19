; FUN_00a82298 @ 00a82298
00a82298	stp x22,x21,[sp, #-0x30]!
00a8229c	stp x20,x19,[sp, #0x10]
00a822a0	stp x29,x30,[sp, #0x20]
00a822a4	ldp x8,x2,[x3, #0x18]
00a822a8	mov x22,x0
00a822ac	mov x21,x1
00a822b0	mov x0,x1
00a822b4	ldr x8,[x8, #0x28]
00a822b8	mov x1,x22
00a822bc	add x29,sp,#0x20
00a822c0	mov x19,x3
00a822c4	blr x8
00a822c8	cbz x0,0x00a82308
00a822cc	ldp x8,x5,[x19, #0x18]
00a822d0	mov x20,x0
00a822d4	ldr x0,[x19, #0x8]
00a822d8	ldp x3,x4,[x21]
00a822dc	ldr x8,[x8, #0x20]
00a822e0	mov x1,x20
00a822e4	mov x2,x22
00a822e8	blr x8
00a822ec	ldp x8,x1,[x19, #0x18]
00a822f0	mov x0,x20
00a822f4	ldp x29,x30,[sp, #0x20]
00a822f8	ldp x20,x19,[sp, #0x10]
00a822fc	ldr x2,[x8, #0x30]
00a82300	ldp x22,x21,[sp], #0x30
00a82304	br x2
00a82308	ldp x29,x30,[sp, #0x20]
00a8230c	ldp x20,x19,[sp, #0x10]
00a82310	ldp x22,x21,[sp], #0x30
00a82314	ret
