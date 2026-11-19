; std::__ndk1::__time_get_c_storage<char>::__X @ 00c0418c
00c0418c	paciasp
00c04190	stp x29,x30,[sp, #-0x10]!
00c04194	mov x29,sp
00c04198	adrp x8,0xd27000
00c0419c	add x8,x8,#0x388
00c041a0	ldarb w8,[x8]
00c041a4	tbz w8,#0x0,0x00c041bc
00c041a8	nop
00c041ac	adr x0,0xcca620
00c041b0	ldp x29,x30,[sp], #0x10
00c041b4	autiasp
00c041b8	ret
00c041bc	adrp x0,0xd27000
00c041c0	add x0,x0,#0x388
00c041c4	bl 0x00c2fe90
00c041c8	cbz w0,0x00c041a8
00c041cc	adrp x0,0xcb4000
00c041d0	nop
00c041d4	adr x1,0xcca620
00c041d8	ldr x0,[x0, #0x9c0]
00c041dc	nop
00c041e0	adr x2,0xc48880
00c041e4	bl 0x00c2fe70
00c041e8	adrp x0,0xd27000
00c041ec	add x0,x0,#0x388
00c041f0	bl 0x00c2fea0
00c041f4	b 0x00c041a8
