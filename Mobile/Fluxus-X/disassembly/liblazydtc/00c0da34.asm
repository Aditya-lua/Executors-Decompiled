; std::bad_exception::~bad_exception @ 00c0da34
00c0da34	paciasp
00c0da38	stp x29,x30,[sp, #-0x20]!
00c0da3c	str x19,[sp, #0x10]
00c0da40	mov x29,sp
00c0da44	mov x19,x0
00c0da48	bl 0x00c447a0
00c0da4c	mov x0,x19
00c0da50	mov w1,#0x8
00c0da54	ldr x19,[sp, #0x10]
00c0da58	ldp x29,x30,[sp], #0x20
00c0da5c	autiasp
00c0da60	b 0x00c2fe80
