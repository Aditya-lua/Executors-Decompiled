; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00bceed4
00bceed4	paciasp
00bceed8	stp x29,x30,[sp, #-0x20]!
00bceedc	str x19,[sp, #0x10]
00bceee0	mov x29,sp
00bceee4	ldr x8,[x0]
00bceee8	mov x19,x0
00bceeec	ldur x8,[x8, #-0x18]
00bceef0	add x0,x0,x8
00bceef4	blr x1
00bceef8	mov x0,x19
00bceefc	ldr x19,[sp, #0x10]
00bcef00	ldp x29,x30,[sp], #0x20
00bcef04	autiasp
00bcef08	ret
