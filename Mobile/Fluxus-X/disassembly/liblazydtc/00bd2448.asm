; std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::~basic_iostream @ 00bd2448
00bd2448	paciasp
00bd244c	stp x29,x30,[sp, #-0x20]!
00bd2450	str x19,[sp, #0x10]
00bd2454	mov x29,sp
00bd2458	ldr x8,[x0]
00bd245c	ldur x8,[x8, #-0x18]
00bd2460	add x19,x0,x8
00bd2464	add x0,x19,#0x18
00bd2468	bl 0x00c30ee0
00bd246c	mov x0,x19
00bd2470	mov w1,#0xb0
00bd2474	ldr x19,[sp, #0x10]
00bd2478	ldp x29,x30,[sp], #0x20
00bd247c	autiasp
00bd2480	b 0x00c2fe80
