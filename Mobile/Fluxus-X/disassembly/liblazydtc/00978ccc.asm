; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::destroy @ 00978ccc
00978ccc	stp x20,x19,[sp, #-0x20]!
00978cd0	stp x29,x30,[sp, #0x10]
00978cd4	add x29,sp,#0x10
00978cd8	mov x19,x1
00978cdc	mov x20,x0
00978ce0	cbz x1,0x00978d2c
00978ce4	ldr x1,[x19]
00978ce8	mov x0,x20
00978cec	bl 0x00c32fc0
00978cf0	ldr x1,[x19, #0x8]
00978cf4	mov x0,x20
00978cf8	bl 0x00c32fc0
00978cfc	ldrb w8,[x19, #0x38]
00978d00	tbz w8,#0x0,0x00978d0c
00978d04	ldr x0,[x19, #0x48]
00978d08	bl 0x00c301d0
00978d0c	ldrb w8,[x19, #0x20]
00978d10	tbz w8,#0x0,0x00978d1c
00978d14	ldr x0,[x19, #0x30]
00978d18	bl 0x00c301d0
00978d1c	ldp x29,x30,[sp, #0x10]
00978d20	mov x0,x19
00978d24	ldp x20,x19,[sp], #0x20
00978d28	b 0x00c301d0
00978d2c	ldp x29,x30,[sp, #0x10]
00978d30	ldp x20,x19,[sp], #0x20
00978d34	ret
