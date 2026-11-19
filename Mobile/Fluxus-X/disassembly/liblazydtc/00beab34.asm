; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get_time @ 00beab34
00beab34	paciasp
00beab38	sub sp,sp,#0x30
00beab3c	stp x29,x30,[sp, #0x20]
00beab40	add x29,sp,#0x20
00beab44	adrp x8,0x364000
00beab48	add x8,x8,#0xdb0
00beab4c	mov x6,sp
00beab50	ldp q0,q1,[x8]
00beab54	mov x8,sp
00beab58	add x7,x8,#0x20
00beab5c	stp q0,q1,[sp]
00beab60	bl 0x00c441c0
00beab64	ldp x29,x30,[sp, #0x20]
00beab68	add sp,sp,#0x30
00beab6c	autiasp
00beab70	ret
