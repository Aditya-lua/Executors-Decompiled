; std::logic_error::~logic_error @ 00c0db7c
00c0db7c	paciasp
00c0db80	stp x29,x30,[sp, #-0x20]!
00c0db84	str x19,[sp, #0x10]
00c0db88	mov x29,sp
00c0db8c	mov x19,x0
00c0db90	bl 0x00c447b0
00c0db94	mov x0,x19
00c0db98	mov w1,#0x10
00c0db9c	ldr x19,[sp, #0x10]
00c0dba0	ldp x29,x30,[sp], #0x20
00c0dba4	autiasp
00c0dba8	b 0x00c2fe80
