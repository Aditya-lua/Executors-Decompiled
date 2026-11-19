; std::__ndk1::regex_error::regex_error @ 00c0d150
00c0d150	paciasp
00c0d154	stp x29,x30,[sp, #-0x20]!
00c0d158	stp x20,x19,[sp, #0x10]
00c0d15c	mov x29,sp
00c0d160	sub w8,w1,#0x1
00c0d164	mov w19,w1
00c0d168	mov x20,x0
00c0d16c	cmp w8,#0x10
00c0d170	b.hi 0x00c0d188
00c0d174	adrp x9,0x78b000
00c0d178	add x9,x9,#0xf38
00c0d17c	ldrsw x8,[x9, w8, UXTW #0x2]
00c0d180	add x1,x9,x8
00c0d184	b 0x00c0d190
00c0d188	adrp x1,0x2c0000
00c0d18c	add x1,x1,#0xccc
00c0d190	mov x0,x20
00c0d194	bl 0x00c43cb0
00c0d198	adrp x8,0xcb5000
00c0d19c	ldr x8,[x8, #0xe60]
00c0d1a0	add x8,x8,#0x10
00c0d1a4	str x8,[x20]
00c0d1a8	str w19,[x20, #0x10]
00c0d1ac	ldp x20,x19,[sp, #0x10]
00c0d1b0	ldp x29,x30,[sp], #0x20
00c0d1b4	autiasp
00c0d1b8	ret
