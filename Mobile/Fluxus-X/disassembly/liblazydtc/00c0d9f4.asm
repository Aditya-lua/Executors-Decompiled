; std::exception::~exception @ 00c0d9f4
00c0d9f4	paciasp
00c0d9f8	stp x29,x30,[sp, #-0x20]!
00c0d9fc	str x19,[sp, #0x10]
00c0da00	mov x29,sp
00c0da04	mov x19,x0
00c0da08	bl 0x00c44790
00c0da0c	mov x0,x19
00c0da10	mov w1,#0x8
00c0da14	ldr x19,[sp, #0x10]
00c0da18	ldp x29,x30,[sp], #0x20
00c0da1c	autiasp
00c0da20	b 0x00c2fe80
