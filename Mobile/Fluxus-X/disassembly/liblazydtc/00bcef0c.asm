; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00bcef0c
00bcef0c	paciasp
00bcef10	stp x29,x30,[sp, #-0x20]!
00bcef14	str x19,[sp, #0x10]
00bcef18	mov x29,sp
00bcef1c	ldr x8,[x0]
00bcef20	mov x19,x0
00bcef24	ldur x8,[x8, #-0x18]
00bcef28	add x0,x0,x8
00bcef2c	blr x1
00bcef30	mov x0,x19
00bcef34	ldr x19,[sp, #0x10]
00bcef38	ldp x29,x30,[sp], #0x20
00bcef3c	autiasp
00bcef40	ret
