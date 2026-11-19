; std::nested_exception::~nested_exception @ 00bc26e4
00bc26e4	paciasp
00bc26e8	stp x29,x30,[sp, #-0x20]!
00bc26ec	str x19,[sp, #0x10]
00bc26f0	mov x29,sp
00bc26f4	mov x19,x0
00bc26f8	bl 0x00c43c70
00bc26fc	mov x0,x19
00bc2700	mov w1,#0x10
00bc2704	ldr x19,[sp, #0x10]
00bc2708	ldp x29,x30,[sp], #0x20
00bc270c	autiasp
00bc2710	b 0x00c2fe80
