; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator>> @ 00bd318c
00bd318c	paciasp
00bd3190	stp x29,x30,[sp, #-0x20]!
00bd3194	str x19,[sp, #0x10]
00bd3198	mov x29,sp
00bd319c	ldr x8,[x0]
00bd31a0	mov x19,x0
00bd31a4	ldur x8,[x8, #-0x18]
00bd31a8	add x0,x0,x8
00bd31ac	blr x1
00bd31b0	mov x0,x19
00bd31b4	ldr x19,[sp, #0x10]
00bd31b8	ldp x29,x30,[sp], #0x20
00bd31bc	autiasp
00bd31c0	ret
