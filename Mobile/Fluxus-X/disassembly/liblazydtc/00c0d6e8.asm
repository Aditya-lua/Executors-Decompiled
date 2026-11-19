; std::terminate @ 00c0d6e8
00c0d6e8	paciasp
00c0d6ec	stp x30,x19,[sp, #-0x10]!
00c0d6f0	bl 0x00c44730
00c0d6f4	cbz x0,0x00c0d700
00c0d6f8	ldr x19,[x0]
00c0d6fc	cbnz x19,0x00c0d710
00c0d700	adrp x8,0xcb5000
00c0d704	ldr x8,[x8, #0xe70]
00c0d708	ldar x0,[x8]
00c0d70c	bl 0x00c0d774
00c0d710	add x0,x19,#0x60
00c0d714	bl 0x00c29308
00c0d718	tbz w0,#0x0,0x00c0d700
00c0d71c	ldr x0,[x19, #0x28]
00c0d720	bl 0x00c0d774
00c0d724	bl 0x007fe114
