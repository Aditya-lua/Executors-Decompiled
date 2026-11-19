; std::bad_array_new_length::~bad_array_new_length @ 00c0dae4
00c0dae4	paciasp
00c0dae8	stp x29,x30,[sp, #-0x20]!
00c0daec	str x19,[sp, #0x10]
00c0daf0	mov x29,sp
00c0daf4	mov x19,x0
00c0daf8	bl 0x00c30060
00c0dafc	mov x0,x19
00c0db00	mov w1,#0x8
00c0db04	ldr x19,[sp, #0x10]
00c0db08	ldp x29,x30,[sp], #0x20
00c0db0c	autiasp
00c0db10	b 0x00c2fe80
