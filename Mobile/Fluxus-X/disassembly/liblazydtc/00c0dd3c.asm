; std::overflow_error::~overflow_error @ 00c0dd3c
00c0dd3c	paciasp
00c0dd40	stp x29,x30,[sp, #-0x20]!
00c0dd44	str x19,[sp, #0x10]
00c0dd48	mov x29,sp
00c0dd4c	mov x19,x0
00c0dd50	bl 0x00c43ca0
00c0dd54	mov x0,x19
00c0dd58	mov w1,#0x10
00c0dd5c	ldr x19,[sp, #0x10]
00c0dd60	ldp x29,x30,[sp], #0x20
00c0dd64	autiasp
00c0dd68	b 0x00c2fe80
