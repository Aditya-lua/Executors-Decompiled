; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::close @ 00bd8424
00bd8424	paciasp
00bd8428	stp x29,x30,[sp, #-0x30]!
00bd842c	str x21,[sp, #0x10]
00bd8430	stp x20,x19,[sp, #0x20]
00bd8434	mov x29,sp
00bd8438	ldr x20,[x0, #0x78]
00bd843c	cbz x20,0x00bd8484
00bd8440	ldr x8,[x0]
00bd8444	mov x19,x0
00bd8448	ldr x8,[x8, #0x30]
00bd844c	blr x8
00bd8450	mov w21,w0
00bd8454	mov x0,x20
00bd8458	bl 0x00c30be0
00bd845c	ldr x8,[x19]
00bd8460	str xzr,[x19, #0x78]
00bd8464	orr w9,w0,w21
00bd8468	cmp w9,#0x0
00bd846c	mov x0,x19
00bd8470	mov x1,xzr
00bd8474	ldr x8,[x8, #0x18]
00bd8478	mov x2,xzr
00bd847c	csel x20,x19,xzr,eq
00bd8480	blr x8
00bd8484	mov x0,x20
00bd8488	ldp x20,x19,[sp, #0x20]
00bd848c	ldr x21,[sp, #0x10]
00bd8490	ldp x29,x30,[sp], #0x30
00bd8494	autiasp
00bd8498	ret
