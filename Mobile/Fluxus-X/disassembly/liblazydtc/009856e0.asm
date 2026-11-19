; ix::SelectInterruptPipe::SelectInterruptPipe @ 009856e0
009856e0	str x19,[sp, #-0x20]!
009856e4	stp x29,x30,[sp, #0x10]
009856e8	add x29,sp,#0x10
009856ec	mov x19,x0
009856f0	bl 0x00c33470
009856f4	adrp x8,0xcb4000
009856f8	ldr x8,[x8, #0xfa0]
009856fc	movi d0,#-0x1
00985700	stp xzr,xzr,[x19, #0x28]
00985704	stp xzr,xzr,[x19, #0x18]
00985708	add x8,x8,#0x10
0098570c	str xzr,[x19, #0x10]
00985710	str x8,[x19]
00985714	str d0,[x19, #0x8]
00985718	ldp x29,x30,[sp, #0x10]
0098571c	ldr x19,[sp], #0x20
00985720	ret
