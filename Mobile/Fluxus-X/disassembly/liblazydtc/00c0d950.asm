; std::set_new_handler @ 00c0d950
00c0d950	paciasp
00c0d954	stp x29,x30,[sp, #-0x10]!
00c0d958	mov x29,sp
00c0d95c	adrp x1,0xcb5000
00c0d960	ldr x1,[x1, #0xe78]
00c0d964	bl 0x00c2bc80
00c0d968	ldp x29,x30,[sp], #0x10
00c0d96c	autiasp
00c0d970	ret
