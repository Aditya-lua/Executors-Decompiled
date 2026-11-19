; std::__ndk1::ctype_byname<wchar_t>::~ctype_byname @ 00c07c98
00c07c98	paciasp
00c07c9c	stp x29,x30,[sp, #-0x20]!
00c07ca0	str x19,[sp, #0x10]
00c07ca4	mov x29,sp
00c07ca8	adrp x8,0xcb5000
00c07cac	mov x19,x0
00c07cb0	ldr x8,[x8, #0xe28]
00c07cb4	ldr x0,[x0, #0x10]
00c07cb8	add x8,x8,#0x10
00c07cbc	str x8,[x19]
00c07cc0	bl 0x00c43980
00c07cc4	mov x0,x19
00c07cc8	ldr x19,[sp, #0x10]
00c07ccc	ldp x29,x30,[sp], #0x20
00c07cd0	autiasp
00c07cd4	b 0x00c44510
