; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_minute @ 00be9cd0
00be9cd0	paciasp
00be9cd4	stp x29,x30,[sp, #-0x20]!
00be9cd8	stp x20,x19,[sp, #0x10]
00be9cdc	mov x29,sp
00be9ce0	mov x19,x4
00be9ce4	mov x0,x2
00be9ce8	mov x20,x1
00be9cec	mov x1,x3
00be9cf0	mov x2,x4
00be9cf4	mov x3,x5
00be9cf8	mov w4,#0x2
00be9cfc	bl 0x00bea2fc
00be9d00	ldr w8,[x19]
00be9d04	cmp w0,#0x3b
00be9d08	b.gt 0x00be9d18
00be9d0c	tbnz w8,#0x2,0x00be9d18
00be9d10	str w0,[x20]
00be9d14	b 0x00be9d20
00be9d18	orr w8,w8,#0x4
00be9d1c	str w8,[x19]
00be9d20	ldp x20,x19,[sp, #0x10]
00be9d24	ldp x29,x30,[sp], #0x20
00be9d28	autiasp
00be9d2c	ret
