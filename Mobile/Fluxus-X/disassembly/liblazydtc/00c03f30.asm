; std::__ndk1::__time_get_c_storage<wchar_t>::__am_pm @ 00c03f30
00c03f30	paciasp
00c03f34	stp x29,x30,[sp, #-0x10]!
00c03f38	mov x29,sp
00c03f3c	adrp x8,0xd27000
00c03f40	add x8,x8,#0x358
00c03f44	ldarb w9,[x8]
00c03f48	adrp x8,0xd27000
00c03f4c	tbz w9,#0x0,0x00c03f60
00c03f50	ldr x0,[x8, #0x350]
00c03f54	ldp x29,x30,[sp], #0x10
00c03f58	autiasp
00c03f5c	ret
00c03f60	adrp x0,0xd27000
00c03f64	add x0,x0,#0x358
00c03f68	bl 0x00c2fe90
00c03f6c	adrp x8,0xd27000
00c03f70	cbz w0,0x00c03f50
00c03f74	bl 0x00c03f9c
00c03f78	adrp x9,0xd27000
00c03f7c	add x9,x9,#0xb78
00c03f80	adrp x8,0xd27000
00c03f84	adrp x0,0xd27000
00c03f88	add x0,x0,#0x358
00c03f8c	str x9,[x8, #0x350]
00c03f90	bl 0x00c2fea0
00c03f94	adrp x8,0xd27000
00c03f98	b 0x00c03f50
