; ix::SelectInterruptPipe::~SelectInterruptPipe @ 00985790
00985790	str x19,[sp, #-0x20]!
00985794	stp x29,x30,[sp, #0x10]
00985798	add x29,sp,#0x10
0098579c	mov x19,x0
009857a0	bl 0x00c334b0
009857a4	ldp x29,x30,[sp, #0x10]
009857a8	mov x0,x19
009857ac	ldr x19,[sp], #0x20
009857b0	b 0x00c301d0
