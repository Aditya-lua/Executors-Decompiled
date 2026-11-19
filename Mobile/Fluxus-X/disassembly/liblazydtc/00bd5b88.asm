; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<< @ 00bd5b88
00bd5b88	paciasp
00bd5b8c	stp x29,x30,[sp, #-0x20]!
00bd5b90	str x19,[sp, #0x10]
00bd5b94	mov x29,sp
00bd5b98	ldr x8,[x0]
00bd5b9c	mov x19,x0
00bd5ba0	ldur x8,[x8, #-0x18]
00bd5ba4	add x0,x0,x8
00bd5ba8	blr x1
00bd5bac	mov x0,x19
00bd5bb0	ldr x19,[sp, #0x10]
00bd5bb4	ldp x29,x30,[sp], #0x20
00bd5bb8	autiasp
00bd5bbc	ret
