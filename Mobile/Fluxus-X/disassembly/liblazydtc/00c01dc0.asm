; std::__ndk1::numpunct_byname<wchar_t>::~numpunct_byname @ 00c01dc0
00c01dc0	bti c
00c01dc4	adrp x8,0xcb5000
00c01dc8	ldr x8,[x8, #0xe40]
00c01dcc	ldrb w9,[x0, #0x18]
00c01dd0	add x8,x8,#0x10
00c01dd4	str x8,[x0]
00c01dd8	tbz w9,#0x0,0x00c01e14
00c01ddc	paciasp
00c01de0	stp x29,x30,[sp, #-0x20]!
00c01de4	str x19,[sp, #0x10]
00c01de8	mov x29,sp
00c01dec	ldr x8,[x0, #0x28]
00c01df0	ldr x9,[x0, #0x18]
00c01df4	mov x19,x0
00c01df8	and x1,x9,#-0x2
00c01dfc	mov x0,x8
00c01e00	bl 0x00c2fe80
00c01e04	mov x0,x19
00c01e08	ldr x19,[sp, #0x10]
00c01e0c	ldp x29,x30,[sp], #0x20
00c01e10	autiasp
00c01e14	b 0x00c31530
