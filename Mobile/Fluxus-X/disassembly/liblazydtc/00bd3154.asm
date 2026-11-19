; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator>> @ 00bd3154
00bd3154	paciasp
00bd3158	stp x29,x30,[sp, #-0x20]!
00bd315c	str x19,[sp, #0x10]
00bd3160	mov x29,sp
00bd3164	ldr x8,[x0]
00bd3168	mov x19,x0
00bd316c	ldur x8,[x8, #-0x18]
00bd3170	add x0,x0,x8
00bd3174	blr x1
00bd3178	mov x0,x19
00bd317c	ldr x19,[sp, #0x10]
00bd3180	ldp x29,x30,[sp], #0x20
00bd3184	autiasp
00bd3188	ret
