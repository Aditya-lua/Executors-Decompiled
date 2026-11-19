; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_ostream @ 00bd5998
00bd5998	paciasp
00bd599c	stp x29,x30,[sp, #-0x20]!
00bd59a0	str x19,[sp, #0x10]
00bd59a4	mov x29,sp
00bd59a8	ldr x8,[x0]
00bd59ac	ldur x8,[x8, #-0x18]
00bd59b0	add x19,x0,x8
00bd59b4	add x0,x19,#0x8
00bd59b8	bl 0x00c30ee0
00bd59bc	mov x0,x19
00bd59c0	mov w1,#0xa0
00bd59c4	ldr x19,[sp, #0x10]
00bd59c8	ldp x29,x30,[sp], #0x20
00bd59cc	autiasp
00bd59d0	b 0x00c2fe80
