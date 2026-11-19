; std::set_unexpected @ 00c0d8e8
00c0d8e8	paciasp
00c0d8ec	stp x29,x30,[sp, #-0x10]!
00c0d8f0	mov x29,sp
00c0d8f4	adrp x1,0xcb5000
00c0d8f8	cmp x0,#0x0
00c0d8fc	nop
00c0d900	adr x8,0xc0d8c8
00c0d904	ldr x1,[x1, #0xe68]
00c0d908	csel x0,x8,x0,eq
00c0d90c	bl 0x00c2bc80
00c0d910	ldp x29,x30,[sp], #0x10
00c0d914	autiasp
00c0d918	ret
