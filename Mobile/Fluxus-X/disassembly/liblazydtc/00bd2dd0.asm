; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_istream @ 00bd2dd0
00bd2dd0	paciasp
00bd2dd4	stp x29,x30,[sp, #-0x20]!
00bd2dd8	str x19,[sp, #0x10]
00bd2ddc	mov x29,sp
00bd2de0	ldr x8,[x0]
00bd2de4	ldur x8,[x8, #-0x18]
00bd2de8	add x19,x0,x8
00bd2dec	add x0,x19,#0x10
00bd2df0	bl 0x00c30ee0
00bd2df4	mov x0,x19
00bd2df8	mov w1,#0xa8
00bd2dfc	ldr x19,[sp, #0x10]
00bd2e00	ldp x29,x30,[sp], #0x20
00bd2e04	autiasp
00bd2e08	b 0x00c2fe80
