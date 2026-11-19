; std::out_of_range::~out_of_range @ 00c0dcdc
00c0dcdc	paciasp
00c0dce0	stp x29,x30,[sp, #-0x20]!
00c0dce4	str x19,[sp, #0x10]
00c0dce8	mov x29,sp
00c0dcec	mov x19,x0
00c0dcf0	bl 0x00c30240
00c0dcf4	mov x0,x19
00c0dcf8	mov w1,#0x10
00c0dcfc	ldr x19,[sp, #0x10]
00c0dd00	ldp x29,x30,[sp], #0x20
00c0dd04	autiasp
00c0dd08	b 0x00c2fe80
