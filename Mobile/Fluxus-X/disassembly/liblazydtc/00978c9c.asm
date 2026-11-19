; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream @ 00978c9c
00978c9c	str x19,[sp, #-0x20]!
00978ca0	stp x29,x30,[sp, #0x10]
00978ca4	add x29,sp,#0x10
00978ca8	ldr x8,[x0]
00978cac	ldur x8,[x8, #-0x18]
00978cb0	add x19,x0,x8
00978cb4	add x0,x19,#0x8
00978cb8	bl 0x00c30ee0
00978cbc	ldp x29,x30,[sp, #0x10]
00978cc0	mov x0,x19
00978cc4	ldr x19,[sp], #0x20
00978cc8	b 0x00c301d0
