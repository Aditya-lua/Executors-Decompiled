; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::pubimbue @ 00bd25ec
00bd25ec	paciasp
00bd25f0	stp x29,x30,[sp, #-0x30]!
00bd25f4	str x21,[sp, #0x10]
00bd25f8	stp x20,x19,[sp, #0x20]
00bd25fc	mov x29,sp
00bd2600	mov x20,x0
00bd2604	mov x19,x1
00bd2608	mov x21,x8
00bd260c	ldr x9,[x20], #0x8
00bd2610	ldr x9,[x9, #0x10]
00bd2614	blr x9
00bd2618	mov x0,x21
00bd261c	mov x1,x20
00bd2620	bl 0x00c30660
00bd2624	mov x0,x20
00bd2628	mov x1,x19
00bd262c	ldp x20,x19,[sp, #0x20]
00bd2630	ldr x21,[sp, #0x10]
00bd2634	ldp x29,x30,[sp], #0x30
00bd2638	autiasp
00bd263c	b 0x00c43f00
