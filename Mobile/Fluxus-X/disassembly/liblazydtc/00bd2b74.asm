; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::uflow @ 00bd2b74
00bd2b74	paciasp
00bd2b78	stp x29,x30,[sp, #-0x20]!
00bd2b7c	str x19,[sp, #0x10]
00bd2b80	mov x29,sp
00bd2b84	ldr x8,[x0]
00bd2b88	mov x19,x0
00bd2b8c	ldr x8,[x8, #0x48]
00bd2b90	blr x8
00bd2b94	cmn w0,#0x1
00bd2b98	b.eq 0x00bd2ba8
00bd2b9c	ldr x8,[x19, #0x18]
00bd2ba0	ldr w0,[x8], #0x4
00bd2ba4	str x8,[x19, #0x18]
00bd2ba8	ldr x19,[sp, #0x10]
00bd2bac	ldp x29,x30,[sp], #0x20
00bd2bb0	autiasp
00bd2bb4	ret
