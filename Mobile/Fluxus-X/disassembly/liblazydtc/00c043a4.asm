; std::__ndk1::__time_get_c_storage<char>::__r @ 00c043a4
00c043a4	paciasp
00c043a8	stp x29,x30,[sp, #-0x10]!
00c043ac	mov x29,sp
00c043b0	adrp x8,0xd27000
00c043b4	add x8,x8,#0x3d8
00c043b8	ldarb w8,[x8]
00c043bc	tbz w8,#0x0,0x00c043d4
00c043c0	nop
00c043c4	adr x0,0xcca650
00c043c8	ldp x29,x30,[sp], #0x10
00c043cc	autiasp
00c043d0	ret
00c043d4	adrp x0,0xd27000
00c043d8	add x0,x0,#0x3d8
00c043dc	bl 0x00c2fe90
00c043e0	cbz w0,0x00c043c0
00c043e4	adrp x0,0xcb4000
00c043e8	nop
00c043ec	adr x1,0xcca650
00c043f0	ldr x0,[x0, #0x9c0]
00c043f4	nop
00c043f8	adr x2,0xc48880
00c043fc	bl 0x00c2fe70
00c04400	adrp x0,0xd27000
00c04404	add x0,x0,#0x3d8
00c04408	bl 0x00c2fea0
00c0440c	b 0x00c043c0
