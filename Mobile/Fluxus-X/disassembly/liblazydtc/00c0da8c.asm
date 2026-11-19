; std::bad_alloc::~bad_alloc @ 00c0da8c
00c0da8c	paciasp
00c0da90	stp x29,x30,[sp, #-0x20]!
00c0da94	str x19,[sp, #0x10]
00c0da98	mov x29,sp
00c0da9c	mov x19,x0
00c0daa0	bl 0x00c43f70
00c0daa4	mov x0,x19
00c0daa8	mov w1,#0x8
00c0daac	ldr x19,[sp, #0x10]
00c0dab0	ldp x29,x30,[sp], #0x20
00c0dab4	autiasp
00c0dab8	b 0x00c2fe80
