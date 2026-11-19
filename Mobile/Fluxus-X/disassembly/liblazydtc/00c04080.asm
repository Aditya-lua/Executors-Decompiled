; std::__ndk1::__time_get_c_storage<char>::__x @ 00c04080
00c04080	paciasp
00c04084	stp x29,x30,[sp, #-0x10]!
00c04088	mov x29,sp
00c0408c	adrp x8,0xd27000
00c04090	add x8,x8,#0x360
00c04094	ldarb w8,[x8]
00c04098	tbz w8,#0x0,0x00c040b0
00c0409c	nop
00c040a0	adr x0,0xcca608
00c040a4	ldp x29,x30,[sp], #0x10
00c040a8	autiasp
00c040ac	ret
00c040b0	adrp x0,0xd27000
00c040b4	add x0,x0,#0x360
00c040b8	bl 0x00c2fe90
00c040bc	cbz w0,0x00c0409c
00c040c0	adrp x0,0xcb4000
00c040c4	nop
00c040c8	adr x1,0xcca608
00c040cc	ldr x0,[x0, #0x9c0]
00c040d0	nop
00c040d4	adr x2,0xc48880
00c040d8	bl 0x00c2fe70
00c040dc	adrp x0,0xd27000
00c040e0	add x0,x0,#0x360
00c040e4	bl 0x00c2fea0
00c040e8	b 0x00c0409c
