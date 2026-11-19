; std::__ndk1::timed_mutex::~timed_mutex @ 00bccdfc
00bccdfc	paciasp
00bcce00	stp x29,x30,[sp, #-0x20]!
00bcce04	str x19,[sp, #0x10]
00bcce08	mov x29,sp
00bcce0c	mov x19,x0
00bcce10	bl 0x00c31ca0
00bcce14	cbnz w0,0x00bcce3c
00bcce18	mov x0,x19
00bcce1c	bl 0x00c31cb0
00bcce20	add x0,x19,#0x28
00bcce24	bl 0x00c31600
00bcce28	mov x0,x19
00bcce2c	ldr x19,[sp, #0x10]
00bcce30	ldp x29,x30,[sp], #0x20
00bcce34	autiasp
00bcce38	b 0x00c2fee0
00bcce3c	adrp x1,0x2be000
00bcce40	add x1,x1,#0xc42
00bcce44	bl 0x00c2ffc0
