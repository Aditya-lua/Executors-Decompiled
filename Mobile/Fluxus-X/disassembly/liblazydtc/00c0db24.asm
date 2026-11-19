; std::domain_error::~domain_error @ 00c0db24
00c0db24	paciasp
00c0db28	stp x29,x30,[sp, #-0x20]!
00c0db2c	stp x20,x19,[sp, #0x10]
00c0db30	mov x29,sp
00c0db34	adrp x8,0xcb5000
00c0db38	mov x19,x0
00c0db3c	ldr x8,[x8, #0xb00]
00c0db40	ldr x20,[x0, #0x8]
00c0db44	add x8,x8,#0x10
00c0db48	sub x1,x20,#0x8
00c0db4c	str x8,[x0]
00c0db50	mov w0,#0xffffffff
00c0db54	bl 0x00c2bcb0
00c0db58	cmp w0,#0x1
00c0db5c	b.pl 0x00c0db68
00c0db60	sub x0,x20,#0x18
00c0db64	bl 0x00c301d0
00c0db68	mov x0,x19
00c0db6c	ldp x20,x19,[sp, #0x10]
00c0db70	ldp x29,x30,[sp], #0x20
00c0db74	autiasp
00c0db78	b 0x00c306f0
