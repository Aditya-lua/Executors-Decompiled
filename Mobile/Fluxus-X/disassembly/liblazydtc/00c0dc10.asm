; std::runtime_error::~runtime_error @ 00c0dc10
00c0dc10	paciasp
00c0dc14	stp x29,x30,[sp, #-0x20]!
00c0dc18	str x19,[sp, #0x10]
00c0dc1c	mov x29,sp
00c0dc20	mov x19,x0
00c0dc24	bl 0x00c30a90
00c0dc28	mov x0,x19
00c0dc2c	mov w1,#0x10
00c0dc30	ldr x19,[sp, #0x10]
00c0dc34	ldp x29,x30,[sp], #0x20
00c0dc38	autiasp
00c0dc3c	b 0x00c2fe80
