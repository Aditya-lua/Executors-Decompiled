; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::__read_mode @ 00bd8910
00bd8910	bti c
00bd8914	ldr w8,[x0, #0x9c]
00bd8918	tbnz w8,#0x3,0x00bd895c
00bd891c	ldrb w9,[x0, #0xa2]
00bd8920	mov w10,#0x68
00bd8924	mov w11,#0x40
00bd8928	mov w12,#0x70
00bd892c	stp xzr,xzr,[x0, #0x30]
00bd8930	cmp w9,#0x0
00bd8934	mov w9,#0x60
00bd8938	csel x10,x11,x10,ne
00bd893c	csel x9,x9,x12,ne
00bd8940	ldr x10,[x0, x10#0x0]
00bd8944	ldr x9,[x0, x9#0x0]
00bd8948	add x9,x10,x9
00bd894c	stp x10,x9,[x0, #0x10]
00bd8950	mov w10,#0x8
00bd8954	stp x9,xzr,[x0, #0x20]
00bd8958	str w10,[x0, #0x9c]
00bd895c	tst w8,#0x8
00bd8960	cset w0,eq
00bd8964	ret
