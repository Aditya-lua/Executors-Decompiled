; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::__write_mode @ 00bd89a0
00bd89a0	bti c
00bd89a4	ldrb w8,[x0, #0x9c]
00bd89a8	tbnz w8,#0x4,0x00bd8a0c
00bd89ac	ldr x8,[x0, #0x60]
00bd89b0	stp xzr,xzr,[x0, #0x10]
00bd89b4	str xzr,[x0, #0x20]
00bd89b8	cmp x8,#0x9
00bd89bc	b.cc 0x00bd89e4
00bd89c0	ldrb w9,[x0, #0xa2]
00bd89c4	cmp w9,#0x1
00bd89c8	b.ne 0x00bd89f0
00bd89cc	ldr x9,[x0, #0x40]
00bd89d0	add x8,x9,x8
00bd89d4	stp x9,x9,[x0, #0x28]
00bd89d8	sub x8,x8,#0x1
00bd89dc	str x8,[x0, #0x38]
00bd89e0	b 0x00bd8a04
00bd89e4	stp xzr,xzr,[x0, #0x28]
00bd89e8	str xzr,[x0, #0x38]
00bd89ec	b 0x00bd8a04
00bd89f0	ldp x8,x9,[x0, #0x68]
00bd89f4	add x9,x8,x9
00bd89f8	stp x8,x8,[x0, #0x28]
00bd89fc	sub x9,x9,#0x1
00bd8a00	str x9,[x0, #0x38]
00bd8a04	mov w8,#0x10
00bd8a08	str w8,[x0, #0x9c]
00bd8a0c	ret
