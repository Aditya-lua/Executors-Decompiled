; std::__ndk1::__thread_struct::~__thread_struct @ 00bcd52c
00bcd52c	paciasp
00bcd530	stp x29,x30,[sp, #-0x20]!
00bcd534	str x19,[sp, #0x10]
00bcd538	mov x29,sp
00bcd53c	ldr x19,[x0]
00bcd540	cbz x19,0x00bcd564
00bcd544	mov x0,x19
00bcd548	bl 0x00bcd424
00bcd54c	mov x0,x19
00bcd550	mov w1,#0x30
00bcd554	ldr x19,[sp, #0x10]
00bcd558	ldp x29,x30,[sp], #0x20
00bcd55c	autiasp
00bcd560	b 0x00c2fe80
00bcd564	ldr x19,[sp, #0x10]
00bcd568	ldp x29,x30,[sp], #0x20
00bcd56c	autiasp
00bcd570	ret
