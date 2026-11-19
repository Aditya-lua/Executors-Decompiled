; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00bd113c
00bd113c	paciasp
00bd1140	stp x29,x30,[sp, #-0x20]!
00bd1144	str x19,[sp, #0x10]
00bd1148	mov x29,sp
00bd114c	ldr x8,[x0]
00bd1150	mov x19,x0
00bd1154	ldur x8,[x8, #-0x18]
00bd1158	add x0,x0,x8
00bd115c	blr x1
00bd1160	mov x0,x19
00bd1164	ldr x19,[sp, #0x10]
00bd1168	ldp x29,x30,[sp], #0x20
00bd116c	autiasp
00bd1170	ret
