; std::bad_typeid::~bad_typeid @ 00c0de54
00c0de54	paciasp
00c0de58	stp x29,x30,[sp, #-0x20]!
00c0de5c	str x19,[sp, #0x10]
00c0de60	mov x29,sp
00c0de64	mov x19,x0
00c0de68	bl 0x00c44810
00c0de6c	mov x0,x19
00c0de70	mov w1,#0x8
00c0de74	ldr x19,[sp, #0x10]
00c0de78	ldp x29,x30,[sp], #0x20
00c0de7c	autiasp
00c0de80	b 0x00c2fe80
