; std::__ndk1::numpunct_byname<char>::~numpunct_byname @ 00c01d38
00c01d38	bti c
00c01d3c	adrp x8,0xcb5000
00c01d40	ldr x8,[x8, #0xe38]
00c01d44	ldrb w9,[x0, #0x18]
00c01d48	add x8,x8,#0x10
00c01d4c	str x8,[x0]
00c01d50	tbz w9,#0x0,0x00c01d8c
00c01d54	paciasp
00c01d58	stp x29,x30,[sp, #-0x20]!
00c01d5c	str x19,[sp, #0x10]
00c01d60	mov x29,sp
00c01d64	ldr x8,[x0, #0x28]
00c01d68	ldr x9,[x0, #0x18]
00c01d6c	mov x19,x0
00c01d70	and x1,x9,#-0x2
00c01d74	mov x0,x8
00c01d78	bl 0x00c2fe80
00c01d7c	mov x0,x19
00c01d80	ldr x19,[sp, #0x10]
00c01d84	ldp x29,x30,[sp], #0x20
00c01d88	autiasp
00c01d8c	b 0x00c31530
