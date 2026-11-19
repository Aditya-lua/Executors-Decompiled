; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_12_hour @ 00be9ba8
00be9ba8	paciasp
00be9bac	stp x29,x30,[sp, #-0x20]!
00be9bb0	stp x20,x19,[sp, #0x10]
00be9bb4	mov x29,sp
00be9bb8	mov x19,x4
00be9bbc	mov x0,x2
00be9bc0	mov x20,x1
00be9bc4	mov x1,x3
00be9bc8	mov x2,x4
00be9bcc	mov x3,x5
00be9bd0	mov w4,#0x2
00be9bd4	bl 0x00bea2fc
00be9bd8	ldr w8,[x19]
00be9bdc	sub w9,w0,#0x1
00be9be0	cmp w9,#0xb
00be9be4	b.hi 0x00be9bf4
00be9be8	tbnz w8,#0x2,0x00be9bf4
00be9bec	str w0,[x20]
00be9bf0	b 0x00be9bfc
00be9bf4	orr w8,w8,#0x4
00be9bf8	str w8,[x19]
00be9bfc	ldp x20,x19,[sp, #0x10]
00be9c00	ldp x29,x30,[sp], #0x20
00be9c04	autiasp
00be9c08	ret
