; std::__ndk1::thread::~thread @ 00bcd20c
00bcd20c	bti c
00bcd210	ldr x8,[x0]
00bcd214	cbnz x8,0x00bcd21c
00bcd218	ret
00bcd21c	paciasp
00bcd220	stp x29,x30,[sp, #-0x10]!
00bcd224	mov x29,sp
00bcd228	bl 0x00c2fff0
