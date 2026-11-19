; std::type_info::~type_info @ 00c0dda4
00c0dda4	paciasp
00c0dda8	stp x29,x30,[sp, #-0x20]!
00c0ddac	str x19,[sp, #0x10]
00c0ddb0	mov x29,sp
00c0ddb4	mov x19,x0
00c0ddb8	bl 0x00c44800
00c0ddbc	mov x0,x19
00c0ddc0	mov w1,#0x10
00c0ddc4	ldr x19,[sp, #0x10]
00c0ddc8	ldp x29,x30,[sp], #0x20
00c0ddcc	autiasp
00c0ddd0	b 0x00c2fe80
