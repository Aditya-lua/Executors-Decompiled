; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_day_year_num @ 00be9c0c
00be9c0c	paciasp
00be9c10	stp x29,x30,[sp, #-0x20]!
00be9c14	stp x20,x19,[sp, #0x10]
00be9c18	mov x29,sp
00be9c1c	mov x19,x4
00be9c20	mov x0,x2
00be9c24	mov x20,x1
00be9c28	mov x1,x3
00be9c2c	mov x2,x4
00be9c30	mov x3,x5
00be9c34	mov w4,#0x3
00be9c38	bl 0x00bea2fc
00be9c3c	ldr w8,[x19]
00be9c40	cmp w0,#0x16d
00be9c44	b.gt 0x00be9c54
00be9c48	tbnz w8,#0x2,0x00be9c54
00be9c4c	str w0,[x20]
00be9c50	b 0x00be9c5c
00be9c54	orr w8,w8,#0x4
00be9c58	str w8,[x19]
00be9c5c	ldp x20,x19,[sp, #0x10]
00be9c60	ldp x29,x30,[sp], #0x20
00be9c64	autiasp
00be9c68	ret
