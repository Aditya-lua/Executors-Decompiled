; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_year4 @ 00bebde8
00bebde8	paciasp
00bebdec	stp x29,x30,[sp, #-0x20]!
00bebdf0	stp x20,x19,[sp, #0x10]
00bebdf4	mov x29,sp
00bebdf8	mov x20,x4
00bebdfc	mov x0,x2
00bebe00	mov x19,x1
00bebe04	mov x1,x3
00bebe08	mov x2,x4
00bebe0c	mov x3,x5
00bebe10	mov w4,#0x4
00bebe14	bl 0x00bec028
00bebe18	ldrb w8,[x20]
00bebe1c	tbnz w8,#0x2,0x00bebe28
00bebe20	sub w8,w0,#0x76c
00bebe24	str w8,[x19]
00bebe28	ldp x20,x19,[sp, #0x10]
00bebe2c	ldp x29,x30,[sp], #0x20
00bebe30	autiasp
00bebe34	ret
