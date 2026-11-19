; std::bad_optional_access::~bad_optional_access @ 00bc32b8
00bc32b8	paciasp
00bc32bc	stp x29,x30,[sp, #-0x20]!
00bc32c0	str x19,[sp, #0x10]
00bc32c4	mov x29,sp
00bc32c8	mov x19,x0
00bc32cc	bl 0x00c30780
00bc32d0	mov x0,x19
00bc32d4	mov w1,#0x8
00bc32d8	ldr x19,[sp, #0x10]
00bc32dc	ldp x29,x30,[sp], #0x20
00bc32e0	autiasp
00bc32e4	b 0x00c2fe80
