; std::__ndk1::__time_get_c_storage<char>::__c @ 00c04298
00c04298	paciasp
00c0429c	stp x29,x30,[sp, #-0x10]!
00c042a0	mov x29,sp
00c042a4	adrp x8,0xd27000
00c042a8	add x8,x8,#0x3b0
00c042ac	ldarb w8,[x8]
00c042b0	tbz w8,#0x0,0x00c042c8
00c042b4	nop
00c042b8	adr x0,0xcca638
00c042bc	ldp x29,x30,[sp], #0x10
00c042c0	autiasp
00c042c4	ret
00c042c8	adrp x0,0xd27000
00c042cc	add x0,x0,#0x3b0
00c042d0	bl 0x00c2fe90
00c042d4	cbz w0,0x00c042b4
00c042d8	adrp x0,0xcb4000
00c042dc	nop
00c042e0	adr x1,0xcca638
00c042e4	ldr x0,[x0, #0x9c0]
00c042e8	nop
00c042ec	adr x2,0xc48880
00c042f0	bl 0x00c2fe70
00c042f4	adrp x0,0xd27000
00c042f8	add x0,x0,#0x3b0
00c042fc	bl 0x00c2fea0
00c04300	b 0x00c042b4
