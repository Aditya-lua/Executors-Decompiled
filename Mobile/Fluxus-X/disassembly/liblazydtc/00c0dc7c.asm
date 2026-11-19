; std::invalid_argument::~invalid_argument @ 00c0dc7c
00c0dc7c	paciasp
00c0dc80	stp x29,x30,[sp, #-0x20]!
00c0dc84	str x19,[sp, #0x10]
00c0dc88	mov x29,sp
00c0dc8c	mov x19,x0
00c0dc90	bl 0x00c30a70
00c0dc94	mov x0,x19
00c0dc98	mov w1,#0x10
00c0dc9c	ldr x19,[sp, #0x10]
00c0dca0	ldp x29,x30,[sp], #0x20
00c0dca4	autiasp
00c0dca8	b 0x00c2fe80
