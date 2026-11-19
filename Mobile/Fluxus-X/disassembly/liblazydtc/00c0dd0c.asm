; std::range_error::~range_error @ 00c0dd0c
00c0dd0c	paciasp
00c0dd10	stp x29,x30,[sp, #-0x20]!
00c0dd14	str x19,[sp, #0x10]
00c0dd18	mov x29,sp
00c0dd1c	mov x19,x0
00c0dd20	bl 0x00c447d0
00c0dd24	mov x0,x19
00c0dd28	mov w1,#0x10
00c0dd2c	ldr x19,[sp, #0x10]
00c0dd30	ldp x29,x30,[sp], #0x20
00c0dd34	autiasp
00c0dd38	b 0x00c2fe80
