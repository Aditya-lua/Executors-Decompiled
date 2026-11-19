; std::current_exception @ 00bc26a0
00bc26a0	paciasp
00bc26a4	stp x29,x30,[sp, #-0x20]!
00bc26a8	str x19,[sp, #0x10]
00bc26ac	mov x29,sp
00bc26b0	mov x19,x8
00bc26b4	bl 0x00c43c60
00bc26b8	str x0,[x19]
00bc26bc	ldr x19,[sp, #0x10]
00bc26c0	ldp x29,x30,[sp], #0x20
00bc26c4	autiasp
00bc26c8	ret
