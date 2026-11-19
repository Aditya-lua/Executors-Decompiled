; FUN_00a0dc10 @ 00a0dc10
00a0dc10	stp x20,x19,[sp, #-0x20]!
00a0dc14	adrp x1,0x2d7000
00a0dc18	mov x20,x0
00a0dc1c	add x1,x1,#0xc86
00a0dc20	orr w0,wzr,#0x30
00a0dc24	mov w2,#0x73
00a0dc28	stp x29,x30,[sp, #0x10]
00a0dc2c	add x29,sp,#0x10
00a0dc30	bl 0x00c32320
00a0dc34	mov x19,x0
00a0dc38	cbz x0,0x00a0dc64
00a0dc3c	ldr x8,[x20, #0x10]
00a0dc40	mov x0,x19
00a0dc44	blr x8
00a0dc48	cbnz w0,0x00a0dc64
00a0dc4c	adrp x1,0x2d7000
00a0dc50	add x1,x1,#0xc86
00a0dc54	mov w2,#0x76
00a0dc58	mov x0,x19
00a0dc5c	bl 0x00c32310
00a0dc60	mov x19,xzr
00a0dc64	ldp x29,x30,[sp, #0x10]
00a0dc68	mov x0,x19
00a0dc6c	ldp x20,x19,[sp], #0x20
00a0dc70	ret
