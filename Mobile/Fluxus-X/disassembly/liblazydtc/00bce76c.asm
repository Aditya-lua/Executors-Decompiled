; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pubimbue @ 00bce76c
00bce76c	paciasp
00bce770	stp x29,x30,[sp, #-0x30]!
00bce774	str x21,[sp, #0x10]
00bce778	stp x20,x19,[sp, #0x20]
00bce77c	mov x29,sp
00bce780	mov x20,x0
00bce784	mov x19,x1
00bce788	mov x21,x8
00bce78c	ldr x9,[x20], #0x8
00bce790	ldr x9,[x9, #0x10]
00bce794	blr x9
00bce798	mov x0,x21
00bce79c	mov x1,x20
00bce7a0	bl 0x00c30660
00bce7a4	mov x0,x20
00bce7a8	mov x1,x19
00bce7ac	ldp x20,x19,[sp, #0x20]
00bce7b0	ldr x21,[sp, #0x10]
00bce7b4	ldp x29,x30,[sp], #0x30
00bce7b8	autiasp
00bce7bc	b 0x00c43f00
