; ix::SelectInterrupt::~SelectInterrupt @ 00985654
00985654	adrp x8,0xcb4000
00985658	ldr x8,[x8, #0xf98]
0098565c	add x8,x8,#0x10
00985660	str x8,[x0]
00985664	ret
