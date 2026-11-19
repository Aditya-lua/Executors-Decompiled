; std::set_terminate @ 00c0d91c
00c0d91c	paciasp
00c0d920	stp x29,x30,[sp, #-0x10]!
00c0d924	mov x29,sp
00c0d928	adrp x1,0xcb5000
00c0d92c	cmp x0,#0x0
00c0d930	nop
00c0d934	adr x8,0xc0d7b8
00c0d938	ldr x1,[x1, #0xe70]
00c0d93c	csel x0,x8,x0,eq
00c0d940	bl 0x00c2bc80
00c0d944	ldp x29,x30,[sp], #0x10
00c0d948	autiasp
00c0d94c	ret
