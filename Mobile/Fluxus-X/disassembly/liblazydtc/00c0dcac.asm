; std::length_error::~length_error @ 00c0dcac
00c0dcac	paciasp
00c0dcb0	stp x29,x30,[sp, #-0x20]!
00c0dcb4	str x19,[sp, #0x10]
00c0dcb8	mov x29,sp
00c0dcbc	mov x19,x0
00c0dcc0	bl 0x00c30010
00c0dcc4	mov x0,x19
00c0dcc8	mov w1,#0x10
00c0dccc	ldr x19,[sp, #0x10]
00c0dcd0	ldp x29,x30,[sp], #0x20
00c0dcd4	autiasp
00c0dcd8	b 0x00c2fe80
