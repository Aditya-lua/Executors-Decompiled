; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00bd1174
00bd1174	paciasp
00bd1178	stp x29,x30,[sp, #-0x20]!
00bd117c	str x19,[sp, #0x10]
00bd1180	mov x29,sp
00bd1184	ldr x8,[x0]
00bd1188	mov x19,x0
00bd118c	ldur x8,[x8, #-0x18]
00bd1190	add x0,x0,x8
00bd1194	blr x1
00bd1198	mov x0,x19
00bd119c	ldr x19,[sp, #0x10]
00bd11a0	ldp x29,x30,[sp], #0x20
00bd11a4	autiasp
00bd11a8	ret
