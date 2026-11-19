; std::__ndk1::timed_mutex::try_lock @ 00bccf10
00bccf10	paciasp
00bccf14	stp x29,x30,[sp, #-0x20]!
00bccf18	stp x20,x19,[sp, #0x10]
00bccf1c	mov x29,sp
00bccf20	mov x19,x0
00bccf24	bl 0x00c43b40
00bccf28	cbz w0,0x00bccf34
00bccf2c	mov w0,wzr
00bccf30	b 0x00bccf50
00bccf34	ldrb w20,[x19, #0x58]
00bccf38	tbnz w20,#0x0,0x00bccf44
00bccf3c	mov w8,#0x1
00bccf40	strb w8,[x19, #0x58]
00bccf44	mov x0,x19
00bccf48	bl 0x00c31cb0
00bccf4c	eor w0,w20,#0x1
00bccf50	ldp x20,x19,[sp, #0x10]
00bccf54	ldp x29,x30,[sp], #0x20
00bccf58	autiasp
00bccf5c	ret
